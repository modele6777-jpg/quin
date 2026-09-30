package defpackage;

import android.content.Context;
import android.os.DeadObjectException;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.SparseIntArray;
import com.adjust.sdk.sig.r3;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import io.sentry.android.core.b1;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class rhg implements cc6, dc6 {
    public final xb6 e;
    public final b70 f;
    public final vea g;
    public final int j;
    public final aig k;
    public boolean l;
    public final /* synthetic */ ec6 p;
    public final LinkedList d = new LinkedList();
    public final HashSet h = new HashSet();
    public final HashMap i = new HashMap();
    public final ArrayList m = new ArrayList();
    public ConnectionResult n = null;
    public int o = 0;

    public rhg(ec6 ec6Var, zb6 zb6Var) {
        this.p = ec6Var;
        Looper looper = ec6Var.X.getLooper();
        ta0 ta0VarA = zb6Var.a();
        hbc hbcVar = new hbc((String) ta0VarA.d, (String) ta0VarA.b, (od0) ta0VarA.c);
        xb6 xb6VarV = ((n16) zb6Var.d.b).v(zb6Var.a, looper, hbcVar, zb6Var.e, this, this);
        vd9 vd9Var = zb6Var.c;
        if (vd9Var == null || !(xb6VarV instanceof yt0)) {
            String str = zb6Var.b;
            if (str != null && (xb6VarV instanceof yt0)) {
                xb6VarV.s = str;
            }
        } else {
            xb6VarV.t = vd9Var;
        }
        this.e = xb6VarV;
        this.f = zb6Var.f;
        this.g = new vea(26);
        this.j = zb6Var.h;
        if (!xb6VarV.r()) {
            this.k = null;
            return;
        }
        Context context = ec6Var.e;
        sig sigVar = ec6Var.X;
        ta0 ta0VarA2 = zb6Var.a();
        this.k = new aig(context, sigVar, new hbc((String) ta0VarA2.d, (String) ta0VarA2.b, (od0) ta0VarA2.c));
    }

    public final void a() {
        xb6 xb6Var = this.e;
        ec6 ec6Var = this.p;
        oa7.w(ec6Var.X);
        this.n = null;
        l(ConnectionResult.f);
        if (this.l) {
            sig sigVar = ec6Var.X;
            b70 b70Var = this.f;
            sigVar.removeMessages(11, b70Var);
            ec6Var.X.removeMessages(9, b70Var);
            this.l = false;
        }
        Iterator it = this.i.values().iterator();
        while (it.hasNext()) {
            zi0 zi0Var = ((zhg) it.next()).a;
            if (m((za5[]) zi0Var.c) != null) {
                it.remove();
            } else {
                try {
                    new gfh();
                    psd psdVar = (psd) ((kv) zi0Var.d).b;
                    psdVar.getClass();
                    d7h d7hVar = (d7h) ((g7h) xb6Var).l();
                    i6h i6hVar = new i6h((w6h) psdVar.b, (gn2) psdVar.d);
                    String str = (String) psdVar.c;
                    Parcel parcelJ = d7hVar.J();
                    parcelJ.writeString(str);
                    lsg.c(parcelJ, i6hVar);
                    d7hVar.K(parcelJ, 28);
                } catch (DeadObjectException unused) {
                    d(3);
                    xb6Var.d("DeadObjectException thrown while calling register listener method.");
                } catch (RemoteException e) {
                    e = e;
                    b1.e("GoogleApiManager", "Failed to register listener on re-connection.", e);
                    it.remove();
                } catch (RuntimeException e2) {
                    e = e2;
                    b1.e("GoogleApiManager", "Failed to register listener on re-connection.", e);
                    it.remove();
                }
            }
        }
        g();
        k();
    }

    public final void b(int i) {
        oa7.w(this.p.X);
        this.n = null;
        this.l = true;
        String str = this.e.a;
        vea veaVar = this.g;
        veaVar.getClass();
        StringBuilder sb = new StringBuilder("The connection to Google Play services was lost");
        if (i == 1) {
            sb.append(" due to service disconnection.");
        } else if (i == 3) {
            sb.append(" due to dead object exception.");
        }
        if (str != null) {
            sb.append(" Last reason for disconnect: ");
            sb.append(str);
        }
        veaVar.E(true, new Status(20, sb.toString(), null, null));
        b70 b70Var = this.f;
        ec6 ec6Var = this.p;
        sig sigVar = ec6Var.X;
        sigVar.sendMessageDelayed(Message.obtain(sigVar, 9, b70Var), 5000L);
        sig sigVar2 = ec6Var.X;
        sigVar2.sendMessageDelayed(Message.obtain(sigVar2, 11, b70Var), 120000L);
        SparseIntArray sparseIntArray = (SparseIntArray) ec6Var.g.a;
        synchronized (sparseIntArray) {
            sparseIntArray.clear();
        }
        Iterator it = this.i.values().iterator();
        while (it.hasNext()) {
            ((zhg) it.next()).getClass();
        }
    }

    public final boolean c(ConnectionResult connectionResult) {
        synchronized (ec6.F0) {
            this.p.getClass();
        }
        return false;
    }

    @Override // defpackage.cc6
    public final void d(int i) {
        ec6 ec6Var = this.p;
        if (Looper.myLooper() == ec6Var.X.getLooper()) {
            b(i);
        } else {
            ec6Var.X.post(new qa1(this, i, 2));
        }
    }

    @Override // defpackage.cc6
    public final void e() {
        ec6 ec6Var = this.p;
        if (Looper.myLooper() == ec6Var.X.getLooper()) {
            a();
        } else {
            ec6Var.X.post(new jfg(2, this));
        }
    }

    @Override // defpackage.dc6
    public final void f(ConnectionResult connectionResult) {
        o(connectionResult, null);
    }

    public final void g() {
        LinkedList linkedList = this.d;
        ArrayList arrayList = new ArrayList(linkedList);
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            mig migVar = (mig) arrayList.get(i);
            if (!this.e.p()) {
                return;
            }
            if (h(migVar)) {
                linkedList.remove(migVar);
            }
        }
    }

    public final boolean h(mig migVar) {
        if (!(migVar instanceof whg)) {
            vea veaVar = this.g;
            xb6 xb6Var = this.e;
            migVar.c(veaVar, xb6Var.r());
            try {
                migVar.d(this);
                return true;
            } catch (DeadObjectException unused) {
                d(1);
                xb6Var.d("DeadObjectException thrown while running ApiCallRunner.");
                return true;
            }
        }
        whg whgVar = (whg) migVar;
        za5 za5VarM = m(whgVar.f(this));
        if (za5VarM == null) {
            vea veaVar2 = this.g;
            xb6 xb6Var2 = this.e;
            migVar.c(veaVar2, xb6Var2.r());
            try {
                migVar.d(this);
                return true;
            } catch (DeadObjectException unused2) {
                d(1);
                xb6Var2.d("DeadObjectException thrown while running ApiCallRunner.");
                return true;
            }
        }
        String name = this.e.getClass().getName();
        String str = za5VarM.a;
        long jC = za5VarM.c();
        int length = name.length();
        StringBuilder sb = new StringBuilder(length + 53 + String.valueOf(str).length() + 2 + String.valueOf(jC).length() + 2);
        ub3.v(sb, name, " could not execute call because it requires feature (", str, ", ");
        sb.append(jC);
        sb.append(").");
        b1.l("GoogleApiManager", sb.toString());
        ec6 ec6Var = this.p;
        if (!ec6Var.Y || !whgVar.g(this)) {
            whgVar.b(new hgf(za5VarM));
            return true;
        }
        int iH = whgVar.h(this);
        shg shgVar = new shg(this.f, za5VarM);
        ArrayList arrayList = this.m;
        int iIndexOf = arrayList.indexOf(shgVar);
        if (iIndexOf >= 0) {
            shg shgVar2 = (shg) arrayList.get(iIndexOf);
            ec6Var.X.removeMessages(15, shgVar2);
            ec6Var.X.sendMessageDelayed(Message.obtain(ec6Var.X, 15, shgVar2), 5000L);
            return false;
        }
        arrayList.add(shgVar);
        ec6Var.X.sendMessageDelayed(Message.obtain(ec6Var.X, 15, shgVar), 5000L);
        ec6Var.X.sendMessageDelayed(Message.obtain(ec6Var.X, 16, shgVar), 120000L);
        ConnectionResult connectionResult = new ConnectionResult(1, 2, null, null, Integer.valueOf(iH));
        if (c(connectionResult)) {
            String str2 = za5VarM.a;
            long jC2 = za5VarM.c();
            StringBuilder sb2 = new StringBuilder(String.valueOf(str2).length() + 61 + String.valueOf(jC2).length());
            sb2.append("A dialog should be displayed for missing feature: ");
            sb2.append(str2);
            sb2.append(", version: ");
            sb2.append(jC2);
            b1.l("GoogleApiManager", sb2.toString());
            return false;
        }
        if (!ec6Var.g(connectionResult, this.j)) {
            return false;
        }
        String str3 = za5VarM.a;
        long jC3 = za5VarM.c();
        StringBuilder sb3 = new StringBuilder(String.valueOf(str3).length() + 55 + String.valueOf(jC3).length());
        sb3.append("Notification displayed for missing feature: ");
        sb3.append(str3);
        sb3.append(", version: ");
        sb3.append(jC3);
        b1.l("GoogleApiManager", sb3.toString());
        return false;
    }

    public final void i(Status status, Exception exc, boolean z) {
        oa7.w(this.p.X);
        if ((status == null) == (exc == null)) {
            qc0.j("Status XOR exception should be null");
            return;
        }
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            mig migVar = (mig) it.next();
            if (!z || migVar.a == 2) {
                if (status != null) {
                    migVar.a(status);
                } else {
                    migVar.b(exc);
                }
                it.remove();
            }
        }
    }

    public final void j(Status status) {
        oa7.w(this.p.X);
        i(status, null, false);
    }

    public final void k() {
        ec6 ec6Var = this.p;
        sig sigVar = ec6Var.X;
        b70 b70Var = this.f;
        sigVar.removeMessages(12, b70Var);
        sig sigVar2 = ec6Var.X;
        sigVar2.sendMessageDelayed(sigVar2.obtainMessage(12, b70Var), ec6Var.a);
    }

    public final void l(ConnectionResult connectionResult) {
        HashSet hashSet = this.h;
        Iterator it = hashSet.iterator();
        if (!it.hasNext()) {
            hashSet.clear();
            return;
        }
        if (it.next() != null) {
            r3.f();
            return;
        }
        if (ym8.w(connectionResult, ConnectionResult.f)) {
            xb6 xb6Var = this.e;
            if (!xb6Var.p() || xb6Var.b == null) {
                ho7.n("Failed to connect when checking package");
                return;
            }
        }
        throw null;
    }

    public final za5 m(za5[] za5VarArr) {
        if (za5VarArr != null && za5VarArr.length != 0) {
            y4h y4hVar = this.e.w;
            za5[] za5VarArr2 = y4hVar == null ? null : y4hVar.b;
            if (za5VarArr2 == null) {
                za5VarArr2 = new za5[0];
            }
            kd0 kd0Var = new kd0(za5VarArr2.length);
            for (za5 za5Var : za5VarArr2) {
                kd0Var.put(za5Var.a, Long.valueOf(za5Var.c()));
            }
            for (za5 za5Var2 : za5VarArr) {
                Long l = (Long) kd0Var.get(za5Var2.a);
                if (l == null || l.longValue() < za5Var2.c()) {
                    return za5Var2;
                }
            }
        }
        return null;
    }

    public final void n(ConnectionResult connectionResult) {
        oa7.w(this.p.X);
        xb6 xb6Var = this.e;
        String name = xb6Var.getClass().getName();
        String strValueOf = String.valueOf(connectionResult);
        xb6 xb6Var2 = xb6Var;
        xb6Var2.d(ks0.m(new StringBuilder(name.length() + 25 + strValueOf.length()), "onSignInFailed for ", name, " with ", strValueOf));
        o(connectionResult, null);
    }

    public final void o(ConnectionResult connectionResult, RuntimeException runtimeException) {
        jgd jgdVar;
        ec6 ec6Var = this.p;
        oa7.w(ec6Var.X);
        aig aigVar = this.k;
        if (aigVar != null && (jgdVar = aigVar.j) != null) {
            jgdVar.c();
        }
        oa7.w(this.p.X);
        this.n = null;
        SparseIntArray sparseIntArray = (SparseIntArray) ec6Var.g.a;
        synchronized (sparseIntArray) {
            sparseIntArray.clear();
        }
        l(connectionResult);
        if ((this.e instanceof uig) && connectionResult.b != 24) {
            ec6Var.b = true;
            sig sigVar = ec6Var.X;
            sigVar.sendMessageDelayed(sigVar.obtainMessage(19), 300000L);
        }
        int i = connectionResult.b;
        if (i == 4) {
            j(ec6.E0);
            return;
        }
        if (i == 25) {
            j(ec6.d(this.f, connectionResult));
            return;
        }
        LinkedList linkedList = this.d;
        if (linkedList.isEmpty()) {
            this.n = connectionResult;
            return;
        }
        if (runtimeException != null) {
            oa7.w(ec6Var.X);
            i(null, runtimeException, false);
            return;
        }
        boolean z = ec6Var.Y;
        b70 b70Var = this.f;
        if (!z) {
            j(ec6.d(b70Var, connectionResult));
            return;
        }
        i(ec6.d(b70Var, connectionResult), null, true);
        if (linkedList.isEmpty() || c(connectionResult) || ec6Var.g(connectionResult, this.j)) {
            return;
        }
        if (connectionResult.b == 18) {
            this.l = true;
        }
        if (!this.l) {
            j(ec6.d(b70Var, connectionResult));
        } else {
            sig sigVar2 = ec6Var.X;
            sigVar2.sendMessageDelayed(Message.obtain(sigVar2, 9, b70Var), 5000L);
        }
    }

    public final void p(mig migVar) {
        oa7.w(this.p.X);
        boolean zP = this.e.p();
        LinkedList linkedList = this.d;
        if (zP) {
            if (h(migVar)) {
                k();
                return;
            } else {
                linkedList.add(migVar);
                return;
            }
        }
        linkedList.add(migVar);
        ConnectionResult connectionResult = this.n;
        if (connectionResult == null || connectionResult.b == 0 || connectionResult.c == null) {
            r();
        } else {
            o(connectionResult, null);
        }
    }

    public final void q() {
        ec6 ec6Var = this.p;
        oa7.w(ec6Var.X);
        Status status = ec6.Z;
        j(status);
        this.g.E(false, status);
        for (a98 a98Var : (a98[]) this.i.keySet().toArray(new a98[0])) {
            p(new hig(a98Var, new gle()));
        }
        l(new ConnectionResult(4, null, null));
        if (this.e.p()) {
            ec6Var.X.post(new jfg(3, new g5b(16, this)));
        }
    }

    public final void r() {
        ec6 ec6Var = this.p;
        oa7.w(ec6Var.X);
        xb6 xb6Var = this.e;
        if (xb6Var.p()) {
            return;
        }
        xb6 xb6Var2 = xb6Var;
        if (xb6Var2.q()) {
            return;
        }
        try {
            int iG = ec6Var.g.g(ec6Var.e, xb6Var);
            if (iG != 0) {
                ConnectionResult connectionResult = new ConnectionResult(iG, null, null);
                String name = xb6Var.getClass().getName();
                String string = connectionResult.toString();
                StringBuilder sb = new StringBuilder(name.length() + 35 + string.length());
                sb.append("The service for ");
                sb.append(name);
                sb.append(" is not available: ");
                sb.append(string);
                b1.l("GoogleApiManager", sb.toString());
                o(connectionResult, null);
                return;
            }
            hzc hzcVar = new hzc(ec6Var, xb6Var, this.f);
            if (xb6Var.r()) {
                aig aigVar = this.k;
                oa7.A(aigVar);
                jgd jgdVar = aigVar.j;
                if (jgdVar != null) {
                    jgdVar.c();
                }
                hbc hbcVar = aigVar.i;
                hbcVar.f = Integer.valueOf(System.identityHashCode(aigVar));
                y87 y87Var = aigVar.g;
                Context context = aigVar.e;
                Handler handler = aigVar.f;
                aigVar.j = (jgd) y87Var.v(context, handler.getLooper(), hbcVar, (lgd) hbcVar.e, aigVar, aigVar);
                aigVar.k = hzcVar;
                Set set = aigVar.h;
                if (set == null || set.isEmpty()) {
                    handler.post(new jfg(aigVar));
                } else {
                    jgd jgdVar2 = aigVar.j;
                    jgdVar2.getClass();
                    jgdVar2.j = new kb6(jgdVar2);
                    jgdVar2.u(2, null);
                }
            }
            try {
                xb6Var2.j = hzcVar;
                xb6Var2.u(2, null);
            } catch (SecurityException e) {
                o(new ConnectionResult(10, null, null), e);
            }
        } catch (IllegalStateException e2) {
            o(new ConnectionResult(10, null, null), e2);
        }
    }
}
