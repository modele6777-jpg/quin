package defpackage;

import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;
import io.sentry.android.replay.i0;
import java.lang.ref.WeakReference;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class bha implements View.OnLayoutChangeListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ bha(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        int height;
        int height2;
        int i9 = this.a;
        Object obj = this.b;
        switch (i9) {
            case 0:
                oha ohaVar = (oha) obj;
                int i10 = ohaVar.K0;
                PopupWindow popupWindow = ohaVar.J0;
                int i11 = i4 - i2;
                int i12 = i8 - i6;
                if ((i3 - i != i7 - i5 || i11 != i12) && popupWindow.isShowing()) {
                    ohaVar.u();
                    popupWindow.update(view, (ohaVar.getWidth() - popupWindow.getWidth()) - i10, (-popupWindow.getHeight()) - i10, -1, -1);
                }
                break;
            case 1:
                tha thaVar = (tha) obj;
                oha ohaVar2 = thaVar.a;
                int width = (ohaVar2.getWidth() - ohaVar2.getPaddingLeft()) - ohaVar2.getPaddingRight();
                int height3 = (ohaVar2.getHeight() - ohaVar2.getPaddingBottom()) - ohaVar2.getPaddingTop();
                ViewGroup viewGroup = thaVar.d;
                int iC = tha.c(viewGroup) - (viewGroup != null ? viewGroup.getPaddingRight() + viewGroup.getPaddingLeft() : 0);
                if (viewGroup == null) {
                    height = 0;
                } else {
                    height = viewGroup.getHeight();
                    ViewGroup.LayoutParams layoutParams = viewGroup.getLayoutParams();
                    if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
                        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                        height += marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
                    }
                }
                int paddingBottom = height - (viewGroup != null ? viewGroup.getPaddingBottom() + viewGroup.getPaddingTop() : 0);
                int iMax = Math.max(iC, tha.c(thaVar.l) + tha.c(thaVar.j));
                ViewGroup viewGroup2 = thaVar.e;
                if (viewGroup2 == null) {
                    height2 = 0;
                } else {
                    height2 = viewGroup2.getHeight();
                    ViewGroup.LayoutParams layoutParams2 = viewGroup2.getLayoutParams();
                    if (layoutParams2 instanceof ViewGroup.MarginLayoutParams) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                        height2 += marginLayoutParams2.topMargin + marginLayoutParams2.bottomMargin;
                    }
                }
                boolean z = width <= iMax || height3 <= (height2 * 2) + paddingBottom;
                if (thaVar.B != z) {
                    thaVar.B = z;
                    view.post(new pha(thaVar, 1));
                }
                boolean z2 = i3 - i != i7 - i5;
                if (!thaVar.B && z2) {
                    view.post(new pha(thaVar, 2));
                    break;
                }
                break;
            default:
                i0 i0Var = (i0) obj;
                int i13 = i4 - i2;
                int i14 = i8 - i6;
                if (i3 - i != i7 - i5 || i13 != i14) {
                    WeakReference weakReference = (WeakReference) s72.H0(i0Var.g);
                    if (pa7.t(view, weakReference != null ? (View) weakReference.get() : null)) {
                        view.getClass();
                        i0Var.h(view);
                        break;
                    }
                }
                break;
        }
    }
}
