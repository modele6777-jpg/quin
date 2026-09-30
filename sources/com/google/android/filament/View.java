package com.google.android.filament;

import defpackage.f17;
import defpackage.h71;
import defpackage.kv2;
import defpackage.qc0;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public class View {
    public long a;
    public h71 b;

    /* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
    public static class InternalOnPickCallback implements Runnable {
        float mDepth;
        float mFragCoordsX;
        float mFragCoordsY;
        float mFragCoordsZ;
        int mRenderable;

        @Override // java.lang.Runnable
        public final void run() {
            throw null;
        }
    }

    static {
        kv2.C(2);
        kv2.C(2);
        kv2.C(2);
    }

    private static native void nSetBlendMode(long j, int i);

    private static native void nSetCamera(long j, long j2);

    private static native void nSetColorGrading(long j, long j2);

    private static native void nSetMultiSampleAntiAliasingOptions(long j, boolean z, int i, boolean z2);

    private static native void nSetRenderTarget(long j, long j2);

    private static native void nSetScene(long j, long j2);

    private static native void nSetViewport(long j, int i, int i2, int i3, int i4);

    public final long a() {
        long j = this.a;
        if (j != 0) {
            return j;
        }
        qc0.p("Calling method on destroyed View");
        return 0L;
    }

    public final void b() {
        nSetBlendMode(a(), kv2.B(2));
    }

    public final void c(Camera camera) {
        nSetCamera(a(), camera.a());
    }

    public final void d(ColorGrading colorGrading) {
        long jA = a();
        long j = colorGrading.a;
        if (j != 0) {
            nSetColorGrading(jA, j);
        } else {
            qc0.p("Calling method on destroyed ColorGrading");
        }
    }

    public final void e(f17 f17Var) {
        nSetMultiSampleAntiAliasingOptions(a(), f17Var.b, 4, false);
    }

    public final void f(RenderTarget renderTarget) {
        nSetRenderTarget(a(), renderTarget.e());
    }

    public final void g(Scene scene) {
        nSetScene(a(), scene.b());
    }

    public final void h(h71 h71Var) {
        this.b = h71Var;
        long jA = a();
        h71 h71Var2 = this.b;
        h71Var2.getClass();
        nSetViewport(jA, 0, 0, h71Var2.b, h71Var2.c);
    }
}
