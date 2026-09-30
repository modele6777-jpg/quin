package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class a09 {
    public final usc a = usc.a;
    public final boolean b;
    public final boolean c;

    public a09(boolean z, boolean z2) {
        this.b = z;
        this.c = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a09)) {
            return false;
        }
        a09 a09Var = (a09) obj;
        return this.a == a09Var.a && this.c == a09Var.c && this.b == a09Var.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ub3.d(this.a.hashCode() * 31, 29791, this.b);
    }
}
