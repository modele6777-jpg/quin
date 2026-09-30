package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class a08 {
    public final Object a;
    public final b08 b;
    public int d;
    public a08 e;
    public boolean f;
    public int c = -1;
    public final vz9 g = q1c.f(null);

    public a08(Object obj, b08 b08Var) {
        this.a = obj;
        this.b = b08Var;
    }

    public final a08 a() {
        if (this.f) {
            l37.c("Pin should not be called on an already disposed item ");
        }
        if (this.d == 0) {
            this.b.a.add(this);
            a08 a08Var = (a08) this.g.getValue();
            if (a08Var != null) {
                a08Var.a();
            } else {
                a08Var = null;
            }
            this.e = a08Var;
        }
        this.d++;
        return this;
    }

    public final void b() {
        if (this.f) {
            return;
        }
        if (this.d <= 0) {
            l37.c("Release should only be called once");
        }
        int i = this.d - 1;
        this.d = i;
        if (i == 0) {
            this.b.a.remove(this);
            a08 a08Var = this.e;
            if (a08Var != null) {
                a08Var.b();
            }
            this.e = null;
        }
    }
}
