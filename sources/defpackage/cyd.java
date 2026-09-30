package defpackage;

import ai.askquin.qa.bridge.QaResult;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class cyd implements d3b {
    public final k2c a;
    public final t7 b;

    public cyd(k2c k2cVar, t7 t7Var) {
        this.a = k2cVar;
        this.b = t7Var;
    }

    @Override // defpackage.d3b
    public final QaResult c(ti7 ti7Var) {
        return t0c.a(this.b, "请从历史打开一条已完成占卜，或重建当前解读页面", new byd(this, null));
    }

    @Override // defpackage.d3b
    public final String getId() {
        return "review-reward.stage-snackbar-exposure";
    }

    @Override // defpackage.d3b
    public final String getTitle() {
        return "设置评价奖励 Snackbar 已领取曝光状态";
    }
}
