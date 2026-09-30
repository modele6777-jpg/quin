package defpackage;

import java.util.List;
import java.util.ListIterator;
import tech.chatmind.api.personality.model.PersonalityAnalysisQuestion;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class v5b extends gbe implements l26 {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ a6b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v5b(a6b a6bVar, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = a6bVar;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        v5b v5bVar = new v5b(this.this$0, xn2Var);
        v5bVar.L$0 = obj;
        return v5bVar;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int iNextIndex;
        Object value;
        Object value2;
        List list = (List) this.L$0;
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        ListIterator listIterator = list.listIterator(list.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                iNextIndex = -1;
                break;
            }
            if (((PersonalityAnalysisQuestion) listIterator.previous()).getUserDecision() != null) {
                iNextIndex = listIterator.nextIndex();
                break;
            }
        }
        s0e s0eVar = this.this$0.d;
        do {
            value = s0eVar.getValue();
            ((Number) value).intValue();
        } while (!s0eVar.l(value, new Integer(iNextIndex == -1 ? 0 : iNextIndex)));
        s0e s0eVar2 = this.this$0.e;
        do {
            value2 = s0eVar2.getValue();
        } while (!s0eVar2.l(value2, list));
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        v5b v5bVar = (v5b) k((xn2) obj2, (List) obj);
        wef wefVar = wef.a;
        v5bVar.r(wefVar);
        return wefVar;
    }
}
