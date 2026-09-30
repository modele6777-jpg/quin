package defpackage;

import android.view.KeyEvent;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.compose.foundation.b;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b1 extends sv3 implements ria, qo7, wwc, ug2, al9, h27, t66 {
    public t69 F0;
    public r17 G0;
    public boolean H0;
    public String I0;
    public i5c J0;
    public boolean K0;
    public x16 L0;
    public final vo5 M0;
    public r17 N0;
    public u66 O0;
    public String P0 = "idle";
    public rv3 Q0;
    public pta R0;
    public yq6 S0;
    public final y69 T0;
    public long U0;
    public pta V0;
    public t69 W0;
    public boolean X0;
    public lyd Y0;

    public b1(t69 t69Var, r17 r17Var, boolean z, boolean z2, String str, i5c i5cVar, x16 x16Var) {
        this.F0 = t69Var;
        this.G0 = r17Var;
        this.H0 = z;
        this.I0 = str;
        this.J0 = i5cVar;
        this.K0 = z2;
        this.L0 = x16Var;
        this.M0 = new vo5(t69Var, 0, new w(1, this, b1.class, "onFocusChange", "onFocusChange(Z)V", 0, 1));
        y69 y69Var = of8.a;
        this.T0 = new y69();
        this.U0 = 0L;
        t69 t69Var2 = this.F0;
        this.W0 = t69Var2;
        this.X0 = t69Var2 == null;
    }

    @Override // defpackage.al9
    public final void A0() {
        if (this.H0) {
            if9.C(this, new k0(this, 0));
        }
    }

    public final void A1() {
        ltd ltdVar = (ltd) eb3.H(this, zg2.v);
        if (ltdVar != null) {
            ltdVar.a();
        }
        this.L0.invoke();
    }

    public final void B1(t69 t69Var, r17 r17Var, boolean z, boolean z2, String str, i5c i5cVar, x16 x16Var) {
        boolean z3;
        boolean z4;
        rv3 rv3Var;
        boolean z5 = true;
        if (pa7.t(this.W0, t69Var)) {
            z3 = false;
        } else {
            q1();
            this.W0 = t69Var;
            this.F0 = t69Var;
            z3 = true;
        }
        if (!pa7.t(this.G0, r17Var)) {
            this.G0 = r17Var;
            z3 = true;
        }
        if (this.H0 != z) {
            this.H0 = z;
            if (z) {
                A0();
            }
            z3 = true;
        }
        boolean z6 = this.K0;
        vo5 vo5Var = this.M0;
        if (z6 != z2) {
            if (z2) {
                l1(vo5Var);
            } else {
                m1(vo5Var);
                q1();
            }
            scc.k(this);
            if (!z2) {
                rv3 rv3Var2 = this.O0;
                if (rv3Var2 != null) {
                    m1(rv3Var2);
                }
                this.O0 = null;
                this.P0 = "idle";
            }
            this.K0 = z2;
        }
        if (!pa7.t(this.I0, str)) {
            this.I0 = str;
            scc.k(this);
        }
        if (!pa7.t(this.J0, i5cVar)) {
            this.J0 = i5cVar;
            scc.k(this);
        }
        this.L0 = x16Var;
        boolean z7 = this.X0;
        t69 t69Var2 = this.W0;
        if (z7 == (t69Var2 == null)) {
            z5 = z3;
            z4 = z7;
        } else {
            z4 = t69Var2 == null;
            this.X0 = z4;
            if (z4 || this.Q0 != null) {
                z7 = z4;
                z5 = z3;
                z4 = z7;
            }
        }
        if (z5 && ((rv3Var = this.Q0) != null || !z4)) {
            if (rv3Var != null) {
                m1(rv3Var);
            }
            this.Q0 = null;
            w1();
        }
        vo5Var.p1(this.F0);
    }

    @Override // defpackage.ria
    public void E(hia hiaVar, iia iiaVar, long j) {
        long j2 = (((j << 32) >> 33) & 4294967295L) | ((j >> 33) << 32);
        this.U0 = (((long) Float.floatToRawIntBits((int) (j2 & 4294967295L))) & 4294967295L) | (Float.floatToRawIntBits((int) (j2 >> 32)) << 32);
        w1();
        if (this.K0) {
            if (this.O0 == null) {
                u66 u66Var = new u66(this);
                l1(u66Var);
                this.O0 = u66Var;
            }
            if (iiaVar == iia.b) {
                int i = hiaVar.f;
                if (i == 4) {
                    ynb.V(Z0(), null, null, new z0(this, null), 3);
                } else if (i == 5) {
                    ynb.V(Z0(), null, null, new a1(this, null), 3);
                }
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0077 A[RETURN] */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$PrimitiveArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @Override // defpackage.qo7
    public final boolean M(KeyEvent keyEvent) {
        boolean z;
        w1();
        long jQ = nk8.q(keyEvent);
        boolean z2 = this.K0;
        y69 y69Var = this.T0;
        if (z2 && nk8.r(keyEvent) == 2 && b.f(keyEvent)) {
            if (y69Var.b(jQ)) {
                z = false;
            } else {
                pta ptaVar = new pta(this.U0);
                y69Var.i(jQ, ptaVar);
                if (this.F0 != null) {
                    ynb.V(Z0(), null, null, new x0(this, ptaVar, null), 3);
                }
                z = true;
            }
            if (y1(keyEvent) || z) {
                return true;
            }
            return false;
        }
        if (this.K0 && nk8.r(keyEvent) == 1 && b.f(keyEvent)) {
            pta ptaVar2 = (pta) y69Var.g(jQ);
            if (ptaVar2 != null) {
                if (this.F0 != null) {
                    ynb.V(Z0(), null, null, new y0(this, ptaVar2, null), 3);
                }
                z1(keyEvent);
            }
            if (ptaVar2 != null) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.wwc
    public final void R0(hxc hxcVar) {
        i5c i5cVar = this.J0;
        if (i5cVar != null) {
            exc.m(hxcVar, i5cVar.a);
        }
        String str = this.I0;
        k0 k0Var = new k0(this, 1);
        wn7[] wn7VarArr = exc.a;
        hxcVar.c(swc.b, new f6(str, k0Var));
        if (this.K0) {
            this.M0.R0(hxcVar);
        } else {
            hxcVar.c(cxc.j, wef.a);
        }
        o1(hxcVar);
    }

    @Override // defpackage.wwc
    public final boolean S0() {
        return true;
    }

    @Override // defpackage.t66
    public final String Y() {
        return this.P0;
    }

    @Override // defpackage.i09
    public final boolean a1() {
        return false;
    }

    @Override // defpackage.i09
    public final void d1() {
        A0();
        if (!this.X0) {
            w1();
        }
        if (this.K0) {
            l1(this.M0);
        }
    }

    @Override // defpackage.i09
    public final void e1() {
        q1();
        if (this.W0 == null) {
            this.F0 = null;
        }
        rv3 rv3Var = this.Q0;
        if (rv3Var != null) {
            m1(rv3Var);
        }
        this.Q0 = null;
        u66 u66Var = this.O0;
        if (u66Var != null) {
            m1(u66Var);
        }
        this.O0 = null;
    }

    @Override // defpackage.qo7
    public final boolean l(KeyEvent keyEvent) {
        return false;
    }

    public final boolean p1() {
        mmb mmbVar = new mmb();
        n3d.s(this, u66.E0, new hy0(new up(mmbVar, 2), 10));
        if (mmbVar.element != null) {
            return true;
        }
        int i = v42.b;
        ViewParent parent = kj0.x0(this).getParent();
        while (parent != null && (parent instanceof ViewGroup)) {
            ViewGroup viewGroup = (ViewGroup) parent;
            if (viewGroup.shouldDelayChildPressedState()) {
                return true;
            }
            parent = viewGroup.getParent();
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:25:0x007d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:26:0x007f A[LOOP:0: B:16:0x0040->B:26:0x007f, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:30:0x0082 A[EDGE_INSN: B:30:0x0082->B:27:0x0082 BREAK  A[LOOP:0: B:16:0x0040->B:26:0x007f], SYNTHETIC] */
    public final void q1() {
        t69 t69Var = this.F0;
        y69 y69Var = this.T0;
        if (t69Var != null) {
            pta ptaVar = this.R0;
            if (ptaVar != null) {
                ((u69) t69Var).b(new ota(ptaVar));
            }
            pta ptaVar2 = this.V0;
            if (ptaVar2 != null) {
                ((u69) t69Var).b(new ota(ptaVar2));
            }
            yq6 yq6Var = this.S0;
            if (yq6Var != null) {
                ((u69) t69Var).b(new zq6(yq6Var));
            }
            Object[] objArr = y69Var.c;
            long[] jArr = y69Var.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    long j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) == -9187201950435737472L) {
                        if (i != length) {
                            break;
                            break;
                        }
                        i++;
                    } else {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j) < 128) {
                                ((u69) t69Var).b(new ota((pta) objArr[(i << 3) + i3]));
                            }
                            j >>= 8;
                        }
                        if (i2 != 8) {
                            break;
                        } else if (i != length) {
                            break;
                        } else {
                            i++;
                        }
                    }
                }
            }
        }
        this.R0 = null;
        this.V0 = null;
        this.S0 = null;
        y69Var.a();
    }

    public final long r1(long j) {
        long jN0 = vd0.s0(this).O0.N0(((rvf) eb3.H(this, zg2.t)).d());
        float fMax = Math.max(0.0f, Float.intBitsToFloat((int) (jN0 >> 32)) - ((int) (j >> 32))) / 2.0f;
        return (((long) Float.floatToRawIntBits(Math.max(0.0f, Float.intBitsToFloat((int) (jN0 & 4294967295L)) - ((int) (j & 4294967295L))) / 2.0f)) & 4294967295L) | (Float.floatToRawIntBits(fMax) << 32);
    }

    public final void s1(boolean z) {
        t69 t69Var = this.F0;
        if (t69Var != null) {
            lyd lydVar = this.Y0;
            if (lydVar == null || !lydVar.b()) {
                pta ptaVar = z ? this.V0 : this.R0;
                if (ptaVar != null) {
                    ota otaVar = new ota(ptaVar);
                    dg7 dg7Var = (dg7) ((qn2) Z0()).a.F0(ndb.Y0);
                    ynb.V(Z0(), null, null, new o0(t69Var, otaVar, dg7Var != null ? dg7Var.E(new l0(0, t69Var, otaVar)) : null, null), 3);
                }
            } else {
                lyd lydVar2 = this.Y0;
                if (lydVar2 != null) {
                    lydVar2.h(null);
                }
            }
            if (z) {
                this.V0 = null;
            } else {
                this.R0 = null;
            }
        }
    }

    public final void t1(long j, boolean z) {
        t69 t69Var = this.F0;
        if (t69Var != null) {
            lyd lydVar = this.Y0;
            if (lydVar == null || !lydVar.b()) {
                pta ptaVar = z ? this.V0 : this.R0;
                if (ptaVar != null) {
                    ynb.V(Z0(), null, null, new q0(null, t69Var, ptaVar), 3);
                }
            } else {
                lydVar.h(null);
                ynb.V(Z0(), null, null, new p0(lydVar, j, t69Var, null), 3);
            }
            if (z) {
                this.V0 = null;
            } else {
                this.R0 = null;
            }
        }
    }

    public final void u1(z17 z17Var) {
        t69 t69Var = this.F0;
        if (t69Var != null) {
            pta ptaVar = new pta(z17Var.c);
            if (p1()) {
                this.Y0 = ynb.V(Z0(), null, null, new r0(t69Var, ptaVar, this, null), 3);
            } else {
                this.V0 = ptaVar;
                ynb.V(Z0(), null, null, new s0(null, t69Var, ptaVar), 3);
            }
        }
    }

    public final void v1(oia oiaVar) {
        t69 t69Var = this.F0;
        if (t69Var != null) {
            pta ptaVar = new pta(oiaVar.c);
            if (p1()) {
                this.Y0 = ynb.V(Z0(), null, null, new t0(t69Var, ptaVar, this, null), 3);
            } else {
                this.R0 = ptaVar;
                ynb.V(Z0(), null, null, new u0(null, t69Var, ptaVar), 3);
            }
        }
    }

    public final void w1() {
        if (this.Q0 != null) {
            return;
        }
        r17 r17Var = this.H0 ? this.N0 : this.G0;
        if (r17Var != null) {
            t69 u69Var = this.F0;
            if (u69Var == null) {
                u69Var = new u69();
                this.F0 = u69Var;
            }
            this.M0.p1(u69Var);
            t69 t69Var = this.F0;
            t69Var.getClass();
            rv3 rv3VarA = r17Var.a(t69Var);
            l1(rv3VarA);
            this.Q0 = rv3VarA;
        }
    }

    public abstract boolean y1(KeyEvent keyEvent);

    public abstract void z1(KeyEvent keyEvent);

    public void x1() {
    }

    public void o1(hxc hxcVar) {
    }
}
