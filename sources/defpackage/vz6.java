package defpackage;

import androidx.compose.foundation.layout.b;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class vz6 implements l26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ x16 b;
    public final /* synthetic */ a26 c;

    public /* synthetic */ vz6(a26 a26Var, x16 x16Var) {
        this.a = 3;
        this.c = a26Var;
        this.b = x16Var;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        int i = this.a;
        x16 x16Var = this.b;
        wef wefVar = wef.a;
        a26 a26Var = this.c;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                vd0.w(x16Var, a26Var, (l46) obj, k99.P(1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                bzd.h(x16Var, a26Var, (l46) obj, k99.P(1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                k99.o(x16Var, a26Var, (l46) obj, k99.P(1));
                break;
            default:
                l46 l46Var = (l46) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!l46Var.W(iIntValue & 1, (iIntValue & 3) != 2)) {
                    l46Var.Z();
                } else {
                    g09 g09Var = g09.a;
                    j09 j09VarC = b.c(g09Var, 1.0f);
                    bx9 bx9Var = v51.a;
                    pr4 pr4Var = o82.a;
                    u51 u51VarA = v51.a(((m82) l46Var.k(pr4Var)).p, ((m82) l46Var.k(pr4Var)).q, 0L, 0L, l46Var, 12);
                    y6c y6cVarB = a7c.b(16.0f);
                    bx9 bx9VarQ = ynb.q(0.0f, 0.0f, 3);
                    boolean zG = l46Var.g(a26Var);
                    Object objR = l46Var.R();
                    if (zG || objR == sf2.a) {
                        objR = new a5b(a26Var, 10);
                        l46Var.p0(objR);
                    }
                    cgg.a((x16) objR, j09VarC, false, y6cVarB, u51VarA, null, null, bx9VarQ, nk8.e, l46Var, 817889328, 356);
                    cgg.m(this.b, b.b(0.0f, 56.0f, b.c(g09Var, 1.0f), 1), false, a7c.b(16.0f), v51.h(((m82) l46Var.k(pr4Var)).q, l46Var), null, nk8.f, l46Var, 805306416, 484);
                }
                break;
        }
        return wefVar;
    }

    public /* synthetic */ vz6(x16 x16Var, a26 a26Var, int i, int i2) {
        this.a = i2;
        this.b = x16Var;
        this.c = a26Var;
    }
}
