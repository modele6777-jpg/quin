package defpackage;

import ai.askquin.R;
import ai.askquin.ui.share.SharePayload$DrawnCards;
import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteQuery;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.b;
import androidx.compose.ui.node.LayoutNode;
import java.util.ArrayList;
import tech.chatmind.api.giftcard.GiftCardItem;
import tech.chatmind.api.personality.model.PersonalityAnalysisQuestion;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class wt implements o26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ wt(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.o26
    public final Object t(Object obj, Object obj2, Object obj3, Object obj4) {
        boolean z;
        int i;
        int i2 = this.a;
        final int i3 = 2;
        String strM = null;
        ov7 ov7Var = LayoutNode.h1;
        g09 g09Var = g09.a;
        wef wefVar = wef.a;
        Object obj5 = this.b;
        boolean z2 = false;
        switch (i2) {
            case 0:
                xt xtVar = (xt) obj5;
                l9f l9fVarB = ((zp5) xtVar.e).b((yp5) obj, (ar5) obj2, ((wq5) obj3).a, ((xq5) obj4).a);
                if (l9fVarB instanceof k9f) {
                    Object obj6 = ((k9f) l9fVarB).a;
                    obj6.getClass();
                    return (Typeface) obj6;
                }
                psd psdVar = new psd(l9fVarB, xtVar.x);
                xtVar.x = psdVar;
                Object obj7 = psdVar.c;
                obj7.getClass();
                return (Typeface) obj7;
            case 1:
                eh4 eh4Var = (eh4) obj5;
                int iIntValue = ((Integer) obj2).intValue();
                l46 l46Var = (l46) obj3;
                int iIntValue2 = ((Integer) obj4).intValue();
                ((rx9) obj).getClass();
                if ((iIntValue2 & 48) == 0) {
                    iIntValue2 |= l46Var.e(iIntValue) ? 32 : 16;
                }
                if (l46Var.W(iIntValue2 & 1, (iIntValue2 & 145) != 144)) {
                    final o8e o8eVar = (o8e) eh4Var.c.get(iIntValue);
                    j09 j09VarR = b.r(b.c(g09Var, 1.0f));
                    c92 c92VarA = a92.a(new uc0(16.0f, true, new qc0(0)), ndb.Y, l46Var, 6);
                    int iHashCode = Long.hashCode(l46Var.T);
                    u8a u8aVarM = l46Var.m();
                    j09 j09VarJ = m93.J(l46Var, j09VarR);
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
                    dec.l(hj6.x, l46Var, j09VarJ);
                    j09 j09VarR2 = b.r(b.c(g09Var, 1.0f));
                    bx9 bx9Var = new bx9(20.0f, 20.0f, 20.0f, 20.0f);
                    final int i4 = z2 ? 1 : 0;
                    d8c.b(j09VarR2, null, bx9Var, af1.b0(87977241, new n26() { // from class: rg4
                        @Override // defpackage.n26
                        public final Object m(Object obj8, Object obj9, Object obj10) {
                            int i5 = i4;
                            ov7 ov7Var2 = LayoutNode.h1;
                            g09 g09Var2 = g09.a;
                            wef wefVar2 = wef.a;
                            o8e o8eVar2 = o8eVar;
                            switch (i5) {
                                case 0:
                                    l46 l46Var2 = (l46) obj9;
                                    int iIntValue3 = ((Integer) obj10).intValue();
                                    ((c31) obj8).getClass();
                                    if (!l46Var2.W(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                                        l46Var2.Z();
                                    } else {
                                        j09 j09VarR3 = b.r(g09Var2);
                                        c92 c92VarA2 = a92.a(new uc0(12.0f, true, new qc0(0)), ndb.Y, l46Var2, 6);
                                        int iHashCode2 = Long.hashCode(l46Var2.T);
                                        u8a u8aVarM2 = l46Var2.m();
                                        j09 j09VarJ2 = m93.J(l46Var2, j09VarR3);
                                        lf2.q.getClass();
                                        l46Var2.j0();
                                        if (l46Var2.S) {
                                            l46Var2.l(ov7Var2);
                                        } else {
                                            l46Var2.s0();
                                        }
                                        dec.l(hj6.z, l46Var2, c92VarA2);
                                        dec.l(hj6.y, l46Var2, u8aVarM2);
                                        dec.l(hj6.X, l46Var2, Integer.valueOf(iHashCode2));
                                        dec.k(l46Var2);
                                        dec.l(hj6.x, l46Var2, j09VarJ2);
                                        String strR = afc.r(R.string.annual_fortune_explanation_for, new Object[]{o8eVar2.c}, l46Var2);
                                        mue mueVar = pue.a;
                                        mue mueVarD = pue.d(l46Var2);
                                        pr4 pr4Var = l8b.a;
                                        nte.b(strR, null, ((e8b) l46Var2.k(pr4Var)).u, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mueVarD, l46Var2, 0, 0, 131066);
                                        p8c.h(48, l46Var2, b.c(g09Var2, 1.0f), o8eVar2.d);
                                        nte.b(o8eVar2.e, null, ((e8b) l46Var2.k(pr4Var)).q, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, pue.c(l46Var2), l46Var2, 0, 0, 131066);
                                        if (ca2.a.a()) {
                                            l46Var2.f0(1450910543);
                                            jgb.c(null, l46Var2, 6);
                                            l46Var2.r(false);
                                        } else {
                                            l46Var2.f0(1450956671);
                                            l46Var2.r(false);
                                        }
                                        l46Var2.r(true);
                                    }
                                    break;
                                case 1:
                                    l46 l46Var3 = (l46) obj9;
                                    int iIntValue4 = ((Integer) obj10).intValue();
                                    ((c31) obj8).getClass();
                                    if (!l46Var3.W(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                                        l46Var3.Z();
                                    } else {
                                        nte.b(o8eVar2.a, null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, new mue(((e8b) l46Var3.k(l8b.a)).q, w6c.l(27), new ar5(600), null, cr5.c(), 0L, 0L, 0, 0, 0L, null, null, 16777176), l46Var3, 0, 0, 131070);
                                    }
                                    break;
                                default:
                                    l46 l46Var4 = (l46) obj9;
                                    int iIntValue5 = ((Integer) obj10).intValue();
                                    ((c31) obj8).getClass();
                                    if (!l46Var4.W(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                                        l46Var4.Z();
                                    } else {
                                        j09 j09VarR4 = b.r(b.c(g09Var2, 1.0f));
                                        c92 c92VarA3 = a92.a(new uc0(12.0f, true, new qc0(0)), ndb.Y, l46Var4, 6);
                                        int iHashCode3 = Long.hashCode(l46Var4.T);
                                        u8a u8aVarM3 = l46Var4.m();
                                        j09 j09VarJ3 = m93.J(l46Var4, j09VarR4);
                                        lf2.q.getClass();
                                        l46Var4.j0();
                                        if (l46Var4.S) {
                                            l46Var4.l(ov7Var2);
                                        } else {
                                            l46Var4.s0();
                                        }
                                        dec.l(hj6.z, l46Var4, c92VarA3);
                                        dec.l(hj6.y, l46Var4, u8aVarM3);
                                        dec.l(hj6.X, l46Var4, Integer.valueOf(iHashCode3));
                                        dec.k(l46Var4);
                                        dec.l(hj6.x, l46Var4, j09VarJ3);
                                        String strR2 = afc.r(R.string.annual_fortune_explanation_for, new Object[]{o8eVar2.c}, l46Var4);
                                        mue mueVar2 = pue.a;
                                        mue mueVarD2 = pue.d(l46Var4);
                                        pr4 pr4Var2 = l8b.a;
                                        nte.b(strR2, null, ((e8b) l46Var4.k(pr4Var2)).u, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mueVarD2, l46Var4, 0, 0, 131066);
                                        p8c.h(48, l46Var4, b.c(g09Var2, 1.0f), o8eVar2.d);
                                        nte.b(o8eVar2.e, null, ((e8b) l46Var4.k(pr4Var2)).q, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, pue.c(l46Var4), l46Var4, 0, 0, 131066);
                                        if (ca2.a.a()) {
                                            l46Var4.f0(-1327528600);
                                            jgb.c(null, l46Var4, 6);
                                            l46Var4.r(false);
                                        } else {
                                            l46Var4.f0(-1327482472);
                                            l46Var4.r(false);
                                        }
                                        l46Var4.r(true);
                                    }
                                    break;
                            }
                            return wefVar2;
                        }
                    }, l46Var), l46Var, 3462, 2);
                    if (o8eVar.a == null) {
                        l46Var.f0(1833861758);
                        l46Var.r(false);
                        z = true;
                    } else {
                        l46Var.f0(1833861759);
                        j09 j09VarR3 = b.r(b.c(g09Var, 1.0f));
                        bx9 bx9Var2 = new bx9(20.0f, 20.0f, 20.0f, 20.0f);
                        z = true;
                        final boolean z3 = true ? 1 : 0;
                        d8c.b(j09VarR3, null, bx9Var2, af1.b0(877439605, new n26() { // from class: rg4
                            @Override // defpackage.n26
                            public final Object m(Object obj8, Object obj9, Object obj10) {
                                int i5 = z3;
                                ov7 ov7Var2 = LayoutNode.h1;
                                g09 g09Var2 = g09.a;
                                wef wefVar2 = wef.a;
                                o8e o8eVar2 = o8eVar;
                                switch (i5) {
                                    case 0:
                                        l46 l46Var2 = (l46) obj9;
                                        int iIntValue3 = ((Integer) obj10).intValue();
                                        ((c31) obj8).getClass();
                                        if (!l46Var2.W(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                                            l46Var2.Z();
                                        } else {
                                            j09 j09VarR4 = b.r(g09Var2);
                                            c92 c92VarA2 = a92.a(new uc0(12.0f, true, new qc0(0)), ndb.Y, l46Var2, 6);
                                            int iHashCode2 = Long.hashCode(l46Var2.T);
                                            u8a u8aVarM2 = l46Var2.m();
                                            j09 j09VarJ2 = m93.J(l46Var2, j09VarR4);
                                            lf2.q.getClass();
                                            l46Var2.j0();
                                            if (l46Var2.S) {
                                                l46Var2.l(ov7Var2);
                                            } else {
                                                l46Var2.s0();
                                            }
                                            dec.l(hj6.z, l46Var2, c92VarA2);
                                            dec.l(hj6.y, l46Var2, u8aVarM2);
                                            dec.l(hj6.X, l46Var2, Integer.valueOf(iHashCode2));
                                            dec.k(l46Var2);
                                            dec.l(hj6.x, l46Var2, j09VarJ2);
                                            String strR = afc.r(R.string.annual_fortune_explanation_for, new Object[]{o8eVar2.c}, l46Var2);
                                            mue mueVar = pue.a;
                                            mue mueVarD = pue.d(l46Var2);
                                            pr4 pr4Var = l8b.a;
                                            nte.b(strR, null, ((e8b) l46Var2.k(pr4Var)).u, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mueVarD, l46Var2, 0, 0, 131066);
                                            p8c.h(48, l46Var2, b.c(g09Var2, 1.0f), o8eVar2.d);
                                            nte.b(o8eVar2.e, null, ((e8b) l46Var2.k(pr4Var)).q, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, pue.c(l46Var2), l46Var2, 0, 0, 131066);
                                            if (ca2.a.a()) {
                                                l46Var2.f0(1450910543);
                                                jgb.c(null, l46Var2, 6);
                                                l46Var2.r(false);
                                            } else {
                                                l46Var2.f0(1450956671);
                                                l46Var2.r(false);
                                            }
                                            l46Var2.r(true);
                                        }
                                        break;
                                    case 1:
                                        l46 l46Var3 = (l46) obj9;
                                        int iIntValue4 = ((Integer) obj10).intValue();
                                        ((c31) obj8).getClass();
                                        if (!l46Var3.W(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                                            l46Var3.Z();
                                        } else {
                                            nte.b(o8eVar2.a, null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, new mue(((e8b) l46Var3.k(l8b.a)).q, w6c.l(27), new ar5(600), null, cr5.c(), 0L, 0L, 0, 0, 0L, null, null, 16777176), l46Var3, 0, 0, 131070);
                                        }
                                        break;
                                    default:
                                        l46 l46Var4 = (l46) obj9;
                                        int iIntValue5 = ((Integer) obj10).intValue();
                                        ((c31) obj8).getClass();
                                        if (!l46Var4.W(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                                            l46Var4.Z();
                                        } else {
                                            j09 j09VarR5 = b.r(b.c(g09Var2, 1.0f));
                                            c92 c92VarA3 = a92.a(new uc0(12.0f, true, new qc0(0)), ndb.Y, l46Var4, 6);
                                            int iHashCode3 = Long.hashCode(l46Var4.T);
                                            u8a u8aVarM3 = l46Var4.m();
                                            j09 j09VarJ3 = m93.J(l46Var4, j09VarR5);
                                            lf2.q.getClass();
                                            l46Var4.j0();
                                            if (l46Var4.S) {
                                                l46Var4.l(ov7Var2);
                                            } else {
                                                l46Var4.s0();
                                            }
                                            dec.l(hj6.z, l46Var4, c92VarA3);
                                            dec.l(hj6.y, l46Var4, u8aVarM3);
                                            dec.l(hj6.X, l46Var4, Integer.valueOf(iHashCode3));
                                            dec.k(l46Var4);
                                            dec.l(hj6.x, l46Var4, j09VarJ3);
                                            String strR2 = afc.r(R.string.annual_fortune_explanation_for, new Object[]{o8eVar2.c}, l46Var4);
                                            mue mueVar2 = pue.a;
                                            mue mueVarD2 = pue.d(l46Var4);
                                            pr4 pr4Var2 = l8b.a;
                                            nte.b(strR2, null, ((e8b) l46Var4.k(pr4Var2)).u, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mueVarD2, l46Var4, 0, 0, 131066);
                                            p8c.h(48, l46Var4, b.c(g09Var2, 1.0f), o8eVar2.d);
                                            nte.b(o8eVar2.e, null, ((e8b) l46Var4.k(pr4Var2)).q, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, pue.c(l46Var4), l46Var4, 0, 0, 131066);
                                            if (ca2.a.a()) {
                                                l46Var4.f0(-1327528600);
                                                jgb.c(null, l46Var4, 6);
                                                l46Var4.r(false);
                                            } else {
                                                l46Var4.f0(-1327482472);
                                                l46Var4.r(false);
                                            }
                                            l46Var4.r(true);
                                        }
                                        break;
                                }
                                return wefVar2;
                            }
                        }, l46Var), l46Var, 3462, 2);
                        l46Var.r(false);
                    }
                    l46Var.r(z);
                } else {
                    l46Var.Z();
                }
                return wefVar;
            case 2:
                nh4 nh4Var = (nh4) obj5;
                int iIntValue3 = ((Integer) obj2).intValue();
                l46 l46Var2 = (l46) obj3;
                int iIntValue4 = ((Integer) obj4).intValue();
                ((mx7) obj).getClass();
                if ((iIntValue4 & 48) == 0) {
                    iIntValue4 |= l46Var2.e(iIntValue3) ? 32 : 16;
                }
                if (l46Var2.W(iIntValue4 & 1, (iIntValue4 & 145) != 144)) {
                    qhe qheVar = (qhe) nh4Var.c.get(iIntValue3);
                    j09 j09VarR4 = b.r(b.p(g09Var, 64.0f));
                    di4 di4Var = (di4) s72.y0(iIntValue3, nh4Var.d);
                    kg4 kg4Var = di4Var != null ? di4Var.a : null;
                    if (kg4Var == null) {
                        l46Var2.f0(-392311782);
                    } else {
                        l46Var2.f0(1927007431);
                        strM = tm7.m(kg4Var, false, l46Var2, 3);
                    }
                    l46Var2.r(false);
                    t72.p(qheVar, j09VarR4, 0.0f, strM, null, null, l46Var2, 48, 52);
                } else {
                    l46Var2.Z();
                }
                return wefVar;
            case 3:
                SharePayload$DrawnCards sharePayload$DrawnCards = (SharePayload$DrawnCards) obj5;
                ((Integer) obj).intValue();
                a26 a26Var = (a26) obj2;
                l46 l46Var3 = (l46) obj3;
                int iIntValue5 = ((Integer) obj4).intValue();
                a26Var.getClass();
                if ((iIntValue5 & 48) == 0) {
                    iIntValue5 |= l46Var3.i(a26Var) ? 32 : 16;
                }
                if (l46Var3.W(iIntValue5 & 1, (iIntValue5 & 145) != 144)) {
                    g21.h(sharePayload$DrawnCards, a26Var, l46Var3, (iIntValue5 & 112) | SharePayload$DrawnCards.$stable);
                } else {
                    l46Var3.Z();
                }
                return wefVar;
            case 4:
                SQLiteQuery sQLiteQuery = (SQLiteQuery) obj4;
                sQLiteQuery.getClass();
                ((j9e) obj5).g(new mz5(sQLiteQuery));
                return new SQLiteCursor((SQLiteCursorDriver) obj2, (String) obj3, sQLiteQuery);
            case 5:
                GiftCardItem giftCardItem = (GiftCardItem) obj5;
                ((Integer) obj).getClass();
                a26 a26Var2 = (a26) obj2;
                l46 l46Var4 = (l46) obj3;
                int iIntValue6 = ((Integer) obj4).intValue();
                a26Var2.getClass();
                if ((iIntValue6 & 48) == 0) {
                    iIntValue6 |= l46Var4.i(a26Var2) ? 32 : 16;
                }
                if (l46Var4.W(iIntValue6 & 1, (iIntValue6 & 145) != 144)) {
                    feg.h(giftCardItem, a26Var2, null, l46Var4, (iIntValue6 & 112) | GiftCardItem.$stable);
                } else {
                    l46Var4.Z();
                }
                return wefVar;
            case 6:
                a26[] a26VarArr = (a26[]) obj5;
                int iIntValue7 = ((Integer) obj).intValue();
                Integer num = (Integer) obj2;
                int iIntValue8 = num.intValue();
                l46 l46Var5 = (l46) obj3;
                int iIntValue9 = ((Integer) obj4).intValue();
                if ((iIntValue9 & 6) == 0) {
                    i = (l46Var5.e(iIntValue7) ? 4 : 2) | iIntValue9;
                } else {
                    i = iIntValue9;
                }
                if ((iIntValue9 & 48) == 0) {
                    i |= l46Var5.e(iIntValue8) ? 32 : 16;
                }
                if (l46Var5.W(i & 1, (i & 147) != 146)) {
                    nte.b((String) a26VarArr[iIntValue7 % a26VarArr.length].d(num), null, 0L, 0L, new ar5(674), null, 0L, null, null, 0L, 0, false, 0, 0, null, null, l46Var5, 1572864, 0, 262078);
                } else {
                    l46Var5.Z();
                }
                return wefVar;
            case 7:
                z19 z19Var = (z19) obj5;
                int iIntValue10 = ((Integer) obj2).intValue();
                l46 l46Var6 = (l46) obj3;
                int iIntValue11 = ((Integer) obj4).intValue();
                ((rx9) obj).getClass();
                if ((iIntValue11 & 48) == 0) {
                    iIntValue11 |= l46Var6.e(iIntValue10) ? 32 : 16;
                }
                if (l46Var6.W(iIntValue11 & 1, (iIntValue11 & 145) != 144)) {
                    final o8e o8eVar2 = (o8e) z19Var.d.get(iIntValue10);
                    j09 j09VarR5 = b.r(b.c(g09Var, 1.0f));
                    c92 c92VarA2 = a92.a(new uc0(16.0f, true, new qc0(0)), ndb.Y, l46Var6, 6);
                    int iHashCode2 = Long.hashCode(l46Var6.T);
                    u8a u8aVarM2 = l46Var6.m();
                    j09 j09VarJ2 = m93.J(l46Var6, j09VarR5);
                    lf2.q.getClass();
                    l46Var6.j0();
                    if (l46Var6.S) {
                        l46Var6.l(ov7Var);
                    } else {
                        l46Var6.s0();
                    }
                    dec.l(hj6.z, l46Var6, c92VarA2);
                    dec.l(hj6.y, l46Var6, u8aVarM2);
                    dec.l(hj6.X, l46Var6, Integer.valueOf(iHashCode2));
                    dec.k(l46Var6);
                    dec.l(hj6.x, l46Var6, j09VarJ2);
                    d8c.b(b.r(b.c(g09Var, 1.0f)), null, new bx9(20.0f, 20.0f, 20.0f, 20.0f), af1.b0(-1604193248, new n26() { // from class: rg4
                        @Override // defpackage.n26
                        public final Object m(Object obj8, Object obj9, Object obj10) {
                            int i5 = i3;
                            ov7 ov7Var2 = LayoutNode.h1;
                            g09 g09Var2 = g09.a;
                            wef wefVar2 = wef.a;
                            o8e o8eVar3 = o8eVar2;
                            switch (i5) {
                                case 0:
                                    l46 l46Var7 = (l46) obj9;
                                    int iIntValue12 = ((Integer) obj10).intValue();
                                    ((c31) obj8).getClass();
                                    if (!l46Var7.W(iIntValue12 & 1, (iIntValue12 & 17) != 16)) {
                                        l46Var7.Z();
                                    } else {
                                        j09 j09VarR6 = b.r(g09Var2);
                                        c92 c92VarA3 = a92.a(new uc0(12.0f, true, new qc0(0)), ndb.Y, l46Var7, 6);
                                        int iHashCode3 = Long.hashCode(l46Var7.T);
                                        u8a u8aVarM3 = l46Var7.m();
                                        j09 j09VarJ3 = m93.J(l46Var7, j09VarR6);
                                        lf2.q.getClass();
                                        l46Var7.j0();
                                        if (l46Var7.S) {
                                            l46Var7.l(ov7Var2);
                                        } else {
                                            l46Var7.s0();
                                        }
                                        dec.l(hj6.z, l46Var7, c92VarA3);
                                        dec.l(hj6.y, l46Var7, u8aVarM3);
                                        dec.l(hj6.X, l46Var7, Integer.valueOf(iHashCode3));
                                        dec.k(l46Var7);
                                        dec.l(hj6.x, l46Var7, j09VarJ3);
                                        String strR = afc.r(R.string.annual_fortune_explanation_for, new Object[]{o8eVar3.c}, l46Var7);
                                        mue mueVar = pue.a;
                                        mue mueVarD = pue.d(l46Var7);
                                        pr4 pr4Var = l8b.a;
                                        nte.b(strR, null, ((e8b) l46Var7.k(pr4Var)).u, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mueVarD, l46Var7, 0, 0, 131066);
                                        p8c.h(48, l46Var7, b.c(g09Var2, 1.0f), o8eVar3.d);
                                        nte.b(o8eVar3.e, null, ((e8b) l46Var7.k(pr4Var)).q, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, pue.c(l46Var7), l46Var7, 0, 0, 131066);
                                        if (ca2.a.a()) {
                                            l46Var7.f0(1450910543);
                                            jgb.c(null, l46Var7, 6);
                                            l46Var7.r(false);
                                        } else {
                                            l46Var7.f0(1450956671);
                                            l46Var7.r(false);
                                        }
                                        l46Var7.r(true);
                                    }
                                    break;
                                case 1:
                                    l46 l46Var8 = (l46) obj9;
                                    int iIntValue13 = ((Integer) obj10).intValue();
                                    ((c31) obj8).getClass();
                                    if (!l46Var8.W(iIntValue13 & 1, (iIntValue13 & 17) != 16)) {
                                        l46Var8.Z();
                                    } else {
                                        nte.b(o8eVar3.a, null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, new mue(((e8b) l46Var8.k(l8b.a)).q, w6c.l(27), new ar5(600), null, cr5.c(), 0L, 0L, 0, 0, 0L, null, null, 16777176), l46Var8, 0, 0, 131070);
                                    }
                                    break;
                                default:
                                    l46 l46Var9 = (l46) obj9;
                                    int iIntValue14 = ((Integer) obj10).intValue();
                                    ((c31) obj8).getClass();
                                    if (!l46Var9.W(iIntValue14 & 1, (iIntValue14 & 17) != 16)) {
                                        l46Var9.Z();
                                    } else {
                                        j09 j09VarR7 = b.r(b.c(g09Var2, 1.0f));
                                        c92 c92VarA4 = a92.a(new uc0(12.0f, true, new qc0(0)), ndb.Y, l46Var9, 6);
                                        int iHashCode4 = Long.hashCode(l46Var9.T);
                                        u8a u8aVarM4 = l46Var9.m();
                                        j09 j09VarJ4 = m93.J(l46Var9, j09VarR7);
                                        lf2.q.getClass();
                                        l46Var9.j0();
                                        if (l46Var9.S) {
                                            l46Var9.l(ov7Var2);
                                        } else {
                                            l46Var9.s0();
                                        }
                                        dec.l(hj6.z, l46Var9, c92VarA4);
                                        dec.l(hj6.y, l46Var9, u8aVarM4);
                                        dec.l(hj6.X, l46Var9, Integer.valueOf(iHashCode4));
                                        dec.k(l46Var9);
                                        dec.l(hj6.x, l46Var9, j09VarJ4);
                                        String strR2 = afc.r(R.string.annual_fortune_explanation_for, new Object[]{o8eVar3.c}, l46Var9);
                                        mue mueVar2 = pue.a;
                                        mue mueVarD2 = pue.d(l46Var9);
                                        pr4 pr4Var2 = l8b.a;
                                        nte.b(strR2, null, ((e8b) l46Var9.k(pr4Var2)).u, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mueVarD2, l46Var9, 0, 0, 131066);
                                        p8c.h(48, l46Var9, b.c(g09Var2, 1.0f), o8eVar3.d);
                                        nte.b(o8eVar3.e, null, ((e8b) l46Var9.k(pr4Var2)).q, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, pue.c(l46Var9), l46Var9, 0, 0, 131066);
                                        if (ca2.a.a()) {
                                            l46Var9.f0(-1327528600);
                                            jgb.c(null, l46Var9, 6);
                                            l46Var9.r(false);
                                        } else {
                                            l46Var9.f0(-1327482472);
                                            l46Var9.r(false);
                                        }
                                        l46Var9.r(true);
                                    }
                                    break;
                            }
                            return wefVar2;
                        }
                    }, l46Var6), l46Var6, 3462, 2);
                    l46Var6.r(true);
                } else {
                    l46Var6.Z();
                }
                return wefVar;
            case 8:
                o29 o29Var = (o29) obj5;
                int iIntValue12 = ((Integer) obj2).intValue();
                l46 l46Var7 = (l46) obj3;
                int iIntValue13 = ((Integer) obj4).intValue();
                ((mx7) obj).getClass();
                if ((iIntValue13 & 48) == 0) {
                    iIntValue13 |= l46Var7.e(iIntValue12) ? 32 : 16;
                }
                if (l46Var7.W(iIntValue13 & 1, (iIntValue13 & 145) != 144)) {
                    t72.p((qhe) o29Var.c.get(iIntValue12), b.r(b.p(g09Var, 64.0f)), 0.0f, ub3.g(iIntValue12 + 1, afc.q(R.string.text_month_label, l46Var7)), null, null, l46Var7, 48, 52);
                } else {
                    l46Var7.Z();
                }
                return wefVar;
            case 9:
                xw9 xw9Var = (xw9) obj5;
                p29 p29Var = (p29) obj2;
                l46 l46Var8 = (l46) obj3;
                int iIntValue14 = ((Integer) obj4).intValue();
                ((ly) obj).getClass();
                p29Var.getClass();
                if ((iIntValue14 & 48) == 0) {
                    iIntValue14 |= (iIntValue14 & 64) == 0 ? l46Var8.g(p29Var) : l46Var8.i(p29Var) ? 32 : 16;
                }
                if (!l46Var8.W(iIntValue14 & 1, (iIntValue14 & 145) != 144)) {
                    l46Var8.Z();
                } else if (p29Var instanceof m29) {
                    l46Var8.f0(-307050509);
                    Object objR = l46Var8.R();
                    if (objR == sf2.a) {
                        objR = new l29(2, null);
                        l46Var8.p0(objR);
                    }
                    af1.o((l26) objR, l46Var8, wefVar);
                    l46Var8.r(false);
                } else if (p29Var.equals(n29.b)) {
                    l46Var8.f0(-306891820);
                    FillElement fillElement = b.c;
                    xn8 xn8VarC = s21.c(ndb.f, false);
                    int iHashCode3 = Long.hashCode(l46Var8.T);
                    u8a u8aVarM3 = l46Var8.m();
                    j09 j09VarJ3 = m93.J(l46Var8, fillElement);
                    lf2.q.getClass();
                    l46Var8.j0();
                    if (l46Var8.S) {
                        l46Var8.l(ov7Var);
                    } else {
                        l46Var8.s0();
                    }
                    dec.l(hj6.z, l46Var8, xn8VarC);
                    dec.l(hj6.y, l46Var8, u8aVarM3);
                    dec.l(hj6.X, l46Var8, Integer.valueOf(iHashCode3));
                    dec.k(l46Var8);
                    dec.l(hj6.x, l46Var8, j09VarJ3);
                    jgb.w(null, 0L, 0.0f, l46Var8, 0);
                    l46Var8.r(true);
                    l46Var8.r(false);
                } else {
                    if (!(p29Var instanceof o29)) {
                        throw tec.d(-1949569004, l46Var8, false);
                    }
                    l46Var8.f0(-306665799);
                    if9.h(mh3.d0(ynb.b0(20.0f, 0.0f, ynb.Y(b.c, xw9Var), 2), mh3.T(l46Var8), false, 14), (o29) p29Var, l46Var8, (iIntValue14 & 112) | 64);
                    l46Var8.r(false);
                }
                return wefVar;
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                ArrayList arrayList = (ArrayList) obj5;
                int iIntValue15 = ((Integer) obj2).intValue();
                l46 l46Var9 = (l46) obj3;
                int iIntValue16 = ((Integer) obj4).intValue();
                ((rx9) obj).getClass();
                if ((iIntValue16 & 48) == 0) {
                    iIntValue16 |= l46Var9.e(iIntValue15) ? 32 : 16;
                }
                if (l46Var9.W(iIntValue16 & 1, (iIntValue16 & 145) != 144)) {
                    y41.c((ob5) arrayList.get(iIntValue15), b.c(g09Var, 1.0f), l46Var9, 48);
                } else {
                    l46Var9.Z();
                }
                return wefVar;
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                u5b u5bVar = (u5b) obj5;
                int iIntValue17 = ((Integer) obj2).intValue();
                l46 l46Var10 = (l46) obj3;
                int iIntValue18 = ((Integer) obj4).intValue();
                ((rx9) obj).getClass();
                if ((iIntValue18 & 48) == 0) {
                    iIntValue18 |= l46Var10.e(iIntValue17) ? 32 : 16;
                }
                if (l46Var10.W(iIntValue18 & 1, (iIntValue18 & 145) != 144)) {
                    FillElement fillElement2 = b.c;
                    xn8 xn8VarC2 = s21.c(ndb.c, false);
                    int iHashCode4 = Long.hashCode(l46Var10.T);
                    u8a u8aVarM4 = l46Var10.m();
                    j09 j09VarJ4 = m93.J(l46Var10, fillElement2);
                    lf2.q.getClass();
                    l46Var10.j0();
                    if (l46Var10.S) {
                        l46Var10.l(ov7Var);
                    } else {
                        l46Var10.s0();
                    }
                    dec.l(hj6.z, l46Var10, xn8VarC2);
                    dec.l(hj6.y, l46Var10, u8aVarM4);
                    dec.l(hj6.X, l46Var10, Integer.valueOf(iHashCode4));
                    dec.k(l46Var10);
                    dec.l(hj6.x, l46Var10, j09VarJ4);
                    j09 j09VarB0 = ynb.b0(30.0f, 0.0f, b.c(g09Var, 1.0f), 2);
                    String question = ((PersonalityAnalysisQuestion) ((t5b) u5bVar).a.get(iIntValue17)).getQuestion();
                    mue mueVar = pue.a;
                    nte.b(question, j09VarB0, ((m82) l46Var10.k(o82.a)).q, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, pue.o(l46Var10), l46Var10, 48, 0, 131064);
                    l46Var10.r(true);
                } else {
                    l46Var10.Z();
                }
                return wefVar;
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                fwc fwcVar = (fwc) obj5;
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                bv7 bv7Var = (bv7) obj2;
                hl9 hl9Var = (hl9) obj3;
                wuc wucVar = (wuc) obj4;
                long jL = bv7Var.l();
                hkb hkbVar = new hkb(0.0f, 0.0f, (int) (jL >> 32), (int) (jL & 4294967295L));
                boolean zD = dj6.D(hl9Var.a, hkbVar);
                long jN = hl9Var.a;
                if (!zD) {
                    jN = xxb.n(jN, hkbVar);
                }
                long jB = fwcVar.b(bv7Var, jN);
                if ((9223372034707292159L & jB) != 9205357640488583168L) {
                    fwcVar.o(zBooleanValue);
                    fwcVar.G0 = null;
                    fwcVar.t(jB, 9205357640488583168L, false, wucVar);
                    fo5.a(fwcVar.v);
                    fwcVar.q(false);
                    fwcVar.H0 = true;
                }
                return wefVar;
            default:
                Bitmap bitmap = (Bitmap) obj5;
                ((Integer) obj).getClass();
                a26 a26Var3 = (a26) obj2;
                l46 l46Var11 = (l46) obj3;
                int iIntValue19 = ((Integer) obj4).intValue();
                a26Var3.getClass();
                if ((iIntValue19 & 48) == 0) {
                    iIntValue19 |= l46Var11.i(a26Var3) ? 32 : 16;
                }
                if (l46Var11.W(iIntValue19 & 1, (iIntValue19 & 145) != 144)) {
                    FillElement fillElement3 = b.c;
                    xn8 xn8VarC3 = s21.c(ndb.b, false);
                    int iHashCode5 = Long.hashCode(l46Var11.T);
                    u8a u8aVarM5 = l46Var11.m();
                    j09 j09VarJ5 = m93.J(l46Var11, fillElement3);
                    lf2.q.getClass();
                    l46Var11.j0();
                    if (l46Var11.S) {
                        l46Var11.l(ov7Var);
                    } else {
                        l46Var11.s0();
                    }
                    dec.l(hj6.z, l46Var11, xn8VarC3);
                    dec.l(hj6.y, l46Var11, u8aVarM5);
                    dec.l(hj6.X, l46Var11, Integer.valueOf(iHashCode5));
                    dec.k(l46Var11);
                    dec.l(hj6.x, l46Var11, j09VarJ5);
                    gdc.a(bitmap, null, fillElement3, an2.b, null, l46Var11, 1573296, 1976);
                    l46Var11.r(true);
                    a26Var3.d(bitmap);
                } else {
                    l46Var11.Z();
                }
                return wefVar;
        }
    }
}
