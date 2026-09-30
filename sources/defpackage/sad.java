package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class sad {
    public static final pr4 a = new pr4(1, new ead(2));
    public static final pr4 b = new pr4(1, new ond(24));
    public static final pr4 c = new pr4(1, new ead(3));
    public static final pr4 d = new pr4(1, new ead(4));

    public static final boolean a(int i, int i2, l46 l46Var, int i3) {
        int i4 = (i3 & 14) ^ 6;
        boolean z = (i4 > 4 && l46Var.e(i)) || (i3 & 6) == 4;
        Object objR = l46Var.R();
        Object obj = sf2.a;
        if (z || objR == obj) {
            objR = q1c.f(Boolean.valueOf(i == 0));
            l46Var.p0(objR);
        }
        e89 e89Var = (e89) objR;
        Integer numValueOf = Integer.valueOf(i);
        boolean zG = ((i4 > 4 && l46Var.e(i)) || (i3 & 6) == 4) | l46Var.g(e89Var);
        Object objR2 = l46Var.R();
        if (zG || objR2 == obj) {
            objR2 = new rad(i, e89Var, null);
            l46Var.p0(objR2);
        }
        af1.o((l26) objR2, l46Var, numValueOf);
        return i == 0 || i2 >= i || ((Boolean) e89Var.getValue()).booleanValue();
    }
}
