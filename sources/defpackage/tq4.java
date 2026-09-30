package defpackage;

import android.graphics.SurfaceTexture;
import android.opengl.EGL14;
import android.opengl.EGLDisplay;
import android.opengl.EGLExt;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.opengl.Matrix;
import android.util.Size;
import android.view.Surface;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class tq4 extends gq9 {
    public final k47 E0;
    public final k47 F0;
    public int Y = -1;
    public int Z = -1;

    public tq4(k47 k47Var, k47 k47Var2) {
        this.E0 = k47Var;
        this.F0 = k47Var2;
    }

    @Override // defpackage.gq9
    public final cp0 j(qr4 qr4Var) {
        Map map = Collections.EMPTY_MAP;
        cp0 cp0VarJ = super.j(qr4Var);
        this.Y = e46.h();
        this.Z = e46.h();
        return cp0VarJ;
    }

    public final void v(long j, Surface surface, oae oaeVar, SurfaceTexture surfaceTexture, SurfaceTexture surfaceTexture2) {
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
        rp0 rp0Var = rp0VarD;
        EGLSurface eGLSurface = rp0Var.a;
        if (surface != ((Surface) this.x)) {
            l(eGLSurface);
            this.x = surface;
        }
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 1.0f);
        GLES20.glClear(16384);
        w(rp0Var, oaeVar, surfaceTexture, this.E0, this.Y, true);
        w(rp0Var, oaeVar, surfaceTexture2, this.F0, this.Z, false);
        EGLExt.eglPresentationTimeANDROID((EGLDisplay) this.f, eGLSurface, j);
        if (EGL14.eglSwapBuffers((EGLDisplay) this.f, eGLSurface)) {
            return;
        }
        b21.W("DualOpenGlRenderer", "Failed to swap buffers with EGL error: 0x" + Integer.toHexString(EGL14.eglGetError()));
        o(surface, false);
    }

    public final void w(rp0 rp0Var, oae oaeVar, SurfaceTexture surfaceTexture, k47 k47Var, int i, boolean z) {
        r(i);
        int i2 = rp0Var.b;
        int i3 = rp0Var.c;
        GLES20.glViewport(0, 0, i2, i3);
        GLES20.glScissor(0, 0, i2, i3);
        float[] fArr = new float[16];
        surfaceTexture.getTransformMatrix(fArr);
        float[] fArr2 = new float[16];
        Matrix.multiplyMM(fArr2, 0, fArr, 0, z ? oaeVar.e : oaeVar.f, 0);
        c46 c46Var = (c46) this.z;
        c46Var.getClass();
        if (c46Var instanceof d46) {
            GLES20.glUniformMatrix4fv(((d46) c46Var).f, 1, false, fArr2, 0);
            e46.b("glUniformMatrix4fv");
        }
        jy9 jy9Var = (jy9) k47Var.c;
        Object obj = jy9Var.a;
        Object obj2 = jy9Var.b;
        Size size = new Size((int) (((Float) jy9Var.a).floatValue() * i2), (int) (((Float) obj2).floatValue() * i3));
        Size size2 = new Size(i2, i3);
        float[] fArr3 = new float[16];
        Matrix.setIdentityM(fArr3, 0);
        float[] fArr4 = new float[16];
        Matrix.setIdentityM(fArr4, 0);
        float[] fArr5 = new float[16];
        Matrix.setIdentityM(fArr5, 0);
        Matrix.scaleM(fArr3, 0, size.getWidth() / size2.getWidth(), size.getHeight() / size2.getHeight(), 1.0f);
        jy9 jy9Var2 = (jy9) k47Var.b;
        if (((Float) obj).floatValue() != 0.0f || ((Float) obj2).floatValue() != 0.0f) {
            Matrix.translateM(fArr4, 0, ((Float) jy9Var2.a).floatValue() / ((Float) obj).floatValue(), ((Float) jy9Var2.b).floatValue() / ((Float) obj2).floatValue(), 0.0f);
        }
        Matrix.multiplyMM(fArr5, 0, fArr3, 0, fArr4, 0);
        GLES20.glUniformMatrix4fv(c46Var.b, 1, false, fArr5, 0);
        e46.b("glUniformMatrix4fv");
        GLES20.glUniform1f(c46Var.c, 1.0f);
        e46.b("glUniform1f");
        GLES20.glEnable(3042);
        GLES20.glBlendFuncSeparate(770, 771, 1, 771);
        GLES20.glDrawArrays(5, 0, 4);
        e46.b("glDrawArrays");
        GLES20.glDisable(3042);
    }
}
