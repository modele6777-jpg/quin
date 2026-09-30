package defpackage;

import java.io.IOException;
import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.GenericDeclaration;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class kt7 extends ms7 implements bob {
    public final xm7 c;
    public final String d;
    public final Object e;
    public final uq7 f;
    public final lw7 g;
    public final lw7 v;
    public final lw7 w;
    public final lw7 x;
    public final lw7 y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kt7(xm7 xm7Var, String str, Object obj, uq7 uq7Var, dm7 dm7Var) {
        super(dm7Var);
        xm7Var.getClass();
        str.getClass();
        uq7Var.getClass();
        dm7Var.getClass();
        this.c = xm7Var;
        this.d = str;
        this.e = obj;
        this.f = uq7Var;
        zs7 zs7Var = new zs7(this, 0);
        z18 z18Var = z18.b;
        this.g = eb3.N(z18Var, zs7Var);
        this.v = eb3.N(z18Var, new zs7(this, 1));
        this.w = eb3.N(z18Var, new zs7(this, 2));
        this.x = eb3.N(z18Var, new zs7(this, 3));
        this.y = eb3.N(z18Var, new zs7(this, 4));
    }

    public abstract bt7 F();

    @Override // defpackage.xnb, defpackage.wnb
    public final List a() {
        return (List) this.g.getValue();
    }

    public final boolean equals(Object obj) {
        bob bobVarC = sqf.c(obj);
        return bobVarC != null && pa7.t(this.c, bobVarC.s()) && pa7.t(this.f.b, bobVarC.getName()) && pa7.t(this.d, bobVarC.getSignature()) && pa7.t(this.e, bobVarC.x());
    }

    @Override // defpackage.hs7
    public final GenericDeclaration findJavaDeclaration() {
        return hkg.o0(this.c, this.d);
    }

    @Override // defpackage.bm7
    public final List getAnnotations() {
        Annotation[] annotations;
        boolean zG = cgg.G(this);
        uq7 uq7Var = this.f;
        xm7 xm7Var = this.c;
        if (zG || xm7Var.d().isAnnotation()) {
            ArrayList arrayList = uq7Var.m;
            ArrayList arrayList2 = new ArrayList(t72.u(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(abg.X((mp7) it.next(), smb.d(xm7Var.d())));
            }
            return arrayList2;
        }
        if (!(xm7Var instanceof nn7)) {
            StringBuilder sb = new StringBuilder("Annotations are only supported for top-level properties for now: ");
            sb.append(xm7Var);
            ho7.s(sb, uq7Var.b, this.d);
            return null;
        }
        uq7Var.getClass();
        vk7 vk7Var = cn1.D(uq7Var).e;
        if (vk7Var == null) {
            return pu4.a;
        }
        Method methodF = xm7Var.F(vk7Var.E0, vk7Var.F0);
        if (methodF != null && (annotations = methodF.getAnnotations()) != null) {
            return sqf.t(qd0.G0(annotations));
        }
        ho7.m(this, "No synthetic method found: ");
        return null;
    }

    @Override // defpackage.cm7
    public final String getName() {
        return this.f.b;
    }

    @Override // defpackage.cm7
    public final List getParameters() {
        return (List) this.v.getValue();
    }

    @Override // defpackage.cm7
    public final yn7 getReturnType() {
        return (yn7) this.w.getValue();
    }

    @Override // defpackage.bob
    public final String getSignature() {
        return this.d;
    }

    @Override // defpackage.cm7, defpackage.bo7
    public final List getTypeParameters() {
        return ((g8f) this.x.getValue()).a;
    }

    @Override // defpackage.cm7
    public final jo7 getVisibility() {
        return abg.f0(si0.b(this.f));
    }

    @Override // defpackage.wnb
    public final sa1 h() {
        return F().h();
    }

    public final int hashCode() {
        return this.d.hashCode() + ub3.c(this.c.hashCode() * 31, 31, this.f.b);
    }

    @Override // defpackage.wnb
    public final d09 i() {
        wn7[] wn7VarArr = si0.a;
        uq7 uq7Var = this.f;
        uq7Var.getClass();
        return (d09) si0.p.M(si0.a[34], uq7Var);
    }

    @Override // defpackage.cm7, defpackage.ym7
    public final boolean isSuspend() {
        return false;
    }

    @Override // defpackage.bob
    public final Field l() {
        return (Field) this.y.getValue();
    }

    @Override // defpackage.wnb
    public final sa1 n() {
        F().getClass();
        return null;
    }

    @Override // defpackage.wnb
    public final xm7 s() {
        return this.c;
    }

    public final String toString() throws IOException {
        StringBuilder sb = new StringBuilder();
        af8.h(sb, this);
        sb.append(this instanceof in7 ? "var " : "val ");
        af8.j(sb, this);
        af8.i(this.f.b, sb);
        sb.append(": ");
        sb.append(af8.C(getReturnType(), false));
        return sb.toString();
    }

    @Override // defpackage.wnb
    public final Object x() {
        return this.e;
    }

    public final Member y() {
        wn7[] wn7VarArr = si0.a;
        uq7 uq7Var = this.f;
        uq7Var.getClass();
        if (!si0.r.F(si0.a[41], uq7Var)) {
            return null;
        }
        vk7 vk7Var = cn1.D(uq7Var).f;
        if (vk7Var == null) {
            return l();
        }
        return this.c.F(vk7Var.E0, vk7Var.F0);
    }
}
