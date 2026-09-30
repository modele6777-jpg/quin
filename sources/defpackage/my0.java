package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class my0 extends gbe implements l26 {
    final /* synthetic */ long $duration;
    long J$0;
    long J$1;
    int label;
    final /* synthetic */ oy0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public my0(long j, oy0 oy0Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.$duration = j;
        this.this$0 = oy0Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new my0(this.$duration, this.this$0, xn2Var);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:14:0x003e  */
    /* JADX WARN: Code duplicated, block: B:15:0x0040  */
    /* JADX WARN: Code duplicated, block: B:18:0x004a  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002c -> B:12:0x002f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:18:0x004a
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.pt0
    public final java.lang.Object r(java.lang.Object r14) {
        /*
            r13 = this;
            int r0 = r13.label
            r1 = 1000(0x3e8, double:4.94E-321)
            r3 = 0
            r5 = 1
            if (r0 == 0) goto L18
            if (r0 != r5) goto L11
            long r6 = r13.J$0
            defpackage.jzb.q(r14)
            goto L2f
        L11:
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qc0.p(r13)
            r13 = 0
            return r13
        L18:
            defpackage.jzb.q(r14)
            long r6 = java.lang.System.currentTimeMillis()
            r8 = r3
        L20:
            r13.J$0 = r6
            r13.J$1 = r8
            r13.label = r5
            java.lang.Object r14 = defpackage.vfh.q(r1, r13)
            bw2 r0 = defpackage.bw2.a
            if (r14 != r0) goto L2f
            return r0
        L2f:
            long r8 = r13.$duration
            long r10 = java.lang.System.currentTimeMillis()
            long r10 = r10 - r6
            long r10 = r10 / r1
            long r8 = r8 - r10
            oy0 r14 = r13.this$0
            int r0 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r0 >= 0) goto L40
            r10 = r3
            goto L41
        L40:
            r10 = r8
        L41:
            int r12 = defpackage.oy0.g
            tz9 r14 = r14.c
            r14.k(r10)
            if (r0 > 0) goto L20
            wef r13 = defpackage.wef.a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.my0.r(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((my0) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
