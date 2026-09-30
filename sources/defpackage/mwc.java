package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class mwc implements v39 {
    public long a = 0;
    public final /* synthetic */ x16 b;
    public final /* synthetic */ owc c;
    public final /* synthetic */ x16 d;

    public mwc(jwc jwcVar, owc owcVar, x16 x16Var) {
        this.b = jwcVar;
        this.c = owcVar;
        this.d = x16Var;
    }

    @Override // defpackage.v39
    public final boolean a(long j) {
        bv7 bv7Var = (bv7) this.d.invoke();
        if (bv7Var == null) {
            return true;
        }
        if (!bv7Var.h() || !f()) {
            return false;
        }
        if (!this.c.b(bv7Var, j, this.a, gec.c, false)) {
            return true;
        }
        this.a = j;
        return true;
    }

    @Override // defpackage.v39
    public final void b() {
        this.c.c();
    }

    @Override // defpackage.v39
    public final boolean c(long j, wuc wucVar, int i) {
        bv7 bv7Var = (bv7) this.d.invoke();
        if (bv7Var == null || !bv7Var.h()) {
            return false;
        }
        this.c.d(bv7Var, j, wucVar, false);
        this.a = j;
        return f();
    }

    @Override // defpackage.v39
    public final boolean d(long j, wuc wucVar) {
        bv7 bv7Var = (bv7) this.d.invoke();
        if (bv7Var == null) {
            return true;
        }
        if (!bv7Var.h() || !f()) {
            return false;
        }
        if (!this.c.b(bv7Var, j, this.a, wucVar, false)) {
            return true;
        }
        this.a = j;
        return true;
    }

    @Override // defpackage.v39
    public final boolean e(long j) {
        bv7 bv7Var = (bv7) this.d.invoke();
        if (bv7Var == null || !bv7Var.h()) {
            return false;
        }
        if (this.c.b(bv7Var, j, this.a, gec.c, false)) {
            this.a = j;
        }
        return f();
    }

    public final boolean f() {
        x16 x16Var = this.b;
        if (x16Var == null) {
            return true;
        }
        return pwc.a(this.c, ((Number) x16Var.invoke()).longValue());
    }
}
