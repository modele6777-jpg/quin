package net.xmind.donut.common.share;

import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import defpackage.d95;
import defpackage.e95;
import defpackage.f95;
import defpackage.jgb;
import defpackage.s72;
import defpackage.s88;
import defpackage.t88;
import defpackage.uj3;
import defpackage.ww2;
import defpackage.xn2;
import defpackage.z7c;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lnet/xmind/donut/common/share/ExternalShareAnalyticsWorker;", "Landroidx/work/CoroutineWorker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "Quin.core:common_release"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
public final class ExternalShareAnalyticsWorker extends CoroutineWorker {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ExternalShareAnalyticsWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
    }

    @Override // androidx.work.CoroutineWorker
    public final Object c(xn2 xn2Var) {
        List<e95> listB1;
        long jCurrentTimeMillis = System.currentTimeMillis();
        jgb.N(this.a, jCurrentTimeMillis);
        d95 d95Var = d95.a;
        if (!d95.b.get()) {
            return f95.a.g(this.a) ? new s88() : new t88();
        }
        Context context = this.a;
        uj3 uj3Var = new uj3(1, d95Var, d95.class, "dispatch", "dispatch$Quin_core_common_release(Lnet/xmind/donut/common/share/ExternalShareOperation;)Z", 0, 12);
        jgb.N(context, jCurrentTimeMillis);
        synchronized (f95.a) {
            try {
                List listM = f95.m(context);
                ArrayList arrayList = new ArrayList();
                for (Object obj : listM) {
                    f95 f95Var = f95.a;
                    if (f95.h((e95) obj)) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj2 : arrayList) {
                    if (((e95) obj2).k < 3) {
                        arrayList2.add(obj2);
                    }
                }
                ArrayList arrayList3 = new ArrayList();
                for (Object obj3 : arrayList2) {
                    e95 e95Var = (e95) obj3;
                    Long l = e95Var.l;
                    if (l == null || jCurrentTimeMillis - l.longValue() >= f95.b[e95Var.k]) {
                        arrayList3.add(obj3);
                    }
                }
                listB1 = s72.b1(arrayList3, new ww2(22));
            } catch (Throwable th) {
                throw th;
            }
        }
        for (e95 e95Var2 : listB1) {
            try {
                if (((Boolean) uj3Var.d(e95Var2)).booleanValue()) {
                    f95 f95Var2 = f95.a;
                    String str = e95Var2.a;
                    synchronized (f95Var2) {
                        str.getClass();
                        f95Var2.i(str, jCurrentTimeMillis, context);
                    }
                } else {
                    f95 f95Var3 = f95.a;
                    String str2 = e95Var2.a;
                    synchronized (f95Var3) {
                        str2.getClass();
                        f95Var3.i(str2, jCurrentTimeMillis, context);
                    }
                }
            } catch (Exception unused) {
                f95 f95Var4 = f95.a;
                String str3 = e95Var2.a;
                synchronized (f95Var4) {
                    try {
                        str3.getClass();
                        e95 e95VarK = f95Var4.k(context, str3);
                        if (e95VarK != null) {
                            if (!f95.h(e95VarK) || e95VarK.k >= 3) {
                                e95VarK = null;
                            }
                            e95 e95Var3 = e95VarK;
                            if (e95Var3 != null) {
                                e95 e95VarA = e95.a(e95Var3, null, null, null, e95Var3.k + 1, Long.valueOf(jCurrentTimeMillis), null, 29695);
                                context.getApplicationContext().getSharedPreferences("external_share_operation", 0).edit().putString(f95.l(e95VarA.a), f95.q(e95VarA).toString()).commit();
                            }
                        }
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
            }
        }
        f95 f95Var5 = f95.a;
        f95Var5.o(context, jCurrentTimeMillis);
        return f95Var5.g(context) ? new s88() : new t88();
    }
}
