package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class rxd extends gbe implements l26 {
    final /* synthetic */ xj5 $$this$flow;
    final /* synthetic */ wg7 $json;
    final /* synthetic */ a26 $makeRequest;
    int I$0;
    int I$1;
    int I$2;
    private /* synthetic */ Object L$0;
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rxd(xj5 xj5Var, a26 a26Var, wg7 wg7Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.$$this$flow = xj5Var;
        this.$makeRequest = a26Var;
        this.$json = wg7Var;
    }

    public static final Object A(mmb mmbVar, StringBuilder sb, wg7 wg7Var, xj5 xj5Var, imb imbVar, aw2 aw2Var, String str, rxd rxdVar) {
        if (!c5e.C(str, ":", false)) {
            if (c5e.C(str, "event:", false)) {
                mmbVar.element = v4e.o0(v4e.Y("event:", str)).toString();
            } else if (c5e.C(str, "data:", false)) {
                if (sb.length() > 0) {
                    sb.append("\n");
                }
                sb.append(v4e.o0(v4e.Y("data:", str)).toString());
            } else {
                if (v4e.Q(str) && mmbVar.element != null) {
                    return x(mmbVar, wg7Var, sb, xj5Var, imbVar, aw2Var, rxdVar);
                }
                if (v4e.Q(str)) {
                    sb.getClass();
                    sb.setLength(0);
                    mmbVar.element = null;
                }
            }
        }
        return wef.a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x01b9, code lost:
    
        if (r9.a(r7, r0) == r12) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x01da, code lost:
    
        if (r9.a(r7, r0) == r12) goto L96;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object x(defpackage.mmb r6, defpackage.wg7 r7, java.lang.StringBuilder r8, defpackage.xj5 r9, defpackage.imb r10, defpackage.aw2 r11, defpackage.zn2 r12) {
        /*
            Method dump skipped, instruction units count: 508
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rxd.x(mmb, wg7, java.lang.StringBuilder, xj5, imb, aw2, zn2):java.lang.Object");
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        rxd rxdVar = new rxd(this.$$this$flow, this.$makeRequest, this.$json, xn2Var);
        rxdVar.L$0 = obj;
        return rxdVar;
    }

    /* JADX WARN: Code duplicated, block: B:119:0x0183 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:51:0x0167  */
    /* JADX WARN: Code duplicated, block: B:54:0x0171  */
    /* JADX WARN: Code duplicated, block: B:56:0x0175 A[Catch: all -> 0x017a, TryCatch #5 {all -> 0x017a, blocks: (B:64:0x01c2, B:52:0x0169, B:56:0x0175, B:60:0x0183), top: B:115:0x01c2 }] */
    /* JADX WARN: Code duplicated, block: B:62:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:63:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:66:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:68:0x01d5  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v1 */
    /* JADX WARN: Type inference failed for: r10v13 */
    /* JADX WARN: Type inference failed for: r10v2, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r10v20 */
    /* JADX WARN: Type inference failed for: r10v23 */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v31 */
    /* JADX WARN: Type inference failed for: r1v40 */
    /* JADX WARN: Type inference failed for: r8v17, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r8v18 */
    /* JADX WARN: Type inference failed for: r8v21 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:63:0x01ba -> B:115:0x01c2). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:70:0x01e9 -> B:67:0x01d1). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.pt0
    public final java.lang.Object r(java.lang.Object r20) {
        /*
            Method dump skipped, instruction units count: 674
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rxd.r(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((rxd) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
