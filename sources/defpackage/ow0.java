package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ow0 extends czb implements l26 {
    final /* synthetic */ aw2 $$this$coroutineScope;
    final /* synthetic */ d0f $state;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ow0(aw2 aw2Var, d0f d0fVar, xn2 xn2Var) {
        super(2, xn2Var);
        this.$$this$coroutineScope = aw2Var;
        this.$state = d0fVar;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        ow0 ow0Var = new ow0(this.$$this$coroutineScope, this.$state, xn2Var);
        ow0Var.L$0 = obj;
        return ow0Var;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0032 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:14:0x0043  */
    /* JADX WARN: Code duplicated, block: B:16:0x0048  */
    /* JADX WARN: Code duplicated, block: B:17:0x0056  */
    /* JADX WARN: Code duplicated, block: B:19:0x0059  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0030 -> B:12:0x0033). Please report as a decompilation issue!!! */
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
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L1a
            if (r0 != r2) goto L14
            java.lang.Object r0 = r6.L$1
            iia r0 = (defpackage.iia) r0
            java.lang.Object r3 = r6.L$0
            mbe r3 = (defpackage.mbe) r3
            defpackage.jzb.q(r7)
            goto L33
        L14:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qc0.p(r6)
            return r1
        L1a:
            defpackage.jzb.q(r7)
            java.lang.Object r7 = r6.L$0
            mbe r7 = (defpackage.mbe) r7
            iia r0 = defpackage.iia.b
            r3 = r7
        L24:
            r6.L$0 = r3
            r6.L$1 = r0
            r6.label = r2
            java.lang.Object r7 = r3.a(r0, r6)
            bw2 r4 = defpackage.bw2.a
            if (r7 != r4) goto L33
            return r4
        L33:
            hia r7 = (defpackage.hia) r7
            java.util.List r4 = r7.a
            r5 = 0
            java.lang.Object r4 = r4.get(r5)
            oia r4 = (defpackage.oia) r4
            int r4 = r4.i
            r5 = 2
            if (r4 != r5) goto L24
            int r7 = r7.f
            r4 = 4
            if (r7 != r4) goto L56
            aw2 r7 = r6.$$this$coroutineScope
            nw0 r4 = new nw0
            d0f r5 = r6.$state
            r4.<init>(r5, r1)
            r5 = 3
            defpackage.ynb.V(r7, r1, r1, r4, r5)
            goto L24
        L56:
            r4 = 5
            if (r7 != r4) goto L24
            d0f r7 = r6.$state
            h0f r7 = (defpackage.h0f) r7
            r7.a()
            goto L24
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ow0.r(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        ((ow0) k((xn2) obj2, (mbe) obj)).r(wef.a);
        return bw2.a;
    }
}
