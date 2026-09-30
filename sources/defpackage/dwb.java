package defpackage;

import ai.askquin.qa.bridge.QaResult;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class dwb implements d3b {
    public final k2c a;
    public final t7 b;

    public dwb(k2c k2cVar, t7 t7Var) {
        this.a = k2cVar;
        this.b = t7Var;
    }

    @Override // defpackage.d3b
    public final QaResult c(ti7 ti7Var) {
        return t0c.a(this.b, null, new cwb(this, null));
    }

    @Override // defpackage.d3b
    public final String getId() {
        return "review-reward.reset";
    }

    @Override // defpackage.d3b
    public final String getTitle() {
        return "重置当前账号评价奖励状态";
    }
}
