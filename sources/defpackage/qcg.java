package defpackage;

import ai.askquin.R;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.platform.AndroidComposeView;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class qcg {
    public static final ViewGroup.LayoutParams a = new ViewGroup.LayoutParams(-2, -2);

    /* JADX WARN: Code duplicated, block: B:23:0x005e  */
    /* JADX WARN: Code duplicated, block: B:26:0x0079  */
    /* JADX WARN: Code duplicated, block: B:29:0x008a  */
    /* JADX WARN: Code duplicated, block: B:31:0x008f  */
    public static final kcg a(k1 k1Var, qf2 qf2Var, dd2 dd2Var) {
        AndroidComposeView androidComposeView;
        kcg kcgVar;
        if (sb6.a.compareAndSet(false, true)) {
            r41 r41VarA = urg.a(1, null, null, 6);
            ynb.V(jgb.k((pv2) mw.X.getValue()), null, null, new rb6(r41VarA, null), 3);
            za6 za6Var = new za6(2, r41VarA);
            synchronized (qrd.c) {
                qrd.i = s72.R0(qrd.i, za6Var);
            }
            qrd.c();
        }
        if (k1Var.getChildCount() > 0) {
            View childAt = k1Var.getChildAt(0);
            androidComposeView = childAt instanceof AndroidComposeView ? (AndroidComposeView) childAt : null;
            if (androidComposeView != null) {
                androidComposeView.setComposeViewContext(qf2Var);
            }
            if (androidComposeView == null) {
                androidComposeView = new AndroidComposeView(k1Var.getContext(), qf2Var);
                k1Var.addView(androidComposeView.getView(), a);
            }
            androidComposeView.setComposeViewContext(qf2Var);
            if (k1Var.getComposeViewContext$ui() != null) {
                qf2Var.e();
                androidComposeView.setComposeViewContextIncrementedDuringInit$ui(true);
            }
            Object tag = androidComposeView.getTag(R.id.wrapped_composition_tag);
            kcgVar = tag instanceof kcg ? (kcg) tag : null;
            if (kcgVar == null) {
                kcgVar = new kcg(androidComposeView, new rg2(qf2Var.c(), new taf(androidComposeView.getRoot())));
                androidComposeView.setTag(R.id.wrapped_composition_tag, kcgVar);
            }
            kcgVar.b(dd2Var);
            androidComposeView.setFrameEndScheduler$ui(new pcg(qf2Var.c()));
            return kcgVar;
        }
        k1Var.removeAllViews();
        androidComposeView = null;
        if (androidComposeView == null) {
            androidComposeView = new AndroidComposeView(k1Var.getContext(), qf2Var);
            k1Var.addView(androidComposeView.getView(), a);
        }
        androidComposeView.setComposeViewContext(qf2Var);
        if (k1Var.getComposeViewContext$ui() != null) {
            qf2Var.e();
            androidComposeView.setComposeViewContextIncrementedDuringInit$ui(true);
        }
        Object tag2 = androidComposeView.getTag(R.id.wrapped_composition_tag);
        if (tag2 instanceof kcg) {
        }
        if (kcgVar == null) {
            kcgVar = new kcg(androidComposeView, new rg2(qf2Var.c(), new taf(androidComposeView.getRoot())));
            androidComposeView.setTag(R.id.wrapped_composition_tag, kcgVar);
        }
        kcgVar.b(dd2Var);
        androidComposeView.setFrameEndScheduler$ui(new pcg(qf2Var.c()));
        return kcgVar;
    }
}
