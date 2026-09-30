package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class yo7 extends rf2 {
    public final String E0;
    public final Object F0;
    public final Boolean G0;
    public final iy9 H0;

    public yo7(String str, Object obj, Boolean bool, iy9 iy9Var, k09 k09Var) {
        super(k09Var);
        this.E0 = str;
        this.F0 = obj;
        this.G0 = bool;
        this.H0 = iy9Var;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof yo7)) {
            return false;
        }
        yo7 yo7Var = (yo7) obj;
        return this.E0.equals(yo7Var.E0) && pa7.t(this.F0, yo7Var.F0) && this.G0.equals(yo7Var.G0) && this.H0.equals(yo7Var.H0);
    }

    public final int hashCode() {
        int iHashCode = this.E0.hashCode() * 31;
        Object obj = this.F0;
        return this.H0.hashCode() + ((this.G0.hashCode() + ((iHashCode + (obj != null ? obj.hashCode() : 0)) * 31)) * 31);
    }
}
