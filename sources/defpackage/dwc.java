package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class dwc extends czb implements l26 {
    final /* synthetic */ x16 $block;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ fwc this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dwc(fwc fwcVar, x16 x16Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = fwcVar;
        this.$block = x16Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        dwc dwcVar = new dwc(this.this$0, this.$block, xn2Var);
        dwcVar.L$0 = obj;
        return dwcVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0042, code lost:
    
        if (r6 == r4) goto L15;
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
            if (r0 == 0) goto L1f
            if (r0 == r3) goto L17
            if (r0 != r2) goto L11
            defpackage.jzb.q(r6)
            goto L45
        L11:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qc0.p(r5)
            return r1
        L17:
            java.lang.Object r0 = r5.L$0
            mbe r0 = (defpackage.mbe) r0
            defpackage.jzb.q(r6)
            goto L36
        L1f:
            defpackage.jzb.q(r6)
            java.lang.Object r6 = r5.L$0
            r0 = r6
            mbe r0 = (defpackage.mbe) r0
            r5.L$0 = r0
            r5.label = r3
            dee r6 = defpackage.ffe.a
            iia r6 = defpackage.iia.b
            java.lang.Object r6 = defpackage.ffe.c(r0, r6, r5)
            if (r6 != r4) goto L36
            goto L44
        L36:
            oia r6 = (defpackage.oia) r6
            r5.L$0 = r1
            r5.label = r2
            iia r1 = defpackage.iia.a
            java.lang.Object r6 = defpackage.rk4.a(r0, r6, r1, r5)
            if (r6 != r4) goto L45
        L44:
            return r4
        L45:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 != 0) goto L5b
            fwc r6 = r5.this$0
            sg6 r6 = r6.i()
            if (r6 == 0) goto L56
            goto L5b
        L56:
            x16 r5 = r5.$block
            r5.invoke()
        L5b:
            wef r5 = defpackage.wef.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dwc.r(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((dwc) k((xn2) obj2, (mbe) obj)).r(wef.a);
    }
}
