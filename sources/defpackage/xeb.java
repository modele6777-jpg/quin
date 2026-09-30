package defpackage;

import java.time.Instant;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class xeb {
    public final int a;
    public final Instant b;

    public xeb(int i, Instant instant) {
        this.a = i;
        this.b = instant;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xeb)) {
            return false;
        }
        xeb xebVar = (xeb) obj;
        return this.a == xebVar.a && pa7.t(this.b, xebVar.b);
    }

    public final int hashCode() {
        int iHashCode = Integer.hashCode(this.a) * 31;
        Instant instant = this.b;
        return iHashCode + (instant == null ? 0 : instant.hashCode());
    }

    public final String toString() {
        return "ReadingCountQuota(remaining=" + this.a + ", earliestPriority=" + this.b + ")";
    }
}
