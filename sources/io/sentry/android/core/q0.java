package io.sentry.android.core;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class q0 implements io.sentry.transport.h, io.sentry.q0 {
    public static final q0 b = new q0();
    public Object a;

    public q0(int i) {
        switch (i) {
            case 3:
                this.a = new Handler(Looper.getMainLooper());
                break;
            default:
                this.a = new io.sentry.util.a();
                break;
        }
    }

    @Override // io.sentry.transport.h
    public boolean a() {
        int i = z.a[((SentryAndroidOptions) this.a).getConnectionStatusProvider().s0().ordinal()];
        return i == 1 || i == 2 || i == 3;
    }

    public void b(Activity activity) {
        WeakReference weakReference = (WeakReference) this.a;
        if (weakReference == null || weakReference.get() != activity) {
            this.a = new WeakReference(activity);
        }
    }
}
