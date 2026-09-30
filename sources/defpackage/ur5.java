package defpackage;

import androidx.compose.foundation.layout.b;
import androidx.compose.ui.node.LayoutNode;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ur5 implements n26 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ int b;
    public final /* synthetic */ int c;
    public final /* synthetic */ l26 d;
    public final /* synthetic */ Iterable e;

    public /* synthetic */ ur5(int i, int i2, l26 l26Var, z67 z67Var) {
        this.b = i;
        this.c = i2;
        this.d = l26Var;
        this.e = z67Var;
    }

    @Override // defpackage.n26
    public final Object m(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        wef wefVar = wef.a;
        Iterable iterable = this.e;
        switch (i) {
            case 0:
                dd2 dd2Var = (dd2) this.d;
                List list = (List) iterable;
                c4c c4cVar = (c4c) obj;
                l46 l46Var = (l46) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                c4cVar.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= l46Var.g(c4cVar) ? 4 : 2;
                }
                if (!l46Var.W(iIntValue & 1, (iIntValue & 19) != 18)) {
                    l46Var.Z();
                } else {
                    mh3.a(zr5.f.a(Integer.valueOf(this.b + 1)), af1.b0(-243396074, new b8(this.c, dd2Var, c4cVar, list, 20), l46Var), l46Var, 56);
                }
                break;
            default:
                z67 z67Var = (z67) iterable;
                l46 l46Var2 = (l46) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((oz) obj).getClass();
                if (!l46Var2.W(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    l46Var2.Z();
                } else {
                    c92 c92VarA = a92.a(xc0.c, ndb.Y, l46Var2, 0);
                    int iHashCode = Long.hashCode(l46Var2.T);
                    u8a u8aVarM = l46Var2.m();
                    g09 g09Var = g09.a;
                    j09 j09VarJ = m93.J(l46Var2, g09Var);
                    lf2.q.getClass();
                    l46Var2.j0();
                    if (l46Var2.S) {
                        l46Var2.l(LayoutNode.h1);
                    } else {
                        l46Var2.s0();
                    }
                    dec.l(hj6.z, l46Var2, c92VarA);
                    dec.l(hj6.y, l46Var2, u8aVarM);
                    dec.l(hj6.X, l46Var2, Integer.valueOf(iHashCode));
                    dec.k(l46Var2);
                    dec.l(hj6.x, l46Var2, j09VarJ);
                    jgb.t(0, 0, l46Var2, ynb.b0(we6.e(l46Var2) ? 0.0f : 24.0f, 0.0f, g09Var, 2));
                    uyb.f(this.b, this.c, this.d, ynb.a0(b.c(g09Var, 1.0f), 72.0f, 8.0f), false, z67Var, l46Var2, 27648, 0);
                    l46Var2.r(true);
                }
                break;
        }
        return wefVar;
    }

    public /* synthetic */ ur5(int i, dd2 dd2Var, List list, int i2) {
        this.b = i;
        this.d = dd2Var;
        this.e = list;
        this.c = i2;
    }
}
