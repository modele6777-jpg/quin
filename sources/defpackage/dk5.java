package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class dk5 extends gbe implements l26 {
    final /* synthetic */ xva $$this$produceState;
    final /* synthetic */ pv2 $context;
    final /* synthetic */ wj5 $this_collectAsStateWithLifecycle;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dk5(pv2 pv2Var, wj5 wj5Var, xva xvaVar, xn2 xn2Var) {
        super(2, xn2Var);
        this.$context = pv2Var;
        this.$this_collectAsStateWithLifecycle = wj5Var;
        this.$$this$produceState = xvaVar;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new dk5(this.$context, this.$this_collectAsStateWithLifecycle, this.$$this$produceState, xn2Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0035, code lost:
    
        if (r7.b(r1, r6) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0049, code lost:
    
        if (defpackage.ynb.p0(r7, r3, r6) == r0) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x004b, code lost:
    
        return r0;
     */
    @Override // defpackage.pt0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object r(java.lang.Object r7) {
        /*
            r6 = this;
            int r0 = r6.label
            r1 = 0
            r2 = 2
            r3 = 1
            if (r0 == 0) goto L16
            if (r0 == r3) goto L12
            if (r0 != r2) goto Lc
            goto L12
        Lc:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qc0.p(r6)
            return r1
        L12:
            defpackage.jzb.q(r7)
            goto L4c
        L16:
            defpackage.jzb.q(r7)
            pv2 r7 = r6.$context
            nu4 r0 = defpackage.nu4.a
            boolean r7 = defpackage.pa7.t(r7, r0)
            bw2 r0 = defpackage.bw2.a
            if (r7 == 0) goto L38
            wj5 r7 = r6.$this_collectAsStateWithLifecycle
            bk5 r1 = new bk5
            xva r2 = r6.$$this$produceState
            r4 = 0
            r1.<init>(r2, r4)
            r6.label = r3
            java.lang.Object r6 = r7.b(r1, r6)
            if (r6 != r0) goto L4c
            goto L4b
        L38:
            pv2 r7 = r6.$context
            ck5 r3 = new ck5
            wj5 r4 = r6.$this_collectAsStateWithLifecycle
            xva r5 = r6.$$this$produceState
            r3.<init>(r4, r5, r1)
            r6.label = r2
            java.lang.Object r6 = defpackage.ynb.p0(r7, r3, r6)
            if (r6 != r0) goto L4c
        L4b:
            return r0
        L4c:
            wef r6 = defpackage.wef.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dk5.r(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((dk5) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
