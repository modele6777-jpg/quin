package defpackage;

import android.animation.ValueAnimator;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ta5 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ ua5 a;

    public ta5(ua5 ua5Var) {
        this.a = ua5Var;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int iFloatValue = (int) (((Float) valueAnimator.getAnimatedValue()).floatValue() * 255.0f);
        ua5 ua5Var = this.a;
        ua5Var.c.setAlpha(iFloatValue);
        ua5Var.d.setAlpha(iFloatValue);
        ua5Var.s.invalidate();
    }
}
