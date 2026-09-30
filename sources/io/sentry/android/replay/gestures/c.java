package io.sentry.android.replay.gestures;

import android.view.View;
import android.view.Window;
import defpackage.cgg;
import defpackage.x72;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.android.replay.ReplayIntegration;
import io.sentry.android.replay.f;
import io.sentry.q5;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class c implements f {
    public final SentryAndroidOptions a;
    public final ReplayIntegration b;
    public final ArrayList c = new ArrayList();
    public final io.sentry.util.a d = new io.sentry.util.a();
    public final WeakHashMap e = new WeakHashMap();
    public final io.sentry.util.a f = new io.sentry.util.a();

    public c(SentryAndroidOptions sentryAndroidOptions, ReplayIntegration replayIntegration) {
        this.a = sentryAndroidOptions;
        this.b = replayIntegration;
    }

    public final void a(View view) throws IllegalAccessException {
        WeakHashMap weakHashMap = this.e;
        Window windowO = io.sentry.config.a.o(view);
        SentryAndroidOptions sentryAndroidOptions = this.a;
        if (windowO == null) {
            sentryAndroidOptions.getLogger().i(q5.DEBUG, "Window is invalid, not tracking gestures", new Object[0]);
            return;
        }
        io.sentry.util.a aVar = this.f;
        aVar.b();
        try {
            WeakReference weakReference = (WeakReference) weakHashMap.get(windowO);
            if ((weakReference != null ? (a) weakReference.get() : null) != null) {
                cgg.t(aVar, null);
                return;
            }
            cgg.t(aVar, null);
            a aVar2 = new a(sentryAndroidOptions, this.b, windowO.getCallback());
            windowO.setCallback(aVar2);
            aVar.b();
            try {
                weakHashMap.put(windowO, new WeakReference(aVar2));
                cgg.t(aVar, null);
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    cgg.t(aVar, th);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                cgg.t(aVar, th3);
                throw th4;
            }
        }
    }

    @Override // io.sentry.android.replay.f
    public final void b(View view, boolean z) {
        view.getClass();
        io.sentry.util.a aVar = this.d;
        aVar.b();
        ArrayList arrayList = this.c;
        try {
            if (z) {
                arrayList.add(new WeakReference(view));
                a(view);
            } else {
                d(view);
                x72.i0(new b(view), arrayList);
            }
            cgg.t(aVar, null);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                cgg.t(aVar, th);
                throw th2;
            }
        }
    }

    public final void c() {
        ArrayList arrayList = this.c;
        io.sentry.util.a aVar = this.d;
        aVar.b();
        try {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                View view = (View) ((WeakReference) it.next()).get();
                if (view != null) {
                    d(view);
                }
            }
            arrayList.clear();
            cgg.t(aVar, null);
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                cgg.t(aVar, th);
                throw th2;
            }
        }
    }

    public final void d(View view) throws IllegalAccessException {
        Window windowO = io.sentry.config.a.o(view);
        if (windowO == null) {
            this.a.getLogger().i(q5.DEBUG, "Window was null in stopGestureTracking", new Object[0]);
            return;
        }
        Window.Callback callback = windowO.getCallback();
        if (callback instanceof a) {
            windowO.setCallback(((a) callback).a);
            io.sentry.util.a aVar = this.f;
            aVar.b();
            try {
                cgg.t(aVar, null);
                return;
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    cgg.t(aVar, th);
                    throw th2;
                }
            }
        }
        io.sentry.util.a aVar2 = this.f;
        aVar2.b();
        try {
            WeakReference weakReference = (WeakReference) this.e.get(windowO);
            a aVar3 = weakReference != null ? (a) weakReference.get() : null;
            cgg.t(aVar2, null);
            if (aVar3 != null) {
                aVar3.c = null;
            }
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                cgg.t(aVar2, th3);
                throw th4;
            }
        }
    }
}
