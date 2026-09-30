package defpackage;

import ai.askquin.ui.conversation.r0;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class xv9 extends gbe implements l26 {
    final /* synthetic */ ru9 $autoScrollState;
    final /* synthetic */ j18 $scrollState;
    final /* synthetic */ r0 $vm;
    int I$0;
    int I$1;
    int I$2;
    Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xv9(r0 r0Var, ru9 ru9Var, j18 j18Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.$vm = r0Var;
        this.$autoScrollState = ru9Var;
        this.$scrollState = j18Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new xv9(this.$vm, this.$autoScrollState, this.$scrollState, xn2Var);
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0076  */
    /* JADX WARN: Code duplicated, block: B:22:0x0090  */
    /* JADX WARN: Code duplicated, block: B:26:0x009a  */
    /* JADX WARN: Code duplicated, block: B:28:0x00af  */
    /* JADX WARN: Code duplicated, block: B:29:0x00b4  */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.pt0
    public final java.lang.Object r(java.lang.Object r11) {
        /*
            r10 = this;
            int r0 = r10.label
            r1 = 2
            wef r2 = defpackage.wef.a
            r3 = 1
            bw2 r4 = defpackage.bw2.a
            if (r0 == 0) goto L3f
            if (r0 == r3) goto L28
            if (r0 != r1) goto L21
            int r0 = r10.I$1
            int r5 = r10.I$0
            java.lang.Object r6 = r10.L$1
            j18 r6 = (defpackage.j18) r6
            java.lang.Object r7 = r10.L$0
            ru9 r7 = (defpackage.ru9) r7
            defpackage.jzb.q(r11)
        L1d:
            r11 = r5
            r5 = r7
            goto Lb8
        L21:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qc0.p(r10)
            r10 = 0
            return r10
        L28:
            int r0 = r10.I$2
            int r5 = r10.I$1
            int r6 = r10.I$0
            java.lang.Object r7 = r10.L$1
            j18 r7 = (defpackage.j18) r7
            java.lang.Object r8 = r10.L$0
            ru9 r8 = (defpackage.ru9) r8
            defpackage.jzb.q(r11)
            r11 = r0
            r0 = r5
            r5 = r6
            r6 = r7
            r7 = r8
            goto L93
        L3f:
            defpackage.jzb.q(r11)
            ai.askquin.ui.conversation.r0 r11 = r10.$vm
            boolean r11 = r11.s0()
            ai.askquin.ui.conversation.r0 r0 = r10.$vm
            boolean r0 = r0.j0()
            ai.askquin.ui.conversation.r0 r5 = r10.$vm
            vz9 r5 = r5.N1
            java.lang.Object r5 = r5.getValue()
            java.util.List r5 = (java.util.List) r5
            int r5 = r5.size()
            ru9 r6 = r10.$autoScrollState
            boolean r6 = r6.a()
            if (r11 != 0) goto Lba
            if (r0 != 0) goto Lba
            r11 = 3
            if (r5 != r11) goto Lba
            if (r6 == 0) goto Lba
            ru9 r0 = r10.$autoScrollState
            j18 r5 = r10.$scrollState
            r6 = 0
            r9 = r5
            r5 = r0
            r0 = r6
            r6 = r9
        L74:
            if (r0 >= r11) goto Lba
            xn9 r7 = new xn9
            r8 = 16
            r7.<init>(r8)
            r10.L$0 = r5
            r10.L$1 = r6
            r10.I$0 = r11
            r10.I$1 = r0
            r10.I$2 = r0
            r10.label = r3
            java.lang.Object r7 = defpackage.tm7.Q(r7, r10)
            if (r7 != r4) goto L90
            goto Lb7
        L90:
            r7 = r5
            r5 = r11
            r11 = r0
        L93:
            boolean r8 = r7.a()
            if (r8 != 0) goto L9a
            goto Lba
        L9a:
            r10.L$0 = r7
            r10.L$1 = r6
            r10.I$0 = r5
            r10.I$1 = r0
            r10.I$2 = r11
            r10.label = r1
            b18 r11 = r6.h()
            int r11 = r11.o
            int r11 = r11 - r3
            if (r11 < 0) goto Lb4
            java.lang.Object r11 = ai.askquin.ui.divination.k.l(r6, r11, r10)
            goto Lb5
        Lb4:
            r11 = r2
        Lb5:
            if (r11 != r4) goto L1d
        Lb7:
            return r4
        Lb8:
            int r0 = r0 + r3
            goto L74
        Lba:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.xv9.r(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((xv9) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
