package defpackage;

import java.util.ArrayList;
import java.util.List;
import tech.chatmind.api.events.model.EventInfo;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class h15 extends gbe implements n26 {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;
    final /* synthetic */ m25 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h15(m25 m25Var, xn2 xn2Var) {
        super(3, xn2Var);
        this.this$0 = m25Var;
    }

    @Override // defpackage.n26
    public final Object m(Object obj, Object obj2, Object obj3) {
        h15 h15Var = new h15(this.this$0, (xn2) obj3);
        h15Var.L$0 = (List) obj;
        h15Var.L$1 = (String) obj2;
        return h15Var.r(wef.a);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        List list = (List) this.L$0;
        String str = (String) this.L$1;
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        this.this$0.d().e("filter monthly event, consumedEventId: " + str);
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (!pa7.t(((EventInfo) obj2).getId(), str)) {
                arrayList.add(obj2);
            }
        }
        return arrayList;
    }
}
