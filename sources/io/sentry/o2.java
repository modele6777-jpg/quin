package io.sentry;

import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.android.replay.ReplayIntegration;
import java.io.File;
import java.nio.charset.Charset;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class o2 implements Runnable {
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ o2(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) obj;
                String cacheDirPath = sentryAndroidOptions.getCacheDirPath();
                if (cacheDirPath != null) {
                    io.sentry.cache.d envelopeDiskCache = sentryAndroidOptions.getEnvelopeDiskCache();
                    if (envelopeDiskCache instanceof io.sentry.cache.c) {
                        Charset charset = io.sentry.cache.c.w;
                        io.sentry.cache.c cVar = (io.sentry.cache.c) envelopeDiskCache;
                        cVar.d(new File(cacheDirPath, "session.json"), new File(cacheDirPath, "previous_session.json"));
                        cVar.e.countDown();
                    }
                } else {
                    sentryAndroidOptions.getLogger().i(q5.INFO, "Cache dir is not set, not moving the previous session.", new Object[0]);
                }
                break;
            case 1:
                int i2 = ReplayIntegration.H0;
                ((ReplayIntegration) obj).h0();
                break;
            case 2:
                ((io.sentry.android.replay.capture.a) obj).invoke();
                break;
            case 3:
                ((io.sentry.android.replay.capture.c) obj).invoke();
                break;
            case 4:
                ((io.sentry.android.replay.capture.d) obj).invoke();
                break;
            case 5:
                ((io.sentry.android.replay.capture.e) obj).invoke();
                break;
            case 6:
                ((io.sentry.android.replay.capture.f) obj).invoke();
                break;
            case 7:
                ((io.sentry.android.replay.capture.g) obj).invoke();
                break;
            case 8:
                ((io.sentry.android.replay.capture.h) obj).invoke();
                break;
            case 9:
                io.sentry.logger.d dVar = (io.sentry.logger.d) obj;
                ConcurrentLinkedQueue concurrentLinkedQueue = dVar.c;
                do {
                    dVar.d();
                } while (concurrentLinkedQueue.size() >= 100);
                dVar.e.set(false);
                if (!concurrentLinkedQueue.isEmpty()) {
                    dVar.f(false);
                }
                break;
            default:
                io.sentry.metrics.c cVar2 = (io.sentry.metrics.c) obj;
                ConcurrentLinkedQueue concurrentLinkedQueue2 = cVar2.c;
                do {
                    cVar2.c();
                } while (concurrentLinkedQueue2.size() >= 1000);
                cVar2.e.set(false);
                if (!concurrentLinkedQueue2.isEmpty()) {
                    cVar2.d(false);
                }
                break;
        }
    }
}
