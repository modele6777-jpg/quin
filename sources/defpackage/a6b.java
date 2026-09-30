package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class a6b extends ewf {
    public final hba b;
    public final String c;
    public final s0e d;
    public final s0e e;
    public final whb f;
    public lyd g;

    public a6b(hba hbaVar, String str) {
        this.b = hbaVar;
        this.c = str;
        s0e s0eVarA = t0e.a(0);
        this.d = s0eVarA;
        s0e s0eVarA2 = t0e.a(pu4.a);
        this.e = s0eVarA2;
        sba sbaVar = (sba) hbaVar;
        ok8.C(new kl5(new al5(new ybc(new oba(sbaVar, str, null)), new pba(sbaVar, null)), new v5b(this, null), 1), hwf.a(this));
        this.f = if9.F(new wm5(s0eVarA, s0eVarA2, new z5b(3, null), 0), hwf.a(this), new xzd(3000L, Long.MAX_VALUE), s5b.a);
    }

    @Override // defpackage.ewf
    public final void e() {
        lyd lydVar = this.g;
        if (lydVar != null) {
            lydVar.h(null);
        }
        this.g = null;
    }
}
