package defpackage;

import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class uz7 implements zn8 {
    public final qz7 a;
    public final r6e b;
    public final rz7 c;
    public final q69 d;

    public uz7(qz7 qz7Var, r6e r6eVar) {
        this.a = qz7Var;
        this.b = r6eVar;
        this.c = (rz7) qz7Var.b.invoke();
        v67.a();
        this.d = new q69();
    }

    @Override // defpackage.sw3
    public final int D0(float f) {
        return this.b.D0(f);
    }

    @Override // defpackage.sw3
    public final float F(long j) {
        return this.b.F(j);
    }

    @Override // defpackage.sw3
    public final long N0(long j) {
        return this.b.N0(j);
    }

    @Override // defpackage.sw3
    public final long P(int i) {
        return this.b.P(i);
    }

    @Override // defpackage.sw3
    public final float Q0(long j) {
        return this.b.Q0(j);
    }

    @Override // defpackage.sw3
    public final long S(float f) {
        return this.b.S(f);
    }

    @Override // defpackage.sw3
    public final float Z(int i) {
        return this.b.Z(i);
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
    public final List a(int i) {
        q69 q69Var = this.d;
        List list = (List) q69Var.b(i);
        if (list != null) {
            return list;
        }
        rz7 rz7Var = this.c;
        Object objB = rz7Var.b(i);
        List listZ0 = this.b.z0(this.a.a(i, objB, rz7Var.c(i)), objB);
        q69Var.i(i, listZ0);
        return listZ0;
    }

    @Override // defpackage.sw3
    public final float c0(float f) {
        return this.b.c0(f);
    }

    @Override // defpackage.sw3
    public final float getDensity() {
        return this.b.getDensity();
    }

    @Override // defpackage.ga7
    public final cv7 getLayoutDirection() {
        return this.b.getLayoutDirection();
    }

    @Override // defpackage.sw3
    public final float h0() {
        return this.b.h0();
    }

    @Override // defpackage.ga7
    public final boolean k0() {
        return this.b.k0();
    }

    @Override // defpackage.zn8
    public final yn8 n0(int i, int i2, Map map, a26 a26Var) {
        return this.b.n0(i, i2, map, a26Var);
    }

    @Override // defpackage.sw3
    public final float p0(float f) {
        return this.b.p0(f);
    }

    @Override // defpackage.sw3
    public final long t(float f) {
        return this.b.t(f);
    }

    @Override // defpackage.sw3
    public final long u(long j) {
        return this.b.u(j);
    }

    @Override // defpackage.sw3
    public final int x0(long j) {
        return this.b.x0(j);
    }

    @Override // defpackage.zn8
    public final yn8 y(int i, int i2, Map map, a26 a26Var, a26 a26Var2) {
        return this.b.y(i, i2, map, a26Var, a26Var2);
    }
}
