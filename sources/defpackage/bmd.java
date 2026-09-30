package defpackage;

import ai.askquin.model.TarotSkinIdentify;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class bmd extends gbe implements l26 {
    final /* synthetic */ TarotSkinIdentify $defaultSkin;
    final /* synthetic */ e89 $showDownloadDialog$delegate;
    final /* synthetic */ e89 $skinCheckDone$delegate;
    final /* synthetic */ xof $userProfileDatasource;
    final /* synthetic */ gpf $userRequester;
    Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bmd(gpf gpfVar, TarotSkinIdentify tarotSkinIdentify, xof xofVar, e89 e89Var, e89 e89Var2, xn2 xn2Var) {
        super(2, xn2Var);
        this.$userRequester = gpfVar;
        this.$defaultSkin = tarotSkinIdentify;
        this.$userProfileDatasource = xofVar;
        this.$showDownloadDialog$delegate = e89Var;
        this.$skinCheckDone$delegate = e89Var2;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new bmd(this.$userRequester, this.$defaultSkin, this.$userProfileDatasource, this.$showDownloadDialog$delegate, this.$skinCheckDone$delegate, xn2Var);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0061  */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0058, code lost:
    
        if (defpackage.lw2.b(r5, r6) == r4) goto L18;
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
            if (r0 == 0) goto L28
            if (r0 == r3) goto L1d
            if (r0 != r2) goto L17
            java.lang.Object r0 = r6.L$1
            wef r0 = (defpackage.wef) r0
            java.lang.Object r0 = r6.L$0
            defpackage.jzb.q(r7)
            goto L5b
        L17:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qc0.p(r6)
            return r1
        L1d:
            defpackage.jzb.q(r7)
            ezb r7 = (defpackage.ezb) r7
            java.lang.Object r7 = r7.b()
        L26:
            r0 = r7
            goto L3e
        L28:
            defpackage.jzb.q(r7)
            gpf r7 = r6.$userRequester
            ai.askquin.model.TarotSkinIdentify r0 = r6.$defaultSkin
            lmd r0 = defpackage.hfc.h(r0)
            r6.label = r3
            npf r7 = (defpackage.npf) r7
            java.lang.Object r7 = r7.e(r0, r6)
            if (r7 != r4) goto L26
            goto L5a
        L3e:
            xof r7 = r6.$userProfileDatasource
            ai.askquin.model.TarotSkinIdentify r3 = r6.$defaultSkin
            boolean r5 = r0 instanceof defpackage.dzb
            if (r5 != 0) goto L5b
            r5 = r0
            wef r5 = (defpackage.wef) r5
            amd r5 = new amd
            r5.<init>(r7, r3, r1)
            r6.L$0 = r0
            r6.L$1 = r1
            r6.label = r2
            java.lang.Object r7 = defpackage.lw2.b(r5, r6)
            if (r7 != r4) goto L5b
        L5a:
            return r4
        L5b:
            java.lang.Throwable r7 = defpackage.ezb.a(r0)
            if (r7 == 0) goto L68
            r7 = 2131887461(0x7f120565, float:1.940953E38)
            r0 = 0
            defpackage.kv2.u(r7, r0)
        L68:
            e89 r7 = r6.$showDownloadDialog$delegate
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r7.setValue(r0)
            e89 r6 = r6.$skinCheckDone$delegate
            java.lang.Boolean r7 = java.lang.Boolean.TRUE
            r6.setValue(r7)
            wef r6 = defpackage.wef.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bmd.r(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((bmd) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
