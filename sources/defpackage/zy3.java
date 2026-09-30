package defpackage;

import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class zy3 extends j2 {
    public static final /* synthetic */ wn7[] f = {new aya(zy3.class, "classifier", "getClassifier()Lkotlin/reflect/KClassifier;", 0), new aya(zy3.class, "arguments", "getArguments()Ljava/util/List;", 0)};
    public final tt7 b;
    public final boolean c;
    public final fob d;
    public final fob e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zy3(tt7 tt7Var, x16 x16Var, boolean z) {
        super(x16Var);
        tt7Var.getClass();
        this.b = tt7Var;
        this.c = z;
        this.d = lmg.m0(null, new xy3(this, 0));
        this.e = lmg.m0(null, new n5(this, x16Var, false, 8));
    }

    @Override // defpackage.yn7
    public final List A() {
        wn7 wn7Var = f[1];
        Object objInvoke = this.e.invoke();
        objInvoke.getClass();
        return (List) objInvoke;
    }

    @Override // defpackage.yn7
    public final um7 B() {
        wn7 wn7Var = f[0];
        return (um7) this.d.invoke();
    }

    @Override // defpackage.j2
    public final j2 C(boolean z) {
        tt7 tt7Var = this.b;
        tt7Var.getClass();
        if (!(tt7Var.k0() instanceof bj5) && tt7Var.i0() == z) {
            return this;
        }
        jgf jgfVarH = w8f.h(tt7Var, z);
        jgfVarH.getClass();
        return new zy3(jgfVarH, null, false);
    }

    @Override // defpackage.j2
    public final j2 F() {
        jgf jgfVarK0 = this.b.k0();
        if (jgfVarK0 instanceof bj5) {
            return new zy3(((bj5) jgfVarK0).c, 0);
        }
        return null;
    }

    public final um7 G(tt7 tt7Var) {
        xm7 xm7VarZ;
        bo7 bo7VarZ;
        tt7 tt7VarB;
        if (this.c) {
            y22 y22VarM = tt7Var.c0().m();
            vg9 vg9Var = y22VarM instanceof vg9 ? (vg9) y22VarM : null;
            if (vg9Var != null) {
                return new zn7(qz3.g(vg9Var));
            }
        }
        y22 y22VarM2 = tt7Var.c0().m();
        if (y22VarM2 instanceof u09) {
            Class clsQ = sqf.q((u09) y22VarM2);
            if (clsQ != null) {
                if (!xr7.z(tt7Var)) {
                    if (w8f.e(tt7Var)) {
                        return new nm7(clsQ);
                    }
                    Class cls = (Class) smb.b.get(clsQ);
                    if (cls != null) {
                        clsQ = cls;
                    }
                    return new nm7(clsQ);
                }
                i8f i8fVar = (i8f) s72.Z0(tt7Var.Z());
                if (i8fVar == null || (tt7VarB = i8fVar.b()) == null) {
                    return new nm7(clsQ);
                }
                um7 um7VarG = G(w8f.h(tt7VarB, true));
                if (um7VarG != null) {
                    return new nm7(sqf.e(af1.S(pa7.U(um7VarG))));
                }
                ho7.m(this, "Cannot determine classifier for array element type: ");
                return null;
            }
        } else if (y22VarM2 instanceof c8f) {
            c8f c8fVar = (c8f) y22VarM2;
            bm3 bm3VarK = c8fVar.k();
            bm3VarK.getClass();
            if (bm3VarK instanceof u09) {
                bo7VarZ = n16.Z((u09) bm3VarK);
            } else if (bm3VarK instanceof ea1) {
                bm3 bm3VarK2 = ((ea1) bm3VarK).k();
                bm3VarK2.getClass();
                if (bm3VarK2 instanceof u09) {
                    xm7VarZ = n16.Z((u09) bm3VarK2);
                } else {
                    i04 i04Var = bm3VarK instanceof i04 ? (i04) bm3VarK : null;
                    if (i04Var == null) {
                        ho7.m(bm3VarK, "Non-class callable descriptor must be deserialized: ");
                        return null;
                    }
                    f04 f04VarI = i04Var.I();
                    if (f04VarI instanceof yk7) {
                        cob cobVar = ((yk7) f04VarI).c;
                        cob cobVar2 = cobVar != null ? cobVar : null;
                        if (cobVar2 == null) {
                            oo3.h("Container of top-level deserialized member is not resolved: ", i04Var, " (", cobVar);
                            return null;
                        }
                        vm7 vm7VarC = job.a.c(cobVar2.a);
                        vm7VarC.getClass();
                        xm7VarZ = (nn7) vm7VarC;
                    } else if (f04VarI instanceof bb8) {
                        xm7VarZ = ((bb8) f04VarI).a;
                    } else {
                        if (!(f04VarI instanceof hob)) {
                            ho7.m(i04Var, "Container of deserialized member is not resolved: ");
                            return null;
                        }
                        xm7VarZ = mu4.b;
                    }
                }
                Object objD = bm3VarK.D(new a90(xm7VarZ), wef.a);
                objD.getClass();
                bo7VarZ = (bo7) objD;
            } else {
                ho7.m(bm3VarK, "Unknown type parameter container: ");
            }
            return new ao7(bo7VarZ, c8fVar);
        }
        return null;
    }

    @Override // defpackage.j2
    public final yn7 d() {
        tt7 tt7Var = this.b;
        tt7Var.getClass();
        jgf jgfVarK0 = tt7Var.k0();
        j jVar = jgfVarK0 instanceof j ? (j) jgfVarK0 : null;
        tjd tjdVar = jVar != null ? jVar.c : null;
        if (tjdVar != null) {
            return new zy3(tjdVar, this.a, true);
        }
        return null;
    }

    @Override // defpackage.j2
    public final boolean equals(Object obj) {
        if (!rce.a) {
            return super.equals(obj);
        }
        if (!(obj instanceof zy3)) {
            return false;
        }
        zy3 zy3Var = (zy3) obj;
        return pa7.t(this.b, zy3Var.b) && pa7.t(B(), zy3Var.B()) && A().equals(zy3Var.A());
    }

    @Override // defpackage.j2
    public final em7 f() {
        y22 y22VarM = this.b.c0().m();
        u09 u09Var = y22VarM instanceof u09 ? (u09) y22VarM : null;
        if (u09Var != null) {
            String str = qf7.a;
            if (qf7.j.containsKey(oz3.f(u09Var))) {
                if (rce.a) {
                    um7 um7VarB = B();
                    um7VarB.getClass();
                    return new j69((em7) um7VarB, qz3.g(u09Var).a.a, new yy3(u09Var, 0), new yy3(u09Var, 1));
                }
                dx5 dx5VarG = qz3.g(u09Var);
                um7 um7VarB2 = B();
                um7VarB2.getClass();
                return urg.D(dx5VarG, (em7) um7VarB2);
            }
        }
        return null;
    }

    @Override // defpackage.bm7
    public final List getAnnotations() {
        return sqf.d(this.b);
    }

    @Override // defpackage.j2
    public final int hashCode() {
        if (!rce.a) {
            return super.hashCode();
        }
        int iHashCode = this.b.hashCode() * 31;
        um7 um7VarB = B();
        return A().hashCode() + ((iHashCode + (um7VarB != null ? um7VarB.hashCode() : 0)) * 31);
    }

    @Override // defpackage.j2
    public final boolean m() {
        tt7 tt7Var = this.b;
        tt7Var.getClass();
        return tt7Var.k0() instanceof kv3;
    }

    @Override // defpackage.yn7
    public final boolean o() {
        return this.b.i0();
    }

    @Override // defpackage.j2
    public final boolean t() {
        tt7 tt7Var = this.b;
        if (tt7Var != null) {
            t99 t99Var = xr7.e;
            return xr7.B(tt7Var, syd.b);
        }
        xr7.a(138);
        throw null;
    }

    @Override // defpackage.j2
    public final boolean u() {
        return this.b instanceof mdb;
    }

    @Override // defpackage.j2
    public final boolean w() {
        return oa7.V(this.b);
    }

    @Override // defpackage.j2
    public final j2 y() {
        jgf jgfVarK0 = this.b.k0();
        if (jgfVarK0 instanceof bj5) {
            return new zy3(((bj5) jgfVarK0).b, 0);
        }
        return null;
    }

    @Override // defpackage.j2
    public final j2 z(boolean z) {
        tt7 tt7VarK0;
        tt7 tt7Var = this.b;
        if (z) {
            tt7VarK0 = qfc.K0(tt7Var.k0(), true);
            if (tt7VarK0 == null) {
                return this;
            }
        } else {
            kv3 kv3Var = tt7Var instanceof kv3 ? (kv3) tt7Var : null;
            if (kv3Var == null || (tt7VarK0 = kv3Var.b) == null) {
                return this;
            }
        }
        return new zy3(tt7VarK0, null, false);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public zy3(tt7 tt7Var, int i) {
        this(tt7Var, null, false);
        tt7Var.getClass();
    }
}
