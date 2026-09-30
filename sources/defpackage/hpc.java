package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class hpc {
    public final int a;
    public final int b;

    public hpc(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hpc)) {
            return false;
        }
        hpc hpcVar = (hpc) obj;
        return this.a == hpcVar.a && this.b == hpcVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return kv2.h(this.a, this.b, "SeasonalReminderContent(titleRes=", ", bodyRes=", ")");
    }
}
