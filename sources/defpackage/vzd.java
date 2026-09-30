package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class vzd extends gbe implements n26 {
    /* synthetic */ int I$0;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ xzd this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vzd(xzd xzdVar, xn2 xn2Var) {
        super(3, xn2Var);
        this.this$0 = xzdVar;
    }

    @Override // defpackage.n26
    public final Object m(Object obj, Object obj2, Object obj3) {
        int iIntValue = ((Number) obj2).intValue();
        vzd vzdVar = new vzd(this.this$0, (xn2) obj3);
        vzdVar.L$0 = (xj5) obj;
        vzdVar.I$0 = iIntValue;
        return vzdVar.r(wef.a);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0062  */
    /* JADX WARN: Code duplicated, block: B:29:0x0071  */
    /* JADX WARN: Code duplicated, block: B:32:0x0082  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0044, code lost:
    
        if (r0.a(defpackage.led.a, r12) == r9) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x008e, code lost:
    
        if (r0.a(defpackage.led.c, r12) == r9) goto L34;
     */
    @Override // defpackage.pt0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object r(java.lang.Object r13) {
        /*
            r12 = this;
            java.lang.Object r0 = r12.L$0
            xj5 r0 = (defpackage.xj5) r0
            int r1 = r12.I$0
            int r2 = r12.label
            r3 = 0
            r4 = 5
            r5 = 4
            r6 = 3
            r7 = 2
            r8 = 1
            bw2 r9 = defpackage.bw2.a
            if (r2 == 0) goto L33
            if (r2 == r8) goto L2f
            if (r2 == r7) goto L2b
            if (r2 == r6) goto L27
            if (r2 == r5) goto L23
            if (r2 != r4) goto L1d
            goto L2f
        L1d:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qc0.p(r12)
            return r3
        L23:
            defpackage.jzb.q(r13)
            goto L82
        L27:
            defpackage.jzb.q(r13)
            goto L71
        L2b:
            defpackage.jzb.q(r13)
            goto L58
        L2f:
            defpackage.jzb.q(r13)
            goto L91
        L33:
            defpackage.jzb.q(r13)
            if (r1 <= 0) goto L47
            r12.L$0 = r3
            r12.I$0 = r1
            r12.label = r8
            led r13 = defpackage.led.a
            java.lang.Object r12 = r0.a(r13, r12)
            if (r12 != r9) goto L91
            goto L90
        L47:
            xzd r13 = r12.this$0
            long r10 = r13.a
            r12.L$0 = r0
            r12.I$0 = r1
            r12.label = r7
            java.lang.Object r13 = defpackage.vfh.q(r10, r12)
            if (r13 != r9) goto L58
            goto L90
        L58:
            xzd r13 = r12.this$0
            long r7 = r13.b
            r10 = 0
            int r13 = (r7 > r10 ? 1 : (r7 == r10 ? 0 : -1))
            if (r13 <= 0) goto L82
            r12.L$0 = r0
            r12.I$0 = r1
            r12.label = r6
            led r13 = defpackage.led.b
            java.lang.Object r13 = r0.a(r13, r12)
            if (r13 != r9) goto L71
            goto L90
        L71:
            xzd r13 = r12.this$0
            long r6 = r13.b
            r12.L$0 = r0
            r12.I$0 = r1
            r12.label = r5
            java.lang.Object r13 = defpackage.vfh.q(r6, r12)
            if (r13 != r9) goto L82
            goto L90
        L82:
            r12.L$0 = r3
            r12.I$0 = r1
            r12.label = r4
            led r13 = defpackage.led.c
            java.lang.Object r12 = r0.a(r13, r12)
            if (r12 != r9) goto L91
        L90:
            return r9
        L91:
            wef r12 = defpackage.wef.a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vzd.r(java.lang.Object):java.lang.Object");
    }
}
