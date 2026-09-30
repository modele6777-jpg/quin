package defpackage;

import android.view.Choreographer;
import com.google.android.filament.Engine;
import com.google.android.filament.SwapChain;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class vfe implements qa4 {
    public final /* synthetic */ imb a;
    public final /* synthetic */ x48 b;
    public final /* synthetic */ ff c;
    public final /* synthetic */ Choreographer d;
    public final /* synthetic */ ufe e;
    public final /* synthetic */ waf f;

    public vfe(imb imbVar, x48 x48Var, ff ffVar, Choreographer choreographer, ufe ufeVar, waf wafVar) {
        this.a = imbVar;
        this.b = x48Var;
        this.c = ffVar;
        this.d = choreographer;
        this.e = ufeVar;
        this.f = wafVar;
    }

    @Override // defpackage.qa4
    public final void a() {
        this.a.element = false;
        this.b.k().b(this.c);
        this.d.removeFrameCallback(this.e);
        waf wafVar = this.f;
        vaf vafVar = wafVar.c;
        if (vafVar != null) {
            vafVar.a.setSurfaceTextureListener(null);
        }
        g5b g5bVar = wafVar.b;
        if (g5bVar != null) {
            lge lgeVar = (lge) g5bVar.b;
            Engine engine = lgeVar.b;
            SwapChain swapChain = lgeVar.n;
            if (swapChain != null) {
                engine.s(swapChain);
                engine.w();
            }
            lgeVar.n = null;
        }
        wafVar.a = null;
        wafVar.c = null;
    }
}
