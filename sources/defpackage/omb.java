package defpackage;

import android.view.Surface;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class omb {
    public static final iy9 c;
    public static final iy9 d;
    public final a26 a;
    public final zh0 b = vpf.o(c);

    static {
        wef wefVar = wef.a;
        c = new iy9(wefVar, -1);
        d = new iy9(wefVar, 0);
    }

    public omb(a26 a26Var) {
        this.a = a26Var;
    }

    public final Object a() {
        iy9 iy9Var;
        Object objA;
        if (pa7.t(this.b.a, c)) {
            qc0.p("Ref-count managed object has not yet been initialized. Unable to acquire.");
            return null;
        }
        zh0 zh0Var = this.b;
        do {
            iy9Var = (iy9) zh0Var.a;
            if (pa7.t(iy9Var, d)) {
                return null;
            }
            objA = iy9Var.a();
        } while (!this.b.a(iy9Var, new iy9(objA, Integer.valueOf(((Number) iy9Var.b()).intValue() + 1))));
        return objA;
    }

    public final void b(Surface surface) {
        surface.getClass();
        if (this.b.a(c, new iy9(surface, 1))) {
            return;
        }
        qc0.p("Ref-count managed object has already been initialized.");
    }

    public final void c() {
        iy9 iy9Var;
        iy9 iy9Var2;
        Object objA;
        iy9 iy9Var3;
        if (pa7.t(this.b.a, c)) {
            qc0.p("Ref-count managed object has not yet been initialized. Unable to release.");
            return;
        }
        zh0 zh0Var = this.b;
        do {
            iy9Var = (iy9) zh0Var.a;
            iy9Var2 = d;
            if (pa7.t(iy9Var, iy9Var2)) {
                qc0.p("Release called more times than initialize + acquire.");
                return;
            } else {
                objA = iy9Var.a();
                int iIntValue = ((Number) iy9Var.b()).intValue();
                iy9Var3 = iIntValue == 1 ? iy9Var2 : new iy9(objA, Integer.valueOf(iIntValue - 1));
            }
        } while (!this.b.a(iy9Var, iy9Var3));
        if (iy9Var3.equals(iy9Var2)) {
            this.a.d(objA);
        }
    }
}
