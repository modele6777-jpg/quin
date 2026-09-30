package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class wg8 extends gbe implements l26 {
    final /* synthetic */ sh8 $cancellationBehavior;
    final /* synthetic */ int $iteration;
    final /* synthetic */ int $iterations;
    final /* synthetic */ dg7 $parentJob;
    int label;
    final /* synthetic */ eh8 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wg8(sh8 sh8Var, dg7 dg7Var, int i, int i2, eh8 eh8Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.$cancellationBehavior = sh8Var;
        this.$parentJob = dg7Var;
        this.$iterations = i;
        this.$iteration = i2;
        this.this$0 = eh8Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new wg8(this.$cancellationBehavior, this.$parentJob, this.$iterations, this.$iteration, this.this$0, xn2Var);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0021  */
    /* JADX WARN: Code duplicated, block: B:15:0x002f A[ADDED_TO_REGION, REMOVE] */
    /* JADX WARN: Code duplicated, block: B:18:0x003d  */
    /* JADX WARN: Code duplicated, block: B:19:0x0047  */
    /* JADX WARN: Code duplicated, block: B:22:0x005c A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:25:0x0065  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x005a -> B:23:0x005d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:11:0x0021
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.pt0
    public final java.lang.Object r(java.lang.Object r4) {
        /*
            r3 = this;
            int r0 = r3.label
            r1 = 1
            if (r0 == 0) goto L12
            if (r0 != r1) goto Lb
            defpackage.jzb.q(r4)
            goto L5d
        Lb:
            java.lang.String r3 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qc0.p(r3)
            r3 = 0
            return r3
        L12:
            defpackage.jzb.q(r4)
        L15:
            sh8 r4 = r3.$cancellationBehavior
            int[] r0 = defpackage.vg8.a
            int r4 = r4.ordinal()
            r4 = r0[r4]
            if (r4 != r1) goto L2f
            dg7 r4 = r3.$parentJob
            boolean r4 = r4.b()
            if (r4 == 0) goto L2c
            int r4 = r3.$iterations
            goto L31
        L2c:
            int r4 = r3.$iteration
            goto L31
        L2f:
            int r4 = r3.$iterations
        L31:
            eh8 r0 = r3.this$0
            r3.label = r1
            r0.getClass()
            r2 = 2147483647(0x7fffffff, float:NaN)
            if (r4 != r2) goto L47
            yg8 r2 = new yg8
            r2.<init>(r0, r4)
            java.lang.Object r4 = defpackage.y41.W(r2, r3)
            goto L58
        L47:
            zg8 r2 = new zg8
            r2.<init>(r0, r4)
            pv2 r4 = r3.getContext()
            z09 r4 = defpackage.tm7.J(r4)
            java.lang.Object r4 = r4.g0(r3, r2)
        L58:
            bw2 r0 = defpackage.bw2.a
            if (r4 != r0) goto L5d
            return r0
        L5d:
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 != 0) goto L15
            wef r3 = defpackage.wef.a
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.wg8.r(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((wg8) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
