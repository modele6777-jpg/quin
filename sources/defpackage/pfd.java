package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class pfd extends gbe implements l26 {
    final /* synthetic */ jp1 $cardBounds;
    final /* synthetic */ int $cardCount;
    final /* synthetic */ a26 $onCardsChange;
    final /* synthetic */ x16 $scatter;
    final /* synthetic */ egd $state;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pfd(int i, jp1 jp1Var, xn2 xn2Var, x16 x16Var, a26 a26Var, egd egdVar) {
        super(2, xn2Var);
        this.$onCardsChange = a26Var;
        this.$cardBounds = jp1Var;
        this.$cardCount = i;
        this.$scatter = x16Var;
        this.$state = egdVar;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        a26 a26Var = this.$onCardsChange;
        return new pfd(this.$cardCount, this.$cardBounds, xn2Var, this.$scatter, a26Var, this.$state);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            a26 a26Var = this.$onCardsChange;
            jp1 jp1Var = this.$cardBounds;
            long j = jp1Var.a;
            float f = jp1Var.b;
            int i2 = this.$cardCount;
            ArrayList arrayList = new ArrayList(i2);
            for (int i3 = 0; i3 < i2; i3++) {
                arrayList.add(new fgd(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (4294967295L & j)) - (i3 * f), 0.0f));
            }
            a26Var.d(arrayList);
            this.label = 1;
            Object objQ = vfh.q(300L, this);
            bw2 bw2Var = bw2.a;
            if (objQ == bw2Var) {
                return bw2Var;
            }
        } else {
            if (i != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(obj);
        }
        this.$onCardsChange.d(this.$scatter.invoke());
        this.$state.b.setValue(hgd.b);
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((pfd) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
