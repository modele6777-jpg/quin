package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class kr8 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ lr8 b;
    public final /* synthetic */ oye c;

    public /* synthetic */ kr8(lr8 lr8Var, oye oyeVar, int i) {
        this.a = i;
        this.b = lr8Var;
        this.c = oyeVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        oye oyeVar = this.c;
        lr8 lr8Var = this.b;
        switch (i) {
            case 0:
                ht htVarB = lr8Var.b(oyeVar);
                if (htVarB != null) {
                    lr8Var.b.add(htVarB);
                }
                break;
            default:
                ht htVarB2 = lr8Var.b(oyeVar);
                if (htVarB2 != null) {
                    lr8Var.b.add(htVarB2);
                }
                break;
        }
    }
}
