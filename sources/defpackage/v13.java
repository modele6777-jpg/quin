package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class v13 extends gbe implements l26 {
    final /* synthetic */ a26 $block$inlined;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v13(xn2 xn2Var, a26 a26Var) {
        super(2, xn2Var);
        this.$block$inlined = a26Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        v13 v13Var = new v13(xn2Var, this.$block$inlined);
        v13Var.L$0 = obj;
        return v13Var;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        v0a v0aVar = (v0a) this.L$0;
        v0aVar.getClass();
        return this.$block$inlined.d(v0aVar.c());
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((v13) k((xn2) obj2, (v0a) obj)).r(wef.a);
    }
}
