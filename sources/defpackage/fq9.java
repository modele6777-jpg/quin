package defpackage;

import ai.askquin.qa.bridge.QaResult;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class fq9 implements d3b {
    @Override // defpackage.d3b
    public final QaResult c(ti7 ti7Var) {
        return w04.a("card-detail", null);
    }

    @Override // defpackage.d3b
    public final String getId() {
        return "nav.open-card-detail-mock";
    }

    @Override // defpackage.d3b
    public final String getTitle() {
        return "一键打开牌义详情 Mock（无需抽牌/牌组前置流程）";
    }
}
