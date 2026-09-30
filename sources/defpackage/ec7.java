package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ec7 extends gbe implements l26 {
    final /* synthetic */ a26 $onRequireSignIn;
    final /* synthetic */ oc7 $vm;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ec7(a26 a26Var, oc7 oc7Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.$onRequireSignIn = a26Var;
        this.$vm = oc7Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new ec7(this.$onRequireSignIn, this.$vm, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        this.$onRequireSignIn.d(new zv6(5, this.$vm));
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        ec7 ec7Var = (ec7) k((xn2) obj2, (aw2) obj);
        wef wefVar = wef.a;
        ec7Var.r(wefVar);
        return wefVar;
    }
}
