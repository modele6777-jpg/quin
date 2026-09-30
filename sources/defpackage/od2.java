package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class od2 extends gbe implements l26 {
    Object L$0;
    Object L$1;
    int label;

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new od2(2, xn2Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0051, code lost:
    
        if (defpackage.bsa.n(r6, r0, r5) == r4) goto L15;
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
            r1 = 2
            r2 = 1
            r3 = 0
            bw2 r4 = defpackage.bw2.a
            if (r0 == 0) goto L2b
            if (r0 == r2) goto L1f
            if (r0 != r1) goto L19
            java.lang.Object r0 = r5.L$1
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            java.lang.Object r5 = r5.L$0
            hs3 r5 = (defpackage.hs3) r5
            defpackage.jzb.q(r6)
            goto L54
        L19:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qc0.p(r5)
            return r3
        L1f:
            java.lang.Object r0 = r5.L$1
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            java.lang.Object r0 = r5.L$0
            hs3 r0 = (defpackage.hs3) r0
            defpackage.jzb.q(r6)
            goto L41
        L2b:
            defpackage.jzb.q(r6)
            hs3 r6 = defpackage.xqa.P0
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            isa r6 = r6.a
            r5.L$0 = r3
            r5.L$1 = r3
            r5.label = r2
            java.lang.Object r6 = defpackage.bsa.n(r6, r0, r5)
            if (r6 != r4) goto L41
            goto L53
        L41:
            hs3 r6 = defpackage.xqa.Q0
            java.lang.Boolean r0 = java.lang.Boolean.TRUE
            isa r6 = r6.a
            r5.L$0 = r3
            r5.L$1 = r3
            r5.label = r1
            java.lang.Object r5 = defpackage.bsa.n(r6, r0, r5)
            if (r5 != r4) goto L54
        L53:
            return r4
        L54:
            wef r5 = defpackage.wef.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.od2.r(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((od2) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
