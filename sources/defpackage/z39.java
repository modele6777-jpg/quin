package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class z39 extends gbe implements l26 {
    final /* synthetic */ mmb $animationState;
    final /* synthetic */ float $speed;
    final /* synthetic */ mmb $targetScrollDelta;
    final /* synthetic */ jmb $targetValue;
    final /* synthetic */ gic $this_dispatchMouseWheelScroll;
    final /* synthetic */ float $threshold;
    int I$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ d49 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z39(jmb jmbVar, mmb mmbVar, mmb mmbVar2, float f, d49 d49Var, float f2, gic gicVar, xn2 xn2Var) {
        super(2, xn2Var);
        this.$targetValue = jmbVar;
        this.$animationState = mmbVar;
        this.$targetScrollDelta = mmbVar2;
        this.$threshold = f;
        this.this$0 = d49Var;
        this.$speed = f2;
        this.$this_dispatchMouseWheelScroll = gicVar;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        z39 z39Var = new z39(this.$targetValue, this.$animationState, this.$targetScrollDelta, this.$threshold, this.this$0, this.$speed, this.$this_dispatchMouseWheelScroll, xn2Var);
        z39Var.L$0 = obj;
        return z39Var;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0067  */
    /* JADX WARN: Code duplicated, block: B:17:0x008b  */
    /* JADX WARN: Code duplicated, block: B:19:0x0095  */
    /* JADX WARN: Code duplicated, block: B:31:0x015d  */
    /* JADX WARN: Code duplicated, block: B:34:0x0182  */
    /* JADX WARN: Code duplicated, block: B:41:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:46:0x01b4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:47:0x01c5 A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x0182 -> B:35:0x0184). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:37:0x0190 -> B:36:0x018d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.pt0
    public final java.lang.Object r(java.lang.Object r22) {
        /*
            Method dump skipped, instruction units count: 454
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z39.r(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((z39) k((xn2) obj2, (dic) obj)).r(wef.a);
    }
}
