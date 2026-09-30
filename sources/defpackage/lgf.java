package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class lgf {
    public static final xz f = new xz(0.0f);
    public final psf a;
    public long b = Long.MIN_VALUE;
    public xz c = f;
    public boolean d;
    public float e;

    public lgf(vz vzVar) {
        this.a = vzVar.a(xo1.g);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x007f A[Catch: all -> 0x003a, PHI: r0 r2 r3 r13
  0x007f: PHI (r0v16 a26) = (r0v9 a26), (r0v17 a26) binds: [B:29:0x0077, B:37:0x00b0] A[DONT_GENERATE, DONT_INLINE]
  0x007f: PHI (r2v5 x16) = (r2v3 x16), (r2v6 x16) binds: [B:29:0x0077, B:37:0x00b0] A[DONT_GENERATE, DONT_INLINE]
  0x007f: PHI (r3v4 kgf) = (r3v2 kgf), (r3v5 kgf) binds: [B:29:0x0077, B:37:0x00b0] A[DONT_GENERATE, DONT_INLINE]
  0x007f: PHI (r13v1 float) = (r13v0 float), (r13v2 float) binds: [B:29:0x0077, B:37:0x00b0] A[DONT_GENERATE, DONT_INLINE], TRY_ENTER, TryCatch #0 {all -> 0x003a, blocks: (B:13:0x0035, B:44:0x00d9, B:20:0x004d, B:36:0x00ab, B:30:0x007f, B:33:0x008d, B:38:0x00b2, B:41:0x00bd), top: B:49:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:32:0x008c  */
    /* JADX WARN: Code duplicated, block: B:33:0x008d A[Catch: all -> 0x003a, TryCatch #0 {all -> 0x003a, blocks: (B:13:0x0035, B:44:0x00d9, B:20:0x004d, B:36:0x00ab, B:30:0x007f, B:33:0x008d, B:38:0x00b2, B:41:0x00bd), top: B:49:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:35:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:36:0x00ab A[Catch: all -> 0x003a, PHI: r0 r2 r3 r13
  0x00ab: PHI (r0v17 a26) = (r0v16 a26), (r0v20 a26) binds: [B:34:0x00a8, B:21:0x0050] A[DONT_GENERATE, DONT_INLINE]
  0x00ab: PHI (r2v6 x16) = (r2v5 x16), (r2v8 x16) binds: [B:34:0x00a8, B:21:0x0050] A[DONT_GENERATE, DONT_INLINE]
  0x00ab: PHI (r3v5 kgf) = (r3v4 kgf), (r3v7 kgf) binds: [B:34:0x00a8, B:21:0x0050] A[DONT_GENERATE, DONT_INLINE]
  0x00ab: PHI (r13v2 float) = (r13v1 float), (r13v5 float) binds: [B:34:0x00a8, B:21:0x0050] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {all -> 0x003a, blocks: (B:13:0x0035, B:44:0x00d9, B:20:0x004d, B:36:0x00ab, B:30:0x007f, B:33:0x008d, B:38:0x00b2, B:41:0x00bd), top: B:49:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:38:0x00b2 A[Catch: all -> 0x003a, PHI: r0 r2 r3
  0x00b2: PHI (r0v12 a26) = (r0v16 a26), (r0v17 a26) binds: [B:32:0x008c, B:37:0x00b0] A[DONT_GENERATE, DONT_INLINE]
  0x00b2: PHI (r2v4 x16) = (r2v5 x16), (r2v6 x16) binds: [B:32:0x008c, B:37:0x00b0] A[DONT_GENERATE, DONT_INLINE]
  0x00b2: PHI (r3v3 kgf) = (r3v4 kgf), (r3v5 kgf) binds: [B:32:0x008c, B:37:0x00b0] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {all -> 0x003a, blocks: (B:13:0x0035, B:44:0x00d9, B:20:0x004d, B:36:0x00ab, B:30:0x007f, B:33:0x008d, B:38:0x00b2, B:41:0x00bd), top: B:49:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:40:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:41:0x00bd A[Catch: all -> 0x003a, TryCatch #0 {all -> 0x003a, blocks: (B:13:0x0035, B:44:0x00d9, B:20:0x004d, B:36:0x00ab, B:30:0x007f, B:33:0x008d, B:38:0x00b2, B:41:0x00bd), top: B:49:0x002b }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x00a8 -> B:36:0x00ab). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object a(defpackage.w6 r17, defpackage.j8 r18, defpackage.zn2 r19) {
        /*
            Method dump skipped, instruction units count: 236
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lgf.a(w6, j8, zn2):java.lang.Object");
    }
}
