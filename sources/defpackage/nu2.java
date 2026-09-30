package defpackage;

import ai.askquin.R;
import ai.askquin.ui.router.GiftCardPerspective;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.platform.b;
import tech.chatmind.api.seasonal.model.SolarTerm;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class nu2 implements l26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ nu2(pod podVar, boolean z) {
        this.a = 5;
        this.c = podVar;
        this.b = z;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        int i;
        int i2;
        l46 l46Var;
        int i3 = this.a;
        g09 g09Var = g09.a;
        wef wefVar = wef.a;
        Object obj3 = this.c;
        boolean z = this.b;
        switch (i3) {
            case 0:
                ((Integer) obj2).getClass();
                lmg.L((cre) obj3, z, (l46) obj, k99.P(1));
                break;
            case 1:
                GiftCardPerspective giftCardPerspective = (GiftCardPerspective) obj3;
                l46 l46Var2 = (l46) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!l46Var2.W(iIntValue & 1, (iIntValue & 3) != 2)) {
                    l46Var2.Z();
                } else {
                    if (z) {
                        i = 251907915;
                        i2 = R.string.gift_card_title;
                    } else if (giftCardPerspective == GiftCardPerspective.Sent) {
                        i = 251911569;
                        i2 = R.string.gift_card_detail_sent;
                    } else {
                        i = 251913781;
                        i2 = R.string.gift_card_detail_received;
                    }
                    nte.b(tec.i(l46Var2, i, i2, l46Var2, false), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, l46Var2, 0, 0, 262142);
                }
                break;
            case 2:
                h73 h73Var = (h73) obj3;
                l46 l46Var3 = (l46) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (!l46Var3.W(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    l46Var3.Z();
                } else {
                    j09 j09VarC0 = ynb.c0(g09Var, (z ? 6.0f : 0.0f) + 12.0f, 12.0f, (z ? 0.0f : 6.0f) + 12.0f, 12.0f);
                    xn8 xn8VarC = s21.c(ndb.f, false);
                    int iHashCode = Long.hashCode(l46Var3.T);
                    u8a u8aVarM = l46Var3.m();
                    j09 j09VarJ = m93.J(l46Var3, j09VarC0);
                    lf2.q.getClass();
                    l46Var3.j0();
                    if (l46Var3.S) {
                        l46Var3.l(LayoutNode.h1);
                    } else {
                        l46Var3.s0();
                    }
                    dec.l(hj6.z, l46Var3, xn8VarC);
                    dec.l(hj6.y, l46Var3, u8aVarM);
                    dec.l(hj6.X, l46Var3, Integer.valueOf(iHashCode));
                    dec.k(l46Var3);
                    dec.l(hj6.x, l46Var3, j09VarJ);
                    String strQ = afc.q(h73Var == h73.a ? R.string.home_daily_fortune_tooltip_today : R.string.home_daily_fortune_tooltip_tomorrow, l46Var3);
                    j09 j09VarA = b.a(g09Var, "daily_fortune_tooltip_text");
                    Object objR = l46Var3.R();
                    if (objR == sf2.a) {
                        objR = new tk6(14);
                        l46Var3.p0(objR);
                    }
                    j09 j09VarB = vwc.b(j09VarA, false, (a26) objR);
                    mue mueVar = pue.a;
                    nte.b(strQ, j09VarB, ((e8b) l46Var3.k(l8b.a)).v, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, pue.j(l46Var3), l46Var3, 0, 0, 131064);
                    l46Var3.r(true);
                }
                break;
            case 3:
                ((Integer) obj2).getClass();
                oa7.f((bwa) obj3, z, g09Var, (l46) obj, k99.P(1));
                break;
            case 4:
                SolarTerm solarTerm = (SolarTerm) obj3;
                l46 l46Var4 = (l46) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (!l46Var4.W(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    l46Var4.Z();
                } else {
                    if (z) {
                        l46Var4.f0(-474820156);
                        nte.b(afc.q(z7c.p(solarTerm), l46Var4), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, l46Var4, 0, 0, 262142);
                        l46Var = l46Var4;
                    } else {
                        l46Var = l46Var4;
                        l46Var.f0(-1834482584);
                    }
                    l46Var.r(false);
                }
                break;
            case 5:
                sn4 sn4Var = (sn4) obj;
                uod uodVar = uod.a;
                sn4.w0(sn4Var, ((pod) obj3).a(z, true), sn4Var.p0(uod.b) / 2.0f, ((hl9) obj2).a, null, 120);
                break;
            default:
                wp9 wp9Var = (wp9) obj3;
                l46 l46Var5 = (l46) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (!l46Var5.W(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    l46Var5.Z();
                } else if (z && wp9Var.c) {
                    l46Var5.f0(-424331949);
                    xo1.f(0.0f, 0.0f, wp9Var.a, wp9Var.b, 0, 0L, 0L, l46Var5, null);
                    l46Var5.r(false);
                } else {
                    l46Var5.f0(-424247381);
                    l46Var5.r(false);
                }
                break;
        }
        return wefVar;
    }

    public /* synthetic */ nu2(int i, int i2, Object obj, boolean z) {
        this.a = i2;
        this.c = obj;
        this.b = z;
    }

    public /* synthetic */ nu2(boolean z, Object obj, int i) {
        this.a = i;
        this.b = z;
        this.c = obj;
    }
}
