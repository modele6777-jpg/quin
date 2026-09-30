package defpackage;

import androidx.compose.ui.node.LayoutNode;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class fz4 implements l26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ fz4(float f, String str, mfc mfcVar, int i) {
        this.a = 0;
        this.b = f;
        this.c = str;
        this.d = mfcVar;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        int i = this.a;
        wef wefVar = wef.a;
        Object obj3 = this.d;
        float f = this.b;
        Object obj4 = this.c;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                k99.b(f, (String) obj4, (mfc) obj3, (l46) obj, k99.P(1));
                break;
            case 1:
                xw9 xw9Var = (xw9) obj4;
                dd2 dd2Var = (dd2) obj3;
                l46 l46Var = (l46) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!l46Var.W(iIntValue & 1, (iIntValue & 3) != 2)) {
                    l46Var.Z();
                } else {
                    j09 j09VarY = ynb.Y(g09.a, xw9Var);
                    c92 c92VarA = a92.a(new uc0(f, true, new qc0(0)), ndb.Y, l46Var, 0);
                    int iHashCode = Long.hashCode(l46Var.T);
                    u8a u8aVarM = l46Var.m();
                    j09 j09VarJ = m93.J(l46Var, j09VarY);
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
                    tec.q(0, dd2Var, l46Var, true);
                }
                break;
            case 2:
                ((Integer) obj2).getClass();
                k5a.a((i5a) obj4, f, (x16) obj3, (l46) obj, k99.P(1));
                break;
            default:
                ((Integer) obj2).getClass();
                g21.q((j09) obj4, f, (dd2) obj3, (l46) obj, k99.P(385));
                break;
        }
        return wefVar;
    }

    public /* synthetic */ fz4(xw9 xw9Var, float f, dd2 dd2Var) {
        this.a = 1;
        this.c = xw9Var;
        this.b = f;
        this.d = dd2Var;
    }

    public /* synthetic */ fz4(Object obj, float f, m26 m26Var, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.b = f;
        this.d = m26Var;
    }
}
