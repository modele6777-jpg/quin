package defpackage;

import ai.askquin.R;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.b;
import androidx.compose.ui.node.LayoutNode;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class np1 implements l26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ x16 c;
    public final /* synthetic */ x16 d;

    public /* synthetic */ np1(x16 x16Var, x16 x16Var2, boolean z) {
        this.a = 2;
        this.c = x16Var;
        this.d = x16Var2;
        this.b = z;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        int i = this.a;
        x16 x16Var = this.d;
        x16 x16Var2 = this.c;
        wef wefVar = wef.a;
        boolean z = this.b;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                pp1.a(k99.P(1), x16Var2, x16Var, (l46) obj, z);
                break;
            case 1:
                ((Integer) obj2).getClass();
                ynb.h(k99.P(1), x16Var2, x16Var, (l46) obj, z);
                break;
            case 2:
                l46 l46Var = (l46) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!l46Var.W(iIntValue & 1, (iIntValue & 3) != 2)) {
                    l46Var.Z();
                } else {
                    FillElement fillElement = b.c;
                    xn8 xn8VarC = s21.c(ndb.b, false);
                    int iHashCode = Long.hashCode(l46Var.T);
                    u8a u8aVarM = l46Var.m();
                    j09 j09VarJ = m93.J(l46Var, fillElement);
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
                    dec.l(he2Var, l46Var, xn8VarC);
                    he2 he2Var2 = hj6.y;
                    dec.l(he2Var2, l46Var, u8aVarM);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    he2 he2Var3 = hj6.X;
                    dec.l(he2Var3, l46Var, numValueOf);
                    dec.k(l46Var);
                    he2 he2Var4 = hj6.x;
                    dec.l(he2Var4, l46Var, j09VarJ);
                    k8b.a(hkg.b, l46Var, 6);
                    j09 j09VarZ = ynb.Z(fillElement, 32.0f);
                    jx0 jx0Var = ndb.Z;
                    c92 c92VarA = a92.a(new uc0(24.0f, true, new qc0(0)), jx0Var, l46Var, 54);
                    int iHashCode2 = Long.hashCode(l46Var.T);
                    u8a u8aVarM2 = l46Var.m();
                    j09 j09VarJ2 = m93.J(l46Var, j09VarZ);
                    l46Var.j0();
                    if (l46Var.S) {
                        l46Var.l(ov7Var);
                    } else {
                        l46Var.s0();
                    }
                    dec.l(he2Var, l46Var, c92VarA);
                    dec.l(he2Var2, l46Var, u8aVarM2);
                    ib8.s(iHashCode2, l46Var, he2Var3, l46Var);
                    dec.l(he2Var4, l46Var, j09VarJ2);
                    c92 c92VarA2 = a92.a(xc0.c, jx0Var, l46Var, 48);
                    int iHashCode3 = Long.hashCode(l46Var.T);
                    u8a u8aVarM3 = l46Var.m();
                    g09 g09Var = g09.a;
                    j09 j09VarJ3 = m93.J(l46Var, g09Var);
                    l46Var.j0();
                    if (l46Var.S) {
                        l46Var.l(ov7Var);
                    } else {
                        l46Var.s0();
                    }
                    dec.l(he2Var, l46Var, c92VarA2);
                    dec.l(he2Var2, l46Var, u8aVarM3);
                    ib8.s(iHashCode3, l46Var, he2Var3, l46Var);
                    dec.l(he2Var4, l46Var, j09VarJ3);
                    feg.j(od4.A(z ? R.drawable.gift_card_guide_neo : R.drawable.gift_card_guide, 0, l46Var), null, androidx.compose.ui.platform.b.a(b.m(g09Var, 280.0f, 200.0f), "gift_card_guide_art"), null, null, 0.0f, null, l46Var, 440, 120);
                    String strQ = afc.q(R.string.gift_card_guide_title, l46Var);
                    mue mueVar = pue.a;
                    mue mueVarA = mue.a(pue.n(l46Var), 0L, 0L, null, cr5.c, 0L, null, 0, 0L, null, null, 16777183);
                    pr4 pr4Var = l8b.a;
                    nte.b(strQ, androidx.compose.ui.platform.b.a(b.c(g09Var, 1.0f), "gift_card_guide_title"), ((e8b) l46Var.k(pr4Var)).q, 0L, null, null, 0L, null, new jme(3), 0L, 0, false, 0, 0, null, mueVarA, l46Var, 48, 0, 130040);
                    String strQ2 = afc.q(R.string.gift_card_guide_subtitle, l46Var);
                    mue mueVar2 = oue.a;
                    nte.b(strQ2, androidx.compose.ui.platform.b.a(ynb.d0(0.0f, 8.0f, 0.0f, 0.0f, 13, b.c(g09Var, 1.0f)), "gift_card_guide_subtitle"), ((e8b) l46Var.k(pr4Var)).r, 0L, null, null, 0L, null, new jme(3), 0L, 0, false, 0, 0, null, pue.e(l46Var), l46Var, 48, 0, 130040);
                    l46Var.r(true);
                    c8b.i(androidx.compose.ui.platform.b.a(b.d(b.c(g09Var, 1.0f), 56.0f), "gift_card_guide_cta"), afc.q(R.string.gift_card_guide_cta, l46Var), null, null, 0L, 0.0f, false, null, null, false, null, null, this.d, l46Var, 6, 0, 4092);
                    l46Var.r(true);
                    bm8.h(this.c, androidx.compose.ui.platform.b.a(b.l(ynb.Z(d31.a.a(g09Var, ndb.d), 2.0f), 48.0f), "gift_card_guide_close"), false, null, null, hkg.c, l46Var, 1572864, 60);
                    l46Var.r(true);
                }
                break;
            case 3:
                l46 l46Var2 = (l46) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (!l46Var2.W(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    l46Var2.Z();
                } else if (!z) {
                    l46Var2.f0(1665271028);
                    t72.a(x16Var2, x16Var, l46Var2, 0);
                    l46Var2.r(false);
                } else {
                    l46Var2.f0(1665193683);
                    t72.e(x16Var2, x16Var, l46Var2, 0);
                    l46Var2.r(false);
                }
                break;
            case 4:
                ((Integer) obj2).getClass();
                xxb.b(k99.P(1), x16Var2, x16Var, (l46) obj, z);
                break;
            default:
                l46 l46Var3 = (l46) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (!l46Var3.W(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    l46Var3.Z();
                } else {
                    xxb.b(0, x16Var2, x16Var, l46Var3, z);
                }
                break;
        }
        return wefVar;
    }

    public /* synthetic */ np1(x16 x16Var, x16 x16Var2, boolean z, int i) {
        this.a = 0;
        this.c = x16Var;
        this.d = x16Var2;
        this.b = z;
    }

    public /* synthetic */ np1(boolean z, x16 x16Var, x16 x16Var2, int i) {
        this.a = i;
        this.b = z;
        this.c = x16Var;
        this.d = x16Var2;
    }

    public /* synthetic */ np1(boolean z, x16 x16Var, x16 x16Var2, int i, int i2) {
        this.a = i2;
        this.b = z;
        this.c = x16Var;
        this.d = x16Var2;
    }
}
