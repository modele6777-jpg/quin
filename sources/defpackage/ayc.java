package defpackage;

import ai.askquin.qa.bridge.QaResult;
import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ayc implements d3b {
    public final Context a;

    public ayc(Context context) {
        this.a = context;
    }

    @Override // defpackage.d3b
    public final QaResult c(ti7 ti7Var) {
        ym8.O(this.a);
        return new QaResult.Ok((ti7) null, 1, (rp3) null);
    }

    @Override // defpackage.d3b
    public final String getId() {
        return "notification.send-paywall";
    }

    @Override // defpackage.d3b
    public final String getTitle() {
        return "发点击跳 paywall 的通知（holiday-card 过期触点）";
    }
}
