package defpackage;

import ai.askquin.qa.bridge.QaResult;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class x32 implements d3b {
    @Override // defpackage.d3b
    public final QaResult c(ti7 ti7Var) {
        isa isaVar = xqa.t0.a;
        qn2 qn2Var = lw2.a;
        ynb.V(qn2Var, null, null, new t32(isaVar, "", null), 3);
        ynb.V(qn2Var, null, null, new w32(xqa.s0.a, "", null), 3);
        return new QaResult.Ok((ti7) null, 1, (rp3) null);
    }

    @Override // defpackage.d3b
    public final String getId() {
        return "paywall.clear-sku-cache";
    }

    @Override // defpackage.d3b
    public final String getTitle() {
        return "清空 Paywall SKU + 实验分组缓存";
    }
}
