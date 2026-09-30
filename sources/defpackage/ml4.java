package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class ml4 extends gbe implements l26 {
    final /* synthetic */ n69 $autoScrollSpeed$delegate;
    final /* synthetic */ float $containerBottomY;
    final /* synthetic */ float $containerTopY;
    final /* synthetic */ s69 $draggedIndex$delegate;
    final /* synthetic */ float $edgeScrollZone;
    final /* synthetic */ n69 $fingerYPosition$delegate;
    final /* synthetic */ float $maxScrollSpeed;
    final /* synthetic */ ghc $scrollState;
    float F$0;
    int I$0;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ml4(ghc ghcVar, s69 s69Var, n69 n69Var, float f, float f2, float f3, float f4, n69 n69Var2, xn2 xn2Var) {
        super(2, xn2Var);
        this.$scrollState = ghcVar;
        this.$draggedIndex$delegate = s69Var;
        this.$fingerYPosition$delegate = n69Var;
        this.$containerBottomY = f;
        this.$containerTopY = f2;
        this.$edgeScrollZone = f3;
        this.$maxScrollSpeed = f4;
        this.$autoScrollSpeed$delegate = n69Var2;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        ml4 ml4Var = new ml4(this.$scrollState, this.$draggedIndex$delegate, this.$fingerYPosition$delegate, this.$containerBottomY, this.$containerTopY, this.$edgeScrollZone, this.$maxScrollSpeed, this.$autoScrollSpeed$delegate, xn2Var);
        ml4Var.L$0 = obj;
        return ml4Var;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0033  */
    /* JADX WARN: Code duplicated, block: B:16:0x0039  */
    /* JADX WARN: Code duplicated, block: B:21:0x005c  */
    /* JADX WARN: Code duplicated, block: B:23:0x0064  */
    /* JADX WARN: Code duplicated, block: B:26:0x006e  */
    /* JADX WARN: Code duplicated, block: B:28:0x0073  */
    /* JADX WARN: Code duplicated, block: B:39:0x00c1 A[PHI: r1
  0x00c1: PHI (r1v1 float) = (r1v9 float), (r1v9 float), (r1v9 float), (r1v11 float) binds: [B:32:0x0084, B:35:0x00a6, B:37:0x00be, B:9:0x001b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x00cd -> B:14:0x0033). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.pt0
    public final java.lang.Object r(java.lang.Object r12) {
        /*
            Method dump skipped, instruction units count: 211
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ml4.r(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((ml4) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
