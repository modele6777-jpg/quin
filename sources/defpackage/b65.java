package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class b65 extends gbe implements l26 {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ l65 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b65(l65 l65Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = l65Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new b65(this.this$0, xn2Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v6, types: [java.lang.Object] */
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
    public final Object r(Object obj) throws Throwable {
        l65 l65Var;
        Throwable th;
        d99 d99Var;
        l65 l65Var2;
        d99 d99Var2;
        int i = this.label;
        Object obj2 = bw2.a;
        try {
            if (i == 0) {
                jzb.q(obj);
                l65 l65Var3 = this.this$0;
                this.label = 1;
                int i2 = l65.v;
                if (l65Var3.c(this) != obj2) {
                }
                return obj2;
            }
            if (i == 1) {
                jzb.q(obj);
            } else {
                if (i != 2) {
                    if (i != 3) {
                        qc0.p("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    l65Var = (l65) this.L$2;
                    d99 d99Var3 = (d99) this.L$1;
                    th = (Throwable) this.L$0;
                    jzb.q(obj);
                    d99Var = d99Var3;
                    try {
                        l65Var.e = (Long) l65Var.f.invoke();
                        throw th;
                    } finally {
                        d99Var.h(null);
                    }
                }
                l65Var2 = (l65) this.L$1;
                d99Var2 = (d99) this.L$0;
                jzb.q(obj);
            }
            try {
                l65Var2.e = (Long) l65Var2.f.invoke();
                return wef.a;
            } finally {
                d99Var2.h(null);
            }
            l65Var2 = this.this$0;
            f99 f99Var = l65Var2.c;
            this.L$0 = f99Var;
            this.L$1 = l65Var2;
            this.label = 2;
            this = f99Var.b(this);
            if (this != obj2) {
                d99Var2 = f99Var;
                l65Var2.e = (Long) l65Var2.f.invoke();
                return wef.a;
            }
        } catch (Throwable th2) {
            l65Var = this.this$0;
            d99 d99Var4 = l65Var.c;
            this.L$0 = th2;
            this.L$1 = d99Var4;
            this.L$2 = l65Var;
            this.label = 3;
            if (d99Var4.b(this) != obj2) {
                th = th2;
                d99Var = d99Var4;
            }
            return obj2;
        }
        return obj2;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((b65) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
