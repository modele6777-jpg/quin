package defpackage;

import ai.askquin.data.quickdecision.QuickDecisionAnswer;
import ai.askquin.data.quickdecision.QuickDecisionCard;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class v6b extends gbe implements l26 {
    final /* synthetic */ long $id;
    int label;
    final /* synthetic */ w6b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v6b(w6b w6bVar, long j, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = w6bVar;
        this.$id = j;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new v6b(this.this$0, this.$id, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        Object next;
        String tagline;
        String reading;
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            g6b g6bVar = this.this$0.b;
            long j = this.$id;
            this.label = 1;
            n6b n6bVar = (n6b) g6bVar;
            obj = urg.K(this, new ac(j, n6bVar), n6bVar.a, true, false);
            bw2 bw2Var = bw2.a;
            if (obj == bw2Var) {
                return bw2Var;
            }
        } else {
            if (i != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(obj);
        }
        x6b x6bVar = (x6b) obj;
        w6b w6bVar = this.this$0;
        if (x6bVar != null) {
            s0e s0eVar = w6bVar.d;
            QuickDecisionCard quickDecisionCardA = w6bVar.c.a(x6bVar.b);
            String str = x6bVar.b;
            boolean z = x6bVar.c;
            Iterator<E> it = QuickDecisionAnswer.getEntries().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!pa7.t(((QuickDecisionAnswer) next).name(), x6bVar.d));
            QuickDecisionAnswer quickDecisionAnswer = (QuickDecisionAnswer) next;
            if (quickDecisionAnswer == null) {
                quickDecisionAnswer = QuickDecisionAnswer.Maybe;
            }
            QuickDecisionAnswer quickDecisionAnswer2 = quickDecisionAnswer;
            if (quickDecisionCardA == null || (tagline = quickDecisionCardA.getTagline()) == null) {
                tagline = x6bVar.e;
            }
            String str2 = tagline;
            if (quickDecisionCardA == null || (reading = quickDecisionCardA.getReading()) == null) {
                reading = x6bVar.f;
            }
            s0eVar.n(null, new t6b(str, z, quickDecisionAnswer2, str2, reading));
        } else {
            w6bVar.d.n(null, r6b.a);
        }
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((v6b) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
