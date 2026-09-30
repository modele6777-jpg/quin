package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class dj4 extends gbe implements l26 {
    int label;

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new dj4(2, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        tj7 tj7Var = tj7.L0;
        ca2.a.getClass();
        if (ca2.c) {
            x1f x1fVar = x1f.a;
            x1f.k(new r05("onboarding_divination_start"), tj7Var, 2);
        }
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        dj4 dj4Var = (dj4) k((xn2) obj2, (aw2) obj);
        wef wefVar = wef.a;
        dj4Var.r(wefVar);
        return wefVar;
    }
}
