package defpackage;

import ai.askquin.data.QuotaBlockReason;
import ai.askquin.ui.conversation.ClarifyingCardDrawActionState;
import ai.askquin.ui.conversation.ClarifyingCardSkipActionState;
import ai.askquin.ui.conversation.dialogue.ClarifyingCardState;
import ai.askquin.ui.conversation.r0;
import ai.askquin.ui.divination.OverviewItem;
import ai.askquin.ui.divination.k;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.b;
import tech.chatmind.api.TarotCardChoice;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ns2 implements n26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object v;
    public final /* synthetic */ Object w;
    public final /* synthetic */ Object x;

    public /* synthetic */ ns2(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, Object obj9, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
        this.g = obj6;
        this.v = obj7;
        this.w = obj8;
        this.x = obj9;
    }

    @Override // defpackage.n26
    public final Object m(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        wef wefVar = wef.a;
        final int i2 = 2;
        i8c i8cVar = sf2.a;
        Object obj4 = this.x;
        Object obj5 = this.w;
        Object obj6 = this.v;
        Object obj7 = this.g;
        Object obj8 = this.f;
        Object obj9 = this.e;
        Object obj10 = this.d;
        Object obj11 = this.c;
        Object obj12 = this.b;
        final int i3 = 0;
        final int i4 = 1;
        switch (i) {
            case 0:
                use useVar = (use) obj12;
                tr2 tr2Var = (tr2) obj11;
                xw9 xw9Var = (xw9) obj10;
                kzd kzdVar = (kzd) obj9;
                ii6 ii6Var = (ii6) obj8;
                r0 r0Var = (r0) obj7;
                t7 t7Var = (t7) obj6;
                e89 e89Var = (e89) obj5;
                e89 e89Var2 = (e89) obj4;
                boolean zBooleanValue = ((Boolean) obj).booleanValue();
                l46 l46Var = (l46) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                if ((iIntValue & 6) == 0) {
                    iIntValue |= l46Var.h(zBooleanValue) ? 4 : 2;
                }
                if (!l46Var.W(iIntValue & 1, (iIntValue & 19) != 18)) {
                    l46Var.Z();
                } else if (!zBooleanValue) {
                    l46Var.f0(1462261746);
                    FillElement fillElement = b.c;
                    boolean zI = l46Var.i(r0Var) | l46Var.i(tr2Var) | l46Var.i(t7Var);
                    Object objR = l46Var.R();
                    if (zI || objR == i8cVar) {
                        objR = new w6(r0Var, tr2Var, t7Var, 21);
                        l46Var.p0(objR);
                    }
                    k.e(tr2Var, fillElement, xw9Var, (a26) objR, l46Var, 56);
                    l46Var.r(false);
                } else {
                    l46Var.f0(1461902425);
                    boolean z = !((Boolean) e89Var.getValue()).booleanValue() && useVar.d().c.length() == 0;
                    boolean zBooleanValue2 = ((Boolean) e89Var2.getValue()).booleanValue();
                    int i5 = kzd.e;
                    kc4.a(tr2Var, xw9Var, kzdVar, z, ii6Var, zBooleanValue2, l46Var, 520);
                    l46Var.r(false);
                }
                break;
            default:
                bx9 bx9Var = (bx9) obj12;
                final OverviewItem.ClarifyingCardItem clarifyingCardItem = (OverviewItem.ClarifyingCardItem) obj11;
                QuotaBlockReason quotaBlockReason = (QuotaBlockReason) obj10;
                ip5 ip5Var = (ip5) obj9;
                final a26 a26Var = (a26) obj8;
                final a26 a26Var2 = (a26) obj7;
                final a26 a26Var3 = (a26) obj6;
                a26 a26Var4 = (a26) obj5;
                a26 a26Var5 = (a26) obj4;
                l46 l46Var2 = (l46) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((mx7) obj).getClass();
                if (!l46Var2.W(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    l46Var2.Z();
                } else {
                    j09 j09VarY = ynb.Y(g09.a, bx9Var);
                    String label = clarifyingCardItem.getLabel();
                    ClarifyingCardState state = clarifyingCardItem.getState();
                    TarotCardChoice card = clarifyingCardItem.getCard();
                    TarotCardChoice pendingCard = clarifyingCardItem.getPendingCard();
                    ClarifyingCardDrawActionState drawActionState = clarifyingCardItem.getDrawActionState();
                    ClarifyingCardSkipActionState skipActionState = clarifyingCardItem.getSkipActionState();
                    boolean zG = l46Var2.g(a26Var) | l46Var2.i(clarifyingCardItem);
                    Object objR2 = l46Var2.R();
                    if (zG || objR2 == i8cVar) {
                        objR2 = new x16() { // from class: gv9
                            @Override // defpackage.x16
                            public final Object invoke() {
                                int i6 = i3;
                                wef wefVar2 = wef.a;
                                OverviewItem.ClarifyingCardItem clarifyingCardItem2 = clarifyingCardItem;
                                a26 a26Var6 = a26Var;
                                switch (i6) {
                                    case 0:
                                        a26Var6.d(clarifyingCardItem2);
                                        break;
                                    case 1:
                                        a26Var6.d(clarifyingCardItem2);
                                        break;
                                    default:
                                        a26Var6.d(clarifyingCardItem2);
                                        break;
                                }
                                return wefVar2;
                            }
                        };
                        l46Var2.p0(objR2);
                    }
                    x16 x16Var = (x16) objR2;
                    boolean zG2 = l46Var2.g(a26Var2) | l46Var2.i(clarifyingCardItem);
                    Object objR3 = l46Var2.R();
                    if (zG2 || objR3 == i8cVar) {
                        objR3 = new x16() { // from class: gv9
                            @Override // defpackage.x16
                            public final Object invoke() {
                                int i6 = i4;
                                wef wefVar2 = wef.a;
                                OverviewItem.ClarifyingCardItem clarifyingCardItem2 = clarifyingCardItem;
                                a26 a26Var6 = a26Var2;
                                switch (i6) {
                                    case 0:
                                        a26Var6.d(clarifyingCardItem2);
                                        break;
                                    case 1:
                                        a26Var6.d(clarifyingCardItem2);
                                        break;
                                    default:
                                        a26Var6.d(clarifyingCardItem2);
                                        break;
                                }
                                return wefVar2;
                            }
                        };
                        l46Var2.p0(objR3);
                    }
                    x16 x16Var2 = (x16) objR3;
                    boolean zG3 = l46Var2.g(a26Var3) | l46Var2.i(clarifyingCardItem);
                    Object objR4 = l46Var2.R();
                    if (zG3 || objR4 == i8cVar) {
                        objR4 = new x16() { // from class: gv9
                            @Override // defpackage.x16
                            public final Object invoke() {
                                int i6 = i2;
                                wef wefVar2 = wef.a;
                                OverviewItem.ClarifyingCardItem clarifyingCardItem2 = clarifyingCardItem;
                                a26 a26Var6 = a26Var3;
                                switch (i6) {
                                    case 0:
                                        a26Var6.d(clarifyingCardItem2);
                                        break;
                                    case 1:
                                        a26Var6.d(clarifyingCardItem2);
                                        break;
                                    default:
                                        a26Var6.d(clarifyingCardItem2);
                                        break;
                                }
                                return wefVar2;
                            }
                        };
                        l46Var2.p0(objR4);
                    }
                    ap5.e(label, state, card, pendingCard, drawActionState, skipActionState, quotaBlockReason, ip5Var, x16Var, x16Var2, (x16) objR4, a26Var4, a26Var5, j09VarY, l46Var2, 0);
                }
                break;
        }
        return wefVar;
    }
}
