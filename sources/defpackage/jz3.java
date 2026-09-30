package defpackage;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class jz3 implements lz3 {
    public static final jz3 c;
    public static final jz3 d;
    public static final jz3 e;
    public final mz3 a;
    public final ace b = new ace(new j5(15, this));

    static {
        mz3 mz3Var = new mz3();
        xu4 xu4Var = xu4.a;
        mz3Var.b(xu4Var);
        mz3Var.a = true;
        new jz3(mz3Var);
        mz3 mz3Var2 = new mz3();
        mz3Var2.c(false);
        mz3Var2.a = true;
        new jz3(mz3Var2);
        mz3 mz3Var3 = new mz3();
        mz3Var3.c(false);
        mz3Var3.b(xu4Var);
        mz3Var3.a = true;
        new jz3(mz3Var3);
        mz3 mz3Var4 = new mz3();
        mz3Var4.c(false);
        mz3Var4.b(xu4Var);
        mz3Var4.e(true);
        mz3Var4.a = true;
        new jz3(mz3Var4);
        mz3 mz3Var5 = new mz3();
        mz3Var5.b(xu4Var);
        a32 a32Var = a32.c;
        mz3Var5.j(a32Var);
        kz9 kz9Var = kz9.b;
        mz3Var5.i(kz9Var);
        mz3Var5.a = true;
        new jz3(mz3Var5);
        mz3 mz3Var6 = new mz3();
        mz3Var6.c(false);
        mz3Var6.b(xu4Var);
        mz3Var6.j(a32Var);
        mz3Var6.k(true);
        mz3Var6.i(kz9.c);
        mz3Var6.h(true);
        mz3Var6.g(true);
        mz3Var6.e(true);
        mz3Var6.a(true);
        mz3Var6.a = true;
        new jz3(mz3Var6);
        mz3 mz3Var7 = new mz3();
        mz3Var7.b(kz3.a);
        mz3Var7.a = true;
        c = new jz3(mz3Var7);
        mz3 mz3Var8 = new mz3();
        mz3Var8.b(kz3.b);
        mz3Var8.a = true;
        new jz3(mz3Var8);
        mz3 mz3Var9 = new mz3();
        mz3Var9.j(a32Var);
        mz3Var9.i(kz9Var);
        mz3Var9.a = true;
        d = new jz3(mz3Var9);
        mz3 mz3Var10 = new mz3();
        mz3Var10.f(true);
        mz3Var10.j(a32.b);
        mz3Var10.b(kz3.b);
        mz3Var10.a = true;
        e = new jz3(mz3Var10);
        mz3 mz3Var11 = new mz3();
        mz3Var11.d(irb.b);
        mz3Var11.b(kz3.b);
        mz3Var11.a = true;
        new jz3(mz3Var11);
    }

    public jz3(mz3 mz3Var) {
        this.a = mz3Var;
    }

    public static void O(StringBuilder sb) {
        int length = sb.length();
        if (length == 0 || sb.charAt(length - 1) != ' ') {
            sb.append(' ');
        }
    }

    public static boolean a0(tt7 tt7Var) {
        if (!oa7.S(tt7Var)) {
            return false;
        }
        List listZ = tt7Var.Z();
        if (listZ != null && listZ.isEmpty()) {
            return true;
        }
        Iterator it = listZ.iterator();
        while (it.hasNext()) {
            if (((i8f) it.next()).c()) {
                return false;
            }
        }
        return true;
    }

    public static e09 m(tq8 tq8Var) {
        boolean z = tq8Var instanceof u09;
        e09 e09Var = e09.e;
        l22 l22Var = l22.INTERFACE;
        e09 e09Var2 = e09.b;
        if (z) {
            return ((u09) tq8Var).E() == l22Var ? e09Var : e09Var2;
        }
        bm3 bm3VarK = tq8Var.k();
        u09 u09Var = bm3VarK instanceof u09 ? (u09) bm3VarK : null;
        if (u09Var == null || !(tq8Var instanceof ea1)) {
            return e09Var2;
        }
        ea1 ea1Var = (ea1) tq8Var;
        Collection collectionL = ea1Var.l();
        collectionL.getClass();
        boolean zIsEmpty = collectionL.isEmpty();
        e09 e09Var3 = e09.d;
        if (!zIsEmpty && u09Var.i() != e09Var2) {
            return e09Var3;
        }
        if (u09Var.E() != l22Var || pa7.t(ea1Var.getVisibility(), sz3.a)) {
            return e09Var2;
        }
        return ea1Var.i() == e09Var ? e09Var : e09Var3;
    }

    public final void A(ea1 ea1Var, StringBuilder sb) {
        String str;
        mz3 mz3Var = this.a;
        if (mz3Var.u().contains(kz3.v) && mz3Var.D() && ea1Var.g() != 1) {
            sb.append("/*");
            int iG = ea1Var.g();
            if (iG == 1) {
                str = "DECLARATION";
            } else if (iG == 2) {
                str = "FAKE_OVERRIDE";
            } else if (iG == 3) {
                str = "DELEGATION";
            } else {
                if (iG != 4) {
                    throw null;
                }
                str = "SYNTHESIZED";
            }
            sb.append(ym8.Q(str));
            sb.append("*/ ");
        }
    }

    public final void B(tq8 tq8Var, StringBuilder sb) {
        E(sb, tq8Var.isExternal(), "external");
        mz3 mz3Var = this.a;
        boolean z = false;
        E(sb, mz3Var.u().contains(kz3.y) && tq8Var.w(), "expect");
        if (mz3Var.u().contains(kz3.z) && tq8Var.e0()) {
            z = true;
        }
        E(sb, z, "actual");
    }

    public final void C(e09 e09Var, StringBuilder sb, e09 e09Var2) {
        mz3 mz3Var = this.a;
        a90 a90Var = mz3Var.p;
        wn7 wn7Var = mz3.Z[14];
        a90Var.getClass();
        wn7Var.getClass();
        if (((Boolean) a90Var.b).booleanValue() || e09Var != e09Var2) {
            E(sb, mz3Var.u().contains(kz3.d), ym8.Q(e09Var.name()));
        }
    }

    public final void D(ea1 ea1Var, StringBuilder sb) {
        if (oz3.q(ea1Var) && ea1Var.i() == e09.b) {
            return;
        }
        if (this.a.v() == gu9.a && ea1Var.i() == e09.d && !ea1Var.l().isEmpty()) {
            return;
        }
        e09 e09VarI = ea1Var.i();
        e09VarI.getClass();
        C(e09VarI, sb, m(ea1Var));
    }

    public final void E(StringBuilder sb, boolean z, String str) {
        if (z) {
            sb.append(z(str));
            sb.append(" ");
        }
    }

    public final String F(t99 t99Var, boolean z) {
        String strL = l(rxg.Q(t99Var));
        mz3 mz3Var = this.a;
        return (mz3Var.n() && mz3Var.B() == irb.b && z) ? ib8.j("<b>", strL, "</b>") : strL;
    }

    public final void G(bm3 bm3Var, StringBuilder sb, boolean z) {
        t99 name = bm3Var.getName();
        name.getClass();
        sb.append(F(name, z));
    }

    public final void H(StringBuilder sb, tt7 tt7Var) throws IOException {
        jgf jgfVarK0 = tt7Var.k0();
        j jVar = jgfVarK0 instanceof j ? (j) jgfVarK0 : null;
        if (jVar == null) {
            I(sb, tt7Var);
            return;
        }
        tjd tjdVar = jVar.c;
        tjd tjdVar2 = jVar.b;
        mz3 mz3Var = this.a;
        a90 a90Var = mz3Var.R;
        wn7[] wn7VarArr = mz3.Z;
        wn7 wn7Var = wn7VarArr[42];
        a90Var.getClass();
        wn7Var.getClass();
        boolean zBooleanValue = ((Boolean) a90Var.b).booleanValue();
        grb grbVar = irb.b;
        if (zBooleanValue) {
            I(sb, tjdVar2);
            a90 a90Var2 = mz3Var.S;
            wn7 wn7Var2 = wn7VarArr[43];
            a90Var2.getClass();
            wn7Var2.getClass();
            if (((Boolean) a90Var2.b).booleanValue()) {
                if (mz3Var.B() == grbVar) {
                    sb.append("<font color=\"808080\"><i>");
                }
                sb.append(" /* ");
                sb.append("from: ");
                I(sb, tjdVar);
                sb.append(" */");
                if (mz3Var.B() == grbVar) {
                    sb.append("</i></font>");
                    return;
                }
                return;
            }
            return;
        }
        I(sb, tjdVar);
        a90 a90Var3 = mz3Var.Q;
        wn7 wn7Var3 = wn7VarArr[41];
        a90Var3.getClass();
        wn7Var3.getClass();
        if (((Boolean) a90Var3.b).booleanValue()) {
            if (mz3Var.B() == grbVar) {
                sb.append("<font color=\"808080\"><i>");
            }
            sb.append(" /* ");
            sb.append("= ");
            I(sb, tjdVar2);
            sb.append(" */");
            if (mz3Var.B() == grbVar) {
                sb.append("</i></font>");
            }
        }
    }

    public final void I(StringBuilder sb, tt7 tt7Var) throws IOException {
        t99 t99VarK;
        String strL;
        mz3 mz3Var = this.a;
        if ((tt7Var instanceof c28) && mz3Var.p()) {
            ee8 ee8Var = ((c28) tt7Var).d;
            if (ee8Var.c == fe8.a || ee8Var.c == fe8.b) {
                sb.append("<Not computed yet>");
                return;
            }
        }
        jgf jgfVarK0 = tt7Var.k0();
        if (jgfVarK0 instanceof bj5) {
            sb.append(((bj5) jgfVarK0).p0(this, this));
            return;
        }
        if (!(jgfVarK0 instanceof tjd)) {
            ap.c();
            return;
        }
        tjd tjdVar = (tjd) jgfVarK0;
        if (tjdVar.equals(w8f.b) || tjdVar.c0() == w8f.a.b) {
            sb.append("???");
            return;
        }
        j7f j7fVarC0 = tjdVar.c0();
        int i = 0;
        if ((j7fVarC0 instanceof py4) && ((py4) j7fVarC0).a == qy4.v) {
            a90 a90Var = mz3Var.t;
            wn7 wn7Var = mz3.Z[18];
            a90Var.getClass();
            wn7Var.getClass();
            if (!((Boolean) a90Var.b).booleanValue()) {
                sb.append("???");
                return;
            }
            j7f j7fVarC1 = tjdVar.c0();
            j7fVarC1.getClass();
            sb.append(v(((py4) j7fVarC1).b[0]));
            return;
        }
        if (i7h.x(tjdVar)) {
            u(sb, tjdVar);
            return;
        }
        if (!a0(tjdVar)) {
            u(sb, tjdVar);
            return;
        }
        int length = sb.length();
        ((jz3) this.b.getValue()).p(sb, tjdVar, null);
        boolean z = sb.length() != length;
        tt7 tt7VarN = oa7.N(tjdVar);
        List listL = oa7.L(tjdVar);
        boolean zV = oa7.V(tjdVar);
        boolean zI0 = tjdVar.i0();
        boolean z2 = zI0 || (z && tt7VarN != null);
        if (z2) {
            if (zV) {
                sb.insert(length, '(');
            } else {
                if (z) {
                    tq.G(v4e.R(sb));
                    if (sb.charAt(sb.length() - 2) != ')') {
                        sb.insert(sb.length() - 1, "()");
                    }
                }
                sb.append("(");
            }
        }
        E(sb, zV, "suspend");
        if (!listL.isEmpty()) {
            sb.append("context(");
            Iterator it = listL.subList(0, listL.size() - 1).iterator();
            while (it.hasNext()) {
                H(sb, (tt7) it.next());
                sb.append(", ");
            }
            H(sb, (tt7) s72.F0(listL));
            sb.append(") ");
        }
        if (tt7VarN != null) {
            boolean z3 = (a0(tt7VarN) && !tt7VarN.i0()) || oa7.V(tt7VarN) || !tt7VarN.getAnnotations().isEmpty() || (tt7VarN instanceof kv3);
            if (z3) {
                sb.append("(");
            }
            H(sb, tt7VarN);
            if (z3) {
                sb.append(")");
            }
            sb.append(".");
        }
        sb.append("(");
        if (!oa7.S(tjdVar) || tjdVar.getAnnotations().R(syd.p) == null || tjdVar.Z().size() > 1) {
            int i2 = 0;
            for (i8f i8fVar : oa7.P(tjdVar)) {
                int i3 = i2 + 1;
                if (i2 > 0) {
                    sb.append(", ");
                }
                a90 a90Var2 = mz3Var.U;
                wn7 wn7Var2 = mz3.Z[45];
                a90Var2.getClass();
                wn7Var2.getClass();
                if (((Boolean) a90Var2.b).booleanValue()) {
                    tt7 tt7VarB = i8fVar.b();
                    tt7VarB.getClass();
                    t99VarK = oa7.K(tt7VarB);
                } else {
                    t99VarK = null;
                }
                if (t99VarK != null) {
                    sb.append(F(t99VarK, false));
                    sb.append(": ");
                }
                i8fVar.getClass();
                StringBuilder sb2 = new StringBuilder();
                s72.C0(t72.H(i8fVar), sb2, ", ", null, null, new iz3(this, i), 60);
                sb.append(sb2.toString());
                i2 = i3;
            }
        } else {
            sb.append("???");
        }
        sb.append(") ");
        int iOrdinal = mz3Var.B().ordinal();
        if (iOrdinal == 0) {
            strL = l("->");
        } else {
            if (iOrdinal != 1) {
                ap.c();
                return;
            }
            strL = "&rarr;";
        }
        sb.append(strL);
        sb.append(" ");
        oa7.S(tjdVar);
        tt7 tt7VarB2 = ((i8f) s72.F0(tjdVar.Z())).b();
        tt7VarB2.getClass();
        H(sb, tt7VarB2);
        if (z2) {
            sb.append(")");
        }
        if (zI0) {
            sb.append("?");
        }
    }

    public final void J(ea1 ea1Var, StringBuilder sb) {
        mz3 mz3Var = this.a;
        if (!mz3Var.u().contains(kz3.e) || ea1Var.l().isEmpty() || mz3Var.v() == gu9.b) {
            return;
        }
        E(sb, true, "override");
        if (mz3Var.D()) {
            sb.append("/*");
            sb.append(ea1Var.l().size());
            sb.append("*/ ");
        }
    }

    public final void K(StringBuilder sb, gg7 gg7Var) {
        gg7 gg7Var2 = (gg7) gg7Var.d;
        z22 z22Var = (z22) gg7Var.b;
        if (gg7Var2 != null) {
            K(sb, gg7Var2);
            sb.append('.');
            t99 name = z22Var.getName();
            name.getClass();
            sb.append(F(name, false));
        } else {
            j7f j7fVarH = z22Var.h();
            j7fVarH.getClass();
            sb.append(R(j7fVarH));
        }
        sb.append(Q((List) gg7Var.c));
    }

    public final void L(wxa wxaVar, StringBuilder sb) {
        mz3 mz3Var = this.a;
        if (!mz3Var.A()) {
            if (!mz3Var.z()) {
                List listT = wxaVar.T();
                listT.getClass();
                t(sb, listT);
                if (mz3Var.u().contains(kz3.f)) {
                    p(sb, wxaVar, null);
                    sc5 sc5VarR = wxaVar.R();
                    if (sc5VarR != null) {
                        p(sb, sc5VarR, c10.FIELD);
                    }
                    sc5 sc5VarP = wxaVar.P();
                    if (sc5VarP != null) {
                        p(sb, sc5VarP, c10.PROPERTY_DELEGATE_FIELD);
                    }
                    if (mz3Var.w() == vxa.b) {
                        zxa zxaVarB = wxaVar.b();
                        if (zxaVarB != null) {
                            p(sb, zxaVarB, c10.PROPERTY_GETTER);
                        }
                        dya dyaVarC = wxaVar.c();
                        if (dyaVarC != null) {
                            p(sb, dyaVarC, c10.PROPERTY_SETTER);
                            List listG = dyaVarC.G();
                            listG.getClass();
                            xrf xrfVar = (xrf) s72.X0(listG);
                            xrfVar.getClass();
                            p(sb, xrfVar, c10.SETTER_PARAMETER);
                        }
                    }
                }
                rz3 visibility = wxaVar.getVisibility();
                visibility.getClass();
                Y(visibility, sb);
                E(sb, mz3Var.u().contains(kz3.X) && wxaVar.q(), "const");
                B(wxaVar, sb);
                D(wxaVar, sb);
                J(wxaVar, sb);
                E(sb, mz3Var.u().contains(kz3.Y) && wxaVar.U(), "lateinit");
                A(wxaVar, sb);
            }
            V(wxaVar, sb, false);
            List typeParameters = wxaVar.getTypeParameters();
            typeParameters.getClass();
            U(sb, typeParameters, true);
            M(wxaVar, sb);
        }
        G(wxaVar, sb, true);
        sb.append(": ");
        tt7 type = wxaVar.getType();
        type.getClass();
        sb.append(P(type));
        N(wxaVar, sb);
        y(wxaVar, sb);
        List typeParameters2 = wxaVar.getTypeParameters();
        typeParameters2.getClass();
        Z(sb, typeParameters2);
    }

    public final void M(ca1 ca1Var, StringBuilder sb) {
        nw7 nw7VarO = ca1Var.O();
        if (nw7VarO != null) {
            p(sb, nw7VarO, c10.RECEIVER);
            tt7 type = nw7VarO.getType();
            type.getClass();
            sb.append(x(type, false));
            sb.append(".");
        }
    }

    public final void N(ca1 ca1Var, StringBuilder sb) {
        nw7 nw7VarO;
        a90 a90Var = this.a.F;
        wn7 wn7Var = mz3.Z[30];
        a90Var.getClass();
        wn7Var.getClass();
        if (((Boolean) a90Var.b).booleanValue() && (nw7VarO = ca1Var.O()) != null) {
            sb.append(" on ");
            tt7 type = nw7VarO.getType();
            type.getClass();
            sb.append(P(type));
        }
    }

    public final String P(tt7 tt7Var) {
        tt7Var.getClass();
        StringBuilder sb = new StringBuilder();
        a90 a90Var = this.a.y;
        wn7 wn7Var = mz3.Z[23];
        a90Var.getClass();
        wn7Var.getClass();
        H(sb, (tt7) ((a26) a90Var.b).d(tt7Var));
        return sb.toString();
    }

    public final String Q(List list) throws IOException {
        list.getClass();
        if (list.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(l("<"));
        s72.C0(list, sb, ", ", null, null, new iz3(this, 0), 60);
        sb.append(l(">"));
        return sb.toString();
    }

    public final String R(j7f j7fVar) {
        j7fVar.getClass();
        y22 y22VarM = j7fVar.m();
        if ((y22VarM instanceof c8f) || (y22VarM instanceof u09) || (y22VarM instanceof s04)) {
            y22VarM.getClass();
            return sy4.f(y22VarM) ? y22VarM.h().toString() : this.a.o().b(y22VarM, this);
        }
        if (y22VarM == null) {
            return j7fVar instanceof ca7 ? ((ca7) j7fVar).b(z03.e) : j7fVar.toString();
        }
        cva.k(y22VarM.getClass(), "Unexpected classifier: ");
        return null;
    }

    public final void S(c8f c8fVar, StringBuilder sb, boolean z) {
        if (z) {
            sb.append(l("<"));
        }
        if (this.a.D()) {
            sb.append("/*");
            sb.append(c8fVar.getIndex());
            sb.append("*/ ");
        }
        E(sb, c8fVar.s(), "reified");
        String strB = c8fVar.x().b();
        boolean z2 = true;
        E(sb, strB.length() > 0, strB);
        p(sb, c8fVar, null);
        G(c8fVar, sb, z);
        int size = c8fVar.getUpperBounds().size();
        if ((size > 1 && !z) || size == 1) {
            tt7 tt7Var = (tt7) c8fVar.getUpperBounds().iterator().next();
            if (tt7Var == null) {
                xr7.a(141);
                throw null;
            }
            if (!xr7.y(tt7Var) || !tt7Var.i0()) {
                sb.append(" : ");
                sb.append(P(tt7Var));
            }
        } else if (z) {
            for (tt7 tt7Var2 : c8fVar.getUpperBounds()) {
                if (tt7Var2 == null) {
                    xr7.a(141);
                    throw null;
                }
                if (!xr7.y(tt7Var2) || !tt7Var2.i0()) {
                    if (z2) {
                        sb.append(" : ");
                    } else {
                        sb.append(" & ");
                    }
                    sb.append(P(tt7Var2));
                    z2 = false;
                }
            }
        }
        if (z) {
            sb.append(l(">"));
        }
    }

    public final void T(StringBuilder sb, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            S((c8f) it.next(), sb, false);
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
    }

    public final void U(StringBuilder sb, List list, boolean z) {
        if (this.a.E() || list.isEmpty()) {
            return;
        }
        sb.append(l("<"));
        T(sb, list);
        sb.append(l(">"));
        if (z) {
            sb.append(" ");
        }
    }

    public final void V(bsf bsfVar, StringBuilder sb, boolean z) {
        if (z || !(bsfVar instanceof xrf)) {
            sb.append(z(bsfVar.N() ? "var" : "val"));
            sb.append(" ");
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0066  */
    public final void W(xrf xrfVar, boolean z, StringBuilder sb, boolean z2) {
        boolean z3;
        if (z2) {
            sb.append(z("value-parameter"));
            sb.append(" ");
        }
        mz3 mz3Var = this.a;
        if (mz3Var.D()) {
            sb.append("/*");
            sb.append(xrfVar.g);
            sb.append("*/ ");
        }
        p(sb, xrfVar, null);
        E(sb, xrfVar.w, "crossinline");
        E(sb, xrfVar.x, "noinline");
        a90 a90Var = mz3Var.r;
        wn7[] wn7VarArr = mz3.Z;
        wn7 wn7Var = wn7VarArr[16];
        a90Var.getClass();
        wn7Var.getClass();
        if (((Boolean) a90Var.b).booleanValue()) {
            ca1 ca1VarF0 = xrfVar.k();
            z12 z12Var = ca1VarF0 instanceof z12 ? (z12) ca1VarF0 : null;
            if (z12Var == null || !z12Var.T0) {
                z3 = false;
            } else {
                z3 = true;
            }
        } else {
            z3 = false;
        }
        if (z3) {
            a90 a90Var2 = mz3Var.s;
            wn7 wn7Var2 = wn7VarArr[17];
            a90Var2.getClass();
            wn7Var2.getClass();
            E(sb, ((Boolean) a90Var2.b).booleanValue(), "actual");
        }
        tt7 type = xrfVar.getType();
        type.getClass();
        tt7 tt7Var = xrfVar.y;
        tt7 tt7Var2 = tt7Var == null ? type : tt7Var;
        E(sb, tt7Var != null, "vararg");
        if (z3 || (z2 && !mz3Var.A())) {
            V(xrfVar, sb, z3);
        }
        if (z) {
            G(xrfVar, sb, z2);
            sb.append(": ");
        }
        sb.append(P(tt7Var2));
        y(xrfVar, sb);
        if (mz3Var.D() && tt7Var != null) {
            sb.append(" /*");
            sb.append(P(type));
            sb.append("*/");
        }
        if (mz3Var.q() != null) {
            if (mz3Var.p() ? xrfVar.E0() : qz3.a(xrfVar)) {
                StringBuilder sb2 = new StringBuilder(" = ");
                a26 a26VarQ = mz3Var.q();
                a26VarQ.getClass();
                sb2.append((String) a26VarQ.d(xrfVar));
                sb.append(sb2.toString());
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0029  */
    public final void X(StringBuilder sb, List list, boolean z) {
        boolean z2;
        mz3 mz3Var = this.a;
        a90 a90Var = mz3Var.E;
        wn7 wn7Var = mz3.Z[29];
        a90Var.getClass();
        wn7Var.getClass();
        int iOrdinal = ((kz9) a90Var.b).ordinal();
        if (iOrdinal == 0) {
            z2 = true;
        } else {
            if (iOrdinal != 1) {
                if (iOrdinal != 2) {
                    ap.c();
                    return;
                }
            } else if (!z) {
                z2 = true;
            }
            z2 = false;
        }
        int size = list.size();
        mz3Var.C().getClass();
        sb.append("(");
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            int i2 = i + 1;
            xrf xrfVar = (xrf) it.next();
            mz3Var.C().getClass();
            xrfVar.getClass();
            W(xrfVar, z2, sb, false);
            mz3Var.C().getClass();
            if (i != size - 1) {
                sb.append(", ");
            }
            i = i2;
        }
        mz3Var.C().getClass();
        sb.append(")");
    }

    public final boolean Y(rz3 rz3Var, StringBuilder sb) {
        mz3 mz3Var = this.a;
        if (!mz3Var.u().contains(kz3.c)) {
            return false;
        }
        a90 a90Var = mz3Var.n;
        wn7 wn7Var = mz3.Z[12];
        a90Var.getClass();
        wn7Var.getClass();
        if (((Boolean) a90Var.b).booleanValue()) {
            rz3Var = sz3.f(rz3Var.a.l());
        }
        if (!mz3Var.x() && pa7.t(rz3Var, sz3.j)) {
            return false;
        }
        sb.append(z(rz3Var.a.e()));
        sb.append(" ");
        return true;
    }

    public final void Z(StringBuilder sb, List list) {
        if (this.a.E()) {
            return;
        }
        ArrayList arrayList = new ArrayList(0);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            c8f c8fVar = (c8f) it.next();
            List upperBounds = c8fVar.getUpperBounds();
            upperBounds.getClass();
            for (tt7 tt7Var : s72.r0(upperBounds, 1)) {
                t99 name = c8fVar.getName();
                name.getClass();
                StringBuilder sb2 = new StringBuilder(F(name, false));
                sb2.append(" : ");
                tt7Var.getClass();
                sb2.append(P(tt7Var));
                arrayList.add(sb2.toString());
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        sb.append(" ");
        sb.append(z("where"));
        sb.append(" ");
        s72.C0(arrayList, sb, ", ", null, null, null, 124);
    }

    @Override // defpackage.lz3
    public final void a(boolean z) {
        this.a.a(true);
    }

    @Override // defpackage.lz3
    public final void b(Set set) {
        set.getClass();
        this.a.b(set);
    }

    @Override // defpackage.lz3
    public final void c(boolean z) {
        this.a.c(false);
    }

    @Override // defpackage.lz3
    public final void d(irb irbVar) {
        this.a.d(irbVar);
    }

    @Override // defpackage.lz3
    public final void e(boolean z) {
        this.a.e(true);
    }

    @Override // defpackage.lz3
    public final void f(boolean z) {
        this.a.f(true);
    }

    @Override // defpackage.lz3
    public final void g(boolean z) {
        this.a.g(true);
    }

    @Override // defpackage.lz3
    public final void h(boolean z) {
        this.a.h(true);
    }

    @Override // defpackage.lz3
    public final void i(kz9 kz9Var) {
        this.a.i(kz9Var);
    }

    @Override // defpackage.lz3
    public final void j(a32 a32Var) {
        this.a.j(a32Var);
    }

    @Override // defpackage.lz3
    public final void k(boolean z) {
        this.a.k(true);
    }

    public final String l(String str) {
        return this.a.B().a(str);
    }

    public final String n(bm3 bm3Var) {
        bm3 bm3VarK;
        String str;
        StringBuilder sb = new StringBuilder();
        bm3Var.D(new m6c(14, this), sb);
        mz3 mz3Var = this.a;
        a90 a90Var = mz3Var.c;
        wn7[] wn7VarArr = mz3.Z;
        wn7VarArr[1].getClass();
        if (((Boolean) a90Var.b).booleanValue() && !(bm3Var instanceof kw9) && !(bm3Var instanceof n18) && (bm3VarK = bm3Var.k()) != null && !(bm3VarK instanceof w09)) {
            sb.append(" ");
            int iOrdinal = mz3Var.B().ordinal();
            if (iOrdinal == 0) {
                str = "defined in";
            } else {
                if (iOrdinal != 1) {
                    ap.c();
                    return null;
                }
                str = "<i>defined in</i>";
            }
            sb.append(str);
            sb.append(" ");
            ex5 ex5VarF = oz3.f(bm3VarK);
            ex5VarF.getClass();
            sb.append(ex5VarF.c() ? "root package" : l(jrb.l(ex5.f(ex5VarF))));
            a90 a90Var2 = mz3Var.d;
            wn7VarArr[2].getClass();
            if (((Boolean) a90Var2.b).booleanValue() && (bm3VarK instanceof kw9) && (bm3Var instanceof dm3)) {
                ((dm3) bm3Var).e().getClass();
            }
        }
        return sb.toString();
    }

    public final String o(u00 u00Var, c10 c10Var) throws IOException {
        z12 z12VarM0;
        List listG;
        u00Var.getClass();
        StringBuilder sb = new StringBuilder();
        sb.append('@');
        if (c10Var != null) {
            sb.append(c10Var.a() + ':');
        }
        tt7 type = u00Var.getType();
        sb.append(P(type));
        mz3 mz3Var = this.a;
        if (mz3Var.m().a()) {
            Map mapG = u00Var.g();
            a90 a90Var = mz3Var.I;
            wn7 wn7Var = mz3.Z[33];
            a90Var.getClass();
            wn7Var.getClass();
            List list = null;
            u09 u09VarD = ((Boolean) a90Var.b).booleanValue() ? qz3.d(u00Var) : null;
            if (u09VarD != null && (z12VarM0 = u09VarD.m0()) != null && (listG = z12VarM0.G()) != null) {
                ArrayList arrayList = new ArrayList();
                for (Object obj : listG) {
                    if (((xrf) obj).E0()) {
                        arrayList.add(obj);
                    }
                }
                ArrayList arrayList2 = new ArrayList(t72.u(arrayList, 10));
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((xrf) it.next()).getName());
                }
                list = arrayList2;
            }
            if (list == null) {
                list = pu4.a;
            }
            ArrayList arrayList3 = new ArrayList();
            for (Object obj2 : list) {
                if (!mapG.containsKey((t99) obj2)) {
                    arrayList3.add(obj2);
                }
            }
            ArrayList arrayList4 = new ArrayList(t72.u(arrayList3, 10));
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                arrayList4.add(((t99) it2.next()).b() + " = ...");
            }
            Set<Map.Entry> setEntrySet = mapG.entrySet();
            ArrayList arrayList5 = new ArrayList(t72.u(setEntrySet, 10));
            for (Map.Entry entry : setEntrySet) {
                t99 t99Var = (t99) entry.getKey();
                bl2 bl2Var = (bl2) entry.getValue();
                StringBuilder sb2 = new StringBuilder();
                sb2.append(t99Var.b());
                sb2.append(" = ");
                sb2.append(!list.contains(t99Var) ? s(bl2Var) : "...");
                arrayList5.add(sb2.toString());
            }
            List listA1 = s72.a1(s72.Q0(arrayList4, arrayList5));
            if (mz3Var.m().b() || !listA1.isEmpty()) {
                s72.C0(listA1, sb, ", ", "(", ")", null, 112);
            }
        }
        if (mz3Var.D() && (i7h.x(type) || (type.c0().m() instanceof vg9))) {
            sb.append(" /* annotation class not found */");
        }
        return sb.toString();
    }

    public final void p(StringBuilder sb, f00 f00Var, c10 c10Var) {
        Set setS;
        mz3 mz3Var = this.a;
        if (mz3Var.u().contains(kz3.f)) {
            if (f00Var instanceof tt7) {
                setS = mz3Var.s();
            } else {
                a90 a90Var = mz3Var.K;
                wn7 wn7Var = mz3.Z[35];
                a90Var.getClass();
                wn7Var.getClass();
                setS = (Set) a90Var.b;
            }
            a90 a90Var2 = mz3Var.M;
            wn7 wn7Var2 = mz3.Z[37];
            a90Var2.getClass();
            wn7Var2.getClass();
            a26 a26Var = (a26) a90Var2.b;
            for (u00 u00Var : f00Var.getAnnotations()) {
                if (!s72.o0(setS, u00Var.f()) && !pa7.t(u00Var.f(), syd.r) && (a26Var == null || ((Boolean) a26Var.d(u00Var)).booleanValue())) {
                    sb.append(o(u00Var, c10Var));
                    a90 a90Var3 = mz3Var.J;
                    wn7 wn7Var3 = mz3.Z[34];
                    a90Var3.getClass();
                    wn7Var3.getClass();
                    if (((Boolean) a90Var3.b).booleanValue()) {
                        sb.append('\n');
                    } else {
                        sb.append(" ");
                    }
                }
            }
        }
    }

    public final void r(z22 z22Var, StringBuilder sb) {
        List listH0 = z22Var.h0();
        listH0.getClass();
        List parameters = z22Var.h().getParameters();
        parameters.getClass();
        if (this.a.D() && z22Var.j() && parameters.size() > listH0.size()) {
            sb.append(" /*captured type parameters: ");
            T(sb, parameters.subList(listH0.size(), parameters.size()));
            sb.append("*/");
        }
    }

    public final String s(bl2 bl2Var) {
        a90 a90Var = this.a.v;
        wn7 wn7Var = mz3.Z[20];
        a90Var.getClass();
        wn7Var.getClass();
        a26 a26Var = (a26) a90Var.b;
        if (a26Var != null) {
            return (String) a26Var.d(bl2Var);
        }
        if (bl2Var instanceof pd0) {
            Iterable iterable = (Iterable) ((pd0) bl2Var).a;
            ArrayList arrayList = new ArrayList();
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                String strS = s((bl2) it.next());
                if (strS != null) {
                    arrayList.add(strS);
                }
            }
            return s72.D0(arrayList, ", ", "{", "}", null, 56);
        }
        if (bl2Var instanceof f10) {
            return v4e.Y("@", o((u00) ((f10) bl2Var).a, null));
        }
        if (!(bl2Var instanceof rm7)) {
            return bl2Var.toString();
        }
        qm7 qm7Var = (qm7) ((rm7) bl2Var).a;
        if (qm7Var instanceof om7) {
            return ((om7) qm7Var).a + "::class";
        }
        if (!(qm7Var instanceof pm7)) {
            ap.c();
            return null;
        }
        m22 m22Var = ((pm7) qm7Var).a;
        String strG = m22Var.a.a().a.a;
        int i = m22Var.b;
        for (int i2 = 0; i2 < i; i2++) {
            strG = ks0.g('>', "kotlin.Array<", strG);
        }
        return tec.l(strG, "::class");
    }

    public final void t(StringBuilder sb, List list) {
        if (list.isEmpty()) {
            return;
        }
        sb.append("context(");
        Iterator it = list.iterator();
        int i = 0;
        while (it.hasNext()) {
            int i2 = i + 1;
            tt7 type = ((nw7) it.next()).getType();
            type.getClass();
            sb.append(x(type, true));
            if (i == list.size() - 1) {
                sb.append(") ");
            } else {
                sb.append(", ");
            }
            i = i2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0055 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:15:0x0057  */
    /* JADX WARN: Code duplicated, block: B:17:0x006f  */
    /* JADX WARN: Code duplicated, block: B:18:0x0078  */
    public final void u(StringBuilder sb, tjd tjdVar) {
        a90 a90Var;
        p(sb, tjdVar, null);
        if (i7h.x(tjdVar)) {
            boolean z = tjdVar instanceof oy4;
            mz3 mz3Var = this.a;
            if (z && ((oy4) tjdVar).d.b()) {
                a90 a90Var2 = mz3Var.W;
                wn7 wn7Var = mz3.Z[47];
                a90Var2.getClass();
                wn7Var.getClass();
                if (((Boolean) a90Var2.b).booleanValue()) {
                    sy4 sy4Var = sy4.a;
                    if (z) {
                        ((oy4) tjdVar).d.b();
                    }
                    j7f j7fVarC0 = tjdVar.c0();
                    j7fVarC0.getClass();
                    sb.append(v(((py4) j7fVarC0).b[0]));
                } else {
                    if (z) {
                        a90Var = mz3Var.Y;
                        wn7 wn7Var2 = mz3.Z[49];
                        a90Var.getClass();
                        wn7Var2.getClass();
                        if (((Boolean) a90Var.b).booleanValue()) {
                            sb.append(tjdVar.c0().toString());
                        } else {
                            sb.append(((oy4) tjdVar).v);
                        }
                    } else {
                        sb.append(tjdVar.c0().toString());
                    }
                    sb.append(Q(tjdVar.Z()));
                }
            } else {
                if (z) {
                    a90Var = mz3Var.Y;
                    wn7 wn7Var3 = mz3.Z[49];
                    a90Var.getClass();
                    wn7Var3.getClass();
                    if (((Boolean) a90Var.b).booleanValue()) {
                        sb.append(((oy4) tjdVar).v);
                    } else {
                        sb.append(tjdVar.c0().toString());
                    }
                } else {
                    sb.append(tjdVar.c0().toString());
                }
                sb.append(Q(tjdVar.Z()));
            }
        } else {
            j7f j7fVarC1 = tjdVar.c0();
            y22 y22VarM = tjdVar.c0().m();
            gg7 gg7VarF = a6c.f(tjdVar, y22VarM instanceof z22 ? (z22) y22VarM : null, 0);
            if (gg7VarF == null) {
                sb.append(R(j7fVarC1));
                sb.append(Q(tjdVar.Z()));
            } else {
                K(sb, gg7VarF);
            }
        }
        if (tjdVar.i0()) {
            sb.append("?");
        }
        if (tjdVar instanceof kv3) {
            sb.append(" & Any");
        }
    }

    public final String v(String str) {
        int iOrdinal = this.a.B().ordinal();
        if (iOrdinal == 0) {
            return str;
        }
        if (iOrdinal == 1) {
            return ib8.j("<font color=red><b>", str, "</b></font>");
        }
        ap.c();
        return null;
    }

    public final String w(String str, String str2, xr7 xr7Var) {
        str.getClass();
        str2.getClass();
        int i = 0;
        if (jrb.o(str, str2)) {
            return c5e.C(str2, "(", false) ? ib8.j("(", str, ")!") : str.concat("!");
        }
        String strK = jrb.k(str, str2, new hz3(this, xr7Var, i), new hz3(this, xr7Var, 1), new uj3(1, this, jz3.class, "escape", "escape(Ljava/lang/String;)Ljava/lang/String;", 0, 5));
        if (strK != null) {
            return strK;
        }
        return "(" + str + ".." + str2 + ')';
    }

    public final String x(tt7 tt7Var, boolean z) {
        String strP = P(tt7Var);
        return ((!a0(tt7Var) || w8f.e(tt7Var)) && !(tt7Var instanceof kv3) && (!z || tt7Var.getAnnotations().isEmpty())) ? strP : ks0.g(')', "(", strP);
    }

    public final void y(bsf bsfVar, StringBuilder sb) {
        bl2 bl2VarB;
        String strS;
        a90 a90Var = this.a.u;
        wn7 wn7Var = mz3.Z[19];
        a90Var.getClass();
        wn7Var.getClass();
        if (!((Boolean) a90Var.b).booleanValue() || (bl2VarB = bsfVar.B()) == null || (strS = s(bl2VarB)) == null) {
            return;
        }
        sb.append(" = ");
        sb.append(l(strS));
    }

    public final String z(String str) {
        mz3 mz3Var = this.a;
        int iOrdinal = mz3Var.B().ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                ap.c();
                return null;
            }
            if (!mz3Var.n()) {
                return ib8.j("<b>", str, "</b>");
            }
        }
        return str;
    }
}
