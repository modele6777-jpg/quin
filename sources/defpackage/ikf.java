package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ikf extends gbe implements l26 {
    final /* synthetic */ ju3 $e;
    final /* synthetic */ c0d $sessionConfigAdapter;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ikf(c0d c0dVar, ju3 ju3Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.$sessionConfigAdapter = c0dVar;
        this.$e = ju3Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new ikf(this.$sessionConfigAdapter, this.$e, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        c0d c0dVar = this.$sessionConfigAdapter;
        lu3 lu3VarA = this.$e.a();
        lu3VarA.getClass();
        c0dVar.a(lu3VarA);
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        ikf ikfVar = (ikf) k((xn2) obj2, (aw2) obj);
        wef wefVar = wef.a;
        ikfVar.r(wefVar);
        return wefVar;
    }
}
