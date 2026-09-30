package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class hkf extends gbe implements l26 {
    final /* synthetic */ List<lu3> $deferrableSurfaces;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hkf(List list, xn2 xn2Var) {
        super(2, xn2Var);
        this.$deferrableSurfaces = list;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new hkf(this.$deferrableSurfaces, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) throws Throwable {
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                jzb.q(obj);
                return obj;
            }
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        List<lu3> list = this.$deferrableSurfaces;
        ArrayList arrayList = new ArrayList(t72.u(list, 10));
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(bm8.J(((lu3) it.next()).c()));
        }
        o78 o78Var = new o78(new ArrayList(arrayList), false, g94.a());
        this.label = 1;
        Object objN = vfh.n(o78Var, this);
        bw2 bw2Var = bw2.a;
        return objN == bw2Var ? bw2Var : objN;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((hkf) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
