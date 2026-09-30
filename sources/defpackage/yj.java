package defpackage;

import android.content.Context;
import android.graphics.SurfaceTexture;
import android.net.Uri;
import android.opengl.EGL14;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.Looper;
import android.view.Surface;
import android.view.TextureView;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.Collections;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class yj extends TextureView implements TextureView.SurfaceTextureListener {
    public pj E0;
    public final Uri a;
    public x16 b;
    public x16 c;
    public final Handler d;
    public final HandlerThread e;
    public final Handler f;
    public h48 g;
    public boolean v;
    public int w;
    public SurfaceTexture x;
    public final y6 y;
    public boolean z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yj(Uri uri, Context context) {
        super(context);
        uri.getClass();
        this.a = uri;
        this.d = new Handler(Looper.getMainLooper());
        HandlerThread handlerThread = new HandlerThread("AlphaPackedVideo");
        handlerThread.start();
        this.e = handlerThread;
        this.f = new Handler(handlerThread.getLooper());
        this.y = new y6(1, this);
        setOpaque(false);
        setSurfaceTextureListener(this);
    }

    public final void a() {
        pj pjVar = this.E0;
        this.E0 = null;
        if (pjVar == null || pjVar.g) {
            return;
        }
        pjVar.g = true;
        SurfaceTexture surfaceTexture = (SurfaceTexture) pjVar.n;
        if (surfaceTexture != null) {
            surfaceTexture.setOnFrameAvailableListener(null);
        }
        try {
            y45 y45Var = (y45) pjVar.u;
            if (y45Var != null) {
                y45Var.E();
            }
        } catch (Exception e) {
            hf8.Q.getClass();
            ef8.a("AlphaPackedVideo").c("Unable to release video player", e);
        } finally {
            pjVar.u = null;
            Surface surface = (Surface) pjVar.t;
            if (surface != null) {
                surface.release();
            }
            SurfaceTexture surfaceTexture2 = (SurfaceTexture) pjVar.n;
            if (surfaceTexture2 != null) {
                surfaceTexture2.release();
            }
            int i = pjVar.a;
            if (i != 0) {
                GLES20.glDeleteProgram(i);
            }
            int i2 = pjVar.b;
            if (i2 != 0) {
                GLES20.glDeleteTextures(1, new int[]{i2}, 0);
            }
            if (!pa7.t((EGLDisplay) pjVar.q, EGL14.EGL_NO_DISPLAY)) {
                EGLDisplay eGLDisplay = (EGLDisplay) pjVar.q;
                EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
                EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
                if (!pa7.t((EGLSurface) pjVar.s, EGL14.EGL_NO_SURFACE)) {
                    EGL14.eglDestroySurface((EGLDisplay) pjVar.q, (EGLSurface) pjVar.s);
                }
                if (!pa7.t((EGLContext) pjVar.r, EGL14.EGL_NO_CONTEXT)) {
                    EGL14.eglDestroyContext((EGLDisplay) pjVar.q, (EGLContext) pjVar.r);
                }
                EGL14.eglTerminate((EGLDisplay) pjVar.q);
                EGL14.eglReleaseThread();
            }
        }
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureAvailable(final SurfaceTexture surfaceTexture, final int i, final int i2) {
        surfaceTexture.getClass();
        if (this.v) {
            return;
        }
        this.x = surfaceTexture;
        final int i3 = this.w + 1;
        this.w = i3;
        this.f.post(new Runnable() { // from class: sj
            @Override // java.lang.Runnable
            public final void run() throws Throwable {
                int i4 = i;
                int i5 = i2;
                yj yjVar = this.a;
                yjVar.a();
                Context applicationContext = yjVar.getContext().getApplicationContext();
                applicationContext.getClass();
                Uri uri = yjVar.a;
                Handler handler = yjVar.f;
                int i6 = i3;
                int i7 = 0;
                uj ujVar = new uj(yjVar, i6, i7);
                vj vjVar = new vj(yjVar, i6, i7);
                uri.getClass();
                handler.getClass();
                final pj pjVar = new pj();
                pjVar.m = surfaceTexture;
                pjVar.o = ujVar;
                pjVar.p = vjVar;
                pjVar.q = EGL14.EGL_NO_DISPLAY;
                pjVar.r = EGL14.EGL_NO_CONTEXT;
                pjVar.s = EGL14.EGL_NO_SURFACE;
                pjVar.v = new float[16];
                FloatBuffer floatBufferAsFloatBuffer = ByteBuffer.allocateDirect(32).order(ByteOrder.nativeOrder()).asFloatBuffer();
                floatBufferAsFloatBuffer.put(new float[]{-1.0f, -1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f});
                floatBufferAsFloatBuffer.position(0);
                pjVar.w = floatBufferAsFloatBuffer;
                yjVar.E0 = pjVar;
                boolean z = yjVar.z;
                if (pjVar.g) {
                    return;
                }
                try {
                    pjVar.c = i4;
                    pjVar.d = i5;
                    pjVar.g();
                    int iD = pj.d();
                    pjVar.a = iD;
                    pjVar.i = GLES20.glGetAttribLocation(iD, "position");
                    pjVar.j = GLES20.glGetUniformLocation(pjVar.a, "transform");
                    pjVar.l = GLES20.glGetUniformLocation(pjVar.a, "halfTexel");
                    int[] iArr = new int[1];
                    GLES20.glGenTextures(1, iArr, 0);
                    int i8 = iArr[0];
                    pjVar.b = i8;
                    GLES20.glBindTexture(36197, i8);
                    GLES20.glTexParameteri(36197, 10241, 9729);
                    GLES20.glTexParameteri(36197, 10240, 9729);
                    GLES20.glTexParameteri(36197, 10242, 33071);
                    GLES20.glTexParameteri(36197, 10243, 33071);
                    GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
                    GLES20.glClear(16384);
                    if (!EGL14.eglSwapBuffers((EGLDisplay) pjVar.q, (EGLSurface) pjVar.s)) {
                        throw new IllegalStateException("Unable to clear video surface");
                    }
                    final SurfaceTexture surfaceTexture2 = new SurfaceTexture(pjVar.b);
                    pjVar.n = surfaceTexture2;
                    surfaceTexture2.setOnFrameAvailableListener(new SurfaceTexture.OnFrameAvailableListener() { // from class: nj
                        @Override // android.graphics.SurfaceTexture.OnFrameAvailableListener
                        public final void onFrameAvailable(SurfaceTexture surfaceTexture3) {
                            SurfaceTexture surfaceTexture4 = surfaceTexture2;
                            pj pjVar2 = pjVar;
                            if (pjVar2.g) {
                                return;
                            }
                            try {
                                surfaceTexture4.updateTexImage();
                                surfaceTexture4.getTransformMatrix((float[]) pjVar2.v);
                                pjVar2.h = true;
                                pjVar2.e();
                            } catch (Exception e) {
                                ((vj) pjVar2.p).d(e);
                            }
                        }
                    }, handler);
                    pjVar.t = new Surface(surfaceTexture2);
                    h45 h45Var = new h45(applicationContext);
                    Looper looper = handler.getLooper();
                    pa7.J(!h45Var.l);
                    looper.getClass();
                    h45Var.f = looper;
                    y45 y45VarA = h45Var.a();
                    f98 f98Var = y45VarA.m;
                    pjVar.u = y45VarA;
                    f98Var.a(new oj(pjVar));
                    y45VarA.Z();
                    final float fG = pqf.g(0.0f, 0.0f, 1.0f);
                    if (y45VarA.b0 != fG) {
                        y45VarA.b0 = fG;
                        y45VarA.l.g.c(32, Float.valueOf(fG)).b();
                        f98Var.e(22, new c98() { // from class: o45
                            @Override // defpackage.c98
                            public final void d(Object obj) {
                                ((xga) obj).i(fG);
                            }
                        });
                    }
                    y45VarA.Q(1);
                    Surface surface = (Surface) pjVar.t;
                    y45VarA.Z();
                    y45VarA.G();
                    y45VarA.S(surface);
                    if (surface != null) {
                        i7 = -1;
                    }
                    y45VarA.C(i7, i7);
                    d82 d82Var = new d82();
                    ey6 ey6Var = jy6.b;
                    yob yobVar = yob.e;
                    List list = Collections.EMPTY_LIST;
                    ey6 ey6Var2 = jy6.b;
                    yob yobVar2 = yob.e;
                    jp8 jp8Var = new jp8();
                    y45VarA.M(new op8("", new ip8(d82Var), new lp8(uri, null, null, list, yobVar2, -9223372036854775807L), new kp8(jp8Var), rp8.C, mp8.a));
                    y45VarA.P(z);
                    y45VarA.D();
                } catch (Exception e) {
                    ((vj) pjVar.p).d(e);
                }
            }
        });
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        surfaceTexture.getClass();
        if (this.x == surfaceTexture) {
            this.x = null;
            this.w++;
        }
        if (this.f.post(new fe(2, this, surfaceTexture))) {
            return false;
        }
        surfaceTexture.release();
        return false;
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureSizeChanged(final SurfaceTexture surfaceTexture, final int i, final int i2) {
        surfaceTexture.getClass();
        this.f.post(new Runnable() { // from class: rj
            @Override // java.lang.Runnable
            public final void run() {
                int i3 = i;
                int i4 = i2;
                pj pjVar = this.a.E0;
                if (pjVar != null) {
                    if (((SurfaceTexture) pjVar.m) != surfaceTexture) {
                        pjVar = null;
                    }
                    if (pjVar == null || pjVar.g) {
                        return;
                    }
                    try {
                        pjVar.c = i3;
                        pjVar.d = i4;
                        pjVar.e();
                    } catch (Exception e) {
                        ((vj) pjVar.p).d(e);
                    }
                }
            }
        });
    }

    @Override // android.view.TextureView.SurfaceTextureListener
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        surfaceTexture.getClass();
    }
}
