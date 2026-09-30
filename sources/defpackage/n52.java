package defpackage;

import ai.askquin.qa.bridge.QaResult;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class n52 implements d3b {
    public final u79 a;

    public n52(u79 u79Var) {
        this.a = u79Var;
    }

    @Override // defpackage.d3b
    public final dm1 a() {
        return dm1.a;
    }

    @Override // defpackage.d3b
    public final QaResult c(ti7 ti7Var) {
        return new QaResult.Ok(tm7.z(this.a));
    }

    @Override // defpackage.d3b
    public final String getId() {
        return "clock.get";
    }

    @Override // defpackage.d3b
    public final String getTitle() {
        return "读取 App 当前有效时间 + 是否处于覆盖态";
    }
}
