package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class a66 extends gbe implements l26 {
    final /* synthetic */ n69 $currentProgress$delegate;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a66(n69 n69Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.$currentProgress$delegate = n69Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new a66(this.$currentProgress$delegate, xn2Var);
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0023  */
    /* JADX WARN: Code duplicated, block: B:13:0x0033 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:16:0x0043  */
    /* JADX WARN: Code duplicated, block: B:19:0x005b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0031 -> B:14:0x0034). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:16:0x0043
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.pt0
    public final java.lang.Object r(java.lang.Object r5) {
        /*
            r4 = this;
            int r0 = r4.label
            r1 = 1
            if (r0 == 0) goto L12
            if (r0 != r1) goto Lb
            defpackage.jzb.q(r5)
            goto L34
        Lb:
            java.lang.String r4 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qc0.p(r4)
            r4 = 0
            return r4
        L12:
            defpackage.jzb.q(r5)
        L15:
            n69 r5 = r4.$currentProgress$delegate
            qz9 r5 = (defpackage.qz9) r5
            float r5 = r5.j()
            r0 = 1065353216(0x3f800000, float:1.0)
            int r5 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r5 >= 0) goto L60
            j4 r5 = defpackage.mbb.b
            long r2 = r5.g()
            r4.label = r1
            java.lang.Object r5 = defpackage.vfh.q(r2, r4)
            bw2 r0 = defpackage.bw2.a
            if (r5 != r0) goto L34
            return r0
        L34:
            n69 r5 = r4.$currentProgress$delegate
            qz9 r5 = (defpackage.qz9) r5
            float r5 = r5.j()
            r0 = 1064514355(0x3f733333, float:0.95)
            int r5 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r5 >= 0) goto L15
            j4 r5 = defpackage.mbb.b
            float r5 = r5.b()
            r2 = 1031127695(0x3d75c28f, float:0.06)
            float r5 = r5 * r2
            n69 r2 = r4.$currentProgress$delegate
            qz9 r2 = (defpackage.qz9) r2
            float r3 = r2.j()
            float r3 = r3 + r5
            int r5 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r5 <= 0) goto L5b
            goto L5c
        L5b:
            r0 = r3
        L5c:
            r2.k(r0)
            goto L15
        L60:
            wef r4 = defpackage.wef.a
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a66.r(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((a66) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
