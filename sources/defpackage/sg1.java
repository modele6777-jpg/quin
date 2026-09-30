package defpackage;

import android.util.Log;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class sg1 implements pg1 {
    public final ekf a;
    public final ng1 b;
    public final ef1 c;
    public final lkf d;
    public final aj1 e;
    public final String f;
    public te1 g;
    public final int v;
    public final sh0 w;

    public sg1(ue1 ue1Var, ekf ekfVar, ng1 ng1Var, ef1 ef1Var, lkf lkfVar, aj1 aj1Var) {
        ue1Var.getClass();
        ekfVar.getClass();
        ng1Var.getClass();
        ef1Var.getClass();
        lkfVar.getClass();
        aj1Var.getClass();
        this.a = ekfVar;
        this.b = ng1Var;
        this.c = ef1Var;
        this.d = lkfVar;
        this.e = aj1Var;
        String str = ue1Var.a;
        this.f = str;
        we1 we1Var = xe1.a;
        we1Var.getClass();
        this.g = we1Var;
        wh0 wh0Var = tg1.a;
        wh0Var.getClass();
        this.v = wh0.b.incrementAndGet(wh0Var);
        this.w = vpf.m(false);
        if (b21.F(3, "CXCP")) {
            Log.d("CXCP", "Created " + this + " for " + ((Object) ig1.b(str)));
        }
    }

    @Override // defpackage.pg1
    public final m88 a() {
        return y41.t(new jv2(0, ynb.V(this.d.a, null, null, new rg1(this, null), 3)));
    }

    @Override // defpackage.nif
    public final void c(oif oifVar) {
        ekf ekfVar = this.a;
        ekfVar.getClass();
        synchronized (ekfVar.k) {
            if (ekfVar.l.contains(oifVar)) {
                ekfVar.k(ekfVar.l);
            }
        }
    }

    @Override // defpackage.nif
    public final void e(oif oifVar) {
        this.a.a(oifVar);
    }

    @Override // defpackage.pg1
    public final ef1 f() {
        return this.c;
    }

    @Override // defpackage.pg1
    public final te1 g() {
        return this.g;
    }

    @Override // defpackage.nif
    public final void h(oif oifVar) {
        ekf ekfVar = this.a;
        ekfVar.getClass();
        synchronized (ekfVar.k) {
            if (ekfVar.l.contains(oifVar)) {
                ekfVar.l();
            }
        }
    }

    @Override // defpackage.pg1
    public final void i(te1 te1Var) {
        te1 te1Var2;
        if (te1Var == null) {
            te1Var2 = xe1.a;
            te1Var2.getClass();
        } else {
            te1Var2 = te1Var;
        }
        this.g = te1Var2;
        if (te1Var != null) {
            te1Var.u();
        }
        synchronized (this.a.k) {
        }
    }

    @Override // defpackage.pg1
    public final void j(boolean z) {
        ekf ekfVar = this.a;
        synchronized (ekfVar.k) {
            ekfVar.n = z;
            pif pifVarH = ekfVar.h();
            if (pifVarH != null) {
                xif xifVar = (xif) pifVarH;
                ynb.V(xifVar.b.f, null, null, new vif(null, xifVar, z), 3);
            }
        }
    }

    @Override // defpackage.pg1
    public final boolean k() {
        return this.w.b();
    }

    @Override // defpackage.pg1
    public final void l(ArrayList arrayList) {
        this.a.g(s72.j1(arrayList));
    }

    @Override // defpackage.pg1
    public final void m(ArrayList arrayList) {
        this.a.d(s72.j1(arrayList));
    }

    @Override // defpackage.pg1
    public final void n() {
        if (b21.F(3, "CXCP")) {
            Log.d("CXCP", this + " received removed signal. Cleaning up.");
        }
        if (this.w.a()) {
            ynb.V(this.d.a, null, null, new qg1(this, null), 3);
        }
    }

    @Override // defpackage.pg1
    public final void p(boolean z) {
        ekf ekfVar = this.a;
        synchronized (ekfVar.k) {
            ekfVar.p = z;
        }
    }

    @Override // defpackage.pg1
    public final ng1 q() {
        return this.b;
    }

    @Override // defpackage.nif
    public final void r(oif oifVar) {
        ekf ekfVar = this.a;
        ekfVar.getClass();
        synchronized (ekfVar.k) {
            if (ekfVar.m.remove(oifVar)) {
                ekfVar.l();
            }
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CameraInternalAdapter<");
        sb.append((Object) ig1.b(this.f));
        sb.append('(');
        return tec.g(this.v, ")>", sb);
    }
}
