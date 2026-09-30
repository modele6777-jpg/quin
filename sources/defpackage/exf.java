package defpackage;

import android.view.SurfaceView;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class exf extends SurfaceView {
    public fxf a;

    public final fxf getAttachedState() {
        return this.a;
    }

    public final void setAttachedState(fxf fxfVar) {
        if (fxfVar == null) {
            fxf fxfVar2 = this.a;
            if (fxfVar2 != null) {
                getHolder().removeCallback(fxfVar2);
            }
        } else {
            getHolder().addCallback(fxfVar);
        }
        this.a = fxfVar;
    }
}
