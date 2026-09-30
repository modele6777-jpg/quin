package defpackage;

import ai.askquin.qa.bridge.QaResult;
import ai.askquin.ui.popup.dailyfortune.v;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class n32 implements d3b {
    public final v a;

    static {
        int i = v.d;
    }

    public n32(v vVar) {
        this.a = vVar;
    }

    @Override // defpackage.d3b
    public final QaResult c(ti7 ti7Var) {
        k73 k73Var = (k73) z5c.I(nu4.a, new m32(this, null));
        return k73Var == null ? new QaResult.Err("no signed-in account", "no_account") : new QaResult.Ok(j73.c(k73Var, new iy9[0]));
    }

    @Override // defpackage.d3b
    public final String getId() {
        return "event.clear-daily-fortune-completed-today";
    }

    @Override // defpackage.d3b
    public final String getTitle() {
        return "清除今日运势今日已完成状态";
    }
}
