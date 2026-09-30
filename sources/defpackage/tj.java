package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class tj implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Object c;

    public /* synthetic */ tj(Object obj, boolean z, int i) {
        this.a = i;
        this.c = obj;
        this.b = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        boolean z = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                yj yjVar = (yj) obj;
                yjVar.z = z;
                pj pjVar = yjVar.E0;
                if (pjVar != null && !pjVar.g) {
                    try {
                        y45 y45Var = (y45) pjVar.u;
                        if (y45Var != null) {
                            y45Var.P(z);
                        }
                    } catch (Exception e) {
                        ((vj) pjVar.p).d(e);
                        return;
                    }
                    break;
                }
                break;
            default:
                t45 t45Var = (t45) ((k47) obj).c;
                String str = pqf.a;
                y45 y45Var2 = t45Var.a;
                if (y45Var2.c0 != z) {
                    y45Var2.c0 = z;
                    y45Var2.m.e(23, new p45(z, 1));
                    break;
                }
                break;
        }
    }
}
