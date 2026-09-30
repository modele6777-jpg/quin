package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class cq8 implements xl2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ aq4 b;
    public final /* synthetic */ v98 c;
    public final /* synthetic */ qp8 d;

    public /* synthetic */ cq8(aq4 aq4Var, v98 v98Var, qp8 qp8Var, int i) {
        this.a = i;
        this.b = aq4Var;
        this.c = v98Var;
        this.d = qp8Var;
    }

    @Override // defpackage.xl2
    public final void accept(Object obj) {
        int i = this.a;
        qp8 qp8Var = this.d;
        v98 v98Var = this.c;
        aq4 aq4Var = this.b;
        fq8 fq8Var = (fq8) obj;
        switch (i) {
            case 0:
                fq8Var.m(aq4Var.a, aq4Var.b, v98Var, qp8Var);
                break;
            default:
                fq8Var.j(aq4Var.a, aq4Var.b, v98Var, qp8Var);
                break;
        }
    }
}
