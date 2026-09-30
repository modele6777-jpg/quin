package androidx.work.impl.workers;

import android.content.Context;
import androidx.work.Worker;
import androidx.work.WorkerParameters;
import androidx.work.impl.WorkDatabase;
import defpackage.ac;
import defpackage.dbg;
import defpackage.ff8;
import defpackage.g84;
import defpackage.mce;
import defpackage.n8g;
import defpackage.nbg;
import defpackage.pbg;
import defpackage.t88;
import defpackage.u88;
import defpackage.urg;
import defpackage.uzd;
import defpackage.w5c;
import defpackage.yag;
import defpackage.z7c;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Landroidx/work/impl/workers/DiagnosticsWorker;", "Landroidx/work/Worker;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "parameters", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "work-runtime_release"}, k = 1, mv = {2, 1, 0}, xi = z7c.f)
public final class DiagnosticsWorker extends Worker {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DiagnosticsWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
    }

    @Override // androidx.work.Worker
    public final u88 c() {
        yag yagVarB = yag.b(this.a);
        WorkDatabase workDatabase = yagVarB.c;
        workDatabase.getClass();
        nbg nbgVarX = workDatabase.x();
        dbg dbgVarV = workDatabase.v();
        pbg pbgVarY = workDatabase.y();
        mce mceVarU = workDatabase.u();
        uzd uzdVar = yagVarB.b.d;
        List list = (List) urg.I(nbgVarX.a, true, false, new ac(System.currentTimeMillis() - 86400000, 21));
        w5c w5cVar = nbgVarX.a;
        List list2 = (List) urg.I(w5cVar, true, false, new n8g(6));
        List list3 = (List) urg.I(w5cVar, true, false, new n8g(10));
        if (!list.isEmpty()) {
            ff8 ff8VarH = ff8.h();
            String str = g84.a;
            ff8VarH.l(str, "Recently completed work:\n\n");
            ff8.h().l(str, g84.a(dbgVarV, pbgVarY, mceVarU, list));
        }
        if (!list2.isEmpty()) {
            ff8 ff8VarH2 = ff8.h();
            String str2 = g84.a;
            ff8VarH2.l(str2, "Running work:\n\n");
            ff8.h().l(str2, g84.a(dbgVarV, pbgVarY, mceVarU, list2));
        }
        if (!list3.isEmpty()) {
            ff8 ff8VarH3 = ff8.h();
            String str3 = g84.a;
            ff8VarH3.l(str3, "Enqueued work:\n\n");
            ff8.h().l(str3, g84.a(dbgVarV, pbgVarY, mceVarU, list3));
        }
        return new t88();
    }
}
