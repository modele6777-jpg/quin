package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class qv1 extends gbe implements l26 {
    final /* synthetic */ float $bottomOcclusion;
    final /* synthetic */ k31 $bringIntoView;
    final /* synthetic */ sw3 $density;
    final /* synthetic */ e89 $itemSize$delegate;
    final /* synthetic */ boolean $revealInViewport;
    final /* synthetic */ sdd $sharedTransitionScope;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qv1(boolean z, sdd sddVar, k31 k31Var, sw3 sw3Var, e89 e89Var, float f, xn2 xn2Var) {
        super(2, xn2Var);
        this.$revealInViewport = z;
        this.$sharedTransitionScope = sddVar;
        this.$bringIntoView = k31Var;
        this.$density = sw3Var;
        this.$itemSize$delegate = e89Var;
        this.$bottomOcclusion = f;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new qv1(this.$revealInViewport, this.$sharedTransitionScope, this.$bringIntoView, this.$density, this.$itemSize$delegate, this.$bottomOcclusion, xn2Var);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0047  */
    /* JADX WARN: Code duplicated, block: B:23:0x0060  */
    /* JADX WARN: Code duplicated, block: B:26:0x007a  */
    /* JADX WARN: Code duplicated, block: B:29:0x0092  */
    /* JADX WARN: Code duplicated, block: B:31:0x009c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x008f -> B:29:0x0092). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.pt0
    public final java.lang.Object r(java.lang.Object r13) {
        /*
            Method dump skipped, instruction units count: 218
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qv1.r(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((qv1) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
