package defpackage;

import ai.askquin.qa.bridge.QaResult;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class avb implements d3b {
    public final gd8 a;

    public avb(gd8 gd8Var) {
        this.a = gd8Var;
    }

    @Override // defpackage.d3b
    public final QaResult c(ti7 ti7Var) {
        isa isaVar = xqa.Y.a;
        qn2 qn2Var = lw2.a;
        ynb.V(qn2Var, null, null, new pub(isaVar, "", null), 3);
        ynb.V(qn2Var, null, null, new sub(xqa.W.a, "", null), 3);
        ynb.V(qn2Var, null, null, new vub(xqa.X.a, "", null), 3);
        hs3 hs3Var = xqa.a0;
        ynb.V(qn2Var, null, null, new yub(hs3Var.a, Boolean.TRUE, null), 3);
        bm8.P(new zub(this, null));
        return new QaResult.Ok((ti7) null, 1, (rp3) null);
    }

    @Override // defpackage.d3b
    public final String getId() {
        return "event.reset-all";
    }

    @Override // defpackage.d3b
    public final String getTitle() {
        return "全量重置活动状态（events + 已消费 id + 抽牌提示 + localStorage）";
    }
}
