package defpackage;

import ai.askquin.qa.bridge.QaResult;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class kw8 implements d3b {
    @Override // defpackage.d3b
    public final QaResult c(ti7 ti7Var) {
        xk3 xk3Var = od4.a0;
        if (xk3Var == null) {
            return new QaResult.Err("Open the main reading deck selector first", "no_selection_page");
        }
        return (QaResult) z5c.I(nu4.a, new jw8(null, xk3Var));
    }

    @Override // defpackage.d3b
    public final String getId() {
        return "mixed.confirm";
    }

    @Override // defpackage.d3b
    public final String getTitle() {
        return "在主占卜选牌页确认混合（资源未就绪不启动下载、不改变默认）";
    }
}
