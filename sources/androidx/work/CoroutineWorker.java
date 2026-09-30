package androidx.work;

import android.content.Context;
import defpackage.ew2;
import defpackage.fg7;
import defpackage.fw2;
import defpackage.gw2;
import defpackage.i7h;
import defpackage.pa1;
import defpackage.pa7;
import defpackage.pv2;
import defpackage.tq;
import defpackage.v88;
import defpackage.xn2;
import defpackage.y7h;
import defpackage.z7c;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b&\u0018\u00002\u00020\u0001:\u0001\bB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Landroidx/work/CoroutineWorker;", "Lv88;", "Landroid/content/Context;", "appContext", "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "ew2", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = z7c.f)
public abstract class CoroutineWorker extends v88 {
    public final WorkerParameters e;
    public final ew2 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutineWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        this.e = workerParameters;
        this.f = ew2.c;
    }

    @Override // defpackage.v88
    public final pa1 a() {
        fg7 fg7VarD = tq.d();
        ew2 ew2Var = this.f;
        ew2Var.getClass();
        return y7h.y(i7h.I(ew2Var, fg7VarD), new fw2(this, null));
    }

    @Override // defpackage.v88
    public final pa1 b() {
        ew2 ew2Var = ew2.c;
        pv2 pv2Var = this.f;
        if (pa7.t(pv2Var, ew2Var)) {
            pv2Var = this.e.e;
        }
        pv2Var.getClass();
        return y7h.y(pv2Var.p0(tq.d()), new gw2(this, null));
    }

    public abstract Object c(xn2 xn2Var);

    public Object e() {
        throw new IllegalStateException("Not implemented");
    }
}
