package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class kp6 extends gbe implements l26 {
    final /* synthetic */ String $accountId;
    int label;
    final /* synthetic */ kq6 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kp6(kq6 kq6Var, String str, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = kq6Var;
        this.$accountId = str;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new kp6(this.this$0, this.$accountId, xn2Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x004d, code lost:
    
        if (defpackage.pa7.t(r3.I0, r5.$accountId) != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x004f, code lost:
    
        r5 = r5.this$0;
        r5.I0 = null;
        r5.G0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0055, code lost:
    
        return r4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0068, code lost:
    
        if (defpackage.pa7.t(r5.this$0.I0, r5.$accountId) != false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x006b, code lost:
    
        return r4;
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
            r1 = 1
            r2 = 0
            if (r0 == 0) goto L14
            if (r0 != r1) goto Le
            defpackage.jzb.q(r6)     // Catch: java.lang.Throwable -> Lc
            goto L2f
        Lc:
            r6 = move-exception
            goto L6c
        Le:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qc0.p(r5)
            return r2
        L14:
            defpackage.jzb.q(r6)
            js3 r6 = defpackage.ga4.a     // Catch: java.lang.Throwable -> Lc
            hr3 r6 = defpackage.hr3.c     // Catch: java.lang.Throwable -> Lc
            jp6 r0 = new jp6     // Catch: java.lang.Throwable -> Lc
            kq6 r3 = r5.this$0     // Catch: java.lang.Throwable -> Lc
            java.lang.String r4 = r5.$accountId     // Catch: java.lang.Throwable -> Lc
            r0.<init>(r3, r4, r2)     // Catch: java.lang.Throwable -> Lc
            r5.label = r1     // Catch: java.lang.Throwable -> Lc
            java.lang.Object r6 = defpackage.ynb.p0(r6, r0, r5)     // Catch: java.lang.Throwable -> Lc
            bw2 r0 = defpackage.bw2.a
            if (r6 != r0) goto L2f
            return r0
        L2f:
            java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch: java.lang.Throwable -> Lc
            boolean r6 = r6.booleanValue()     // Catch: java.lang.Throwable -> Lc
            kq6 r0 = r5.this$0     // Catch: java.lang.Throwable -> Lc
            java.lang.String r0 = r0.K0     // Catch: java.lang.Throwable -> Lc
            java.lang.String r3 = r5.$accountId     // Catch: java.lang.Throwable -> Lc
            boolean r0 = defpackage.pa7.t(r0, r3)     // Catch: java.lang.Throwable -> Lc
            kq6 r3 = r5.this$0
            wef r4 = defpackage.wef.a
            if (r0 != 0) goto L56
            java.lang.String r6 = r3.I0
            java.lang.String r0 = r5.$accountId
            boolean r6 = defpackage.pa7.t(r6, r0)
            if (r6 == 0) goto L6b
        L4f:
            kq6 r5 = r5.this$0
            r5.I0 = r2
            r5.G0 = r2
            return r4
        L56:
            if (r6 == 0) goto L5b
            r3.L0 = r1     // Catch: java.lang.Throwable -> Lc
            goto L5e
        L5b:
            r3.f()     // Catch: java.lang.Throwable -> Lc
        L5e:
            kq6 r6 = r5.this$0
            java.lang.String r6 = r6.I0
            java.lang.String r0 = r5.$accountId
            boolean r6 = defpackage.pa7.t(r6, r0)
            if (r6 == 0) goto L6b
            goto L4f
        L6b:
            return r4
        L6c:
            kq6 r0 = r5.this$0
            java.lang.String r0 = r0.I0
            java.lang.String r1 = r5.$accountId
            boolean r0 = defpackage.pa7.t(r0, r1)
            if (r0 == 0) goto L7e
            kq6 r5 = r5.this$0
            r5.I0 = r2
            r5.G0 = r2
        L7e:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kp6.r(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((kp6) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
