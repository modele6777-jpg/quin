package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class fx implements g7g {
    public final int a;
    public final String b;
    public final vz9 c = q1c.f(x47.e);
    public final vz9 d = q1c.f(Boolean.TRUE);

    public fx(int i, String str) {
        this.a = i;
        this.b = str;
    }

    @Override // defpackage.g7g
    public final int a(sw3 sw3Var) {
        return e().b;
    }

    @Override // defpackage.g7g
    public final int b(sw3 sw3Var, cv7 cv7Var) {
        return e().c;
    }

    @Override // defpackage.g7g
    public final int c(sw3 sw3Var) {
        return e().d;
    }

    @Override // defpackage.g7g
    public final int d(sw3 sw3Var, cv7 cv7Var) {
        return e().a;
    }

    public final x47 e() {
        return (x47) this.c.getValue();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof fx) {
            return this.a == ((fx) obj).a;
        }
        return false;
    }

    public final void f(boolean z) {
        this.d.setValue(Boolean.valueOf(z));
    }

    public final void g(h8g h8gVar, int i) {
        int i2 = this.a;
        if (i == 0 || (i & i2) != 0) {
            this.c.setValue(h8gVar.a.i(i2));
            f(h8gVar.a.u(i2));
        }
    }

    public final int hashCode() {
        return this.a;
    }

    public final String toString() {
        return this.b + "(" + e().a + ", " + e().b + ", " + e().c + ", " + e().d + ")";
    }
}
