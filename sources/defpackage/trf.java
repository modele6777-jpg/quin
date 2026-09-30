package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class trf implements g7g {
    public final String a;
    public final vz9 b;

    public trf(g57 g57Var, String str) {
        this.a = str;
        this.b = q1c.f(g57Var);
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

    public final g57 e() {
        return (g57) this.b.getValue();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof trf) {
            return pa7.t(e(), ((trf) obj).e());
        }
        return false;
    }

    public final void f(g57 g57Var) {
        this.b.setValue(g57Var);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return this.a + "(left=" + e().a + ", top=" + e().b + ", right=" + e().c + ", bottom=" + e().d + ")";
    }
}
