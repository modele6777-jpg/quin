package io.sentry;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class x6 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ a7 b;

    public /* synthetic */ x6(a7 a7Var, int i) {
        this.a = i;
        this.b = a7Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        a7 a7Var = this.b;
        switch (i) {
            case 0:
                h7 h7VarA = a7Var.a();
                if (h7VarA == null) {
                    h7VarA = h7.OK;
                }
                a7Var.x(h7VarA, null);
                a7Var.l.set(false);
                break;
            default:
                h7 h7VarA2 = a7Var.a();
                if (h7VarA2 == null) {
                    h7VarA2 = h7.DEADLINE_EXCEEDED;
                }
                a7Var.f(h7VarA2, a7Var.r.g != null, null);
                a7Var.m.set(false);
                break;
        }
    }
}
