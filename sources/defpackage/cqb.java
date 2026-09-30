package defpackage;

import com.google.firebase.perf.config.RemoteConfigManager;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class cqb implements kn9, an9 {
    public final /* synthetic */ RemoteConfigManager a;

    public /* synthetic */ cqb(RemoteConfigManager remoteConfigManager) {
        this.a = remoteConfigManager;
    }

    @Override // defpackage.kn9
    public void a(Object obj) {
        this.a.lambda$triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch$0((Boolean) obj);
    }

    @Override // defpackage.an9
    public void r(Exception exc) {
        this.a.lambda$triggerFirebaseRemoteConfigFetchAndActivateOnSuccessfulFetch$1(exc);
    }
}
