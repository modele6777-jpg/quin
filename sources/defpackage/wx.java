package defpackage;

import com.adjust.sdk.sig.r3;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class wx extends gbe implements l26 {
    final /* synthetic */ float $actualSpeed;
    final /* synthetic */ ug8 $animatable;
    final /* synthetic */ sh8 $cancellationBehavior;
    final /* synthetic */ th8 $clipSpec;
    final /* synthetic */ uh8 $composition;
    final /* synthetic */ boolean $isPlaying;
    final /* synthetic */ int $iterations;
    final /* synthetic */ boolean $restartOnPlay;
    final /* synthetic */ boolean $reverseOnRepeat;
    final /* synthetic */ boolean $useCompositionFrameRate;
    final /* synthetic */ e89 $wasPlaying$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wx(boolean z, boolean z2, ug8 ug8Var, uh8 uh8Var, int i, boolean z3, float f, sh8 sh8Var, boolean z4, e89 e89Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.$isPlaying = z;
        this.$restartOnPlay = z2;
        this.$animatable = ug8Var;
        this.$composition = uh8Var;
        this.$iterations = i;
        this.$reverseOnRepeat = z3;
        this.$actualSpeed = f;
        this.$cancellationBehavior = sh8Var;
        this.$useCompositionFrameRate = z4;
        this.$wasPlaying$delegate = e89Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new wx(this.$isPlaying, this.$restartOnPlay, this.$animatable, this.$composition, this.$iterations, this.$reverseOnRepeat, this.$actualSpeed, this.$cancellationBehavior, this.$useCompositionFrameRate, this.$wasPlaying$delegate, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i = this.label;
        wef wefVar = wef.a;
        bw2 bw2Var = bw2.a;
        if (i == 0) {
            jzb.q(obj);
            if (this.$isPlaying && !((Boolean) this.$wasPlaying$delegate.getValue()).booleanValue() && this.$restartOnPlay) {
                ug8 ug8Var = this.$animatable;
                this.label = 1;
                eh8 eh8Var = (eh8) ug8Var;
                uh8 uh8Var = (uh8) eh8Var.w.getValue();
                if (eh8Var.e.getValue() != null) {
                    r3.f();
                    return null;
                }
                float fFloatValue = ((Number) eh8Var.f.getValue()).floatValue();
                float f = 0.0f;
                if ((fFloatValue < 0.0f && uh8Var == null) || (uh8Var != null && fFloatValue < 0.0f)) {
                    f = 1.0f;
                }
                float f2 = f;
                Object objA = b99.a(eh8Var.Y, new dh8(eh8Var, (uh8) eh8Var.w.getValue(), f2, 1, !(f2 == eh8Var.d()), null), this);
                if (objA != bw2Var) {
                    objA = wefVar;
                }
                if (objA != bw2Var) {
                    objA = wefVar;
                }
                if (objA != bw2Var) {
                }
            }
            return bw2Var;
        }
        if (i != 1) {
            if (i == 2) {
                jzb.q(obj);
                return wefVar;
            }
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        this.$wasPlaying$delegate.setValue(Boolean.valueOf(this.$isPlaying));
        if (this.$isPlaying) {
            ug8 ug8Var2 = this.$animatable;
            uh8 uh8Var2 = this.$composition;
            int i2 = this.$iterations;
            boolean z = this.$reverseOnRepeat;
            float f3 = this.$actualSpeed;
            eh8 eh8Var2 = (eh8) ug8Var2;
            float fD = eh8Var2.d();
            sh8 sh8Var = this.$cancellationBehavior;
            boolean z2 = this.$useCompositionFrameRate;
            this.label = 2;
            Object objA2 = b99.a(eh8Var2.Y, new xg8(eh8Var2, eh8Var2.c(), i2, z, f3, uh8Var2, fD, z2, false, sh8Var, null), this);
            if (objA2 != bw2Var) {
                objA2 = wefVar;
            }
            if (objA2 == bw2Var) {
                return bw2Var;
            }
        }
        return wefVar;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((wx) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
