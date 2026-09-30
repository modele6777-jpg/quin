package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewPropertyAnimator;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ir3 extends AnimatorListenerAdapter {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ flb b;
    public final /* synthetic */ View c;
    public final /* synthetic */ ViewPropertyAnimator d;
    public final /* synthetic */ nr3 e;

    public ir3(nr3 nr3Var, flb flbVar, ViewPropertyAnimator viewPropertyAnimator, View view) {
        this.e = nr3Var;
        this.b = flbVar;
        this.d = viewPropertyAnimator;
        this.c = view;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 1:
                this.c.setAlpha(1.0f);
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        int i = this.a;
        flb flbVar = this.b;
        nr3 nr3Var = this.e;
        ViewPropertyAnimator viewPropertyAnimator = this.d;
        switch (i) {
            case 0:
                viewPropertyAnimator.setListener(null);
                this.c.setAlpha(1.0f);
                nr3Var.c(flbVar);
                nr3Var.q.remove(flbVar);
                nr3Var.i();
                break;
            default:
                viewPropertyAnimator.setListener(null);
                nr3Var.c(flbVar);
                nr3Var.o.remove(flbVar);
                nr3Var.i();
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        switch (this.a) {
            case 0:
                this.e.getClass();
                break;
            default:
                this.e.getClass();
                break;
        }
    }

    public ir3(nr3 nr3Var, flb flbVar, View view, ViewPropertyAnimator viewPropertyAnimator) {
        this.e = nr3Var;
        this.b = flbVar;
        this.c = view;
        this.d = viewPropertyAnimator;
    }
}
