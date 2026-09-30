package defpackage;

import ai.askquin.qa.bridge.QaResult;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class o52 implements d3b {
    public final u79 a;

    public o52(u79 u79Var) {
        this.a = u79Var;
    }

    @Override // defpackage.d3b
    public final QaResult c(ti7 ti7Var) {
        u79 u79Var = this.a;
        u79Var.c();
        return new QaResult.Ok(tm7.z(u79Var));
    }

    @Override // defpackage.d3b
    public final String getId() {
        return "clock.reset";
    }

    @Override // defpackage.d3b
    public final String getTitle() {
        return "重置 App 时钟到真实时间";
    }
}
