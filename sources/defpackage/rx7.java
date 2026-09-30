package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.util.Collection;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class rx7 extends d22 {
    public final c04 E0;
    public final wx7 F0;
    public final ufc G0;
    public final a47 H0;
    public final ky7 I0;
    public final px7 J0;
    public final ee8 K0;
    public final e09 X;
    public final cd Y;
    public final boolean Z;
    public final szc g;
    public final enb v;
    public final u09 w;
    public final szc x;
    public final ace y;
    public final l22 z;

    static {
        qd0.I0(new String[]{"equals", "hashCode", "getClass", "wait", "notify", "notifyAll", "toString"});
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rx7(szc szcVar, bm3 bm3Var, enb enbVar, u09 u09Var) throws IllegalAccessException, InvocationTargetException {
        super(((mf7) szcVar.b).a, bm3Var, enbVar.e(), m8c.B(enbVar));
        szcVar.getClass();
        bm3Var.getClass();
        enbVar.getClass();
        this.g = szcVar;
        this.v = enbVar;
        this.w = u09Var;
        szc szcVarQ = if9.q(szcVar, this, enbVar, 4);
        this.x = szcVarQ;
        ge8 ge8Var = ((mf7) szcVarQ.b).a;
        this.y = new ace(new qx7(this, 0));
        Class cls = enbVar.a;
        this.z = cls.isAnnotation() ? l22.ANNOTATION_CLASS : cls.isInterface() ? l22.INTERFACE : cls.isEnum() ? l22.ENUM_CLASS : l22.CLASS;
        boolean zIsAnnotation = cls.isAnnotation();
        e09 e09Var = e09.b;
        int i = 1;
        if (!zIsAnnotation && !cls.isEnum()) {
            Boolean boolH = cgg.H(cls);
            boolean zBooleanValue = boolH != null ? boolH.booleanValue() : false;
            Boolean boolH2 = cgg.H(cls);
            boolean z = (boolH2 != null ? boolH2.booleanValue() : false) || Modifier.isAbstract(cls.getModifiers()) || cls.isInterface();
            boolean zIsFinal = Modifier.isFinal(cls.getModifiers());
            e09.a.getClass();
            if (zBooleanValue) {
                e09Var = e09.c;
            } else if (z) {
                e09Var = e09.e;
            } else if (!zIsFinal) {
                e09Var = e09.d;
            }
        }
        this.X = e09Var;
        int modifiers = cls.getModifiers();
        this.Y = Modifier.isPublic(modifiers) ? myf.d : Modifier.isPrivate(modifiers) ? jyf.d : Modifier.isProtected(modifiers) ? Modifier.isStatic(modifiers) ? cg7.d : bg7.d : ag7.d;
        Class<?> declaringClass = cls.getDeclaringClass();
        this.Z = ((declaringClass != null ? new enb(declaringClass) : null) == null || Modifier.isStatic(cls.getModifiers())) ? false : true;
        this.E0 = new c04(this);
        wx7 wx7Var = new wx7(szcVarQ, this, enbVar, u09Var != null, null);
        this.F0 = wx7Var;
        eu4 eu4Var = ufc.d;
        x xVar = new x(23, this);
        eu4Var.getClass();
        this.G0 = new ufc(this, ge8Var, xVar);
        this.H0 = new a47(wx7Var);
        this.I0 = new ky7(szcVarQ, enbVar, this);
        this.J0 = kn2.V(szcVarQ, enbVar);
        this.K0 = new ee8(ge8Var, new qx7(this, i));
    }

    @Override // defpackage.u09
    public final l22 E() {
        return this.z;
    }

    @Override // defpackage.u09
    public final dr8 c0() {
        return this.I0;
    }

    @Override // defpackage.tq8
    public final boolean e0() {
        return false;
    }

    @Override // defpackage.f00
    public final h10 getAnnotations() {
        return this.J0;
    }

    @Override // defpackage.u09, defpackage.tq8, defpackage.gm3
    public final rz3 getVisibility() {
        rz3 rz3Var = sz3.a;
        cd cdVar = this.Y;
        if (pa7.t(cdVar, rz3Var)) {
            Class<?> declaringClass = this.v.a.getDeclaringClass();
            if ((declaringClass != null ? new enb(declaringClass) : null) == null) {
                rz3 rz3Var2 = je7.a;
                rz3Var2.getClass();
                return rz3Var2;
            }
        }
        return t4c.u(cdVar);
    }

    @Override // defpackage.y22
    public final j7f h() {
        return this.E0;
    }

    @Override // defpackage.u09, defpackage.z22
    public final List h0() {
        return (List) this.K0.invoke();
    }

    @Override // defpackage.u09, defpackage.tq8
    public final e09 i() {
        return this.X;
    }

    @Override // defpackage.u09
    public final boolean isInline() {
        return false;
    }

    @Override // defpackage.z22
    public final boolean j() {
        return this.Z;
    }

    @Override // defpackage.i0, defpackage.u09
    public final dr8 j0() {
        return this.H0;
    }

    @Override // defpackage.i0, defpackage.u09
    public final dr8 k0() {
        return (wx7) super.k0();
    }

    @Override // defpackage.u09
    public final dr8 l0(zt7 zt7Var) {
        ufc ufcVar = this.G0;
        i0 i0Var = ufcVar.a;
        int i = qz3.a;
        oz3.c(i0Var).getClass();
        return (wx7) ((dr8) gdc.f(ufcVar.c, ufc.e[0]));
    }

    @Override // defpackage.u09
    public final z12 m0() {
        return null;
    }

    @Override // defpackage.u09
    public final orf n0() {
        return null;
    }

    @Override // defpackage.u09
    public final boolean o0() {
        return false;
    }

    @Override // defpackage.u09
    public final Collection p() {
        return (List) this.F0.q.invoke();
    }

    @Override // defpackage.u09
    public final boolean p0() {
        return false;
    }

    @Override // defpackage.u09
    public final boolean q0() {
        return false;
    }

    @Override // defpackage.u09
    public final boolean r0() {
        return false;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Lazy Java class ");
        int i = qz3.a;
        ex5 ex5VarF = oz3.f(this);
        ex5VarF.getClass();
        sb.append(ex5VarF);
        return sb.toString();
    }

    public final wx7 u0() {
        return (wx7) super.k0();
    }

    @Override // defpackage.tq8
    public final boolean w() {
        return false;
    }
}
