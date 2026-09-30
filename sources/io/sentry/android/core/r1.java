package io.sentry.android.core;

import android.content.Context;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import io.sentry.m4;
import io.sentry.q3;
import io.sentry.q5;
import io.sentry.q6;
import io.sentry.r3;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class r1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ r1(SystemEventsBreadcrumbsIntegration systemEventsBreadcrumbsIntegration, io.sentry.g1 g1Var, SentryAndroidOptions sentryAndroidOptions) {
        this.a = 4;
        this.b = systemEventsBreadcrumbsIntegration;
        this.d = g1Var;
        this.c = sentryAndroidOptions;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                SendCachedEnvelopeIntegration sendCachedEnvelopeIntegration = (SendCachedEnvelopeIntegration) this.b;
                SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) this.c;
                io.sentry.g1 g1Var = (io.sentry.g1) this.d;
                try {
                    if (sendCachedEnvelopeIntegration.w.get()) {
                        sentryAndroidOptions.getLogger().i(q5.INFO, "SendCachedEnvelopeIntegration, not trying to send after closing.", new Object[0]);
                        return;
                    }
                    if (!sendCachedEnvelopeIntegration.v.getAndSet(true)) {
                        io.sentry.t0 connectionStatusProvider = sentryAndroidOptions.getConnectionStatusProvider();
                        sendCachedEnvelopeIntegration.d = connectionStatusProvider;
                        connectionStatusProvider.v0(sendCachedEnvelopeIntegration);
                        sendCachedEnvelopeIntegration.g = sendCachedEnvelopeIntegration.a.a(g1Var, sentryAndroidOptions);
                    }
                    io.sentry.t0 t0Var = sendCachedEnvelopeIntegration.d;
                    if (t0Var != null && t0Var.s0() == io.sentry.r0.DISCONNECTED) {
                        sentryAndroidOptions.getLogger().i(q5.INFO, "SendCachedEnvelopeIntegration, no connection.", new Object[0]);
                        return;
                    }
                    io.sentry.android.core.internal.tombstone.b bVarF = g1Var.f();
                    if (bVarF != null && bVarF.h(io.sentry.p.All)) {
                        sentryAndroidOptions.getLogger().i(q5.INFO, "SendCachedEnvelopeIntegration, rate limiting active.", new Object[0]);
                        return;
                    }
                    m4 m4Var = sendCachedEnvelopeIntegration.g;
                    if (m4Var == null) {
                        sentryAndroidOptions.getLogger().i(q5.ERROR, "SendCachedEnvelopeIntegration factory is null.", new Object[0]);
                        return;
                    } else {
                        m4Var.a();
                        return;
                    }
                } catch (Throwable th) {
                    sentryAndroidOptions.getLogger().d(q5.ERROR, "Failed trying to send cached events.", th);
                    return;
                }
            case 1:
                d dVar = (d) this.b;
                Runnable runnable = (Runnable) this.c;
                String str = (String) this.d;
                try {
                    runnable.run();
                    return;
                } catch (Throwable unused) {
                    if (str != null) {
                        dVar.b.getLogger().i(q5.WARNING, "Failed to execute ".concat(str), new Object[0]);
                        return;
                    }
                    return;
                }
            case 2:
                j jVar = (j) this.b;
                q6 q6Var = (q6) this.c;
                io.sentry.g1 g1Var2 = (io.sentry.g1) this.d;
                ArrayList<q3> arrayList = jVar.X;
                if (jVar.E0.get()) {
                    return;
                }
                ArrayList arrayList2 = new ArrayList(arrayList.size());
                io.sentry.util.a aVar = jVar.L0;
                aVar.b();
                try {
                    for (q3 q3Var : arrayList) {
                        r3 r3Var = new r3(q3Var.a, q3Var.b, q3Var.d, q3Var.c, Double.valueOf(q3Var.e), q6Var);
                        r3Var.y = q3Var.f;
                        arrayList2.add(r3Var);
                    }
                    arrayList.clear();
                    aVar.close();
                    Iterator it = arrayList2.iterator();
                    while (it.hasNext()) {
                        g1Var2.k((r3) it.next());
                    }
                    return;
                } catch (Throwable th2) {
                    try {
                        aVar.close();
                        throw th2;
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                        throw th2;
                    }
                }
            case 3:
                EnvelopeFileObserverIntegration envelopeFileObserverIntegration = (EnvelopeFileObserverIntegration) this.b;
                SentryAndroidOptions sentryAndroidOptions2 = (SentryAndroidOptions) this.c;
                String str2 = (String) this.d;
                io.sentry.util.a aVar2 = envelopeFileObserverIntegration.d;
                aVar2.b();
                try {
                    if (!envelopeFileObserverIntegration.c) {
                        envelopeFileObserverIntegration.b(sentryAndroidOptions2, str2);
                        break;
                    }
                    aVar2.close();
                    return;
                } catch (Throwable th4) {
                    try {
                        aVar2.close();
                        throw th4;
                    } catch (Throwable th5) {
                        th4.addSuppressed(th5);
                        throw th4;
                    }
                }
            default:
                SystemEventsBreadcrumbsIntegration systemEventsBreadcrumbsIntegration = (SystemEventsBreadcrumbsIntegration) this.b;
                io.sentry.g1 g1Var3 = (io.sentry.g1) this.d;
                SentryAndroidOptions sentryAndroidOptions3 = (SentryAndroidOptions) this.c;
                io.sentry.util.a aVar3 = systemEventsBreadcrumbsIntegration.y;
                aVar3.b();
                try {
                    if (!systemEventsBreadcrumbsIntegration.f && !systemEventsBreadcrumbsIntegration.g && systemEventsBreadcrumbsIntegration.b == null) {
                        systemEventsBreadcrumbsIntegration.b = new h2(systemEventsBreadcrumbsIntegration, g1Var3, sentryAndroidOptions3);
                        if (systemEventsBreadcrumbsIntegration.v == null) {
                            systemEventsBreadcrumbsIntegration.v = new IntentFilter();
                            for (String str3 : systemEventsBreadcrumbsIntegration.e) {
                                systemEventsBreadcrumbsIntegration.v.addAction(str3);
                            }
                        }
                        if (systemEventsBreadcrumbsIntegration.w == null) {
                            systemEventsBreadcrumbsIntegration.w = new HandlerThread("SystemEventsReceiver", 10);
                            systemEventsBreadcrumbsIntegration.w.start();
                        }
                        try {
                            Handler handler = new Handler(systemEventsBreadcrumbsIntegration.w.getLooper());
                            Context context = systemEventsBreadcrumbsIntegration.a;
                            h2 h2Var = systemEventsBreadcrumbsIntegration.b;
                            IntentFilter intentFilter = systemEventsBreadcrumbsIntegration.v;
                            io.sentry.util.b.r(sentryAndroidOptions3.getLogger(), "The ILogger object is required.");
                            if (Build.VERSION.SDK_INT >= 33) {
                                context.registerReceiver(h2Var, intentFilter, null, handler, 4);
                            } else {
                                context.registerReceiver(h2Var, intentFilter, null, handler);
                            }
                            if (!systemEventsBreadcrumbsIntegration.x.getAndSet(true)) {
                                sentryAndroidOptions3.getLogger().i(q5.DEBUG, "SystemEventsBreadcrumbsIntegration installed.", new Object[0]);
                                io.sentry.util.b.a("SystemEventsBreadcrumbs");
                            }
                        } catch (Throwable th6) {
                            sentryAndroidOptions3.setEnableSystemEventBreadcrumbs(false);
                            sentryAndroidOptions3.getLogger().d(q5.ERROR, "Failed to initialize SystemEventsBreadcrumbsIntegration.", th6);
                        }
                        break;
                    }
                    aVar3.close();
                    return;
                } catch (Throwable th7) {
                    try {
                        aVar3.close();
                        throw th7;
                    } catch (Throwable th8) {
                        th7.addSuppressed(th8);
                        throw th7;
                    }
                }
        }
    }

    public /* synthetic */ r1(Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }
}
