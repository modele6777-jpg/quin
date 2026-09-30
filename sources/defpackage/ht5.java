package defpackage;

import ai.askquin.R;
import androidx.compose.foundation.layout.b;
import androidx.compose.ui.node.LayoutNode;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ht5 implements n26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ x16 b;
    public final /* synthetic */ x16 c;

    public /* synthetic */ ht5(x16 x16Var, x16 x16Var2, int i) {
        this.a = i;
        this.b = x16Var;
        this.c = x16Var2;
    }

    @Override // defpackage.n26
    public final Object m(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        x16 x16Var = this.b;
        i8c i8cVar = sf2.a;
        g09 g09Var = g09.a;
        x16 x16Var2 = this.c;
        wef wefVar = wef.a;
        int i2 = 1;
        switch (i) {
            case 0:
                l46 l46Var = (l46) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((u7c) obj).getClass();
                if (!l46Var.W(iIntValue & 1, (iIntValue & 17) != 16)) {
                    l46Var.Z();
                } else {
                    bm8.h(this.b, null, false, null, null, vpf.b, l46Var, 1572864, 62);
                    bm8.h(this.c, null, false, null, null, vpf.c, l46Var, 1572864, 62);
                }
                break;
            case 1:
                l46 l46Var2 = (l46) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((u7c) obj).getClass();
                if (!l46Var2.W(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    l46Var2.Z();
                } else {
                    y6c y6cVar = a7c.a;
                    j09 j09VarE = oa7.E(g09Var, y6cVar);
                    boolean zG = l46Var2.g(x16Var);
                    Object objR = l46Var2.R();
                    if (zG || objR == i8cVar) {
                        objR = new c20(29, x16Var);
                        l46Var2.p0(objR);
                    }
                    bm8.h((x16) objR, j09VarE, false, null, null, y7h.e, l46Var2, 1572864, 60);
                    bm8.h(this.c, oa7.E(g09Var, y6cVar), false, null, null, y7h.f, l46Var2, 1572864, 60);
                }
                break;
            case 2:
                l46 l46Var3 = (l46) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((c31) obj).getClass();
                if (!l46Var3.W(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    l46Var3.Z();
                } else {
                    xdc.a(b.c, af1.b0(-284300085, new fi4(13, x16Var), l46Var3), af1.b0(-1980323444, new fi4(14, x16Var2), l46Var3), null, null, 0, y72.j, 0L, null, mh3.f, l46Var3, 806879670, 440);
                }
                break;
            case 3:
                l46 l46Var4 = (l46) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                ((u7c) obj).getClass();
                if (!l46Var4.W(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    l46Var4.Z();
                } else {
                    bm8.h(this.b, null, false, null, null, if9.e, l46Var4, 1572864, 62);
                    bm8.h(this.c, null, false, null, null, if9.f, l46Var4, 1572864, 62);
                }
                break;
            default:
                c31 c31Var = (c31) obj;
                l46 l46Var5 = (l46) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                c31Var.getClass();
                if ((iIntValue5 & 6) == 0) {
                    iIntValue5 |= l46Var5.g(c31Var) ? 4 : 2;
                }
                if (!l46Var5.W(iIntValue5 & 1, (iIntValue5 & 19) != 18)) {
                    l46Var5.Z();
                } else {
                    k8b.a(af1.b0(1335904081, new i4g(c31Var, i2), l46Var5), l46Var5, 6);
                    j09 j09VarZ = ynb.Z(b.c(g09Var, 1.0f), 32.0f);
                    jx0 jx0Var = ndb.Y;
                    c92 c92VarA = a92.a(xc0.c, jx0Var, l46Var5, 0);
                    int iHashCode = Long.hashCode(l46Var5.T);
                    u8a u8aVarM = l46Var5.m();
                    j09 j09VarJ = m93.J(l46Var5, j09VarZ);
                    lf2.q.getClass();
                    l46Var5.j0();
                    boolean z = l46Var5.S;
                    ov7 ov7Var = LayoutNode.h1;
                    if (z) {
                        l46Var5.l(ov7Var);
                    } else {
                        l46Var5.s0();
                    }
                    he2 he2Var = hj6.z;
                    dec.l(he2Var, l46Var5, c92VarA);
                    he2 he2Var2 = hj6.y;
                    dec.l(he2Var2, l46Var5, u8aVarM);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    he2 he2Var3 = hj6.X;
                    dec.l(he2Var3, l46Var5, numValueOf);
                    dec.k(l46Var5);
                    he2 he2Var4 = hj6.x;
                    dec.l(he2Var4, l46Var5, j09VarJ);
                    j09 j09VarC = b.c(g09Var, 1.0f);
                    c92 c92VarA2 = a92.a(new uc0(8.0f, true, new qc0(0)), jx0Var, l46Var5, 6);
                    int iHashCode2 = Long.hashCode(l46Var5.T);
                    u8a u8aVarM2 = l46Var5.m();
                    j09 j09VarJ2 = m93.J(l46Var5, j09VarC);
                    l46Var5.j0();
                    if (l46Var5.S) {
                        l46Var5.l(ov7Var);
                    } else {
                        l46Var5.s0();
                    }
                    dec.l(he2Var, l46Var5, c92VarA2);
                    dec.l(he2Var2, l46Var5, u8aVarM2);
                    ib8.s(iHashCode2, l46Var5, he2Var3, l46Var5);
                    dec.l(he2Var4, l46Var5, j09VarJ2);
                    String strQ = afc.q(R.string.widget_onboarding_popup_title, l46Var5);
                    mue mueVar = pue.a;
                    mue mueVarN = pue.n(l46Var5);
                    pr4 pr4Var = l8b.a;
                    nte.b(strQ, b.c(g09Var, 1.0f), ((e8b) l46Var5.k(pr4Var)).q, 0L, null, ((y8b) l46Var5.k(x8b.a)).a, 0L, null, new jme(3), 0L, 0, false, 0, 0, null, mueVarN, l46Var5, 48, 0, 129912);
                    nte.b(afc.q(R.string.widget_onboarding_popup_subtitle, l46Var5), b.c(g09Var, 1.0f), ((e8b) l46Var5.k(pr4Var)).r, 0L, null, null, 0L, null, new jme(3), 0L, 0, false, 0, 0, null, pue.e(l46Var5), l46Var5, 48, 0, 130040);
                    ib8.t(l46Var5, true, g09Var, 16.0f, l46Var5);
                    t4c.o(0, l46Var5);
                    o5c.f(l46Var5, b.d(g09Var, 24.0f));
                    j09 j09VarB = b.b(0.0f, 56.0f, b.c(g09Var, 1.0f), 1);
                    String strQ2 = afc.q(R.string.widget_onboarding_popup_cta, l46Var5);
                    boolean zG2 = l46Var5.g(x16Var2);
                    Object objR2 = l46Var5.R();
                    if (zG2 || objR2 == i8cVar) {
                        objR2 = new yca(20, x16Var2);
                        l46Var5.p0(objR2);
                    }
                    c8b.i(j09VarB, strQ2, null, null, 0L, 0.0f, false, null, null, false, null, null, (x16) objR2, l46Var5, 6, 0, 4092);
                    l46Var5.r(true);
                    c8b.h(ynb.d0(0.0f, 9.0f, 9.0f, 0.0f, 9, c31Var.a(g09Var, ndb.d)), false, 0L, 0L, null, this.b, l46Var5, 0, 30);
                }
                break;
        }
        return wefVar;
    }
}
