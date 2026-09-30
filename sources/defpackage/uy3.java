package defpackage;

import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Member;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class uy3 extends rx3 implements bob {
    public final fob X;
    public final xm7 v;
    public final String w;
    public final String x;
    public final Object y;
    public final lw7 z;
    public static final /* synthetic */ wn7[] Z = {new aya(uy3.class, "descriptor", "getDescriptor()Lorg/jetbrains/kotlin/descriptors/PropertyDescriptor;", 0)};
    public static final i8c Y = new i8c(26);
    public static final Object E0 = new Object();

    public uy3(xm7 xm7Var, String str, String str2, wxa wxaVar, Object obj, dm7 dm7Var) {
        super(dm7Var);
        this.v = xm7Var;
        this.w = str;
        this.x = str2;
        this.y = obj;
        this.z = eb3.N(z18.b, new fy3(this, 0));
        this.X = lmg.m0(wxaVar, new fy3(this, 1));
    }

    @Override // defpackage.rx3
    public final zy3 F() {
        tt7 returnType = G().getReturnType();
        returnType.getClass();
        return new zy3(returnType, cgg.G(this) ? null : new fy3(this, 2), false);
    }

    public final Member H() {
        if (!G().y()) {
            return null;
        }
        j22 j22Var = n8c.a;
        m93 m93VarB = n8c.b(G());
        if (m93VarB instanceof el7) {
            el7 el7Var = (el7) m93VarB;
            u99 u99Var = el7Var.u;
            ll7 ll7Var = el7Var.t;
            if (ll7Var.v()) {
                jl7 jl7VarQ = ll7Var.q();
                if (!jl7VarQ.q() || !jl7VarQ.p()) {
                    return null;
                }
                return this.v.F(u99Var.getString(jl7VarQ.o()), u99Var.getString(jl7VarQ.n()));
            }
        }
        return l();
    }

    @Override // defpackage.rx3
    /* JADX INFO: renamed from: I, reason: merged with bridge method [inline-methods] */
    public final wxa G() {
        wn7 wn7Var = Z[0];
        Object objInvoke = this.X.invoke();
        objInvoke.getClass();
        return (wxa) objInvoke;
    }

    public abstract iy3 J();

    public final boolean equals(Object obj) {
        bob bobVarC = sqf.c(obj);
        return bobVarC != null && pa7.t(this.v, bobVarC.s()) && pa7.t(this.w, bobVarC.getName()) && pa7.t(this.x, bobVarC.getSignature()) && pa7.t(this.y, bobVarC.x());
    }

    @Override // defpackage.hs7
    public final GenericDeclaration findJavaDeclaration() {
        return hkg.o0(this.v, this.x);
    }

    @Override // defpackage.cm7
    public final String getName() {
        return this.w;
    }

    @Override // defpackage.bob
    public final String getSignature() {
        return this.x;
    }

    @Override // defpackage.wnb
    public final sa1 h() {
        return J().h();
    }

    public final int hashCode() {
        return this.x.hashCode() + ub3.c(this.v.hashCode() * 31, 31, this.w);
    }

    @Override // defpackage.cm7, defpackage.ym7
    public final boolean isSuspend() {
        return false;
    }

    @Override // defpackage.bob
    public final Field l() {
        return (Field) this.z.getValue();
    }

    @Override // defpackage.wnb
    public final sa1 n() {
        J().getClass();
        return null;
    }

    @Override // defpackage.wnb
    public final xm7 s() {
        return this.v;
    }

    public final String toString() throws IOException {
        StringBuilder sb = new StringBuilder();
        af8.h(sb, this);
        sb.append(this instanceof in7 ? "var " : "val ");
        af8.j(sb, this);
        af8.i(this.w, sb);
        sb.append(": ");
        sb.append(af8.C(getReturnType(), false));
        return sb.toString();
    }

    @Override // defpackage.wnb
    public final Object x() {
        return this.y;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public uy3(xm7 xm7Var, String str, String str2, Object obj) {
        this(xm7Var, str, str2, null, obj, dm7.j);
        str.getClass();
        str2.getClass();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public uy3(xm7 xm7Var, wxa wxaVar, dm7 dm7Var) {
        xm7Var.getClass();
        dm7Var.getClass();
        String strB = wxaVar.getName().b();
        strB.getClass();
        this(xm7Var, strB, n8c.b(wxaVar).r(), wxaVar, ga1.NO_RECEIVER, dm7Var);
    }
}
