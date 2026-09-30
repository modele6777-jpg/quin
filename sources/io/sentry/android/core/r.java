package io.sentry.android.core;

import io.sentry.q5;
import java.io.File;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class r implements io.sentry.util.e {
    public final /* synthetic */ int a;
    public final /* synthetic */ SentryAndroidOptions b;

    public /* synthetic */ r(io.sentry.util.g gVar, SentryAndroidOptions sentryAndroidOptions) {
        this.a = 5;
        this.b = sentryAndroidOptions;
    }

    @Override // io.sentry.util.e
    public Object c() {
        int i = this.a;
        SentryAndroidOptions sentryAndroidOptions = this.b;
        switch (i) {
            case 0:
                return sentryAndroidOptions.getExecutorService();
            case 1:
                return sentryAndroidOptions.getExecutorService();
            case 2:
                List list = io.sentry.android.core.cache.b.y;
                String outboxPath = sentryAndroidOptions.getOutboxPath();
                boolean z = false;
                if (outboxPath != null) {
                    File file = new File(outboxPath, "startup_crash");
                    try {
                        boolean zExists = file.exists();
                        if (zExists && !file.delete()) {
                            sentryAndroidOptions.getLogger().i(q5.ERROR, "Failed to delete the startup crash marker file. %s.", file.getAbsolutePath());
                        }
                        z = zExists;
                    } catch (Throwable th) {
                        sentryAndroidOptions.getLogger().d(q5.ERROR, "Error reading/deleting the startup crash marker file on the disk", th);
                    }
                    break;
                } else {
                    sentryAndroidOptions.getLogger().i(q5.DEBUG, "Outbox path is null, the startup crash marker file does not exist", new Object[0]);
                }
                return Boolean.valueOf(z);
            case 3:
            default:
                return Boolean.valueOf(io.sentry.util.g.b(sentryAndroidOptions, "androidx.core.view.ScrollingView"));
            case 4:
                return sentryAndroidOptions.getExecutorService();
        }
    }

    public /* synthetic */ r(SentryAndroidOptions sentryAndroidOptions, int i) {
        this.a = i;
        this.b = sentryAndroidOptions;
    }
}
