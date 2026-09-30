package defpackage;

import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class i71 extends p90 {
    public i71(String str) {
        super(str.replaceAll("(?s)/\\*.*?\\*/", ""));
    }

    public static int I0(int i) {
        if (i >= 48 && i <= 57) {
            return i - 48;
        }
        if (i >= 65 && i <= 70) {
            return i - 55;
        }
        if (i < 97 || i > 102) {
            return -1;
        }
        return i - 87;
    }

    public final String J0() {
        int iI0;
        if (z()) {
            return null;
        }
        char cCharAt = ((String) this.d).charAt(this.b);
        if (cCharAt != '\'' && cCharAt != '\"') {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        this.b++;
        int iIntValue = M().intValue();
        while (iIntValue != -1 && iIntValue != cCharAt) {
            if (iIntValue == 92) {
                iIntValue = M().intValue();
                if (iIntValue != -1) {
                    if (iIntValue == 10 || iIntValue == 13 || iIntValue == 12) {
                        iIntValue = M().intValue();
                    } else {
                        int iI1 = I0(iIntValue);
                        if (iI1 != -1) {
                            for (int i = 1; i <= 5 && (iI0 = I0((iIntValue = M().intValue()))) != -1; i++) {
                                iI1 = (iI1 * 16) + iI0;
                            }
                            sb.append((char) iI1);
                        }
                    }
                }
            }
            sb.append((char) iIntValue);
            iIntValue = M().intValue();
        }
        return sb.toString();
    }

    public final String K0() {
        int i;
        String str = (String) this.d;
        boolean z = z();
        int i2 = this.b;
        if (z) {
            i = i2;
        } else {
            int iCharAt = str.charAt(i2);
            if (iCharAt == 45) {
                iCharAt = h();
            }
            if ((iCharAt < 65 || iCharAt > 90) && ((iCharAt < 97 || iCharAt > 122) && iCharAt != 95)) {
                i = i2;
            } else {
                int iH = h();
                while (true) {
                    if ((iH < 65 || iH > 90) && ((iH < 97 || iH > 122) && !((iH >= 48 && iH <= 57) || iH == 45 || iH == 95))) {
                        break;
                    }
                    iH = h();
                }
                i = this.b;
            }
            this.b = i2;
        }
        if (i == i2) {
            return null;
        }
        String strSubstring = str.substring(i2, i);
        this.b = i;
        return strSubstring;
    }

    /* JADX WARN: Code duplicated, block: B:125:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:191:0x0315  */
    /* JADX WARN: Code duplicated, block: B:22:0x004c  */
    /* JADX WARN: Code duplicated, block: B:245:0x03e3  */
    /* JADX WARN: Code duplicated, block: B:254:0x0426  */
    /* JADX WARN: Code duplicated, block: B:260:0x0443  */
    /* JADX WARN: Code duplicated, block: B:262:0x0447  */
    /* JADX WARN: Code duplicated, block: B:266:0x045b  */
    /* JADX WARN: Code duplicated, block: B:270:0x046a  */
    /* JADX WARN: Code duplicated, block: B:286:0x0464 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:287:0x0457 A[SYNTHETIC] */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v49 */
    /* JADX WARN: Type inference failed for: r10v50 */
    /* JADX WARN: Type inference failed for: r10v51, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r10v63 */
    /* JADX WARN: Type inference failed for: r10v64 */
    /* JADX WARN: Type inference failed for: r11v10, types: [u71] */
    /* JADX WARN: Type inference failed for: r11v11 */
    /* JADX WARN: Type inference failed for: r11v12, types: [u71] */
    /* JADX WARN: Type inference failed for: r11v13, types: [u71] */
    /* JADX WARN: Type inference failed for: r11v14, types: [u71] */
    /* JADX WARN: Type inference failed for: r11v15, types: [u71] */
    /* JADX WARN: Type inference failed for: r11v16, types: [u71] */
    /* JADX WARN: Type inference failed for: r11v17 */
    /* JADX WARN: Type inference failed for: r11v19 */
    /* JADX WARN: Type inference failed for: r11v20 */
    /* JADX WARN: Type inference failed for: r11v3 */
    /* JADX WARN: Type inference failed for: r11v5, types: [int] */
    /* JADX WARN: Type inference failed for: r11v6 */
    /* JADX WARN: Type inference failed for: r11v7 */
    /* JADX WARN: Type inference failed for: r11v8, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r11v9, types: [u71] */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v24 */
    /* JADX WARN: Type inference failed for: r2v25 */
    /* JADX WARN: Type inference failed for: r2v26 */
    /* JADX WARN: Type inference failed for: r2v27 */
    /* JADX WARN: Type inference failed for: r2v29 */
    /* JADX WARN: Type inference failed for: r2v32 */
    /* JADX WARN: Type inference failed for: r2v34 */
    /* JADX WARN: Type inference failed for: r2v36 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1, types: [int] */
    /* JADX WARN: Type inference failed for: r3v2, types: [boolean] */
    /* JADX WARN: Type inference failed for: r3v21 */
    /* JADX WARN: Type inference failed for: r3v35 */
    /* JADX WARN: Type inference failed for: r3v6 */
    /* JADX WARN: Type inference failed for: r3v8 */
    /* JADX WARN: Type inference failed for: r8v15 */
    /* JADX WARN: Type inference failed for: r8v18, types: [h71] */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v29 */
    /* JADX WARN: Type inference failed for: r8v8 */
    public final ArrayList L0() throws f71 {
        ArrayList arrayList;
        int i;
        ?? u71Var;
        boolean z;
        ArrayList arrayList2;
        int i2;
        String strP;
        ?? r2;
        boolean z2;
        int i3;
        ?? r3;
        int i4;
        int i5;
        a67 a67VarB;
        ?? r8;
        h71 h71Var;
        h71 h71Var2;
        Object obj;
        Object obj2;
        Object obj3;
        ArrayList arrayListL0;
        ArrayList arrayList3;
        ArrayList arrayList4;
        Object obj4;
        ArrayList arrayList5;
        p71 p71Var;
        String str = null;
        if (z()) {
            return null;
        }
        ?? r4 = 1;
        ArrayList arrayList6 = new ArrayList(1);
        t71 t71Var = new t71();
        while (!z() && !z()) {
            int i6 = this.b;
            ArrayList arrayList7 = t71Var.a;
            int i7 = 2;
            boolean z3 = false;
            if (arrayList7 == null || arrayList7.isEmpty()) {
                i = 0;
            } else if (v('>')) {
                f0();
                i = 2;
            } else if (v('+')) {
                f0();
                i = 3;
            } else {
                i = 0;
            }
            if (v('*')) {
                u71Var = new u71(i, str);
            } else {
                String strK0 = K0();
                if (strK0 != null) {
                    u71 u71Var2 = new u71(i, strK0);
                    t71Var.b += r4;
                    u71Var = u71Var2;
                } else {
                    u71Var = str;
                }
            }
            while (!z()) {
                if (v('.')) {
                    if (u71Var == 0) {
                        u71Var = new u71(i, str);
                    }
                    String strK1 = K0();
                    if (strK1 == null) {
                        throw new f71("Invalid \".class\" simpleSelectors");
                    }
                    u71Var.a(i7, "class", strK1);
                    t71Var.a();
                } else if (v('#')) {
                    if (u71Var == 0) {
                        u71Var = new u71(i, str);
                    }
                    String strK2 = K0();
                    if (strK2 == null) {
                        throw new f71("Invalid \"#id\" simpleSelectors");
                    }
                    u71Var.a(i7, "id", strK2);
                    t71Var.b += 1000000;
                } else if (v('[')) {
                    if (u71Var == 0) {
                        u71Var = new u71(i, str);
                    }
                    f0();
                    String strK3 = K0();
                    if (strK3 == null) {
                        throw new f71("Invalid attribute simpleSelectors");
                    }
                    f0();
                    if (v('=')) {
                        i2 = i7;
                    } else if (w("~=")) {
                        i2 = 3;
                    } else {
                        i2 = w("|=") ? 4 : z3 ? 1 : 0;
                    }
                    if (i2 != 0) {
                        f0();
                        if (z()) {
                            strP = str;
                        } else {
                            strP = P();
                            if (strP == null) {
                                strP = K0();
                            }
                        }
                        if (strP == null) {
                            throw new f71("Invalid attribute simpleSelectors");
                        }
                        f0();
                    } else {
                        strP = str;
                    }
                    if (!v(']')) {
                        throw new f71("Invalid attribute simpleSelectors");
                    }
                    if (i2 == 0) {
                        i2 = r4 == true ? 1 : 0;
                    }
                    u71Var.a(i2, strK3, strP);
                    t71Var.a();
                } else {
                    u71Var = u71Var;
                    if (v(':')) {
                        if (u71Var == 0) {
                            u71Var = new u71(i, str);
                        }
                        String strK4 = K0();
                        if (strK4 == null) {
                            throw new f71("Invalid pseudo class");
                        }
                        n71 n71Var = (n71) n71.e.get(strK4);
                        if (n71Var == null) {
                            n71Var = n71.d;
                        }
                        switch (n71Var.ordinal()) {
                            case 0:
                                r2 = r4 == true ? 1 : 0;
                                z2 = z3 ? 1 : 0;
                                i3 = 2;
                                m71 m71Var = new m71(2);
                                t71Var.a();
                                obj4 = m71Var;
                                arrayList5 = u71Var.d;
                                if (arrayList5 == null) {
                                    arrayList5 = new ArrayList();
                                    u71Var.d = arrayList5;
                                }
                                arrayList5.add(obj4);
                                i7 = i3;
                                z3 = z2;
                                r4 = r2;
                                str = null;
                                break;
                            case 1:
                                z2 = z3 ? 1 : 0;
                                r3 = 1;
                                m71 m71Var2 = new m71(1);
                                t71Var.a();
                                obj = m71Var2;
                                i3 = 2;
                                r2 = r3;
                                obj4 = obj;
                                arrayList5 = u71Var.d;
                                if (arrayList5 == null) {
                                    arrayList5 = new ArrayList();
                                    u71Var.d = arrayList5;
                                }
                                arrayList5.add(obj4);
                                i7 = i3;
                                z3 = z2;
                                r4 = r2;
                                str = null;
                                break;
                            case 2:
                            case 3:
                            case 4:
                            case 5:
                                boolean z4 = (n71Var == n71.a || n71Var == n71.b) ? r4 == true ? 1 : 0 : z3 ? 1 : 0;
                                boolean z5 = (n71Var == n71.b || n71Var == n71.c) ? r4 == true ? 1 : 0 : z3 ? 1 : 0;
                                int i8 = this.c;
                                String str2 = (String) this.d;
                                if (z()) {
                                    r8 = str;
                                    z2 = z3 ? 1 : 0;
                                } else {
                                    int i9 = this.b;
                                    if (v('(')) {
                                        f0();
                                        if (w("odd")) {
                                            h71Var2 = new h71(2, r4 == true ? 1 : 0, z3 ? 1 : 0);
                                        } else if (w("even")) {
                                            h71Var2 = new h71(2, z3 ? 1 : 0, z3 ? 1 : 0);
                                        } else {
                                            int i10 = (!v('+') && v('-')) ? -1 : r4 == true ? 1 : 0;
                                            a67 a67VarB2 = a67.b(this.b, i8, str2);
                                            if (a67VarB2 != null) {
                                                this.b = a67VarB2.a;
                                            }
                                            if (v('n') || v('N')) {
                                                if (a67VarB2 == null) {
                                                    a67VarB2 = new a67(1L, this.b);
                                                }
                                                f0();
                                                boolean zV = v('+');
                                                i4 = (zV || !(zV = v('-'))) ? 1 : -1;
                                                if (zV) {
                                                    f0();
                                                    a67VarB = a67.b(this.b, i8, str2);
                                                    if (a67VarB != null) {
                                                        this.b = a67VarB.a;
                                                        i5 = i10;
                                                    } else {
                                                        this.b = i9;
                                                        r8 = 0;
                                                        z2 = false;
                                                    }
                                                } else {
                                                    i5 = i10;
                                                    a67VarB = null;
                                                }
                                            } else {
                                                a67VarB = a67VarB2;
                                                i4 = i10;
                                                a67VarB2 = null;
                                                i5 = 1;
                                            }
                                            z2 = false;
                                            h71Var = new h71(a67VarB2 == null ? 0 : (i5 == true ? 1 : 0) * ((int) a67VarB2.b), a67VarB == null ? 0 : i4 * ((int) a67VarB.b), 0);
                                            f0();
                                            r8 = h71Var;
                                            if (!v(')')) {
                                                this.b = i9;
                                                r8 = 0;
                                            }
                                        }
                                        z2 = z3 ? 1 : 0;
                                        h71Var = h71Var2;
                                        f0();
                                        r8 = h71Var;
                                        if (!v(')')) {
                                            this.b = i9;
                                            r8 = 0;
                                        }
                                    } else {
                                        r8 = str;
                                        z2 = z3 ? 1 : 0;
                                    }
                                }
                                if (r8 == 0) {
                                    throw new f71("Invalid or missing parameter section for pseudo class: ".concat(strK4));
                                }
                                l71 l71Var = new l71(r8.b, r8.c, z4, z5, u71Var.b);
                                t71Var.a();
                                obj = l71Var;
                                r3 = 1;
                                i3 = 2;
                                r2 = r3;
                                obj4 = obj;
                                arrayList5 = u71Var.d;
                                if (arrayList5 == null) {
                                    arrayList5 = new ArrayList();
                                    u71Var.d = arrayList5;
                                }
                                arrayList5.add(obj4);
                                i7 = i3;
                                z3 = z2;
                                r4 = r2;
                                str = null;
                                break;
                                break;
                            case 6:
                                l71 l71Var2 = new l71(0, 1, true, false, null);
                                t71Var.a();
                                r3 = r4 == true ? 1 : 0;
                                z2 = z3 ? 1 : 0;
                                obj = l71Var2;
                                i3 = 2;
                                r2 = r3;
                                obj4 = obj;
                                arrayList5 = u71Var.d;
                                if (arrayList5 == null) {
                                    arrayList5 = new ArrayList();
                                    u71Var.d = arrayList5;
                                }
                                arrayList5.add(obj4);
                                i7 = i3;
                                z3 = z2;
                                r4 = r2;
                                str = null;
                                break;
                            case 7:
                                l71 l71Var3 = new l71(0, 1, false, false, null);
                                t71Var.a();
                                r3 = r4 == true ? 1 : 0;
                                z2 = z3 ? 1 : 0;
                                obj = l71Var3;
                                i3 = 2;
                                r2 = r3;
                                obj4 = obj;
                                arrayList5 = u71Var.d;
                                if (arrayList5 == null) {
                                    arrayList5 = new ArrayList();
                                    u71Var.d = arrayList5;
                                }
                                arrayList5.add(obj4);
                                i7 = i3;
                                z3 = z2;
                                r4 = r2;
                                str = null;
                                break;
                            case 8:
                                l71 l71Var4 = new l71(0, 1, true, true, u71Var.b);
                                t71Var.a();
                                r3 = r4 == true ? 1 : 0;
                                z2 = z3 ? 1 : 0;
                                obj = l71Var4;
                                i3 = 2;
                                r2 = r3;
                                obj4 = obj;
                                arrayList5 = u71Var.d;
                                if (arrayList5 == null) {
                                    arrayList5 = new ArrayList();
                                    u71Var.d = arrayList5;
                                }
                                arrayList5.add(obj4);
                                i7 = i3;
                                z3 = z2;
                                r4 = r2;
                                str = null;
                                break;
                            case 9:
                                l71 l71Var5 = new l71(0, 1, false, true, u71Var.b);
                                t71Var.a();
                                r3 = r4 == true ? 1 : 0;
                                z2 = z3 ? 1 : 0;
                                obj = l71Var5;
                                i3 = 2;
                                r2 = r3;
                                obj4 = obj;
                                arrayList5 = u71Var.d;
                                if (arrayList5 == null) {
                                    arrayList5 = new ArrayList();
                                    u71Var.d = arrayList5;
                                }
                                arrayList5.add(obj4);
                                i7 = i3;
                                z3 = z2;
                                r4 = r2;
                                str = null;
                                break;
                            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                                q71 q71Var = new q71(z3, str);
                                t71Var.a();
                                obj2 = q71Var;
                                obj3 = obj2;
                                z2 = z3 ? 1 : 0;
                                r3 = r4;
                                obj = obj3;
                                i3 = 2;
                                r2 = r3;
                                obj4 = obj;
                                arrayList5 = u71Var.d;
                                if (arrayList5 == null) {
                                    arrayList5 = new ArrayList();
                                    u71Var.d = arrayList5;
                                }
                                arrayList5.add(obj4);
                                i7 = i3;
                                z3 = z2;
                                r4 = r2;
                                str = null;
                                break;
                            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                                q71 q71Var2 = new q71(r4, u71Var.b);
                                t71Var.a();
                                obj2 = q71Var2;
                                obj3 = obj2;
                                z2 = z3 ? 1 : 0;
                                r3 = r4;
                                obj = obj3;
                                i3 = 2;
                                r2 = r3;
                                obj4 = obj;
                                arrayList5 = u71Var.d;
                                if (arrayList5 == null) {
                                    arrayList5 = new ArrayList();
                                    u71Var.d = arrayList5;
                                }
                                arrayList5.add(obj4);
                                i7 = i3;
                                z3 = z2;
                                r4 = r2;
                                str = null;
                                break;
                            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                                m71 m71Var3 = new m71(z3 ? 1 : 0);
                                t71Var.a();
                                obj2 = m71Var3;
                                obj3 = obj2;
                                z2 = z3 ? 1 : 0;
                                r3 = r4;
                                obj = obj3;
                                i3 = 2;
                                r2 = r3;
                                obj4 = obj;
                                arrayList5 = u71Var.d;
                                if (arrayList5 == null) {
                                    arrayList5 = new ArrayList();
                                    u71Var.d = arrayList5;
                                }
                                arrayList5.add(obj4);
                                i7 = i3;
                                z3 = z2;
                                r4 = r2;
                                str = null;
                                break;
                            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                                if (z()) {
                                    arrayListL0 = str;
                                } else {
                                    int i11 = this.b;
                                    if (v('(')) {
                                        f0();
                                        arrayListL0 = L0();
                                        if (arrayListL0 != null && v(')')) {
                                            Iterator it = arrayListL0.iterator();
                                            while (it.hasNext() && (arrayList3 = ((t71) it.next()).a) != null) {
                                                Iterator it2 = arrayList3.iterator();
                                                while (true) {
                                                    if (it2.hasNext() && (arrayList4 = ((u71) it2.next()).d) != null) {
                                                        Iterator it3 = arrayList4.iterator();
                                                        while (true) {
                                                            if (it3.hasNext()) {
                                                                if (((k71) it3.next()) instanceof o71) {
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        } else {
                                            this.b = i11;
                                        }
                                        arrayListL0 = str;
                                    } else {
                                        arrayListL0 = str;
                                    }
                                }
                                if (arrayListL0 == null) {
                                    throw new f71("Invalid or missing parameter section for pseudo class: ".concat(strK4));
                                }
                                o71 o71Var = new o71();
                                o71Var.a = arrayListL0;
                                Iterator it4 = arrayListL0.iterator();
                                int i12 = Integer.MIN_VALUE;
                                while (it4.hasNext()) {
                                    int i13 = ((t71) it4.next()).b;
                                    if (i13 > i12) {
                                        i12 = i13;
                                    }
                                }
                                t71Var.b = i12;
                                obj3 = o71Var;
                                z2 = z3 ? 1 : 0;
                                r3 = r4;
                                obj = obj3;
                                i3 = 2;
                                r2 = r3;
                                obj4 = obj;
                                arrayList5 = u71Var.d;
                                if (arrayList5 == null) {
                                    arrayList5 = new ArrayList();
                                    u71Var.d = arrayList5;
                                }
                                arrayList5.add(obj4);
                                i7 = i3;
                                z3 = z2;
                                r4 = r2;
                                str = null;
                                break;
                                break;
                            case 14:
                                if (!z()) {
                                    int i14 = this.b;
                                    if (v('(')) {
                                        f0();
                                        ?? arrayList8 = str;
                                        while (true) {
                                            String strK5 = K0();
                                            arrayList8 = arrayList8;
                                            if (strK5 == null) {
                                                this.b = i14;
                                            } else {
                                                if (arrayList8 == 0) {
                                                    arrayList8 = new ArrayList();
                                                }
                                                arrayList8.add(strK5);
                                                f0();
                                                if (!e0()) {
                                                    if (!v(')')) {
                                                        this.b = i14;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                p71 p71Var2 = new p71(strK4);
                                t71Var.a();
                                p71Var = p71Var2;
                                r2 = r4 == true ? 1 : 0;
                                i3 = i7;
                                z2 = z3 ? 1 : 0;
                                obj4 = p71Var;
                                arrayList5 = u71Var.d;
                                if (arrayList5 == null) {
                                    arrayList5 = new ArrayList();
                                    u71Var.d = arrayList5;
                                }
                                arrayList5.add(obj4);
                                i7 = i3;
                                z3 = z2;
                                r4 = r2;
                                str = null;
                                break;
                            case 15:
                            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                            case 17:
                            case 18:
                            case 19:
                            case 20:
                            case 21:
                            case 22:
                            case 23:
                                p71 p71Var3 = new p71(strK4);
                                t71Var.a();
                                p71Var = p71Var3;
                                r2 = r4 == true ? 1 : 0;
                                i3 = i7;
                                z2 = z3 ? 1 : 0;
                                obj4 = p71Var;
                                arrayList5 = u71Var.d;
                                if (arrayList5 == null) {
                                    arrayList5 = new ArrayList();
                                    u71Var.d = arrayList5;
                                }
                                arrayList5.add(obj4);
                                i7 = i3;
                                z3 = z2;
                                r4 = r2;
                                str = null;
                                break;
                            default:
                                throw new f71("Unsupported pseudo class: ".concat(strK4));
                        }
                    } else {
                        z = r4 == true ? 1 : 0;
                        if (u71Var != 0) {
                            this.b = i6;
                            arrayList = t71Var.a;
                            if (arrayList != null && !arrayList.isEmpty()) {
                                arrayList6.add(t71Var);
                            }
                            return arrayList6;
                        }
                        arrayList2 = t71Var.a;
                        if (arrayList2 == null) {
                            arrayList2 = new ArrayList();
                            t71Var.a = arrayList2;
                        }
                        arrayList2.add(u71Var);
                        if (!e0()) {
                            arrayList6.add(t71Var);
                            t71Var = new t71();
                        }
                        r4 = z ? 1 : 0;
                        str = null;
                    }
                }
            }
            z = r4 == true ? 1 : 0;
            if (u71Var != 0) {
                this.b = i6;
                arrayList = t71Var.a;
                if (arrayList != null) {
                    arrayList6.add(t71Var);
                }
                return arrayList6;
            }
            arrayList2 = t71Var.a;
            if (arrayList2 == null) {
                arrayList2 = new ArrayList();
                t71Var.a = arrayList2;
            }
            arrayList2.add(u71Var);
            if (!e0()) {
                arrayList6.add(t71Var);
                t71Var = new t71();
            }
            r4 = z ? 1 : 0;
            str = null;
        }
        arrayList = t71Var.a;
        if (arrayList != null) {
            arrayList6.add(t71Var);
        }
        return arrayList6;
    }
}
