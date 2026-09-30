package defpackage;

import android.graphics.SurfaceTexture;
import android.util.Log;
import android.view.Surface;
import android.view.TextureView;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class cxf extends TextureView {
    @Override // android.view.TextureView, android.view.View
    public final void onAttachedToWindow() {
        bxf bxfVar;
        super.onAttachedToWindow();
        TextureView.SurfaceTextureListener surfaceTextureListener = getSurfaceTextureListener();
        dxf dxfVar = surfaceTextureListener instanceof dxf ? (dxf) surfaceTextureListener : null;
        if (dxfVar == null || (bxfVar = dxfVar.e) == null) {
            return;
        }
        SurfaceTexture surfaceTexture = (SurfaceTexture) bxfVar.d;
        if (!bxfVar.c) {
            Log.d("VfEmbeddedSurface", "Unable to reattach " + surfaceTexture + " to " + this + ". Still attached.");
            return;
        }
        if (((Surface) bxfVar.b.a()) == null) {
            Log.d("VfEmbeddedSurface", "Unable to reattach " + surfaceTexture + " to " + this + ". Already released.");
            return;
        }
        setSurfaceTexture(surfaceTexture);
        Log.d("VfEmbeddedSurface", "Reattached " + surfaceTexture + " to " + this);
        bxfVar.c = false;
    }
}
