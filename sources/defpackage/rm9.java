package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class rm9 extends m93 {
    public final qm9 r;
    public final x48 s;

    public rm9(x48 x48Var, qm9 qm9Var) {
        qm9Var.getClass();
        this.r = qm9Var;
        this.s = x48Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rm9)) {
            return false;
        }
        rm9 rm9Var = (rm9) obj;
        return pa7.t(this.r, rm9Var.r) && pa7.t(this.s, rm9Var.s);
    }

    public final int hashCode() {
        int iHashCode = this.r.hashCode() * 31;
        x48 x48Var = this.s;
        return iHashCode + (x48Var == null ? 0 : x48Var.hashCode());
    }

    public final String toString() {
        return "OnBackPressedCallbackInfo(callback=" + this.r + ", owner=" + this.s + ')';
    }
}
