package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class ot2 implements a26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ y6c b;
    public final /* synthetic */ long c;

    public /* synthetic */ ot2(y6c y6cVar, long j, int i) {
        this.a = i;
        this.b = y6cVar;
        this.c = j;
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
    @Override // defpackage.a26
    public final Object d(Object obj) {
        int i = this.a;
        long j = this.c;
        wef wefVar = wef.a;
        y6c y6cVar = this.b;
        switch (i) {
            case 0:
                sn4 sn4Var = (sn4) obj;
                sn4Var.getClass();
                rs0.w(sn4Var, y6cVar.a(sn4Var.f(), sn4Var.getLayoutDirection(), sn4Var), y72.b(j, 0.48f), null, 60);
                break;
            case 1:
                sn4 sn4Var2 = (sn4) obj;
                sn4Var2.getClass();
                z7f.D(sn4Var2, y6cVar, j, 0.5f);
                break;
            case 2:
                sn4 sn4Var3 = (sn4) obj;
                sn4Var3.getClass();
                rs0.w(sn4Var3, y6cVar.a(sn4Var3.f(), sn4Var3.getLayoutDirection(), sn4Var3), this.c, null, 60);
                break;
            case 3:
                sn4 sn4Var4 = (sn4) obj;
                sn4Var4.getClass();
                z7f.D(sn4Var4, y6cVar, j, 10.0f);
                break;
            default:
                sn4 sn4Var5 = (sn4) obj;
                sn4Var5.getClass();
                z7f.D(sn4Var5, y6cVar, j, 0.5f);
                break;
        }
        return wefVar;
    }
}
