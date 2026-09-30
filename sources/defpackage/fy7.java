package defpackage;

import java.util.LinkedHashSet;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public final class fy7 implements x16 {
    public final /* synthetic */ int a;
    public final iy7 b;

    public /* synthetic */ fy7(iy7 iy7Var, int i) {
        this.a = i;
        this.b = iy7Var;
    }

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
    @Override // defpackage.x16
    public final Object invoke() {
        int i = this.a;
        iy7 iy7Var = this.b;
        switch (i) {
            case 0:
                ez3 ez3Var = ez3.m;
                dr8.a.getClass();
                a26 a26Var = tj7.K0;
                ez3Var.getClass();
                List list = ez3Var.a;
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                boolean zA = ez3Var.a(ez3.l);
                lf9 lf9Var = lf9.d;
                if (zA) {
                    for (t99 t99Var : iy7Var.h(ez3Var, a26Var)) {
                        a26Var.d(t99Var);
                        y22 y22VarE = iy7Var.e(t99Var, lf9Var);
                        if (y22VarE != null) {
                            linkedHashSet.add(y22VarE);
                        }
                    }
                }
                if (ez3Var.a(ez3.i) && !list.contains(az3.a)) {
                    for (t99 t99Var2 : iy7Var.i(ez3Var, a26Var)) {
                        a26Var.d(t99Var2);
                        linkedHashSet.addAll(iy7Var.b(t99Var2, lf9Var));
                    }
                }
                if (ez3Var.a(ez3.j) && !list.contains(az3.a)) {
                    for (t99 t99Var3 : iy7Var.o(ez3Var)) {
                        a26Var.d(t99Var3);
                        linkedHashSet.addAll(iy7Var.f(t99Var3, lf9Var));
                    }
                }
                return s72.j1(linkedHashSet);
            case 1:
                return iy7Var.k();
            case 2:
                return iy7Var.i(ez3.p, null);
            case 3:
                return iy7Var.o(ez3.q);
            default:
                return iy7Var.h(ez3.o, null);
        }
    }
}
