package defpackage;

import ai.askquin.model.TarotSkinIdentify;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class mt1 extends gbe implements l26 {
    final /* synthetic */ TarotSkinIdentify $skin;
    Object L$0;
    int label;
    final /* synthetic */ nt1 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mt1(nt1 nt1Var, TarotSkinIdentify tarotSkinIdentify, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = nt1Var;
        this.$skin = tarotSkinIdentify;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new mt1(this.this$0, this.$skin, xn2Var);
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0058 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:21:0x0059  */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x006a, code lost:
    
        if (defpackage.lw2.b(r9, r8) == r6) goto L23;
     */
    @Override // defpackage.pt0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object r(java.lang.Object r9) {
        /*
            r8 = this;
            int r0 = r8.label
            wef r1 = defpackage.wef.a
            r2 = 3
            r3 = 2
            r4 = 1
            r5 = 0
            bw2 r6 = defpackage.bw2.a
            if (r0 == 0) goto L2a
            if (r0 == r4) goto L26
            if (r0 == r3) goto L1c
            if (r0 != r2) goto L16
            defpackage.jzb.q(r9)
            goto L6d
        L16:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qc0.p(r8)
            return r5
        L1c:
            defpackage.jzb.q(r9)
            ezb r9 = (defpackage.ezb) r9
            java.lang.Object r9 = r9.b()
            goto L54
        L26:
            defpackage.jzb.q(r9)
            goto L3f
        L2a:
            defpackage.jzb.q(r9)
            kt1 r9 = new kt1
            nt1 r0 = r8.this$0
            ai.askquin.model.TarotSkinIdentify r7 = r8.$skin
            r9.<init>(r0, r7, r5)
            r8.label = r4
            java.lang.Object r9 = defpackage.lw2.b(r9, r8)
            if (r9 != r6) goto L3f
            goto L6c
        L3f:
            nt1 r9 = r8.this$0
            gpf r9 = r9.c
            ai.askquin.model.TarotSkinIdentify r0 = r8.$skin
            lmd r0 = defpackage.hfc.h(r0)
            r8.label = r3
            npf r9 = (defpackage.npf) r9
            java.lang.Object r9 = r9.e(r0, r8)
            if (r9 != r6) goto L54
            goto L6c
        L54:
            boolean r9 = r9 instanceof defpackage.dzb
            if (r9 == 0) goto L59
            return r1
        L59:
            lt1 r9 = new lt1
            nt1 r0 = r8.this$0
            ai.askquin.model.TarotSkinIdentify r3 = r8.$skin
            r9.<init>(r0, r3, r5)
            r8.L$0 = r5
            r8.label = r2
            java.lang.Object r9 = defpackage.lw2.b(r9, r8)
            if (r9 != r6) goto L6d
        L6c:
            return r6
        L6d:
            android.content.Context r9 = defpackage.cn1.P0
            if (r9 == 0) goto L78
            ai.askquin.model.TarotSkinIdentify r8 = r8.$skin
            java.util.List r0 = defpackage.g6g.a
            defpackage.g6g.h(r9, r8)
        L78:
            r8 = 2131888232(0x7f120868, float:1.9411094E38)
            r9 = 0
            defpackage.kv2.u(r8, r9)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mt1.r(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((mt1) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
