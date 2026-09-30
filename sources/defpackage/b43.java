package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class b43 extends gbe implements l26 {
    final /* synthetic */ ma8 $endDate;
    final /* synthetic */ ma8 $startDate;
    final /* synthetic */ String $type;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ d43 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b43(ma8 ma8Var, ma8 ma8Var2, String str, d43 d43Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.$startDate = ma8Var;
        this.$endDate = ma8Var2;
        this.$type = str;
        this.this$0 = d43Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        b43 b43Var = new b43(this.$startDate, this.$endDate, this.$type, this.this$0, xn2Var);
        b43Var.L$0 = obj;
        return b43Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0079, code lost:
    
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
            r2 = 2
            r3 = 1
            r4 = 0
            bw2 r5 = defpackage.bw2.a
            if (r1 == 0) goto L2f
            if (r1 == r3) goto L27
            if (r1 != r2) goto L21
            java.lang.Object r0 = r8.L$3
            java.util.List r0 = (java.util.List) r0
            java.lang.Object r0 = r8.L$2
            tech.chatmind.api.server.ServerResponse r0 = (tech.chatmind.api.server.ServerResponse) r0
            java.lang.Object r8 = r8.L$1
            tech.chatmind.api.dailycard.model.ListDailyCardBody r8 = (tech.chatmind.api.dailycard.model.ListDailyCardBody) r8
            defpackage.jzb.q(r9)
            goto L7c
        L21:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qc0.p(r8)
            return r4
        L27:
            java.lang.Object r1 = r8.L$1
            tech.chatmind.api.dailycard.model.ListDailyCardBody r1 = (tech.chatmind.api.dailycard.model.ListDailyCardBody) r1
            defpackage.jzb.q(r9)
            goto L56
        L2f:
            defpackage.jzb.q(r9)
            tech.chatmind.api.dailycard.model.ListDailyCardBody r9 = new tech.chatmind.api.dailycard.model.ListDailyCardBody
            ma8 r1 = r8.$startDate
            java.lang.String r1 = r1.toString()
            ma8 r6 = r8.$endDate
            java.lang.String r6 = r6.toString()
            java.lang.String r7 = r8.$type
            r9.<init>(r1, r6, r7)
            d43 r1 = r8.this$0
            z23 r1 = r1.a
            r8.L$0 = r0
            r8.L$1 = r4
            r8.label = r3
            java.lang.Object r9 = r1.b(r9, r8)
            if (r9 != r5) goto L56
            goto L7b
        L56:
            tech.chatmind.api.server.ServerResponse r9 = (tech.chatmind.api.server.ServerResponse) r9
            boolean r1 = r9.getSuccess()
            if (r1 == 0) goto L69
            java.lang.Object r9 = r9.getData()
            tech.chatmind.api.dailycard.model.ListDailyCardResponse r9 = (tech.chatmind.api.dailycard.model.ListDailyCardResponse) r9
            java.util.List r9 = r9.getCards()
            goto L6b
        L69:
            pu4 r9 = defpackage.pu4.a
        L6b:
            r8.L$0 = r4
            r8.L$1 = r4
            r8.L$2 = r4
            r8.L$3 = r4
            r8.label = r2
            java.lang.Object r8 = r0.a(r9, r8)
            if (r8 != r5) goto L7c
        L7b:
            return r5
        L7c:
            wef r8 = defpackage.wef.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b43.r(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((b43) k((xn2) obj2, (xj5) obj)).r(wef.a);
    }
}
