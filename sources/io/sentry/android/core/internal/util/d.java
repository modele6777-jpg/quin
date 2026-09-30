package io.sentry.android.core.internal.util;

import android.os.Process;
import io.sentry.android.ndk.SentryNdk;
import io.sentry.ndk.NativeScope;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class d implements Runnable {
    public final /* synthetic */ int a;

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                e.b = Process.myTid();
                break;
            case 1:
                NativeScope.nativeClearAttachments();
                break;
            default:
                SentryNdk.lambda$static$0();
                break;
        }
    }

    public /* synthetic */ d(int i) {
        this.a = i;
    }
}
