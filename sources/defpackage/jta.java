package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class jta extends czb implements l26 {
    final /* synthetic */ gfe $onDown;
    final /* synthetic */ x16 $onUp;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jta(gfe gfeVar, x16 x16Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.$onDown = gfeVar;
        this.$onUp = x16Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        jta jtaVar = new jta(this.$onDown, this.$onUp, xn2Var);
        jtaVar.L$0 = obj;
        return jtaVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0038, code lost:
    
        if (r12 == r3) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0089, code lost:
    
        if (r12 == r3) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x008b, code lost:
    
        return r3;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:25:0x0089 -> B:27:0x008c). Please report as a decompilation issue!!! */
    @Override // defpackage.pt0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object r(java.lang.Object r12) {
        /*
            r11 = this;
            int r0 = r11.label
            r1 = 2
            r2 = 1
            bw2 r3 = defpackage.bw2.a
            if (r0 == 0) goto L28
            if (r0 == r2) goto L20
            if (r0 != r1) goto L19
            java.lang.Object r0 = r11.L$1
            oia r0 = (defpackage.oia) r0
            java.lang.Object r2 = r11.L$0
            mbe r2 = (defpackage.mbe) r2
            defpackage.jzb.q(r12)
            goto L8c
        L19:
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qc0.p(r11)
            r11 = 0
            return r11
        L20:
            java.lang.Object r0 = r11.L$0
            mbe r0 = (defpackage.mbe) r0
            defpackage.jzb.q(r12)
            goto L3b
        L28:
            defpackage.jzb.q(r12)
            java.lang.Object r12 = r11.L$0
            r0 = r12
            mbe r0 = (defpackage.mbe) r0
            r11.L$0 = r0
            r11.label = r2
            java.lang.Object r12 = defpackage.ffe.b(r0, r11, r1)
            if (r12 != r3) goto L3b
            goto L8b
        L3b:
            oia r12 = (defpackage.oia) r12
            gfe r2 = r11.$onDown
            long r4 = r12.c
            pk1 r2 = (defpackage.pk1) r2
            java.lang.Object r4 = r2.c
            jse r4 = (defpackage.jse) r4
            bv7 r5 = r4.q()
            if (r5 == 0) goto L54
            r6 = 0
            long r5 = r5.c(r6)
            goto L59
        L54:
            r5 = 9205357640488583168(0x7fc000007fc00000, double:2.247117487993712E307)
        L59:
            vz9 r7 = r4.n
            hl9 r8 = new hl9
            r8.<init>(r5)
            r7.setValue(r8)
            boolean r2 = r2.b
            if (r2 == 0) goto L6a
            sg6 r5 = defpackage.sg6.b
            goto L6c
        L6a:
            sg6 r5 = defpackage.sg6.c
        L6c:
            long r6 = r4.o(r2)
            long r6 = defpackage.svc.a(r6)
            r4.A(r5, r6)
            x16 r2 = r11.$onUp
            if (r2 == 0) goto Lb4
            r2 = r0
            r0 = r12
        L7d:
            r11.L$0 = r2
            r11.L$1 = r0
            r11.label = r1
            iia r12 = defpackage.iia.b
            java.lang.Object r12 = r2.a(r12, r11)
            if (r12 != r3) goto L8c
        L8b:
            return r3
        L8c:
            hia r12 = (defpackage.hia) r12
            java.util.List r12 = r12.a
            int r4 = r12.size()
            r5 = 0
        L95:
            if (r5 >= r4) goto Laf
            java.lang.Object r6 = r12.get(r5)
            oia r6 = (defpackage.oia) r6
            long r7 = r6.a
            long r9 = r0.a
            boolean r7 = defpackage.kn2.E(r7, r9)
            if (r7 == 0) goto Lac
            boolean r6 = r6.d
            if (r6 == 0) goto Lac
            goto L7d
        Lac:
            int r5 = r5 + 1
            goto L95
        Laf:
            x16 r11 = r11.$onUp
            r11.invoke()
        Lb4:
            wef r11 = defpackage.wef.a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jta.r(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((jta) k((xn2) obj2, (mbe) obj)).r(wef.a);
    }
}
