package defpackage;

import com.google.firebase.crashlytics.internal.common.CrashlyticsCore;
import com.google.firebase.crashlytics.internal.settings.SettingsProvider;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class fx2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ CrashlyticsCore b;
    public final /* synthetic */ SettingsProvider c;

    public /* synthetic */ fx2(CrashlyticsCore crashlyticsCore, SettingsProvider settingsProvider, int i) {
        this.a = i;
        this.b = crashlyticsCore;
        this.c = settingsProvider;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        SettingsProvider settingsProvider = this.c;
        CrashlyticsCore crashlyticsCore = this.b;
        switch (i) {
            case 0:
                crashlyticsCore.lambda$doBackgroundInitializationAsync$0(settingsProvider);
                break;
            default:
                crashlyticsCore.lambda$finishInitSynchronously$9(settingsProvider);
                break;
        }
    }
}
