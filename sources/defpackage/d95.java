package defpackage;

import android.content.Context;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import net.xmind.donut.common.share.ExternalShareAnalyticsWorker;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class d95 {
    public static final d95 a = new d95();
    public static final AtomicBoolean b = new AtomicBoolean(false);

    public static void a(Context context, long j) {
        context.getClass();
        try {
            zi0 zi0Var = new zi0(ExternalShareAnalyticsWorker.class);
            zi0Var.x(us0.a, 1L, TimeUnit.MINUTES);
            if (j > 0) {
                zi0Var.z(j, TimeUnit.MILLISECONDS);
            }
            cq9 cq9VarE = zi0Var.e();
            Context applicationContext = context.getApplicationContext();
            applicationContext.getClass();
            yag.b(applicationContext).a("external_share_analytics_outbox", d45.a, cq9VarE);
        } catch (Throwable unused) {
        }
    }
}
