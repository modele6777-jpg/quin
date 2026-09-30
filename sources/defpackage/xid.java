package defpackage;

import android.os.ConditionVariable;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class xid extends Thread {
    public final /* synthetic */ ConditionVariable a;
    public final /* synthetic */ yid b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xid(yid yidVar, ConditionVariable conditionVariable) {
        super("ExoPlayer:SimpleCacheInit");
        this.b = yidVar;
        this.a = conditionVariable;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        synchronized (this.b) {
            this.a.open();
            this.b.f();
            this.b.b.getClass();
        }
    }
}
