package ai.askquin.ui.dailycard;

import ai.askquin.model.TarotSkinIdentify;
import defpackage.aw2;
import defpackage.gbe;
import defpackage.jzb;
import defpackage.l26;
import defpackage.qc0;
import defpackage.urg;
import defpackage.wef;
import defpackage.xfb;
import defpackage.xn2;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class n extends gbe implements l26 {
    final /* synthetic */ DailyCardReadingRoute $route;
    final /* synthetic */ String $segmentId;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(String str, DailyCardReadingRoute dailyCardReadingRoute, xn2 xn2Var) {
        super(2, xn2Var);
        this.$segmentId = str;
        this.$route = dailyCardReadingRoute;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new n(this.$segmentId, this.$route, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        String str = this.$segmentId;
        String skinName = this.$route.getSkinName();
        str.getClass();
        skinName.getClass();
        TarotSkinIdentify tarotSkinIdentifyA = o.a(skinName);
        if (tarotSkinIdentifyA != null) {
            ConcurrentHashMap concurrentHashMap = xfb.a;
            xfb.i(str, "reading");
            xfb.b(str, urg.r(tarotSkinIdentifyA));
        }
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        n nVar = (n) k((xn2) obj2, (aw2) obj);
        wef wefVar = wef.a;
        nVar.r(wefVar);
        return wefVar;
    }
}
