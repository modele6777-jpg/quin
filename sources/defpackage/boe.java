package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class boe extends gbe implements a26 {
    int label;
    final /* synthetic */ eoe this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public boe(eoe eoeVar, xn2 xn2Var) {
        super(1, xn2Var);
        this.this$0 = eoeVar;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        return new boe(this.this$0, (xn2) obj).r(wef.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0054, code lost:
    
        if (r8 == r4) goto L20;
     */
    @Override // defpackage.pt0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object r(java.lang.Object r8) {
        /*
            r7 = this;
            int r0 = r7.label
            wef r1 = defpackage.wef.a
            r2 = 2
            r3 = 1
            bw2 r4 = defpackage.bw2.a
            if (r0 == 0) goto L1d
            if (r0 == r3) goto L19
            if (r0 != r2) goto L12
            defpackage.jzb.q(r8)
            goto L57
        L12:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qc0.p(r7)
            r7 = 0
            return r7
        L19:
            defpackage.jzb.q(r8)
            goto L2c
        L1d:
            defpackage.jzb.q(r8)
            eoe r8 = r7.this$0
            jse r8 = r8.J0
            r7.label = r3
            r8.z()
            if (r1 != r4) goto L2c
            goto L56
        L2c:
            eoe r8 = r7.this$0
            rfa r0 = r8.P0
            if (r0 == 0) goto L57
            jse r8 = r8.J0
            z2f r8 = r8.a
            vne r8 = r8.d()
            java.lang.CharSequence r8 = r8.c
            eoe r3 = r7.this$0
            jse r3 = r3.J0
            z2f r3 = r3.a
            vne r3 = r3.d()
            long r5 = r3.d
            r7.label = r2
            yfa r0 = (defpackage.yfa) r0
            java.lang.Object r8 = r0.e(r8, r5, r7)
            if (r8 != r4) goto L53
            goto L54
        L53:
            r8 = r1
        L54:
            if (r8 != r4) goto L57
        L56:
            return r4
        L57:
            eoe r7 = r7.this$0
            jse r7 = r7.J0
            vz9 r7 = r7.t
            java.lang.Boolean r8 = java.lang.Boolean.TRUE
            r7.setValue(r8)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.boe.r(java.lang.Object):java.lang.Object");
    }
}
