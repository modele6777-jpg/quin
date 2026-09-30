package defpackage;

import ai.askquin.qa.bridge.Danger;
import ai.askquin.qa.bridge.QaResult;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class cvb implements d3b {
    public final Danger a = Danger.STAGING_ONLY;

    @Override // defpackage.d3b
    public final Danger b() {
        return this.a;
    }

    @Override // defpackage.d3b
    public final QaResult c(ti7 ti7Var) {
        bm8.P(new bvb(2, null));
        return new QaResult.Ok((ti7) null, 1, (rp3) null);
    }

    @Override // defpackage.d3b
    public final String getId() {
        return "quota.reset-follow-up-usage-toast";
    }

    @Override // defpackage.d3b
    public final String getTitle() {
        return "重置首次追问消耗额度提醒";
    }
}
