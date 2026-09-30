package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ire extends gbe implements a26 {
    final /* synthetic */ cre $this_with;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ire(cre creVar, xn2 xn2Var) {
        super(1, xn2Var);
        this.$this_with = creVar;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        ire ireVar = new ire(this.$this_with, (xn2) obj);
        wef wefVar = wef.a;
        ireVar.r(wefVar);
        return wefVar;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        cre creVar = this.$this_with;
        creVar.a(creVar.A);
        return wef.a;
    }
}
