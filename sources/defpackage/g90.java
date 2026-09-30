package defpackage;

import android.view.View;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class g90 implements ViewTreeObserver.OnGlobalLayoutListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ g90(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                o90 o90Var = (o90) obj;
                if (!o90Var.getInternalPopup().a()) {
                    o90Var.f.n(o90Var.getTextDirection(), o90Var.getTextAlignment());
                }
                ViewTreeObserver viewTreeObserver = o90Var.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeOnGlobalLayoutListener(this);
                }
                break;
            case 1:
                l90 l90Var = (l90) obj;
                o90 o90Var2 = l90Var.U0;
                if (o90Var2.isAttachedToWindow() && o90Var2.getGlobalVisibleRect(l90Var.S0)) {
                    l90Var.s();
                    l90Var.f();
                } else {
                    l90Var.dismiss();
                }
                break;
            case 2:
                su1 su1Var = (su1) obj;
                ArrayList arrayList = su1Var.v;
                if (su1Var.a() && arrayList.size() > 0 && !((ru1) arrayList.get(0)).a.M0) {
                    View view = su1Var.Z;
                    if (view != null && view.isShown()) {
                        Iterator it = arrayList.iterator();
                        while (it.hasNext()) {
                            ((ru1) it.next()).a.f();
                        }
                    } else {
                        su1Var.dismiss();
                    }
                    break;
                }
                break;
            default:
                ryd rydVar = (ryd) obj;
                hs8 hs8Var = rydVar.v;
                if (rydVar.a() && !hs8Var.M0) {
                    View view2 = rydVar.X;
                    if (view2 != null && view2.isShown()) {
                        hs8Var.f();
                    } else {
                        rydVar.dismiss();
                    }
                    break;
                }
                break;
        }
    }
}
