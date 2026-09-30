package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class yw extends gbe implements l26 {
    final /* synthetic */ boolean $consumed;
    final /* synthetic */ long $viewVelocity;
    int label;
    final /* synthetic */ ax this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yw(boolean z, ax axVar, long j, xn2 xn2Var) {
        super(2, xn2Var);
        this.$consumed = z;
        this.this$0 = axVar;
        this.$viewVelocity = j;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new yw(this.$consumed, this.this$0, this.$viewVelocity, xn2Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0031, code lost:
    
        if (r11 == r3) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0046, code lost:
    
        if (r11 == r3) goto L18;
     */
    @Override // defpackage.pt0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object r(java.lang.Object r11) {
        /*
            r10 = this;
            int r0 = r10.label
            r1 = 2
            r2 = 1
            if (r0 == 0) goto L19
            if (r0 == r2) goto L15
            if (r0 != r1) goto Le
            defpackage.jzb.q(r11)
            goto L49
        Le:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qc0.p(r10)
            r10 = 0
            return r10
        L15:
            defpackage.jzb.q(r11)
            goto L34
        L19:
            defpackage.jzb.q(r11)
            boolean r11 = r10.$consumed
            ax r0 = r10.this$0
            bw2 r3 = defpackage.bw2.a
            if (r11 != 0) goto L39
            sc9 r4 = r0.a
            long r7 = r10.$viewVelocity
            r10.label = r2
            r5 = 0
            r9 = r10
            java.lang.Object r11 = r4.a(r5, r7, r9)
            if (r11 != r3) goto L34
            goto L48
        L34:
            zsf r11 = (defpackage.zsf) r11
            long r10 = r11.a
            goto L4d
        L39:
            r9 = r10
            sc9 r4 = r0.a
            long r5 = r9.$viewVelocity
            r9.label = r1
            r7 = 0
            java.lang.Object r11 = r4.a(r5, r7, r9)
            if (r11 != r3) goto L49
        L48:
            return r3
        L49:
            zsf r11 = (defpackage.zsf) r11
            long r10 = r11.a
        L4d:
            wef r10 = defpackage.wef.a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yw.r(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((yw) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
