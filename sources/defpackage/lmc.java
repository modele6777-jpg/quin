package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class lmc extends gbe implements l26 {
    final /* synthetic */ n69 $currentProgress$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public lmc(n69 n69Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.$currentProgress$delegate = n69Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new lmc(this.$currentProgress$delegate, xn2Var);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0024  */
    /* JADX WARN: Code duplicated, block: B:13:0x0034 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:16:0x004c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0032 -> B:14:0x0035). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:11:0x0024
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.pt0
    public final java.lang.Object r(java.lang.Object r6) {
        /*
            r5 = this;
            int r0 = r5.label
            r1 = 1064514355(0x3f733333, float:0.95)
            r2 = 1
            if (r0 == 0) goto L15
            if (r0 != r2) goto Le
            defpackage.jzb.q(r6)
            goto L35
        Le:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qc0.p(r5)
            r5 = 0
            return r5
        L15:
            defpackage.jzb.q(r6)
        L18:
            n69 r6 = r5.$currentProgress$delegate
            qz9 r6 = (defpackage.qz9) r6
            float r6 = r6.j()
            int r6 = (r6 > r1 ? 1 : (r6 == r1 ? 0 : -1))
            if (r6 >= 0) goto L51
            j4 r6 = defpackage.mbb.b
            long r3 = r6.g()
            r5.label = r2
            java.lang.Object r6 = defpackage.vfh.q(r3, r5)
            bw2 r0 = defpackage.bw2.a
            if (r6 != r0) goto L35
            return r0
        L35:
            j4 r6 = defpackage.mbb.b
            float r6 = r6.b()
            r0 = 1031127695(0x3d75c28f, float:0.06)
            float r6 = r6 * r0
            n69 r0 = r5.$currentProgress$delegate
            qz9 r0 = (defpackage.qz9) r0
            float r3 = r0.j()
            float r3 = r3 + r6
            int r6 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r6 <= 0) goto L4d
            r3 = r1
        L4d:
            r0.k(r3)
            goto L18
        L51:
            wef r5 = defpackage.wef.a
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lmc.r(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((lmc) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
