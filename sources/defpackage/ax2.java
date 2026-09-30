package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class ax2 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ bx2 b;
    public final /* synthetic */ oye c;

    public /* synthetic */ ax2(bx2 bx2Var, oye oyeVar, int i) {
        this.a = i;
        this.b = bx2Var;
        this.c = oyeVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        oye oyeVar = this.c;
        bx2 bx2Var = this.b;
        switch (i) {
            case 0:
                dx2 dx2VarB = bx2Var.b(oyeVar);
                if (dx2VarB != null) {
                    bx2Var.a.add(dx2VarB);
                }
                break;
            default:
                dx2 dx2VarB2 = bx2Var.b(oyeVar);
                if (dx2VarB2 != null) {
                    bx2Var.a.add(dx2VarB2);
                }
                break;
        }
    }
}
