package defpackage;

import ai.askquin.ui.conversation.r0;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class fe4 extends gbe implements l26 {
    final /* synthetic */ String $childChatId;
    Object L$0;
    int label;
    final /* synthetic */ r0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public fe4(r0 r0Var, String str, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = r0Var;
        this.$childChatId = str;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new fe4(this.this$0, this.$childChatId, xn2Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0080, code lost:
    
        if (r12 == r5) goto L29;
     */
    @Override // defpackage.pt0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object r(java.lang.Object r12) {
        /*
            r11 = this;
            int r0 = r11.label
            r1 = 2
            r2 = 1
            wef r3 = defpackage.wef.a
            r4 = 0
            bw2 r5 = defpackage.bw2.a
            if (r0 == 0) goto L25
            if (r0 == r2) goto L1e
            if (r0 != r1) goto L18
            java.lang.Object r0 = r11.L$0
            yc4 r0 = (defpackage.yc4) r0
            defpackage.jzb.q(r12)
            goto L83
        L18:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qc0.p(r11)
            return r4
        L1e:
            defpackage.jzb.q(r12)     // Catch: java.lang.Exception -> L22 java.util.concurrent.CancellationException -> La0
            goto L39
        L22:
            r0 = move-exception
            r12 = r0
            goto L3c
        L25:
            defpackage.jzb.q(r12)
            ai.askquin.ui.conversation.r0 r12 = r11.this$0     // Catch: java.lang.Exception -> L22 java.util.concurrent.CancellationException -> La0
            uc4 r12 = r12.f     // Catch: java.lang.Exception -> L22 java.util.concurrent.CancellationException -> La0
            java.lang.String r0 = r11.$childChatId     // Catch: java.lang.Exception -> L22 java.util.concurrent.CancellationException -> La0
            r11.label = r2     // Catch: java.lang.Exception -> L22 java.util.concurrent.CancellationException -> La0
            gq3 r12 = (defpackage.gq3) r12     // Catch: java.lang.Exception -> L22 java.util.concurrent.CancellationException -> La0
            java.lang.Object r12 = r12.e(r0, r11)     // Catch: java.lang.Exception -> L22 java.util.concurrent.CancellationException -> La0
            if (r12 != r5) goto L39
            goto L82
        L39:
            yc4 r12 = (defpackage.yc4) r12     // Catch: java.lang.Exception -> L22 java.util.concurrent.CancellationException -> La0
            goto L56
        L3c:
            ai.askquin.ui.conversation.r0 r0 = r11.this$0
            m8b r0 = r0.d()
            java.lang.String r6 = r11.$childChatId
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "Failed to load local child reading "
            r7.<init>(r8)
            r7.append(r6)
            java.lang.String r6 = r7.toString()
            r0.c(r6, r12)
            r12 = r4
        L56:
            if (r12 == 0) goto L5b
            java.time.Instant r0 = r12.q
            goto L5c
        L5b:
            r0 = r4
        L5c:
            if (r0 == 0) goto L70
            ai.askquin.ui.conversation.r0 r11 = r11.this$0
            int r12 = ai.askquin.ui.conversation.r0.j2
            r11.L0 = r2
            vz9 r12 = r11.j1
            xo5 r0 = defpackage.xo5.a
            r12.setValue(r0)
            r12 = 0
            r11.C1(r12)
            return r3
        L70:
            if (r12 != 0) goto L88
            ai.askquin.ui.conversation.r0 r12 = r11.this$0
            java.lang.String r0 = r11.$childChatId
            r11.L$0 = r4
            r11.label = r1
            int r1 = ai.askquin.ui.conversation.r0.j2
            java.lang.Object r12 = r12.w0(r0, r11)
            if (r12 != r5) goto L83
        L82:
            return r5
        L83:
            yc4 r12 = (defpackage.yc4) r12
            if (r12 != 0) goto L88
            return r3
        L88:
            ai.askquin.ui.conversation.r0 r0 = r11.this$0
            int r1 = ai.askquin.ui.conversation.r0.j2
            vz9 r0 = r0.j1
            r0.setValue(r4)
            ai.askquin.ui.conversation.r0 r5 = r11.this$0
            v27 r6 = defpackage.zf4.a(r12)
            java.time.Instant r9 = r12.p
            r10 = 6
            r7 = 0
            r8 = 0
            ai.askquin.ui.conversation.r0.c0(r5, r6, r7, r8, r9, r10)
            return r3
        La0:
            r0 = move-exception
            r11 = r0
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fe4.r(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((fe4) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
