package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ib9 extends gbe implements l26 {
    final /* synthetic */ se2 $composeNavigator;
    final /* synthetic */ h0e $currentBackStack$delegate;
    final /* synthetic */ e89 $inPredictiveBack$delegate;
    final /* synthetic */ n69 $progress$delegate;
    /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ib9(se2 se2Var, h0e h0eVar, n69 n69Var, e89 e89Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.$composeNavigator = se2Var;
        this.$currentBackStack$delegate = h0eVar;
        this.$progress$delegate = n69Var;
        this.$inPredictiveBack$delegate = e89Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        ib9 ib9Var = new ib9(this.$composeNavigator, this.$currentBackStack$delegate, this.$progress$delegate, this.$inPredictiveBack$delegate, xn2Var);
        ib9Var.L$0 = obj;
        return ib9Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0094, code lost:
    
        if (r9.b(r2, r8) == r4) goto L24;
     */
    @Override // defpackage.pt0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object r(java.lang.Object r9) {
        /*
            r8 = this;
            int r0 = r8.label
            wef r1 = defpackage.wef.a
            r2 = 1
            r3 = 2
            if (r0 == 0) goto L23
            if (r0 == r2) goto L1f
            if (r0 != r3) goto L18
            java.lang.Object r0 = r8.L$0
            da9 r0 = (defpackage.da9) r0
            defpackage.jzb.q(r9)     // Catch: java.lang.Throwable -> L15
            goto L97
        L15:
            r9 = move-exception
            goto La5
        L18:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qc0.p(r8)
            r8 = 0
            return r8
        L1f:
            defpackage.jzb.q(r9)
            return r1
        L23:
            defpackage.jzb.q(r9)
            java.lang.Object r9 = r8.L$0
            wj5 r9 = (defpackage.wj5) r9
            h0e r0 = r8.$currentBackStack$delegate
            java.lang.Object r0 = r0.getValue()
            java.util.List r0 = (java.util.List) r0
            int r0 = r0.size()
            bw2 r4 = defpackage.bw2.a
            if (r0 >= r3) goto L46
            r8.label = r2
            hb9 r0 = defpackage.hb9.a
            java.lang.Object r8 = r9.b(r0, r8)
            if (r8 != r4) goto L45
            goto L96
        L45:
            return r1
        L46:
            n69 r0 = r8.$progress$delegate
            r2 = 0
            qz9 r0 = (defpackage.qz9) r0
            r0.k(r2)
            h0e r0 = r8.$currentBackStack$delegate
            java.lang.Object r0 = r0.getValue()
            java.util.List r0 = (java.util.List) r0
            java.lang.Object r0 = defpackage.s72.F0(r0)
            da9 r0 = (defpackage.da9) r0
            se2 r2 = r8.$composeNavigator
            r2.g(r0)
            h0e r2 = r8.$currentBackStack$delegate
            java.lang.Object r2 = r2.getValue()
            java.util.List r2 = (java.util.List) r2
            h0e r5 = r8.$currentBackStack$delegate
            java.lang.Object r5 = r5.getValue()
            java.util.List r5 = (java.util.List) r5
            int r5 = r5.size()
            int r5 = r5 - r3
            java.lang.Object r2 = r2.get(r5)
            da9 r2 = (defpackage.da9) r2
            se2 r5 = r8.$composeNavigator
            r5.g(r2)
            qb1 r2 = new qb1     // Catch: java.lang.Throwable -> L15
            e89 r5 = r8.$inPredictiveBack$delegate     // Catch: java.lang.Throwable -> L15
            n69 r6 = r8.$progress$delegate     // Catch: java.lang.Throwable -> L15
            r7 = 8
            r2.<init>(r7, r5, r6)     // Catch: java.lang.Throwable -> L15
            r8.L$0 = r0     // Catch: java.lang.Throwable -> L15
            r8.label = r3     // Catch: java.lang.Throwable -> L15
            java.lang.Object r9 = r9.b(r2, r8)     // Catch: java.lang.Throwable -> L15
            if (r9 != r4) goto L97
        L96:
            return r4
        L97:
            se2 r9 = r8.$composeNavigator     // Catch: java.lang.Throwable -> L15
            r2 = 0
            r9.e(r0, r2)     // Catch: java.lang.Throwable -> L15
            e89 r8 = r8.$inPredictiveBack$delegate
            java.lang.Boolean r9 = java.lang.Boolean.FALSE
            r8.setValue(r9)
            return r1
        La5:
            e89 r8 = r8.$inPredictiveBack$delegate
            java.lang.Boolean r0 = java.lang.Boolean.FALSE
            r8.setValue(r0)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ib9.r(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((ib9) k((xn2) obj2, (wj5) obj)).r(wef.a);
    }
}
