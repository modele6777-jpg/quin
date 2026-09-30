package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class lhd extends gbe implements l26 {
    final /* synthetic */ imb $enqueued;
    final /* synthetic */ s7a $snapshot;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ohd this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lhd(s7a s7aVar, ohd ohdVar, imb imbVar, xn2 xn2Var) {
        super(2, xn2Var);
        this.$snapshot = s7aVar;
        this.this$0 = ohdVar;
        this.$enqueued = imbVar;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        lhd lhdVar = new lhd(this.$snapshot, this.this$0, this.$enqueued, xn2Var);
        lhdVar.L$0 = obj;
        return lhdVar;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        p79 p79Var = (p79) this.L$0;
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        Set set = (Set) p79Var.c(xqa.H.a);
        if (set == null) {
            set = xu4.a;
        }
        boolean zContains = set.contains(this.$snapshot.a);
        wef wefVar = wef.a;
        if (!zContains) {
            this.this$0.getClass();
            List listA = ohd.a(p79Var);
            s7a s7aVar = this.$snapshot;
            if (!listA.isEmpty()) {
                Iterator it = listA.iterator();
                while (it.hasNext()) {
                    if (pa7.t(((s7a) it.next()).a, s7aVar.a)) {
                    }
                }
            }
            p79Var.f(xqa.H.a, n3d.n(set, this.$snapshot.a));
            ohd ohdVar = this.this$0;
            ArrayList arrayListR0 = s72.R0(listA, this.$snapshot);
            ohdVar.getClass();
            ohd.f(p79Var, arrayListR0);
            this.$enqueued.element = true;
            return wefVar;
        }
        return wefVar;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        lhd lhdVar = (lhd) k((xn2) obj2, (p79) obj);
        wef wefVar = wef.a;
        lhdVar.r(wefVar);
        return wefVar;
    }
}
