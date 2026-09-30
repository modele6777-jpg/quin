package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.HandlerThread;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Message;
import android.os.RemoteException;
import android.provider.Settings;
import android.util.Log;
import io.sentry.android.core.b1;
import java.util.ArrayDeque;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class mh9 implements Handler.Callback, ServiceConnection {
    public final Context a;
    public final Handler b;
    public final HashMap c = new HashMap();
    public HashSet d = new HashSet();

    public mh9(Context context) {
        this.a = context;
        HandlerThread handlerThread = new HandlerThread("NotificationManagerCompat");
        handlerThread.start();
        this.b = new Handler(handlerThread.getLooper(), this);
    }

    public final void a(lh9 lh9Var) {
        boolean z;
        ArrayDeque arrayDeque = lh9Var.d;
        ComponentName componentName = lh9Var.a;
        if (Log.isLoggable("NotifManCompat", 3)) {
            Log.d("NotifManCompat", "Processing component " + componentName + ", " + arrayDeque.size() + " queued tasks");
        }
        if (arrayDeque.isEmpty()) {
            return;
        }
        if (lh9Var.b) {
            z = true;
        } else {
            Intent component = new Intent("android.support.BIND_NOTIFICATION_SIDE_CHANNEL").setComponent(componentName);
            Context context = this.a;
            boolean zBindService = context.bindService(component, this, 33);
            lh9Var.b = zBindService;
            if (zBindService) {
                lh9Var.e = 0;
            } else {
                b1.l("NotifManCompat", "Unable to bind to listener " + componentName);
                context.unbindService(this);
            }
            z = lh9Var.b;
        }
        if (!z || lh9Var.c == null) {
            b(lh9Var);
            return;
        }
        while (true) {
            jh9 jh9Var = (jh9) arrayDeque.peek();
            if (jh9Var == null) {
                break;
            }
            try {
                if (Log.isLoggable("NotifManCompat", 3)) {
                    Log.d("NotifManCompat", "Sending task " + jh9Var);
                }
                jh9Var.a(lh9Var.c);
                arrayDeque.remove();
            } catch (DeadObjectException unused) {
                if (Log.isLoggable("NotifManCompat", 3)) {
                    Log.d("NotifManCompat", "Remote service has died: " + componentName);
                }
            } catch (RemoteException e) {
                b1.n("NotifManCompat", "RemoteException communicating with " + componentName, e);
            }
        }
        if (arrayDeque.isEmpty()) {
            return;
        }
        b(lh9Var);
    }

    public final void b(lh9 lh9Var) {
        ComponentName componentName = lh9Var.a;
        ArrayDeque arrayDeque = lh9Var.d;
        Handler handler = this.b;
        if (handler.hasMessages(3, componentName)) {
            return;
        }
        int i = lh9Var.e;
        int i2 = i + 1;
        lh9Var.e = i2;
        if (i2 <= 6) {
            int i3 = (1 << i) * 1000;
            if (Log.isLoggable("NotifManCompat", 3)) {
                Log.d("NotifManCompat", "Scheduling retry for " + i3 + " ms");
            }
            handler.sendMessageDelayed(handler.obtainMessage(3, componentName), i3);
            return;
        }
        b1.l("NotifManCompat", "Giving up on delivering " + arrayDeque.size() + " tasks to " + componentName + " after " + lh9Var.e + " retries");
        arrayDeque.clear();
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        HashSet hashSet;
        int i = message.what;
        ut6 ut6Var = null;
        if (i == 0) {
            jh9 jh9Var = (jh9) message.obj;
            String string = Settings.Secure.getString(this.a.getContentResolver(), "enabled_notification_listeners");
            synchronized (nh9.c) {
                if (string != null) {
                    try {
                        if (!string.equals(nh9.d)) {
                            String[] strArrSplit = string.split(":", -1);
                            HashSet hashSet2 = new HashSet(strArrSplit.length);
                            for (String str : strArrSplit) {
                                ComponentName componentNameUnflattenFromString = ComponentName.unflattenFromString(str);
                                if (componentNameUnflattenFromString != null) {
                                    hashSet2.add(componentNameUnflattenFromString.getPackageName());
                                }
                            }
                            nh9.e = hashSet2;
                            nh9.d = string;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                hashSet = nh9.e;
            }
            if (!hashSet.equals(this.d)) {
                this.d = hashSet;
                List<ResolveInfo> listQueryIntentServices = this.a.getPackageManager().queryIntentServices(new Intent().setAction("android.support.BIND_NOTIFICATION_SIDE_CHANNEL"), 0);
                HashSet<ComponentName> hashSet3 = new HashSet();
                for (ResolveInfo resolveInfo : listQueryIntentServices) {
                    if (hashSet.contains(resolveInfo.serviceInfo.packageName)) {
                        ServiceInfo serviceInfo = resolveInfo.serviceInfo;
                        ComponentName componentName = new ComponentName(serviceInfo.packageName, serviceInfo.name);
                        if (resolveInfo.serviceInfo.permission != null) {
                            b1.l("NotifManCompat", "Permission present on component " + componentName + ", not adding listener record.");
                        } else {
                            hashSet3.add(componentName);
                        }
                    }
                }
                for (ComponentName componentName2 : hashSet3) {
                    if (!this.c.containsKey(componentName2)) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Log.d("NotifManCompat", "Adding listener record for " + componentName2);
                        }
                        this.c.put(componentName2, new lh9(componentName2));
                    }
                }
                Iterator it = this.c.entrySet().iterator();
                while (it.hasNext()) {
                    Map.Entry entry = (Map.Entry) it.next();
                    if (!hashSet3.contains(entry.getKey())) {
                        if (Log.isLoggable("NotifManCompat", 3)) {
                            Log.d("NotifManCompat", "Removing listener record for " + entry.getKey());
                        }
                        lh9 lh9Var = (lh9) entry.getValue();
                        if (lh9Var.b) {
                            this.a.unbindService(this);
                            lh9Var.b = false;
                        }
                        lh9Var.c = null;
                        it.remove();
                    }
                }
            }
            for (lh9 lh9Var2 : this.c.values()) {
                lh9Var2.d.add(jh9Var);
                a(lh9Var2);
            }
        } else if (i == 1) {
            kh9 kh9Var = (kh9) message.obj;
            ComponentName componentName3 = kh9Var.a;
            IBinder iBinder = kh9Var.b;
            lh9 lh9Var3 = (lh9) this.c.get(componentName3);
            if (lh9Var3 != null) {
                int i2 = tt6.d;
                if (iBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface(ut6.c);
                    if (iInterfaceQueryLocalInterface == null || !(iInterfaceQueryLocalInterface instanceof ut6)) {
                        st6 st6Var = new st6();
                        st6Var.d = iBinder;
                        ut6Var = st6Var;
                    } else {
                        ut6Var = (ut6) iInterfaceQueryLocalInterface;
                    }
                }
                lh9Var3.c = ut6Var;
                lh9Var3.e = 0;
                a(lh9Var3);
                return true;
            }
        } else if (i == 2) {
            lh9 lh9Var4 = (lh9) this.c.get((ComponentName) message.obj);
            if (lh9Var4 != null) {
                if (lh9Var4.b) {
                    this.a.unbindService(this);
                    lh9Var4.b = false;
                }
                lh9Var4.c = null;
                return true;
            }
        } else {
            if (i != 3) {
                return false;
            }
            lh9 lh9Var5 = (lh9) this.c.get((ComponentName) message.obj);
            if (lh9Var5 != null) {
                a(lh9Var5);
                return true;
            }
        }
        return true;
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        if (Log.isLoggable("NotifManCompat", 3)) {
            Log.d("NotifManCompat", "Connected to service " + componentName);
        }
        this.b.obtainMessage(1, new kh9(componentName, iBinder)).sendToTarget();
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        if (Log.isLoggable("NotifManCompat", 3)) {
            Log.d("NotifManCompat", "Disconnected from service " + componentName);
        }
        this.b.obtainMessage(2, componentName).sendToTarget();
    }
}
