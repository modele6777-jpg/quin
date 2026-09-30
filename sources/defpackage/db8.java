package defpackage;

import ai.askquin.R;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class db8 {
    public static final pr4 a = new pr4(0, new ov7(13));

    public static wb9 a(l46 l46Var) {
        wb9 wb9Var;
        wb9 wb9Var2 = (wb9) l46Var.k(a);
        if (wb9Var2 != null) {
            l46Var.f0(950834231);
            l46Var.r(false);
            return wb9Var2;
        }
        l46Var.f0(950836184);
        View view = (View) l46Var.k(uq.f);
        view.getClass();
        while (true) {
            wb9Var = null;
            if (view == null) {
                break;
            }
            Object tag = view.getTag(R.id.view_tree_navigation_event_dispatcher_owner);
            wb9 wb9Var3 = tag instanceof wb9 ? (wb9) tag : null;
            if (wb9Var3 != null) {
                wb9Var = wb9Var3;
                break;
            }
            Object objG = jcc.g(view);
            view = objG instanceof View ? (View) objG : null;
        }
        l46Var.r(false);
        return wb9Var;
    }
}
