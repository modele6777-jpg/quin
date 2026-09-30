package defpackage;

import ai.askquin.R;
import androidx.compose.foundation.layout.b;
import androidx.compose.ui.node.LayoutNode;
import java.util.List;
import tech.chatmind.api.giftcard.GiftCardSku;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class we3 implements l26 {
    public final /* synthetic */ int a = 6;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object v;

    public /* synthetic */ we3(soa soaVar, boolean z, String str, boolean z2, az1 az1Var, l26 l26Var, x16 x16Var, int i) {
        this.g = soaVar;
        this.b = z;
        this.f = str;
        this.e = z2;
        this.d = az1Var;
        this.v = l26Var;
        this.c = x16Var;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        String strR;
        int i = this.a;
        wef wefVar = wef.a;
        Object obj3 = this.d;
        Object obj4 = this.v;
        Object obj5 = this.c;
        Object obj6 = this.g;
        Object obj7 = this.f;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                vf3.m((String) obj7, (j09) obj3, this.b, this.e, (x16) obj5, (String) obj6, (ke3) obj4, (l46) obj, k99.P(49));
                break;
            case 1:
                ((Integer) obj2).getClass();
                vfh.b((List) obj6, (List) obj4, this.b, (x16) obj5, (j09) obj3, this.e, (String) obj7, (l46) obj, k99.P(1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                pa6.r((GiftCardSku) obj6, (String) obj7, this.b, this.e, (v86) obj4, (x16) obj5, (j09) obj3, (l46) obj, k99.P(7));
                break;
            case 3:
                ((Integer) obj2).getClass();
                bm8.j(this.b, (a26) obj7, (j09) obj3, this.e, (ku6) obj6, (x4d) obj5, (dd2) obj4, (l46) obj, k99.P(14155777));
                break;
            case 4:
                ((Integer) obj2).getClass();
                x57.w((soa) obj6, this.b, (String) obj7, this.e, (az1) obj3, (l26) obj4, (x16) obj5, (l46) obj, k99.P(9));
                break;
            case 5:
                String str = (String) obj7;
                List list = (List) obj6;
                use useVar = (use) obj3;
                l26 l26Var = (l26) obj5;
                List list2 = (List) obj4;
                l46 l46Var = (l46) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!l46Var.W(iIntValue & 1, (iIntValue & 3) != 2)) {
                    l46Var.Z();
                } else {
                    g09 g09Var = g09.a;
                    j09 j09VarD0 = ynb.d0(0.0f, 0.0f, 0.0f, 16.0f, 7, ynb.b0(32.0f, 0.0f, mh3.L(mh3.N(b.c(g09Var, 1.0f))), 2));
                    c92 c92VarA = a92.a(xc0.c, ndb.Z, l46Var, 48);
                    int iHashCode = Long.hashCode(l46Var.T);
                    u8a u8aVarM = l46Var.m();
                    j09 j09VarJ = m93.J(l46Var, j09VarD0);
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
                    if (this.b) {
                        l46Var.f0(-2060042771);
                        hfc.a(48, l46Var, b.c(g09Var, 1.0f), str);
                        l46Var.r(false);
                    } else {
                        l46Var.f0(-2059873759);
                        j09 j09VarB = b.b(0.0f, 56.0f, b.c(g09Var, 1.0f), 1);
                        String strQ = afc.q(R.string.photo_start_reading, l46Var);
                        if (this.e) {
                            l46Var.f0(-2059647614);
                            int size = list.size();
                            ale.a.getClass();
                            strR = afc.r(R.string.photo_reading_cost, new Object[]{Integer.valueOf(pzd.k(size))}, l46Var);
                            l46Var.r(false);
                        } else {
                            l46Var.f0(-2059522375);
                            l46Var.r(false);
                            strR = null;
                        }
                        boolean z = !v4e.Q(useVar.d().c);
                        boolean zG = l46Var.g(l26Var) | l46Var.g(useVar) | l46Var.i(list2);
                        Object objR = l46Var.R();
                        if (zG || objR == sf2.a) {
                            objR = new n25(l26Var, useVar, list2, 25);
                            l46Var.p0(objR);
                        }
                        c8b.i(j09VarB, strQ, strR, null, 0L, 0.0f, z, null, null, false, null, null, (x16) objR, l46Var, 6, 0, 4024);
                        l46Var.r(false);
                    }
                    l46Var.r(true);
                }
                break;
            default:
                ((Integer) obj2).getClass();
                vd0.B((ale) obj7, this.b, this.e, (a26) obj6, (x16) obj5, (ii6) obj4, (j09) obj3, (l46) obj, k99.P(1));
                break;
        }
        return wefVar;
    }

    public /* synthetic */ we3(ale aleVar, boolean z, boolean z2, a26 a26Var, x16 x16Var, ii6 ii6Var, j09 j09Var, int i) {
        this.f = aleVar;
        this.b = z;
        this.e = z2;
        this.g = a26Var;
        this.c = x16Var;
        this.v = ii6Var;
        this.d = j09Var;
    }

    public /* synthetic */ we3(String str, j09 j09Var, boolean z, boolean z2, x16 x16Var, String str2, ke3 ke3Var, int i) {
        this.f = str;
        this.d = j09Var;
        this.b = z;
        this.e = z2;
        this.c = x16Var;
        this.g = str2;
        this.v = ke3Var;
    }

    public /* synthetic */ we3(List list, List list2, boolean z, x16 x16Var, j09 j09Var, boolean z2, String str, int i) {
        this.g = list;
        this.v = list2;
        this.b = z;
        this.c = x16Var;
        this.d = j09Var;
        this.e = z2;
        this.f = str;
    }

    public /* synthetic */ we3(GiftCardSku giftCardSku, String str, boolean z, boolean z2, v86 v86Var, x16 x16Var, j09 j09Var, int i) {
        this.g = giftCardSku;
        this.f = str;
        this.b = z;
        this.e = z2;
        this.v = v86Var;
        this.c = x16Var;
        this.d = j09Var;
    }

    public /* synthetic */ we3(boolean z, a26 a26Var, j09 j09Var, boolean z2, ku6 ku6Var, x4d x4dVar, dd2 dd2Var, int i) {
        this.b = z;
        this.f = a26Var;
        this.d = j09Var;
        this.e = z2;
        this.g = ku6Var;
        this.c = x4dVar;
        this.v = dd2Var;
    }

    public /* synthetic */ we3(boolean z, String str, boolean z2, List list, use useVar, l26 l26Var, List list2) {
        this.b = z;
        this.f = str;
        this.e = z2;
        this.g = list;
        this.d = useVar;
        this.c = l26Var;
        this.v = list2;
    }
}
