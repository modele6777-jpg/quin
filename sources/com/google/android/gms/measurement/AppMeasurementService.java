package com.google.android.gms.measurement;

import android.app.Service;
import android.app.job.JobParameters;
import android.content.Intent;
import android.os.IBinder;
import android.os.PowerManager;
import android.util.Log;
import android.util.SparseArray;
import defpackage.e5h;
import defpackage.g5b;
import defpackage.ich;
import defpackage.n6h;
import defpackage.qzf;
import defpackage.rah;
import defpackage.w0h;
import defpackage.w3h;
import io.sentry.android.core.b1;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class AppMeasurementService extends Service implements rah {
    public g5b a;

    @Override // defpackage.rah
    public final boolean a(int i) {
        return stopSelfResult(i);
    }

    @Override // defpackage.rah
    public final void b(Intent intent) {
        SparseArray sparseArray = qzf.a;
        int intExtra = intent.getIntExtra("androidx.contentpager.content.wakelockid", 0);
        if (intExtra == 0) {
            return;
        }
        SparseArray sparseArray2 = qzf.a;
        synchronized (sparseArray2) {
            try {
                PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) sparseArray2.get(intExtra);
                if (wakeLock != null) {
                    wakeLock.release();
                    sparseArray2.remove(intExtra);
                } else {
                    b1.l("WakefulBroadcastReceiv.", "No active wake lock id #" + intExtra);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // defpackage.rah
    public final void c(JobParameters jobParameters) {
        throw new UnsupportedOperationException();
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
    public final IBinder onBind(Intent intent) {
        g5b g5bVarD = d();
        if (intent == null) {
            b1.d("FA", "onBind called with null intent");
            return null;
        }
        String action = intent.getAction();
        if ("com.google.android.gms.measurement.START".equals(action)) {
            return new e5h(ich.z((Service) g5bVarD.b));
        }
        b1.l("FA", "onBind received unknown action: ".concat(String.valueOf(action)));
        return null;
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

    @Override // android.app.Service
    public final int onStartCommand(final Intent intent, int i, final int i2) {
        final g5b g5bVarD = d();
        if (intent == null) {
            b1.l("FA", "AppMeasurementService started with null intent");
            return 2;
        }
        Service service = (Service) g5bVarD.b;
        final w0h w0hVar = w3h.m(service, null, null, null).f;
        w3h.h(w0hVar);
        String action = intent.getAction();
        w0hVar.Z.c(Integer.valueOf(i2), action, "Local AppMeasurementService called. startId, action");
        if (!"com.google.android.gms.measurement.UPLOAD".equals(action)) {
            return 2;
        }
        Runnable runnable = new Runnable() { // from class: sah
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.lang.Runnable
            public final void run() {
                Service service2 = (Service) g5bVarD.b;
                rah rahVar = (rah) service2;
                int i3 = i2;
                if (rahVar.a(i3)) {
                    w0hVar.Z.b(Integer.valueOf(i3), "Local AppMeasurementService processed last upload request. StartId");
                    w0h w0hVar2 = w3h.m(service2, null, null, null).f;
                    w3h.h(w0hVar2);
                    w0hVar2.Z.a("Completed wakeful intent.");
                    rahVar.b(intent);
                }
            }
        };
        ich ichVarZ = ich.z(service);
        ichVarZ.Z().J0(new n6h(g5bVarD, ichVarZ, runnable));
        return 2;
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
}
