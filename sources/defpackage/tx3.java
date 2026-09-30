package defpackage;

import java.lang.reflect.Constructor;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class tx3 extends rx3 implements w26, p36, znb {
    public static final /* synthetic */ wn7[] Y = {new aya(tx3.class, "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/FunctionDescriptor;", 0)};
    public final lw7 X;
    public final xm7 v;
    public final String w;
    public final Object x;
    public final fob y;
    public final lw7 z;

    public tx3(xm7 xm7Var, String str, String str2, c36 c36Var, Object obj, dm7 dm7Var) {
        super(dm7Var);
        this.v = xm7Var;
        this.w = str2;
        this.x = obj;
        this.y = lmg.m0(c36Var, new n5(this, str, false, 7));
        sx3 sx3Var = new sx3(this, 0 == true ? 1 : 0);
        z18 z18Var = z18.b;
        this.z = eb3.N(z18Var, sx3Var);
        this.X = eb3.N(z18Var, new sx3(this, 1));
    }

    @Override // defpackage.p26
    public final Object C(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        return call(obj, obj2, obj3, obj4, obj5);
    }

    @Override // defpackage.rx3
    public final zy3 F() {
        tt7 returnType = G().getReturnType();
        returnType.getClass();
        return new zy3(returnType, new sx3(this, 2), false);
    }

    public final hb1 H(Constructor constructor, c36 c36Var, boolean z) {
        if (!z) {
            z12 z12Var = c36Var instanceof z12 ? (z12) c36Var : null;
            if (z12Var != null && !sz3.e(z12Var.getVisibility())) {
                u09 u09VarO0 = z12Var.O0();
                u09VarO0.getClass();
                if (!n37.b(u09VarO0) && !oz3.o(z12Var.O0())) {
                    List listG = z12Var.G();
                    listG.getClass();
                    if (!listG.isEmpty()) {
                        Iterator it = listG.iterator();
                        while (it.hasNext()) {
                            tt7 type = ((xrf) it.next()).getType();
                            type.getClass();
                            if (qk2.K(type)) {
                                return ynb.Q(this) ? new ta1(constructor, ynb.J(this), 0) : new ua1(constructor, 0);
                            }
                        }
                    }
                }
            }
        }
        return ynb.Q(this) ? new ta1(constructor, ynb.J(this), 1) : new ua1(constructor, 1);
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0042  */
    public final ya1 I(Method method, boolean z) {
        Object objJ;
        if (!ynb.Q(this)) {
            return new gb1(method, false, 6, 2);
        }
        nw7 nw7VarK = G().K();
        if (nw7VarK != null) {
            tt7 type = nw7VarK.getType();
            int i = n37.a;
            y22 y22VarM = type.c0().m();
            if (y22VarM != null ? n37.a(y22VarM) : false) {
                Class<?>[] parameterTypes = method.getParameterTypes();
                parameterTypes.getClass();
                Class cls = (Class) qd0.m0(parameterTypes);
                if (cls == null || !cls.isInterface()) {
                    objJ = ynb.J(this);
                } else {
                    objJ = this.x;
                }
            } else {
                objJ = ynb.J(this);
            }
        } else {
            objJ = ynb.J(this);
        }
        return new fb1(method, z, objJ);
    }

    @Override // defpackage.rx3
    /* JADX INFO: renamed from: J, reason: merged with bridge method [inline-methods] */
    public final c36 G() {
        wn7 wn7Var = Y[0];
        Object objInvoke = this.y.invoke();
        objInvoke.getClass();
        return (c36) objInvoke;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        return call(obj);
    }

    public final boolean equals(Object obj) {
        znb znbVarB = sqf.b(obj);
        return znbVarB != null && pa7.t(this.v, znbVarB.s()) && getName().equals(znbVarB.getName()) && pa7.t(this.w, znbVarB.getSignature()) && pa7.t(this.x, znbVarB.x());
    }

    @Override // defpackage.hs7
    public final GenericDeclaration findJavaDeclaration() {
        return hkg.o0(this.v, this.w);
    }

    @Override // defpackage.w26
    public final int getArity() {
        sa1 sa1VarH = h();
        sa1VarH.getClass();
        return sa1VarH.a().size();
    }

    @Override // defpackage.cm7
    public final String getName() {
        String strB = ((cm3) G()).getName().b();
        strB.getClass();
        return strB;
    }

    @Override // defpackage.znb
    public final String getSignature() {
        return this.w;
    }

    @Override // defpackage.wnb
    public final sa1 h() {
        return (sa1) this.z.getValue();
    }

    public final int hashCode() {
        return this.w.hashCode() + ((getName().hashCode() + (this.v.hashCode() * 31)) * 31);
    }

    @Override // defpackage.x16
    public final Object invoke() {
        return call(new Object[0]);
    }

    @Override // defpackage.ym7
    public final boolean isExternal() {
        return this.a.f || G().isExternal();
    }

    @Override // defpackage.ym7
    public final boolean isInfix() {
        return this.a.h || G().isInfix();
    }

    @Override // defpackage.ym7
    public final boolean isInline() {
        return this.a.i || G().isInline();
    }

    @Override // defpackage.ym7
    public final boolean isOperator() {
        return this.a.g || G().isOperator();
    }

    @Override // defpackage.cm7, defpackage.ym7
    public final boolean isSuspend() {
        return G().isSuspend();
    }

    @Override // defpackage.n26
    public final Object m(Object obj, Object obj2, Object obj3) {
        return call(obj, obj2, obj3);
    }

    @Override // defpackage.wnb
    public final sa1 n() {
        return (sa1) this.X.getValue();
    }

    @Override // defpackage.wnb
    public final wnb p(xm7 xm7Var, dm7 dm7Var) {
        xm7Var.getClass();
        dm7Var.getClass();
        return new tx3(xm7Var, G(), dm7Var);
    }

    @Override // defpackage.wnb
    public final xm7 s() {
        return this.v;
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
        return this.x;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return call(obj, obj2);
    }

    public /* synthetic */ tx3(xm7 xm7Var, c36 c36Var) {
        this(xm7Var, c36Var, dm7.j);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    public tx3(xm7 xm7Var, c36 c36Var, dm7 dm7Var) {
        xm7Var.getClass();
        c36Var.getClass();
        dm7Var.getClass();
        String strB = ((cm3) c36Var).getName().b();
        strB.getClass();
        this(xm7Var, strB, n8c.c(c36Var).i(), c36Var, ga1.NO_RECEIVER, dm7Var);
    }
}
