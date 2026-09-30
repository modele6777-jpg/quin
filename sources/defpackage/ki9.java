package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ki9 extends gbe implements l26 {
    int label;

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new ki9(2, xn2Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003a, code lost:
    
        if (defpackage.bsa.p(3, new defpackage.ie2(28), r5) == r4) goto L15;
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
            r1 = 28
            r2 = 2
            r3 = 1
            bw2 r4 = defpackage.bw2.a
            if (r0 == 0) goto L1d
            if (r0 == r3) goto L19
            if (r0 != r2) goto L12
            defpackage.jzb.q(r6)
            goto L3d
        L12:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qc0.p(r5)
            r5 = 0
            return r5
        L19:
            defpackage.jzb.q(r6)
            goto L2e
        L1d:
            defpackage.jzb.q(r6)
            r5.label = r3
            ie2 r6 = new ie2
            r6.<init>(r1)
            java.lang.Object r6 = defpackage.bsa.p(r3, r6, r5)
            if (r6 != r4) goto L2e
            goto L3c
        L2e:
            r5.label = r2
            ie2 r6 = new ie2
            r6.<init>(r1)
            r0 = 3
            java.lang.Object r5 = defpackage.bsa.p(r0, r6, r5)
            if (r5 != r4) goto L3d
        L3c:
            return r4
        L3d:
            wef r5 = defpackage.wef.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ki9.r(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((ki9) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
