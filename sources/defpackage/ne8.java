package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ne8 extends gbe implements l26 {
    final /* synthetic */ boolean $polling;
    final /* synthetic */ x16 $toReportDirectly;
    int label;
    final /* synthetic */ se8 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ne8(se8 se8Var, boolean z, x16 x16Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = se8Var;
        this.$polling = z;
        this.$toReportDirectly = x16Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new ne8(this.this$0, this.$polling, this.$toReportDirectly, xn2Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x004d, code lost:
    
        if (r6 == r3) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006c, code lost:
    
        if (r6 == r3) goto L23;
     */
    @Override // defpackage.pt0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object r(java.lang.Object r6) {
        /*
            r5 = this;
            int r0 = r5.label
            r1 = 2
            r2 = 1
            if (r0 == 0) goto L19
            if (r0 == r2) goto L15
            if (r0 != r1) goto Le
            defpackage.jzb.q(r6)
            goto L6f
        Le:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qc0.p(r5)
            r5 = 0
            return r5
        L15:
            defpackage.jzb.q(r6)
            goto L50
        L19:
            defpackage.jzb.q(r6)
            se8 r6 = r5.this$0
            m8b r6 = r6.d()
            boolean r0 = r5.$polling
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "checkTestReportCount: polling="
            r3.<init>(r4)
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r6.e(r0)
            boolean r6 = r5.$polling
            se8 r0 = r5.this$0
            bw2 r3 = defpackage.bw2.a
            if (r6 == 0) goto L62
            nd8 r6 = new nd8
            r6.<init>(r2)
            r5.label = r2
            r0.getClass()
            r1 = 3000(0xbb8, double:1.482E-320)
            java.lang.Object r6 = defpackage.g4.F(r0, r1, r6, r5)
            if (r6 != r3) goto L50
            goto L6e
        L50:
            tech.chatmind.api.credits.QuotaUsage r6 = (tech.chatmind.api.credits.QuotaUsage) r6
            if (r6 == 0) goto L59
            int r6 = r6.getTestReportCount()
            goto L5a
        L59:
            r6 = 0
        L5a:
            if (r6 <= 0) goto L85
            x16 r5 = r5.$toReportDirectly
            r5.invoke()
            goto L85
        L62:
            fab r6 = r0.R0
            r5.label = r1
            rab r6 = (defpackage.rab) r6
            java.lang.Object r6 = r6.b(r5)
            if (r6 != r3) goto L6f
        L6e:
            return r3
        L6f:
            tech.chatmind.api.credits.QuotaUsage r6 = (tech.chatmind.api.credits.QuotaUsage) r6
            if (r6 == 0) goto L85
            se8 r0 = r5.this$0
            x16 r5 = r5.$toReportDirectly
            int r1 = defpackage.se8.V0
            r0.Q(r6)
            int r6 = r6.getTestReportCount()
            if (r6 <= 0) goto L85
            r5.invoke()
        L85:
            wef r5 = defpackage.wef.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ne8.r(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((ne8) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
