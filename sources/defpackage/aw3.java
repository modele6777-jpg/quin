package defpackage;

import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class aw3 extends u4 implements ScheduledFuture {
    public final ScheduledFuture v;

    public aw3(zv3 zv3Var) {
        this.v = zv3Var.a(new mjg(this));
    }

    @Override // java.lang.Comparable
    public final int compareTo(Delayed delayed) {
        return this.v.compareTo(delayed);
    }

    @Override // defpackage.u4
    public final void d() {
        ScheduledFuture scheduledFuture = this.v;
        Object obj = this.a;
        scheduledFuture.cancel((obj instanceof n4) && ((n4) obj).a);
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.v.getDelay(timeUnit);
    }
}
