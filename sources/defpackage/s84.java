package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class s84 {
    public final boolean a;
    public final boolean b;
    public final usc c;
    public final boolean d;
    public final boolean e;
    public final String f;
    public final int g;

    public s84(boolean z, boolean z2, boolean z3, boolean z4, int i) {
        z = (i & 1) != 0 ? true : z;
        z2 = (i & 2) != 0 ? true : z2;
        this.a = z;
        this.b = z2;
        this.c = usc.a;
        this.d = z3;
        this.e = z4;
        this.f = "";
        this.g = 2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s84)) {
            return false;
        }
        s84 s84Var = (s84) obj;
        return this.a == s84Var.a && this.b == s84Var.b && this.c == s84Var.c && this.d == s84Var.d && this.e == s84Var.e && this.g == s84Var.g;
    }

    public final int hashCode() {
        return (ub3.d(ub3.d((this.c.hashCode() + ub3.d(Boolean.hashCode(this.a) * 31, 31, this.b)) * 31, 31, this.d), 31, this.e) + this.g) * 31;
    }

    public /* synthetic */ s84(boolean z, boolean z2, int i) {
        this((i & 1) != 0 ? true : z, (i & 2) != 0 ? true : z2, (i & 4) != 0);
    }

    public s84(boolean z, boolean z2, boolean z3) {
        this(z, z2, z3, true, 224);
    }
}
