package defpackage;

import android.content.Context;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zag extends h36 implements q26 {
    public static final zag a = new zag(6, abg.class, "createSchedulers", "createSchedulers(Landroid/content/Context;Landroidx/work/Configuration;Landroidx/work/impl/utils/taskexecutor/TaskExecutor;Landroidx/work/impl/WorkDatabase;Landroidx/work/impl/constraints/trackers/Trackers;Landroidx/work/impl/Processor;)Ljava/util/List;", 1);

    @Override // defpackage.q26
    public final Object w(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        Context context = (Context) obj;
        si2 si2Var = (si2) obj2;
        bbg bbgVar = (bbg) obj3;
        WorkDatabase workDatabase = (WorkDatabase) obj4;
        y1f y1fVar = (y1f) obj5;
        vva vvaVar = (vva) obj6;
        context.getClass();
        si2Var.getClass();
        bbgVar.getClass();
        workDatabase.getClass();
        y1fVar.getClass();
        String str = efc.a;
        qce qceVar = new qce(context, workDatabase, si2Var);
        pw9.a(context, SystemJobService.class, true);
        ff8.h().e(efc.a, "Created SystemJobScheduler and enabled SystemJobService");
        return t72.I(qceVar, new ve6(context, si2Var, y1fVar, vvaVar, new lqb(vvaVar, bbgVar), bbgVar));
    }
}
