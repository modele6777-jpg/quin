package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class rqe extends gbe implements a26 {
    int label;
    final /* synthetic */ cre this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rqe(cre creVar, xn2 xn2Var) {
        super(1, xn2Var);
        this.this$0 = creVar;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        return new rqe(this.this$0, (xn2) obj).r(wef.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0053, code lost:
    
        if (r9 == r4) goto L22;
     */
    @Override // defpackage.pt0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object r(java.lang.Object r9) {
        /*
            r8 = this;
            int r0 = r8.label
            wef r1 = defpackage.wef.a
            r2 = 2
            r3 = 1
            bw2 r4 = defpackage.bw2.a
            if (r0 == 0) goto L1d
            if (r0 == r3) goto L19
            if (r0 != r2) goto L12
            defpackage.jzb.q(r9)
            goto L56
        L12:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qc0.p(r8)
            r8 = 0
            return r8
        L19:
            defpackage.jzb.q(r9)
            goto L2b
        L1d:
            defpackage.jzb.q(r9)
            cre r9 = r8.this$0
            r8.label = r3
            java.lang.Object r9 = r9.t(r8)
            if (r9 != r4) goto L2b
            goto L55
        L2b:
            cre r9 = r8.this$0
            iy9 r9 = r9.f()
            if (r9 == 0) goto L56
            cre r0 = r8.this$0
            java.lang.Object r5 = r9.a()
            java.lang.String r5 = (java.lang.String) r5
            java.lang.Object r9 = r9.b()
            eue r9 = (defpackage.eue) r9
            long r6 = r9.a
            rfa r9 = r0.i
            if (r9 == 0) goto L56
            r8.label = r2
            yfa r9 = (defpackage.yfa) r9
            java.lang.Object r9 = r9.e(r5, r6, r8)
            if (r9 != r4) goto L52
            goto L53
        L52:
            r9 = r1
        L53:
            if (r9 != r4) goto L56
        L55:
            return r4
        L56:
            cre r8 = r8.this$0
            r8.A = r3
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rqe.r(java.lang.Object):java.lang.Object");
    }
}
