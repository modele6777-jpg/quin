package io.sentry.android.core.internal.threaddump;

import defpackage.ub3;
import io.sentry.d;
import io.sentry.protocol.DebugImage;
import io.sentry.protocol.a0;
import io.sentry.protocol.c0;
import io.sentry.protocol.e0;
import io.sentry.q5;
import io.sentry.q6;
import io.sentry.r5;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class c {
    public static final Pattern h = Pattern.compile("\"(.*)\" (.*) ?prio=(\\d+)\\s+tid=(\\d+)\\s*(.*)");
    public static final Pattern i = Pattern.compile("\"(.*)\" (.*) ?sysTid=(\\d+)");
    public static final Pattern j = Pattern.compile("----- pid (\\d+) at .*");
    public static final Pattern k = Pattern.compile("\\s*\\|\\s*sysTid=(\\d+).*");
    public static final Pattern l = Pattern.compile(" *(?:native: )?#(\\d+) \\S+ ([0-9a-fA-F]+)\\s+((.*?)(?:\\s+\\(deleted\\))?(?:\\s+\\(offset (.*?)\\))?)(?:\\s+\\((?:\\?\\?\\?|(.*?)(?:\\+(\\d+))?)\\))?(?:\\s+\\(BuildId: (.*?)\\))?");
    public static final Pattern m = Pattern.compile(" *at (?:(.+)\\.)?([^.]+)\\.([^.]+)\\((.*):([\\d-]+)\\)");
    public static final Pattern n = Pattern.compile(" *at (?:(.+)\\.)?([^.]+)\\.([^.]+)\\(Native method\\)");
    public static final Pattern o = Pattern.compile(" *- locked \\<([0x0-9a-fA-F]{1,16})\\> \\(a (?:(.+)\\.)?([^.]+)\\)");
    public static final Pattern p = Pattern.compile(" *- sleeping on \\<([0x0-9a-fA-F]{1,16})\\> \\(a (?:(.+)\\.)?([^.]+)\\)");
    public static final Pattern q = Pattern.compile(" *- waiting on \\<([0x0-9a-fA-F]{1,16})\\> \\(a (?:(.+)\\.)?([^.]+)\\)");
    public static final Pattern r = Pattern.compile(" *- waiting to lock \\<([0x0-9a-fA-F]{1,16})\\> \\(a (?:(.+)\\.)?([^.]+)\\)");
    public static final Pattern s = Pattern.compile(" *- waiting to lock \\<([0x0-9a-fA-F]{1,16})\\> \\(a (?:(.+)\\.)?([^.]+)\\)(?: held by thread (\\d+))");
    public static final Pattern t = Pattern.compile(" *- waiting to lock an unknown object");
    public static final Pattern u = Pattern.compile("\\s+");
    public final q6 a;
    public final boolean b;
    public Long c;
    public final d d;
    public final d g = new d(3);
    public final HashMap e = new HashMap();
    public final ArrayList f = new ArrayList();

    public c(q6 q6Var, boolean z) {
        this.a = q6Var;
        this.b = z;
        this.d = new d(2, q6Var);
    }

    public static void a(e0 e0Var, r5 r5Var) {
        Map map = e0Var.x;
        if (map == null) {
            map = new HashMap();
        }
        r5 r5Var2 = (r5) map.get(r5Var.b);
        if (r5Var2 != null) {
            r5Var2.a = Math.max(r5Var2.a, r5Var.a);
        } else {
            String str = r5Var.b;
            r5 r5Var3 = new r5();
            r5Var3.a = r5Var.a;
            r5Var3.b = str;
            r5Var3.c = r5Var.c;
            r5Var3.d = r5Var.d;
            r5Var3.e = r5Var.e;
            r5Var3.f = io.sentry.util.b.o(r5Var.f);
            map.put(str, r5Var3);
        }
        e0Var.x = map;
    }

    public static Long b(Matcher matcher, int i2) {
        String strGroup = matcher.group(i2);
        if (strGroup == null || strGroup.length() == 0) {
            return null;
        }
        return Long.valueOf(Long.parseLong(strGroup));
    }

    public static boolean c(Matcher matcher, String str) {
        matcher.reset(str);
        return matcher.matches();
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0301  */
    /* JADX WARN: Code duplicated, block: B:105:0x030e  */
    /* JADX WARN: Code duplicated, block: B:113:0x034b  */
    /* JADX WARN: Code duplicated, block: B:117:0x036e  */
    /* JADX WARN: Code duplicated, block: B:119:0x0379  */
    /* JADX WARN: Code duplicated, block: B:125:0x03a3  */
    /* JADX WARN: Code duplicated, block: B:128:0x03c5  */
    /* JADX WARN: Code duplicated, block: B:129:0x03c8  */
    /* JADX WARN: Code duplicated, block: B:131:0x03ce  */
    /* JADX WARN: Code duplicated, block: B:133:0x03d6  */
    /* JADX WARN: Code duplicated, block: B:134:0x03f6  */
    /* JADX WARN: Code duplicated, block: B:136:0x0403  */
    /* JADX WARN: Code duplicated, block: B:138:0x040e  */
    /* JADX WARN: Code duplicated, block: B:140:0x0418  */
    /* JADX WARN: Code duplicated, block: B:141:0x044a  */
    /* JADX WARN: Code duplicated, block: B:143:0x0450 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:144:0x0452  */
    /* JADX WARN: Code duplicated, block: B:145:0x0474  */
    /* JADX WARN: Code duplicated, block: B:147:0x047a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:148:0x047c  */
    /* JADX WARN: Code duplicated, block: B:149:0x049e  */
    /* JADX WARN: Code duplicated, block: B:151:0x04a4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:152:0x04a6  */
    /* JADX WARN: Code duplicated, block: B:153:0x04c9  */
    /* JADX WARN: Code duplicated, block: B:155:0x04cf A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:156:0x04d1  */
    /* JADX WARN: Code duplicated, block: B:158:0x0500  */
    /* JADX WARN: Code duplicated, block: B:159:0x0502  */
    /* JADX WARN: Code duplicated, block: B:161:0x050b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:162:0x050d  */
    /* JADX WARN: Code duplicated, block: B:165:0x0532  */
    /* JADX WARN: Code duplicated, block: B:166:0x0534  */
    /* JADX WARN: Code duplicated, block: B:168:0x053d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:169:0x053f  */
    /* JADX WARN: Code duplicated, block: B:170:0x054c  */
    /* JADX WARN: Code duplicated, block: B:172:0x0552  */
    /* JADX WARN: Code duplicated, block: B:179:0x0581  */
    /* JADX WARN: Code duplicated, block: B:205:0x056d A[EDGE_INSN: B:205:0x056d->B:176:0x056d BREAK  A[LOOP:1: B:89:0x02c5->B:175:0x055b], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:206:0x056d A[EDGE_INSN: B:206:0x056d->B:176:0x056d BREAK  A[LOOP:1: B:89:0x02c5->B:175:0x055b], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:207:0x02db A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:208:0x02cf A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:212:0x055b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:64:0x01d8 A[PHI: r21 r23 r25 r26 r28 r31 r34
  0x01d8: PHI (r21v2 java.util.regex.Matcher) = (r21v3 java.util.regex.Matcher), (r21v4 java.util.regex.Matcher) binds: [B:63:0x01d2, B:177:0x057d] A[DONT_GENERATE, DONT_INLINE]
  0x01d8: PHI (r23v2 java.util.regex.Pattern) = (r23v3 java.util.regex.Pattern), (r23v4 java.util.regex.Pattern) binds: [B:63:0x01d2, B:177:0x057d] A[DONT_GENERATE, DONT_INLINE]
  0x01d8: PHI (r25v1 java.util.regex.Matcher) = (r25v2 java.util.regex.Matcher), (r25v3 java.util.regex.Matcher) binds: [B:63:0x01d2, B:177:0x057d] A[DONT_GENERATE, DONT_INLINE]
  0x01d8: PHI (r26v1 java.util.regex.Matcher) = (r26v2 java.util.regex.Matcher), (r26v3 java.util.regex.Matcher) binds: [B:63:0x01d2, B:177:0x057d] A[DONT_GENERATE, DONT_INLINE]
  0x01d8: PHI (r28v1 java.util.ArrayList) = (r28v2 java.util.ArrayList), (r28v3 java.util.ArrayList) binds: [B:63:0x01d2, B:177:0x057d] A[DONT_GENERATE, DONT_INLINE]
  0x01d8: PHI (r31v2 java.lang.String) = (r4v1 java.lang.String), (r31v4 java.lang.String) binds: [B:63:0x01d2, B:177:0x057d] A[DONT_GENERATE, DONT_INLINE]
  0x01d8: PHI (r34v2 int) = (r2v1 int), (r34v5 int) binds: [B:63:0x01d2, B:177:0x057d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:91:0x02c9  */
    /* JADX WARN: Code duplicated, block: B:95:0x02df  */
    /* JADX WARN: Code duplicated, block: B:97:0x02e9  */
    public final void d(b bVar) {
        Pattern pattern;
        Matcher matcher;
        Pattern pattern2;
        ArrayList arrayList;
        Matcher matcher2;
        Matcher matcher3;
        q6 q6Var;
        ArrayList arrayList2;
        Matcher matcher4;
        Matcher matcher5;
        Matcher matcher6;
        Matcher matcher7;
        Matcher matcher8;
        Matcher matcher9;
        Matcher matcher10;
        Matcher matcher11;
        Matcher matcher12;
        Matcher matcher13;
        Matcher matcher14;
        a0 a0Var;
        c0 c0Var;
        a aVarA;
        String str;
        Matcher matcher15;
        Matcher matcher16;
        Matcher matcher17;
        a0 a0Var2;
        String strGroup;
        Integer numValueOf;
        String strGroup2;
        String strA;
        HashMap map;
        String strGroup3;
        Integer numValueOf2;
        Long lB;
        b bVar2 = bVar;
        int i2 = bVar2.a;
        Pattern pattern3 = h;
        String str2 = "";
        Matcher matcher18 = pattern3.matcher("");
        Pattern pattern4 = i;
        Matcher matcher19 = pattern4.matcher("");
        Matcher matcher20 = j.matcher("");
        while (true) {
            int i3 = bVar2.b;
            ArrayList<e0> arrayList3 = this.f;
            if (i3 >= i2) {
                for (e0 e0Var : arrayList3) {
                    Boolean bool = Boolean.TRUE;
                    if (bool.equals(e0Var.v)) {
                        e0Var.c = "main";
                        e0Var.e = bool;
                        e0Var.f = Boolean.valueOf(!this.b);
                    } else {
                        Boolean bool2 = Boolean.FALSE;
                        e0Var.e = bool2;
                        e0Var.f = bool2;
                        e0Var.v = bool2;
                    }
                }
                return;
            }
            a aVarA2 = bVar2.a();
            String str3 = "Internal error while parsing thread dump.";
            q6 q6Var2 = this.a;
            if (aVarA2 == null) {
                q6Var2.getLogger().i(q5.WARNING, "Internal error while parsing thread dump.", new Object[0]);
                return;
            }
            String str4 = aVarA2.a;
            Long lValueOf = null;
            if (c(matcher18, str4) || c(matcher19, str4)) {
                bVar2.b--;
                e0 e0Var2 = new e0();
                Matcher matcher21 = pattern3.matcher(str2);
                Matcher matcher22 = pattern4.matcher(str2);
                pattern = pattern3;
                if (bVar2.b >= i2) {
                    matcher = matcher18;
                    pattern2 = pattern4;
                    matcher3 = matcher19;
                    matcher2 = matcher20;
                    arrayList = arrayList3;
                    e0Var2 = null;
                } else {
                    a aVarA3 = bVar2.a();
                    if (aVarA3 == null) {
                        q6Var2.getLogger().i(q5.WARNING, "Internal error while parsing thread dump.", new Object[0]);
                        matcher = matcher18;
                        pattern2 = pattern4;
                        matcher3 = matcher19;
                        matcher2 = matcher20;
                        arrayList = arrayList3;
                        e0Var2 = null;
                    } else {
                        String str5 = aVarA3.a;
                        matcher = matcher18;
                        pattern2 = pattern4;
                        if (c(matcher21, str5)) {
                            Long lB2 = b(matcher21, 4);
                            if (lB2 == null) {
                                q6Var2.getLogger().i(q5.DEBUG, "No thread id in the dump, skipping thread.", new Object[0]);
                                matcher3 = matcher19;
                                matcher2 = matcher20;
                                arrayList = arrayList3;
                                e0Var2 = null;
                            } else {
                                e0Var2.a = lB2;
                                String strGroup4 = matcher21.group(1);
                                e0Var2.c = strGroup4;
                                if ("main".equals(strGroup4)) {
                                    e0Var2.v = Boolean.TRUE;
                                }
                                String strGroup5 = matcher21.group(5);
                                if (strGroup5 != null) {
                                    if (strGroup5.contains(" ")) {
                                        e0Var2.d = strGroup5.substring(0, strGroup5.indexOf(32));
                                    } else {
                                        e0Var2.d = strGroup5;
                                    }
                                }
                                q6Var = (q6) this.d.b;
                                arrayList2 = new ArrayList();
                                matcher4 = l.matcher(str2);
                                matcher5 = m.matcher(str2);
                                matcher6 = n.matcher(str2);
                                matcher7 = o.matcher(str2);
                                matcher8 = q.matcher(str2);
                                matcher3 = matcher19;
                                matcher9 = p.matcher(str2);
                                matcher2 = matcher20;
                                matcher10 = s.matcher(str2);
                                Matcher matcher23 = r.matcher(str2);
                                arrayList = arrayList3;
                                matcher11 = t.matcher(str2);
                                matcher12 = u.matcher(str2);
                                matcher13 = k.matcher(str2);
                                str2 = str2;
                                matcher14 = matcher23;
                                a0Var = null;
                                while (true) {
                                    if (bVar2.b >= i2) {
                                        aVarA = bVar2.a();
                                        if (aVarA == null) {
                                            q6Var2.getLogger().i(q5.WARNING, str3, new Object[0]);
                                        } else {
                                            str = aVarA.a;
                                            if (c(matcher13, str)) {
                                                lB = b(matcher13, 1);
                                                if (lB != null && lB.equals(this.c)) {
                                                    e0Var2.v = Boolean.TRUE;
                                                }
                                                i2 = i2;
                                            } else {
                                                i2 = i2;
                                                if (c(matcher5, str)) {
                                                    a0Var = new a0();
                                                    String strJ = ub3.j(matcher5.group(1), ".", matcher5.group(2));
                                                    a0Var.f = strJ;
                                                    a0Var.e = matcher5.group(3);
                                                    a0Var.d = matcher5.group(4);
                                                    strGroup3 = matcher5.group(5);
                                                    if (strGroup3 != null || strGroup3.length() == 0) {
                                                        numValueOf2 = null;
                                                    } else {
                                                        int i4 = Integer.parseInt(strGroup3);
                                                        numValueOf2 = Integer.valueOf(i4);
                                                        if (i4 < 0) {
                                                            numValueOf2 = null;
                                                        }
                                                    }
                                                    a0Var.g = numValueOf2;
                                                    a0Var.y = d.g(strJ, q6Var.getInAppIncludes(), q6Var.getInAppExcludes());
                                                    arrayList2.add(a0Var);
                                                } else {
                                                    matcher13 = matcher13;
                                                    if (c(matcher4, str)) {
                                                        a0Var2 = new a0();
                                                        a0Var2.z = matcher4.group(3);
                                                        a0Var2.e = matcher4.group(6);
                                                        strGroup = matcher4.group(7);
                                                        if (strGroup != null || strGroup.length() == 0) {
                                                            numValueOf = null;
                                                        } else {
                                                            numValueOf = Integer.valueOf(Integer.parseInt(strGroup));
                                                        }
                                                        a0Var2.g = numValueOf;
                                                        a0Var2.F0 = "0x" + matcher4.group(2);
                                                        a0Var2.Y = "native";
                                                        strGroup2 = matcher4.group(8);
                                                        if (strGroup2 == null) {
                                                            strA = null;
                                                        } else {
                                                            strA = io.sentry.config.a.a(strGroup2);
                                                        }
                                                        if (strA != null) {
                                                            map = this.e;
                                                            if (!map.containsKey(strA)) {
                                                                DebugImage debugImage = new DebugImage();
                                                                debugImage.setDebugId(strA);
                                                                debugImage.setType("elf");
                                                                debugImage.setCodeFile(matcher4.group(4));
                                                                debugImage.setCodeId(strGroup2);
                                                                map.put(strA, debugImage);
                                                            }
                                                            a0Var2.G0 = "rel:".concat(strA);
                                                        } else {
                                                            matcher5 = matcher5;
                                                            str3 = str3;
                                                        }
                                                        arrayList2.add(a0Var2);
                                                        a0Var = null;
                                                    } else {
                                                        matcher5 = matcher5;
                                                        str3 = str3;
                                                        if (c(matcher6, str)) {
                                                            a0Var = new a0();
                                                            String strJ2 = ub3.j(matcher6.group(1), ".", matcher6.group(2));
                                                            a0Var.f = strJ2;
                                                            a0Var.e = matcher6.group(3);
                                                            a0Var.y = d.g(strJ2, q6Var.getInAppIncludes(), q6Var.getInAppExcludes());
                                                            a0Var.X = Boolean.TRUE;
                                                            arrayList2.add(a0Var);
                                                        } else if (c(matcher7, str)) {
                                                            if (a0Var != null) {
                                                                r5 r5Var = new r5();
                                                                r5Var.a = 1;
                                                                r5Var.b = matcher7.group(1);
                                                                r5Var.c = matcher7.group(2);
                                                                r5Var.d = matcher7.group(3);
                                                                a0Var.K0 = r5Var;
                                                                a(e0Var2, r5Var);
                                                            }
                                                        } else if (c(matcher8, str)) {
                                                            if (a0Var != null) {
                                                                r5 r5Var2 = new r5();
                                                                r5Var2.a = 2;
                                                                r5Var2.b = matcher8.group(1);
                                                                r5Var2.c = matcher8.group(2);
                                                                r5Var2.d = matcher8.group(3);
                                                                a0Var.K0 = r5Var2;
                                                                a(e0Var2, r5Var2);
                                                            }
                                                        } else if (c(matcher9, str)) {
                                                            if (a0Var != null) {
                                                                r5 r5Var3 = new r5();
                                                                r5Var3.a = 4;
                                                                r5Var3.b = matcher9.group(1);
                                                                r5Var3.c = matcher9.group(2);
                                                                r5Var3.d = matcher9.group(3);
                                                                a0Var.K0 = r5Var3;
                                                                a(e0Var2, r5Var3);
                                                            }
                                                        } else if (c(matcher10, str)) {
                                                            if (a0Var != null) {
                                                                r5 r5Var4 = new r5();
                                                                r5Var4.a = 8;
                                                                r5Var4.b = matcher10.group(1);
                                                                r5Var4.c = matcher10.group(2);
                                                                r5Var4.d = matcher10.group(3);
                                                                r5Var4.e = b(matcher10, 4);
                                                                a0Var.K0 = r5Var4;
                                                                a(e0Var2, r5Var4);
                                                            }
                                                            matcher16 = matcher11;
                                                            matcher17 = matcher12;
                                                            matcher15 = matcher14;
                                                        } else {
                                                            matcher15 = matcher14;
                                                            if (c(matcher15, str)) {
                                                                matcher16 = matcher11;
                                                                if (c(matcher16, str)) {
                                                                    if (str.length() != 0) {
                                                                        break;
                                                                    }
                                                                    matcher17 = matcher12;
                                                                    if (c(matcher17, str)) {
                                                                        break;
                                                                    }
                                                                } else if (a0Var != null) {
                                                                    r5 r5Var5 = new r5();
                                                                    r5Var5.a = 8;
                                                                    a0Var.K0 = r5Var5;
                                                                    a(e0Var2, r5Var5);
                                                                }
                                                            } else {
                                                                if (a0Var != null) {
                                                                    r5 r5Var6 = new r5();
                                                                    r5Var6.a = 8;
                                                                    r5Var6.b = matcher15.group(1);
                                                                    r5Var6.c = matcher15.group(2);
                                                                    r5Var6.d = matcher15.group(3);
                                                                    a0Var.K0 = r5Var6;
                                                                    a(e0Var2, r5Var6);
                                                                }
                                                                matcher16 = matcher11;
                                                            }
                                                            matcher17 = matcher12;
                                                        }
                                                    }
                                                    matcher16 = matcher11;
                                                    matcher17 = matcher12;
                                                    matcher15 = matcher14;
                                                }
                                                matcher14 = matcher15;
                                                matcher12 = matcher17;
                                                matcher11 = matcher16;
                                                matcher5 = matcher5;
                                                matcher13 = matcher13;
                                                i2 = i2;
                                                str3 = str3;
                                                bVar2 = bVar;
                                            }
                                            matcher5 = matcher5;
                                            str3 = str3;
                                            matcher16 = matcher11;
                                            matcher17 = matcher12;
                                            matcher15 = matcher14;
                                            matcher14 = matcher15;
                                            matcher12 = matcher17;
                                            matcher11 = matcher16;
                                            matcher5 = matcher5;
                                            matcher13 = matcher13;
                                            i2 = i2;
                                            str3 = str3;
                                            bVar2 = bVar;
                                        }
                                    }
                                    i2 = i2;
                                    break;
                                }
                                Collections.reverse(arrayList2);
                                c0Var = new c0(arrayList2);
                                c0Var.c = Boolean.TRUE;
                                if (arrayList2.isEmpty()) {
                                    e0Var2 = null;
                                } else {
                                    e0Var2.w = c0Var;
                                }
                            }
                        } else {
                            if (c(matcher22, str5)) {
                                Long lB3 = b(matcher22, 3);
                                if (lB3 == null) {
                                    q6Var2.getLogger().i(q5.DEBUG, "No thread id in the dump, skipping thread.", new Object[0]);
                                    matcher3 = matcher19;
                                    matcher2 = matcher20;
                                    arrayList = arrayList3;
                                    e0Var2 = null;
                                } else {
                                    e0Var2.a = lB3;
                                    e0Var2.c = matcher22.group(1);
                                    if (lB3.equals(this.c)) {
                                        e0Var2.v = Boolean.TRUE;
                                    }
                                }
                            }
                            q6Var = (q6) this.d.b;
                            arrayList2 = new ArrayList();
                            matcher4 = l.matcher(str2);
                            matcher5 = m.matcher(str2);
                            matcher6 = n.matcher(str2);
                            matcher7 = o.matcher(str2);
                            matcher8 = q.matcher(str2);
                            matcher3 = matcher19;
                            matcher9 = p.matcher(str2);
                            matcher2 = matcher20;
                            matcher10 = s.matcher(str2);
                            Matcher matcher24 = r.matcher(str2);
                            arrayList = arrayList3;
                            matcher11 = t.matcher(str2);
                            matcher12 = u.matcher(str2);
                            matcher13 = k.matcher(str2);
                            str2 = str2;
                            matcher14 = matcher24;
                            a0Var = null;
                            while (true) {
                                if (bVar2.b >= i2) {
                                    aVarA = bVar2.a();
                                    if (aVarA == null) {
                                        q6Var2.getLogger().i(q5.WARNING, str3, new Object[0]);
                                    } else {
                                        str = aVarA.a;
                                        if (c(matcher13, str)) {
                                            lB = b(matcher13, 1);
                                            if (lB != null) {
                                                e0Var2.v = Boolean.TRUE;
                                            }
                                            i2 = i2;
                                        } else {
                                            i2 = i2;
                                            if (c(matcher5, str)) {
                                                a0Var = new a0();
                                                String strJ3 = ub3.j(matcher5.group(1), ".", matcher5.group(2));
                                                a0Var.f = strJ3;
                                                a0Var.e = matcher5.group(3);
                                                a0Var.d = matcher5.group(4);
                                                strGroup3 = matcher5.group(5);
                                                if (strGroup3 != null) {
                                                    numValueOf2 = null;
                                                } else {
                                                    numValueOf2 = null;
                                                }
                                                a0Var.g = numValueOf2;
                                                a0Var.y = d.g(strJ3, q6Var.getInAppIncludes(), q6Var.getInAppExcludes());
                                                arrayList2.add(a0Var);
                                            } else {
                                                matcher13 = matcher13;
                                                if (c(matcher4, str)) {
                                                    a0Var2 = new a0();
                                                    a0Var2.z = matcher4.group(3);
                                                    a0Var2.e = matcher4.group(6);
                                                    strGroup = matcher4.group(7);
                                                    if (strGroup != null) {
                                                        numValueOf = null;
                                                    } else {
                                                        numValueOf = null;
                                                    }
                                                    a0Var2.g = numValueOf;
                                                    a0Var2.F0 = "0x" + matcher4.group(2);
                                                    a0Var2.Y = "native";
                                                    strGroup2 = matcher4.group(8);
                                                    if (strGroup2 == null) {
                                                        strA = null;
                                                    } else {
                                                        strA = io.sentry.config.a.a(strGroup2);
                                                    }
                                                    if (strA != null) {
                                                        map = this.e;
                                                        if (!map.containsKey(strA)) {
                                                            DebugImage debugImage2 = new DebugImage();
                                                            debugImage2.setDebugId(strA);
                                                            debugImage2.setType("elf");
                                                            debugImage2.setCodeFile(matcher4.group(4));
                                                            debugImage2.setCodeId(strGroup2);
                                                            map.put(strA, debugImage2);
                                                        }
                                                        a0Var2.G0 = "rel:".concat(strA);
                                                    } else {
                                                        matcher5 = matcher5;
                                                        str3 = str3;
                                                    }
                                                    arrayList2.add(a0Var2);
                                                    a0Var = null;
                                                } else {
                                                    matcher5 = matcher5;
                                                    str3 = str3;
                                                    if (c(matcher6, str)) {
                                                        a0Var = new a0();
                                                        String strJ4 = ub3.j(matcher6.group(1), ".", matcher6.group(2));
                                                        a0Var.f = strJ4;
                                                        a0Var.e = matcher6.group(3);
                                                        a0Var.y = d.g(strJ4, q6Var.getInAppIncludes(), q6Var.getInAppExcludes());
                                                        a0Var.X = Boolean.TRUE;
                                                        arrayList2.add(a0Var);
                                                    } else if (c(matcher7, str)) {
                                                        if (a0Var != null) {
                                                            r5 r5Var7 = new r5();
                                                            r5Var7.a = 1;
                                                            r5Var7.b = matcher7.group(1);
                                                            r5Var7.c = matcher7.group(2);
                                                            r5Var7.d = matcher7.group(3);
                                                            a0Var.K0 = r5Var7;
                                                            a(e0Var2, r5Var7);
                                                        }
                                                    } else if (c(matcher8, str)) {
                                                        if (a0Var != null) {
                                                            r5 r5Var8 = new r5();
                                                            r5Var8.a = 2;
                                                            r5Var8.b = matcher8.group(1);
                                                            r5Var8.c = matcher8.group(2);
                                                            r5Var8.d = matcher8.group(3);
                                                            a0Var.K0 = r5Var8;
                                                            a(e0Var2, r5Var8);
                                                        }
                                                    } else if (c(matcher9, str)) {
                                                        if (a0Var != null) {
                                                            r5 r5Var9 = new r5();
                                                            r5Var9.a = 4;
                                                            r5Var9.b = matcher9.group(1);
                                                            r5Var9.c = matcher9.group(2);
                                                            r5Var9.d = matcher9.group(3);
                                                            a0Var.K0 = r5Var9;
                                                            a(e0Var2, r5Var9);
                                                        }
                                                    } else if (c(matcher10, str)) {
                                                        if (a0Var != null) {
                                                            r5 r5Var10 = new r5();
                                                            r5Var10.a = 8;
                                                            r5Var10.b = matcher10.group(1);
                                                            r5Var10.c = matcher10.group(2);
                                                            r5Var10.d = matcher10.group(3);
                                                            r5Var10.e = b(matcher10, 4);
                                                            a0Var.K0 = r5Var10;
                                                            a(e0Var2, r5Var10);
                                                        }
                                                        matcher16 = matcher11;
                                                        matcher17 = matcher12;
                                                        matcher15 = matcher14;
                                                    } else {
                                                        matcher15 = matcher14;
                                                        if (c(matcher15, str)) {
                                                            matcher16 = matcher11;
                                                            if (c(matcher16, str)) {
                                                                if (str.length() != 0) {
                                                                    break;
                                                                    break;
                                                                }
                                                                matcher17 = matcher12;
                                                                if (c(matcher17, str)) {
                                                                    break;
                                                                    break;
                                                                }
                                                            } else if (a0Var != null) {
                                                                r5 r5Var11 = new r5();
                                                                r5Var11.a = 8;
                                                                a0Var.K0 = r5Var11;
                                                                a(e0Var2, r5Var11);
                                                            }
                                                        } else {
                                                            if (a0Var != null) {
                                                                r5 r5Var12 = new r5();
                                                                r5Var12.a = 8;
                                                                r5Var12.b = matcher15.group(1);
                                                                r5Var12.c = matcher15.group(2);
                                                                r5Var12.d = matcher15.group(3);
                                                                a0Var.K0 = r5Var12;
                                                                a(e0Var2, r5Var12);
                                                            }
                                                            matcher16 = matcher11;
                                                        }
                                                        matcher17 = matcher12;
                                                    }
                                                }
                                                matcher16 = matcher11;
                                                matcher17 = matcher12;
                                                matcher15 = matcher14;
                                            }
                                            matcher14 = matcher15;
                                            matcher12 = matcher17;
                                            matcher11 = matcher16;
                                            matcher5 = matcher5;
                                            matcher13 = matcher13;
                                            i2 = i2;
                                            str3 = str3;
                                            bVar2 = bVar;
                                        }
                                        matcher5 = matcher5;
                                        str3 = str3;
                                        matcher16 = matcher11;
                                        matcher17 = matcher12;
                                        matcher15 = matcher14;
                                        matcher14 = matcher15;
                                        matcher12 = matcher17;
                                        matcher11 = matcher16;
                                        matcher5 = matcher5;
                                        matcher13 = matcher13;
                                        i2 = i2;
                                        str3 = str3;
                                        bVar2 = bVar;
                                    }
                                }
                                i2 = i2;
                                break;
                            }
                            Collections.reverse(arrayList2);
                            c0Var = new c0(arrayList2);
                            c0Var.c = Boolean.TRUE;
                            if (arrayList2.isEmpty()) {
                                e0Var2 = null;
                            } else {
                                e0Var2.w = c0Var;
                            }
                        }
                    }
                }
                if (e0Var2 != null) {
                    arrayList.add(e0Var2);
                }
            } else {
                if (c(matcher20, str4)) {
                    this.c = b(matcher20, 1);
                } else {
                    boolean zStartsWith = str4.startsWith("Free memory until OOME ");
                    d dVar = this.g;
                    if (zStartsWith) {
                        dVar.e().w = d.h(str4.substring(23));
                    } else if (str4.startsWith("Free memory until GC ")) {
                        dVar.e().v = d.h(str4.substring(21));
                    } else if (str4.startsWith("Free memory ")) {
                        dVar.e().g = d.h(str4.substring(12));
                    } else if (str4.startsWith("Total memory ")) {
                        dVar.e().x = d.h(str4.substring(13));
                    } else if (str4.startsWith("Max memory ")) {
                        dVar.e().y = d.h(str4.substring(11));
                    } else if (str4.startsWith("Total time waiting for GC to complete: ")) {
                        dVar.e().f = d.i(str4.substring(39));
                    } else if (str4.startsWith("Total GC time: ")) {
                        dVar.e().b = d.i(str4.substring(15));
                    } else if (str4.startsWith("Total GC count: ")) {
                        io.sentry.protocol.c cVarE = dVar.e();
                        try {
                            lValueOf = Long.valueOf(Long.parseLong(str4.substring(16).trim()));
                        } catch (NumberFormatException unused) {
                        }
                        cVarE.a = lValueOf;
                    } else if (str4.startsWith("Total blocking GC time: ")) {
                        dVar.e().d = d.i(str4.substring(24));
                    } else if (str4.startsWith("Total blocking GC count: ")) {
                        io.sentry.protocol.c cVarE2 = dVar.e();
                        try {
                            lValueOf = Long.valueOf(Long.parseLong(str4.substring(25).trim()));
                        } catch (NumberFormatException unused2) {
                        }
                        cVarE2.c = lValueOf;
                    } else if (str4.startsWith("Total pre-OOME GC count: ")) {
                        io.sentry.protocol.c cVarE3 = dVar.e();
                        try {
                            lValueOf = Long.valueOf(Long.parseLong(str4.substring(25).trim()));
                        } catch (NumberFormatException unused3) {
                        }
                        cVarE3.e = lValueOf;
                    }
                }
                i2 = i2;
                pattern = pattern3;
                str2 = str2;
                matcher = matcher18;
                pattern2 = pattern4;
                matcher3 = matcher19;
                matcher2 = matcher20;
            }
            bVar2 = bVar;
            pattern3 = pattern;
            matcher18 = matcher;
            pattern4 = pattern2;
            matcher19 = matcher3;
            matcher20 = matcher2;
            str2 = str2;
            i2 = i2;
        }
    }
}
