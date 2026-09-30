package defpackage;

import ai.askquin.model.TarotSkinIdentify;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ej3 implements l26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ TarotSkinIdentify b;
    public final /* synthetic */ j09 c;

    public /* synthetic */ ej3(TarotSkinIdentify tarotSkinIdentify, j09 j09Var, int i, int i2) {
        this.a = i2;
        this.b = tarotSkinIdentify;
        this.c = j09Var;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        int i = this.a;
        wef wefVar = wef.a;
        j09 j09Var = this.c;
        TarotSkinIdentify tarotSkinIdentify = this.b;
        l46 l46Var = (l46) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                xj3.k(tarotSkinIdentify, j09Var, l46Var, k99.P(1));
                break;
            case 1:
                x57.t(tarotSkinIdentify, j09Var, l46Var, k99.P(1));
                break;
            default:
                h4g.i(tarotSkinIdentify, j09Var, l46Var, k99.P(49));
                break;
        }
        return wefVar;
    }
}
