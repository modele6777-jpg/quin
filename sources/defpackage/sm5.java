package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class sm5 extends gbe implements n26 {
    final /* synthetic */ o26 $transform$inlined;
    int I$0;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public sm5(xn2 xn2Var, o26 o26Var) {
        super(3, xn2Var);
        this.$transform$inlined = o26Var;
    }

    @Override // defpackage.n26
    public final Object m(Object obj, Object obj2, Object obj3) {
        sm5 sm5Var = new sm5((xn2) obj3, this.$transform$inlined);
        sm5Var.L$0 = (xj5) obj;
        sm5Var.L$1 = (Object[]) obj2;
        return sm5Var.r(wef.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0060, code lost:
    
        if (r0.a(r10, r9) == r6) goto L15;
     */
    @Override // defpackage.pt0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object r(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r0 = r9.L$0
            xj5 r0 = (defpackage.xj5) r0
            java.lang.Object r1 = r9.L$1
            java.lang.Object[] r1 = (java.lang.Object[]) r1
            int r2 = r9.label
            r3 = 2
            r4 = 1
            r5 = 0
            bw2 r6 = defpackage.bw2.a
            if (r2 == 0) goto L2f
            if (r2 == r4) goto L1f
            if (r2 != r3) goto L19
            defpackage.jzb.q(r10)
            goto L63
        L19:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qc0.p(r9)
            return r5
        L1f:
            java.lang.Object r0 = r9.L$4
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            java.lang.Object r0 = r9.L$3
            xn2 r0 = (defpackage.xn2) r0
            java.lang.Object r0 = r9.L$2
            xj5 r0 = (defpackage.xj5) r0
            defpackage.jzb.q(r10)
            goto L50
        L2f:
            defpackage.jzb.q(r10)
            o26 r10 = r9.$transform$inlined
            r2 = 0
            r7 = r1[r2]
            r8 = r1[r4]
            r1 = r1[r3]
            r9.L$0 = r5
            r9.L$1 = r5
            r9.L$2 = r0
            r9.L$3 = r5
            r9.L$4 = r5
            r9.I$0 = r2
            r9.label = r4
            java.lang.Object r10 = r10.t(r7, r8, r1, r9)
            if (r10 != r6) goto L50
            goto L62
        L50:
            r9.L$0 = r5
            r9.L$1 = r5
            r9.L$2 = r5
            r9.L$3 = r5
            r9.L$4 = r5
            r9.label = r3
            java.lang.Object r9 = r0.a(r10, r9)
            if (r9 != r6) goto L63
        L62:
            return r6
        L63:
            wef r9 = defpackage.wef.a
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sm5.r(java.lang.Object):java.lang.Object");
    }
}
