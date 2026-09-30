package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class qo3 implements c98 {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ uuf b;

    public /* synthetic */ qo3(pl plVar, uuf uufVar) {
        this.b = uufVar;
    }

    @Override // defpackage.c98
    public final void d(Object obj) {
        int i = this.a;
        uuf uufVar = this.b;
        switch (i) {
            case 0:
                sp8 sp8Var = (sp8) ((ql) obj);
                w84 w84Var = sp8Var.p;
                if (w84Var != null) {
                    rr5 rr5Var = (rr5) w84Var.b;
                    if (rr5Var.x == -1) {
                        qr5 qr5VarA = rr5Var.a();
                        qr5VarA.v = uufVar.a;
                        qr5VarA.w = uufVar.b;
                        sp8Var.p = new w84(19, new rr5(qr5VarA), (String) w84Var.c);
                    }
                }
                int i2 = uufVar.a;
                break;
            default:
                ((xga) obj).a(uufVar);
                break;
        }
    }

    public /* synthetic */ qo3(uuf uufVar) {
        this.b = uufVar;
    }
}
