package defpackage;

import ai.askquin.model.TarotSkinIdentify;
import tech.chatmind.api.TarotCardType;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class zjd implements l26 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ j09 b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ n26 d;
    public final /* synthetic */ float e;
    public final /* synthetic */ float f;
    public final /* synthetic */ int g;
    public final /* synthetic */ int v;
    public final /* synthetic */ Object w;
    public final /* synthetic */ Object x;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    public /* synthetic */ zjd(uod uodVar, gpd gpdVar, j09 j09Var, boolean z, pod podVar, l26 l26Var, n26 n26Var, float f, float f2, int i, int i2) {
        this.w = uodVar;
        this.x = gpdVar;
        this.b = j09Var;
        this.c = z;
        this.y = podVar;
        this.z = l26Var;
        this.d = n26Var;
        this.e = f;
        this.f = f2;
        this.g = i;
        this.v = i2;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        int i = this.a;
        wef wefVar = wef.a;
        int i2 = this.g;
        Object obj3 = this.z;
        Object obj4 = this.y;
        Object obj5 = this.x;
        Object obj6 = this.w;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iP = k99.P(i2 | 1);
                fdc.b((TarotCardType) obj6, (TarotSkinIdentify) obj5, this.e, this.b, this.f, (dr1) obj4, (yi4) obj3, this.c, this.d, (l46) obj, iP, this.v);
                break;
            default:
                ((Integer) obj2).getClass();
                int iP2 = k99.P(i2 | 1);
                int iP3 = k99.P(this.v);
                ((uod) obj6).c((gpd) obj5, this.b, this.c, (pod) obj4, (l26) obj3, this.d, this.e, this.f, (l46) obj, iP2, iP3);
                break;
        }
        return wefVar;
    }

    public /* synthetic */ zjd(TarotCardType tarotCardType, TarotSkinIdentify tarotSkinIdentify, float f, j09 j09Var, float f2, dr1 dr1Var, yi4 yi4Var, boolean z, n26 n26Var, int i, int i2) {
        this.w = tarotCardType;
        this.x = tarotSkinIdentify;
        this.e = f;
        this.b = j09Var;
        this.f = f2;
        this.y = dr1Var;
        this.z = yi4Var;
        this.c = z;
        this.d = n26Var;
        this.g = i;
        this.v = i2;
    }
}
