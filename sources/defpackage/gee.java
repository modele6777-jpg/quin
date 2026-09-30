package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class gee extends czb implements l26 {
    final /* synthetic */ oia $firstUp;
    long J$0;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gee(oia oiaVar, xn2 xn2Var) {
        super(2, xn2Var);
        this.$firstUp = oiaVar;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        gee geeVar = new gee(this.$firstUp, xn2Var);
        geeVar.L$0 = obj;
        return geeVar;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x003e A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:14:0x0047 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x003c -> B:12:0x003f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:0:?
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.pt0
    public final java.lang.Object r(java.lang.Object r7) {
        /*
            r6 = this;
            int r0 = r6.label
            r1 = 1
            if (r0 == 0) goto L18
            if (r0 != r1) goto L11
            long r2 = r6.J$0
            java.lang.Object r0 = r6.L$0
            mbe r0 = (defpackage.mbe) r0
            defpackage.jzb.q(r7)
            goto L3f
        L11:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qc0.p(r6)
            r6 = 0
            return r6
        L18:
            defpackage.jzb.q(r7)
            java.lang.Object r7 = r6.L$0
            mbe r7 = (defpackage.mbe) r7
            oia r0 = r6.$firstUp
            long r2 = r0.b
            rvf r0 = r7.c()
            r0.getClass()
            r4 = 40
            long r4 = r4 + r2
            r0 = r7
            r2 = r4
        L2f:
            r6.L$0 = r0
            r6.J$0 = r2
            r6.label = r1
            r7 = 3
            java.lang.Object r7 = defpackage.ffe.b(r0, r6, r7)
            bw2 r4 = defpackage.bw2.a
            if (r7 != r4) goto L3f
            return r4
        L3f:
            oia r7 = (defpackage.oia) r7
            long r4 = r7.b
            int r4 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r4 < 0) goto L2f
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gee.r(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((gee) k((xn2) obj2, (mbe) obj)).r(wef.a);
    }
}
