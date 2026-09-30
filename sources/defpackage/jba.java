package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class jba extends gbe implements l26 {
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ sba this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jba(sba sbaVar, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = sbaVar;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        jba jbaVar = new jba(this.this$0, xn2Var);
        jbaVar.L$0 = obj;
        return jbaVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0064, code lost:
    
        if (r0.a(r8, r7) == r6) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0073, code lost:
    
        if (r0.a(null, r7) == r6) goto L24;
     */
    @Override // defpackage.pt0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object r(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.L$0
            xj5 r0 = (defpackage.xj5) r0
            int r1 = r7.label
            r2 = 3
            r3 = 2
            r4 = 1
            r5 = 0
            bw2 r6 = defpackage.bw2.a
            if (r1 == 0) goto L2c
            if (r1 == r4) goto L28
            if (r1 == r3) goto L1b
            if (r1 != r2) goto L15
            goto L1b
        L15:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qc0.p(r7)
            return r5
        L1b:
            java.lang.Object r0 = r7.L$2
            java.lang.String r0 = (java.lang.String) r0
            java.lang.Object r7 = r7.L$1
            tech.chatmind.api.server.ServerResponse r7 = (tech.chatmind.api.server.ServerResponse) r7
            defpackage.jzb.q(r8)
            goto L9b
        L28:
            defpackage.jzb.q(r8)
            goto L3e
        L2c:
            defpackage.jzb.q(r8)
            sba r8 = r7.this$0
            maa r8 = r8.a
            r7.L$0 = r0
            r7.label = r4
            java.lang.Object r8 = r8.e(r7)
            if (r8 != r6) goto L3e
            goto L75
        L3e:
            sba r1 = r7.this$0
            tech.chatmind.api.server.ServerResponse r8 = (tech.chatmind.api.server.ServerResponse) r8
            boolean r4 = r8.getSuccess()
            if (r4 == 0) goto L76
            java.lang.Object r8 = r8.getData()
            tech.chatmind.api.personality.UnfinishedHistory r8 = (tech.chatmind.api.personality.UnfinishedHistory) r8
            java.lang.String r8 = r8.getUnfinishedTestId()
            int r1 = r8.length()
            if (r1 <= 0) goto L67
            r7.L$0 = r5
            r7.L$1 = r5
            r7.L$2 = r5
            r7.label = r3
            java.lang.Object r7 = r0.a(r8, r7)
            if (r7 != r6) goto L9b
            goto L75
        L67:
            r7.L$0 = r5
            r7.L$1 = r5
            r7.L$2 = r5
            r7.label = r2
            java.lang.Object r7 = r0.a(r5, r7)
            if (r7 != r6) goto L9b
        L75:
            return r6
        L76:
            m8b r7 = r1.d()
            int r0 = r8.getErrorCode()
            java.lang.String r8 = r8.getErrorMessage()
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "query unfinished history failed "
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r0 = " "
            r1.append(r0)
            r1.append(r8)
            java.lang.String r8 = r1.toString()
            r7.b(r8)
        L9b:
            wef r7 = defpackage.wef.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jba.r(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((jba) k((xn2) obj2, (xj5) obj)).r(wef.a);
    }
}
