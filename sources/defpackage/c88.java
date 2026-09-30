package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class c88 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ g88 b;

    public /* synthetic */ c88(g88 g88Var, int i) {
        this.a = i;
        this.b = g88Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        g88 g88Var = this.b;
        switch (i) {
            case 0:
                hq4 hq4Var = g88Var.c;
                if (hq4Var != null) {
                    hq4Var.setListSelectionHidden(true);
                    hq4Var.requestLayout();
                }
                break;
            default:
                hq4 hq4Var2 = g88Var.c;
                if (hq4Var2 != null && hq4Var2.isAttachedToWindow() && g88Var.c.getCount() > g88Var.c.getChildCount() && g88Var.c.getChildCount() <= g88Var.X) {
                    g88Var.N0.setInputMethodMode(2);
                    g88Var.f();
                    break;
                }
                break;
        }
    }
}
