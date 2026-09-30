package defpackage;

import android.graphics.Rect;
import android.util.Log;
import android.view.Surface;
import android.view.SurfaceHolder;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class fxf extends nu0 implements SurfaceHolder.Callback {
    public int d;
    public int e;
    public exf f;
    public bxf g;

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        this.d = i2;
        this.e = i3;
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        Rect surfaceFrame = surfaceHolder.getSurfaceFrame();
        this.d = surfaceFrame.width();
        this.e = surfaceFrame.height();
        exf exfVar = this.f;
        if (exfVar == null) {
            pa7.g0("surfaceView");
            throw null;
        }
        bae baeVarB = ifa.b(exfVar);
        bxf bxfVar = this.g;
        if (bxfVar != null) {
            omb ombVar = bxfVar.b;
            if (!bxfVar.c) {
                qc0.p("tryAttach() can only be called when detached");
                return;
            }
            Surface surface = (Surface) ombVar.a();
            if (surface != null) {
                if (((bae) bxfVar.d).r0(baeVarB)) {
                    Log.d("VfExternalSurface", "Reattached " + surface + " to " + baeVarB);
                    bxfVar.c = false;
                    return;
                }
                Log.d("VfExternalSurface", "Unable to attach " + surface + " to " + baeVarB);
                ombVar.c();
            }
        }
        bxf bxfVar2 = new bxf(surfaceHolder.getSurface(), this.d, this.e, baeVarB);
        this.g = bxfVar2;
        if (this.b != null) {
            this.c = ynb.V(this.a, null, dw2.d, new mu0(this, bxfVar2, null), 1);
        }
    }

    @Override // android.view.SurfaceHolder.Callback
    public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        bxf bxfVar = this.g;
        if (bxfVar == null || bxfVar.c) {
            return;
        }
        ((bae) bxfVar.d).a();
        bxfVar.b.c();
        bxfVar.c = true;
    }
}
