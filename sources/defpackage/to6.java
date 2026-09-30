package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import tech.chatmind.api.events.model.ExploreBanner;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class to6 extends gbe implements n26 {
    /* synthetic */ int I$0;
    /* synthetic */ Object L$0;
    int label;

    @Override // defpackage.n26
    public final Object m(Object obj, Object obj2, Object obj3) {
        int iIntValue = ((Number) obj2).intValue();
        to6 to6Var = new to6(3, (xn2) obj3);
        to6Var.L$0 = (List) obj;
        to6Var.I$0 = iIntValue;
        return to6Var.r(wef.a);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        List list = (List) this.L$0;
        int i = this.I$0;
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        ArrayList arrayList = new ArrayList(t72.u(list, 10));
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            ExploreBanner exploreBanner = (ExploreBanner) it.next();
            ca2 ca2Var = ca2.a;
            String title = exploreBanner.getTitle();
            ca2Var.getClass();
            title.getClass();
            if (ca2Var.a() || pa7.t(ca2.d, "strict")) {
                for (int i2 = 0; i2 < title.length(); i2++) {
                    char cCharAt = title.charAt(i2);
                    if (19968 <= cCharAt && cCharAt < 40960) {
                        title = c5e.A(c5e.A(c5e.A(title, "塔罗师", "解读师"), "塔罗", "卡牌"), "占卜", "解读");
                        break;
                    }
                }
            }
            arrayList.add(new wm6(title, exploreBanner.getIconUrl(), exploreBanner.getLink(), exploreBanner.getOpenInBrowser()));
        }
        if (i != 0) {
            return (i == 1 && arrayList.isEmpty()) ? t72.H(new wm6("QA · Homepage activity banner", "", "", false)) : arrayList;
        }
        return pu4.a;
    }
}
