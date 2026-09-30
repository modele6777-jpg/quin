package defpackage;

import ai.askquin.MainActivity;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ak8 extends gbe implements l26 {
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ MainActivity this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ak8(MainActivity mainActivity, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = mainActivity;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        ak8 ak8Var = new ak8(this.this$0, xn2Var);
        ak8Var.L$0 = obj;
        return ak8Var;
    }

    /* JADX WARN: Code duplicated, block: B:30:0x0084  */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0079, code lost:
    
        if (defpackage.v38.a.a(r6, r5) == r4) goto L27;
     */
    @Override // defpackage.pt0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object r(java.lang.Object r6) {
        /*
            r5 = this;
            java.lang.Object r0 = r5.L$0
            aw2 r0 = (defpackage.aw2) r0
            int r0 = r5.label
            r1 = 2
            r2 = 1
            r3 = 0
            bw2 r4 = defpackage.bw2.a
            if (r0 == 0) goto L2f
            if (r0 == r2) goto L25
            if (r0 != r1) goto L1f
            java.lang.Object r0 = r5.L$3
            tech.chatmind.api.User r0 = (tech.chatmind.api.User) r0
            java.lang.Object r0 = r5.L$2
            tech.chatmind.api.User r0 = (tech.chatmind.api.User) r0
            java.lang.Object r0 = r5.L$1
            defpackage.jzb.q(r6)
            goto L7c
        L1f:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qc0.p(r5)
            return r3
        L25:
            java.lang.Object r0 = r5.L$1
            aw2 r0 = (defpackage.aw2) r0
            defpackage.jzb.q(r6)     // Catch: java.lang.Throwable -> L2d
            goto L4f
        L2d:
            r6 = move-exception
            goto L57
        L2f:
            defpackage.jzb.q(r6)
            ai.askquin.MainActivity r6 = r5.this$0
            int r0 = ai.askquin.MainActivity.Z0     // Catch: java.lang.Throwable -> L2d
            lw7 r6 = r6.R0     // Catch: java.lang.Throwable -> L2d
            java.lang.Object r6 = r6.getValue()     // Catch: java.lang.Throwable -> L2d
            ht6 r6 = (defpackage.ht6) r6     // Catch: java.lang.Throwable -> L2d
            r5.L$0 = r3     // Catch: java.lang.Throwable -> L2d
            r5.L$1 = r3     // Catch: java.lang.Throwable -> L2d
            r5.label = r2     // Catch: java.lang.Throwable -> L2d
            cb r6 = (defpackage.cb) r6     // Catch: java.lang.Throwable -> L2d
            d56 r6 = r6.a     // Catch: java.lang.Throwable -> L2d
            java.lang.Object r6 = r6.e(r5)     // Catch: java.lang.Throwable -> L2d
            if (r6 != r4) goto L4f
            goto L7b
        L4f:
            tech.chatmind.api.UserInfo r6 = (tech.chatmind.api.UserInfo) r6     // Catch: java.lang.Throwable -> L2d
            tech.chatmind.api.User r6 = r6.getUser()     // Catch: java.lang.Throwable -> L2d
            r0 = r6
            goto L5c
        L57:
            dzb r0 = new dzb
            r0.<init>(r6)
        L5c:
            boolean r6 = r0 instanceof defpackage.dzb
            if (r6 != 0) goto L7c
            r6 = r0
            tech.chatmind.api.User r6 = (tech.chatmind.api.User) r6
            if (r6 == 0) goto L7c
            boolean r6 = r6.isNewUser()
            r5.L$0 = r3
            r5.L$1 = r0
            r5.L$2 = r3
            r5.L$3 = r3
            r5.label = r1
            v38 r1 = defpackage.v38.a
            java.lang.Object r6 = r1.a(r6, r5)
            if (r6 != r4) goto L7c
        L7b:
            return r4
        L7c:
            ai.askquin.MainActivity r5 = r5.this$0
            java.lang.Throwable r6 = defpackage.ezb.a(r0)
            if (r6 == 0) goto L8d
            m8b r5 = r5.d()
            java.lang.String r0 = "Failed to fetch user info for legacy detection"
            r5.c(r0, r6)
        L8d:
            wef r5 = defpackage.wef.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ak8.r(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((ak8) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
