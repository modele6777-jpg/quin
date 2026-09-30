package defpackage;

import android.app.PendingIntent;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.google.android.gms.common.ConnectionResult;
import io.sentry.android.core.b1;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class srg extends sig {
    public final /* synthetic */ yt0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public srg(yt0 yt0Var, Looper looper) {
        super(looper, 3);
        this.a = yt0Var;
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        Boolean bool;
        wjg wjgVar;
        yt0 yt0Var = this.a;
        int i = yt0Var.x.get();
        int i2 = message.arg1;
        int i3 = message.what;
        if (i != i2) {
            if ((i3 == 2 || i3 == 1 || i3 == 7) && (wjgVar = (wjg) message.obj) != null) {
                synchronized (wjgVar) {
                    wjgVar.a = null;
                }
                yt0 yt0Var2 = wjgVar.c;
                synchronized (yt0Var2.l) {
                    yt0Var2.l.remove(wjgVar);
                }
                return;
            }
            return;
        }
        if ((i3 == 1 || i3 == 7 || i3 == 4 || i3 == 5) && !yt0Var.q()) {
            wjg wjgVar2 = (wjg) message.obj;
            if (wjgVar2 != null) {
                synchronized (wjgVar2) {
                    wjgVar2.a = null;
                }
                yt0 yt0Var3 = wjgVar2.c;
                synchronized (yt0Var3.l) {
                    yt0Var3.l.remove(wjgVar2);
                }
                return;
            }
            return;
        }
        int i4 = message.what;
        if (i4 == 4) {
            yt0Var.u = new ConnectionResult(message.arg2, null, null);
            if (!yt0Var.v && !TextUtils.isEmpty(yt0Var.m()) && !TextUtils.isEmpty(null)) {
                try {
                    Class.forName(yt0Var.m());
                    if (!yt0Var.v) {
                        yt0Var.u(3, null);
                        return;
                    }
                } catch (ClassNotFoundException unused) {
                }
            }
            ConnectionResult connectionResult = yt0Var.u;
            if (connectionResult == null) {
                connectionResult = new ConnectionResult(8, null, null);
            }
            yt0Var.j.a(connectionResult);
            System.currentTimeMillis();
            return;
        }
        if (i4 == 5) {
            ConnectionResult connectionResult2 = yt0Var.u;
            if (connectionResult2 == null) {
                connectionResult2 = new ConnectionResult(8, null, null);
            }
            yt0Var.j.a(connectionResult2);
            System.currentTimeMillis();
            return;
        }
        if (i4 == 3) {
            Object obj = message.obj;
            yt0Var.j.a(new ConnectionResult(message.arg2, obj instanceof PendingIntent ? (PendingIntent) obj : null, null));
            System.currentTimeMillis();
            return;
        }
        if (i4 == 6) {
            yt0Var.u(5, null);
            vt0 vt0Var = yt0Var.o;
            if (vt0Var != null) {
                vt0Var.d(message.arg2);
            }
            System.currentTimeMillis();
            yt0Var.t(5, 1, null);
            return;
        }
        if (i4 == 2 && !yt0Var.p()) {
            wjg wjgVar3 = (wjg) message.obj;
            if (wjgVar3 != null) {
                synchronized (wjgVar3) {
                    wjgVar3.a = null;
                }
                yt0 yt0Var4 = wjgVar3.c;
                synchronized (yt0Var4.l) {
                    yt0Var4.l.remove(wjgVar3);
                }
                return;
            }
            return;
        }
        int i5 = message.what;
        if (i5 != 2 && i5 != 1 && i5 != 7) {
            b1.o("GmsClient", ub3.h(i5, "Don't know how to handle message: ", new StringBuilder(String.valueOf(i5).length() + 34)), new Exception());
            return;
        }
        wjg wjgVar4 = (wjg) message.obj;
        synchronized (wjgVar4) {
            try {
                bool = wjgVar4.a;
                if (wjgVar4.b) {
                    String string = wjgVar4.toString();
                    StringBuilder sb = new StringBuilder(string.length() + 47);
                    sb.append("Callback proxy ");
                    sb.append(string);
                    sb.append(" being reused. This is not safe.");
                    b1.l("GmsClient", sb.toString());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        if (bool != null) {
            yt0 yt0Var5 = wjgVar4.f;
            int i6 = wjgVar4.d;
            if (i6 != 0) {
                yt0Var5.u(1, null);
                Bundle bundle = wjgVar4.e;
                wjgVar4.b(new ConnectionResult(i6, bundle != null ? (PendingIntent) bundle.getParcelable("pendingIntent") : null, null));
            } else if (!wjgVar4.a()) {
                yt0Var5.u(1, null);
                wjgVar4.b(new ConnectionResult(8, null, null));
            }
        }
        synchronized (wjgVar4) {
            wjgVar4.b = true;
        }
        synchronized (wjgVar4) {
            wjgVar4.a = null;
        }
        yt0 yt0Var6 = wjgVar4.c;
        synchronized (yt0Var6.l) {
            yt0Var6.l.remove(wjgVar4);
        }
    }
}
