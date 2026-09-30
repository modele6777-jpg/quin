package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ao9 extends gbe implements l26 {
    final /* synthetic */ String $accountId;
    final /* synthetic */ ma8 $birthday;
    final /* synthetic */ boolean $edited;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ bo9 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ao9(ma8 ma8Var, bo9 bo9Var, boolean z, String str, xn2 xn2Var) {
        super(2, xn2Var);
        this.$birthday = ma8Var;
        this.this$0 = bo9Var;
        this.$edited = z;
        this.$accountId = str;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new ao9(this.$birthday, this.this$0, this.$edited, this.$accountId, xn2Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x008c, code lost:
    
        if (r9 == r5) goto L29;
     */
    /* JADX WARN: Type inference failed for: r0v0, types: [int, java.lang.Object] */
    @Override // defpackage.pt0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object r(java.lang.Object r9) {
        /*
            Method dump skipped, instruction units count: 212
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ao9.r(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((ao9) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
