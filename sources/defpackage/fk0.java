package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class fk0 extends gbe implements l26 {
    final /* synthetic */ float $level;
    final /* synthetic */ kmb $sampleCounter;
    int label;
    final /* synthetic */ gk0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fk0(kmb kmbVar, gk0 gk0Var, float f, xn2 xn2Var) {
        super(2, xn2Var);
        this.$sampleCounter = kmbVar;
        this.this$0 = gk0Var;
        this.$level = f;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new fk0(this.$sampleCounter, this.this$0, this.$level, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        this.$sampleCounter.element++;
        gk0 gk0Var = this.this$0;
        int i = gk0.z;
        gk0Var.getClass();
        goa goaVar = this.this$0.x;
        if (goaVar != null) {
            goaVar.d(new Float(this.$level));
        }
        if (this.$sampleCounter.element % 6 == 0) {
            this.this$0.d.add(new Float(this.$level));
        }
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        fk0 fk0Var = (fk0) k((xn2) obj2, (aw2) obj);
        wef wefVar = wef.a;
        fk0Var.r(wefVar);
        return wefVar;
    }
}
