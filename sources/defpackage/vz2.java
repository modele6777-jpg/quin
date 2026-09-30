package defpackage;

import android.graphics.RectF;
import android.view.ScaleGestureDetector;
import com.canhub.cropper.CropOverlayView;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class vz2 extends ScaleGestureDetector.SimpleOnScaleGestureListener {
    public final /* synthetic */ CropOverlayView a;

    public vz2(CropOverlayView cropOverlayView) {
        this.a = cropOverlayView;
    }

    @Override // android.view.ScaleGestureDetector.SimpleOnScaleGestureListener, android.view.ScaleGestureDetector.OnScaleGestureListener
    public final boolean onScale(ScaleGestureDetector scaleGestureDetector) {
        scaleGestureDetector.getClass();
        CropOverlayView cropOverlayView = this.a;
        xz2 xz2Var = cropOverlayView.g;
        xz2 xz2Var2 = cropOverlayView.g;
        RectF rectFG = xz2Var.g();
        float focusX = scaleGestureDetector.getFocusX();
        float focusY = scaleGestureDetector.getFocusY();
        float currentSpanY = scaleGestureDetector.getCurrentSpanY() / 2.0f;
        float currentSpanX = scaleGestureDetector.getCurrentSpanX() / 2.0f;
        float f = focusY - currentSpanY;
        float f2 = focusX - currentSpanX;
        float f3 = focusX + currentSpanX;
        float f4 = focusY + currentSpanY;
        if (f2 >= f3 || f > f4 || f2 < 0.0f || f3 > xz2Var2.c() || f < 0.0f || f4 > xz2Var2.b()) {
            return true;
        }
        rectFG.set(f2, f, f3, f4);
        xz2Var2.getClass();
        xz2Var2.a.set(rectFG);
        cropOverlayView.invalidate();
        return true;
    }
}
