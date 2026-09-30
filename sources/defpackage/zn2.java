package defpackage;

import sun.misc.Unsafe;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class zn2 extends pt0 {
    private final pv2 _context;
    public transient xn2 a;

    public zn2(xn2 xn2Var) {
        this(xn2Var, xn2Var != null ? xn2Var.getContext() : null);
    }

    @Override // defpackage.xn2
    public pv2 getContext() {
        pv2 pv2Var = this._context;
        pv2Var.getClass();
        return pv2Var;
    }

    @Override // defpackage.pt0
    public void s() {
        Unsafe unsafe;
        long j;
        xn2 xn2Var = this.a;
        if (xn2Var != null && xn2Var != this) {
            nv2 nv2VarF0 = getContext().F0(hj6.Z);
            nv2VarF0.getClass();
            z94 z94Var = (z94) xn2Var;
            do {
                unsafe = ud0.a;
                j = z94.v;
            } while (unsafe.getObjectVolatile(z94Var, j) == aa4.b);
            Object objectVolatile = unsafe.getObjectVolatile(z94Var, j);
            pl1 pl1Var = objectVolatile instanceof pl1 ? (pl1) objectVolatile : null;
            if (pl1Var != null) {
                pl1Var.o();
            }
        }
        this.a = db2.b;
    }

    public zn2(xn2 xn2Var, pv2 pv2Var) {
        super(xn2Var);
        this._context = pv2Var;
    }
}
