package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class chd {
    public final ohd a;
    public final v5c b;
    public final x16 c;
    public final x16 d;
    public final f99 e;

    public chd(ohd ohdVar, v5c v5cVar, yv9 yv9Var) {
        ygd ygdVar = ygd.a;
        this.a = ohdVar;
        this.b = v5cVar;
        this.c = yv9Var;
        this.d = ygdVar;
        this.e = new f99();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(zn2 zn2Var) throws Throwable {
        zgd zgdVar;
        d99 d99Var;
        Throwable th;
        d99 d99Var2;
        if (zn2Var instanceof zgd) {
            zgdVar = (zgd) zn2Var;
            int i = zgdVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                zgdVar.label = i - Integer.MIN_VALUE;
            } else {
                zgdVar = new zgd(this, zn2Var);
            }
        } else {
            zgdVar = new zgd(this, zn2Var);
        }
        Object obj = zgdVar.result;
        int i2 = zgdVar.label;
        Object obj2 = bw2.a;
        try {
            if (i2 == 0) {
                jzb.q(obj);
                d99Var = this.e;
                zgdVar.L$0 = d99Var;
                zgdVar.label = 1;
                if (d99Var.b(zgdVar) != obj2) {
                }
                return obj2;
            }
            if (i2 != 1) {
                if (i2 != 2) {
                    qc0.p("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                d99Var2 = (d99) zgdVar.L$0;
                try {
                    jzb.q(obj);
                    wef wefVar = wef.a;
                    d99Var2.h(null);
                    return wefVar;
                } catch (Throwable th2) {
                    th = th2;
                    d99Var2.h(null);
                    throw th;
                }
            }
            d99 d99Var3 = (d99) zgdVar.L$0;
            jzb.q(obj);
            d99Var = d99Var3;
            zgdVar.L$0 = d99Var;
            zgdVar.label = 2;
            if (b(zgdVar) != obj2) {
                d99Var2 = d99Var;
                wef wefVar2 = wef.a;
                d99Var2.h(null);
                return wefVar2;
            }
            return obj2;
        } catch (Throwable th3) {
            d99 d99Var4 = d99Var;
            th = th3;
            d99Var2 = d99Var4;
            d99Var2.h(null);
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:39:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:40:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:46:0x00da A[Catch: Exception -> 0x0123, CancellationException -> 0x014a, TRY_ENTER, TryCatch #4 {CancellationException -> 0x014a, blocks: (B:13:0x004f, B:56:0x010b, B:35:0x00b7, B:36:0x00c3, B:42:0x00d2, B:47:0x00e2, B:49:0x00e6, B:51:0x00fd, B:46:0x00da), top: B:83:0x004f }] */
    /* JADX WARN: Code duplicated, block: B:49:0x00e6 A[Catch: Exception -> 0x0123, CancellationException -> 0x014a, TRY_LEAVE, TryCatch #4 {CancellationException -> 0x014a, blocks: (B:13:0x004f, B:56:0x010b, B:35:0x00b7, B:36:0x00c3, B:42:0x00d2, B:47:0x00e2, B:49:0x00e6, B:51:0x00fd, B:46:0x00da), top: B:83:0x004f }] */
    /* JADX WARN: Code duplicated, block: B:54:0x0106  */
    /* JADX WARN: Code duplicated, block: B:65:0x0126  */
    /* JADX WARN: Code duplicated, block: B:77:0x010b A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:79:0x00b7 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:81:0x00d2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:29:0x008a -> B:30:0x009c). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:54:0x0106 -> B:55:0x0109). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:65:0x0126 -> B:69:0x0146). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:68:0x012b -> B:60:0x011c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object b(defpackage.zn2 r17) {
        /*
            Method dump skipped, instruction units count: 339
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.chd.b(zn2):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0098, code lost:
    
        if (b(r0) == r6) goto L37;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v7, types: [ohd] */
    /* JADX WARN: Type inference failed for: r1v10 */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3, types: [s7a] */
    /* JADX WARN: Type inference failed for: r7v0 */
    /* JADX WARN: Type inference failed for: r8v0, types: [chd] */
    /* JADX WARN: Type inference failed for: r8v10, types: [d99] */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v2 */
    /* JADX WARN: Type inference failed for: r8v3, types: [d99] */
    /* JADX WARN: Type inference failed for: r8v4 */
    /* JADX WARN: Type inference failed for: r8v6 */
    /* JADX WARN: Type inference failed for: r8v7, types: [d99] */
    /* JADX WARN: Type inference failed for: r9v0, types: [java.lang.Object, s7a] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v6 */
    /* JADX WARN: Type inference failed for: r9v7, types: [java.lang.Object] */
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
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object c(defpackage.s7a r9, defpackage.zn2 r10) throws java.lang.Throwable {
        /*
            r8 = this;
            boolean r0 = r10 instanceof defpackage.bhd
            if (r0 == 0) goto L13
            r0 = r10
            bhd r0 = (defpackage.bhd) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            bhd r0 = new bhd
            r0.<init>(r8, r10)
        L18:
            java.lang.Object r10 = r0.result
            int r1 = r0.label
            r2 = 3
            r3 = 2
            r4 = 1
            r5 = 0
            bw2 r6 = defpackage.bw2.a
            if (r1 == 0) goto L5d
            if (r1 == r4) goto L51
            if (r1 == r3) goto L40
            if (r1 != r2) goto L3a
            java.lang.Object r8 = r0.L$1
            d99 r8 = (defpackage.d99) r8
            java.lang.Object r9 = r0.L$0
            s7a r9 = (defpackage.s7a) r9
            defpackage.jzb.q(r10)     // Catch: java.lang.Throwable -> L37
            goto L9c
        L37:
            r9 = move-exception
            goto La2
        L3a:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qc0.p(r8)
            return r5
        L40:
            java.lang.Object r9 = r0.L$1
            d99 r9 = (defpackage.d99) r9
            java.lang.Object r1 = r0.L$0
            s7a r1 = (defpackage.s7a) r1
            defpackage.jzb.q(r10)     // Catch: java.lang.Throwable -> L4c
            goto L8e
        L4c:
            r8 = move-exception
            r7 = r9
            r9 = r8
            r8 = r7
            goto La2
        L51:
            java.lang.Object r9 = r0.L$1
            d99 r9 = (defpackage.d99) r9
            java.lang.Object r1 = r0.L$0
            s7a r1 = (defpackage.s7a) r1
            defpackage.jzb.q(r10)
            goto L71
        L5d:
            defpackage.jzb.q(r10)
            r0.L$0 = r9
            f99 r10 = r8.e
            r0.L$1 = r10
            r0.label = r4
            java.lang.Object r1 = r10.b(r0)
            if (r1 != r6) goto L6f
            goto L9a
        L6f:
            r1 = r9
            r9 = r10
        L71:
            x16 r10 = r8.c     // Catch: java.lang.Throwable -> L4c
            java.lang.Object r10 = r10.invoke()     // Catch: java.lang.Throwable -> L4c
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.Throwable -> L4c
            boolean r10 = r10.booleanValue()     // Catch: java.lang.Throwable -> L4c
            if (r10 == 0) goto L9b
            ohd r10 = r8.a     // Catch: java.lang.Throwable -> L4c
            r0.L$0 = r5     // Catch: java.lang.Throwable -> L4c
            r0.L$1 = r9     // Catch: java.lang.Throwable -> L4c
            r0.label = r3     // Catch: java.lang.Throwable -> L4c
            java.lang.Object r10 = r10.b(r1, r0)     // Catch: java.lang.Throwable -> L4c
            if (r10 != r6) goto L8e
            goto L9a
        L8e:
            r0.L$0 = r5     // Catch: java.lang.Throwable -> L4c
            r0.L$1 = r9     // Catch: java.lang.Throwable -> L4c
            r0.label = r2     // Catch: java.lang.Throwable -> L4c
            java.lang.Object r8 = r8.b(r0)     // Catch: java.lang.Throwable -> L4c
            if (r8 != r6) goto L9b
        L9a:
            return r6
        L9b:
            r8 = r9
        L9c:
            wef r9 = defpackage.wef.a     // Catch: java.lang.Throwable -> L37
            r8.h(r5)
            return r9
        La2:
            r8.h(r5)
            throw r9
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.chd.c(s7a, zn2):java.lang.Object");
    }
}
