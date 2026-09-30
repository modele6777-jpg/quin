package defpackage;

import ai.askquin.data.InAppMessageUiModel;
import ai.askquin.model.TarotSkinIdentify;
import androidx.compose.foundation.layout.b;
import androidx.compose.ui.node.LayoutNode;
import java.util.List;
import tech.chatmind.api.seasonal.model.SeasonalHistoryItem;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class a07 implements o26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ List b;
    public final /* synthetic */ Object c;

    public /* synthetic */ a07(List list, Object obj, int i) {
        this.a = i;
        this.b = list;
        this.c = obj;
    }

    @Override // defpackage.o26
    public final Object t(Object obj, Object obj2, Object obj3, Object obj4) {
        int i = this.a;
        i8c i8cVar = sf2.a;
        wef wefVar = wef.a;
        Object obj5 = this.c;
        List list = this.b;
        boolean z = false;
        switch (i) {
            case 0:
                mx7 mx7Var = (mx7) obj;
                int iIntValue = ((Number) obj2).intValue();
                l46 l46Var = (l46) obj3;
                int iIntValue2 = ((Number) obj4).intValue();
                int i2 = (iIntValue2 & 6) == 0 ? iIntValue2 | (l46Var.g(mx7Var) ? 4 : 2) : iIntValue2;
                if ((iIntValue2 & 48) == 0) {
                    i2 |= l46Var.e(iIntValue) ? 32 : 16;
                }
                if (!l46Var.W(i2 & 1, (i2 & 147) != 146)) {
                    l46Var.Z();
                } else {
                    InAppMessageUiModel inAppMessageUiModel = (InAppMessageUiModel) list.get(iIntValue);
                    l46Var.f0(2071801304);
                    vd0.z(null, inAppMessageUiModel, (a26) obj5, l46Var, InAppMessageUiModel.$stable << 3);
                    l46Var.r(false);
                }
                break;
            case 1:
                mx7 mx7Var2 = (mx7) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                l46 l46Var2 = (l46) obj3;
                int iIntValue4 = ((Number) obj4).intValue();
                a26 a26Var = (a26) obj5;
                int i3 = (iIntValue4 & 6) == 0 ? iIntValue4 | (l46Var2.g(mx7Var2) ? 4 : 2) : iIntValue4;
                if ((iIntValue4 & 48) == 0) {
                    i3 |= l46Var2.e(iIntValue3) ? 32 : 16;
                }
                if (!l46Var2.W(i3 & 1, (i3 & 147) != 146)) {
                    l46Var2.Z();
                } else {
                    SeasonalHistoryItem seasonalHistoryItem = (SeasonalHistoryItem) list.get(iIntValue3);
                    l46Var2.f0(-249880727);
                    boolean zG = l46Var2.g(a26Var) | l46Var2.i(seasonalHistoryItem);
                    Object objR = l46Var2.R();
                    if (zG || objR == i8cVar) {
                        objR = new n5(a26Var, seasonalHistoryItem, z, 23);
                        l46Var2.p0(objR);
                    }
                    vlc.a(seasonalHistoryItem, (x16) objR, l46Var2, SeasonalHistoryItem.$stable);
                    l46Var2.r(false);
                }
                break;
            case 2:
                mx7 mx7Var3 = (mx7) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                l46 l46Var3 = (l46) obj3;
                int iIntValue6 = ((Number) obj4).intValue();
                int i4 = (iIntValue6 & 6) == 0 ? iIntValue6 | (l46Var3.g(mx7Var3) ? 4 : 2) : iIntValue6;
                if ((iIntValue6 & 48) == 0) {
                    i4 |= l46Var3.e(iIntValue5) ? 32 : 16;
                }
                if (!l46Var3.W(i4 & 1, (i4 & 147) != 146)) {
                    l46Var3.Z();
                } else {
                    mmd mmdVar = (mmd) list.get(iIntValue5);
                    l46Var3.f0(721579006);
                    jgb.C(null, false, null, af1.b0(-375720670, new cnd(mmdVar, (a26) obj5), l46Var3), l46Var3, 3072, 7);
                    l46Var3.r(false);
                }
                break;
            case 3:
                mx7 mx7Var4 = (mx7) obj;
                int iIntValue7 = ((Number) obj2).intValue();
                l46 l46Var4 = (l46) obj3;
                int iIntValue8 = ((Number) obj4).intValue();
                a26 a26Var2 = (a26) obj5;
                int i5 = (iIntValue8 & 6) == 0 ? (l46Var4.g(mx7Var4) ? 4 : 2) | iIntValue8 : iIntValue8;
                if ((iIntValue8 & 48) == 0) {
                    i5 |= l46Var4.e(iIntValue7) ? 32 : 16;
                }
                if (!l46Var4.W(i5 & 1, (i5 & 147) != 146)) {
                    l46Var4.Z();
                } else {
                    String str = (String) list.get(iIntValue7);
                    l46Var4.f0(492192840);
                    j09 j09VarA = mx7.a(mx7Var4, g09.a);
                    boolean zG2 = l46Var4.g(a26Var2) | l46Var4.g(str);
                    Object objR2 = l46Var4.R();
                    if (zG2 || objR2 == i8cVar) {
                        objR2 = new n5(a26Var2, str, z, 25);
                        l46Var4.p0(objR2);
                    }
                    wle.b(j09VarA, str, false, null, null, null, null, null, null, null, false, (x16) objR2, l46Var4, 384, 0, 4088);
                    l46Var4.r(false);
                }
                break;
            default:
                vw7 vw7Var = (vw7) obj;
                int iIntValue9 = ((Number) obj2).intValue();
                l46 l46Var5 = (l46) obj3;
                int iIntValue10 = ((Number) obj4).intValue();
                int i6 = (iIntValue10 & 6) == 0 ? iIntValue10 | (l46Var5.g(vw7Var) ? 4 : 2) : iIntValue10;
                if ((iIntValue10 & 48) == 0) {
                    i6 |= l46Var5.e(iIntValue9) ? 32 : 16;
                }
                if (!l46Var5.W(i6 & 1, (i6 & 147) != 146)) {
                    l46Var5.Z();
                } else {
                    String str2 = (String) list.get(iIntValue9);
                    l46Var5.f0(708073592);
                    qhe qheVar = new qhe(str2, 1);
                    g09 g09Var = g09.a;
                    j09 j09VarC = b.c(g09Var, 1.0f);
                    c92 c92VarA = a92.a(new uc0(4.0f, true, new qc0(0)), ndb.Z, l46Var5, 54);
                    int iHashCode = Long.hashCode(l46Var5.T);
                    u8a u8aVarM = l46Var5.m();
                    j09 j09VarJ = m93.J(l46Var5, j09VarC);
                    lf2.q.getClass();
                    l46Var5.j0();
                    if (l46Var5.S) {
                        l46Var5.l(LayoutNode.h1);
                    } else {
                        l46Var5.s0();
                    }
                    dec.l(hj6.z, l46Var5, c92VarA);
                    dec.l(hj6.y, l46Var5, u8aVarM);
                    dec.l(hj6.X, l46Var5, Integer.valueOf(iHashCode));
                    dec.k(l46Var5);
                    dec.l(hj6.x, l46Var5, j09VarJ);
                    o7c.d(g09Var, qheVar, (TarotSkinIdentify) obj5, false, null, 6.0f, null, false, l46Var5, 196614, 216);
                    String strQ = afc.q(r8c.f(qheVar), l46Var5);
                    mue mueVar = oue.a;
                    nte.b(strQ, null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, pue.f(l46Var5), l46Var5, 0, 0, 131070);
                    l46Var5.r(true);
                    l46Var5.r(false);
                }
                break;
        }
        return wefVar;
    }
}
