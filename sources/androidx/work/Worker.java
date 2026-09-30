package androidx.work;

import android.content.Context;
import defpackage.bo1;
import defpackage.kr5;
import defpackage.pa1;
import defpackage.qbg;
import defpackage.u88;
import defpackage.v88;
import defpackage.y41;
import defpackage.z7c;
import java.util.concurrent.ExecutorService;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b&\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/work/Worker;", "Lv88;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "workerParams", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = z7c.f)
public abstract class Worker extends v88 {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Worker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
    }

    @Override // defpackage.v88
    public final pa1 a() {
        ExecutorService executorService = this.b.d;
        executorService.getClass();
        return y41.t(new bo1(29, executorService, new qbg(this, 1)));
    }

    @Override // defpackage.v88
    public final pa1 b() {
        ExecutorService executorService = this.b.d;
        executorService.getClass();
        return y41.t(new bo1(29, executorService, new qbg(this, 0)));
    }

    public abstract u88 c();

    public kr5 e() {
        throw new IllegalStateException("Expedited WorkRequests require a Worker to provide an implementation for `getForegroundInfo()`");
    }
}
