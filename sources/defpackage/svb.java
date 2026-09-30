package defpackage;

import ai.askquin.qa.bridge.QaResult;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class svb implements d3b {
    @Override // defpackage.d3b
    public final QaResult c(ti7 ti7Var) {
        hs3 hs3Var = xqa.N0;
        Boolean bool = Boolean.FALSE;
        isa isaVar = hs3Var.a;
        qn2 qn2Var = lw2.a;
        ynb.V(qn2Var, null, null, new ovb(isaVar, bool, null), 3);
        ynb.V(qn2Var, null, null, new rvb(xqa.O0.a, bool, null), 3);
        return new QaResult.Ok((ti7) null, 1, (rp3) null);
    }

    @Override // defpackage.d3b
    public final String getId() {
        return "event.reset-may-day-popup";
    }

    @Override // defpackage.d3b
    public final String getTitle() {
        return "重置五一限定弹窗已展示 + deck-reset 标记";
    }
}
