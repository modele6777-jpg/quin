package defpackage;

import ai.askquin.qa.bridge.QaResult;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ha implements d3b {
    public final bc7 a;
    public final t7 b;

    public ha(bc7 bc7Var, t7 t7Var) {
        this.a = bc7Var;
        this.b = t7Var;
    }

    @Override // defpackage.d3b
    public final dm1 a() {
        return dm1.a;
    }

    @Override // defpackage.d3b
    public final QaResult c(ti7 ti7Var) {
        Object dzbVar;
        mo3 mo3Var = (mo3) this.b;
        if (!mo3Var.b()) {
            return new QaResult.Err("not signed in", "no_account");
        }
        try {
            dzbVar = (String) z5c.I(nu4.a, new ga(this, null));
        } catch (Throwable th) {
            dzbVar = new dzb(th);
        }
        Throwable thA = ezb.a(dzbVar);
        return thA == null ? new QaResult.Ok(new ti7(bm8.H(new iy9("referral", oh7.c((String) dzbVar)), new iy9("uid", oh7.c(mo3Var.a()))))) : new QaResult.Err(ub3.i("generate-code failed: ", thA.getMessage()), "referral_failed");
    }

    @Override // defpackage.d3b
    public final String getId() {
        return "account.referral";
    }

    @Override // defpackage.d3b
    public final String getTitle() {
        return "上报当前登录用户的 referral code + uid（admin 下发目标）";
    }
}
