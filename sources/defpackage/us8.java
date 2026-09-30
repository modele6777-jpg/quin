package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class us8 implements n55 {
    public final n55 a;
    public final h1f b;

    public us8(n55 n55Var, h1f h1fVar) {
        this.a = n55Var;
        this.b = h1fVar;
    }

    @Override // defpackage.n55
    public final void a() {
        this.a.a();
    }

    @Override // defpackage.n55
    public final h1f b() {
        return this.b;
    }

    @Override // defpackage.n55
    public final void c(boolean z) {
        this.a.c(z);
    }

    @Override // defpackage.n55
    public final rr5 d(int i) {
        return this.b.d[this.a.e(i)];
    }

    @Override // defpackage.n55
    public final int e(int i) {
        return this.a.e(i);
    }

    public final boolean equals(Object obj) {
        if (m(obj) && (obj instanceof us8)) {
            return this.b.equals(((us8) obj).b);
        }
        return false;
    }

    @Override // defpackage.n55
    public final void f() {
        this.a.f();
    }

    @Override // defpackage.n55
    public final int g() {
        return this.a.g();
    }

    @Override // defpackage.n55
    public final rr5 h() {
        return this.b.d[this.a.g()];
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    @Override // defpackage.n55
    public final void i(float f) {
        this.a.i(f);
    }

    @Override // defpackage.n55
    public final void j() {
        this.a.j();
    }

    @Override // defpackage.n55
    public final void k() {
        this.a.k();
    }

    @Override // defpackage.n55
    public final int l(int i) {
        return this.a.l(i);
    }

    @Override // defpackage.n55
    public final int length() {
        return this.a.length();
    }

    public final boolean m(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof us8) {
            return this.a.equals(((us8) obj).a);
        }
        return false;
    }
}
