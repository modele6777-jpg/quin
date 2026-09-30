package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class f23 extends gbe implements l26 {
    final /* synthetic */ a26 $block$inlined;
    final /* synthetic */ boolean $inTransaction;
    final /* synthetic */ boolean $isReadOnly;
    final /* synthetic */ w5c $this_internalPerform;
    /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f23(xn2 xn2Var, a26 a26Var, w5c w5cVar, boolean z, boolean z2) {
        super(2, xn2Var);
        this.$inTransaction = z;
        this.$isReadOnly = z2;
        this.$this_internalPerform = w5cVar;
        this.$block$inlined = a26Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        boolean z = this.$inTransaction;
        boolean z2 = this.$isReadOnly;
        f23 f23Var = new f23(xn2Var, this.$block$inlined, this.$this_internalPerform, z, z2);
        f23Var.L$0 = obj;
        return f23Var;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00a4 A[PHI: r0 r10
  0x00a4: PHI (r0v10 l2f) = (r0v7 l2f), (r0v19 l2f) binds: [B:36:0x00a1, B:14:0x0027] A[DONT_GENERATE, DONT_INLINE]
  0x00a4: PHI (r10v13 java.lang.Object) = (r10v12 java.lang.Object), (r10v0 java.lang.Object) binds: [B:36:0x00a1, B:14:0x0027] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:40:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:43:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:46:0x00be  */
    /* JADX WARN: Code duplicated, block: B:48:0x00ce A[RETURN] */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0088, code lost:
    
        if (r10.a(r9) == r7) goto L51;
     */
    @Override // defpackage.pt0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object r(java.lang.Object r10) {
        /*
            Method dump skipped, instruction units count: 219
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.f23.r(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((f23) k((xn2) obj2, (l2f) obj)).r(wef.a);
    }
}
