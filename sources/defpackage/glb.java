package defpackage;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.recyclerview.widget.RecyclerView;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class glb extends i6 {
    public final hlb d;
    public final WeakHashMap e = new WeakHashMap();

    public glb(hlb hlbVar) {
        this.d = hlbVar;
    }

    @Override // defpackage.i6
    public final boolean a(View view, AccessibilityEvent accessibilityEvent) {
        i6 i6Var = (i6) this.e.get(view);
        return i6Var != null ? i6Var.a(view, accessibilityEvent) : this.a.dispatchPopulateAccessibilityEvent(view, accessibilityEvent);
    }

    @Override // defpackage.i6
    public final kd9 b(View view) {
        i6 i6Var = (i6) this.e.get(view);
        return i6Var != null ? i6Var.b(view) : super.b(view);
    }

    @Override // defpackage.i6
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        i6 i6Var = (i6) this.e.get(view);
        if (i6Var != null) {
            i6Var.c(view, accessibilityEvent);
        } else {
            super.c(view, accessibilityEvent);
        }
    }

    @Override // defpackage.i6
    public final void d(View view, t6 t6Var) {
        AccessibilityNodeInfo accessibilityNodeInfo = t6Var.a;
        hlb hlbVar = this.d;
        RecyclerView recyclerView = hlbVar.d;
        RecyclerView recyclerView2 = hlbVar.d;
        boolean zI = recyclerView.I();
        View.AccessibilityDelegate accessibilityDelegate = this.a;
        if (zI || recyclerView2.getLayoutManager() == null) {
            accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
            return;
        }
        recyclerView2.getLayoutManager().Q(view, t6Var);
        i6 i6Var = (i6) this.e.get(view);
        if (i6Var != null) {
            i6Var.d(view, t6Var);
        } else {
            accessibilityDelegate.onInitializeAccessibilityNodeInfo(view, accessibilityNodeInfo);
        }
    }

    @Override // defpackage.i6
    public final void e(View view, AccessibilityEvent accessibilityEvent) {
        i6 i6Var = (i6) this.e.get(view);
        if (i6Var != null) {
            i6Var.e(view, accessibilityEvent);
        } else {
            super.e(view, accessibilityEvent);
        }
    }

    @Override // defpackage.i6
    public final boolean f(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
        i6 i6Var = (i6) this.e.get(viewGroup);
        return i6Var != null ? i6Var.f(viewGroup, view, accessibilityEvent) : this.a.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
    }

    @Override // defpackage.i6
    public final boolean g(View view, int i, Bundle bundle) {
        hlb hlbVar = this.d;
        RecyclerView recyclerView = hlbVar.d;
        RecyclerView recyclerView2 = hlbVar.d;
        if (recyclerView.I() || recyclerView2.getLayoutManager() == null) {
            return super.g(view, i, bundle);
        }
        i6 i6Var = (i6) this.e.get(view);
        if (i6Var != null) {
            if (i6Var.g(view, i, bundle)) {
                return true;
            }
        } else if (super.g(view, i, bundle)) {
            return true;
        }
        gp3 gp3Var = recyclerView2.getLayoutManager().b.c;
        return false;
    }

    @Override // defpackage.i6
    public final void h(View view, int i) {
        i6 i6Var = (i6) this.e.get(view);
        if (i6Var != null) {
            i6Var.h(view, i);
        } else {
            super.h(view, i);
        }
    }

    @Override // defpackage.i6
    public final void i(View view, AccessibilityEvent accessibilityEvent) {
        i6 i6Var = (i6) this.e.get(view);
        if (i6Var != null) {
            i6Var.i(view, accessibilityEvent);
        } else {
            super.i(view, accessibilityEvent);
        }
    }
}
