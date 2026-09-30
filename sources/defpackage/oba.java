package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class oba extends gbe implements l26 {
    final /* synthetic */ String $testId;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ sba this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public oba(sba sbaVar, String str, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = sbaVar;
        this.$testId = str;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        oba obaVar = new oba(this.this$0, this.$testId, xn2Var);
        obaVar.L$0 = obj;
        return obaVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x007d, code lost:
    
        if (r0.a(r9, r8) == r5) goto L19;
     */
    @Override // defpackage.pt0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object r(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r0 = r8.L$0
            xj5 r0 = (defpackage.xj5) r0
            int r1 = r8.label
            r2 = 0
            r3 = 2
            r4 = 1
            bw2 r5 = defpackage.bw2.a
            if (r1 == 0) goto L23
            if (r1 == r4) goto L1f
            if (r1 != r3) goto L19
            java.lang.Object r8 = r8.L$1
            java.util.List r8 = (java.util.List) r8
            defpackage.jzb.q(r9)
            goto L80
        L19:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qc0.p(r8)
            return r2
        L1f:
            defpackage.jzb.q(r9)
            goto L37
        L23:
            defpackage.jzb.q(r9)
            sba r9 = r8.this$0
            maa r9 = r9.a
            java.lang.String r1 = r8.$testId
            r8.L$0 = r0
            r8.label = r4
            java.lang.Object r9 = r9.a(r1, r8)
            if (r9 != r5) goto L37
            goto L7f
        L37:
            sba r1 = r8.this$0
            tech.chatmind.api.server.ServerResponse r9 = (tech.chatmind.api.server.ServerResponse) r9
            boolean r4 = r9.getSuccess()
            if (r4 == 0) goto L4c
            java.lang.Object r9 = r9.getData()
            tech.chatmind.api.personality.model.QuestionResponse r9 = (tech.chatmind.api.personality.model.QuestionResponse) r9
            java.util.List r9 = r9.getQuestions()
            goto L73
        L4c:
            m8b r1 = r1.d()
            int r4 = r9.getErrorCode()
            java.lang.String r9 = r9.getErrorMessage()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "Get analytic question failed: "
            r6.<init>(r7)
            r6.append(r4)
            java.lang.String r4 = " "
            r6.append(r4)
            r6.append(r9)
            java.lang.String r9 = r6.toString()
            r1.b(r9)
            pu4 r9 = defpackage.pu4.a
        L73:
            r8.L$0 = r2
            r8.L$1 = r2
            r8.label = r3
            java.lang.Object r8 = r0.a(r9, r8)
            if (r8 != r5) goto L80
        L7f:
            return r5
        L80:
            wef r8 = defpackage.wef.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.oba.r(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((oba) k((xn2) obj2, (xj5) obj)).r(wef.a);
    }
}
