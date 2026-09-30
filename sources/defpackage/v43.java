package defpackage;

import ai.askquin.model.TarotSkinIdentify;
import ai.askquin.ui.explore.model.DailyCardBasicInfo;
import androidx.compose.foundation.layout.b;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class v43 implements l26 {
    public final /* synthetic */ int a = 2;
    public final /* synthetic */ Object b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ m26 f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ boolean v;
    public final /* synthetic */ Object w;
    public final /* synthetic */ Object x;
    public final /* synthetic */ TarotSkinIdentify y;
    public final /* synthetic */ boolean z;

    public /* synthetic */ v43(s69 s69Var, boolean z, boolean z2, boolean z3, a26 a26Var, e89 e89Var, boolean z4, DailyCardBasicInfo dailyCardBasicInfo, qhe qheVar, TarotSkinIdentify tarotSkinIdentify, boolean z5) {
        this.b = s69Var;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = a26Var;
        this.g = e89Var;
        this.v = z4;
        this.w = dailyCardBasicInfo;
        this.x = qheVar;
        this.y = tarotSkinIdentify;
        this.z = z5;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        int i = this.a;
        i8c i8cVar = sf2.a;
        wef wefVar = wef.a;
        Object obj3 = this.x;
        Object obj4 = this.w;
        Object obj5 = this.b;
        Object obj6 = this.g;
        m26 m26Var = this.f;
        int i2 = 2;
        switch (i) {
            case 0:
                a26 a26Var = (a26) m26Var;
                e89 e89Var = (e89) obj6;
                s69 s69Var = (s69) obj5;
                DailyCardBasicInfo dailyCardBasicInfo = (DailyCardBasicInfo) obj4;
                qhe qheVar = (qhe) obj3;
                l46 l46Var = (l46) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!l46Var.W(iIntValue & 1, (iIntValue & 3) != 2)) {
                    l46Var.Z();
                } else {
                    j09 j09VarC = b.c(g09.a, 1.0f);
                    int iJ = ((sz9) s69Var).j();
                    boolean z = this.c && this.d && ((Boolean) e89Var.getValue()).booleanValue();
                    Integer numValueOf = Integer.valueOf(iJ);
                    boolean zG = l46Var.g(a26Var);
                    Object objR = l46Var.R();
                    if (zG || objR == i8cVar) {
                        objR = new k50(a26Var, i2);
                        l46Var.p0(objR);
                    }
                    j09 j09VarZ = dj6.z(16, (l26) objR, j09VarC, numValueOf, "daily_long", true, z, this.e);
                    boolean zG2 = l46Var.g(e89Var);
                    Object objR2 = l46Var.R();
                    if (zG2 || objR2 == i8cVar) {
                        objR2 = new pg(e89Var, 20);
                        l46Var.p0(objR2);
                    }
                    h7d.f(j09VarZ, x82.a, 0.2f, 0.0f, (a26) objR2, af1.b0(1205644070, new w43(this.v, dailyCardBasicInfo, qheVar, this.y, this.z, 0), l46Var), l46Var, 200112, 0);
                }
                break;
            case 1:
                s69 s69Var2 = (s69) obj5;
                a26 a26Var2 = (a26) m26Var;
                e89 e89Var2 = (e89) obj6;
                DailyCardBasicInfo dailyCardBasicInfo2 = (DailyCardBasicInfo) obj4;
                qhe qheVar2 = (qhe) obj3;
                l46 l46Var2 = (l46) obj;
                int iIntValue2 = ((Integer) obj2).intValue();
                if (!l46Var2.W(1 & iIntValue2, (iIntValue2 & 3) != 2)) {
                    l46Var2.Z();
                } else {
                    pr4 pr4Var = o10.a;
                    boolean zG3 = l46Var2.g(s69Var2);
                    Object objR3 = l46Var2.R();
                    if (zG3 || objR3 == i8cVar) {
                        objR3 = new q50(s69Var2, 2);
                        l46Var2.p0(objR3);
                    }
                    mh3.a(pr4Var.a((x16) objR3), af1.b0(-1720777786, new v43(this.c, this.d, this.e, a26Var2, e89Var2, s69Var2, this.v, dailyCardBasicInfo2, qheVar2, this.y, this.z), l46Var2), l46Var2, 56);
                }
                break;
            default:
                ((Integer) obj2).getClass();
                urg.e(this.y, this.c, this.d, this.e, this.v, this.z, (x16) m26Var, (x16) obj6, (x16) obj5, (x16) obj4, (j09) obj3, (l46) obj, k99.P(1));
                break;
        }
        return wefVar;
    }

    public /* synthetic */ v43(TarotSkinIdentify tarotSkinIdentify, boolean z, boolean z2, boolean z3, boolean z4, boolean z5, x16 x16Var, x16 x16Var2, x16 x16Var3, x16 x16Var4, j09 j09Var, int i) {
        this.y = tarotSkinIdentify;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.v = z4;
        this.z = z5;
        this.f = x16Var;
        this.g = x16Var2;
        this.b = x16Var3;
        this.w = x16Var4;
        this.x = j09Var;
    }

    public /* synthetic */ v43(boolean z, boolean z2, boolean z3, a26 a26Var, e89 e89Var, s69 s69Var, boolean z4, DailyCardBasicInfo dailyCardBasicInfo, qhe qheVar, TarotSkinIdentify tarotSkinIdentify, boolean z5) {
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = a26Var;
        this.g = e89Var;
        this.b = s69Var;
        this.v = z4;
        this.w = dailyCardBasicInfo;
        this.x = qheVar;
        this.y = tarotSkinIdentify;
        this.z = z5;
    }
}
