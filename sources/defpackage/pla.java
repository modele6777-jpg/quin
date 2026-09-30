package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class pla extends gbe implements l26 {
    final /* synthetic */ boolean $afterPurchase;
    final /* synthetic */ long $generation;
    final /* synthetic */ boolean $includeGiftCardGuide;
    final /* synthetic */ boolean $refreshPurchaseQuota;
    int label;
    final /* synthetic */ mma this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pla(boolean z, mma mmaVar, long j, boolean z2, boolean z3, xn2 xn2Var) {
        super(2, xn2Var);
        this.$afterPurchase = z;
        this.this$0 = mmaVar;
        this.$generation = j;
        this.$refreshPurchaseQuota = z2;
        this.$includeGiftCardGuide = z3;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new pla(this.$afterPurchase, this.this$0, this.$generation, this.$refreshPurchaseQuota, this.$includeGiftCardGuide, xn2Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x003c, code lost:
    
        if (r1.p(r6, r9, r8) == r0) goto L21;
     */
    @Override // defpackage.pt0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object r(java.lang.Object r9) {
        /*
            r8 = this;
            bw2 r0 = defpackage.bw2.a
            int r1 = r8.label
            r2 = 0
            r3 = 2
            r4 = 1
            r5 = 0
            if (r1 == 0) goto L1a
            if (r1 == r4) goto Le
            if (r1 != r3) goto L14
        Le:
            defpackage.jzb.q(r9)     // Catch: java.lang.Throwable -> L12
            goto L3f
        L12:
            r9 = move-exception
            goto L5b
        L14:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qc0.p(r8)
            return r2
        L1a:
            defpackage.jzb.q(r9)
            boolean r9 = r8.$afterPurchase     // Catch: java.lang.Throwable -> L12
            mma r1 = r8.this$0
            long r6 = r8.$generation
            if (r9 == 0) goto L32
            boolean r9 = r8.$refreshPurchaseQuota     // Catch: java.lang.Throwable -> L12
            r8.label = r4     // Catch: java.lang.Throwable -> L12
            java.time.ZoneId r3 = defpackage.mma.u1     // Catch: java.lang.Throwable -> L12
            java.lang.Object r9 = r1.r(r6, r9, r8)     // Catch: java.lang.Throwable -> L12
            if (r9 != r0) goto L3f
            goto L3e
        L32:
            boolean r9 = r8.$includeGiftCardGuide     // Catch: java.lang.Throwable -> L12
            r8.label = r3     // Catch: java.lang.Throwable -> L12
            java.time.ZoneId r3 = defpackage.mma.u1     // Catch: java.lang.Throwable -> L12
            java.lang.Object r9 = r1.p(r6, r9, r8)     // Catch: java.lang.Throwable -> L12
            if (r9 != r0) goto L3f
        L3e:
            return r0
        L3f:
            mma r9 = r8.this$0
            java.lang.Object r0 = r9.S0
            long r3 = r8.$generation
            monitor-enter(r0)
            long r6 = r9.T0     // Catch: java.lang.Throwable -> L53
            int r8 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r8 != 0) goto L55
            r9.U0 = r2     // Catch: java.lang.Throwable -> L53
            r9.V0 = r5     // Catch: java.lang.Throwable -> L53
            r9.W0 = r5     // Catch: java.lang.Throwable -> L53
            goto L55
        L53:
            r8 = move-exception
            goto L59
        L55:
            monitor-exit(r0)
            wef r8 = defpackage.wef.a
            return r8
        L59:
            monitor-exit(r0)
            throw r8
        L5b:
            mma r0 = r8.this$0
            java.lang.Object r1 = r0.S0
            long r3 = r8.$generation
            monitor-enter(r1)
            long r6 = r0.T0     // Catch: java.lang.Throwable -> L6f
            int r8 = (r3 > r6 ? 1 : (r3 == r6 ? 0 : -1))
            if (r8 != 0) goto L71
            r0.U0 = r2     // Catch: java.lang.Throwable -> L6f
            r0.V0 = r5     // Catch: java.lang.Throwable -> L6f
            r0.W0 = r5     // Catch: java.lang.Throwable -> L6f
            goto L71
        L6f:
            r8 = move-exception
            goto L73
        L71:
            monitor-exit(r1)
            throw r9
        L73:
            monitor-exit(r1)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pla.r(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((pla) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
