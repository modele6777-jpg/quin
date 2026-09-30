package defpackage;

import ai.askquin.R;
import tech.chatmind.api.SpreadRecommendationResult;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class kvd implements n26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ SpreadRecommendationResult b;
    public final /* synthetic */ suc c;
    public final /* synthetic */ int d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ a26 f;

    public /* synthetic */ kvd(SpreadRecommendationResult spreadRecommendationResult, suc sucVar, int i, boolean z, a26 a26Var, int i2) {
        this.a = i2;
        this.b = spreadRecommendationResult;
        this.c = sucVar;
        this.d = i;
        this.e = z;
        this.f = a26Var;
    }

    @Override // defpackage.n26
    public final Object m(Object obj, Object obj2, Object obj3) {
        String strR;
        int i = this.a;
        wef wefVar = wef.a;
        switch (i) {
            case 0:
                l46 l46Var = (l46) obj2;
                int iIntValue = ((Integer) obj3).intValue();
                ((d92) obj).getClass();
                if (!l46Var.W(iIntValue & 1, (iIntValue & 17) != 16)) {
                    l46Var.Z();
                } else {
                    SpreadRecommendationResult spreadRecommendationResult = this.b;
                    if (ywd.a(spreadRecommendationResult) == mi.BASIC) {
                        l46Var.f0(-1050354778);
                        strR = afc.r(R.string.spread_basic, new Object[]{Integer.valueOf(spreadRecommendationResult.getPatternData().size())}, l46Var);
                        l46Var.r(false);
                    } else {
                        l46Var.f0(-1050352087);
                        strR = afc.r(R.string.spread_advanced, new Object[]{Integer.valueOf(spreadRecommendationResult.getPatternData().size())}, l46Var);
                        l46Var.r(false);
                    }
                    String str = strR;
                    String recommendSpreadReasonTitle = spreadRecommendationResult.getRecommendSpreadReasonTitle();
                    int size = spreadRecommendationResult.getPatternData().size();
                    int usageCount = spreadRecommendationResult.getUsageCount();
                    suc sucVar = this.c;
                    quc qucVar = sucVar instanceof quc ? (quc) sucVar : null;
                    int i2 = this.d;
                    boolean z = qucVar != null && qucVar.a == i2;
                    a26 a26Var = this.f;
                    boolean zG = l46Var.g(a26Var) | l46Var.e(i2);
                    Object objR = l46Var.R();
                    if (zG || objR == sf2.a) {
                        objR = new rr1(i2, 10, a26Var);
                        l46Var.p0(objR);
                    }
                    q7c.f(null, str, recommendSpreadReasonTitle, size, usageCount, this.e, z, (x16) objR, l46Var, 0);
                }
                break;
            default:
                l46 l46Var2 = (l46) obj2;
                int iIntValue2 = ((Integer) obj3).intValue();
                ((mx7) obj).getClass();
                if (!l46Var2.W(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    l46Var2.Z();
                } else {
                    jgb.C(null, false, null, af1.b0(1898346246, new kvd(this.b, this.c, this.d, this.e, this.f, 0), l46Var2), l46Var2, 3072, 7);
                }
                break;
        }
        return wefVar;
    }
}
