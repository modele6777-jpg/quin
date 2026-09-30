package defpackage;

import android.view.View;
import android.view.WindowInsetsAnimation;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class l7g extends m7g {
    public final WindowInsetsAnimation e;

    public l7g(WindowInsetsAnimation windowInsetsAnimation) {
        super(0, null, 0L);
        this.e = windowInsetsAnimation;
    }

    public static x47 f(WindowInsetsAnimation.Bounds bounds) {
        return x47.c(bounds.getUpperBound());
    }

    public static x47 g(WindowInsetsAnimation.Bounds bounds) {
        return x47.c(bounds.getLowerBound());
    }

    public static void h(View view, h72 h72Var) {
        view.setWindowInsetsAnimationCallback(h72Var != null ? new k7g(h72Var) : null);
    }

    @Override // defpackage.m7g
    public final float a() {
        return this.e.getAlpha();
    }

    @Override // defpackage.m7g
    public final long b() {
        return this.e.getDurationMillis();
    }

    @Override // defpackage.m7g
    public final float c() {
        return this.e.getInterpolatedFraction();
    }

    @Override // defpackage.m7g
    public final int d() {
        return this.e.getTypeMask();
    }

    @Override // defpackage.m7g
    public final void e(float f) {
        this.e.setFraction(f);
    }
}
