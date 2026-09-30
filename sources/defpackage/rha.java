package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.ActionBarOverlayLayout;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class rha extends AnimatorListenerAdapter {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ rha(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationCancel(Animator animator) {
        switch (this.a) {
            case 6:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.b;
                actionBarOverlayLayout.R0 = null;
                actionBarOverlayLayout.x = false;
                break;
            default:
                super.onAnimationCancel(animator);
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationEnd(Animator animator) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                tha thaVar = (tha) obj;
                View view = thaVar.b;
                if (view != null) {
                    view.setVisibility(4);
                }
                ViewGroup viewGroup = thaVar.c;
                if (viewGroup != null) {
                    viewGroup.setVisibility(4);
                }
                ViewGroup viewGroup2 = thaVar.d;
                if (viewGroup2 != null) {
                    viewGroup2.setVisibility(4);
                }
                ViewGroup viewGroup3 = thaVar.f;
                if (viewGroup3 != null) {
                    viewGroup3.setVisibility(4);
                }
                break;
            case 1:
            default:
                super.onAnimationEnd(animator);
                break;
            case 2:
                ((tha) obj).i(0);
                break;
            case 3:
                ((tha) obj).i(0);
                break;
            case 4:
                ViewGroup viewGroup4 = ((tha) obj).g;
                if (viewGroup4 != null) {
                    viewGroup4.setVisibility(4);
                }
                break;
            case 5:
                ViewGroup viewGroup5 = ((tha) obj).i;
                if (viewGroup5 != null) {
                    viewGroup5.setVisibility(4);
                }
                break;
            case 6:
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) obj;
                actionBarOverlayLayout.R0 = null;
                actionBarOverlayLayout.x = false;
                break;
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public void onAnimationStart(Animator animator) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                tha thaVar = (tha) obj;
                View view = thaVar.k;
                if ((view instanceof ot3) && !thaVar.B) {
                    ot3 ot3Var = (ot3) view;
                    ValueAnimator valueAnimator = ot3Var.W0;
                    if (valueAnimator.isStarted()) {
                        valueAnimator.cancel();
                    }
                    valueAnimator.setFloatValues(ot3Var.X0, 0.0f);
                    valueAnimator.setDuration(250L);
                    valueAnimator.start();
                    break;
                }
                break;
            case 1:
                tha thaVar2 = (tha) obj;
                View view2 = thaVar2.b;
                if (view2 != null) {
                    view2.setVisibility(0);
                }
                ViewGroup viewGroup = thaVar2.c;
                if (viewGroup != null) {
                    viewGroup.setVisibility(0);
                }
                ViewGroup viewGroup2 = thaVar2.d;
                if (viewGroup2 != null) {
                    viewGroup2.setVisibility(0);
                }
                ViewGroup viewGroup3 = thaVar2.f;
                if (viewGroup3 != null) {
                    viewGroup3.setVisibility(thaVar2.B ? 0 : 4);
                }
                View view3 = thaVar2.k;
                if ((view3 instanceof ot3) && !thaVar2.B) {
                    ot3 ot3Var2 = (ot3) view3;
                    ValueAnimator valueAnimator2 = ot3Var2.W0;
                    if (valueAnimator2.isStarted()) {
                        valueAnimator2.cancel();
                    }
                    ot3Var2.Y0 = false;
                    valueAnimator2.setFloatValues(ot3Var2.X0, 1.0f);
                    valueAnimator2.setDuration(250L);
                    valueAnimator2.start();
                    break;
                }
                break;
            case 2:
                ((tha) obj).i(4);
                break;
            case 3:
                ((tha) obj).i(4);
                break;
            case 4:
                ViewGroup viewGroup4 = ((tha) obj).i;
                if (viewGroup4 != null) {
                    viewGroup4.setVisibility(0);
                    viewGroup4.setTranslationX(viewGroup4.getWidth());
                    viewGroup4.scrollTo(viewGroup4.getWidth(), 0);
                }
                break;
            case 5:
                ViewGroup viewGroup5 = ((tha) obj).g;
                if (viewGroup5 != null) {
                    viewGroup5.setVisibility(0);
                }
                break;
            default:
                super.onAnimationStart(animator);
                break;
        }
    }
}
