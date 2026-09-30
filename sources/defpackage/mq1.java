package defpackage;

import ai.askquin.R;
import androidx.compose.foundation.layout.b;
import androidx.compose.ui.node.LayoutNode;
import java.util.ArrayList;
import java.util.List;
import tech.chatmind.api.TarotCardInfo;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class mq1 implements n26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ Object c;

    public /* synthetic */ mq1(long j, bxa bxaVar) {
        this.a = 3;
        this.b = j;
        this.c = bxaVar;
    }

    @Override // defpackage.n26
    public final Object m(Object obj, Object obj2, Object obj3) {
        iy9 iy9Var;
        iy9 iy9Var2;
        iy9 iy9Var3;
        iy9 iy9Var4;
        l46 l46Var;
        l46 l46Var2;
        int i = this.a;
        ov7 ov7Var = LayoutNode.h1;
        long j = this.b;
        wef wefVar = wef.a;
        g09 g09Var = g09.a;
        Object obj4 = this.c;
        switch (i) {
            case 0:
                TarotCardInfo tarotCardInfo = (TarotCardInfo) obj4;
                l46 l46Var3 = (l46) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((d92) obj).getClass();
                if (l46Var3.W(iIntValue & 1, (iIntValue & 17) != 16)) {
                    String strQ = afc.q(R.string.explore_detail_meaning_section_title, l46Var3);
                    mue mueVar = pue.a;
                    nte.b(strQ, b.c(g09Var, 1.0f), ((e8b) l46Var3.k(l8b.a)).q, 0L, null, cr5.b(), 0L, null, new jme(3), 0L, 0, false, 0, 0, null, pue.p(l46Var3), l46Var3, 48, 0, 129912);
                    o5c.f(l46Var3, b.d(g09Var, 16.0f));
                    String description = tarotCardInfo.getDescription();
                    if (v4e.Q(description)) {
                        description = null;
                    }
                    if (description == null) {
                        l46Var3.f0(-1438388338);
                        l46Var3.r(false);
                        iy9Var = null;
                    } else {
                        l46Var3.f0(-1438388337);
                        iy9Var = new iy9(afc.q(R.string.explore_detail_description_label, l46Var3), description);
                        l46Var3.r(false);
                    }
                    String meaning = tarotCardInfo.getMeaning();
                    if (v4e.Q(meaning)) {
                        meaning = null;
                    }
                    if (meaning == null) {
                        l46Var3.f0(-1438260494);
                        l46Var3.r(false);
                        iy9Var2 = null;
                    } else {
                        l46Var3.f0(-1438260493);
                        iy9Var2 = new iy9(afc.q(R.string.explore_detail_meaning_label, l46Var3), meaning);
                        l46Var3.r(false);
                    }
                    List<String> uprightKeywords = tarotCardInfo.getUprightKeywords();
                    List<String> list = !uprightKeywords.isEmpty() ? uprightKeywords : null;
                    if (list == null) {
                        l46Var3.f0(-1438127721);
                        l46Var3.r(false);
                        iy9Var3 = null;
                    } else {
                        l46Var3.f0(-1438127720);
                        iy9Var3 = new iy9(afc.q(R.string.explore_detail_upright_keywords_label, l46Var3), s72.D0(list, "，", null, null, null, 62));
                        l46Var3.r(false);
                    }
                    List<String> reversedKeywords = tarotCardInfo.getReversedKeywords();
                    List<String> list2 = !reversedKeywords.isEmpty() ? reversedKeywords : null;
                    if (list2 == null) {
                        l46Var3.f0(-1437967978);
                        l46Var3.r(false);
                        iy9Var4 = null;
                    } else {
                        l46Var3.f0(-1437967977);
                        iy9Var4 = new iy9(afc.q(R.string.explore_detail_reversed_keywords_label, l46Var3), s72.D0(list2, "，", null, null, null, 62));
                        l46Var3.r(false);
                    }
                    int i2 = 0;
                    for (Object obj5 : (ArrayList) qd0.k0(new iy9[]{iy9Var, iy9Var2, iy9Var3, iy9Var4})) {
                        int i3 = i2 + 1;
                        if (i2 < 0) {
                            t72.Z();
                            throw null;
                        }
                        iy9 iy9Var5 = (iy9) obj5;
                        String str = (String) iy9Var5.a();
                        String str2 = (String) iy9Var5.b();
                        if (i2 > 0) {
                            ib8.r(16.0f, -1388768526, l46Var3, l46Var3, g09Var);
                        } else {
                            l46Var3.f0(-102111943);
                        }
                        l46Var3.r(false);
                        uq1.k(str, str2, this.b, l46Var3, 0);
                        i2 = i3;
                    }
                } else {
                    l46Var3.Z();
                }
                return wefVar;
            case 1:
                ii6 ii6Var = (ii6) obj4;
                j09 j09Var = (j09) obj;
                l46 l46Var4 = (l46) obj2;
                ((Integer) obj3).getClass();
                j09Var.getClass();
                l46Var4.f0(1146317346);
                boolean zF = l46Var4.f(j);
                Object objR = l46Var4.R();
                if (zF || objR == sf2.a) {
                    objR = new ac(j, 12);
                    l46Var4.p0(objR);
                }
                j09 j09VarO = tm7.o(z7f.J(j09Var, ii6Var, null, (a26) objR, 2), j, g21.f);
                l46Var4.r(false);
                return j09VarO;
            case 2:
                i5a i5aVar = (i5a) obj4;
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                l46 l46Var5 = (l46) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= l46Var5.h(zBooleanValue) ? 4 : 2;
                }
                if (l46Var5.W(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    c92 c92VarA = a92.a(new uc0(4.0f, true, new qc0(0)), ndb.Y, l46Var5, 6);
                    int iHashCode = Long.hashCode(l46Var5.T);
                    u8a u8aVarM = l46Var5.m();
                    j09 j09VarJ = m93.J(l46Var5, g09Var);
                    lf2.q.getClass();
                    l46Var5.j0();
                    if (l46Var5.S) {
                        l46Var5.l(ov7Var);
                    } else {
                        l46Var5.s0();
                    }
                    dec.l(hj6.z, l46Var5, c92VarA);
                    dec.l(hj6.y, l46Var5, u8aVarM);
                    dec.l(hj6.X, l46Var5, Integer.valueOf(iHashCode));
                    dec.k(l46Var5);
                    dec.l(hj6.x, l46Var5, j09VarJ);
                    if (zBooleanValue) {
                        l46Var5.f0(-1487837482);
                        s21.a(o8c.q(b.d(b.c(g09Var, 0.7f), 20.0f), 4.0f, l46Var5, 54), l46Var5, 0);
                        s21.a(o8c.q(b.d(b.c(g09Var, 0.5f), 14.0f), 4.0f, l46Var5, 54), l46Var5, 0);
                        l46Var5.r(false);
                        l46Var = l46Var5;
                    } else {
                        l46Var5.f0(-1487402304);
                        String str3 = i5aVar.b;
                        yp5 yp5Var = ((y8b) l46Var5.k(x8b.a)).a;
                        ar5 ar5Var = ar5.z;
                        mue mueVar2 = pue.a;
                        long j2 = pue.p(l46Var5).a.b;
                        long j3 = this.b;
                        nte.b(str3, null, j3, j2, ar5Var, yp5Var, 0L, null, null, 0L, 0, false, 0, 0, null, null, l46Var5, 1572864, 0, 261930);
                        l46Var = l46Var5;
                        String str4 = i5aVar.c;
                        if (str4 == null) {
                            l46Var.f0(-1487129722);
                            l46Var.r(false);
                        } else {
                            l46Var.f0(-1487129721);
                            nte.b(str4, null, ((e8b) l46Var.k(l8b.a)).t, w6c.l(12), null, null, 0L, null, null, w6c.k(16.2d), 0, false, 0, 0, null, null, l46Var, 24576, 48, 260074);
                            l46Var.r(false);
                        }
                        String str5 = i5aVar.d;
                        if (str5 == null) {
                            l46Var.f0(-1486894060);
                            l46Var.r(false);
                        } else {
                            l46Var.f0(-1486894059);
                            nte.b(str5, null, j3, w6c.l(12), null, null, 0L, null, null, w6c.k(16.2d), 0, false, 0, 0, null, null, l46Var, 24576, 48, 260074);
                            l46Var.r(false);
                        }
                        String str6 = i5aVar.h;
                        if (str6 == null) {
                            l46Var.f0(-1486670395);
                            l46Var.r(false);
                        } else {
                            ib8.r(4.0f, -1486670394, l46Var, l46Var, g09Var);
                            nte.b(str6, null, y72.b(((e8b) l46Var.k(l8b.a)).q, 0.48f), w6c.l(12), null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, l46Var, 24576, 0, 262122);
                            l46Var.r(false);
                        }
                        l46Var.r(false);
                    }
                    l46Var.r(true);
                } else {
                    l46Var5.Z();
                }
                return wefVar;
            default:
                bxa bxaVar = (bxa) obj4;
                l46 l46Var6 = (l46) obj2;
                int iIntValue3 = ((Integer) obj3).intValue();
                ((oz) obj).getClass();
                if (l46Var6.W(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    j09 j09VarO2 = tm7.o(b.c, j, g21.f);
                    j09VarO2.getClass();
                    j09 j09VarB = g21.B(j09VarO2, true, new r02(15));
                    xn8 xn8VarC = s21.c(ndb.f, false);
                    int iHashCode2 = Long.hashCode(l46Var6.T);
                    u8a u8aVarM2 = l46Var6.m();
                    j09 j09VarJ2 = m93.J(l46Var6, j09VarB);
                    lf2.q.getClass();
                    l46Var6.j0();
                    if (l46Var6.S) {
                        l46Var6.l(ov7Var);
                    } else {
                        l46Var6.s0();
                    }
                    he2 he2Var = hj6.z;
                    dec.l(he2Var, l46Var6, xn8VarC);
                    he2 he2Var2 = hj6.y;
                    dec.l(he2Var2, l46Var6, u8aVarM2);
                    Integer numValueOf = Integer.valueOf(iHashCode2);
                    he2 he2Var3 = hj6.X;
                    dec.l(he2Var3, l46Var6, numValueOf);
                    dec.k(l46Var6);
                    he2 he2Var4 = hj6.x;
                    dec.l(he2Var4, l46Var6, j09VarJ2);
                    c92 c92VarA2 = a92.a(xc0.c, ndb.Z, l46Var6, 48);
                    int iHashCode3 = Long.hashCode(l46Var6.T);
                    u8a u8aVarM3 = l46Var6.m();
                    j09 j09VarJ3 = m93.J(l46Var6, g09Var);
                    l46Var6.j0();
                    if (l46Var6.S) {
                        l46Var6.l(ov7Var);
                    } else {
                        l46Var6.s0();
                    }
                    dec.l(he2Var, l46Var6, c92VarA2);
                    dec.l(he2Var2, l46Var6, u8aVarM3);
                    ib8.s(iHashCode3, l46Var6, he2Var3, l46Var6);
                    dec.l(he2Var4, l46Var6, j09VarJ3);
                    int iOrdinal = bxaVar.ordinal();
                    if (iOrdinal == 0) {
                        l46Var6.f0(1255575571);
                        axa.a(0.0f, 0.0f, 0, 0, 61, ((m82) l46Var6.k(o82.a)).p, 0L, l46Var6, null);
                        l46Var2 = l46Var6;
                        l46Var2.r(false);
                    } else {
                        if (iOrdinal != 1) {
                            throw tec.d(1255573856, l46Var6, false);
                        }
                        l46Var6.f0(1255579953);
                        bzd.e(0, l46Var6);
                        l46Var6.r(false);
                        l46Var2 = l46Var6;
                    }
                    l46Var2.f0(268353604);
                    l46Var2.r(false);
                    l46Var2.r(true);
                    l46Var2.r(true);
                } else {
                    l46Var6.Z();
                }
                return wefVar;
        }
    }

    public /* synthetic */ mq1(Object obj, long j, int i) {
        this.a = i;
        this.c = obj;
        this.b = j;
    }
}
