package defpackage;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.HandlerThread;
import android.os.Looper;
import com.google.android.gms.common.ConnectionResult;
import java.util.HashMap;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class tch {
    public static final Object g = new Object();
    public static tch h;
    public static HandlerThread i;
    public final HashMap a = new HashMap();
    public final Context b;
    public volatile sig c;
    public final jk2 d;
    public final long e;
    public final long f;

    public tch(Context context, Looper looper) {
        cbh cbhVar = new cbh(1, this);
        this.b = context.getApplicationContext();
        sig sigVar = new sig(looper, cbhVar);
        Looper.getMainLooper();
        this.c = sigVar;
        this.d = jk2.b();
        this.e = 5000L;
        this.f = 300000L;
    }

    public static tch a(Context context) {
        tch tchVar;
        synchronized (g) {
            try {
                tchVar = h;
                if (tchVar == null) {
                    tchVar = new tch(context.getApplicationContext(), context.getMainLooper());
                    h = tchVar;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return tchVar;
    }

    public final ConnectionResult b(z9h z9hVar, fxg fxgVar, String str, Executor executor) {
        ConnectionResult connectionResultA;
        HashMap map = this.a;
        synchronized (map) {
            try {
                abh abhVar = (abh) map.get(z9hVar);
                if (executor == null) {
                    executor = null;
                }
                if (abhVar == null) {
                    abhVar = new abh(this, z9hVar);
                    abhVar.a.put(fxgVar, fxgVar);
                    connectionResultA = abhVar.a(str, executor);
                    map.put(z9hVar, abhVar);
                } else {
                    this.c.removeMessages(0, z9hVar);
                    if (abhVar.a.containsKey(fxgVar)) {
                        String string = z9hVar.toString();
                        StringBuilder sb = new StringBuilder(string.length() + 81);
                        sb.append("Trying to bind a GmsServiceConnection that was already connected before.  config=");
                        sb.append(string);
                        throw new IllegalStateException(sb.toString());
                    }
                    abhVar.a.put(fxgVar, fxgVar);
                    int i2 = abhVar.b;
                    if (i2 == 1) {
                        fxgVar.onServiceConnected(abhVar.f, abhVar.d);
                    } else if (i2 == 2) {
                        connectionResultA = abhVar.a(str, executor);
                    }
                    connectionResultA = null;
                }
                if (abhVar.c) {
                    return ConnectionResult.f;
                }
                if (connectionResultA == null) {
                    connectionResultA = new ConnectionResult(-1, null, null);
                }
                return connectionResultA;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void c(String str, ServiceConnection serviceConnection, boolean z) {
        z9h z9hVar = new z9h(str, z);
        oa7.B(serviceConnection, "ServiceConnection must not be null");
        HashMap map = this.a;
        synchronized (map) {
            try {
                abh abhVar = (abh) map.get(z9hVar);
                if (abhVar == null) {
                    String string = z9hVar.toString();
                    StringBuilder sb = new StringBuilder(string.length() + 50);
                    sb.append("Nonexistent connection status for service config: ");
                    sb.append(string);
                    throw new IllegalStateException(sb.toString());
                }
                if (!abhVar.a.containsKey(serviceConnection)) {
                    String string2 = z9hVar.toString();
                    StringBuilder sb2 = new StringBuilder(string2.length() + 76);
                    sb2.append("Trying to unbind a GmsServiceConnection  that was not bound before.  config=");
                    sb2.append(string2);
                    throw new IllegalStateException(sb2.toString());
                }
                abhVar.a.remove(serviceConnection);
                if (abhVar.a.isEmpty()) {
                    this.c.sendMessageDelayed(this.c.obtainMessage(0, z9hVar), this.e);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
