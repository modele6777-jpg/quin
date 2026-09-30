package defpackage;

import ai.askquin.qa.bridge.Danger;
import ai.askquin.qa.bridge.QaResult;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ry8 implements d3b {
    public final q9b a;
    public final Danger b = Danger.STAGING_ONLY;

    public ry8(q9b q9bVar) {
        this.a = q9bVar;
    }

    @Override // defpackage.d3b
    public final Danger b() {
        return this.b;
    }

    @Override // defpackage.d3b
    public final QaResult c(ti7 ti7Var) {
        return fa.a(this.a, qy8.a);
    }

    @Override // defpackage.d3b
    public final String getId() {
        return "quota.mock-daily-limit";
    }

    @Override // defpackage.d3b
    public final String getTitle() {
        return "本地 mock Usage 日限额已达";
    }
}
