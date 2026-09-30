package defpackage;

import ai.askquin.R;
import android.os.Handler;
import android.os.Looper;
import android.view.View;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class g9g {
    public static final w79 a;

    static {
        long[] jArr = jec.a;
        a = new w79();
    }

    public static final lg2 a(View view) {
        Object tag = view.getTag(R.id.androidx_compose_ui_view_composition_context);
        if (tag instanceof lg2) {
            return (lg2) tag;
        }
        return null;
    }

    public static final xjb b(View view) {
        pv2 pv2Var;
        l2a l2aVar;
        if (!view.isAttachedToWindow()) {
            i37.c("Cannot locate windowRecomposer; View " + view + " is not attached to a window");
        }
        Object objG = jcc.g(view);
        while (objG instanceof View) {
            View view2 = (View) objG;
            if (view2.getId() == 16908290) {
                break;
            }
            objG = view2.getParent();
            view = view2;
        }
        lg2 lg2VarA = a(view);
        if (lg2VarA != null) {
            if (lg2VarA instanceof xjb) {
                return (xjb) lg2VarA;
            }
            qc0.p("root viewTreeParentCompositionContext is not a Recomposer");
            return null;
        }
        ((x8g) z8g.a.get()).getClass();
        pv2 pv2Var2 = nu4.a;
        ace aceVar = mw.X;
        if (Looper.myLooper() == Looper.getMainLooper()) {
            pv2Var = (pv2) mw.X.getValue();
        } else {
            pv2Var = (pv2) mw.Y.get();
            if (pv2Var == null) {
                qc0.p("no AndroidUiDispatcher for this thread");
                return null;
            }
        }
        pv2 pv2VarP0 = pv2Var.p0(pv2Var2);
        z09 z09Var = (z09) pv2VarP0.F0(hj6.O0);
        if (z09Var != null) {
            l2aVar = new l2a(z09Var);
            zi0 zi0Var = l2aVar.b;
            synchronized (zi0Var.b) {
                zi0Var.a = false;
            }
        } else {
            l2aVar = null;
        }
        mmb mmbVar = new mmb();
        pv2 l39Var = (j39) pv2VarP0.F0(qk6.K0);
        if (l39Var == null) {
            l39Var = new l39(view.getContext().getApplicationContext());
            mmbVar.element = l39Var;
        }
        if (l2aVar != null) {
            pv2Var2 = l2aVar;
        }
        pv2 pv2VarP1 = pv2VarP0.p0(pv2Var2).p0(l39Var);
        xjb xjbVar = new xjb(pv2VarP1);
        synchronized (xjbVar.c) {
            xjbVar.t = true;
        }
        qn2 qn2VarK = jgb.k(pv2VarP1);
        x48 x48VarJ = scc.j(view);
        h48 h48VarK = x48VarJ != null ? x48VarJ.k() : null;
        if (h48VarK == null) {
            i37.d("ViewTreeLifecycleOwner not found from " + view);
            oo3.f();
            return null;
        }
        view.addOnAttachStateChangeListener(new a9g(view, xjbVar));
        h48VarK.a(new d9g(qn2VarK, l2aVar, xjbVar, mmbVar));
        view.setTag(R.id.androidx_compose_ui_view_composition_context, xjbVar);
        ob6 ob6Var = ob6.a;
        Handler handler = view.getHandler();
        int i = xg6.a;
        view.addOnAttachStateChangeListener(new hs(4, ynb.V(ob6Var, new wg6(handler, "windowRecomposer cleanup", false).f, null, new y8g(xjbVar, view, null), 2)));
        return xjbVar;
    }
}
