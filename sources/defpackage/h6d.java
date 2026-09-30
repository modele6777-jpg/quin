package defpackage;

import ai.askquin.model.TarotSkinIdentify;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class h6d implements l26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ List b;
    public final /* synthetic */ TarotSkinIdentify c;
    public final /* synthetic */ boolean d;
    public final /* synthetic */ int e;

    public /* synthetic */ h6d(List list, TarotSkinIdentify tarotSkinIdentify, boolean z, int i, int i2) {
        this.a = i2;
        this.b = list;
        this.c = tarotSkinIdentify;
        this.d = z;
        this.e = i;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        int i = this.a;
        wef wefVar = wef.a;
        int i2 = this.e;
        boolean z = this.d;
        TarotSkinIdentify tarotSkinIdentify = this.c;
        List list = this.b;
        l46 l46Var = (l46) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                p6d.p(list, tarotSkinIdentify, z, l46Var, k99.P(i2 | 1));
                break;
            case 1:
                p6d.n(list, tarotSkinIdentify, z, l46Var, k99.P(i2 | 1));
                break;
            default:
                p6d.m(list, tarotSkinIdentify, z, l46Var, k99.P(i2 | 1));
                break;
        }
        return wefVar;
    }
}
