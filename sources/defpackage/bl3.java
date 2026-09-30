package defpackage;

import ai.askquin.model.TarotSkinIdentify;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class bl3 implements xj5 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ol3 b;

    public /* synthetic */ bl3(ol3 ol3Var, int i) {
        this.a = i;
        this.b = ol3Var;
    }

    @Override // defpackage.xj5
    public final Object a(Object obj, xn2 xn2Var) {
        int i = this.a;
        wef wefVar = wef.a;
        ol3 ol3Var = this.b;
        switch (i) {
            case 0:
                Map map = (Map) obj;
                TarotSkinIdentify tarotSkinIdentify = ol3Var.F0;
                if (tarotSkinIdentify != null) {
                    hmd hmdVar = (hmd) map.get(tarotSkinIdentify);
                    if ((hmdVar != null ? hmdVar.a : null) == gmd.e) {
                        ol3Var.F0 = null;
                        ol3Var.g(tarotSkinIdentify);
                    }
                }
                break;
            case 1:
                sw8 sw8Var = (sw8) obj;
                if (ol3Var.G0 && sw8Var.a != gmd.c) {
                    ol3Var.G0 = false;
                    ol3Var.f();
                }
                break;
            default:
                lyd lydVar = ol3Var.Z;
                if (lydVar != null) {
                    lydVar.h(null);
                }
                ol3Var.Z = ynb.V(hwf.a(ol3Var), null, null, new kl3(ol3Var, false, null), 3);
                break;
        }
        return wefVar;
    }
}
