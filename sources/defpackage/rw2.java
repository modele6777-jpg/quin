package defpackage;

import java.time.Instant;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class rw2 {
    public final int a;
    public final Instant b;

    public rw2(int i, Instant instant) {
        this.a = i;
        this.b = instant;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rw2)) {
            return false;
        }
        rw2 rw2Var = (rw2) obj;
        return this.a == rw2Var.a && this.b.equals(rw2Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "CountSource(remaining=" + this.a + ", priority=" + this.b + ")";
    }
}
