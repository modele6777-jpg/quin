package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class s30 extends gbe implements n26 {
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    @Override // defpackage.n26
    public final Object m(Object obj, Object obj2, Object obj3) {
        s30 s30Var = new s30(3, (xn2) obj3);
        s30Var.L$0 = (xj5) obj;
        s30Var.L$1 = (Throwable) obj2;
        return s30Var.r(wef.a);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        xj5 xj5Var = (xj5) this.L$0;
        Throwable th = (Throwable) this.L$1;
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            i40 i40Var = new i40(th);
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            Object objA = xj5Var.a(i40Var, this);
            bw2 bw2Var = bw2.a;
            if (objA == bw2Var) {
                return bw2Var;
            }
        } else {
            if (i != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(obj);
        }
        return wef.a;
    }
}
