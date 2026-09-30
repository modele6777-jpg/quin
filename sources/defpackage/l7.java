package defpackage;

import ai.askquin.qa.bridge.QaResult;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class l7 implements d3b {
    public final t7 a;
    public final x16 b;

    public l7(t7 t7Var) {
        q qVar = new q(1);
        this.a = t7Var;
        this.b = qVar;
    }

    @Override // defpackage.d3b
    public final dm1 a() {
        return dm1.a;
    }

    @Override // defpackage.d3b
    public final QaResult c(ti7 ti7Var) {
        mo3 mo3Var = (mo3) this.a;
        boolean zB = mo3Var.b();
        String str = zB ? (String) this.b.invoke() : null;
        boolean z = true ^ (str == null || v4e.Q(str));
        iy9 iy9Var = new iy9("email", oh7.c(zB ? (String) mo3Var.c.getValue() : ""));
        iy9 iy9Var2 = new iy9("uid", oh7.c(zB ? mo3Var.a() : ""));
        iy9 iy9Var3 = new iy9("displayName", oh7.c(zB ? (String) mo3Var.b.getValue() : ""));
        if (str == null) {
            str = "";
        }
        return new QaResult.Ok(new ti7(bm8.H(iy9Var, iy9Var2, iy9Var3, new iy9("cookie", oh7.c(str)), new iy9("present", oh7.a(Boolean.valueOf(z))))));
    }

    @Override // defpackage.d3b
    public final String getId() {
        return "account.current";
    }

    @Override // defpackage.d3b
    public final String getTitle() {
        return "上报当前登录账号 + 匹配 cookie（companion 保存用）";
    }
}
