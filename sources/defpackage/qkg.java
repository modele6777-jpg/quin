package defpackage;

import android.util.Log;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import io.sentry.android.core.b1;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.logging.Level;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class qkg extends m4 {
    public static final Set g;
    public static final fhh v;
    public static final okg w;
    public final String c;
    public final Level d;
    public final Set e;
    public final fhh f;

    static {
        Set setUnmodifiableSet = Collections.unmodifiableSet(new HashSet(Arrays.asList(bgh.a, vgh.a, wgh.a)));
        g = setUnmodifiableSet;
        fhh fhhVar = new fhh(z5c.P(setUnmodifiableSet));
        v = fhhVar;
        w = new okg(Level.ALL, setUnmodifiableSet, fhhVar);
    }

    public /* synthetic */ qkg(String str, Level level, Set set, fhh fhhVar) {
        super(7, str);
        this.c = arb.n(str);
        this.d = level;
        this.e = set;
        this.f = fhhVar;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x019c  */
    /* JADX WARN: Code duplicated, block: B:104:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:105:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:108:0x01b8 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:109:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:113:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:114:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:117:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:119:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:137:0x022d  */
    /* JADX WARN: Code duplicated, block: B:140:0x0238  */
    /* JADX WARN: Code duplicated, block: B:145:0x0254  */
    /* JADX WARN: Code duplicated, block: B:147:0x0269  */
    /* JADX WARN: Code duplicated, block: B:149:0x026d  */
    /* JADX WARN: Code duplicated, block: B:151:0x0275  */
    /* JADX WARN: Code duplicated, block: B:155:0x0292  */
    /* JADX WARN: Code duplicated, block: B:157:0x029a  */
    /* JADX WARN: Code duplicated, block: B:175:0x02c7  */
    /* JADX WARN: Code duplicated, block: B:177:0x02cf  */
    /* JADX WARN: Code duplicated, block: B:179:0x02e1  */
    /* JADX WARN: Code duplicated, block: B:182:0x02ee  */
    /* JADX WARN: Code duplicated, block: B:185:0x030d  */
    /* JADX WARN: Code duplicated, block: B:187:0x0311  */
    /* JADX WARN: Code duplicated, block: B:188:0x0315  */
    /* JADX WARN: Code duplicated, block: B:189:0x031b  */
    /* JADX WARN: Code duplicated, block: B:197:0x0345  */
    /* JADX WARN: Code duplicated, block: B:199:0x034e  */
    /* JADX WARN: Code duplicated, block: B:201:0x0356 A[LOOP:4: B:138:0x022f->B:201:0x0356, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:208:0x036c A[LOOP:2: B:98:0x0196->B:208:0x036c, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:215:0x039e  */
    /* JADX WARN: Code duplicated, block: B:234:0x03ec  */
    /* JADX WARN: Code duplicated, block: B:236:0x03f2  */
    /* JADX WARN: Code duplicated, block: B:238:0x03f8  */
    /* JADX WARN: Code duplicated, block: B:240:0x0402  */
    /* JADX WARN: Code duplicated, block: B:241:0x0405  */
    /* JADX WARN: Code duplicated, block: B:243:0x0408  */
    /* JADX WARN: Code duplicated, block: B:245:0x040c  */
    /* JADX WARN: Code duplicated, block: B:248:0x0429  */
    /* JADX WARN: Code duplicated, block: B:268:0x046d  */
    /* JADX WARN: Code duplicated, block: B:270:0x0471  */
    /* JADX WARN: Code duplicated, block: B:272:0x0475  */
    /* JADX WARN: Code duplicated, block: B:275:0x0383 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:276:0x0126 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:277:0x0162 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:278:0x015b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:279:0x0150 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:280:0x0188 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:281:0x017e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:282:0x0378 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:285:0x0367 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:286:0x028b A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:289:0x0340 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:290:0x0339 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:291:0x0332 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:292:0x0360 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:293:0x0359 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:299:0x01cc A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:300:0x01e8 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:304:0x0231 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:305:0x0242 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:40:0x0097  */
    /* JADX WARN: Code duplicated, block: B:42:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:44:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:49:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:51:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:53:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:54:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:57:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:59:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:61:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:64:0x0102  */
    /* JADX WARN: Code duplicated, block: B:66:0x0115  */
    /* JADX WARN: Code duplicated, block: B:68:0x011e A[LOOP:1: B:62:0x00fa->B:68:0x011e, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:73:0x0133  */
    /* JADX WARN: Code duplicated, block: B:75:0x0137  */
    /* JADX WARN: Code duplicated, block: B:77:0x013d  */
    /* JADX WARN: Code duplicated, block: B:79:0x0145  */
    /* JADX WARN: Code duplicated, block: B:86:0x0169  */
    /* JADX WARN: Code duplicated, block: B:88:0x016e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:89:0x0170  */
    /* JADX WARN: Code duplicated, block: B:91:0x0176  */
    /* JADX WARN: Code duplicated, block: B:96:0x018f  */
    public static void B0(yfh yfhVar, String str, Level level, Set set, fhh fhhVar) {
        ckg ihhVar;
        StringBuilder sb;
        jgh jghVar;
        gkg gkgVar;
        ckg ckgVar;
        Level level2;
        int i;
        boolean z;
        Object[] objArr;
        ahh ahhVar;
        wt4 wt4Var;
        boolean z2;
        String str2;
        Object[] objArr2;
        String str3;
        StringBuilder sb2;
        String str4;
        int iB;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        Level level3;
        char cCharAt;
        int i9;
        char c;
        String str5;
        int i10;
        int i11;
        char cCharAt2;
        boolean z3;
        int i12;
        ckg ckgVar2;
        ygh yghVar;
        int i13;
        char cCharAt3;
        String str6;
        int i14;
        ygh yghVar2;
        int i15;
        char cCharAt4;
        char c2;
        int i16;
        xgh xghVarA;
        int i17;
        int i18;
        zkg zkgVar;
        h72 algVar;
        h72 clgVar;
        int i19;
        Object[] objArr3;
        int i20;
        Object obj;
        int i21;
        int i22;
        String string;
        mxb mxbVarD = yfhVar.d();
        Level level4 = yfhVar.a;
        Boolean bool = (Boolean) mxbVarD.r(wgh.a);
        if (bool == null || !bool.booleanValue()) {
            ((ikg) dkg.a).getClass();
            mxb mxbVarC = nkg.b.c();
            mxb mxbVarD2 = yfhVar.d();
            int iM = mxbVarD2.m();
            if (iM == 0) {
                ihhVar = ckg.a;
            } else {
                ihhVar = iM <= 28 ? new ihh(mxbVarC, mxbVarD2) : new jhh(mxbVarC, mxbVarD2);
            }
            int i23 = 0;
            boolean z4 = level4.intValue() < level.intValue();
            if (z4) {
                sb = new StringBuilder();
                jghVar = yfhVar.d;
                if (jghVar != null) {
                    qc0.p("cannot request log site information prior to postProcess()");
                    return;
                }
                if (vtb.y(2, jghVar, sb)) {
                    sb.append(" ");
                }
                if (z4) {
                    gkgVar = yfhVar.f;
                    if (gkgVar != null) {
                        if (gkgVar != null) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        str2 = "cannot get arguments unless a template context exists";
                        if (!z2) {
                            qc0.p("cannot get arguments unless a template context exists");
                            return;
                        }
                        objArr2 = yfhVar.g;
                        str3 = "cannot get arguments before calling log()";
                        if (objArr2 == null) {
                            qc0.p("cannot get arguments before calling log()");
                            return;
                        }
                        wt4Var = new wt4(gkgVar, objArr2, sb);
                        sb2 = (StringBuilder) wt4Var.g;
                        gkg gkgVar2 = (gkg) wt4Var.e;
                        gkgVar2.getClass();
                        dlg dlgVar = dlg.b;
                        str4 = gkgVar2.a;
                        iB = flg.b(0, str4);
                        i2 = 0;
                        i = 3;
                        i3 = -1;
                        while (iB >= 0) {
                            i5 = iB + 1;
                            i6 = i23;
                            i7 = i5;
                            while (true) {
                                if (i7 >= str4.length()) {
                                    throw new elg(elg.c("unterminated parameter", iB, str4, -1));
                                }
                                i8 = i7 + 1;
                                level3 = level4;
                                cCharAt = str4.charAt(i7);
                                i9 = i7;
                                c = (char) (cCharAt - '0');
                                str5 = str2;
                                if (c < '\n') {
                                    i22 = (i6 * 10) + c;
                                    if (i22 >= 1000000) {
                                        throw elg.a("index too large", iB, str4, i8);
                                    }
                                    i6 = i22;
                                    i7 = i8;
                                    level4 = level3;
                                    str2 = str5;
                                }
                            }
                            if (cCharAt != '$') {
                                i10 = -1;
                                if (cCharAt != '<') {
                                    i3 = i2;
                                    i2++;
                                } else {
                                    if (i3 == -1) {
                                        throw elg.a("invalid relative parameter", iB, str4, i8);
                                    }
                                    if (i8 == str4.length()) {
                                        throw new elg(elg.c("unterminated parameter", iB, str4, -1));
                                    }
                                    str4.charAt(i8);
                                    i5 = i8;
                                    i8 = i9 + 2;
                                }
                            } else {
                                if (i9 - i5 == 0) {
                                    throw elg.a("missing index", iB, str4, i8);
                                }
                                if (str4.charAt(i5) == '0') {
                                    throw elg.a("index has leading zero", iB, str4, i8);
                                }
                                i21 = i6 - 1;
                                if (i8 == str4.length()) {
                                    throw new elg(elg.c("unterminated parameter", iB, str4, -1));
                                }
                                str4.charAt(i8);
                                i5 = i8;
                                i3 = i21;
                                i8 = i9 + 2;
                                i10 = -1;
                            }
                            i11 = i8 + i10;
                            while (true) {
                                if (i11 >= str4.length()) {
                                    throw new elg(elg.c("unterminated parameter", iB, str4, -1));
                                }
                                if (((char) ((str4.charAt(i11) & (-33)) - 65)) < 26) {
                                    break;
                                }
                                i11++;
                                str3 = str3;
                            }
                            cCharAt2 = str4.charAt(i11);
                            if ((cCharAt2 & ' ') == 0) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            ygh yghVar3 = ygh.e;
                            if (i5 == i11) {
                                if (true != z3) {
                                    i12 = 0;
                                } else {
                                    i12 = UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
                                }
                                while (true) {
                                    if (i5 != i11) {
                                        ckgVar2 = ihhVar;
                                        yghVar = new ygh(i12, -1, -1);
                                        str6 = str3;
                                    } else {
                                        i13 = i5 + 1;
                                        cCharAt3 = str4.charAt(i5);
                                        str6 = str3;
                                        if (cCharAt3 >= ' ') {
                                        }
                                        ckgVar2 = ihhVar;
                                        if (cCharAt3 > '9') {
                                            throw elg.b(i5, "invalid flag", str4);
                                        }
                                        i14 = cCharAt3 - '0';
                                        while (true) {
                                            if (i13 == i11) {
                                                yghVar2 = new ygh(i12, i14, -1);
                                                yghVar = yghVar2;
                                                break;
                                            }
                                            i15 = i13 + 1;
                                            cCharAt4 = str4.charAt(i13);
                                            if (cCharAt4 == '.') {
                                                yghVar = new ygh(i12, i14, ygh.e(i15, i11, str4));
                                                break;
                                            }
                                            c2 = (char) (cCharAt4 - '0');
                                            if (c2 >= '\n') {
                                                throw elg.b(i13, "invalid width character", str4);
                                            }
                                            i14 = (i14 * 10) + c2;
                                            if (i14 > 999999) {
                                                throw elg.a("width too large", i5, str4, i11);
                                            }
                                            i13 = i15;
                                        }
                                    }
                                    i12 |= i16;
                                    i5 = i13;
                                    ihhVar = ckgVar2;
                                    str3 = str6;
                                }
                            } else {
                                if (true != z3) {
                                    i12 = 0;
                                } else {
                                    i12 = UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
                                }
                                while (true) {
                                    if (i5 != i11) {
                                        ckgVar2 = ihhVar;
                                        yghVar = new ygh(i12, -1, -1);
                                        str6 = str3;
                                    } else {
                                        i13 = i5 + 1;
                                        cCharAt3 = str4.charAt(i5);
                                        str6 = str3;
                                        if (cCharAt3 >= ' ') {
                                        }
                                        ckgVar2 = ihhVar;
                                        if (cCharAt3 > '9') {
                                            throw elg.b(i5, "invalid flag", str4);
                                        }
                                        i14 = cCharAt3 - '0';
                                        while (true) {
                                            if (i13 == i11) {
                                                yghVar2 = new ygh(i12, i14, -1);
                                                yghVar = yghVar2;
                                                break;
                                            }
                                            i15 = i13 + 1;
                                            cCharAt4 = str4.charAt(i13);
                                            if (cCharAt4 == '.') {
                                                yghVar = new ygh(i12, i14, ygh.e(i15, i11, str4));
                                                break;
                                            }
                                            c2 = (char) (cCharAt4 - '0');
                                            if (c2 >= '\n') {
                                                throw elg.b(i13, "invalid width character", str4);
                                            }
                                            i14 = (i14 * 10) + c2;
                                            if (i14 > 999999) {
                                                throw elg.a("width too large", i5, str4, i11);
                                            }
                                            i13 = i15;
                                        }
                                    }
                                    i12 |= i16;
                                    i5 = i13;
                                    ihhVar = ckgVar2;
                                    str3 = str6;
                                }
                            }
                            xghVarA = xgh.a(cCharAt2);
                            i17 = i11 + 1;
                            if (xghVarA != null) {
                                yghVar.getClass();
                                if (yghVar.b(xghVarA.d(), xghVarA.c().a())) {
                                    throw elg.a("invalid format specifier", iB, str4, i17);
                                }
                                if (i3 < 10) {
                                    Map map = blg.d;
                                    if (yghVar.a()) {
                                        h72[] h72VarArr = (blg[]) blg.d.get(xghVarA);
                                        drb.n(h72VarArr, "default parameter");
                                        algVar = h72VarArr[i3];
                                    }
                                }
                                clgVar = new blg(i3, xghVarA, yghVar);
                                algVar = clgVar;
                            } else {
                                if (cCharAt2 != 't') {
                                }
                                if (yghVar.b(160, false)) {
                                    throw elg.a("invalid format specification", iB, str4, i17);
                                }
                                i18 = i11 + 2;
                                if (i18 <= str4.length()) {
                                    throw elg.b(iB, "truncated format specifier", str4);
                                }
                                zkgVar = (zkg) zkg.a.get(Character.valueOf(str4.charAt(i17)));
                                if (zkgVar != null) {
                                    throw elg.b(i17, "illegal date/time conversion", str4);
                                }
                                algVar = new alg(yghVar, i3, zkgVar);
                                i17 = i18;
                            }
                            i19 = algVar.a;
                            if (i19 < 32) {
                                wt4Var.b |= 1 << i19;
                            }
                            wt4Var.c = Math.max(wt4Var.c, i19);
                            flg.a(wt4Var.d, iB, str4, sb2);
                            objArr3 = (Object[]) wt4Var.f;
                            i20 = algVar.a;
                            if (i20 < objArr3.length) {
                                obj = objArr3[i20];
                                if (obj != null) {
                                    algVar.E(wt4Var, obj);
                                } else {
                                    sb2.append("null");
                                }
                            } else {
                                sb2.append("[ERROR: MISSING LOG ARGUMENT]");
                            }
                            wt4Var.d = i17;
                            iB = flg.b(i17, str4);
                            ihhVar = ckgVar2;
                            level4 = level3;
                            str2 = str5;
                            str3 = str6;
                            i23 = 0;
                        }
                        ckgVar = ihhVar;
                        level2 = level4;
                        String str7 = str2;
                        String str8 = str3;
                        i4 = wt4Var.b;
                        if (((i4 + 1) & i4) == 0) {
                        }
                        throw new elg(String.format("unreferenced arguments [first missing index=%d]", Integer.valueOf(Integer.numberOfTrailingZeros(~i4))));
                    }
                    ckgVar = ihhVar;
                    level2 = level4;
                    i = 3;
                    if (gkgVar == null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z) {
                        qc0.p("cannot get literal argument if a template context exists");
                        return;
                    }
                    objArr = yfhVar.g;
                    if (objArr == null) {
                        qc0.p("cannot get literal argument before calling log()");
                        return;
                    }
                    sb.append(bhh.a(objArr[0]));
                    int i24 = fkg.a;
                    ahhVar = new ahh(sb);
                    ckgVar.a(fhhVar, ahhVar);
                    if (ahhVar.b) {
                        sb.append(" ]");
                    }
                } else {
                    gkgVar = yfhVar.f;
                    if (gkgVar != null) {
                        if (gkgVar != null) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        str2 = "cannot get arguments unless a template context exists";
                        if (!z2) {
                            qc0.p("cannot get arguments unless a template context exists");
                            return;
                        }
                        objArr2 = yfhVar.g;
                        str3 = "cannot get arguments before calling log()";
                        if (objArr2 == null) {
                            qc0.p("cannot get arguments before calling log()");
                            return;
                        }
                        wt4Var = new wt4(gkgVar, objArr2, sb);
                        sb2 = (StringBuilder) wt4Var.g;
                        gkg gkgVar3 = (gkg) wt4Var.e;
                        gkgVar3.getClass();
                        dlg dlgVar2 = dlg.b;
                        str4 = gkgVar3.a;
                        iB = flg.b(0, str4);
                        i2 = 0;
                        i = 3;
                        i3 = -1;
                        while (iB >= 0) {
                            i5 = iB + 1;
                            i6 = i23;
                            i7 = i5;
                            while (true) {
                                if (i7 >= str4.length()) {
                                    throw new elg(elg.c("unterminated parameter", iB, str4, -1));
                                }
                                i8 = i7 + 1;
                                level3 = level4;
                                cCharAt = str4.charAt(i7);
                                i9 = i7;
                                c = (char) (cCharAt - '0');
                                str5 = str2;
                                if (c < '\n') {
                                    i22 = (i6 * 10) + c;
                                    if (i22 >= 1000000) {
                                        throw elg.a("index too large", iB, str4, i8);
                                    }
                                    i6 = i22;
                                    i7 = i8;
                                    level4 = level3;
                                    str2 = str5;
                                }
                            }
                            if (cCharAt != '$') {
                                i10 = -1;
                                if (cCharAt != '<') {
                                    i3 = i2;
                                    i2++;
                                } else {
                                    if (i3 == -1) {
                                        throw elg.a("invalid relative parameter", iB, str4, i8);
                                    }
                                    if (i8 == str4.length()) {
                                        throw new elg(elg.c("unterminated parameter", iB, str4, -1));
                                    }
                                    str4.charAt(i8);
                                    i5 = i8;
                                    i8 = i9 + 2;
                                }
                            } else {
                                if (i9 - i5 == 0) {
                                    throw elg.a("missing index", iB, str4, i8);
                                }
                                if (str4.charAt(i5) == '0') {
                                    throw elg.a("index has leading zero", iB, str4, i8);
                                }
                                i21 = i6 - 1;
                                if (i8 == str4.length()) {
                                    throw new elg(elg.c("unterminated parameter", iB, str4, -1));
                                }
                                str4.charAt(i8);
                                i5 = i8;
                                i3 = i21;
                                i8 = i9 + 2;
                                i10 = -1;
                            }
                            i11 = i8 + i10;
                            while (true) {
                                if (i11 >= str4.length()) {
                                    throw new elg(elg.c("unterminated parameter", iB, str4, -1));
                                }
                                if (((char) ((str4.charAt(i11) & (-33)) - 65)) < 26) {
                                    break;
                                }
                                i11++;
                                str3 = str3;
                            }
                            cCharAt2 = str4.charAt(i11);
                            if ((cCharAt2 & ' ') == 0) {
                                z3 = true;
                            } else {
                                z3 = false;
                            }
                            ygh yghVar4 = ygh.e;
                            if (i5 == i11) {
                                if (true != z3) {
                                    i12 = 0;
                                } else {
                                    i12 = UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
                                }
                                while (true) {
                                    if (i5 != i11) {
                                        ckgVar2 = ihhVar;
                                        yghVar = new ygh(i12, -1, -1);
                                        str6 = str3;
                                    } else {
                                        i13 = i5 + 1;
                                        cCharAt3 = str4.charAt(i5);
                                        str6 = str3;
                                        if (cCharAt3 >= ' ') {
                                        }
                                        ckgVar2 = ihhVar;
                                        if (cCharAt3 > '9') {
                                            throw elg.b(i5, "invalid flag", str4);
                                        }
                                        i14 = cCharAt3 - '0';
                                        while (true) {
                                            if (i13 == i11) {
                                                yghVar2 = new ygh(i12, i14, -1);
                                                yghVar = yghVar2;
                                                break;
                                            }
                                            i15 = i13 + 1;
                                            cCharAt4 = str4.charAt(i13);
                                            if (cCharAt4 == '.') {
                                                yghVar = new ygh(i12, i14, ygh.e(i15, i11, str4));
                                                break;
                                            }
                                            c2 = (char) (cCharAt4 - '0');
                                            if (c2 >= '\n') {
                                                throw elg.b(i13, "invalid width character", str4);
                                            }
                                            i14 = (i14 * 10) + c2;
                                            if (i14 > 999999) {
                                                throw elg.a("width too large", i5, str4, i11);
                                            }
                                            i13 = i15;
                                        }
                                    }
                                    i12 |= i16;
                                    i5 = i13;
                                    ihhVar = ckgVar2;
                                    str3 = str6;
                                }
                            } else {
                                if (true != z3) {
                                    i12 = 0;
                                } else {
                                    i12 = UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
                                }
                                while (true) {
                                    if (i5 != i11) {
                                        ckgVar2 = ihhVar;
                                        yghVar = new ygh(i12, -1, -1);
                                        str6 = str3;
                                    } else {
                                        i13 = i5 + 1;
                                        cCharAt3 = str4.charAt(i5);
                                        str6 = str3;
                                        if (cCharAt3 >= ' ') {
                                        }
                                        ckgVar2 = ihhVar;
                                        if (cCharAt3 > '9') {
                                            throw elg.b(i5, "invalid flag", str4);
                                        }
                                        i14 = cCharAt3 - '0';
                                        while (true) {
                                            if (i13 == i11) {
                                                yghVar2 = new ygh(i12, i14, -1);
                                                yghVar = yghVar2;
                                                break;
                                            }
                                            i15 = i13 + 1;
                                            cCharAt4 = str4.charAt(i13);
                                            if (cCharAt4 == '.') {
                                                yghVar = new ygh(i12, i14, ygh.e(i15, i11, str4));
                                                break;
                                            }
                                            c2 = (char) (cCharAt4 - '0');
                                            if (c2 >= '\n') {
                                                throw elg.b(i13, "invalid width character", str4);
                                            }
                                            i14 = (i14 * 10) + c2;
                                            if (i14 > 999999) {
                                                throw elg.a("width too large", i5, str4, i11);
                                            }
                                            i13 = i15;
                                        }
                                    }
                                    i12 |= i16;
                                    i5 = i13;
                                    ihhVar = ckgVar2;
                                    str3 = str6;
                                }
                            }
                            xghVarA = xgh.a(cCharAt2);
                            i17 = i11 + 1;
                            if (xghVarA != null) {
                                yghVar.getClass();
                                if (yghVar.b(xghVarA.d(), xghVarA.c().a())) {
                                    throw elg.a("invalid format specifier", iB, str4, i17);
                                }
                                if (i3 < 10) {
                                    Map map2 = blg.d;
                                    if (yghVar.a()) {
                                        h72[] h72VarArr2 = (blg[]) blg.d.get(xghVarA);
                                        drb.n(h72VarArr2, "default parameter");
                                        algVar = h72VarArr2[i3];
                                    }
                                }
                                clgVar = new blg(i3, xghVarA, yghVar);
                                algVar = clgVar;
                            } else {
                                if (cCharAt2 != 't') {
                                }
                                if (yghVar.b(160, false)) {
                                    throw elg.a("invalid format specification", iB, str4, i17);
                                }
                                i18 = i11 + 2;
                                if (i18 <= str4.length()) {
                                    throw elg.b(iB, "truncated format specifier", str4);
                                }
                                zkgVar = (zkg) zkg.a.get(Character.valueOf(str4.charAt(i17)));
                                if (zkgVar != null) {
                                    throw elg.b(i17, "illegal date/time conversion", str4);
                                }
                                algVar = new alg(yghVar, i3, zkgVar);
                                i17 = i18;
                            }
                            i19 = algVar.a;
                            if (i19 < 32) {
                                wt4Var.b |= 1 << i19;
                            }
                            wt4Var.c = Math.max(wt4Var.c, i19);
                            flg.a(wt4Var.d, iB, str4, sb2);
                            objArr3 = (Object[]) wt4Var.f;
                            i20 = algVar.a;
                            if (i20 < objArr3.length) {
                                obj = objArr3[i20];
                                if (obj != null) {
                                    algVar.E(wt4Var, obj);
                                } else {
                                    sb2.append("null");
                                }
                            } else {
                                sb2.append("[ERROR: MISSING LOG ARGUMENT]");
                            }
                            wt4Var.d = i17;
                            iB = flg.b(i17, str4);
                            ihhVar = ckgVar2;
                            level4 = level3;
                            str2 = str5;
                            str3 = str6;
                            i23 = 0;
                        }
                        ckgVar = ihhVar;
                        level2 = level4;
                        String str9 = str2;
                        String str10 = str3;
                        i4 = wt4Var.b;
                        if (((i4 + 1) & i4) == 0) {
                        }
                        throw new elg(String.format("unreferenced arguments [first missing index=%d]", Integer.valueOf(Integer.numberOfTrailingZeros(~i4))));
                    }
                    ckgVar = ihhVar;
                    level2 = level4;
                    i = 3;
                    if (gkgVar == null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z) {
                        qc0.p("cannot get literal argument if a template context exists");
                        return;
                    }
                    objArr = yfhVar.g;
                    if (objArr == null) {
                        qc0.p("cannot get literal argument before calling log()");
                        return;
                    }
                    sb.append(bhh.a(objArr[0]));
                    int i25 = fkg.a;
                    ahhVar = new ahh(sb);
                    ckgVar.a(fhhVar, ahhVar);
                    if (ahhVar.b) {
                        sb.append(" ]");
                    }
                }
                string = sb.toString();
            } else {
                int i26 = fkg.a;
                if (yfhVar.f == null && ihhVar.b() <= set.size() && set.containsAll(ihhVar.c())) {
                    if (!(yfhVar.f == null)) {
                        qc0.p("cannot get literal argument if a template context exists");
                        return;
                    }
                    Object[] objArr4 = yfhVar.g;
                    if (objArr4 == null) {
                        qc0.p("cannot get literal argument before calling log()");
                        return;
                    } else {
                        string = bhh.a(objArr4[0]);
                        level2 = level4;
                        i = 3;
                    }
                } else {
                    sb = new StringBuilder();
                    jghVar = yfhVar.d;
                    if (jghVar != null) {
                        qc0.p("cannot request log site information prior to postProcess()");
                        return;
                    }
                    if (vtb.y(2, jghVar, sb)) {
                        sb.append(" ");
                    }
                    if (z4 || yfhVar.f == null) {
                        gkgVar = yfhVar.f;
                        if (gkgVar != null) {
                            if (gkgVar != null) {
                                z2 = true;
                            } else {
                                z2 = false;
                            }
                            str2 = "cannot get arguments unless a template context exists";
                            if (!z2) {
                                qc0.p("cannot get arguments unless a template context exists");
                                return;
                            }
                            objArr2 = yfhVar.g;
                            str3 = "cannot get arguments before calling log()";
                            if (objArr2 == null) {
                                qc0.p("cannot get arguments before calling log()");
                                return;
                            }
                            wt4Var = new wt4(gkgVar, objArr2, sb);
                            sb2 = (StringBuilder) wt4Var.g;
                            gkg gkgVar4 = (gkg) wt4Var.e;
                            gkgVar4.getClass();
                            dlg dlgVar3 = dlg.b;
                            str4 = gkgVar4.a;
                            iB = flg.b(0, str4);
                            i2 = 0;
                            i = 3;
                            i3 = -1;
                            while (iB >= 0) {
                                i5 = iB + 1;
                                i6 = i23;
                                i7 = i5;
                                while (true) {
                                    if (i7 >= str4.length()) {
                                        throw new elg(elg.c("unterminated parameter", iB, str4, -1));
                                    }
                                    i8 = i7 + 1;
                                    level3 = level4;
                                    cCharAt = str4.charAt(i7);
                                    i9 = i7;
                                    c = (char) (cCharAt - '0');
                                    str5 = str2;
                                    if (c < '\n') {
                                        i22 = (i6 * 10) + c;
                                        if (i22 >= 1000000) {
                                            throw elg.a("index too large", iB, str4, i8);
                                        }
                                        i6 = i22;
                                        i7 = i8;
                                        level4 = level3;
                                        str2 = str5;
                                    }
                                }
                                if (cCharAt != '$') {
                                    i10 = -1;
                                    if (cCharAt != '<') {
                                        i3 = i2;
                                        i2++;
                                    } else {
                                        if (i3 == -1) {
                                            throw elg.a("invalid relative parameter", iB, str4, i8);
                                        }
                                        if (i8 == str4.length()) {
                                            throw new elg(elg.c("unterminated parameter", iB, str4, -1));
                                        }
                                        str4.charAt(i8);
                                        i5 = i8;
                                        i8 = i9 + 2;
                                    }
                                } else {
                                    if (i9 - i5 == 0) {
                                        throw elg.a("missing index", iB, str4, i8);
                                    }
                                    if (str4.charAt(i5) == '0') {
                                        throw elg.a("index has leading zero", iB, str4, i8);
                                    }
                                    i21 = i6 - 1;
                                    if (i8 == str4.length()) {
                                        throw new elg(elg.c("unterminated parameter", iB, str4, -1));
                                    }
                                    str4.charAt(i8);
                                    i5 = i8;
                                    i3 = i21;
                                    i8 = i9 + 2;
                                    i10 = -1;
                                }
                                i11 = i8 + i10;
                                while (true) {
                                    if (i11 >= str4.length()) {
                                        throw new elg(elg.c("unterminated parameter", iB, str4, -1));
                                    }
                                    if (((char) ((str4.charAt(i11) & (-33)) - 65)) < 26) {
                                        break;
                                    }
                                    i11++;
                                    str3 = str3;
                                }
                                cCharAt2 = str4.charAt(i11);
                                if ((cCharAt2 & ' ') == 0) {
                                    z3 = true;
                                } else {
                                    z3 = false;
                                }
                                ygh yghVar5 = ygh.e;
                                if (i5 == i11 || z3) {
                                    if (true != z3) {
                                        i12 = 0;
                                    } else {
                                        i12 = UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
                                    }
                                    while (true) {
                                        if (i5 != i11) {
                                            i13 = i5 + 1;
                                            cCharAt3 = str4.charAt(i5);
                                            str6 = str3;
                                            if (cCharAt3 >= ' ' || cCharAt3 > '0') {
                                                ckgVar2 = ihhVar;
                                                if (cCharAt3 > '9') {
                                                    throw elg.b(i5, "invalid flag", str4);
                                                }
                                                i14 = cCharAt3 - '0';
                                                while (true) {
                                                    if (i13 == i11) {
                                                        yghVar2 = new ygh(i12, i14, -1);
                                                    } else {
                                                        i15 = i13 + 1;
                                                        cCharAt4 = str4.charAt(i13);
                                                        if (cCharAt4 == '.') {
                                                            yghVar = new ygh(i12, i14, ygh.e(i15, i11, str4));
                                                            break;
                                                        }
                                                        c2 = (char) (cCharAt4 - '0');
                                                        if (c2 >= '\n') {
                                                            throw elg.b(i13, "invalid width character", str4);
                                                        }
                                                        i14 = (i14 * 10) + c2;
                                                        if (i14 > 999999) {
                                                            throw elg.a("width too large", i5, str4, i11);
                                                        }
                                                        i13 = i15;
                                                    }
                                                }
                                            } else {
                                                ckgVar2 = ihhVar;
                                                int i27 = ((int) ((ygh.d >>> ((cCharAt3 - ' ') * 3)) & 7)) - 1;
                                                if (i27 >= 0) {
                                                    i16 = 1 << i27;
                                                    if ((i12 & i16) != 0) {
                                                        throw elg.b(i5, "repeated flag", str4);
                                                    }
                                                    i12 |= i16;
                                                    i5 = i13;
                                                    ihhVar = ckgVar2;
                                                    str3 = str6;
                                                } else {
                                                    if (cCharAt3 != '.') {
                                                        throw elg.b(i5, "invalid flag", str4);
                                                    }
                                                    yghVar2 = new ygh(i12, -1, ygh.e(i13, i11, str4));
                                                }
                                            }
                                            yghVar = yghVar2;
                                            break;
                                        } else {
                                            ckgVar2 = ihhVar;
                                            yghVar = new ygh(i12, -1, -1);
                                        }
                                        xghVarA = xgh.a(cCharAt2);
                                        i17 = i11 + 1;
                                        if (xghVarA != null) {
                                            yghVar.getClass();
                                            if (yghVar.b(xghVarA.d(), xghVarA.c().a())) {
                                                throw elg.a("invalid format specifier", iB, str4, i17);
                                            }
                                            if (i3 < 10) {
                                                Map map3 = blg.d;
                                                if (yghVar.a()) {
                                                    h72[] h72VarArr3 = (blg[]) blg.d.get(xghVarA);
                                                    drb.n(h72VarArr3, "default parameter");
                                                    algVar = h72VarArr3[i3];
                                                }
                                            }
                                            clgVar = new blg(i3, xghVarA, yghVar);
                                            algVar = clgVar;
                                        } else if (cCharAt2 != 't' || cCharAt2 == 'T') {
                                            if (yghVar.b(160, false)) {
                                                throw elg.a("invalid format specification", iB, str4, i17);
                                            }
                                            i18 = i11 + 2;
                                            if (i18 <= str4.length()) {
                                                throw elg.b(iB, "truncated format specifier", str4);
                                            }
                                            zkgVar = (zkg) zkg.a.get(Character.valueOf(str4.charAt(i17)));
                                            if (zkgVar != null) {
                                                throw elg.b(i17, "illegal date/time conversion", str4);
                                            }
                                            algVar = new alg(yghVar, i3, zkgVar);
                                            i17 = i18;
                                        } else {
                                            if (cCharAt2 != 'h' && cCharAt2 != 'H') {
                                                throw elg.a("invalid format specification", iB, str4, i17);
                                            }
                                            if (!yghVar.b(160, false)) {
                                                throw elg.a("invalid format specification", iB, str4, i17);
                                            }
                                            clgVar = new clg(yghVar, i3);
                                            algVar = clgVar;
                                        }
                                        i19 = algVar.a;
                                        if (i19 < 32) {
                                            wt4Var.b |= 1 << i19;
                                        }
                                        wt4Var.c = Math.max(wt4Var.c, i19);
                                        flg.a(wt4Var.d, iB, str4, sb2);
                                        objArr3 = (Object[]) wt4Var.f;
                                        i20 = algVar.a;
                                        if (i20 < objArr3.length) {
                                            obj = objArr3[i20];
                                            if (obj != null) {
                                                algVar.E(wt4Var, obj);
                                            } else {
                                                sb2.append("null");
                                            }
                                        } else {
                                            sb2.append("[ERROR: MISSING LOG ARGUMENT]");
                                        }
                                        wt4Var.d = i17;
                                        iB = flg.b(i17, str4);
                                        ihhVar = ckgVar2;
                                        level4 = level3;
                                        str2 = str5;
                                        str3 = str6;
                                        i23 = 0;
                                    }
                                } else {
                                    yghVar = ygh.e;
                                    ckgVar2 = ihhVar;
                                }
                                str6 = str3;
                                xghVarA = xgh.a(cCharAt2);
                                i17 = i11 + 1;
                                if (xghVarA != null) {
                                    yghVar.getClass();
                                    if (yghVar.b(xghVarA.d(), xghVarA.c().a())) {
                                        throw elg.a("invalid format specifier", iB, str4, i17);
                                    }
                                    if (i3 < 10) {
                                        Map map4 = blg.d;
                                        if (yghVar.a()) {
                                            h72[] h72VarArr4 = (blg[]) blg.d.get(xghVarA);
                                            drb.n(h72VarArr4, "default parameter");
                                            algVar = h72VarArr4[i3];
                                        }
                                    }
                                    clgVar = new blg(i3, xghVarA, yghVar);
                                    algVar = clgVar;
                                } else {
                                    if (cCharAt2 != 't') {
                                    }
                                    if (yghVar.b(160, false)) {
                                        throw elg.a("invalid format specification", iB, str4, i17);
                                    }
                                    i18 = i11 + 2;
                                    if (i18 <= str4.length()) {
                                        throw elg.b(iB, "truncated format specifier", str4);
                                    }
                                    zkgVar = (zkg) zkg.a.get(Character.valueOf(str4.charAt(i17)));
                                    if (zkgVar != null) {
                                        throw elg.b(i17, "illegal date/time conversion", str4);
                                    }
                                    algVar = new alg(yghVar, i3, zkgVar);
                                    i17 = i18;
                                }
                                i19 = algVar.a;
                                if (i19 < 32) {
                                    wt4Var.b |= 1 << i19;
                                }
                                wt4Var.c = Math.max(wt4Var.c, i19);
                                flg.a(wt4Var.d, iB, str4, sb2);
                                objArr3 = (Object[]) wt4Var.f;
                                i20 = algVar.a;
                                if (i20 < objArr3.length) {
                                    obj = objArr3[i20];
                                    if (obj != null) {
                                        algVar.E(wt4Var, obj);
                                    } else {
                                        sb2.append("null");
                                    }
                                } else {
                                    sb2.append("[ERROR: MISSING LOG ARGUMENT]");
                                }
                                wt4Var.d = i17;
                                iB = flg.b(i17, str4);
                                ihhVar = ckgVar2;
                                level4 = level3;
                                str2 = str5;
                                str3 = str6;
                                i23 = 0;
                            }
                            ckgVar = ihhVar;
                            level2 = level4;
                            String str11 = str2;
                            String str12 = str3;
                            i4 = wt4Var.b;
                            if (((i4 + 1) & i4) == 0 || (wt4Var.c > 31 && i4 != -1)) {
                                throw new elg(String.format("unreferenced arguments [first missing index=%d]", Integer.valueOf(Integer.numberOfTrailingZeros(~i4))));
                            }
                            flg.a(wt4Var.d, str4.length(), str4, sb2);
                            if (!(yfhVar.f != null)) {
                                qc0.p(str11);
                                return;
                            }
                            Object[] objArr5 = yfhVar.g;
                            if (objArr5 == null) {
                                qc0.p(str12);
                                return;
                            } else if (objArr5.length > wt4Var.c + 1) {
                                sb2.append(" [ERROR: UNUSED LOG ARGUMENTS]");
                            }
                        } else {
                            ckgVar = ihhVar;
                            level2 = level4;
                            i = 3;
                            if (gkgVar == null) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (!z) {
                                qc0.p("cannot get literal argument if a template context exists");
                                return;
                            }
                            objArr = yfhVar.g;
                            if (objArr == null) {
                                qc0.p("cannot get literal argument before calling log()");
                                return;
                            }
                            sb.append(bhh.a(objArr[0]));
                        }
                        int i28 = fkg.a;
                        ahhVar = new ahh(sb);
                        ckgVar.a(fhhVar, ahhVar);
                        if (ahhVar.b) {
                            sb.append(" ]");
                        }
                    } else {
                        sb.append("(REDACTED) ");
                        sb.append(yfhVar.f.a);
                        level2 = level4;
                        i = 3;
                    }
                    string = sb.toString();
                }
            }
            Throwable th = (Throwable) yfhVar.d().r(bgh.a);
            int iP = arb.p(level2);
            if (iP == 2) {
                Log.v(str, string, th);
                return;
            }
            if (iP == i) {
                Log.d(str, string, th);
                return;
            }
            if (iP == 4) {
                Log.i(str, string, th);
            } else if (iP != 5) {
                b1.e(str, string, th);
            } else {
                b1.n(str, string, th);
            }
        }
    }

    @Override // defpackage.m4
    public final boolean x0(Level level) {
        int iP = arb.p(level);
        return Log.isLoggable(this.c, iP) || Log.isLoggable("all", iP);
    }

    @Override // defpackage.m4
    public final void y0(yfh yfhVar) {
        B0(yfhVar, this.c, this.d, this.e, this.f);
    }
}
