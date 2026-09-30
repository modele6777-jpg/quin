package defpackage;

import ai.askquin.R;
import androidx.compose.foundation.layout.b;
import androidx.compose.ui.node.LayoutNode;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class f5b implements n26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ use c;
    public final /* synthetic */ gn8 d;

    public /* synthetic */ f5b(boolean z, use useVar, gn8 gn8Var, int i) {
        this.a = i;
        this.b = z;
        this.c = useVar;
        this.d = gn8Var;
    }

    @Override // defpackage.n26
    public final Object m(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        wef wefVar = wef.a;
        g09 g09Var = g09.a;
        boolean z = this.b;
        int i2 = 1;
        switch (i) {
            case 0:
                xw9 xw9Var = (xw9) obj;
                l46 l46Var = (l46) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                xw9Var.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= l46Var.g(xw9Var) ? 4 : 2;
                }
                if (!l46Var.W(iIntValue & 1, (iIntValue & 19) != 18)) {
                    l46Var.Z();
                } else {
                    jgb.l(0, l46Var);
                    j09 j09VarB0 = ynb.b0(32.0f, 0.0f, ynb.Y(b.c, xw9Var), 2);
                    c92 c92VarA = a92.a(xc0.c, ndb.Z, l46Var, 48);
                    int iHashCode = Long.hashCode(l46Var.T);
                    u8a u8aVarM = l46Var.m();
                    j09 j09VarJ = m93.J(l46Var, j09VarB0);
                    lf2.q.getClass();
                    l46Var.j0();
                    if (l46Var.S) {
                        l46Var.l(LayoutNode.h1);
                    } else {
                        l46Var.s0();
                    }
                    dec.l(hj6.z, l46Var, c92VarA);
                    dec.l(hj6.y, l46Var, u8aVarM);
                    dec.l(hj6.X, l46Var, Integer.valueOf(iHashCode));
                    dec.k(l46Var);
                    dec.l(hj6.x, l46Var, j09VarJ);
                    jgb.q(0, 1, l46Var, null, ks0.h(12.0f, R.string.question_input_title, l46Var, l46Var, g09Var));
                    o5c.f(l46Var, b.d(g09Var, 12.0f));
                    g21.q(b.b(0.0f, 168.0f, b.c(g09Var, 1.0f), 1).D(new jw7(1.0f, false)), k8b.f((e8b) l46Var.k(l8b.a)) ? 0.0f : 28.0f, af1.b0(-1635937588, new f5b(z, this.c, this.d, i2), l46Var), l46Var, 384);
                    tec.u(g09Var, 12.0f, l46Var, true);
                }
                break;
            default:
                l46 l46Var2 = (l46) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((c31) obj).getClass();
                if (!l46Var2.W(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    l46Var2.Z();
                } else {
                    j09 j09VarZ = ynb.Z(b.c(g09Var, 1.0f), 16.0f);
                    mue mueVar = (mue) l46Var2.k(nte.a);
                    long jL = w6c.l(17);
                    long jL2 = w6c.l(24);
                    pr4 pr4Var = l8b.a;
                    mue mueVarA = mue.a(mueVar, ((e8b) l46Var2.k(pr4Var)).q, jL, null, null, 0L, null, 0, jL2, null, null, 16646140);
                    xpe xpeVar = new xpe(0, 2);
                    dtd dtdVar = new dtd(((e8b) l46Var2.k(pr4Var)).q);
                    use useVar = this.c;
                    tv0.b(useVar, j09VarZ, !z, this.d, mueVarA, null, null, xpeVar, null, null, dtdVar, new g5b(0, useVar), null, l46Var2, 100687920, 0, 22216);
                }
                break;
        }
        return wefVar;
    }
}
