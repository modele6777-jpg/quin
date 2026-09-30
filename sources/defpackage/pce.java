package defpackage;

import android.app.job.JobInfo;
import android.content.ComponentName;
import android.content.Context;
import android.net.NetworkRequest;
import android.os.Build;
import android.os.PersistableBundle;
import androidx.work.impl.background.systemjob.SystemJobService;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class pce {
    public static final String b = ff8.n("SystemJobInfoConverter");
    public final ComponentName a;

    public pce(Context context, uzd uzdVar) {
        this.a = new ComponentName(context.getApplicationContext(), (Class<?>) SystemJobService.class);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final JobInfo a(lbg lbgVar, int i) {
        int i2;
        String str;
        jl2 jl2Var = lbgVar.j;
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("EXTRA_WORK_SPEC_ID", lbgVar.a);
        persistableBundle.putInt("EXTRA_WORK_SPEC_GENERATION", lbgVar.t);
        persistableBundle.putBoolean("EXTRA_IS_PERIODIC", lbgVar.b());
        JobInfo.Builder builder = new JobInfo.Builder(i, this.a);
        boolean z = jl2Var.c;
        Set<il2> set = jl2Var.i;
        JobInfo.Builder requiresCharging = builder.setRequiresCharging(z);
        boolean z2 = jl2Var.d;
        JobInfo.Builder extras = requiresCharging.setRequiresDeviceIdle(z2).setExtras(persistableBundle);
        NetworkRequest networkRequestA = jl2Var.a();
        int i3 = Build.VERSION.SDK_INT;
        if (i3 < 28 || networkRequestA == null) {
            qe9 qe9Var = jl2Var.a;
            if (i3 < 30 || qe9Var != qe9.f) {
                int iOrdinal = qe9Var.ordinal();
                if (iOrdinal == 0) {
                    i2 = 0;
                } else if (iOrdinal != 1) {
                    i2 = 2;
                    if (iOrdinal != 2) {
                        i2 = 3;
                        if (iOrdinal != 3) {
                            i2 = 4;
                            if (iOrdinal != 4) {
                                ff8.h().e(b, "API version too low. Cannot convert network type value " + qe9Var);
                                i2 = 1;
                            }
                        }
                    }
                } else {
                    i2 = 1;
                }
                extras.setRequiredNetworkType(i2);
            } else {
                extras.setRequiredNetwork(new NetworkRequest.Builder().addCapability(25).build());
            }
        } else {
            extras.getClass();
            extras.setRequiredNetwork(networkRequestA);
        }
        if (!z2) {
            extras.setBackoffCriteria(lbgVar.m, lbgVar.l == us0.b ? 0 : 1);
        }
        long jMax = Math.max(lbgVar.a() - System.currentTimeMillis(), 0L);
        if (i3 <= 28 || jMax > 0) {
            extras.setMinimumLatency(jMax);
        } else if (!lbgVar.q) {
            extras.setImportantWhileForeground(true);
        }
        if (!set.isEmpty()) {
            for (il2 il2Var : set) {
                extras.addTriggerContentUri(new JobInfo.TriggerContentUri(il2Var.a, il2Var.b ? 1 : 0));
            }
            extras.setTriggerContentUpdateDelay(jl2Var.g);
            extras.setTriggerContentMaxDelay(jl2Var.h);
        }
        extras.setPersisted(false);
        extras.setRequiresBatteryNotLow(jl2Var.e);
        extras.setRequiresStorageNotLow(jl2Var.f);
        byte b2 = lbgVar.k > 0;
        boolean z3 = jMax > 0;
        int i4 = Build.VERSION.SDK_INT;
        if (i4 >= 31 && lbgVar.q && b2 == false && !z3) {
            extras.setExpedited(true);
        }
        if (i4 >= 35 && (str = lbgVar.x) != null) {
            extras.setTraceTag(str);
        }
        return extras.build();
    }
}
