package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class lf3 implements l26 {
    public final /* synthetic */ j18 a;
    public final /* synthetic */ z67 b;
    public final /* synthetic */ j91 c;
    public final /* synthetic */ n91 d;
    public final /* synthetic */ a26 e;
    public final /* synthetic */ c91 f;
    public final /* synthetic */ Long g;
    public final /* synthetic */ ne3 v;
    public final /* synthetic */ euc w;
    public final /* synthetic */ ke3 x;

    public lf3(j18 j18Var, z67 z67Var, j91 j91Var, n91 n91Var, a26 a26Var, c91 c91Var, Long l, ne3 ne3Var, euc eucVar, ke3 ke3Var) {
        this.a = j18Var;
        this.b = z67Var;
        this.c = j91Var;
        this.d = n91Var;
        this.e = a26Var;
        this.f = c91Var;
        this.g = l;
        this.v = ne3Var;
        this.w = eucVar;
        this.x = ke3Var;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        l46 l46Var = (l46) obj;
        int iIntValue = ((Number) obj2).intValue();
        if (l46Var.W(iIntValue & 1, (iIntValue & 3) != 2)) {
            Object objR = l46Var.R();
            i8c i8cVar = sf2.a;
            if (objR == i8cVar) {
                objR = new i73(14);
                l46Var.p0(objR);
            }
            j09 j09VarB = vwc.b(g09.a, false, (a26) objR);
            z67 z67Var = me3.a;
            qh3 qh3VarH0 = lmg.h0(3, 0.0f);
            fxd fxdVarZ = vpf.Z(t39.c, l46Var);
            boolean zG = l46Var.g(qh3VarH0);
            j18 j18Var = this.a;
            boolean zG2 = zG | l46Var.g(j18Var);
            Object objR2 = l46Var.R();
            if (zG2 || objR2 == i8cVar) {
                objR2 = new ard(new e91(new e18(j18Var, m8c.d), 1), qh3VarH0, fxdVarZ);
                l46Var.p0(objR2);
            }
            ard ardVar = (ard) objR2;
            boolean zI = l46Var.i(this.b) | l46Var.i(this.c) | l46Var.g(this.d) | l46Var.g(this.e);
            c91 c91Var = this.f;
            boolean zG3 = zI | l46Var.g(c91Var) | l46Var.g(this.g) | l46Var.i(this.v) | l46Var.g(this.w);
            ke3 ke3Var = this.x;
            boolean zG4 = zG3 | l46Var.g(ke3Var);
            Object objR3 = l46Var.R();
            if (zG4 || objR3 == i8cVar) {
                s83 s83Var = new s83(this.b, this.c, this.d, this.e, c91Var, this.g, this.v, this.w, ke3Var, 1);
                l46Var.p0(s83Var);
                objR3 = s83Var;
            }
            af1.t(j09VarB, j18Var, null, null, null, ardVar, false, null, (a26) objR3, l46Var, 0, 444);
        } else {
            l46Var.Z();
        }
        return wef.a;
    }
}
