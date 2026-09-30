package defpackage;

import ai.askquin.R;
import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class eb8 {
    public static final pr4 a = new pr4(0, new ov7(14));

    public static vm9 a(l46 l46Var) {
        vm9 vm9Var = (vm9) l46Var.k(a);
        Object obj = null;
        if (vm9Var == null) {
            l46Var.f0(1208426157);
            View view = (View) l46Var.k(uq.f);
            view.getClass();
            while (true) {
                if (view == null) {
                    vm9Var = null;
                    break;
                }
                Object tag = view.getTag(R.id.view_tree_on_back_pressed_dispatcher_owner);
                vm9 vm9Var2 = tag instanceof vm9 ? (vm9) tag : null;
                if (vm9Var2 != null) {
                    vm9Var = vm9Var2;
                    break;
                }
                Object objG = jcc.g(view);
                view = objG instanceof View ? (View) objG : null;
            }
        } else {
            l46Var.f0(1208423708);
        }
        l46Var.r(false);
        if (vm9Var != null) {
            l46Var.f0(1208423789);
            l46Var.r(false);
            return vm9Var;
        }
        l46Var.f0(1208428160);
        for (Context baseContext = (Context) l46Var.k(uq.b); baseContext instanceof ContextWrapper; baseContext = ((ContextWrapper) baseContext).getBaseContext()) {
            if (baseContext instanceof vm9) {
                obj = baseContext;
                break;
            }
        }
        vm9 vm9Var3 = (vm9) obj;
        l46Var.r(false);
        return vm9Var3;
    }
}
