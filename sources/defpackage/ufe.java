package defpackage;

import android.view.Choreographer;
import com.google.android.filament.Renderer;
import com.google.android.filament.SwapChain;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ufe implements Choreographer.FrameCallback {
    public final /* synthetic */ imb a;
    public final /* synthetic */ lge b;
    public final /* synthetic */ Choreographer c;

    public ufe(imb imbVar, lge lgeVar, Choreographer choreographer) {
        this.a = imbVar;
        this.b = lgeVar;
        this.c = choreographer;
    }

    @Override // android.view.Choreographer.FrameCallback
    public final void doFrame(long j) {
        imb imbVar = this.a;
        if (imbVar.element) {
            lge lgeVar = this.b;
            Renderer renderer = lgeVar.c;
            SwapChain swapChain = lgeVar.n;
            if (swapChain != null && lgeVar.o != 0 && lgeVar.p != 0 && renderer.a(swapChain, j)) {
                renderer.e(lgeVar.e);
                renderer.b();
            }
            if (imbVar.element) {
                this.c.postFrameCallback(this);
            }
        }
    }
}
