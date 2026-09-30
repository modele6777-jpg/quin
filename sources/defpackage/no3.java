package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class no3 implements c98 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;

    public /* synthetic */ no3(pl plVar, int i, yga ygaVar, yga ygaVar2) {
        this.a = 0;
        this.b = i;
    }

    @Override // defpackage.c98
    public final void d(Object obj) {
        int i = this.a;
        int i2 = this.b;
        switch (i) {
            case 0:
                ql qlVar = (ql) obj;
                qlVar.getClass();
                sp8 sp8Var = (sp8) qlVar;
                if (i2 == 1) {
                    sp8Var.v = true;
                }
                sp8Var.l = i2;
                break;
            case 1:
                ((xga) obj).k(i2);
                break;
            default:
                ((xga) obj).w(i2);
                break;
        }
    }

    public /* synthetic */ no3(int i, int i2) {
        this.a = i2;
        this.b = i;
    }
}
