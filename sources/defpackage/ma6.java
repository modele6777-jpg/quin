package defpackage;

import androidx.compose.ui.node.LayoutNode;
import java.util.List;
import tech.chatmind.api.giftcard.GiftCardItem;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ma6 implements o26 {
    public final /* synthetic */ List a;
    public final /* synthetic */ p86 b;
    public final /* synthetic */ a26 c;
    public final /* synthetic */ boolean d;

    public ma6(List list, p86 p86Var, a26 a26Var, boolean z) {
        this.a = list;
        this.b = p86Var;
        this.c = a26Var;
        this.d = z;
    }

    @Override // defpackage.o26
    public final Object t(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        mx7 mx7Var = (mx7) obj;
        int iIntValue = ((Number) obj2).intValue();
        l46 l46Var = (l46) obj3;
        int iIntValue2 = ((Number) obj4).intValue();
        if ((iIntValue2 & 6) == 0) {
            i = (l46Var.g(mx7Var) ? 4 : 2) | iIntValue2;
        } else {
            i = iIntValue2;
        }
        if ((iIntValue2 & 48) == 0) {
            i |= l46Var.e(iIntValue) ? 32 : 16;
        }
        if (l46Var.W(i & 1, (i & 147) != 146)) {
            GiftCardItem giftCardItem = (GiftCardItem) this.a.get(iIntValue);
            l46Var.f0(1740383081);
            c92 c92VarA = a92.a(xc0.c, ndb.Y, l46Var, 0);
            int iHashCode = Long.hashCode(l46Var.T);
            u8a u8aVarM = l46Var.m();
            j09 j09VarJ = m93.J(l46Var, g09.a);
            lf2.q.getClass();
            l46Var.j0();
            if (l46Var.S) {
                l46Var.l(LayoutNode.h1);
            } else {
                l46Var.s0();
            }
            dec.l(hj6.z, l46Var, c92VarA);
            dec.l(hj6.y, l46Var, u8aVarM);
            dec.l(hj6.X, l46Var, Integer.valueOf(iHashCode));
            dec.k(l46Var);
            dec.l(hj6.x, l46Var, j09VarJ);
            p86 p86Var = this.b;
            wa6 wa6Var = p86Var.a;
            a26 a26Var = this.c;
            boolean zG = l46Var.g(a26Var) | l46Var.i(giftCardItem);
            Object objR = l46Var.R();
            if (zG || objR == sf2.a) {
                objR = new n5(a26Var, giftCardItem, false, 11);
                l46Var.p0(objR);
            }
            x76.b(giftCardItem, wa6Var, (x16) objR, l46Var, GiftCardItem.$stable);
            if (!this.d || iIntValue >= t72.E(p86Var.b)) {
                l46Var.f0(-470014454);
                l46Var.r(false);
            } else {
                l46Var.f0(-470055777);
                jgb.t(0, 1, l46Var, null);
                l46Var.r(false);
            }
            l46Var.r(true);
            l46Var.r(false);
        } else {
            l46Var.Z();
        }
        return wef.a;
    }
}
