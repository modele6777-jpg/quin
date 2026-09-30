package defpackage;

import android.text.Spanned;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.text.BreakIterator;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class dec {
    public static final long a(float f, float f2) {
        return (((long) Float.floatToRawIntBits(f2)) & 4294967295L) | (Float.floatToRawIntBits(f) << 32);
    }

    public static final void b(final String str, final a26 a26Var, l46 l46Var, final int i) {
        ojb ojbVarV;
        l26 l26Var;
        l46Var.h0(1241646940);
        int i2 = i | 48;
        if ((i & 384) == 0) {
            i2 |= l46Var.i(a26Var) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        int i3 = i2 | 3072;
        final int i4 = 0;
        final int i5 = 1;
        if (l46Var.W(i3 & 1, (i3 & 1171) != 1170)) {
            if (((Boolean) l46Var.k(h57.a)).booleanValue()) {
                ojbVarV = l46Var.v();
                if (ojbVarV == null) {
                    return;
                } else {
                    l26Var = new l26() { // from class: e1f
                        @Override // defpackage.l26
                        public final Object z(Object obj, Object obj2) {
                            int i6 = i4;
                            wef wefVar = wef.a;
                            int i7 = i;
                            a26 a26Var2 = a26Var;
                            String str2 = str;
                            l46 l46Var2 = (l46) obj;
                            ((Integer) obj2).getClass();
                            switch (i6) {
                                case 0:
                                    dec.b(str2, a26Var2, l46Var2, k99.P(i7 | 1));
                                    break;
                                default:
                                    dec.b(str2, a26Var2, l46Var2, k99.P(i7 | 1));
                                    break;
                            }
                            return wefVar;
                        }
                    };
                }
            } else {
                x48 x48Var = (x48) l46Var.k(cb8.a);
                e89 e89VarI = q1c.i(str, l46Var);
                e89 e89VarI2 = q1c.i(null, l46Var);
                e89 e89VarI3 = q1c.i(a26Var, l46Var);
                e89 e89VarI4 = q1c.i(null, l46Var);
                boolean zG = l46Var.g(e89VarI) | l46Var.i(x48Var) | l46Var.g(e89VarI3) | l46Var.g(e89VarI2) | l46Var.g(e89VarI4);
                Object objR = l46Var.R();
                if (zG || objR == sf2.a) {
                    Object kfVar = new kf(e89VarI, x48Var, e89VarI3, e89VarI2, e89VarI4);
                    l46Var.p0(kfVar);
                    objR = kfVar;
                }
                af1.g(x48Var, (a26) objR, l46Var);
            }
            ojbVarV.d = l26Var;
        }
        l46Var.Z();
        ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            l26Var = new l26() { // from class: e1f
                @Override // defpackage.l26
                public final Object z(Object obj, Object obj2) {
                    int i6 = i5;
                    wef wefVar = wef.a;
                    int i7 = i;
                    a26 a26Var2 = a26Var;
                    String str2 = str;
                    l46 l46Var2 = (l46) obj;
                    ((Integer) obj2).getClass();
                    switch (i6) {
                        case 0:
                            dec.b(str2, a26Var2, l46Var2, k99.P(i7 | 1));
                            break;
                        default:
                            dec.b(str2, a26Var2, l46Var2, k99.P(i7 | 1));
                            break;
                    }
                    return wefVar;
                }
            };
            ojbVarV.d = l26Var;
        }
    }

    public static final void c(int i, a26 a26Var, l46 l46Var, j09 j09Var, boolean z) {
        int i2;
        int i3;
        boolean z2;
        boolean z3;
        l46Var.h0(1843357976);
        if ((i & 6) == 0) {
            i2 = (l46Var.g(j09Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i4 = i2 | 48;
        if ((i & 384) == 0) {
            i4 = i2 | 176;
        }
        int i5 = i4 | 3072;
        if ((i & 24576) == 0) {
            i5 |= l46Var.i(a26Var) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE;
        }
        if ((i5 & 9363) == 9362 && l46Var.F()) {
            l46Var.Z();
            z3 = z;
        } else {
            l46Var.b0();
            if ((i & 1) == 0 || l46Var.C()) {
                i3 = i5 & (-897);
                z2 = true;
            } else {
                l46Var.Z();
                i3 = i5 & (-897);
                z2 = z;
            }
            l46Var.s();
            Object objR = l46Var.R();
            Object obj = sf2.a;
            if (objR == obj) {
                Object ah2Var = new ah2(af1.E(l46Var));
                l46Var.p0(ah2Var);
                objR = ah2Var;
            }
            aw2 aw2Var = ((ah2) objR).a;
            Object objR2 = l46Var.R();
            Object obj2 = objR2;
            if (objR2 == obj) {
                fxf fxfVar = new fxf(aw2Var);
                fxfVar.d = -1;
                fxfVar.e = -1;
                l46Var.p0(fxfVar);
                obj2 = fxfVar;
            }
            Object obj3 = (fxf) obj2;
            Object objR3 = l46Var.R();
            if (objR3 == obj) {
                objR3 = new ksf(13);
                l46Var.p0(objR3);
            }
            a26 a26Var2 = (a26) objR3;
            Object objR4 = l46Var.R();
            if (objR4 == obj) {
                objR4 = new ksf(14);
                l46Var.p0(objR4);
            }
            a26 a26Var3 = (a26) objR4;
            boolean zI = ((57344 & i3) == 16384) | l46Var.i(obj3) | l46Var.f(0L) | ((i3 & 112) == 32) | ((i3 & 7168) == 2048);
            Object objR5 = l46Var.R();
            if (zI || objR5 == obj) {
                objR5 = new so2(obj3, a26Var, z2, 12);
                l46Var.p0(objR5);
            }
            xo1.b(a26Var2, j09Var, a26Var3, null, (a26) objR5, l46Var, ((i3 << 3) & 112) | 390, 8);
            z3 = z2;
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new qm4(j09Var, z3, a26Var, i, 2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:18:0x004c  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v0, types: [java.lang.Object, java.lang.String] */
    /* JADX WARN: Type inference failed for: r12v1, types: [java.text.BreakIterator] */
    /* JADX WARN: Type inference failed for: r4v3, types: [java.lang.Object, ta0] */
    /* JADX WARN: Type inference failed for: r5v0 */
    /* JADX WARN: Type inference failed for: r5v1, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r5v10 */
    /* JADX WARN: Type inference failed for: r5v11 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.CharSequence] */
    /* JADX WARN: Type inference failed for: r5v8 */
    /* JADX WARN: Type inference failed for: r5v9 */
    public static final int d(int i, String str) {
        ?? r5;
        ?? r6;
        int spanEnd;
        jt4 jt4VarG = g();
        Integer num = null;
        if (jt4VarG != null) {
            ok8.o("Not initialized yet", jt4VarG.c() == 1);
            ok8.n(str, "charSequence cannot be null");
            ?? r4 = (ta0) jt4VarG.e.b;
            r4.getClass();
            if (i < 0 || i >= str.length()) {
                r6 = str;
                spanEnd = -1;
            } else if (str instanceof Spanned) {
                Spanned spanned = (Spanned) str;
                h9f[] h9fVarArr = (h9f[]) spanned.getSpans(i, i + 1, h9f.class);
                if (h9fVarArr.length > 0) {
                    spanEnd = spanned.getSpanEnd(h9fVarArr[0]);
                    r6 = str;
                } else {
                    ?? r7 = str;
                    spanEnd = ((vt4) r4.K(r7, Math.max(0, i - 16), Math.min(str.length(), i + 16), Integer.MAX_VALUE, true, new vt4(i))).c;
                    r6 = r7;
                }
            } else {
                ?? r8 = str;
                spanEnd = ((vt4) r4.K(r8, Math.max(0, i - 16), Math.min(str.length(), i + 16), Integer.MAX_VALUE, true, new vt4(i))).c;
                r6 = r8;
            }
            Integer numValueOf = Integer.valueOf(spanEnd);
            r5 = r6;
            if (spanEnd != -1) {
                num = numValueOf;
            }
        } else {
            r5 = str;
        }
        if (num != null) {
            r5 = r6;
            return num.intValue();
        }
        r5 = r6;
        ?? characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(r5);
        return characterInstance.following(i);
    }

    public static final int e(int i, String str) {
        jt4 jt4VarG = g();
        Integer num = null;
        if (jt4VarG != null) {
            Integer numValueOf = Integer.valueOf(jt4VarG.b(str, Math.max(0, i - 1)));
            if (numValueOf.intValue() != -1) {
                num = numValueOf;
            }
        }
        if (num != null) {
            return num.intValue();
        }
        BreakIterator characterInstance = BreakIterator.getCharacterInstance();
        characterInstance.setText(str);
        return characterInstance.preceding(i);
    }

    public static final long f(long j) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j >> 32)) / 2.0f;
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j & 4294967295L)) / 2.0f)) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }

    public static final jt4 g() {
        if (!jt4.d()) {
            return null;
        }
        jt4 jt4VarA = jt4.a();
        if (jt4VarA.c() == 1) {
            return jt4VarA;
        }
        return null;
    }

    public static final void h(l46 l46Var, Integer num) {
        he2 he2Var = hj6.X;
        if (l46Var.S) {
            l46Var.b(he2Var, num);
        }
    }

    public static dyc i(l26 l26Var) {
        dyc dycVar = new dyc();
        dycVar.d = k99.x(dycVar, dycVar, l26Var);
        return dycVar;
    }

    public static void j(zse zseVar, o74 o74Var, ste steVar, bv7 bv7Var, jte jteVar, boolean z, sl9 sl9Var) {
        hkb hkbVarB;
        if (z) {
            int iV = sl9Var.v(eue.f(zseVar.b));
            String str = dpe.a;
            if (iV < steVar.a.a.b.length()) {
                hkbVarB = steVar.b(iV);
            } else {
                hkbVarB = iV != 0 ? steVar.b(iV - 1) : new hkb(0.0f, 0.0f, 1.0f, (int) (dpe.a((mue) o74Var.c, (sw3) o74Var.d, (xp5) o74Var.e) & 4294967295L));
            }
            float f = hkbVarB.b;
            float f2 = hkbVarB.a;
            long jN = bv7Var.N((((long) Float.floatToRawIntBits(f2)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L));
            hkb hkbVarG = z5c.g((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (jN & 4294967295L)))) & 4294967295L) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (jN >> 32)))) << 32), (((long) Float.floatToRawIntBits(hkbVarB.c - f2)) << 32) | (((long) Float.floatToRawIntBits(hkbVarB.d - f)) & 4294967295L));
            if (pa7.t((jte) jteVar.a.b.get(), jteVar)) {
                jteVar.b.g(hkbVarG);
            }
        }
    }

    public static final void k(l46 l46Var) {
        l46Var.b(new cwe(4), wef.a);
    }

    public static final void l(l26 l26Var, l46 l46Var, Object obj) {
        if (l46Var.S || !pa7.t(l46Var.R(), obj)) {
            l46Var.p0(obj);
            l46Var.b(l26Var, obj);
        }
    }

    public static final long m(long j, long j2) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32)) * Float.intBitsToFloat((int) (j >> 32));
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j2 & 4294967295L)) * Float.intBitsToFloat((int) (j & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }

    public static final String n(char c) {
        String strValueOf = String.valueOf(c);
        strValueOf.getClass();
        Locale locale = Locale.ROOT;
        String upperCase = strValueOf.toUpperCase(locale);
        upperCase.getClass();
        if (upperCase.length() <= 1) {
            return String.valueOf(Character.toTitleCase(c));
        }
        if (c == 329) {
            return upperCase;
        }
        char cCharAt = upperCase.charAt(0);
        String lowerCase = upperCase.substring(1).toLowerCase(locale);
        lowerCase.getClass();
        return cCharAt + lowerCase;
    }

    public static /* synthetic */ boolean o(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, bbh bbhVar, Object obj, Object obj2) {
        while (!atomicReferenceFieldUpdater.compareAndSet(bbhVar, obj, obj2)) {
            if (atomicReferenceFieldUpdater.get(bbhVar) != obj && atomicReferenceFieldUpdater.get(bbhVar) != obj) {
                return false;
            }
        }
        return true;
    }
}
