package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class mu9 {
    public static final ch2 a = new ch2(new xn9(13));

    public static final j09 a(j09 j09Var, lu9 lu9Var) {
        return j09Var.D(new nu9(lu9Var));
    }

    public static final lu9 b(l46 l46Var) {
        l46Var.f0(282942128);
        ur urVar = (ur) l46Var.k(a);
        if (urVar == null) {
            l46Var.r(false);
            return null;
        }
        boolean zG = l46Var.g(urVar);
        Object objR = l46Var.R();
        if (zG || objR == sf2.a) {
            Object trVar = new tr(urVar.a, urVar.b, urVar.c, urVar.d);
            l46Var.p0(trVar);
            objR = trVar;
        }
        lu9 lu9Var = (lu9) objR;
        l46Var.r(false);
        return lu9Var;
    }
}
