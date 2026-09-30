package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class b2f extends gbe implements l26 {
    final /* synthetic */ mmb $targetScrollDelta;
    final /* synthetic */ gic $this_dispatchTrackpadScroll;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ d2f this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b2f(d2f d2fVar, gic gicVar, mmb mmbVar, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = d2fVar;
        this.$this_dispatchTrackpadScroll = gicVar;
        this.$targetScrollDelta = mmbVar;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        b2f b2fVar = new b2f(this.this$0, this.$this_dispatchTrackpadScroll, this.$targetScrollDelta, xn2Var);
        b2fVar.L$0 = obj;
        return b2fVar;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0059  */
    /* JADX WARN: Code duplicated, block: B:13:0x0070 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:16:0x00ad  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x006e -> B:14:0x0071). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:11:0x0059
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.pt0
    public final java.lang.Object r(java.lang.Object r18) {
        /*
            Method dump skipped, instruction units count: 268
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b2f.r(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((b2f) k((xn2) obj2, (dic) obj)).r(wef.a);
    }
}
