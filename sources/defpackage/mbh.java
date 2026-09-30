package defpackage;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobScheduler;
import android.content.Context;
import android.content.Intent;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class mbh extends wbh {
    public final AlarmManager e;
    public xah f;
    public Integer g;

    public mbh(ich ichVar) {
        super(ichVar);
        this.e = (AlarmManager) ((w3h) this.b).a.getSystemService("alarm");
    }

    @Override // defpackage.wbh
    public final void D0() {
        AlarmManager alarmManager = this.e;
        if (alarmManager != null) {
            Context context = ((w3h) this.b).a;
            alarmManager.cancel(PendingIntent.getBroadcast(context, 0, new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), stg.a));
        }
        F0();
    }

    public final void E0() {
        B0();
        w3h w3hVar = (w3h) this.b;
        w0h w0hVar = w3hVar.f;
        w3h.h(w0hVar);
        w0hVar.Z.a("Unscheduling upload");
        AlarmManager alarmManager = this.e;
        if (alarmManager != null) {
            Context context = w3hVar.a;
            alarmManager.cancel(PendingIntent.getBroadcast(context, 0, new Intent().setClassName(context, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), stg.a));
        }
        xah xahVar = this.f;
        if (xahVar == null) {
            xahVar = new xah(this, this.c.z, 1);
            this.f = xahVar;
        }
        xahVar.c();
        F0();
    }

    public final void F0() {
        JobScheduler jobScheduler = (JobScheduler) ((w3h) this.b).a.getSystemService("jobscheduler");
        if (jobScheduler != null) {
            jobScheduler.cancel(G0());
        }
    }

    public final int G0() {
        Integer numValueOf = this.g;
        if (numValueOf == null) {
            numValueOf = Integer.valueOf("measurement".concat(String.valueOf(((w3h) this.b).a.getPackageName())).hashCode());
            this.g = numValueOf;
        }
        return numValueOf.intValue();
    }
}
