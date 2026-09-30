package defpackage;

/* JADX INFO: loaded from: classes3.dex */
public final class hm7 implements x16 {
    public final /* synthetic */ int a;
    public final nm7 b;
    public final jm7 c;

    public /* synthetic */ hm7(jm7 jm7Var, nm7 nm7Var, int i) {
        this.a = i;
        this.c = jm7Var;
        this.b = nm7Var;
    }

    /* JADX WARN: Code duplicated, block: B:15:0x0054  */
    /* JADX WARN: Code duplicated, block: B:351:0x0724  */
    /* JADX WARN: Code duplicated, block: B:354:0x0737  */
    /* JADX WARN: Code duplicated, block: B:356:0x073a  */
    /* JADX WARN: Code duplicated, block: B:358:0x074d  */
    /* JADX WARN: Code duplicated, block: B:359:0x0750  */
    /* JADX WARN: Code duplicated, block: B:363:0x0760  */
    /* JADX WARN: Code duplicated, block: B:365:0x0772  */
    /* JADX WARN: Code duplicated, block: B:368:0x0785 A[LOOP:20: B:366:0x077f->B:368:0x0785, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:369:0x0799  */
    /* JADX WARN: Code duplicated, block: B:378:0x07ce  */
    /* JADX WARN: Code duplicated, block: B:382:0x07fd  */
    /* JADX WARN: Code duplicated, block: B:394:0x082d  */
    /* JADX WARN: Code duplicated, block: B:520:0x0806 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:524:0x07f7 A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:62:0x012f  */
    /* JADX WARN: Multi-variable type inference failed */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r2v31 java.lang.Object, still in use, count: 2, list:
          (r2v31 java.lang.Object) from 0x0701: PHI (r2 I:??) = (r2v14 java.lang.Object), (r2v31 java.lang.Object) binds: [B:341:0x0700, B:517:0x0701] A[DONT_GENERATE, DONT_INLINE]
          (r2v31 java.lang.Object) from 0x06f9: CHECK_CAST (java.lang.annotation.Annotation) (r2v31 java.lang.Object)
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
    @Override // defpackage.x16
    public final java.lang.Object invoke() {
        /*
            Method dump skipped, instruction units count: 2406
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.hm7.invoke():java.lang.Object");
    }

    public /* synthetic */ hm7(nm7 nm7Var, jm7 jm7Var, int i) {
        this.a = i;
        this.b = nm7Var;
        this.c = jm7Var;
    }
}
