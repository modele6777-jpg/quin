package defpackage;

import java.util.concurrent.CancellationException;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class ca4 extends fle {
    public int c;

    public ca4(int i) {
        super(0L, false);
        this.c = i;
    }

    public abstract xn2 c();

    public Throwable d(Object obj) {
        eb2 eb2Var = obj instanceof eb2 ? (eb2) obj : null;
        if (eb2Var != null) {
            return eb2Var.a;
        }
        return null;
    }

    public final void h(Throwable th) {
        tq.C(c().getContext(), new hw2("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
    }

    public abstract Object i();

    @Override // java.lang.Runnable
    public final void run() {
        try {
            xn2 xn2VarC = c();
            xn2VarC.getClass();
            z94 z94Var = (z94) xn2VarC;
            zn2 zn2Var = z94Var.e;
            Object obj = z94Var.g;
            pv2 context = zn2Var.getContext();
            Object objC = dwe.c(context, obj);
            dg7 dg7Var = null;
            hbf hbfVarS = objC != dwe.a ? y7h.S(zn2Var, context, objC) : null;
            try {
                pv2 context2 = zn2Var.getContext();
                Object objI = i();
                Throwable thD = d(objI);
                if (thD == null) {
                    int i = this.c;
                    boolean z = true;
                    if (i != 1 && i != 2) {
                        z = false;
                    }
                    if (z) {
                        dg7Var = (dg7) context2.F0(ndb.Y0);
                    }
                }
                if (dg7Var != null && !dg7Var.b()) {
                    CancellationException cancellationExceptionN = dg7Var.N();
                    b(cancellationExceptionN);
                    zn2Var.g(jzb.k(cancellationExceptionN));
                } else if (thD != null) {
                    zn2Var.g(new dzb(thD));
                } else {
                    zn2Var.g(f(objI));
                }
            } finally {
                if (hbfVarS == null || hbfVarS.m0()) {
                    dwe.a(context, objC);
                }
            }
        } catch (y94 e) {
            tq.C(c().getContext(), e.getCause());
        } catch (Throwable th) {
            h(th);
        }
    }

    public void b(CancellationException cancellationException) {
    }

    public Object f(Object obj) {
        return obj;
    }
}
