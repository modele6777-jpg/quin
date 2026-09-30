package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class zl5 extends gbe implements n26 {
    final /* synthetic */ l26 $transform;
    private /* synthetic */ Object L$0;
    /* synthetic */ Object L$1;
    Object L$2;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zl5(l26 l26Var, xn2 xn2Var) {
        super(3, xn2Var);
        this.$transform = l26Var;
    }

    @Override // defpackage.n26
    public final Object m(Object obj, Object obj2, Object obj3) {
        zl5 zl5Var = new zl5(this.$transform, (xn2) obj3);
        zl5Var.L$0 = (xj5) obj;
        zl5Var.L$1 = obj2;
        return zl5Var.r(wef.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0045, code lost:
    
        if (r0.a(r8, r7) == r6) goto L15;
     */
    @Override // defpackage.pt0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object r(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.L$0
            xj5 r0 = (defpackage.xj5) r0
            java.lang.Object r1 = r7.L$1
            int r2 = r7.label
            r3 = 2
            r4 = 1
            r5 = 0
            bw2 r6 = defpackage.bw2.a
            if (r2 == 0) goto L25
            if (r2 == r4) goto L1d
            if (r2 != r3) goto L17
            defpackage.jzb.q(r8)
            goto L48
        L17:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qc0.p(r7)
            return r5
        L1d:
            java.lang.Object r0 = r7.L$2
            xj5 r0 = (defpackage.xj5) r0
            defpackage.jzb.q(r8)
            goto L39
        L25:
            defpackage.jzb.q(r8)
            l26 r8 = r7.$transform
            r7.L$0 = r5
            r7.L$1 = r5
            r7.L$2 = r0
            r7.label = r4
            java.lang.Object r8 = r8.z(r1, r7)
            if (r8 != r6) goto L39
            goto L47
        L39:
            r7.L$0 = r5
            r7.L$1 = r5
            r7.L$2 = r5
            r7.label = r3
            java.lang.Object r7 = r0.a(r8, r7)
            if (r7 != r6) goto L48
        L47:
            return r6
        L48:
            wef r7 = defpackage.wef.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zl5.r(java.lang.Object):java.lang.Object");
    }
}
