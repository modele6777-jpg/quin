package defpackage;

import ai.askquin.model.TarotSkinIdentify;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class b75 extends gbe implements l26 {
    final /* synthetic */ TarotSkinIdentify $skin;
    int label;
    final /* synthetic */ k75 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b75(k75 k75Var, TarotSkinIdentify tarotSkinIdentify, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = k75Var;
        this.$skin = tarotSkinIdentify;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new b75(this.this$0, this.$skin, xn2Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0054, code lost:
    
        if (((defpackage.npf) r8).e(r0, r7) == r4) goto L18;
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
            if (r0 == 0) goto L20
            if (r0 == r3) goto L1c
            if (r0 != r2) goto L16
            defpackage.jzb.q(r8)
            ezb r8 = (defpackage.ezb) r8
            r8.getClass()
            goto L57
        L16:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qc0.p(r7)
            return r1
        L1c:
            defpackage.jzb.q(r8)
            goto L37
        L20:
            defpackage.jzb.q(r8)
            fg9 r8 = defpackage.fg9.b
            a75 r0 = new a75
            k75 r5 = r7.this$0
            ai.askquin.model.TarotSkinIdentify r6 = r7.$skin
            r0.<init>(r5, r6, r1)
            r7.label = r3
            java.lang.Object r8 = defpackage.ynb.p0(r8, r0, r7)
            if (r8 != r4) goto L37
            goto L56
        L37:
            android.content.Context r8 = defpackage.cn1.P0
            if (r8 == 0) goto L42
            ai.askquin.model.TarotSkinIdentify r0 = r7.$skin
            java.util.List r1 = defpackage.g6g.a
            defpackage.g6g.h(r8, r0)
        L42:
            k75 r8 = r7.this$0
            gpf r8 = r8.g
            ai.askquin.model.TarotSkinIdentify r0 = r7.$skin
            lmd r0 = defpackage.hfc.h(r0)
            r7.label = r2
            npf r8 = (defpackage.npf) r8
            java.lang.Object r7 = r8.e(r0, r7)
            if (r7 != r4) goto L57
        L56:
            return r4
        L57:
            wef r7 = defpackage.wef.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.b75.r(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((b75) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
