package io.sentry.android.core.internal.util;

import android.os.Build;
import android.os.SystemClock;
import io.sentry.android.core.v0;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class c implements io.sentry.transport.f {
    public static final c a = new c();

    public void a(v0 v0Var) {
        if (Build.VERSION.SDK_INT <= 28) {
            String callingPackage = v0Var.getCallingPackage();
            String packageName = v0Var.getContext().getPackageName();
            if (callingPackage == null || !callingPackage.equals(packageName)) {
                throw new SecurityException("Provider does not allow for granting of Uri permissions");
            }
        }
    }

    @Override // io.sentry.transport.f
    public long getCurrentTimeMillis() {
        return SystemClock.uptimeMillis();
    }
}
