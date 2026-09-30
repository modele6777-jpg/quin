package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class enf extends gbe implements l26 {
    final /* synthetic */ long $generation;
    final /* synthetic */ cnf $key;
    int I$0;
    int I$1;
    int I$2;
    long J$0;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ inf this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public enf(inf infVar, cnf cnfVar, long j, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = infVar;
        this.$key = cnfVar;
        this.$generation = j;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new enf(this.this$0, this.$key, this.$generation, xn2Var);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(4:92|27|(11:30|22|97|31|32|96|33|f3|(1:45)(2:46|(1:48)(4:49|(1:51)|52|55))|59|(2:61|62)(2:66|67))|80) */
    /* JADX WARN: Code duplicated, block: B:30:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:37:0x00fe A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:38:0x00ff A[Catch: all -> 0x017c, TRY_LEAVE, TryCatch #4 {, blocks: (B:35:0x00f4, B:38:0x00ff), top: B:94:0x00f4, outer: #6 }] */
    /* JADX WARN: Code duplicated, block: B:45:0x010e  */
    /* JADX WARN: Code duplicated, block: B:46:0x0110 A[Catch: all -> 0x013f, TryCatch #6 {all -> 0x013f, blocks: (B:33:0x00f1, B:34:0x00f3, B:43:0x010b, B:46:0x0110, B:49:0x012a, B:51:0x013a, B:55:0x0141, B:69:0x017d, B:70:0x017e, B:35:0x00f4, B:38:0x00ff), top: B:96:0x00f1, inners: #4 }] */
    /* JADX WARN: Code duplicated, block: B:48:0x0128  */
    /* JADX WARN: Code duplicated, block: B:49:0x012a A[Catch: all -> 0x013f, PHI: r0 r4 r9 r10 r11 r13 r14 r15 r17
  0x012a: PHI (r0v13 java.lang.Object) = (r0v31 java.lang.Object), (r0v41 java.lang.Object) binds: [B:47:0x0126, B:18:0x0089] A[DONT_GENERATE, DONT_INLINE]
  0x012a: PHI (r4v4 inf) = (r4v5 inf), (r4v7 inf) binds: [B:47:0x0126, B:18:0x0089] A[DONT_GENERATE, DONT_INLINE]
  0x012a: PHI (r9v7 int) = (r9v8 int), (r9v11 int) binds: [B:47:0x0126, B:18:0x0089] A[DONT_GENERATE, DONT_INLINE]
  0x012a: PHI (r10v3 int) = (r10v4 int), (r10v7 int) binds: [B:47:0x0126, B:18:0x0089] A[DONT_GENERATE, DONT_INLINE]
  0x012a: PHI (r11v8 long) = (r11v9 long), (r11v11 long) binds: [B:47:0x0126, B:18:0x0089] A[DONT_GENERATE, DONT_INLINE]
  0x012a: PHI (r13v2 int) = (r13v3 int), (r13v4 int) binds: [B:47:0x0126, B:18:0x0089] A[DONT_GENERATE, DONT_INLINE]
  0x012a: PHI (r14v5 d99) = (r14v7 d99), (r14v10 d99) binds: [B:47:0x0126, B:18:0x0089] A[DONT_GENERATE, DONT_INLINE]
  0x012a: PHI (r15v4 cnf) = (r15v5 cnf), (r15v7 cnf) binds: [B:47:0x0126, B:18:0x0089] A[DONT_GENERATE, DONT_INLINE]
  0x012a: PHI (r17v4 int) = (r17v6 int), (r17v8 int) binds: [B:47:0x0126, B:18:0x0089] A[DONT_GENERATE, DONT_INLINE], TryCatch #6 {all -> 0x013f, blocks: (B:33:0x00f1, B:34:0x00f3, B:43:0x010b, B:46:0x0110, B:49:0x012a, B:51:0x013a, B:55:0x0141, B:69:0x017d, B:70:0x017e, B:35:0x00f4, B:38:0x00ff), top: B:96:0x00f1, inners: #4 }] */
    /* JADX WARN: Code duplicated, block: B:51:0x013a A[Catch: all -> 0x013f, TryCatch #6 {all -> 0x013f, blocks: (B:33:0x00f1, B:34:0x00f3, B:43:0x010b, B:46:0x0110, B:49:0x012a, B:51:0x013a, B:55:0x0141, B:69:0x017d, B:70:0x017e, B:35:0x00f4, B:38:0x00ff), top: B:96:0x00f1, inners: #4 }] */
    /* JADX WARN: Code duplicated, block: B:61:0x016e A[Catch: Exception -> 0x0171, CancellationException -> 0x01c0, TryCatch #1 {CancellationException -> 0x01c0, blocks: (B:27:0x00cb, B:59:0x0169, B:61:0x016e, B:66:0x0179, B:73:0x0182, B:74:0x0185, B:20:0x00a9), top: B:90:0x000b }] */
    /* JADX WARN: Code duplicated, block: B:66:0x0179 A[Catch: Exception -> 0x0171, CancellationException -> 0x01c0, TRY_LEAVE, TryCatch #1 {CancellationException -> 0x01c0, blocks: (B:27:0x00cb, B:59:0x0169, B:61:0x016e, B:66:0x0179, B:73:0x0182, B:74:0x0185, B:20:0x00a9), top: B:90:0x000b }] */
    /* JADX WARN: Code duplicated, block: B:78:0x0190  */
    /* JADX WARN: Code duplicated, block: B:81:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:83:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:86:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:92:0x00cb A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:94:0x00f4 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0164, code lost:
    
        if (r4.e(r0, r24) == r2) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0177, code lost:
    
        r3 = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0186, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0187, code lost:
    
        r17 = r7;
        r4 = r9;
        r9 = r10;
        r15 = r11;
        r11 = r14;
     */
    /* JADX WARN: Not initialized variable reg: 11, insn: 0x0172: MOVE (r22 I:??[long, double]) = (r11 I:??[long, double]) (LINE:371), block:B:64:0x0172 */
    /* JADX WARN: Not initialized variable reg: 13, insn: 0x0174: MOVE (r11 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) = (r13 I:??[int, float, boolean, short, byte, char, OBJECT, ARRAY]) (LINE:373), block:B:64:0x0172 */
    /* JADX WARN: Not initialized variable reg: 16, insn: 0x0066: MOVE (r4 I:??[OBJECT, ARRAY]) = (r16 I:??[OBJECT, ARRAY]) (LINE:103), block:B:15:0x0064 */
    @Override // defpackage.pt0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object r(java.lang.Object r25) throws java.lang.Exception {
        /*
            Method dump skipped, instruction units count: 453
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.enf.r(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((enf) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
