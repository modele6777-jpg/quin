package defpackage;

import ai.askquin.qa.bridge.QaResult;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ox8 implements d3b {
    public final rw8 a;

    public ox8(rw8 rw8Var) {
        this.a = rw8Var;
    }

    @Override // defpackage.d3b
    public final QaResult c(ti7 ti7Var) {
        return (QaResult) z5c.I(nu4.a, new nx8(this, null));
    }

    @Override // defpackage.d3b
    public final dm1 d(ti7 ti7Var) {
        return dm1.a;
    }

    @Override // defpackage.d3b
    public final String getId() {
        return "mixed.status";
    }

    @Override // defpackage.d3b
    public final String getTitle() {
        return "读取随机混合真实权益、资源池及下载状态";
    }
}
