package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class hd3 extends gbe implements l26 {
    final /* synthetic */ boolean $requireLock;
    int label;
    final /* synthetic */ od3 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hd3(od3 od3Var, boolean z, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = od3Var;
        this.$requireLock = z;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new hd3(this.this$0, this.$requireLock, xn2Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0046, code lost:
    
        if (r5 == r3) goto L20;
     */
    @Override // defpackage.pt0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object r(java.lang.Object r5) {
        /*
            r4 = this;
            int r0 = r4.label
            r1 = 2
            r2 = 1
            bw2 r3 = defpackage.bw2.a
            if (r0 == 0) goto L1b
            if (r0 == r2) goto L17
            if (r0 != r1) goto L10
            defpackage.jzb.q(r5)
            goto L49
        L10:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qc0.p(r4)
            r4 = 0
            return r4
        L17:
            defpackage.jzb.q(r5)     // Catch: java.lang.Throwable -> L4c
            goto L3c
        L1b:
            defpackage.jzb.q(r5)
            od3 r5 = r4.this$0
            kd9 r5 = r5.h
            i0e r5 = r5.F()
            boolean r5 = r5 instanceof defpackage.we5
            od3 r0 = r4.this$0
            if (r5 == 0) goto L33
            kd9 r4 = r0.h
            i0e r4 = r4.F()
            return r4
        L33:
            r4.label = r2     // Catch: java.lang.Throwable -> L4c
            java.lang.Object r5 = r0.f(r4)     // Catch: java.lang.Throwable -> L4c
            if (r5 != r3) goto L3c
            goto L48
        L3c:
            od3 r5 = r4.this$0
            boolean r0 = r4.$requireLock
            r4.label = r1
            java.lang.Object r5 = r5.g(r0, r4)
            if (r5 != r3) goto L49
        L48:
            return r3
        L49:
            i0e r5 = (defpackage.i0e) r5
            return r5
        L4c:
            r4 = move-exception
            odb r5 = new odb
            r0 = -1
            r5.<init>(r4, r0)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hd3.r(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((hd3) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
