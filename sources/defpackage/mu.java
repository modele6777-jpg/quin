package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class mu extends gbe implements l26 {
    final /* synthetic */ ila $popupLayout;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mu(ila ilaVar, xn2 xn2Var) {
        super(2, xn2Var);
        this.$popupLayout = ilaVar;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        mu muVar = new mu(this.$popupLayout, xn2Var);
        muVar.L$0 = obj;
        return muVar;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0024  */
    /* JADX WARN: Code duplicated, block: B:13:0x003b  */
    /* JADX WARN: Code duplicated, block: B:15:0x004b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:19:0x0057  */
    /* JADX WARN: Code duplicated, block: B:21:0x0065  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x0049 -> B:16:0x004c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.pt0
    public final java.lang.Object r(java.lang.Object r9) {
        /*
            r8 = this;
            int r0 = r8.label
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L16
            if (r0 != r2) goto L10
            java.lang.Object r0 = r8.L$0
            aw2 r0 = (defpackage.aw2) r0
            defpackage.jzb.q(r9)
            goto L4c
        L10:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qc0.p(r8)
            return r1
        L16:
            defpackage.jzb.q(r9)
            java.lang.Object r9 = r8.L$0
            aw2 r9 = (defpackage.aw2) r9
            r0 = r9
        L1e:
            boolean r9 = defpackage.jgb.Y(r0)
            if (r9 == 0) goto L71
            z4 r9 = new z4
            r3 = 28
            r9.<init>(r3)
            r8.L$0 = r0
            r8.label = r2
            pv2 r3 = r8.getContext()
            af8 r4 = defpackage.af8.E0
            nv2 r3 = r3.F0(r4)
            if (r3 != 0) goto L6d
            pv2 r3 = r8.getContext()
            z09 r3 = defpackage.tm7.J(r3)
            java.lang.Object r9 = r3.g0(r8, r9)
            bw2 r3 = defpackage.bw2.a
            if (r9 != r3) goto L4c
            return r3
        L4c:
            ila r9 = r8.$popupLayout
            int[] r3 = r9.U0
            boolean r4 = r9.isAttachedToWindow()
            if (r4 != 0) goto L57
            goto L1e
        L57:
            r4 = 0
            r5 = r3[r4]
            r6 = r3[r2]
            android.view.View r7 = r9.E0
            r7.getLocationOnScreen(r3)
            r4 = r3[r4]
            if (r5 != r4) goto L69
            r3 = r3[r2]
            if (r6 == r3) goto L1e
        L69:
            r9.p()
            goto L1e
        L6d:
            com.adjust.sdk.sig.r3.f()
            return r1
        L71:
            wef r8 = defpackage.wef.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mu.r(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((mu) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
