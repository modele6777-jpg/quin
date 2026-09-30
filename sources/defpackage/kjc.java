package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class kjc extends gbe implements l26 {
    final /* synthetic */ et1 $cardReturnPhase;
    final /* synthetic */ Integer $choiceIndex;
    final /* synthetic */ h0e $onCardReturnFinished$delegate;
    final /* synthetic */ Integer $returningCardIndex;
    final /* synthetic */ jx $slideOutProgress;
    final /* synthetic */ e89 $slidingOutIndex$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kjc(et1 et1Var, Integer num, jx jxVar, Integer num2, e89 e89Var, h0e h0eVar, xn2 xn2Var) {
        super(2, xn2Var);
        this.$cardReturnPhase = et1Var;
        this.$returningCardIndex = num;
        this.$slideOutProgress = jxVar;
        this.$choiceIndex = num2;
        this.$slidingOutIndex$delegate = e89Var;
        this.$onCardReturnFinished$delegate = h0eVar;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new kjc(this.$cardReturnPhase, this.$returningCardIndex, this.$slideOutProgress, this.$choiceIndex, this.$slidingOutIndex$delegate, this.$onCardReturnFinished$delegate, xn2Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0052, code lost:
    
        if (defpackage.jx.b(r6, r7, r8, null, null, r11, 12) == r5) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x008d, code lost:
    
        if (r13.g(r13, r14) == r5) goto L28;
     */
    @Override // defpackage.pt0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object r(java.lang.Object r14) {
        /*
            r13 = this;
            int r0 = r13.label
            r1 = 1
            r2 = 0
            r3 = 2
            if (r0 == 0) goto L1b
            if (r0 == r1) goto L16
            if (r0 != r3) goto L10
            defpackage.jzb.q(r14)
            goto L90
        L10:
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qc0.p(r13)
            return r2
        L16:
            defpackage.jzb.q(r14)
            r11 = r13
            goto L55
        L1b:
            defpackage.jzb.q(r14)
            et1 r14 = r13.$cardReturnPhase
            et1 r0 = defpackage.et1.b
            r4 = 0
            bw2 r5 = defpackage.bw2.a
            if (r14 != r0) goto L68
            java.lang.Integer r14 = r13.$returningCardIndex
            e89 r0 = r13.$slidingOutIndex$delegate
            java.lang.Object r0 = r0.getValue()
            java.lang.Integer r0 = (java.lang.Integer) r0
            boolean r14 = defpackage.pa7.t(r14, r0)
            if (r14 == 0) goto L68
            jx r6 = r13.$slideOutProgress
            java.lang.Float r7 = new java.lang.Float
            r7.<init>(r4)
            r14 = 0
            q03 r0 = defpackage.hs4.a
            r4 = 600(0x258, float:8.41E-43)
            x6f r8 = defpackage.b21.T(r4, r14, r0, r3)
            r13.label = r1
            r9 = 0
            r10 = 0
            r12 = 12
            r11 = r13
            java.lang.Object r13 = defpackage.jx.b(r6, r7, r8, r9, r10, r11, r12)
            if (r13 != r5) goto L55
            goto L8f
        L55:
            e89 r13 = r11.$slidingOutIndex$delegate
            r13.setValue(r2)
            h0e r13 = r11.$onCardReturnFinished$delegate
            java.lang.Object r13 = r13.getValue()
            x16 r13 = (defpackage.x16) r13
            if (r13 == 0) goto L90
            r13.invoke()
            goto L90
        L68:
            r11 = r13
            java.lang.Integer r13 = r11.$choiceIndex
            if (r13 != 0) goto L90
            java.lang.Integer r13 = r11.$returningCardIndex
            if (r13 != 0) goto L90
            e89 r13 = r11.$slidingOutIndex$delegate
            java.lang.Object r13 = r13.getValue()
            java.lang.Integer r13 = (java.lang.Integer) r13
            if (r13 == 0) goto L90
            e89 r13 = r11.$slidingOutIndex$delegate
            r13.setValue(r2)
            jx r13 = r11.$slideOutProgress
            java.lang.Float r14 = new java.lang.Float
            r14.<init>(r4)
            r11.label = r3
            java.lang.Object r13 = r13.g(r11, r14)
            if (r13 != r5) goto L90
        L8f:
            return r5
        L90:
            wef r13 = defpackage.wef.a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kjc.r(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((kjc) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
