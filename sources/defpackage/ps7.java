package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.AnnotatedElement;
import java.lang.reflect.Constructor;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class ps7 extends ms7 implements w26, p36, znb {
    public final xm7 c;
    public final String d;
    public final Object e;
    public final lw7 f;
    public final lw7 g;
    public final lw7 v;
    public final lw7 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ps7(xm7 xm7Var, String str, Object obj, dm7 dm7Var) {
        super(dm7Var);
        xm7Var.getClass();
        str.getClass();
        dm7Var.getClass();
        this.c = xm7Var;
        this.d = str;
        this.e = obj;
        os7 os7Var = new os7(this, 0);
        z18 z18Var = z18.b;
        this.f = eb3.N(z18Var, os7Var);
        this.g = eb3.N(z18Var, new os7(this, 1));
        this.v = eb3.N(z18Var, new os7(this, 2));
        this.w = eb3.N(z18Var, new os7(this, 3));
    }

    @Override // defpackage.p26
    public final Object C(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return call(obj, obj2, obj3, obj4, obj5);
    }

    public final ya1 F(Method method, boolean z) {
        if (!ynb.Q(this)) {
            return new gb1(method, false, 6, 2);
        }
        xm7 xm7Var = this.c;
        if (xm7Var instanceof nn7) {
            return new fb1(method, z, ynb.J(this));
        }
        StringBuilder sb = new StringBuilder("Only top-level functions are supported for now: ");
        sb.append(xm7Var);
        ho7.s(sb, getName(), this.d);
        return null;
    }

    public abstract List G();

    public abstract wq7 H();

    public abstract vk7 I();

    public abstract g8f J();

    public abstract List K();

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
        return znbVarB != null && pa7.t(this.c, znbVarB.s()) && pa7.t(getName(), znbVarB.getName()) && pa7.t(this.d, znbVarB.getSignature()) && pa7.t(this.e, znbVarB.x());
    }

    @Override // defpackage.hs7
    public final GenericDeclaration findJavaDeclaration() {
        return hkg.o0(this.c, this.d);
    }

    @Override // defpackage.bm7
    public final List getAnnotations() {
        Member memberB = h().b();
        AnnotatedElement annotatedElement = memberB instanceof AnnotatedElement ? (AnnotatedElement) memberB : null;
        if (annotatedElement == null) {
            return pu4.a;
        }
        Annotation[] annotations = annotatedElement.getAnnotations();
        annotations.getClass();
        return sqf.t(qd0.G0(annotations));
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

    @Override // defpackage.znb
    public final String getSignature() {
        return this.d;
    }

    @Override // defpackage.cm7, defpackage.bo7
    public final List getTypeParameters() {
        return J().a;
    }

    @Override // defpackage.wnb
    public final sa1 h() {
        return (sa1) this.v.getValue();
    }

    public final int hashCode() {
        return this.d.hashCode() + ((getName().hashCode() + (this.c.hashCode() * 31)) * 31);
    }

    @Override // defpackage.x16
    public final Object invoke() {
        return call(new Object[0]);
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
        return this.e;
    }

    public final hb1 y(Constructor constructor, boolean z) {
        List parameters;
        if (!z && (this instanceof ns7)) {
            ns7 ns7Var = (ns7) this;
            if (ns7Var.getVisibility() != jo7.d && ((parameters = ns7Var.getParameters()) == null || !parameters.isEmpty())) {
                Iterator it = parameters.iterator();
                while (it.hasNext()) {
                    em7 em7VarV = pa7.V(((aob) it.next()).u());
                    if (em7VarV.q() && !em7VarV.equals(job.a.b(ezb.class))) {
                        return ynb.Q(this) ? new ta1(constructor, ynb.J(this), 0) : new ua1(constructor, 0);
                    }
                }
            }
        }
        return ynb.Q(this) ? new ta1(constructor, ynb.J(this), 1) : new ua1(constructor, 1);
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return call(obj, obj2);
    }
}
