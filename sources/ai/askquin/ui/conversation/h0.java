package ai.askquin.ui.conversation;

import defpackage.aw2;
import defpackage.gbe;
import defpackage.l26;
import defpackage.wef;
import defpackage.xn2;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class h0 extends gbe implements l26 {
    final /* synthetic */ Operation.Explanation $operation;
    Object L$0;
    int label;
    final /* synthetic */ r0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(r0 r0Var, Operation.Explanation explanation, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = r0Var;
        this.$operation = explanation;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new h0(this.this$0, this.$operation, xn2Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0070, code lost:
    
        if (r0.f(r8, r2, r7) == r4) goto L25;
     */
    @Override // defpackage.pt0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object r(java.lang.Object r8) {
        /*
            r7 = this;
            int r0 = r7.label
            r1 = 2
            r2 = 1
            r3 = 0
            bw2 r4 = defpackage.bw2.a
            if (r0 == 0) goto L20
            if (r0 == r2) goto L1c
            if (r0 != r1) goto L16
            java.lang.Object r7 = r7.L$0
            tech.chatmind.api.TarotReadingHistory r7 = (tech.chatmind.api.TarotReadingHistory) r7
            defpackage.jzb.q(r8)
            goto L8e
        L16:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qc0.p(r7)
            return r3
        L1c:
            defpackage.jzb.q(r8)
            goto L30
        L20:
            defpackage.jzb.q(r8)
            ai.askquin.ui.conversation.r0 r8 = r7.this$0
            r7.label = r2
            int r0 = ai.askquin.ui.conversation.r0.j2
            java.lang.Object r8 = r8.y0(r7)
            if (r8 != r4) goto L30
            goto L72
        L30:
            tech.chatmind.api.TarotReadingHistory r8 = (tech.chatmind.api.TarotReadingHistory) r8
            if (r8 == 0) goto L3f
            tech.chatmind.api.TarotReadingBody r0 = r8.getReading()
            if (r0 == 0) goto L3f
            java.lang.String r0 = r0.getContent()
            goto L40
        L3f:
            r0 = r3
        L40:
            if (r0 == 0) goto L73
            boolean r0 = defpackage.v4e.Q(r0)
            if (r0 == 0) goto L49
            goto L73
        L49:
            ai.askquin.ui.conversation.r0 r0 = r7.this$0
            m8b r0 = r0.d()
            java.lang.String r2 = r8.getChatId()
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "restore: adopting completed cloud reading "
            r5.<init>(r6)
            r5.append(r2)
            java.lang.String r2 = r5.toString()
            r0.e(r2)
            ai.askquin.ui.conversation.r0 r0 = r7.this$0
            ai.askquin.ui.conversation.Operation$Explanation r2 = r7.$operation
            r7.L$0 = r3
            r7.label = r1
            java.lang.Object r7 = r0.f(r8, r2, r7)
            if (r7 != r4) goto L8e
        L72:
            return r4
        L73:
            ai.askquin.ui.conversation.r0 r8 = r7.this$0
            int r0 = ai.askquin.ui.conversation.r0.j2
            r8.L1(r3)
            ai.askquin.ui.conversation.r0 r8 = r7.this$0
            ai.askquin.ui.conversation.Operation$Explanation r0 = r7.$operation
            ai.askquin.ui.conversation.FailReason$Network r1 = ai.askquin.ui.conversation.FailReason.Network.INSTANCE
            r8.B1(r0, r1)
            ai.askquin.ui.conversation.r0 r8 = r7.this$0
            r0 = 0
            r8.w1(r0)
            ai.askquin.ui.conversation.r0 r7 = r7.this$0
            r7.q1()
        L8e:
            wef r7 = defpackage.wef.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: ai.askquin.ui.conversation.h0.r(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((h0) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
