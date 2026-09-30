package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class xze {
    public static final float a;

    static {
        cgg.f(16.0f, 8.0f);
        a = 200.0f;
    }

    public static b0f a(l46 l46Var) {
        bx9 bx9Var = a0f.a;
        int iD0 = ((sw3) l46Var.k(zg2.h)).D0(4.0f);
        boolean zE = l46Var.e(iD0);
        Object objR = l46Var.R();
        if (zE || objR == sf2.a) {
            objR = new b0f(iD0);
            l46Var.p0(objR);
        }
        return (b0f) objR;
    }
}
