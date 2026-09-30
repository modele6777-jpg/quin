package defpackage;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import tech.chatmind.api.PatternData;
import tech.chatmind.api.events.model.EventInfo;
import tech.chatmind.api.events.model.EventType;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class x15 implements xj5 {
    public final /* synthetic */ xj5 a;

    public x15(xj5 xj5Var) {
        this.a = xj5Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // defpackage.xj5
    public final Object a(Object obj, xn2 xn2Var) {
        w15 w15Var;
        String recommendQuestion;
        if (xn2Var instanceof w15) {
            w15Var = (w15) xn2Var;
            int i = w15Var.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                w15Var.label = i - Integer.MIN_VALUE;
            } else {
                w15Var = new w15(this, xn2Var);
            }
        } else {
            w15Var = new w15(this, xn2Var);
        }
        Object obj2 = w15Var.result;
        int i2 = w15Var.label;
        if (i2 == 0) {
            jzb.q(obj2);
            ArrayList arrayList = new ArrayList();
            for (Object obj3 : (List) obj) {
                if (((EventInfo) obj3).getType() == EventType.MONTH) {
                    arrayList.add(obj3);
                }
            }
            ArrayList<EventInfo> arrayList2 = new ArrayList();
            for (Object obj4 : arrayList) {
                EventInfo eventInfo = (EventInfo) obj4;
                List<PatternData> patternData = eventInfo.getPatternData();
                if (patternData != null && !patternData.isEmpty() && (recommendQuestion = eventInfo.getRecommendQuestion()) != null && !v4e.Q(recommendQuestion)) {
                    arrayList2.add(obj4);
                }
            }
            ArrayList arrayList3 = new ArrayList(t72.u(arrayList2, 10));
            for (EventInfo eventInfo2 : arrayList2) {
                eventInfo2.getClass();
                String id = eventInfo2.getId();
                EventType type = eventInfo2.getType();
                OffsetDateTime startAt = eventInfo2.getStartAt();
                OffsetDateTime endAt = eventInfo2.getEndAt();
                String pattern = eventInfo2.getPattern();
                pattern.getClass();
                List<PatternData> patternData2 = eventInfo2.getPatternData();
                patternData2.getClass();
                String recommendQuestion2 = eventInfo2.getRecommendQuestion();
                recommendQuestion2.getClass();
                arrayList3.add(new sle(id, type, startAt, endAt, pattern, patternData2, recommendQuestion2));
            }
            List listB1 = s72.b1(arrayList3, new ww2(21));
            w15Var.L$0 = null;
            w15Var.L$1 = null;
            w15Var.L$2 = null;
            w15Var.L$3 = null;
            w15Var.label = 1;
            Object objA = this.a.a(listB1, w15Var);
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
