package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ibd extends gbe implements n26 {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ lbd this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ibd(lbd lbdVar, xn2 xn2Var) {
        super(3, xn2Var);
        this.this$0 = lbdVar;
    }

    @Override // defpackage.n26
    public final Object m(Object obj, Object obj2, Object obj3) {
        ibd ibdVar = new ibd(this.this$0, (xn2) obj3);
        ibdVar.L$0 = (Throwable) obj2;
        wef wefVar = wef.a;
        ibdVar.r(wefVar);
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
        lbd lbdVar = this.this$0;
        int i = lbd.w;
        lbdVar.g(th);
        return wef.a;
    }
}
