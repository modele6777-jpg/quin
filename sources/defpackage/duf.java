package defpackage;

import android.content.Context;
import android.opengl.GLSurfaceView;
import com.adjust.sdk.sig.r3;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class duf extends GLSurfaceView implements fuf {
    public static final /* synthetic */ int b = 0;
    public final cuf a;

    public duf(Context context) {
        super(context, null);
        cuf cufVar = new cuf(this);
        this.a = cufVar;
        setPreserveEGLContextOnPause(true);
        setEGLContextClientVersion(2);
        setRenderer(cufVar);
        setRenderMode(0);
    }

    public void setOutputBuffer(euf eufVar) {
        cuf cufVar = this.a;
        if (cufVar.f.getAndSet(eufVar) == null) {
            cufVar.a.requestRender();
        } else {
            r3.f();
        }
    }

    @Deprecated
    public fuf getVideoDecoderOutputBufferRenderer() {
        return this;
    }
}
