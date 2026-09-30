package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class jlf extends gbe implements l26 {
    final /* synthetic */ String $email;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ qmf this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jlf(qmf qmfVar, String str, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = qmfVar;
        this.$email = str;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new jlf(this.this$0, this.$email, xn2Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0082, code lost:
    
        if (defpackage.ynb.p0(r7, r2, r6) == r4) goto L18;
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
            r1 = 2
            r2 = 1
            r3 = 0
            bw2 r4 = defpackage.bw2.a
            if (r0 == 0) goto L27
            if (r0 == r2) goto L23
            if (r0 != r1) goto L1d
            java.lang.Object r0 = r6.L$2
            java.lang.Integer r0 = (java.lang.Integer) r0
            java.lang.Object r0 = r6.L$1
            qmf r0 = (defpackage.qmf) r0
            java.lang.Object r6 = r6.L$0
            tech.chatmind.api.account.model.SendCodeResult r6 = (tech.chatmind.api.account.model.SendCodeResult) r6
            defpackage.jzb.q(r7)
            goto L85
        L1d:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qc0.p(r6)
            return r3
        L23:
            defpackage.jzb.q(r7)
            goto L47
        L27:
            defpackage.jzb.q(r7)
            qmf r7 = r6.this$0
            ht6 r7 = r7.b
            java.lang.String r0 = r6.$email
            r6.label = r2
            cb r7 = (defpackage.cb) r7
            r7.getClass()
            js3 r2 = defpackage.ga4.a
            hr3 r2 = defpackage.hr3.c
            pa r5 = new pa
            r5.<init>(r7, r0, r3)
            java.lang.Object r7 = defpackage.ynb.p0(r2, r5, r6)
            if (r7 != r4) goto L47
            goto L84
        L47:
            tech.chatmind.api.account.model.SendCodeResult r7 = (tech.chatmind.api.account.model.SendCodeResult) r7
            boolean r0 = r7.isError()
            qmf r2 = r6.this$0
            if (r0 != 0) goto L5e
            ai.askquin.ui.account.navigation.AuthNavigation$EnterCodeRoute r7 = ai.askquin.ui.account.navigation.AuthNavigation$EnterCodeRoute.INSTANCE
            int r0 = defpackage.qmf.Z
            r2.l(r7)
            qmf r6 = r6.this$0
            defpackage.qmf.m(r6)
            goto L85
        L5e:
            java.lang.Integer r7 = r7.getErrorCode()
            int r7 = defpackage.xdc.t(r7)
            java.lang.Integer r0 = new java.lang.Integer
            r0.<init>(r7)
            js3 r7 = defpackage.ga4.a
            wg6 r7 = defpackage.mk8.a
            wg6 r7 = r7.f
            cmf r2 = new cmf
            r2.<init>(r3, r0)
            r6.L$0 = r3
            r6.L$1 = r3
            r6.L$2 = r3
            r6.label = r1
            java.lang.Object r6 = defpackage.ynb.p0(r7, r2, r6)
            if (r6 != r4) goto L85
        L84:
            return r4
        L85:
            wef r6 = defpackage.wef.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jlf.r(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((jlf) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
