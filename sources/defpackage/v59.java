package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class v59 extends m4 {
    public final w79 c;
    public final ArrayList d;
    public final w79 e;
    public final hrd f;

    public v59() {
        super(5);
        this.c = rfc.j();
        this.d = new ArrayList();
        this.e = new w79();
        wf8 wf8Var = new wf8(7, this);
        qrd.b(qrd.a);
        synchronized (qrd.c) {
            qrd.h = s72.R0(qrd.h, wf8Var);
        }
        this.f = new hrd(wf8Var);
    }

    @Override // defpackage.m4
    public final void n0(qxc qxcVar) {
        this.d.add(new t59(qxcVar));
    }

    @Override // defpackage.m4
    public final void o0() {
        synchronized (this.b) {
            try {
                ArrayList arrayList = this.d;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    u59 u59Var = (u59) arrayList.get(i);
                    if (u59Var instanceof s59) {
                        rfc.d(this.c, ((s59) u59Var).a, ((s59) u59Var).b);
                    } else {
                        if (!(u59Var instanceof t59)) {
                            throw new rf9();
                        }
                        rfc.p(this.c, ((t59) u59Var).a);
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.d.clear();
    }

    @Override // defpackage.m4
    public final void p0() {
        this.f.a();
        this.d.clear();
        this.e.a();
        synchronized (this.b) {
            this.c.a();
        }
    }

    @Override // defpackage.m4
    public final a26 t0(qxc qxcVar) {
        w79 w79Var = this.e;
        a26 kz8Var = (a26) w79Var.g(qxcVar);
        if (kz8Var == null) {
            kz8Var = new kz8(2, this, qxcVar);
            int iF = w79Var.f(qxcVar);
            if (iF < 0) {
                iF = ~iF;
            }
            Object[] objArr = w79Var.c;
            Object obj = objArr[iF];
            w79Var.b[iF] = qxcVar;
            objArr[iF] = kz8Var;
        }
        return kz8Var;
    }

    @Override // defpackage.m4
    public final void u0(yv1 yv1Var) {
        this.e.k(yv1Var);
        n0(yv1Var);
        o0();
    }
}
