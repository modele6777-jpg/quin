package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class f4a extends gbe implements l26 {
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ j4a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f4a(j4a j4aVar, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = j4aVar;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        f4a f4aVar = new f4a(this.this$0, xn2Var);
        f4aVar.L$0 = obj;
        return f4aVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0043, code lost:
    
        if (r0.a(r7, r6) == r5) goto L15;
     */
    @Override // defpackage.pt0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object r(java.lang.Object r7) {
        /*
            r6 = this;
            java.lang.Object r0 = r6.L$0
            xj5 r0 = (defpackage.xj5) r0
            int r1 = r6.label
            r2 = 2
            r3 = 1
            r4 = 0
            bw2 r5 = defpackage.bw2.a
            if (r1 == 0) goto L23
            if (r1 == r3) goto L1b
            if (r1 != r2) goto L15
            defpackage.jzb.q(r7)
            goto L46
        L15:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qc0.p(r6)
            return r4
        L1b:
            java.lang.Object r0 = r6.L$1
            xj5 r0 = (defpackage.xj5) r0
            defpackage.jzb.q(r7)
            goto L39
        L23:
            defpackage.jzb.q(r7)
            j4a r7 = r6.this$0
            fab r7 = r7.b
            r6.L$0 = r4
            r6.L$1 = r0
            r6.label = r3
            rab r7 = (defpackage.rab) r7
            java.lang.Object r7 = r7.b(r6)
            if (r7 != r5) goto L39
            goto L45
        L39:
            r6.L$0 = r4
            r6.L$1 = r4
            r6.label = r2
            java.lang.Object r6 = r0.a(r7, r6)
            if (r6 != r5) goto L46
        L45:
            return r5
        L46:
            wef r6 = defpackage.wef.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f4a.r(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((f4a) k((xn2) obj2, (xj5) obj)).r(wef.a);
    }
}
