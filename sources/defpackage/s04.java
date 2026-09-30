package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class s04 extends em3 implements i04, z22 {
    public tjd E0;
    public List F0;
    public tjd G0;
    public final otf X;
    public final f04 Y;
    public tjd Z;
    public final ge8 f;
    public final rz3 g;
    public List v;
    public final k5 w;
    public final xza x;
    public final u99 y;
    public final bu3 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s04(ge8 ge8Var, bm3 bm3Var, h10 h10Var, t99 t99Var, rz3 rz3Var, xza xzaVar, u99 u99Var, bu3 bu3Var, otf otfVar, f04 f04Var) {
        super(bm3Var, h10Var, t99Var, ntd.T);
        ge8Var.getClass();
        bm3Var.getClass();
        rz3Var.getClass();
        xzaVar.getClass();
        u99Var.getClass();
        bu3Var.getClass();
        otfVar.getClass();
        ge8Var.getClass();
        bm3Var.getClass();
        rz3Var.getClass();
        this.f = ge8Var;
        this.g = rz3Var;
        ge8Var.a(new j5(0, this));
        this.w = new k5(this);
        this.x = xzaVar;
        this.y = u99Var;
        this.z = bu3Var;
        this.X = otfVar;
        this.Y = f04Var;
    }

    @Override // defpackage.i04
    public final bu3 A() {
        return this.z;
    }

    @Override // defpackage.bm3
    public final Object D(fm3 fm3Var, Object obj) {
        return fm3Var.o(this, obj);
    }

    public final u09 D0() {
        if (i7h.x(E0())) {
            return null;
        }
        y22 y22VarM = E0().c0().m();
        if (y22VarM instanceof u09) {
            return (u09) y22VarM;
        }
        return null;
    }

    public final tjd E0() {
        tjd tjdVar = this.E0;
        if (tjdVar != null) {
            return tjdVar;
        }
        pa7.g0("expandedType");
        throw null;
    }

    public final tjd F0() {
        tjd tjdVar = this.Z;
        if (tjdVar != null) {
            return tjdVar;
        }
        pa7.g0("underlyingType");
        throw null;
    }

    public final void G0(List list, tjd tjdVar, tjd tjdVar2) {
        dr8 dr8VarK0;
        tjd tjdVarV;
        tjdVar.getClass();
        tjdVar2.getClass();
        this.v = list;
        this.Z = tjdVar;
        this.E0 = tjdVar2;
        this.F0 = a6c.g(this);
        u09 u09VarD0 = D0();
        if (u09VarD0 == null || (dr8VarK0 = u09VarD0.k0()) == null) {
            dr8VarK0 = cr8.b;
        }
        dr8 dr8Var = dr8VarK0;
        qqf qqfVar = new qqf(3, this);
        oy4 oy4Var = w8f.a;
        if (sy4.f(this)) {
            tjdVarV = sy4.c(qy4.w, toString());
        } else {
            j7f j7fVarH = h();
            if (j7fVarH == null) {
                w8f.a(12);
                throw null;
            }
            List listD = w8f.d(((k5) j7fVarH).getParameters());
            e7f.b.getClass();
            tjdVarV = rxg.V(e7f.c, j7fVarH, listD, false, dr8Var, qqfVar);
        }
        this.G0 = tjdVarV;
    }

    @Override // defpackage.i04
    public final u99 H() {
        return this.y;
    }

    @Override // defpackage.i04
    public final f04 I() {
        return this.Y;
    }

    @Override // defpackage.y22
    public final tjd S() {
        tjd tjdVar = this.G0;
        if (tjdVar != null) {
            return tjdVar;
        }
        pa7.g0("defaultTypeImpl");
        throw null;
    }

    @Override // defpackage.v7e
    public final dm3 d(q8f q8fVar) {
        q8fVar.getClass();
        if (q8fVar.a.e()) {
            return this;
        }
        bm3 bm3VarK = k();
        bm3VarK.getClass();
        h10 annotations = getAnnotations();
        annotations.getClass();
        t99 name = getName();
        name.getClass();
        s04 s04Var = new s04(this.f, bm3VarK, annotations, name, this.g, this.x, this.y, this.z, this.X, this.Y);
        List listH0 = h0();
        tjd tjdVarF0 = F0();
        dsf dsfVar = dsf.INVARIANT;
        s04Var.G0(listH0, w6c.d(q8fVar.f(tjdVarF0, dsfVar)), w6c.d(q8fVar.f(E0(), dsfVar)));
        return s04Var;
    }

    @Override // defpackage.tq8
    public final boolean e0() {
        return false;
    }

    @Override // defpackage.tq8, defpackage.gm3
    public final rz3 getVisibility() {
        return this.g;
    }

    @Override // defpackage.y22
    public final j7f h() {
        return this.w;
    }

    @Override // defpackage.z22
    public final List h0() {
        List list = this.v;
        if (list != null) {
            return list;
        }
        pa7.g0("declaredTypeParametersImpl");
        throw null;
    }

    @Override // defpackage.tq8
    public final boolean isExternal() {
        return false;
    }

    @Override // defpackage.z22
    public final boolean j() {
        return w8f.c(F0(), new x(4, this), null);
    }

    @Override // defpackage.i04
    public final ut8 r() {
        return this.x;
    }

    @Override // defpackage.cm3, defpackage.m4
    public final String toString() {
        return "typealias " + getName().b();
    }

    @Override // defpackage.tq8
    public final boolean w() {
        return false;
    }

    @Override // defpackage.em3, defpackage.cm3, defpackage.bm3
    public final bm3 a() {
        return this;
    }

    @Override // defpackage.em3
    /* JADX INFO: renamed from: C0 */
    public final dm3 a() {
        return this;
    }

    @Override // defpackage.em3, defpackage.cm3, defpackage.bm3
    public final y22 a() {
        return this;
    }
}
