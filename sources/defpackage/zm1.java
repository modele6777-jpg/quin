package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class zm1 extends gbe implements l26 {
    final /* synthetic */ int $captureMode$inlined;
    final /* synthetic */ la1 $completer;
    final /* synthetic */ int $flashMode$inlined;
    final /* synthetic */ int $flashType$inlined;
    Object L$0;
    int label;
    final /* synthetic */ xn1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zm1(la1 la1Var, xn2 xn2Var, xn1 xn1Var, int i, int i2, int i3) {
        super(2, xn2Var);
        this.$completer = la1Var;
        this.this$0 = xn1Var;
        this.$captureMode$inlined = i;
        this.$flashMode$inlined = i2;
        this.$flashType$inlined = i3;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new zm1(this.$completer, xn2Var, this.this$0, this.$captureMode$inlined, this.$flashMode$inlined, this.$flashType$inlined);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0052, code lost:
    
        if (defpackage.pa7.X((java.util.Collection) r14, r11) == r4) goto L16;
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
            r1 = 0
            r2 = 2
            r3 = 1
            bw2 r4 = defpackage.bw2.a
            if (r0 == 0) goto L25
            if (r0 == r3) goto L1b
            if (r0 != r2) goto L15
            java.lang.Object r13 = r13.L$0
            la1 r13 = (defpackage.la1) r13
            defpackage.jzb.q(r14)
            goto L55
        L15:
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qc0.p(r13)
            return r1
        L1b:
            java.lang.Object r0 = r13.L$0
            la1 r0 = (defpackage.la1) r0
            defpackage.jzb.q(r14)
            r11 = r13
            r13 = r0
            goto L48
        L25:
            defpackage.jzb.q(r14)
            la1 r14 = r13.$completer
            xn1 r5 = r13.this$0
            sm1 r0 = defpackage.sm1.c
            java.util.List r6 = defpackage.t72.H(r0)
            int r7 = r13.$captureMode$inlined
            int r8 = r13.$flashMode$inlined
            int r9 = r13.$flashType$inlined
            r13.L$0 = r14
            r13.label = r3
            r10 = 0
            r11 = r13
            java.lang.Object r13 = r5.h(r6, r7, r8, r9, r10, r11)
            if (r13 != r4) goto L45
            goto L54
        L45:
            r12 = r14
            r14 = r13
            r13 = r12
        L48:
            java.util.Collection r14 = (java.util.Collection) r14
            r11.L$0 = r13
            r11.label = r2
            java.lang.Object r14 = defpackage.pa7.X(r14, r11)
            if (r14 != r4) goto L55
        L54:
            return r4
        L55:
            r13.b(r1)
            wef r13 = defpackage.wef.a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zm1.r(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((zm1) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
