package defpackage;

import android.graphics.Matrix;
import android.graphics.SurfaceTexture;
import android.view.TextureView;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class dxf extends nu0 implements TextureView.SurfaceTextureListener {
    public final Matrix d;
    public bxf e;

    public dxf(aw2 aw2Var) {
        super(aw2Var);
        this.d = new Matrix();
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        bxf bxfVar = new bxf(surfaceTexture);
        this.e = bxfVar;
        if (!e77.b(0L, 0L)) {
            surfaceTexture.setDefaultBufferSize(0, 0);
        }
        if (this.b != null) {
            this.c = ynb.V(this.a, null, dw2.d, new mu0(this, bxfVar, null), 1);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        bxf bxfVar = this.e;
        if (bxfVar == null || bxfVar.c) {
            return false;
        }
        bxfVar.b.c();
        bxfVar.c = true;
        return false;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        if (e77.b(0L, 0L)) {
            return;
        }
        surfaceTexture.setDefaultBufferSize(0, 0);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
