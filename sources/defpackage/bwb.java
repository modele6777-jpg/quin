package defpackage;

import ai.askquin.qa.bridge.QaResult;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class bwb implements d3b {
    public final fcb a;

    public bwb(fcb fcbVar) {
        this.a = fcbVar;
    }

    @Override // defpackage.d3b
    public final QaResult c(ti7 ti7Var) {
        fcb fcbVar = this.a;
        ynb.V(fcbVar.b, null, null, new ecb(fcbVar, null), 3);
        return new QaResult.Ok((ti7) null, 1, (rp3) null);
    }

    @Override // defpackage.d3b
    public final String getId() {
        return "account.reset-rating-time";
    }

    @Override // defpackage.d3b
    public final String getTitle() {
        return "重置评分记录时间（复测评分弹窗触发条件）";
    }
}
