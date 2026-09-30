package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class w3e extends gbe implements l26 {
    final /* synthetic */ xj5 $$this$flow;
    final /* synthetic */ a26 $makeRequest;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w3e(xj5 xj5Var, a26 a26Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.$$this$flow = xj5Var;
        this.$makeRequest = a26Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        w3e w3eVar = new w3e(this.$$this$flow, this.$makeRequest, xn2Var);
        w3eVar.L$0 = obj;
        return w3eVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003e, code lost:
    
        if (r13 == r5) goto L15;
     */
    @Override // defpackage.pt0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object r(java.lang.Object r13) throws defpackage.jzc, defpackage.tu4 {
        /*
            r12 = this;
            java.lang.Object r0 = r12.L$0
            aw2 r0 = (defpackage.aw2) r0
            int r1 = r12.label
            r2 = 2
            r3 = 1
            r4 = 0
            bw2 r5 = defpackage.bw2.a
            if (r1 == 0) goto L1f
            if (r1 == r3) goto L1b
            if (r1 != r2) goto L15
            defpackage.jzb.q(r13)
            goto L41
        L15:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qc0.p(r12)
            return r4
        L1b:
            defpackage.jzb.q(r13)
            goto L34
        L1f:
            defpackage.jzb.q(r13)
            xj5 r13 = r12.$$this$flow
            lyb r1 = new lyb
            r1.<init>(r0)
            r12.L$0 = r4
            r12.label = r3
            java.lang.Object r13 = r13.a(r1, r12)
            if (r13 != r5) goto L34
            goto L40
        L34:
            a26 r13 = r12.$makeRequest
            r12.L$0 = r4
            r12.label = r2
            java.lang.Object r13 = r13.d(r12)
            if (r13 != r5) goto L41
        L40:
            return r5
        L41:
            tech.chatmind.api.server.ServerResponse r13 = (tech.chatmind.api.server.ServerResponse) r13
            int r12 = r13.getErrorCode()
            if (r12 == 0) goto L6e
            jzc r5 = new jzc
            int r7 = r13.getErrorCode()
            java.lang.String r8 = r13.getErrorMessage()
            boolean r12 = r13.getError()
            java.lang.Boolean r9 = java.lang.Boolean.valueOf(r12)
            java.lang.Object r12 = r13.getData()
            if (r12 == 0) goto L65
            java.lang.String r4 = r12.toString()
        L65:
            r10 = r4
            r11 = 224(0xe0, float:3.14E-43)
            r6 = 400(0x190, float:5.6E-43)
            r5.<init>(r6, r7, r8, r9, r10, r11)
            throw r5
        L6e:
            java.lang.Object r12 = r13.getData()
            if (r12 == 0) goto L79
            java.lang.Object r12 = r13.getData()
            return r12
        L79:
            tu4 r12 = new tu4
            java.lang.String r13 = "data is null"
            r12.<init>(r13)
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w3e.r(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((w3e) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
