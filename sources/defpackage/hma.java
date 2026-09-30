package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class hma extends gbe implements l26 {
    final /* synthetic */ long $preparationGeneration;
    final /* synthetic */ String $requestAccountId;
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
    final /* synthetic */ mma this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hma(mma mmaVar, String str, long j, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = mmaVar;
        this.$requestAccountId = str;
        this.$preparationGeneration = j;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new hma(this.this$0, this.$requestAccountId, this.$preparationGeneration, xn2Var);
    }

    /* JADX WARN: Code duplicated, block: B:41:0x010b A[Catch: Exception -> 0x002d, CancellationException -> 0x0333, TryCatch #6 {CancellationException -> 0x0333, Exception -> 0x002d, blocks: (B:7:0x0028, B:114:0x02fc, B:115:0x030a, B:125:0x031b, B:127:0x031d, B:128:0x031e, B:12:0x0062, B:102:0x0291, B:104:0x0299, B:96:0x0259, B:98:0x025f, B:106:0x029e, B:107:0x02be, B:109:0x02c4, B:110:0x02d2, B:15:0x0077, B:95:0x0243, B:18:0x0088, B:77:0x0203, B:78:0x020e, B:80:0x0213, B:83:0x0217, B:85:0x0221, B:88:0x0228, B:91:0x022e, B:92:0x0230, B:130:0x0320, B:131:0x0321, B:74:0x01ec, B:73:0x01e1, B:132:0x0322, B:28:0x00ac, B:54:0x0192, B:55:0x01a0, B:66:0x01b3, B:68:0x01b6, B:133:0x0323, B:134:0x0324, B:31:0x00d3, B:44:0x0131, B:39:0x0105, B:41:0x010b, B:47:0x013d, B:48:0x015d, B:50:0x0163, B:51:0x0171, B:46:0x0139, B:32:0x00d7, B:38:0x00f1, B:35:0x00de, B:56:0x01a1, B:58:0x01a7, B:62:0x01ad, B:116:0x030b, B:118:0x0311, B:121:0x0316, B:79:0x020f, B:21:0x0099, B:70:0x01be), top: B:146:0x0007, inners: #0, #4, #6, #7 }] */
    /* JADX WARN: Code duplicated, block: B:43:0x012f  */
    /* JADX WARN: Code duplicated, block: B:44:0x0131 A[Catch: Exception -> 0x002d, CancellationException -> 0x0333, PHI: r1 r4 r5 r6 r7 r8 r13
  0x0131: PHI (r1v18 java.lang.Object) = (r1v17 java.lang.Object), (r1v21 java.lang.Object) binds: [B:42:0x012d, B:31:0x00d3] A[DONT_GENERATE, DONT_INLINE]
  0x0131: PHI (r4v15 java.util.Iterator) = (r4v13 java.util.Iterator), (r4v17 java.util.Iterator) binds: [B:42:0x012d, B:31:0x00d3] A[DONT_GENERATE, DONT_INLINE]
  0x0131: PHI (r5v26 java.util.Collection) = (r5v20 java.util.Collection), (r5v28 java.util.Collection) binds: [B:42:0x012d, B:31:0x00d3] A[DONT_GENERATE, DONT_INLINE]
  0x0131: PHI (r6v19 java.lang.String) = (r6v16 java.lang.String), (r6v23 java.lang.String) binds: [B:42:0x012d, B:31:0x00d3] A[DONT_GENERATE, DONT_INLINE]
  0x0131: PHI (r7v13 mma) = (r7v7 mma), (r7v15 mma) binds: [B:42:0x012d, B:31:0x00d3] A[DONT_GENERATE, DONT_INLINE]
  0x0131: PHI (r8v7 java.util.List) = (r8v6 java.util.List), (r8v11 java.util.List) binds: [B:42:0x012d, B:31:0x00d3] A[DONT_GENERATE, DONT_INLINE]
  0x0131: PHI (r13v40 java.lang.Object) = (r13v39 java.lang.Object), (r13v0 java.lang.Object) binds: [B:42:0x012d, B:31:0x00d3] A[DONT_GENERATE, DONT_INLINE], TryCatch #6 {CancellationException -> 0x0333, Exception -> 0x002d, blocks: (B:7:0x0028, B:114:0x02fc, B:115:0x030a, B:125:0x031b, B:127:0x031d, B:128:0x031e, B:12:0x0062, B:102:0x0291, B:104:0x0299, B:96:0x0259, B:98:0x025f, B:106:0x029e, B:107:0x02be, B:109:0x02c4, B:110:0x02d2, B:15:0x0077, B:95:0x0243, B:18:0x0088, B:77:0x0203, B:78:0x020e, B:80:0x0213, B:83:0x0217, B:85:0x0221, B:88:0x0228, B:91:0x022e, B:92:0x0230, B:130:0x0320, B:131:0x0321, B:74:0x01ec, B:73:0x01e1, B:132:0x0322, B:28:0x00ac, B:54:0x0192, B:55:0x01a0, B:66:0x01b3, B:68:0x01b6, B:133:0x0323, B:134:0x0324, B:31:0x00d3, B:44:0x0131, B:39:0x0105, B:41:0x010b, B:47:0x013d, B:48:0x015d, B:50:0x0163, B:51:0x0171, B:46:0x0139, B:32:0x00d7, B:38:0x00f1, B:35:0x00de, B:56:0x01a1, B:58:0x01a7, B:62:0x01ad, B:116:0x030b, B:118:0x0311, B:121:0x0316, B:79:0x020f, B:21:0x0099, B:70:0x01be), top: B:146:0x0007, inners: #0, #4, #6, #7 }] */
    /* JADX WARN: Code duplicated, block: B:46:0x0139 A[Catch: Exception -> 0x002d, CancellationException -> 0x0333, TryCatch #6 {CancellationException -> 0x0333, Exception -> 0x002d, blocks: (B:7:0x0028, B:114:0x02fc, B:115:0x030a, B:125:0x031b, B:127:0x031d, B:128:0x031e, B:12:0x0062, B:102:0x0291, B:104:0x0299, B:96:0x0259, B:98:0x025f, B:106:0x029e, B:107:0x02be, B:109:0x02c4, B:110:0x02d2, B:15:0x0077, B:95:0x0243, B:18:0x0088, B:77:0x0203, B:78:0x020e, B:80:0x0213, B:83:0x0217, B:85:0x0221, B:88:0x0228, B:91:0x022e, B:92:0x0230, B:130:0x0320, B:131:0x0321, B:74:0x01ec, B:73:0x01e1, B:132:0x0322, B:28:0x00ac, B:54:0x0192, B:55:0x01a0, B:66:0x01b3, B:68:0x01b6, B:133:0x0323, B:134:0x0324, B:31:0x00d3, B:44:0x0131, B:39:0x0105, B:41:0x010b, B:47:0x013d, B:48:0x015d, B:50:0x0163, B:51:0x0171, B:46:0x0139, B:32:0x00d7, B:38:0x00f1, B:35:0x00de, B:56:0x01a1, B:58:0x01a7, B:62:0x01ad, B:116:0x030b, B:118:0x0311, B:121:0x0316, B:79:0x020f, B:21:0x0099, B:70:0x01be), top: B:146:0x0007, inners: #0, #4, #6, #7 }] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:101:0x028d -> B:102:0x0291). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x012d -> B:44:0x0131). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.pt0
    public final java.lang.Object r(java.lang.Object r13) {
        /*
            Method dump skipped, instruction units count: 844
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hma.r(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((hma) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
