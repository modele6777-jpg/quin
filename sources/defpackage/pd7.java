package defpackage;

import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class pd7 extends xnb implements w26, p36, znb {
    public final nm7 c;
    public final List d;
    public final lw7 e;
    public final lw7 f;
    public final lw7 g;
    public final lw7 v;
    public final lw7 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public pd7(nm7 nm7Var) {
        super(dm7.j);
        nm7Var.getClass();
        this.c = nm7Var;
        Method[] declaredMethods = af1.R(nm7Var).getDeclaredMethods();
        declaredMethods.getClass();
        this.d = qd0.A0(new ww2(27), declaredMethods);
        od7 od7Var = new od7(this, 0);
        z18 z18Var = z18.b;
        this.e = eb3.N(z18Var, od7Var);
        this.f = eb3.N(z18Var, new od7(this, 1));
        this.g = eb3.N(z18Var, new od7(this, 2));
        this.v = eb3.N(z18Var, new od7(this, 3));
        this.w = eb3.N(z18Var, new od7(this, 4));
    }

    @Override // defpackage.p26
    public final Object C(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return call(obj, obj2, obj3, obj4, obj5);
    }

    @Override // defpackage.wnb
    public final boolean E() {
        int modifiers = af1.R(this.c).getModifiers();
        dx5 dx5Var = sqf.a;
        return (Modifier.isPublic(modifiers) || Modifier.isProtected(modifiers) || Modifier.isPrivate(modifiers)) ? false : true;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        return call(obj);
    }

    public final boolean equals(Object obj) {
        znb znbVarB = sqf.b(obj);
        return znbVarB != null && pa7.t(this.c, znbVarB.s()) && "<init>".equals(znbVarB.getName()) && pa7.t(getSignature(), znbVarB.getSignature()) && pa7.t(null, znbVarB.x());
    }

    @Override // defpackage.hs7
    public final GenericDeclaration findJavaDeclaration() {
        return hkg.o0(this.c, getSignature());
    }

    @Override // defpackage.bm7
    public final List getAnnotations() {
        return pu4.a;
    }

    @Override // defpackage.w26
    public final int getArity() {
        return this.d.size();
    }

    @Override // defpackage.cm7
    public final String getName() {
        return "<init>";
    }

    @Override // defpackage.cm7
    public final List getParameters() {
        return (List) this.g.getValue();
    }

    @Override // defpackage.cm7
    public final yn7 getReturnType() {
        return (yn7) this.f.getValue();
    }

    @Override // defpackage.znb
    public final String getSignature() {
        return (String) this.e.getValue();
    }

    @Override // defpackage.cm7, defpackage.bo7
    public final List getTypeParameters() {
        return pu4.a;
    }

    @Override // defpackage.cm7
    public final jo7 getVisibility() {
        int modifiers = af1.R(this.c).getModifiers();
        if (Modifier.isPublic(modifiers)) {
            return jo7.a;
        }
        if (Modifier.isPrivate(modifiers)) {
            return jo7.d;
        }
        return null;
    }

    @Override // defpackage.wnb
    public final sa1 h() {
        return (sa1) this.v.getValue();
    }

    public final int hashCode() {
        return getSignature().hashCode() + (((this.c.hashCode() * 31) + 1818100338) * 31);
    }

    @Override // defpackage.wnb
    public final d09 i() {
        return d09.FINAL;
    }

    @Override // defpackage.x16
    public final Object invoke() {
        return call(new Object[0]);
    }

    @Override // defpackage.ym7
    public final boolean isExternal() {
        return false;
    }

    @Override // defpackage.ym7
    public final boolean isInfix() {
        return false;
    }

    @Override // defpackage.ym7
    public final boolean isInline() {
        return false;
    }

    @Override // defpackage.ym7
    public final boolean isOperator() {
        return false;
    }

    @Override // defpackage.cm7, defpackage.ym7
    public final boolean isSuspend() {
        return false;
    }

    @Override // defpackage.n26
    public final Object m(Object obj, Object obj2, Object obj3) {
        return call(obj, obj2, obj3);
    }

    @Override // defpackage.wnb
    public final sa1 n() {
        return (sa1) this.w.getValue();
    }

    @Override // defpackage.wnb
    public final wnb p(xm7 xm7Var, dm7 dm7Var) {
        xm7Var.getClass();
        dm7Var.getClass();
        if (dm7Var.equals(dm7.j)) {
            return new pd7(this.c);
        }
        ho7.y(this, "Constructors cannot have fake overrides: ");
        return null;
    }

    @Override // defpackage.wnb
    public final xm7 s() {
        return this.c;
    }

    @Override // defpackage.o26
    public final Object t(Object obj, Object obj2, Object obj3, Object obj4) {
        return call(obj, obj2, obj3, obj4);
    }

    public final String toString() {
        return af8.A(this);
    }

    @Override // defpackage.s26
    public final Object u(Object obj, Boolean bool, Object obj2, Object obj3, Object obj4, l46 l46Var, Integer num) {
        return call(g09.a, obj, bool, obj2, obj3, obj4, l46Var, num);
    }

    @Override // defpackage.q26
    public final Object w(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        return call(obj, obj2, obj3, obj4, obj5, obj6);
    }

    @Override // defpackage.wnb
    public final Object x() {
        return null;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return call(obj, obj2);
    }
}
