package defpackage;

import ai.askquin.ui.conversation.Operation;
import ai.askquin.ui.conversation.r0;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class af4 extends gbe implements l26 {
    final /* synthetic */ x16 $onCloudAbsent;
    final /* synthetic */ Operation<?> $operation;
    Object L$0;
    int label;
    final /* synthetic */ r0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public af4(r0 r0Var, Operation operation, x16 x16Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = r0Var;
        this.$operation = operation;
        this.$onCloudAbsent = x16Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new af4(this.this$0, this.$operation, this.$onCloudAbsent, xn2Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0062, code lost:
    
        if (r0.f(r8, r3, r7) == r4) goto L17;
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
            r1 = 0
            r2 = 2
            r3 = 1
            bw2 r4 = defpackage.bw2.a
            if (r0 == 0) goto L1f
            if (r0 == r3) goto L1b
            if (r0 != r2) goto L15
            java.lang.Object r7 = r7.L$0
            tech.chatmind.api.TarotReadingHistory r7 = (tech.chatmind.api.TarotReadingHistory) r7
            defpackage.jzb.q(r8)
            goto L8a
        L15:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qc0.p(r7)
            return r1
        L1b:
            defpackage.jzb.q(r8)
            goto L2f
        L1f:
            defpackage.jzb.q(r8)
            ai.askquin.ui.conversation.r0 r8 = r7.this$0
            r7.label = r3
            int r0 = ai.askquin.ui.conversation.r0.j2
            java.lang.Object r8 = r8.z0(r7)
            if (r8 != r4) goto L2f
            goto L64
        L2f:
            tech.chatmind.api.TarotReadingHistory r8 = (tech.chatmind.api.TarotReadingHistory) r8
            ai.askquin.ui.conversation.r0 r0 = r7.this$0
            if (r8 == 0) goto L65
            m8b r0 = r0.d()
            ai.askquin.ui.conversation.Operation<?> r3 = r7.$operation
            java.lang.String r5 = r8.getChatId()
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            r6.append(r3)
            java.lang.String r3 = " failed: adopting existing cloud reading "
            r6.append(r3)
            r6.append(r5)
            java.lang.String r3 = r6.toString()
            r0.e(r3)
            ai.askquin.ui.conversation.r0 r0 = r7.this$0
            ai.askquin.ui.conversation.Operation<?> r3 = r7.$operation
            r7.L$0 = r1
            r7.label = r2
            java.lang.Object r7 = r0.f(r8, r3, r7)
            if (r7 != r4) goto L8a
        L64:
            return r4
        L65:
            m8b r8 = r0.d()
            ai.askquin.ui.conversation.Operation<?> r0 = r7.$operation
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            r1.append(r0)
            java.lang.String r0 = " failed: cloud probe found no reading"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r8.e(r0)
            ai.askquin.ui.conversation.r0 r8 = r7.this$0
            r0 = 0
            r8.w1(r0)
            x16 r7 = r7.$onCloudAbsent
            r7.invoke()
        L8a:
            wef r7 = defpackage.wef.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.af4.r(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((af4) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
