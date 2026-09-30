package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class hsd extends gbe implements l26 {
    final /* synthetic */ x16 $block;
    final /* synthetic */ mrd $externalManager;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hsd(mrd mrdVar, x16 x16Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.$externalManager = mrdVar;
        this.$block = x16Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        hsd hsdVar = new hsd(this.$externalManager, this.$block, xn2Var);
        hsdVar.L$0 = obj;
        return hsdVar;
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0083  */
    /* JADX WARN: Code duplicated, block: B:28:0x0084 A[Catch: all -> 0x0022, PHI: r0 r3 r6 r7
  0x0084: PHI (r0v8 java.lang.Object) = (r0v7 java.lang.Object), (r0v12 java.lang.Object) binds: [B:26:0x0081, B:15:0x0039] A[DONT_GENERATE, DONT_INLINE]
  0x0084: PHI (r3v7 ??) = (r3v12 ??), (r3v13 ??) binds: [B:26:0x0081, B:15:0x0039] A[DONT_GENERATE, DONT_INLINE]
  0x0084: PHI (r6v4 ??) = (r6v9 ??), (r6v10 ??) binds: [B:26:0x0081, B:15:0x0039] A[DONT_GENERATE, DONT_INLINE]
  0x0084: PHI (r7v3 xj5) = (r7v2 xj5), (r7v7 xj5) binds: [B:26:0x0081, B:15:0x0039] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {all -> 0x0022, blocks: (B:15:0x0039, B:28:0x0084, B:25:0x0073, B:30:0x0090, B:8:0x001e), top: B:47:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:30:0x0090 A[Catch: all -> 0x0022, TRY_LEAVE, TryCatch #0 {all -> 0x0022, blocks: (B:15:0x0039, B:28:0x0084, B:25:0x0073, B:30:0x0090, B:8:0x001e), top: B:47:0x0008 }] */
    /* JADX WARN: Code duplicated, block: B:33:0x00a1  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [m4] */
    /* JADX WARN: Type inference failed for: r3v0 */
    /* JADX WARN: Type inference failed for: r3v1 */
    /* JADX WARN: Type inference failed for: r3v12 */
    /* JADX WARN: Type inference failed for: r3v13 */
    /* JADX WARN: Type inference failed for: r3v14 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v16 */
    /* JADX WARN: Type inference failed for: r3v2, types: [yv1] */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v5 */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object, yv1] */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.lang.Object, yv1] */
    /* JADX WARN: Type inference failed for: r6v1, types: [mrd] */
    /* JADX WARN: Type inference failed for: r6v10 */
    /* JADX WARN: Type inference failed for: r6v11 */
    /* JADX WARN: Type inference failed for: r6v12 */
    /* JADX WARN: Type inference failed for: r6v13 */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, mrd] */
    /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.Object, mrd] */
    /* JADX WARN: Type inference failed for: r6v9 */
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
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x008e -> B:25:0x0073). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x00a1 -> B:25:0x0073). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.pt0
    public final java.lang.Object r(java.lang.Object r10) throws java.lang.Throwable {
        /*
            r9 = this;
            int r0 = r9.label
            r1 = 3
            r2 = 2
            r3 = 1
            r4 = 0
            bw2 r5 = defpackage.bw2.a
            if (r0 == 0) goto L3d
            if (r0 == r3) goto L10
            if (r0 == r2) goto L2b
            if (r0 != r1) goto L25
        L10:
            java.lang.Object r0 = r9.L$3
            java.lang.Object r3 = r9.L$2
            yv1 r3 = (defpackage.yv1) r3
            java.lang.Object r6 = r9.L$1
            mrd r6 = (defpackage.mrd) r6
            java.lang.Object r7 = r9.L$0
            xj5 r7 = (defpackage.xj5) r7
            defpackage.jzb.q(r10)     // Catch: java.lang.Throwable -> L22
            goto L73
        L22:
            r10 = move-exception
            goto La6
        L25:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qc0.p(r9)
            return r4
        L2b:
            java.lang.Object r0 = r9.L$3
            java.lang.Object r3 = r9.L$2
            yv1 r3 = (defpackage.yv1) r3
            java.lang.Object r6 = r9.L$1
            mrd r6 = (defpackage.mrd) r6
            java.lang.Object r7 = r9.L$0
            xj5 r7 = (defpackage.xj5) r7
            defpackage.jzb.q(r10)     // Catch: java.lang.Throwable -> L22
            goto L84
        L3d:
            defpackage.jzb.q(r10)
            java.lang.Object r10 = r9.L$0
            r7 = r10
            xj5 r7 = (defpackage.xj5) r7
            mrd r10 = r9.$externalManager
            if (r10 != 0) goto L55
            mrd r10 = new mrd
            r10.<init>()
            nkd r0 = new nkd
            r0.<init>()
            r10.a = r0
        L55:
            r6 = r10
            r10 = 6
            r41 r10 = defpackage.urg.a(r3, r4, r4, r10)
            x16 r0 = r9.$block     // Catch: java.lang.Throwable -> La3
            java.lang.Object r0 = r6.a(r10, r0)     // Catch: java.lang.Throwable -> La3
            r9.L$0 = r7     // Catch: java.lang.Throwable -> La3
            r9.L$1 = r6     // Catch: java.lang.Throwable -> La3
            r9.L$2 = r10     // Catch: java.lang.Throwable -> La3
            r9.L$3 = r0     // Catch: java.lang.Throwable -> La3
            r9.label = r3     // Catch: java.lang.Throwable -> La3
            java.lang.Object r3 = r7.a(r0, r9)     // Catch: java.lang.Throwable -> La3
            if (r3 != r5) goto L72
            goto La0
        L72:
            r3 = r10
        L73:
            r9.L$0 = r7     // Catch: java.lang.Throwable -> L22
            r9.L$1 = r6     // Catch: java.lang.Throwable -> L22
            r9.L$2 = r3     // Catch: java.lang.Throwable -> L22
            r9.L$3 = r0     // Catch: java.lang.Throwable -> L22
            r9.label = r2     // Catch: java.lang.Throwable -> L22
            java.lang.Object r10 = r3.m(r9)     // Catch: java.lang.Throwable -> L22
            if (r10 != r5) goto L84
            goto La0
        L84:
            x16 r10 = r9.$block     // Catch: java.lang.Throwable -> L22
            java.lang.Object r10 = r6.a(r3, r10)     // Catch: java.lang.Throwable -> L22
            boolean r8 = defpackage.pa7.t(r10, r0)     // Catch: java.lang.Throwable -> L22
            if (r8 != 0) goto L73
            r9.L$0 = r7     // Catch: java.lang.Throwable -> L22
            r9.L$1 = r6     // Catch: java.lang.Throwable -> L22
            r9.L$2 = r3     // Catch: java.lang.Throwable -> L22
            r9.L$3 = r10     // Catch: java.lang.Throwable -> L22
            r9.label = r1     // Catch: java.lang.Throwable -> L22
            java.lang.Object r0 = r7.a(r10, r9)     // Catch: java.lang.Throwable -> L22
            if (r0 != r5) goto La1
        La0:
            return r5
        La1:
            r0 = r10
            goto L73
        La3:
            r0 = move-exception
            r3 = r10
            r10 = r0
        La6:
            m4 r0 = r6.a
            if (r0 == 0) goto Lad
            r0.u0(r3)
        Lad:
            mrd r9 = r9.$externalManager
            if (r9 != 0) goto Lc0
            m4 r9 = r6.a
            if (r9 == 0) goto Lb6
            goto Lbb
        Lb6:
            java.lang.String r0 = "Called dispose on a manager that has been disposed of"
            defpackage.epa.b(r0)
        Lbb:
            r9.p0()
            r6.a = r4
        Lc0:
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hsd.r(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) throws Throwable {
        ((hsd) k((xn2) obj2, (xj5) obj)).r(wef.a);
        return bw2.a;
    }
}
