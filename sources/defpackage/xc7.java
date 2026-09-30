package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class xc7 extends gbe implements l26 {
    final /* synthetic */ String $code;
    final /* synthetic */ String $codeType;
    final /* synthetic */ boolean $isMember;
    final /* synthetic */ x16 $onSuccess;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ yc7 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xc7(yc7 yc7Var, String str, String str2, boolean z, x16 x16Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = yc7Var;
        this.$code = str;
        this.$codeType = str2;
        this.$isMember = z;
        this.$onSuccess = x16Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        xc7 xc7Var = new xc7(this.this$0, this.$code, this.$codeType, this.$isMember, this.$onSuccess, xn2Var);
        xc7Var.L$0 = obj;
        return xc7Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x01a6, code lost:
    
        if (r2.g(r3, r7, r6, r16) == r5) goto L65;
     */
    @Override // defpackage.pt0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object r(java.lang.Object r17) {
        /*
            Method dump skipped, instruction units count: 438
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xc7.r(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((xc7) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
