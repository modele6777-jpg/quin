package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class lwc implements qne {
    public long a = 9205357640488583168L;
    public long b = 9205357640488583168L;
    public long c = 0;
    public wuc d = gec.c;
    public final /* synthetic */ jwc e;
    public final /* synthetic */ jwc f;
    public final /* synthetic */ owc g;

    public lwc(jwc jwcVar, jwc jwcVar2, owc owcVar) {
        this.e = jwcVar;
        this.f = jwcVar2;
        this.g = owcVar;
    }

    @Override // defpackage.qne
    public final void a(long j, wuc wucVar) {
        this.d = wucVar;
        bv7 bv7Var = (bv7) this.f.invoke();
        if (bv7Var != null) {
            if (!bv7Var.h()) {
                return;
            }
            this.g.d(bv7Var, j, this.d, true);
            this.a = j;
            this.b = bv7Var.N(0L);
        }
        if (pwc.a(this.g, ((Number) this.e.invoke()).longValue())) {
            this.c = 0L;
        }
    }

    @Override // defpackage.qne
    public final void b() {
        long jLongValue = ((Number) this.e.invoke()).longValue();
        owc owcVar = this.g;
        if (pwc.a(owcVar, jLongValue)) {
            owcVar.c();
        }
        this.a = 9205357640488583168L;
        this.b = 9205357640488583168L;
    }

    @Override // defpackage.qne
    public final void e(long j) {
        bv7 bv7Var = (bv7) this.f.invoke();
        if (bv7Var == null || !bv7Var.h()) {
            return;
        }
        long jLongValue = ((Number) this.e.invoke()).longValue();
        owc owcVar = this.g;
        if (pwc.a(owcVar, jLongValue)) {
            this.c = hl9.g(this.c, j);
            long jF = hl9.f(hl9.g(this.a, this.c), hl9.f(bv7Var.N(0L), this.b));
            if (owcVar.b(bv7Var, jF, this.a, this.d, true)) {
                this.a = jF;
                this.b = bv7Var.N(0L);
                this.c = 0L;
            }
        }
    }

    @Override // defpackage.qne
    public final void onCancel() {
        long jLongValue = ((Number) this.e.invoke()).longValue();
        owc owcVar = this.g;
        if (pwc.a(owcVar, jLongValue)) {
            owcVar.c();
        }
        this.a = 9205357640488583168L;
        this.b = 9205357640488583168L;
    }

    @Override // defpackage.qne
    public final void c() {
    }

    @Override // defpackage.qne
    public final void d() {
    }
}
