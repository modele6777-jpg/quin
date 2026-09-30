package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class xg8 extends gbe implements a26 {
    final /* synthetic */ sh8 $cancellationBehavior;
    final /* synthetic */ th8 $clipSpec;
    final /* synthetic */ uh8 $composition;
    final /* synthetic */ boolean $continueFromPreviousAnimate;
    final /* synthetic */ float $initialProgress;
    final /* synthetic */ int $iteration;
    final /* synthetic */ int $iterations;
    final /* synthetic */ boolean $reverseOnRepeat;
    final /* synthetic */ float $speed;
    final /* synthetic */ boolean $useCompositionFrameRate;
    int label;
    final /* synthetic */ eh8 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xg8(eh8 eh8Var, int i, int i2, boolean z, float f, uh8 uh8Var, float f2, boolean z2, boolean z3, sh8 sh8Var, xn2 xn2Var) {
        super(1, xn2Var);
        this.this$0 = eh8Var;
        this.$iteration = i;
        this.$iterations = i2;
        this.$reverseOnRepeat = z;
        this.$speed = f;
        this.$composition = uh8Var;
        this.$initialProgress = f2;
        this.$useCompositionFrameRate = z2;
        this.$continueFromPreviousAnimate = z3;
        this.$cancellationBehavior = sh8Var;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        return new xg8(this.this$0, this.$iteration, this.$iterations, this.$reverseOnRepeat, this.$speed, this.$composition, this.$initialProgress, this.$useCompositionFrameRate, this.$continueFromPreviousAnimate, this.$cancellationBehavior, (xn2) obj).r(wef.a);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        pv2 pv2Var;
        int i = this.label;
        wef wefVar = wef.a;
        try {
            if (i == 0) {
                jzb.q(obj);
                this.this$0.h(this.$iteration);
                this.this$0.c.setValue(Integer.valueOf(this.$iterations));
                this.this$0.d.setValue(Boolean.valueOf(this.$reverseOnRepeat));
                this.this$0.f.setValue(Float.valueOf(this.$speed));
                this.this$0.e.setValue(null);
                eh8 eh8Var = this.this$0;
                eh8Var.w.setValue(this.$composition);
                this.this$0.j(this.$initialProgress);
                this.this$0.g.setValue(Boolean.valueOf(this.$useCompositionFrameRate));
                if (!this.$continueFromPreviousAnimate) {
                    this.this$0.z.setValue(Long.MIN_VALUE);
                }
                if (this.$composition == null) {
                    this.this$0.i(false);
                    return wefVar;
                }
                boolean zIsInfinite = Float.isInfinite(this.$speed);
                eh8 eh8Var2 = this.this$0;
                if (zIsInfinite) {
                    eh8Var2.j(((Number) eh8Var2.X.getValue()).floatValue());
                    this.this$0.i(false);
                    this.this$0.h(this.$iterations);
                    return wefVar;
                }
                eh8Var2.i(true);
                int iOrdinal = this.$cancellationBehavior.ordinal();
                if (iOrdinal == 0) {
                    pv2Var = nu4.a;
                } else {
                    if (iOrdinal != 1) {
                        throw new rf9();
                    }
                    pv2Var = fg9.b;
                }
                wg8 wg8Var = new wg8(this.$cancellationBehavior, tq.z(getContext()), this.$iterations, this.$iteration, this.this$0, null);
                this.label = 1;
                Object objP0 = ynb.p0(pv2Var, wg8Var, this);
                bw2 bw2Var = bw2.a;
                if (objP0 == bw2Var) {
                    return bw2Var;
                }
            } else {
                if (i != 1) {
                    qc0.p("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                jzb.q(obj);
            }
            tq.v(getContext());
            this.this$0.i(false);
            return wefVar;
        } catch (Throwable th) {
            this.this$0.i(false);
            throw th;
        }
    }
}
