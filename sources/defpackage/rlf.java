package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class rlf extends gbe implements l26 {
    final /* synthetic */ boolean $isNewUser;
    final /* synthetic */ String $quinAuth;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ qmf this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rlf(xn2 xn2Var, qmf qmfVar, String str, boolean z) {
        super(2, xn2Var);
        this.$quinAuth = str;
        this.this$0 = qmfVar;
        this.$isNewUser = z;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        rlf rlfVar = new rlf(xn2Var, this.this$0, this.$quinAuth, this.$isNewUser);
        rlfVar.L$0 = obj;
        return rlfVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:29:0x00ca, code lost:
    
        if (r15.o(r0, r14) == r5) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00e6, code lost:
    
        if (defpackage.v38.a.a(r15, r14) == r5) goto L33;
     */
    @Override // defpackage.pt0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object r(java.lang.Object r15) {
        /*
            Method dump skipped, instruction units count: 236
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rlf.r(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((rlf) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
