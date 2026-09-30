package defpackage;

import android.media.AudioTrack;
import android.media.AudioTrack$StreamEventCallback;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class yk0 extends AudioTrack$StreamEventCallback {
    public final /* synthetic */ zk0 a;

    public yk0(zk0 zk0Var) {
        this.a = zk0Var;
    }

    public final void onDataRequest(AudioTrack audioTrack, int i) {
        this.a.c.i.e(-1, new qc0(5));
    }

    public final void onPresentationEnded(AudioTrack audioTrack) {
        this.a.c.i.e(-1, new qc0(6));
    }

    public final void onTearDown(AudioTrack audioTrack) {
        this.a.c.i.e(-1, new qc0(5));
    }
}
