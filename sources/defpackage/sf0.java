package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class sf0 implements a26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ rf0 b;

    public /* synthetic */ sf0(rf0 rf0Var, int i) {
        this.a = i;
        this.b = rf0Var;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0109  */
    /* JADX WARN: Code duplicated, block: B:37:0x0124  */
    /* JADX WARN: Code duplicated, block: B:40:0x014a A[LOOP:5: B:38:0x0144->B:40:0x014a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:52:0x0191  */
    /* JADX WARN: Code duplicated, block: B:55:0x019f  */
    /* JADX WARN: Code duplicated, block: B:60:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:63:0x01d0 A[LOOP:8: B:61:0x01ca->B:63:0x01d0, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:79:0x01b0 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:80:? A[LOOP:7: B:53:0x0199->B:80:?, LOOP_END, SYNTHETIC] */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v12 java.lang.Object, still in use, count: 2, list:
          (r0v12 java.lang.Object) from 0x018d: PHI (r0 I:??) = (r0v2 java.lang.Object), (r0v12 java.lang.Object) binds: [B:49:0x018c, B:76:0x018d] A[DONT_GENERATE, DONT_INLINE]
          (r0v12 java.lang.Object) from 0x017f: CHECK_CAST (rf0) (r0v12 java.lang.Object)
        	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
        	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
        	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
        	at jadx.core.dex.visitors.regions.TernaryMod.makeTernaryInsn(TernaryMod.java:132)
        	at jadx.core.dex.visitors.regions.TernaryMod.processRegion(TernaryMod.java:67)
        	at jadx.core.dex.visitors.regions.TernaryMod.enterRegion(TernaryMod.java:50)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseInternal(DepthRegionTraversal.java:96)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverse(DepthRegionTraversal.java:27)
        	at jadx.core.dex.visitors.regions.TernaryMod.process(TernaryMod.java:36)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.process(IfRegionVisitor.java:44)
        	at jadx.core.dex.visitors.regions.IfRegionVisitor.visit(IfRegionVisitor.java:30)
        */
    @Override // defpackage.a26
    public final java.lang.Object d(java.lang.Object r10) {
        /*
            Method dump skipped, instruction units count: 510
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sf0.d(java.lang.Object):java.lang.Object");
    }
}
