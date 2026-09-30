package defpackage;

import android.content.res.Configuration;
import androidx.compose.foundation.layout.b;
import androidx.compose.ui.node.LayoutNode;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class hk8 implements l26 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ x16 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ x16 d;
    public final /* synthetic */ x16 e;

    public /* synthetic */ hk8(x16 x16Var, boolean z, x16 x16Var2, x16 x16Var3) {
        this.b = x16Var;
        this.c = z;
        this.d = x16Var2;
        this.e = x16Var3;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        int i = this.a;
        wef wefVar = wef.a;
        x16 x16Var = this.e;
        x16 x16Var2 = this.d;
        boolean z = this.c;
        x16 x16Var3 = this.b;
        switch (i) {
            case 0:
                l46 l46Var = (l46) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!l46Var.W(iIntValue & 1, (iIntValue & 3) != 2)) {
                    l46Var.Z();
                } else {
                    Configuration configuration = (Configuration) l46Var.k(uq.a);
                    float fMin = Math.min(configuration.screenWidthDp, configuration.screenHeightDp);
                    j09 j09VarN = mh3.N(b.c);
                    c92 c92VarA = a92.a(xc0.c, ndb.Z, l46Var, 48);
                    int iHashCode = Long.hashCode(l46Var.T);
                    u8a u8aVarM = l46Var.m();
                    j09 j09VarJ = m93.J(l46Var, j09VarN);
                    lf2.q.getClass();
                    l46Var.j0();
                    boolean z2 = l46Var.S;
                    ov7 ov7Var = LayoutNode.h1;
                    if (z2) {
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
                    g09 g09Var = g09.a;
                    x57.h(0, x16Var3, l46Var, ynb.Z(b.k(mh3.d0(b.c(g09Var, 1.0f), mh3.T(l46Var), false, 14), fMin), 24.0f).D(new jw7(1.0f, true)), z);
                    j09 j09VarZ = ynb.Z(b.k(g09Var, fMin), 24.0f);
                    xn8 xn8VarC = s21.c(ndb.b, false);
                    int iHashCode2 = Long.hashCode(l46Var.T);
                    u8a u8aVarM2 = l46Var.m();
                    j09 j09VarJ2 = m93.J(l46Var, j09VarZ);
                    l46Var.j0();
                    if (l46Var.S) {
                        l46Var.l(ov7Var);
                    } else {
                        l46Var.s0();
                    }
                    dec.l(he2Var, l46Var, xn8VarC);
                    dec.l(he2Var2, l46Var, u8aVarM2);
                    ib8.s(iHashCode2, l46Var, he2Var3, l46Var);
                    dec.l(he2Var4, l46Var, j09VarJ2);
                    if (z) {
                        l46Var.f0(594648250);
                        x57.d(x16Var2, x16Var, l46Var, 0);
                        l46Var.r(false);
                    } else {
                        l46Var.f0(594720604);
                        x57.c(x16Var2, x16Var, l46Var, 0);
                        l46Var.r(false);
                    }
                    l46Var.r(true);
                    l46Var.r(true);
                }
                break;
            default:
                l46 l46Var2 = (l46) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (!l46Var2.W(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                    l46Var2.Z();
                } else {
                    boolean zH = l46Var2.h(z) | l46Var2.g(x16Var2);
                    Object objR = l46Var2.R();
                    i8c i8cVar = sf2.a;
                    if (zH || objR == i8cVar) {
                        objR = new on2(z, x16Var2, 8);
                        l46Var2.p0(objR);
                    }
                    x16 x16Var4 = (x16) objR;
                    boolean zH2 = l46Var2.h(z) | l46Var2.g(x16Var);
                    Object objR2 = l46Var2.R();
                    if (zH2 || objR2 == i8cVar) {
                        objR2 = new on2(z, x16Var, 9);
                        l46Var2.p0(objR2);
                    }
                    q3c.b(x16Var3, x16Var4, (x16) objR2, l46Var2, 0);
                }
                break;
        }
        return wefVar;
    }

    public /* synthetic */ hk8(boolean z, x16 x16Var, x16 x16Var2, x16 x16Var3) {
        this.c = z;
        this.b = x16Var;
        this.d = x16Var2;
        this.e = x16Var3;
    }
}
