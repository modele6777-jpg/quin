package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class m58 implements g7g {
    public final g7g a;
    public final int b;

    public m58(g7g g7gVar, int i) {
        this.a = g7gVar;
        this.b = i;
    }

    @Override // defpackage.g7g
    public final int a(sw3 sw3Var) {
        if (z7c.k(this.b, 16)) {
            return this.a.a(sw3Var);
        }
        return 0;
    }

    @Override // defpackage.g7g
    public final int b(sw3 sw3Var, cv7 cv7Var) {
        if (z7c.k(this.b, cv7Var == cv7.a ? 4 : 1)) {
            return this.a.b(sw3Var, cv7Var);
        }
        return 0;
    }

    @Override // defpackage.g7g
    public final int c(sw3 sw3Var) {
        if (z7c.k(this.b, 32)) {
            return this.a.c(sw3Var);
        }
        return 0;
    }

    @Override // defpackage.g7g
    public final int d(sw3 sw3Var, cv7 cv7Var) {
        if (z7c.k(this.b, cv7Var == cv7.a ? 8 : 2)) {
            return this.a.d(sw3Var, cv7Var);
        }
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m58)) {
            return false;
        }
        m58 m58Var = (m58) obj;
        return pa7.t(this.a, m58Var.a) && this.b == m58Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        int i = this.b;
        int i2 = z7c.a;
        if ((i & i2) == i2) {
            z7c.s("Start", sb);
        }
        int i3 = z7c.c;
        if ((i & i3) == i3) {
            z7c.s("Left", sb);
        }
        if ((i & 16) == 16) {
            z7c.s("Top", sb);
        }
        int i4 = z7c.b;
        if ((i & i4) == i4) {
            z7c.s("End", sb);
        }
        int i5 = z7c.d;
        if ((i & i5) == i5) {
            z7c.s("Right", sb);
        }
        if ((i & 32) == 32) {
            z7c.s("Bottom", sb);
        }
        return "(" + this.a + " only " + ib8.j("WindowInsetsSides(", sb.toString(), ")") + ")";
    }
}
