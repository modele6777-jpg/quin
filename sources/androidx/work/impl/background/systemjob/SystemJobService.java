package androidx.work.impl.background.systemjob;

import android.app.Application;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.os.Build;
import android.os.Looper;
import android.os.PersistableBundle;
import defpackage.a35;
import defpackage.ff8;
import defpackage.ho7;
import defpackage.ib8;
import defpackage.lqb;
import defpackage.nzd;
import defpackage.pzd;
import defpackage.qc0;
import defpackage.s;
import defpackage.tag;
import defpackage.u5c;
import defpackage.vva;
import defpackage.xq;
import defpackage.yag;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public class SystemJobService extends JobService implements a35 {
    public static final String e = ff8.n("SystemJobService");
    public yag a;
    public final HashMap b = new HashMap();
    public final u5c c = new u5c(1);
    public lqb d;

    public static void a(String str) {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            return;
        }
        qc0.p(ib8.j("Cannot invoke ", str, " on a background thread"));
    }

    public static tag c(JobParameters jobParameters) {
        try {
            PersistableBundle extras = jobParameters.getExtras();
            if (extras == null || !extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return null;
            }
            return new tag(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION"));
        } catch (NullPointerException unused) {
            return null;
        }
    }

    @Override // defpackage.a35
    public final void b(tag tagVar, boolean z) {
        a("onExecuted");
        ff8.h().e(e, tagVar.a + " executed on JobScheduler");
        JobParameters jobParameters = (JobParameters) this.b.remove(tagVar);
        this.c.b(tagVar);
        if (jobParameters != null) {
            jobFinished(jobParameters, z);
        }
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        try {
            yag yagVarB = yag.b(getApplicationContext());
            this.a = yagVarB;
            vva vvaVar = yagVarB.f;
            this.d = new lqb(vvaVar, yagVarB.d);
            vvaVar.a(this);
        } catch (IllegalStateException e2) {
            if (Application.class.equals(getApplication().getClass())) {
                ff8.h().o(e, "Could not find WorkManager instance; this may be because an auto-backup is in progress. Ignoring JobScheduler commands for now. Please make sure that you are initializing WorkManager if you have manually disabled WorkManagerInitializer.");
            } else {
                ho7.r("WorkManager needs to be initialized via a ContentProvider#onCreate() or an Application#onCreate().", e2);
            }
        }
    }

    @Override // android.app.Service
    public final void onDestroy() {
        super.onDestroy();
        yag yagVar = this.a;
        if (yagVar != null) {
            vva vvaVar = yagVar.f;
            synchronized (vvaVar.k) {
                vvaVar.j.remove(this);
            }
        }
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        a("onStartJob");
        yag yagVar = this.a;
        String str = e;
        if (yagVar == null) {
            ff8.h().e(str, "WorkManager is not initialized; requesting retry.");
            jobFinished(jobParameters, true);
            return false;
        }
        tag tagVarC = c(jobParameters);
        if (tagVarC == null) {
            ff8.h().f(str, "WorkSpec id not found!");
            return false;
        }
        HashMap map = this.b;
        if (map.containsKey(tagVarC)) {
            ff8.h().e(str, "Job is already being executed by SystemJobService: " + tagVarC);
            return false;
        }
        ff8.h().e(str, "onStartJob for " + tagVarC);
        map.put(tagVarC, jobParameters);
        pzd pzdVar = new pzd(12);
        if (jobParameters.getTriggeredContentUris() != null) {
            Arrays.asList(jobParameters.getTriggeredContentUris());
        }
        if (jobParameters.getTriggeredContentAuthorities() != null) {
            Arrays.asList(jobParameters.getTriggeredContentAuthorities());
        }
        if (Build.VERSION.SDK_INT >= 28) {
            s.z(jobParameters);
        }
        this.d.w(this.c.d(tagVarC), pzdVar);
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        boolean zContains;
        a("onStopJob");
        if (this.a == null) {
            ff8.h().e(e, "WorkManager is not initialized; requesting retry.");
            return true;
        }
        tag tagVarC = c(jobParameters);
        if (tagVarC == null) {
            ff8.h().f(e, "WorkSpec id not found!");
            return false;
        }
        ff8.h().e(e, "onStopJob for " + tagVarC);
        this.b.remove(tagVarC);
        nzd nzdVarB = this.c.b(tagVarC);
        if (nzdVarB != null) {
            int iQ = Build.VERSION.SDK_INT >= 31 ? xq.q(jobParameters) : -512;
            lqb lqbVar = this.d;
            lqbVar.getClass();
            lqbVar.x(nzdVarB, iQ);
        }
        vva vvaVar = this.a.f;
        String str = tagVarC.a;
        synchronized (vvaVar.k) {
            zContains = vvaVar.i.contains(str);
        }
        return !zContains;
    }
}
