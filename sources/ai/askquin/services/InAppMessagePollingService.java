package ai.askquin.services;

import android.app.Service;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import android.os.Looper;
import defpackage.ca2;
import defpackage.eb3;
import defpackage.j5;
import defpackage.jz6;
import defpackage.lw7;
import defpackage.pa7;
import defpackage.wwg;
import defpackage.z18;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class InAppMessagePollingService extends Service {
    public static final /* synthetic */ int g = 0;
    public boolean d;
    public final lw7 a = eb3.N(z18.a, new j5(23, this));
    public final Handler b = new Handler(Looper.getMainLooper());
    public final long c = 30000;
    public final wwg e = new wwg(14, this);
    public final jz6 f = new jz6(this);

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return this.f;
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        if (this.d) {
            return;
        }
        this.b.post(this.e);
        this.d = true;
    }

    @Override // android.app.Service
    public final void onDestroy() {
        this.b.removeCallbacks(this.e);
        super.onDestroy();
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        if (!this.d) {
            this.b.post(this.e);
            this.d = true;
        }
        ca2.a.getClass();
        return pa7.t(ca2.d, "strict") ? 2 : 1;
    }
}
