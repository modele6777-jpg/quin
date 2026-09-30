package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.compose.ui.node.LayoutNode;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class xw implements xn8 {
    public final /* synthetic */ uvf a;
    public final /* synthetic */ LayoutNode b;

    public xw(uvf uvfVar, LayoutNode layoutNode) {
        this.a = uvfVar;
        this.b = layoutNode;
    }

    @Override // defpackage.xn8
    public final int a(ga7 ga7Var, List list, int i) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        uvf uvfVar = this.a;
        ViewGroup.LayoutParams layoutParams = uvfVar.getLayoutParams();
        layoutParams.getClass();
        uvfVar.measure(iMakeMeasureSpec, ax.l(0, i, layoutParams.height));
        return uvfVar.getMeasuredWidth();
    }

    @Override // defpackage.xn8
    public final yn8 b(zn8 zn8Var, List list, long j) {
        uvf uvfVar = this.a;
        int childCount = uvfVar.getChildCount();
        qu4 qu4Var = qu4.a;
        if (childCount == 0) {
            return zn8Var.n0(kl2.j(j), kl2.i(j), qu4Var, new zv(3));
        }
        if (kl2.j(j) != 0) {
            uvfVar.getChildAt(0).setMinimumWidth(kl2.j(j));
        }
        if (kl2.i(j) != 0) {
            uvfVar.getChildAt(0).setMinimumHeight(kl2.i(j));
        }
        int iJ = kl2.j(j);
        int iH = kl2.h(j);
        ViewGroup.LayoutParams layoutParams = uvfVar.getLayoutParams();
        layoutParams.getClass();
        int iL = ax.l(iJ, iH, layoutParams.width);
        int i = kl2.i(j);
        int iG = kl2.g(j);
        ViewGroup.LayoutParams layoutParams2 = uvfVar.getLayoutParams();
        layoutParams2.getClass();
        uvfVar.measure(iL, ax.l(i, iG, layoutParams2.height));
        return zn8Var.n0(uvfVar.getMeasuredWidth(), uvfVar.getMeasuredHeight(), qu4Var, new tw(uvfVar, this.b, 2));
    }

    @Override // defpackage.xn8
    public final int c(ga7 ga7Var, List list, int i) {
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        uvf uvfVar = this.a;
        ViewGroup.LayoutParams layoutParams = uvfVar.getLayoutParams();
        layoutParams.getClass();
        uvfVar.measure(iMakeMeasureSpec, ax.l(0, i, layoutParams.height));
        return uvfVar.getMeasuredWidth();
    }

    @Override // defpackage.xn8
    public final int d(ga7 ga7Var, List list, int i) {
        uvf uvfVar = this.a;
        ViewGroup.LayoutParams layoutParams = uvfVar.getLayoutParams();
        layoutParams.getClass();
        uvfVar.measure(ax.l(0, i, layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
        return uvfVar.getMeasuredHeight();
    }

    @Override // defpackage.xn8
    public final int e(ga7 ga7Var, List list, int i) {
        uvf uvfVar = this.a;
        ViewGroup.LayoutParams layoutParams = uvfVar.getLayoutParams();
        layoutParams.getClass();
        uvfVar.measure(ax.l(0, i, layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
        return uvfVar.getMeasuredHeight();
    }
}
