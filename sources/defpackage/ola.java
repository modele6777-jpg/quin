package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ola extends gbe implements l26 {
    final /* synthetic */ String $accountId;
    Object L$0;
    int label;
    final /* synthetic */ mma this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ola(mma mmaVar, String str, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = mmaVar;
        this.$accountId = str;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new ola(this.this$0, this.$accountId, xn2Var);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x005a  */
    /* JADX WARN: Code duplicated, block: B:25:0x006c  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0052, code lost:
    
        if (r6 == r4) goto L20;
     */
    @Override // defpackage.pt0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object r(java.lang.Object r6) throws java.lang.Throwable {
        /*
            r5 = this;
            int r0 = r5.label
            r1 = 0
            r2 = 2
            r3 = 1
            bw2 r4 = defpackage.bw2.a
            if (r0 == 0) goto L1f
            if (r0 == r3) goto L1b
            if (r0 != r2) goto L15
            java.lang.Object r0 = r5.L$0
            mnf r0 = (defpackage.mnf) r0
            defpackage.jzb.q(r6)
            goto L55
        L15:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qc0.p(r5)
            return r1
        L1b:
            defpackage.jzb.q(r6)
            goto L31
        L1f:
            defpackage.jzb.q(r6)
            mma r6 = r5.this$0
            unf r6 = r6.x
            r5.label = r3
            m05 r6 = (defpackage.m05) r6
            java.lang.Object r6 = r6.e(r5)
            if (r6 != r4) goto L31
            goto L54
        L31:
            mnf r6 = (defpackage.mnf) r6
            knf r0 = defpackage.knf.a
            boolean r0 = defpackage.pa7.t(r6, r0)
            if (r0 == 0) goto L3c
            goto L58
        L3c:
            boolean r0 = r6 instanceof defpackage.lnf
            if (r0 == 0) goto L7b
            mma r0 = r5.this$0
            java.lang.String r3 = r5.$accountId
            lnf r6 = (defpackage.lnf) r6
            java.util.List r6 = r6.a
            r5.L$0 = r1
            r5.label = r2
            java.time.ZoneId r1 = defpackage.mma.u1
            java.lang.Object r6 = r0.P(r3, r6, r5)
            if (r6 != r4) goto L55
        L54:
            return r4
        L55:
            r1 = r6
            tech.chatmind.api.events.model.UserPopupEvent r1 = (tech.chatmind.api.events.model.UserPopupEvent) r1
        L58:
            if (r1 == 0) goto L78
            mma r6 = r5.this$0
            java.time.ZoneId r0 = defpackage.mma.u1
            t7 r6 = r6.v
            java.lang.String r6 = defpackage.jrb.d(r6)
            java.lang.String r0 = r5.$accountId
            boolean r6 = defpackage.pa7.t(r6, r0)
            if (r6 == 0) goto L78
            mma r6 = r5.this$0
            wua r0 = new wua
            java.lang.String r5 = r5.$accountId
            r0.<init>(r5, r1)
            r6.Q(r0)
        L78:
            wef r5 = defpackage.wef.a
            return r5
        L7b:
            defpackage.ap.c()
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ola.r(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((ola) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
