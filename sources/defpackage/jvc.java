package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class jvc extends czb implements l26 {
    final /* synthetic */ w42 $clicksCounter;
    final /* synthetic */ v39 $mouseSelectionObserver;
    final /* synthetic */ qne $textDragObserver;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jvc(w42 w42Var, v39 v39Var, qne qneVar, xn2 xn2Var) {
        super(2, xn2Var);
        this.$clicksCounter = w42Var;
        this.$mouseSelectionObserver = v39Var;
        this.$textDragObserver = qneVar;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        jvc jvcVar = new jvc(this.$clicksCounter, this.$mouseSelectionObserver, this.$textDragObserver, xn2Var);
        jvcVar.L$0 = obj;
        return jvcVar;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x007d  */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00b2, code lost:
    
        if (defpackage.db6.x0(r1, r2, r3, r8, r18) == r7) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00ca, code lost:
    
        if (defpackage.db6.Z0(r1, r2, r8, r18) == r7) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00d6, code lost:
    
        if (defpackage.db6.a1(r1, r2, r8, r3, r18) == r7) goto L47;
     */
    @Override // defpackage.pt0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object r(java.lang.Object r19) {
        /*
            Method dump skipped, instruction units count: 220
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jvc.r(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((jvc) k((xn2) obj2, (mbe) obj)).r(wef.a);
    }
}
