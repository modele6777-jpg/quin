package defpackage;

import android.view.ViewGroup;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class j80 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ q80 b;

    public /* synthetic */ j80(q80 q80Var, int i) {
        this.a = i;
        this.b = q80Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ViewGroup viewGroup;
        int i = this.a;
        q80 q80Var = this.b;
        switch (i) {
            case 0:
                if ((q80Var.m1 & 1) != 0) {
                    q80Var.x(0);
                }
                if ((q80Var.m1 & 4096) != 0) {
                    q80Var.x(108);
                }
                q80Var.l1 = false;
                q80Var.m1 = 0;
                break;
            default:
                q80Var.K0.showAtLocation(q80Var.J0, 55, 0, 0);
                swf swfVar = q80Var.M0;
                if (swfVar != null) {
                    swfVar.b();
                }
                if (q80Var.N0 && (viewGroup = q80Var.O0) != null && viewGroup.isLaidOut()) {
                    q80Var.J0.setAlpha(0.0f);
                    swf swfVarA = nvf.a(q80Var.J0);
                    swfVarA.a(1.0f);
                    q80Var.M0 = swfVarA;
                    swfVarA.d(new k80(0, this));
                } else {
                    q80Var.J0.setAlpha(1.0f);
                    q80Var.J0.setVisibility(0);
                }
                break;
        }
    }
}
