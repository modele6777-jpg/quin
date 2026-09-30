package defpackage;

import android.graphics.RectF;
import android.opengl.Matrix;
import android.util.Log;
import android.util.Size;
import android.view.Surface;
import java.io.Closeable;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class oae implements Closeable {
    public final Surface b;
    public final int c;
    public final Size d;
    public final float[] e;
    public final float[] f;
    public yl2 g;
    public Executor v;
    public final pa1 y;
    public final la1 z;
    public final Object a = new Object();
    public boolean w = false;
    public boolean x = false;

    public oae(Surface surface, int i, Size size, iq0 iq0Var, iq0 iq0Var2) {
        float[] fArr = new float[16];
        this.e = fArr;
        float[] fArr2 = new float[16];
        this.f = fArr2;
        this.b = surface;
        this.c = i;
        this.d = size;
        b(fArr, new float[16], iq0Var);
        b(fArr2, new float[16], iq0Var2);
        la1 la1Var = new la1();
        la1Var.c = new qxb();
        pa1 pa1Var = new pa1(la1Var);
        la1Var.b = pa1Var;
        try {
            this.z = la1Var;
            la1Var.a = "SurfaceOutputImpl close future complete";
        } catch (Exception e) {
            pa1Var.a(e);
        }
        this.y = pa1Var;
    }

    public static void b(float[] fArr, float[] fArr2, iq0 iq0Var) {
        Matrix.setIdentityM(fArr, 0);
        if (iq0Var == null) {
            return;
        }
        Size size = iq0Var.a;
        boolean z = iq0Var.e;
        int i = iq0Var.d;
        hkg.I0(fArr);
        hkg.H0(fArr, i);
        if (z) {
            Matrix.translateM(fArr, 0, 1.0f, 0.0f, 0.0f);
            Matrix.scaleM(fArr, 0, -1.0f, 1.0f, 1.0f);
        }
        Size sizeG = s2f.g(i, size);
        android.graphics.Matrix matrixA = s2f.a(s2f.h(size), s2f.h(sizeG), i, z);
        RectF rectF = new RectF(iq0Var.b);
        matrixA.mapRect(rectF);
        float width = rectF.left / sizeG.getWidth();
        float height = ((sizeG.getHeight() - rectF.height()) - rectF.top) / sizeG.getHeight();
        float fWidth = rectF.width() / sizeG.getWidth();
        float fHeight = rectF.height() / sizeG.getHeight();
        Matrix.translateM(fArr, 0, width, height, 0.0f);
        Matrix.scaleM(fArr, 0, fWidth, fHeight, 1.0f);
        pg1 pg1Var = iq0Var.c;
        Matrix.setIdentityM(fArr2, 0);
        hkg.I0(fArr2);
        if (pg1Var != null) {
            ok8.o("Camera has no transform.", pg1Var.o());
            hkg.H0(fArr2, pg1Var.b().b());
            if (pg1Var.d()) {
                Matrix.translateM(fArr2, 0, 1.0f, 0.0f, 0.0f);
                Matrix.scaleM(fArr2, 0, -1.0f, 1.0f, 1.0f);
            }
        }
        Matrix.invertM(fArr2, 0, fArr2, 0);
        Matrix.multiplyMM(fArr, 0, fArr2, 0, fArr, 0);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        synchronized (this.a) {
            try {
                if (!this.x) {
                    this.x = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.z.b(null);
    }

    public final Surface h(ah6 ah6Var, yl2 yl2Var) {
        boolean z;
        synchronized (this.a) {
            this.v = ah6Var;
            this.g = yl2Var;
            z = this.w;
        }
        if (z) {
            l();
        }
        return this.b;
    }

    public final void l() {
        Executor executor;
        yl2 yl2Var;
        AtomicReference atomicReference = new AtomicReference();
        synchronized (this.a) {
            try {
                if (this.v == null || (yl2Var = this.g) == null) {
                    this.w = true;
                } else if (!this.x) {
                    atomicReference.set(yl2Var);
                    executor = this.v;
                    this.w = false;
                }
                executor = null;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (executor != null) {
            try {
                executor.execute(new xu8(16, this, atomicReference));
            } catch (RejectedExecutionException e) {
                if (b21.F(3, "SurfaceOutputImpl")) {
                    Log.d("SurfaceOutputImpl", "Processor executor closed. Close request not posted.", e);
                }
            }
        }
    }
}
