package defpackage;

import tech.chatmind.api.credits.QuotaUsage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class yu0 extends g4 {
    @Override // defpackage.g4
    /* JADX INFO: renamed from: O, reason: merged with bridge method [inline-methods] */
    public boolean r(QuotaUsage quotaUsage) {
        quotaUsage.getClass();
        return quotaUsage.getHasSubscription();
    }

    @Override // defpackage.g4
    /* JADX INFO: renamed from: P */
    public boolean s(QuotaUsage quotaUsage) {
        quotaUsage.getClass();
        return quotaUsage.getCountData().a();
    }

    @Override // defpackage.g4
    public Object i(zn2 zn2Var) {
        hr7 hr7Var = af8.Z;
        if (hr7Var != null) {
            return ((rab) ((fab) ((nfc) hr7Var.c.e).g(job.a.b(fab.class), null, null))).b(zn2Var);
        }
        qc0.p("KoinApplication has not been started");
        return null;
    }
}
