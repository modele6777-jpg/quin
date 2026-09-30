package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class pj3 extends gbe implements l26 {
    final /* synthetic */ e89 $boxExitRequested$delegate;
    final /* synthetic */ e89 $phase$delegate;
    final /* synthetic */ jx $titleDropAnim;
    final /* synthetic */ float $titleDropTargetPx;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pj3(jx jxVar, float f, e89 e89Var, e89 e89Var2, xn2 xn2Var) {
        super(2, xn2Var);
        this.$titleDropAnim = jxVar;
        this.$titleDropTargetPx = f;
        this.$phase$delegate = e89Var;
        this.$boxExitRequested$delegate = e89Var2;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new pj3(this.$titleDropAnim, this.$titleDropTargetPx, this.$phase$delegate, this.$boxExitRequested$delegate, xn2Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0060, code lost:
    
        if (defpackage.jx.b(r7, r8, r9, null, null, r14, 12) == r6) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x007b, code lost:
    
        if (defpackage.jx.b(r7, r8, r9, null, null, r14, 12) == r6) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x007d, code lost:
    
        return r6;
     */
    @Override // defpackage.pt0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object r(java.lang.Object r15) {
        /*
            r14 = this;
            int r0 = r14.label
            r1 = 2
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L15
            if (r0 == r2) goto Lb
            if (r0 != r1) goto Lf
        Lb:
            defpackage.jzb.q(r15)
            goto L7e
        Lf:
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qc0.p(r14)
            return r3
        L15:
            defpackage.jzb.q(r15)
            e89 r15 = r14.$phase$delegate
            float r0 = defpackage.xj3.e
            java.lang.Object r15 = r15.getValue()
            xh3 r15 = (defpackage.xh3) r15
            xh3 r0 = defpackage.xh3.a
            r4 = 6
            r5 = 0
            bw2 r6 = defpackage.bw2.a
            if (r15 == r0) goto L38
            e89 r15 = r14.$boxExitRequested$delegate
            java.lang.Object r15 = r15.getValue()
            java.lang.Boolean r15 = (java.lang.Boolean) r15
            boolean r15 = r15.booleanValue()
            if (r15 == 0) goto L3a
        L38:
            r12 = r14
            goto L63
        L3a:
            e89 r15 = r14.$phase$delegate
            java.lang.Object r15 = r15.getValue()
            xh3 r15 = (defpackage.xh3) r15
            xh3 r0 = defpackage.xh3.b
            if (r15 != r0) goto L7e
            jx r7 = r14.$titleDropAnim
            float r15 = r14.$titleDropTargetPx
            java.lang.Float r8 = new java.lang.Float
            r8.<init>(r15)
            r15 = 220(0xdc, float:3.08E-43)
            x6f r9 = defpackage.b21.T(r15, r5, r3, r4)
            r14.label = r1
            r10 = 0
            r11 = 0
            r13 = 12
            r12 = r14
            java.lang.Object r14 = defpackage.jx.b(r7, r8, r9, r10, r11, r12, r13)
            if (r14 != r6) goto L7e
            goto L7d
        L63:
            jx r7 = r12.$titleDropAnim
            java.lang.Float r8 = new java.lang.Float
            r14 = 0
            r8.<init>(r14)
            r14 = 100
            x6f r9 = defpackage.b21.T(r14, r5, r3, r4)
            r12.label = r2
            r10 = 0
            r11 = 0
            r13 = 12
            java.lang.Object r14 = defpackage.jx.b(r7, r8, r9, r10, r11, r12, r13)
            if (r14 != r6) goto L7e
        L7d:
            return r6
        L7e:
            wef r14 = defpackage.wef.a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pj3.r(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((pj3) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
