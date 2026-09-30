package defpackage;

import ai.askquin.R;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.b;
import androidx.compose.ui.node.LayoutNode;
import tech.chatmind.api.giftcard.GiftCardSku;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class yu implements l26 {
    public final /* synthetic */ int a = 1;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public /* synthetic */ yu(b68 b68Var, GiftCardSku giftCardSku, String str, boolean z, long j) {
        this.d = b68Var;
        this.e = giftCardSku;
        this.f = str;
        this.b = z;
        this.c = j;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        int i;
        int i2;
        long j;
        int i3 = this.a;
        wef wefVar = wef.a;
        Object obj3 = this.f;
        Object obj4 = this.e;
        Object obj5 = this.d;
        switch (i3) {
            case 0:
                rvf rvfVar = (rvf) obj5;
                j09 j09Var = (j09) obj4;
                ul9 ul9Var = (ul9) obj3;
                l46 l46Var = (l46) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!l46Var.W(iIntValue & 1, (iIntValue & 3) != 2)) {
                    l46Var.Z();
                } else {
                    mh3.a(zg2.t.a(rvfVar), af1.b0(1260045569, new av(this.c, this.b, j09Var, ul9Var), l46Var), l46Var, 56);
                }
                break;
            default:
                b41 b41Var = (b41) obj5;
                GiftCardSku giftCardSku = (GiftCardSku) obj4;
                String str = (String) obj3;
                l46 l46Var2 = (l46) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (!l46Var2.W(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    l46Var2.Z();
                } else {
                    FillElement fillElement = b.c;
                    j09 j09VarN = g09.a;
                    if (b41Var != null) {
                        j09VarN = tm7.n(j09VarN, b41Var, null, 6);
                    }
                    j09 j09VarA0 = ynb.a0(fillElement.D(j09VarN), 24.0f, 16.0f);
                    c92 c92VarA = a92.a(new uc0(12.0f, true, new qc0(0)), ndb.Y, l46Var2, 6);
                    int iHashCode = Long.hashCode(l46Var2.T);
                    u8a u8aVarM = l46Var2.m();
                    j09 j09VarJ = m93.J(l46Var2, j09VarA0);
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
                    if (giftCardSku == GiftCardSku.OneYear) {
                        i = 1366040544;
                        i2 = R.string.gift_card_year_option;
                    } else {
                        i = 1366042465;
                        i2 = R.string.gift_card_month_option;
                    }
                    String strI = tec.i(l46Var2, i, i2, l46Var2, false);
                    pr4 pr4Var = l8b.a;
                    long j2 = ((e8b) l46Var2.k(pr4Var)).q;
                    mue mueVar = pue.a;
                    nte.b(strI, null, j2, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mue.a(pue.o(l46Var2), 0L, 0L, null, cr5.c, 0L, null, 0, 0L, null, null, 16777183), l46Var2, 0, 0, 131066);
                    if (str == null) {
                        str = "—";
                    }
                    String str2 = str;
                    if (this.b) {
                        l46Var2.f0(1366050045);
                        l46Var2.r(false);
                        j = this.c;
                    } else {
                        l46Var2.f0(1366050820);
                        j = ((e8b) l46Var2.k(pr4Var)).t;
                        l46Var2.r(false);
                    }
                    long j3 = j;
                    mue mueVar2 = oue.a;
                    nte.b(str2, null, j3, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, pue.d(l46Var2), l46Var2, 0, 0, 131066);
                    l46Var2.r(true);
                }
                break;
        }
        return wefVar;
    }

    public /* synthetic */ yu(rvf rvfVar, long j, boolean z, j09 j09Var, ul9 ul9Var) {
        this.d = rvfVar;
        this.c = j;
        this.b = z;
        this.e = j09Var;
        this.f = ul9Var;
    }
}
