package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class j3c extends gbe implements l26 {
    final /* synthetic */ imb $launchStarted;
    final /* synthetic */ o2c $ownership;
    final /* synthetic */ r0c $session;
    int label;
    final /* synthetic */ p3c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j3c(imb imbVar, p3c p3cVar, o2c o2cVar, r0c r0cVar, xn2 xn2Var) {
        super(2, xn2Var);
        this.$launchStarted = imbVar;
        this.this$0 = p3cVar;
        this.$ownership = o2cVar;
        this.$session = r0cVar;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new j3c(this.$launchStarted, this.this$0, this.$ownership, this.$session, xn2Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x002d, code lost:
    
        if (r4.g(r1, r3) == r0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0044, code lost:
    
        if (r4.d(r2, r3) == r0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0046, code lost:
    
        return r0;
     */
    @Override // defpackage.pt0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object r(java.lang.Object r4) {
        /*
            r3 = this;
            int r0 = r3.label
            r1 = 2
            r2 = 1
            if (r0 == 0) goto L16
            if (r0 == r2) goto L12
            if (r0 != r1) goto Lb
            goto L12
        Lb:
            java.lang.String r3 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qc0.p(r3)
            r3 = 0
            return r3
        L12:
            defpackage.jzb.q(r4)
            goto L47
        L16:
            defpackage.jzb.q(r4)
            imb r4 = r3.$launchStarted
            boolean r4 = r4.element
            bw2 r0 = defpackage.bw2.a
            if (r4 == 0) goto L30
            p3c r4 = r3.this$0
            o2c r1 = r3.$ownership
            r3.label = r2
            int r2 = defpackage.p3c.L0
            java.lang.Object r3 = r4.g(r1, r3)
            if (r3 != r0) goto L47
            goto L46
        L30:
            o2c r4 = r3.$ownership
            boolean r4 = r4.c
            if (r4 == 0) goto L47
            p3c r4 = r3.this$0
            k2c r4 = r4.c
            r0c r2 = r3.$session
            java.lang.String r2 = r2.a
            r3.label = r1
            java.lang.Object r3 = r4.d(r2, r3)
            if (r3 != r0) goto L47
        L46:
            return r0
        L47:
            wef r3 = defpackage.wef.a
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j3c.r(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((j3c) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
