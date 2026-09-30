package defpackage;

import com.google.firebase.crashlytics.internal.CrashlyticsRemoteConfigListener;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class l5c implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ CrashlyticsRemoteConfigListener b;
    public final /* synthetic */ bq0 c;

    public /* synthetic */ l5c(CrashlyticsRemoteConfigListener crashlyticsRemoteConfigListener, bq0 bq0Var, int i) {
        this.a = i;
        this.b = crashlyticsRemoteConfigListener;
        this.c = bq0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        bq0 bq0Var = this.c;
        CrashlyticsRemoteConfigListener crashlyticsRemoteConfigListener = this.b;
        switch (i) {
            case 0:
                crashlyticsRemoteConfigListener.onRolloutsStateChanged(bq0Var);
                break;
            default:
                crashlyticsRemoteConfigListener.onRolloutsStateChanged(bq0Var);
                break;
        }
    }
}
