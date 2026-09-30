package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class vm5 extends gbe implements n26 {
    final /* synthetic */ q26 $transform$inlined;
    int I$0;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vm5(xn2 xn2Var, q26 q26Var) {
        super(3, xn2Var);
        this.$transform$inlined = q26Var;
    }

    @Override // defpackage.n26
    public final Object m(Object obj, Object obj2, Object obj3) {
        vm5 vm5Var = new vm5((xn2) obj3, this.$transform$inlined);
        vm5Var.L$0 = (xj5) obj;
        vm5Var.L$1 = (Object[]) obj2;
        return vm5Var.r(wef.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0068, code lost:
    
        if (r0.a(r15, r13) == r6) goto L15;
     */
    @Override // defpackage.pt0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object r(java.lang.Object r15) {
        /*
            r14 = this;
            java.lang.Object r0 = r14.L$0
            xj5 r0 = (defpackage.xj5) r0
            java.lang.Object r1 = r14.L$1
            java.lang.Object[] r1 = (java.lang.Object[]) r1
            int r2 = r14.label
            r3 = 2
            r4 = 1
            r5 = 0
            bw2 r6 = defpackage.bw2.a
            if (r2 == 0) goto L30
            if (r2 == r4) goto L1f
            if (r2 != r3) goto L19
            defpackage.jzb.q(r15)
            goto L6b
        L19:
            java.lang.String r14 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qc0.p(r14)
            return r5
        L1f:
            java.lang.Object r0 = r14.L$4
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            java.lang.Object r0 = r14.L$3
            xn2 r0 = (defpackage.xn2) r0
            java.lang.Object r0 = r14.L$2
            xj5 r0 = (defpackage.xj5) r0
            defpackage.jzb.q(r15)
            r13 = r14
            goto L58
        L30:
            defpackage.jzb.q(r15)
            q26 r7 = r14.$transform$inlined
            r15 = 0
            r8 = r1[r15]
            r9 = r1[r4]
            r10 = r1[r3]
            r2 = 3
            r11 = r1[r2]
            r2 = 4
            r12 = r1[r2]
            r14.L$0 = r5
            r14.L$1 = r5
            r14.L$2 = r0
            r14.L$3 = r5
            r14.L$4 = r5
            r14.I$0 = r15
            r14.label = r4
            r13 = r14
            java.lang.Object r15 = r7.w(r8, r9, r10, r11, r12, r13)
            if (r15 != r6) goto L58
            goto L6a
        L58:
            r13.L$0 = r5
            r13.L$1 = r5
            r13.L$2 = r5
            r13.L$3 = r5
            r13.L$4 = r5
            r13.label = r3
            java.lang.Object r14 = r0.a(r15, r13)
            if (r14 != r6) goto L6b
        L6a:
            return r6
        L6b:
            wef r14 = defpackage.wef.a
            return r14
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.vm5.r(java.lang.Object):java.lang.Object");
    }
}
