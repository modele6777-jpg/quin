package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class sd9 extends gbe implements l26 {
    final /* synthetic */ mmb $cacheResponse;
    final /* synthetic */ ae9 $networkRequest;
    final /* synthetic */ mmb $snapshot;
    /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ wd9 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sd9(mmb mmbVar, wd9 wd9Var, mmb mmbVar2, ae9 ae9Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.$snapshot = mmbVar;
        this.this$0 = wd9Var;
        this.$cacheResponse = mmbVar2;
        this.$networkRequest = ae9Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        sd9 sd9Var = new sd9(this.$snapshot, this.this$0, this.$cacheResponse, this.$networkRequest, xn2Var);
        sd9Var.L$0 = obj;
        return sd9Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00a7, code lost:
    
        if (r10 == r6) goto L33;
     */
    @Override // defpackage.pt0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object r(java.lang.Object r10) {
        /*
            Method dump skipped, instruction units count: 223
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sd9.r(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((sd9) k((xn2) obj2, (me9) obj)).r(wef.a);
    }
}
