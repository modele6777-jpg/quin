package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class y89 extends gbe implements l26 {
    final /* synthetic */ a26 $block;
    final /* synthetic */ s89 $priority;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ b99 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y89(s89 s89Var, b99 b99Var, a26 a26Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.$priority = s89Var;
        this.this$0 = b99Var;
        this.$block = a26Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        y89 y89Var = new y89(this.$priority, this.this$0, this.$block, xn2Var);
        y89Var.L$0 = obj;
        return y89Var;
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
    public final java.lang.Object r(java.lang.Object r8) {
        /*
            r7 = this;
            int r0 = r7.label
            r1 = 2
            r2 = 1
            r3 = 0
            bw2 r4 = defpackage.bw2.a
            if (r0 == 0) goto L3d
            if (r0 == r2) goto L27
            if (r0 != r1) goto L21
            java.lang.Object r0 = r7.L$2
            b99 r0 = (defpackage.b99) r0
            java.lang.Object r1 = r7.L$1
            d99 r1 = (defpackage.d99) r1
            java.lang.Object r7 = r7.L$0
            w89 r7 = (defpackage.w89) r7
            defpackage.jzb.q(r8)     // Catch: java.lang.Throwable -> L1e
            goto L8d
        L1e:
            r8 = move-exception
            goto La8
        L21:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qc0.p(r7)
            return r3
        L27:
            java.lang.Object r0 = r7.L$3
            b99 r0 = (defpackage.b99) r0
            java.lang.Object r2 = r7.L$2
            a26 r2 = (defpackage.a26) r2
            java.lang.Object r5 = r7.L$1
            d99 r5 = (defpackage.d99) r5
            java.lang.Object r6 = r7.L$0
            w89 r6 = (defpackage.w89) r6
            defpackage.jzb.q(r8)
            r8 = r0
            r0 = r6
            goto L77
        L3d:
            defpackage.jzb.q(r8)
            java.lang.Object r8 = r7.L$0
            aw2 r8 = (defpackage.aw2) r8
            w89 r0 = new w89
            s89 r5 = r7.$priority
            pv2 r8 = r8.getCoroutineContext()
            ndb r6 = defpackage.ndb.Y0
            nv2 r8 = r8.F0(r6)
            r8.getClass()
            dg7 r8 = (defpackage.dg7) r8
            r0.<init>(r5, r8)
            b99 r8 = r7.this$0
            r8.b(r0)
            b99 r8 = r7.this$0
            f99 r5 = r8.b
            a26 r6 = r7.$block
            r7.L$0 = r0
            r7.L$1 = r5
            r7.L$2 = r6
            r7.L$3 = r8
            r7.label = r2
            java.lang.Object r2 = r5.b(r7)
            if (r2 != r4) goto L76
            goto L87
        L76:
            r2 = r6
        L77:
            r7.L$0 = r0     // Catch: java.lang.Throwable -> La2
            r7.L$1 = r5     // Catch: java.lang.Throwable -> La2
            r7.L$2 = r8     // Catch: java.lang.Throwable -> La2
            r7.L$3 = r3     // Catch: java.lang.Throwable -> La2
            r7.label = r1     // Catch: java.lang.Throwable -> La2
            java.lang.Object r7 = r2.d(r7)     // Catch: java.lang.Throwable -> La2
            if (r7 != r4) goto L88
        L87:
            return r4
        L88:
            r1 = r8
            r8 = r7
            r7 = r0
            r0 = r1
            r1 = r5
        L8d:
            java.util.concurrent.atomic.AtomicReference r0 = r0.a     // Catch: java.lang.Throwable -> La0
        L8f:
            boolean r2 = r0.compareAndSet(r7, r3)     // Catch: java.lang.Throwable -> La0
            if (r2 == 0) goto L96
            goto L9c
        L96:
            java.lang.Object r2 = r0.get()     // Catch: java.lang.Throwable -> La0
            if (r2 == r7) goto L8f
        L9c:
            r1.h(r3)
            return r8
        La0:
            r7 = move-exception
            goto Lb8
        La2:
            r7 = move-exception
            r1 = r8
            r8 = r7
            r7 = r0
            r0 = r1
            r1 = r5
        La8:
            java.util.concurrent.atomic.AtomicReference r0 = r0.a     // Catch: java.lang.Throwable -> La0
        Laa:
            boolean r2 = r0.compareAndSet(r7, r3)     // Catch: java.lang.Throwable -> La0
            if (r2 != 0) goto Lb7
            java.lang.Object r2 = r0.get()     // Catch: java.lang.Throwable -> La0
            if (r2 != r7) goto Lb7
            goto Laa
        Lb7:
            throw r8     // Catch: java.lang.Throwable -> La0
        Lb8:
            r1.h(r3)
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.y89.r(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((y89) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
