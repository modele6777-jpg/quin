package defpackage;

import android.graphics.SurfaceTexture;
import android.view.Surface;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class pea extends Surface {
    public static int d;
    public static boolean e;
    public final boolean a;
    public final oea b;
    public boolean c;

    public pea(oea oeaVar, SurfaceTexture surfaceTexture, boolean z) {
        super(surfaceTexture);
        this.b = oeaVar;
        this.a = z;
    }

    public static synchronized boolean a() {
        int i;
        try {
            if (!e) {
                try {
                    if (hkg.z0("EGL_EXT_protected_content")) {
                        i = hkg.z0("EGL_KHR_surfaceless_context") ? 1 : 2;
                    } else {
                        i = 0;
                    }
                } catch (jb6 e2) {
                    xo1.x("PlaceholderSurface", "Failed to determine secure mode due to GL error: " + e2.getMessage());
                }
                d = i;
                e = true;
            }
        } catch (Throwable th) {
            throw th;
        }
        return d != 0;
    }

    @Override // android.view.Surface
    public final void release() {
        super.release();
        synchronized (this.b) {
            try {
                if (!this.c) {
                    oea oeaVar = this.b;
                    oeaVar.b.getClass();
                    oeaVar.b.sendEmptyMessage(2);
                    this.c = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
