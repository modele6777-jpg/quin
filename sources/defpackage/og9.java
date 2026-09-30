package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class og9 extends czb implements l26 {
    final /* synthetic */ x16 $builderAction;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public og9(x16 x16Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.$builderAction = x16Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        og9 og9Var = new og9(this.$builderAction, xn2Var);
        og9Var.L$0 = obj;
        return og9Var;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0028  */
    /* JADX WARN: Code duplicated, block: B:13:0x0034  */
    /* JADX WARN: Code duplicated, block: B:15:0x0037  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0034 -> B:14:0x0035). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:13:0x0034
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.pt0
    public final java.lang.Object r(java.lang.Object r5) {
        /*
            r4 = this;
            int r0 = r4.label
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L18
            if (r0 != r2) goto L12
            java.lang.Object r0 = r4.L$1
            java.lang.Object r3 = r4.L$0
            dyc r3 = (defpackage.dyc) r3
            defpackage.jzb.q(r5)
            goto L35
        L12:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qc0.p(r4)
            return r1
        L18:
            defpackage.jzb.q(r5)
            java.lang.Object r5 = r4.L$0
            dyc r5 = (defpackage.dyc) r5
            r3 = r5
        L20:
            x16 r5 = r4.$builderAction
            java.lang.Object r5 = r5.invoke()
            if (r5 == 0) goto L34
            r4.L$0 = r3
            r4.L$1 = r5
            r4.label = r2
            r3.c(r4, r5)
            bw2 r4 = defpackage.bw2.a
            return r4
        L34:
            r0 = r1
        L35:
            if (r0 != 0) goto L20
            wef r4 = defpackage.wef.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.og9.r(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((og9) k((xn2) obj2, (dyc) obj)).r(wef.a);
    }
}
