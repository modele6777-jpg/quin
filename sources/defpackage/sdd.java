package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public interface sdd extends sg8 {
    static rdd b(String str, l46 l46Var) {
        l46Var.f0(800730162);
        l46Var.f0(-148945892);
        boolean zG = l46Var.g(str);
        Object objR = l46Var.R();
        if (zG || objR == sf2.a) {
            objR = new rdd(str);
            l46Var.p0(objR);
        }
        rdd rddVar = (rdd) objR;
        rddVar.b.setValue(mdd.a);
        l46Var.r(false);
        l46Var.r(false);
        return rddVar;
    }

    static j09 d(sdd sddVar, j09 j09Var, rdd rddVar, oz ozVar, p21 p21Var) {
        qdd.a.getClass();
        ydd yddVar = ded.a;
        xdd xddVar = (xdd) sddVar;
        xddVar.getClass();
        return m93.u(j09Var, new vdd(rddVar, ozVar.a(), xddVar, yddVar, p21Var));
    }
}
