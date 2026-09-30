package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class mu0 extends gbe implements l26 {
    final /* synthetic */ oxf $holder;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ nu0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mu0(nu0 nu0Var, oxf oxfVar, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = nu0Var;
        this.$holder = oxfVar;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        mu0 mu0Var = new mu0(this.this$0, this.$holder, xn2Var);
        mu0Var.L$0 = obj;
        return mu0Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0065, code lost:
    
        if (r0.m(r8, r3, r7) == r4) goto L21;
     */
    @Override // defpackage.pt0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object r(java.lang.Object r8) {
        /*
            r7 = this;
            int r0 = r7.label
            r1 = 0
            r2 = 2
            r3 = 1
            bw2 r4 = defpackage.bw2.a
            if (r0 == 0) goto L23
            if (r0 == r3) goto L17
            if (r0 != r2) goto L11
            defpackage.jzb.q(r8)
            goto L68
        L11:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qc0.p(r7)
            return r1
        L17:
            java.lang.Object r0 = r7.L$1
            dg7 r0 = (defpackage.dg7) r0
            java.lang.Object r0 = r7.L$0
            aw2 r0 = (defpackage.aw2) r0
            defpackage.jzb.q(r8)
            goto L48
        L23:
            defpackage.jzb.q(r8)
            java.lang.Object r8 = r7.L$0
            r0 = r8
            aw2 r0 = (defpackage.aw2) r0
            nu0 r8 = r7.this$0
            lyd r8 = r8.c
            if (r8 == 0) goto L48
            rae r5 = new rae
            java.lang.String r6 = "Surface replaced"
            r5.<init>(r6)
            r8.v(r5)
            r7.L$0 = r0
            r7.L$1 = r8
            r7.label = r3
            java.lang.Object r8 = r8.U0(r7)
            if (r8 != r4) goto L48
            goto L67
        L48:
            boolean r8 = defpackage.jgb.Y(r0)
            if (r8 == 0) goto L68
            lu0 r8 = new lu0
            r8.<init>(r0)
            nu0 r0 = r7.this$0
            nxf r0 = r0.b
            if (r0 == 0) goto L68
            oxf r3 = r7.$holder
            r7.L$0 = r1
            r7.L$1 = r1
            r7.label = r2
            java.lang.Object r7 = r0.m(r8, r3, r7)
            if (r7 != r4) goto L68
        L67:
            return r4
        L68:
            wef r7 = defpackage.wef.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mu0.r(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((mu0) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
