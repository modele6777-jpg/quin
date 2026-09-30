package defpackage;

import ai.askquin.qa.bridge.QaResult;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class dd9 implements d3b {
    @Override // defpackage.d3b
    public final QaResult c(ti7 ti7Var) {
        boolean z = jd9.a;
        jd9.a = false;
        jd9.b = 0L;
        jd9.c.clear();
        return new QaResult.Ok((ti7) null, 1, (rp3) null);
    }

    @Override // defpackage.d3b
    public final String getId() {
        return "env.net-sim.clear";
    }

    @Override // defpackage.d3b
    public final String getTitle() {
        return "清除所有网络模拟，恢复正常";
    }
}
