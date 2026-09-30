package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class eoa extends czb implements l26 {
    final /* synthetic */ soa $viewModel;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public eoa(soa soaVar, xn2 xn2Var) {
        super(2, xn2Var);
        this.$viewModel = soaVar;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        eoa eoaVar = new eoa(this.$viewModel, xn2Var);
        eoaVar.L$0 = obj;
        return eoaVar;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0027 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:14:0x002e  */
    /* JADX WARN: Code duplicated, block: B:17:0x0035  */
    /* JADX WARN: Code duplicated, block: B:20:0x003f  */
    /* JADX WARN: Code duplicated, block: B:34:0x0049 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x0039 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:12:0x0028). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:34:0x0049
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.pt0
    public final java.lang.Object r(java.lang.Object r8) {
        /*
            r7 = this;
            java.lang.Object r0 = r7.L$0
            mbe r0 = (defpackage.mbe) r0
            int r1 = r7.label
            r2 = 1
            if (r1 == 0) goto L16
            if (r1 != r2) goto Lf
            defpackage.jzb.q(r8)
            goto L28
        Lf:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qc0.p(r7)
            r7 = 0
            return r7
        L16:
            defpackage.jzb.q(r8)
        L19:
            r7.L$0 = r0
            r7.label = r2
            iia r8 = defpackage.iia.b
            java.lang.Object r8 = r0.a(r8, r7)
            bw2 r1 = defpackage.bw2.a
            if (r8 != r1) goto L28
            return r1
        L28:
            hia r8 = (defpackage.hia) r8
            java.util.List r8 = r8.a
            if (r8 == 0) goto L35
            boolean r1 = r8.isEmpty()
            if (r1 == 0) goto L35
            goto L19
        L35:
            java.util.Iterator r8 = r8.iterator()
        L39:
            boolean r1 = r8.hasNext()
            if (r1 == 0) goto L19
            java.lang.Object r1 = r8.next()
            oia r1 = (defpackage.oia) r1
            boolean r3 = r1.d
            if (r3 != 0) goto L39
            boolean r1 = r1.h
            if (r1 == 0) goto L39
            soa r8 = r7.$viewModel
            vz9 r8 = r8.g
            java.lang.Object r8 = r8.getValue()
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 == 0) goto L19
            soa r8 = r7.$viewModel
            gk0 r1 = r8.d
            vz9 r3 = r8.g
            java.lang.Object r4 = r3.getValue()
            java.lang.Boolean r4 = (java.lang.Boolean) r4
            boolean r4 = r4.booleanValue()
            if (r4 != 0) goto L70
            goto L19
        L70:
            r1.f()
            java.lang.Boolean r4 = java.lang.Boolean.FALSE
            r3.setValue(r4)
            int r3 = r1.c
            r4 = 2
            p05 r5 = defpackage.p05.a
            if (r3 >= r4) goto L99
            x1f r8 = defpackage.x1f.a
            zea r8 = new zea
            r3 = 5
            r8.<init>(r3)
            defpackage.x1f.k(r5, r8, r4)
            r8 = 2131888604(0x7f1209dc, float:1.9411848E38)
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            r3 = 0
            defpackage.jcc.k(r3, r8)
            r1.b()
            goto L19
        L99:
            x1f r3 = defpackage.x1f.a
            zea r3 = new zea
            r6 = 6
            r3.<init>(r6)
            defpackage.x1f.k(r5, r3, r4)
            vz9 r3 = r8.x
            java.lang.Boolean r4 = java.lang.Boolean.TRUE
            r3.setValue(r4)
            int r1 = r1.c
            sz9 r3 = r8.y
            r3.k(r1)
            r8.m()
            goto L19
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eoa.r(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        ((eoa) k((xn2) obj2, (mbe) obj)).r(wef.a);
        return bw2.a;
    }
}
