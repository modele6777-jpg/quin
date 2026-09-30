package defpackage;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class ysg implements ServiceConnection {
    public final px0 a;
    public final nyd b;
    public final nyd c;
    public final /* synthetic */ ox0 d;

    public ysg(ox0 ox0Var, px0 px0Var) {
        this.d = ox0Var;
        t4c t4cVar = ox0Var.C;
        this.b = new nyd(t4cVar);
        this.c = new nyd(t4cVar);
        this.a = px0Var;
    }

    public final Long a(boolean z) {
        Object obj = this.d.a;
        try {
            if (z) {
                synchronized (obj) {
                    try {
                        nyd nydVar = this.b;
                        if (!nydVar.b) {
                            return null;
                        }
                        long jW = ((t4c) nydVar.e).w();
                        if (!nydVar.b) {
                            throw new IllegalStateException("This stopwatch is already stopped.");
                        }
                        nydVar.b = false;
                        long j = (jW - nydVar.d) + nydVar.c;
                        nydVar.c = j;
                        return Long.valueOf(j / 1000000);
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            synchronized (obj) {
                try {
                    nyd nydVar2 = this.c;
                    if (!nydVar2.b) {
                        return null;
                    }
                    long jW2 = ((t4c) nydVar2.e).w();
                    if (!nydVar2.b) {
                        throw new IllegalStateException("This stopwatch is already stopped.");
                    }
                    nydVar2.b = false;
                    long j2 = (jW2 - nydVar2.d) + nydVar2.c;
                    nydVar2.c = j2;
                    return Long.valueOf(j2 / 1000000);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            zsg.i("BillingClient", "Exception getting connection establishment duration.", th3);
            return null;
        }
        zsg.i("BillingClient", "Exception getting connection establishment duration.", th3);
        return null;
    }

    public final void b(tx0 tx0Var, z5h z5hVar, String str, boolean z, int i) {
        try {
            w5h w5hVarQ = d6h.q();
            int i2 = tx0Var.a;
            w5hVarQ.b();
            d6h.p((d6h) w5hVarQ.b, i2);
            String str2 = tx0Var.c;
            w5hVarQ.b();
            d6h.s((d6h) w5hVarQ.b, str2);
            w5hVarQ.b();
            d6h.v((d6h) w5hVarQ.b, z5hVar);
            w5hVarQ.b();
            d6h.t((d6h) w5hVarQ.b, i);
            if (str != null) {
                w5hVarQ.b();
                d6h.r((d6h) w5hVarQ.b, str);
            }
            Long lA = a(z);
            ox0 ox0Var = this.d;
            if (!z) {
                v7h v7hVarP = z7h.p();
                v7hVarP.b();
                z7h.q((z7h) v7hVarP.b, (d6h) w5hVarQ.a());
                if (lA != null) {
                    long jLongValue = lA.longValue();
                    v7hVarP.b();
                    z7h.r((z7h) v7hVarP.b, jLongValue);
                }
                ox0Var.h.H((z7h) v7hVarP.a());
                return;
            }
            g8h g8hVarP = l8h.p();
            g8hVarP.c(false);
            g8hVarP.d();
            g8hVarP.b();
            l8h.t((l8h) g8hVarP.b, i);
            if (lA != null) {
                long jLongValue2 = lA.longValue();
                g8hVarP.b();
                l8h.s((l8h) g8hVarP.b, jLongValue2);
            }
            l5h l5hVarS = p5h.s();
            l5hVarS.c(w5hVarQ);
            l5hVarS.b();
            p5h.r((p5h) l5hVarS.b, 6);
            l5hVarS.d(g8hVarP);
            ox0Var.u((p5h) l5hVarS.a());
        } catch (Throwable th) {
            zsg.i("BillingClient", "Unable to log.", th);
        }
    }

    public final void c(int i, boolean z) {
        try {
            Long lA = a(z);
            ox0 ox0Var = this.d;
            if (!z) {
                v7h v7hVarP = z7h.p();
                w5h w5hVarQ = d6h.q();
                w5hVarQ.b();
                d6h.p((d6h) w5hVarQ.b, 0);
                w5hVarQ.b();
                d6h.t((d6h) w5hVarQ.b, i);
                v7hVarP.b();
                z7h.q((z7h) v7hVarP.b, (d6h) w5hVarQ.a());
                if (lA != null) {
                    long jLongValue = lA.longValue();
                    v7hVarP.b();
                    z7h.r((z7h) v7hVarP.b, jLongValue);
                }
                ox0Var.h.H((z7h) v7hVarP.a());
                return;
            }
            t5h t5hVarQ = v5h.q();
            t5hVarQ.b();
            v5h.p((v5h) t5hVarQ.b, 6);
            g8h g8hVarP = l8h.p();
            g8hVarP.c(false);
            g8hVarP.d();
            g8hVarP.b();
            l8h.t((l8h) g8hVarP.b, i);
            if (lA != null) {
                long jLongValue2 = lA.longValue();
                g8hVarP.b();
                l8h.s((l8h) g8hVarP.b, jLongValue2);
            }
            t5hVarQ.b();
            v5h.u((v5h) t5hVarQ.b, (l8h) g8hVarP.a());
            ox0Var.v((v5h) t5hVarQ.a());
        } catch (Throwable th) {
            zsg.i("BillingClient", "Unable to log.", th);
        }
    }

    public final void d(tx0 tx0Var) {
        ox0 ox0Var = this.d;
        synchronized (ox0Var.a) {
            try {
                if (ox0Var.b == 3) {
                    return;
                }
                try {
                    this.a.a(tx0Var);
                } catch (Throwable th) {
                    zsg.i("BillingClient", "Exception while calling onBillingSetupFinished.", th);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void e(Exception exc, boolean z, int i) {
        z5h z5hVar;
        zsg.i("BillingClient", "Exception while invoking initialize AIDL method", exc);
        boolean z2 = exc instanceof DeadObjectException;
        if (z2) {
            z5hVar = z5h.INITIALIZE_DEAD_OBJECT_EXCEPTION;
        } else if (exc instanceof RemoteException) {
            z5hVar = z5h.INITIALIZE_REMOTE_EXCEPTION;
        } else {
            z5hVar = exc instanceof SecurityException ? z5h.INITIALIZE_SECURITY_EXCEPTION : z5h.INITIALIZE_SERVICE_CALL_EXCEPTION;
        }
        z5h z5hVar2 = z5hVar;
        String strA = hwg.a(exc);
        this.d.x(0);
        b(z2 ? swg.h : swg.f, z5hVar2, strA, z, i);
        d(z2 ? swg.h : swg.f);
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0026  */
    /* JADX WARN: Code duplicated, block: B:17:0x002c  */
    /* JADX WARN: Code duplicated, block: B:20:0x0036  */
    /* JADX WARN: Code duplicated, block: B:22:0x003a  */
    /* JADX WARN: Code duplicated, block: B:25:0x0045  */
    /* JADX WARN: Code duplicated, block: B:26:0x0048  */
    public final void f(Exception exc, boolean z) {
        z5h z5hVar;
        z5h z5hVar2;
        String strA;
        tx0 tx0Var;
        tx0 tx0Var2;
        zsg.i("BillingClient", "Exception while checking if billing is supported; try to reconnect", exc);
        boolean z2 = exc instanceof DeadObjectException;
        z5h z5hVar3 = z5h.IS_BILLING_SUPPORTED_SERVICE_CALL_EXCEPTION;
        if (z2) {
            z5hVar2 = z5h.IS_BILLING_SUPPORTED_DEAD_OBJECT_EXCEPTION;
        } else {
            if (!(exc instanceof RemoteException)) {
                if (exc instanceof SecurityException) {
                    z5hVar2 = z5h.IS_BILLING_SUPPORTED_SECURITY_EXCEPTION;
                } else {
                    z5hVar = z5hVar3;
                }
                if (z5hVar.equals(z5hVar3)) {
                    strA = hwg.a(exc);
                } else {
                    strA = null;
                }
                String str = strA;
                this.d.x(0);
                if (z2) {
                    tx0Var = swg.h;
                } else {
                    tx0Var = swg.f;
                }
                b(tx0Var, z5hVar, str, z, 0);
                if (z2) {
                    tx0Var2 = swg.h;
                } else {
                    tx0Var2 = swg.f;
                }
                d(tx0Var2);
            }
            z5hVar2 = z5h.IS_BILLING_SUPPORTED_REMOTE_EXCEPTION;
        }
        z5hVar = z5hVar2;
        if (z5hVar.equals(z5hVar3)) {
            strA = hwg.a(exc);
        } else {
            strA = null;
        }
        String str2 = strA;
        this.d.x(0);
        if (z2) {
            tx0Var = swg.h;
        } else {
            tx0Var = swg.f;
        }
        b(tx0Var, z5hVar, str2, z, 0);
        if (z2) {
            tx0Var2 = swg.h;
        } else {
            tx0Var2 = swg.f;
        }
        d(tx0Var2);
    }

    @Override // android.content.ServiceConnection
    public final void onBindingDied(ComponentName componentName) {
        boolean z;
        zsg.h("BillingClient", "Billing service died.");
        try {
            ox0 ox0Var = this.d;
            synchronized (ox0Var.a) {
                z = true;
                if (ox0Var.b != 1) {
                    z = false;
                }
            }
            lqb lqbVar = ox0Var.h;
            if (z) {
                l5h l5hVarS = p5h.s();
                l5hVarS.b();
                p5h.r((p5h) l5hVarS.b, 6);
                w5h w5hVarQ = d6h.q();
                z5h z5hVar = z5h.BINDING_DIED;
                w5hVarQ.b();
                d6h.v((d6h) w5hVarQ.b, z5hVar);
                l5hVarS.c(w5hVarQ);
                g8h g8hVarP = l8h.p();
                g8hVarP.c(false);
                g8hVarP.d();
                l5hVarS.d(g8hVarP);
                lqbVar.A((p5h) l5hVarS.a());
            } else {
                lqbVar.E(g6h.p());
            }
        } catch (Throwable th) {
            zsg.i("BillingClient", "Unable to log.", th);
        }
        ox0 ox0Var2 = this.d;
        synchronized (ox0Var2.a) {
            if (ox0Var2.b != 3 && ox0Var2.b != 0) {
                ox0Var2.x(0);
                ox0Var2.z();
                try {
                    this.a.b();
                } catch (Throwable th2) {
                    zsg.i("BillingClient", "Exception while calling onBillingServiceDisconnected.", th2);
                }
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
        crg xqgVar;
        zsg.g("BillingClient", "Billing service connected.");
        ox0 ox0Var = this.d;
        synchronized (ox0Var.a) {
            try {
                if (ox0Var.b == 3) {
                    return;
                }
                int i = arg.e;
                int i2 = 4;
                if (iBinder == null) {
                    xqgVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.android.vending.billing.IInAppBillingService");
                    xqgVar = iInterfaceQueryLocalInterface instanceof crg ? (crg) iInterfaceQueryLocalInterface : new xqg(iBinder, "com.android.vending.billing.IInAppBillingService", 4);
                }
                ox0Var.i = xqgVar;
                if (ox0.g(new yg6(i2, this), 30000L, new jfg(9, this), Looper.myLooper() == null ? ox0Var.e : new Handler(Looper.myLooper()), ox0Var.f()) == null) {
                    tx0 tx0VarJ = ox0Var.j();
                    ox0Var.w(tx0VarJ, z5h.MISSING_RESULT_FROM_EXECUTE_ASYNC);
                    d(tx0VarJ);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ServiceConnection
    public final void onServiceDisconnected(ComponentName componentName) {
        boolean z;
        zsg.h("BillingClient", "Billing service disconnected.");
        try {
            ox0 ox0Var = this.d;
            synchronized (ox0Var.a) {
                z = true;
                if (ox0Var.b != 1) {
                    z = false;
                }
            }
            lqb lqbVar = ox0Var.h;
            if (z) {
                l5h l5hVarS = p5h.s();
                l5hVarS.b();
                p5h.r((p5h) l5hVarS.b, 6);
                w5h w5hVarQ = d6h.q();
                z5h z5hVar = z5h.SERVICE_DISCONNECTED;
                w5hVarQ.b();
                d6h.v((d6h) w5hVarQ.b, z5hVar);
                l5hVarS.c(w5hVarQ);
                g8h g8hVarP = l8h.p();
                g8hVarP.c(false);
                g8hVarP.d();
                l5hVarS.d(g8hVarP);
                lqbVar.A((p5h) l5hVarS.a());
            } else {
                lqbVar.I(d8h.p());
            }
        } catch (Throwable th) {
            zsg.i("BillingClient", "Unable to log.", th);
        }
        ox0 ox0Var2 = this.d;
        synchronized (ox0Var2.a) {
            try {
                if (p8c.c) {
                    if (ox0Var2.b != 3 && ox0Var2.b != 0) {
                        nyd nydVar = this.c;
                        nydVar.c = 0L;
                        nydVar.b = false;
                        nydVar.g();
                    }
                    return;
                }
                nyd nydVar2 = this.c;
                nydVar2.c = 0L;
                nydVar2.b = false;
                nydVar2.g();
                if (ox0Var2.b == 3) {
                    return;
                }
                ox0Var2.x(0);
                try {
                    this.a.b();
                } catch (Throwable th2) {
                    zsg.i("BillingClient", "Exception while calling onBillingServiceDisconnected.", th2);
                }
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }
}
