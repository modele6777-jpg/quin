package defpackage;

import ai.askquin.qa.bridge.QaResult;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class x66 implements d3b {
    public final x16 a = new w66(0);

    @Override // defpackage.d3b
    public final dm1 a() {
        return dm1.a;
    }

    @Override // defpackage.d3b
    public final QaResult c(ti7 ti7Var) {
        String str = (String) this.a.invoke();
        return new QaResult.Ok(new ti7(bm8.H(new iy9("cookie", oh7.c(str == null ? "" : str)), new iy9("present", oh7.a(Boolean.valueOf(!(str == null || v4e.Q(str))))))));
    }

    @Override // defpackage.d3b
    public final String getId() {
        return "account.get-cookie";
    }

    @Override // defpackage.d3b
    public final String getTitle() {
        return "读取当前登录 cookie（配合 Inspector 抓取）";
    }
}
