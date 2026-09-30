package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class rr extends czb implements l26 {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ tr this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rr(tr trVar, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = trVar;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        rr rrVar = new rr(this.this$0, xn2Var);
        rrVar.L$0 = obj;
        return rrVar;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x007d  */
    /* JADX WARN: Code duplicated, block: B:28:0x008f A[LOOP:1: B:24:0x007b->B:28:0x008f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:43:0x0093 A[EDGE_INSN: B:43:0x0093->B:30:0x0093 BREAK  A[LOOP:1: B:24:0x007b->B:28:0x008f], SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:15:0x004c -> B:17:0x004f). Please report as a decompilation issue!!! */
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
            r1 = 2
            r2 = 0
            r3 = 1
            bw2 r4 = defpackage.bw2.a
            if (r0 == 0) goto L23
            if (r0 == r3) goto L1b
            if (r0 != r1) goto L15
            java.lang.Object r0 = r12.L$0
            mbe r0 = (defpackage.mbe) r0
            defpackage.jzb.q(r13)
            goto L4f
        L15:
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qc0.p(r12)
            return r2
        L1b:
            java.lang.Object r0 = r12.L$0
            mbe r0 = (defpackage.mbe) r0
            defpackage.jzb.q(r13)
            goto L36
        L23:
            defpackage.jzb.q(r13)
            java.lang.Object r13 = r12.L$0
            r0 = r13
            mbe r0 = (defpackage.mbe) r0
            r12.L$0 = r0
            r12.label = r3
            java.lang.Object r13 = defpackage.ffe.b(r0, r12, r1)
            if (r13 != r4) goto L36
            goto L4e
        L36:
            oia r13 = (defpackage.oia) r13
            tr r3 = r12.this$0
            long r5 = r13.a
            r3.h = r5
            long r5 = r13.c
            r3.b = r5
        L42:
            r12.L$0 = r0
            r12.label = r1
            iia r13 = defpackage.iia.b
            java.lang.Object r13 = r0.a(r13, r12)
            if (r13 != r4) goto L4f
        L4e:
            return r4
        L4f:
            hia r13 = (defpackage.hia) r13
            java.util.List r13 = r13.a
            java.util.ArrayList r3 = new java.util.ArrayList
            int r5 = r13.size()
            r3.<init>(r5)
            int r5 = r13.size()
            r6 = 0
            r7 = r6
        L62:
            if (r7 >= r5) goto L75
            java.lang.Object r8 = r13.get(r7)
            r9 = r8
            oia r9 = (defpackage.oia) r9
            boolean r9 = r9.d
            if (r9 == 0) goto L72
            r3.add(r8)
        L72:
            int r7 = r7 + 1
            goto L62
        L75:
            tr r13 = r12.this$0
            int r5 = r3.size()
        L7b:
            if (r6 >= r5) goto L92
            java.lang.Object r7 = r3.get(r6)
            r8 = r7
            oia r8 = (defpackage.oia) r8
            long r8 = r8.a
            long r10 = r13.h
            boolean r8 = defpackage.kn2.E(r8, r10)
            if (r8 == 0) goto L8f
            goto L93
        L8f:
            int r6 = r6 + 1
            goto L7b
        L92:
            r7 = r2
        L93:
            oia r7 = (defpackage.oia) r7
            if (r7 != 0) goto L9e
            java.lang.Object r13 = defpackage.s72.x0(r3)
            r7 = r13
            oia r7 = (defpackage.oia) r7
        L9e:
            if (r7 == 0) goto Laa
            tr r13 = r12.this$0
            long r5 = r7.a
            r13.h = r5
            long r5 = r7.c
            r13.b = r5
        Laa:
            boolean r13 = r3.isEmpty()
            if (r13 == 0) goto L42
            tr r12 = r12.this$0
            r0 = -1
            r12.h = r0
            wef r12 = defpackage.wef.a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rr.r(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((rr) k((xn2) obj2, (mbe) obj)).r(wef.a);
    }
}
