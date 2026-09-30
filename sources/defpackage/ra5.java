package defpackage;

import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ra5 extends wkb {
    public final /* synthetic */ ua5 a;

    public ra5(ua5 ua5Var) {
        this.a = ua5Var;
    }

    @Override // defpackage.wkb
    public final void a(RecyclerView recyclerView) {
        int iComputeHorizontalScrollOffset = recyclerView.computeHorizontalScrollOffset();
        int iComputeVerticalScrollOffset = recyclerView.computeVerticalScrollOffset();
        ua5 ua5Var = this.a;
        int i = ua5Var.a;
        int iComputeVerticalScrollRange = ua5Var.s.computeVerticalScrollRange();
        int i2 = ua5Var.r;
        ua5Var.t = iComputeVerticalScrollRange - i2 > 0 && i2 >= i;
        int iComputeHorizontalScrollRange = ua5Var.s.computeHorizontalScrollRange();
        int i3 = ua5Var.q;
        boolean z = iComputeHorizontalScrollRange - i3 > 0 && i3 >= i;
        ua5Var.u = z;
        boolean z2 = ua5Var.t;
        if (!z2 && !z) {
            if (ua5Var.v != 0) {
                ua5Var.d(0);
                return;
            }
            return;
        }
        if (z2) {
            float f = i2;
            ua5Var.l = (int) ((((f / 2.0f) + iComputeVerticalScrollOffset) * f) / iComputeVerticalScrollRange);
            ua5Var.k = Math.min(i2, (i2 * i2) / iComputeVerticalScrollRange);
        }
        if (ua5Var.u) {
            float f2 = iComputeHorizontalScrollOffset;
            float f3 = i3;
            ua5Var.o = (int) ((((f3 / 2.0f) + f2) * f3) / iComputeHorizontalScrollRange);
            ua5Var.n = Math.min(i3, (i3 * i3) / iComputeHorizontalScrollRange);
        }
        int i4 = ua5Var.v;
        if (i4 == 0 || i4 == 1) {
            ua5Var.d(1);
        }
    }
}
