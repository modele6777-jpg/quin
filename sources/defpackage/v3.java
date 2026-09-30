package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class v3 extends gbe implements l26 {
    final /* synthetic */ njd $this_load;
    Object L$0;
    int label;
    final /* synthetic */ g4 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v3(g4 g4Var, xn2 xn2Var, njd njdVar) {
        super(2, xn2Var);
        this.this$0 = g4Var;
        this.$this_load = njdVar;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new v3(this.this$0, xn2Var, this.$this_load);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0049, code lost:
    
        if (r1 == r4) goto L15;
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
            wef r1 = defpackage.wef.a
            r2 = 2
            r3 = 1
            bw2 r4 = defpackage.bw2.a
            if (r0 == 0) goto L21
            if (r0 == r3) goto L1d
            if (r0 != r2) goto L16
            java.lang.Object r0 = r5.L$0
            java.lang.String r0 = (java.lang.String) r0
            defpackage.jzb.q(r6)
            goto L4c
        L16:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qc0.p(r5)
            r5 = 0
            return r5
        L1d:
            defpackage.jzb.q(r6)
            goto L2f
        L21:
            defpackage.jzb.q(r6)
            g4 r6 = r5.this$0
            r5.label = r3
            java.lang.Object r6 = r6.i(r5)
            if (r6 != r4) goto L2f
            goto L4b
        L2f:
            g4 r6 = r5.this$0
            t7 r6 = r6.d
            mo3 r6 = (defpackage.mo3) r6
            java.lang.String r0 = r6.a()
            g4 r6 = r5.this$0
            r6.g = r0
            njd r3 = r5.$this_load
            r6.l()
            r5.L$0 = r0
            r5.label = r2
            r3.getClass()
            if (r1 != r4) goto L4c
        L4b:
            return r4
        L4c:
            njd r6 = r5.$this_load
            g4 r5 = r5.this$0
            hwa r5 = r5.e
            net.xmind.donut.gp.GooglePay r6 = (net.xmind.donut.gp.GooglePay) r6
            r6.h(r0, r5)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.v3.r(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((v3) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
