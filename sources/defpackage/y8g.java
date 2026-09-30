package defpackage;

import ai.askquin.R;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class y8g extends gbe implements l26 {
    final /* synthetic */ xjb $newRecomposer;
    final /* synthetic */ View $rootView;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y8g(xjb xjbVar, View view, xn2 xn2Var) {
        super(2, xn2Var);
        this.$newRecomposer = xjbVar;
        this.$rootView = view;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new y8g(this.$newRecomposer, this.$rootView, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        int i = this.label;
        wef wefVar = wef.a;
        try {
            if (i == 0) {
                jzb.q(obj);
                xjb xjbVar = this.$newRecomposer;
                this.label = 1;
                Object objC = tm7.C(xjbVar.u, new tjb(2, null), this);
                bw2 bw2Var = bw2.a;
                if (objC != bw2Var) {
                    objC = wefVar;
                }
                if (objC == bw2Var) {
                    return bw2Var;
                }
            } else {
                if (i != 1) {
                    qc0.p("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                jzb.q(obj);
            }
            if (g9g.a(this.$rootView) == this.$newRecomposer) {
                this.$rootView.setTag(R.id.androidx_compose_ui_view_composition_context, null);
            }
            return wefVar;
        } catch (Throwable th) {
            if (g9g.a(this.$rootView) == this.$newRecomposer) {
                this.$rootView.setTag(R.id.androidx_compose_ui_view_composition_context, null);
            }
            throw th;
        }
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((y8g) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
