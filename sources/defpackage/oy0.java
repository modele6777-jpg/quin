package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class oy0 extends ewf implements hf8 {
    public static final /* synthetic */ int g = 0;
    public final ht6 b;
    public final tz9 c = new tz9(60);
    public lyd d;
    public final vz9 e;
    public final vz9 f;

    public oy0(ht6 ht6Var) {
        this.b = ht6Var;
        Boolean bool = Boolean.FALSE;
        this.e = q1c.f(bool);
        this.f = q1c.f(bool);
    }

    public static void f(oy0 oy0Var) {
        lyd lydVar = oy0Var.d;
        if (lydVar != null) {
            lydVar.h(null);
        }
        a62 a62VarA = hwf.a(oy0Var);
        js3 js3Var = ga4.a;
        oy0Var.d = ynb.V(a62VarA, hr3.c, null, new my0(60L, oy0Var, null), 2);
    }

    @Override // defpackage.ewf
    public final void e() {
        lyd lydVar = this.d;
        if (lydVar != null) {
            lydVar.h(null);
        }
        this.d = null;
    }
}
