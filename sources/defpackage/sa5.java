package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class sa5 extends AnimatorListenerAdapter {
    public boolean a = false;
    public final /* synthetic */ ua5 b;

    public sa5(ua5 ua5Var) {
        this.b = ua5Var;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.a = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        if (this.a) {
            this.a = false;
            return;
        }
        ua5 ua5Var = this.b;
        if (((Float) ua5Var.z.getAnimatedValue()).floatValue() == 0.0f) {
            ua5Var.A = 0;
            ua5Var.d(0);
        } else {
            ua5Var.A = 2;
            ua5Var.s.invalidate();
        }
    }
}
