package defpackage;

import android.accounts.Account;
import android.content.AttributionSource;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.DeadObjectException;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Scope;
import io.sentry.android.core.b1;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class yt0 {
    public static final za5[] y = new za5[0];
    public c6c b;
    public final Context c;
    public final tch d;
    public final bc6 e;
    public final srg f;
    public yjg i;
    public xt0 j;
    public IInterface k;
    public fxg m;
    public final vt0 o;
    public final wt0 p;
    public final int q;
    public final String r;
    public volatile String s;
    public volatile vd9 t;
    public volatile String a = null;
    public final Object g = new Object();
    public final Object h = new Object();
    public final ArrayList l = new ArrayList();
    public int n = 1;
    public ConnectionResult u = null;
    public boolean v = false;
    public volatile y4h w = null;
    public final AtomicInteger x = new AtomicInteger(0);

    public yt0(Context context, Looper looper, tch tchVar, bc6 bc6Var, int i, vt0 vt0Var, wt0 wt0Var, String str) {
        oa7.B(context, "Context must not be null");
        this.c = context;
        oa7.B(looper, "Looper must not be null");
        oa7.B(tchVar, "Supervisor must not be null");
        this.d = tchVar;
        oa7.B(bc6Var, "API availability must not be null");
        this.e = bc6Var;
        this.f = new srg(this, looper);
        this.q = i;
        this.o = vt0Var;
        this.p = wt0Var;
        this.r = str;
    }

    public final void a() {
        int iB = this.e.b(this.c, i());
        if (iB == 0) {
            this.j = new kb6(this);
            u(2, null);
            return;
        }
        u(1, null);
        this.j = new kb6(this);
        int i = this.x.get();
        srg srgVar = this.f;
        srgVar.sendMessage(srgVar.obtainMessage(3, i, iB, null));
    }

    public abstract IInterface b(IBinder iBinder);

    public final void c() {
        this.x.incrementAndGet();
        ArrayList arrayList = this.l;
        synchronized (arrayList) {
            try {
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    wjg wjgVar = (wjg) arrayList.get(i);
                    synchronized (wjgVar) {
                        wjgVar.a = null;
                    }
                }
                arrayList.clear();
            } catch (Throwable th) {
                throw th;
            }
        }
        synchronized (this.h) {
            this.i = null;
        }
        u(1, null);
    }

    public final void d(String str) {
        this.a = str;
        c();
    }

    public Account e() {
        return null;
    }

    public za5[] f() {
        return y;
    }

    public Executor g() {
        return null;
    }

    public Bundle h() {
        return new Bundle();
    }

    public abstract int i();

    /* JADX WARN: Multi-variable type inference failed */
    public final void j(gt6 gt6Var, Set set) {
        AttributionSource attributionSource;
        Bundle bundleH = h();
        String attributionTag = (Build.VERSION.SDK_INT < 31 || this.t == null || (attributionSource = (AttributionSource) this.t.b) == null || attributionSource.getAttributionTag() == null) ? this.s : attributionSource.getAttributionTag();
        String str = attributionTag;
        int i = this.q;
        int i2 = bc6.a;
        Scope[] scopeArr = n76.Z;
        Bundle bundle = new Bundle();
        za5[] za5VarArr = n76.E0;
        n76 n76Var = new n76(6, i, i2, null, null, scopeArr, bundle, null, za5VarArr, za5VarArr, true, 0, false, str);
        n76Var.d = this.c.getPackageName();
        n76Var.g = bundleH;
        if (set != null) {
            n76Var.f = (Scope[]) set.toArray(new Scope[0]);
        }
        if (r()) {
            Account accountE = e();
            if (accountE == null) {
                accountE = new Account("<<default account>>", "com.google");
            }
            n76Var.v = accountE;
            if (gt6Var != 0) {
                n76Var.e = ((meg) gt6Var).e;
            }
        }
        n76Var.w = y;
        n76Var.x = f();
        if (s()) {
            n76Var.X = true;
        }
        try {
            synchronized (this.h) {
                try {
                    yjg yjgVar = this.i;
                    if (yjgVar != null) {
                        yjgVar.d(new wvg(this, this.x.get()), n76Var);
                    } else {
                        b1.l("GmsClient", "mServiceBroker is null, client disconnected");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        } catch (DeadObjectException e) {
            b1.n("GmsClient", "IGmsServiceBroker.getService failed", e);
            int i3 = this.x.get();
            srg srgVar = this.f;
            srgVar.sendMessage(srgVar.obtainMessage(6, i3, 3));
        } catch (RemoteException e2) {
            e = e2;
            b1.n("GmsClient", "IGmsServiceBroker.getService failed", e);
            int i4 = this.x.get();
            yxg yxgVar = new yxg(this, 8, null, null);
            srg srgVar2 = this.f;
            srgVar2.sendMessage(srgVar2.obtainMessage(1, i4, -1, yxgVar));
        } catch (SecurityException e3) {
            throw e3;
        } catch (RuntimeException e4) {
            e = e4;
            b1.n("GmsClient", "IGmsServiceBroker.getService failed", e);
            int i5 = this.x.get();
            yxg yxgVar2 = new yxg(this, 8, null, null);
            srg srgVar3 = this.f;
            srgVar3.sendMessage(srgVar3.obtainMessage(1, i5, -1, yxgVar2));
        }
    }

    public Set k() {
        return Collections.EMPTY_SET;
    }

    public final IInterface l() {
        IInterface iInterface;
        synchronized (this.g) {
            try {
                if (this.n == 5) {
                    throw new DeadObjectException();
                }
                if (!p()) {
                    throw new IllegalStateException("Not connected. Call connect() and wait for onConnected() to be called.");
                }
                iInterface = this.k;
                oa7.B(iInterface, "Client is connected but service is null");
            } catch (Throwable th) {
                throw th;
            }
        }
        return iInterface;
    }

    public abstract String m();

    public abstract String n();

    public boolean o() {
        return i() >= 211700000;
    }

    public final boolean p() {
        boolean z;
        synchronized (this.g) {
            z = this.n == 4;
        }
        return z;
    }

    public final boolean q() {
        boolean z;
        synchronized (this.g) {
            int i = this.n;
            z = true;
            if (i != 2 && i != 3) {
                z = false;
            }
        }
        return z;
    }

    public boolean r() {
        return false;
    }

    public boolean s() {
        return this instanceof zyb;
    }

    public final /* synthetic */ boolean t(int i, int i2, IInterface iInterface) {
        synchronized (this.g) {
            try {
                if (this.n != i) {
                    return false;
                }
                u(i2, iInterface);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void u(int i, IInterface iInterface) {
        c6c c6cVar;
        oa7.v((i == 4) == (iInterface != null));
        synchronized (this.g) {
            try {
                this.n = i;
                this.k = iInterface;
                Bundle bundle = null;
                if (i == 1) {
                    fxg fxgVar = this.m;
                    if (fxgVar != null) {
                        tch tchVar = this.d;
                        String str = this.b.b;
                        oa7.A(str);
                        this.b.getClass();
                        if (this.r == null) {
                            this.c.getClass();
                        }
                        tchVar.c(str, fxgVar, this.b.a);
                        this.m = null;
                    }
                } else if (i == 2 || i == 3) {
                    fxg fxgVar2 = this.m;
                    if (fxgVar2 != null && (c6cVar = this.b) != null) {
                        String str2 = c6cVar.b;
                        StringBuilder sb = new StringBuilder(String.valueOf(str2).length() + 70 + "com.google.android.gms".length());
                        sb.append("Calling connect() while still connected, missing disconnect() for ");
                        sb.append(str2);
                        sb.append(" on com.google.android.gms");
                        b1.d("GmsClient", sb.toString());
                        tch tchVar2 = this.d;
                        String str3 = this.b.b;
                        oa7.A(str3);
                        this.b.getClass();
                        if (this.r == null) {
                            this.c.getClass();
                        }
                        tchVar2.c(str3, fxgVar2, this.b.a);
                        this.x.incrementAndGet();
                    }
                    fxg fxgVar3 = new fxg(this, this.x.get());
                    this.m = fxgVar3;
                    String strN = n();
                    boolean zO = o();
                    this.b = new c6c(strN, zO);
                    if (zO && i() < 17895000) {
                        throw new IllegalStateException("Internal Error, the minimum apk version of this BaseGmsClient is too low to support dynamic lookup. Start service action: ".concat(String.valueOf(this.b.b)));
                    }
                    tch tchVar3 = this.d;
                    String str4 = this.b.b;
                    oa7.A(str4);
                    this.b.getClass();
                    String name = this.r;
                    if (name == null) {
                        name = this.c.getClass().getName();
                    }
                    ConnectionResult connectionResultB = tchVar3.b(new z9h(str4, this.b.a), fxgVar3, name, g());
                    if (!(connectionResultB.b == 0)) {
                        String str5 = this.b.b;
                        StringBuilder sb2 = new StringBuilder(String.valueOf(str5).length() + 34 + "com.google.android.gms".length());
                        sb2.append("unable to connect to service: ");
                        sb2.append(str5);
                        sb2.append(" on com.google.android.gms");
                        b1.l("GmsClient", sb2.toString());
                        int i2 = connectionResultB.b;
                        if (i2 == -1) {
                            i2 = 16;
                        }
                        if (connectionResultB.c != null) {
                            bundle = new Bundle();
                            bundle.putParcelable("pendingIntent", connectionResultB.c);
                        }
                        int i3 = this.x.get();
                        dzg dzgVar = new dzg(this, i2, bundle);
                        srg srgVar = this.f;
                        srgVar.sendMessage(srgVar.obtainMessage(7, i3, -1, dzgVar));
                    }
                } else if (i == 4) {
                    oa7.A(iInterface);
                    System.currentTimeMillis();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
