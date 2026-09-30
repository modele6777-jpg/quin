package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class j59 {
    /* JADX WARN: Can't wrap try/catch for region: R(3:31|17|18) */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0057, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0058, code lost:
    
        r3 = r0.getMessage();
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x005c, code lost:
    
        if (r3 == null) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0067, code lost:
    
        r2.L$0 = r9;
        r2.J$0 = r10;
        r2.label = 1;
        r0 = defpackage.vfh.q(r10, r2);
        r3 = defpackage.bw2.a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0073, code lost:
    
        if (r0 == r3) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0075, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x007a, code lost:
    
        throw r0;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0073 -> B:27:0x0076). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(java.io.FileOutputStream r10, defpackage.zn2 r11) throws java.io.IOException {
        /*
            r9 = this;
            boolean r0 = r11 instanceof defpackage.i59
            if (r0 == 0) goto L13
            r0 = r11
            i59 r0 = (defpackage.i59) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            i59 r0 = new i59
            r0.<init>(r9, r11)
        L18:
            java.lang.Object r9 = r0.result
            int r11 = r0.label
            r1 = 1
            if (r11 == 0) goto L34
            if (r11 != r1) goto L2d
            long r10 = r0.J$0
            java.lang.Object r2 = r0.L$0
            java.io.FileOutputStream r2 = (java.io.FileOutputStream) r2
            defpackage.jzb.q(r9)
            r9 = r2
            r2 = r0
            goto L76
        L2d:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qc0.p(r9)
            r9 = 0
            return r9
        L34:
            defpackage.jzb.q(r9)
            r2 = 10
            r9 = r10
            r10 = r2
            r2 = r0
        L3c:
            r3 = 60000(0xea60, double:2.9644E-319)
            int r0 = (r10 > r3 ? 1 : (r10 == r3 ? 0 : -1))
            if (r0 > 0) goto L7b
            java.nio.channels.FileChannel r3 = r9.getChannel()     // Catch: java.io.IOException -> L57
            r6 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r8 = 0
            r4 = 0
            java.nio.channels.FileLock r0 = r3.lock(r4, r6, r8)     // Catch: java.io.IOException -> L57
            r0.getClass()     // Catch: java.io.IOException -> L57
            return r0
        L57:
            r0 = move-exception
            java.lang.String r3 = r0.getMessage()
            if (r3 == 0) goto L7a
            java.lang.String r4 = "Resource deadlock would occur"
            r5 = 0
            boolean r3 = defpackage.v4e.F(r3, r4, r5)
            if (r3 != r1) goto L7a
            r2.L$0 = r9
            r2.J$0 = r10
            r2.label = r1
            java.lang.Object r0 = defpackage.vfh.q(r10, r2)
            bw2 r3 = defpackage.bw2.a
            if (r0 != r3) goto L76
            return r3
        L76:
            r3 = 2
            long r10 = r10 * r3
            goto L3c
        L7a:
            throw r0
        L7b:
            java.nio.channels.FileChannel r3 = r9.getChannel()
            r6 = 9223372036854775807(0x7fffffffffffffff, double:NaN)
            r8 = 0
            r4 = 0
            java.nio.channels.FileLock r9 = r3.lock(r4, r6, r8)
            r9.getClass()
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.j59.a(java.io.FileOutputStream, zn2):java.lang.Object");
    }
}
