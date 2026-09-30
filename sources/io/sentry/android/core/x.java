package io.sentry.android.core;

import android.net.TrafficStats;
import android.util.Log;
import io.sentry.q5;
import io.sentry.x4;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class x implements io.sentry.n1, y0, io.sentry.z0, io.sentry.logger.c, io.sentry.metrics.b {
    public static final x b = new x(0);
    public static final x c = new x(1);
    public final /* synthetic */ int a;

    public /* synthetic */ x(int i) {
        this.a = i;
    }

    @Override // io.sentry.n1
    public void a() {
        TrafficStats.clearThreadStatsTag();
    }

    @Override // io.sentry.logger.c
    public io.sentry.logger.b b(SentryAndroidOptions sentryAndroidOptions, x4 x4Var) {
        o oVar = new o(sentryAndroidOptions, x4Var);
        i0.e.b(oVar);
        return oVar;
    }

    @Override // io.sentry.z0
    public void c(q5 q5Var, Throwable th, String str, Object... objArr) {
        switch (this.a) {
            case 2:
                if (objArr.length != 0) {
                    d(q5Var, String.format(str, objArr), th);
                } else {
                    d(q5Var, str, th);
                }
                break;
            default:
                if (objArr.length != 0) {
                    d(q5Var, String.format(str, objArr), th);
                } else {
                    d(q5Var, str, th);
                }
                break;
        }
    }

    @Override // io.sentry.z0
    public void d(q5 q5Var, String str, Throwable th) {
        switch (this.a) {
            case 2:
                Log.wtf("Sentry", str, th);
                break;
            default:
                int i = m.a[q5Var.ordinal()];
                if (i == 1) {
                    Log.i("Sentry", str, th);
                } else if (i == 2) {
                    Log.w("Sentry", str, th);
                } else if (i == 3) {
                    Log.e("Sentry", str, th);
                } else if (i == 4) {
                    Log.wtf("Sentry", str, th);
                } else {
                    Log.d("Sentry", str, th);
                }
                break;
        }
    }

    @Override // io.sentry.n1
    public void e() {
        TrafficStats.setThreadStatsTag(61441);
    }

    @Override // io.sentry.z0
    public void i(q5 q5Var, String str, Object... objArr) {
        int i = 7;
        switch (this.a) {
            case 2:
                if (objArr.length != 0) {
                    Log.println(7, "Sentry", String.format(str, objArr));
                } else {
                    Log.println(7, "Sentry", str);
                }
                break;
            default:
                if (objArr.length != 0) {
                    int i2 = m.a[q5Var.ordinal()];
                    if (i2 == 1) {
                        i = 4;
                    } else if (i2 == 2) {
                        i = 5;
                    } else if (i2 != 4) {
                        i = 3;
                    }
                    Log.println(i, "Sentry", String.format(str, objArr));
                } else {
                    int i3 = m.a[q5Var.ordinal()];
                    if (i3 == 1) {
                        i = 4;
                    } else if (i3 == 2) {
                        i = 5;
                    } else if (i3 != 4) {
                        i = 3;
                    }
                    Log.println(i, "Sentry", str);
                }
                break;
        }
    }

    @Override // io.sentry.z0
    public boolean k(q5 q5Var) {
        switch (this.a) {
        }
        return true;
    }

    @Override // io.sentry.metrics.b
    /* JADX INFO: renamed from: b, reason: collision with other method in class */
    public io.sentry.metrics.a mo19b(SentryAndroidOptions sentryAndroidOptions, x4 x4Var) {
        q qVar = new q(sentryAndroidOptions, x4Var);
        i0.e.b(qVar);
        return qVar;
    }
}
