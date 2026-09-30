package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class k3c extends gbe implements l26 {
    final /* synthetic */ l26 $launchReview;
    final /* synthetic */ x16 $onLaunchFailed;
    final /* synthetic */ o2c $ownership;
    final /* synthetic */ r0c $session;
    int I$0;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ p3c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k3c(o2c o2cVar, p3c p3cVar, r0c r0cVar, x16 x16Var, l26 l26Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.$ownership = o2cVar;
        this.this$0 = p3cVar;
        this.$session = r0cVar;
        this.$onLaunchFailed = x16Var;
        this.$launchReview = l26Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new k3c(this.$ownership, this.this$0, this.$session, this.$onLaunchFailed, this.$launchReview, xn2Var);
    }

    /* JADX WARN: Code duplicated, block: B:57:0x00da A[Catch: all -> 0x001f, CancellationException -> 0x002d, TRY_ENTER, TryCatch #0 {CancellationException -> 0x002d, blocks: (B:12:0x0028, B:85:0x016d, B:88:0x0176, B:92:0x0184, B:93:0x018b, B:18:0x0037, B:72:0x012d, B:73:0x012f, B:76:0x0135, B:80:0x0148, B:82:0x0157, B:70:0x011f, B:98:0x01a1, B:28:0x0053, B:31:0x005d, B:43:0x0096, B:45:0x009e, B:47:0x00b3, B:54:0x00ce, B:57:0x00da, B:59:0x00e0, B:34:0x0069, B:36:0x006f), top: B:107:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:59:0x00e0 A[Catch: all -> 0x001f, CancellationException -> 0x002d, TRY_LEAVE, TryCatch #0 {CancellationException -> 0x002d, blocks: (B:12:0x0028, B:85:0x016d, B:88:0x0176, B:92:0x0184, B:93:0x018b, B:18:0x0037, B:72:0x012d, B:73:0x012f, B:76:0x0135, B:80:0x0148, B:82:0x0157, B:70:0x011f, B:98:0x01a1, B:28:0x0053, B:31:0x005d, B:43:0x0096, B:45:0x009e, B:47:0x00b3, B:54:0x00ce, B:57:0x00da, B:59:0x00e0, B:34:0x0069, B:36:0x006f), top: B:107:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:65:0x0102 A[Catch: all -> 0x001f, Exception -> 0x0046, CancellationException -> 0x004a, TRY_ENTER, TryCatch #4 {all -> 0x001f, blocks: (B:7:0x001a, B:102:0x01be, B:12:0x0028, B:85:0x016d, B:88:0x0176, B:89:0x017a, B:92:0x0184, B:93:0x018b, B:99:0x01a2, B:18:0x0037, B:21:0x0041, B:68:0x0118, B:72:0x012d, B:73:0x012f, B:76:0x0135, B:77:0x013e, B:80:0x0148, B:82:0x0157, B:70:0x011f, B:98:0x01a1, B:28:0x0053, B:31:0x005d, B:43:0x0096, B:45:0x009e, B:47:0x00b3, B:54:0x00ce, B:55:0x00d2, B:57:0x00da, B:59:0x00e0, B:65:0x0102, B:34:0x0069, B:36:0x006f, B:37:0x007b, B:39:0x0084, B:40:0x0087), top: B:107:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:67:0x0116  */
    /* JADX WARN: Code duplicated, block: B:68:0x0118 A[Catch: all -> 0x001f, Exception -> 0x0046, CancellationException -> 0x004a, PHI: r6 r13
  0x0118: PHI (r6v11 imb) = (r6v5 imb), (r6v13 imb) binds: [B:66:0x0114, B:21:0x0041] A[DONT_GENERATE, DONT_INLINE]
  0x0118: PHI (r13v55 java.lang.Object) = (r13v35 java.lang.Object), (r13v0 java.lang.Object) binds: [B:66:0x0114, B:21:0x0041] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #4 {all -> 0x001f, blocks: (B:7:0x001a, B:102:0x01be, B:12:0x0028, B:85:0x016d, B:88:0x0176, B:89:0x017a, B:92:0x0184, B:93:0x018b, B:99:0x01a2, B:18:0x0037, B:21:0x0041, B:68:0x0118, B:72:0x012d, B:73:0x012f, B:76:0x0135, B:77:0x013e, B:80:0x0148, B:82:0x0157, B:70:0x011f, B:98:0x01a1, B:28:0x0053, B:31:0x005d, B:43:0x0096, B:45:0x009e, B:47:0x00b3, B:54:0x00ce, B:55:0x00d2, B:57:0x00da, B:59:0x00e0, B:65:0x0102, B:34:0x0069, B:36:0x006f, B:37:0x007b, B:39:0x0084, B:40:0x0087), top: B:107:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:72:0x012d A[Catch: all -> 0x001f, CancellationException -> 0x002d, TryCatch #0 {CancellationException -> 0x002d, blocks: (B:12:0x0028, B:85:0x016d, B:88:0x0176, B:92:0x0184, B:93:0x018b, B:18:0x0037, B:72:0x012d, B:73:0x012f, B:76:0x0135, B:80:0x0148, B:82:0x0157, B:70:0x011f, B:98:0x01a1, B:28:0x0053, B:31:0x005d, B:43:0x0096, B:45:0x009e, B:47:0x00b3, B:54:0x00ce, B:57:0x00da, B:59:0x00e0, B:34:0x0069, B:36:0x006f), top: B:107:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:76:0x0135 A[Catch: all -> 0x001f, CancellationException -> 0x002d, TRY_ENTER, TRY_LEAVE, TryCatch #0 {CancellationException -> 0x002d, blocks: (B:12:0x0028, B:85:0x016d, B:88:0x0176, B:92:0x0184, B:93:0x018b, B:18:0x0037, B:72:0x012d, B:73:0x012f, B:76:0x0135, B:80:0x0148, B:82:0x0157, B:70:0x011f, B:98:0x01a1, B:28:0x0053, B:31:0x005d, B:43:0x0096, B:45:0x009e, B:47:0x00b3, B:54:0x00ce, B:57:0x00da, B:59:0x00e0, B:34:0x0069, B:36:0x006f), top: B:107:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:80:0x0148 A[Catch: all -> 0x001f, CancellationException -> 0x002d, TRY_ENTER, TryCatch #0 {CancellationException -> 0x002d, blocks: (B:12:0x0028, B:85:0x016d, B:88:0x0176, B:92:0x0184, B:93:0x018b, B:18:0x0037, B:72:0x012d, B:73:0x012f, B:76:0x0135, B:80:0x0148, B:82:0x0157, B:70:0x011f, B:98:0x01a1, B:28:0x0053, B:31:0x005d, B:43:0x0096, B:45:0x009e, B:47:0x00b3, B:54:0x00ce, B:57:0x00da, B:59:0x00e0, B:34:0x0069, B:36:0x006f), top: B:107:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:82:0x0157 A[Catch: all -> 0x001f, CancellationException -> 0x002d, TryCatch #0 {CancellationException -> 0x002d, blocks: (B:12:0x0028, B:85:0x016d, B:88:0x0176, B:92:0x0184, B:93:0x018b, B:18:0x0037, B:72:0x012d, B:73:0x012f, B:76:0x0135, B:80:0x0148, B:82:0x0157, B:70:0x011f, B:98:0x01a1, B:28:0x0053, B:31:0x005d, B:43:0x0096, B:45:0x009e, B:47:0x00b3, B:54:0x00ce, B:57:0x00da, B:59:0x00e0, B:34:0x0069, B:36:0x006f), top: B:107:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:84:0x016c  */
    /* JADX WARN: Code duplicated, block: B:87:0x0175  */
    /* JADX WARN: Code duplicated, block: B:88:0x0176 A[Catch: all -> 0x001f, CancellationException -> 0x002d, PHI: r1
  0x0176: PHI (r1v3 boolean) = (r1v0 boolean), (r1v0 boolean), (r1v4 boolean) binds: [B:81:0x0155, B:86:0x0173, B:87:0x0175] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #0 {CancellationException -> 0x002d, blocks: (B:12:0x0028, B:85:0x016d, B:88:0x0176, B:92:0x0184, B:93:0x018b, B:18:0x0037, B:72:0x012d, B:73:0x012f, B:76:0x0135, B:80:0x0148, B:82:0x0157, B:70:0x011f, B:98:0x01a1, B:28:0x0053, B:31:0x005d, B:43:0x0096, B:45:0x009e, B:47:0x00b3, B:54:0x00ce, B:57:0x00da, B:59:0x00e0, B:34:0x0069, B:36:0x006f), top: B:107:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:91:0x0182 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:92:0x0184 A[Catch: all -> 0x001f, CancellationException -> 0x002d, TRY_ENTER, TryCatch #0 {CancellationException -> 0x002d, blocks: (B:12:0x0028, B:85:0x016d, B:88:0x0176, B:92:0x0184, B:93:0x018b, B:18:0x0037, B:72:0x012d, B:73:0x012f, B:76:0x0135, B:80:0x0148, B:82:0x0157, B:70:0x011f, B:98:0x01a1, B:28:0x0053, B:31:0x005d, B:43:0x0096, B:45:0x009e, B:47:0x00b3, B:54:0x00ce, B:57:0x00da, B:59:0x00e0, B:34:0x0069, B:36:0x006f), top: B:107:0x0009 }] */
    /* JADX WARN: Code duplicated, block: B:96:0x019c  */
    /* JADX WARN: Code restructure failed: missing block: B:100:0x01bb, code lost:
    
        if (defpackage.ynb.p0(r13, r6, r12) == r5) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0092, code lost:
    
        if (r13 == r5) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00c2, code lost:
    
        if (defpackage.pa7.t(r12.this$0.y, r12.$session) != false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00c4, code lost:
    
        r12.this$0.y = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00c8, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00f1, code lost:
    
        if (r13.d(r0, r12) == r5) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00ff, code lost:
    
        if (defpackage.pa7.t(r12.this$0.y, r12.$session) != false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0144, code lost:
    
        if (r7.g(r0, r12) == r5) goto L101;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v2 */
    /* JADX WARN: Type inference failed for: r13v58 */
    /* JADX WARN: Type inference failed for: r13v8, types: [int] */
    @Override // defpackage.pt0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object r(java.lang.Object r13) {
        /*
            Method dump skipped, instruction units count: 482
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k3c.r(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((k3c) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
