package defpackage;

import ai.askquin.MainActivity;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ck8 extends gbe implements l26 {
    final /* synthetic */ ru7 $state;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ MainActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ck8(MainActivity mainActivity, ru7 ru7Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = mainActivity;
        this.$state = ru7Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        ck8 ck8Var = new ck8(this.this$0, this.$state, xn2Var);
        ck8Var.L$0 = obj;
        return ck8Var;
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00b1  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0048, code lost:
    
        if (r9.r(r8) == r6) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x008b, code lost:
    
        if (r9 == r6) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x008d, code lost:
    
        return r6;
     */
    @Override // defpackage.pt0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object r(java.lang.Object r9) {
        /*
            r8 = this;
            java.lang.Object r0 = r8.L$0
            aw2 r0 = (defpackage.aw2) r0
            int r1 = r8.label
            r2 = 2
            r3 = 1
            wef r4 = defpackage.wef.a
            r5 = 0
            bw2 r6 = defpackage.bw2.a
            if (r1 == 0) goto L2f
            if (r1 == r3) goto L25
            if (r1 != r2) goto L1f
            java.lang.Object r0 = r8.L$1
            aw2 r0 = (defpackage.aw2) r0
            defpackage.jzb.q(r9)     // Catch: java.lang.Throwable -> L1c
            goto La9
        L1c:
            r9 = move-exception
            goto La3
        L1f:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qc0.p(r8)
            return r5
        L25:
            java.lang.Object r0 = r8.L$1
            aw2 r0 = (defpackage.aw2) r0
            defpackage.jzb.q(r9)     // Catch: java.lang.Throwable -> L2d
            goto L4b
        L2d:
            r9 = move-exception
            goto L4d
        L2f:
            defpackage.jzb.q(r9)
            ai.askquin.MainActivity r9 = r8.this$0
            int r1 = ai.askquin.MainActivity.Z0     // Catch: java.lang.Throwable -> L2d
            lw7 r9 = r9.U0     // Catch: java.lang.Throwable -> L2d
            java.lang.Object r9 = r9.getValue()     // Catch: java.lang.Throwable -> L2d
            gd8 r9 = (defpackage.gd8) r9     // Catch: java.lang.Throwable -> L2d
            r8.L$0 = r0     // Catch: java.lang.Throwable -> L2d
            r8.L$1 = r5     // Catch: java.lang.Throwable -> L2d
            r8.label = r3     // Catch: java.lang.Throwable -> L2d
            java.lang.Object r9 = r9.r(r8)     // Catch: java.lang.Throwable -> L2d
            if (r9 != r6) goto L4b
            goto L8d
        L4b:
            r0 = r4
            goto L52
        L4d:
            dzb r0 = new dzb
            r0.<init>(r9)
        L52:
            ai.askquin.MainActivity r9 = r8.this$0
            java.lang.Throwable r0 = defpackage.ezb.a(r0)
            if (r0 == 0) goto L63
            m8b r9 = r9.d()
            java.lang.String r1 = "Failed to backfill daily reminder completion cache"
            r9.c(r1, r0)
        L63:
            ru7 r9 = r8.$state
            ai.askquin.MainActivity r0 = r8.this$0
            boolean r9 = r9.d     // Catch: java.lang.Throwable -> L1c
            if (r9 == 0) goto L8e
            ta3 r9 = defpackage.ta3.a     // Catch: java.lang.Throwable -> L1c
            android.app.Application r1 = r0.getApplication()     // Catch: java.lang.Throwable -> L1c
            r1.getClass()     // Catch: java.lang.Throwable -> L1c
            lw7 r3 = r0.V0     // Catch: java.lang.Throwable -> L1c
            java.lang.Object r3 = r3.getValue()     // Catch: java.lang.Throwable -> L1c
            gpf r3 = (defpackage.gpf) r3     // Catch: java.lang.Throwable -> L1c
            bk8 r7 = new bk8     // Catch: java.lang.Throwable -> L1c
            r7.<init>(r0, r5)     // Catch: java.lang.Throwable -> L1c
            r8.L$0 = r5     // Catch: java.lang.Throwable -> L1c
            r8.L$1 = r5     // Catch: java.lang.Throwable -> L1c
            r8.label = r2     // Catch: java.lang.Throwable -> L1c
            java.lang.Object r9 = r9.n(r1, r3, r7, r8)     // Catch: java.lang.Throwable -> L1c
            if (r9 != r6) goto La9
        L8d:
            return r6
        L8e:
            y93 r9 = defpackage.y93.a     // Catch: java.lang.Throwable -> L1c
            android.app.Application r0 = r0.getApplication()     // Catch: java.lang.Throwable -> L1c
            r0.getClass()     // Catch: java.lang.Throwable -> L1c
            ya3 r1 = defpackage.ya3.Today     // Catch: java.lang.Throwable -> L1c
            r9.i(r0, r1)     // Catch: java.lang.Throwable -> L1c
            ya3 r1 = defpackage.ya3.Tomorrow     // Catch: java.lang.Throwable -> L1c
            r9.i(r0, r1)     // Catch: java.lang.Throwable -> L1c
            r9 = r4
            goto La9
        La3:
            dzb r0 = new dzb
            r0.<init>(r9)
            r9 = r0
        La9:
            ai.askquin.MainActivity r8 = r8.this$0
            java.lang.Throwable r9 = defpackage.ezb.a(r9)
            if (r9 == 0) goto Lba
            m8b r8 = r8.d()
            java.lang.String r0 = "Failed to reconcile daily reminders"
            r8.c(r0, r9)
        Lba:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ck8.r(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((ck8) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
