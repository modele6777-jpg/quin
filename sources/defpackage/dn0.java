package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class dn0 {
    public final boolean a;
    public final boolean b;

    public dn0(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dn0)) {
            return false;
        }
        dn0 dn0Var = (dn0) obj;
        return this.a == dn0Var.a && this.b == dn0Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (Boolean.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "AutoRenewState(shouldShowEntry=" + this.a + ", isAutoRenew=" + this.b + ")";
    }
}
