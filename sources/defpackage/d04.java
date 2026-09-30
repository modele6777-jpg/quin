package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class d04 extends i0 implements bm3 {
    public final szc E0;
    public final bm3 F0;
    public final de8 G0;
    public final ee8 H0;
    public final de8 I0;
    public final k0b J0;
    public final h10 K0;
    public final er8 X;
    public final c04 Y;
    public final ufc Z;
    public final nya e;
    public final ay0 f;
    public final ntd g;
    public final j22 v;
    public final e09 w;
    public final rz3 x;
    public final l22 y;
    public final lp0 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:25:0x00eb  */
    public d04(lp0 lp0Var, nya nyaVar, u99 u99Var, ay0 ay0Var, ntd ntdVar) {
        l22 l22Var;
        er8 p1eVar;
        boolean z;
        Boolean bool;
        super(((tz3) lp0Var.b).a, i7h.u(u99Var, nyaVar.q0()).f());
        lp0Var.getClass();
        nyaVar.getClass();
        u99Var.getClass();
        ntdVar.getClass();
        this.e = nyaVar;
        this.f = ay0Var;
        this.g = ntdVar;
        this.v = i7h.u(u99Var, nyaVar.q0());
        this.w = qk6.y0((fza) oi5.e.e(nyaVar.p0()));
        this.x = abg.u((j0b) oi5.d.e(nyaVar.p0()));
        mya myaVar = (mya) oi5.f.e(nyaVar.p0());
        int i = myaVar == null ? -1 : q0b.b[myaVar.ordinal()];
        l22 l22Var2 = l22.ENUM_CLASS;
        l22 l22Var3 = l22.CLASS;
        switch (i) {
            case 1:
            default:
                l22Var = l22Var3;
                break;
            case 2:
                l22Var3 = l22.INTERFACE;
                l22Var = l22Var3;
                break;
            case 3:
                l22Var = l22Var2;
                break;
            case 4:
                l22Var3 = l22.ENUM_ENTRY;
                l22Var = l22Var3;
                break;
            case 5:
                l22Var3 = l22.ANNOTATION_CLASS;
                l22Var = l22Var3;
                break;
            case 6:
            case 7:
                l22Var3 = l22.OBJECT;
                l22Var = l22Var3;
                break;
        }
        this.y = l22Var;
        List listB0 = nyaVar.B0();
        listB0.getClass();
        b0b b0bVarC0 = nyaVar.C0();
        b0bVarC0.getClass();
        bu3 bu3Var = new bu3(b0bVarC0);
        otf otfVar = otf.b;
        i0b i0bVarE0 = nyaVar.E0();
        i0bVarE0.getClass();
        lp0 lp0VarB = lp0Var.b(this, listB0, u99Var, bu3Var, p8c.n(i0bVarE0), ay0Var);
        tz3 tz3Var = (tz3) lp0VarB.b;
        ge8 ge8Var = tz3Var.a;
        this.z = lp0VarB;
        boolean zBooleanValue = oi5.m.e(nyaVar.p0()).booleanValue();
        int i2 = 0;
        if (l22Var == l22Var2) {
            if (zBooleanValue) {
                z = true;
            } else {
                switch (tz3Var.s.a) {
                    case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                        bool = null;
                        break;
                    default:
                        bool = Boolean.TRUE;
                        break;
                }
                if (pa7.t(bool, Boolean.TRUE)) {
                    z = true;
                } else {
                    z = false;
                }
            }
            p1eVar = new p1e(ge8Var, this, z);
        } else {
            p1eVar = cr8.b;
        }
        this.X = p1eVar;
        this.Y = new c04(this);
        eu4 eu4Var = ufc.d;
        ((cf9) tz3Var.q).getClass();
        uj3 uj3Var = new uj3(1, this, b04.class, "<init>", "<init>(Lorg/jetbrains/kotlin/serialization/deserialization/descriptors/DeserializedClassDescriptor;Lkotlin/reflect/jvm/internal/impl/types/checker/KotlinTypeRefiner;)V", 0, 7);
        eu4Var.getClass();
        ge8Var.getClass();
        this.Z = new ufc(this, ge8Var, uj3Var);
        this.E0 = l22Var == l22Var2 ? new szc(this) : null;
        bm3 bm3Var = (bm3) lp0Var.d;
        this.F0 = bm3Var;
        this.G0 = new de8(ge8Var, new xz3(this, i2));
        this.H0 = new ee8(ge8Var, new xz3(this, 1));
        new de8(ge8Var, new xz3(this, 2));
        ge8Var.a(new xz3(this, 3));
        this.I0 = new de8(ge8Var, new xz3(this, 4));
        u99 u99Var2 = (u99) lp0VarB.c;
        bu3 bu3Var2 = (bu3) lp0VarB.e;
        d04 d04Var = bm3Var instanceof d04 ? (d04) bm3Var : null;
        this.J0 = new k0b(nyaVar, u99Var2, bu3Var2, ntdVar, d04Var != null ? d04Var.J0 : null);
        this.K0 = !oi5.c.e(nyaVar.p0()).booleanValue() ? hj6.c : new ig9(ge8Var, new xz3(this, 5));
    }

    @Override // defpackage.u09
    public final l22 E() {
        return this.y;
    }

    @Override // defpackage.u09
    public final dr8 c0() {
        return this.X;
    }

    @Override // defpackage.dm3
    public final ntd e() {
        return this.g;
    }

    @Override // defpackage.tq8
    public final boolean e0() {
        return false;
    }

    @Override // defpackage.f00
    public final h10 getAnnotations() {
        return this.K0;
    }

    @Override // defpackage.u09, defpackage.tq8, defpackage.gm3
    public final rz3 getVisibility() {
        return this.x;
    }

    @Override // defpackage.y22
    public final j7f h() {
        return this.Y;
    }

    @Override // defpackage.u09, defpackage.z22
    public final List h0() {
        return ((o7f) this.z.w).b();
    }

    @Override // defpackage.u09, defpackage.tq8
    public final e09 i() {
        return this.w;
    }

    @Override // defpackage.tq8
    public final boolean isExternal() {
        return oi5.i.e(this.e.p0()).booleanValue();
    }

    @Override // defpackage.u09
    public final boolean isInline() {
        if (!oi5.k.e(this.e.p0()).booleanValue()) {
            return false;
        }
        ay0 ay0Var = this.f;
        int i = ay0Var.b;
        if (i >= 1) {
            if (i > 1) {
                return false;
            }
            int i2 = ay0Var.c;
            if (i2 >= 4 && (i2 > 4 || ay0Var.d > 1)) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.z22
    public final boolean j() {
        return oi5.g.e(this.e.p0()).booleanValue();
    }

    @Override // defpackage.bm3
    public final bm3 k() {
        return this.F0;
    }

    @Override // defpackage.u09
    public final dr8 l0(zt7 zt7Var) {
        ufc ufcVar = this.Z;
        i0 i0Var = ufcVar.a;
        int i = qz3.a;
        oz3.c(i0Var).getClass();
        return (dr8) gdc.f(ufcVar.c, ufc.e[0]);
    }

    @Override // defpackage.u09
    public final z12 m0() {
        return (z12) this.G0.invoke();
    }

    @Override // defpackage.u09
    public final orf n0() {
        return (orf) this.I0.invoke();
    }

    @Override // defpackage.u09
    public final boolean o0() {
        return oi5.f.e(this.e.p0()) == mya.COMPANION_OBJECT;
    }

    @Override // defpackage.u09
    public final Collection p() {
        return (Collection) this.H0.invoke();
    }

    @Override // defpackage.u09
    public final boolean p0() {
        return oi5.h.e(this.e.p0()).booleanValue();
    }

    @Override // defpackage.u09
    public final boolean q0() {
        return oi5.l.e(this.e.p0()).booleanValue();
    }

    @Override // defpackage.u09
    public final boolean r0() {
        return oi5.k.e(this.e.p0()).booleanValue() && this.f.a(1, 4, 2);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("deserialized ");
        sb.append(w() ? "expect " : "");
        sb.append("class ");
        sb.append(getName());
        return sb.toString();
    }

    public final b04 u0() {
        ((cf9) ((tz3) this.z.b).q).getClass();
        ufc ufcVar = this.Z;
        ufcVar.getClass();
        i0 i0Var = ufcVar.a;
        int i = qz3.a;
        oz3.c(i0Var).getClass();
        return (b04) ((dr8) gdc.f(ufcVar.c, ufc.e[0]));
    }

    @Override // defpackage.i0, defpackage.u09
    public final List v() {
        lp0 lp0Var = this.z;
        List listA = feg.A(this.e, (bu3) lp0Var.e);
        ArrayList arrayList = new ArrayList(t72.u(listA, 10));
        Iterator it = listA.iterator();
        while (it.hasNext()) {
            arrayList.add(new nw7(i0(), new in2(this, ((o7f) lp0Var.w).g((vza) it.next()), (t99) null), hj6.c));
        }
        return arrayList;
    }

    public final tjd v0(t99 t99Var) {
        Iterator it = u0().f(t99Var, lf9.g).iterator();
        boolean z = false;
        Object obj = null;
        while (true) {
            if (!it.hasNext()) {
                if (!z) {
                    break;
                }
                break;
            }
            Object next = it.next();
            wxa wxaVar = (wxa) next;
            if (wxaVar.O() == null && wxaVar.T().isEmpty()) {
                if (!z) {
                    z = true;
                    obj = next;
                }
            }
            obj = null;
            break;
        }
        wxa wxaVar2 = (wxa) obj;
        return (tjd) (wxaVar2 != null ? wxaVar2.getType() : null);
    }

    @Override // defpackage.tq8
    public final boolean w() {
        return oi5.j.e(this.e.p0()).booleanValue();
    }
}
