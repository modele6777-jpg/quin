package defpackage;

import android.graphics.SurfaceTexture;
import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.opengl.Matrix;
import java.nio.Buffer;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class tud implements GLSurfaceView.Renderer, ns9 {
    public final xec a;
    public final float[] d;
    public final float[] e;
    public final float[] f;
    public float g;
    public float v;
    public final /* synthetic */ uud y;
    public final float[] b = new float[16];
    public final float[] c = new float[16];
    public final float[] w = new float[16];
    public final float[] x = new float[16];

    public tud(uud uudVar, xec xecVar) {
        this.y = uudVar;
        float[] fArr = new float[16];
        this.d = fArr;
        float[] fArr2 = new float[16];
        this.e = fArr2;
        float[] fArr3 = new float[16];
        this.f = fArr3;
        this.a = xecVar;
        Matrix.setIdentityM(fArr, 0);
        Matrix.setIdentityM(fArr2, 0);
        Matrix.setIdentityM(fArr3, 0);
        this.v = 3.1415927f;
    }

    @Override // defpackage.ns9
    public final synchronized void a(float[] fArr, float f) {
        float[] fArr2 = this.d;
        System.arraycopy(fArr, 0, fArr2, 0, fArr2.length);
        float f2 = -f;
        this.v = f2;
        Matrix.setRotateM(this.e, 0, -this.g, (float) Math.cos(f2), (float) Math.sin(this.v), 0.0f);
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onDrawFrame(GL10 gl10) {
        float[] fArr;
        Object objV;
        synchronized (this) {
            Matrix.multiplyMM(this.x, 0, this.d, 0, this.f, 0);
            Matrix.multiplyMM(this.w, 0, this.e, 0, this.x, 0);
        }
        Matrix.multiplyMM(this.c, 0, this.b, 0, this.w, 0);
        xec xecVar = this.a;
        float[] fArr2 = this.c;
        GLES20.glClear(16384);
        try {
            hkg.Z();
        } catch (jb6 e) {
            xo1.y("SceneRenderer", "Failed to draw a frame", e);
        }
        if (xecVar.a.compareAndSet(true, false)) {
            SurfaceTexture surfaceTexture = xecVar.x;
            surfaceTexture.getClass();
            surfaceTexture.updateTexImage();
            try {
                hkg.Z();
            } catch (jb6 e2) {
                xo1.y("SceneRenderer", "Failed to draw a frame", e2);
            }
            if (xecVar.b.compareAndSet(true, false)) {
                Matrix.setIdentityM(xecVar.g, 0);
            }
            long timestamp = xecVar.x.getTimestamp();
            p90 p90Var = xecVar.e;
            synchronized (p90Var) {
                objV = p90Var.V(timestamp, false);
            }
            Long l = (Long) objV;
            if (l != null) {
                zi0 zi0Var = xecVar.d;
                float[] fArr3 = xecVar.g;
                float[] fArr4 = (float[]) ((p90) zi0Var.d).X(l.longValue());
                if (fArr4 != null) {
                    float[] fArr5 = (float[]) zi0Var.c;
                    float f = fArr4[0];
                    float f2 = -fArr4[1];
                    float f3 = -fArr4[2];
                    float length = Matrix.length(f, f2, f3);
                    if (length != 0.0f) {
                        Matrix.setRotateM(fArr5, 0, (float) Math.toDegrees(length), f / length, f2 / length, f3 / length);
                    } else {
                        Matrix.setIdentityM(fArr5, 0);
                    }
                    if (!zi0Var.a) {
                        zi0.i((float[]) zi0Var.b, (float[]) zi0Var.c);
                        zi0Var.a = true;
                    }
                    Matrix.multiplyMM(fArr3, 0, (float[]) zi0Var.b, 0, (float[]) zi0Var.c, 0);
                }
            }
            qxa qxaVar = (qxa) xecVar.f.X(timestamp);
            if (qxaVar != null) {
                sxa sxaVar = xecVar.c;
                if (sxa.b(qxaVar)) {
                    sxaVar.a = qxaVar.c;
                    sxaVar.b = new p90(qxaVar.a.a[0]);
                    if (!qxaVar.d) {
                        p90 p90Var2 = qxaVar.b.a[0];
                        hkg.h0((float[]) p90Var2.d);
                        hkg.h0((float[]) p90Var2.e);
                    }
                }
            }
        }
        Matrix.multiplyMM(xecVar.v, 0, fArr2, 0, xecVar.g, 0);
        sxa sxaVar2 = xecVar.c;
        int i = xecVar.w;
        float[] fArr6 = xecVar.v;
        p90 p90Var3 = sxaVar2.b;
        if (p90Var3 == null) {
            return;
        }
        int i2 = sxaVar2.a;
        if (i2 == 1) {
            fArr = sxa.j;
        } else {
            fArr = i2 == 2 ? sxa.k : sxa.i;
        }
        GLES20.glUniformMatrix3fv(sxaVar2.e, 1, false, fArr, 0);
        GLES20.glUniformMatrix4fv(sxaVar2.d, 1, false, fArr6, 0);
        GLES20.glActiveTexture(33984);
        GLES20.glBindTexture(36197, i);
        GLES20.glUniform1i(sxaVar2.h, 0);
        try {
            hkg.Z();
        } catch (jb6 e3) {
            xo1.y("ProjectionRenderer", "Failed to bind uniforms", e3);
        }
        GLES20.glVertexAttribPointer(sxaVar2.f, 3, 5126, false, 12, (Buffer) p90Var3.d);
        try {
            hkg.Z();
        } catch (jb6 e4) {
            xo1.y("ProjectionRenderer", "Failed to load position data", e4);
        }
        GLES20.glVertexAttribPointer(sxaVar2.g, 2, 5126, false, 8, (Buffer) p90Var3.e);
        try {
            hkg.Z();
        } catch (jb6 e5) {
            xo1.y("ProjectionRenderer", "Failed to load texture data", e5);
        }
        GLES20.glDrawArrays(p90Var3.c, 0, p90Var3.b);
        try {
            hkg.Z();
        } catch (jb6 e6) {
            xo1.y("ProjectionRenderer", "Failed to render", e6);
        }
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onSurfaceChanged(GL10 gl10, int i, int i2) {
        GLES20.glViewport(0, 0, i, i2);
        float f = i / i2;
        Matrix.perspectiveM(this.b, 0, f > 1.0f ? (float) (Math.toDegrees(Math.atan(Math.tan(Math.toRadians(45.0d)) / ((double) f))) * 2.0d) : 90.0f, f, 0.1f, 100.0f);
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final synchronized void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        uud uudVar = this.y;
        SurfaceTexture surfaceTextureD = this.a.d();
        int i = uud.z;
        uudVar.e.post(new xu8(15, uudVar, surfaceTextureD));
    }
}
