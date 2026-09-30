package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class sfd extends gbe implements l26 {
    final /* synthetic */ jp1 $cardBounds;
    final /* synthetic */ int $cardCount;
    final /* synthetic */ a26 $onCardsChange;
    final /* synthetic */ x16 $scatter;
    final /* synthetic */ egd $state;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sfd(int i, jp1 jp1Var, xn2 xn2Var, x16 x16Var, a26 a26Var, egd egdVar) {
        super(2, xn2Var);
        this.$state = egdVar;
        this.$onCardsChange = a26Var;
        this.$cardBounds = jp1Var;
        this.$cardCount = i;
        this.$scatter = x16Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        egd egdVar = this.$state;
        a26 a26Var = this.$onCardsChange;
        return new sfd(this.$cardCount, this.$cardBounds, xn2Var, this.$scatter, a26Var, egdVar);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        int iOrdinal = this.$state.a().ordinal();
        int i = 0;
        if (iOrdinal == 0) {
            a26 a26Var = this.$onCardsChange;
            jp1 jp1Var = this.$cardBounds;
            long j = jp1Var.a;
            float f = jp1Var.b;
            int i2 = this.$cardCount;
            ArrayList arrayList = new ArrayList(i2);
            while (i < i2) {
                arrayList.add(new fgd(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (j & 4294967295L)) - (i * f), 0.0f));
                i++;
            }
            a26Var.d(arrayList);
        } else if (iOrdinal != 1) {
            if (iOrdinal == 2) {
                this.$onCardsChange.d(this.$scatter.invoke());
            } else {
                if (iOrdinal != 3 && iOrdinal != 4) {
                    ap.c();
                    return null;
                }
                a26 a26Var2 = this.$onCardsChange;
                jp1 jp1Var2 = this.$cardBounds;
                long j2 = jp1Var2.a;
                float f2 = jp1Var2.b;
                int i3 = this.$cardCount;
                ArrayList arrayList2 = new ArrayList(i3);
                while (i < i3) {
                    arrayList2.add(new fgd(Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j2 & 4294967295L)) - (i * f2), 0.0f));
                    i++;
                }
                a26Var2.d(arrayList2);
            }
        }
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        sfd sfdVar = (sfd) k((xn2) obj2, (aw2) obj);
        wef wefVar = wef.a;
        sfdVar.r(wefVar);
        return wefVar;
    }
}
