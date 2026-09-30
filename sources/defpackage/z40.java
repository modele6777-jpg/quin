package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class z40 extends gbe implements l26 {
    final /* synthetic */ String $year;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ c50 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z40(c50 c50Var, String str, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = c50Var;
        this.$year = str;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        z40 z40Var = new z40(this.this$0, this.$year, xn2Var);
        z40Var.L$0 = obj;
        return z40Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x007e, code lost:
    
        if (r0.a(r1, r6) == r5) goto L22;
     */
    @Override // defpackage.pt0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object r(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.L$0
            xj5 r0 = (defpackage.xj5) r0
            int r1 = r6.label
            r2 = 2
            r3 = 1
            r4 = 0
            bw2 r5 = defpackage.bw2.a
            if (r1 == 0) goto L23
            if (r1 == r3) goto L1f
            if (r1 != r2) goto L19
            java.lang.Object r6 = r6.L$1
            tech.chatmind.api.annual.model.AnnualLuckResponse r6 = (tech.chatmind.api.annual.model.AnnualLuckResponse) r6
            defpackage.jzb.q(r7)
            goto L81
        L19:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qc0.p(r6)
            return r4
        L1f:
            defpackage.jzb.q(r7)
            goto L37
        L23:
            defpackage.jzb.q(r7)
            c50 r7 = r6.this$0
            n10 r7 = r7.a
            java.lang.String r1 = r6.$year
            r6.L$0 = r0
            r6.label = r3
            java.lang.Object r7 = r7.a(r1, r6)
            if (r7 != r5) goto L37
            goto L80
        L37:
            tech.chatmind.api.server.ServerResponse r7 = (tech.chatmind.api.server.ServerResponse) r7
            java.lang.Object r7 = r7.getData()
            tech.chatmind.api.annual.model.AnnualLuckResponse r7 = (tech.chatmind.api.annual.model.AnnualLuckResponse) r7
            java.lang.String r1 = r7.getStatus()
            java.lang.String r3 = "processing"
            boolean r3 = defpackage.pa7.t(r1, r3)
            if (r3 == 0) goto L4e
            java.lang.Boolean r7 = java.lang.Boolean.FALSE
            goto L6d
        L4e:
            java.lang.String r3 = "ready"
            boolean r1 = defpackage.pa7.t(r1, r3)
            if (r1 == 0) goto L59
            java.lang.Boolean r7 = java.lang.Boolean.TRUE
            goto L6d
        L59:
            java.lang.Exception r1 = new java.lang.Exception
            java.lang.String r7 = r7.getStatus()
            java.lang.String r3 = "Unknown status: "
            java.lang.String r7 = defpackage.ub3.i(r3, r7)
            r1.<init>(r7)
            dzb r7 = new dzb
            r7.<init>(r1)
        L6d:
            ezb r1 = new ezb
            r1.<init>(r7)
            r6.L$0 = r4
            r6.L$1 = r4
            r6.L$2 = r4
            r6.label = r2
            java.lang.Object r6 = r0.a(r1, r6)
            if (r6 != r5) goto L81
        L80:
            return r5
        L81:
            wef r6 = defpackage.wef.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z40.r(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((z40) k((xn2) obj2, (xj5) obj)).r(wef.a);
    }
}
