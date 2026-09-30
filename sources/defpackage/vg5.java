package defpackage;

import com.google.firebase.crashlytics.internal.common.CrashlyticsAppQualitySessionsSubscriber;
import java.util.concurrent.CountDownLatch;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class vg5 {
    public final CountDownLatch a;
    public CrashlyticsAppQualitySessionsSubscriber b = null;

    public vg5(CountDownLatch countDownLatch) {
        this.a = countDownLatch;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vg5)) {
            return false;
        }
        vg5 vg5Var = (vg5) obj;
        return this.a.equals(vg5Var.a) && pa7.t(this.b, vg5Var.b);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        CrashlyticsAppQualitySessionsSubscriber crashlyticsAppQualitySessionsSubscriber = this.b;
        return iHashCode + (crashlyticsAppQualitySessionsSubscriber == null ? 0 : crashlyticsAppQualitySessionsSubscriber.hashCode());
    }

    public final String toString() {
        return "Dependency(latch=" + this.a + ", subscriber=" + this.b + ')';
    }
}
