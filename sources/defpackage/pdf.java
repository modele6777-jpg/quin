package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class pdf extends gbe implements l26 {
    final /* synthetic */ e89 $captureReady$delegate;
    final /* synthetic */ boolean $sheetSettled;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pdf(boolean z, e89 e89Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.$sheetSettled = z;
        this.$captureReady$delegate = e89Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new pdf(this.$sheetSettled, this.$captureReady$delegate, xn2Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x005e, code lost:
    
        if (defpackage.tm7.J(getContext()).g0(r5, r6) == r4) goto L20;
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
            if (r0 == 0) goto L1d
            if (r0 == r3) goto L19
            if (r0 != r2) goto L12
            defpackage.jzb.q(r6)
            goto L61
        L12:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qc0.p(r5)
            r5 = 0
            return r5
        L19:
            defpackage.jzb.q(r6)
            goto L4a
        L1d:
            defpackage.jzb.q(r6)
            boolean r6 = r5.$sheetSettled
            if (r6 == 0) goto L68
            e89 r6 = r5.$captureReady$delegate
            java.lang.Object r6 = r6.getValue()
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L33
            goto L68
        L33:
            k8f r6 = new k8f
            r0 = 6
            r6.<init>(r0)
            r5.label = r3
            pv2 r0 = r5.getContext()
            z09 r0 = defpackage.tm7.J(r0)
            java.lang.Object r6 = r0.g0(r5, r6)
            if (r6 != r4) goto L4a
            goto L60
        L4a:
            k8f r6 = new k8f
            r0 = 7
            r6.<init>(r0)
            r5.label = r2
            pv2 r0 = r5.getContext()
            z09 r0 = defpackage.tm7.J(r0)
            java.lang.Object r6 = r0.g0(r5, r6)
            if (r6 != r4) goto L61
        L60:
            return r4
        L61:
            e89 r5 = r5.$captureReady$delegate
            java.lang.Boolean r6 = java.lang.Boolean.TRUE
            r5.setValue(r6)
        L68:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.pdf.r(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((pdf) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
