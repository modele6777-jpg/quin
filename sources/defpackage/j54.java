package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class j54 extends gbe implements l26 {
    Object L$0;
    Object L$1;
    int label;

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new j54(2, xn2Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x004f, code lost:
    
        if (defpackage.bsa.n(r7, "", r6) == r5) goto L15;
     */
    @Override // defpackage.pt0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object r(java.lang.Object r7) {
        /*
            r6 = this;
            int r0 = r6.label
            java.lang.String r1 = ""
            r2 = 2
            r3 = 1
            r4 = 0
            bw2 r5 = defpackage.bw2.a
            if (r0 == 0) goto L2d
            if (r0 == r3) goto L21
            if (r0 != r2) goto L1b
            java.lang.Object r0 = r6.L$1
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r6 = r6.L$0
            hs3 r6 = (defpackage.hs3) r6
            defpackage.jzb.q(r7)
            goto L52
        L1b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qc0.p(r6)
            return r4
        L21:
            java.lang.Object r0 = r6.L$1
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r0 = r6.L$0
            hs3 r0 = (defpackage.hs3) r0
            defpackage.jzb.q(r7)
            goto L41
        L2d:
            defpackage.jzb.q(r7)
            hs3 r7 = defpackage.xqa.t0
            isa r7 = r7.a
            r6.L$0 = r4
            r6.L$1 = r4
            r6.label = r3
            java.lang.Object r7 = defpackage.bsa.n(r7, r1, r6)
            if (r7 != r5) goto L41
            goto L51
        L41:
            hs3 r7 = defpackage.xqa.s0
            isa r7 = r7.a
            r6.L$0 = r4
            r6.L$1 = r4
            r6.label = r2
            java.lang.Object r6 = defpackage.bsa.n(r7, r1, r6)
            if (r6 != r5) goto L52
        L51:
            return r5
        L52:
            java.lang.String r6 = "已清空 Paywall SKU 与实验分组缓存"
            defpackage.jcc.k(r3, r6)
            wef r6 = defpackage.wef.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j54.r(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((j54) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
