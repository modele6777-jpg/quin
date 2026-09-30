package defpackage;

import android.content.Context;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class n24 extends gbe implements l26 {
    final /* synthetic */ Context $context;
    final /* synthetic */ List<x04> $list;
    int I$0;
    int I$1;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n24(List list, Context context, xn2 xn2Var) {
        super(2, xn2Var);
        this.$list = list;
        this.$context = context;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new n24(this.$list, this.$context, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        Iterator it;
        int i;
        Context context;
        int i2 = this.label;
        if (i2 == 0) {
            jzb.q(obj);
            List<x04> list = this.$list;
            Context context2 = this.$context;
            it = list.iterator();
            i = 0;
            context = context2;
        } else {
            if (i2 != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i3 = this.I$0;
            it = (Iterator) this.L$2;
            context = (Context) this.L$1;
            jzb.q(obj);
            i = i3;
        }
        while (it.hasNext()) {
            Object next = it.next();
            int i4 = i + 1;
            if (i < 0) {
                t72.Z();
                throw null;
            }
            ym8.N(context, (x04) next);
            this.L$0 = null;
            this.L$1 = context;
            this.L$2 = it;
            this.L$3 = null;
            this.L$4 = null;
            this.I$0 = i4;
            this.I$1 = i;
            this.label = 1;
            Object objQ = vfh.q(1500L, this);
            bw2 bw2Var = bw2.a;
            if (objQ == bw2Var) {
                return bw2Var;
            }
            i = i4;
        }
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((n24) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
