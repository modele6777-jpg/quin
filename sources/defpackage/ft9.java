package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ft9 implements n26 {
    public final /* synthetic */ String a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ syf d;
    public final /* synthetic */ t69 e;
    public final /* synthetic */ l26 f;
    public final /* synthetic */ wne g;
    public final /* synthetic */ x4d v;

    public ft9(String str, boolean z, boolean z2, syf syfVar, t69 t69Var, l26 l26Var, wne wneVar, x4d x4dVar) {
        this.a = str;
        this.b = z;
        this.c = z2;
        this.d = syfVar;
        this.e = t69Var;
        this.f = l26Var;
        this.g = wneVar;
        this.v = x4dVar;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.n26
    public final Object m(Object obj, Object obj2, Object obj3) {
        l26 l26Var = (l26) obj;
        l46 l46Var = (l46) obj2;
        int iIntValue = ((Number) obj3).intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= l46Var.i(l26Var) ? 4 : 2;
        }
        if (l46Var.W(iIntValue & 1, (iIntValue & 19) != 18)) {
            qk6 qk6Var = qk6.O0;
            x4d x4dVar = this.v;
            boolean z = this.b;
            t69 t69Var = this.e;
            wne wneVar = this.g;
            qk6Var.V(this.a, l26Var, z, this.c, this.d, t69Var, false, null, this.f, null, wneVar, null, af1.b0(-656940872, new dt9(z, t69Var, wneVar, x4dVar, 1), l46Var), l46Var, (iIntValue << 3) & 112, 32768);
        } else {
            l46Var.Z();
        }
        return wef.a;
    }
}
