package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.Member;
import java.lang.reflect.Method;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class at7 extends ms7 implements ym7, pn7 {
    /* JADX WARN: Illegal instructions before constructor call */
    public at7() {
        dm7 dm7Var = dm7.j;
        dm7Var.getClass();
        super(dm7Var);
    }

    public abstract kt7 F();

    @Override // defpackage.bm7
    public final List getAnnotations() {
        Annotation[] annotations;
        boolean zG = cgg.G(F());
        List list = pu4.a;
        if (zG) {
            return list;
        }
        Member memberB = h().b();
        List listG0 = null;
        Method method = memberB instanceof Method ? (Method) memberB : null;
        if (method != null && (annotations = method.getAnnotations()) != null) {
            listG0 = qd0.G0(annotations);
        }
        if (listG0 != null) {
            list = listG0;
        }
        return sqf.t(list);
    }

    @Override // defpackage.cm7, defpackage.bo7
    public final List getTypeParameters() {
        return F().getTypeParameters();
    }

    @Override // defpackage.cm7
    public final jo7 getVisibility() {
        pyf pyfVar;
        jo7 jo7VarF0;
        vq7 vq7VarY = y();
        return (vq7VarY == null || (pyfVar = (pyf) si0.s.M(si0.a[44], vq7VarY)) == null || (jo7VarF0 = abg.f0(pyfVar)) == null) ? F().getVisibility() : jo7VarF0;
    }

    @Override // defpackage.wnb
    public final d09 i() {
        d09 d09Var;
        vq7 vq7VarY = y();
        return (vq7VarY == null || (d09Var = (d09) si0.t.M(si0.a[45], vq7VarY)) == null) ? F().i() : d09Var;
    }

    @Override // defpackage.ym7
    public final boolean isExternal() {
        vq7 vq7VarY = y();
        return vq7VarY != null && si0.u.F(si0.a[47], vq7VarY);
    }

    @Override // defpackage.ym7
    public final boolean isInfix() {
        return false;
    }

    @Override // defpackage.ym7
    public final boolean isInline() {
        vq7 vq7VarY = y();
        return vq7VarY != null && si0.v.F(si0.a[48], vq7VarY);
    }

    @Override // defpackage.ym7
    public final boolean isOperator() {
        return false;
    }

    @Override // defpackage.cm7, defpackage.ym7
    public final boolean isSuspend() {
        return false;
    }

    @Override // defpackage.wnb
    public final sa1 n() {
        return null;
    }

    @Override // defpackage.wnb
    public final wnb p(xm7 xm7Var, dm7 dm7Var) {
        xm7Var.getClass();
        dm7Var.getClass();
        throw new IllegalStateException("Property accessors can only be copied by copying the corresponding property");
    }

    @Override // defpackage.wnb
    public final xm7 s() {
        return F().c;
    }

    @Override // defpackage.wnb
    public final Object x() {
        return F().e;
    }

    public abstract vq7 y();
}
