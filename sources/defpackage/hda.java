package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class hda extends gbe implements l26 {
    final /* synthetic */ Integer $cardCount;
    final /* synthetic */ String $content;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ ida this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hda(String str, Integer num, ida idaVar, xn2 xn2Var) {
        super(2, xn2Var);
        this.$content = str;
        this.$cardCount = num;
        this.this$0 = idaVar;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        hda hdaVar = new hda(this.$content, this.$cardCount, this.this$0, xn2Var);
        hdaVar.L$0 = obj;
        return hdaVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0060, code lost:
    
        if (r0.a(r8, r7) == r5) goto L18;
     */
    @Override // defpackage.pt0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object r(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.L$0
            xj5 r0 = (defpackage.xj5) r0
            int r1 = r7.label
            r2 = 2
            r3 = 1
            r4 = 0
            bw2 r5 = defpackage.bw2.a
            if (r1 == 0) goto L2b
            if (r1 == r3) goto L23
            if (r1 != r2) goto L1d
            java.lang.Object r0 = r7.L$2
            tech.chatmind.api.server.NullableServerResponse r0 = (tech.chatmind.api.server.NullableServerResponse) r0
            java.lang.Object r7 = r7.L$1
            tech.chatmind.api.generatecard.model.CardDetectionRequest r7 = (tech.chatmind.api.generatecard.model.CardDetectionRequest) r7
            defpackage.jzb.q(r8)
            goto L63
        L1d:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qc0.p(r7)
            return r4
        L23:
            java.lang.Object r1 = r7.L$1
            tech.chatmind.api.generatecard.model.CardDetectionRequest r1 = (tech.chatmind.api.generatecard.model.CardDetectionRequest) r1
            defpackage.jzb.q(r8)
            goto L48
        L2b:
            defpackage.jzb.q(r8)
            tech.chatmind.api.generatecard.model.CardDetectionRequest r8 = new tech.chatmind.api.generatecard.model.CardDetectionRequest
            java.lang.String r1 = r7.$content
            java.lang.Integer r6 = r7.$cardCount
            r8.<init>(r1, r6)
            ida r1 = r7.this$0
            vq1 r1 = r1.a
            r7.L$0 = r0
            r7.L$1 = r4
            r7.label = r3
            java.lang.Object r8 = r1.a(r8, r7)
            if (r8 != r5) goto L48
            goto L62
        L48:
            tech.chatmind.api.server.NullableServerResponse r8 = (tech.chatmind.api.server.NullableServerResponse) r8
            java.lang.Object r8 = r8.getData()
            java.util.List r8 = (java.util.List) r8
            if (r8 != 0) goto L54
            pu4 r8 = defpackage.pu4.a
        L54:
            r7.L$0 = r4
            r7.L$1 = r4
            r7.L$2 = r4
            r7.label = r2
            java.lang.Object r7 = r0.a(r8, r7)
            if (r7 != r5) goto L63
        L62:
            return r5
        L63:
            wef r7 = defpackage.wef.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hda.r(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((hda) k((xn2) obj2, (xj5) obj)).r(wef.a);
    }
}
