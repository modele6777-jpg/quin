package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class dp6 extends gbe implements o26 {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    /* synthetic */ Object L$2;
    int label;

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        cn6 cn6Var = (cn6) this.L$0;
        h73 h73Var = (h73) this.L$1;
        h73 h73Var2 = (h73) this.L$2;
        if (this.label == 0) {
            jzb.q(obj);
            return cn6.a(cn6Var, h73Var, h73Var2, null, 29695);
        }
        qc0.p("call to 'resume' before 'invoke' with coroutine");
        return null;
    }

    @Override // defpackage.o26
    public final Object t(Object obj, Object obj2, Object obj3, Object obj4) {
        dp6 dp6Var = new dp6(4, (xn2) obj4);
        dp6Var.L$0 = (cn6) obj;
        dp6Var.L$1 = (h73) obj2;
        dp6Var.L$2 = (h73) obj3;
        return dp6Var.r(wef.a);
    }
}
