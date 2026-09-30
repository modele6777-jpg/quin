package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class dd3 extends gbe implements l26 {
    final /* synthetic */ int $cachedVersion;
    Object L$0;
    /* synthetic */ boolean Z$0;
    int label;
    final /* synthetic */ od3 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dd3(od3 od3Var, int i, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = od3Var;
        this.$cachedVersion = i;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        dd3 dd3Var = new dd3(this.this$0, this.$cachedVersion, xn2Var);
        dd3Var.Z$0 = ((Boolean) obj).booleanValue();
        return dd3Var;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [int] */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v11 */
    /* JADX WARN: Type inference failed for: r0v12 */
    /* JADX WARN: Type inference failed for: r0v13 */
    /* JADX WARN: Type inference failed for: r0v16 */
    /* JADX WARN: Type inference failed for: r0v17 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v7 */
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
    public final Object r(Object obj) {
        int iIntValue;
        Throwable th;
        i0e odbVar;
        boolean z;
        ?? r0;
        ?? r1;
        boolean z2 = this.label;
        bw2 bw2Var = bw2.a;
        try {
            if (z2 == 0) {
                jzb.q(obj);
                boolean z3 = this.Z$0;
                od3 od3Var = this.this$0;
                this.Z$0 = z3;
                this.label = 1;
                obj = od3Var.h(z3, this);
                z2 = z3;
                if (obj == bw2Var) {
                    return bw2Var;
                }
            } else {
                if (z2 != 1) {
                    if (z2 != 2) {
                        qc0.p("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    boolean z4 = this.Z$0;
                    th = (Throwable) this.L$0;
                    jzb.q(obj);
                    r1 = z4;
                    iIntValue = ((Number) obj).intValue();
                    r0 = r1;
                    odbVar = new odb(th, iIntValue);
                    z = r0;
                    return new iy9(odbVar, Boolean.valueOf(z));
                }
                boolean z5 = this.Z$0;
                jzb.q(obj);
                z2 = z5;
            }
            odbVar = (i0e) obj;
            z = z2;
        } catch (Throwable th2) {
            if (z2 != 0) {
                k77 k77VarC = this.this$0.c();
                this.L$0 = th2;
                this.Z$0 = z2;
                this.label = 2;
                Object objA = k77VarC.a(this);
                if (objA != bw2Var) {
                    obj = objA;
                    th = th2;
                    r1 = z2;
                }
                return bw2Var;
            }
            iIntValue = this.$cachedVersion;
            th = th2;
            r0 = z2;
        }
        return new iy9(odbVar, Boolean.valueOf(z));
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        Boolean bool = (Boolean) obj;
        bool.booleanValue();
        return ((dd3) k((xn2) obj2, bool)).r(wef.a);
    }
}
