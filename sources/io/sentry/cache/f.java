package io.sentry.cache;

import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.q5;
import java.io.IOException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class f implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ g b;

    public /* synthetic */ f(g gVar, int i) {
        this.a = i;
        this.b = gVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        int i2 = 1;
        boolean z = false;
        g gVar = this.b;
        switch (i) {
            case 0:
                ConcurrentLinkedQueue concurrentLinkedQueue = gVar.d;
                ConcurrentHashMap concurrentHashMap = gVar.c;
                AtomicBoolean atomicBoolean = gVar.e;
                try {
                    try {
                        new f(gVar, i2).run();
                        break;
                    } catch (Throwable th) {
                        gVar.a.getLogger().d(q5.ERROR, "Serialization task failed", th);
                        break;
                    }
                    atomicBoolean.set(false);
                    if (concurrentHashMap.isEmpty() && concurrentLinkedQueue.isEmpty()) {
                        return;
                    }
                    gVar.e();
                    return;
                } catch (Throwable th2) {
                    atomicBoolean.set(false);
                    if (!concurrentHashMap.isEmpty() || !concurrentLinkedQueue.isEmpty()) {
                        gVar.e();
                    }
                    throw th2;
                }
            default:
                SentryAndroidOptions sentryAndroidOptions = gVar.a;
                ConcurrentHashMap concurrentHashMap2 = gVar.c;
                for (String str : concurrentHashMap2.keySet()) {
                    Object objRemove = concurrentHashMap2.remove(str);
                    if (objRemove != null) {
                        if (objRemove == g.g) {
                            gVar.a(str);
                        } else {
                            a.d(sentryAndroidOptions, objRemove, ".scope-cache", str);
                        }
                    }
                }
                io.sentry.cache.tape.f fVar = (io.sentry.cache.tape.f) gVar.b.a();
                while (true) {
                    Object objPoll = gVar.d.poll();
                    if (objPoll == null) {
                        if (z) {
                            try {
                                fVar.H0();
                                return;
                            } catch (IOException e) {
                                sentryAndroidOptions.getLogger().d(q5.ERROR, "Failed to sync breadcrumbs file queue", e);
                                return;
                            }
                        }
                        return;
                    }
                    try {
                        if (objPoll == g.h) {
                            fVar.clear();
                        } else {
                            fVar.x((io.sentry.g) objPoll);
                        }
                        z = true;
                    } catch (IOException e2) {
                        sentryAndroidOptions.getLogger().d(q5.ERROR, "Failed to apply breadcrumb change to file queue", e2);
                    }
                }
                break;
        }
    }
}
