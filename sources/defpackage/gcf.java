package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class gcf extends gbe implements l26 {
    final /* synthetic */ h0e $currentOnResultShown$delegate;
    final /* synthetic */ n3f $drawingTransition;
    final /* synthetic */ e89 $isPatternPlaced$delegate;
    final /* synthetic */ sdd $this_StepContent;
    final /* synthetic */ rcf $viewModel;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gcf(rcf rcfVar, h0e h0eVar, e89 e89Var, n3f n3fVar, sdd sddVar, xn2 xn2Var) {
        super(2, xn2Var);
        this.$viewModel = rcfVar;
        this.$currentOnResultShown$delegate = h0eVar;
        this.$isPatternPlaced$delegate = e89Var;
        this.$drawingTransition = n3fVar;
        this.$this_StepContent = sddVar;
    }

    public static final boolean x(n3f n3fVar, sdd sddVar) {
        Object objA = n3fVar.a.a();
        tn4 tn4Var = tn4.b;
        return objA == tn4Var && n3fVar.d.getValue() == tn4Var && !n3fVar.g() && !((xdd) sddVar).e();
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new gcf(this.$viewModel, this.$currentOnResultShown$delegate, this.$isPatternPlaced$delegate, this.$drawingTransition, this.$this_StepContent, xn2Var);
    }

    /* JADX WARN: Code duplicated, block: B:23:0x005d  */
    /* JADX WARN: Code duplicated, block: B:26:0x007a  */
    /* JADX WARN: Code duplicated, block: B:29:0x0090  */
    /* JADX WARN: Code duplicated, block: B:31:0x009a  */
    /* JADX WARN: Code duplicated, block: B:33:0x00a4  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x008d -> B:29:0x0090). Please report as a decompilation issue!!! */
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
            int r0 = r9.label
            wef r1 = defpackage.wef.a
            r2 = 0
            r3 = 4
            r4 = 3
            r5 = 1
            r6 = 2
            bw2 r7 = defpackage.bw2.a
            if (r0 == 0) goto L2c
            if (r0 == r5) goto L28
            if (r0 == r6) goto L24
            if (r0 == r4) goto L1f
            if (r0 != r3) goto L19
            defpackage.jzb.q(r10)
            return r1
        L19:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qc0.p(r9)
            return r2
        L1f:
            defpackage.jzb.q(r10)
            goto L90
        L24:
            defpackage.jzb.q(r10)
            goto L7a
        L28:
            defpackage.jzb.q(r10)
            goto L5d
        L2c:
            defpackage.jzb.q(r10)
            rcf r10 = r9.$viewModel
            boolean r10 = r10.k()
            if (r10 == 0) goto Lad
            h0e r10 = r9.$currentOnResultShown$delegate
            java.lang.Object r10 = r10.getValue()
            a26 r10 = (defpackage.a26) r10
            if (r10 != 0) goto L42
            goto Lad
        L42:
            e89 r10 = r9.$isPatternPlaced$delegate
            xfc r0 = new xfc
            r8 = 11
            r0.<init>(r10, r8)
            ybc r10 = defpackage.jzb.p(r0)
            ecf r0 = new ecf
            r0.<init>(r6, r2)
            r9.label = r5
            java.lang.Object r10 = defpackage.tm7.C(r10, r0, r9)
            if (r10 != r7) goto L5d
            goto Lac
        L5d:
            n3f r10 = r9.$drawingTransition
            sdd r0 = r9.$this_StepContent
            ykc r5 = new ykc
            r8 = 27
            r5.<init>(r8, r10, r0)
            ybc r10 = defpackage.jzb.p(r5)
            fcf r0 = new fcf
            r0.<init>(r6, r2)
            r9.label = r6
            java.lang.Object r10 = defpackage.tm7.C(r10, r0, r9)
            if (r10 != r7) goto L7a
            goto Lac
        L7a:
            k8f r10 = new k8f
            r10.<init>(r6)
            r9.label = r4
            pv2 r0 = r9.getContext()
            z09 r0 = defpackage.tm7.J(r0)
            java.lang.Object r10 = r0.g0(r9, r10)
            if (r10 != r7) goto L90
            goto Lac
        L90:
            n3f r10 = r9.$drawingTransition
            sdd r0 = r9.$this_StepContent
            boolean r10 = x(r10, r0)
            if (r10 == 0) goto L5d
            h0e r10 = r9.$currentOnResultShown$delegate
            java.lang.Object r10 = r10.getValue()
            a26 r10 = (defpackage.a26) r10
            if (r10 == 0) goto Lad
            r9.label = r3
            java.lang.Object r9 = r10.d(r9)
            if (r9 != r7) goto Lad
        Lac:
            return r7
        Lad:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gcf.r(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((gcf) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
