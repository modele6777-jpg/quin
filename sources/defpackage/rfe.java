package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class rfe extends gbe implements l26 {
    final /* synthetic */ String $content;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ sfe this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rfe(sfe sfeVar, String str, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = sfeVar;
        this.$content = str;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        rfe rfeVar = new rfe(this.this$0, this.$content, xn2Var);
        rfeVar.L$0 = obj;
        return rfeVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0053, code lost:
    
        if (r0.a((tech.chatmind.api.ShareSummaryContent) r13, r12) == r5) goto L15;
     */
    @Override // defpackage.pt0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object r(java.lang.Object r13) {
        /*
            r12 = this;
            java.lang.Object r0 = r12.L$0
            xj5 r0 = (defpackage.xj5) r0
            int r1 = r12.label
            r2 = 0
            r3 = 2
            r4 = 1
            bw2 r5 = defpackage.bw2.a
            if (r1 == 0) goto L23
            if (r1 == r4) goto L1f
            if (r1 != r3) goto L19
            java.lang.Object r12 = r12.L$1
            tech.chatmind.api.ShareSummaryContent r12 = (tech.chatmind.api.ShareSummaryContent) r12
            defpackage.jzb.q(r13)
            goto L56
        L19:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qc0.p(r12)
            return r2
        L1f:
            defpackage.jzb.q(r13)
            goto L47
        L23:
            defpackage.jzb.q(r13)
            sfe r13 = r12.this$0
            lfe r1 = r13.d
            tech.chatmind.api.SummaryRequest r6 = new tech.chatmind.api.SummaryRequest
            java.lang.String r7 = r12.$content
            t7 r13 = r13.a
            mo3 r13 = (defpackage.mo3) r13
            java.lang.String r8 = r13.a()
            r10 = 4
            r11 = 0
            r9 = 0
            r6.<init>(r7, r8, r9, r10, r11)
            r12.L$0 = r0
            r12.label = r4
            java.lang.Object r13 = r1.b(r6, r12)
            if (r13 != r5) goto L47
            goto L55
        L47:
            tech.chatmind.api.ShareSummaryContent r13 = (tech.chatmind.api.ShareSummaryContent) r13
            r12.L$0 = r2
            r12.L$1 = r2
            r12.label = r3
            java.lang.Object r12 = r0.a(r13, r12)
            if (r12 != r5) goto L56
        L55:
            return r5
        L56:
            wef r12 = defpackage.wef.a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rfe.r(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((rfe) k((xn2) obj2, (xj5) obj)).r(wef.a);
    }
}
