package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class qee extends gbe implements l26 {
    final /* synthetic */ l26 $block;
    final /* synthetic */ dg7 $resetJob;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qee(dg7 dg7Var, l26 l26Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.$resetJob = dg7Var;
        this.$block = l26Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        qee qeeVar = new qee(this.$resetJob, this.$block, xn2Var);
        qeeVar.L$0 = obj;
        return qeeVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x003e, code lost:
    
        if (r6.z(r0, r5) == r4) goto L15;
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
            if (r0 == r3) goto L17
            if (r0 != r2) goto L11
            defpackage.jzb.q(r6)
            goto L41
        L11:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qc0.p(r5)
            return r1
        L17:
            java.lang.Object r0 = r5.L$0
            aw2 r0 = (defpackage.aw2) r0
            defpackage.jzb.q(r6)
            goto L34
        L1f:
            defpackage.jzb.q(r6)
            java.lang.Object r6 = r5.L$0
            r0 = r6
            aw2 r0 = (defpackage.aw2) r0
            dg7 r6 = r5.$resetJob
            r5.L$0 = r0
            r5.label = r3
            java.lang.Object r6 = r6.U0(r5)
            if (r6 != r4) goto L34
            goto L40
        L34:
            l26 r6 = r5.$block
            r5.L$0 = r1
            r5.label = r2
            java.lang.Object r5 = r6.z(r0, r5)
            if (r5 != r4) goto L41
        L40:
            return r4
        L41:
            wef r5 = defpackage.wef.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qee.r(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((qee) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
