package io.sentry.android.core;

import android.content.Context;
import java.util.function.Supplier;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class s implements Supplier {
    public final /* synthetic */ Context a;
    public final /* synthetic */ SentryAndroidOptions b;

    public /* synthetic */ s(Context context, SentryAndroidOptions sentryAndroidOptions) {
        this.a = context;
        this.b = sentryAndroidOptions;
    }

    @Override // java.util.function.Supplier
    public final Object get() {
        SentryAndroidOptions sentryAndroidOptions = this.b;
        return new o1(this.a, sentryAndroidOptions.getLogger(), sentryAndroidOptions.getExecutorService());
    }
}
