package defpackage;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.os.PowerManager;
import android.util.Log;
import io.sentry.android.core.b1;
import java.io.IOException;
import java.util.Objects;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class q0f implements Runnable {
    public static final Object g = new Object();
    public static Boolean v;
    public static Boolean w;
    public final /* synthetic */ int a;
    public final long b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;

    public q0f(o0f o0fVar, Context context, rw rwVar, long j) {
        this.a = 0;
        this.f = o0fVar;
        this.c = context;
        this.b = j;
        this.d = rwVar;
        this.e = ((PowerManager) context.getSystemService("power")).newWakeLock(1, "wake:com.google.firebase.messaging");
    }

    public static boolean a(Context context) {
        boolean zBooleanValue;
        synchronized (g) {
            try {
                Boolean bool = w;
                Boolean boolValueOf = Boolean.valueOf(bool == null ? b(context, "android.permission.ACCESS_NETWORK_STATE", bool) : bool.booleanValue());
                w = boolValueOf;
                zBooleanValue = boolValueOf.booleanValue();
            } catch (Throwable th) {
                throw th;
            }
        }
        return zBooleanValue;
    }

    public static boolean b(Context context, String str, Boolean bool) {
        if (bool != null) {
            return bool.booleanValue();
        }
        boolean z = context.checkCallingOrSelfPermission(str) == 0;
        if (!z && Log.isLoggable("FirebaseMessaging", 3)) {
            Log.d("FirebaseMessaging", "Missing Permission: " + str + ". This permission should normally be included by the manifest merger, but may needed to be manually added to your manifest");
        }
        return z;
    }

    public static boolean c(Context context) {
        boolean zBooleanValue;
        synchronized (g) {
            try {
                Boolean bool = v;
                Boolean boolValueOf = Boolean.valueOf(bool == null ? b(context, "android.permission.WAKE_LOCK", bool) : bool.booleanValue());
                v = boolValueOf;
                zBooleanValue = boolValueOf.booleanValue();
            } catch (Throwable th) {
                throw th;
            }
        }
        return zBooleanValue;
    }

    public synchronized boolean d() {
        NetworkInfo activeNetworkInfo;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) ((Context) this.c).getSystemService("connectivity");
            activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        } catch (Throwable th) {
            throw th;
        }
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean zC;
        int i = this.a;
        long j = this.b;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.f;
        Object obj4 = this.c;
        switch (i) {
            case 0:
                o0f o0fVar = (o0f) obj3;
                PowerManager.WakeLock wakeLock = (PowerManager.WakeLock) obj;
                Context context = (Context) obj4;
                if (c(context)) {
                    wakeLock.acquire(180000L);
                }
                try {
                    o0fVar.a(true);
                    if (!((rw) obj2).h()) {
                        o0fVar.a(false);
                        if (!zC) {
                            return;
                        }
                    } else if (!a(context) || d()) {
                        if (o0fVar.b()) {
                            o0fVar.a(false);
                        } else {
                            o0fVar.c(j);
                        }
                        if (!zC) {
                            return;
                        }
                    } else {
                        new p0f(this, this).a();
                        if (!zC) {
                            return;
                        }
                    }
                } catch (IOException e) {
                    b1.d("FirebaseMessaging", "Failed to sync topics. Won't retry sync. " + e.getMessage());
                    o0fVar.a(false);
                    if (!zC) {
                        return;
                    }
                } finally {
                    if (c(context)) {
                        try {
                            wakeLock.release();
                        } catch (RuntimeException unused) {
                            Log.i("FirebaseMessaging", "TopicsSyncTask's wakelock was already released due to timeout.");
                        }
                        break;
                    }
                }
                try {
                    return;
                } catch (RuntimeException unused2) {
                    return;
                }
            case 1:
                String str = (String) obj2;
                ich ichVar = ((e5h) obj3).d;
                String str2 = (String) obj4;
                if (str2 == null) {
                    ichVar.Z().A0();
                    String str3 = ichVar.V0;
                    if (str3 == null || str3.equals(str)) {
                        ichVar.V0 = str;
                        ichVar.U0 = null;
                        return;
                    }
                    return;
                }
                t8h t8hVar = new t8h((String) obj, str2, j);
                ichVar.Z().A0();
                String str4 = ichVar.V0;
                if (str4 != null) {
                    str4.equals(str);
                }
                ichVar.V0 = str;
                ichVar.U0 = t8hVar;
                return;
            case 2:
                ((c8h) obj3).L0(this.b, this.e, (String) obj4, (String) obj2);
                return;
            default:
                Bundle bundle = (Bundle) obj4;
                bundle.remove("screen_name");
                bundle.remove("screen_class");
                b9h b9hVar = (b9h) obj3;
                qch qchVar = ((w3h) b9hVar.b).w;
                w3h.f(qchVar);
                b9hVar.G0((t8h) obj2, (t8h) obj, this.b, true, qchVar.K0("screen_view", bundle, null, false));
                return;
        }
    }

    public q0f(b9h b9hVar, Bundle bundle, t8h t8hVar, t8h t8hVar2, long j) {
        this.a = 3;
        this.c = bundle;
        this.d = t8hVar;
        this.e = t8hVar2;
        this.b = j;
        Objects.requireNonNull(b9hVar);
        this.f = b9hVar;
    }

    public /* synthetic */ q0f(Object obj, String str, String str2, Object obj2, long j, int i) {
        this.a = i;
        this.c = str;
        this.d = str2;
        this.e = obj2;
        this.b = j;
        this.f = obj;
    }
}
