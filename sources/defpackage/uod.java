package defpackage;

import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.b;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class uod {
    public static final uod a = new uod();
    public static final float b;
    public static final float c;
    public static final zt d;

    static {
        float f = ok8.s;
        b = f;
        c = f;
        d = cu.a();
    }

    public static pod d(l46 l46Var) {
        m82 m82Var = (m82) l46Var.k(o82.a);
        pod podVar = m82Var.k0;
        if (podVar != null) {
            return podVar;
        }
        long jC = o82.c(m82Var, ok8.m);
        n82 n82Var = ok8.f;
        long jC2 = o82.c(m82Var, n82Var);
        n82 n82Var2 = ok8.q;
        long jC3 = o82.c(m82Var, n82Var2);
        long jC4 = o82.c(m82Var, n82Var2);
        long jC5 = o82.c(m82Var, n82Var);
        long jR = abg.r(y72.b(o82.c(m82Var, ok8.i), ok8.j), m82Var.p);
        n82 n82Var3 = ok8.g;
        long jC6 = o82.c(m82Var, n82Var3);
        float f = ok8.h;
        long jB = y72.b(jC6, f);
        n82 n82Var4 = ok8.k;
        long jC7 = o82.c(m82Var, n82Var4);
        float f2 = ok8.l;
        pod podVar2 = new pod(jC, jC2, jC3, jC4, jC5, jR, jB, y72.b(jC7, f2), y72.b(o82.c(m82Var, n82Var4), f2), y72.b(o82.c(m82Var, n82Var3), f));
        m82Var.k0 = podVar2;
        return podVar2;
    }

    public static void e(sn4 sn4Var, ks9 ks9Var, long j, long j2, long j3, float f, float f2) {
        v6c v6cVarB;
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(f)) << 32) | (((long) Float.floatToRawIntBits(f)) & 4294967295L);
        long jFloatToRawIntBits2 = (((long) Float.floatToRawIntBits(f2)) << 32) | (((long) Float.floatToRawIntBits(f2)) & 4294967295L);
        if (ks9Var == ks9.a) {
            float fIntBitsToFloat = Float.intBitsToFloat((int) (j2 >> 32));
            v6cVarB = w6c.b(z5c.g(j, (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j2 & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32)), jFloatToRawIntBits, jFloatToRawIntBits, jFloatToRawIntBits2, jFloatToRawIntBits2);
        } else {
            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j2 >> 32));
            v6cVarB = w6c.b(z5c.g(j, (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j2 & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat2) << 32)), jFloatToRawIntBits, jFloatToRawIntBits2, jFloatToRawIntBits2, jFloatToRawIntBits);
        }
        zt ztVar = d;
        zt.c(ztVar, v6cVarB);
        sn4.R(sn4Var, ztVar, j3, null, 60);
        ztVar.l();
    }

    public final void a(t69 t69Var, j09 j09Var, pod podVar, boolean z, long j, l46 l46Var, int i) {
        j09 j09Var2;
        long j2;
        j09 j09Var3;
        long jFloatToRawIntBits;
        l46Var.h0(-290277409);
        int i2 = i | (l46Var.g(t69Var) ? 4 : 2) | 48 | (l46Var.g(podVar) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) | (l46Var.h(z) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE) | 24576;
        if (l46Var.W(i2 & 1, (74899 & i2) != 74898)) {
            l46Var.b0();
            if ((i & 1) == 0 || l46Var.C()) {
                j2 = epd.c;
                j09Var3 = g09.a;
            } else {
                l46Var.Z();
                j09Var3 = j09Var;
                j2 = j;
            }
            l46Var.s();
            Object objR = l46Var.R();
            i8c i8cVar = sf2.a;
            if (objR == i8cVar) {
                objR = new jsd();
                l46Var.p0(objR);
            }
            jsd jsdVar = (jsd) objR;
            boolean z2 = (i2 & 14) == 4;
            Object objR2 = l46Var.R();
            if (z2 || objR2 == i8cVar) {
                objR2 = new tod(t69Var, jsdVar, null);
                l46Var.p0(objR2);
            }
            af1.o((l26) objR2, l46Var, t69Var);
            if (jsdVar.isEmpty()) {
                jFloatToRawIntBits = j2;
            } else {
                jFloatToRawIntBits = (((long) Float.floatToRawIntBits(bj4.b(j2) / 2.0f)) << 32) | (((long) Float.floatToRawIntBits(bj4.a(j2))) & 4294967295L);
            }
            FillElement fillElement = b.a;
            o5c.f(l46Var, tm7.o(abg.E(b.m(j09Var3, bj4.b(jFloatToRawIntBits), bj4.a(jFloatToRawIntBits)), t69Var), z ? podVar.a : podVar.f, u5d.b(ok8.o, l46Var)));
            j09Var2 = j09Var3;
        } else {
            l46Var.Z();
            j09Var2 = j09Var;
            j2 = j;
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new mt2(this, t69Var, j09Var2, podVar, z, j2, i);
        }
    }

    public final void b(final gpd gpdVar, j09 j09Var, final boolean z, final pod podVar, l26 l26Var, n26 n26Var, float f, float f2, l46 l46Var, final int i) {
        int i2;
        final j09 j09Var2;
        final l26 l26Var2;
        final n26 n26Var2;
        final float f3;
        final float f4;
        int i3;
        l26 l26Var3;
        float f5;
        n26 n26Var3;
        j09 j09Var3;
        float f6;
        l46Var.h0(49984771);
        if ((i & 6) == 0) {
            i2 = (l46Var.i(gpdVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i4 = i2 | 48;
        if ((i & 384) == 0) {
            i4 |= l46Var.h(z) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        if ((i & 3072) == 0) {
            i4 |= l46Var.g(podVar) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE;
        }
        if ((i & 24576) == 0) {
            i4 |= UserMetadata.MAX_INTERNAL_KEY_SIZE;
        }
        int i5 = i4 | 14352384;
        if ((100663296 & i) == 0) {
            i5 |= l46Var.g(this) ? 67108864 : 33554432;
        }
        if (l46Var.W(i5 & 1, (38347923 & i5) != 38347922)) {
            l46Var.b0();
            if ((i & 1) == 0 || l46Var.C()) {
                boolean z2 = ((((i5 & 7168) ^ 3072) > 2048 && l46Var.g(podVar)) || (i5 & 3072) == 2048) | ((i5 & 896) == 256);
                Object objR = l46Var.R();
                i8c i8cVar = sf2.a;
                if (z2 || objR == i8cVar) {
                    objR = new nu2(podVar, z);
                    l46Var.p0(objR);
                }
                l26 l26Var4 = (l26) objR;
                i3 = i5 & (-57345);
                Object objR2 = l46Var.R();
                if (objR2 == i8cVar) {
                    objR2 = ib1.v;
                    l46Var.p0(objR2);
                }
                float f7 = epd.d;
                l26Var3 = l26Var4;
                f5 = epd.e;
                n26Var3 = (n26) objR2;
                j09Var3 = g09.a;
                f6 = f7;
            } else {
                l46Var.Z();
                i3 = i5 & (-57345);
                j09Var3 = j09Var;
                l26Var3 = l26Var;
                n26Var3 = n26Var;
                f6 = f;
                f5 = f2;
            }
            l46Var.s();
            int i6 = i3 << 3;
            c(gpdVar, j09Var3, z, podVar, l26Var3, n26Var3, f6, f5, l46Var, 805306416 | (i3 & 14) | (i6 & 896) | (i6 & 7168) | (57344 & i6) | (3670016 & i6) | (29360128 & i6) | (i6 & 234881024), ((i3 >> 21) & 112) | 6);
            j09Var2 = j09Var3;
            f4 = f5;
            f3 = f6;
            n26Var2 = n26Var3;
            l26Var2 = l26Var3;
        } else {
            l46Var.Z();
            j09Var2 = j09Var;
            l26Var2 = l26Var;
            n26Var2 = n26Var;
            f3 = f;
            f4 = f2;
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new l26() { // from class: rod
                @Override // defpackage.l26
                public final Object z(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    this.a.b(gpdVar, j09Var2, z, podVar, l26Var2, n26Var2, f3, f4, (l46) obj, k99.P(i | 1));
                    return wef.a;
                }
            };
        }
    }

    public final void c(final gpd gpdVar, j09 j09Var, boolean z, pod podVar, final l26 l26Var, final n26 n26Var, float f, final float f2, l46 l46Var, int i, int i2) {
        int i3;
        float f3;
        int i4;
        l46 l46Var2;
        l46Var.h0(133396521);
        if ((i & 6) == 0) {
            i3 = (l46Var.i(gpdVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= l46Var.d(Float.NaN) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= l46Var.g(j09Var) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        if ((i & 3072) == 0) {
            i3 |= l46Var.h(z) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE;
        }
        if ((i & 24576) == 0) {
            i3 |= l46Var.g(podVar) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE;
        }
        if ((196608 & i) == 0) {
            i3 |= l46Var.i(l26Var) ? 131072 : 65536;
        }
        if ((1572864 & i) == 0) {
            i3 |= l46Var.i(n26Var) ? 1048576 : 524288;
        }
        if ((12582912 & i) == 0) {
            f3 = f;
            i3 |= l46Var.d(f3) ? 8388608 : 4194304;
        } else {
            f3 = f;
        }
        if ((i & 100663296) == 0) {
            i3 |= l46Var.d(f2) ? 67108864 : 33554432;
        }
        if ((i & 805306368) == 0) {
            i3 |= l46Var.h(false) ? 536870912 : 268435456;
        }
        if ((i2 & 6) == 0) {
            i4 = i2 | (l46Var.h(false) ? 4 : 2);
        } else {
            i4 = i2;
        }
        if (l46Var.W(i3 & 1, ((i3 & 306783379) == 306783378 && (i4 & 3) == 2) ? false : true)) {
            final long jA = podVar.a(z, false);
            final long jA2 = podVar.a(z, true);
            long j = z ? podVar.e : podVar.j;
            long j2 = z ? podVar.c : podVar.h;
            j09 j09VarD = gpdVar.l == ks9.a ? b.p(j09Var, epd.a).D(b.b) : b.d(b.c(j09Var, 1.0f), epd.a);
            int i5 = i3 & 112;
            int i6 = i3;
            boolean zI = (i5 == 32) | l46Var.i(gpdVar);
            Object objR = l46Var.R();
            i8c i8cVar = sf2.a;
            if (zI || objR == i8cVar) {
                objR = new jxc(3, gpdVar);
                l46Var.p0(objR);
            }
            j09 j09VarD2 = j09VarD.D(jgb.Z(g09.a, (n26) objR));
            boolean zI2 = ((i6 & 29360128) == 8388608) | (i5 == 32) | l46Var.i(gpdVar) | l46Var.f(jA) | l46Var.f(jA2) | l46Var.f(j) | l46Var.f(j2) | ((i6 & 234881024) == 67108864) | ((i6 & 458752) == 131072) | ((i6 & 3670016) == 1048576) | ((i6 & 1879048192) == 536870912) | ((i4 & 14) == 4);
            Object objR2 = l46Var.R();
            if (zI2 || objR2 == i8cVar) {
                final long j3 = j2;
                l46Var2 = l46Var;
                final long j4 = j;
                final float f4 = f3;
                a26 a26Var = new a26() { // from class: sod
                    /* JADX WARN: Code duplicated, block: B:100:0x0250  */
                    /* JADX WARN: Code duplicated, block: B:135:0x0327  */
                    @Override // defpackage.a26
                    public final Object d(Object obj) {
                        float fP0;
                        long j5;
                        long jF;
                        float f5;
                        ks9 ks9Var;
                        float f6;
                        char c2;
                        l26 l26Var2;
                        long jFloatToRawIntBits;
                        int iFloatToRawIntBits;
                        long jFloatToRawIntBits2;
                        long jFloatToRawIntBits3;
                        int iFloatToRawIntBits2;
                        sn4 sn4Var;
                        long jFloatToRawIntBits4;
                        int iFloatToRawIntBits3;
                        long jFloatToRawIntBits5;
                        long jFloatToRawIntBits6;
                        int iFloatToRawIntBits4;
                        sn4 sn4Var2;
                        long jFloatToRawIntBits7;
                        int iFloatToRawIntBits5;
                        long jFloatToRawIntBits8;
                        long jFloatToRawIntBits9;
                        int iFloatToRawIntBits6;
                        long jFloatToRawIntBits10;
                        float fP1;
                        float fP2;
                        sn4 sn4Var3 = (sn4) obj;
                        boolean zB = yi4.b(Float.NaN, Float.NaN);
                        ks9 ks9Var2 = ks9.a;
                        gpd gpdVar2 = gpdVar;
                        if (zB) {
                            fP0 = (gpdVar2.l == ks9Var2 ? Float.intBitsToFloat((int) (sn4Var3.f() >> 32)) : Float.intBitsToFloat((int) (sn4Var3.f() & 4294967295L))) / 2.0f;
                        } else {
                            fP0 = sn4Var3.p0(Float.NaN);
                        }
                        uod uodVar = uod.a;
                        float[] fArr = gpdVar2.f;
                        float fC = gpdVar2.c();
                        int i7 = 0;
                        float fZ = sn4Var3.Z(0);
                        float fZ2 = sn4Var3.Z(0);
                        float fZ3 = sn4Var3.Z(gpdVar2.j.j());
                        float fZ4 = sn4Var3.Z(gpdVar2.k.j());
                        float fC0 = sn4Var3.c0(fP0);
                        ks9 ks9Var3 = gpdVar2.l;
                        boolean z2 = ks9Var3 == ks9Var2;
                        boolean z3 = sn4Var3.getLayoutDirection() == cv7.b;
                        boolean z4 = z3 && !z2;
                        float fP3 = sn4Var3.p0(fC0);
                        if (z2) {
                            j5 = 4294967295L;
                            jF = sn4Var3.f() & 4294967295L;
                        } else {
                            j5 = 4294967295L;
                            jF = sn4Var3.f() >> 32;
                        }
                        float fIntBitsToFloat = Float.intBitsToFloat((int) jF);
                        fArr.getClass();
                        if (pa7.s(0.0f, fArr.length == 0 ? null : Float.valueOf(fArr[0])) || pa7.s(0.0f, qd0.v0(fArr))) {
                        }
                        float fA = (fArr.length == 0 || (pa7.s(fC, fArr.length != 0 ? Float.valueOf(fArr[0]) : null) || pa7.s(fC, qd0.v0(fArr)))) ? ks0.a(fIntBitsToFloat, 0.0f, fC, 0.0f) : (((fIntBitsToFloat - 0.0f) - (fP3 * 2.0f)) * fC) + 0.0f + fP3;
                        int length = fArr.length;
                        float fP4 = sn4Var3.p0(f2);
                        float f7 = f4;
                        if (yi4.a(f7, 0.0f) > 0) {
                            if (z2) {
                                sn4Var3.p0(fZ2);
                                sn4Var3.p0(f7);
                                fP1 = sn4Var3.p0(fZ4) / 2.0f;
                                fP2 = sn4Var3.p0(f7);
                            } else {
                                sn4Var3.p0(fZ);
                                sn4Var3.p0(f7);
                                fP1 = sn4Var3.p0(fZ3) / 2.0f;
                                fP2 = sn4Var3.p0(f7);
                            }
                            f5 = fP2 + fP1;
                        } else {
                            f5 = 0.0f;
                        }
                        long jH0 = sn4Var3.H0();
                        Float.intBitsToFloat((int) (z2 ? jH0 & j5 : jH0 >> 32));
                        float f8 = (fIntBitsToFloat - f5) - fP3;
                        l26 l26Var3 = l26Var;
                        if (fA < f8) {
                            float f9 = z4 ? fP3 : fP4;
                            float f10 = z4 ? fP4 : fP3;
                            float f11 = fA + f5;
                            float f12 = fIntBitsToFloat - f11;
                            if (z2) {
                                jFloatToRawIntBits6 = Float.floatToRawIntBits(0.0f);
                                iFloatToRawIntBits4 = Float.floatToRawIntBits(f11);
                                f6 = 0.0f;
                                c2 = ' ';
                            } else {
                                f6 = 0.0f;
                                c2 = ' ';
                                if (z3) {
                                    jFloatToRawIntBits6 = Float.floatToRawIntBits(0.0f);
                                    iFloatToRawIntBits4 = Float.floatToRawIntBits(0.0f);
                                } else {
                                    jFloatToRawIntBits6 = Float.floatToRawIntBits(f11);
                                    iFloatToRawIntBits4 = Float.floatToRawIntBits(0.0f);
                                }
                            }
                            long j6 = (jFloatToRawIntBits6 << c2) | (((long) iFloatToRawIntBits4) & j5);
                            if (z2) {
                                jFloatToRawIntBits7 = Float.floatToRawIntBits(Float.intBitsToFloat((int) (sn4Var3.f() >> c2)));
                                sn4Var2 = sn4Var3;
                                jFloatToRawIntBits8 = Float.floatToRawIntBits(f12);
                            } else {
                                sn4Var2 = sn4Var3;
                                if (z3) {
                                    float fIntBitsToFloat2 = Float.intBitsToFloat((int) (sn4Var2.f() >> c2)) - f11;
                                    float fIntBitsToFloat3 = Float.intBitsToFloat((int) (sn4Var2.f() & j5));
                                    jFloatToRawIntBits7 = Float.floatToRawIntBits(fIntBitsToFloat2);
                                    iFloatToRawIntBits5 = Float.floatToRawIntBits(fIntBitsToFloat3);
                                } else {
                                    float fIntBitsToFloat4 = Float.intBitsToFloat((int) (sn4Var2.f() & j5));
                                    jFloatToRawIntBits7 = Float.floatToRawIntBits(f12);
                                    iFloatToRawIntBits5 = Float.floatToRawIntBits(fIntBitsToFloat4);
                                }
                                jFloatToRawIntBits8 = iFloatToRawIntBits5;
                            }
                            long j7 = (jFloatToRawIntBits8 & j5) | (jFloatToRawIntBits7 << c2);
                            ks9Var = ks9Var3;
                            sn4Var3 = sn4Var2;
                            l26Var2 = l26Var3;
                            uod.e(sn4Var3, ks9Var, j6, j7, jA, f9, f10);
                            if (z2) {
                                jFloatToRawIntBits9 = Float.floatToRawIntBits(Float.intBitsToFloat((int) (sn4Var3.H0() >> c2)));
                                iFloatToRawIntBits6 = Float.floatToRawIntBits(fIntBitsToFloat - fP3);
                            } else {
                                if (z3) {
                                    jFloatToRawIntBits10 = (((long) Float.floatToRawIntBits(fP3)) << c2) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (sn4Var3.H0() & j5)))) & j5);
                                } else {
                                    float fIntBitsToFloat5 = Float.intBitsToFloat((int) (sn4Var3.H0() & j5));
                                    jFloatToRawIntBits9 = Float.floatToRawIntBits(fIntBitsToFloat - fP3);
                                    iFloatToRawIntBits6 = Float.floatToRawIntBits(fIntBitsToFloat5);
                                }
                                if (l26Var2 != null) {
                                    l26Var2.z(sn4Var3, new hl9(jFloatToRawIntBits10));
                                }
                            }
                            jFloatToRawIntBits10 = (((long) iFloatToRawIntBits6) & j5) | (jFloatToRawIntBits9 << c2);
                            if (l26Var2 != null) {
                                l26Var2.z(sn4Var3, new hl9(jFloatToRawIntBits10));
                            }
                        } else {
                            ks9Var = ks9Var3;
                            f6 = 0.0f;
                            c2 = ' ';
                            l26Var2 = l26Var3;
                        }
                        float f13 = fA - f5;
                        float f14 = !z4 ? fP3 : fP4;
                        float f15 = z4 ? fP3 : fP4;
                        float f16 = z4 ? f13 : f13 - f6;
                        if (f16 > f14) {
                            if (!z2 && z3) {
                                jFloatToRawIntBits3 = Float.floatToRawIntBits(Float.intBitsToFloat((int) (sn4Var3.f() >> c2)) - f13);
                                iFloatToRawIntBits2 = Float.floatToRawIntBits(f6);
                            } else {
                                jFloatToRawIntBits3 = Float.floatToRawIntBits(f6);
                                iFloatToRawIntBits2 = Float.floatToRawIntBits(f6);
                            }
                            long j8 = (jFloatToRawIntBits3 << c2) | (((long) iFloatToRawIntBits2) & j5);
                            if (z2) {
                                sn4Var = sn4Var3;
                                jFloatToRawIntBits5 = (((long) Float.floatToRawIntBits(f16)) & j5) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (sn4Var3.f() >> c2)))) << c2);
                            } else {
                                sn4Var = sn4Var3;
                                if (z3) {
                                    float fIntBitsToFloat6 = Float.intBitsToFloat((int) (sn4Var.f() & j5));
                                    jFloatToRawIntBits4 = Float.floatToRawIntBits(f13);
                                    iFloatToRawIntBits3 = Float.floatToRawIntBits(fIntBitsToFloat6);
                                } else {
                                    float fIntBitsToFloat7 = Float.intBitsToFloat((int) (sn4Var.f() & j5));
                                    jFloatToRawIntBits4 = Float.floatToRawIntBits(f16);
                                    iFloatToRawIntBits3 = Float.floatToRawIntBits(fIntBitsToFloat7);
                                }
                                jFloatToRawIntBits5 = (jFloatToRawIntBits4 << c2) | (((long) iFloatToRawIntBits3) & j5);
                            }
                            long j9 = jFloatToRawIntBits5;
                            sn4Var3 = sn4Var;
                            uod.e(sn4Var3, ks9Var, j8, j9, jA2, f14, f15);
                        }
                        float f17 = f6 + fP3;
                        float f18 = fIntBitsToFloat - fP3;
                        float f19 = fA - f5;
                        float f20 = fA + f5;
                        int length2 = fArr.length;
                        int i8 = 0;
                        while (i7 < length2) {
                            float f21 = fArr[i7];
                            int i9 = i8 + 1;
                            if (l26Var2 == null || i8 != fArr.length - 1) {
                                float fP = abg.P(f17, f18, f21);
                                if (fP < f19 || fP > f20) {
                                    if (z2) {
                                        jFloatToRawIntBits = Float.floatToRawIntBits(Float.intBitsToFloat((int) (sn4Var3.H0() >> c2)));
                                        jFloatToRawIntBits2 = Float.floatToRawIntBits(fP);
                                    } else {
                                        if (z3) {
                                            float fIntBitsToFloat8 = Float.intBitsToFloat((int) (sn4Var3.f() >> c2)) - fP;
                                            float fIntBitsToFloat9 = Float.intBitsToFloat((int) (sn4Var3.H0() & j5));
                                            jFloatToRawIntBits = Float.floatToRawIntBits(fIntBitsToFloat8);
                                            iFloatToRawIntBits = Float.floatToRawIntBits(fIntBitsToFloat9);
                                        } else {
                                            float fIntBitsToFloat10 = Float.intBitsToFloat((int) (sn4Var3.H0() & j5));
                                            jFloatToRawIntBits = Float.floatToRawIntBits(fP);
                                            iFloatToRawIntBits = Float.floatToRawIntBits(fIntBitsToFloat10);
                                        }
                                        jFloatToRawIntBits2 = iFloatToRawIntBits;
                                    }
                                    n26Var.m(sn4Var3, new hl9((jFloatToRawIntBits2 & j5) | (jFloatToRawIntBits << c2)), new y72((fP < f6 || fP > f13) ? j4 : j3));
                                } else {
                                    f17 = f17;
                                    f19 = f19;
                                }
                            } else {
                                f17 = f17;
                                f19 = f19;
                            }
                            i7++;
                            i8 = i9;
                            f17 = f17;
                            f19 = f19;
                        }
                        return wef.a;
                    }
                };
                l46Var2.p0(a26Var);
                objR2 = a26Var;
            } else {
                l46Var2 = l46Var;
            }
            nk8.e(0, (a26) objR2, l46Var2, j09VarD2);
        } else {
            l46Var2 = l46Var;
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new zjd(this, gpdVar, j09Var, z, podVar, l26Var, n26Var, f, f2, i, i2);
        }
    }
}
