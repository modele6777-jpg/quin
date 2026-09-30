package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class osb extends gbe implements n26 {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ xsb this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public osb(xsb xsbVar, xn2 xn2Var) {
        super(3, xn2Var);
        this.this$0 = xsbVar;
    }

    @Override // defpackage.n26
    public final Object m(Object obj, Object obj2, Object obj3) {
        osb osbVar = new osb(this.this$0, (xn2) obj3);
        osbVar.L$0 = (Throwable) obj2;
        wef wefVar = wef.a;
        osbVar.r(wefVar);
        return wefVar;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        Throwable th = (Throwable) this.L$0;
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        this.this$0.d().c("failed to fetch report", th);
        xsb xsbVar = this.this$0;
        yrb.a.getClass();
        boolean z = th instanceof jzc;
        yrb yrbVar = yrb.Unknown;
        if (z) {
            switch (((jzc) th).getErrorCode()) {
                case 110000:
                    yrbVar = yrb.TestIdNotExists;
                    break;
                case 110001:
                    yrbVar = yrb.Unfinished;
                    break;
                case 110002:
                    yrbVar = yrb.NeedPay;
                    break;
            }
        }
        xsbVar.b.setValue(yrbVar);
        return wef.a;
    }
}
