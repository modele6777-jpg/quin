package defpackage;

import ai.askquin.qa.bridge.Danger;
import ai.askquin.qa.bridge.ParamSpec;
import ai.askquin.qa.bridge.ParamType;
import ai.askquin.qa.bridge.QaResult;
import android.content.SharedPreferences;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class asc implements d3b {
    public final gmc a;
    public final Danger b = Danger.STAGING_ONLY;
    public final List c = t72.H(new ParamSpec("reset", ParamType.BOOLEAN, false, (nh7) null, 8, (rp3) null));

    public asc(s7 s7Var, gmc gmcVar) {
        this.a = gmcVar;
    }

    @Override // defpackage.d3b
    public final Danger b() {
        return this.b;
    }

    @Override // defpackage.d3b
    public final QaResult c(ti7 ti7Var) {
        SharedPreferences sharedPreferences = this.a.a;
        if (t72.I("https://quin.love", "https://quinlove.cn", "https://askquin.ai", "https://askquin.cn").contains("https://quin.love")) {
            return new QaResult.Err("Staging only", "production_blocked");
        }
        String strA = s7.a();
        if (v4e.Q(strA)) {
            return new QaResult.Err("Sign in first", "missing_account");
        }
        nh7 nh7Var = (nh7) ti7Var.get("reset");
        boolean z = false;
        if ((nh7Var != null ? pa7.t(n4e.b(oh7.i(nh7Var).c()), Boolean.TRUE) : false) && (v4e.Q(strA) || !sharedPreferences.edit().remove(gmc.a(strA, "2026_autumn_equinox")).commit())) {
            return new QaResult.Err("Exposure reset failed", "storage_failure");
        }
        iy9 iy9Var = new iy9("period", oh7.c("2026_autumn_equinox"));
        if (!v4e.Q(strA) && sharedPreferences.getBoolean(gmc.a(strA, "2026_autumn_equinox"), false)) {
            z = true;
        }
        return new QaResult.Ok(new ti7(bm8.H(iy9Var, new iy9("shown", oh7.a(Boolean.valueOf(z))), new iy9("requiresColdStart", oh7.a(Boolean.TRUE)))));
    }

    @Override // defpackage.d3b
    public final String getId() {
        return "seasonal.auto-open-state";
    }

    @Override // defpackage.d3b
    public final List getParams() {
        return this.c;
    }

    @Override // defpackage.d3b
    public final String getTitle() {
        return "查询或重置当前账号秋分已展示标记（下次冷启动验证）";
    }
}
