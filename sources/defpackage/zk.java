package defpackage;

import ai.askquin.R;
import androidx.compose.foundation.layout.b;
import androidx.compose.ui.node.LayoutNode;
import java.util.ArrayList;
import tech.chatmind.api.giftcard.GiftCardItem;
import tech.chatmind.api.giftcard.GiftCardSku;
import tech.chatmind.api.giftcard.GiftCardStatus;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zk implements n26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ zk(Object obj, boolean z, int i) {
        this.a = i;
        this.c = obj;
        this.b = z;
    }

    @Override // defpackage.n26
    public final Object m(Object obj, Object obj2, Object obj3) {
        k00 k00Var;
        e89 e89Var;
        long j;
        int i = this.a;
        pzd pzdVar = ale.a;
        ov7 ov7Var = LayoutNode.h1;
        g09 g09Var = g09.a;
        wef wefVar = wef.a;
        boolean z = this.b;
        Object obj4 = this.c;
        switch (i) {
            case 0:
                h0e h0eVar = (h0e) obj4;
                d92 d92Var = (d92) obj;
                l46 l46Var = (l46) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                d92Var.getClass();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= l46Var.g(d92Var) ? 4 : 2;
                }
                if (l46Var.W(iIntValue & 1, (iIntValue & 19) != 18)) {
                    g09 g09Var2 = g09.a;
                    int i2 = iIntValue & 14;
                    vd0.q(d92Var, ynb.d0(0.0f, 0.0f, 120.0f, 0.0f, 11, g09Var2), afc.q(z ? R.string.divintation_self_selected_spread : R.string.divintation_ai_spread_recommend, l46Var), l46Var, i2 | 48, 0);
                    dvd dvdVar = (dvd) h0eVar.getValue();
                    if (dvdVar instanceof ale) {
                        l46Var.f0(1286621251);
                        ale aleVar = (ale) dvdVar;
                        int iE = aleVar.e();
                        pzdVar.getClass();
                        String strB = pzd.g(iE).b(l46Var);
                        i00 i00Var = new i00();
                        i00Var.f(aleVar.b(l46Var));
                        int iK = i00Var.k(new xtd(((e8b) l46Var.k(l8b.a)).t, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 65534));
                        try {
                            i00Var.f("（" + strB + "）");
                            i00Var.h(iK);
                            k00Var = i00Var.l();
                            l46Var.r(false);
                        } catch (Throwable th) {
                            i00Var.h(iK);
                            throw th;
                        }
                    } else {
                        l46Var.f0(1287016873);
                        StringBuilder sb = new StringBuilder(16);
                        new ArrayList();
                        ArrayList arrayList = new ArrayList();
                        new ArrayList();
                        sb.append(dvdVar.b(l46Var));
                        String string = sb.toString();
                        ArrayList arrayList2 = new ArrayList(arrayList.size());
                        int size = arrayList.size();
                        for (int i3 = 0; i3 < size; i3++) {
                            arrayList2.add(((h00) arrayList.get(i3)).a(sb.length()));
                        }
                        k00Var = new k00(string, arrayList2);
                        l46Var.r(false);
                    }
                    vd0.o(d92Var, null, k00Var, l46Var, i2);
                    feg.j(od4.A(k8b.f((e8b) l46Var.k(l8b.a)) ? ((dvd) h0eVar.getValue()).c() : ((dvd) h0eVar.getValue()).a(), 0, l46Var), null, b.c(ynb.b0(0.0f, 20.0f, b.d(g09Var2, 140.0f), 1), 1.0f), null, null, 0.0f, null, l46Var, 440, 120);
                } else {
                    l46Var.Z();
                }
                return wefVar;
            case 1:
                ii6 ii6Var = (ii6) obj4;
                j09 j09VarP = (j09) obj;
                l46 l46Var2 = (l46) obj2;
                ((Integer) obj3).getClass();
                j09VarP.getClass();
                l46Var2.f0(-2036189233);
                if (z) {
                    j09VarP = g21.P(j09VarP, ii6Var);
                }
                l46Var2.r(false);
                return j09VarP;
            case 2:
                a26 a26Var = (a26) obj4;
                l46 l46Var3 = (l46) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((d92) obj).getClass();
                if (!l46Var3.W(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    l46Var3.Z();
                    return wefVar;
                }
                Object objR = l46Var3.R();
                i8c i8cVar = sf2.a;
                if (objR == i8cVar) {
                    objR = q1c.f(Boolean.TRUE);
                    l46Var3.p0(objR);
                }
                e89 e89Var2 = (e89) objR;
                j09 j09VarZ = ynb.Z(tm7.o(oa7.E(k8b.g(b.c(g09Var, 1.0f), new ie2(12), l46Var3, 6), a7c.b(eze.a(l46Var3).a.d)), ((e8b) l46Var3.k(l8b.a)).c, g21.f), 16.0f);
                xn8 xn8VarC = s21.c(ndb.b, false);
                int iHashCode = Long.hashCode(l46Var3.T);
                u8a u8aVarM = l46Var3.m();
                j09 j09VarJ = m93.J(l46Var3, j09VarZ);
                lf2.q.getClass();
                l46Var3.j0();
                if (l46Var3.S) {
                    l46Var3.l(ov7Var);
                } else {
                    l46Var3.s0();
                }
                he2 he2Var = hj6.z;
                dec.l(he2Var, l46Var3, xn8VarC);
                he2 he2Var2 = hj6.y;
                dec.l(he2Var2, l46Var3, u8aVarM);
                Integer numValueOf = Integer.valueOf(iHashCode);
                he2 he2Var3 = hj6.X;
                dec.l(he2Var3, l46Var3, numValueOf);
                dec.k(l46Var3);
                he2 he2Var4 = hj6.x;
                dec.l(he2Var4, l46Var3, j09VarJ);
                j09 j09VarD0 = ynb.d0(0.0f, 32.0f, 0.0f, 0.0f, 13, b.r(b.c(g09Var, 1.0f)));
                c92 c92VarA = a92.a(new uc0(12.0f, true, new qc0(0)), ndb.Z, l46Var3, 54);
                int iHashCode2 = Long.hashCode(l46Var3.T);
                u8a u8aVarM2 = l46Var3.m();
                j09 j09VarJ2 = m93.J(l46Var3, j09VarD0);
                l46Var3.j0();
                if (l46Var3.S) {
                    l46Var3.l(ov7Var);
                } else {
                    l46Var3.s0();
                }
                dec.l(he2Var, l46Var3, c92VarA);
                dec.l(he2Var2, l46Var3, u8aVarM2);
                ib8.s(iHashCode2, l46Var3, he2Var3, l46Var3);
                dec.l(he2Var4, l46Var3, j09VarJ2);
                String strQ = afc.q(R.string.draw_cut_tips_message, l46Var3);
                mue mueVar = pue.a;
                nte.b(strQ, null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, pue.n(l46Var3), l46Var3, 0, 0, 131070);
                vd0.h(0, l46Var3);
                j09 j09VarB = b.b(0.0f, 56.0f, b.c(g09Var, 1.0f), 1);
                String strQ2 = afc.q(R.string.done, l46Var3);
                boolean zH = l46Var3.h(z) | l46Var3.g(a26Var);
                Object objR2 = l46Var3.R();
                if (zH || objR2 == i8cVar) {
                    e89Var = e89Var2;
                    objR2 = new va4(z, a26Var, e89Var, 1);
                    l46Var3.p0(objR2);
                } else {
                    e89Var = e89Var2;
                }
                c8b.b(j09VarB, strQ2, false, null, 0L, (x16) objR2, l46Var3, 6);
                t7c t7cVarA = s7c.a(xc0.a, ndb.z, l46Var3, 48);
                int iHashCode3 = Long.hashCode(l46Var3.T);
                u8a u8aVarM3 = l46Var3.m();
                j09 j09VarJ3 = m93.J(l46Var3, g09Var);
                l46Var3.j0();
                if (l46Var3.S) {
                    l46Var3.l(ov7Var);
                } else {
                    l46Var3.s0();
                }
                dec.l(he2Var, l46Var3, t7cVarA);
                dec.l(he2Var2, l46Var3, u8aVarM3);
                ib8.s(iHashCode3, l46Var3, he2Var3, l46Var3);
                dec.l(he2Var4, l46Var3, j09VarJ3);
                boolean zBooleanValue = ((Boolean) e89Var.getValue()).booleanValue();
                Object objR3 = l46Var3.R();
                if (objR3 == i8cVar) {
                    objR3 = new ok3(e89Var, 12);
                    l46Var3.p0(objR3);
                }
                m93.n(zBooleanValue, (x16) objR3, null, false, null, l46Var3, 48);
                nte.b(afc.q(R.string.draw_card_don_t_show_tips_again, l46Var3), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, l46Var3, 0, 0, 262142);
                l46Var3.r(true);
                l46Var3.r(true);
                j09 j09VarD1 = ynb.d0(0.0f, 9.0f, 9.0f, 0.0f, 9, d31.a.a(g09Var, ndb.d));
                boolean zG = l46Var3.g(a26Var);
                Object objR4 = l46Var3.R();
                if (zG || objR4 == i8cVar) {
                    objR4 = new rj2(a26Var, e89Var, 2);
                    l46Var3.p0(objR4);
                }
                c8b.h(j09VarD1, false, 0L, 0L, null, (x16) objR4, l46Var3, 0, 30);
                l46Var3.r(true);
                return wefVar;
            case 3:
                GiftCardItem giftCardItem = (GiftCardItem) obj4;
                l46 l46Var4 = (l46) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((mx7) obj).getClass();
                if (l46Var4.W(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    GiftCardSku sku = giftCardItem.getSku();
                    String nickname = giftCardItem.getNickname();
                    String fromNickname = giftCardItem.getFromNickname();
                    String blessing = giftCardItem.getBlessing();
                    if (blessing == null) {
                        blessing = "";
                    }
                    x76.c(sku, nickname, fromNickname, blessing, giftCardItem.getShareUrl(), giftCardItem.getStatus() != GiftCardStatus.Invalidated, androidx.compose.ui.platform.b.a(b.c(g09Var, 1.0f), "gift_card_success_preview"), z && (giftCardItem.getStatus() == GiftCardStatus.Claimed || giftCardItem.getStatus() == GiftCardStatus.Expired), l46Var4, 1572864, 0);
                } else {
                    l46Var4.Z();
                }
                return wefVar;
            case 4:
                h73 h73Var = (h73) obj4;
                l46 l46Var5 = (l46) obj2;
                int iIntValue4 = ((Integer) obj3).intValue();
                ((oz) obj).getClass();
                if (l46Var5.W(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    pr4 pr4Var = l8b.a;
                    boolean zF = k8b.f((e8b) l46Var5.k(pr4Var));
                    float f = no6.b;
                    j09 j09VarF = b.f(44.0f, 0.0f, g09Var, 2);
                    d93 d93Var = new d93(z);
                    if (zF) {
                        l46Var5.f0(-769335106);
                        j = ((e8b) l46Var5.k(pr4Var)).j;
                        l46Var5.r(false);
                    } else {
                        l46Var5.f0(-769334207);
                        l46Var5.r(false);
                        j = no6.c;
                    }
                    nae.a(j09VarF, d93Var, j, 0L, 0.0f, 0.0f, null, af1.b0(303576173, new nu2(z, h73Var, 2), l46Var5), l46Var5, 12582918, 120);
                } else {
                    l46Var5.Z();
                }
                return wefVar;
            case 5:
                x4d x4dVar = (x4d) obj4;
                j09 j09Var = (j09) obj;
                l46 l46Var6 = (l46) obj2;
                ((Integer) obj3).getClass();
                j09Var.getClass();
                l46Var6.f0(250974515);
                j09 j09VarJ4 = rrb.j(j09Var, x4dVar, new n4d(new dtd(z ? abg.c(1308622847) : y72.e)));
                l46Var6.r(false);
                return j09VarJ4;
            default:
                ale aleVar2 = (ale) obj4;
                l46 l46Var7 = (l46) obj2;
                int iIntValue5 = ((Integer) obj3).intValue();
                ((d92) obj).getClass();
                if (l46Var7.W(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    j09 j09VarZ2 = ynb.Z(g09Var, 24.0f);
                    c92 c92VarA2 = a92.a(new uc0(12.0f, true, new qc0(0)), ndb.Y, l46Var7, 6);
                    int iHashCode4 = Long.hashCode(l46Var7.T);
                    u8a u8aVarM4 = l46Var7.m();
                    j09 j09VarJ5 = m93.J(l46Var7, j09VarZ2);
                    lf2.q.getClass();
                    l46Var7.j0();
                    if (l46Var7.S) {
                        l46Var7.l(ov7Var);
                    } else {
                        l46Var7.s0();
                    }
                    dec.l(hj6.z, l46Var7, c92VarA2);
                    dec.l(hj6.y, l46Var7, u8aVarM4);
                    dec.l(hj6.X, l46Var7, Integer.valueOf(iHashCode4));
                    dec.k(l46Var7);
                    dec.l(hj6.x, l46Var7, j09VarJ5);
                    String strQ3 = afc.q(R.string.spread_preset_group, l46Var7);
                    mue mueVar2 = pue.a;
                    mue mueVarD = pue.d(l46Var7);
                    pr4 pr4Var2 = l8b.a;
                    nte.b(strQ3, null, ((e8b) l46Var7.k(pr4Var2)).u, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mueVarD, l46Var7, 0, 0, 131066);
                    int iE2 = aleVar2.e();
                    pzdVar.getClass();
                    String strB2 = pzd.g(iE2).b(l46Var7);
                    l46Var7.f0(1862085659);
                    i00 i00Var2 = new i00();
                    i00Var2.f(aleVar2.b(l46Var7));
                    int iK2 = i00Var2.k(new xtd(((e8b) l46Var7.k(pr4Var2)).t, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 65534));
                    try {
                        i00Var2.f("（" + strB2 + "）");
                        i00Var2.h(iK2);
                        k00 k00VarL = i00Var2.l();
                        l46Var7.r(false);
                        nte.c(k00VarL, null, ((e8b) l46Var7.k(pr4Var2)).q, 0L, null, ((y8b) l46Var7.k(x8b.a)).a, 0L, null, 0L, 0, false, 0, 0, null, null, pue.o(l46Var7), l46Var7, 0, 0, 262010);
                        feg.j(od4.A(k8b.f((e8b) l46Var7.k(pr4Var2)) ? aleVar2.c() : aleVar2.a(), 0, l46Var7), null, b.c(ynb.b0(0.0f, 12.0f, b.d(g09Var, 140.0f), 1), 1.0f), null, null, 0.0f, null, l46Var7, 440, 120);
                        nte.b(afc.q(aleVar2.g(), l46Var7), null, ((e8b) l46Var7.k(pr4Var2)).q, 0L, null, null, 0L, null, null, w6c.l(20), 0, false, 0, 0, null, pue.c(l46Var7), l46Var7, 0, 48, 129018);
                        if (z) {
                            l46Var7.f0(1890966687);
                            gvd.c(pzd.k(aleVar2.e()), 0, l46Var7, null);
                            l46Var7.r(false);
                        } else {
                            l46Var7.f0(1891061826);
                            l46Var7.r(false);
                        }
                        l46Var7.r(true);
                    } catch (Throwable th2) {
                        i00Var2.h(iK2);
                        throw th2;
                    }
                } else {
                    l46Var7.Z();
                }
                return wefVar;
        }
    }

    public /* synthetic */ zk(boolean z, Object obj, int i) {
        this.a = i;
        this.b = z;
        this.c = obj;
    }
}
