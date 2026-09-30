package com.google.android.gms.measurement;

import android.app.Service;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import android.util.Log;
import defpackage.g5b;
import defpackage.ich;
import defpackage.n6h;
import defpackage.oa7;
import defpackage.qe;
import defpackage.qwg;
import defpackage.rah;
import defpackage.vxg;
import defpackage.w0h;
import defpackage.w1e;
import defpackage.w36;
import io.sentry.android.core.b1;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class AppMeasurementJobService extends JobService implements rah {
    public g5b a;

    @Override // defpackage.rah
    public final boolean a(int i) {
        throw new UnsupportedOperationException();
    }

    @Override // defpackage.rah
    public final void c(JobParameters jobParameters) {
        jobFinished(jobParameters, false);
    }

    public final g5b d() {
        g5b g5bVar = this.a;
        if (g5bVar != null) {
            return g5bVar;
        }
        g5b g5bVar2 = new g5b(22, this);
        this.a = g5bVar2;
        return g5bVar2;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        Log.v("FA", ((Service) d().b).getClass().getSimpleName().concat(" is starting up."));
    }

    @Override // android.app.Service
    public final void onDestroy() {
        Log.v("FA", ((Service) d().b).getClass().getSimpleName().concat(" is shutting down."));
        super.onDestroy();
    }

    @Override // android.app.Service
    public final void onRebind(Intent intent) {
        d();
        if (intent == null) {
            b1.d("FA", "onRebind called with null intent");
        } else {
            Log.v("FA", "onRebind called. action: ".concat(String.valueOf(intent.getAction())));
        }
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        JobParameters jobParameters2;
        g5b g5bVarD = d();
        Service service = (Service) g5bVarD.b;
        String string = jobParameters.getExtras().getString("action");
        Log.v("FA", "onStartJob received action: ".concat(String.valueOf(string)));
        if (Objects.equals(string, "com.google.android.gms.measurement.UPLOAD")) {
            oa7.A(string);
            ich ichVarZ = ich.z(service);
            w0h w0hVarV = ichVarZ.v();
            w1e w1eVar = ichVarZ.z.c;
            w0hVarV.Z.b(string, "Local AppMeasurementJobService called. action");
            jobParameters2 = jobParameters;
            ichVarZ.Z().J0(new n6h(g5bVarD, ichVarZ, new qe(g5bVarD, w0hVarV, jobParameters2, false, 17)));
        } else {
            jobParameters2 = jobParameters;
        }
        if (!Objects.equals(string, "com.google.android.gms.measurement.SCION_UPLOAD")) {
            return true;
        }
        oa7.A(string);
        vxg vxgVarE = vxg.e(service, null);
        w36 w36Var = new w36(28, g5bVarD, jobParameters2);
        vxgVarE.getClass();
        vxgVarE.c(new qwg(vxgVarE, w36Var, 2));
        return true;
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return false;
    }

    @Override // android.app.Service
    public final boolean onUnbind(Intent intent) {
        d();
        if (intent == null) {
            b1.d("FA", "onUnbind called with null intent");
            return true;
        }
        Log.v("FA", "onUnbind called for intent. action: ".concat(String.valueOf(intent.getAction())));
        return true;
    }

    @Override // defpackage.rah
    public final void b(Intent intent) {
    }
}
