package defpackage;

import android.graphics.drawable.Drawable;
import android.os.Handler;
import com.google.accompanist.drawablepainter.DrawablePainter;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class bo4 implements Drawable.Callback {
    public final /* synthetic */ DrawablePainter a;

    public bo4(DrawablePainter drawablePainter) {
        this.a = drawablePainter;
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        drawable.getClass();
        DrawablePainter drawablePainter = this.a;
        vz9 vz9Var = drawablePainter.g;
        vz9Var.setValue(Integer.valueOf(((Number) vz9Var.getValue()).intValue() + 1));
        Drawable drawable2 = drawablePainter.f;
        lw7 lw7Var = co4.a;
        drawablePainter.v.setValue(new ald((drawable2.getIntrinsicWidth() < 0 || drawable2.getIntrinsicHeight() < 0) ? 9205357640488583168L : dec.a(drawable2.getIntrinsicWidth(), drawable2.getIntrinsicHeight())));
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        drawable.getClass();
        runnable.getClass();
        ((Handler) co4.a.getValue()).postAtTime(runnable, j);
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        drawable.getClass();
        runnable.getClass();
        ((Handler) co4.a.getValue()).removeCallbacks(runnable);
    }
}
