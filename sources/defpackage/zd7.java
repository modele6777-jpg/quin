package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class zd7 extends gbe implements l26 {
    final /* synthetic */ a26 $transform;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zd7(xn2 xn2Var, a26 a26Var) {
        super(2, xn2Var);
        this.$transform = a26Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        zd7 zd7Var = new zd7(xn2Var, this.$transform);
        zd7Var.L$0 = obj;
        return zd7Var;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        this.$transform.d((p79) this.L$0);
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        zd7 zd7Var = (zd7) k((xn2) obj2, (p79) obj);
        wef wefVar = wef.a;
        zd7Var.r(wefVar);
        return wefVar;
    }
}
