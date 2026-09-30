package defpackage;

import ai.askquin.R;
import android.content.Context;
import android.view.View;
import android.view.ViewTreeObserver;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class hs implements View.OnAttachStateChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ hs(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        switch (this.a) {
            case 0:
                is isVar = (is) this.b;
                Context context = view.getContext();
                if (!isVar.d) {
                    context.getApplicationContext().registerComponentCallbacks(isVar.f);
                    isVar.d = true;
                }
                break;
        }
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                is isVar = (is) obj;
                Context context = view.getContext();
                if (isVar.d) {
                    context.getApplicationContext().unregisterComponentCallbacks(isVar.f);
                    isVar.d = false;
                }
                isVar.d();
                break;
            case 1:
                su1 su1Var = (su1) obj;
                ViewTreeObserver viewTreeObserver = su1Var.M0;
                if (viewTreeObserver != null) {
                    if (!viewTreeObserver.isAlive()) {
                        su1Var.M0 = view.getViewTreeObserver();
                    }
                    su1Var.M0.removeGlobalOnLayoutListener(su1Var.w);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
            case 2:
                ryd rydVar = (ryd) obj;
                ViewTreeObserver viewTreeObserver2 = rydVar.Z;
                if (viewTreeObserver2 != null) {
                    if (!viewTreeObserver2.isAlive()) {
                        rydVar.Z = view.getViewTreeObserver();
                    }
                    rydVar.Z.removeGlobalOnLayoutListener(rydVar.w);
                }
                view.removeOnAttachStateChangeListener(this);
                break;
            case 3:
                k1 k1Var = (k1) obj;
                for (Object obj2 : fyc.u(yvf.a, k1Var.getParent())) {
                    if (obj2 instanceof View) {
                        View view2 = (View) obj2;
                        view2.getClass();
                        Object tag = view2.getTag(R.id.is_pooling_container_tag);
                        Boolean bool = tag instanceof Boolean ? (Boolean) tag : null;
                        if (bool != null ? bool.booleanValue() : false) {
                            break;
                        }
                    }
                }
                k1Var.e();
                break;
            default:
                view.removeOnAttachStateChangeListener(this);
                ((lyd) obj).h(null);
                break;
        }
    }

    private final void a(View view) {
    }

    private final void b(View view) {
    }

    private final void c(View view) {
    }

    private final void d(View view) {
    }
}
