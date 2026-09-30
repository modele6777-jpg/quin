package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class om implements js8 {
    public final kx0 a;
    public final kx0 b;
    public final int c;

    public om(kx0 kx0Var, kx0 kx0Var2, int i) {
        this.a = kx0Var;
        this.b = kx0Var2;
        this.c = i;
    }

    @Override // defpackage.js8
    public final int a(a77 a77Var, long j, int i) {
        int iA = this.b.a(0, a77Var.b());
        return a77Var.b + iA + (-this.a.a(0, i)) + this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof om)) {
            return false;
        }
        om omVar = (om) obj;
        return this.a.equals(omVar.a) && this.b.equals(omVar.b) && this.c == omVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + ub3.a(this.b.a, Float.hashCode(this.a.a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Vertical(menuAlignment=");
        sb.append(this.a);
        sb.append(", anchorAlignment=");
        sb.append(this.b);
        sb.append(", offset=");
        return tec.n(sb, this.c, ')');
    }
}
