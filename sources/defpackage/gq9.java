package defpackage;

import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLExt;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.util.Log;
import android.util.Size;
import android.view.Surface;
import com.adjust.sdk.sig.r3;
import com.google.firebase.crashlytics.internal.common.IdManager;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public class gq9 implements rsf {
    public Object X;
    public int a;
    public int[] b;
    public final Object c;
    public final Object d;
    public Object e;
    public Object f;
    public Object g;
    public Object v;
    public Object w;
    public Object x;
    public Object y;
    public Object z;

    public gq9() {
        this.c = new AtomicBoolean(false);
        this.d = new HashMap();
        this.f = EGL14.EGL_NO_DISPLAY;
        this.g = EGL14.EGL_NO_CONTEXT;
        this.b = e46.a;
        this.w = EGL14.EGL_NO_SURFACE;
        this.y = Collections.EMPTY_MAP;
        this.z = null;
        this.X = b46.a;
        this.a = -1;
    }

    public void a(qr4 qr4Var, szc szcVar) {
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
        this.f = eGLDisplayEglGetDisplay;
        if (Objects.equals(eGLDisplayEglGetDisplay, EGL14.EGL_NO_DISPLAY)) {
            qc0.p("Unable to get EGL14 display");
            return;
        }
        int[] iArr = new int[2];
        if (!EGL14.eglInitialize((EGLDisplay) this.f, iArr, 0, iArr, 1)) {
            this.f = EGL14.EGL_NO_DISPLAY;
            qc0.p("Unable to initialize EGL14");
            return;
        }
        if (szcVar != null) {
            szcVar.c = iArr[0] + "." + iArr[1];
        }
        int i = qr4Var.a() ? 10 : 8;
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        if (!EGL14.eglChooseConfig((EGLDisplay) this.f, new int[]{12324, i, 12323, i, 12322, i, 12321, qr4Var.a() ? 2 : 8, 12325, 0, 12326, 0, 12352, qr4Var.a() ? 64 : 4, 12610, qr4Var.a() ? -1 : 1, 12339, 5, 12344}, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
            qc0.p("Unable to find a suitable EGLConfig");
            return;
        }
        EGLConfig eGLConfig = eGLConfigArr[0];
        EGLContext eGLContextEglCreateContext = EGL14.eglCreateContext((EGLDisplay) this.f, eGLConfig, EGL14.EGL_NO_CONTEXT, new int[]{12440, qr4Var.a() ? 3 : 2, 12344}, 0);
        e46.a("eglCreateContext");
        this.v = eGLConfig;
        this.g = eGLContextEglCreateContext;
        int[] iArr2 = new int[1];
        EGL14.eglQueryContext((EGLDisplay) this.f, eGLContextEglCreateContext, 12440, iArr2, 0);
        Log.d("OpenGlRenderer", "EGLContext created, client version " + iArr2[0]);
    }

    public rp0 d(Surface surface) {
        try {
            try {
                EGLDisplay eGLDisplay = (EGLDisplay) this.f;
                EGLConfig eGLConfig = (EGLConfig) this.v;
                Objects.requireNonNull(eGLConfig);
                EGLSurface eGLSurfaceI = e46.i(eGLDisplay, eGLConfig, surface, this.b);
                EGLDisplay eGLDisplay2 = (EGLDisplay) this.f;
                int[] iArr = new int[1];
                EGL14.eglQuerySurface(eGLDisplay2, eGLSurfaceI, 12375, iArr, 0);
                int i = iArr[0];
                int[] iArr2 = new int[1];
                EGL14.eglQuerySurface(eGLDisplay2, eGLSurfaceI, 12374, iArr2, 0);
                Size size = new Size(i, iArr2[0]);
                return new rp0(eGLSurfaceI, size.getWidth(), size.getHeight());
            } catch (IllegalArgumentException e) {
                e = e;
                b21.X("OpenGlRenderer", "Failed to create EGL surface: " + e.getMessage(), e);
                return null;
            }
        } catch (IllegalArgumentException | IllegalStateException e2) {
            e = e2;
            b21.X("OpenGlRenderer", "Failed to create EGL surface: " + e.getMessage(), e);
            return null;
        }
    }

    public void e() {
        EGLDisplay eGLDisplay = (EGLDisplay) this.f;
        EGLConfig eGLConfig = (EGLConfig) this.v;
        Objects.requireNonNull(eGLConfig);
        int[] iArr = e46.a;
        EGLSurface eGLSurfaceEglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, eGLConfig, new int[]{12375, 1, 12374, 1, 12344}, 0);
        e46.a("eglCreatePbufferSurface");
        if (eGLSurfaceEglCreatePbufferSurface != null) {
            this.w = eGLSurfaceEglCreatePbufferSurface;
        } else {
            qc0.p("surface was null");
        }
    }

    public int f(int i) {
        int i2;
        p69 p69Var = (p69) this.c;
        int i3 = p69Var.b;
        int i4 = 0;
        if (i3 <= 0) {
            r3.i("");
            return 0;
        }
        int i5 = i3 - 1;
        while (true) {
            if (i4 <= i5) {
                i2 = (i4 + i5) >>> 1;
                int i6 = p69Var.a[i2];
                if (i6 >= i) {
                    if (i6 <= i) {
                        break;
                    }
                    i5 = i2 - 1;
                } else {
                    i4 = i2 + 1;
                }
            } else {
                i2 = -(i4 + 1);
                break;
            }
        }
        return i2 < -1 ? -(i2 + 2) : i2;
    }

    public float g(int i, int i2, boolean z) {
        fs4 fs4Var;
        float f;
        p69 p69Var = (p69) this.c;
        if (i >= p69Var.b - 1) {
            f = i2;
        } else {
            int iA = p69Var.a(i);
            int iA2 = p69Var.a(i + 1);
            if (i2 != iA) {
                int i3 = iA2 - iA;
                usf usfVar = (usf) ((q69) this.d).b(iA);
                if (usfVar == null || (fs4Var = usfVar.b) == null) {
                    fs4Var = (fs4) this.e;
                }
                float f2 = i3;
                float fB = fs4Var.b((i2 - iA) / f2);
                return z ? fB : ((f2 * fB) + iA) / 1000.0f;
            }
            f = iA;
        }
        return f / 1000.0f;
    }

    public jy9 h(qr4 qr4Var) {
        e46.d((AtomicBoolean) this.c, false);
        try {
            a(qr4Var, null);
            e();
            l((EGLSurface) this.w);
            String strGlGetString = GLES20.glGetString(7939);
            String strEglQueryString = EGL14.eglQueryString((EGLDisplay) this.f, 12373);
            if (strGlGetString == null) {
                strGlGetString = "";
            }
            if (strEglQueryString == null) {
                strEglQueryString = "";
            }
            return new jy9(strGlGetString, strEglQueryString);
        } catch (IllegalStateException e) {
            b21.X("OpenGlRenderer", "Failed to get GL or EGL extensions: " + e.getMessage(), e);
            return new jy9("", "");
        } finally {
            n();
        }
    }

    @Override // defpackage.psf
    public b00 i(long j, b00 b00Var, b00 b00Var2, b00 b00Var3) {
        long j2 = j / 1000000;
        int[] iArr = qsf.a;
        long j3 = this.a;
        if (j2 < 0) {
            j2 = 0;
        }
        long j4 = j2 > j3 ? j3 : j2;
        if (j4 < 0) {
            return b00Var3;
        }
        k(b00Var, b00Var2, b00Var3);
        b00 b00Var4 = (b00) this.v;
        b00Var4.getClass();
        int i = 0;
        if (((vd9) this.X) != qsf.c) {
            int i2 = (int) j4;
            float fG = g(f(i2), i2, false);
            float[] fArr = (float[]) this.z;
            jc0[][] jc0VarArr = (jc0[][]) ((vd9) this.X).b;
            float f = jc0VarArr[0][0].a;
            float f2 = jc0VarArr[jc0VarArr.length - 1][0].b;
            if (fG < f) {
                fG = f;
            }
            if (fG <= f2) {
                f2 = fG;
            }
            int length = fArr.length;
            boolean z = false;
            for (jc0[] jc0VarArr2 : jc0VarArr) {
                int i3 = 0;
                int i4 = 0;
                while (i3 < length - 1) {
                    jc0 jc0Var = jc0VarArr2[i4];
                    if (f2 <= jc0Var.b) {
                        if (jc0Var.p) {
                            fArr[i3] = jc0Var.q;
                            fArr[i3 + 1] = jc0Var.r;
                        } else {
                            jc0Var.c(f2);
                            fArr[i3] = jc0Var.a();
                            fArr[i3 + 1] = jc0Var.b();
                        }
                        z = true;
                    }
                    i3 += 2;
                    i4++;
                }
                if (z) {
                    break;
                }
            }
            int length2 = fArr.length;
            while (i < length2) {
                b00Var4.e(i, fArr[i]);
                i++;
            }
        } else {
            b00 b00VarT = t((j4 - 1) * 1000000, b00Var, b00Var2, b00Var3);
            b00 b00VarT2 = t(j4 * 1000000, b00Var, b00Var2, b00Var3);
            int iB = b00VarT.b();
            while (i < iB) {
                b00Var4.e(i, (b00VarT.a(i) - b00VarT2.a(i)) * 1000.0f);
                i++;
            }
        }
        return b00Var4;
    }

    public cp0 j(qr4 qr4Var) {
        Map map = Collections.EMPTY_MAP;
        AtomicBoolean atomicBoolean = (AtomicBoolean) this.c;
        e46.d(atomicBoolean, false);
        szc szcVar = new szc(7, false);
        szcVar.b = IdManager.DEFAULT_VERSION_NAME;
        szcVar.c = IdManager.DEFAULT_VERSION_NAME;
        szcVar.d = "";
        szcVar.e = "";
        try {
            if (qr4Var.a()) {
                jy9 jy9VarH = h(qr4Var);
                String str = (String) jy9VarH.a;
                String str2 = (String) jy9VarH.b;
                if (!str.contains("GL_EXT_YUV_target")) {
                    b21.W("OpenGlRenderer", "Device does not support GL_EXT_YUV_target. Fallback to SDR.");
                    qr4Var = qr4.d;
                }
                this.b = e46.f(str2, qr4Var);
                szcVar.d = str;
                szcVar.e = str2;
            }
            a(qr4Var, szcVar);
            e();
            l((EGLSurface) this.w);
            szcVar.b = e46.j();
            this.y = e46.g(qr4Var);
            int iH = e46.h();
            this.a = iH;
            r(iH);
            this.e = Thread.currentThread();
            atomicBoolean.set(true);
            if ("".isEmpty()) {
                return new cp0((String) szcVar.b, (String) szcVar.c, (String) szcVar.d, (String) szcVar.e);
            }
            qc0.p("Missing required properties:".concat(""));
            return null;
        } catch (IllegalArgumentException e) {
            e = e;
            n();
            throw e;
        } catch (IllegalStateException e2) {
            e = e2;
            n();
            throw e;
        }
    }

    public void k(b00 b00Var, b00 b00Var2, b00 b00Var3) {
        float[] fArr;
        q69 q69Var = (q69) this.d;
        p69 p69Var = (p69) this.c;
        boolean z = ((vd9) this.X) != qsf.c;
        if (((b00) this.g) == null) {
            this.g = b00Var.c();
            this.v = b00Var3.c();
            int i = p69Var.b;
            float[] fArr2 = new float[i];
            for (int i2 = 0; i2 < i; i2++) {
                fArr2[i2] = p69Var.a(i2) / 1000.0f;
            }
            this.f = fArr2;
            int i3 = p69Var.b;
            int[] iArr = new int[i3];
            for (int i4 = 0; i4 < i3; i4++) {
                iArr[i4] = 0;
            }
            this.b = iArr;
        }
        if (z) {
            if (((vd9) this.X) != qsf.c && pa7.t((b00) this.w, b00Var) && pa7.t((b00) this.x, b00Var2)) {
                return;
            }
            this.w = b00Var;
            this.x = b00Var2;
            int iB = b00Var.b() + (b00Var.b() % 2);
            this.y = new float[iB];
            this.z = new float[iB];
            int i5 = p69Var.b;
            float[][] fArr3 = new float[i5][];
            for (int i6 = 0; i6 < i5; i6++) {
                int iA = p69Var.a(i6);
                usf usfVar = (usf) q69Var.b(iA);
                if (iA == 0 && usfVar == null) {
                    fArr = new float[iB];
                    for (int i7 = 0; i7 < iB; i7++) {
                        fArr[i7] = b00Var.a(i7);
                    }
                } else if (iA == this.a && usfVar == null) {
                    fArr = new float[iB];
                    for (int i8 = 0; i8 < iB; i8++) {
                        fArr[i8] = b00Var2.a(i8);
                    }
                } else {
                    usfVar.getClass();
                    b00 b00Var4 = usfVar.a;
                    float[] fArr4 = new float[iB];
                    for (int i9 = 0; i9 < iB; i9++) {
                        fArr4[i9] = b00Var4.a(i9);
                    }
                    fArr = fArr4;
                }
                fArr3[i6] = fArr;
            }
            this.X = new vd9(this.b, (float[]) this.f, fArr3);
        }
    }

    public void l(EGLSurface eGLSurface) {
        ((EGLDisplay) this.f).getClass();
        ((EGLContext) this.g).getClass();
        if (EGL14.eglMakeCurrent((EGLDisplay) this.f, eGLSurface, eGLSurface, (EGLContext) this.g)) {
            return;
        }
        qc0.p("eglMakeCurrent failed");
    }

    public void m(Surface surface) {
        e46.d((AtomicBoolean) this.c, true);
        e46.c((Thread) this.e);
        HashMap map = (HashMap) this.d;
        if (map.containsKey(surface)) {
            return;
        }
        map.put(surface, e46.j);
    }

    public void n() {
        HashMap map = (HashMap) this.d;
        Iterator it = ((Map) this.y).values().iterator();
        while (it.hasNext()) {
            GLES20.glDeleteProgram(((c46) it.next()).a);
        }
        this.y = Collections.EMPTY_MAP;
        this.z = null;
        if (!Objects.equals((EGLDisplay) this.f, EGL14.EGL_NO_DISPLAY)) {
            EGLDisplay eGLDisplay = (EGLDisplay) this.f;
            EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
            EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
            for (rp0 rp0Var : map.values()) {
                if (!Objects.equals(rp0Var.a, EGL14.EGL_NO_SURFACE) && !EGL14.eglDestroySurface((EGLDisplay) this.f, rp0Var.a)) {
                    try {
                        e46.a("eglDestroySurface");
                    } catch (IllegalStateException e) {
                        b21.w("GLUtils", e.toString(), e);
                    }
                }
            }
            map.clear();
            if (!Objects.equals((EGLSurface) this.w, EGL14.EGL_NO_SURFACE)) {
                EGL14.eglDestroySurface((EGLDisplay) this.f, (EGLSurface) this.w);
                this.w = EGL14.EGL_NO_SURFACE;
            }
            if (!Objects.equals((EGLContext) this.g, EGL14.EGL_NO_CONTEXT)) {
                EGL14.eglDestroyContext((EGLDisplay) this.f, (EGLContext) this.g);
                this.g = EGL14.EGL_NO_CONTEXT;
            }
            EGL14.eglReleaseThread();
            EGL14.eglTerminate((EGLDisplay) this.f);
            this.f = EGL14.EGL_NO_DISPLAY;
        }
        this.v = null;
        this.a = -1;
        this.X = b46.a;
        this.x = null;
        this.e = null;
    }

    public void o(Surface surface, boolean z) {
        if (((Surface) this.x) == surface) {
            this.x = null;
            l((EGLSurface) this.w);
        }
        HashMap map = (HashMap) this.d;
        rp0 rp0Var = z ? (rp0) map.remove(surface) : (rp0) map.put(surface, e46.j);
        if (rp0Var == null || rp0Var == e46.j) {
            return;
        }
        try {
            EGL14.eglDestroySurface((EGLDisplay) this.f, rp0Var.a);
        } catch (RuntimeException e) {
            b21.X("OpenGlRenderer", "Failed to destroy EGL surface: " + e.getMessage(), e);
        }
    }

    @Override // defpackage.rsf
    public int p() {
        return 0;
    }

    public void q(long j, float[] fArr, Surface surface) {
        e46.d((AtomicBoolean) this.c, true);
        e46.c((Thread) this.e);
        HashMap map = (HashMap) this.d;
        ok8.o("The surface is not registered.", map.containsKey(surface));
        rp0 rp0VarD = (rp0) map.get(surface);
        Objects.requireNonNull(rp0VarD);
        if (rp0VarD == e46.j) {
            rp0VarD = d(surface);
            if (rp0VarD == null) {
                return;
            } else {
                map.put(surface, rp0VarD);
            }
        }
        int i = rp0VarD.c;
        int i2 = rp0VarD.b;
        EGLSurface eGLSurface = rp0VarD.a;
        if (surface != ((Surface) this.x)) {
            l(eGLSurface);
            this.x = surface;
            GLES20.glViewport(0, 0, i2, i);
            GLES20.glScissor(0, 0, i2, i);
        }
        c46 c46Var = (c46) this.z;
        c46Var.getClass();
        if (c46Var instanceof d46) {
            GLES20.glUniformMatrix4fv(((d46) c46Var).f, 1, false, fArr, 0);
            e46.b("glUniformMatrix4fv");
        }
        GLES20.glDrawArrays(5, 0, 4);
        e46.b("glDrawArrays");
        EGLExt.eglPresentationTimeANDROID((EGLDisplay) this.f, eGLSurface, j);
        if (EGL14.eglSwapBuffers((EGLDisplay) this.f, eGLSurface)) {
            return;
        }
        b21.W("OpenGlRenderer", "Failed to swap buffers with EGL error: 0x" + Integer.toHexString(EGL14.eglGetError()));
        o(surface, false);
    }

    public void r(int i) {
        c46 c46Var = (c46) ((Map) this.y).get((b46) this.X);
        if (c46Var == null) {
            s8f.h((b46) this.X, "Unable to configure program for input format: ");
            return;
        }
        if (((c46) this.z) != c46Var) {
            this.z = c46Var;
            c46Var.b();
            Log.d("OpenGlRenderer", "Using program for input format " + ((b46) this.X) + ": " + ((c46) this.z));
        }
        GLES20.glActiveTexture(33984);
        e46.b("glActiveTexture");
        GLES20.glBindTexture(36197, i);
        e46.b("glBindTexture");
    }

    @Override // defpackage.rsf
    public int s() {
        return this.a;
    }

    @Override // defpackage.psf
    public b00 t(long j, b00 b00Var, b00 b00Var2, b00 b00Var3) {
        b00 b00Var4;
        b00 b00Var5;
        b00 b00Var6 = b00Var;
        b00 b00Var7 = b00Var2;
        p69 p69Var = (p69) this.c;
        long j2 = j / 1000000;
        int[] iArr = qsf.a;
        int i = this.a;
        long j3 = i;
        if (j2 < 0) {
            j2 = 0;
        }
        if (j2 <= j3) {
            j3 = j2;
        }
        int i2 = (int) j3;
        q69 q69Var = (q69) this.d;
        usf usfVar = (usf) q69Var.b(i2);
        if (usfVar != null) {
            return usfVar.a;
        }
        if (i2 >= i) {
            return b00Var7;
        }
        if (i2 <= 0) {
            return b00Var6;
        }
        k(b00Var6, b00Var7, b00Var3);
        b00 b00Var8 = (b00) this.g;
        b00Var8.getClass();
        int i3 = 0;
        if (((vd9) this.X) != qsf.c) {
            float fG = g(f(i2), i2, false);
            float[] fArr = (float[]) this.y;
            jc0[][] jc0VarArr = (jc0[][]) ((vd9) this.X).b;
            int length = jc0VarArr.length - 1;
            float f = jc0VarArr[0][0].a;
            float f2 = jc0VarArr[length][0].b;
            int length2 = fArr.length;
            if (fG < f || fG > f2) {
                if (fG > f2) {
                    f = f2;
                } else {
                    length = 0;
                }
                float f3 = fG - f;
                int i4 = 0;
                int i5 = 0;
                while (i4 < length2 - 1) {
                    jc0 jc0Var = jc0VarArr[length][i5];
                    boolean z = jc0Var.p;
                    float f4 = jc0Var.r;
                    float f5 = jc0Var.q;
                    if (z) {
                        float f6 = jc0Var.a;
                        float f7 = jc0Var.k;
                        float f8 = jc0Var.c;
                        fArr[i4] = (f5 * f3) + ks0.a(jc0Var.e, f8, (f - f6) * f7, f8);
                        float f9 = (f - f6) * f7;
                        float f10 = jc0Var.d;
                        fArr[i4 + 1] = (f4 * f3) + ks0.a(jc0Var.f, f10, f9, f10);
                    } else {
                        jc0Var.c(f);
                        fArr[i4] = (jc0Var.a() * f3) + (jc0Var.n * jc0Var.h) + f5;
                        fArr[i4 + 1] = (jc0Var.b() * f3) + (jc0Var.o * jc0Var.i) + f4;
                    }
                    i4 += 2;
                    i5++;
                    jc0VarArr = jc0VarArr;
                }
            } else {
                int length3 = jc0VarArr.length;
                int i6 = 0;
                boolean z2 = false;
                while (i6 < length3) {
                    int i7 = i3;
                    int i8 = i7;
                    while (i7 < length2 - 1) {
                        jc0 jc0Var2 = jc0VarArr[i6][i8];
                        if (fG <= jc0Var2.b) {
                            if (jc0Var2.p) {
                                float f11 = jc0Var2.a;
                                float f12 = jc0Var2.k;
                                float f13 = jc0Var2.c;
                                fArr[i7] = ks0.a(jc0Var2.e, f13, (fG - f11) * f12, f13);
                                float f14 = jc0Var2.d;
                                fArr[i7 + 1] = ks0.a(jc0Var2.f, f14, (fG - f11) * f12, f14);
                            } else {
                                jc0Var2.c(fG);
                                fArr[i7] = (jc0Var2.n * jc0Var2.h) + jc0Var2.q;
                                fArr[i7 + 1] = (jc0Var2.o * jc0Var2.i) + jc0Var2.r;
                            }
                            z2 = true;
                        }
                        i7 += 2;
                        i8++;
                    }
                    if (z2) {
                        break;
                    }
                    i6++;
                    i3 = 0;
                }
            }
            int length4 = fArr.length;
            for (int i9 = 0; i9 < length4; i9++) {
                b00Var8.e(i9, fArr[i9]);
            }
        } else {
            int iF = f(i2);
            float fG2 = g(iF, i2, true);
            usf usfVar2 = (usf) q69Var.b(p69Var.a(iF));
            if (usfVar2 != null && (b00Var5 = usfVar2.a) != null) {
                b00Var6 = b00Var5;
            }
            usf usfVar3 = (usf) q69Var.b(p69Var.a(iF + 1));
            if (usfVar3 != null && (b00Var4 = usfVar3.a) != null) {
                b00Var7 = b00Var4;
            }
            int iB = b00Var8.b();
            for (int i10 = 0; i10 < iB; i10++) {
                b00Var8.e(i10, (b00Var7.a(i10) * fG2) + ((1.0f - fG2) * b00Var6.a(i10)));
            }
        }
        return b00Var8;
    }

    public gq9(p69 p69Var, q69 q69Var, int i, fs4 fs4Var) {
        this.c = p69Var;
        this.d = q69Var;
        this.a = i;
        this.e = fs4Var;
        this.b = qsf.a;
        float[] fArr = qsf.b;
        this.f = fArr;
        this.y = fArr;
        this.z = fArr;
        this.X = qsf.c;
    }
}
