package defpackage;

import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Member;
import java.lang.reflect.Modifier;
import java.lang.reflect.Type;
import java.lang.reflect.TypeVariable;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class we7 extends re7 implements w26, p36, znb {
    public final lw7 f;
    public final lw7 g;
    public final lw7 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public we7(xm7 xm7Var, Member member, Object obj, dm7 dm7Var) {
        super(xm7Var, member, obj, dm7Var);
        xm7Var.getClass();
        dm7Var.getClass();
        ve7 ve7Var = new ve7(this, 0);
        z18 z18Var = z18.b;
        this.f = eb3.N(z18Var, ve7Var);
        this.g = eb3.N(z18Var, new ve7(this, 1));
        this.v = eb3.N(z18Var, new ve7(this, 2));
    }

    @Override // defpackage.p26
    public final Object C(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return call(obj, obj2, obj3, obj4, obj5);
    }

    public abstract TypeVariable[] F();

    public abstract Class[] G();

    public abstract boolean H();

    @Override // defpackage.xnb, defpackage.wnb
    public final List a() {
        return (List) this.f.getValue();
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        return call(obj);
    }

    public final boolean equals(Object obj) {
        znb znbVarB = sqf.b(obj);
        return znbVarB != null && pa7.t(this.c, znbVarB.s()) && pa7.t(getName(), znbVarB.getName()) && pa7.t(getSignature(), znbVarB.getSignature()) && pa7.t(this.e, znbVarB.x());
    }

    @Override // defpackage.hs7
    public final GenericDeclaration findJavaDeclaration() {
        return hkg.o0(this.c, getSignature());
    }

    @Override // defpackage.w26
    public final int getArity() {
        sa1 sa1VarH = h();
        sa1VarH.getClass();
        return sa1VarH.a().size();
    }

    @Override // defpackage.cm7
    public final List getParameters() {
        return (List) this.g.getValue();
    }

    @Override // defpackage.cm7, defpackage.bo7
    public final List getTypeParameters() {
        return (List) this.v.getValue();
    }

    public final int hashCode() {
        return getSignature().hashCode() + ((getName().hashCode() + (this.c.hashCode() * 31)) * 31);
    }

    @Override // defpackage.x16
    public final Object invoke() {
        return call(new Object[0]);
    }

    @Override // defpackage.ym7
    public final boolean isExternal() {
        return Modifier.isNative(this.d.getModifiers());
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
        if (this instanceof ue7) {
            return false;
        }
        Member member = this.d;
        if (Modifier.isStatic(member.getModifiers())) {
            return false;
        }
        ho7.y(member, "Only Java constructors and static functions are supported for now: ");
        return false;
    }

    @Override // defpackage.n26
    public final Object m(Object obj, Object obj2, Object obj3) {
        return call(obj, obj2, obj3);
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

    public abstract Type[] y();

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return call(obj, obj2);
    }
}
