package defpackage;

import java.io.File;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class z59 extends gbe implements l26 {
    final /* synthetic */ File $file;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z59(File file, xn2 xn2Var) {
        super(2, xn2Var);
        this.$file = file;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        z59 z59Var = new z59(this.$file, xn2Var);
        z59Var.L$0 = obj;
        return z59Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x009c, code lost:
    
        if (defpackage.i7h.k(r4, r10, r9) == r0) goto L27;
     */
    @Override // defpackage.pt0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object r(java.lang.Object r10) {
        /*
            r9 = this;
            bw2 r0 = defpackage.bw2.a
            int r1 = r9.label
            r2 = 0
            r3 = 2
            r4 = 1
            if (r1 == 0) goto L24
            if (r1 == r4) goto L18
            if (r1 != r3) goto L12
            defpackage.jzb.q(r10)
            goto L9f
        L12:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qc0.p(r9)
            return r2
        L18:
            java.lang.Object r1 = r9.L$1
            ta4 r1 = (defpackage.ta4) r1
            java.lang.Object r4 = r9.L$0
            awa r4 = (defpackage.awa) r4
            defpackage.jzb.q(r10)
            goto L8b
        L24:
            defpackage.jzb.q(r10)
            java.lang.Object r10 = r9.L$0
            awa r10 = (defpackage.awa) r10
            java.io.File r1 = r9.$file
            kz8 r5 = new kz8
            r6 = 3
            r5.<init>(r6, r1, r10)
            java.lang.Object r6 = defpackage.a69.b
            java.io.File r1 = r1.getParentFile()
            r1.getClass()
            java.io.File r1 = r1.getCanonicalFile()
            java.lang.String r1 = r1.getPath()
            java.lang.Object r6 = defpackage.a69.b
            monitor-enter(r6)
            java.util.LinkedHashMap r7 = defpackage.a69.c     // Catch: java.lang.Throwable -> L5b
            java.lang.Object r8 = r7.get(r1)     // Catch: java.lang.Throwable -> L5b
            if (r8 != 0) goto L5d
            a69 r8 = new a69     // Catch: java.lang.Throwable -> L5b
            r1.getClass()     // Catch: java.lang.Throwable -> L5b
            r8.<init>(r1)     // Catch: java.lang.Throwable -> L5b
            r7.put(r1, r8)     // Catch: java.lang.Throwable -> L5b
            goto L5d
        L5b:
            r9 = move-exception
            goto La2
        L5d:
            a69 r8 = (defpackage.a69) r8     // Catch: java.lang.Throwable -> L5b
            java.util.concurrent.CopyOnWriteArrayList r7 = r8.a     // Catch: java.lang.Throwable -> L5b
            r7.add(r5)     // Catch: java.lang.Throwable -> L5b
            java.util.concurrent.CopyOnWriteArrayList r7 = r8.a     // Catch: java.lang.Throwable -> L5b
            int r7 = r7.size()     // Catch: java.lang.Throwable -> L5b
            if (r7 != r4) goto L6f
            r8.startWatching()     // Catch: java.lang.Throwable -> L5b
        L6f:
            monitor-exit(r6)
            vg6 r6 = new vg6
            r6.<init>(r4, r1, r5)
            wef r1 = defpackage.wef.a
            r9.L$0 = r10
            r9.L$1 = r6
            r9.label = r4
            r4 = r10
            zva r4 = (defpackage.zva) r4
            r41 r4 = r4.e
            java.lang.Object r1 = r4.a(r9, r1)
            if (r1 != r0) goto L89
            goto L9e
        L89:
            r4 = r10
            r1 = r6
        L8b:
            zv6 r10 = new zv6
            r5 = 17
            r10.<init>(r5, r1)
            r9.L$0 = r2
            r9.L$1 = r2
            r9.label = r3
            java.lang.Object r9 = defpackage.i7h.k(r4, r10, r9)
            if (r9 != r0) goto L9f
        L9e:
            return r0
        L9f:
            wef r9 = defpackage.wef.a
            return r9
        La2:
            monitor-exit(r6)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.z59.r(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((z59) k((xn2) obj2, (awa) obj)).r(wef.a);
    }
}
