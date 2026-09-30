package defpackage;

import android.graphics.SurfaceTexture;
import android.os.Build;
import android.view.Surface;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class bxf implements oxf {
    public final /* synthetic */ int a = 0;
    public final omb b;
    public boolean c;
    public final Object d;

    public bxf(Surface surface, int i, int i2, bae baeVar) {
        bae aaeVar = Build.VERSION.SDK_INT >= 29 ? new aae(baeVar, i, i2, "ViewfinderExternalSurfaceHolder-" + hashCode()) : qfc.f;
        this.d = aaeVar;
        Surface surfaceH0 = aaeVar.h0();
        surfaceH0 = surfaceH0 == null ? surface : surfaceH0;
        omb ombVar = new omb(new bv9(this, surfaceH0, surface, 24));
        this.b = ombVar;
        ombVar.b(surfaceH0);
    }

    @Override // defpackage.oxf
    public final omb a() {
        switch (this.a) {
            case 0:
                break;
        }
        return this.b;
    }

    public bxf(SurfaceTexture surfaceTexture) {
        this.d = surfaceTexture;
        omb ombVar = new omb(new trd(27, this));
        this.b = ombVar;
        ombVar.b(new Surface(surfaceTexture));
    }
}
