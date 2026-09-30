package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class iw0 extends gbe implements l26 {
    final /* synthetic */ d0f $state;
    /* synthetic */ boolean Z$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iw0(d0f d0fVar, xn2 xn2Var) {
        super(2, xn2Var);
        this.$state = d0fVar;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        iw0 iw0Var = new iw0(this.$state, xn2Var);
        iw0Var.Z$0 = ((Boolean) obj).booleanValue();
        return iw0Var;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        if (!this.Z$0) {
            ((h0f) this.$state).a();
        }
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        iw0 iw0Var = (iw0) k((xn2) obj2, bool);
        wef wefVar = wef.a;
        iw0Var.r(wefVar);
        return wefVar;
    }
}
