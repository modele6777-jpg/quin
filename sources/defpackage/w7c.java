package defpackage;

import android.app.BroadcastOptions;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.os.Messenger;
import android.os.RemoteException;
import android.util.Log;
import io.sentry.android.core.b1;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.regex.Pattern;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class w7c {
    public static int h;
    public static PendingIntent i;
    public static final Pattern j = Pattern.compile("\\|ID\\|([^|]+)\\|:?+(.*)");
    public final Context b;
    public final yl9 c;
    public final ScheduledThreadPoolExecutor d;
    public Messenger f;
    public cwg g;
    public final wid a = new wid(0);
    public final Messenger e = new Messenger(new dgh(this, Looper.getMainLooper()));

    public w7c(Context context) {
        this.b = context;
        this.c = new yl9(context);
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(1, new z99("fcm-rpc-timeout-executor"));
        scheduledThreadPoolExecutor.setKeepAliveTime(60L, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.d = scheduledThreadPoolExecutor;
    }

    public final void a(String str, Bundle bundle) {
        wid widVar = this.a;
        synchronized (widVar) {
            try {
                gle gleVar = (gle) widVar.remove(str);
                if (gleVar != null) {
                    gleVar.a(bundle);
                    return;
                }
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 21);
                sb.append("Missing callback for ");
                sb.append(str);
                b1.l("Rpc", sb.toString());
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:41:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:43:0x00db  */
    /* JADX WARN: Code duplicated, block: B:44:0x00df  */
    /* JADX WARN: Code duplicated, block: B:45:0x00f1  */
    public final gfh b(Bundle bundle) {
        String string;
        int iZ;
        Context context;
        synchronized (w7c.class) {
            int i2 = h;
            h = i2 + 1;
            string = Integer.toString(i2);
        }
        gle gleVar = new gle();
        wid widVar = this.a;
        synchronized (widVar) {
            widVar.put(string, gleVar);
        }
        Intent intent = new Intent();
        intent.setPackage("com.google.android.gms");
        if (this.c.z() == 2) {
            intent.setAction("com.google.iid.TOKEN_REQUEST");
        } else {
            intent.setAction("com.google.android.c2dm.intent.REGISTER");
        }
        intent.putExtras(bundle);
        Context context2 = this.b;
        synchronized (w7c.class) {
            try {
                PendingIntent broadcast = i;
                if (broadcast == null) {
                    Intent intent2 = new Intent();
                    intent2.setPackage("com.google.example.invalidpackage");
                    broadcast = PendingIntent.getBroadcast(context2, 0, intent2, mdh.a);
                    i = broadcast;
                }
                intent.putExtra("app", broadcast);
            } catch (Throwable th) {
                throw th;
            }
        }
        intent.putExtra("kid", ib8.m(new StringBuilder(String.valueOf(string).length() + 5), "|ID|", string, "|"));
        if (Log.isLoggable("Rpc", 3)) {
            Log.d("Rpc", "Sending ".concat(String.valueOf(intent.getExtras())));
        }
        intent.putExtra("google.messenger", this.e);
        if (this.f == null && this.g == null) {
            iZ = this.c.z();
            context = this.b;
            if (iZ == 2) {
                context.startService(intent);
            } else if (Build.VERSION.SDK_INT < 34) {
                context.sendBroadcast(intent);
            } else {
                context.sendBroadcast(intent, null, BroadcastOptions.makeBasic().setShareIdentityEnabled(true).toBundle());
            }
        } else {
            Message messageObtain = Message.obtain();
            messageObtain.obj = intent;
            try {
                Messenger messenger = this.f;
                if (messenger != null) {
                    messenger.send(messageObtain);
                } else {
                    this.g.a.send(messageObtain);
                }
            } catch (RemoteException unused) {
                if (Log.isLoggable("Rpc", 3)) {
                    Log.d("Rpc", "Messenger failed, fallback to startService");
                }
                iZ = this.c.z();
                context = this.b;
                if (iZ == 2) {
                    context.startService(intent);
                } else if (Build.VERSION.SDK_INT < 34) {
                    context.sendBroadcast(intent);
                } else {
                    context.sendBroadcast(intent, null, BroadcastOptions.makeBasic().setShareIdentityEnabled(true).toBundle());
                }
            }
        }
        gleVar.a.c(g94.d, new psd(this, string, this.d.schedule(new jfg(7, gleVar), 30L, TimeUnit.SECONDS), 19));
        return gleVar.a;
    }
}
