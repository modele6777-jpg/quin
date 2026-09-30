package defpackage;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import java.nio.Buffer;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public class pj {
    public int a = Integer.MAX_VALUE;
    public int b = Integer.MAX_VALUE;
    public int c = Integer.MAX_VALUE;
    public int d = Integer.MAX_VALUE;
    public int e = Integer.MAX_VALUE;
    public int f = Integer.MAX_VALUE;
    public boolean g = true;
    public boolean h = true;
    public int i;
    public int j;
    public boolean k;
    public int l;
    public Object m;
    public Object n;
    public Object o;
    public Object p;
    public Object q;
    public Object r;
    public Object s;
    public Object t;
    public Object u;
    public Object v;
    public Object w;

    public pj() {
        ey6 ey6Var = jy6.b;
        yob yobVar = yob.e;
        this.m = yobVar;
        this.n = yobVar;
        this.o = yobVar;
        this.p = yobVar;
        this.q = yobVar;
        this.i = Integer.MAX_VALUE;
        this.j = Integer.MAX_VALUE;
        this.r = yobVar;
        this.s = p1f.a;
        this.t = yobVar;
        this.k = true;
        this.u = yobVar;
        this.l = 0;
        this.v = new HashMap();
        this.w = new HashSet();
    }

    public static int c(int i, String str) {
        int iGlCreateShader = GLES20.glCreateShader(i);
        GLES20.glShaderSource(iGlCreateShader, str);
        GLES20.glCompileShader(iGlCreateShader);
        int[] iArr = new int[1];
        GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
        if (iArr[0] != 0) {
            return iGlCreateShader;
        }
        String strGlGetShaderInfoLog = GLES20.glGetShaderInfoLog(iGlCreateShader);
        GLES20.glDeleteShader(iGlCreateShader);
        strGlGetShaderInfoLog.getClass();
        throw new IllegalStateException(strGlGetShaderInfoLog.toString());
    }

    public static int d() throws Throwable {
        int iC;
        Exception e;
        int iC2 = c(35633, "\n      attribute vec2 position;\n      varying vec2 uv;\n      void main() {\n        gl_Position = vec4(position, 0.0, 1.0);\n        uv = (position + 1.0) * 0.5;\n      }\n    ");
        int iGlCreateProgram = GLES20.glCreateProgram();
        int i = 0;
        try {
            iC = c(35632, "\n      #extension GL_OES_EGL_image_external : require\n      precision mediump float;\n      uniform samplerExternalOES video;\n      uniform mat4 transform;\n      uniform vec2 halfTexel;\n      varying vec2 uv;\n      void main() {\n        vec2 rgbUv = clamp(vec2(uv.x * 0.5, uv.y), halfTexel, vec2(0.5, 1.0) - halfTexel);\n        vec2 alphaUv = rgbUv + vec2(0.5, 0.0);\n        vec3 rgb = texture2D(video, (transform * vec4(rgbUv, 0.0, 1.0)).xy).rgb;\n        float alpha = texture2D(video, (transform * vec4(alphaUv, 0.0, 1.0)).xy).r;\n        gl_FragColor = vec4(min(rgb, vec3(alpha)), alpha);\n      }\n    ");
            try {
                try {
                    GLES20.glAttachShader(iGlCreateProgram, iC2);
                    GLES20.glAttachShader(iGlCreateProgram, iC);
                    GLES20.glLinkProgram(iGlCreateProgram);
                    int[] iArr = new int[1];
                    GLES20.glGetProgramiv(iGlCreateProgram, 35714, iArr, 0);
                    if (iArr[0] == 0) {
                        String strGlGetProgramInfoLog = GLES20.glGetProgramInfoLog(iGlCreateProgram);
                        strGlGetProgramInfoLog.getClass();
                        throw new IllegalStateException(strGlGetProgramInfoLog.toString());
                    }
                    GLES20.glDeleteShader(iC2);
                    if (iC != 0) {
                        GLES20.glDeleteShader(iC);
                    }
                    return iGlCreateProgram;
                } catch (Throwable th) {
                    th = th;
                    i = iC;
                }
            } catch (Exception e2) {
                e = e2;
                GLES20.glDeleteProgram(iGlCreateProgram);
                throw e;
            }
        } catch (Exception e3) {
            iC = 0;
            e = e3;
        } catch (Throwable th2) {
            th = th2;
        }
        th = th;
        i = iC;
        GLES20.glDeleteShader(iC2);
        if (i != 0) {
            GLES20.glDeleteShader(i);
        }
        throw th;
    }

    public q1f a() {
        return new q1f(this);
    }

    public pj b(int i) {
        Iterator it = ((HashMap) this.v).values().iterator();
        while (it.hasNext()) {
            if (((o1f) it.next()).a.c == i) {
                it.remove();
            }
        }
        return this;
    }

    public void e() {
        int i;
        int i2;
        int i3;
        if (!this.h || (i = this.e) == 0 || (i2 = this.c) <= 0 || (i3 = this.d) <= 0) {
            return;
        }
        float fMin = Math.min(i2 / (i / 2), i3 / this.f);
        int i4 = (int) ((this.e / 2) * fMin);
        int i5 = (int) (this.f * fMin);
        GLES20.glClear(16384);
        GLES20.glViewport((this.c - i4) / 2, (this.d - i5) / 2, i4, i5);
        GLES20.glUseProgram(this.a);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, this.b);
        GLES20.glUniformMatrix4fv(this.j, 1, false, (float[]) this.v, 0);
        GLES20.glUniform2f(this.l, 0.5f / this.e, 0.5f / this.f);
        GLES20.glEnableVertexAttribArray(this.i);
        GLES20.glVertexAttribPointer(this.i, 2, 5126, false, 0, (Buffer) this.w);
        GLES20.glDrawArrays(5, 0, 4);
        if (GLES20.glGetError() != 0) {
            qc0.p("Unable to render alpha-packed video");
            return;
        }
        if (!EGL14.eglSwapBuffers((EGLDisplay) this.q, (EGLSurface) this.s)) {
            qc0.p("Unable to display alpha-packed video");
        } else {
            if (this.k) {
                return;
            }
            this.k = true;
            ((uj) this.o).invoke();
        }
    }

    public void f(q1f q1fVar) {
        this.a = q1fVar.a;
        this.b = q1fVar.b;
        this.c = q1fVar.c;
        this.d = q1fVar.d;
        this.e = q1fVar.e;
        this.f = q1fVar.f;
        this.g = q1fVar.g;
        this.h = q1fVar.h;
        this.n = q1fVar.j;
        this.m = q1fVar.i;
        this.o = q1fVar.k;
        this.p = q1fVar.l;
        this.q = q1fVar.m;
        this.i = q1fVar.n;
        this.j = q1fVar.o;
        this.r = q1fVar.p;
        this.s = q1fVar.q;
        this.t = q1fVar.r;
        this.k = q1fVar.t;
        this.u = q1fVar.s;
        this.l = q1fVar.u;
        this.w = new HashSet(q1fVar.w);
        this.v = new HashMap(q1fVar.v);
    }

    public void g() {
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
        this.q = eGLDisplayEglGetDisplay;
        if (pa7.t(eGLDisplayEglGetDisplay, EGL14.EGL_NO_DISPLAY)) {
            qc0.p("EGL display unavailable");
            return;
        }
        int[] iArr = new int[2];
        if (!EGL14.eglInitialize((EGLDisplay) this.q, iArr, 0, iArr, 1)) {
            qc0.p("EGL initialization failed");
            return;
        }
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        int[] iArr2 = new int[1];
        if (!EGL14.eglChooseConfig((EGLDisplay) this.q, new int[]{12324, 8, 12323, 8, 12322, 8, 12321, 8, 12352, 4, 12339, 4, 12344}, 0, eGLConfigArr, 0, 1, iArr2, 0) || iArr2[0] <= 0) {
            qc0.p("RGBA EGL configuration unavailable");
            return;
        }
        EGLConfig eGLConfig = eGLConfigArr[0];
        if (eGLConfig == null) {
            qc0.p("Required value was null.");
            return;
        }
        EGLContext eGLContextEglCreateContext = EGL14.eglCreateContext((EGLDisplay) this.q, eGLConfig, EGL14.EGL_NO_CONTEXT, new int[]{12440, 2, 12344}, 0);
        this.r = eGLContextEglCreateContext;
        if (pa7.t(eGLContextEglCreateContext, EGL14.EGL_NO_CONTEXT)) {
            qc0.p("EGL context creation failed");
            return;
        }
        EGLSurface eGLSurfaceEglCreateWindowSurface = EGL14.eglCreateWindowSurface((EGLDisplay) this.q, eGLConfig, (SurfaceTexture) this.m, new int[]{12344}, 0);
        this.s = eGLSurfaceEglCreateWindowSurface;
        if (pa7.t(eGLSurfaceEglCreateWindowSurface, EGL14.EGL_NO_SURFACE)) {
            qc0.p("EGL surface creation failed");
            return;
        }
        EGLDisplay eGLDisplay = (EGLDisplay) this.q;
        EGLSurface eGLSurface = (EGLSurface) this.s;
        if (EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, (EGLContext) this.r)) {
            return;
        }
        qc0.p("EGL context unavailable");
    }

    public pj h() {
        this.l = -3;
        return this;
    }

    public pj i(o1f o1fVar) {
        h1f h1fVar = o1fVar.a;
        b(h1fVar.c);
        ((HashMap) this.v).put(h1fVar, o1fVar);
        return this;
    }

    public pj j() {
        return k(new String[0]);
    }

    public pj k(String... strArr) {
        dy6 dy6VarM = jy6.m();
        for (String str : strArr) {
            str.getClass();
            dy6VarM.b(pqf.I(str));
        }
        this.t = dy6VarM.g();
        this.k = false;
        return this;
    }

    public pj l() {
        this.k = false;
        return this;
    }

    public pj m(int i, boolean z) {
        HashSet hashSet = (HashSet) this.w;
        if (z) {
            hashSet.add(Integer.valueOf(i));
            return this;
        }
        hashSet.remove(Integer.valueOf(i));
        return this;
    }
}
