package defpackage;

import ai.askquin.qa.bridge.QaResult;
import ai.askquin.ui.annual.c;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class e32 implements d3b {
    public final c a;

    static {
        int i = c.b;
    }

    public e32(c cVar) {
        this.a = cVar;
    }

    @Override // defpackage.d3b
    public final QaResult c(ti7 ti7Var) {
        bm8.P(new d32(this, null));
        return new QaResult.Ok((ti7) null, 1, (rp3) null);
    }

    @Override // defpackage.d3b
    public final String getId() {
        return "event.clear-annual-progress";
    }

    @Override // defpackage.d3b
    public final String getTitle() {
        return "清除年运活动进度（年度报告进度归零）";
    }
}
