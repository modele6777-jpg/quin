package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class wlf extends gbe implements l26 {
    final /* synthetic */ String $token;
    Object L$0;
    int label;
    final /* synthetic */ qmf this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wlf(qmf qmfVar, String str, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = qmfVar;
        this.$token = str;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new wlf(this.this$0, this.$token, xn2Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0058, code lost:
    
        if (r0.h((defpackage.xgd) r7, r3, defpackage.igd.a, r6) == r4) goto L15;
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
            r1 = 0
            r2 = 2
            r3 = 1
            bw2 r4 = defpackage.bw2.a
            if (r0 == 0) goto L1f
            if (r0 == r3) goto L1b
            if (r0 != r2) goto L15
            java.lang.Object r0 = r6.L$0
            xgd r0 = (defpackage.xgd) r0
            defpackage.jzb.q(r7)
            goto L5b
        L15:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qc0.p(r6)
            return r1
        L1b:
            defpackage.jzb.q(r7)
            goto L46
        L1f:
            defpackage.jzb.q(r7)
            qmf r7 = r6.this$0
            int r0 = defpackage.qmf.Z
            r7.k(r3)
            qmf r7 = r6.this$0
            ht6 r7 = r7.b
            java.lang.String r0 = r6.$token
            r6.label = r3
            cb r7 = (defpackage.cb) r7
            r7.getClass()
            js3 r3 = defpackage.ga4.a
            hr3 r3 = defpackage.hr3.c
            ab r5 = new ab
            r5.<init>(r7, r0, r1)
            java.lang.Object r7 = defpackage.ynb.p0(r3, r5, r6)
            if (r7 != r4) goto L46
            goto L5a
        L46:
            xgd r7 = (defpackage.xgd) r7
            qmf r0 = r6.this$0
            ai.askquin.ui.account.component.AuthOption r3 = ai.askquin.ui.account.component.AuthOption.WeChat
            r6.L$0 = r1
            r6.label = r2
            int r1 = defpackage.qmf.Z
            igd r1 = defpackage.igd.a
            java.lang.Object r7 = r0.h(r7, r3, r1, r6)
            if (r7 != r4) goto L5b
        L5a:
            return r4
        L5b:
            qmf r6 = r6.this$0
            int r7 = defpackage.qmf.Z
            r7 = 0
            r6.k(r7)
            wef r6 = defpackage.wef.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wlf.r(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((wlf) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
