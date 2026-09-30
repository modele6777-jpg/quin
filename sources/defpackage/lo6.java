package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class lo6 extends gbe implements l26 {
    final /* synthetic */ h73 $compactTooltipFocus;
    final /* synthetic */ jx $tooltipFadeProgress;
    final /* synthetic */ jx $tooltipPulseProgress;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lo6(jx jxVar, h73 h73Var, jx jxVar2, xn2 xn2Var) {
        super(2, xn2Var);
        this.$tooltipPulseProgress = jxVar;
        this.$compactTooltipFocus = h73Var;
        this.$tooltipFadeProgress = jxVar2;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        lo6 lo6Var = new lo6(this.$tooltipPulseProgress, this.$compactTooltipFocus, this.$tooltipFadeProgress, xn2Var);
        lo6Var.L$0 = obj;
        return lo6Var;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x006e A[PHI: r0
  0x006e: PHI (r0v7 aw2) = (r0v1 aw2), (r0v3 aw2), (r0v1 aw2) binds: [B:24:0x0064, B:35:0x00cd, B:9:0x001c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:27:0x0075  */
    /* JADX WARN: Code duplicated, block: B:30:0x0096 A[PHI: r14
  0x0096: PHI (r14v0 aw2) = (r14v1 aw2), (r14v2 aw2) binds: [B:28:0x0093, B:13:0x002b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:33:0x00b5  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:35:0x00cd -> B:25:0x006e). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.pt0
    public final java.lang.Object r(java.lang.Object r16) {
        /*
            Method dump skipped, instruction units count: 211
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lo6.r(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((lo6) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
