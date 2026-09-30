package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ey0 extends gbe implements l26 {
    final /* synthetic */ a26 $onSuccess;
    final /* synthetic */ String $phoneNumber;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ey0(xn2 xn2Var, a26 a26Var, String str) {
        super(2, xn2Var);
        this.$onSuccess = a26Var;
        this.$phoneNumber = str;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new ey0(xn2Var, this.$onSuccess, this.$phoneNumber);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        this.$onSuccess.d(this.$phoneNumber);
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        ey0 ey0Var = (ey0) k((xn2) obj2, (aw2) obj);
        wef wefVar = wef.a;
        ey0Var.r(wefVar);
        return wefVar;
    }
}
