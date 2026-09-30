package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class aa4 {
    public static final ig4 a = new ig4("UNDEFINED", 2);
    public static final ig4 b = new ig4("REUSABLE_CLAIMED", 2);

    public static final void a(xn2 xn2Var, Object obj) {
        if (!(xn2Var instanceof z94)) {
            xn2Var.g(obj);
            return;
        }
        z94 z94Var = (z94) xn2Var;
        sv2 sv2Var = z94Var.d;
        zn2 zn2Var = z94Var.e;
        Throwable thA = ezb.a(obj);
        Object eb2Var = thA == null ? obj : new eb2(thA, false);
        if (c(sv2Var, zn2Var.getContext())) {
            z94Var.f = eb2Var;
            z94Var.c = 1;
            b(sv2Var, zn2Var.getContext(), z94Var);
            return;
        }
        vz4 vz4VarA = gwe.a();
        if (vz4VarA.c >= 4294967296L) {
            z94Var.f = eb2Var;
            z94Var.c = 1;
            vz4VarA.e1(z94Var);
            return;
        }
        vz4VarA.f1(true);
        try {
            dg7 dg7Var = (dg7) zn2Var.getContext().F0(ndb.Y0);
            if (dg7Var == null || dg7Var.b()) {
                Object obj2 = z94Var.g;
                pv2 context = zn2Var.getContext();
                Object objC = dwe.c(context, obj2);
                hbf hbfVarS = objC != dwe.a ? y7h.S(zn2Var, context, objC) : null;
                try {
                    zn2Var.g(obj);
                    if (hbfVarS == null || hbfVarS.m0()) {
                        dwe.a(context, objC);
                    }
                } catch (Throwable th) {
                    if (hbfVarS == null || hbfVarS.m0()) {
                        dwe.a(context, objC);
                    }
                    throw th;
                }
            } else {
                z94Var.g(jzb.k(dg7Var.N()));
            }
            while (vz4VarA.h1()) {
            }
        } catch (Throwable th2) {
            try {
                z94Var.h(th2);
            } finally {
                vz4VarA.d1(true);
            }
        }
    }

    public static final void b(sv2 sv2Var, pv2 pv2Var, Runnable runnable) {
        try {
            sv2Var.Z0(pv2Var, runnable);
        } catch (Throwable th) {
            throw new y94(th, sv2Var, pv2Var);
        }
    }

    public static final boolean c(sv2 sv2Var, pv2 pv2Var) throws y94 {
        try {
            return sv2Var.b1(pv2Var);
        } catch (Throwable th) {
            throw new y94(th, sv2Var, pv2Var);
        }
    }
}
