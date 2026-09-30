package defpackage;

import android.graphics.Matrix;
import android.graphics.Rect;
import android.util.Size;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class wta extends oif {
    public static final uta y = new uta();
    public static final ScheduledExecutorService z = ok8.w();
    public vta r;
    public Executor s;
    public vzc t;
    public vx6 u;
    public iae v;
    public wae w;
    public wzc x;

    @Override // defpackage.oif
    public final void A(Rect rect) {
        this.l = rect;
        pg1 pg1VarD = d();
        iae iaeVar = this.v;
        if (pg1VarD == null || iaeVar == null) {
            return;
        }
        p8c.v(new gae(iaeVar, i(pg1VarD, n(pg1VarD)), ((Integer) ((ew6) this.i).a(ew6.H, -1)).intValue()));
    }

    public final void E() {
        wzc wzcVar = this.x;
        if (wzcVar != null) {
            wzcVar.b();
            this.x = null;
        }
        vx6 vx6Var = this.u;
        if (vx6Var != null) {
            vx6Var.a();
            this.u = null;
        }
        iae iaeVar = this.v;
        if (iaeVar != null) {
            iaeVar.b();
            this.v = null;
        }
        wae waeVar = this.w;
        if (waeVar != null) {
            synchronized (waeVar.a) {
                waeVar.m = null;
                waeVar.n = null;
            }
        }
        this.w = null;
    }

    public final void F(vta vtaVar) {
        p8c.m();
        this.r = vtaVar;
        this.s = z;
        if (c() != null) {
            G((yta) this.i, this.j);
            q();
        }
        p();
    }

    public final void G(yta ytaVar, hq0 hq0Var) {
        p8c.m();
        pg1 pg1VarD = d();
        Objects.requireNonNull(pg1VarD);
        E();
        int i = 1;
        ok8.o(null, this.v == null);
        Matrix matrix = this.m;
        boolean zO = pg1VarD.o();
        Size size = hq0Var.a;
        Rect rect = this.l;
        if (rect == null) {
            rect = size != null ? new Rect(0, 0, size.getWidth(), size.getHeight()) : null;
        }
        Objects.requireNonNull(rect);
        int i2 = i(pg1VarD, n(pg1VarD));
        ew6 ew6Var = (ew6) this.i;
        no0 no0Var = ew6.H;
        iae iaeVar = new iae(1, 34, hq0Var, matrix, zO, rect, i2, ((Integer) ew6Var.a(no0Var, -1)).intValue(), pg1VarD.o() && n(pg1VarD));
        this.v = iaeVar;
        m45 m45Var = new m45(17, this);
        p8c.m();
        iaeVar.a();
        iaeVar.m.add(m45Var);
        wae waeVarC = this.v.c(pg1VarD, true);
        this.w = waeVarC;
        this.u = waeVarC.k;
        if (this.r != null) {
            pg1 pg1VarD2 = d();
            iae iaeVar2 = this.v;
            if (pg1VarD2 != null && iaeVar2 != null) {
                p8c.v(new gae(iaeVar2, i(pg1VarD2, n(pg1VarD2)), ((Integer) ((ew6) this.i).a(no0Var, -1)).intValue()));
            }
            vta vtaVar = this.r;
            vtaVar.getClass();
            wae waeVar = this.w;
            waeVar.getClass();
            this.s.execute(new xu8(6, vtaVar, waeVar));
        }
        vzc vzcVarD = vzc.d(ytaVar, hq0Var.a);
        r1f r1fVar = vzcVarD.b;
        vzcVarD.h = hq0Var.d;
        a(vzcVarD, hq0Var);
        int iY = ytaVar.y();
        if (iY != 0 && iY != 0) {
            ((k79) r1fVar.c).p(xjf.q0, Integer.valueOf(iY));
        }
        qh2 qh2Var = hq0Var.f;
        if (qh2Var != null) {
            r1fVar.e(qh2Var);
        }
        if (this.r != null) {
            vzcVarD.b(this.u, hq0Var.c, ((Integer) ((ew6) this.i).a(ew6.I, -1)).intValue());
        }
        wzc wzcVar = this.x;
        if (wzcVar != null) {
            wzcVar.b();
        }
        wzc wzcVar2 = new wzc(new ev6(i, this));
        this.x = wzcVar2;
        vzcVarD.f = wzcVar2;
        this.t = vzcVarD;
        Object[] objArr = {vzcVarD.c()};
        ArrayList arrayList = new ArrayList(1);
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        C(Collections.unmodifiableList(arrayList));
    }

    @Override // defpackage.oif
    public final xjf g(boolean z2, akf akfVar) {
        y.getClass();
        yta ytaVar = uta.a;
        qh2 qh2VarA = akfVar.a(ytaVar.s(), 1);
        if (z2) {
            qh2VarA = qh2.q(qh2VarA, ytaVar);
        }
        if (qh2VarA == null) {
            return null;
        }
        return new yta(bs9.d(((sk1) m(qh2VarA)).b));
    }

    @Override // defpackage.oif
    public final Set l() {
        HashSet hashSet = new HashSet();
        hashSet.add(1);
        return hashSet;
    }

    @Override // defpackage.oif
    public final wjf m(qh2 qh2Var) {
        return new sk1(k79.m(qh2Var), 2);
    }

    public final String toString() {
        return "Preview:".concat(h());
    }

    @Override // defpackage.oif
    public final xjf u(ng1 ng1Var, wjf wjfVar) {
        wjfVar.h().p(wv6.C, 34);
        return wjfVar.o();
    }

    @Override // defpackage.oif
    public final hq0 x(qh2 qh2Var) {
        this.t.a(qh2Var);
        Object[] objArr = {this.t.c()};
        ArrayList arrayList = new ArrayList(1);
        Object obj = objArr[0];
        Objects.requireNonNull(obj);
        arrayList.add(obj);
        C(Collections.unmodifiableList(arrayList));
        hc2 hc2VarB = this.j.b();
        hc2VarB.g = qh2Var;
        return hc2VarB.c();
    }

    @Override // defpackage.oif
    public final hq0 y(hq0 hq0Var, hq0 hq0Var2) {
        b21.q("Preview", "onSuggestedStreamSpecUpdated: primaryStreamSpec = " + hq0Var + ", secondaryStreamSpec " + hq0Var2);
        G((yta) this.i, hq0Var);
        return hq0Var;
    }

    @Override // defpackage.oif
    public final void z() {
        E();
    }
}
