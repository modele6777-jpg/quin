package defpackage;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.background.systemjob.SystemJobService;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class qce implements bfc {
    public static final String e = ff8.n("SystemJobScheduler");
    public final Context a;
    public final JobScheduler b;
    public final pce c;
    public final WorkDatabase d;

    public qce(Context context, WorkDatabase workDatabase, si2 si2Var) {
        JobScheduler jobSchedulerA = ig7.a(context);
        pce pceVar = new pce(context, si2Var.d);
        this.a = context;
        this.b = jobSchedulerA;
        this.c = pceVar;
        this.d = workDatabase;
    }

    public static void a(JobScheduler jobScheduler, int i) {
        try {
            jobScheduler.cancel(i);
        } catch (Throwable th) {
            ff8.h().g(e, String.format(Locale.getDefault(), "Exception while trying to cancel job (%d)", Integer.valueOf(i)), th);
        }
    }

    public static ArrayList b(Context context, JobScheduler jobScheduler) {
        List<JobInfo> allPendingJobs;
        String str = ig7.a;
        jobScheduler.getClass();
        try {
            allPendingJobs = jobScheduler.getAllPendingJobs();
            allPendingJobs.getClass();
        } catch (Throwable th) {
            ff8.h().g(ig7.a, "getAllPendingJobs() is not reliable on this device.", th);
            allPendingJobs = null;
        }
        if (allPendingJobs == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(allPendingJobs.size());
        ComponentName componentName = new ComponentName(context, (Class<?>) SystemJobService.class);
        for (JobInfo jobInfo : allPendingJobs) {
            if (componentName.equals(jobInfo.getService())) {
                arrayList.add(jobInfo);
            }
        }
        return arrayList;
    }

    public static tag f(JobInfo jobInfo) {
        PersistableBundle extras = jobInfo.getExtras();
        if (extras == null) {
            return null;
        }
        try {
            if (!extras.containsKey("EXTRA_WORK_SPEC_ID")) {
                return null;
            }
            return new tag(extras.getString("EXTRA_WORK_SPEC_ID"), extras.getInt("EXTRA_WORK_SPEC_GENERATION", 0));
        } catch (NullPointerException unused) {
            return null;
        }
    }

    @Override // defpackage.bfc
    public final boolean c() {
        return true;
    }

    @Override // defpackage.bfc
    public final void d(String str) {
        ArrayList arrayList;
        Context context = this.a;
        JobScheduler jobScheduler = this.b;
        ArrayList<JobInfo> arrayListB = b(context, jobScheduler);
        if (arrayListB == null) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList(2);
            for (JobInfo jobInfo : arrayListB) {
                tag tagVarF = f(jobInfo);
                if (tagVarF != null && str.equals(tagVarF.a)) {
                    arrayList2.add(Integer.valueOf(jobInfo.getId()));
                }
            }
            arrayList = arrayList2;
        }
        if (arrayList == null || arrayList.isEmpty()) {
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            a(jobScheduler, ((Integer) it.next()).intValue());
        }
        mce mceVarU = this.d.u();
        mceVarU.getClass();
        str.getClass();
        urg.I(mceVarU.a, false, true, new alc(str, 9));
    }

    @Override // defpackage.bfc
    public final void e(lbg... lbgVarArr) {
        int iIntValue;
        WorkDatabase workDatabase = this.d;
        ssg ssgVar = new ssg(20, workDatabase);
        int i = 0;
        for (lbg lbgVar : lbgVarArr) {
            workDatabase.b();
            try {
                nbg nbgVarX = workDatabase.x();
                String str = lbgVar.a;
                lbg lbgVarD = nbgVarX.d(str);
                String str2 = e;
                if (lbgVarD == null) {
                    ff8.h().o(str2, "Skipping scheduling " + str + " because it's no longer in the DB");
                    workDatabase.q();
                } else if (lbgVarD.b != vag.a) {
                    ff8.h().o(str2, "Skipping scheduling " + str + " because it is no longer enqueued");
                    workDatabase.q();
                } else {
                    tag tagVarH = fbc.h(lbgVar);
                    int i2 = tagVarH.b;
                    String str3 = tagVarH.a;
                    mce mceVarU = workDatabase.u();
                    mceVarU.getClass();
                    str3.getClass();
                    kce kceVar = (kce) urg.I(mceVarU.a, true, false, new lce(str3, i2, i));
                    if (kceVar != null) {
                        iIntValue = kceVar.c;
                    } else {
                        Object objP = ((WorkDatabase) ssgVar.b).p(new hla(10, new uh2(3, ssgVar)));
                        objP.getClass();
                        iIntValue = ((Number) objP).intValue();
                    }
                    if (kceVar == null) {
                        kce kceVar2 = new kce(str3, i2, iIntValue);
                        mce mceVarU2 = workDatabase.u();
                        mceVarU2.getClass();
                        urg.I(mceVarU2.a, false, true, new i2e(2, mceVarU2, kceVar2));
                    }
                    g(lbgVar, iIntValue);
                    workDatabase.q();
                }
                workDatabase.m();
            } catch (Throwable th) {
                workDatabase.m();
                throw th;
            }
        }
    }

    public final void g(lbg lbgVar, int i) throws IOException {
        List<JobInfo> allPendingJobs;
        JobInfo jobInfoA = this.c.a(lbgVar, i);
        ff8 ff8VarH = ff8.h();
        StringBuilder sb = new StringBuilder("Scheduling work ID ");
        String str = lbgVar.a;
        sb.append(str);
        sb.append("Job ID ");
        sb.append(i);
        String string = sb.toString();
        String str2 = e;
        ff8VarH.e(str2, string);
        try {
            if (this.b.schedule(jobInfoA) == 0) {
                ff8.h().o(str2, "Unable to schedule work ID " + str);
                if (lbgVar.q && lbgVar.r == rs9.a) {
                    lbgVar.q = false;
                    ff8.h().e(str2, "Scheduling a non-expedited job (work ID " + str + ")");
                    g(lbgVar, i);
                }
            }
        } catch (IllegalStateException e2) {
            String str3 = ig7.a;
            int i2 = Build.VERSION.SDK_INT;
            int i3 = i2 >= 31 ? 150 : 100;
            int size = ((List) urg.I(this.d.x().a, true, false, new n8g(4))).size();
            Context context = this.a;
            String strD0 = "<faulty JobScheduler failed to getPendingJobs>";
            if (i2 >= 34) {
                JobScheduler jobSchedulerA = ig7.a(context);
                try {
                    allPendingJobs = jobSchedulerA.getAllPendingJobs();
                    allPendingJobs.getClass();
                } catch (Throwable th) {
                    ff8.h().g(ig7.a, "getAllPendingJobs() is not reliable on this device.", th);
                    allPendingJobs = null;
                }
                if (allPendingJobs != null) {
                    ArrayList arrayListB = b(context, jobSchedulerA);
                    int size2 = arrayListB != null ? allPendingJobs.size() - arrayListB.size() : 0;
                    String strG = size2 == 0 ? null : ub3.g(size2, " of which are not owned by WorkManager");
                    Object systemService = context.getSystemService("jobscheduler");
                    systemService.getClass();
                    ArrayList arrayListB2 = b(context, (JobScheduler) systemService);
                    int size3 = arrayListB2 != null ? arrayListB2.size() : 0;
                    strD0 = s72.D0(qd0.k0(new String[]{allPendingJobs.size() + " jobs in \"androidx.work.systemjobscheduler\" namespace", strG, size3 != 0 ? ub3.g(size3, " from WorkManager in the default namespace") : null}), ",\n", null, null, null, 62);
                }
            } else {
                ArrayList arrayListB3 = b(context, ig7.a(context));
                if (arrayListB3 != null) {
                    strD0 = arrayListB3.size() + " jobs from WorkManager";
                }
            }
            StringBuilder sb2 = new StringBuilder("JobScheduler ");
            sb2.append(i3);
            sb2.append(" job limit exceeded.\nIn JobScheduler there are ");
            sb2.append(strD0);
            sb2.append(".\nThere are ");
            String strG2 = tec.g(size, " jobs tracked by WorkManager's database;\nthe Configuration limit is 20.", sb2);
            ff8.h().f(str2, strG2);
            ho7.r(strG2, e2);
        } catch (Throwable th2) {
            ff8.h().g(str2, "Unable to schedule " + lbgVar, th2);
        }
    }
}
