package defpackage;

import ai.askquin.repository.b;
import ai.askquin.ui.popup.dailyfortune.v;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class kq6 extends ewf {
    public final s0e E0;
    public final whb F0;
    public lyd G0;
    public lyd H0;
    public String I0;
    public String J0;
    public String K0;
    public boolean L0;
    public boolean M0;
    public final whb N0;
    public final vz9 O0;
    public final s0e P0;
    public final whb Q0;
    public final s0e R0;
    public lyd S0;
    public final whb T0;
    public final whb U0;
    public final s0e X;
    public final s0e Y;
    public iy9 Z;
    public final gd8 b;
    public final xof c;
    public final nb4 d;
    public final g6b e;
    public final xt6 f;
    public final ok6 g;
    public final s7 v;
    public final e3b w;
    public final v x;
    public final LocalDate y;
    public final s0e z;

    public kq6(b bVar, gd8 gd8Var, xof xofVar, nb4 nb4Var, g6b g6bVar, xt6 xt6Var, d43 d43Var, w55 w55Var, ok6 ok6Var, s7 s7Var, e3b e3bVar, v vVar) {
        this.b = gd8Var;
        this.c = xofVar;
        this.d = nb4Var;
        this.e = g6bVar;
        this.f = xt6Var;
        this.g = ok6Var;
        this.v = s7Var;
        this.w = e3bVar;
        this.x = vVar;
        ma8 ma8Var = f63.a;
        ma8Var.getClass();
        LocalDate localDateI = ma8Var.i();
        this.y = localDateI;
        LocalTime localTime = e73.a;
        s0e s0eVarA = t0e.a(e73.b(e3b.a(e3bVar)));
        this.z = s0eVarA;
        s0e s0eVarA2 = t0e.a(e73.a(e3b.a(e3bVar)));
        this.X = s0eVarA2;
        s0e s0eVarA3 = t0e.a(s0eVarA2.getValue());
        this.Y = s0eVarA3;
        this.Z = new iy9(((b93) s0eVarA.getValue()).a, s0eVarA2.getValue());
        s0e s0eVarA4 = t0e.a(null);
        this.E0 = s0eVarA4;
        this.F0 = if9.n(s0eVarA4);
        ybc ybcVar = new ybc(new lp6(bVar, null));
        js3 js3Var = ga4.a;
        hr3 hr3Var = hr3.c;
        wj5 wj5VarX = ym8.x(ybcVar, hr3Var);
        dw1 dw1Var = ((l65) w55Var).g;
        hs3 hs3Var = xqa.w;
        isa isaVar = hs3Var.a;
        Object obj = hs3Var.b;
        ypa.a.getClass();
        wm5 wm5Var = new wm5(dw1Var, new sp6(ypa.b(), isaVar, obj), new to6(3, null), 0);
        a62 a62VarA = hwf.a(this);
        uzd uzdVar = med.b;
        pu4 pu4Var = pu4.a;
        this.N0 = if9.F(wm5Var, a62VarA, uzdVar, pu4Var);
        this.O0 = q1c.f(Boolean.FALSE);
        this.P0 = t0e.a(((b93) s0eVarA.getValue()).a);
        wc8 wc8Var = gd8Var.d;
        this.Q0 = if9.F(dj6.I(new eq6(wc8Var)), hwf.a(this), med.a, pu4Var);
        s0e s0eVarA5 = t0e.a(0L);
        this.R0 = s0eVarA5;
        hs3 hs3Var2 = xqa.V;
        wm5 wm5Var2 = new wm5(s0eVarA5, new wp6(ypa.b(), hs3Var2.a, hs3Var2.b), new np6(3, null), 0);
        ynb.V(hwf.a(this), null, null, new po6(this, null), 3);
        ynb.V(hwf.a(this), null, null, new ro6(this, null), 3);
        ok8.C(new kl5(wm5Var2, new so6(this, null), 1), hwf.a(this));
        wj5 wj5VarX2 = ym8.x(am5.a(dj6.I(new wm5(s7.b(), s0eVarA, new vo6(3, null), 0)), new op6(null, this, d43Var, bVar)), hr3Var);
        a62 a62VarA2 = hwf.a(this);
        xzd xzdVar = new xzd(0L, Long.MAX_VALUE);
        LocalDate localDateA = ((b93) s0eVarA.getValue()).a();
        LocalDate localDate = ((b93) s0eVarA.getValue()).a;
        LocalDate localDate2 = ((b93) s0eVarA.getValue()).b;
        if (localDate2 == null) {
            qc0.p("Required value was null.");
            throw null;
        }
        whb whbVarF = if9.F(wj5VarX2, a62VarA2, xzdVar, new cn6(localDateI, localDateA, localDate, ((b93) s0eVarA.getValue()).a, null, null, null, null, localDate2, null, (h73) s0eVarA3.getValue(), (h73) s0eVarA2.getValue(), null, null, null, 29424));
        int i = 0;
        this.T0 = if9.F(new tm5(new wj5[]{whbVarF, s0eVarA3, s0eVarA2}, new dp6(4, null), i), hwf.a(this), new xzd(3000L, Long.MAX_VALUE), whbVarF.a.getValue());
        wj5 wj5VarI = dj6.I(new iq6(xofVar.b));
        hs3 hs3Var3 = xqa.x;
        this.U0 = if9.F(new wm5(wj5VarX, new yk5(ym8.x(new tm5(new wj5[]{wc8Var, wj5VarI, new aq6(ypa.b(), hs3Var3.a, hs3Var3.b), wm5Var2}, new ep6(5, null), 1), hr3Var), new fp6(2, null)), new jq6(3, null), i), hwf.a(this), uzdVar, new oo6());
    }

    public static void g(kq6 kq6Var, int i) {
        LocalDateTime localDateTimeA = e3b.a(kq6Var.w);
        boolean z = (i & 2) == 0;
        s0e s0eVar = kq6Var.P0;
        s0e s0eVar2 = kq6Var.z;
        b93 b93Var = (b93) s0eVar2.getValue();
        b93 b93VarB = e73.b(localDateTimeA);
        h73 h73VarA = e73.a(localDateTimeA);
        LocalDate localDate = b93VarB.a;
        iy9 iy9Var = new iy9(localDate, h73VarA);
        s0e s0eVar3 = kq6Var.X;
        s0eVar3.getClass();
        s0eVar3.n(null, h73VarA);
        if (!b93Var.a.equals(localDate) || (z && !pa7.t(kq6Var.Z, iy9Var))) {
            s0e s0eVar4 = kq6Var.Y;
            s0eVar4.getClass();
            s0eVar4.n(null, h73VarA);
            kq6Var.Z = iy9Var;
        }
        if (b93VarB.equals(b93Var)) {
            return;
        }
        LocalDate localDate2 = (LocalDate) s0eVar.getValue();
        if (!pa7.t(localDate2, b93Var.a)) {
            localDate = localDate2;
        }
        s0eVar.n(null, mh3.s(localDate, kq6Var.y, b93VarB.a()));
        s0eVar2.n(null, b93VarB);
    }

    public final void f() {
        lyd lydVar = this.H0;
        if (lydVar != null) {
            lydVar.h(null);
        }
        this.H0 = null;
        this.K0 = null;
        this.L0 = false;
        this.E0.m(null);
    }

    public final void h() {
        s0e s0eVar = this.R0;
        s0eVar.n(null, Long.valueOf(((Number) s0eVar.getValue()).longValue() + 1));
        i();
    }

    public final void i() {
        lyd lydVar = this.S0;
        if (lydVar != null) {
            lydVar.h(null);
        }
        Long l = g3b.a;
        if (g3b.a != null) {
            return;
        }
        LocalDateTime localDateTime = xs5.a;
        Long lB = xs5.b(null, 3);
        if (lB != null) {
            this.S0 = ynb.V(hwf.a(this), null, null, new mp6(lB.longValue(), this, null), 3);
        }
    }

    public final void k() {
        String str;
        h73 h73Var;
        if (this.M0) {
            s0e s0eVar = this.E0;
            if (s0eVar.getValue() == null && (str = this.J0) != null) {
                this.v.getClass();
                if (str.equals(s7.a())) {
                    this.K0 = str;
                    int iOrdinal = ((h73) this.Y.getValue()).ordinal();
                    if (iOrdinal == 0) {
                        h73Var = h73.b;
                    } else {
                        if (iOrdinal != 1) {
                            ap.c();
                            return;
                        }
                        h73Var = h73.a;
                    }
                    s0eVar.getClass();
                    s0eVar.n(null, h73Var);
                }
            }
        }
    }
}
