package defpackage;

import com.google.firebase.crashlytics.internal.common.CrashlyticsCore;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class hx2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ CrashlyticsCore b;
    public final /* synthetic */ String c;
    public final /* synthetic */ String d;

    public /* synthetic */ hx2(CrashlyticsCore crashlyticsCore, String str, String str2, int i) {
        this.a = i;
        this.b = crashlyticsCore;
        this.c = str;
        this.d = str2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        String str = this.d;
        String str2 = this.c;
        CrashlyticsCore crashlyticsCore = this.b;
        switch (i) {
            case 0:
                crashlyticsCore.lambda$setCustomKey$5(str2, str);
                break;
            default:
                crashlyticsCore.lambda$setInternalKey$7(str2, str);
                break;
        }
    }
}
