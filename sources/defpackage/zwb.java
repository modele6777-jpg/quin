package defpackage;

import ai.askquin.qa.bridge.QaResult;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class zwb implements d3b {
    @Override // defpackage.d3b
    public final QaResult c(ti7 ti7Var) {
        isa isaVar = xqa.D0.a;
        qn2 qn2Var = lw2.a;
        ynb.V(qn2Var, null, null, new mwb(isaVar, 0, null), 3);
        hs3 hs3Var = xqa.E0;
        Boolean bool = Boolean.FALSE;
        ynb.V(qn2Var, null, null, new pwb(hs3Var.a, bool, null), 3);
        ynb.V(qn2Var, null, null, new swb(xqa.F0.a, 0, null), 3);
        ynb.V(qn2Var, null, null, new vwb(xqa.G0.a, bool, null), 3);
        ynb.V(qn2Var, null, null, new ywb(xqa.H0.a, "", null), 3);
        return new QaResult.Ok((ti7) null, 1, (rp3) null);
    }

    @Override // defpackage.d3b
    public final String getId() {
        return "event.reset-widget-guide";
    }

    @Override // defpackage.d3b
    public final String getTitle() {
        return "重置占卜后加组件半拉框（次数 + 不再提醒 + 当日配额）";
    }
}
