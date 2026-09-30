package defpackage;

import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.os.Handler;
import android.os.HandlerThread;
import android.util.Size;
import android.view.Surface;
import androidx.camera.core.ImageProcessingUtil;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ft3 implements pae, SurfaceTexture.OnFrameAvailableListener {
    public final gq9 a;
    public final HandlerThread b;
    public final ah6 c;
    public final Handler d;
    public final AtomicBoolean e;
    public final float[] f;
    public final float[] g;
    public final LinkedHashMap v;
    public int w;
    public boolean x;
    public final ArrayList y;

    public ft3(qr4 qr4Var) {
        Map map = Collections.EMPTY_MAP;
        this.e = new AtomicBoolean(false);
        this.f = new float[16];
        this.g = new float[16];
        this.v = new LinkedHashMap();
        this.w = 0;
        this.x = false;
        this.y = new ArrayList();
        HandlerThread handlerThread = new HandlerThread("CameraX-GL Thread");
        this.b = handlerThread;
        handlerThread.start();
        Handler handler = new Handler(handlerThread.getLooper());
        this.d = handler;
        this.c = new ah6(handler);
        this.a = new gq9();
        try {
            h(qr4Var);
        } catch (RuntimeException e) {
            a();
            throw e;
        }
    }

    @Override // defpackage.pae
    public final void a() {
        if (this.e.getAndSet(true)) {
            return;
        }
        e(new j1(24, this), new ni(7));
    }

    @Override // defpackage.pae
    public final void b(wae waeVar) {
        if (this.e.get()) {
            waeVar.c();
        } else {
            e(new ny2(10, this, waeVar), new et3(waeVar, 0));
        }
    }

    @Override // defpackage.pae
    public final void c(oae oaeVar) {
        if (this.e.get()) {
            oaeVar.close();
        } else {
            e(new ny2(8, this, oaeVar), new j1(23, oaeVar));
        }
    }

    public final void d() {
        if (this.x && this.w == 0) {
            LinkedHashMap linkedHashMap = this.v;
            Iterator it = linkedHashMap.keySet().iterator();
            while (it.hasNext()) {
                ((oae) it.next()).close();
            }
            Iterator it2 = this.y.iterator();
            while (it2.hasNext()) {
                ((po0) it2.next()).c.d(new Exception("Failed to snapshot: DefaultSurfaceProcessor is released."));
            }
            linkedHashMap.clear();
            gq9 gq9Var = this.a;
            if (((AtomicBoolean) gq9Var.c).getAndSet(false)) {
                e46.c((Thread) gq9Var.e);
                gq9Var.n();
            }
            this.b.quit();
        }
    }

    public final void e(Runnable runnable, Runnable runnable2) {
        try {
            this.c.execute(new c0(this, runnable2, runnable, 11));
        } catch (RejectedExecutionException e) {
            b21.X("DefaultSurfaceProcessor", "Unable to executor runnable", e);
            runnable2.run();
        }
    }

    public final void f(Exception exc) {
        ArrayList arrayList = this.y;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ((po0) it.next()).c.d(exc);
        }
        arrayList.clear();
    }

    public final Bitmap g(Size size, float[] fArr, int i) {
        float[] fArr2 = (float[]) fArr.clone();
        hkg.H0(fArr2, i);
        hkg.I0(fArr2);
        Size sizeG = s2f.g(i, size);
        gq9 gq9Var = this.a;
        gq9Var.getClass();
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(sizeG.getHeight() * sizeG.getWidth() * 4);
        ok8.k("ByteBuffer capacity is not equal to width * height * 4.", byteBufferAllocateDirect.capacity() == (sizeG.getHeight() * sizeG.getWidth()) * 4);
        ok8.k("ByteBuffer is not direct.", byteBufferAllocateDirect.isDirect());
        int[] iArr = e46.a;
        int[] iArr2 = new int[1];
        GLES20.glGenTextures(1, iArr2, 0);
        e46.b("glGenTextures");
        int i2 = iArr2[0];
        GLES20.glActiveTexture(33985);
        e46.b("glActiveTexture");
        GLES20.glBindTexture(3553, i2);
        e46.b("glBindTexture");
        GLES20.glTexImage2D(3553, 0, 6407, sizeG.getWidth(), sizeG.getHeight(), 0, 6407, 5121, null);
        e46.b("glTexImage2D");
        GLES20.glTexParameteri(3553, 10240, 9729);
        GLES20.glTexParameteri(3553, 10241, 9729);
        int[] iArr3 = new int[1];
        GLES20.glGenFramebuffers(1, iArr3, 0);
        e46.b("glGenFramebuffers");
        int i3 = iArr3[0];
        GLES20.glBindFramebuffer(36160, i3);
        e46.b("glBindFramebuffer");
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, i2, 0);
        e46.b("glFramebufferTexture2D");
        GLES20.glActiveTexture(33984);
        e46.b("glActiveTexture");
        GLES20.glBindTexture(36197, gq9Var.a);
        e46.b("glBindTexture");
        gq9Var.x = null;
        GLES20.glViewport(0, 0, sizeG.getWidth(), sizeG.getHeight());
        GLES20.glScissor(0, 0, sizeG.getWidth(), sizeG.getHeight());
        c46 c46Var = (c46) gq9Var.z;
        c46Var.getClass();
        if (c46Var instanceof d46) {
            GLES20.glUniformMatrix4fv(((d46) c46Var).f, 1, false, fArr2, 0);
            e46.b("glUniformMatrix4fv");
        }
        GLES20.glDrawArrays(5, 0, 4);
        e46.b("glDrawArrays");
        GLES20.glReadPixels(0, 0, sizeG.getWidth(), sizeG.getHeight(), 6408, 5121, byteBufferAllocateDirect);
        e46.b("glReadPixels");
        GLES20.glBindFramebuffer(36160, 0);
        GLES20.glDeleteTextures(1, new int[]{i2}, 0);
        e46.b("glDeleteTextures");
        GLES20.glDeleteFramebuffers(1, new int[]{i3}, 0);
        e46.b("glDeleteFramebuffers");
        int i4 = gq9Var.a;
        GLES20.glActiveTexture(33984);
        e46.b("glActiveTexture");
        GLES20.glBindTexture(36197, i4);
        e46.b("glBindTexture");
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(sizeG.getWidth(), sizeG.getHeight(), Bitmap.Config.ARGB_8888);
        byteBufferAllocateDirect.rewind();
        ImageProcessingUtil.d(bitmapCreateBitmap, byteBufferAllocateDirect, sizeG.getWidth() * 4);
        return bitmapCreateBitmap;
    }

    public final void h(qr4 qr4Var) {
        Map map = Collections.EMPTY_MAP;
        la1 la1Var = new la1();
        la1Var.c = new qxb();
        pa1 pa1Var = new pa1(la1Var);
        la1Var.b = pa1Var;
        la1Var.a = kv2.class;
        try {
            e(new c0(this, qr4Var, la1Var), new ni(7));
            la1Var.a = "Init GlRenderer";
        } catch (Exception e) {
            pa1Var.a(e);
        }
        try {
            pa1Var.get();
        } catch (InterruptedException | ExecutionException e2) {
            e = e2;
            if (e instanceof ExecutionException) {
                e = e.getCause();
            }
            if (e instanceof RuntimeException) {
                throw ((RuntimeException) e);
            }
            ho7.r("Failed to create DefaultSurfaceProcessor", e);
        }
    }

    public final void i(m5f m5fVar) {
        ArrayList arrayList = this.y;
        if (arrayList.isEmpty()) {
            return;
        }
        if (m5fVar == null) {
            f(new Exception("Failed to snapshot: no JPEG Surface."));
            return;
        }
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            try {
                Iterator it = arrayList.iterator();
                int i = -1;
                int i2 = -1;
                Bitmap bitmapG = null;
                byte[] byteArray = null;
                while (it.hasNext()) {
                    po0 po0Var = (po0) it.next();
                    int i3 = po0Var.b;
                    int i4 = po0Var.a;
                    if (i != i3 || bitmapG == null) {
                        if (bitmapG != null) {
                            bitmapG.recycle();
                        }
                        bitmapG = g((Size) m5fVar.e(), (float[]) m5fVar.g(), i3);
                        i2 = -1;
                        i = i3;
                    }
                    if (i2 != i4) {
                        byteArrayOutputStream.reset();
                        bitmapG.compress(Bitmap.CompressFormat.JPEG, i4, byteArrayOutputStream);
                        byteArray = byteArrayOutputStream.toByteArray();
                        i2 = i4;
                    }
                    Surface surface = (Surface) m5fVar.d();
                    Objects.requireNonNull(byteArray);
                    ImageProcessingUtil.e(byteArray, surface);
                    po0Var.c.b(null);
                    it.remove();
                }
                byteArrayOutputStream.close();
            } catch (Throwable th) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IOException e) {
            f(e);
        }
    }

    @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
    public final void onFrameAvailable(SurfaceTexture surfaceTexture) {
        if (this.e.get()) {
            return;
        }
        surfaceTexture.updateTexImage();
        float[] fArr = this.f;
        surfaceTexture.getTransformMatrix(fArr);
        m5f m5fVar = null;
        for (Map.Entry entry : this.v.entrySet()) {
            Surface surface = (Surface) entry.getValue();
            oae oaeVar = (oae) entry.getKey();
            float[] fArr2 = oaeVar.e;
            float[] fArr3 = this.g;
            Matrix.multiplyMM(fArr3, 0, fArr, 0, fArr2, 0);
            int i = oaeVar.c;
            if (i == 34) {
                try {
                    this.a.q(surfaceTexture.getTimestamp(), fArr3, surface);
                } catch (RuntimeException e) {
                    b21.w("DefaultSurfaceProcessor", "Failed to render with OpenGL.", e);
                }
            } else {
                ok8.o("Unsupported format: " + i, i == 256);
                ok8.o("Only one JPEG output is supported.", m5fVar == null);
                m5fVar = new m5f(surface, oaeVar.d, (float[]) fArr3.clone());
            }
        }
        try {
            i(m5fVar);
        } catch (RuntimeException e2) {
            f(e2);
        }
    }
}
