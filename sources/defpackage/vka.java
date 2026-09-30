package defpackage;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import tech.chatmind.api.events.model.EventInfo2;
import tech.chatmind.api.events.model.Popup;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class vka extends gbe implements n26 {
    /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    int label;

    @Override // defpackage.n26
    public final Object m(Object obj, Object obj2, Object obj3) {
        vka vkaVar = new vka(3, (xn2) obj3);
        vkaVar.L$0 = (List) obj;
        vkaVar.L$1 = (List) obj2;
        return vkaVar.r(wef.a);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        List list = (List) this.L$0;
        List list2 = (List) this.L$1;
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        ArrayList<EventInfo2> arrayList = new ArrayList();
        for (Object obj2 : list) {
            if (!list2.contains(((EventInfo2) obj2).getId())) {
                arrayList.add(obj2);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (EventInfo2 eventInfo2 : arrayList) {
            Popup popup = eventInfo2.getPopup();
            uma umaVar = popup != null ? new uma(eventInfo2.getId(), eventInfo2.getType(), popup) : null;
            if (umaVar != null) {
                arrayList2.add(umaVar);
            }
        }
        List listM1 = s72.m1(arrayList2);
        Collections.shuffle(listM1);
        return s72.c1(listM1, 1);
    }
}
