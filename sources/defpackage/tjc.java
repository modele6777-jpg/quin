package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class tjc extends czb implements l26 {
    final /* synthetic */ n69 $angularVelocity$delegate;
    final /* synthetic */ aw2 $coroutineScope;
    final /* synthetic */ e89 $isGestureStarted$delegate;
    final /* synthetic */ jx $rotationAnimatable;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tjc(aw2 aw2Var, jx jxVar, e89 e89Var, n69 n69Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.$coroutineScope = aw2Var;
        this.$rotationAnimatable = jxVar;
        this.$isGestureStarted$delegate = e89Var;
        this.$angularVelocity$delegate = n69Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        tjc tjcVar = new tjc(this.$coroutineScope, this.$rotationAnimatable, this.$isGestureStarted$delegate, this.$angularVelocity$delegate, xn2Var);
        tjcVar.L$0 = obj;
        return tjcVar;
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0065  */
    /* JADX WARN: Code duplicated, block: B:34:0x0070 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:35:0x0041 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:? A[LOOP:0: B:24:0x005f->B:36:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x004b -> B:18:0x004e). Please report as a decompilation issue!!! */
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
            goto L4e
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
            goto L4d
        L2e:
            aw2 r10 = r9.$coroutineScope
            rjc r1 = new rjc
            jx r7 = r9.$rotationAnimatable
            r1.<init>(r7, r5)
            defpackage.ynb.V(r10, r5, r5, r1, r2)
            e89 r10 = r9.$isGestureStarted$delegate
            java.lang.Boolean r1 = java.lang.Boolean.FALSE
            r10.setValue(r1)
        L41:
            r9.L$0 = r0
            r9.label = r3
            iia r10 = defpackage.iia.b
            java.lang.Object r10 = r0.a(r10, r9)
            if (r10 != r6) goto L4e
        L4d:
            return r6
        L4e:
            hia r10 = (defpackage.hia) r10
            java.util.List r10 = r10.a
            if (r10 == 0) goto L5b
            boolean r1 = r10.isEmpty()
            if (r1 == 0) goto L5b
            goto L70
        L5b:
            java.util.Iterator r10 = r10.iterator()
        L5f:
            boolean r1 = r10.hasNext()
            if (r1 == 0) goto L70
            java.lang.Object r1 = r10.next()
            oia r1 = (defpackage.oia) r1
            boolean r1 = r1.d
            if (r1 == 0) goto L5f
            goto L41
        L70:
            e89 r10 = r9.$isGestureStarted$delegate
            java.lang.Object r10 = r10.getValue()
            java.lang.Boolean r10 = (java.lang.Boolean) r10
            boolean r10 = r10.booleanValue()
            if (r10 == 0) goto L23
            n69 r10 = r9.$angularVelocity$delegate
            qz9 r10 = (defpackage.qz9) r10
            float r10 = r10.j()
            float r10 = java.lang.Math.abs(r10)
            r1 = 1092616192(0x41200000, float:10.0)
            int r10 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r10 <= 0) goto L23
            aw2 r10 = r9.$coroutineScope
            sjc r1 = new sjc
            jx r7 = r9.$rotationAnimatable
            n69 r8 = r9.$angularVelocity$delegate
            r1.<init>(r7, r8, r5)
            defpackage.ynb.V(r10, r5, r5, r1, r2)
            goto L23
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tjc.r(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        ((tjc) k((xn2) obj2, (mbe) obj)).r(wef.a);
        return bw2.a;
    }
}
