package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class zx8 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;

    public zx8(boolean z, boolean z2, boolean z3, boolean z4) {
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zx8)) {
            return false;
        }
        zx8 zx8Var = (zx8) obj;
        return this.a == zx8Var.a && this.b == zx8Var.b && this.c == zx8Var.c && this.d == zx8Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ub3.d(ub3.d(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder sbP = ib8.p("MixpanelAuthorizationResult(isReady=", ", isFirstAuthorization=", ", didEstablishFreshBaseline=", this.a, this.b);
        sbP.append(this.c);
        sbP.append(", didPersistAuthorization=");
        sbP.append(this.d);
        sbP.append(")");
        return sbP.toString();
    }
}
