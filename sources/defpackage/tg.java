package defpackage;

import ai.askquin.R;
import ai.askquin.model.TarotSkinIdentify;
import androidx.compose.foundation.layout.b;
import androidx.compose.ui.node.LayoutNode;
import java.time.LocalDate;
import java.util.List;
import tech.chatmind.api.seasonal.model.SolarTerm;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class tg implements l26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object v;

    public /* synthetic */ tg(int i, int i2, x16 x16Var, a26 a26Var, fpc fpcVar, erc ercVar, SolarTerm solarTerm, boolean z) {
        this.a = 10;
        this.d = fpcVar;
        this.c = i;
        this.e = solarTerm;
        this.b = z;
        this.f = ercVar;
        this.g = a26Var;
        this.v = x16Var;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        int i;
        int i2;
        int i3 = this.a;
        int i4 = this.c;
        wef wefVar = wef.a;
        Object obj3 = this.v;
        Object obj4 = this.d;
        Object obj5 = this.g;
        Object obj6 = this.f;
        Object obj7 = this.e;
        switch (i3) {
            case 0:
                ((Integer) obj2).getClass();
                dj6.d((j09) obj4, (n07) obj7, (p07) obj6, (String) obj5, this.b, (x16) obj3, (l46) obj, k99.P(i4 | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                kj0.V((lla) obj4, (d0f) obj7, (aw2) obj6, this.b, (e89) obj5, (dd2) obj3, (l46) obj, k99.P(i4 | 1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                cn1.d(this.b, (yye) obj7, (j09) obj4, (qy1) obj6, (d5e) obj5, (d5e) obj3, (l46) obj, k99.P(i4 | 1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                pn2.c((String) obj5, this.b, (ln2) obj7, (j09) obj4, (n26) obj6, (x16) obj3, (l46) obj, k99.P(i4 | 1));
                break;
            case 4:
                y72 y72Var = (y72) obj4;
                t33 t33Var = (t33) obj7;
                final cod codVar = (cod) obj6;
                final a26 a26Var = (a26) obj5;
                final a26 a26Var2 = (a26) obj3;
                l46 l46Var = (l46) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!l46Var.W(iIntValue & 1, (iIntValue & 3) != 2)) {
                    l46Var.Z();
                } else {
                    g09 g09Var = g09.a;
                    j09 j09VarB0 = ynb.b0(32.0f, 0.0f, b.c(g09Var, 1.0f), 2);
                    xn8 xn8VarC = s21.c(ndb.b, false);
                    int iHashCode = Long.hashCode(l46Var.T);
                    u8a u8aVarM = l46Var.m();
                    j09 j09VarJ = m93.J(l46Var, j09VarB0);
                    lf2.q.getClass();
                    l46Var.j0();
                    if (l46Var.S) {
                        l46Var.l(LayoutNode.h1);
                    } else {
                        l46Var.s0();
                    }
                    dec.l(hj6.z, l46Var, xn8VarC);
                    dec.l(hj6.y, l46Var, u8aVarM);
                    dec.l(hj6.X, l46Var, Integer.valueOf(iHashCode));
                    dec.k(l46Var);
                    dec.l(hj6.x, l46Var, j09VarJ);
                    final boolean z = this.b;
                    if (z) {
                        i = 1478584966;
                        i2 = R.string.daily_fortune_unlock_in_shop_cta;
                    } else {
                        i = 1478677036;
                        i2 = R.string.daily_fortune_use_deck_cta;
                    }
                    String strI = tec.i(l46Var, i, i2, l46Var, false);
                    j09 j09VarA = androidx.compose.ui.platform.b.a(b.d(b.c(g09Var, 1.0f), 56.0f), "daily_card_skin_picker_cta");
                    x4d x4dVar = eze.a(l46Var).a.a;
                    x4dVar.getClass();
                    if (we6.e(l46Var)) {
                        x4dVar = g21.f;
                    }
                    x4d x4dVar2 = x4dVar;
                    u51 u51VarQ = xj3.q(y72Var, l46Var);
                    boolean z2 = t33Var.b;
                    dd2 dd2Var = z ? n16.c : null;
                    boolean zH = l46Var.h(z) | l46Var.g(codVar) | l46Var.g(a26Var) | l46Var.g(a26Var2);
                    final int i5 = this.c;
                    boolean zE = l46Var.e(i5) | zH;
                    Object objR = l46Var.R();
                    if (zE || objR == sf2.a) {
                        x16 x16Var = new x16() { // from class: l53
                            @Override // defpackage.x16
                            public final Object invoke() {
                                TarotSkinIdentify tarotSkinIdentify;
                                if (z) {
                                    cod codVar2 = codVar;
                                    if (codVar2 != null && (tarotSkinIdentify = codVar2.a) != null) {
                                        a26Var.d(tarotSkinIdentify);
                                    }
                                } else {
                                    a26Var2.d(Integer.valueOf(i5));
                                }
                                return wef.a;
                            }
                        };
                        l46Var.p0(x16Var);
                        objR = x16Var;
                    }
                    c8b.i(j09VarA, strI, null, null, 0L, 0.0f, z2, x4dVar2, u51VarQ, false, null, dd2Var, (x16) objR, l46Var, 6, 0, 1596);
                    l46Var.r(true);
                }
                break;
            case 5:
                ((Integer) obj2).intValue();
                qk2.o(this.b, (r91) obj4, (LocalDate) obj7, (LocalDate) obj6, (LocalDate) obj5, (a26) obj3, (l46) obj, k99.P(i4 | 1));
                break;
            case 6:
                ((Integer) obj2).intValue();
                qk2.r(this.b, (t2g) obj4, (LocalDate) obj7, (LocalDate) obj6, (LocalDate) obj5, (a26) obj3, (l46) obj, k99.P(i4 | 1));
                break;
            case 7:
                ((Integer) obj2).getClass();
                bm8.i((j09) obj4, (x16) obj3, this.b, (x4d) obj7, (cu6) obj6, (l26) obj5, (l46) obj, k99.P(i4 | 1));
                break;
            case 8:
                ((Integer) obj2).getClass();
                g21.l((dd2) obj7, (x16) obj3, (j09) obj4, this.b, (tr8) obj6, (xw9) obj5, (l46) obj, k99.P(i4 | 1));
                break;
            case 9:
                ((Integer) obj2).intValue();
                feg.l((ma8) obj4, this.b, (x16) obj3, (a26) obj7, (x16) obj6, (a26) obj5, (l46) obj, k99.P(i4 | 1));
                break;
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                ((Integer) obj2).getClass();
                jlc.f((fpc) obj4, this.c, (SolarTerm) obj7, this.b, (erc) obj6, (a26) obj5, (x16) obj3, (l46) obj, k99.P(1));
                break;
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                ((Integer) obj2).getClass();
                j7d.a((j09) obj4, (a26) obj7, (bd4) obj6, (List) obj5, (List) obj3, this.b, (l46) obj, k99.P(i4 | 1));
                break;
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                ((Integer) obj2).getClass();
                d8c.l((String) obj5, (List) obj7, this.b, (x16) obj3, (a26) obj6, (j09) obj4, (l46) obj, k99.P(i4 | 1));
                break;
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                ((Integer) obj2).getClass();
                epd.d((j09) obj4, (gpd) obj7, this.b, (t69) obj6, (dd2) obj5, (dd2) obj3, (l46) obj, k99.P(i4 | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                a0f.b((lla) obj7, (dd2) obj6, (d0f) obj5, (j09) obj4, this.b, (dd2) obj3, (l46) obj, k99.P(i4 | 1));
                break;
        }
        return wefVar;
    }

    public /* synthetic */ tg(dd2 dd2Var, x16 x16Var, j09 j09Var, boolean z, tr8 tr8Var, xw9 xw9Var, int i) {
        this.a = 8;
        this.e = dd2Var;
        this.v = x16Var;
        this.d = j09Var;
        this.b = z;
        this.f = tr8Var;
        this.g = xw9Var;
        this.c = i;
    }

    public /* synthetic */ tg(ma8 ma8Var, boolean z, x16 x16Var, a26 a26Var, x16 x16Var2, a26 a26Var2, int i) {
        this.a = 9;
        this.d = ma8Var;
        this.b = z;
        this.v = x16Var;
        this.e = a26Var;
        this.f = x16Var2;
        this.g = a26Var2;
        this.c = i;
    }

    public /* synthetic */ tg(j09 j09Var, x16 x16Var, boolean z, x4d x4dVar, cu6 cu6Var, l26 l26Var, int i) {
        this.a = 7;
        this.d = j09Var;
        this.v = x16Var;
        this.b = z;
        this.e = x4dVar;
        this.f = cu6Var;
        this.g = l26Var;
        this.c = i;
    }

    public /* synthetic */ tg(j09 j09Var, a26 a26Var, bd4 bd4Var, List list, List list2, boolean z, int i) {
        this.a = 11;
        this.d = j09Var;
        this.e = a26Var;
        this.f = bd4Var;
        this.g = list;
        this.v = list2;
        this.b = z;
        this.c = i;
    }

    public /* synthetic */ tg(j09 j09Var, n07 n07Var, p07 p07Var, String str, boolean z, x16 x16Var, int i) {
        this.a = 0;
        this.d = j09Var;
        this.e = n07Var;
        this.f = p07Var;
        this.g = str;
        this.b = z;
        this.v = x16Var;
        this.c = i;
    }

    public /* synthetic */ tg(j09 j09Var, gpd gpdVar, boolean z, t69 t69Var, dd2 dd2Var, dd2 dd2Var2, int i) {
        this.a = 13;
        this.d = j09Var;
        this.e = gpdVar;
        this.b = z;
        this.f = t69Var;
        this.g = dd2Var;
        this.v = dd2Var2;
        this.c = i;
    }

    public /* synthetic */ tg(lla llaVar, dd2 dd2Var, d0f d0fVar, j09 j09Var, boolean z, dd2 dd2Var2, int i) {
        this.a = 14;
        this.e = llaVar;
        this.f = dd2Var;
        this.g = d0fVar;
        this.d = j09Var;
        this.b = z;
        this.v = dd2Var2;
        this.c = i;
    }

    public /* synthetic */ tg(lla llaVar, d0f d0fVar, aw2 aw2Var, boolean z, e89 e89Var, dd2 dd2Var, int i) {
        this.a = 1;
        this.d = llaVar;
        this.e = d0fVar;
        this.f = aw2Var;
        this.b = z;
        this.g = e89Var;
        this.v = dd2Var;
        this.c = i;
    }

    public /* synthetic */ tg(String str, List list, boolean z, x16 x16Var, a26 a26Var, j09 j09Var, int i) {
        this.a = 12;
        this.g = str;
        this.e = list;
        this.b = z;
        this.v = x16Var;
        this.f = a26Var;
        this.d = j09Var;
        this.c = i;
    }

    public /* synthetic */ tg(String str, boolean z, ln2 ln2Var, j09 j09Var, n26 n26Var, x16 x16Var, int i) {
        this.a = 3;
        this.g = str;
        this.b = z;
        this.e = ln2Var;
        this.d = j09Var;
        this.f = n26Var;
        this.v = x16Var;
        this.c = i;
    }

    public /* synthetic */ tg(boolean z, yye yyeVar, j09 j09Var, qy1 qy1Var, d5e d5eVar, d5e d5eVar2, int i) {
        this.a = 2;
        this.b = z;
        this.e = yyeVar;
        this.d = j09Var;
        this.f = qy1Var;
        this.g = d5eVar;
        this.v = d5eVar2;
        this.c = i;
    }

    public /* synthetic */ tg(boolean z, Object obj, Object obj2, Object obj3, Object obj4, a26 a26Var, int i, int i2) {
        this.a = i2;
        this.b = z;
        this.d = obj;
        this.e = obj2;
        this.f = obj3;
        this.g = obj4;
        this.v = a26Var;
        this.c = i;
    }
}
