package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import tech.chatmind.api.PatternData;
import tech.chatmind.api.events.model.EventInfo;
import tech.chatmind.api.events.model.EventType;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class f25 implements xj5 {
    public final /* synthetic */ xj5 a;

    public f25(xj5 xj5Var) {
        this.a = xj5Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.xj5
    public final Object a(Object obj, xn2 xn2Var) {
        e25 e25Var;
        Object next;
        List<PatternData> patternData;
        String recommendQuestion;
        if (xn2Var instanceof e25) {
            e25Var = (e25) xn2Var;
            int i = e25Var.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                e25Var.label = i - Integer.MIN_VALUE;
            } else {
                e25Var = new e25(this, xn2Var);
            }
        } else {
            e25Var = new e25(this, xn2Var);
        }
        Object obj2 = e25Var.result;
        int i2 = e25Var.label;
        if (i2 == 0) {
            jzb.q(obj2);
            ArrayList arrayList = new ArrayList();
            for (Object obj3 : (List) obj) {
                if (((EventInfo) obj3).getType() == EventType.MONTH) {
                    arrayList.add(obj3);
                }
            }
            Iterator it = arrayList.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                EventInfo eventInfo = (EventInfo) next;
                if (eventInfo.getPopup() != null && (patternData = eventInfo.getPatternData()) != null && !patternData.isEmpty() && (recommendQuestion = eventInfo.getRecommendQuestion()) != null && !v4e.Q(recommendQuestion)) {
                    break;
                }
            }
            e25Var.L$0 = null;
            e25Var.L$1 = null;
            e25Var.L$2 = null;
            e25Var.L$3 = null;
            e25Var.label = 1;
            Object objA = this.a.a(next, e25Var);
            bw2 bw2Var = bw2.a;
            if (objA == bw2Var) {
                return bw2Var;
            }
        } else {
            if (i2 != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(obj2);
        }
        return wef.a;
    }
}
