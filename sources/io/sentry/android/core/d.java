package io.sentry.android.core;

import android.app.Activity;
import android.os.Handler;
import android.util.SparseIntArray;
import androidx.core.app.FrameMetricsAggregator;
import com.adjust.sdk.sig.r3;
import defpackage.xag;
import io.sentry.q5;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class d {
    public final io.sentry.util.f a;
    public final SentryAndroidOptions b;
    public final ConcurrentHashMap c;
    public final WeakHashMap d;
    public final q0 e;
    public final io.sentry.util.a f;
    public final io.sentry.util.f g;

    public d(io.sentry.util.g gVar, SentryAndroidOptions sentryAndroidOptions) {
        q0 q0Var = new q0(3);
        this.c = new ConcurrentHashMap();
        this.d = new WeakHashMap();
        this.f = new io.sentry.util.a();
        this.g = new io.sentry.util.f(new xag(gVar, sentryAndroidOptions.getLogger()));
        this.a = new io.sentry.util.f(new r3(15));
        this.b = sentryAndroidOptions;
        this.e = q0Var;
    }

    public final void a(Activity activity) {
        io.sentry.util.a aVar = this.f;
        aVar.b();
        try {
            if (!c()) {
                aVar.close();
                return;
            }
            d(new b(this, activity, 0), "FrameMetricsAggregator.add");
            c cVarB = b();
            if (cVarB != null) {
                this.d.put(activity, cVarB);
            }
            aVar.close();
        } catch (Throwable th) {
            try {
                aVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final c b() {
        int i;
        int i2;
        SparseIntArray sparseIntArray;
        if (!c() || !((Boolean) this.g.a()).booleanValue()) {
            return null;
        }
        SparseIntArray[] sparseIntArrayArr = (SparseIntArray[]) ((FrameMetricsAggregator) this.a.a()).a.c;
        int i3 = 0;
        if (sparseIntArrayArr == null || sparseIntArrayArr.length <= 0 || (sparseIntArray = sparseIntArrayArr[0]) == null) {
            i = 0;
            i2 = 0;
        } else {
            int i4 = 0;
            i = 0;
            i2 = 0;
            while (i3 < sparseIntArray.size()) {
                int iKeyAt = sparseIntArray.keyAt(i3);
                int iValueAt = sparseIntArray.valueAt(i3);
                i4 += iValueAt;
                if (iKeyAt > 700) {
                    i2 += iValueAt;
                } else if (iKeyAt > 16) {
                    i += iValueAt;
                }
                i3++;
            }
            i3 = i4;
        }
        return new c(i3, i, i2);
    }

    public final boolean c() {
        if (!((Boolean) this.g.a()).booleanValue()) {
            return false;
        }
        SentryAndroidOptions sentryAndroidOptions = this.b;
        return sentryAndroidOptions.isEnableFramesTracking() && !sentryAndroidOptions.isEnablePerformanceV2();
    }

    public final void d(Runnable runnable, String str) {
        try {
            if (io.sentry.android.core.internal.util.e.a.c()) {
                runnable.run();
                return;
            }
            q0 q0Var = this.e;
            ((Handler) q0Var.a).post(new r1(this, runnable, str, 1));
        } catch (Throwable unused) {
            if (str != null) {
                this.b.getLogger().i(q5.WARNING, "Failed to execute ".concat(str), new Object[0]);
            }
        }
    }
}
