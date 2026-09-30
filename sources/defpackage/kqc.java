package defpackage;

import tech.chatmind.api.seasonal.model.SolarTerm;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class kqc extends gbe implements l26 {
    final /* synthetic */ SolarTerm $solarTerm;
    final /* synthetic */ a26 $terminalOf;
    final /* synthetic */ int $year;
    int I$0;
    long J$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ lqc this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kqc(lqc lqcVar, int i, SolarTerm solarTerm, a26 a26Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = lqcVar;
        this.$year = i;
        this.$solarTerm = solarTerm;
        this.$terminalOf = a26Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        kqc kqcVar = new kqc(this.this$0, this.$year, this.$solarTerm, this.$terminalOf, xn2Var);
        kqcVar.L$0 = obj;
        return kqcVar;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:20:0x0071 A[PHI: r1 r7
  0x0071: PHI (r1v12 int) = (r1v1 int), (r1v13 int) binds: [B:19:0x0068, B:57:0x014b] A[DONT_GENERATE, DONT_INLINE]
  0x0071: PHI (r7v12 long) = (r7v0 long), (r7v13 long) binds: [B:19:0x0068, B:57:0x014b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:22:0x0075 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:24:0x007a  */
    /* JADX WARN: Code duplicated, block: B:28:0x0092 A[PHI: r1 r7
  0x0092: PHI (r1v10 int) = (r1v2 int), (r1v12 int) binds: [B:18:0x0060, B:26:0x008e] A[DONT_GENERATE, DONT_INLINE]
  0x0092: PHI (r7v11 long) = (r7v1 long), (r7v12 long) binds: [B:18:0x0060, B:26:0x008e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:31:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:32:0x00ae A[Catch: Exception -> 0x005d, PHI: r1 r7 r14
  0x00ae: PHI (r1v9 int) = (r1v3 int), (r1v11 int) binds: [B:14:0x0059, B:30:0x00aa] A[DONT_GENERATE, DONT_INLINE]
  0x00ae: PHI (r7v9 long) = (r7v2 long), (r7v11 long) binds: [B:14:0x0059, B:30:0x00aa] A[DONT_GENERATE, DONT_INLINE]
  0x00ae: PHI (r14v6 java.lang.Object) = (r14v0 java.lang.Object), (r14v21 java.lang.Object) binds: [B:14:0x0059, B:30:0x00aa] A[DONT_GENERATE, DONT_INLINE], TRY_LEAVE, TryCatch #0 {Exception -> 0x005d, blocks: (B:29:0x0093, B:32:0x00ae, B:14:0x0059), top: B:65:0x0059 }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:43:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:45:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:48:0x010d  */
    /* JADX WARN: Code duplicated, block: B:50:0x0111 A[PHI: r1 r7 r14
  0x0111: PHI (r1v6 int) = (r1v8 int), (r1v9 int) binds: [B:49:0x010f, B:44:0x00ed] A[DONT_GENERATE, DONT_INLINE]
  0x0111: PHI (r7v6 long) = (r7v8 long), (r7v9 long) binds: [B:49:0x010f, B:44:0x00ed] A[DONT_GENERATE, DONT_INLINE]
  0x0111: PHI (r14v4 upc) = (r14v5 upc), (r14v10 upc) binds: [B:49:0x010f, B:44:0x00ed] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:53:0x0128  */
    /* JADX WARN: Code duplicated, block: B:56:0x0141 A[PHI: r1 r7
  0x0141: PHI (r1v13 int) = (r1v9 int), (r1v14 int) binds: [B:54:0x013d, B:10:0x0026] A[DONT_GENERATE, DONT_INLINE]
  0x0141: PHI (r7v13 long) = (r7v9 long), (r7v14 long) binds: [B:54:0x013d, B:10:0x0026] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:58:0x014d  */
    /* JADX WARN: Code duplicated, block: B:64:0x01c7 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:54:0x013d -> B:56:0x0141). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.pt0
    public final java.lang.Object r(java.lang.Object r14) {
        /*
            Method dump skipped, instruction units count: 478
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kqc.r(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((kqc) k((xn2) obj2, (xj5) obj)).r(wef.a);
    }
}
