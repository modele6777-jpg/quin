package defpackage;

import ai.askquin.qa.bridge.QaResult;
import ai.askquin.qa.capabilities.seasonal.SeasonalQaFixtureState;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class cub implements d3b {
    public final d6c a;
    public final u79 b;
    public final rw5 c;
    public final List d = t72.I("divination", "quick_decision", "divination_summary");

    static {
        int i = rw5.f;
    }

    public cub(d6c d6cVar, u79 u79Var, rw5 rw5Var) {
        this.a = d6cVar;
        this.b = u79Var;
        this.c = rw5Var;
    }

    @Override // defpackage.d3b
    public final QaResult c(ti7 ti7Var) {
        qnc qncVarQ;
        String fixture;
        Object dzbVar;
        f9e f9eVarA = this.a.a();
        ArrayList arrayList = new ArrayList();
        for (String str : this.d) {
            try {
                f9eVarA.z("DELETE FROM " + str);
                dzbVar = wef.a;
            } catch (Throwable th) {
                dzbVar = new dzb(th);
            }
            if (!(dzbVar instanceof dzb)) {
                arrayList.add(oh7.c(str));
            }
        }
        this.b.c();
        SeasonalQaFixtureState seasonalQaFixtureStateP = v2c.p();
        if (seasonalQaFixtureStateP == null || (fixture = seasonalQaFixtureStateP.getFixture()) == null) {
            qncVarQ = null;
        } else {
            qnc.a.getClass();
            qncVarQ = y25.q(fixture);
        }
        bm8.P(new rnc(2, null));
        if (qncVarQ != null) {
            this.c.e(qncVarQ.d());
        }
        boolean z = jd9.a;
        jd9.a = false;
        jd9.b = 0L;
        jd9.c.clear();
        iy9 iy9Var = new iy9("cleared_tables", new yg7(arrayList));
        Boolean bool = Boolean.TRUE;
        return new QaResult.Ok(new ti7(bm8.H(iy9Var, new iy9("clock_reset", oh7.a(bool)), new iy9("seasonal_fixture_reset", oh7.a(bool)), new iy9("netsim_reset", oh7.a(bool)))));
    }

    @Override // defpackage.d3b
    public final String getId() {
        return "reset.clean-slate";
    }

    @Override // defpackage.d3b
    public final String getTitle() {
        return "清空本地塔罗历史 + 重置时钟/网络模拟到干净态";
    }
}
