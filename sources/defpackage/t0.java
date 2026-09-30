package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class t0 extends gbe implements l26 {
    final /* synthetic */ t69 $interactionSource;
    final /* synthetic */ pta $press;
    int label;
    final /* synthetic */ b1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t0(t69 t69Var, pta ptaVar, b1 b1Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.$interactionSource = t69Var;
        this.$press = ptaVar;
        this.this$0 = b1Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new t0(this.$interactionSource, this.$press, this.this$0, xn2Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0035, code lost:
    
        if (((defpackage.u69) r7).a(r0, r6) == r3) goto L15;
     */
    @Override // defpackage.pt0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object r(java.lang.Object r7) {
        /*
            r6 = this;
            int r0 = r6.label
            r1 = 2
            r2 = 1
            bw2 r3 = defpackage.bw2.a
            if (r0 == 0) goto L1b
            if (r0 == r2) goto L17
            if (r0 != r1) goto L10
            defpackage.jzb.q(r7)
            goto L38
        L10:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qc0.p(r6)
            r6 = 0
            return r6
        L17:
            defpackage.jzb.q(r7)
            goto L29
        L1b:
            defpackage.jzb.q(r7)
            long r4 = defpackage.v42.a
            r6.label = r2
            java.lang.Object r7 = defpackage.vfh.q(r4, r6)
            if (r7 != r3) goto L29
            goto L37
        L29:
            t69 r7 = r6.$interactionSource
            pta r0 = r6.$press
            r6.label = r1
            u69 r7 = (defpackage.u69) r7
            java.lang.Object r7 = r7.a(r0, r6)
            if (r7 != r3) goto L38
        L37:
            return r3
        L38:
            b1 r7 = r6.this$0
            pta r6 = r6.$press
            r7.R0 = r6
            wef r6 = defpackage.wef.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t0.r(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((t0) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
