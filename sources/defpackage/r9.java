package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class r9 extends gbe implements l26 {
    final /* synthetic */ x16 $onFinished;
    int label;
    final /* synthetic */ x9 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r9(x9 x9Var, x16 x16Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = x9Var;
        this.$onFinished = x16Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new r9(this.this$0, this.$onFinished, xn2Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x005d, code lost:
    
        if (((defpackage.sn3) r6).a(r5) == r4) goto L25;
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
            r1 = 0
            r2 = 2
            r3 = 1
            bw2 r4 = defpackage.bw2.a
            if (r0 == 0) goto L1f
            if (r0 == r3) goto L19
            if (r0 != r2) goto L13
            defpackage.jzb.q(r6)     // Catch: java.lang.Throwable -> L11
            goto L60
        L11:
            r6 = move-exception
            goto L66
        L13:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qc0.p(r5)
            return r1
        L19:
            defpackage.jzb.q(r6)     // Catch: java.lang.Throwable -> L1d
            goto L3d
        L1d:
            r6 = move-exception
            goto L85
        L1f:
            defpackage.jzb.q(r6)
            x9 r6 = r5.this$0     // Catch: java.lang.Throwable -> L1d
            gpf r6 = r6.c     // Catch: java.lang.Throwable -> L1d
            r5.label = r3     // Catch: java.lang.Throwable -> L1d
            npf r6 = (defpackage.npf) r6     // Catch: java.lang.Throwable -> L1d
            r6.getClass()     // Catch: java.lang.Throwable -> L1d
            js3 r0 = defpackage.ga4.a     // Catch: java.lang.Throwable -> L1d
            hr3 r0 = defpackage.hr3.c     // Catch: java.lang.Throwable -> L1d
            ipf r3 = new ipf     // Catch: java.lang.Throwable -> L1d
            r3.<init>(r6, r1)     // Catch: java.lang.Throwable -> L1d
            java.lang.Object r6 = defpackage.ynb.p0(r0, r3, r5)     // Catch: java.lang.Throwable -> L1d
            if (r6 != r4) goto L3d
            goto L5f
        L3d:
            java.lang.Boolean r6 = (java.lang.Boolean) r6     // Catch: java.lang.Throwable -> L1d
            boolean r6 = r6.booleanValue()     // Catch: java.lang.Throwable -> L1d
            r0 = 0
            if (r6 == 0) goto L6c
            java.lang.Integer r6 = new java.lang.Integer     // Catch: java.lang.Throwable -> L1d
            r1 = 2131886711(0x7f120277, float:1.9408009E38)
            r6.<init>(r1)     // Catch: java.lang.Throwable -> L1d
            defpackage.jcc.k(r0, r6)     // Catch: java.lang.Throwable -> L1d
            x9 r6 = r5.this$0     // Catch: java.lang.Throwable -> L11
            m7 r6 = r6.d     // Catch: java.lang.Throwable -> L11
            r5.label = r2     // Catch: java.lang.Throwable -> L11
            sn3 r6 = (defpackage.sn3) r6     // Catch: java.lang.Throwable -> L11
            java.lang.Object r6 = r6.a(r5)     // Catch: java.lang.Throwable -> L11
            if (r6 != r4) goto L60
        L5f:
            return r4
        L60:
            x16 r6 = r5.$onFinished     // Catch: java.lang.Throwable -> L1d
            r6.invoke()     // Catch: java.lang.Throwable -> L1d
            goto L77
        L66:
            x16 r0 = r5.$onFinished     // Catch: java.lang.Throwable -> L1d
            r0.invoke()     // Catch: java.lang.Throwable -> L1d
            throw r6     // Catch: java.lang.Throwable -> L1d
        L6c:
            java.lang.Integer r6 = new java.lang.Integer     // Catch: java.lang.Throwable -> L1d
            r1 = 2131886710(0x7f120276, float:1.9408007E38)
            r6.<init>(r1)     // Catch: java.lang.Throwable -> L1d
            defpackage.jcc.k(r0, r6)     // Catch: java.lang.Throwable -> L1d
        L77:
            x9 r5 = r5.this$0
            int r6 = defpackage.x9.X
            vz9 r5 = r5.x
            java.lang.Boolean r6 = java.lang.Boolean.FALSE
            r5.setValue(r6)
            wef r5 = defpackage.wef.a
            return r5
        L85:
            x9 r5 = r5.this$0
            int r0 = defpackage.x9.X
            vz9 r5 = r5.x
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r5.setValue(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.r9.r(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((r9) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
