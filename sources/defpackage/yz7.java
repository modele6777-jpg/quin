package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class yz7 extends czb implements l26 {
    final /* synthetic */ yx9 $state;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yz7(yx9 yx9Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.$state = yx9Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        yz7 yz7Var = new yz7(this.$state, xn2Var);
        yz7Var.L$0 = obj;
        return yz7Var;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0072  */
    /* JADX WARN: Code duplicated, block: B:24:0x0081 A[LOOP:0: B:20:0x0070->B:24:0x0081, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:28:0x0084 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:29:0x007e A[SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:18:0x0063 -> B:19:0x0067). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.pt0
    public final java.lang.Object r(java.lang.Object r13) {
        /*
            r12 = this;
            int r0 = r12.label
            r1 = 0
            iia r2 = defpackage.iia.a
            r3 = 2
            r4 = 0
            r5 = 1
            bw2 r6 = defpackage.bw2.a
            if (r0 == 0) goto L2e
            if (r0 == r5) goto L26
            if (r0 != r3) goto L20
            java.lang.Object r0 = r12.L$2
            oia r0 = (defpackage.oia) r0
            java.lang.Object r1 = r12.L$1
            oia r1 = (defpackage.oia) r1
            java.lang.Object r5 = r12.L$0
            mbe r5 = (defpackage.mbe) r5
            defpackage.jzb.q(r13)
            goto L67
        L20:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qc0.p(r12)
            return r1
        L26:
            java.lang.Object r0 = r12.L$0
            mbe r0 = (defpackage.mbe) r0
            defpackage.jzb.q(r13)
            goto L41
        L2e:
            defpackage.jzb.q(r13)
            java.lang.Object r13 = r12.L$0
            r0 = r13
            mbe r0 = (defpackage.mbe) r0
            r12.L$0 = r0
            r12.label = r5
            java.lang.Object r13 = defpackage.ffe.a(r0, r4, r2, r12)
            if (r13 != r6) goto L41
            goto L62
        L41:
            oia r13 = (defpackage.oia) r13
            yx9 r5 = r12.$state
            vz9 r5 = r5.c
            hl9 r7 = new hl9
            r8 = 0
            r7.<init>(r8)
            r5.setValue(r7)
            r5 = r0
        L52:
            if (r1 != 0) goto L90
            r12.L$0 = r5
            r12.L$1 = r13
            r12.L$2 = r1
            r12.label = r3
            java.lang.Object r0 = r5.a(r2, r12)
            if (r0 != r6) goto L63
        L62:
            return r6
        L63:
            r11 = r1
            r1 = r13
            r13 = r0
            r0 = r11
        L67:
            hia r13 = (defpackage.hia) r13
            java.util.List r7 = r13.a
            int r8 = r7.size()
            r9 = r4
        L70:
            if (r9 >= r8) goto L84
            java.lang.Object r10 = r7.get(r9)
            oia r10 = (defpackage.oia) r10
            boolean r10 = defpackage.xo1.m(r10)
            if (r10 != 0) goto L81
            r13 = r1
            r1 = r0
            goto L52
        L81:
            int r9 = r9 + 1
            goto L70
        L84:
            java.util.List r13 = r13.a
            java.lang.Object r13 = r13.get(r4)
            oia r13 = (defpackage.oia) r13
            r11 = r1
            r1 = r13
            r13 = r11
            goto L52
        L90:
            yx9 r12 = r12.$state
            long r0 = r1.c
            long r2 = r13.c
            long r0 = defpackage.hl9.f(r0, r2)
            vz9 r12 = r12.c
            hl9 r13 = new hl9
            r13.<init>(r0)
            r12.setValue(r13)
            wef r12 = defpackage.wef.a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yz7.r(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((yz7) k((xn2) obj2, (mbe) obj)).r(wef.a);
    }
}
