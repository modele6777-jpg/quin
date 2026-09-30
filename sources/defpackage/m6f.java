package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class m6f extends gbe implements l26 {
    final /* synthetic */ long $activeSession;
    final /* synthetic */ String $chatId;
    Object L$0;
    int label;
    final /* synthetic */ t6f this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m6f(t6f t6fVar, String str, long j, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = t6fVar;
        this.$chatId = str;
        this.$activeSession = j;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new m6f(this.this$0, this.$chatId, this.$activeSession, xn2Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x009f, code lost:
    
        if (((defpackage.bp3) r8).l(r6, r11, r17) == r7) goto L39;
     */
    @Override // defpackage.pt0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object r(java.lang.Object r18) {
        /*
            Method dump skipped, instruction units count: 214
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m6f.r(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((m6f) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
