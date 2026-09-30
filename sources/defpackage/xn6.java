package defpackage;

import ai.askquin.model.TarotSkinIdentify;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class xn6 implements l26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ii6 b;
    public final /* synthetic */ TarotSkinIdentify c;
    public final /* synthetic */ mic d;
    public final /* synthetic */ x16 e;
    public final /* synthetic */ x16 f;
    public final /* synthetic */ x16 g;
    public final /* synthetic */ x16 v;
    public final /* synthetic */ int w;

    public /* synthetic */ xn6(ii6 ii6Var, TarotSkinIdentify tarotSkinIdentify, mic micVar, x16 x16Var, x16 x16Var2, x16 x16Var3, x16 x16Var4, int i, int i2) {
        this.a = i2;
        this.b = ii6Var;
        this.c = tarotSkinIdentify;
        this.d = micVar;
        this.e = x16Var;
        this.f = x16Var2;
        this.g = x16Var3;
        this.v = x16Var4;
        this.w = i;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        int i = this.a;
        wef wefVar = wef.a;
        int i2 = this.w;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int iP = k99.P(i2 | 1);
                no6.n(this.b, this.c, this.d, this.e, this.f, this.g, this.v, (l46) obj, iP);
                break;
            default:
                ((Integer) obj2).getClass();
                int iP2 = k99.P(i2 | 1);
                no6.m(this.b, this.c, this.d, this.e, this.f, this.g, this.v, (l46) obj, iP2);
                break;
        }
        return wefVar;
    }
}
