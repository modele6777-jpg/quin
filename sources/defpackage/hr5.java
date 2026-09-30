package defpackage;

import android.app.ActivityManager;
import android.app.AlarmManager;
import android.app.ApplicationExitInfo;
import android.app.PendingIntent;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteAccessPermException;
import android.database.sqlite.SQLiteCantOpenDatabaseException;
import android.database.sqlite.SQLiteConstraintException;
import android.database.sqlite.SQLiteDatabaseCorruptException;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.database.sqlite.SQLiteDiskIOException;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteFullException;
import android.database.sqlite.SQLiteTableLockedException;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import androidx.work.impl.WorkDatabase;
import androidx.work.impl.utils.ForceStopRunnable$BroadcastReceiver;
import io.sentry.android.core.b1;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class hr5 implements Runnable {
    public static final String e = ff8.n("ForceStopRunnable");
    public static final long f = 315360000000L;
    public final Context a;
    public final yag b;
    public final kb6 c;
    public int d = 0;

    public hr5(Context context, yag yagVar) {
        this.a = context.getApplicationContext();
        this.b = yagVar;
        this.c = yagVar.g;
    }

    public static void c(Context context) {
        AlarmManager alarmManager = (AlarmManager) context.getSystemService("alarm");
        int i = Build.VERSION.SDK_INT >= 31 ? 167772160 : 134217728;
        Intent intent = new Intent();
        intent.setComponent(new ComponentName(context, (Class<?>) ForceStopRunnable$BroadcastReceiver.class));
        intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
        PendingIntent broadcast = PendingIntent.getBroadcast(context, -1, intent, i);
        long jCurrentTimeMillis = System.currentTimeMillis() + f;
        if (alarmManager != null) {
            alarmManager.setExact(0, jCurrentTimeMillis, broadcast);
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x020d  */
    /* JADX WARN: Code duplicated, block: B:126:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:97:0x01f5  */
    public final void a() throws Throwable {
        boolean z;
        kb6 kb6Var = this.c;
        yag yagVar = this.b;
        si2 si2Var = yagVar.b;
        kb6 kb6Var2 = yagVar.g;
        WorkDatabase workDatabase = yagVar.c;
        String str = qce.e;
        Context context = this.a;
        JobScheduler jobSchedulerA = ig7.a(context);
        ArrayList<JobInfo> arrayListB = qce.b(context, jobSchedulerA);
        List list = (List) urg.I(workDatabase.u().a, true, false, new znd(24));
        HashSet hashSet = new HashSet(arrayListB != null ? arrayListB.size() : 0);
        if (arrayListB != null && !arrayListB.isEmpty()) {
            for (JobInfo jobInfo : arrayListB) {
                tag tagVarF = qce.f(jobInfo);
                if (tagVarF != null) {
                    hashSet.add(tagVarF.a);
                } else {
                    qce.a(jobSchedulerA, jobInfo.getId());
                }
            }
        }
        Iterator it = list.iterator();
        while (true) {
            if (it.hasNext()) {
                if (!hashSet.contains((String) it.next())) {
                    ff8.h().e(qce.e, "Reconciling jobs");
                    z = true;
                    break;
                }
            } else {
                z = false;
                break;
            }
        }
        if (z) {
            workDatabase.b();
            try {
                nbg nbgVarX = workDatabase.x();
                Iterator it2 = list.iterator();
                while (it2.hasNext()) {
                    nbgVarX.e(-1L, (String) it2.next());
                }
                workDatabase.q();
                workDatabase.m();
            } catch (Throwable th) {
                workDatabase.m();
                throw th;
            }
        }
        nbg nbgVarX2 = workDatabase.x();
        fbg fbgVarW = workDatabase.w();
        workDatabase.b();
        try {
            List<lbg> list2 = (List) urg.I(nbgVarX2.a, true, false, new n8g(6));
            boolean z2 = (list2 == null || list2.isEmpty()) ? false : true;
            if (z2) {
                for (lbg lbgVar : list2) {
                    vag vagVar = vag.a;
                    String str2 = lbgVar.a;
                    nbgVarX2.h(vagVar, str2);
                    nbgVarX2.i(-512, str2);
                    nbgVarX2.e(-1L, str2);
                }
            }
            urg.I(fbgVarW.a, false, true, new n8g(3));
            workDatabase.q();
            workDatabase.m();
            boolean z3 = z2 || z;
            Long lA = ((WorkDatabase) kb6Var2.b).t().a("reschedule_needed");
            int i = 27;
            String str3 = e;
            if (lA != null && lA.longValue() == 1) {
                ff8.h().e(str3, "Rescheduling Workers.");
                yagVar.d();
                kb6Var2.getClass();
                zpa zpaVar = new zpa("reschedule_needed", 0L);
                aqa aqaVarT = ((WorkDatabase) kb6Var2.b).t();
                urg.I(aqaVarT.a, false, true, new kz8(i, aqaVarT, zpaVar));
                return;
            }
            try {
                int i2 = Build.VERSION.SDK_INT;
                int i3 = i2 >= 31 ? 570425344 : 536870912;
                Intent intent = new Intent();
                intent.setComponent(new ComponentName(context, (Class<?>) ForceStopRunnable$BroadcastReceiver.class));
                intent.setAction("ACTION_FORCE_STOP_RESCHEDULE");
                PendingIntent broadcast = PendingIntent.getBroadcast(context, -1, intent, i3);
                if (i2 < 30) {
                    if (broadcast == null) {
                        c(context);
                        ff8.h().e(str3, "Application was force-stopped, rescheduling.");
                        yagVar.d();
                        uzd uzdVar = si2Var.d;
                        long jCurrentTimeMillis = System.currentTimeMillis();
                        kb6Var.getClass();
                        zpa zpaVar2 = new zpa("last_force_stop_ms", Long.valueOf(jCurrentTimeMillis));
                        aqa aqaVarT2 = ((WorkDatabase) kb6Var.b).t();
                        urg.I(aqaVarT2.a, false, true, new kz8(i, aqaVarT2, zpaVar2));
                        return;
                    }
                    if (z3) {
                        ff8.h().e(str3, "Found unfinished work, scheduling it.");
                        efc.b(si2Var, workDatabase, yagVar.e);
                    }
                }
                if (broadcast != null) {
                    broadcast.cancel();
                }
                List<ApplicationExitInfo> historicalProcessExitReasons = ((ActivityManager) context.getSystemService("activity")).getHistoricalProcessExitReasons(null, 0, 0);
                if (historicalProcessExitReasons != null && !historicalProcessExitReasons.isEmpty()) {
                    Long lA2 = ((WorkDatabase) kb6Var.b).t().a("last_force_stop_ms");
                    long jLongValue = lA2 != null ? lA2.longValue() : 0L;
                    for (int i4 = 0; i4 < historicalProcessExitReasons.size(); i4++) {
                        ApplicationExitInfo applicationExitInfoA = yg5.a(historicalProcessExitReasons.get(i4));
                        if (applicationExitInfoA.getReason() == 10 && applicationExitInfoA.getTimestamp() >= jLongValue) {
                            ff8.h().e(str3, "Application was force-stopped, rescheduling.");
                            yagVar.d();
                            uzd uzdVar2 = si2Var.d;
                            long jCurrentTimeMillis2 = System.currentTimeMillis();
                            kb6Var.getClass();
                            zpa zpaVar3 = new zpa("last_force_stop_ms", Long.valueOf(jCurrentTimeMillis2));
                            aqa aqaVarT3 = ((WorkDatabase) kb6Var.b).t();
                            urg.I(aqaVarT3.a, false, true, new kz8(i, aqaVarT3, zpaVar3));
                            return;
                        }
                    }
                }
                if (z3) {
                    ff8.h().e(str3, "Found unfinished work, scheduling it.");
                    efc.b(si2Var, workDatabase, yagVar.e);
                }
            } catch (IllegalArgumentException e2) {
                e = e2;
                if (ff8.h().b <= 5) {
                    b1.n(str3, "Ignoring exception", e);
                }
            } catch (SecurityException e3) {
                e = e3;
                if (ff8.h().b <= 5) {
                    b1.n(str3, "Ignoring exception", e);
                }
            }
        } catch (Throwable th2) {
            workDatabase.m();
            throw th2;
        }
    }

    public final boolean b() {
        si2 si2Var = this.b.b;
        si2Var.getClass();
        boolean zIsEmpty = TextUtils.isEmpty(null);
        String str = e;
        if (zIsEmpty) {
            ff8.h().e(str, "The default process name was not specified.");
            return true;
        }
        boolean zA = ova.a(this.a, si2Var);
        ff8.h().e(str, "Is default app process = " + zA);
        return zA;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Context context = this.a;
        String str = e;
        yag yagVar = this.b;
        si2 si2Var = yagVar.b;
        try {
            if (!b()) {
                yagVar.c();
                return;
            }
            while (true) {
                try {
                    y8c.m(context);
                    ff8.h().e(str, "Performing cleanup operations.");
                    try {
                        a();
                        yagVar.c();
                        return;
                    } catch (SQLiteAccessPermException | SQLiteCantOpenDatabaseException | SQLiteConstraintException | SQLiteDatabaseCorruptException | SQLiteDatabaseLockedException | SQLiteDiskIOException | SQLiteFullException | SQLiteTableLockedException e2) {
                        int i = this.d + 1;
                        this.d = i;
                        if (i >= 3) {
                            String str2 = drb.h(context) ? "The file system on the device is in a bad state. WorkManager cannot access the app's internal data store." : "WorkManager can't be accessed from direct boot, because credential encrypted storage isn't accessible.\nDon't access or initialise WorkManager from directAware components. See https://developer.android.com/training/articles/direct-boot";
                            ff8.h().g(str, str2, e2);
                            IllegalStateException illegalStateException = new IllegalStateException(str2, e2);
                            si2Var.getClass();
                            throw illegalStateException;
                        }
                        long j = ((long) i) * 300;
                        String str3 = "Retrying after " + j;
                        if (ff8.h().b <= 3) {
                            Log.d(str, str3, e2);
                        }
                        try {
                            Thread.sleep(((long) this.d) * 300);
                        } catch (InterruptedException unused) {
                        }
                    }
                } catch (SQLiteException e3) {
                    ff8.h().f(str, "Unexpected SQLite exception during migrations");
                    IllegalStateException illegalStateException2 = new IllegalStateException("Unexpected SQLite exception during migrations", e3);
                    si2Var.getClass();
                    throw illegalStateException2;
                }
            }
        } catch (Throwable th) {
            yagVar.c();
            throw th;
        }
    }
}
