package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class roa extends gbe implements l26 {
    final /* synthetic */ String $assetId;
    final /* synthetic */ byte[] $audioData;
    Object L$0;
    Object L$1;
    boolean Z$0;
    int label;
    final /* synthetic */ soa this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public roa(soa soaVar, String str, byte[] bArr, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = soaVar;
        this.$assetId = str;
        this.$audioData = bArr;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new roa(this.this$0, this.$assetId, this.$audioData, xn2Var);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x011f A[Catch: Exception -> 0x002f, SocketTimeoutException -> 0x0032, CancellationException -> 0x026c, TRY_ENTER, TryCatch #2 {SocketTimeoutException -> 0x0032, CancellationException -> 0x026c, Exception -> 0x002f, blocks: (B:8:0x0028, B:39:0x0176, B:41:0x017c, B:43:0x0197, B:47:0x01e1, B:49:0x01f5, B:17:0x0044, B:31:0x0115, B:34:0x011f, B:36:0x013a, B:18:0x004b, B:24:0x00af, B:26:0x00b5, B:28:0x00d0, B:21:0x0054), top: B:56:0x0018 }] */
    /* JADX WARN: Code duplicated, block: B:36:0x013a A[Catch: Exception -> 0x002f, SocketTimeoutException -> 0x0032, CancellationException -> 0x026c, TryCatch #2 {SocketTimeoutException -> 0x0032, CancellationException -> 0x026c, Exception -> 0x002f, blocks: (B:8:0x0028, B:39:0x0176, B:41:0x017c, B:43:0x0197, B:47:0x01e1, B:49:0x01f5, B:17:0x0044, B:31:0x0115, B:34:0x011f, B:36:0x013a, B:18:0x004b, B:24:0x00af, B:26:0x00b5, B:28:0x00d0, B:21:0x0054), top: B:56:0x0018 }] */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0173, code lost:
    
        if (r4 == r15) goto L38;
     */
    @Override // defpackage.pt0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object r(java.lang.Object r17) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 622
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.roa.r(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((roa) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
