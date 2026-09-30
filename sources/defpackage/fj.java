package defpackage;

import ai.askquin.model.TarotSkinIdentify;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class fj implements l26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ TarotSkinIdentify b;

    public /* synthetic */ fj(int i, TarotSkinIdentify tarotSkinIdentify) {
        this.a = i;
        this.b = tarotSkinIdentify;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        int i = this.a;
        wef wefVar = wef.a;
        TarotSkinIdentify tarotSkinIdentify = this.b;
        switch (i) {
            case 0:
                l46 l46Var = (l46) obj;
                int iIntValue = ((Integer) obj2).intValue();
                if (!l46Var.W(iIntValue & 1, (iIntValue & 3) != 2)) {
                    l46Var.Z();
                } else {
                    nte.b(afc.q(hfc.q(tarotSkinIdentify).m(), l46Var), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, l46Var, 0, 0, 262142);
                }
                break;
            default:
                String str = (String) obj;
                String str2 = (String) obj2;
                str.getClass();
                str2.getClass();
                x1f x1fVar = x1f.a;
                x1f.k(p05.a, new w6(str, tarotSkinIdentify, str2, 25), 2);
                break;
        }
        return wefVar;
    }
}
