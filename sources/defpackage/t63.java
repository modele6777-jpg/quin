package defpackage;

import ai.askquin.model.TarotSkinIdentify;
import android.content.Context;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class t63 extends gbe implements l26 {
    final /* synthetic */ long $candidateRevisionAtStart;
    final /* synthetic */ Context $context;
    final /* synthetic */ String $date;
    final /* synthetic */ TarotSkinIdentify $preferredSkin;
    final /* synthetic */ lld $previousSkinState;
    final /* synthetic */ boolean $recordCompletion;
    final /* synthetic */ long $revision;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    int label;
    final /* synthetic */ y63 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t63(long j, y63 y63Var, long j2, boolean z, Context context, String str, TarotSkinIdentify tarotSkinIdentify, lld lldVar, xn2 xn2Var) {
        super(2, xn2Var);
        this.$revision = j;
        this.this$0 = y63Var;
        this.$candidateRevisionAtStart = j2;
        this.$recordCompletion = z;
        this.$context = context;
        this.$date = str;
        this.$preferredSkin = tarotSkinIdentify;
        this.$previousSkinState = lldVar;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        t63 t63Var = new t63(this.$revision, this.this$0, this.$candidateRevisionAtStart, this.$recordCompletion, this.$context, this.$date, this.$preferredSkin, this.$previousSkinState, xn2Var);
        t63Var.L$0 = obj;
        return t63Var;
    }

    /* JADX WARN: Code duplicated, block: B:74:0x0149  */
    /* JADX WARN: Code duplicated, block: B:93:0x01a6 A[PHI: r2
  0x01a6: PHI (r2v2 ??) = (r2v15 ??), (r2v16 ??), (r2v17 ??) binds: [B:91:0x01a3, B:76:0x014c, B:78:0x0150] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0177, code lost:
    
        if (defpackage.ynb.p0(r6, r7, r19) == r5) goto L82;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [s0e] */
    /* JADX WARN: Type inference failed for: r2v0, types: [omd] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v13 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v16 */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v8 */
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
    @Override // defpackage.pt0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object r(java.lang.Object r20) {
        /*
            Method dump skipped, instruction units count: 457
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.t63.r(java.lang.Object):java.lang.Object");
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((t63) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
