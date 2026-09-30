package defpackage;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class jag extends gbe implements l26 {
    final /* synthetic */ ym9 $listener;
    final /* synthetic */ lbg $spec;
    final /* synthetic */ iag $this_listen;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jag(iag iagVar, lbg lbgVar, ym9 ym9Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.$this_listen = iagVar;
        this.$spec = lbgVar;
        this.$listener = ym9Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new jag(this.$this_listen, this.$spec, this.$listener, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            iag iagVar = this.$this_listen;
            lbg lbgVar = this.$spec;
            iagVar.getClass();
            lbgVar.getClass();
            ArrayList arrayList = iagVar.a;
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : arrayList) {
                if (((fl2) obj2).b(lbgVar)) {
                    arrayList2.add(obj2);
                }
            }
            ArrayList arrayList3 = new ArrayList(t72.u(arrayList2, 10));
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                arrayList3.add(((fl2) it.next()).a(lbgVar.j));
            }
            wj5 wj5VarI = dj6.I(new sc3(3, (wj5[]) s72.j1(arrayList3).toArray(new wj5[0])));
            qb1 qb1Var = new qb1(17, this.$listener, this.$spec);
            this.label = 1;
            Object objB = wj5VarI.b(qb1Var, this);
            bw2 bw2Var = bw2.a;
            if (objB == bw2Var) {
                return bw2Var;
            }
        } else {
            if (i != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(obj);
        }
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((jag) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
