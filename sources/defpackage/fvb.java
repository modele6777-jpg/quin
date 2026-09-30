package defpackage;

import ai.askquin.qa.bridge.QaResult;
import ai.askquin.ui.popup.dailyfortune.v;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class fvb implements d3b {
    public final v a;

    static {
        int i = v.d;
    }

    public fvb(v vVar) {
        this.a = vVar;
    }

    @Override // defpackage.d3b
    public final QaResult c(ti7 ti7Var) throws InterruptedException {
        if (!((Boolean) z5c.I(nu4.a, new evb(this, null))).booleanValue()) {
            return new QaResult.Err("no signed-in account", "no_account");
        }
        AtomicReference atomicReference = m3b.a;
        m3b.a(o3b.a);
        return new QaResult.Ok(new ti7(ib8.q("reset", oh7.a(Boolean.TRUE))));
    }

    @Override // defpackage.d3b
    public final String getId() {
        return "home.reset-daily-fortune-tooltip";
    }

    @Override // defpackage.d3b
    public final String getTitle() {
        return "重置当前账号首页今明日运势首次引导";
    }
}
