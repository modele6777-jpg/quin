package androidx.work.impl.foreground;

import android.app.NotificationManager;
import android.app.Service;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import android.text.TextUtils;
import defpackage.a58;
import defpackage.ad1;
import defpackage.f48;
import defpackage.ff8;
import defpackage.gg7;
import defpackage.h48;
import defpackage.h80;
import defpackage.hce;
import defpackage.i7h;
import defpackage.i8c;
import defpackage.lwg;
import defpackage.x48;
import defpackage.yag;
import java.util.UUID;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public class SystemForegroundService extends Service implements x48 {
    public static final String e = ff8.n("SystemFgService");
    public final gg7 a = new gg7(this);
    public boolean b;
    public hce c;
    public NotificationManager d;

    public final void a() {
        this.d = (NotificationManager) getApplicationContext().getSystemService("notification");
        hce hceVar = new hce(getApplicationContext());
        this.c = hceVar;
        if (hceVar.w != null) {
            ff8.h().f(hce.x, "A callback already exists.");
        } else {
            hceVar.w = this;
        }
    }

    public final void c() {
        gg7 gg7Var = this.a;
        gg7Var.getClass();
        gg7Var.s(f48.ON_CREATE);
        super.onCreate();
    }

    public final void d() {
        gg7 gg7Var = this.a;
        gg7Var.getClass();
        gg7Var.s(f48.ON_STOP);
        gg7Var.s(f48.ON_DESTROY);
        super.onDestroy();
    }

    @Override // defpackage.x48
    public final h48 k() {
        return (a58) this.a.b;
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        intent.getClass();
        gg7 gg7Var = this.a;
        gg7Var.getClass();
        gg7Var.s(f48.ON_START);
        return null;
    }

    @Override // android.app.Service
    public final void onCreate() {
        c();
        a();
    }

    @Override // android.app.Service
    public final void onDestroy() {
        d();
        this.c.e();
    }

    @Override // android.app.Service
    public final void onStart(Intent intent, int i) {
        gg7 gg7Var = this.a;
        gg7Var.getClass();
        gg7Var.s(f48.ON_START);
        super.onStart(intent, i);
    }

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i, int i2) {
        super.onStartCommand(intent, i, i2);
        boolean z = this.b;
        boolean z2 = false;
        String str = e;
        if (z) {
            ff8.h().l(str, "Re-initializing SystemForegroundService after a request to shut-down.");
            this.c.e();
            a();
            this.b = false;
        }
        if (intent == null) {
            return 3;
        }
        hce hceVar = this.c;
        hceVar.getClass();
        String str2 = hce.x;
        String action = intent.getAction();
        if ("ACTION_START_FOREGROUND".equals(action)) {
            ff8.h().l(str2, "Started foreground service " + intent);
            hceVar.b.a(new lwg(hceVar, intent.getStringExtra("KEY_WORKSPEC_ID"), z2, 17));
            hceVar.d(intent);
            return 3;
        }
        if ("ACTION_NOTIFY".equals(action)) {
            hceVar.d(intent);
            return 3;
        }
        if (!"ACTION_CANCEL_WORK".equals(action)) {
            if (!"ACTION_STOP_FOREGROUND".equals(action)) {
                return 3;
            }
            ff8.h().l(str2, "Stopping foreground service");
            SystemForegroundService systemForegroundService = hceVar.w;
            if (systemForegroundService == null) {
                return 3;
            }
            systemForegroundService.b = true;
            ff8.h().e(str, "Shutting down.");
            systemForegroundService.stopForeground(true);
            systemForegroundService.stopSelf(i2);
            return 3;
        }
        ff8.h().l(str2, "Stopping foreground work for " + intent);
        String stringExtra = intent.getStringExtra("KEY_WORKSPEC_ID");
        if (stringExtra == null || TextUtils.isEmpty(stringExtra)) {
            return 3;
        }
        yag yagVar = hceVar.a;
        UUID uuidFromString = UUID.fromString(stringExtra);
        yagVar.getClass();
        uuidFromString.getClass();
        i8c i8cVar = yagVar.b.f;
        h80 h80Var = yagVar.d.a;
        h80Var.getClass();
        i7h.A(i8cVar, "CancelWorkById", h80Var, new ad1(2, yagVar, uuidFromString));
        return 3;
    }

    @Override // android.app.Service
    public final void onTimeout(int i) {
        if (Build.VERSION.SDK_INT >= 35) {
            return;
        }
        this.c.f(i, 2048);
    }

    public final void onTimeout(int i, int i2) {
        this.c.f(i, i2);
    }
}
