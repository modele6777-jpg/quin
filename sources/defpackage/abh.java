package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Build;
import android.os.IBinder;
import android.os.StrictMode;
import com.google.android.gms.common.ConnectionResult;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class abh implements ServiceConnection {
    public final HashMap a = new HashMap();
    public int b = 2;
    public boolean c;
    public IBinder d;
    public final z9h e;
    public ComponentName f;
    public final /* synthetic */ tch g;

    public abh(tch tchVar, z9h z9hVar) {
        this.g = tchVar;
        this.e = z9hVar;
    }

    public final ConnectionResult a(String str, Executor executor) {
        try {
            Intent intentA = xog.a(this.g.b, this.e);
            this.b = 3;
            StrictMode.VmPolicy vmPolicy = StrictMode.getVmPolicy();
            if (Build.VERSION.SDK_INT >= 31) {
                StrictMode.setVmPolicy(ftg.a(new StrictMode.VmPolicy.Builder(vmPolicy)).build());
            }
            try {
                tch tchVar = this.g;
                jk2 jk2Var = tchVar.d;
                Context context = tchVar.b;
                z9h z9hVar = this.e;
                boolean zD = jk2Var.d(context, str, intentA, this, 4225, executor);
                this.c = zD;
                if (zD) {
                    tchVar.c.sendMessageDelayed(tchVar.c.obtainMessage(1, z9hVar), tchVar.f);
                    return ConnectionResult.f;
                }
                this.b = 2;
                try {
                    tchVar.d.c(tchVar.b, this);
                } catch (IllegalArgumentException unused) {
                }
                return new ConnectionResult(16, null, null);
            } finally {
                StrictMode.setVmPolicy(vmPolicy);
            }
        } catch (jng e) {
            return e.zza;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        onServiceDisconnected(componentName);
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        tch tchVar = this.g;
        synchronized (tchVar.a) {
            try {
                tchVar.c.removeMessages(1, this.e);
                this.d = iBinder;
                this.f = componentName;
                Iterator it = this.a.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceConnected(componentName, iBinder);
                }
                this.b = 1;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        tch tchVar = this.g;
        synchronized (tchVar.a) {
            try {
                tchVar.c.removeMessages(1, this.e);
                this.d = null;
                this.f = componentName;
                Iterator it = this.a.values().iterator();
                while (it.hasNext()) {
                    ((ServiceConnection) it.next()).onServiceDisconnected(componentName);
                }
                this.b = 2;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
