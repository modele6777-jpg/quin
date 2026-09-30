package defpackage;

import ai.askquin.qa.bridge.QaResult;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class jwb implements d3b {
    public final inf a;
    public final t7 b;

    static {
        int i = inf.g;
    }

    public jwb(inf infVar, t7 t7Var) {
        this.a = infVar;
        this.b = t7Var;
    }

    @Override // defpackage.d3b
    public final QaResult c(ti7 ti7Var) {
        String strD = jrb.d(this.b);
        if (strD == null) {
            return new QaResult.Err("no signed-in account", "not_signed_in");
        }
        Boolean bool = (Boolean) z5c.I(nu4.a, new iwb(this, strD, null));
        bool.getClass();
        return new QaResult.Ok(new ti7(ib8.q("reset", oh7.a(bool))));
    }

    @Override // defpackage.d3b
    public final String getId() {
        return "event.reset-weekend-free-popup";
    }

    @Override // defpackage.d3b
    public final String getTitle() {
        return "重置周末免费次数弹窗已展示标记";
    }
}
