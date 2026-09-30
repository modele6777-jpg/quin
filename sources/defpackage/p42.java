package defpackage;

import ai.askquin.qa.bridge.QaResult;
import ai.askquin.qa.capabilities.seasonal.SeasonalQaFixtureState;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.ListIterator;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class p42 implements d3b {
    public final u79 a;
    public final rw5 b;

    static {
        int i = rw5.f;
    }

    public p42(u79 u79Var, rw5 rw5Var) {
        this.a = u79Var;
        this.b = rw5Var;
    }

    @Override // defpackage.d3b
    public final QaResult c(ti7 ti7Var) {
        qnc qncVarQ;
        String fixture;
        c78 c78VarW = t72.w();
        vz9 vz9Var = kh3.a;
        Boolean bool = Boolean.FALSE;
        vz9Var.setValue(bool);
        c78VarW.add("account.skip-bind-phone");
        kh3.b.setValue(bool);
        c78VarW.add("debug.card-wheel-tap-overlay");
        boolean z = jd9.a;
        jd9.a = false;
        jd9.b = 0L;
        jd9.c.clear();
        c78VarW.add("env.net-sim.offline");
        c78VarW.add("env.net-sim.slow");
        c78VarW.add("env.net-sim.fail");
        this.a.c();
        c78VarW.add("clock.set");
        c78VarW.add("env.clock.advance");
        SeasonalQaFixtureState seasonalQaFixtureStateP = v2c.p();
        if (seasonalQaFixtureStateP == null || (fixture = seasonalQaFixtureStateP.getFixture()) == null) {
            qncVarQ = null;
        } else {
            qnc.a.getClass();
            qncVarQ = y25.q(fixture);
        }
        bm8.P(new rnc(2, null));
        if (qncVarQ != null) {
            this.b.e(qncVarQ.d());
        }
        c78VarW.add("seasonal.fixture.set");
        isa isaVar = xqa.w0.a;
        qn2 qn2Var = lw2.a;
        ynb.V(qn2Var, null, null, new c42(isaVar, "", null), 3);
        ynb.V(qn2Var, null, null, new f42(xqa.x0.a, bool, null), 3);
        c78VarW.add("paywall.set-ab-group");
        ynb.V(qn2Var, null, null, new i42(xqa.Y.a, "", null), 3);
        c78VarW.add("event.set-events-info");
        ynb.V(qn2Var, null, null, new a20(xqa.u.a, bool, null), 3);
        c78VarW.add("flag.set-annual-fortune");
        ynb.V(qn2Var, null, null, new l42(xqa.w.a, -1, null), 3);
        c78VarW.add("home.set-event-banner-visible");
        ynb.V(qn2Var, null, null, new o42(xqa.x.a, -1, null), 3);
        LocalDateTime localDateTime = xs5.a;
        xs5.c(false);
        c78VarW.add("home.set-four-seasons-visible");
        ynb.V(qn2Var, null, null, new rra(xqa.U.a, "", null), 3);
        c78VarW.add("flag.set-custom-domain");
        c78 c78VarN = c78VarW.n();
        ArrayList arrayList = new ArrayList(t72.u(c78VarN, 10));
        ListIterator listIterator = c78VarN.listIterator(0);
        while (true) {
            ql6 ql6Var = (ql6) listIterator;
            if (!ql6Var.hasNext()) {
                return new QaResult.Ok(new ti7(bm8.G(new iy9("cleared", new yg7(arrayList)))));
            }
            arrayList.add(oh7.c((String) ql6Var.next()));
        }
    }

    @Override // defpackage.d3b
    public final String getId() {
        return "qa.clear-switches";
    }

    @Override // defpackage.d3b
    public final String getTitle() {
        return "清除所有调试开关（全部恢复原始态）";
    }
}
