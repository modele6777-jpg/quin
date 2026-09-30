package defpackage;

import ai.askquin.model.TarotSkinIdentify;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ni3 implements x16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ a26 b;
    public final /* synthetic */ TarotSkinIdentify c;

    public /* synthetic */ ni3(a26 a26Var, TarotSkinIdentify tarotSkinIdentify, int i) {
        this.a = i;
        this.b = a26Var;
        this.c = tarotSkinIdentify;
    }

    @Override // defpackage.x16
    public final Object invoke() {
        int i = this.a;
        p05 p05Var = p05.a;
        wef wefVar = wef.a;
        TarotSkinIdentify tarotSkinIdentify = this.c;
        a26 a26Var = this.b;
        switch (i) {
            case 0:
                a26Var.d(tarotSkinIdentify);
                break;
            case 1:
                x1f x1fVar = x1f.a;
                x1f.k(p05Var, new ri3(2, tarotSkinIdentify), 2);
                a26Var.d(tarotSkinIdentify);
                break;
            case 2:
                a26Var.d(tarotSkinIdentify);
                break;
            case 3:
                x1f x1fVar2 = x1f.a;
                x1f.k(p05Var, new ri3(4, tarotSkinIdentify), 2);
                a26Var.d(tarotSkinIdentify);
                break;
            case 4:
                a26Var.d(tarotSkinIdentify);
                break;
            default:
                a26Var.d(tarotSkinIdentify);
                break;
        }
        return wefVar;
    }
}
