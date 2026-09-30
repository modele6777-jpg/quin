package defpackage;

import java.io.IOException;
import java.lang.reflect.Field;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Member;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public class gf7 extends re7 implements sn7, bob {
    public final lw7 f;
    public final lw7 g;
    public final lw7 v;
    public final lw7 w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gf7(xm7 xm7Var, Field field, Object obj, dm7 dm7Var) {
        super(xm7Var, field, obj, dm7Var);
        xm7Var.getClass();
        dm7Var.getClass();
        cf7 cf7Var = new cf7(this, 0);
        z18 z18Var = z18.b;
        this.f = eb3.N(z18Var, cf7Var);
        this.g = eb3.N(z18Var, new cf7(this, 1));
        this.v = eb3.N(z18Var, new cf7(this, 2));
        this.w = eb3.N(z18Var, new cf7(this, 3));
    }

    public final Field F() {
        Member member = this.d;
        member.getClass();
        return (Field) member;
    }

    @Override // defpackage.xnb, defpackage.wnb
    public final List a() {
        return (List) this.f.getValue();
    }

    public final boolean equals(Object obj) {
        bob bobVarC = sqf.c(obj);
        return bobVarC != null && pa7.t(this.c, bobVarC.s()) && getName().equals(bobVarC.getName()) && getSignature().equals(bobVarC.getSignature()) && pa7.t(this.e, bobVarC.x());
    }

    @Override // defpackage.hs7
    public final GenericDeclaration findJavaDeclaration() {
        return hkg.o0(this.c, getSignature());
    }

    @Override // defpackage.sn7
    public final Object get() {
        return b().call(new Object[0]);
    }

    @Override // defpackage.cm7
    public final String getName() {
        String name = F().getName();
        name.getClass();
        return name;
    }

    @Override // defpackage.cm7
    public final List getParameters() {
        return (List) this.g.getValue();
    }

    @Override // defpackage.cm7
    public final yn7 getReturnType() {
        return (yn7) this.v.getValue();
    }

    @Override // defpackage.bob
    public final String getSignature() {
        return o8c.m(F());
    }

    @Override // defpackage.cm7, defpackage.bo7
    public final List getTypeParameters() {
        return pu4.a;
    }

    @Override // defpackage.wnb
    public final sa1 h() {
        return b().h();
    }

    public final int hashCode() {
        return getSignature().hashCode() + ((getName().hashCode() + (this.c.hashCode() * 31)) * 31);
    }

    @Override // defpackage.re7, defpackage.wnb
    public final d09 i() {
        return d09.FINAL;
    }

    @Override // defpackage.x16
    public final Object invoke() {
        return get();
    }

    @Override // defpackage.bob
    public final Field l() {
        return F();
    }

    @Override // defpackage.wnb
    public final sa1 n() {
        b().getClass();
        return null;
    }

    @Override // defpackage.wnb
    public wnb p(xm7 xm7Var, dm7 dm7Var) {
        xm7Var.getClass();
        dm7Var.getClass();
        return new gf7(xm7Var, F(), this.e, dm7Var);
    }

    public final String toString() throws IOException {
        StringBuilder sb = new StringBuilder();
        af8.h(sb, this);
        sb.append(this instanceof in7 ? "var " : "val ");
        af8.j(sb, this);
        af8.i(getName(), sb);
        sb.append(": ");
        sb.append(af8.C(getReturnType(), false));
        return sb.toString();
    }

    @Override // defpackage.sn7, defpackage.wn7
    /* JADX INFO: renamed from: y, reason: merged with bridge method [inline-methods] */
    public final ff7 b() {
        return (ff7) this.w.getValue();
    }
}
