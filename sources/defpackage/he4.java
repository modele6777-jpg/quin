package defpackage;

import ai.askquin.ui.conversation.r0;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class he4 extends gbe implements l26 {
    final /* synthetic */ mmb $latest;
    int I$0;
    int I$1;
    long J$0;
    Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ r0 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public he4(mmb mmbVar, r0 r0Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.$latest = mmbVar;
        this.this$0 = r0Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new he4(this.$latest, this.this$0, xn2Var);
    }

    /* JADX WARN: Code duplicated, block: B:12:0x003e  */
    /* JADX WARN: Code duplicated, block: B:14:0x0046  */
    /* JADX WARN: Code duplicated, block: B:17:0x0059 A[PHI: r0 r5 r7 r8
  0x0059: PHI (r0v3 int) = (r0v4 int), (r0v4 int), (r0v6 int) binds: [B:13:0x0044, B:15:0x0056, B:9:0x0024] A[DONT_GENERATE, DONT_INLINE]
  0x0059: PHI (r5v1 long) = (r5v3 long), (r5v3 long), (r5v5 long) binds: [B:13:0x0044, B:15:0x0056, B:9:0x0024] A[DONT_GENERATE, DONT_INLINE]
  0x0059: PHI (r7v1 int) = (r7v2 int), (r7v2 int), (r7v4 int) binds: [B:13:0x0044, B:15:0x0056, B:9:0x0024] A[DONT_GENERATE, DONT_INLINE]
  0x0059: PHI (r8v1 long[]) = (r8v2 long[]), (r8v2 long[]), (r8v5 long[]) binds: [B:13:0x0044, B:15:0x0056, B:9:0x0024] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:20:0x0075  */
    /* JADX WARN: Code duplicated, block: B:23:0x0082  */
    /* JADX WARN: Code duplicated, block: B:26:0x008d  */
    /* JADX WARN: Code duplicated, block: B:28:0x0090  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:20:0x0075 -> B:21:0x0078). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.pt0
    public final java.lang.Object r(java.lang.Object r14) {
        /*
            r13 = this;
            int r0 = r13.label
            r1 = 0
            r2 = 2
            r3 = 1
            bw2 r4 = defpackage.bw2.a
            if (r0 == 0) goto L32
            if (r0 == r3) goto L24
            if (r0 != r2) goto L1e
            int r0 = r13.I$1
            int r5 = r13.I$0
            java.lang.Object r6 = r13.L$1
            mmb r6 = (defpackage.mmb) r6
            java.lang.Object r7 = r13.L$0
            long[] r7 = (long[]) r7
            defpackage.jzb.q(r14)
            r8 = r7
            goto L78
        L1e:
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qc0.p(r13)
            return r1
        L24:
            long r5 = r13.J$0
            int r0 = r13.I$1
            int r7 = r13.I$0
            java.lang.Object r8 = r13.L$0
            long[] r8 = (long[]) r8
            defpackage.jzb.q(r14)
            goto L59
        L32:
            defpackage.jzb.q(r14)
            long[] r14 = defpackage.zf4.a
            r0 = 0
            r5 = 7
            r8 = r14
            r7 = r0
            r0 = r5
        L3c:
            if (r7 >= r0) goto L99
            r5 = r8[r7]
            r9 = 0
            int r14 = (r5 > r9 ? 1 : (r5 == r9 ? 0 : -1))
            if (r14 <= 0) goto L59
            r13.L$0 = r8
            r13.L$1 = r1
            r13.I$0 = r7
            r13.I$1 = r0
            r13.J$0 = r5
            r13.label = r3
            java.lang.Object r14 = defpackage.vfh.q(r5, r13)
            if (r14 != r4) goto L59
            goto L74
        L59:
            r11 = r5
            r5 = r7
            r6 = r11
            mmb r14 = r13.$latest
            ai.askquin.ui.conversation.r0 r9 = r13.this$0
            r13.L$0 = r8
            r13.L$1 = r14
            r13.I$0 = r5
            r13.I$1 = r0
            r13.J$0 = r6
            r13.label = r2
            int r6 = ai.askquin.ui.conversation.r0.j2
            java.lang.Object r6 = r9.z0(r13)
            if (r6 != r4) goto L75
        L74:
            return r4
        L75:
            r11 = r6
            r6 = r14
            r14 = r11
        L78:
            r6.element = r14
            mmb r14 = r13.$latest
            java.lang.Object r14 = r14.element
            tech.chatmind.api.TarotReadingHistory r14 = (tech.chatmind.api.TarotReadingHistory) r14
            if (r14 == 0) goto L8d
            tech.chatmind.api.TarotReadingBody r14 = r14.getReading()
            if (r14 == 0) goto L8d
            java.lang.String r14 = r14.getContent()
            goto L8e
        L8d:
            r14 = r1
        L8e:
            if (r14 == 0) goto L96
            boolean r14 = defpackage.v4e.Q(r14)
            if (r14 == 0) goto L99
        L96:
            int r7 = r5 + 1
            goto L3c
        L99:
            wef r13 = defpackage.wef.a
            return r13
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.he4.r(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((he4) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
