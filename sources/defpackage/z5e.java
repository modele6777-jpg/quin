package defpackage;

import androidx.compose.ui.graphics.shadow.DropShadowPainter;
import androidx.compose.ui.graphics.shadow.InnerShadowPainter;
import java.util.Arrays;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class z5e extends sv3 implements kv7, pn4, i4f, ug2, al9, tg2 {
    public w5e F0;
    public p5e G0;
    public final rxb H0;
    public a6e I0;
    public a6e J0;
    public ke6 K0;
    public h2e L0;
    public final a82 M0;
    public l89 N0;
    public m77 O0;
    public trd P0;
    public long Q0;
    public cv7 R0;
    public x4d S0;
    public vs9 T0;
    public n4d[] U0;
    public InnerShadowPainter[] V0;
    public n4d[] W0;
    public DropShadowPainter[] X0;
    public lyd Y0;

    public z5e(l89 l89Var, p5e p5eVar) {
        this.G0 = p5eVar;
        rxb rxbVar = new rxb();
        rxbVar.a = 1.0f;
        ggf ggfVar = ggf.a;
        rxbVar.z = ggfVar;
        rxbVar.X = ggfVar;
        this.H0 = rxbVar;
        this.I0 = new a6e();
        this.M0 = new a82(6);
        this.N0 = l89Var == null ? new l89(null) : l89Var;
        this.Q0 = 9205357640488583168L;
    }

    public static a6e q1(z5e z5eVar, int i) {
        a6e a6eVar = z5eVar.I0;
        rxb rxbVar = z5eVar.H0;
        if ((rxbVar.d() & i) == 0) {
            return a6eVar;
        }
        a6e a6eVar2 = new a6e();
        rxbVar.h(i, a6eVar2);
        return a6eVar2;
    }

    @Override // defpackage.al9
    public final void A0() {
        r1(false);
    }

    @Override // defpackage.i09
    public final boolean a1() {
        return false;
    }

    @Override // defpackage.kv7
    public final yn8 d(zn8 zn8Var, tn8 tn8Var, final long j) {
        int iRound;
        int iRound2;
        int iRound3;
        int iRound4;
        a6e a6eVarQ1 = q1(this, 12);
        float f = a6eVarQ1.v((byte) 4) ? a6eVarQ1.g : 0.0f;
        float f2 = a6eVarQ1.v((byte) 13) ? a6eVarQ1.p : 0.0f;
        if (!Float.isNaN(f2)) {
            f += f2;
        }
        final float f3 = f;
        float f4 = a6eVarQ1.v((byte) 5) ? a6eVarQ1.h : 0.0f;
        float f5 = a6eVarQ1.v((byte) 15) ? a6eVarQ1.r : 0.0f;
        if (!Float.isNaN(f5)) {
            f4 += f5;
        }
        float f6 = a6eVarQ1.v((byte) 6) ? a6eVarQ1.i : 0.0f;
        float f7 = a6eVarQ1.v((byte) 14) ? a6eVarQ1.q : 0.0f;
        if (!Float.isNaN(f7)) {
            f6 += f7;
        }
        float f8 = a6eVarQ1.v((byte) 7) ? a6eVarQ1.j : 0.0f;
        float f9 = a6eVarQ1.v((byte) 16) ? a6eVarQ1.s : 0.0f;
        if (!Float.isNaN(f9)) {
            f8 += f9;
        }
        int iRound5 = Math.round(f3 + f4);
        int iRound6 = Math.round(f6 + f8);
        int iJ = kl2.j(j) - iRound5;
        if (iJ < 0) {
            iJ = 0;
        }
        int iH = kl2.h(j);
        if (iH != Integer.MAX_VALUE && (iH = iH + iRound5) < 0) {
            iH = 0;
        }
        int i = kl2.i(j) - iRound6;
        int i2 = i < 0 ? 0 : i;
        int iG = kl2.g(j);
        if (iG != Integer.MAX_VALUE && (iG = iG + iRound6) < 0) {
            iG = 0;
        }
        if (a6eVarQ1.v((byte) 19)) {
            iRound = Math.round(a6eVarQ1.w);
            if (iRound < 0) {
                iRound = 0;
            }
        } else {
            iRound = Integer.MAX_VALUE;
        }
        if (a6eVarQ1.v((byte) 17)) {
            iRound2 = Math.round(a6eVarQ1.v);
            if (iRound2 < 0) {
                iRound2 = 0;
            }
            if (iRound2 > iRound) {
                iRound2 = iRound;
            }
        } else {
            iRound2 = 0;
        }
        if (a6eVarQ1.v((byte) 9)) {
            int iRound7 = Math.round(a6eVarQ1.l);
            if (iRound7 >= iRound2) {
                iRound2 = iRound7;
            }
            if (iRound2 <= iRound) {
                iRound = iRound2;
            }
            iRound2 = iRound;
        }
        if (iRound2 != 0) {
            if (iRound2 >= iJ) {
                iJ = iRound2;
            }
            if (iJ > iH) {
                iJ = iH;
            }
        }
        if (iRound != Integer.MAX_VALUE) {
            if (iRound < iJ) {
                iRound = iJ;
            }
            if (iRound <= iH) {
                iH = iRound;
            }
        }
        if (!a6eVarQ1.v((byte) 9)) {
            if (a6eVarQ1.v((byte) 11) && kl2.d(j)) {
                int iRound8 = Math.round(iH * a6eVarQ1.n);
                if (iRound8 >= iJ) {
                    iJ = iRound8;
                }
                if (iJ > iH) {
                    iJ = iH;
                }
                iH = iJ;
            } else if (a6eVarQ1.v((byte) 13) && a6eVarQ1.v((byte) 15)) {
                iJ = iH;
            }
        }
        if (a6eVarQ1.v((byte) 20)) {
            iRound3 = Math.round(a6eVarQ1.u);
            if (iRound3 < 0) {
                iRound3 = 0;
            }
        } else {
            iRound3 = Integer.MAX_VALUE;
        }
        if (a6eVarQ1.v((byte) 18)) {
            iRound4 = Math.round(a6eVarQ1.t);
            if (iRound4 < 0) {
                iRound4 = 0;
            }
            if (iRound4 > iRound3) {
                iRound4 = iRound3;
            }
        } else {
            iRound4 = 0;
        }
        if (a6eVarQ1.v((byte) 10)) {
            int iRound9 = Math.round(a6eVarQ1.m);
            if (iRound9 >= iRound4) {
                iRound4 = iRound9;
            }
            if (iRound4 <= iRound3) {
                iRound3 = iRound4;
            }
            iRound4 = iRound3;
        }
        if (iRound4 != 0) {
            if (iRound4 >= i2) {
                i2 = iRound4;
            }
            if (i2 > iG) {
                i2 = iG;
            }
        }
        if (iRound3 != Integer.MAX_VALUE) {
            if (iRound3 < i2) {
                iRound3 = i2;
            }
            if (iRound3 <= iG) {
                iG = iRound3;
            }
        }
        if (!a6eVarQ1.v((byte) 10)) {
            if (a6eVarQ1.v((byte) 12) && kl2.c(j)) {
                int iRound10 = Math.round(iG * a6eVarQ1.o);
                if (iRound10 >= i2) {
                    i2 = iRound10;
                }
                if (i2 > iG) {
                    i2 = iG;
                }
                iG = i2;
            } else if (a6eVarQ1.v((byte) 14) && a6eVarQ1.v((byte) 16)) {
                i2 = iG;
            }
        }
        final cea ceaVarV = tn8Var.v(ll2.a(iJ, iH, i2, iG));
        final float f10 = f4;
        final float f11 = f6;
        final float f12 = f8;
        return zn8Var.n0(ceaVarV.a + iRound5, ceaVarV.b + iRound6, qu4.a, new a26() { // from class: x5e
            @Override // defpackage.a26
            public final Object d(Object obj) {
                bea beaVar = (bea) obj;
                z5e z5eVar = this.a;
                a6e a6eVarQ2 = z5e.q1(z5eVar, 12);
                boolean zV = a6eVarQ2.v((byte) 13);
                long j2 = j;
                cea ceaVar = ceaVarV;
                int iRound11 = (zV || !a6eVarQ2.v((byte) 15)) ? Math.round(f3) : (kl2.h(j2) - ceaVar.a) - Math.round(f10);
                int iRound12 = (!a6eVarQ2.v((byte) 16) || a6eVarQ2.v((byte) 14)) ? Math.round(f11) : (kl2.g(j2) - ceaVar.b) - Math.round(f12);
                if ((a6eVarQ2.r() & 4) != 0) {
                    trd trdVar = z5eVar.P0;
                    if (trdVar == null) {
                        trdVar = new trd(5, z5eVar);
                        z5eVar.P0 = trdVar;
                    }
                    bea.q(beaVar, ceaVar, iRound11, iRound12, trdVar, 4);
                } else {
                    beaVar.g(ceaVar, iRound11, iRound12, 0.0f);
                }
                return wef.a;
            }
        });
    }

    @Override // defpackage.i09
    public final void e1() {
        ke6 ke6Var = this.K0;
        if (ke6Var != null) {
            vd0.q0(this).a(ke6Var);
            this.K0 = null;
        }
        this.L0 = null;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x017b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:101:0x017d  */
    /* JADX WARN: Code duplicated, block: B:102:0x0188  */
    /* JADX WARN: Code duplicated, block: B:103:0x019a  */
    /* JADX WARN: Code duplicated, block: B:106:0x01a5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:107:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:108:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:110:0x01b5 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:111:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:112:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:115:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:117:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:126:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:128:0x0203  */
    /* JADX WARN: Code duplicated, block: B:130:0x022b  */
    /* JADX WARN: Code duplicated, block: B:132:0x026d  */
    /* JADX WARN: Code duplicated, block: B:134:0x0274  */
    /* JADX WARN: Code duplicated, block: B:136:0x027f  */
    /* JADX WARN: Code duplicated, block: B:137:0x0289  */
    /* JADX WARN: Code duplicated, block: B:139:0x028f  */
    /* JADX WARN: Code duplicated, block: B:142:0x02b9  */
    /* JADX WARN: Code duplicated, block: B:144:0x02bd  */
    /* JADX WARN: Code duplicated, block: B:148:0x02d3  */
    /* JADX WARN: Code duplicated, block: B:149:0x02de  */
    /* JADX WARN: Code duplicated, block: B:155:0x0312  */
    /* JADX WARN: Code duplicated, block: B:157:0x0316  */
    /* JADX WARN: Code duplicated, block: B:166:0x0330  */
    /* JADX WARN: Code duplicated, block: B:167:0x0333  */
    /* JADX WARN: Code duplicated, block: B:170:0x033d  */
    /* JADX WARN: Code duplicated, block: B:171:0x0342  */
    /* JADX WARN: Code duplicated, block: B:185:0x0370  */
    /* JADX WARN: Code duplicated, block: B:187:0x0376 A[LOOP:2: B:186:0x0374->B:187:0x0376, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:190:0x0383 A[LOOP:3: B:189:0x0381->B:190:0x0383, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:193:0x038c  */
    /* JADX WARN: Code duplicated, block: B:195:0x0393  */
    /* JADX WARN: Code duplicated, block: B:197:0x0399  */
    /* JADX WARN: Code duplicated, block: B:199:0x03a1  */
    /* JADX WARN: Code duplicated, block: B:201:0x03a5  */
    /* JADX WARN: Code duplicated, block: B:209:0x039e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:97:0x0165  */
    @Override // defpackage.pn4
    public final void o0(im2 im2Var) {
        b41 b41Var;
        b41 b41Var2;
        b41 b41Var3;
        Object obj;
        float f;
        y02 y02Var;
        long j;
        DropShadowPainter[] dropShadowPainterArr;
        vv7 vv7Var;
        xl1 xl1Var;
        long jF;
        vs9 vs9VarA;
        vs9 vs9Var;
        b41 b41Var4;
        float f2;
        int i;
        Object obj2;
        x4d x4dVar;
        n4d[] n4dVarArr;
        boolean z;
        int length;
        n4d[] n4dVarArr2;
        int i2;
        InnerShadowPainter[] innerShadowPainterArr;
        int i3;
        Object[] objArr;
        int length2;
        int i4;
        Object obj3;
        InnerShadowPainter[] innerShadowPainterArr2;
        b41 dtdVar;
        h2e h2eVar;
        final h2e h2eVar2;
        final a82 a82Var;
        a82 a82Var2;
        a26 w6Var;
        v6c v6cVar;
        zt ztVarA;
        a26 k11Var;
        zt ztVarA2;
        float fIntBitsToFloat;
        float fIntBitsToFloat2;
        y02 y02Var2 = g21.f;
        a6e a6eVarQ1 = q1(this, 2);
        long j2 = y72.k;
        long j3 = a6eVarQ1.v((byte) 34) ? a6eVarQ1.z : j2;
        if (a6eVarQ1.w(51)) {
            b41Var = a6eVarQ1.A;
            b41Var.getClass();
        } else {
            b41Var = null;
        }
        if (a6eVarQ1.v((byte) 36)) {
            j2 = a6eVarQ1.B;
        }
        long j4 = j2;
        if (a6eVarQ1.w(52)) {
            b41 b41Var5 = a6eVarQ1.C;
            b41Var5.getClass();
            b41Var2 = b41Var5;
        } else {
            b41Var2 = null;
        }
        long j5 = y72.b;
        if (a6eVarQ1.v((byte) 35)) {
            j5 = a6eVarQ1.x;
        }
        long j6 = j5;
        if (a6eVarQ1.w(50)) {
            b41 b41Var6 = a6eVarQ1.y;
            b41Var6.getClass();
            b41Var3 = b41Var6;
        } else {
            b41Var3 = null;
        }
        float f3 = a6eVarQ1.v((byte) 8) ? a6eVarQ1.k : 0.0f;
        float f4 = f3 / 2.0f;
        x4d x4dVar2 = a6eVarQ1.E;
        long j7 = j3;
        boolean z2 = f4 > 0.0f;
        boolean z3 = (j7 == 16 && b41Var == null) ? false : true;
        boolean z4 = (j4 == 16 && b41Var2 == null) ? false : true;
        if (a6eVarQ1.w(55) && (obj = a6eVarQ1.F) != null) {
            x4d x4dVar3 = a6eVarQ1.w(53) ? a6eVarQ1.E : y02Var2;
            n4d[] n4dVarArr3 = this.W0;
            f = f3;
            DropShadowPainter[] dropShadowPainterArr2 = this.X0;
            y02Var = y02Var2;
            boolean z5 = obj instanceof Object[];
            int length3 = z5 ? ((Object[]) obj).length : 1;
            j = j4;
            if (n4dVarArr3 == null || !pa7.t(this.S0, x4dVar3)) {
                n4d[] n4dVarArr4 = new n4d[length3];
                for (int i5 = 0; i5 < length3; i5++) {
                    n4dVarArr4[i5] = null;
                }
                this.W0 = n4dVarArr4;
                DropShadowPainter[] dropShadowPainterArr3 = new DropShadowPainter[length3];
                for (int i6 = 0; i6 < length3; i6++) {
                    dropShadowPainterArr3[i6] = null;
                }
                this.X0 = dropShadowPainterArr3;
            } else if (n4dVarArr3.length != length3) {
                this.W0 = (n4d[]) Arrays.copyOf(n4dVarArr3, length3);
                if (dropShadowPainterArr2 != null) {
                    dropShadowPainterArr = (DropShadowPainter[]) Arrays.copyOf(dropShadowPainterArr2, length3);
                } else {
                    dropShadowPainterArr = new DropShadowPainter[length3];
                    for (int i7 = 0; i7 < length3; i7++) {
                        dropShadowPainterArr[i7] = null;
                    }
                }
                this.X0 = dropShadowPainterArr;
            }
            if (!z5) {
                if (obj instanceof n4d) {
                    o1((vv7) im2Var, 0, x4dVar3, (n4d) obj);
                }
                vv7Var = (vv7) im2Var;
                xl1Var = vv7Var.a;
                jF = xl1Var.f();
                if (!ald.a(this.Q0, jF) && this.R0 == vv7Var.getLayoutDirection() && pa7.t(this.S0, x4dVar2)) {
                    vs9VarA = this.T0;
                    vs9VarA.getClass();
                } else {
                    vs9VarA = x4dVar2.a(jF, vv7Var.getLayoutDirection(), vv7Var);
                }
                this.T0 = vs9VarA;
                this.Q0 = jF;
                this.R0 = vv7Var.getLayoutDirection();
                if (z3) {
                    vs9Var = vs9VarA;
                    b41Var4 = b41Var3;
                    f2 = 0.0f;
                } else if (b41Var != null) {
                    rs0.v(im2Var, vs9VarA, b41Var, 0.0f, 60);
                    b41Var4 = b41Var3;
                    f2 = 0.0f;
                    vs9Var = vs9VarA;
                } else {
                    b41 b41Var7 = b41Var3;
                    f2 = 0.0f;
                    vs9Var = vs9VarA;
                    b41Var4 = b41Var7;
                    rs0.w(im2Var, vs9Var, j7, null, 60);
                }
                vv7Var.a();
                if (z4) {
                    if (b41Var2 != null) {
                        rs0.v(im2Var, vs9Var, b41Var2, f2, 60);
                    } else {
                        rs0.w(im2Var, vs9Var, j, null, 60);
                    }
                }
                if (z2) {
                    if (b41Var4 == null) {
                        dtdVar = new dtd(j6);
                    } else {
                        dtdVar = b41Var4;
                    }
                    dxe dxeVar = new dxe(f);
                    h2eVar = this.L0;
                    if (h2eVar == null) {
                        h2eVar = new h2e(1, this);
                        this.L0 = h2eVar;
                    }
                    h2eVar2 = h2eVar;
                    a82Var = this.M0;
                    a82Var.d = dxeVar;
                    if (dtdVar.equals((b41) a82Var.b) || !pa7.t(vs9Var, (vs9) a82Var.e) || ((a26) a82Var.f) == null) {
                        a82Var.b = dtdVar;
                        a82Var.e = vs9Var;
                        if (vs9Var instanceof ss9) {
                            final ss9 ss9Var = (ss9) vs9Var;
                            zt ztVar = ss9Var.a;
                            final hkb hkbVarF = ztVar.f();
                            float f5 = hkbVarF.b;
                            float f6 = hkbVarF.d;
                            float f7 = hkbVarF.a;
                            float f8 = hkbVarF.c;
                            final float fMin = Math.min(Math.abs(f8 - f7), Math.abs(f6 - f5));
                            ztVarA2 = (zt) a82Var.c;
                            if (ztVarA2 == null) {
                                ztVarA2 = cu.a();
                                a82Var.c = ztVarA2;
                            }
                            ztVarA2.k();
                            zt.b(ztVarA2, hkbVarF);
                            ztVarA2.i(ztVarA2, ztVar, 0);
                            i = 0;
                            final long jCeil = (((long) ((int) Math.ceil(f8 - f7))) << 32) | (((long) ((int) Math.ceil(f6 - f5))) & 4294967295L);
                            final zt ztVar2 = ztVarA2;
                            final b41 b41Var8 = dtdVar;
                            w6Var = new a26() { // from class: l11
                                @Override // defpackage.a26
                                public final Object d(Object obj4) {
                                    long j8 = jCeil;
                                    zt ztVar3 = ztVar2;
                                    sn4 sn4Var = (sn4) obj4;
                                    dxe dxeVar2 = (dxe) a82Var.d;
                                    dxeVar2.getClass();
                                    float fFloatValue = Float.valueOf(dxeVar2.a).floatValue();
                                    float f9 = fFloatValue < 0.0f ? 0.0f : fFloatValue;
                                    float f10 = 2.0f * f9;
                                    float f11 = fMin;
                                    ss9 ss9Var2 = ss9Var;
                                    b41 b41Var9 = b41Var8;
                                    if (f10 > f11) {
                                        sn4.s(sn4Var, ss9Var2.a, b41Var9, 0.0f, null, null, 0, 60);
                                    } else {
                                        ke6 ke6Var = (ke6) h2eVar2.invoke();
                                        me6 me6Var = ke6Var.a;
                                        if (me6Var.m() != 1) {
                                            me6Var.H(1);
                                        }
                                        hkb hkbVar = hkbVarF;
                                        float f12 = hkbVar.a;
                                        float f13 = hkbVar.b;
                                        ((vd9) sn4Var.v0().c).I(f12, f13);
                                        try {
                                            sn4Var.F0(j8, new m11(hkbVar, ss9Var2, b41Var9, f9, ztVar3), ke6Var);
                                            i7h.r(sn4Var, ke6Var);
                                        } finally {
                                            ((vd9) sn4Var.v0().c).I(-f12, -f13);
                                        }
                                    }
                                    return wef.a;
                                }
                            };
                            a82Var2 = a82Var;
                        } else {
                            a82Var2 = a82Var;
                            i = 0;
                            if (vs9Var instanceof us9) {
                                v6cVar = ((us9) vs9Var).a;
                                if (w6c.o(v6cVar)) {
                                    k11Var = new w6(a82Var2, v6cVar, dtdVar, 12);
                                } else {
                                    ztVarA = (zt) a82Var2.c;
                                    if (ztVarA == null) {
                                        ztVarA = cu.a();
                                        a82Var2.c = ztVarA;
                                    }
                                    zt ztVar3 = ztVarA;
                                    jmb jmbVar = new jmb();
                                    jmbVar.element = Float.NaN;
                                    k11Var = new k11(a82Var2, v6cVar, jmbVar, new mmb(), ztVar3, dtdVar, 0);
                                }
                                w6Var = k11Var;
                            } else {
                                if (!(vs9Var instanceof ts9)) {
                                    ap.c();
                                    return;
                                }
                                w6Var = new w6(a82Var2, ((ts9) vs9Var).a, dtdVar, 13);
                            }
                        }
                        a82Var2.f = w6Var;
                    } else {
                        a82Var2 = a82Var;
                        i = 0;
                    }
                    if (hl9.c(0L, 0L)) {
                        a26 a26Var = (a26) a82Var2.f;
                        a26Var.getClass();
                        a26Var.d(im2Var);
                    } else {
                        fIntBitsToFloat = Float.intBitsToFloat(i);
                        fIntBitsToFloat2 = Float.intBitsToFloat(i);
                        ((vd9) xl1Var.b.c).I(fIntBitsToFloat, fIntBitsToFloat2);
                        try {
                            a26 a26Var2 = (a26) a82Var2.f;
                            a26Var2.getClass();
                            a26Var2.d(im2Var);
                            ((vd9) xl1Var.b.c).I(-fIntBitsToFloat, -fIntBitsToFloat2);
                        } catch (Throwable th) {
                            ((vd9) xl1Var.b.c).I(-fIntBitsToFloat, -fIntBitsToFloat2);
                            throw th;
                        }
                    }
                } else {
                    i = 0;
                }
                if (a6eVarQ1.w(56) && (obj2 = a6eVarQ1.G) != null) {
                    if (a6eVarQ1.w(53)) {
                        x4dVar = a6eVarQ1.E;
                    } else {
                        x4dVar = y02Var;
                    }
                    n4dVarArr = this.U0;
                    InnerShadowPainter[] innerShadowPainterArr3 = this.V0;
                    z = obj2 instanceof Object[];
                    if (z) {
                        length = ((Object[]) obj2).length;
                    } else {
                        length = 1;
                    }
                    if (n4dVarArr != null || !pa7.t(this.S0, x4dVar)) {
                        n4dVarArr2 = new n4d[length];
                        for (i2 = i; i2 < length; i2++) {
                            n4dVarArr2[i2] = null;
                        }
                        this.U0 = n4dVarArr2;
                        innerShadowPainterArr = new InnerShadowPainter[length];
                        for (i3 = i; i3 < length; i3++) {
                            innerShadowPainterArr[i3] = null;
                        }
                        this.V0 = innerShadowPainterArr;
                    } else if (n4dVarArr.length != length) {
                        this.U0 = (n4d[]) Arrays.copyOf(n4dVarArr, length);
                        if (innerShadowPainterArr3 != null) {
                            innerShadowPainterArr2 = (InnerShadowPainter[]) Arrays.copyOf(innerShadowPainterArr3, length);
                        } else {
                            innerShadowPainterArr2 = new InnerShadowPainter[length];
                            for (int i8 = i; i8 < length; i8++) {
                                innerShadowPainterArr2[i8] = null;
                            }
                        }
                        this.V0 = innerShadowPainterArr2;
                    }
                    if (z) {
                        objArr = (Object[]) obj2;
                        length2 = objArr.length;
                        for (i4 = i; i4 < length2; i4++) {
                            obj3 = objArr[i4];
                            if (obj3 instanceof n4d) {
                                p1(vv7Var, i4, x4dVar, (n4d) obj3);
                            }
                        }
                    } else if (obj2 instanceof n4d) {
                        p1(vv7Var, i, x4dVar, (n4d) obj2);
                    }
                }
                this.S0 = x4dVar2;
            }
            Object[] objArr2 = (Object[]) obj;
            int length4 = objArr2.length;
            for (int i9 = 0; i9 < length4; i9++) {
                Object obj4 = objArr2[i9];
                if (obj4 instanceof n4d) {
                    o1((vv7) im2Var, i9, x4dVar3, (n4d) obj4);
                }
            }
        } else {
            f = f3;
            y02Var = y02Var2;
            j = j4;
        }
        vv7Var = (vv7) im2Var;
        xl1Var = vv7Var.a;
        jF = xl1Var.f();
        if (!ald.a(this.Q0, jF)) {
            vs9VarA = x4dVar2.a(jF, vv7Var.getLayoutDirection(), vv7Var);
        } else {
            vs9VarA = x4dVar2.a(jF, vv7Var.getLayoutDirection(), vv7Var);
        }
        this.T0 = vs9VarA;
        this.Q0 = jF;
        this.R0 = vv7Var.getLayoutDirection();
        if (z3) {
            vs9Var = vs9VarA;
            b41Var4 = b41Var3;
            f2 = 0.0f;
        } else if (b41Var != null) {
            rs0.v(im2Var, vs9VarA, b41Var, 0.0f, 60);
            b41Var4 = b41Var3;
            f2 = 0.0f;
            vs9Var = vs9VarA;
        } else {
            b41 b41Var9 = b41Var3;
            f2 = 0.0f;
            vs9Var = vs9VarA;
            b41Var4 = b41Var9;
            rs0.w(im2Var, vs9Var, j7, null, 60);
        }
        vv7Var.a();
        if (z4) {
            if (b41Var2 != null) {
                rs0.v(im2Var, vs9Var, b41Var2, f2, 60);
            } else {
                rs0.w(im2Var, vs9Var, j, null, 60);
            }
        }
        if (z2) {
            if (b41Var4 == null) {
                dtdVar = new dtd(j6);
            } else {
                dtdVar = b41Var4;
            }
            dxe dxeVar2 = new dxe(f);
            h2eVar = this.L0;
            if (h2eVar == null) {
                h2eVar = new h2e(1, this);
                this.L0 = h2eVar;
            }
            h2eVar2 = h2eVar;
            a82Var = this.M0;
            a82Var.d = dxeVar2;
            if (dtdVar.equals((b41) a82Var.b)) {
                a82Var.b = dtdVar;
                a82Var.e = vs9Var;
                if (vs9Var instanceof ss9) {
                    final ss9 ss9Var2 = (ss9) vs9Var;
                    zt ztVar4 = ss9Var2.a;
                    final hkb hkbVarF2 = ztVar4.f();
                    float f9 = hkbVarF2.b;
                    float f10 = hkbVarF2.d;
                    float f11 = hkbVarF2.a;
                    float f12 = hkbVarF2.c;
                    final float fMin2 = Math.min(Math.abs(f12 - f11), Math.abs(f10 - f9));
                    ztVarA2 = (zt) a82Var.c;
                    if (ztVarA2 == null) {
                        ztVarA2 = cu.a();
                        a82Var.c = ztVarA2;
                    }
                    ztVarA2.k();
                    zt.b(ztVarA2, hkbVarF2);
                    ztVarA2.i(ztVarA2, ztVar4, 0);
                    i = 0;
                    final long jCeil2 = (((long) ((int) Math.ceil(f12 - f11))) << 32) | (((long) ((int) Math.ceil(f10 - f9))) & 4294967295L);
                    final zt ztVar5 = ztVarA2;
                    final b41 b41Var10 = dtdVar;
                    w6Var = new a26() { // from class: l11
                        @Override // defpackage.a26
                        public final Object d(Object obj5) {
                            long j8 = jCeil2;
                            zt ztVar6 = ztVar5;
                            sn4 sn4Var = (sn4) obj5;
                            dxe dxeVar3 = (dxe) a82Var.d;
                            dxeVar3.getClass();
                            float fFloatValue = Float.valueOf(dxeVar3.a).floatValue();
                            float f13 = fFloatValue < 0.0f ? 0.0f : fFloatValue;
                            float f14 = 2.0f * f13;
                            float f15 = fMin2;
                            ss9 ss9Var3 = ss9Var2;
                            b41 b41Var11 = b41Var10;
                            if (f14 > f15) {
                                sn4.s(sn4Var, ss9Var3.a, b41Var11, 0.0f, null, null, 0, 60);
                            } else {
                                ke6 ke6Var = (ke6) h2eVar2.invoke();
                                me6 me6Var = ke6Var.a;
                                if (me6Var.m() != 1) {
                                    me6Var.H(1);
                                }
                                hkb hkbVar = hkbVarF2;
                                float f16 = hkbVar.a;
                                float f17 = hkbVar.b;
                                ((vd9) sn4Var.v0().c).I(f16, f17);
                                try {
                                    sn4Var.F0(j8, new m11(hkbVar, ss9Var3, b41Var11, f13, ztVar6), ke6Var);
                                    i7h.r(sn4Var, ke6Var);
                                } finally {
                                    ((vd9) sn4Var.v0().c).I(-f16, -f17);
                                }
                            }
                            return wef.a;
                        }
                    };
                    a82Var2 = a82Var;
                } else {
                    a82Var2 = a82Var;
                    i = 0;
                    if (vs9Var instanceof us9) {
                        v6cVar = ((us9) vs9Var).a;
                        if (w6c.o(v6cVar)) {
                            k11Var = new w6(a82Var2, v6cVar, dtdVar, 12);
                        } else {
                            ztVarA = (zt) a82Var2.c;
                            if (ztVarA == null) {
                                ztVarA = cu.a();
                                a82Var2.c = ztVarA;
                            }
                            zt ztVar6 = ztVarA;
                            jmb jmbVar2 = new jmb();
                            jmbVar2.element = Float.NaN;
                            k11Var = new k11(a82Var2, v6cVar, jmbVar2, new mmb(), ztVar6, dtdVar, 0);
                        }
                        w6Var = k11Var;
                    } else {
                        if (!(vs9Var instanceof ts9)) {
                            ap.c();
                            return;
                        }
                        w6Var = new w6(a82Var2, ((ts9) vs9Var).a, dtdVar, 13);
                    }
                }
                a82Var2.f = w6Var;
            } else {
                a82Var.b = dtdVar;
                a82Var.e = vs9Var;
                if (vs9Var instanceof ss9) {
                    final ss9 ss9Var3 = (ss9) vs9Var;
                    zt ztVar7 = ss9Var3.a;
                    final hkb hkbVarF3 = ztVar7.f();
                    float f13 = hkbVarF3.b;
                    float f14 = hkbVarF3.d;
                    float f15 = hkbVarF3.a;
                    float f16 = hkbVarF3.c;
                    final float fMin3 = Math.min(Math.abs(f16 - f15), Math.abs(f14 - f13));
                    ztVarA2 = (zt) a82Var.c;
                    if (ztVarA2 == null) {
                        ztVarA2 = cu.a();
                        a82Var.c = ztVarA2;
                    }
                    ztVarA2.k();
                    zt.b(ztVarA2, hkbVarF3);
                    ztVarA2.i(ztVarA2, ztVar7, 0);
                    i = 0;
                    final long jCeil3 = (((long) ((int) Math.ceil(f16 - f15))) << 32) | (((long) ((int) Math.ceil(f14 - f13))) & 4294967295L);
                    final zt ztVar8 = ztVarA2;
                    final b41 b41Var11 = dtdVar;
                    w6Var = new a26() { // from class: l11
                        @Override // defpackage.a26
                        public final Object d(Object obj5) {
                            long j8 = jCeil3;
                            zt ztVar9 = ztVar8;
                            sn4 sn4Var = (sn4) obj5;
                            dxe dxeVar3 = (dxe) a82Var.d;
                            dxeVar3.getClass();
                            float fFloatValue = Float.valueOf(dxeVar3.a).floatValue();
                            float f17 = fFloatValue < 0.0f ? 0.0f : fFloatValue;
                            float f18 = 2.0f * f17;
                            float f19 = fMin3;
                            ss9 ss9Var4 = ss9Var3;
                            b41 b41Var12 = b41Var11;
                            if (f18 > f19) {
                                sn4.s(sn4Var, ss9Var4.a, b41Var12, 0.0f, null, null, 0, 60);
                            } else {
                                ke6 ke6Var = (ke6) h2eVar2.invoke();
                                me6 me6Var = ke6Var.a;
                                if (me6Var.m() != 1) {
                                    me6Var.H(1);
                                }
                                hkb hkbVar = hkbVarF3;
                                float f110 = hkbVar.a;
                                float f111 = hkbVar.b;
                                ((vd9) sn4Var.v0().c).I(f110, f111);
                                try {
                                    sn4Var.F0(j8, new m11(hkbVar, ss9Var4, b41Var12, f17, ztVar9), ke6Var);
                                    i7h.r(sn4Var, ke6Var);
                                } finally {
                                    ((vd9) sn4Var.v0().c).I(-f110, -f111);
                                }
                            }
                            return wef.a;
                        }
                    };
                    a82Var2 = a82Var;
                } else {
                    a82Var2 = a82Var;
                    i = 0;
                    if (vs9Var instanceof us9) {
                        v6cVar = ((us9) vs9Var).a;
                        if (w6c.o(v6cVar)) {
                            k11Var = new w6(a82Var2, v6cVar, dtdVar, 12);
                        } else {
                            ztVarA = (zt) a82Var2.c;
                            if (ztVarA == null) {
                                ztVarA = cu.a();
                                a82Var2.c = ztVarA;
                            }
                            zt ztVar9 = ztVarA;
                            jmb jmbVar3 = new jmb();
                            jmbVar3.element = Float.NaN;
                            k11Var = new k11(a82Var2, v6cVar, jmbVar3, new mmb(), ztVar9, dtdVar, 0);
                        }
                        w6Var = k11Var;
                    } else {
                        if (!(vs9Var instanceof ts9)) {
                            ap.c();
                            return;
                        }
                        w6Var = new w6(a82Var2, ((ts9) vs9Var).a, dtdVar, 13);
                    }
                }
                a82Var2.f = w6Var;
            }
            if (hl9.c(0L, 0L)) {
                a26 a26Var3 = (a26) a82Var2.f;
                a26Var3.getClass();
                a26Var3.d(im2Var);
            } else {
                fIntBitsToFloat = Float.intBitsToFloat(i);
                fIntBitsToFloat2 = Float.intBitsToFloat(i);
                ((vd9) xl1Var.b.c).I(fIntBitsToFloat, fIntBitsToFloat2);
                a26 a26Var4 = (a26) a82Var2.f;
                a26Var4.getClass();
                a26Var4.d(im2Var);
                ((vd9) xl1Var.b.c).I(-fIntBitsToFloat, -fIntBitsToFloat2);
            }
        } else {
            i = 0;
        }
        if (a6eVarQ1.w(56)) {
            if (a6eVarQ1.w(53)) {
                x4dVar = a6eVarQ1.E;
            } else {
                x4dVar = y02Var;
            }
            n4dVarArr = this.U0;
            InnerShadowPainter[] innerShadowPainterArr4 = this.V0;
            z = obj2 instanceof Object[];
            if (z) {
                length = ((Object[]) obj2).length;
            } else {
                length = 1;
            }
            if (n4dVarArr != null) {
                n4dVarArr2 = new n4d[length];
                while (i2 < length) {
                    n4dVarArr2[i2] = null;
                }
                this.U0 = n4dVarArr2;
                innerShadowPainterArr = new InnerShadowPainter[length];
                while (i3 < length) {
                    innerShadowPainterArr[i3] = null;
                }
                this.V0 = innerShadowPainterArr;
            } else {
                n4dVarArr2 = new n4d[length];
                while (i2 < length) {
                    n4dVarArr2[i2] = null;
                }
                this.U0 = n4dVarArr2;
                innerShadowPainterArr = new InnerShadowPainter[length];
                while (i3 < length) {
                    innerShadowPainterArr[i3] = null;
                }
                this.V0 = innerShadowPainterArr;
            }
            if (z) {
                objArr = (Object[]) obj2;
                length2 = objArr.length;
                while (i4 < length2) {
                    obj3 = objArr[i4];
                    if (obj3 instanceof n4d) {
                        p1(vv7Var, i4, x4dVar, (n4d) obj3);
                    }
                }
            } else if (obj2 instanceof n4d) {
                p1(vv7Var, i, x4dVar, (n4d) obj2);
            }
        }
        this.S0 = x4dVar2;
    }

    public final void o1(vv7 vv7Var, int i, x4d x4dVar, n4d n4dVar) {
        n4d[] n4dVarArr = this.W0;
        n4d n4dVar2 = n4dVarArr != null ? (n4d) qd0.q0(i, n4dVarArr) : null;
        DropShadowPainter[] dropShadowPainterArr = this.X0;
        DropShadowPainter dropShadowPainter = dropShadowPainterArr != null ? (DropShadowPainter) qd0.q0(i, dropShadowPainterArr) : null;
        if (!pa7.t(n4dVar2, n4dVar) || dropShadowPainter == null) {
            ta0 ta0VarB = vd0.q0(this).b();
            ta0VarB.getClass();
            dropShadowPainter = new DropShadowPainter(x4dVar, n4dVar, ta0VarB);
        }
        DropShadowPainter dropShadowPainter2 = dropShadowPainter;
        n4d[] n4dVarArr2 = this.W0;
        if (n4dVarArr2 != null) {
            n4dVarArr2[i] = n4dVar;
        }
        DropShadowPainter[] dropShadowPainterArr2 = this.X0;
        if (dropShadowPainterArr2 != null) {
            dropShadowPainterArr2[i] = dropShadowPainter2;
        }
        fy9.h(dropShadowPainter2, vv7Var, vv7Var.a.f(), 0.0f, 6);
    }

    public final void p1(vv7 vv7Var, int i, x4d x4dVar, n4d n4dVar) {
        n4d[] n4dVarArr = this.U0;
        n4d n4dVar2 = n4dVarArr != null ? (n4d) qd0.q0(i, n4dVarArr) : null;
        InnerShadowPainter[] innerShadowPainterArr = this.V0;
        InnerShadowPainter innerShadowPainter = innerShadowPainterArr != null ? (InnerShadowPainter) qd0.q0(i, innerShadowPainterArr) : null;
        if (!pa7.t(n4dVar2, n4dVar) || innerShadowPainter == null) {
            ta0 ta0VarB = vd0.q0(this).b();
            ta0VarB.getClass();
            innerShadowPainter = new InnerShadowPainter(x4dVar, n4dVar, ta0VarB);
        }
        InnerShadowPainter innerShadowPainter2 = innerShadowPainter;
        n4d[] n4dVarArr2 = this.U0;
        if (n4dVarArr2 != null) {
            n4dVarArr2[i] = n4dVar;
        }
        InnerShadowPainter[] innerShadowPainterArr2 = this.V0;
        if (innerShadowPainterArr2 != null) {
            innerShadowPainterArr2[i] = innerShadowPainter2;
        }
        fy9.h(innerShadowPainter2, vv7Var, vv7Var.a.f(), 0.0f, 6);
    }

    @Override // defpackage.i4f
    public final Object q() {
        return "StyleOuterNode";
    }

    public final void r1(boolean z) {
        a6e a6eVar;
        int iR;
        a6e a6eVar2;
        if (this.Y) {
            a6e a6eVar3 = z ? null : this.I0;
            if (z) {
                a6eVar = this.I0;
            } else {
                a6eVar = this.J0;
                if (a6eVar == null) {
                    a6eVar = new a6e();
                    this.J0 = a6eVar;
                }
            }
            a6e a6eVar4 = a6eVar;
            sw3 sw3Var = vd0.s0(this).O0;
            kmb kmbVar = new kmb();
            rxb rxbVar = this.H0;
            t5e t5eVar = rxbVar.Y;
            a6e a6eVar5 = rxbVar.c;
            if (t5eVar == null || a6eVar5 == null) {
                rxbVar.e = null;
            } else {
                long jB = t5eVar.b();
                if (jB != 0) {
                    long j = jB & 2251799813685247L;
                    int i = (int) (jB >> 50);
                    a6e a6eVar6 = new a6e();
                    t5e t5eVar2 = rxbVar.Y;
                    if (t5eVar2 != null && ((a6eVar2 = rxbVar.f) != null || (a6eVar2 = rxbVar.d) != null)) {
                        a6e a6eVar7 = a6eVar2;
                        a6e a6eVar8 = rxbVar.c;
                        if (a6eVar8 != null) {
                            b6e.a(a6eVar7, a6eVar8, t5eVar2, j, i, a6eVar6);
                        }
                    }
                    rxbVar.e = a6eVar6;
                } else {
                    rxbVar.e = null;
                }
            }
            if9.C(this, new m8(this, sw3Var, a6eVar4, a6eVar3, kmbVar, 21));
            int i2 = kmbVar.element;
            if (a6eVar3 != null) {
                long j2 = b6e.b | b6e.c | b6e.d;
                long j3 = b6e.e;
                long j4 = j2 | j3 | b6e.f | b6e.g;
                int i3 = b6e.h | b6e.i | b6e.j;
                int i4 = b6e.k;
                int i5 = i3 | i4 | b6e.l | b6e.m;
                long jI = a6eVar3.i(a6eVar4, j4);
                int iH = a6eVar3.h(i5, a6eVar4);
                iR = b6e.g(jI) | b6e.e(iH);
                if ((iH & 8) != 0 && ((a6eVar3.a & j3) != 0 || (a6eVar3.b & i4) != 0 || (j3 & a6eVar4.a) != 0 || (a6eVar4.b & i4) != 0)) {
                    iR |= 4;
                }
            } else {
                iR = a6eVar4.r();
            }
            int i6 = i2 | iR;
            if (!pa7.t(this.N0.a, this.O0)) {
                lyd lydVar = this.Y0;
                if (lydVar != null) {
                    lydVar.h(null);
                }
                m77 m77Var = this.N0.a;
                this.O0 = m77Var;
                if (m77Var != null) {
                    this.Y0 = ynb.V(Z0(), null, null, new y5e(this, m77Var, null), 3);
                }
            }
            if (z) {
                return;
            }
            if ((i6 & 1) != 0) {
                w5e w5eVar = this.F0;
                if (w5eVar == null) {
                    qc0.p("StyleOuterNode with no corresponding StyleInnerNode");
                    return;
                }
                rs0.F(w5eVar);
            }
            if ((i6 & 8) != 0) {
                rs0.F(this);
            }
            if ((i6 & 2) != 0) {
                qn4.G(this);
                w5e w5eVar2 = this.F0;
                if (w5eVar2 == null) {
                    qc0.p("StyleOuterNode with no corresponding StyleInnerNode");
                    return;
                }
                rs0.E(w5eVar2);
            }
            if ((i6 & 4) != 0) {
                trd trdVar = this.P0;
                if (trdVar == null) {
                    trdVar = new trd(5, this);
                    this.P0 = trdVar;
                }
                rs0.Q(this, trdVar);
            }
            if ((i6 & 16) != 0 && this.a.Y) {
                vd0.s0(this).R();
            }
            if ((i6 & 32) == 0 || !this.a.Y) {
                return;
            }
            vd0.s0(this).O(true);
        }
    }

    @Override // defpackage.tg2
    public final Object s0(b1b b1bVar) {
        return eb3.H(this, b1bVar);
    }
}
