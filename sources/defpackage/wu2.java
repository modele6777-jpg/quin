package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class wu2 implements xn8 {
    public final /* synthetic */ r38 a;
    public final /* synthetic */ cre b;
    public final /* synthetic */ e7g c;
    public final /* synthetic */ aw2 d;
    public final /* synthetic */ a26 e;
    public final /* synthetic */ zse f;
    public final /* synthetic */ sl9 g;
    public final /* synthetic */ sw3 h;
    public final /* synthetic */ k31 i;
    public final /* synthetic */ int j;

    public wu2(r38 r38Var, cre creVar, e7g e7gVar, aw2 aw2Var, a26 a26Var, zse zseVar, sl9 sl9Var, sw3 sw3Var, k31 k31Var, int i) {
        this.a = r38Var;
        this.b = creVar;
        this.c = e7gVar;
        this.d = aw2Var;
        this.e = a26Var;
        this.f = zseVar;
        this.g = sl9Var;
        this.h = sw3Var;
        this.i = k31Var;
        this.j = i;
    }

    @Override // defpackage.xn8
    public final int a(ga7 ga7Var, List list, int i) {
        r38 r38Var = this.a;
        r38Var.a.b(((yf9) ga7Var).J0.P0);
        a82 a82Var = (a82) r38Var.a.g;
        if (a82Var != null) {
            return gdc.c(a82Var.i());
        }
        qc0.p("layoutIntrinsics must be called first");
        return 0;
    }

    /* JADX WARN: Code duplicated, block: B:47:0x0106  */
    /* JADX WARN: Code duplicated, block: B:57:0x0122  */
    /* JADX WARN: Code duplicated, block: B:59:0x0128  */
    /* JADX WARN: Code duplicated, block: B:62:0x013e  */
    /* JADX WARN: Code duplicated, block: B:96:0x02c9  */
    /* JADX WARN: Code duplicated, block: B:98:0x02cf  */
    @Override // defpackage.xn8
    public final yn8 b(zn8 zn8Var, List list, long j) {
        ste steVar;
        int iJ;
        a82 a82Var;
        ste steVar2;
        ste steVar3;
        a82 a82Var2;
        wu2 wu2Var;
        r38 r38Var;
        r38 r38Var2 = this.a;
        ird irdVarJ = iqf.j();
        a26 a26VarE = irdVarJ != null ? irdVarJ.e() : null;
        ird irdVarL = iqf.l(irdVarJ);
        try {
            tte tteVarD = r38Var2.d();
            iqf.p(irdVarJ, irdVarL, a26VarE);
            ste steVar4 = tteVarD != null ? tteVarD.a : null;
            o74 o74Var = r38Var2.a;
            cv7 layoutDirection = zn8Var.getLayoutDirection();
            boolean z = o74Var.a;
            int iO = Integer.MAX_VALUE;
            if (steVar4 != null) {
                b59 b59Var = steVar4.b;
                rte rteVar = steVar4.a;
                k00 k00Var = (k00) o74Var.b;
                mue mueVar = (mue) o74Var.c;
                List list2 = (List) o74Var.f;
                sw3 sw3Var = (sw3) o74Var.d;
                xp5 xp5Var = (xp5) o74Var.e;
                if (b59Var.a.e()) {
                    steVar = steVar4;
                } else {
                    k00 k00Var2 = rteVar.a;
                    ste steVar5 = steVar4;
                    long j2 = rteVar.j;
                    if (pa7.t(k00Var2, k00Var) && rteVar.b.d(mueVar) && pa7.t(rteVar.c, list2) && rteVar.d == Integer.MAX_VALUE && rteVar.e == z && rteVar.f == 1 && pa7.t(rteVar.g, sw3Var) && rteVar.h == layoutDirection && pa7.t(rteVar.i, xp5Var) && kl2.j(j) == kl2.j(j2) && (!z || (kl2.h(j) == kl2.h(j2) && kl2.g(j) == kl2.g(j2)))) {
                        steVar3 = new ste(new rte(rteVar.a, (mue) o74Var.c, rteVar.c, rteVar.d, rteVar.e, rteVar.f, rteVar.g, rteVar.h, rteVar.i, j), b59Var, ll2.d(j, (((long) gdc.c(b59Var.e)) & 4294967295L) | (((long) gdc.c(b59Var.d)) << 32)));
                        steVar2 = steVar5;
                    } else {
                        steVar = steVar5;
                    }
                }
                o74Var.b(layoutDirection);
                iJ = kl2.j(j);
                if (z && kl2.d(j)) {
                    iO = kl2.h(j);
                }
                if (iJ != iO) {
                    a82Var2 = (a82) o74Var.g;
                    if (a82Var2 != null) {
                        qc0.p("layoutIntrinsics must be called first");
                        return null;
                    }
                    iO = mh3.o(gdc.c(a82Var2.i()), iJ, iO);
                }
                a82Var = (a82) o74Var.g;
                if (a82Var != null) {
                    qc0.p("layoutIntrinsics must be called first");
                    return null;
                }
                b59 b59Var2 = new b59(a82Var, pa7.S(0, iO, 0, kl2.g(j)), Integer.MAX_VALUE, 1);
                steVar2 = steVar;
                steVar3 = new ste(new rte((k00) o74Var.b, (mue) o74Var.c, (List) o74Var.f, Integer.MAX_VALUE, o74Var.a, 1, (sw3) o74Var.d, layoutDirection, (xp5) o74Var.e, j), b59Var2, ll2.d(j, (((long) gdc.c(b59Var2.d)) << 32) | (((long) gdc.c(b59Var2.e)) & 4294967295L)));
            } else {
                steVar = steVar4;
                o74Var.b(layoutDirection);
                iJ = kl2.j(j);
                if (z) {
                    iO = kl2.h(j);
                }
                if (iJ != iO) {
                    a82Var2 = (a82) o74Var.g;
                    if (a82Var2 != null) {
                        qc0.p("layoutIntrinsics must be called first");
                        return null;
                    }
                    iO = mh3.o(gdc.c(a82Var2.i()), iJ, iO);
                }
                a82Var = (a82) o74Var.g;
                if (a82Var != null) {
                    qc0.p("layoutIntrinsics must be called first");
                    return null;
                }
                b59 b59Var3 = new b59(a82Var, pa7.S(0, iO, 0, kl2.g(j)), Integer.MAX_VALUE, 1);
                steVar2 = steVar;
                steVar3 = new ste(new rte((k00) o74Var.b, (mue) o74Var.c, (List) o74Var.f, Integer.MAX_VALUE, o74Var.a, 1, (sw3) o74Var.d, layoutDirection, (xp5) o74Var.e, j), b59Var3, ll2.d(j, (((long) gdc.c(b59Var3.d)) << 32) | (((long) gdc.c(b59Var3.e)) & 4294967295L)));
            }
            long j3 = steVar3.c;
            m5f m5fVar = new m5f(Integer.valueOf((int) (j3 >> 32)), Integer.valueOf((int) (j3 & 4294967295L)), steVar3);
            int iIntValue = ((Number) m5fVar.a()).intValue();
            int iIntValue2 = ((Number) m5fVar.b()).intValue();
            ste steVar6 = (ste) m5fVar.c();
            steVar6.b.a.e();
            ste steVar7 = steVar2;
            if (pa7.t(steVar7, steVar6)) {
                wu2Var = this;
                r38Var = r38Var2;
            } else {
                r38Var = r38Var2;
                r38Var.i.setValue(new tte(steVar6, tteVarD != 0 ? tteVarD.c : null));
                r38Var.p = false;
                wu2Var = this;
                cre creVar = wu2Var.b;
                if (creVar.i() && creVar.h() && ((b28) wu2Var.c).a() && eue.d(((eue) r38Var.A.getValue()).a) && eue.d(((eue) r38Var.B.getValue()).a) && r38Var.b()) {
                    if (!pa7.t(steVar7 != null ? steVar7.a.a : null, steVar6.a.a)) {
                        ynb.V(wu2Var.d, null, null, new vu2(creVar, wu2Var.i, null), 3);
                    }
                }
                wu2Var.e.d(steVar6);
                lmg.n0(r38Var, wu2Var.f, wu2Var.g);
            }
            r38Var.g.setValue(new yi4(wu2Var.h.Z(wu2Var.j == 1 ? gdc.c(steVar6.b.b(0)) : 0)));
            return zn8Var.n0(iIntValue, iIntValue2, bm8.H(new iy9(cj.a, Integer.valueOf(Math.round(steVar6.d))), new iy9(cj.b, Integer.valueOf(Math.round(steVar6.e)))), new cz1(19));
        } catch (Throwable th) {
            iqf.p(irdVarJ, irdVarL, a26VarE);
            throw th;
        }
    }
}
