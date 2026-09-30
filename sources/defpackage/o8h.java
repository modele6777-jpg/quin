package defpackage;

import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.os.PersistableBundle;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class o8h extends fzg {
    public JobScheduler d;

    @Override // defpackage.fzg
    public final boolean D0() {
        return true;
    }

    public final void E0(long j) {
        w3h w3hVar = (w3h) this.b;
        B0();
        A0();
        JobScheduler jobScheduler = this.d;
        if (jobScheduler != null && jobScheduler.getPendingJob("measurement-client".concat(String.valueOf(w3hVar.a.getPackageName())).hashCode()) != null) {
            w0h w0hVar = w3hVar.f;
            w3h.h(w0hVar);
            w0hVar.Z.a("[sgtm] There's an existing pending job, skip this schedule.");
            return;
        }
        j4h j4hVarF0 = F0();
        if (j4hVarF0 != j4h.CLIENT_UPLOAD_ELIGIBLE) {
            w0h w0hVar2 = w3hVar.f;
            w3h.h(w0hVar2);
            w0hVar2.Z.b(j4hVarF0.name(), "[sgtm] Not eligible for Scion upload");
            return;
        }
        w0h w0hVar3 = w3hVar.f;
        w3h.h(w0hVar3);
        w0hVar3.Z.b(Long.valueOf(j), "[sgtm] Scheduling Scion upload, millis");
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("action", "com.google.android.gms.measurement.SCION_UPLOAD");
        JobInfo jobInfoBuild = new JobInfo.Builder("measurement-client".concat(String.valueOf(w3hVar.a.getPackageName())).hashCode(), new ComponentName(w3hVar.a, "com.google.android.gms.measurement.AppMeasurementJobService")).setRequiredNetworkType(1).setMinimumLatency(j).setOverrideDeadline(j + j).setExtras(persistableBundle).build();
        JobScheduler jobScheduler2 = this.d;
        oa7.A(jobScheduler2);
        int iSchedule = jobScheduler2.schedule(jobInfoBuild);
        w0h w0hVar4 = w3hVar.f;
        w3h.h(w0hVar4);
        w0hVar4.Z.b(iSchedule == 1 ? "SUCCESS" : "FAILURE", "[sgtm] Scion upload job scheduled with result");
    }

    public final j4h F0() {
        w3h w3hVar = (w3h) this.b;
        B0();
        A0();
        if (this.d == null) {
            return j4h.MISSING_JOB_SCHEDULER;
        }
        Boolean boolN0 = w3hVar.d.N0("google_analytics_sgtm_upload_enabled");
        if (!(boolN0 == null ? false : boolN0.booleanValue())) {
            return j4h.NOT_ENABLED_IN_MANIFEST;
        }
        if (w3hVar.l().y < 119000) {
            return j4h.SDK_TOO_OLD;
        }
        if (qch.V0(w3hVar.a)) {
            return !w3hVar.j().H0() ? j4h.NON_PLAY_MODE : j4h.CLIENT_UPLOAD_ELIGIBLE;
        }
        return j4h.MEASUREMENT_SERVICE_NOT_ENABLED;
    }
}
