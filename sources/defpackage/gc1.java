package defpackage;

import android.os.SystemClock;
import android.util.Log;
import io.sentry.android.core.b1;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class gc1 {
    public Map A;
    public lyd B;
    public lyd C;
    public lyd D;
    public final aw2 a;
    public final qwe b;
    public final i4e c;
    public final uf1 d;
    public final ud6 e;
    public final jae f;
    public final rc1 g;
    public final fo1 h;
    public final a82 i;
    public final z1b j;
    public final bk1 k;
    public final sd1 l;
    public final uce m;
    public final bg1 n;
    public final nb1 o;
    public final d3e p;
    public final Object q;
    public boolean r;
    public xo1 s;
    public vj1 t;
    public nf1 u;
    public sye v;
    public lyd w;
    public final za2 x;
    public eyf y;
    public qo1 z;

    public gc1(aw2 aw2Var, qwe qweVar, i4e i4eVar, uf1 uf1Var, ud6 ud6Var, jae jaeVar, rc1 rc1Var, fo1 fo1Var, a82 a82Var, z1b z1bVar, bk1 bk1Var, sd1 sd1Var, uce uceVar, bg1 bg1Var, nb1 nb1Var, d3e d3eVar, mh2 mh2Var) {
        aw2Var.getClass();
        qweVar.getClass();
        i4eVar.getClass();
        rc1Var.getClass();
        fo1Var.getClass();
        z1bVar.getClass();
        bk1Var.getClass();
        sd1Var.getClass();
        uceVar.getClass();
        mh2Var.getClass();
        this.a = aw2Var;
        this.b = qweVar;
        this.c = i4eVar;
        this.d = uf1Var;
        this.e = ud6Var;
        this.f = jaeVar;
        this.g = rc1Var;
        this.h = fo1Var;
        this.i = a82Var;
        this.j = z1bVar;
        this.k = bk1Var;
        this.l = sd1Var;
        this.m = uceVar;
        this.n = bg1Var;
        this.o = nb1Var;
        this.p = d3eVar;
        this.q = new Object();
        this.r = true;
        this.s = gf1.u;
        this.t = new tj1(uf1Var.a);
        this.x = new za2();
        this.C = ynb.V(aw2Var, null, null, new ac1(this, null), 3);
        this.D = ynb.V(aw2Var, null, null, new bc1(this, null), 3);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(zn2 zn2Var) {
        cc1 cc1Var;
        if (zn2Var instanceof cc1) {
            cc1Var = (cc1) zn2Var;
            int i = cc1Var.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                cc1Var.label = i - Integer.MIN_VALUE;
            } else {
                cc1Var = new cc1(this, zn2Var);
            }
        } else {
            cc1Var = new cc1(this, zn2Var);
        }
        Object obj = cc1Var.result;
        bw2 bw2Var = bw2.a;
        int i2 = cc1Var.label;
        if (i2 == 0) {
            jzb.q(obj);
            Log.d("CXCP", this + "#awaitClosed");
            synchronized (this.q) {
                if (this.s.equals(gf1.p)) {
                    Log.d("CXCP", this + "#awaitClosed: Controller is already closed.");
                    return Boolean.TRUE;
                }
                if (!this.s.equals(gf1.q)) {
                    b1.l("CXCP", this + "#awaitClosed: Controller isn't closing!");
                    return Boolean.FALSE;
                }
                za2 za2Var = this.x;
                cc1Var.label = 1;
                if (za2Var.s(cc1Var) == bw2Var) {
                    return bw2Var;
                }
            }
        } else {
            if (i2 != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(obj);
        }
        return Boolean.TRUE;
    }

    public final void b(qo1 qo1Var, eyf eyfVar) {
        lyd lydVarV = ynb.V(this.a, null, null, new dc1(qo1Var, eyfVar, null), 3);
        if (this.s.equals(gf1.q)) {
            lydVarV.E(new yb1(this, 0));
        }
    }

    public final boolean c() {
        return this.s.equals(gf1.q) || this.s.equals(gf1.p);
    }

    public final void d(vj1 vj1Var) {
        Log.d("CXCP", this + " (" + ((Object) ig1.b(this.d.a)) + ") camera status changed: " + vj1Var);
        synchronized (this.q) {
            try {
                if (c()) {
                    return;
                }
                if ((vj1Var instanceof rj1) || (vj1Var instanceof tj1)) {
                    this.t = vj1Var;
                } else if (vj1Var instanceof sj1) {
                    this.m.getClass();
                    this.v = new sye(SystemClock.elapsedRealtimeNanos());
                }
                g();
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void e() {
        if (c()) {
            Log.i("CXCP", "Ignoring start(): " + this + " is already closed");
            return;
        }
        xo1 xo1Var = this.s;
        gf1 gf1Var = gf1.t;
        if (xo1Var.equals(gf1Var)) {
            b1.l("CXCP", "Ignoring start(): " + this + " is already started");
            return;
        }
        this.u = null;
        uf1 uf1Var = this.d;
        String str = uf1Var.a;
        List listJ1 = s72.j1(n3d.k(n3d.p(new ig1(str)), new ig1(str)));
        yb1 yb1Var = new yb1(this, 1);
        z1b z1bVar = this.j;
        z1bVar.getClass();
        str.getClass();
        aw2 aw2Var = z1bVar.d;
        ud6 ud6Var = this.e;
        eyf eyfVar = new eyf(str, ud6Var, aw2Var);
        if (z1bVar.e.e.d(new stb(eyfVar, listJ1, ud6Var, yb1Var)) instanceof qw1) {
            b1.d("CXCP", "Camera open request failed for " + ((Object) ig1.b(str)) + '!');
            ud6Var.a(new zd6(12, false));
            eyfVar = null;
        }
        if (eyfVar == null) {
            b1.d("CXCP", "Failed to start " + this + ": Open request submission failed");
            return;
        }
        if (this.y != null) {
            qc0.p("Check failed.");
            return;
        }
        if (this.z != null) {
            qc0.p("Check failed.");
            return;
        }
        this.y = eyfVar;
        qo1 qo1Var = new qo1(ud6Var, this.h, this.i, this.k, this.m, uf1Var.n, null, this.p, this.c, this.b, this.a);
        this.z = qo1Var;
        Map map = this.A;
        if (map != null) {
            qo1Var.j(map);
        }
        this.s = gf1Var;
        Log.d("CXCP", "Started " + this);
        lyd lydVar = this.B;
        if (lydVar != null) {
            lydVar.h(null);
        }
        this.B = ynb.V(this.a, null, null, new ec1(this, null), 3);
    }

    public final void f() {
        if (c()) {
            b1.l("CXCP", "Ignoring stop(): " + this + " is already closed");
            return;
        }
        xo1 xo1Var = this.s;
        gf1 gf1Var = gf1.v;
        if (xo1Var.equals(gf1Var) || this.s.equals(gf1.u)) {
            b1.l("CXCP", "Ignoring stop(): " + this + " already stopping or stopped");
            return;
        }
        eyf eyfVar = this.y;
        qo1 qo1Var = this.z;
        this.y = null;
        this.z = null;
        this.s = gf1Var;
        Log.d("CXCP", "Stopping " + this);
        b(qo1Var, eyfVar);
    }

    /* JADX WARN: Code duplicated, block: B:41:0x007c  */
    /* JADX WARN: Code duplicated, block: B:42:0x007f  */
    /* JADX WARN: Code duplicated, block: B:45:0x0086  */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0071, code lost:
    
        if (r3.a != 8) goto L39;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g() {
        /*
            Method dump skipped, instruction units count: 224
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gc1.g():void");
    }

    public final String toString() {
        return "Camera2CameraController(" + this.n + ')';
    }
}
