package defpackage;

import android.os.SystemClock;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class dsg {
    public static final t4c a;

    static {
        asg asgVar;
        try {
            SystemClock.elapsedRealtimeNanos();
            asgVar = new asg(0);
        } catch (Throwable unused) {
            SystemClock.elapsedRealtime();
            asgVar = new asg(1);
        }
        a = asgVar;
    }
}
