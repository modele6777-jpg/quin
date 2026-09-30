package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class fj1 extends gbe implements l26 {
    int label;
    final /* synthetic */ pj1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fj1(pj1 pj1Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = pj1Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new fj1(this.this$0, xn2Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0033, code lost:
    
        if (defpackage.vfh.q(2000, r4) == r3) goto L15;
     */
    @Override // defpackage.pt0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object r(java.lang.Object r5) {
        /*
            r4 = this;
            int r0 = r4.label
            r1 = 2
            r2 = 1
            bw2 r3 = defpackage.bw2.a
            if (r0 == 0) goto L1b
            if (r0 == r2) goto L17
            if (r0 != r1) goto L10
            defpackage.jzb.q(r5)
            goto L36
        L10:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qc0.p(r4)
            r4 = 0
            return r4
        L17:
            defpackage.jzb.q(r5)
            goto L2b
        L1b:
            defpackage.jzb.q(r5)
            pj1 r5 = r4.this$0
            za2 r5 = r5.h
            r4.label = r2
            java.lang.Object r5 = r5.s(r4)
            if (r5 != r3) goto L2b
            goto L35
        L2b:
            r4.label = r1
            r0 = 2000(0x7d0, double:9.88E-321)
            java.lang.Object r4 = defpackage.vfh.q(r0, r4)
            if (r4 != r3) goto L36
        L35:
            return r3
        L36:
            wef r4 = defpackage.wef.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fj1.r(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((fj1) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
