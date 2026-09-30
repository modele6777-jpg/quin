package defpackage;

import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class xvf extends czb implements l26 {
    final /* synthetic */ View $this_allViews;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xvf(View view, xn2 xn2Var) {
        super(2, xn2Var);
        this.$this_allViews = view;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        xvf xvfVar = new xvf(this.$this_allViews, xn2Var);
        xvfVar.L$0 = obj;
        return xvfVar;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        Object obj2;
        int i = this.label;
        bw2 bw2Var = bw2.a;
        if (i == 0) {
            jzb.q(obj);
            dyc dycVar = (dyc) this.L$0;
            View view = this.$this_allViews;
            this.L$0 = dycVar;
            this.label = 1;
            dycVar.c(this, view);
            return bw2Var;
        }
        wef wefVar = wef.a;
        if (i != 1) {
            if (i == 2) {
                jzb.q(obj);
                return wefVar;
            }
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        dyc dycVar2 = (dyc) this.L$0;
        jzb.q(obj);
        View view2 = this.$this_allViews;
        if (view2 instanceof ViewGroup) {
            this.L$0 = null;
            this.label = 2;
            dycVar2.getClass();
            b3f b3fVar = new b3f(new l2(8, (ViewGroup) view2));
            if (b3fVar.b.hasNext()) {
                dycVar2.c = b3fVar;
                dycVar2.a = 2;
                dycVar2.d = this;
                obj2 = bw2Var;
            } else {
                obj2 = wefVar;
            }
            if (obj2 == bw2Var) {
                return bw2Var;
            }
        }
        return wefVar;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((xvf) k((xn2) obj2, (dyc) obj)).r(wef.a);
    }
}
