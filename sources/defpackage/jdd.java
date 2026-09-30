package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class jdd extends gbe implements l26 {
    final /* synthetic */ j0d $sessionData;
    int label;
    final /* synthetic */ ldd this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jdd(ldd lddVar, j0d j0dVar, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = lddVar;
        this.$sessionData = j0dVar;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new jdd(this.this$0, this.$sessionData, xn2Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:15:0x0030, code lost:
    
        if (r6 == r4) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x008d, code lost:
    
        if (r0.e(r7, defpackage.fdd.b, r6) == r4) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x008f, code lost:
    
        return r4;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
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
            if (r0 == 0) goto L1e
            if (r0 == r3) goto L18
            if (r0 != r2) goto L12
            defpackage.jzb.q(r7)
            goto L90
        L12:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qc0.p(r6)
            return r1
        L18:
            defpackage.jzb.q(r7)     // Catch: java.lang.Exception -> L1c
            goto L90
        L1c:
            r7 = move-exception
            goto L33
        L1e:
            defpackage.jzb.q(r7)
            ldd r7 = r6.this$0     // Catch: java.lang.Exception -> L1c
            fc3 r0 = r7.e     // Catch: java.lang.Exception -> L1c
            idd r5 = new idd     // Catch: java.lang.Exception -> L1c
            r5.<init>(r7, r1)     // Catch: java.lang.Exception -> L1c
            r6.label = r3     // Catch: java.lang.Exception -> L1c
            java.lang.Object r6 = r0.a(r5, r6)     // Catch: java.lang.Exception -> L1c
            if (r6 != r4) goto L90
            goto L8f
        L33:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = "App foregrounded, failed to update data. Message: "
            r0.<init>(r3)
            java.lang.String r7 = r7.getMessage()
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            java.lang.String r0 = "FirebaseSessions"
            android.util.Log.d(r0, r7)
            ldd r7 = r6.this$0
            j0d r0 = r6.$sessionData
            boolean r7 = r7.d(r0)
            if (r7 == 0) goto L90
            ldd r7 = r6.this$0
            t0d r7 = r7.b
            j0d r0 = r6.$sessionData
            n0d r0 = r0.a
            n0d r7 = r7.a(r0)
            ldd r0 = r6.this$0
            j0d r3 = r6.$sessionData
            r5 = 4
            j0d r3 = defpackage.j0d.a(r3, r7, r1, r1, r5)
            r0.getClass()
            r0.h = r3
            ldd r0 = r6.this$0
            s0d r0 = r0.c
            pv2 r3 = r0.e
            qn2 r3 = defpackage.jgb.k(r3)
            q0d r5 = new q0d
            r5.<init>(r0, r7, r1)
            r0 = 3
            defpackage.ynb.V(r3, r1, r1, r5, r0)
            ldd r0 = r6.this$0
            java.lang.String r7 = r7.a
            r6.label = r2
            fdd r1 = defpackage.fdd.b
            java.lang.Object r6 = r0.e(r7, r1, r6)
            if (r6 != r4) goto L90
        L8f:
            return r4
        L90:
            wef r6 = defpackage.wef.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.jdd.r(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((jdd) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
