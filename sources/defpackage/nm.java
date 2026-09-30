package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class nm implements is8 {
    public final jx0 a;
    public final jx0 b;
    public final int c;

    public nm(jx0 jx0Var, jx0 jx0Var2, int i) {
        this.a = jx0Var;
        this.b = jx0Var2;
        this.c = i;
    }

    @Override // defpackage.is8
    public final int a(a77 a77Var, long j, int i, cv7 cv7Var) {
        int iA = this.b.a(0, a77Var.d(), cv7Var);
        int i2 = -this.a.a(0, i, cv7Var);
        cv7 cv7Var2 = cv7.a;
        int i3 = this.c;
        if (cv7Var != cv7Var2) {
            i3 = -i3;
        }
        return a77Var.a + iA + i2 + i3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nm)) {
            return false;
        }
        nm nmVar = (nm) obj;
        return this.a.equals(nmVar.a) && this.b.equals(nmVar.b) && this.c == nmVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + ub3.a(this.b.a, Float.hashCode(this.a.a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Horizontal(menuAlignment=");
        sb.append(this.a);
        sb.append(", anchorAlignment=");
        sb.append(this.b);
        sb.append(", offset=");
        return tec.n(sb, this.c, ')');
    }
}
