package defpackage;

import android.view.Choreographer;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ow implements z09 {
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;

    public ow(qjb qjbVar) {
        this.a = 1;
        this.b = qjbVar;
        this.c = new a82();
    }

    @Override // defpackage.pv2
    public final nv2 F0(ov2 ov2Var) {
        switch (this.a) {
            case 0:
                break;
        }
        return i7h.s(this, ov2Var);
    }

    @Override // defpackage.pv2
    public final pv2 U(ov2 ov2Var) {
        switch (this.a) {
            case 0:
                break;
        }
        return i7h.E(this, ov2Var);
    }

    @Override // defpackage.pv2
    public final Object V0(l26 l26Var, Object obj) {
        switch (this.a) {
            case 0:
                break;
        }
        return l26Var.z(obj, this);
    }

    @Override // defpackage.z09
    public final Object g0(xn2 xn2Var, a26 a26Var) {
        switch (this.a) {
            case 0:
                mw mwVar = (mw) this.c;
                pl1 pl1Var = new pl1(1, k99.D(xn2Var));
                pl1Var.v();
                nw nwVar = new nw(pl1Var, this, a26Var);
                if (pa7.t(mwVar.c, (Choreographer) this.b)) {
                    synchronized (mwVar.e) {
                        mwVar.g.add(nwVar);
                        if (!mwVar.x) {
                            mwVar.x = true;
                            mwVar.c.postFrameCallback(mwVar.y);
                        }
                        break;
                    }
                    pl1Var.x(new d5(3, mwVar, nwVar));
                } else {
                    ((Choreographer) this.b).postFrameCallback(nwVar);
                    pl1Var.x(new d5(4, this, nwVar));
                }
                return pl1Var.t();
            default:
                pl1 pl1Var2 = new pl1(1, k99.D(xn2Var));
                pl1Var2.v();
                a82 a82Var = (a82) this.c;
                z31 z31Var = new z31();
                z31Var.a = pl1Var2;
                z31Var.b = a26Var;
                pl1Var2.x(new x(8, a82Var.q(z31Var, (qjb) this.b)));
                return pl1Var2.t();
        }
    }

    @Override // defpackage.pv2
    public final pv2 p0(pv2 pv2Var) {
        switch (this.a) {
            case 0:
                break;
        }
        return i7h.I(this, pv2Var);
    }

    public ow(Choreographer choreographer, mw mwVar) {
        this.a = 0;
        this.b = choreographer;
        this.c = mwVar;
    }
}
