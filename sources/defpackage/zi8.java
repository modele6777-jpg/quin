package defpackage;

import android.media.LoudnessCodecController;
import android.media.MediaCodec;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.Surface;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class zi8 implements po8 {
    public final /* synthetic */ int a;
    public final Object b;
    public Object c;

    public zi8(MediaCodec mediaCodec, zi8 zi8Var) {
        this.a = 1;
        this.b = mediaCodec;
        this.c = zi8Var;
        if (Build.VERSION.SDK_INT < 35 || zi8Var == null) {
            return;
        }
        zi8Var.c(mediaCodec);
    }

    @Override // defpackage.po8
    public final void a() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((HashSet) obj).clear();
                LoudnessCodecController loudnessCodecController = (LoudnessCodecController) this.c;
                if (loudnessCodecController != null) {
                    loudnessCodecController.close();
                    return;
                }
                return;
            default:
                zi8 zi8Var = (zi8) this.c;
                MediaCodec mediaCodec = (MediaCodec) obj;
                try {
                    int i2 = Build.VERSION.SDK_INT;
                    if (i2 >= 30 && i2 < 33) {
                        mediaCodec.stop();
                        break;
                    }
                    return;
                } finally {
                    if (Build.VERSION.SDK_INT >= 35 && zi8Var != null) {
                        zi8Var.u(mediaCodec);
                    }
                    mediaCodec.release();
                }
        }
    }

    @Override // defpackage.po8
    public void b(Bundle bundle) {
        ((MediaCodec) this.b).setParameters(bundle);
    }

    public void c(MediaCodec mediaCodec) {
        LoudnessCodecController loudnessCodecController = (LoudnessCodecController) this.c;
        if (loudnessCodecController == null || loudnessCodecController.addMediaCodec(mediaCodec)) {
            pa7.J(((HashSet) this.b).add(mediaCodec));
        }
    }

    @Override // defpackage.po8
    public void d(int i, n03 n03Var, long j, int i2) {
        ((MediaCodec) this.b).queueSecureInputBuffer(i, 0, n03Var.i, j, i2);
    }

    @Override // defpackage.po8
    public void e(int i, int i2, int i3, long j) {
        ((MediaCodec) this.b).queueInputBuffer(i, 0, i2, j, i3);
    }

    @Override // defpackage.po8
    public void f(int i) {
        ((MediaCodec) this.b).releaseOutputBuffer(i, false);
    }

    @Override // defpackage.po8
    public void flush() {
        ((MediaCodec) this.b).flush();
    }

    @Override // defpackage.po8
    public MediaFormat h() {
        return ((MediaCodec) this.b).getOutputFormat();
    }

    @Override // defpackage.po8
    public void i() {
        ((MediaCodec) this.b).detachOutputSurface();
    }

    @Override // defpackage.po8
    public void j(int i, long j) {
        ((MediaCodec) this.b).releaseOutputBuffer(i, j);
    }

    @Override // defpackage.po8
    public int k() {
        return ((MediaCodec) this.b).dequeueInputBuffer(0L);
    }

    @Override // defpackage.po8
    public int l(MediaCodec.BufferInfo bufferInfo) {
        int iDequeueOutputBuffer;
        do {
            iDequeueOutputBuffer = ((MediaCodec) this.b).dequeueOutputBuffer(bufferInfo, 0L);
        } while (iDequeueOutputBuffer == -3);
        return iDequeueOutputBuffer;
    }

    @Override // defpackage.po8
    public void m(int i) {
        ((MediaCodec) this.b).setVideoScalingMode(i);
    }

    @Override // defpackage.po8
    public ByteBuffer n(int i) {
        return ((MediaCodec) this.b).getInputBuffer(i);
    }

    @Override // defpackage.po8
    public void o(Surface surface) {
        ((MediaCodec) this.b).setOutputSurface(surface);
    }

    @Override // defpackage.po8
    public ByteBuffer p(int i) {
        return ((MediaCodec) this.b).getOutputBuffer(i);
    }

    @Override // defpackage.po8
    public void q(ArrayList arrayList) {
        ((MediaCodec) this.b).subscribeToVendorParameters(arrayList);
    }

    @Override // defpackage.po8
    public void r(fp8 fp8Var, Handler handler) {
        ((MediaCodec) this.b).setOnFrameRenderedListener(new kh0(this, fp8Var, 1), handler);
    }

    @Override // defpackage.po8
    public void t(ArrayList arrayList) {
        ((MediaCodec) this.b).unsubscribeFromVendorParameters(arrayList);
    }

    public void u(MediaCodec mediaCodec) {
        LoudnessCodecController loudnessCodecController;
        if (!((HashSet) this.b).remove(mediaCodec) || (loudnessCodecController = (LoudnessCodecController) this.c) == null) {
            return;
        }
        loudnessCodecController.removeMediaCodec(mediaCodec);
    }

    public void v(int i) {
        LoudnessCodecController loudnessCodecController = (LoudnessCodecController) this.c;
        if (loudnessCodecController != null) {
            loudnessCodecController.close();
            this.c = null;
        }
        LoudnessCodecController loudnessCodecControllerCreate = LoudnessCodecController.create(i, f94.a, new yi8());
        this.c = loudnessCodecControllerCreate;
        Iterator it = ((HashSet) this.b).iterator();
        while (it.hasNext()) {
            if (!loudnessCodecControllerCreate.addMediaCodec((MediaCodec) it.next())) {
                it.remove();
            }
        }
    }

    public zi8() {
        this.a = 0;
        this.b = new HashSet();
    }
}
