package defpackage;

import android.os.SystemClock;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class asg extends t4c {
    public final /* synthetic */ int a;

    public /* synthetic */ asg(int i) {
        this.a = i;
    }

    @Override // defpackage.t4c
    public final long w() {
        switch (this.a) {
            case 0:
                return SystemClock.elapsedRealtimeNanos();
            default:
                return SystemClock.elapsedRealtime() * 1000000;
        }
    }
}
