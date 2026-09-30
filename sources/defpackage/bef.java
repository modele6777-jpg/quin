package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class bef extends gbe implements l26 {
    final /* synthetic */ s69 $expandedScrollOffset$delegate;
    final /* synthetic */ ghc $scrollState;
    final /* synthetic */ boolean $zoomedOut;
    int I$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bef(boolean z, ghc ghcVar, s69 s69Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.$zoomedOut = z;
        this.$scrollState = ghcVar;
        this.$expandedScrollOffset$delegate = s69Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new bef(this.$zoomedOut, this.$scrollState, this.$expandedScrollOffset$delegate, xn2Var);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0072  */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0037, code lost:
    
        if (defpackage.eb3.S(r7, 0 - r7.a.j(), r6) == r5) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0083, code lost:
    
        if (defpackage.eb3.S(r0, r1 - r0.a.j(), r6) == r5) goto L27;
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
            r2 = 3
            r3 = 2
            r4 = 1
            bw2 r5 = defpackage.bw2.a
            if (r0 == 0) goto L1f
            if (r0 == r4) goto L1b
            if (r0 == r3) goto L17
            if (r0 != r2) goto L11
            goto L1b
        L11:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qc0.p(r6)
            return r1
        L17:
            defpackage.jzb.q(r7)
            goto L60
        L1b:
            defpackage.jzb.q(r7)
            goto L86
        L1f:
            defpackage.jzb.q(r7)
            boolean r7 = r6.$zoomedOut
            if (r7 == 0) goto L3a
            ghc r7 = r6.$scrollState
            r6.label = r4
            sz9 r0 = r7.a
            int r0 = r0.j()
            int r0 = 0 - r0
            float r0 = (float) r0
            java.lang.Object r6 = defpackage.eb3.S(r7, r0, r6)
            if (r6 != r5) goto L86
            goto L85
        L3a:
            s69 r7 = r6.$expandedScrollOffset$delegate
            sz9 r7 = (defpackage.sz9) r7
            int r7 = r7.j()
            if (r7 <= 0) goto L86
            ghc r7 = r6.$scrollState
            xc2 r0 = new xc2
            r4 = 4
            r0.<init>(r7, r4)
            ybc r7 = defpackage.jzb.p(r0)
            aef r0 = new aef
            s69 r4 = r6.$expandedScrollOffset$delegate
            r0.<init>(r4, r1)
            r6.label = r3
            java.lang.Object r7 = defpackage.tm7.C(r7, r0, r6)
            if (r7 != r5) goto L60
            goto L85
        L60:
            java.lang.Number r7 = (java.lang.Number) r7
            int r7 = r7.intValue()
            ghc r0 = r6.$scrollState
            s69 r1 = r6.$expandedScrollOffset$delegate
            sz9 r1 = (defpackage.sz9) r1
            int r1 = r1.j()
            if (r1 <= r7) goto L73
            r1 = r7
        L73:
            r6.I$0 = r7
            r6.label = r2
            sz9 r7 = r0.a
            int r7 = r7.j()
            int r1 = r1 - r7
            float r7 = (float) r1
            java.lang.Object r6 = defpackage.eb3.S(r0, r7, r6)
            if (r6 != r5) goto L86
        L85:
            return r5
        L86:
            wef r6 = defpackage.wef.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bef.r(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((bef) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
