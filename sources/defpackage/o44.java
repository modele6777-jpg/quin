package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class o44 extends gbe implements l26 {
    final /* synthetic */ gd8 $localStorage;
    int I$0;
    int I$1;
    int I$2;
    Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o44(gd8 gd8Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.$localStorage = gd8Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new o44(this.$localStorage, xn2Var);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0025  */
    /* JADX WARN: Code duplicated, block: B:12:0x0037 A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:11:0x0035 -> B:13:0x0038). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.pt0
    public final java.lang.Object r(java.lang.Object r8) {
        /*
            r7 = this;
            int r0 = r7.label
            r1 = 0
            r2 = 3
            r3 = 1
            if (r0 == 0) goto L1b
            if (r0 != r3) goto L15
            int r0 = r7.I$1
            int r4 = r7.I$0
            java.lang.Object r5 = r7.L$0
            gd8 r5 = (defpackage.gd8) r5
            defpackage.jzb.q(r8)
            goto L38
        L15:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qc0.p(r7)
            return r1
        L1b:
            defpackage.jzb.q(r8)
            gd8 r8 = r7.$localStorage
            r0 = 0
            r5 = r8
            r4 = r2
        L23:
            if (r0 >= r4) goto L3a
            r7.L$0 = r5
            r7.I$0 = r4
            r7.I$1 = r0
            r7.I$2 = r0
            r7.label = r3
            java.lang.Object r8 = defpackage.gd8.k(r5, r1, r7, r2)
            bw2 r6 = defpackage.bw2.a
            if (r8 != r6) goto L38
            return r6
        L38:
            int r0 = r0 + r3
            goto L23
        L3a:
            wef r7 = defpackage.wef.a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o44.r(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((o44) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
