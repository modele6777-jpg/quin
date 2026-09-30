package defpackage;

import android.view.Surface;
import android.view.SurfaceControl;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class aae implements bae {
    public final SurfaceControl a;

    public aae(bae baeVar, int i, int i2, String str) {
        SurfaceControl surfaceControlBuild = new SurfaceControl.Builder().setName(str).setBufferSize(i, i2).setParent(((aae) baeVar).a).build();
        surfaceControlBuild.getClass();
        this.a = surfaceControlBuild;
        SurfaceControl.Transaction transaction = new SurfaceControl.Transaction();
        try {
            transaction.setVisibility(surfaceControlBuild, true).apply();
            transaction.close();
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                ym8.t(transaction, th);
                throw th2;
            }
        }
    }

    @Override // defpackage.bae
    public final void a() throws IOException {
        SurfaceControl.Transaction transaction = new SurfaceControl.Transaction();
        try {
            transaction.reparent(this.a, null).apply();
            transaction.close();
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                ym8.t(transaction, th);
                throw th2;
            }
        }
    }

    @Override // defpackage.bae
    public final Surface h0() {
        return new Surface(this.a);
    }

    @Override // defpackage.bae
    public final boolean r0(bae baeVar) {
        if (!this.a.isValid()) {
            return false;
        }
        SurfaceControl.Transaction transaction = new SurfaceControl.Transaction();
        try {
            transaction.reparent(this.a, ((aae) baeVar).a).apply();
            transaction.close();
            return true;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                ym8.t(transaction, th);
                throw th2;
            }
        }
    }

    public aae(SurfaceControl surfaceControl) {
        this.a = surfaceControl;
    }
}
