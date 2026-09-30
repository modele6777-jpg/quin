package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public class pd0 extends bl2 {
    public final a26 b;

    public pd0(List list, a26 a26Var) {
        super(list);
        this.b = a26Var;
    }

    @Override // defpackage.bl2
    public final tt7 a(w09 w09Var) {
        y22 y22VarM;
        w09Var.getClass();
        tt7 tt7Var = (tt7) this.b.d(w09Var);
        if (!xr7.z(tt7Var) && (((y22VarM = tt7Var.c0().m()) == null || xr7.s(y22VarM) == null) && !xr7.C(tt7Var, syd.W.a) && !xr7.C(tt7Var, syd.X.a) && !xr7.C(tt7Var, syd.Y.a))) {
            xr7.C(tt7Var, syd.Z.a);
        }
        return tt7Var;
    }
}
