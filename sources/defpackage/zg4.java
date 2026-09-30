package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class zg4 extends gbe implements l26 {
    final /* synthetic */ yx9 $carouselPagerState;
    final /* synthetic */ ghc $scrollState;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zg4(yx9 yx9Var, ghc ghcVar, xn2 xn2Var) {
        super(2, xn2Var);
        this.$carouselPagerState = yx9Var;
        this.$scrollState = ghcVar;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new zg4(this.$carouselPagerState, this.$scrollState, xn2Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003d, code lost:
    
        if (defpackage.ghc.f(r5, 0, r4) == r3) goto L15;
     */
    @Override // defpackage.pt0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object r(java.lang.Object r5) {
        /*
            r4 = this;
            int r0 = r4.label
            r1 = 2
            r2 = 1
            bw2 r3 = defpackage.bw2.a
            if (r0 == 0) goto L1b
            if (r0 == r2) goto L17
            if (r0 != r1) goto L10
            defpackage.jzb.q(r5)
            goto L40
        L10:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qc0.p(r4)
            r4 = 0
            return r4
        L17:
            defpackage.jzb.q(r5)
            goto L34
        L1b:
            defpackage.jzb.q(r5)
            yx9 r5 = r4.$carouselPagerState
            hzc r0 = r5.d
            java.lang.Object r0 = r0.c
            sz9 r0 = (defpackage.sz9) r0
            int r0 = r0.j()
            int r0 = r0 + r2
            r4.label = r2
            java.lang.Object r5 = defpackage.yx9.g(r5, r0, r4)
            if (r5 != r3) goto L34
            goto L3f
        L34:
            ghc r5 = r4.$scrollState
            r4.label = r1
            r0 = 0
            java.lang.Object r4 = defpackage.ghc.f(r5, r0, r4)
            if (r4 != r3) goto L40
        L3f:
            return r3
        L40:
            wef r4 = defpackage.wef.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zg4.r(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((zg4) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
