package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Looper;
import android.os.Messenger;
import android.util.Log;
import android.util.SparseArray;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class ech implements ServiceConnection {
    public int a = 0;
    public final Messenger b;
    public gsg c;
    public final ArrayDeque d;
    public final SparseArray e;
    public final /* synthetic */ veh f;

    public ech(veh vehVar) {
        this.f = vehVar;
        sig sigVar = new sig(Looper.getMainLooper(), new cbh(0, this));
        Looper.getMainLooper();
        this.b = new Messenger(sigVar);
        this.d = new ArrayDeque();
        this.e = new SparseArray();
    }

    public final synchronized boolean a(odh odhVar) {
        int i = this.a;
        int i2 = 0;
        int i3 = 1;
        if (i != 0) {
            if (i == 1) {
                this.d.add(odhVar);
                return true;
            }
            if (i != 2) {
                return false;
            }
            this.d.add(odhVar);
            ((ScheduledExecutorService) this.f.d).execute(new a5h(this, i3));
            return true;
        }
        this.d.add(odhVar);
        if (this.a != 0) {
            throw new IllegalStateException();
        }
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Starting bind to GmsCore");
        }
        this.a = 1;
        Intent intent = new Intent("com.google.android.c2dm.intent.REGISTER");
        intent.setPackage("com.google.android.gms");
        try {
            jk2 jk2VarB = jk2.b();
            veh vehVar = this.f;
            if (jk2VarB.a((Context) vehVar.c, intent, this, 1)) {
                ((ScheduledExecutorService) vehVar.d).schedule(new a5h(this, i2), 30L, TimeUnit.SECONDS);
            } else {
                b("Unable to bind to service");
            }
        } catch (SecurityException e) {
            c("Unable to bind to service", e);
        }
        return true;
    }

    public final synchronized void b(String str) {
        c(str, null);
    }

    public final synchronized void c(String str, SecurityException securityException) {
        try {
            if (Log.isLoggable("MessengerIpcClient", 3)) {
                Log.d("MessengerIpcClient", "Disconnected: ".concat(String.valueOf(str)));
            }
            int i = this.a;
            if (i == 0) {
                throw new IllegalStateException();
            }
            if (i != 1 && i != 2) {
                if (i != 3) {
                    return;
                }
                this.a = 4;
                return;
            }
            if (Log.isLoggable("MessengerIpcClient", 2)) {
                Log.v("MessengerIpcClient", "Unbinding service");
            }
            this.a = 4;
            jk2.b().c((Context) this.f.c, this);
            seh sehVar = new seh(str, securityException);
            ArrayDeque arrayDeque = this.d;
            Iterator it = arrayDeque.iterator();
            while (it.hasNext()) {
                ((odh) it.next()).c(sehVar);
            }
            arrayDeque.clear();
            int i2 = 0;
            while (true) {
                SparseArray sparseArray = this.e;
                if (i2 >= sparseArray.size()) {
                    sparseArray.clear();
                    return;
                } else {
                    ((odh) sparseArray.valueAt(i2)).c(sehVar);
                    i2++;
                }
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized void d() {
        try {
            if (this.a == 2 && this.d.isEmpty() && this.e.size() == 0) {
                if (Log.isLoggable("MessengerIpcClient", 2)) {
                    Log.v("MessengerIpcClient", "Finished handling requests, unbinding");
                }
                this.a = 3;
                jk2.b().c((Context) this.f.c, this);
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service connected");
        }
        ((ScheduledExecutorService) this.f.d).execute(new w36(23, this, iBinder));
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("MessengerIpcClient", 2)) {
            Log.v("MessengerIpcClient", "Service disconnected");
        }
        ((ScheduledExecutorService) this.f.d).execute(new a5h(this, 2));
    }
}
