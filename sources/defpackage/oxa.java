package defpackage;

import android.net.Uri;
import android.os.Looper;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class oxa extends fu0 {
    public final yb3 i;
    public final r45 j;
    public final dq4 k;
    public final ff8 l;
    public final rr5 m;
    public boolean n = true;
    public long o = -9223372036854775807L;
    public boolean p;
    public boolean q;
    public boolean r;
    public lp3 s;
    public op8 t;

    public oxa(op8 op8Var, yb3 yb3Var, r45 r45Var, dq4 dq4Var, ff8 ff8Var, rr5 rr5Var) {
        this.t = op8Var;
        this.i = yb3Var;
        this.j = r45Var;
        this.k = dq4Var;
        this.l = ff8Var;
        this.m = rr5Var;
    }

    @Override // defpackage.fu0
    public final up8 a(zp8 zp8Var, ta0 ta0Var, long j) {
        ac3 ac3VarL0 = this.i.l0();
        lp3 lp3Var = this.s;
        if (lp3Var != null) {
            ac3VarL0.m(lp3Var);
        }
        lp8 lp8Var = g().b;
        lp8Var.getClass();
        Uri uri = lp8Var.a;
        this.g.getClass();
        return new lxa(uri, ac3VarL0, new ta0(12, (o95) this.j.b), this.k, new aq4(this.d.c, 0, zp8Var), this.l, new aq4(this.c.c, 0, zp8Var), this, ta0Var, this.m, pqf.H(lp8Var.e), null);
    }

    @Override // defpackage.fu0
    public final synchronized op8 g() {
        return this.t;
    }

    @Override // defpackage.fu0
    public final void k(lp3 lp3Var) {
        this.s = lp3Var;
        Looper.myLooper().getClass();
        this.g.getClass();
        s();
    }

    @Override // defpackage.fu0
    public final void m(up8 up8Var) {
        lxa lxaVar = (lxa) up8Var;
        if (lxaVar.M0) {
            for (ncc nccVar : lxaVar.J0) {
                nccVar.i();
                ssg ssgVar = nccVar.h;
                if (ssgVar != null) {
                    ssgVar.M(nccVar.e);
                    nccVar.h = null;
                    nccVar.g = null;
                }
            }
        }
        ta0 ta0Var = lxaVar.z;
        f39 f39Var = (f39) ta0Var.c;
        x98 x98Var = (x98) ta0Var.d;
        if (x98Var != null) {
            x98Var.a(true);
        }
        f39Var.execute(new wwg(18, lxaVar));
        ((ho7) f39Var.c).accept(f39Var.b);
        lxaVar.F0.removeCallbacksAndMessages(null);
        lxaVar.G0 = null;
        lxaVar.h1 = true;
    }

    @Override // defpackage.fu0
    public final synchronized void r(op8 op8Var) {
        this.t = op8Var;
    }

    public final void s() {
        gye ekdVar = new ekd(this.o, this.p, this.q, g());
        if (this.n) {
            ekdVar = new mxa(ekdVar);
        }
        l(ekdVar);
    }

    public final void t(long j, xsc xscVar, boolean z) {
        if (this.r && xscVar.e()) {
            return;
        }
        this.r = !xscVar.e();
        if (j == -9223372036854775807L) {
            j = this.o;
        }
        boolean zC = xscVar.c();
        if (!this.n && this.o == j && this.p == zC && this.q == z) {
            return;
        }
        this.o = j;
        this.p = zC;
        this.q = z;
        this.n = false;
        s();
    }

    @Override // defpackage.fu0
    public final void i() {
    }

    @Override // defpackage.fu0
    public final void o() {
    }
}
