package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class amf extends gbe implements l26 {
    final /* synthetic */ String $code;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ qmf this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public amf(qmf qmfVar, String str, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = qmfVar;
        this.$code = str;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new amf(this.this$0, this.$code, xn2Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0074, code lost:
    
        if (r8 == r5) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0096, code lost:
    
        if (r8 == r5) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00af, code lost:
    
        if (r0.h(r8, r2, defpackage.igd.a, r7) == r5) goto L27;
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
            r1 = 3
            r2 = 2
            r3 = 1
            r4 = 0
            bw2 r5 = defpackage.bw2.a
            if (r0 == 0) goto L33
            if (r0 == r3) goto L2b
            if (r0 == r2) goto L23
            if (r0 != r1) goto L1d
            java.lang.Object r0 = r7.L$1
            xgd r0 = (defpackage.xgd) r0
            java.lang.Object r7 = r7.L$0
            java.lang.String r7 = (java.lang.String) r7
            defpackage.jzb.q(r8)
            goto Lb2
        L1d:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qc0.p(r7)
            return r4
        L23:
            java.lang.Object r0 = r7.L$0
            java.lang.String r0 = (java.lang.String) r0
            defpackage.jzb.q(r8)
            goto L77
        L2b:
            java.lang.Object r0 = r7.L$0
            java.lang.String r0 = (java.lang.String) r0
            defpackage.jzb.q(r8)
            goto L99
        L33:
            defpackage.jzb.q(r8)
            qmf r8 = r7.this$0
            use r8 = r8.g
            vne r8 = r8.d()
            java.lang.CharSequence r8 = r8.c
            java.lang.String r8 = r8.toString()
            qmf r0 = r7.this$0
            ai.askquin.ui.account.component.AuthOption r0 = r0.g()
            int[] r6 = defpackage.zlf.a
            int r0 = r0.ordinal()
            r0 = r6[r0]
            if (r0 == r3) goto L7a
            if (r0 == r2) goto L58
            r8 = r4
            goto L9b
        L58:
            qmf r0 = r7.this$0
            ht6 r0 = r0.b
            java.lang.String r3 = r7.$code
            r7.L$0 = r4
            r7.label = r2
            cb r0 = (defpackage.cb) r0
            r0.getClass()
            js3 r2 = defpackage.ga4.a
            hr3 r2 = defpackage.hr3.c
            ya r6 = new ya
            r6.<init>(r0, r8, r3, r4)
            java.lang.Object r8 = defpackage.ynb.p0(r2, r6, r7)
            if (r8 != r5) goto L77
            goto Lb1
        L77:
            xgd r8 = (defpackage.xgd) r8
            goto L9b
        L7a:
            qmf r0 = r7.this$0
            ht6 r0 = r0.b
            java.lang.String r2 = r7.$code
            r7.L$0 = r4
            r7.label = r3
            cb r0 = (defpackage.cb) r0
            r0.getClass()
            js3 r3 = defpackage.ga4.a
            hr3 r3 = defpackage.hr3.c
            sa r6 = new sa
            r6.<init>(r0, r8, r2, r4)
            java.lang.Object r8 = defpackage.ynb.p0(r3, r6, r7)
            if (r8 != r5) goto L99
            goto Lb1
        L99:
            xgd r8 = (defpackage.xgd) r8
        L9b:
            if (r8 == 0) goto Lb2
            qmf r0 = r7.this$0
            ai.askquin.ui.account.component.AuthOption r2 = r0.g()
            r7.L$0 = r4
            r7.L$1 = r4
            r7.label = r1
            igd r1 = defpackage.igd.a
            java.lang.Object r7 = r0.h(r8, r2, r1, r7)
            if (r7 != r5) goto Lb2
        Lb1:
            return r5
        Lb2:
            wef r7 = defpackage.wef.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.amf.r(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((amf) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
