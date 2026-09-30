package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class w extends h36 implements a26 {
    public final /* synthetic */ int a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, i2, cls, obj, str, str2);
        this.a = i3;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:104:0x02d4  */
    /* JADX WARN: Code duplicated, block: B:107:0x02e2  */
    /* JADX WARN: Code duplicated, block: B:182:0x05a1  */
    /* JADX WARN: Code duplicated, block: B:185:0x05b6  */
    /* JADX WARN: Code duplicated, block: B:187:0x05c3  */
    /* JADX WARN: Code duplicated, block: B:188:0x05d4  */
    /* JADX WARN: Code duplicated, block: B:251:0x077b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:252:0x077d A[LOOP:12: B:242:0x073b->B:252:0x077d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:256:0x0794  */
    /* JADX WARN: Code duplicated, block: B:303:0x0782 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:96:0x027f  */
    /* JADX WARN: Type inference failed for: r8v19 */
    /* JADX WARN: Type inference failed for: r8v20, types: [java.lang.String, rp3] */
    /* JADX WARN: Type inference failed for: r8v22 */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r5v14 java.lang.Object, still in use, count: 2, list:
          (r5v14 java.lang.Object) from 0x059a: PHI (r5 I:??) = (r5v5 java.lang.Object), (r5v14 java.lang.Object) binds: [B:178:0x0599, B:290:0x059a] A[DONT_GENERATE, DONT_INLINE]
          (r5v14 java.lang.Object) from 0x0590: CHECK_CAST (tech.chatmind.api.TarotCardChoice) (r5v14 java.lang.Object)
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
    public final java.lang.Object d(java.lang.Object r38) {
        /*
            Method dump skipped, instruction units count: 2172
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.w.d(java.lang.Object):java.lang.Object");
    }
}
