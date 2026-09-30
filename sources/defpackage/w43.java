package defpackage;

import ai.askquin.R;
import ai.askquin.model.TarotSkinIdentify;
import ai.askquin.ui.explore.model.DailyCardBasicInfo;
import androidx.compose.foundation.layout.b;
import androidx.compose.ui.node.LayoutNode;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class w43 implements n26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ boolean f;

    public /* synthetic */ w43(a26 a26Var, Object obj, boolean z, h0e h0eVar, boolean z2) {
        this.a = 2;
        this.c = a26Var;
        this.d = obj;
        this.b = z;
        this.e = h0eVar;
        this.f = z2;
    }

    @Override // defpackage.n26
    public final Object m(Object obj, Object obj2, Object obj3) {
        float f;
        g09 g09Var;
        j09 j09VarZ;
        g09 g09Var2;
        y23 y23Var;
        j09 j09VarJ;
        boolean z;
        int i = this.a;
        boolean z2 = this.f;
        boolean z3 = this.b;
        wef wefVar = wef.a;
        ov7 ov7Var = LayoutNode.h1;
        Object obj4 = this.e;
        Object obj5 = this.d;
        Object obj6 = this.c;
        int i2 = 0;
        switch (i) {
            case 0:
                DailyCardBasicInfo dailyCardBasicInfo = (DailyCardBasicInfo) obj6;
                qhe qheVar = (qhe) obj5;
                TarotSkinIdentify tarotSkinIdentify = (TarotSkinIdentify) obj4;
                d92 d92Var = (d92) obj;
                l46 l46Var = (l46) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                d92Var.getClass();
                int i3 = 4;
                if ((iIntValue & 6) == 0) {
                    iIntValue |= l46Var.g(d92Var) ? 4 : 2;
                }
                if (!l46Var.W(iIntValue & 1, (iIntValue & 19) != 18)) {
                    l46Var.Z();
                } else {
                    boolean z4 = this.b;
                    float f2 = z4 ? 16.0f : 0.0f;
                    g09 g09Var3 = g09.a;
                    h7d.h(0, 0, l46Var, ((e92) d92Var).b(ynb.d0(0.0f, 16.0f, 0.0f, f2, 5, g09Var3), ndb.Z));
                    dd2 dd2VarB0 = af1.b0(574783083, new w43(z4, dailyCardBasicInfo, qheVar, tarotSkinIdentify, this.f, 1), l46Var);
                    if (z4) {
                        l46Var.f0(-1465546980);
                        j09 j09VarC = b.c(g09Var3, 1.0f);
                        c92 c92VarA = a92.a(xc0.c, ndb.Y, l46Var, 0);
                        int iHashCode = Long.hashCode(l46Var.T);
                        u8a u8aVarM = l46Var.m();
                        j09 j09VarJ2 = m93.J(l46Var, j09VarC);
                        lf2.q.getClass();
                        l46Var.j0();
                        if (l46Var.S) {
                            l46Var.l(ov7Var);
                        } else {
                            l46Var.s0();
                        }
                        dec.l(hj6.z, l46Var, c92VarA);
                        dec.l(hj6.y, l46Var, u8aVarM);
                        dec.l(hj6.X, l46Var, Integer.valueOf(iHashCode));
                        dec.k(l46Var);
                        dec.l(hj6.x, l46Var, j09VarJ2);
                        ks0.q(54, dd2VarB0, e92.a, l46Var, true);
                        l46Var.r(false);
                        g09Var = g09Var3;
                        f = 1.0f;
                    } else {
                        l46Var.f0(-1465407759);
                        f = 1.0f;
                        j09 j09VarC2 = b.c(g09Var3, 1.0f);
                        dd2 dd2VarB1 = af1.b0(-809772028, new ec(dd2VarB0, i3), l46Var);
                        g09Var = g09Var3;
                        h7d.a(j09VarC2, 0.0f, dd2VarB1, l46Var, 438, 0);
                        l46Var.r(false);
                    }
                    h7d.g(ynb.d0(0.0f, z4 ? 0.0f : 16.0f, 0.0f, 20.0f, 5, b.c(g09Var, f)), 0L, 0, "daily_card_long", 0.0f, l46Var, 3072, 22);
                }
                break;
            case 1:
                DailyCardBasicInfo dailyCardBasicInfo2 = (DailyCardBasicInfo) obj6;
                qhe qheVar2 = (qhe) obj5;
                TarotSkinIdentify tarotSkinIdentify2 = (TarotSkinIdentify) obj4;
                l46 l46Var2 = (l46) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((d92) obj).getClass();
                if (!l46Var2.W(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    l46Var2.Z();
                } else {
                    g09 g09Var4 = g09.a;
                    j09 j09VarC3 = b.c(g09Var4, 1.0f);
                    if (z3) {
                        l46Var2.f0(-671642695);
                        pr4 pr4Var = l8b.a;
                        long j = ((e8b) l46Var2.k(pr4Var)).a;
                        y6c y6cVar = b53.a;
                        j09VarZ = ynb.Z(db6.w(tm7.o(g09Var4, j, y6cVar), 10.0f, ((e8b) l46Var2.k(pr4Var)).A, y6cVar), 10.0f);
                        l46Var2.r(false);
                    } else {
                        l46Var2.f0(-671391223);
                        l46Var2.r(false);
                        j09VarZ = g09Var4;
                    }
                    j09 j09VarD = j09VarC3.D(j09VarZ);
                    uc0 uc0Var = new uc0(z3 ? 0.0f : 16.0f, true, new qc0(0));
                    jx0 jx0Var = ndb.Y;
                    c92 c92VarA2 = a92.a(uc0Var, jx0Var, l46Var2, 0);
                    int iHashCode2 = Long.hashCode(l46Var2.T);
                    u8a u8aVarM2 = l46Var2.m();
                    j09 j09VarJ3 = m93.J(l46Var2, j09VarD);
                    lf2.q.getClass();
                    l46Var2.j0();
                    if (l46Var2.S) {
                        l46Var2.l(ov7Var);
                    } else {
                        l46Var2.s0();
                    }
                    he2 he2Var = hj6.z;
                    dec.l(he2Var, l46Var2, c92VarA2);
                    he2 he2Var2 = hj6.y;
                    dec.l(he2Var2, l46Var2, u8aVarM2);
                    Integer numValueOf = Integer.valueOf(iHashCode2);
                    he2 he2Var3 = hj6.X;
                    dec.l(he2Var3, l46Var2, numValueOf);
                    dec.k(l46Var2);
                    he2 he2Var4 = hj6.x;
                    dec.l(he2Var4, l46Var2, j09VarJ3);
                    b53.a(dailyCardBasicInfo2, qheVar2, tarotSkinIdentify2, l46Var2, (DailyCardBasicInfo.$stable << 3) | 6);
                    String explain = dailyCardBasicInfo2.getExplain();
                    y23 y23Var2 = y23.b;
                    if ((explain == null || v4e.Q(explain)) && !(z3 && z2)) {
                        g09Var2 = g09Var4;
                        y23Var = y23Var2;
                        dailyCardBasicInfo2 = dailyCardBasicInfo2;
                        l46Var2.f0(-1906237439);
                        l46Var2.r(false);
                    } else {
                        l46Var2.f0(-1907691432);
                        if (z3) {
                            l46Var2.f0(-1907702468);
                            oa7.d(null, 0.5f, ((e8b) l46Var2.k(l8b.a)).A, l46Var2, 48, 1);
                            l46Var2.r(false);
                        } else {
                            l46Var2.f0(-1907543903);
                            l46Var2.r(false);
                        }
                        j09 j09VarC4 = b.c(g09Var4, 1.0f);
                        if (z3) {
                            l46Var2.f0(-754265431);
                            l46Var2.r(false);
                            j09VarJ = g09Var4;
                        } else {
                            l46Var2.f0(-754264959);
                            j09VarJ = b53.j(l46Var2);
                            l46Var2.r(false);
                        }
                        j09 j09VarA0 = ynb.a0(j09VarC4.D(j09VarJ), 20.0f, 20.0f);
                        g09Var2 = g09Var4;
                        c92 c92VarA3 = a92.a(new uc0(12.0f, true, new qc0(0)), jx0Var, l46Var2, 6);
                        int iHashCode3 = Long.hashCode(l46Var2.T);
                        u8a u8aVarM3 = l46Var2.m();
                        j09 j09VarJ4 = m93.J(l46Var2, j09VarA0);
                        l46Var2.j0();
                        if (l46Var2.S) {
                            l46Var2.l(ov7Var);
                        } else {
                            l46Var2.s0();
                        }
                        dec.l(he2Var, l46Var2, c92VarA3);
                        dec.l(he2Var2, l46Var2, u8aVarM3);
                        ib8.s(iHashCode3, l46Var2, he2Var3, l46Var2);
                        dec.l(he2Var4, l46Var2, j09VarJ4);
                        String explain2 = dailyCardBasicInfo2.getExplain();
                        if (explain2 == null || v4e.Q(explain2)) {
                            l46Var2.f0(-587198480);
                            l46Var2.r(false);
                        } else {
                            l46Var2.f0(-587687629);
                            String strQ = afc.q(R.string.daily_fortune_reading_title, l46Var2);
                            pr4 pr4Var2 = r9f.a;
                            mue mueVar = ((p9f) l46Var2.k(pr4Var2)).h;
                            pr4 pr4Var3 = l8b.a;
                            nte.b(strQ, null, ((e8b) l46Var2.k(pr4Var3)).u, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mueVar, l46Var2, 0, 0, 131066);
                            nte.b(dailyCardBasicInfo2.getExplain(), null, ((e8b) l46Var2.k(pr4Var3)).q, 0L, null, null, 0L, null, null, w6c.l(28), 0, false, 0, 0, null, ((p9f) l46Var2.k(pr4Var2)).j, l46Var2, 0, 48, 129018);
                            l46Var2.r(false);
                        }
                        if (z3 && z2) {
                            l46Var2.f0(-587140634);
                            y23Var = y23Var2;
                            qn4.j(dailyCardBasicInfo2.getDos(), dailyCardBasicInfo2.getDonts(), ynb.d0(0.0f, 12.0f, 0.0f, 0.0f, 13, g09Var2), y23Var, l46Var2, 3456, 0);
                            z = false;
                            l46Var2.r(false);
                        } else {
                            y23Var = y23Var2;
                            z = false;
                            l46Var2.f0(-586854256);
                            l46Var2.r(false);
                        }
                        l46Var2.r(true);
                        l46Var2.r(z);
                    }
                    if (z3 || !z2) {
                        l46Var2.f0(-1905981503);
                        l46Var2.r(false);
                    } else {
                        l46Var2.f0(-1906185235);
                        qn4.j(dailyCardBasicInfo2.getDos(), dailyCardBasicInfo2.getDonts(), null, y23Var, l46Var2, 3072, 4);
                        l46Var2.r(false);
                    }
                    l46Var2.r(true);
                    String strQ2 = afc.q(R.string.tarot_sharing_tips, l46Var2);
                    mue mueVar2 = pue.a;
                    nte.b(strQ2, ynb.c0(b.c(g09Var2, 1.0f), z3 ? 20.0f : 0.0f, 16.0f, z3 ? 20.0f : 0.0f, z3 ? 16.0f : 0.0f), ((e8b) l46Var2.k(l8b.a)).t, 0L, null, null, 0L, null, new jme(3), 0L, 0, false, 0, 0, null, pue.j(l46Var2), l46Var2, 0, 0, 130040);
                }
                break;
            default:
                a26 a26Var = (a26) obj6;
                h0e h0eVar = (h0e) obj4;
                l46 l46Var3 = (l46) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((d92) obj).getClass();
                if (!l46Var3.W(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    l46Var3.Z();
                } else {
                    l46Var3.f0(621975379);
                    xn8 xn8VarC = s21.c(ndb.b, false);
                    int iHashCode4 = Long.hashCode(l46Var3.T);
                    u8a u8aVarM4 = l46Var3.m();
                    g09 g09Var5 = g09.a;
                    j09 j09VarJ5 = m93.J(l46Var3, g09Var5);
                    lf2.q.getClass();
                    l46Var3.j0();
                    if (l46Var3.S) {
                        l46Var3.l(ov7Var);
                    } else {
                        l46Var3.s0();
                    }
                    dec.l(hj6.z, l46Var3, xn8VarC);
                    dec.l(hj6.y, l46Var3, u8aVarM4);
                    dec.l(hj6.X, l46Var3, Integer.valueOf(iHashCode4));
                    dec.k(l46Var3);
                    dec.l(hj6.x, l46Var3, j09VarJ5);
                    vd0.l(432, af1.b0(-1828176096, new zk(z3, h0eVar, i2), l46Var3), l46Var3, null, false);
                    bx9 bx9Var = new bx9(8.0f, 8.0f, 8.0f, 8.0f);
                    j09 j09VarD0 = ynb.d0(0.0f, 8.0f, 8.0f, 0.0f, 9, d31.a.a(g09Var5, ndb.d));
                    bx9 bx9Var2 = v51.a;
                    u51 u51VarH = v51.h(((e8b) l46Var3.k(l8b.a)).r, l46Var3);
                    boolean zG = l46Var3.g(a26Var) | l46Var3.i(obj5);
                    Object objR = l46Var3.R();
                    if (zG || objR == sf2.a) {
                        objR = new v6(3, a26Var, obj5);
                        l46Var3.p0(objR);
                    }
                    cgg.m((x16) objR, j09VarD0, false, null, u51VarH, bx9Var, af1.b0(-1408795714, new g8(z2, 1), l46Var3), l46Var3, 817889280, 364);
                    l46Var3.r(true);
                    l46Var3.r(false);
                }
                break;
        }
        return wefVar;
    }

    public /* synthetic */ w43(boolean z, DailyCardBasicInfo dailyCardBasicInfo, qhe qheVar, TarotSkinIdentify tarotSkinIdentify, boolean z2, int i) {
        this.a = i;
        this.b = z;
        this.c = dailyCardBasicInfo;
        this.d = qheVar;
        this.e = tarotSkinIdentify;
        this.f = z2;
    }
}
