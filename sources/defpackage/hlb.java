package defpackage;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class hlb extends i6 {
    public final RecyclerView d;
    public final glb e;

    public hlb(RecyclerView recyclerView) {
        this.d = recyclerView;
        glb glbVar = this.e;
        if (glbVar != null) {
            this.e = glbVar;
        } else {
            this.e = new glb(this);
        }
    }

    @Override // defpackage.i6
    public final void c(View view, AccessibilityEvent accessibilityEvent) {
        super.c(view, accessibilityEvent);
        if (!(view instanceof RecyclerView) || this.d.I()) {
            return;
        }
        RecyclerView recyclerView = (RecyclerView) view;
        if (recyclerView.getLayoutManager() != null) {
            recyclerView.getLayoutManager().N(accessibilityEvent);
        }
    }

    @Override // defpackage.i6
    public final void d(View view, t6 t6Var) {
        this.a.onInitializeAccessibilityNodeInfo(view, t6Var.a);
        RecyclerView recyclerView = this.d;
        if (recyclerView.I() || recyclerView.getLayoutManager() == null) {
            return;
        }
        tkb layoutManager = recyclerView.getLayoutManager();
        RecyclerView recyclerView2 = layoutManager.b;
        layoutManager.O(recyclerView2.c, recyclerView2.s1, t6Var);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0079 A[PHI: r5
  0x0079: PHI (r5v12 int) = (r5v9 int), (r5v15 int) binds: [B:32:0x0095, B:24:0x006b] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // defpackage.i6
    public final boolean g(View view, int i, Bundle bundle) {
        int iA;
        int iY;
        if (super.g(view, i, bundle)) {
            return true;
        }
        RecyclerView recyclerView = this.d;
        if (!recyclerView.I() && recyclerView.getLayoutManager() != null) {
            tkb layoutManager = recyclerView.getLayoutManager();
            gp3 gp3Var = layoutManager.b.c;
            int iHeight = layoutManager.n;
            int iWidth = layoutManager.m;
            Rect rect = new Rect();
            if (layoutManager.b.getMatrix().isIdentity() && layoutManager.b.getGlobalVisibleRect(rect)) {
                iHeight = rect.height();
                iWidth = rect.width();
            }
            if (i == 4096) {
                iA = layoutManager.b.canScrollVertically(1) ? (iHeight - layoutManager.A()) - layoutManager.x() : 0;
                if (layoutManager.b.canScrollHorizontally(1)) {
                    iY = (iWidth - layoutManager.y()) - layoutManager.z();
                } else {
                    iY = 0;
                }
            } else if (i != 8192) {
                iA = 0;
                iY = 0;
            } else {
                iA = layoutManager.b.canScrollVertically(-1) ? -((iHeight - layoutManager.A()) - layoutManager.x()) : 0;
                if (layoutManager.b.canScrollHorizontally(-1)) {
                    iY = -((iWidth - layoutManager.y()) - layoutManager.z());
                } else {
                    iY = 0;
                }
            }
            if (iA != 0 || iY != 0) {
                layoutManager.b.Y(iY, iA, true);
                return true;
            }
        }
        return false;
    }
}
