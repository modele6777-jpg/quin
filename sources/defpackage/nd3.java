package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class nd3 extends gbe implements l26 {
    final /* synthetic */ Object $newData;
    final /* synthetic */ kmb $newVersion;
    final /* synthetic */ boolean $updateCache;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ od3 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nd3(kmb kmbVar, od3 od3Var, Object obj, boolean z, xn2 xn2Var) {
        super(2, xn2Var);
        this.$newVersion = kmbVar;
        this.this$0 = od3Var;
        this.$newData = obj;
        this.$updateCache = z;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        nd3 nd3Var = new nd3(this.$newVersion, this.this$0, this.$newData, this.$updateCache, xn2Var);
        nd3Var.L$0 = obj;
        return nd3Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x006b, code lost:
    
        if (r9 == r5) goto L21;
     */
    @Override // defpackage.pt0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object r(java.lang.Object r9) throws java.io.IOException {
        /*
            r8 = this;
            int r0 = r8.label
            wef r1 = defpackage.wef.a
            r2 = 2
            r3 = 1
            r4 = 0
            bw2 r5 = defpackage.bw2.a
            if (r0 == 0) goto L25
            if (r0 == r3) goto L19
            if (r0 != r2) goto L13
            defpackage.jzb.q(r9)
            goto L6e
        L13:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qc0.p(r8)
            return r4
        L19:
            java.lang.Object r0 = r8.L$1
            kmb r0 = (defpackage.kmb) r0
            java.lang.Object r3 = r8.L$0
            le5 r3 = (defpackage.le5) r3
            defpackage.jzb.q(r9)
            goto L44
        L25:
            defpackage.jzb.q(r9)
            java.lang.Object r9 = r8.L$0
            le5 r9 = (defpackage.le5) r9
            kmb r0 = r8.$newVersion
            od3 r6 = r8.this$0
            k77 r6 = r6.c()
            r8.L$0 = r9
            r8.L$1 = r0
            r8.label = r3
            java.lang.Object r3 = r6.b(r8)
            if (r3 != r5) goto L41
            goto L6d
        L41:
            r7 = r3
            r3 = r9
            r9 = r7
        L44:
            java.lang.Number r9 = (java.lang.Number) r9
            int r9 = r9.intValue()
            r0.element = r9
            java.lang.Object r9 = r8.$newData
            r8.L$0 = r4
            r8.L$1 = r4
            r8.label = r2
            java.util.concurrent.atomic.AtomicBoolean r0 = r3.c
            boolean r0 = r0.get()
            if (r0 != 0) goto L8d
            java.io.File r0 = r3.a
            ke5 r2 = new ke5
            r2.<init>(r3, r9, r4)
            java.lang.Object r9 = defpackage.m93.M(r0, r2, r8)
            if (r9 != r5) goto L6a
            goto L6b
        L6a:
            r9 = r1
        L6b:
            if (r9 != r5) goto L6e
        L6d:
            return r5
        L6e:
            boolean r9 = r8.$updateCache
            if (r9 == 0) goto L8c
            od3 r9 = r8.this$0
            kd9 r9 = r9.h
            cb3 r0 = new cb3
            java.lang.Object r2 = r8.$newData
            if (r2 == 0) goto L81
            int r3 = r2.hashCode()
            goto L82
        L81:
            r3 = 0
        L82:
            kmb r8 = r8.$newVersion
            int r8 = r8.element
            r0.<init>(r2, r3, r8)
            r9.M(r0)
        L8c:
            return r1
        L8d:
            java.lang.String r8 = "This scope has already been closed."
            defpackage.qc0.p(r8)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nd3.r(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((nd3) k((xn2) obj2, (le5) obj)).r(wef.a);
    }
}
