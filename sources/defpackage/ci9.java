package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ci9 extends gbe implements l26 {
    final /* synthetic */ o9 $accountProfileRepository;
    final /* synthetic */ gpf $userRequester;
    int I$0;
    Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ci9(gpf gpfVar, o9 o9Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.$userRequester = gpfVar;
        this.$accountProfileRepository = o9Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new ci9(this.$userRequester, this.$accountProfileRepository, xn2Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0061, code lost:
    
        if (r0 == r15) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0084, code lost:
    
        if (defpackage.o9.i(r1, r1, null, null, r4, 6) == r15) goto L29;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2 */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v3, types: [int] */
    @Override // defpackage.pt0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object r(java.lang.Object r17) {
        /*
            r16 = this;
            r4 = r16
            int r0 = r4.label
            r13 = 3
            r1 = 2
            r2 = 1
            r14 = 0
            bw2 r15 = defpackage.bw2.a
            if (r0 == 0) goto L2f
            if (r0 == r2) goto L23
            if (r0 == r1) goto L1d
            if (r0 != r13) goto L17
            defpackage.jzb.q(r17)
            goto L87
        L17:
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qc0.p(r0)
            return r14
        L1d:
            defpackage.jzb.q(r17)     // Catch: java.lang.Exception -> L6c java.util.concurrent.CancellationException -> L8a
            r0 = r17
            goto L64
        L23:
            java.lang.Object r0 = r4.L$1
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            java.lang.Object r0 = r4.L$0
            hs3 r0 = (defpackage.hs3) r0
            defpackage.jzb.q(r17)
            goto L45
        L2f:
            defpackage.jzb.q(r17)
            hs3 r0 = defpackage.xqa.W0
            java.lang.Boolean r3 = java.lang.Boolean.TRUE
            isa r0 = r0.a
            r4.L$0 = r14
            r4.L$1 = r14
            r4.label = r2
            java.lang.Object r0 = defpackage.bsa.n(r0, r3, r4)
            if (r0 != r15) goto L45
            goto L86
        L45:
            gpf r0 = r4.$userRequester     // Catch: java.lang.Exception -> L6c java.util.concurrent.CancellationException -> L8a
            java.lang.Boolean r7 = java.lang.Boolean.FALSE     // Catch: java.lang.Exception -> L6c java.util.concurrent.CancellationException -> L8a
            r4.L$0 = r14     // Catch: java.lang.Exception -> L6c java.util.concurrent.CancellationException -> L8a
            r4.L$1 = r14     // Catch: java.lang.Exception -> L6c java.util.concurrent.CancellationException -> L8a
            r4.label = r1     // Catch: java.lang.Exception -> L6c java.util.concurrent.CancellationException -> L8a
            r1 = 0
            r2 = 0
            r3 = 0
            r4 = 0
            r5 = 0
            r6 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r12 = 7679(0x1dff, float:1.076E-41)
            r11 = r16
            java.lang.Object r0 = defpackage.gpf.a(r0, r1, r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)     // Catch: java.lang.Exception -> L6b java.util.concurrent.CancellationException -> L8a
            r4 = r11
            if (r0 != r15) goto L64
            goto L86
        L64:
            java.lang.Boolean r0 = (java.lang.Boolean) r0     // Catch: java.lang.Exception -> L6c java.util.concurrent.CancellationException -> L8a
            boolean r0 = r0.booleanValue()     // Catch: java.lang.Exception -> L6c java.util.concurrent.CancellationException -> L8a
            goto L6d
        L6b:
            r4 = r11
        L6c:
            r0 = 0
        L6d:
            if (r0 == 0) goto L87
            o9 r1 = r4.$accountProfileRepository
            r2 = r1
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r4.L$0 = r14
            r4.L$1 = r14
            r4.I$0 = r0
            r4.label = r13
            r0 = r2
            r2 = 0
            r3 = 0
            r5 = 6
            java.lang.Object r0 = defpackage.o9.i(r0, r1, r2, r3, r4, r5)
            if (r0 != r15) goto L87
        L86:
            return r15
        L87:
            wef r0 = defpackage.wef.a
            return r0
        L8a:
            r0 = move-exception
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ci9.r(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((ci9) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
