package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ghb extends gbe implements l26 {
    final /* synthetic */ String $chatId;
    final /* synthetic */ x6d $configuration;
    final /* synthetic */ String $language;
    Object L$0;
    Object L$1;
    Object L$10;
    Object L$11;
    Object L$12;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    Object L$9;
    int label;
    final /* synthetic */ ihb this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ghb(x6d x6dVar, ihb ihbVar, String str, String str2, xn2 xn2Var) {
        super(2, xn2Var);
        this.$configuration = x6dVar;
        this.this$0 = ihbVar;
        this.$language = str;
        this.$chatId = str2;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new ghb(this.$configuration, this.this$0, this.$language, this.$chatId, xn2Var);
    }

    /* JADX WARN: Code duplicated, block: B:27:0x00b3 A[Catch: Exception -> 0x0042, all -> 0x013a, CancellationException -> 0x013d, TRY_LEAVE, TryCatch #9 {Exception -> 0x0042, blocks: (B:6:0x0037, B:25:0x00ad, B:27:0x00b3, B:16:0x0053, B:19:0x006a, B:20:0x0071, B:22:0x0077, B:24:0x008f), top: B:63:0x0005 }] */
    /* JADX WARN: Code duplicated, block: B:32:0x00f3 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:33:0x00f4  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00f4 -> B:61:0x00fa). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.pt0
    public final java.lang.Object r(java.lang.Object r15) {
        /*
            Method dump skipped, instruction units count: 357
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ghb.r(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((ghb) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
