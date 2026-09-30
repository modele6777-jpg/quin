package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class sk7 extends qk2 {
    public final String G0;
    public final String H0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sk7(String str, String str2) {
        super(22);
        str.getClass();
        str2.getClass();
        this.G0 = str;
        this.H0 = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sk7)) {
            return false;
        }
        sk7 sk7Var = (sk7) obj;
        return pa7.t(this.G0, sk7Var.G0) && pa7.t(this.H0, sk7Var.H0);
    }

    public final int hashCode() {
        return this.H0.hashCode() + (this.G0.hashCode() * 31);
    }

    @Override // defpackage.qk2
    public final String s() {
        return this.G0 + this.H0;
    }
}
