package io.sentry.android.replay.video;

import android.media.MediaMuxer;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class b {
    public final long a;
    public final MediaMuxer b;
    public boolean c;
    public int d;
    public int e;
    public long f;

    public b(String str, float f) {
        this.a = (long) (1000000.0f / f);
        this.b = new MediaMuxer(str, 0);
    }

    public final void a() {
        boolean z = this.c;
        MediaMuxer mediaMuxer = this.b;
        if (z && this.e > 0) {
            mediaMuxer.stop();
        }
        mediaMuxer.release();
    }
}
