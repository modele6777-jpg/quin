package defpackage;

import ai.askquin.model.TarotSkinIdentify;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class oi3 implements x16 {
    public final /* synthetic */ int a;
    public final /* synthetic */ a26 b;
    public final /* synthetic */ TarotSkinIdentify c;
    public final /* synthetic */ a26 d;

    public /* synthetic */ oi3(a26 a26Var, TarotSkinIdentify tarotSkinIdentify, a26 a26Var2, int i) {
        this.a = i;
        this.b = a26Var;
        this.c = tarotSkinIdentify;
        this.d = a26Var2;
    }

    @Override // defpackage.x16
    public final Object invoke() {
        int i = this.a;
        wef wefVar = wef.a;
        p05 p05Var = p05.a;
        a26 a26Var = this.d;
        TarotSkinIdentify tarotSkinIdentify = this.c;
        a26 a26Var2 = this.b;
        switch (i) {
            case 0:
                x1f x1fVar = x1f.a;
                x1f.k(p05Var, new ri3(1, tarotSkinIdentify), 2);
                a26Var2.d(tarotSkinIdentify);
                a26Var.d(tarotSkinIdentify);
                break;
            default:
                x1f x1fVar2 = x1f.a;
                x1f.k(p05Var, new ri3(5, tarotSkinIdentify), 2);
                a26Var2.d(tarotSkinIdentify);
                a26Var.d(tarotSkinIdentify);
                break;
        }
        return wefVar;
    }
}
