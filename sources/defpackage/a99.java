package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class a99 extends gbe implements l26 {
    final /* synthetic */ l26 $block;
    final /* synthetic */ s89 $priority;
    final /* synthetic */ Object $receiver;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ b99 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a99(s89 s89Var, b99 b99Var, l26 l26Var, Object obj, xn2 xn2Var) {
        super(2, xn2Var);
        this.$priority = s89Var;
        this.this$0 = b99Var;
        this.$block = l26Var;
        this.$receiver = obj;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        a99 a99Var = new a99(this.$priority, this.this$0, this.$block, this.$receiver, xn2Var);
        a99Var.L$0 = obj;
        return a99Var;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: ConstInlineVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Unexpected instance arg in invoke
        	at jadx.core.dex.visitors.ConstInlineVisitor.addExplicitCast(ConstInlineVisitor.java:285)
        	at jadx.core.dex.visitors.ConstInlineVisitor.replaceArg(ConstInlineVisitor.java:267)
        	at jadx.core.dex.visitors.ConstInlineVisitor.replaceConst(ConstInlineVisitor.java:177)
        	at jadx.core.dex.visitors.ConstInlineVisitor.checkInsn(ConstInlineVisitor.java:110)
        	at jadx.core.dex.visitors.ConstInlineVisitor.process(ConstInlineVisitor.java:55)
        	at jadx.core.dex.visitors.ConstInlineVisitor.visit(ConstInlineVisitor.java:47)
        */
    @Override // defpackage.pt0
    public final java.lang.Object r(java.lang.Object r9) {
        /*
            r8 = this;
            int r0 = r8.label
            r1 = 2
            r2 = 1
            r3 = 0
            bw2 r4 = defpackage.bw2.a
            if (r0 == 0) goto L42
            if (r0 == r2) goto L27
            if (r0 != r1) goto L21
            java.lang.Object r0 = r8.L$2
            b99 r0 = (defpackage.b99) r0
            java.lang.Object r1 = r8.L$1
            d99 r1 = (defpackage.d99) r1
            java.lang.Object r8 = r8.L$0
            w89 r8 = (defpackage.w89) r8
            defpackage.jzb.q(r9)     // Catch: java.lang.Throwable -> L1e
            goto L98
        L1e:
            r9 = move-exception
            goto Lb3
        L21:
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qc0.p(r8)
            return r3
        L27:
            java.lang.Object r0 = r8.L$4
            b99 r0 = (defpackage.b99) r0
            java.lang.Object r2 = r8.L$3
            java.lang.Object r5 = r8.L$2
            l26 r5 = (defpackage.l26) r5
            java.lang.Object r6 = r8.L$1
            d99 r6 = (defpackage.d99) r6
            java.lang.Object r7 = r8.L$0
            w89 r7 = (defpackage.w89) r7
            defpackage.jzb.q(r9)
            r9 = r6
            r6 = r5
            r5 = r9
            r9 = r0
            r0 = r7
            goto L80
        L42:
            defpackage.jzb.q(r9)
            java.lang.Object r9 = r8.L$0
            aw2 r9 = (defpackage.aw2) r9
            w89 r0 = new w89
            s89 r5 = r8.$priority
            pv2 r9 = r9.getCoroutineContext()
            ndb r6 = defpackage.ndb.Y0
            nv2 r9 = r9.F0(r6)
            r9.getClass()
            dg7 r9 = (defpackage.dg7) r9
            r0.<init>(r5, r9)
            b99 r9 = r8.this$0
            r9.b(r0)
            b99 r9 = r8.this$0
            f99 r5 = r9.b
            l26 r6 = r8.$block
            java.lang.Object r7 = r8.$receiver
            r8.L$0 = r0
            r8.L$1 = r5
            r8.L$2 = r6
            r8.L$3 = r7
            r8.L$4 = r9
            r8.label = r2
            java.lang.Object r2 = r5.b(r8)
            if (r2 != r4) goto L7f
            goto L92
        L7f:
            r2 = r7
        L80:
            r8.L$0 = r0     // Catch: java.lang.Throwable -> Lad
            r8.L$1 = r5     // Catch: java.lang.Throwable -> Lad
            r8.L$2 = r9     // Catch: java.lang.Throwable -> Lad
            r8.L$3 = r3     // Catch: java.lang.Throwable -> Lad
            r8.L$4 = r3     // Catch: java.lang.Throwable -> Lad
            r8.label = r1     // Catch: java.lang.Throwable -> Lad
            java.lang.Object r8 = r6.z(r2, r8)     // Catch: java.lang.Throwable -> Lad
            if (r8 != r4) goto L93
        L92:
            return r4
        L93:
            r1 = r9
            r9 = r8
            r8 = r0
            r0 = r1
            r1 = r5
        L98:
            java.util.concurrent.atomic.AtomicReference r0 = r0.a     // Catch: java.lang.Throwable -> Lab
        L9a:
            boolean r2 = r0.compareAndSet(r8, r3)     // Catch: java.lang.Throwable -> Lab
            if (r2 == 0) goto La1
            goto La7
        La1:
            java.lang.Object r2 = r0.get()     // Catch: java.lang.Throwable -> Lab
            if (r2 == r8) goto L9a
        La7:
            r1.h(r3)
            return r9
        Lab:
            r8 = move-exception
            goto Lc3
        Lad:
            r8 = move-exception
            r1 = r9
            r9 = r8
            r8 = r0
            r0 = r1
            r1 = r5
        Lb3:
            java.util.concurrent.atomic.AtomicReference r0 = r0.a     // Catch: java.lang.Throwable -> Lab
        Lb5:
            boolean r2 = r0.compareAndSet(r8, r3)     // Catch: java.lang.Throwable -> Lab
            if (r2 != 0) goto Lc2
            java.lang.Object r2 = r0.get()     // Catch: java.lang.Throwable -> Lab
            if (r2 != r8) goto Lc2
            goto Lb5
        Lc2:
            throw r9     // Catch: java.lang.Throwable -> Lab
        Lc3:
            r1.h(r3)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.a99.r(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((a99) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
