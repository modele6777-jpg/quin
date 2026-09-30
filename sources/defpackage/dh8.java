package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class dh8 extends gbe implements a26 {
    final /* synthetic */ uh8 $composition;
    final /* synthetic */ int $iteration;
    final /* synthetic */ float $progress;
    final /* synthetic */ boolean $resetLastFrameNanos;
    int label;
    final /* synthetic */ eh8 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dh8(eh8 eh8Var, uh8 uh8Var, float f, int i, boolean z, xn2 xn2Var) {
        super(1, xn2Var);
        this.this$0 = eh8Var;
        this.$composition = uh8Var;
        this.$progress = f;
        this.$iteration = i;
        this.$resetLastFrameNanos = z;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        dh8 dh8Var = new dh8(this.this$0, this.$composition, this.$progress, this.$iteration, this.$resetLastFrameNanos, (xn2) obj);
        wef wefVar = wef.a;
        dh8Var.r(wefVar);
        return wefVar;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        eh8 eh8Var = this.this$0;
        eh8Var.w.setValue(this.$composition);
        this.this$0.j(this.$progress);
        this.this$0.h(this.$iteration);
        this.this$0.i(false);
        if (this.$resetLastFrameNanos) {
            this.this$0.z.setValue(Long.MIN_VALUE);
        }
        return wef.a;
    }
}
