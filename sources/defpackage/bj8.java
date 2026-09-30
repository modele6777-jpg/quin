package defpackage;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class bj8 extends gbe implements l26 {
    final /* synthetic */ List<oif> $useCases;
    int label;
    final /* synthetic */ dj8 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bj8(dj8 dj8Var, List list, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = dj8Var;
        this.$useCases = list;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new bj8(this.this$0, this.$useCases, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        dj8 dj8Var = this.this$0;
        List<oif> list = this.$useCases;
        dj8Var.getClass();
        yzc yzcVar = new yzc();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            yzcVar.a(((oif) it.next()).p);
        }
        return Boolean.valueOf(((Number) yzcVar.b().g.a().getUpper()).intValue() > 30);
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((bj8) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
