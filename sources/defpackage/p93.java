package defpackage;

import ai.askquin.ui.conversation.r0;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class p93 implements o26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ p93(r0 r0Var, ka9 ka9Var, a26 a26Var) {
        this.a = 1;
        this.c = r0Var;
        this.b = ka9Var;
        this.d = a26Var;
    }

    /* JADX WARN: Code duplicated, block: B:153:0x04b3  */
    /* JADX WARN: Code duplicated, block: B:157:0x04d7  */
    /*  JADX ERROR: JadxRuntimeException in pass: IfRegionVisitor
        jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r4v23 java.lang.Object, still in use, count: 2, list:
          (r4v23 java.lang.Object) from 0x0417: PHI (r4 I:??) = (r4v21 java.lang.Object), (r4v23 java.lang.Object) binds: [B:130:0x0416, B:281:0x0417] A[DONT_GENERATE, DONT_INLINE]
          (r4v23 java.lang.Object) from 0x040f: CHECK_CAST (android.content.Context) (r4v23 java.lang.Object)
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
    @Override // defpackage.o26
    public final java.lang.Object t(java.lang.Object r40, java.lang.Object r41, java.lang.Object r42, java.lang.Object r43) {
        /*
            Method dump skipped, instruction units count: 2184
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p93.t(java.lang.Object, java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    public /* synthetic */ p93(Object obj, Object obj2, ka9 ka9Var, int i) {
        this.a = i;
        this.c = obj;
        this.d = obj2;
        this.b = ka9Var;
    }

    public /* synthetic */ p93(Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }
}
