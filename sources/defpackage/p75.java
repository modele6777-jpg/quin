package defpackage;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import tech.chatmind.api.dailycard.model.DailyCard;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class p75 extends gbe implements n26 {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    @Override // defpackage.n26
    public final Object m(Object obj, Object obj2, Object obj3) {
        p75 p75Var = new p75(3, (xn2) obj3);
        p75Var.L$0 = (List) obj;
        p75Var.L$1 = (Map) obj2;
        return p75Var.r(wef.a);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        List<DailyCard> list = (List) this.L$0;
        Map map = (Map) this.L$1;
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        ArrayList arrayList = new ArrayList(t72.u(list, 10));
        for (DailyCard dailyCard : list) {
            arrayList.add(new nn4(dailyCard.getKey(), (String) map.get(dailyCard.getDate())));
        }
        return arrayList;
    }
}
