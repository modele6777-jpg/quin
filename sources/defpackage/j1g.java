package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class j1g extends gbe implements l26 {
    final /* synthetic */ List<String> $imageUrls;
    final /* synthetic */ a26 $onComplete;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ l1g this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j1g(l1g l1gVar, List list, a26 a26Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = l1gVar;
        this.$imageUrls = list;
        this.$onComplete = a26Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        j1g j1gVar = new j1g(this.this$0, this.$imageUrls, this.$onComplete, xn2Var);
        j1gVar.L$0 = obj;
        return j1gVar;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        aw2 aw2Var = (aw2) this.L$0;
        int i = this.label;
        boolean z = true;
        if (i == 0) {
            jzb.q(obj);
            l1g l1gVar = this.this$0;
            l1gVar.c.setValue(g1g.a);
            List<String> list = this.$imageUrls;
            l1g l1gVar2 = this.this$0;
            ArrayList arrayList = new ArrayList(t72.u(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(ynb.y(aw2Var, null, new i1g(l1gVar2, (String) it.next(), null), 3));
            }
            this.L$0 = null;
            this.L$1 = null;
            this.label = 1;
            obj = pa7.u(arrayList, this);
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
        List list2 = (List) obj;
        if (list2 == null || !list2.isEmpty()) {
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                if (!(((ov6) it2.next()) instanceof nv6)) {
                    z = false;
                    break;
                }
            }
        }
        l1g l1gVar3 = this.this$0;
        l1gVar3.c.setValue(h1g.a);
        this.$onComplete.d(Boolean.valueOf(z));
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((j1g) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
