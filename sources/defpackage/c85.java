package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class c85 implements u48 {
    public final h48 a;
    public final boolean b;
    public final yr2 c;
    public final v7b d;
    public boolean e;
    public boolean f;

    public c85(h48 h48Var, boolean z, yr2 yr2Var, v7b v7bVar) {
        h48Var.getClass();
        this.a = h48Var;
        this.b = z;
        this.c = yr2Var;
        this.d = v7bVar;
    }

    public final void a() {
        if (this.e || this.f) {
            return;
        }
        this.e = true;
        this.c.invoke();
    }

    @Override // defpackage.u48
    public final void h(x48 x48Var, f48 f48Var) {
        if (f48Var == f48.ON_RESUME) {
            a();
        }
    }
}
