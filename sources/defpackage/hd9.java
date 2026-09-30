package defpackage;

import ai.askquin.qa.bridge.QaResult;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class hd9 implements d3b {
    @Override // defpackage.d3b
    public final QaResult c(ti7 ti7Var) {
        boolean z = jd9.a;
        jd9.a = true;
        return new QaResult.Ok(new ti7(ib8.q("offline", oh7.a(Boolean.TRUE))));
    }

    @Override // defpackage.d3b
    public final String getId() {
        return "env.net-sim.offline";
    }

    @Override // defpackage.d3b
    public final String getTitle() {
        return "模拟断网（所有请求抛 IOException）";
    }
}
