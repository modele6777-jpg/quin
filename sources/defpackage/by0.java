package defpackage;

import ai.askquin.ui.account.component.AuthOption;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.b;
import androidx.compose.ui.node.LayoutNode;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class by0 implements n26 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ String b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ long d;
    public final /* synthetic */ x16 e;
    public final /* synthetic */ a26 f;
    public final /* synthetic */ Object g;

    public /* synthetic */ by0(oy0 oy0Var, String str, long j, boolean z, a26 a26Var, x16 x16Var) {
        this.g = oy0Var;
        this.b = str;
        this.d = j;
        this.c = z;
        this.f = a26Var;
        this.e = x16Var;
    }

    @Override // defpackage.n26
    public final Object m(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        wef wefVar = wef.a;
        Object obj4 = this.g;
        switch (i) {
            case 0:
                oy0 oy0Var = (oy0) obj4;
                l46 l46Var = (l46) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((c31) obj).getClass();
                if (!l46Var.W(iIntValue & 1, (iIntValue & 17) != 16)) {
                    l46Var.Z();
                } else {
                    boolean zI = l46Var.i(oy0Var);
                    Object objR = l46Var.R();
                    i8c i8cVar = sf2.a;
                    if (zI || objR == i8cVar) {
                        hl hlVar = new hl(0, oy0Var, oy0.class, "resetCode", "resetCode()V", 0, 7);
                        l46Var.p0(hlVar);
                        objR = hlVar;
                    }
                    x16 x16Var = (x16) ((ym7) objR);
                    boolean zI2 = l46Var.i(oy0Var);
                    String str = this.b;
                    boolean zG = zI2 | l46Var.g(str);
                    a26 a26Var = this.f;
                    boolean zG2 = zG | l46Var.g(a26Var);
                    Object objR2 = l46Var.R();
                    if (zG2 || objR2 == i8cVar) {
                        objR2 = new w6(oy0Var, str, a26Var);
                        l46Var.p0(objR2);
                    }
                    a26 a26Var2 = (a26) objR2;
                    boolean zI3 = l46Var.i(oy0Var) | l46Var.g(str);
                    Object objR3 = l46Var.R();
                    if (zI3 || objR3 == i8cVar) {
                        objR3 = new v6(23, oy0Var, str);
                        l46Var.p0(objR3);
                    }
                    y41.b(str, this.d, this.c, x16Var, a26Var2, (x16) objR3, this.e, l46Var, 0);
                }
                break;
            default:
                x16 x16Var2 = (x16) obj4;
                l46 l46Var2 = (l46) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((d92) obj).getClass();
                if (!l46Var2.W(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    l46Var2.Z();
                } else {
                    FillElement fillElement = b.c;
                    j09 j09VarN = mh3.N(fillElement);
                    c92 c92VarA = a92.a(xc0.c, ndb.Z, l46Var2, 48);
                    int iHashCode = Long.hashCode(l46Var2.T);
                    u8a u8aVarM = l46Var2.m();
                    j09 j09VarJ = m93.J(l46Var2, j09VarN);
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
                    bm8.c(this.b, AuthOption.Phone, this.c, this.d, this.e, x16Var2, this.f, ynb.b0(16.0f, 0.0f, fillElement, 2), l46Var2, 12582960);
                    l46Var2.r(true);
                }
                break;
        }
        return wefVar;
    }

    public /* synthetic */ by0(String str, boolean z, long j, x16 x16Var, x16 x16Var2, a26 a26Var) {
        this.b = str;
        this.c = z;
        this.d = j;
        this.e = x16Var;
        this.g = x16Var2;
        this.f = a26Var;
    }
}
