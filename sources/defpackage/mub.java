package defpackage;

import ai.askquin.qa.bridge.QaResult;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class mub implements d3b {
    @Override // defpackage.d3b
    public final QaResult c(ti7 ti7Var) {
        hs3 hs3Var = xqa.a0;
        Boolean bool = Boolean.TRUE;
        ynb.V(lw2.a, null, null, new lub(hs3Var.a, bool, null), 3);
        return new QaResult.Ok((ti7) null, 1, (rp3) null);
    }

    @Override // defpackage.d3b
    public final String getId() {
        return "draw.reset-card-tips";
    }

    @Override // defpackage.d3b
    public final String getTitle() {
        return "重置抽牌提示（再次显示）";
    }
}
