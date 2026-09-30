package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class z54 extends gbe implements l26 {
    final /* synthetic */ kmd $fileResolver;
    final /* synthetic */ xof $userProfileDatasource;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z54(xof xofVar, kmd kmdVar, xn2 xn2Var) {
        super(2, xn2Var);
        this.$userProfileDatasource = xofVar;
        this.$fileResolver = kmdVar;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new z54(this.$userProfileDatasource, this.$fileResolver, xn2Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003d, code lost:
    
        if (r6.j(r0, r5) == r4) goto L15;
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
            r1 = 0
            r2 = 2
            r3 = 1
            bw2 r4 = defpackage.bw2.a
            if (r0 == 0) goto L1b
            if (r0 == r3) goto L17
            if (r0 != r2) goto L11
            defpackage.jzb.q(r6)
            goto L40
        L11:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qc0.p(r5)
            return r1
        L17:
            defpackage.jzb.q(r6)
            goto L2f
        L1b:
            defpackage.jzb.q(r6)
            xof r6 = r5.$userProfileDatasource
            ai.askquin.model.TarotSkinIdentify r0 = ai.askquin.model.TarotSkinIdentify.Midnight
            n2f r0 = r0.getKey()
            r5.label = r3
            java.lang.Object r6 = r6.a(r0, r5)
            if (r6 != r4) goto L2f
            goto L3f
        L2f:
            xof r6 = r5.$userProfileDatasource
            ai.askquin.model.TarotSkinIdentify r0 = ai.askquin.model.TarotSkinIdentify.Midnight
            n2f r0 = r0.getKey()
            r5.label = r2
            java.lang.Object r6 = r6.j(r0, r5)
            if (r6 != r4) goto L40
        L3f:
            return r4
        L40:
            kmd r5 = r5.$fileResolver
            ai.askquin.model.TarotSkinIdentify r6 = ai.askquin.model.TarotSkinIdentify.Midnight
            boolean r5 = r5.b(r6)
            y54 r6 = new y54
            r6.<init>(r5, r1)
            defpackage.lw2.a(r6)
            wef r5 = defpackage.wef.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z54.r(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((z54) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
