package defpackage;

import ai.askquin.qa.bridge.QaResult;
import ai.askquin.qa.capabilities.seasonal.SeasonalQaFixtureState;
import tech.chatmind.api.credits.UsageBillingBalance;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class m76 implements d3b {
    @Override // defpackage.d3b
    public final dm1 a() {
        return dm1.a;
    }

    @Override // defpackage.d3b
    public final QaResult c(ti7 ti7Var) {
        SeasonalQaFixtureState seasonalQaFixtureStateP = v2c.p();
        return new QaResult.Ok(seasonalQaFixtureStateP != null ? q1c.j(seasonalQaFixtureStateP) : new ti7(ib8.q(UsageBillingBalance.STATUS_ACTIVE, oh7.a(Boolean.FALSE))));
    }

    @Override // defpackage.d3b
    public final String getId() {
        return "seasonal.fixture.get";
    }

    @Override // defpackage.d3b
    public final String getTitle() {
        return "读取当前四季牌阵 QA fixture";
    }
}
