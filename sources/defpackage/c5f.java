package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class c5f extends gbe implements l26 {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ j5f this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c5f(j5f j5fVar, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = j5fVar;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        c5f c5fVar = new c5f(this.this$0, xn2Var);
        c5fVar.L$0 = obj;
        return c5fVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x004c, code lost:
    
        if (r7 == r4) goto L19;
     */
    @Override // defpackage.pt0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object r(java.lang.Object r7) {
        /*
            r6 = this;
            int r0 = r6.label
            r1 = 0
            r2 = 2
            r3 = 1
            bw2 r4 = defpackage.bw2.a
            if (r0 == 0) goto L1f
            if (r0 == r3) goto L17
            if (r0 != r2) goto L11
            defpackage.jzb.q(r7)     // Catch: android.database.SQLException -> L52
            goto L4f
        L11:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qc0.p(r6)
            return r1
        L17:
            java.lang.Object r0 = r6.L$0
            l2f r0 = (defpackage.l2f) r0
            defpackage.jzb.q(r7)
            goto L32
        L1f:
            defpackage.jzb.q(r7)
            java.lang.Object r7 = r6.L$0
            r0 = r7
            l2f r0 = (defpackage.l2f) r0
            r6.L$0 = r0
            r6.label = r3
            java.lang.Boolean r7 = r0.a(r6)
            if (r7 != r4) goto L32
            goto L4e
        L32:
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            if (r7 == 0) goto L3b
            goto L52
        L3b:
            k2f r7 = defpackage.k2f.b     // Catch: android.database.SQLException -> L52
            b5f r3 = new b5f     // Catch: android.database.SQLException -> L52
            j5f r5 = r6.this$0     // Catch: android.database.SQLException -> L52
            r3.<init>(r5, r1)     // Catch: android.database.SQLException -> L52
            r6.L$0 = r1     // Catch: android.database.SQLException -> L52
            r6.label = r2     // Catch: android.database.SQLException -> L52
            java.lang.Object r7 = r0.b(r7, r3, r6)     // Catch: android.database.SQLException -> L52
            if (r7 != r4) goto L4f
        L4e:
            return r4
        L4f:
            java.util.Set r7 = (java.util.Set) r7     // Catch: android.database.SQLException -> L52
            return r7
        L52:
            xu4 r6 = defpackage.xu4.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c5f.r(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((c5f) k((xn2) obj2, (l2f) obj)).r(wef.a);
    }
}
