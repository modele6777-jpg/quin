package io.sentry.android.core;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.ProviderInfo;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import com.adjust.sdk.sig.r3;
import defpackage.qc0;
import io.sentry.o5;
import io.sentry.q4;
import io.sentry.q5;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class SentryInitProvider extends v0 {
    @Override // android.content.ContentProvider
    public final void attachInfo(Context context, ProviderInfo providerInfo) {
        if (SentryInitProvider.class.getName().equals(providerInfo.authority)) {
            qc0.p("An applicationId is required to fulfill the manifest placeholder.");
        } else {
            super.attachInfo(context, providerInfo);
        }
    }

    @Override // android.content.ContentProvider
    public final String getType(Uri uri) {
        return null;
    }

    @Override // android.content.ContentProvider
    public final boolean onCreate() {
        boolean zF;
        io.sentry.android.core.performance.g.e(this);
        x xVar = new x(3);
        Context context = getContext();
        if (context == null) {
            xVar.i(q5.FATAL, "App. Context from ContentProvider is null", new Object[0]);
            io.sentry.android.core.performance.g.f(this);
            return false;
        }
        try {
            ApplicationInfo applicationInfo = Build.VERSION.SDK_INT >= 33 ? (ApplicationInfo) p0.d.a(context) : (ApplicationInfo) p0.e.a(context);
            Bundle bundle = applicationInfo != null ? applicationInfo.metaData : null;
            zF = bundle != null ? b1.f(bundle, xVar, "io.sentry.auto-init", true) : true;
        } catch (Throwable th) {
            xVar.d(q5.ERROR, "Failed to read auto-init from android manifest metadata.", th);
        }
        if (zF && !p0.a(context)) {
            s1.a(context, xVar, new r3(26));
            o5.d().a("AutoInit");
        }
        io.sentry.android.core.performance.g.f(this);
        return true;
    }

    @Override // android.content.ContentProvider
    public final void shutdown() {
        q4.a();
    }
}
