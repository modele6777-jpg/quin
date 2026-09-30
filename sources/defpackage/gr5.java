package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class gr5 extends czb implements l26 {
    final /* synthetic */ l26 $block;
    final /* synthetic */ pv2 $currentContext;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gr5(pv2 pv2Var, l26 l26Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.$currentContext = pv2Var;
        this.$block = l26Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        gr5 gr5Var = new gr5(this.$currentContext, this.$block, xn2Var);
        gr5Var.L$0 = obj;
        return gr5Var;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(4:38|21|(2:24|25)|34) */
    /* JADX WARN: Code duplicated, block: B:24:0x004f  */
    /* JADX WARN: Code duplicated, block: B:32:0x0067  */
    /* JADX WARN: Code duplicated, block: B:35:0x0072  */
    /* JADX WARN: Code duplicated, block: B:36:0x0073  */
    /* JADX WARN: Code duplicated, block: B:38:0x0042 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0058, code lost:
    
        if (r9 == r5) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x005b, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x005c, code lost:
    
        r0 = r9;
        r9 = r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x006f, code lost:
    
        if (defpackage.k99.r(r0, r1, r8) == r5) goto L34;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [int] */
    /* JADX WARN: Type inference failed for: r0v1 */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v18 */
    /* JADX WARN: Type inference failed for: r0v19 */
    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, mbe] */
    /* JADX WARN: Type inference failed for: r0v20 */
    /* JADX WARN: Type inference failed for: r0v21 */
    /* JADX WARN: Type inference failed for: r0v22 */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, mbe] */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8, types: [l26] */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v5, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r9v7 */
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
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:26:0x0058 -> B:12:0x0027). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x006f -> B:12:0x0027). Please report as a decompilation issue!!! */
    @Override // defpackage.pt0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object r(java.lang.Object r9) {
        /*
            r8 = this;
            int r0 = r8.label
            iia r1 = defpackage.iia.c
            r2 = 3
            r3 = 2
            r4 = 1
            bw2 r5 = defpackage.bw2.a
            if (r0 == 0) goto L33
            if (r0 == r4) goto L2b
            if (r0 == r3) goto L20
            if (r0 != r2) goto L19
            java.lang.Object r0 = r8.L$0
            mbe r0 = (defpackage.mbe) r0
            defpackage.jzb.q(r9)
            goto L27
        L19:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qc0.p(r8)
            r8 = 0
            return r8
        L20:
            java.lang.Object r0 = r8.L$0
            mbe r0 = (defpackage.mbe) r0
            defpackage.jzb.q(r9)     // Catch: java.util.concurrent.CancellationException -> L29
        L27:
            r9 = r0
            goto L3a
        L29:
            r9 = move-exception
            goto L5f
        L2b:
            java.lang.Object r0 = r8.L$0
            mbe r0 = (defpackage.mbe) r0
            defpackage.jzb.q(r9)     // Catch: java.util.concurrent.CancellationException -> L29
            goto L50
        L33:
            defpackage.jzb.q(r9)
            java.lang.Object r9 = r8.L$0
            mbe r9 = (defpackage.mbe) r9
        L3a:
            pv2 r0 = r8.$currentContext
            boolean r0 = defpackage.tq.F(r0)
            if (r0 == 0) goto L73
            l26 r0 = r8.$block     // Catch: java.util.concurrent.CancellationException -> L5b
            r8.L$0 = r9     // Catch: java.util.concurrent.CancellationException -> L5b
            r8.label = r4     // Catch: java.util.concurrent.CancellationException -> L5b
            java.lang.Object r0 = r0.z(r9, r8)     // Catch: java.util.concurrent.CancellationException -> L5b
            if (r0 != r5) goto L4f
            goto L71
        L4f:
            r0 = r9
        L50:
            r8.L$0 = r0     // Catch: java.util.concurrent.CancellationException -> L29
            r8.label = r3     // Catch: java.util.concurrent.CancellationException -> L29
            java.lang.Object r9 = defpackage.k99.r(r0, r1, r8)     // Catch: java.util.concurrent.CancellationException -> L29
            if (r9 != r5) goto L27
            goto L71
        L5b:
            r0 = move-exception
            r7 = r0
            r0 = r9
            r9 = r7
        L5f:
            pv2 r6 = r8.$currentContext
            boolean r6 = defpackage.tq.F(r6)
            if (r6 == 0) goto L72
            r8.L$0 = r0
            r8.label = r2
            java.lang.Object r9 = defpackage.k99.r(r0, r1, r8)
            if (r9 != r5) goto L27
        L71:
            return r5
        L72:
            throw r9
        L73:
            wef r8 = defpackage.wef.a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gr5.r(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((gr5) k((xn2) obj2, (mbe) obj)).r(wef.a);
    }
}
