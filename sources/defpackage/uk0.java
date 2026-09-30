package defpackage;

import android.media.AudioTrack;
import com.adjust.sdk.sig.r3;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class uk0 {
    public final tk0 a;
    public final int b;
    public final mjg c;
    public int d;
    public long e;
    public long f;
    public long g;
    public long h;
    public long i;

    public uk0(AudioTrack audioTrack, mjg mjgVar) {
        this.a = new tk0(audioTrack);
        this.b = audioTrack.getSampleRate();
        this.c = mjgVar;
        a(0);
    }

    public final void a(int i) {
        this.d = i;
        if (i == 0) {
            this.g = 0L;
            this.h = -1L;
            this.i = -9223372036854775807L;
            this.e = System.nanoTime() / 1000;
            this.f = 10000L;
            return;
        }
        if (i == 1) {
            this.f = 10000L;
            return;
        }
        if (i == 2 || i == 3) {
            this.f = 10000000L;
        } else if (i == 4) {
            this.f = 500000L;
        } else {
            r3.l();
        }
    }
}
