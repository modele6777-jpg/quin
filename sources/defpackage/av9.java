package defpackage;

import ai.askquin.R;
import ai.askquin.data.QuotaBlockReason;
import androidx.compose.foundation.layout.b;
import androidx.compose.ui.node.LayoutNode;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class av9 implements n26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ QuotaBlockReason b;
    public final /* synthetic */ x16 c;

    public /* synthetic */ av9(QuotaBlockReason quotaBlockReason, x16 x16Var, int i) {
        this.a = i;
        this.b = quotaBlockReason;
        this.c = x16Var;
    }

    @Override // defpackage.n26
    public final Object m(Object obj, Object obj2, Object obj3) {
        mue mueVarO;
        int i = this.a;
        wef wefVar = wef.a;
        QuotaBlockReason quotaBlockReason = this.b;
        int i2 = 0;
        switch (i) {
            case 0:
                l46 l46Var = (l46) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((mx7) obj).getClass();
                if (!l46Var.W(iIntValue & 1, (iIntValue & 17) != 16)) {
                    l46Var.Z();
                } else {
                    x57.z(null, quotaBlockReason, this.c, l46Var, 0);
                }
                break;
            default:
                l46 l46Var2 = (l46) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((d92) obj).getClass();
                if (!l46Var2.W(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    l46Var2.Z();
                } else {
                    g09 g09Var = g09.a;
                    j09 j09VarG = k8b.g(b.c(g09Var, 1.0f), new agb(i2), l46Var2, 6);
                    pr4 pr4Var = l8b.a;
                    j09 j09VarB0 = ynb.b0(k8b.f((e8b) l46Var2.k(pr4Var)) ? 0.0f : 20.0f, 0.0f, j09VarG, 2);
                    xn8 xn8VarC = s21.c(ndb.b, false);
                    int iHashCode = Long.hashCode(l46Var2.T);
                    u8a u8aVarM = l46Var2.m();
                    j09 j09VarJ = m93.J(l46Var2, j09VarB0);
                    lf2.q.getClass();
                    l46Var2.j0();
                    boolean z = l46Var2.S;
                    ov7 ov7Var = LayoutNode.h1;
                    if (z) {
                        l46Var2.l(ov7Var);
                    } else {
                        l46Var2.s0();
                    }
                    he2 he2Var = hj6.z;
                    dec.l(he2Var, l46Var2, xn8VarC);
                    he2 he2Var2 = hj6.y;
                    dec.l(he2Var2, l46Var2, u8aVarM);
                    Integer numValueOf = Integer.valueOf(iHashCode);
                    he2 he2Var3 = hj6.X;
                    dec.l(he2Var3, l46Var2, numValueOf);
                    dec.k(l46Var2);
                    he2 he2Var4 = hj6.x;
                    dec.l(he2Var4, l46Var2, j09VarJ);
                    j09 j09VarC = b.c(g09Var, 1.0f);
                    c92 c92VarA = a92.a(xc0.c, ndb.Z, l46Var2, 48);
                    int iHashCode2 = Long.hashCode(l46Var2.T);
                    u8a u8aVarM2 = l46Var2.m();
                    j09 j09VarJ2 = m93.J(l46Var2, j09VarC);
                    l46Var2.j0();
                    if (l46Var2.S) {
                        l46Var2.l(ov7Var);
                    } else {
                        l46Var2.s0();
                    }
                    dec.l(he2Var, l46Var2, c92VarA);
                    dec.l(he2Var2, l46Var2, u8aVarM2);
                    ib8.s(iHashCode2, l46Var2, he2Var3, l46Var2);
                    dec.l(he2Var4, l46Var2, j09VarJ2);
                    o5c.f(l46Var2, b.d(g09Var, 46.0f));
                    feg.j(od4.A(k8b.f((e8b) l46Var2.k(pr4Var)) ? R.drawable.ic_reading_locked_neo : R.drawable.ic_reading_locked, 0, l46Var2), null, b.l(g09Var, 120.0f), null, null, 0.0f, null, l46Var2, 440, 120);
                    o5c.f(l46Var2, b.d(g09Var, 8.0f));
                    int i3 = quotaBlockReason == null ? -1 : bgb.a[quotaBlockReason.ordinal()];
                    String strQ = afc.q(i3 != 1 ? i3 != 2 ? R.string.reading_locked_title : R.string.reading_locked_daily_limit_title : R.string.reading_locked_usage_empty_title, l46Var2);
                    if ((quotaBlockReason == null ? -1 : bgb.a[quotaBlockReason.ordinal()]) == 1) {
                        l46Var2.f0(1734467108);
                        mue mueVar = pue.a;
                        mueVarO = mue.a(pue.o(l46Var2), 0L, 0L, null, cr5.c, 0L, null, 0, 0L, null, null, 16777183);
                        l46Var2.r(false);
                    } else {
                        l46Var2.f0(1734469118);
                        mue mueVar2 = pue.a;
                        mueVarO = pue.o(l46Var2);
                        l46Var2.r(false);
                    }
                    nte.b(strQ, null, ((e8b) l46Var2.k(pr4Var)).q, 0L, null, null, 0L, null, new jme(3), 0L, 0, false, 0, 0, null, mueVarO, l46Var2, 0, 0, 130042);
                    o5c.f(l46Var2, b.d(g09Var, 8.0f));
                    int i4 = quotaBlockReason == null ? -1 : bgb.a[quotaBlockReason.ordinal()];
                    nte.b(afc.q(i4 != 1 ? i4 != 2 ? R.string.reading_locked_subtitle : R.string.reading_locked_daily_limit_subtitle : R.string.reading_locked_usage_empty_subtitle, l46Var2), null, ((e8b) l46Var2.k(pr4Var)).r, 0L, null, null, 0L, null, new jme(3), 0L, 0, false, 0, 0, null, pue.a, l46Var2, 0, 0, 130042);
                    l46 l46Var3 = l46Var2;
                    if (quotaBlockReason != QuotaBlockReason.DailyLimit) {
                        ib8.r(24.0f, 1656453823, l46Var3, l46Var3, g09Var);
                        nk8.i(afc.q((quotaBlockReason != null ? bgb.a[quotaBlockReason.ordinal()] : -1) == 1 ? R.string.reading_locked_usage_empty_cta : R.string.reading_locked_cta, l46Var3), this.c, null, 0.0f, 0.0f, 0.0f, false, null, null, new bx9(24.0f, 10.5f, 24.0f, 10.5f), false, l46Var3, 807075840, 6, 2460);
                        l46Var3 = l46Var3;
                        l46Var3.r(false);
                    } else {
                        l46Var3.f0(1656793056);
                        l46Var3.r(false);
                    }
                    o5c.f(l46Var3, b.d(g09Var, 46.0f));
                    l46Var3.r(true);
                    l46Var3.r(true);
                }
                break;
        }
        return wefVar;
    }
}
