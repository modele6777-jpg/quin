package defpackage;

import android.os.SystemClock;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class mgc extends h36 implements x16 {
    public static final mgc a = new mgc(0, SystemClock.class, "elapsedRealtime", "elapsedRealtime()J", 0);

    @Override // defpackage.x16
    public final Object invoke() {
        return Long.valueOf(SystemClock.elapsedRealtime());
    }
}
