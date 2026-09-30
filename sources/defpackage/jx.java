package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class jx {
    public final y6f a;
    public final Object b;
    public final wz c;
    public final vz9 d;
    public final vz9 e;
    public final c99 f;
    public final fxd g;
    public final b00 h;
    public final b00 i;
    public b00 j;
    public b00 k;

    public jx(Object obj, y6f y6fVar, Object obj2) {
        this.a = y6fVar;
        this.b = obj2;
        wz wzVar = new wz(y6fVar, obj, null, 60);
        this.c = wzVar;
        this.d = q1c.f(Boolean.FALSE);
        this.e = q1c.f(obj);
        this.f = new c99();
        this.g = new fxd(3, obj2);
        b00 b00Var = wzVar.c;
        boolean z = b00Var instanceof xz;
        b00 b00Var2 = z ? qk2.f : b00Var instanceof yz ? qk2.g : b00Var instanceof zz ? qk2.v : qk2.w;
        this.h = b00Var2;
        b00 b00Var3 = z ? qk2.b : b00Var instanceof yz ? qk2.c : b00Var instanceof zz ? qk2.d : qk2.e;
        this.i = b00Var3;
        this.j = b00Var2;
        this.k = b00Var3;
    }

    public static Object a(jx jxVar, Float f, ph3 ph3Var, zn2 zn2Var) {
        Object objE = jxVar.e();
        y6f y6fVar = jxVar.a;
        return c99.a(jxVar.f, new gx(jxVar, f, new oh3(ph3Var, y6fVar, objE, (b00) y6fVar.a.d(f)), jxVar.c.d, null, null), zn2Var);
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
    public static Object b(jx jxVar, Object obj, vz vzVar, Float f, a26 a26Var, xn2 xn2Var, int i) {
        if ((i & 2) != 0) {
            vzVar = jxVar.g;
        }
        vz vzVar2 = vzVar;
        Object objD = f;
        if ((i & 4) != 0) {
            objD = jxVar.a.b.d(jxVar.c.c);
        }
        if ((i & 8) != 0) {
            a26Var = null;
        }
        Object objE = jxVar.e();
        y6f y6fVar = jxVar.a;
        return c99.a(jxVar.f, new gx(jxVar, objD, new jfe(vzVar2, y6fVar, objE, obj, (b00) y6fVar.a.d(objD)), jxVar.c.d, a26Var, null), xn2Var);
    }

    public final Object c(Object obj) {
        if (!pa7.t(this.j, this.h) || !pa7.t(this.k, this.i)) {
            y6f y6fVar = this.a;
            b00 b00Var = (b00) y6fVar.a.d(obj);
            int iB = b00Var.b();
            boolean z = false;
            for (int i = 0; i < iB; i++) {
                if (b00Var.a(i) < this.j.a(i) || b00Var.a(i) > this.k.a(i)) {
                    b00Var.e(i, mh3.n(b00Var.a(i), this.j.a(i), this.k.a(i)));
                    z = true;
                }
            }
            if (z) {
                return y6fVar.b.d(b00Var);
            }
        }
        return obj;
    }

    public final void d() {
        wz wzVar = this.c;
        wzVar.c.d();
        wzVar.d = Long.MIN_VALUE;
        this.d.setValue(Boolean.FALSE);
    }

    public final Object e() {
        return this.c.b.getValue();
    }

    public final boolean f() {
        return ((Boolean) this.d.getValue()).booleanValue();
    }

    public final Object g(xn2 xn2Var, Object obj) {
        Object objA = c99.a(this.f, new hx(this, obj, null), xn2Var);
        return objA == bw2.a ? objA : wef.a;
    }

    public final Object h(gbe gbeVar) {
        Object objA = c99.a(this.f, new ix(this, null), gbeVar);
        return objA == bw2.a ? objA : wef.a;
    }

    public final void i(Float f, Float f2) {
        y6f y6fVar = this.a;
        b00 b00Var = (b00) y6fVar.a.d(f);
        if (b00Var == null) {
            b00Var = this.h;
        }
        b00 b00Var2 = (b00) y6fVar.a.d(f2);
        if (b00Var2 == null) {
            b00Var2 = this.i;
        }
        int iB = b00Var.b();
        for (int i = 0; i < iB; i++) {
            if (b00Var.a(i) > b00Var2.a(i)) {
                gpa.b("Lower bound must be no greater than upper bound on *all* dimensions. The provided lower bound: " + b00Var + " is greater than upper bound " + b00Var2 + " on index " + i);
            }
        }
        this.j = b00Var;
        this.k = b00Var2;
        if (f()) {
            return;
        }
        Object objC = c(e());
        if (pa7.t(objC, e())) {
            return;
        }
        this.c.b.setValue(objC);
    }

    public /* synthetic */ jx(Object obj, y6f y6fVar, Object obj2, int i) {
        this(obj, y6fVar, (i & 4) != 0 ? null : obj2);
    }
}
