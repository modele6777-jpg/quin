package defpackage;

import ai.askquin.R;
import androidx.compose.foundation.layout.b;
import androidx.compose.ui.node.LayoutNode;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ci1 implements l26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;

    public /* synthetic */ ci1(boolean z, int i) {
        this.a = i;
        this.b = z;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        l46 l46Var;
        l46 l46Var2;
        int i = this.a;
        g09 g09Var = g09.a;
        wef wefVar = wef.a;
        boolean z = this.b;
        switch (i) {
            case 0:
                l46 l46Var3 = (l46) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!l46Var3.W(iIntValue & 1, (iIntValue & 3) != 2)) {
                    l46Var3.Z();
                } else {
                    gu6.b(od4.A(z ? R.drawable.ic_photo_flash_on : R.drawable.ic_photo_flash_off, 0, l46Var3), null, b.l(g09Var, 20.0f), y72.e, l46Var3, 3512, 0);
                }
                break;
            case 1:
                l46 l46Var4 = (l46) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (!l46Var4.W(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    l46Var4.Z();
                } else {
                    kj0.i(0, 1, l46Var4, null, z);
                }
                break;
            case 2:
                l46 l46Var5 = (l46) obj;
                int iIntValue3 = ((Integer) obj2).intValue();
                if (!l46Var5.W(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    l46Var5.Z();
                } else {
                    kj0.i(6, 0, l46Var5, ynb.Z(g09Var, 8.0f), z);
                }
                break;
            case 3:
                l46 l46Var6 = (l46) obj;
                int iIntValue4 = ((Integer) obj2).intValue();
                if (!l46Var6.W(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    l46Var6.Z();
                } else {
                    db6.b(0, l46Var6, null, z);
                }
                break;
            case 4:
                l46 l46Var7 = (l46) obj;
                int iIntValue5 = ((Integer) obj2).intValue();
                if (!l46Var7.W(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    l46Var7.Z();
                } else {
                    if (z) {
                        l46Var7.f0(206498028);
                        nte.b(afc.q(R.string.alert_exit_desc, l46Var7), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, l46Var7, 0, 0, 262142);
                        l46Var = l46Var7;
                    } else {
                        l46Var = l46Var7;
                        l46Var.f0(2106515780);
                    }
                    l46Var.r(false);
                }
                break;
            case 5:
                l46 l46Var8 = (l46) obj;
                int iIntValue6 = ((Integer) obj2).intValue();
                if (!l46Var8.W(iIntValue6 & 1, (iIntValue6 & 3) != 2)) {
                    l46Var8.Z();
                } else {
                    t7c t7cVarA = s7c.a(new uc0(4.0f, true, new qc0(0)), ndb.z, l46Var8, 54);
                    int iHashCode = Long.hashCode(l46Var8.T);
                    u8a u8aVarM = l46Var8.m();
                    j09 j09VarJ = m93.J(l46Var8, g09Var);
                    lf2.q.getClass();
                    l46Var8.j0();
                    if (l46Var8.S) {
                        l46Var8.l(LayoutNode.h1);
                    } else {
                        l46Var8.s0();
                    }
                    dec.l(hj6.z, l46Var8, t7cVarA);
                    dec.l(hj6.y, l46Var8, u8aVarM);
                    dec.l(hj6.X, l46Var8, Integer.valueOf(iHashCode));
                    dec.k(l46Var8);
                    dec.l(hj6.x, l46Var8, j09VarJ);
                    gu6.b(od4.A(R.drawable.ic_shuffle_again, 0, l46Var8), null, null, ((y72) l46Var8.k(em2.a)).a, l46Var8, 56, 4);
                    nte.b(afc.q(z ? R.string.draw_card_cut : R.string.draw_card_shuffle, l46Var8), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, l46Var8, 0, 0, 262142);
                    l46Var8.r(true);
                }
                break;
            case 6:
                l46 l46Var9 = (l46) obj;
                int iIntValue7 = ((Integer) obj2).intValue();
                if (!l46Var9.W(iIntValue7 & 1, (iIntValue7 & 3) != 2)) {
                    l46Var9.Z();
                } else if (!z) {
                    l46Var9.f0(1494406464);
                    l46Var9.r(false);
                } else {
                    l46Var9.f0(1494319974);
                    xo1.f(0.0f, 0.0f, 1, 3, 54, 0L, 0L, l46Var9, null);
                    l46Var9.r(false);
                }
                break;
            case 7:
                l46 l46Var10 = (l46) obj;
                int iIntValue8 = ((Integer) obj2).intValue();
                if (!l46Var10.W(iIntValue8 & 1, (iIntValue8 & 3) != 2)) {
                    l46Var10.Z();
                } else {
                    gu6.a(z ? ok8.y() : af1.X(), null, null, ((e8b) l46Var10.k(l8b.a)).q, l46Var10, 48, 4);
                }
                break;
            case 8:
                l46 l46Var11 = (l46) obj;
                int iIntValue9 = ((Integer) obj2).intValue();
                if (!l46Var11.W(iIntValue9 & 1, (iIntValue9 & 3) != 2)) {
                    l46Var11.Z();
                } else if (!z) {
                    l46Var11.f0(-701800231);
                    l46Var11.r(false);
                } else {
                    l46Var11.f0(-701881916);
                    lmg.I(null, 5, 5, 0.0f, 0.0f, 0L, l46Var11, 432, 57);
                    l46Var11.r(false);
                }
                break;
            case 9:
                ((Integer) obj2).getClass();
                jzb.c(k99.P(1), (l46) obj, z);
                break;
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                ((Integer) obj2).getClass();
                p8c.j(k99.P(1), (l46) obj, z);
                break;
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                l46 l46Var12 = (l46) obj;
                int iIntValue10 = ((Integer) obj2).intValue();
                if (!l46Var12.W(iIntValue10 & 1, (iIntValue10 & 3) != 2)) {
                    l46Var12.Z();
                } else {
                    if (z) {
                        l46Var12.f0(-1655389800);
                        xo1.f(0.0f, 0.0f, 2, 3, 54, 0L, 0L, l46Var12, null);
                        l46Var2 = l46Var12;
                    } else {
                        l46Var2 = l46Var12;
                        l46Var2.f0(222581414);
                    }
                    l46Var2.r(false);
                }
                break;
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                ((Integer) obj2).getClass();
                b7e.d(k99.P(1), (l46) obj, z);
                break;
            default:
                ((Integer) obj2).getClass();
                b7e.c(k99.P(1), (l46) obj, z);
                break;
        }
        return wefVar;
    }

    public /* synthetic */ ci1(boolean z, int i, int i2) {
        this.a = i2;
        this.b = z;
    }
}
