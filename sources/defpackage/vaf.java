package defpackage;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.TextureView;
import com.google.android.filament.Engine;
import com.google.android.filament.SwapChain;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class vaf implements TextureView.SurfaceTextureListener {
    public final TextureView a;
    public Surface b;
    public final /* synthetic */ waf c;

    public vaf(waf wafVar, TextureView textureView) {
        SurfaceTexture surfaceTexture;
        this.c = wafVar;
        this.a = textureView;
        textureView.setSurfaceTextureListener(this);
        if (!textureView.isAvailable() || (surfaceTexture = textureView.getSurfaceTexture()) == null) {
            return;
        }
        wafVar.getClass();
        onSurfaceTextureAvailable(surfaceTexture, 0, 0);
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        waf wafVar = this.c;
        wafVar.getClass();
        Surface surface = new Surface(surfaceTexture);
        this.b = surface;
        g5b g5bVar = wafVar.b;
        if (g5bVar != null) {
            lge lgeVar = (lge) g5bVar.b;
            Engine engine = lgeVar.b;
            SwapChain swapChain = lgeVar.n;
            if (swapChain != null) {
                engine.s(swapChain);
            }
            lgeVar.n = engine.h(surface);
        }
        g5b g5bVar2 = wafVar.b;
        if (g5bVar2 != null) {
            g5bVar2.q(i, i2);
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        Surface surface = this.b;
        if (surface != null) {
            surface.release();
        }
        this.b = null;
        g5b g5bVar = this.c.b;
        if (g5bVar == null) {
            return true;
        }
        lge lgeVar = (lge) g5bVar.b;
        Engine engine = lgeVar.b;
        SwapChain swapChain = lgeVar.n;
        if (swapChain != null) {
            engine.s(swapChain);
            engine.w();
        }
        lgeVar.n = null;
        return true;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        waf wafVar = this.c;
        g5b g5bVar = wafVar.b;
        if (g5bVar != null) {
            g5bVar.q(i, i2);
            Surface surface = this.b;
            if (surface != null) {
                g5b g5bVar2 = wafVar.b;
                g5bVar2.getClass();
                lge lgeVar = (lge) g5bVar2.b;
                Engine engine = lgeVar.b;
                SwapChain swapChain = lgeVar.n;
                if (swapChain != null) {
                    engine.s(swapChain);
                }
                lgeVar.n = engine.h(surface);
            }
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }
}
