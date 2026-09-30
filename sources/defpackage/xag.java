package defpackage;

import android.app.Activity;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Base64;
import com.adjust.sdk.sig.d;
import com.adjust.sdk.sig.e2;
import com.adjust.sdk.sig.l2;
import com.adjust.sdk.sig.r0;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import io.sentry.a7;
import io.sentry.android.core.FeedbackShakeIntegration;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.android.core.SentryPerformanceProvider;
import io.sentry.android.core.a1;
import io.sentry.android.core.b1;
import io.sentry.android.core.i0;
import io.sentry.android.core.w1;
import io.sentry.android.navigation.SentryNavigationListener;
import io.sentry.android.replay.capture.h;
import io.sentry.android.replay.capture.z;
import io.sentry.b4;
import io.sentry.c7;
import io.sentry.cache.a;
import io.sentry.cache.c;
import io.sentry.cache.tape.b;
import io.sentry.cache.tape.i;
import io.sentry.d7;
import io.sentry.e1;
import io.sentry.f7;
import io.sentry.g4;
import io.sentry.k5;
import io.sentry.n7;
import io.sentry.o;
import io.sentry.o2;
import io.sentry.q1;
import io.sentry.q5;
import io.sentry.q6;
import io.sentry.util.e;
import io.sentry.util.g;
import io.sentry.w3;
import io.sentry.y6;
import io.sentry.z0;
import io.sentry.z6;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class xag implements zbe, kw6, r0, f7, w1, g4, e, b4 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ xag(g gVar, z0 z0Var) {
        this.a = 17;
        this.b = z0Var;
    }

    @Override // com.adjust.sdk.sig.r0
    public Object a(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 2:
                return d.a((d) obj2, obj);
            default:
                return e2.a((l2) obj2, ((Integer) obj).intValue());
        }
    }

    @Override // io.sentry.android.core.w1
    public void b() {
        FeedbackShakeIntegration feedbackShakeIntegration = (FeedbackShakeIntegration) this.b;
        WeakReference weakReference = feedbackShakeIntegration.d;
        Activity activity = weakReference != null ? (Activity) weakReference.get() : null;
        Boolean bool = i0.e.d;
        if (activity == null || feedbackShakeIntegration.c == null || feedbackShakeIntegration.e || Boolean.TRUE.equals(bool)) {
            return;
        }
        activity.runOnUiThread(new nzf(8, feedbackShakeIntegration, activity));
    }

    @Override // io.sentry.util.e
    public Object c() {
        i iVar;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 9:
                k5 k5Var = (k5) obj;
                int i2 = SentryPerformanceProvider.f;
                return k5Var;
            case 15:
                return ((c) obj).a.getSerializer();
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                io.sentry.cache.g gVar = (io.sentry.cache.g) obj;
                SentryAndroidOptions sentryAndroidOptions = gVar.a;
                File fileB = a.b(sentryAndroidOptions, ".scope-cache");
                if (fileB == null) {
                    sentryAndroidOptions.getLogger().i(q5.INFO, "Cache dir is not set, cannot store in scope cache", new Object[0]);
                    return new b();
                }
                File file = new File(fileB, "breadcrumbs.json");
                try {
                    int maxBreadcrumbs = sentryAndroidOptions.getMaxBreadcrumbs();
                    RandomAccessFile randomAccessFileX = i.x(file, false);
                    try {
                        try {
                            iVar = new i(file, randomAccessFileX, maxBreadcrumbs, false);
                            return new io.sentry.cache.tape.d(iVar, new io.sentry.d(8, gVar));
                        } catch (IOException e) {
                            sentryAndroidOptions.getLogger().d(q5.ERROR, "Failed to create breadcrumbs queue", e);
                            return new b();
                        }
                    } catch (Throwable th) {
                        randomAccessFileX.close();
                        throw th;
                    }
                } catch (IOException unused) {
                    file.delete();
                    int maxBreadcrumbs2 = sentryAndroidOptions.getMaxBreadcrumbs();
                    RandomAccessFile randomAccessFileX2 = i.x(file, false);
                    try {
                        iVar = new i(file, randomAccessFileX2, maxBreadcrumbs2, false);
                    } catch (Throwable th2) {
                        randomAccessFileX2.close();
                        throw th2;
                    }
                    break;
                }
                break;
            default:
                return Boolean.valueOf(g.a((z0) obj, "androidx.core.app.FrameMetricsAggregator"));
        }
    }

    @Override // io.sentry.f7
    public void d(d7 d7Var) {
        a7 a7Var = (a7) this.b;
        o oVar = a7Var.q;
        if (oVar != null) {
            oVar.b(d7Var);
        }
        z6 z6Var = a7Var.f;
        n7 n7Var = a7Var.r;
        if (n7Var.g == null) {
            if (z6Var.a) {
                a7Var.x(z6Var.b, null);
                return;
            }
            return;
        }
        if (n7Var.f) {
            ListIterator listIterator = a7Var.c.listIterator();
            while (listIterator.hasNext()) {
                d7 d7Var2 = (d7) listIterator.next();
                if (!d7Var2.g && d7Var2.b == null) {
                    return;
                }
            }
        }
        a7Var.s();
    }

    @Override // io.sentry.g4
    public void g(e1 e1Var) {
        c7 c7VarU;
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 7:
                AtomicLong atomicLong = ((a1) obj).a;
                if (atomicLong.get() == 0 && (c7VarU = e1Var.u()) != null) {
                    atomicLong.set(c7VarU.a.getTime());
                    break;
                }
                break;
            case 8:
                AtomicBoolean atomicBoolean = (AtomicBoolean) obj;
                if (e1Var.u() != null) {
                    atomicBoolean.set(true);
                }
                break;
            case 9:
            default:
                z zVar = (z) obj;
                e1Var.getClass();
                e1Var.n(zVar.d());
                String strH = e1Var.H();
                String strG0 = strH != null ? v4e.g0('.', strH, strH) : null;
                io.sentry.android.replay.capture.b bVar = zVar.l;
                wn7 wn7Var = io.sentry.android.replay.capture.i.u[2];
                bVar.getClass();
                wn7Var.getClass();
                Object andSet = bVar.b.getAndSet(strG0);
                if (!pa7.t(andSet, strG0)) {
                    h hVar = new h(andSet, strG0, bVar.d);
                    io.sentry.android.replay.capture.i iVar = bVar.c;
                    q6 q6Var = iVar.a;
                    if (q6Var.getThreadChecker().c()) {
                        iVar.e.submit(new io.sentry.android.replay.util.h(new o2(8, hVar), "CaptureStrategy.runInBackground"));
                    } else {
                        try {
                            hVar.invoke();
                        } catch (Throwable th) {
                            q6Var.getLogger().d(q5.ERROR, "Failed to execute task CaptureStrategy.runInBackground", th);
                        }
                    }
                }
                break;
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                e1Var.I(new y6(5, (io.sentry.android.core.internal.gestures.g) obj, e1Var));
                break;
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                ((q1[]) obj)[0] = e1Var.p();
                break;
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                int i2 = SentryNavigationListener.g;
                e1Var.getClass();
                e1Var.I(new y6(6, (SentryNavigationListener) obj, e1Var));
                break;
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                e1Var.getClass();
                e1Var.n(((io.sentry.android.replay.capture.o) obj).d());
                break;
        }
    }

    @Override // defpackage.kw6
    public void l(lw6 lw6Var) throws Exception {
        Object objP;
        deg degVar = (deg) this.b;
        try {
            iw6 iw6VarQ = lw6Var.q();
            if (iw6VarQ != null) {
                vea veaVar = degVar.c;
                veaVar.getClass();
                vv6 vv6VarU0 = iw6VarQ.u0();
                oe1 oe1Var = vv6VarU0 instanceof pe1 ? ((pe1) vv6VarU0).a : null;
                if (oe1Var != null && ((oe1Var.y() == le1.f || oe1Var.y() == le1.d) && oe1Var.t() == ke1.e && oe1Var.n() == me1.d)) {
                    synchronized (veaVar.c) {
                        try {
                            objP = ((ArrayDeque) veaVar.b).size() >= 3 ? veaVar.p() : null;
                            ((ArrayDeque) veaVar.b).addFirst(iw6VarQ);
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    if (objP != null) {
                        ((iw6) objP).close();
                        return;
                    }
                    return;
                }
                iw6VarQ.close();
            }
        } catch (IllegalStateException unused) {
            if (b21.F(6, "CXCP")) {
                b1.d("CXCP", "Failed to acquire latest image");
            }
        }
    }

    @Override // defpackage.zbe
    public Object p() {
        kxa kxaVar = (kxa) this.b;
        SQLiteDatabase sQLiteDatabaseB = ((w8c) kxaVar.b).b();
        sQLiteDatabaseB.beginTransaction();
        try {
            Cursor cursorRawQuery = sQLiteDatabaseB.rawQuery("SELECT distinct t._id, t.backend_name, t.priority, t.extras FROM transport_contexts AS t, events AS e WHERE e.context_id = t._id", new String[0]);
            try {
                ArrayList arrayList = new ArrayList();
                while (true) {
                    byte[] bArrDecode = null;
                    if (!cursorRawQuery.moveToNext()) {
                        break;
                    }
                    ta0 ta0VarA = qq0.a();
                    ta0VarA.N(cursorRawQuery.getString(1));
                    ta0VarA.b = mua.b(cursorRawQuery.getInt(2));
                    String string = cursorRawQuery.getString(3);
                    if (string != null) {
                        bArrDecode = Base64.decode(string, 0);
                    }
                    ta0VarA.d = bArrDecode;
                    arrayList.add(ta0VarA.f());
                }
                cursorRawQuery.close();
                sQLiteDatabaseB.setTransactionSuccessful();
                sQLiteDatabaseB.endTransaction();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    ((gg7) kxaVar.c).w((qq0) it.next(), 1, false);
                }
                return null;
            } catch (Throwable th) {
                cursorRawQuery.close();
                throw th;
            }
        } catch (Throwable th2) {
            sQLiteDatabaseB.endTransaction();
            throw th2;
        }
    }

    public /* synthetic */ xag(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // io.sentry.b4
    public void a(w3 w3Var) {
        ((e1) this.b).P(new w3());
    }
}
