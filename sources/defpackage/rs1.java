package defpackage;

import tech.chatmind.api.TarotCardChoice;
import tech.chatmind.api.TarotCardType;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class rs1 extends gbe implements l26 {
    final /* synthetic */ a26 $onSingleSelect;
    final /* synthetic */ e89 $selectedForReturn$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rs1(a26 a26Var, e89 e89Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.$onSingleSelect = a26Var;
        this.$selectedForReturn$delegate = e89Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new rs1(this.$onSingleSelect, this.$selectedForReturn$delegate, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            if (((TarotCardType) this.$selectedForReturn$delegate.getValue()) != null) {
                this.label = 1;
                Object objQ = vfh.q(100L, this);
                bw2 bw2Var = bw2.a;
                if (objQ == bw2Var) {
                    return bw2Var;
                }
            }
            return wef.a;
        }
        if (i != 1) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        a26 a26Var = this.$onSingleSelect;
        TarotCardType tarotCardType = (TarotCardType) this.$selectedForReturn$delegate.getValue();
        tarotCardType.getClass();
        a26Var.d(new TarotCardChoice(tarotCardType, false, (String) null, 4, (rp3) null));
        this.$selectedForReturn$delegate.setValue(null);
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((rs1) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
