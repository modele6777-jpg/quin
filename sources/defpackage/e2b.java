package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class e2b extends gbe implements l26 {
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ f2b this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e2b(f2b f2bVar, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = f2bVar;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        e2b e2bVar = new e2b(this.this$0, xn2Var);
        e2bVar.L$0 = obj;
        return e2bVar;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0032 A[Catch: all -> 0x0016, CancellationException -> 0x00be, TRY_ENTER, TryCatch #2 {CancellationException -> 0x00be, all -> 0x0016, blocks: (B:6:0x0012, B:15:0x0032, B:17:0x0051, B:18:0x005d), top: B:38:0x0012 }] */
    /* JADX WARN: Code duplicated, block: B:17:0x0051 A[Catch: all -> 0x0016, CancellationException -> 0x00be, TryCatch #2 {CancellationException -> 0x00be, all -> 0x0016, blocks: (B:6:0x0012, B:15:0x0032, B:17:0x0051, B:18:0x005d), top: B:38:0x0012 }] */
    /* JADX WARN: Code duplicated, block: B:21:0x006b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:24:0x0076  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0069 -> B:22:0x006c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.pt0
    public final java.lang.Object r(java.lang.Object r9) {
        /*
            Method dump skipped, instruction units count: 205
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e2b.r(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((e2b) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
