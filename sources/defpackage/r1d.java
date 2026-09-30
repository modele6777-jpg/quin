package defpackage;

import ai.askquin.qa.bridge.ParamSpec;
import ai.askquin.qa.bridge.ParamType;
import ai.askquin.qa.bridge.QaResult;
import com.franmontiel.persistentcookiejar.PersistentCookieJar;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class r1d implements d3b {
    public final List a = t72.H(new ParamSpec("cookie", ParamType.STRING, true, (nh7) null, 8, (rp3) null));

    @Override // defpackage.d3b
    public final QaResult c(ti7 ti7Var) {
        String strC;
        nh7 nh7Var = (nh7) ti7Var.get("cookie");
        if (nh7Var != null && (strC = oh7.i(nh7Var).c()) != null) {
            if (v4e.Q(strC)) {
                strC = null;
            }
            if (strC != null) {
                bt6 bt6Var = new bt6();
                bt6Var.d(null, "https://quin.love");
                ct6 ct6VarA = bt6Var.a();
                String str = ct6VarA.d;
                PersistentCookieJar persistentCookieJar = jk9.a;
                du2 du2Var = new du2();
                str.getClass();
                du2Var.b(str, false);
                du2Var.d("quin-auth");
                du2Var.f(strC);
                du2Var.g = true;
                du2Var.f = true;
                du2Var.c(Long.MAX_VALUE);
                du2Var.e("/");
                persistentCookieJar.c(ct6VarA, t72.H(du2Var.a()));
                return new QaResult.Ok(new ti7(ib8.q("host", oh7.c(str))));
            }
        }
        return new QaResult.Err("missing 'cookie'", "bad_args");
    }

    @Override // defpackage.d3b
    public final String getId() {
        return "account.set-cookie";
    }

    @Override // defpackage.d3b
    public final List getParams() {
        return this.a;
    }

    @Override // defpackage.d3b
    public final String getTitle() {
        return "注入登录 cookie（任意屏，配合 data.restore）";
    }
}
