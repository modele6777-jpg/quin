package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class it9 implements n26 {
    public final /* synthetic */ zse a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ syf d;
    public final /* synthetic */ t69 e;
    public final /* synthetic */ boolean f;
    public final /* synthetic */ l26 g;
    public final /* synthetic */ l26 v;
    public final /* synthetic */ l26 w;
    public final /* synthetic */ wne x;
    public final /* synthetic */ x4d y;

    public it9(zse zseVar, boolean z, boolean z2, syf syfVar, t69 t69Var, boolean z3, l26 l26Var, l26 l26Var2, l26 l26Var3, wne wneVar, x4d x4dVar) {
        this.a = zseVar;
        this.b = z;
        this.c = z2;
        this.d = syfVar;
        this.e = t69Var;
        this.f = z3;
        this.g = l26Var;
        this.v = l26Var2;
        this.w = l26Var3;
        this.x = wneVar;
        this.y = x4dVar;
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
            String str = this.a.a.b;
            x4d x4dVar = this.y;
            boolean z = this.b;
            boolean z2 = this.f;
            t69 t69Var = this.e;
            wne wneVar = this.x;
            qk6Var.V(str, l26Var, z, this.c, this.d, t69Var, z2, this.g, this.v, this.w, wneVar, null, af1.b0(1409265477, new ht9(z, z2, t69Var, wneVar, x4dVar), l46Var), l46Var, (iIntValue << 3) & 112, 32768);
        } else {
            l46Var.Z();
        }
        return wef.a;
    }
}
