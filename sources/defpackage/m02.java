package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class m02 extends czb implements l26 {
    final /* synthetic */ n69 $angularVelocity$delegate;
    final /* synthetic */ aw2 $coroutineScope;
    final /* synthetic */ e89 $hasZoomedInGesture$delegate;
    final /* synthetic */ e89 $isGestureStarted$delegate;
    final /* synthetic */ jx $rotationAnimatable;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m02(aw2 aw2Var, jx jxVar, e89 e89Var, e89 e89Var2, n69 n69Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.$coroutineScope = aw2Var;
        this.$rotationAnimatable = jxVar;
        this.$isGestureStarted$delegate = e89Var;
        this.$hasZoomedInGesture$delegate = e89Var2;
        this.$angularVelocity$delegate = n69Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        m02 m02Var = new m02(this.$coroutineScope, this.$rotationAnimatable, this.$isGestureStarted$delegate, this.$hasZoomedInGesture$delegate, this.$angularVelocity$delegate, xn2Var);
        m02Var.L$0 = obj;
        return m02Var;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x006c  */
    /* JADX WARN: Code duplicated, block: B:36:0x0077 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x0048 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:38:? A[LOOP:0: B:24:0x0066->B:38:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x0052 -> B:18:0x0055). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.pt0
    public final java.lang.Object r(java.lang.Object r10) {
        /*
            r9 = this;
            java.lang.Object r0 = r9.L$0
            mbe r0 = (defpackage.mbe) r0
            int r1 = r9.label
            r2 = 3
            r3 = 2
            r4 = 1
            r5 = 0
            bw2 r6 = defpackage.bw2.a
            if (r1 == 0) goto L20
            if (r1 == r4) goto L1c
            if (r1 != r3) goto L16
            defpackage.jzb.q(r10)
            goto L55
        L16:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qc0.p(r9)
            return r5
        L1c:
            defpackage.jzb.q(r10)
            goto L2e
        L20:
            defpackage.jzb.q(r10)
        L23:
            r9.L$0 = r0
            r9.label = r4
            java.lang.Object r10 = defpackage.ffe.b(r0, r9, r2)
            if (r10 != r6) goto L2e
            goto L54
        L2e:
            aw2 r10 = r9.$coroutineScope
            k02 r1 = new k02
            jx r7 = r9.$rotationAnimatable
            r1.<init>(r7, r5)
            defpackage.ynb.V(r10, r5, r5, r1, r2)
            e89 r10 = r9.$isGestureStarted$delegate
            wn7[] r1 = defpackage.q02.a
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r10.setValue(r1)
            e89 r10 = r9.$hasZoomedInGesture$delegate
            r10.setValue(r1)
        L48:
            r9.L$0 = r0
            r9.label = r3
            iia r10 = defpackage.iia.b
            java.lang.Object r10 = r0.a(r10, r9)
            if (r10 != r6) goto L55
        L54:
            return r6
        L55:
            hia r10 = (defpackage.hia) r10
            java.util.List r10 = r10.a
            if (r10 == 0) goto L62
            boolean r1 = r10.isEmpty()
            if (r1 == 0) goto L62
            goto L77
        L62:
            java.util.Iterator r10 = r10.iterator()
        L66:
            boolean r1 = r10.hasNext()
            if (r1 == 0) goto L77
            java.lang.Object r1 = r10.next()
            oia r1 = (defpackage.oia) r1
            boolean r1 = r1.d
            if (r1 == 0) goto L66
            goto L48
        L77:
            e89 r10 = r9.$isGestureStarted$delegate
            wn7[] r1 = defpackage.q02.a
            java.lang.Object r10 = r10.getValue()
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L23
            e89 r10 = r9.$hasZoomedInGesture$delegate
            java.lang.Object r10 = r10.getValue()
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 != 0) goto L23
            n69 r10 = r9.$angularVelocity$delegate
            qz9 r10 = (defpackage.qz9) r10
            float r10 = r10.j()
            float r10 = java.lang.Math.abs(r10)
            r1 = 1092616192(0x41200000, float:10.0)
            int r10 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r10 <= 0) goto L23
            aw2 r10 = r9.$coroutineScope
            l02 r1 = new l02
            jx r7 = r9.$rotationAnimatable
            n69 r8 = r9.$angularVelocity$delegate
            r1.<init>(r7, r8, r5)
            defpackage.ynb.V(r10, r5, r5, r1, r2)
            goto L23
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.m02.r(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        ((m02) k((xn2) obj2, (mbe) obj)).r(wef.a);
        return bw2.a;
    }
}
