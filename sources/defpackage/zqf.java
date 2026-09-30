package defpackage;

import android.graphics.drawable.Animatable2;
import android.graphics.drawable.Drawable;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class zqf extends Animatable2.AnimationCallback {
    public final /* synthetic */ x16 a;
    public final /* synthetic */ x16 b;

    public zqf(x16 x16Var, x16 x16Var2) {
        this.a = x16Var;
        this.b = x16Var2;
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationEnd(Drawable drawable) {
        x16 x16Var = this.b;
        if (x16Var != null) {
            x16Var.invoke();
        }
    }

    @Override // android.graphics.drawable.Animatable2.AnimationCallback
    public final void onAnimationStart(Drawable drawable) {
        x16 x16Var = this.a;
        if (x16Var != null) {
            x16Var.invoke();
        }
    }
}
