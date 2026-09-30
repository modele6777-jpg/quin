package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import android.app.job.JobParameters;
import android.app.job.JobService;
import android.util.Base64;
import defpackage.f4f;
import defpackage.lp0;
import defpackage.mua;
import defpackage.ny2;
import defpackage.ohf;
import defpackage.qq0;
import defpackage.ta0;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public class JobInfoSchedulerService extends JobService {
    public static final /* synthetic */ int a = 0;

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        String string = jobParameters.getExtras().getString("backendName");
        String string2 = jobParameters.getExtras().getString("extras");
        int i = jobParameters.getExtras().getInt("priority");
        int i2 = jobParameters.getExtras().getInt("attemptNumber");
        f4f.b(getApplicationContext());
        ta0 ta0VarA = qq0.a();
        ta0VarA.N(string);
        ta0VarA.b = mua.b(i);
        if (string2 != null) {
            ta0VarA.d = Base64.decode(string2, 0);
        }
        lp0 lp0Var = f4f.a().d;
        ((Executor) lp0Var.f).execute(new ohf(lp0Var, ta0VarA.f(), i2, new ny2(21, this, jobParameters)));
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return true;
    }
}
