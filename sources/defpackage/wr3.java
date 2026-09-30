package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class wr3 implements no8 {
    public final nyd a;
    public final g55 b;
    public hu0 c;
    public no8 d;
    public boolean e;
    public boolean f;

    public wr3(g55 g55Var) {
        this.b = g55Var;
        nyd nydVar = new nyd();
        nydVar.e = nga.d;
        this.a = nydVar;
        this.e = true;
    }

    @Override // defpackage.no8
    public final void a(nga ngaVar) {
        no8 no8Var = this.d;
        if (no8Var != null) {
            no8Var.a(ngaVar);
            ngaVar = this.d.e();
        }
        this.a.a(ngaVar);
    }

    @Override // defpackage.no8
    public final long b() {
        if (this.e) {
            return this.a.b();
        }
        no8 no8Var = this.d;
        no8Var.getClass();
        return no8Var.b();
    }

    @Override // defpackage.no8
    public final boolean c() {
        if (this.e) {
            return false;
        }
        no8 no8Var = this.d;
        no8Var.getClass();
        return no8Var.c();
    }

    public final void d(hu0 hu0Var) {
        no8 no8Var;
        no8 no8VarJ = hu0Var.j();
        if (no8VarJ == null || no8VarJ == (no8Var = this.d)) {
            return;
        }
        if (no8Var != null) {
            throw new g45(2, new IllegalStateException("Multiple renderer media clocks enabled."), 1000);
        }
        this.d = no8VarJ;
        this.c = hu0Var;
        ((qo8) no8VarJ).a((nga) this.a.e);
    }

    @Override // defpackage.no8
    public final nga e() {
        no8 no8Var = this.d;
        return no8Var != null ? no8Var.e() : (nga) this.a.e;
    }
}
