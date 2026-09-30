package defpackage;

import android.content.Context;
import androidx.compose.ui.node.LayoutNode;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class z8c implements qvf {
    public static gx6 a;

    public static final void a(j09 j09Var, dd2 dd2Var, l46 l46Var, int i) {
        l46Var.h0(-1854833411);
        int i2 = 2;
        int i3 = (l46Var.g(j09Var) ? 4 : 2) | i;
        if (l46Var.W(i3 & 1, (i3 & 19) != 18)) {
            Object objR = l46Var.R();
            if (objR == sf2.a) {
                objR = mr.j;
                l46Var.p0(objR);
            }
            xn8 xn8Var = (xn8) objR;
            int iHashCode = Long.hashCode(l46Var.T);
            u8a u8aVarM = l46Var.m();
            j09 j09VarJ = m93.J(l46Var, j09Var);
            lf2.q.getClass();
            l46Var.j0();
            if (l46Var.S) {
                l46Var.l(LayoutNode.h1);
            } else {
                l46Var.s0();
            }
            dec.l(hj6.z, l46Var, xn8Var);
            dec.l(hj6.y, l46Var, u8aVarM);
            dec.l(hj6.X, l46Var, Integer.valueOf(iHashCode));
            dec.k(l46Var);
            dec.l(hj6.x, l46Var, j09VarJ);
            tec.q(6, dd2Var, l46Var, true);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new eu8(j09Var, dd2Var, i, i2);
        }
    }

    public static final void b(final int i, final int i2, final fy9 fy9Var, final j09 j09Var, final Integer num, float f, boolean z, final Float f2, l46 l46Var, final int i3, final int i4) {
        int i5;
        boolean z2;
        final float f3;
        final boolean z3;
        boolean z4;
        float f4;
        boolean z5;
        boolean z6;
        float fB;
        float fFloatValue;
        j09Var.getClass();
        l46Var.h0(1899944666);
        if ((i3 & 6) == 0) {
            i5 = (l46Var.e(i) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= l46Var.e(i2) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i5 |= (i3 & 512) == 0 ? l46Var.g(fy9Var) : l46Var.i(fy9Var) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        if ((i3 & 3072) == 0) {
            i5 |= l46Var.g(j09Var) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE;
        }
        if ((i3 & 24576) == 0) {
            i5 |= l46Var.g(num) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE;
        }
        int i6 = i5 | 196608;
        if ((1572864 & i3) == 0) {
            if ((i4 & 64) == 0) {
                z2 = z;
                int i7 = l46Var.h(z2) ? 1048576 : 524288;
                i6 |= i7;
            } else {
                z2 = z;
            }
            i6 |= i7;
        } else {
            z2 = z;
        }
        if ((12582912 & i3) == 0) {
            i6 |= l46Var.g(f2) ? 8388608 : 4194304;
        }
        if (l46Var.W(i6 & 1, (4793491 & i6) != 4793490)) {
            l46Var.b0();
            if ((i3 & 1) == 0 || l46Var.C()) {
                if ((i4 & 64) != 0) {
                    z2 = i == i2 + (-1);
                    i6 &= -3670017;
                }
                z4 = z2;
                f4 = 4.0f;
            } else {
                l46Var.Z();
                if ((i4 & 64) != 0) {
                    i6 &= -3670017;
                }
                f4 = f;
                z4 = z2;
            }
            l46Var.s();
            y6c y6cVarB = a7c.b(f4);
            pr4 pr4Var = l8b.a;
            boolean zF = k8b.f((e8b) l46Var.k(pr4Var));
            long jB = y72.b(y72.b, zF ? 0.05f : 0.12f);
            float f5 = i == 0 ? 3.0f : 0.0f;
            j09 j09VarD = yi4.a(f5, 0.0f) <= 0 ? j09Var : j09Var.D(new p4d(f5, y6cVarB, false, jB, jB));
            j09 j09VarW = g09.a;
            if (z4) {
                l46Var.f0(485744890);
                j09VarW = db6.w(j09VarW, 0.5f, y72.b(((e8b) l46Var.k(pr4Var)).q, 0.08f), y6cVarB);
                z5 = false;
                l46Var.r(false);
            } else {
                z5 = false;
                l46Var.f0(485747266);
                l46Var.r(false);
            }
            j09 j09VarD2 = j09VarD.D(j09VarW);
            if (num != null) {
                l46Var.f0(485749112);
                boolean z7 = l46Var.k(snd.b) != null ? true : z5;
                l46Var.r(z5);
                z6 = z7;
            } else {
                l46Var.f0(-2121645475);
                l46Var.r(z5);
                z6 = false;
            }
            if (z6 || z4 || i == 0 || i == i2 - 1 || i % 4 == 0) {
                l46Var.f0(-2121537311);
                dt1.a(j09VarD2, null, false, null, f4, null, fy9Var, num, l46Var, ((i6 >> 3) & 57344) | 2097152 | ((i6 << 12) & 3670016) | ((i6 << 9) & 29360128), 46);
                l46Var.r(false);
            } else {
                l46Var.f0(-2121359650);
                if (((Boolean) l46Var.k(h57.a)).booleanValue()) {
                    l46Var.f0(-2121313088);
                    l46Var.r(false);
                    fB = 0.5714286f;
                } else {
                    l46Var.f0(-2121267301);
                    fB = snd.b(null, l46Var, 1);
                    l46Var.r(false);
                }
                j09 j09VarW2 = dj6.w(j09VarD2, fB);
                long j = y72.e;
                if (f2 != null) {
                    fFloatValue = f2.floatValue();
                } else {
                    fFloatValue = zF ? 0.06f : 0.1f;
                }
                s21.a(tm7.o(j09VarW2, y72.b(j, fFloatValue), y6cVarB), l46Var, 0);
                l46Var.r(false);
            }
            f3 = f4;
            z3 = z4;
        } else {
            l46Var.Z();
            f3 = f;
            z3 = z2;
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new l26() { // from class: ble
                @Override // defpackage.l26
                public final Object z(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    z8c.b(i, i2, fy9Var, j09Var, num, f3, z3, f2, (l46) obj, k99.P(i3 | 1), i4);
                    return wef.a;
                }
            };
        }
    }

    public static final vuc c(tvc tvcVar, f21 f21Var) {
        boolean z = tvcVar.i() == c03.a;
        return new vuc(d(tvcVar.k(), z, true, tvcVar.l(), f21Var), d(tvcVar.h(), z, false, tvcVar.g(), f21Var), z);
    }

    public static final uuc d(guc gucVar, boolean z, boolean z2, int i, f21 f21Var) {
        long j;
        int i2 = z2 ? gucVar.c : gucVar.d;
        if (i != gucVar.b) {
            return gucVar.a(i2);
        }
        long j2 = f21Var.j(gucVar, i2);
        if (z ^ z2) {
            int i3 = eue.c;
            j = j2 >> 32;
        } else {
            int i4 = eue.c;
            j = 4294967295L & j2;
        }
        return gucVar.a((int) j);
    }

    public static long e(boolean z, int i, us0 us0Var, long j, long j2, int i2, boolean z2, long j3, long j4, long j5, long j6) {
        us0Var.getClass();
        if (j6 != Long.MAX_VALUE && z2) {
            if (i2 != 0) {
                long j7 = j2 + 900000;
                if (j6 < j7) {
                    return j7;
                }
            }
            return j6;
        }
        if (z) {
            long jScalb = us0Var == us0.b ? j * ((long) i) : (long) Math.scalb(j, i - 1);
            if (jScalb > 18000000) {
                jScalb = 18000000;
            }
            return j2 + jScalb;
        }
        if (z2) {
            long j8 = i2 == 0 ? j2 + j3 : j2 + j5;
            return (j4 == j5 || i2 != 0) ? j8 : (j5 - j4) + j8;
        }
        if (j2 == -1) {
            return Long.MAX_VALUE;
        }
        return j2 + j3;
    }

    public static final uuc f(uuc uucVar, guc gucVar, int i) {
        return new uuc(gucVar.f.a(i), i, uucVar.c);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x003d A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:21:0x003e A[RETURN] */
    public static final int g(x8c x8cVar, String str) {
        x8cVar.getClass();
        int columnCount = x8cVar.getColumnCount();
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i2 >= columnCount) {
                i2 = -1;
                break;
            }
            if (str.equals(x8cVar.getColumnName(i2))) {
                break;
            }
            i2++;
        }
        if (i2 >= 0) {
            return i2;
        }
        String strG = ks0.g('`', "`", str);
        int columnCount2 = x8cVar.getColumnCount();
        while (i < columnCount2) {
            if (strG.equals(x8cVar.getColumnName(i))) {
                if (i >= 0) {
                    return i;
                }
                return -1;
            }
            i++;
        }
        i = -1;
        if (i >= 0) {
            return i;
        }
        return -1;
    }

    /* JADX WARN: Code duplicated, block: B:4:0x0004  */
    public static final vuc h(vuc vucVar, tvc tvcVar) {
        boolean z;
        boolean z2 = false;
        int i = 1;
        if (vucVar == null) {
            z = true;
        } else {
            uuc uucVar = vucVar.a;
            long j = uucVar.c;
            uuc uucVar2 = vucVar.b;
            if (j != uucVar2.c) {
                boolean z3 = vucVar.c;
                if ((z3 ? uucVar : uucVar2).b == 0) {
                    if (z3) {
                        uucVar = uucVar2;
                    }
                    if (tvcVar.f().f.a.a.b.length() == uucVar.b) {
                        imb imbVar = new imb();
                        imbVar.element = true;
                        tvcVar.j(new wq6(imbVar, i));
                        z = imbVar.element;
                    }
                }
            } else if (uucVar.b == uucVar2.b) {
                z = true;
            }
            z = false;
        }
        if (!z) {
            return vucVar;
        }
        String str = tvcVar.c().f.a.a.b;
        if (tvcVar.a() > 1 || tvcVar.e() == null || str.length() == 0) {
            return vucVar;
        }
        guc gucVarC = tvcVar.c();
        String str2 = gucVarC.f.a.a.b;
        int i2 = gucVarC.c;
        int length = str2.length();
        if (i2 == 0) {
            int iD = dec.d(0, str2);
            return tvcVar.b() ? vuc.a(vucVar, f(vucVar.a, gucVarC, iD), null, true, 2) : vuc.a(vucVar, null, f(vucVar.b, gucVarC, iD), false, 1);
        }
        if (i2 == length) {
            int iE = dec.e(length, str2);
            return tvcVar.b() ? vuc.a(vucVar, f(vucVar.a, gucVarC, iE), null, false, 2) : vuc.a(vucVar, null, f(vucVar.b, gucVarC, iE), true, 1);
        }
        vuc vucVarE = tvcVar.e();
        if (vucVarE != null && vucVarE.c) {
            z2 = true;
        }
        int iE2 = tvcVar.b() ^ z2 ? dec.e(i2, str2) : dec.d(i2, str2);
        return tvcVar.b() ? vuc.a(vucVar, f(vucVar.a, gucVarC, iE2), null, z2, 2) : vuc.a(vucVar, null, f(vucVar.b, gucVarC, iE2), z2, 1);
    }

    public static final gx6 i() {
        gx6 gx6Var = a;
        if (gx6Var != null) {
            return gx6Var;
        }
        fx6 fx6Var = new fx6("Filled.Star", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i = msf.a;
        dtd dtdVar = new dtd(y72.b);
        s71 s71Var = new s71(1);
        s71Var.p(12.0f, 17.27f);
        s71Var.n(18.18f, 21.0f);
        s71Var.o(-1.64f, -7.03f);
        s71Var.n(22.0f, 9.24f);
        s71Var.o(-7.19f, -0.61f);
        s71Var.n(12.0f, 2.0f);
        s71Var.n(9.19f, 8.63f);
        s71Var.n(2.0f, 9.24f);
        s71Var.o(5.46f, 4.73f);
        s71Var.n(5.82f, 21.0f);
        s71Var.h();
        fx6.a(fx6Var, s71Var.b, dtdVar, 1.0f, 1.0f, 2, 1.0f);
        gx6 gx6VarB = fx6Var.b();
        a = gx6VarB;
        return gx6VarB;
    }

    public static final e89 j(boolean z, l46 l46Var, int i, int i2) {
        l46Var.f0(-1427638150);
        float f = (i2 & 4) != 0 ? 0.18f : 0.15f;
        boolean zBooleanValue = ((Boolean) l46Var.k(h57.a)).booleanValue();
        Context context = (Context) l46Var.k(uq.b);
        Object objR = l46Var.R();
        fxe fxeVar = fxe.c;
        i8c i8cVar = sf2.a;
        if (objR == i8cVar) {
            objR = q1c.f(fxeVar);
            l46Var.p0(objR);
        }
        e89 e89Var = (e89) objR;
        if (zBooleanValue || !z) {
            e89Var.setValue(fxeVar);
        } else {
            Float fValueOf = Float.valueOf(0.4f);
            Float fValueOf2 = Float.valueOf(f);
            boolean zD = l46Var.d(0.4f) | l46Var.i(context) | ((((i & 896) ^ 384) > 256 && l46Var.d(f)) || (i & 384) == 256);
            Object objR2 = l46Var.R();
            if (zD || objR2 == i8cVar) {
                objR2 = new er(context, e89Var, f, 7);
                l46Var.p0(objR2);
            }
            af1.i(context, fValueOf, fValueOf2, (a26) objR2, l46Var);
        }
        l46Var.r(false);
        return e89Var;
    }

    public static final aaf k(String str) {
        int i;
        tq.o(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i2 = 0;
        char cCharAt = str.charAt(0);
        if (cCharAt < '0') {
            i = 1;
            if (length == 1 || cCharAt != '+') {
                return null;
            }
        } else {
            i = 0;
        }
        int iDivideUnsigned = 119304647;
        while (i < length) {
            int iDigit = Character.digit((int) str.charAt(i), 10);
            if (iDigit < 0) {
                return null;
            }
            if (Integer.compareUnsigned(i2, iDivideUnsigned) > 0) {
                if (iDivideUnsigned != 119304647) {
                    return null;
                }
                iDivideUnsigned = Integer.divideUnsigned(-1, 10);
                if (Integer.compareUnsigned(i2, iDivideUnsigned) > 0) {
                    return null;
                }
            }
            int i3 = i2 * 10;
            int i4 = iDigit + i3;
            if (Integer.compareUnsigned(i4, i3) < 0) {
                return null;
            }
            i++;
            i2 = i4;
        }
        return new aaf(i2);
    }

    public static final faf l(String str) {
        str.getClass();
        tq.o(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i = 0;
        char cCharAt = str.charAt(0);
        if (cCharAt < '0') {
            i = 1;
            if (length == 1 || cCharAt != '+') {
                return null;
            }
        }
        long j = 0;
        long jDivideUnsigned = 512409557603043100L;
        while (i < length) {
            int iDigit = Character.digit((int) str.charAt(i), 10);
            if (iDigit < 0) {
                return null;
            }
            if (Long.compareUnsigned(j, jDivideUnsigned) > 0) {
                if (jDivideUnsigned != 512409557603043100L) {
                    return null;
                }
                jDivideUnsigned = Long.divideUnsigned(-1L, 10L);
                if (Long.compareUnsigned(j, jDivideUnsigned) > 0) {
                    return null;
                }
            }
            long j2 = j * 10;
            long j3 = (((long) iDigit) & 4294967295L) + j2;
            if (Long.compareUnsigned(j3, j2) < 0) {
                return null;
            }
            i++;
            j = j3;
        }
        return new faf(j);
    }

    public static final uuc m(final tvc tvcVar, final guc gucVar, uuc uucVar) {
        final int i = tvcVar.b() ? gucVar.c : gucVar.d;
        int iL = tvcVar.b() ? tvcVar.l() : tvcVar.g();
        int i2 = gucVar.b;
        ste steVar = gucVar.f;
        int i3 = gucVar.e;
        if (iL != i2) {
            return gucVar.a(i);
        }
        uj ujVar = new uj(gucVar, i, 3);
        z18 z18Var = z18.c;
        final lw7 lw7VarN = eb3.N(z18Var, ujVar);
        final int i4 = tvcVar.b() ? gucVar.d : gucVar.c;
        lw7 lw7VarN2 = eb3.N(z18Var, new x16() { // from class: xuc
            @Override // defpackage.x16
            public final Object invoke() {
                int iIntValue = ((Number) lw7VarN.getValue()).intValue();
                tvc tvcVar2 = tvcVar;
                boolean zB = tvcVar2.b();
                boolean z = tvcVar2.i() == c03.a;
                guc gucVar2 = gucVar;
                ste steVar2 = gucVar2.f;
                int i5 = i;
                long jM = steVar2.m(i5);
                ste steVar3 = gucVar2.f;
                b59 b59Var = steVar3.b;
                int i6 = eue.c;
                int iJ = (int) (jM >> 32);
                int i7 = b59Var.f;
                if (b59Var.d(iJ) != iIntValue) {
                    iJ = iIntValue >= i7 ? steVar3.j(i7 - 1) : steVar3.j(iIntValue);
                }
                int iC = (int) (jM & 4294967295L);
                if (b59Var.d(iC) != iIntValue) {
                    iC = iIntValue >= i7 ? b59Var.c(i7 - 1, false) : b59Var.c(iIntValue, false);
                }
                int i8 = i4;
                if (iJ == i8) {
                    return gucVar2.a(iC);
                }
                if (iC == i8) {
                    return gucVar2.a(iJ);
                }
                if (!(zB ^ z) ? i5 >= iJ : i5 > iC) {
                    iJ = iC;
                }
                return gucVar2.a(iJ);
            }
        });
        if (gucVar.a != uucVar.c) {
            return (uuc) lw7VarN2.getValue();
        }
        if (i == i3) {
            return uucVar;
        }
        if (((Number) lw7VarN.getValue()).intValue() != steVar.b.d(i3)) {
            return (uuc) lw7VarN2.getValue();
        }
        int i5 = uucVar.b;
        long jM = steVar.m(i5);
        boolean zB = tvcVar.b();
        if (i3 != -1) {
            if (i != i3) {
                if (!(zB ^ (gucVar.b() == c03.a))) {
                }
            }
            return gucVar.a(i);
        }
        int i6 = eue.c;
        return (i5 == ((int) (jM >> 32)) || i5 == ((int) (jM & 4294967295L))) ? (uuc) lw7VarN2.getValue() : gucVar.a(i);
    }

    public static int n(int i) {
        return (i >>> 1) ^ (-(i & 1));
    }
}
