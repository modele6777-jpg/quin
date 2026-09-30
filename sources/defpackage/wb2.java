package defpackage;

import android.R;
import android.view.View;
import android.view.ViewGroup;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class wb2 {
    public static final ViewGroup.LayoutParams a = new ViewGroup.LayoutParams(-2, -2);

    public static void a(vb2 vb2Var, dd2 dd2Var) {
        View childAt = ((ViewGroup) vb2Var.getWindow().getDecorView().findViewById(R.id.content)).getChildAt(0);
        nf2 nf2Var = childAt instanceof nf2 ? (nf2) childAt : null;
        if (nf2Var != null) {
            nf2Var.setParentCompositionContext(null);
            nf2Var.setContent(dd2Var);
            return;
        }
        nf2 nf2Var2 = new nf2(vb2Var);
        nf2Var2.setParentCompositionContext(null);
        nf2Var2.setContent(dd2Var);
        View decorView = vb2Var.getWindow().getDecorView();
        if (scc.j(decorView) == null) {
            decorView.setTag(ai.askquin.R.id.view_tree_lifecycle_owner, vb2Var);
        }
        if (gdc.d(decorView) == null) {
            decorView.setTag(ai.askquin.R.id.view_tree_view_model_store_owner, vb2Var);
        }
        if (fdc.i(decorView) == null) {
            decorView.setTag(ai.askquin.R.id.view_tree_saved_state_registry_owner, vb2Var);
        }
        vb2Var.setContentView(nf2Var2, a);
    }
}
