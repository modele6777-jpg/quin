package defpackage;

import androidx.compose.ui.node.LayoutNode;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ku implements l26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ila b;
    public final /* synthetic */ e89 c;

    public /* synthetic */ ku(ila ilaVar, e89 e89Var, int i) {
        this.a = i;
        this.b = ilaVar;
        this.c = e89Var;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        int i = this.a;
        wef wefVar = wef.a;
        e89 e89Var = this.c;
        ila ilaVar = this.b;
        int i2 = 1;
        l46 l46Var = (l46) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                if (!l46Var.W(iIntValue & 1, (iIntValue & 3) != 2)) {
                    l46Var.Z();
                } else {
                    mh3.a(pu.b.a(Boolean.TRUE), af1.b0(1022273628, new ku(ilaVar, e89Var, i2), l46Var), l46Var, 56);
                }
                break;
            default:
                if (!l46Var.W(iIntValue & 1, (iIntValue & 3) != 2)) {
                    l46Var.Z();
                } else {
                    Object objR = l46Var.R();
                    i8c i8cVar = sf2.a;
                    if (objR == i8cVar) {
                        objR = new z4(27);
                        l46Var.p0(objR);
                    }
                    j09 j09VarB = vwc.b(g09.a, false, (a26) objR);
                    boolean zI = l46Var.i(ilaVar);
                    Object objR2 = l46Var.R();
                    if (zI || objR2 == i8cVar) {
                        objR2 = new lu(ilaVar, 1);
                        l46Var.p0(objR2);
                    }
                    j09 j09VarP = pa7.p(ym8.D(j09VarB, (a26) objR2), ilaVar.getCanCalculatePosition() ? 1.0f : 0.0f);
                    l26 l26Var = (l26) e89Var.getValue();
                    Object objR3 = l46Var.R();
                    if (objR3 == i8cVar) {
                        objR3 = mr.c;
                        l46Var.p0(objR3);
                    }
                    xn8 xn8Var = (xn8) objR3;
                    int iHashCode = Long.hashCode(l46Var.T);
                    u8a u8aVarM = l46Var.m();
                    j09 j09VarJ = m93.J(l46Var, j09VarP);
                    lf2.q.getClass();
                    l46Var.j0();
                    if (l46Var.S) {
                        l46Var.l(LayoutNode.h1);
                    } else {
                        l46Var.s0();
                    }
                    dec.l(hj6.z, l46Var, xn8Var);
                    dec.l(hj6.y, l46Var, u8aVarM);
                    dec.l(hj6.X, l46Var, Integer.valueOf(iHashCode));
                    dec.k(l46Var);
                    dec.l(hj6.x, l46Var, j09VarJ);
                    l26Var.z(l46Var, 0);
                    l46Var.r(true);
                }
                break;
        }
        return wefVar;
    }
}
