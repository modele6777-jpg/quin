package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class k80 extends vwf {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ k80(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.vwf, defpackage.uwf
    public void b() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((j80) obj).b.J0.setVisibility(0);
                break;
            case 1:
                q80 q80Var = (q80) obj;
                q80Var.J0.setVisibility(0);
                if (q80Var.J0.getParent() instanceof View) {
                    View view = (View) q80Var.J0.getParent();
                    WeakHashMap weakHashMap = nvf.a;
                    view.requestApplyInsets();
                }
                break;
        }
    }

    @Override // defpackage.uwf
    public final void c() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                q80 q80Var = ((j80) obj).b;
                q80Var.J0.setAlpha(1.0f);
                q80Var.M0.d(null);
                q80Var.M0 = null;
                break;
            case 1:
                q80 q80Var2 = (q80) obj;
                q80Var2.J0.setAlpha(1.0f);
                q80Var2.M0.d(null);
                q80Var2.M0 = null;
                break;
            default:
                q80 q80Var3 = (q80) ((a90) obj).c;
                q80Var3.J0.setVisibility(8);
                PopupWindow popupWindow = q80Var3.K0;
                if (popupWindow != null) {
                    popupWindow.dismiss();
                } else if (q80Var3.J0.getParent() instanceof View) {
                    View view = (View) q80Var3.J0.getParent();
                    WeakHashMap weakHashMap = nvf.a;
                    view.requestApplyInsets();
                }
                q80Var3.J0.e();
                q80Var3.M0.d(null);
                q80Var3.M0 = null;
                ViewGroup viewGroup = q80Var3.O0;
                WeakHashMap weakHashMap2 = nvf.a;
                viewGroup.requestApplyInsets();
                break;
        }
    }
}
