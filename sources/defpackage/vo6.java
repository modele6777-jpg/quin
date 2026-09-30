package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class vo6 extends gbe implements n26 {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    @Override // defpackage.n26
    public final Object m(Object obj, Object obj2, Object obj3) {
        vo6 vo6Var = new vo6(3, (xn2) obj3);
        vo6Var.L$0 = (String) obj;
        vo6Var.L$1 = (b93) obj2;
        return vo6Var.r(wef.a);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        String str = (String) this.L$0;
        b93 b93Var = (b93) this.L$1;
        if (this.label == 0) {
            jzb.q(obj);
            return new iy9(str, b93Var);
        }
        qc0.p("call to 'resume' before 'invoke' with coroutine");
        return null;
    }
}
