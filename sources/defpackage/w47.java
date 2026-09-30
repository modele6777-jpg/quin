package defpackage;

import ai.askquin.qa.bridge.QaResult;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class w47 implements d3b {
    public final nb4 a;

    public w47(nb4 nb4Var, s7 s7Var) {
        this.a = nb4Var;
    }

    @Override // defpackage.d3b
    public final QaResult c(ti7 ti7Var) {
        js3 js3Var = ga4.a;
        h13 h13Var = (h13) z5c.I(hr3.c, new v47(this, null));
        return new QaResult.Ok(new ti7(bm8.H(new iy9("id", oh7.c(h13Var.a)), new iy9("accountId", oh7.c(h13Var.b)), new iy9("payloadBytes", oh7.b(Integer.valueOf(h13Var.c))))));
    }

    @Override // defpackage.d3b
    public final String getId() {
        return "history.insert-cursor-window-crash-row";
    }

    @Override // defpackage.d3b
    public final String getTitle() {
        return "插入 CursorWindow 崩溃历史行";
    }
}
