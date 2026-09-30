package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class rh1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ uh1 b;
    public final /* synthetic */ List c;
    public final /* synthetic */ int d;

    public /* synthetic */ rh1(uh1 uh1Var, List list, int i, int i2) {
        this.a = i2;
        this.b = uh1Var;
        this.c = list;
        this.d = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                uh1 uh1Var = this.b;
                List list = this.c;
                int i = this.d;
                if (uh1Var.l.get() && uh1Var.k.equals(list)) {
                    b21.q("CameraPresencePrvdr", "Triggering refresh. Attempts left: " + i);
                    zda zdaVar = uh1Var.h;
                    if (zdaVar != null) {
                        zdaVar.a();
                    }
                    uh1Var.d(i - 1, list);
                    break;
                }
                break;
            default:
                uh1 uh1Var2 = this.b;
                uh1Var2.a.execute(new rh1(uh1Var2, this.c, this.d, 0));
                break;
        }
    }
}
