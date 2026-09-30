package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class re8 extends gbe implements n26 {
    final /* synthetic */ String $testId;
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ se8 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public re8(se8 se8Var, String str, xn2 xn2Var) {
        super(3, xn2Var);
        this.this$0 = se8Var;
        this.$testId = str;
    }

    @Override // defpackage.n26
    public final Object m(Object obj, Object obj2, Object obj3) throws Throwable {
        re8 re8Var = new re8(this.this$0, this.$testId, (xn2) obj3);
        re8Var.L$0 = (Throwable) obj2;
        wef wefVar = wef.a;
        re8Var.r(wefVar);
        return wefVar;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) throws Throwable {
        Throwable th = (Throwable) this.L$0;
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        ynb.h0(th);
        kv2.A("fetchReport failed for ", this.$testId, this.this$0.d(), th);
        return wef.a;
    }
}
