package defpackage;

import ai.askquin.qa.bridge.QaResult;
import ai.askquin.ui.popup.dailyfortune.v;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class s73 implements d3b {
    public final v a;

    static {
        int i = v.d;
    }

    public s73(v vVar) {
        this.a = vVar;
    }

    @Override // defpackage.d3b
    public final dm1 a() {
        return dm1.a;
    }

    @Override // defpackage.d3b
    public final QaResult c(ti7 ti7Var) {
        k73 k73Var = (k73) z5c.I(nu4.a, new r73(this, null));
        return k73Var == null ? new QaResult.Err("no signed-in account", "no_account") : new QaResult.Ok(j73.c(k73Var, new iy9[0]));
    }

    @Override // defpackage.d3b
    public final String getId() {
        return "event.daily-fortune-guide-state";
    }

    @Override // defpackage.d3b
    public final String getTitle() {
        return "读取当前账号今日运势推荐弹窗状态";
    }
}
