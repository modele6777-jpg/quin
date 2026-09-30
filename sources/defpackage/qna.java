package defpackage;

import java.time.Instant;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class qna extends gcg {
    public static final /* synthetic */ int v = 0;
    public final d56 d;
    public final vz9 e = q1c.f(null);
    public final vz9 f;
    public final vz9 g;

    public qna(d56 d56Var) {
        this.d = d56Var;
        ca2.a.getClass();
        this.f = q1c.f(Boolean.valueOf(ca2.c));
        hs3 hs3Var = xqa.T;
        Boolean bool = Boolean.FALSE;
        qn2 qn2Var = lw2.a;
        vz9 vz9VarF = q1c.f(bool);
        isa isaVar = hs3Var.a;
        Object obj = hs3Var.b;
        ypa.a.getClass();
        kl5 kl5Var = new kl5(new ona(ypa.b(), isaVar, obj), new pna(vz9VarF, null), 1);
        pv2 pv2Var = qn2Var.a;
        js3 js3Var = ga4.a;
        ok8.C(kl5Var, jgb.k(pv2Var.p0(mk8.a)));
        this.g = vz9VarF;
    }

    public static Instant g(hs3 hs3Var) {
        Object dzbVar;
        String str = (String) z5c.I(nu4.a, new kna(hs3Var.a, hs3Var.b, null));
        if (str.length() == 0) {
            Instant instant = Instant.MIN;
            instant.getClass();
            return instant;
        }
        try {
            dzbVar = Instant.parse(str);
        } catch (Throwable th) {
            dzbVar = new dzb(th);
        }
        if (ezb.a(dzbVar) != null) {
            dzbVar = Instant.MIN;
        }
        dzbVar.getClass();
        return (Instant) dzbVar;
    }

    public final boolean h() {
        return ((Boolean) this.f.getValue()).booleanValue();
    }

    public final vma i() {
        return (vma) this.e.getValue();
    }
}
