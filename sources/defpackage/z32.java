package defpackage;

import ai.askquin.qa.bridge.Danger;
import ai.askquin.qa.bridge.QaResult;
import ai.askquin.qa.capabilities.seasonal.SeasonalQaFixtureState;
import tech.chatmind.api.credits.UsageBillingBalance;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class z32 implements d3b {
    public final rw5 a;
    public final Danger b = Danger.STAGING_ONLY;

    static {
        int i = rw5.f;
    }

    public z32(rw5 rw5Var) {
        this.a = rw5Var;
    }

    @Override // defpackage.d3b
    public final Danger b() {
        return this.b;
    }

    @Override // defpackage.d3b
    public final QaResult c(ti7 ti7Var) {
        qnc qncVarQ;
        String fixture;
        SeasonalQaFixtureState seasonalQaFixtureStateP = v2c.p();
        if (seasonalQaFixtureStateP == null || (fixture = seasonalQaFixtureStateP.getFixture()) == null) {
            qncVarQ = null;
        } else {
            qnc.a.getClass();
            qncVarQ = y25.q(fixture);
        }
        bm8.P(new rnc(2, null));
        if (qncVarQ != null) {
            this.a.e(qncVarQ.d());
        }
        return new QaResult.Ok(new ti7(ib8.q(UsageBillingBalance.STATUS_ACTIVE, oh7.a(Boolean.FALSE))));
    }

    @Override // defpackage.d3b
    public final String getId() {
        return "seasonal.fixture.clear";
    }

    @Override // defpackage.d3b
    public final String getTitle() {
        return "清除四季牌阵 QA fixture，恢复真实活动与权益";
    }
}
