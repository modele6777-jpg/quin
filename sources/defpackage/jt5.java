package defpackage;

import androidx.compose.ui.node.LayoutNode;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class jt5 implements l26 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ mic b;
    public final /* synthetic */ qs5 c;

    public /* synthetic */ jt5(mic micVar, qs5 qs5Var) {
        this.b = micVar;
        this.c = qs5Var;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        int i = this.a;
        wef wefVar = wef.a;
        qs5 qs5Var = this.c;
        mic micVar = this.b;
        l46 l46Var = (l46) obj;
        Integer num = (Integer) obj2;
        switch (i) {
            case 0:
                int iIntValue = num.intValue();
                if (!l46Var.W(iIntValue & 1, (iIntValue & 3) != 2)) {
                    l46Var.Z();
                } else {
                    j09 j09VarZ = ynb.Z(g09.a, 20.0f);
                    c92 c92VarA = a92.a(new uc0(20.0f, true, new qc0(0)), ndb.Y, l46Var, 6);
                    int iHashCode = Long.hashCode(l46Var.T);
                    u8a u8aVarM = l46Var.m();
                    j09 j09VarJ = m93.J(l46Var, j09VarZ);
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
                    kj0.O(micVar, qs5Var, l46Var, 0);
                    kj0.Q(micVar, l46Var, 0);
                    l46Var.r(true);
                }
                break;
            default:
                num.getClass();
                kj0.O(micVar, qs5Var, l46Var, k99.P(1));
                break;
        }
        return wefVar;
    }

    public /* synthetic */ jt5(mic micVar, qs5 qs5Var, int i) {
        this.b = micVar;
        this.c = qs5Var;
    }
}
