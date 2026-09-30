package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ovc extends czb implements l26 {
    final /* synthetic */ a26 $updateTouchMode;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ovc(xn2 xn2Var, a26 a26Var) {
        super(2, xn2Var);
        this.$updateTouchMode = a26Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        ovc ovcVar = new ovc(xn2Var, this.$updateTouchMode);
        ovcVar.L$0 = obj;
        return ovcVar;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x002c A[RETURN] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x002a -> B:12:0x002d). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:11:0x002c
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.pt0
    public final java.lang.Object r(java.lang.Object r4) {
        /*
            r3 = this;
            int r0 = r3.label
            r1 = 1
            if (r0 == 0) goto L16
            if (r0 != r1) goto Lf
            java.lang.Object r0 = r3.L$0
            mbe r0 = (defpackage.mbe) r0
            defpackage.jzb.q(r4)
            goto L2d
        Lf:
            java.lang.String r3 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qc0.p(r3)
            r3 = 0
            return r3
        L16:
            defpackage.jzb.q(r4)
            java.lang.Object r4 = r3.L$0
            mbe r4 = (defpackage.mbe) r4
            r0 = r4
        L1e:
            r3.L$0 = r0
            r3.label = r1
            iia r4 = defpackage.iia.a
            java.lang.Object r4 = r0.a(r4, r3)
            bw2 r2 = defpackage.bw2.a
            if (r4 != r2) goto L2d
            return r2
        L2d:
            hia r4 = (defpackage.hia) r4
            a26 r2 = r3.$updateTouchMode
            boolean r4 = defpackage.pvc.a(r4)
            r4 = r4 ^ r1
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r4)
            r2.d(r4)
            goto L1e
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ovc.r(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        ((ovc) k((xn2) obj2, (mbe) obj)).r(wef.a);
        return bw2.a;
    }
}
