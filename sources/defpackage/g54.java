package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class g54 extends gbe implements l26 {
    final /* synthetic */ ht6 $accountRequester;
    final /* synthetic */ p5a $paywallSkusProvider;
    final /* synthetic */ fab $quotaUpdater;
    final /* synthetic */ String $value;
    Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g54(String str, ht6 ht6Var, p5a p5aVar, fab fabVar, xn2 xn2Var) {
        super(2, xn2Var);
        this.$value = str;
        this.$accountRequester = ht6Var;
        this.$paywallSkusProvider = p5aVar;
        this.$quotaUpdater = fabVar;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new g54(this.$value, this.$accountRequester, this.$paywallSkusProvider, this.$quotaUpdater, xn2Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0049, code lost:
    
        if (defpackage.j74.N(r6, r0, r2, r5) == r4) goto L15;
     */
    @Override // defpackage.pt0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object r(java.lang.Object r6) {
        /*
            r5 = this;
            int r0 = r5.label
            r1 = 2
            r2 = 1
            r3 = 0
            bw2 r4 = defpackage.bw2.a
            if (r0 == 0) goto L23
            if (r0 == r2) goto L17
            if (r0 != r1) goto L11
            defpackage.jzb.q(r6)
            goto L4c
        L11:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qc0.p(r5)
            return r3
        L17:
            java.lang.Object r0 = r5.L$1
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r0 = r5.L$0
            hs3 r0 = (defpackage.hs3) r0
            defpackage.jzb.q(r6)
            goto L39
        L23:
            defpackage.jzb.q(r6)
            hs3 r6 = defpackage.xqa.w0
            java.lang.String r0 = r5.$value
            isa r6 = r6.a
            r5.L$0 = r3
            r5.L$1 = r3
            r5.label = r2
            java.lang.Object r6 = defpackage.bsa.n(r6, r0, r5)
            if (r6 != r4) goto L39
            goto L4b
        L39:
            ht6 r6 = r5.$accountRequester
            p5a r0 = r5.$paywallSkusProvider
            fab r2 = r5.$quotaUpdater
            r5.L$0 = r3
            r5.L$1 = r3
            r5.label = r1
            java.lang.Object r5 = defpackage.j74.N(r6, r0, r2, r5)
            if (r5 != r4) goto L4c
        L4b:
            return r4
        L4c:
            wef r5 = defpackage.wef.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.g54.r(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((g54) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
