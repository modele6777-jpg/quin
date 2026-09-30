package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class t5a extends gbe implements l26 {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ u5a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t5a(u5a u5aVar, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = u5aVar;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new t5a(this.this$0, xn2Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x007b, code lost:
    
        if (defpackage.bsa.n(r8, r3, r7) == r5) goto L25;
     */
    @Override // defpackage.pt0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object r(java.lang.Object r8) throws java.lang.Throwable {
        /*
            r7 = this;
            java.lang.String r0 = "Paywall SKUs fetched: "
            int r1 = r7.label
            r2 = 2
            r3 = 1
            r4 = 0
            bw2 r5 = defpackage.bw2.a
            if (r1 == 0) goto L2f
            if (r1 == r3) goto L2b
            if (r1 != r2) goto L25
            java.lang.Object r1 = r7.L$3
            java.lang.String r1 = (java.lang.String) r1
            java.lang.Object r1 = r7.L$2
            hs3 r1 = (defpackage.hs3) r1
            java.lang.Object r1 = r7.L$1
            tech.chatmind.api.payment.PaywallSkus r1 = (tech.chatmind.api.payment.PaywallSkus) r1
            java.lang.Object r2 = r7.L$0
            tech.chatmind.api.server.ServerResponse r2 = (tech.chatmind.api.server.ServerResponse) r2
            defpackage.jzb.q(r8)     // Catch: java.lang.Throwable -> L23
            goto L7e
        L23:
            r8 = move-exception
            goto L94
        L25:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qc0.p(r7)
            return r4
        L2b:
            defpackage.jzb.q(r8)     // Catch: java.lang.Throwable -> L23
            goto L47
        L2f:
            defpackage.jzb.q(r8)
            u5a r8 = r7.this$0     // Catch: java.lang.Throwable -> L23
            int r1 = defpackage.u5a.b     // Catch: java.lang.Throwable -> L23
            ace r8 = r8.a     // Catch: java.lang.Throwable -> L23
            java.lang.Object r8 = r8.getValue()     // Catch: java.lang.Throwable -> L23
            d56 r8 = (defpackage.d56) r8     // Catch: java.lang.Throwable -> L23
            r7.label = r3     // Catch: java.lang.Throwable -> L23
            java.lang.Object r8 = r8.g(r4, r7)     // Catch: java.lang.Throwable -> L23
            if (r8 != r5) goto L47
            goto L7d
        L47:
            tech.chatmind.api.server.ServerResponse r8 = (tech.chatmind.api.server.ServerResponse) r8     // Catch: java.lang.Throwable -> L23
            java.lang.Object r8 = r8.getData()     // Catch: java.lang.Throwable -> L23
            tech.chatmind.api.payment.PaywallSkusEnvelope r8 = (tech.chatmind.api.payment.PaywallSkusEnvelope) r8     // Catch: java.lang.Throwable -> L23
            tech.chatmind.api.payment.PaywallSkus r1 = r8.getPaywallSkus()     // Catch: java.lang.Throwable -> L23
            hs3 r8 = defpackage.xqa.t0     // Catch: java.lang.Throwable -> L23
            if (r1 == 0) goto L69
            xh7 r3 = defpackage.fzc.a     // Catch: java.lang.Throwable -> L23
            r3.getClass()     // Catch: java.lang.Throwable -> L23
            m5a r6 = tech.chatmind.api.payment.PaywallSkus.Companion     // Catch: java.lang.Throwable -> L23
            xn7 r6 = r6.serializer()     // Catch: java.lang.Throwable -> L23
            xn7 r6 = (defpackage.xn7) r6     // Catch: java.lang.Throwable -> L23
            java.lang.String r3 = r3.d(r6, r1)     // Catch: java.lang.Throwable -> L23
            goto L6b
        L69:
            java.lang.String r3 = ""
        L6b:
            isa r8 = r8.a     // Catch: java.lang.Throwable -> L23
            r7.L$0 = r4     // Catch: java.lang.Throwable -> L23
            r7.L$1 = r1     // Catch: java.lang.Throwable -> L23
            r7.L$2 = r4     // Catch: java.lang.Throwable -> L23
            r7.L$3 = r4     // Catch: java.lang.Throwable -> L23
            r7.label = r2     // Catch: java.lang.Throwable -> L23
            java.lang.Object r8 = defpackage.bsa.n(r8, r3, r7)     // Catch: java.lang.Throwable -> L23
            if (r8 != r5) goto L7e
        L7d:
            return r5
        L7e:
            u5a r8 = r7.this$0     // Catch: java.lang.Throwable -> L23
            m8b r8 = r8.d()     // Catch: java.lang.Throwable -> L23
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L23
            r2.<init>(r0)     // Catch: java.lang.Throwable -> L23
            r2.append(r1)     // Catch: java.lang.Throwable -> L23
            java.lang.String r0 = r2.toString()     // Catch: java.lang.Throwable -> L23
            r8.e(r0)     // Catch: java.lang.Throwable -> L23
            goto La2
        L94:
            defpackage.ynb.h0(r8)
            u5a r7 = r7.this$0
            m8b r7 = r7.d()
            java.lang.String r0 = "refresh paywall SKUs failed"
            r7.c(r0, r8)
        La2:
            wef r7 = defpackage.wef.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t5a.r(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((t5a) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
