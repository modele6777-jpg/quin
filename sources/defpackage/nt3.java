package defpackage;

import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class nt3 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Drawable.Callback b;

    public /* synthetic */ nt3(Drawable.Callback callback, int i) {
        this.a = i;
        this.b = callback;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.a;
        Drawable.Callback callback = this.b;
        switch (i) {
            case 0:
                ot3 ot3Var = (ot3) callback;
                ot3Var.X0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ot3Var.invalidate(ot3Var.a);
                break;
            default:
                oi8 oi8Var = (oi8) callback;
                jh0 jh0Var = oi8Var.W0;
                if (jh0Var == null) {
                    jh0Var = jh0.a;
                }
                if (jh0Var != jh0.b) {
                    sg2 sg2Var = oi8Var.z;
                    if (sg2Var != null) {
                        sg2Var.n(oi8Var.b.a());
                    }
                } else {
                    oi8Var.invalidateSelf();
                }
                break;
        }
    }
}
