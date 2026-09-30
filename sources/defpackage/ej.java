package defpackage;

import ai.askquin.model.TarotSkinIdentify;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ej implements l26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ TarotSkinIdentify b;
    public final /* synthetic */ x16 c;

    public /* synthetic */ ej(x16 x16Var, TarotSkinIdentify tarotSkinIdentify) {
        this.a = 0;
        this.c = x16Var;
        this.b = tarotSkinIdentify;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        int i = this.a;
        x16 x16Var = this.c;
        wef wefVar = wef.a;
        TarotSkinIdentify tarotSkinIdentify = this.b;
        switch (i) {
            case 0:
                l46 l46Var = (l46) obj;
                int iIntValue = ((Integer) obj2).intValue();
                int i2 = 0;
                if (!l46Var.W(iIntValue & 1, (iIntValue & 3) != 2)) {
                    l46Var.Z();
                } else {
                    pa7.a(null, 0L, 0L, null, af1.b0(1809679341, new fj(i2, tarotSkinIdentify), l46Var), null, false, false, this.c, l46Var, 24576, 239);
                }
                break;
            case 1:
                ((Integer) obj2).getClass();
                oa7.a(tarotSkinIdentify, x16Var, (l46) obj, k99.P(1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                b4d.a(tarotSkinIdentify, x16Var, (l46) obj, k99.P(1));
                break;
            default:
                ((Integer) obj2).getClass();
                b4d.d(tarotSkinIdentify, x16Var, (l46) obj, k99.P(1));
                break;
        }
        return wefVar;
    }

    public /* synthetic */ ej(TarotSkinIdentify tarotSkinIdentify, x16 x16Var, int i, int i2) {
        this.a = i2;
        this.b = tarotSkinIdentify;
        this.c = x16Var;
    }
}
