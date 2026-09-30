package defpackage;

import androidx.compose.foundation.layout.b;
import androidx.compose.ui.node.LayoutNode;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class xr1 implements l26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ a26 c;

    public /* synthetic */ xr1(int i, a26 a26Var) {
        this.a = 0;
        this.b = i;
        this.c = a26Var;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        int i = this.a;
        wef wefVar = wef.a;
        int i2 = this.b;
        a26 a26Var = this.c;
        switch (i) {
            case 0:
                l46 l46Var = (l46) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!l46Var.W(iIntValue & 1, (iIntValue & 3) != 2)) {
                    l46Var.Z();
                } else {
                    g09 g09Var = g09.a;
                    j09 j09VarZ = ynb.Z(g09Var, 16.0f);
                    c92 c92VarA = a92.a(xc0.c, ndb.Y, l46Var, 0);
                    int iHashCode = Long.hashCode(l46Var.T);
                    u8a u8aVarM = l46Var.m();
                    j09 j09VarJ = m93.J(l46Var, j09VarZ);
                    lf2.q.getClass();
                    l46Var.j0();
                    boolean z = l46Var.S;
                    ov7 ov7Var = LayoutNode.h1;
                    if (z) {
                        l46Var.l(ov7Var);
                    } else {
                        l46Var.s0();
                    }
                    he2 he2Var = hj6.z;
                    dec.l(he2Var, l46Var, c92VarA);
                    he2 he2Var2 = hj6.y;
                    dec.l(he2Var2, l46Var, u8aVarM);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    he2 he2Var3 = hj6.X;
                    dec.l(he2Var3, l46Var, numValueOf);
                    dec.k(l46Var);
                    he2 he2Var4 = hj6.x;
                    dec.l(he2Var4, l46Var, j09VarJ);
                    pr4 pr4Var = r9f.a;
                    nte.b("Card Count: " + i2, null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((p9f) l46Var.k(pr4Var)).i, l46Var, 0, 0, 131070);
                    o5c.f(l46Var, b.d(g09Var, 8.0f));
                    float f = i2;
                    boolean zG = l46Var.g(a26Var);
                    Object objR = l46Var.R();
                    if (zG || objR == sf2.a) {
                        objR = new hy0(a26Var, 4);
                        l46Var.p0(objR);
                    }
                    epd.a(f, (a26) objR, null, false, new b62(1.0f, 13.0f), 11, null, null, l46Var, 196608, 460);
                    j09 j09VarC = b.c(g09Var, 1.0f);
                    t7c t7cVarA = s7c.a(xc0.g, ndb.y, l46Var, 6);
                    int iHashCode2 = Long.hashCode(l46Var.T);
                    u8a u8aVarM2 = l46Var.m();
                    j09 j09VarJ2 = m93.J(l46Var, j09VarC);
                    l46Var.j0();
                    if (l46Var.S) {
                        l46Var.l(ov7Var);
                    } else {
                        l46Var.s0();
                    }
                    dec.l(he2Var, l46Var, t7cVarA);
                    dec.l(he2Var2, l46Var, u8aVarM2);
                    ib8.s(iHashCode2, l46Var, he2Var3, l46Var);
                    dec.l(he2Var4, l46Var, j09VarJ2);
                    nte.b("1", null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((p9f) l46Var.k(pr4Var)).o, l46Var, 6, 0, 131070);
                    nte.b("13", null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((p9f) l46Var.k(pr4Var)).o, l46Var, 6, 0, 131070);
                    l46Var.r(true);
                    l46Var.r(true);
                }
                break;
            case 1:
                ((Integer) obj2).getClass();
                gs1.a(i2, k99.P(49), a26Var, (l46) obj);
                break;
            case 2:
                ((Integer) obj2).getClass();
                jlc.e(i2, k99.P(1), a26Var, (l46) obj);
                break;
            default:
                ((Integer) obj2).getClass();
                d8c.f(a26Var, (l46) obj, k99.P(1 | i2));
                break;
        }
        return wefVar;
    }

    public /* synthetic */ xr1(int i, int i2, int i3, a26 a26Var) {
        this.a = i3;
        this.b = i;
        this.c = a26Var;
    }

    public /* synthetic */ xr1(a26 a26Var, int i) {
        this.a = 3;
        this.c = a26Var;
        this.b = i;
    }
}
