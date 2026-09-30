package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class yk5 implements wj5 {
    public final /* synthetic */ l26 a;
    public final /* synthetic */ wj5 b;

    public yk5(wj5 wj5Var, l26 l26Var) {
        this.a = l26Var;
        this.b = wj5Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0092, code lost:
    
        if (r7.b.b(r8, r0) == r5) goto L26;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [int] */
    /* JADX WARN: Type inference failed for: r1v1, types: [zn2] */
    /* JADX WARN: Type inference failed for: r1v3, types: [zn2] */
    /* JADX WARN: Type inference failed for: r1v8 */
    /* JADX WARN: Type inference failed for: r1v9 */
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
    @Override // defpackage.wj5
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(defpackage.xj5 r8, defpackage.xn2 r9) {
        /*
            r7 = this;
            boolean r0 = r9 instanceof defpackage.xk5
            if (r0 == 0) goto L13
            r0 = r9
            xk5 r0 = (defpackage.xk5) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            xk5 r0 = new xk5
            r0.<init>(r7, r9)
        L18:
            java.lang.Object r9 = r0.result
            int r1 = r0.label
            r2 = 2
            r3 = 1
            r4 = 0
            bw2 r5 = defpackage.bw2.a
            if (r1 == 0) goto L5b
            if (r1 == r3) goto L41
            if (r1 != r2) goto L3b
            java.lang.Object r7 = r0.L$3
            ubc r7 = (defpackage.ubc) r7
            java.lang.Object r7 = r0.L$2
            xj5 r7 = (defpackage.xj5) r7
            java.lang.Object r7 = r0.L$1
            xn2 r7 = (defpackage.xn2) r7
            java.lang.Object r7 = r0.L$0
            xj5 r7 = (defpackage.xj5) r7
            defpackage.jzb.q(r9)
            goto L95
        L3b:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qc0.p(r7)
            return r4
        L41:
            int r8 = r0.I$0
            java.lang.Object r1 = r0.L$3
            ubc r1 = (defpackage.ubc) r1
            java.lang.Object r3 = r0.L$2
            xj5 r3 = (defpackage.xj5) r3
            java.lang.Object r6 = r0.L$1
            xn2 r6 = (defpackage.xn2) r6
            java.lang.Object r6 = r0.L$0
            xj5 r6 = (defpackage.xj5) r6
            defpackage.jzb.q(r9)     // Catch: java.lang.Throwable -> L59
            r6 = r8
            r8 = r3
            goto L7d
        L59:
            r7 = move-exception
            goto L98
        L5b:
            defpackage.jzb.q(r9)
            ubc r1 = new ubc
            pv2 r9 = r0.getContext()
            r1.<init>(r8, r9)
            l26 r9 = r7.a     // Catch: java.lang.Throwable -> L59
            r0.L$0 = r4     // Catch: java.lang.Throwable -> L59
            r0.L$1 = r4     // Catch: java.lang.Throwable -> L59
            r0.L$2 = r8     // Catch: java.lang.Throwable -> L59
            r0.L$3 = r1     // Catch: java.lang.Throwable -> L59
            r6 = 0
            r0.I$0 = r6     // Catch: java.lang.Throwable -> L59
            r0.label = r3     // Catch: java.lang.Throwable -> L59
            java.lang.Object r9 = r9.z(r1, r0)     // Catch: java.lang.Throwable -> L59
            if (r9 != r5) goto L7d
            goto L94
        L7d:
            r1.s()
            r0.L$0 = r4
            r0.L$1 = r4
            r0.L$2 = r4
            r0.L$3 = r4
            r0.I$0 = r6
            r0.label = r2
            wj5 r7 = r7.b
            java.lang.Object r7 = r7.b(r8, r0)
            if (r7 != r5) goto L95
        L94:
            return r5
        L95:
            wef r7 = defpackage.wef.a
            return r7
        L98:
            r1.s()
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.yk5.b(xj5, xn2):java.lang.Object");
    }
}
