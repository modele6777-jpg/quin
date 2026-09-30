package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class upa extends m93 {
    public final Object r;
    public final long s;

    public upa(long j, Object obj) {
        this.r = obj;
        this.s = j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof upa)) {
            return false;
        }
        upa upaVar = (upa) obj;
        return this.r.equals(upaVar.r) && this.s == upaVar.s;
    }

    public final int hashCode() {
        return Long.hashCode(this.s) + (this.r.hashCode() * 31);
    }

    public final String toString() {
        return "PredictiveBackHandlerInfo(owner=" + this.r + ", compositeKey=" + this.s + ')';
    }
}
