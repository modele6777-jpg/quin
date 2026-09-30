package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class j9d extends gbe implements l26 {
    final /* synthetic */ x16 $onReadyToClose;
    final /* synthetic */ String $operationId;
    Object L$0;
    int label;
    final /* synthetic */ bad this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j9d(bad badVar, String str, x16 x16Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = badVar;
        this.$operationId = str;
        this.$onReadyToClose = x16Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new j9d(this.this$0, this.$operationId, this.$onReadyToClose, xn2Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x004e, code lost:
    
        if (r0.b(r6, r2, r5) == r4) goto L26;
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
            if (r0 == 0) goto L21
            if (r0 == r2) goto L1d
            if (r0 != r1) goto L17
            java.lang.Object r0 = r5.L$0
            e95 r0 = (defpackage.e95) r0
            defpackage.jzb.q(r6)     // Catch: java.lang.Throwable -> L15
            goto L51
        L15:
            r6 = move-exception
            goto L5d
        L17:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qc0.p(r5)
            return r3
        L1d:
            defpackage.jzb.q(r6)     // Catch: java.lang.Throwable -> L15
            goto L31
        L21:
            defpackage.jzb.q(r6)
            bad r6 = r5.this$0     // Catch: java.lang.Throwable -> L15
            java.lang.String r0 = r5.$operationId     // Catch: java.lang.Throwable -> L15
            r5.label = r2     // Catch: java.lang.Throwable -> L15
            java.lang.Object r6 = r6.k(r0, r5)     // Catch: java.lang.Throwable -> L15
            if (r6 != r4) goto L31
            goto L50
        L31:
            e95 r6 = (defpackage.e95) r6     // Catch: java.lang.Throwable -> L15
            bad r0 = r5.this$0     // Catch: java.lang.Throwable -> L15
            java.lang.String r2 = r5.$operationId     // Catch: java.lang.Throwable -> L15
            r0.i(r2)     // Catch: java.lang.Throwable -> L15
            if (r6 == 0) goto L3f
            java.lang.String r0 = r6.h     // Catch: java.lang.Throwable -> L15
            goto L40
        L3f:
            r0 = r3
        L40:
            if (r0 == 0) goto L51
            bad r0 = r5.this$0     // Catch: java.lang.Throwable -> L15
            dbd r2 = defpackage.dbd.b     // Catch: java.lang.Throwable -> L15
            r5.L$0 = r3     // Catch: java.lang.Throwable -> L15
            r5.label = r1     // Catch: java.lang.Throwable -> L15
            java.lang.Object r6 = r0.b(r6, r2, r5)     // Catch: java.lang.Throwable -> L15
            if (r6 != r4) goto L51
        L50:
            return r4
        L51:
            x16 r6 = r5.$onReadyToClose     // Catch: java.lang.Throwable -> L15
            r6.invoke()     // Catch: java.lang.Throwable -> L15
            bad r5 = r5.this$0
            r5.p = r3
            wef r5 = defpackage.wef.a
            return r5
        L5d:
            bad r5 = r5.this$0
            r5.p = r3
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j9d.r(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((j9d) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
