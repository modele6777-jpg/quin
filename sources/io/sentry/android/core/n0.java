package io.sentry.android.core;

import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.content.Context;
import defpackage.yg5;
import io.sentry.i5;
import io.sentry.q4;
import io.sentry.q5;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class n0 implements Runnable {
    public final Context a;
    public final SentryAndroidOptions b;
    public final m0 c;
    public final long d;

    public n0(Context context, SentryAndroidOptions sentryAndroidOptions, m0 m0Var) {
        Context applicationContext = context.getApplicationContext();
        this.a = applicationContext != null ? applicationContext : context;
        this.b = sentryAndroidOptions;
        this.c = m0Var;
        this.d = System.currentTimeMillis() - 7862400000L;
    }

    public final void a(ApplicationExitInfo applicationExitInfo, boolean z) {
        m0 m0Var = this.c;
        io.sentry.n nVarE = m0Var.e(applicationExitInfo, z);
        if (nVarE == null) {
            return;
        }
        i5 i5Var = (i5) nVarE.b;
        if (q4.b().C(i5Var, (io.sentry.l0) nVarE.c).equals(io.sentry.protocol.w.b) || ((io.sentry.hints.c) nVarE.d).d()) {
            return;
        }
        this.b.getLogger().i(q5.WARNING, "Timed out waiting to flush %s event to disk. Event: %s", m0Var.c(), i5Var.a);
    }

    @Override // java.lang.Runnable
    public final void run() {
        ActivityManager activityManager = (ActivityManager) this.a.getSystemService("activity");
        SentryAndroidOptions sentryAndroidOptions = this.b;
        if (activityManager == null) {
            sentryAndroidOptions.getLogger().i(q5.ERROR, "Failed to retrieve ActivityManager.", new Object[0]);
            return;
        }
        ApplicationExitInfo applicationExitInfo = null;
        List<ApplicationExitInfo> historicalProcessExitReasons = activityManager.getHistoricalProcessExitReasons(null, 0, 0);
        if (historicalProcessExitReasons.isEmpty()) {
            sentryAndroidOptions.getLogger().i(q5.DEBUG, "No records in historical exit reasons.", new Object[0]);
            return;
        }
        io.sentry.cache.d envelopeDiskCache = sentryAndroidOptions.getEnvelopeDiskCache();
        if ((envelopeDiskCache instanceof io.sentry.cache.c) && sentryAndroidOptions.isEnableAutoSessionTracking()) {
            io.sentry.cache.c cVar = (io.sentry.cache.c) envelopeDiskCache;
            if (!cVar.g()) {
                sentryAndroidOptions.getLogger().i(q5.WARNING, "Timed out waiting to flush previous session to its own file.", new Object[0]);
                cVar.e.countDown();
            }
        }
        ArrayList arrayList = new ArrayList(historicalProcessExitReasons);
        m0 m0Var = this.c;
        Long lB = m0Var.b();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ApplicationExitInfo applicationExitInfoA = yg5.a(it.next());
            if (applicationExitInfoA.getReason() == m0Var.a()) {
                it.remove();
                applicationExitInfo = applicationExitInfoA;
                break;
            }
        }
        if (applicationExitInfo == null) {
            sentryAndroidOptions.getLogger().i(q5.DEBUG, "No %ss have been found in the historical exit reasons list.", m0Var.c());
            return;
        }
        long timestamp = applicationExitInfo.getTimestamp();
        long j = this.d;
        if (timestamp < j) {
            sentryAndroidOptions.getLogger().i(q5.DEBUG, "Latest %s happened too long ago, returning early.", m0Var.c());
            return;
        }
        if (lB != null && applicationExitInfo.getTimestamp() <= lB.longValue()) {
            sentryAndroidOptions.getLogger().i(q5.DEBUG, "Latest %s has already been reported, returning early.", m0Var.c());
            return;
        }
        if (m0Var.d()) {
            Collections.reverse(arrayList);
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                ApplicationExitInfo applicationExitInfoA2 = yg5.a(it2.next());
                if (applicationExitInfoA2.getReason() == m0Var.a()) {
                    if (applicationExitInfoA2.getTimestamp() < j) {
                        sentryAndroidOptions.getLogger().i(q5.DEBUG, "%s happened too long ago %s.", m0Var.c(), applicationExitInfoA2);
                    } else if (lB == null || applicationExitInfoA2.getTimestamp() > lB.longValue()) {
                        a(applicationExitInfoA2, false);
                    } else {
                        sentryAndroidOptions.getLogger().i(q5.DEBUG, "%s has already been reported %s.", m0Var.c(), applicationExitInfoA2);
                    }
                }
            }
        }
        a(applicationExitInfo, true);
    }
}
