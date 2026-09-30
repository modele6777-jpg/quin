package defpackage;

import android.widget.AbsListView;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class e88 implements AbsListView.OnScrollListener {
    public final /* synthetic */ g88 a;

    public e88(g88 g88Var) {
        this.a = g88Var;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i) {
        g88 g88Var = this.a;
        c88 c88Var = g88Var.F0;
        z80 z80Var = g88Var.N0;
        if (i != 1 || z80Var.getInputMethodMode() == 2 || z80Var.getContentView() == null) {
            return;
        }
        g88Var.J0.removeCallbacks(c88Var);
        c88Var.run();
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i, int i2, int i3) {
    }
}
