package defpackage;

import android.os.HandlerThread;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class lh0 implements u8e {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;

    public /* synthetic */ lh0(int i, int i2) {
        this.a = i2;
        this.b = i;
    }

    @Override // defpackage.u8e
    public final Object get() {
        int i = this.a;
        int i2 = this.b;
        switch (i) {
            case 0:
                return new HandlerThread(mh0.c(i2, "ExoPlayer:MediaCodecAsyncAdapter:"));
            default:
                return new HandlerThread(mh0.c(i2, "ExoPlayer:MediaCodecQueueingThread:"));
        }
    }
}
