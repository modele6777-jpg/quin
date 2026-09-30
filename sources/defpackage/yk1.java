package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class yk1 extends gbe implements l26 {
    final /* synthetic */ xae $scope;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yk1(xae xaeVar, xn2 xn2Var) {
        super(2, xn2Var);
        this.$scope = xaeVar;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        yk1 yk1Var = new yk1(this.$scope, xn2Var);
        yk1Var.L$0 = obj;
        return yk1Var;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0064  */
    /* JADX WARN: Code duplicated, block: B:22:0x008c  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0093, code lost:
    
        if (defpackage.jgb.Y(r12) == false) goto L25;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:22:0x008c -> B:7:0x001d). Please report as a decompilation issue!!! */
    @Override // defpackage.pt0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object r(java.lang.Object r12) {
        /*
            r11 = this;
            int r0 = r11.label
            r1 = 0
            r2 = 2
            r3 = 1
            bw2 r4 = defpackage.bw2.a
            if (r0 == 0) goto L38
            if (r0 == r3) goto L26
            if (r0 != r2) goto L20
            java.lang.Object r0 = r11.L$2
            k41 r0 = (defpackage.k41) r0
            java.lang.Object r5 = r11.L$1
            xae r5 = (defpackage.xae) r5
            java.lang.Object r6 = r11.L$0
            rxf r6 = (defpackage.rxf) r6
            defpackage.jzb.q(r12)
            r12 = r6
        L1d:
            r6 = r0
            goto L8f
        L20:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qc0.p(r11)
            return r1
        L26:
            java.lang.Object r0 = r11.L$2
            k41 r0 = (defpackage.k41) r0
            java.lang.Object r5 = r11.L$1
            xae r5 = (defpackage.xae) r5
            java.lang.Object r6 = r11.L$0
            rxf r6 = (defpackage.rxf) r6
            defpackage.jzb.q(r12)
            r8 = r6
        L36:
            r6 = r5
            goto L5c
        L38:
            defpackage.jzb.q(r12)
            java.lang.Object r12 = r11.L$0
            rxf r12 = (defpackage.rxf) r12
            xae r0 = r11.$scope
            r41 r5 = r0.b
            k41 r6 = new k41
            r6.<init>(r5)
            r5 = r0
        L49:
            r11.L$0 = r12
            r11.L$1 = r5
            r11.L$2 = r6
            r11.label = r3
            java.lang.Object r0 = r6.b(r11)
            if (r0 != r4) goto L58
            goto L8b
        L58:
            r8 = r12
            r12 = r0
            r0 = r6
            goto L36
        L5c:
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            if (r12 == 0) goto L95
            java.lang.Object r12 = r0.c()
            r7 = r12
            wae r7 = (defpackage.wae) r7
            xk1 r12 = new xk1
            r12.<init>(r7, r1)
            r5 = 3
            lyd r9 = defpackage.ynb.V(r8, r1, r1, r12, r5)
            fg9 r12 = defpackage.fg9.b
            wk1 r5 = new wk1
            r10 = 0
            r5.<init>(r6, r7, r8, r9, r10)
            r11.L$0 = r8
            r11.L$1 = r6
            r11.L$2 = r0
            r11.label = r2
            java.lang.Object r12 = defpackage.ynb.p0(r12, r5, r11)
            if (r12 != r4) goto L8c
        L8b:
            return r4
        L8c:
            r5 = r6
            r12 = r8
            goto L1d
        L8f:
            boolean r0 = defpackage.jgb.Y(r12)
            if (r0 != 0) goto L49
        L95:
            wef r11 = defpackage.wef.a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yk1.r(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((yk1) k((xn2) obj2, (rxf) obj)).r(wef.a);
    }
}
