package defpackage;

import ai.askquin.qa.bridge.QaResult;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class l86 implements d3b {
    public final q9b a;
    public final t7 b;
    public final k86 c;

    public l86(q9b q9bVar, t7 t7Var, k86 k86Var) {
        this.a = q9bVar;
        this.b = t7Var;
        this.c = k86Var;
    }

    @Override // defpackage.d3b
    public final dm1 a() {
        return dm1.a;
    }

    @Override // defpackage.d3b
    public final QaResult c(ti7 ti7Var) {
        return new QaResult.Ok(bzd.w(this.a, this.b, this.c, null));
    }

    @Override // defpackage.d3b
    public final String getId() {
        return "event.gift-card-guide-state";
    }

    @Override // defpackage.d3b
    public final String getTitle() {
        return "读取礼品卡会员引导资格与曝光状态";
    }
}
