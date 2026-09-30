package io.sentry.android.core.internal.util;

import android.view.PixelCopy;
import android.view.View;
import defpackage.a1d;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.q5;
import io.sentry.u6;
import io.sentry.z0;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class j implements PixelCopy.OnPixelCopyFinishedListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ j(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    @Override // android.view.PixelCopy.OnPixelCopyFinishedListener
    public final void onPixelCopyFinished(int i) {
        int i2 = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (i2) {
            case 0:
                ((AtomicInteger) obj2).set(i);
                ((CountDownLatch) obj).countDown();
                break;
            default:
                io.sentry.android.replay.screenshot.j jVar = (io.sentry.android.replay.screenshot.j) obj2;
                View view = (View) obj;
                AtomicBoolean atomicBoolean = jVar.m;
                AtomicBoolean atomicBoolean2 = jVar.i;
                AtomicInteger atomicInteger = jVar.l;
                SentryAndroidOptions sentryAndroidOptions = jVar.b;
                if (atomicBoolean.get()) {
                    sentryAndroidOptions.getLogger().i(q5.DEBUG, "PixelCopyStrategy is closed, ignoring capture result", new Object[0]);
                    jVar.h();
                } else if (i == 0) {
                    boolean z = jVar.k.get();
                    if (z && atomicInteger.incrementAndGet() <= 1) {
                        sentryAndroidOptions.getLogger().i(q5.INFO, "Failed to determine view hierarchy, not capturing", new Object[0]);
                        atomicBoolean2.set(false);
                        jVar.h();
                    } else {
                        try {
                            u6 sessionReplay = sentryAndroidOptions.getSessionReplay();
                            sessionReplay.getClass();
                            io.sentry.android.replay.viewhierarchy.g gVarI = io.sentry.config.a.i(view, null, sessionReplay);
                            ArrayList arrayList = sentryAndroidOptions.getSessionReplay().o ? new ArrayList() : null;
                            u6 sessionReplay2 = sentryAndroidOptions.getSessionReplay();
                            sessionReplay2.getClass();
                            z0 logger = sentryAndroidOptions.getLogger();
                            logger.getClass();
                            io.sentry.android.replay.util.l.b(view, gVarI, sessionReplay2, logger, arrayList);
                            if (arrayList != null && !arrayList.isEmpty()) {
                                jVar.d.invoke();
                                jVar.e(view, arrayList, gVarI, true ^ z);
                            }
                            if (jVar.e.submit(new io.sentry.android.replay.util.h(new a1d(jVar, view, gVarI, z, 1), "screenshot_recorder.mask")) == null) {
                                jVar.h();
                            }
                        } catch (RuntimeException e) {
                            sentryAndroidOptions.getLogger().d(q5.WARNING, "Failed to process replay frame", e);
                            jVar.h();
                        }
                    }
                } else {
                    sentryAndroidOptions.getLogger().i(q5.INFO, "Failed to capture replay recording: %d", Integer.valueOf(i));
                    atomicInteger.set(0);
                    atomicBoolean2.set(false);
                    jVar.h();
                }
                break;
        }
    }
}
