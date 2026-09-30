package defpackage;

import ai.askquin.qa.bridge.ParamSpec;
import ai.askquin.qa.bridge.ParamType;
import ai.askquin.qa.bridge.QaResult;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class h7b implements d3b {
    public final boolean a;
    public final String b;
    public final String c;
    public final List d;

    public h7b(boolean z) {
        this.a = z;
        this.b = z ? "account.quick-login-dev-new" : "account.quick-login-dev";
        this.c = z ? "Dev 快速登录（作为新用户）" : "Dev 快速登录";
        this.d = t72.H(new ParamSpec("cookie", ParamType.STRING, false, (nh7) null, 8, (rp3) null));
    }

    @Override // defpackage.d3b
    public final QaResult c(ti7 ti7Var) {
        String strC;
        zkf zkfVar = an1.P0;
        if (zkfVar == null) {
            return new QaResult.Err("not on login screen", "no_screen");
        }
        nh7 nh7Var = (nh7) ti7Var.get("cookie");
        String str = null;
        if (nh7Var != null && (strC = oh7.i(nh7Var).c()) != null && !v4e.Q(strC)) {
            str = strC;
        }
        zkfVar.z(str, Boolean.valueOf(this.a));
        return new QaResult.Ok(new ti7(bm8.H(new iy9("isNewUser", oh7.a(Boolean.valueOf(this.a))), new iy9("usedProvidedCookie", oh7.a(Boolean.valueOf(str != null))))));
    }

    @Override // defpackage.d3b
    public final String getId() {
        return this.b;
    }

    @Override // defpackage.d3b
    public final List getParams() {
        return this.d;
    }

    @Override // defpackage.d3b
    public final String getTitle() {
        return this.c;
    }
}
