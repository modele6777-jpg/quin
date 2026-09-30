package defpackage;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import tech.chatmind.api.TarotCardChoice;
import tech.chatmind.api.TarotCardType;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class yo4 extends gbe implements l26 {
    final /* synthetic */ List<TarotCardChoice> $currentExcludedCards;
    final /* synthetic */ r12 $viewModel;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yo4(r12 r12Var, List list, xn2 xn2Var) {
        super(2, xn2Var);
        this.$viewModel = r12Var;
        this.$currentExcludedCards = list;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new yo4(this.$viewModel, this.$currentExcludedCards, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        r12 r12Var = this.$viewModel;
        List<TarotCardChoice> list = this.$currentExcludedCards;
        r12Var.getClass();
        vz9 vz9Var = r12Var.v;
        list.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(((TarotCardChoice) it.next()).getCard());
        }
        if (linkedHashSet.size() >= ((d1) TarotCardType.getEntries()).c()) {
            qc0.j("No clarifying card is available");
            return null;
        }
        if (!linkedHashSet.equals(r12Var.e)) {
            r12Var.e = linkedHashSet;
            r12Var.g.setValue(r12Var.f());
            u12 u12Var = (u12) vz9Var.getValue();
            if (s72.o0(linkedHashSet, u12Var != null ? u12Var.a.getCard() : null)) {
                vz9Var.setValue(null);
            }
        }
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        yo4 yo4Var = (yo4) k((xn2) obj2, (aw2) obj);
        wef wefVar = wef.a;
        yo4Var.r(wefVar);
        return wefVar;
    }
}
