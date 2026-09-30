package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class qkd {
    public static final fxd a = b21.P(0.0f, 0.0f, 7, null);

    public static final h0e a(long j, ze5 ze5Var, String str, l46 l46Var, int i, int i2) {
        if ((i2 & 2) != 0) {
            ze5Var = a;
        }
        ze5 ze5Var2 = ze5Var;
        if ((i2 & 4) != 0) {
            str = "ColorAnimation";
        }
        String str2 = str;
        boolean zG = l46Var.g(y72.e(j));
        Object objR = l46Var.R();
        if (zG || objR == sf2.a) {
            y6f y6fVar = new y6f(xx.X, new w82(y72.e(j)));
            l46Var.p0(y6fVar);
            objR = y6fVar;
        }
        return vx.c(new y72(j), (y6f) objR, ze5Var2, null, str2, null, l46Var, ((i << 3) & 896) | ((i << 6) & 57344), 8);
    }
}
