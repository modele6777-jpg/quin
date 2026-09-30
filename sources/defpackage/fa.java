package defpackage;

import ai.askquin.qa.bridge.QaResult;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class fa {
    public static final QaResult a(q9b q9bVar, a26 a26Var) {
        eab eabVar = q9bVar instanceof eab ? (eab) q9bVar : null;
        if (eabVar == null) {
            return new QaResult.Err("QuotaProvider is not QuotaProviderImpl", "unsupported");
        }
        a26Var.d(eabVar);
        return new QaResult.Ok((ti7) null, 1, (rp3) null);
    }
}
