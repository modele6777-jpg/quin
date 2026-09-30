package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class a84 {
    public final aw2 a;
    public final gl b;
    public final to3 c;
    public final f99 d;
    public final AtomicReference e;
    public final AtomicReference f;

    public a84(aw2 aw2Var, gl glVar, to3 to3Var) {
        aw2Var.getClass();
        this.a = aw2Var;
        this.b = glVar;
        this.c = to3Var;
        this.d = new f99();
        this.e = new AtomicReference(null);
        this.f = new AtomicReference(null);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0063  */
    /* JADX WARN: Code duplicated, block: B:27:0x0067 A[Catch: all -> 0x0039, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0039, blocks: (B:13:0x0035, B:27:0x0067), top: B:39:0x0035, outer: #1 }] */
    /* JADX WARN: Code duplicated, block: B:34:0x0087 A[Catch: all -> 0x008b, TRY_LEAVE, TryCatch #1 {all -> 0x008b, blocks: (B:32:0x007f, B:23:0x0059, B:34:0x0087, B:31:0x007a, B:13:0x0035, B:27:0x0067), top: B:39:0x0035, inners: #0 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0075, code lost:
    
        if (r4.z(r8, r0) == r6) goto L29;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:28:0x0075 -> B:30:0x0078). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:31:0x007a -> B:32:0x007f). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object a(defpackage.zn2 r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof defpackage.y74
            if (r0 == 0) goto L13
            r0 = r8
            y74 r0 = (defpackage.y74) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            y74 r0 = new y74
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.result
            int r1 = r0.label
            wef r2 = defpackage.wef.a
            r3 = 2
            r4 = 1
            r5 = 0
            bw2 r6 = defpackage.bw2.a
            if (r1 == 0) goto L49
            if (r1 == r4) goto L41
            if (r1 != r3) goto L3b
            java.lang.Object r1 = r0.L$2
            a84 r1 = (defpackage.a84) r1
            java.lang.Object r1 = r0.L$1
            tech.chatmind.api.DeviceTokenRequest r1 = (tech.chatmind.api.DeviceTokenRequest) r1
            java.lang.Object r1 = r0.L$0
            d99 r1 = (defpackage.d99) r1
            defpackage.jzb.q(r8)     // Catch: java.lang.Throwable -> L39
            goto L78
        L39:
            r8 = move-exception
            goto L7a
        L3b:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qc0.p(r7)
            return r5
        L41:
            java.lang.Object r1 = r0.L$0
            d99 r1 = (defpackage.d99) r1
            defpackage.jzb.q(r8)
            goto L59
        L49:
            defpackage.jzb.q(r8)
            f99 r1 = r7.d
            r0.L$0 = r1
            r0.label = r4
            java.lang.Object r8 = r1.b(r0)
            if (r8 != r6) goto L59
            goto L77
        L59:
            java.util.concurrent.atomic.AtomicReference r8 = r7.f     // Catch: java.lang.Throwable -> L8b
            java.lang.Object r8 = r8.getAndSet(r5)     // Catch: java.lang.Throwable -> L8b
            tech.chatmind.api.DeviceTokenRequest r8 = (tech.chatmind.api.DeviceTokenRequest) r8     // Catch: java.lang.Throwable -> L8b
            if (r8 != 0) goto L67
            r1.h(r5)
            return r2
        L67:
            gl r4 = r7.b     // Catch: java.lang.Throwable -> L39
            r0.L$0 = r1     // Catch: java.lang.Throwable -> L39
            r0.L$1 = r5     // Catch: java.lang.Throwable -> L39
            r0.L$2 = r5     // Catch: java.lang.Throwable -> L39
            r0.label = r3     // Catch: java.lang.Throwable -> L39
            java.lang.Object r8 = r4.z(r8, r0)     // Catch: java.lang.Throwable -> L39
            if (r8 != r6) goto L78
        L77:
            return r6
        L78:
            r4 = r2
            goto L7f
        L7a:
            dzb r4 = new dzb     // Catch: java.lang.Throwable -> L8b
            r4.<init>(r8)     // Catch: java.lang.Throwable -> L8b
        L7f:
            to3 r8 = r7.c     // Catch: java.lang.Throwable -> L8b
            java.lang.Throwable r4 = defpackage.ezb.a(r4)     // Catch: java.lang.Throwable -> L8b
            if (r4 == 0) goto L59
            r8.d(r4)     // Catch: java.lang.Throwable -> L8b
            goto L59
        L8b:
            r7 = move-exception
            r1.h(r5)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a84.a(zn2):java.lang.Object");
    }
}
