package defpackage;

import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class tva {
    public final a26 a;
    public final gl b;
    public final sh0 c = vpf.m(false);
    public final r41 d = urg.a(Integer.MAX_VALUE, null, new p59(18, this), 2);
    public final ad0 e = new ad0();

    public tva(uj3 uj3Var, gl glVar) {
        this.a = uj3Var;
        this.b = glVar;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x003f A[Catch: all -> 0x0030, TRY_ENTER, TryCatch #0 {all -> 0x0030, blocks: (B:13:0x002c, B:35:0x0073, B:26:0x004b, B:28:0x0051, B:29:0x0055, B:31:0x0059, B:32:0x0064, B:22:0x003f, B:25:0x0048, B:19:0x0038), top: B:40:0x0024 }] */
    /* JADX WARN: Code duplicated, block: B:24:0x0047  */
    /* JADX WARN: Code duplicated, block: B:25:0x0048 A[Catch: all -> 0x0030, TryCatch #0 {all -> 0x0030, blocks: (B:13:0x002c, B:35:0x0073, B:26:0x004b, B:28:0x0051, B:29:0x0055, B:31:0x0059, B:32:0x0064, B:22:0x003f, B:25:0x0048, B:19:0x0038), top: B:40:0x0024 }] */
    /* JADX WARN: Code duplicated, block: B:28:0x0051 A[Catch: all -> 0x0030, TryCatch #0 {all -> 0x0030, blocks: (B:13:0x002c, B:35:0x0073, B:26:0x004b, B:28:0x0051, B:29:0x0055, B:31:0x0059, B:32:0x0064, B:22:0x003f, B:25:0x0048, B:19:0x0038), top: B:40:0x0024 }] */
    /* JADX WARN: Code duplicated, block: B:31:0x0059 A[Catch: all -> 0x0030, LOOP:0: B:29:0x0055->B:31:0x0059, LOOP_END, TryCatch #0 {all -> 0x0030, blocks: (B:13:0x002c, B:35:0x0073, B:26:0x004b, B:28:0x0051, B:29:0x0055, B:31:0x0059, B:32:0x0064, B:22:0x003f, B:25:0x0048, B:19:0x0038), top: B:40:0x0024 }] */
    /* JADX WARN: Code duplicated, block: B:44:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x0070 -> B:35:0x0073). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:22:0x003f
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final void a(defpackage.zn2 r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof defpackage.sva
            if (r0 == 0) goto L13
            r0 = r8
            sva r0 = (defpackage.sva) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            sva r0 = new sva
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.result
            int r1 = r0.label
            r2 = 2
            r3 = 1
            r41 r4 = r7.d
            ad0 r5 = r7.e
            bw2 r6 = defpackage.bw2.a
            if (r1 == 0) goto L3c
            if (r1 == r3) goto L38
            if (r1 != r2) goto L32
            int r1 = r0.I$0
            defpackage.jzb.q(r8)     // Catch: java.lang.Throwable -> L30
            goto L73
        L30:
            r8 = move-exception
            goto L78
        L32:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qc0.p(r7)
            return
        L38:
            defpackage.jzb.q(r8)     // Catch: java.lang.Throwable -> L30
            goto L48
        L3c:
            defpackage.jzb.q(r8)
        L3f:
            r0.label = r3     // Catch: java.lang.Throwable -> L30
            java.lang.Object r8 = r4.m(r0)     // Catch: java.lang.Throwable -> L30
            if (r8 != r6) goto L48
            goto L72
        L48:
            r5.addLast(r8)     // Catch: java.lang.Throwable -> L30
        L4b:
            boolean r8 = r5.isEmpty()     // Catch: java.lang.Throwable -> L30
            if (r8 != 0) goto L3f
            java.lang.Object r8 = r4.k()     // Catch: java.lang.Throwable -> L30
        L55:
            boolean r1 = r8 instanceof defpackage.qw1     // Catch: java.lang.Throwable -> L30
            if (r1 != 0) goto L64
            defpackage.rw1.c(r8)     // Catch: java.lang.Throwable -> L30
            r5.addLast(r8)     // Catch: java.lang.Throwable -> L30
            java.lang.Object r8 = r4.k()     // Catch: java.lang.Throwable -> L30
            goto L55
        L64:
            int r1 = r5.c     // Catch: java.lang.Throwable -> L30
            gl r8 = r7.b     // Catch: java.lang.Throwable -> L30
            r0.I$0 = r1     // Catch: java.lang.Throwable -> L30
            r0.label = r2     // Catch: java.lang.Throwable -> L30
            java.lang.Object r8 = r8.z(r5, r0)     // Catch: java.lang.Throwable -> L30
            if (r8 != r6) goto L73
        L72:
            return
        L73:
            int r8 = r5.c     // Catch: java.lang.Throwable -> L30
            if (r1 != r8) goto L4b
            goto L3f
        L78:
            r7.b(r8)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tva.a(zn2):void");
    }

    public final void b(Throwable th) throws Throwable {
        ad0 ad0Var;
        r41 r41Var = this.d;
        if (r41Var.e(th, false)) {
            Object objK = r41Var.k();
            while (true) {
                boolean z = objK instanceof qw1;
                ad0Var = this.e;
                if (z) {
                    break;
                }
                rw1.c(objK);
                ad0Var.addLast(objK);
                objK = r41Var.k();
            }
            if (ad0Var.isEmpty()) {
                return;
            }
            this.a.d(new ArrayList(ad0Var));
            ad0Var.clear();
        }
    }

    public final boolean c(Object obj) {
        return !(this.d.d(obj) instanceof qw1);
    }
}
