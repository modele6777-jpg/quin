package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class i92 extends gbe implements l26 {
    final /* synthetic */ x16 $arrayFactory;
    final /* synthetic */ wj5[] $flows;
    final /* synthetic */ xj5 $this_combineInternal;
    final /* synthetic */ n26 $transform;
    int I$0;
    int I$1;
    int I$2;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i92(xn2 xn2Var, xj5 xj5Var, x16 x16Var, n26 n26Var, wj5[] wj5VarArr) {
        super(2, xn2Var);
        this.$flows = wj5VarArr;
        this.$arrayFactory = x16Var;
        this.$transform = n26Var;
        this.$this_combineInternal = xj5Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        wj5[] wj5VarArr = this.$flows;
        i92 i92Var = new i92(xn2Var, this.$this_combineInternal, this.$arrayFactory, this.$transform, wj5VarArr);
        i92Var.L$0 = obj;
        return i92Var;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:28:0x00fc A[LOOP:0: B:28:0x00fc->B:36:0x011d, LOOP_START, PHI: r2 r14
  0x00fc: PHI (r2v4 int) = (r2v3 int), (r2v5 int) binds: [B:25:0x00f7, B:36:0x011d] A[DONT_GENERATE, DONT_INLINE]
  0x00fc: PHI (r14v6 n17) = (r14v5 n17), (r14v12 n17) binds: [B:25:0x00f7, B:36:0x011d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:30:0x0106  */
    /* JADX WARN: Code duplicated, block: B:33:0x010c  */
    /* JADX WARN: Code duplicated, block: B:47:0x0175  */
    /* JADX WARN: Code duplicated, block: B:48:0x011f A[EDGE_INSN: B:48:0x011f->B:37:0x011f BREAK  A[LOOP:0: B:28:0x00fc->B:36:0x011d], SYNTHETIC] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x0149 -> B:11:0x006e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:45:0x0172 -> B:11:0x006e). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:47:0x0175 -> B:43:0x014c). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    @Override // defpackage.pt0
    public final java.lang.Object r(java.lang.Object r20) {
        /*
            Method dump skipped, instruction units count: 377
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.i92.r(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((i92) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
