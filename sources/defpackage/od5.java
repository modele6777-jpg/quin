package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class od5 extends gbe implements a26 {
    Object L$0;
    int label;
    final /* synthetic */ pd5 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public od5(pd5 pd5Var, xn2 xn2Var) {
        super(1, xn2Var);
        this.this$0 = pd5Var;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        return new od5(this.this$0, (xn2) obj).r(wef.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0043, code lost:
    
        if (r6 == r4) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0073, code lost:
    
        if (r6 == r4) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x0075, code lost:
    
        return r4;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [int] */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r0v11, types: [java.io.Closeable] */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.io.Closeable] */
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
    public final java.lang.Object r(java.lang.Object r6) throws java.lang.Exception {
        /*
            r5 = this;
            int r0 = r5.label
            r1 = 2
            r2 = 1
            r3 = 0
            bw2 r4 = defpackage.bw2.a
            if (r0 == 0) goto L27
            if (r0 == r2) goto L1d
            if (r0 != r1) goto L17
            java.lang.Object r0 = r5.L$0
            java.io.Closeable r0 = (java.io.Closeable) r0
            defpackage.jzb.q(r6)     // Catch: java.lang.Throwable -> L15
            goto L76
        L15:
            r6 = move-exception
            goto L7c
        L17:
            java.lang.String r5 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qc0.p(r5)
            return r3
        L1d:
            java.lang.Object r0 = r5.L$0
            java.io.Closeable r0 = (java.io.Closeable) r0
            defpackage.jzb.q(r6)     // Catch: java.lang.Throwable -> L25
            goto L46
        L25:
            r6 = move-exception
            goto L4a
        L27:
            defpackage.jzb.q(r6)
            java.io.FileInputStream r6 = new java.io.FileInputStream     // Catch: java.io.FileNotFoundException -> L50
            pd5 r0 = r5.this$0     // Catch: java.io.FileNotFoundException -> L50
            java.io.File r0 = r0.a     // Catch: java.io.FileNotFoundException -> L50
            r6.<init>(r0)     // Catch: java.io.FileNotFoundException -> L50
            java.io.FileInputStream r0 = io.sentry.config.a.b(r0, r6)     // Catch: java.io.FileNotFoundException -> L50
            pd5 r6 = r5.this$0     // Catch: java.io.FileNotFoundException -> L50
            czc r6 = r6.b     // Catch: java.lang.Throwable -> L25
            r5.L$0 = r0     // Catch: java.lang.Throwable -> L25
            r5.label = r2     // Catch: java.lang.Throwable -> L25
            java.lang.Object r6 = r6.B(r0)     // Catch: java.lang.Throwable -> L25
            if (r6 != r4) goto L46
            goto L75
        L46:
            defpackage.ym8.t(r0, r3)     // Catch: java.io.FileNotFoundException -> L50
            return r6
        L4a:
            throw r6     // Catch: java.lang.Throwable -> L4b
        L4b:
            r2 = move-exception
            defpackage.ym8.t(r0, r6)     // Catch: java.io.FileNotFoundException -> L50
            throw r2     // Catch: java.io.FileNotFoundException -> L50
        L50:
            pd5 r6 = r5.this$0
            java.io.File r6 = r6.a
            boolean r6 = r6.exists()
            if (r6 == 0) goto L95
            java.io.FileInputStream r6 = new java.io.FileInputStream     // Catch: java.lang.Exception -> L7a
            pd5 r0 = r5.this$0     // Catch: java.lang.Exception -> L7a
            java.io.File r0 = r0.a     // Catch: java.lang.Exception -> L7a
            r6.<init>(r0)     // Catch: java.lang.Exception -> L7a
            java.io.FileInputStream r0 = io.sentry.config.a.b(r0, r6)     // Catch: java.lang.Exception -> L7a
            pd5 r6 = r5.this$0     // Catch: java.lang.Exception -> L7a
            czc r6 = r6.b     // Catch: java.lang.Throwable -> L15
            r5.L$0 = r0     // Catch: java.lang.Throwable -> L15
            r5.label = r1     // Catch: java.lang.Throwable -> L15
            java.lang.Object r6 = r6.B(r0)     // Catch: java.lang.Throwable -> L15
            if (r6 != r4) goto L76
        L75:
            return r4
        L76:
            defpackage.ym8.t(r0, r3)     // Catch: java.lang.Exception -> L7a
            goto L9d
        L7a:
            r6 = move-exception
            goto L82
        L7c:
            throw r6     // Catch: java.lang.Throwable -> L7d
        L7d:
            r1 = move-exception
            defpackage.ym8.t(r0, r6)     // Catch: java.lang.Exception -> L7a
            throw r1     // Catch: java.lang.Exception -> L7a
        L82:
            boolean r0 = r6 instanceof java.io.FileNotFoundException
            if (r0 == 0) goto L94
            pd5 r5 = r5.this$0
            java.io.File r5 = r5.a
            java.lang.String r5 = r5.getParent()
            java.io.FileNotFoundException r6 = (java.io.FileNotFoundException) r6
            java.lang.Exception r6 = defpackage.n16.b0(r5, r6)
        L94:
            throw r6
        L95:
            pd5 r5 = r5.this$0
            czc r5 = r5.b
            java.lang.Object r6 = r5.e()
        L9d:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.od5.r(java.lang.Object):java.lang.Object");
    }
}
