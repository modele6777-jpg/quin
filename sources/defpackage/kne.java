package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class kne extends gbe implements l26 {
    final /* synthetic */ ene $provider;
    Object L$0;
    int label;
    final /* synthetic */ lne this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kne(lne lneVar, ene eneVar, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = lneVar;
        this.$provider = eneVar;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new kne(this.this$0, this.$provider, xn2Var);
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0054  */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x005a, code lost:
    
        if (r7.d(r6) == r5) goto L37;
     */
    @Override // defpackage.pt0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object r(java.lang.Object r7) throws java.lang.Throwable {
        /*
            r6 = this;
            int r0 = r6.label
            r1 = 4
            r2 = 3
            r3 = 2
            r4 = 1
            bw2 r5 = defpackage.bw2.a
            if (r0 == 0) goto L2f
            if (r0 == r4) goto L2b
            if (r0 == r3) goto L25
            if (r0 == r2) goto L21
            if (r0 == r1) goto L19
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qc0.p(r6)
            r6 = 0
            return r6
        L19:
            java.lang.Object r6 = r6.L$0
            java.lang.Throwable r6 = (java.lang.Throwable) r6
            defpackage.jzb.q(r7)
            goto L72
        L21:
            defpackage.jzb.q(r7)
            goto L5d
        L25:
            defpackage.jzb.q(r7)     // Catch: java.lang.Throwable -> L29
            goto L4e
        L29:
            r7 = move-exception
            goto L60
        L2b:
            defpackage.jzb.q(r7)     // Catch: java.lang.Throwable -> L29
            goto L41
        L2f:
            defpackage.jzb.q(r7)
            lne r7 = r6.this$0     // Catch: java.lang.Throwable -> L29
            a26 r7 = r7.G0     // Catch: java.lang.Throwable -> L29
            if (r7 == 0) goto L41
            r6.label = r4     // Catch: java.lang.Throwable -> L29
            java.lang.Object r7 = r7.d(r6)     // Catch: java.lang.Throwable -> L29
            if (r7 != r5) goto L41
            goto L70
        L41:
            ene r7 = r6.$provider     // Catch: java.lang.Throwable -> L29
            lne r0 = r6.this$0     // Catch: java.lang.Throwable -> L29
            r6.label = r3     // Catch: java.lang.Throwable -> L29
            java.lang.Object r7 = r7.a(r0, r6)     // Catch: java.lang.Throwable -> L29
            if (r7 != r5) goto L4e
            goto L70
        L4e:
            lne r7 = r6.this$0
            a26 r7 = r7.H0
            if (r7 == 0) goto L5d
            r6.label = r2
            java.lang.Object r6 = r7.d(r6)
            if (r6 != r5) goto L5d
            goto L70
        L5d:
            wef r6 = defpackage.wef.a
            return r6
        L60:
            lne r0 = r6.this$0
            a26 r0 = r0.H0
            if (r0 == 0) goto L73
            r6.L$0 = r7
            r6.label = r1
            java.lang.Object r6 = r0.d(r6)
            if (r6 != r5) goto L71
        L70:
            return r5
        L71:
            r6 = r7
        L72:
            r7 = r6
        L73:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kne.r(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((kne) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
