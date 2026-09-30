package defpackage;

import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import com.adjust.sdk.sig.r3;
import java.nio.Buffer;
import java.nio.FloatBuffer;
import java.util.concurrent.atomic.AtomicReference;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class cuf implements GLSurfaceView.Renderer {
    public static final String[] v = {"y_tex", "u_tex", "v_tex"};
    public static final FloatBuffer w = hkg.h0(new float[]{-1.0f, 1.0f, -1.0f, -1.0f, 1.0f, 1.0f, 1.0f, -1.0f});
    public final duf a;
    public final int[] b = new int[3];
    public final int[] c = new int[3];
    public final int[] d = new int[3];
    public final int[] e = new int[3];
    public final AtomicReference f = new AtomicReference();
    public r1f g;

    public cuf(duf dufVar) {
        this.a = dufVar;
        for (int i = 0; i < 3; i++) {
            int[] iArr = this.d;
            this.e[i] = -1;
            iArr[i] = -1;
        }
    }

    public final void a() {
        int[] iArr = this.b;
        try {
            GLES20.glGenTextures(3, iArr, 0);
            for (int i = 0; i < 3; i++) {
                r1f r1fVar = this.g;
                GLES20.glUniform1i(GLES20.glGetUniformLocation(r1fVar.a, v[i]), i);
                GLES20.glActiveTexture(33984 + i);
                hkg.X(3553, iArr[i]);
            }
            hkg.Z();
        } catch (jb6 e) {
            xo1.y("VideoDecoderGLSV", "Failed to set up the textures", e);
        }
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onDrawFrame(GL10 gl10) {
        if (this.f.getAndSet(null) == null) {
            return;
        }
        r3.f();
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onSurfaceChanged(GL10 gl10, int i, int i2) {
        GLES20.glViewport(0, 0, i, i2);
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public final void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        int[] iArr = this.c;
        try {
            r1f r1fVar = new r1f("varying vec2 interp_tc_y;\nvarying vec2 interp_tc_u;\nvarying vec2 interp_tc_v;\nattribute vec4 in_pos;\nattribute vec2 in_tc_y;\nattribute vec2 in_tc_u;\nattribute vec2 in_tc_v;\nvoid main() {\n  gl_Position = in_pos;\n  interp_tc_y = in_tc_y;\n  interp_tc_u = in_tc_u;\n  interp_tc_v = in_tc_v;\n}\n", "precision mediump float;\nvarying vec2 interp_tc_y;\nvarying vec2 interp_tc_u;\nvarying vec2 interp_tc_v;\nuniform sampler2D y_tex;\nuniform sampler2D u_tex;\nuniform sampler2D v_tex;\nuniform mat3 mColorConversion;\nvoid main() {\n  vec3 yuv;\n  yuv.x = texture2D(y_tex, interp_tc_y).r - 0.0625;\n  yuv.y = texture2D(u_tex, interp_tc_u).r - 0.5;\n  yuv.z = texture2D(v_tex, interp_tc_v).r - 0.5;\n  gl_FragColor = vec4(mColorConversion * yuv, 1.0);\n}\n");
            this.g = r1fVar;
            GLES20.glVertexAttribPointer(r1fVar.n("in_pos"), 2, 5126, false, 0, (Buffer) w);
            iArr[0] = this.g.n("in_tc_y");
            iArr[1] = this.g.n("in_tc_u");
            iArr[2] = this.g.n("in_tc_v");
            GLES20.glGetUniformLocation(this.g.a, "mColorConversion");
            hkg.Z();
            a();
            hkg.Z();
        } catch (jb6 e) {
            xo1.y("VideoDecoderGLSV", "Failed to set up the textures and program", e);
        }
    }
}
