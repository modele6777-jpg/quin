package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class y40 extends gbe implements l26 {
    final /* synthetic */ String $year;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ c50 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y40(c50 c50Var, String str, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = c50Var;
        this.$year = str;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        y40 y40Var = new y40(this.this$0, this.$year, xn2Var);
        y40Var.L$0 = obj;
        return y40Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0095, code lost:
    
        if (r0.a(r3, r8) == r5) goto L22;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1, types: [pu4] */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.util.ArrayList] */
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
            if (r1 == 0) goto L2c
            if (r1 == r3) goto L28
            if (r1 != r2) goto L22
            java.lang.Object r0 = r8.L$3
            p19 r0 = (defpackage.p19) r0
            java.lang.Object r0 = r8.L$2
            tech.chatmind.api.annual.model.AnnualLuckResponse r0 = (tech.chatmind.api.annual.model.AnnualLuckResponse) r0
            java.lang.Object r8 = r8.L$1
            tech.chatmind.api.server.ServerResponse r8 = (tech.chatmind.api.server.ServerResponse) r8
            defpackage.jzb.q(r9)
            goto L98
        L22:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qc0.p(r8)
            return r4
        L28:
            defpackage.jzb.q(r9)
            goto L40
        L2c:
            defpackage.jzb.q(r9)
            c50 r9 = r8.this$0
            n10 r9 = r9.a
            java.lang.String r1 = r8.$year
            r8.L$0 = r0
            r8.label = r3
            java.lang.Object r9 = r9.a(r1, r8)
            if (r9 != r5) goto L40
            goto L97
        L40:
            tech.chatmind.api.server.ServerResponse r9 = (tech.chatmind.api.server.ServerResponse) r9
            java.lang.Object r1 = r9.getData()
            tech.chatmind.api.annual.model.AnnualLuckResponse r1 = (tech.chatmind.api.annual.model.AnnualLuckResponse) r1
            c50 r3 = r8.this$0
            int r6 = defpackage.c50.b
            r3.getClass()
            v50 r9 = defpackage.c50.a(r9)
            java.util.List r3 = r1.getMonthlyCards()
            if (r3 == 0) goto L7c
            java.util.ArrayList r6 = new java.util.ArrayList
            r7 = 10
            int r7 = defpackage.t72.u(r3, r7)
            r6.<init>(r7)
            java.util.Iterator r3 = r3.iterator()
        L68:
            boolean r7 = r3.hasNext()
            if (r7 == 0) goto L7e
            java.lang.Object r7 = r3.next()
            tech.chatmind.api.common.model.TarotCardRequestBody r7 = (tech.chatmind.api.common.model.TarotCardRequestBody) r7
            tech.chatmind.api.personality.TarotCard r7 = defpackage.z7c.q(r7)
            r6.add(r7)
            goto L68
        L7c:
            pu4 r6 = defpackage.pu4.a
        L7e:
            tech.chatmind.api.annual.model.MonthlyContent r1 = r1.getMonthlyContent()
            p19 r3 = new p19
            r3.<init>(r9, r6, r1)
            r8.L$0 = r4
            r8.L$1 = r4
            r8.L$2 = r4
            r8.L$3 = r4
            r8.label = r2
            java.lang.Object r8 = r0.a(r3, r8)
            if (r8 != r5) goto L98
        L97:
            return r5
        L98:
            wef r8 = defpackage.wef.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y40.r(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((y40) k((xn2) obj2, (xj5) obj)).r(wef.a);
    }
}
