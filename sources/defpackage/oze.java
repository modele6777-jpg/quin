package defpackage;

import android.content.Context;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class oze implements ls8 {
    public qr8 a;
    public vr8 b;
    public final /* synthetic */ Toolbar c;

    public oze(Toolbar toolbar) {
        this.c = toolbar;
    }

    @Override // defpackage.ls8
    public final boolean b(k6e k6eVar) {
        return false;
    }

    @Override // defpackage.ls8
    public final boolean c() {
        return false;
    }

    @Override // defpackage.ls8
    public final boolean e(vr8 vr8Var) {
        Toolbar toolbar = this.c;
        KeyEvent.Callback callback = toolbar.w;
        if (callback instanceof o72) {
            ((xr8) ((o72) callback)).a.onActionViewCollapsed();
        }
        toolbar.removeView(toolbar.w);
        toolbar.removeView(toolbar.v);
        toolbar.w = null;
        ArrayList arrayList = toolbar.W0;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            toolbar.addView((View) arrayList.get(size));
        }
        arrayList.clear();
        this.b = null;
        toolbar.requestLayout();
        vr8Var.C = false;
        vr8Var.n.p(false);
        toolbar.t();
        return true;
    }

    @Override // defpackage.ls8
    public final boolean h(vr8 vr8Var) {
        Toolbar toolbar = this.c;
        toolbar.c();
        ViewParent parent = toolbar.v.getParent();
        if (parent != toolbar) {
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(toolbar.v);
            }
            toolbar.addView(toolbar.v);
        }
        View actionView = vr8Var.getActionView();
        toolbar.w = actionView;
        this.b = vr8Var;
        ViewParent parent2 = actionView.getParent();
        if (parent2 != toolbar) {
            if (parent2 instanceof ViewGroup) {
                ((ViewGroup) parent2).removeView(toolbar.w);
            }
            pze pzeVarH = Toolbar.h();
            pzeVarH.a = (toolbar.F0 & 112) | 8388611;
            pzeVarH.b = 2;
            toolbar.w.setLayoutParams(pzeVarH);
            toolbar.addView(toolbar.w);
        }
        for (int childCount = toolbar.getChildCount() - 1; childCount >= 0; childCount--) {
            View childAt = toolbar.getChildAt(childCount);
            if (((pze) childAt.getLayoutParams()).b != 2 && childAt != toolbar.a) {
                toolbar.removeViewAt(childCount);
                toolbar.W0.add(childAt);
            }
        }
        toolbar.requestLayout();
        vr8Var.C = true;
        vr8Var.n.p(false);
        KeyEvent.Callback callback = toolbar.w;
        if (callback instanceof o72) {
            ((xr8) ((o72) callback)).a.onActionViewExpanded();
        }
        toolbar.t();
        return true;
    }

    @Override // defpackage.ls8
    public final void i() {
        if (this.b != null) {
            qr8 qr8Var = this.a;
            if (qr8Var != null) {
                int size = qr8Var.f.size();
                for (int i = 0; i < size; i++) {
                    if (this.a.getItem(i) == this.b) {
                        return;
                    }
                }
            }
            e(this.b);
        }
    }

    @Override // defpackage.ls8
    public final void k(Context context, qr8 qr8Var) {
        vr8 vr8Var;
        qr8 qr8Var2 = this.a;
        if (qr8Var2 != null && (vr8Var = this.b) != null) {
            qr8Var2.d(vr8Var);
        }
        this.a = qr8Var;
    }

    @Override // defpackage.ls8
    public final void d(qr8 qr8Var, boolean z) {
    }
}
