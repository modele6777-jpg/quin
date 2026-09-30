package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class mo3 implements t7, hf8 {
    public final vz9 a = q1c.f("");
    public final vz9 b;
    public final vz9 c;
    public final whb d;

    public mo3() {
        hs3 hs3Var = xqa.z;
        qn2 qn2Var = lw2.a;
        vz9 vz9VarF = q1c.f("");
        isa isaVar = hs3Var.a;
        Object obj = hs3Var.b;
        ypa.a.getClass();
        int i = 1;
        kl5 kl5Var = new kl5(new fo3(ypa.b(), isaVar, obj), new go3(vz9VarF, null), i);
        pv2 pv2Var = qn2Var.a;
        js3 js3Var = ga4.a;
        wg6 wg6Var = mk8.a;
        ok8.C(kl5Var, jgb.k(pv2Var.p0(wg6Var)));
        this.b = vz9VarF;
        hs3 hs3Var2 = xqa.B;
        vz9 vz9VarF2 = q1c.f("");
        ok8.C(new kl5(new ko3(ypa.b(), hs3Var2.a, hs3Var2.b), new lo3(vz9VarF2, null), i), jgb.k(qn2Var.a.p0(wg6Var)));
        this.c = vz9VarF2;
        hs3 hs3Var3 = xqa.A;
        this.d = if9.F(new bo3(new kl5(new xn3(ypa.b(), hs3Var3.a, hs3Var3.b), new tn3(this, null), i)), qn2Var, med.a, Boolean.FALSE);
    }

    public final String a() {
        return (String) this.a.getValue();
    }

    public final boolean b() {
        return !v4e.Q(a());
    }
}
