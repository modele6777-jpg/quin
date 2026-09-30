package defpackage;

import ai.askquin.model.TarotSkinIdentify;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class c3d extends gbe implements l26 {
    final /* synthetic */ TarotSkinIdentify $skin;
    int label;
    final /* synthetic */ d3d this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c3d(d3d d3dVar, TarotSkinIdentify tarotSkinIdentify, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = d3dVar;
        this.$skin = tarotSkinIdentify;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new c3d(this.this$0, this.$skin, xn2Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0041, code lost:
    
        if (r5.j(r0, r4) == r3) goto L15;
     */
    @Override // defpackage.pt0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object r(java.lang.Object r5) {
        /*
            r4 = this;
            int r0 = r4.label
            r1 = 2
            r2 = 1
            bw2 r3 = defpackage.bw2.a
            if (r0 == 0) goto L1b
            if (r0 == r2) goto L17
            if (r0 != r1) goto L10
            defpackage.jzb.q(r5)
            goto L44
        L10:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qc0.p(r4)
            r4 = 0
            return r4
        L17:
            defpackage.jzb.q(r5)
            goto L31
        L1b:
            defpackage.jzb.q(r5)
            d3d r5 = r4.this$0
            xof r5 = r5.a
            ai.askquin.model.TarotSkinIdentify r0 = r4.$skin
            n2f r0 = r0.getKey()
            r4.label = r2
            java.lang.Object r5 = r5.a(r0, r4)
            if (r5 != r3) goto L31
            goto L43
        L31:
            d3d r5 = r4.this$0
            xof r5 = r5.a
            ai.askquin.model.TarotSkinIdentify r0 = r4.$skin
            n2f r0 = r0.getKey()
            r4.label = r1
            java.lang.Object r5 = r5.j(r0, r4)
            if (r5 != r3) goto L44
        L43:
            return r3
        L44:
            d3d r5 = r4.this$0
            kmd r5 = r5.b
            ai.askquin.model.TarotSkinIdentify r4 = r4.$skin
            boolean r4 = r5.b(r4)
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c3d.r(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((c3d) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
