package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class um5 extends gbe implements n26 {
    final /* synthetic */ p26 $transform$inlined;
    int I$0;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public um5(xn2 xn2Var, p26 p26Var) {
        super(3, xn2Var);
        this.$transform$inlined = p26Var;
    }

    @Override // defpackage.n26
    public final Object m(Object obj, Object obj2, Object obj3) {
        um5 um5Var = new um5((xn2) obj3, this.$transform$inlined);
        um5Var.L$0 = (xj5) obj;
        um5Var.L$1 = (Object[]) obj2;
        return um5Var.r(wef.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0065, code lost:
    
        if (r0.a(r14, r12) == r6) goto L15;
     */
    @Override // defpackage.pt0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object r(java.lang.Object r14) {
        /*
            r13 = this;
            java.lang.Object r0 = r13.L$0
            xj5 r0 = (defpackage.xj5) r0
            java.lang.Object r1 = r13.L$1
            java.lang.Object[] r1 = (java.lang.Object[]) r1
            int r2 = r13.label
            r3 = 2
            r4 = 1
            r5 = 0
            bw2 r6 = defpackage.bw2.a
            if (r2 == 0) goto L30
            if (r2 == r4) goto L1f
            if (r2 != r3) goto L19
            defpackage.jzb.q(r14)
            goto L68
        L19:
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qc0.p(r13)
            return r5
        L1f:
            java.lang.Object r0 = r13.L$4
            java.lang.Object[] r0 = (java.lang.Object[]) r0
            java.lang.Object r0 = r13.L$3
            xn2 r0 = (defpackage.xn2) r0
            java.lang.Object r0 = r13.L$2
            xj5 r0 = (defpackage.xj5) r0
            defpackage.jzb.q(r14)
            r12 = r13
            goto L55
        L30:
            defpackage.jzb.q(r14)
            p26 r7 = r13.$transform$inlined
            r14 = 0
            r8 = r1[r14]
            r9 = r1[r4]
            r10 = r1[r3]
            r2 = 3
            r11 = r1[r2]
            r13.L$0 = r5
            r13.L$1 = r5
            r13.L$2 = r0
            r13.L$3 = r5
            r13.L$4 = r5
            r13.I$0 = r14
            r13.label = r4
            r12 = r13
            java.lang.Object r14 = r7.C(r8, r9, r10, r11, r12)
            if (r14 != r6) goto L55
            goto L67
        L55:
            r12.L$0 = r5
            r12.L$1 = r5
            r12.L$2 = r5
            r12.L$3 = r5
            r12.L$4 = r5
            r12.label = r3
            java.lang.Object r13 = r0.a(r14, r12)
            if (r13 != r6) goto L68
        L67:
            return r6
        L68:
            wef r13 = defpackage.wef.a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.um5.r(java.lang.Object):java.lang.Object");
    }
}
