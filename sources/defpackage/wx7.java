package defpackage;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.util.AbstractCollection;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class wx7 extends iy7 {
    public static final /* synthetic */ int v = 0;
    public final u09 n;
    public final enb o;
    public final boolean p;
    public final ee8 q;
    public final ee8 r;
    public final ee8 s;
    public final ee8 t;
    public final mz0 u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wx7(szc szcVar, u09 u09Var, enb enbVar, boolean z, wx7 wx7Var) {
        super(szcVar, wx7Var);
        szcVar.getClass();
        enbVar.getClass();
        this.n = u09Var;
        this.o = enbVar;
        this.p = z;
        ge8 ge8Var = ((mf7) szcVar.b).a;
        this.q = new ee8(ge8Var, new sx7(this, szcVar));
        this.r = new ee8(ge8Var, new tx7(this, 0));
        this.s = new ee8(ge8Var, new sx7(szcVar, this));
        this.t = new ee8(ge8Var, new tx7(this, 1));
        this.u = ge8Var.c(new d5(21, this, szcVar));
    }

    public static hjd A(hjd hjdVar, c36 c36Var, AbstractCollection abstractCollection) {
        if (abstractCollection.isEmpty()) {
            return hjdVar;
        }
        Iterator it = abstractCollection.iterator();
        while (it.hasNext()) {
            hjd hjdVar2 = (hjd) it.next();
            if (!hjdVar.equals(hjdVar2) && hjdVar2.R0 == null && D(hjdVar2, c36Var)) {
                c36 c36VarBuild = hjdVar.d0().y().build();
                c36VarBuild.getClass();
                return (hjd) c36VarBuild;
            }
        }
        return hjdVar;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x0036  */
    public static hjd B(hjd hjdVar) {
        dx5 dx5VarI;
        List listG = hjdVar.G();
        listG.getClass();
        xrf xrfVar = (xrf) s72.H0(listG);
        if (xrfVar != null) {
            y22 y22VarM = xrfVar.getType().c0().m();
            if (y22VarM != null) {
                int i = qz3.a;
                ex5 ex5VarF = oz3.f(y22VarM);
                ex5VarF.getClass();
                if (!ex5VarF.d()) {
                    ex5VarF = null;
                }
                if (ex5VarF != null) {
                    dx5VarI = ex5VarF.i();
                } else {
                    dx5VarI = null;
                }
            } else {
                dx5VarI = null;
            }
            if (!pa7.t(dx5VarI, tyd.g)) {
                xrfVar = null;
            }
            if (xrfVar != null) {
                b36 b36VarD0 = hjdVar.d0();
                List listG2 = hjdVar.G();
                listG2.getClass();
                hjd hjdVar2 = (hjd) b36VarD0.b(s72.s0(1, listG2)).u(((i8f) xrfVar.getType().Z().get(0)).b()).build();
                if (hjdVar2 != null) {
                    hjdVar2.K0 = true;
                }
                return hjdVar2;
            }
        }
        return null;
    }

    public static boolean D(c36 c36Var, c36 c36Var2) {
        int iB = iu9.c.n(c36Var2, c36Var, true).b();
        if (iB != 0) {
            return iB == 1 && !urg.s(c36Var2, c36Var);
        }
        throw null;
    }

    public static boolean E(hjd hjdVar, hjd hjdVar2) {
        int i = n51.l;
        hjdVar.getClass();
        if (pa7.t(hjdVar.getName().b(), "removeAt") && pa7.t(xo1.r(hjdVar), qud.g.e)) {
            hjdVar2 = hjdVar2.C0();
        }
        hjdVar2.getClass();
        return D(hjdVar2, hjdVar);
    }

    public static hjd F(wxa wxaVar, String str, a26 a26Var) {
        hjd hjdVar;
        Iterator it = ((Iterable) a26Var.d(t99.e(str))).iterator();
        do {
            hjdVar = null;
            if (!it.hasNext()) {
                break;
            }
            hjd hjdVar2 = (hjd) it.next();
            if (hjdVar2.G().size() == 0) {
                cf9 cf9Var = vt7.a;
                tt7 tt7Var = hjdVar2.v;
                if (tt7Var == null ? false : cf9Var.b(tt7Var, wxaVar.getType())) {
                    hjdVar = hjdVar2;
                }
            }
        } while (hjdVar == null);
        return hjdVar;
    }

    public static hjd H(wxa wxaVar, a26 a26Var) {
        hjd hjdVar;
        tt7 tt7Var;
        String strB = wxaVar.getName().b();
        strB.getClass();
        Iterator it = ((Iterable) a26Var.d(t99.e("set".concat(oj7.b(strB) ? strB.substring(2) : ym8.s(strB))))).iterator();
        do {
            hjdVar = null;
            if (!it.hasNext()) {
                break;
            }
            hjd hjdVar2 = (hjd) it.next();
            if (hjdVar2.G().size() == 1 && (tt7Var = hjdVar2.v) != null) {
                t99 t99Var = xr7.e;
                if (xr7.E(tt7Var, syd.d)) {
                    cf9 cf9Var = vt7.a;
                    List listG = hjdVar2.G();
                    listG.getClass();
                    if (cf9Var.a(((xrf) s72.X0(listG)).getType(), wxaVar.getType())) {
                        hjdVar = hjdVar2;
                    }
                }
            }
        } while (hjdVar == null);
        return hjdVar;
    }

    public static boolean K(hjd hjdVar, c36 c36Var) {
        String strQ = xo1.q(hjdVar, 2);
        c36 c36VarA = c36Var.a();
        c36VarA.getClass();
        return strQ.equals(xo1.q(c36VarA, 2)) && !D(hjdVar, c36Var);
    }

    public final boolean C(wxa wxaVar, a26 a26Var) {
        if (lmg.l0(wxaVar)) {
            return false;
        }
        hjd hjdVarG = G(wxaVar, a26Var);
        hjd hjdVarH = H(wxaVar, a26Var);
        if (hjdVarG == null) {
            return false;
        }
        if (wxaVar.N()) {
            return hjdVarH != null && hjdVarH.i() == hjdVarG.i();
        }
        return true;
    }

    public final hjd G(wxa wxaVar, a26 a26Var) {
        t99 t99Var;
        zxa zxaVarB = wxaVar.b();
        String strB = null;
        zxa zxaVar = zxaVarB != null ? (zxa) m7c.h(zxaVarB) : null;
        if (zxaVar != null) {
            xr7.A(zxaVar);
            ea1 ea1VarB = qz3.b(qz3.i(zxaVar), zo1.g);
            if (ea1VarB != null && (t99Var = (t99) p51.a.get(qz3.g(ea1VarB))) != null) {
                strB = t99Var.b();
            }
        }
        if (strB != null && !m7c.k(this.n, zxaVar)) {
            return F(wxaVar, strB, a26Var);
        }
        String strB2 = wxaVar.getName().b();
        strB2.getClass();
        return F(wxaVar, oj7.a(strB2), a26Var);
    }

    public final LinkedHashSet I(t99 t99Var) {
        Collection collectionZ = z();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = collectionZ.iterator();
        while (it.hasNext()) {
            x72.g0(linkedHashSet, ((tt7) it.next()).F().b(t99Var, lf9.e));
        }
        return linkedHashSet;
    }

    public final Set J(t99 t99Var) {
        Collection collectionZ = z();
        ArrayList arrayList = new ArrayList();
        Iterator it = collectionZ.iterator();
        while (it.hasNext()) {
            Collection collectionF = ((tt7) it.next()).F().f(t99Var, lf9.e);
            ArrayList arrayList2 = new ArrayList(t72.u(collectionF, 10));
            Iterator it2 = collectionF.iterator();
            while (it2.hasNext()) {
                arrayList2.add((wxa) it2.next());
            }
            x72.g0(arrayList, arrayList2);
        }
        return s72.o1(arrayList);
    }

    /* JADX WARN: Code duplicated, block: B:106:0x00f4 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:108:0x00de A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:111:0x01c3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:112:? A[LOOP:3: B:54:0x0120->B:112:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:114:0x016c A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:116:0x015a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:119:0x01c3 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:120:? A[LOOP:5: B:72:0x017b->B:120:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:122:0x01bd A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:125:0x01ab A[ADDED_TO_REGION, REMOVE, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:127:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:41:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:44:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:50:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:53:0x011c  */
    /* JADX WARN: Code duplicated, block: B:56:0x0126  */
    /* JADX WARN: Code duplicated, block: B:59:0x0134  */
    /* JADX WARN: Code duplicated, block: B:62:0x0146  */
    /* JADX WARN: Code duplicated, block: B:65:0x0160  */
    /* JADX WARN: Code duplicated, block: B:71:0x0177  */
    /* JADX WARN: Code duplicated, block: B:74:0x0181  */
    /* JADX WARN: Code duplicated, block: B:77:0x018e  */
    /* JADX WARN: Code duplicated, block: B:80:0x0195  */
    /* JADX WARN: Code duplicated, block: B:83:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:86:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:91:0x01c4 A[ORIG_RETURN, RETURN] */
    public final boolean L(hjd hjdVar) {
        Collection collectionJ;
        t99 t99Var;
        t99 name;
        hjd hjdVarB;
        LinkedHashSet<hjd> linkedHashSetI;
        ArrayList arrayList;
        Iterator it;
        Iterator it2;
        c36 c36VarA;
        ArrayList arrayList2;
        hjd hjdVar2;
        Iterator it3;
        hjd hjdVar3;
        t99 name2 = hjdVar.getName();
        name2.getClass();
        String strB = name2.b();
        strB.getClass();
        dx5 dx5Var = oj7.a;
        if (c5e.C(strB, "get", false) || c5e.C(strB, "is", false)) {
            t99 t99VarU = t72.U(name2, "get", null, 12);
            if (t99VarU == null) {
                t99VarU = t72.U(name2, "is", null, 8);
            }
            collectionJ = t72.J(t99VarU);
        } else if (c5e.C(strB, "set", false)) {
            collectionJ = qd0.k0(new t99[]{t72.U(name2, "set", null, 4), t72.U(name2, "set", "is", 4)});
        } else {
            collectionJ = (List) p51.b.get(name2);
            if (collectionJ == null) {
                collectionJ = pu4.a;
            }
        }
        if (collectionJ.isEmpty()) {
            ArrayList arrayList3 = qud.a;
            t99 name3 = hjdVar.getName();
            name3.getClass();
            t99Var = (t99) qud.k.get(name3);
            if (t99Var == null) {
                int i = o51.l;
                name = hjdVar.getName();
                name.getClass();
                if (!qud.e.contains(name)) {
                    hjdVarB = B(hjdVar);
                    if (hjdVarB == null) {
                        return true;
                    }
                    t99 name4 = hjdVar.getName();
                    name4.getClass();
                    linkedHashSetI = I(name4);
                    if (linkedHashSetI.isEmpty()) {
                        return true;
                    }
                    for (hjd hjdVar4 : linkedHashSetI) {
                        if (hjdVar4.isSuspend() || !D(hjdVarB, hjdVar4)) {
                        }
                    }
                    return true;
                }
                t99 name5 = hjdVar.getName();
                name5.getClass();
                LinkedHashSet linkedHashSetI2 = I(name5);
                arrayList = new ArrayList();
                it = linkedHashSetI2.iterator();
                while (it.hasNext()) {
                    c36VarA = o51.a((hjd) it.next());
                    if (c36VarA != null) {
                        arrayList.add(c36VarA);
                    }
                }
                if (arrayList.isEmpty()) {
                    hjdVarB = B(hjdVar);
                    if (hjdVarB == null) {
                        return true;
                    }
                    t99 name6 = hjdVar.getName();
                    name6.getClass();
                    linkedHashSetI = I(name6);
                    if (linkedHashSetI.isEmpty()) {
                        return true;
                    }
                    while (r8.hasNext()) {
                        if (hjdVar4.isSuspend()) {
                        }
                    }
                    return true;
                }
                it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    if (K(hjdVar, (c36) it2.next())) {
                    }
                }
                hjdVarB = B(hjdVar);
                if (hjdVarB == null) {
                    return true;
                }
                t99 name7 = hjdVar.getName();
                name7.getClass();
                linkedHashSetI = I(name7);
                if (linkedHashSetI.isEmpty()) {
                    return true;
                }
                while (r8.hasNext()) {
                    if (hjdVar4.isSuspend()) {
                    }
                }
                return true;
            }
            LinkedHashSet linkedHashSetI3 = I(t99Var);
            arrayList2 = new ArrayList();
            for (Object obj : linkedHashSetI3) {
                hjdVar3 = (hjd) obj;
                hjdVar3.getClass();
                if (m7c.h(hjdVar3) != null) {
                    arrayList2.add(obj);
                }
            }
            if (arrayList2.isEmpty()) {
                int i2 = o51.l;
                name = hjdVar.getName();
                name.getClass();
                if (!qud.e.contains(name)) {
                    hjdVarB = B(hjdVar);
                    if (hjdVarB == null) {
                        return true;
                    }
                    t99 name8 = hjdVar.getName();
                    name8.getClass();
                    linkedHashSetI = I(name8);
                    if (linkedHashSetI.isEmpty()) {
                        return true;
                    }
                    while (r8.hasNext()) {
                        if (hjdVar4.isSuspend()) {
                        }
                    }
                    return true;
                }
                t99 name9 = hjdVar.getName();
                name9.getClass();
                LinkedHashSet linkedHashSetI4 = I(name9);
                arrayList = new ArrayList();
                it = linkedHashSetI4.iterator();
                while (it.hasNext()) {
                    c36VarA = o51.a((hjd) it.next());
                    if (c36VarA != null) {
                        arrayList.add(c36VarA);
                    }
                }
                if (arrayList.isEmpty()) {
                    hjdVarB = B(hjdVar);
                    if (hjdVarB == null) {
                        return true;
                    }
                    t99 name10 = hjdVar.getName();
                    name10.getClass();
                    linkedHashSetI = I(name10);
                    if (linkedHashSetI.isEmpty()) {
                        return true;
                    }
                    while (r8.hasNext()) {
                        if (hjdVar4.isSuspend()) {
                        }
                    }
                    return true;
                }
                it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    if (K(hjdVar, (c36) it2.next())) {
                    }
                }
                hjdVarB = B(hjdVar);
                if (hjdVarB == null) {
                    return true;
                }
                t99 name11 = hjdVar.getName();
                name11.getClass();
                linkedHashSetI = I(name11);
                if (linkedHashSetI.isEmpty()) {
                    return true;
                }
                while (r8.hasNext()) {
                    if (hjdVar4.isSuspend()) {
                    }
                }
                return true;
            }
            b36 b36VarD0 = hjdVar.d0();
            b36VarD0.A(t99Var);
            b36VarD0.C();
            b36VarD0.g();
            c36 c36VarBuild = b36VarD0.build();
            c36VarBuild.getClass();
            hjdVar2 = (hjd) c36VarBuild;
            if (arrayList2.isEmpty()) {
                int i3 = o51.l;
                name = hjdVar.getName();
                name.getClass();
                if (!qud.e.contains(name)) {
                    hjdVarB = B(hjdVar);
                    if (hjdVarB == null) {
                        return true;
                    }
                    t99 name12 = hjdVar.getName();
                    name12.getClass();
                    linkedHashSetI = I(name12);
                    if (linkedHashSetI.isEmpty()) {
                        return true;
                    }
                    while (r8.hasNext()) {
                        if (hjdVar4.isSuspend()) {
                        }
                    }
                    return true;
                }
                t99 name13 = hjdVar.getName();
                name13.getClass();
                LinkedHashSet linkedHashSetI5 = I(name13);
                arrayList = new ArrayList();
                it = linkedHashSetI5.iterator();
                while (it.hasNext()) {
                    c36VarA = o51.a((hjd) it.next());
                    if (c36VarA != null) {
                        arrayList.add(c36VarA);
                    }
                }
                if (arrayList.isEmpty()) {
                    hjdVarB = B(hjdVar);
                    if (hjdVarB == null) {
                        return true;
                    }
                    t99 name14 = hjdVar.getName();
                    name14.getClass();
                    linkedHashSetI = I(name14);
                    if (linkedHashSetI.isEmpty()) {
                        return true;
                    }
                    while (r8.hasNext()) {
                        if (hjdVar4.isSuspend()) {
                        }
                    }
                    return true;
                }
                it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    if (K(hjdVar, (c36) it2.next())) {
                    }
                }
                hjdVarB = B(hjdVar);
                if (hjdVarB == null) {
                    return true;
                }
                t99 name15 = hjdVar.getName();
                name15.getClass();
                linkedHashSetI = I(name15);
                if (linkedHashSetI.isEmpty()) {
                    return true;
                }
                while (r8.hasNext()) {
                    if (hjdVar4.isSuspend()) {
                    }
                }
                return true;
            }
            it3 = arrayList2.iterator();
            while (it3.hasNext()) {
                if (E((hjd) it3.next(), hjdVar2)) {
                }
            }
            int i4 = o51.l;
            name = hjdVar.getName();
            name.getClass();
            if (!qud.e.contains(name)) {
                hjdVarB = B(hjdVar);
                if (hjdVarB == null) {
                    return true;
                }
                t99 name16 = hjdVar.getName();
                name16.getClass();
                linkedHashSetI = I(name16);
                if (linkedHashSetI.isEmpty()) {
                    return true;
                }
                while (r8.hasNext()) {
                    if (hjdVar4.isSuspend()) {
                    }
                }
                return true;
            }
            t99 name17 = hjdVar.getName();
            name17.getClass();
            LinkedHashSet linkedHashSetI6 = I(name17);
            arrayList = new ArrayList();
            it = linkedHashSetI6.iterator();
            while (it.hasNext()) {
                c36VarA = o51.a((hjd) it.next());
                if (c36VarA != null) {
                    arrayList.add(c36VarA);
                }
            }
            if (arrayList.isEmpty()) {
                hjdVarB = B(hjdVar);
                if (hjdVarB == null) {
                    return true;
                }
                t99 name18 = hjdVar.getName();
                name18.getClass();
                linkedHashSetI = I(name18);
                if (linkedHashSetI.isEmpty()) {
                    return true;
                }
                while (r8.hasNext()) {
                    if (hjdVar4.isSuspend()) {
                    }
                }
                return true;
            }
            it2 = arrayList.iterator();
            while (it2.hasNext()) {
                if (K(hjdVar, (c36) it2.next())) {
                }
            }
            hjdVarB = B(hjdVar);
            if (hjdVarB == null) {
                return true;
            }
            t99 name19 = hjdVar.getName();
            name19.getClass();
            linkedHashSetI = I(name19);
            if (linkedHashSetI.isEmpty()) {
                return true;
            }
            while (r8.hasNext()) {
                if (hjdVar4.isSuspend()) {
                }
            }
            return true;
        }
        Iterator it4 = collectionJ.iterator();
        while (it4.hasNext()) {
            Set<wxa> setJ = J((t99) it4.next());
            if (!(setJ instanceof Collection) || !setJ.isEmpty()) {
                for (wxa wxaVar : setJ) {
                    if (C(wxaVar, new d5(22, hjdVar, this))) {
                        if (!wxaVar.N()) {
                            String strB2 = hjdVar.getName().b();
                            strB2.getClass();
                            if (!c5e.C(strB2, "set", false)) {
                            }
                        }
                    }
                }
            }
        }
        ArrayList arrayList4 = qud.a;
        t99 name20 = hjdVar.getName();
        name20.getClass();
        t99Var = (t99) qud.k.get(name20);
        if (t99Var == null) {
            int i5 = o51.l;
            name = hjdVar.getName();
            name.getClass();
            if (!qud.e.contains(name)) {
                hjdVarB = B(hjdVar);
                if (hjdVarB == null) {
                    return true;
                }
                t99 name110 = hjdVar.getName();
                name110.getClass();
                linkedHashSetI = I(name110);
                if (linkedHashSetI.isEmpty()) {
                    return true;
                }
                while (r8.hasNext()) {
                    if (hjdVar4.isSuspend()) {
                    }
                }
                return true;
            }
            t99 name111 = hjdVar.getName();
            name111.getClass();
            LinkedHashSet linkedHashSetI7 = I(name111);
            arrayList = new ArrayList();
            it = linkedHashSetI7.iterator();
            while (it.hasNext()) {
                c36VarA = o51.a((hjd) it.next());
                if (c36VarA != null) {
                    arrayList.add(c36VarA);
                }
            }
            if (arrayList.isEmpty()) {
                hjdVarB = B(hjdVar);
                if (hjdVarB == null) {
                    return true;
                }
                t99 name112 = hjdVar.getName();
                name112.getClass();
                linkedHashSetI = I(name112);
                if (linkedHashSetI.isEmpty()) {
                    return true;
                }
                while (r8.hasNext()) {
                    if (hjdVar4.isSuspend()) {
                    }
                }
                return true;
            }
            it2 = arrayList.iterator();
            while (it2.hasNext()) {
                if (K(hjdVar, (c36) it2.next())) {
                }
            }
            hjdVarB = B(hjdVar);
            if (hjdVarB == null) {
                return true;
            }
            t99 name113 = hjdVar.getName();
            name113.getClass();
            linkedHashSetI = I(name113);
            if (linkedHashSetI.isEmpty()) {
                return true;
            }
            while (r8.hasNext()) {
                if (hjdVar4.isSuspend()) {
                }
            }
            return true;
        }
        LinkedHashSet linkedHashSetI8 = I(t99Var);
        arrayList2 = new ArrayList();
        while (r1.hasNext()) {
            hjdVar3 = (hjd) obj;
            hjdVar3.getClass();
            if (m7c.h(hjdVar3) != null) {
                arrayList2.add(obj);
            }
        }
        if (arrayList2.isEmpty()) {
            int i6 = o51.l;
            name = hjdVar.getName();
            name.getClass();
            if (!qud.e.contains(name)) {
                hjdVarB = B(hjdVar);
                if (hjdVarB == null) {
                    return true;
                }
                t99 name114 = hjdVar.getName();
                name114.getClass();
                linkedHashSetI = I(name114);
                if (linkedHashSetI.isEmpty()) {
                    return true;
                }
                while (r8.hasNext()) {
                    if (hjdVar4.isSuspend()) {
                    }
                }
                return true;
            }
            t99 name115 = hjdVar.getName();
            name115.getClass();
            LinkedHashSet linkedHashSetI9 = I(name115);
            arrayList = new ArrayList();
            it = linkedHashSetI9.iterator();
            while (it.hasNext()) {
                c36VarA = o51.a((hjd) it.next());
                if (c36VarA != null) {
                    arrayList.add(c36VarA);
                }
            }
            if (arrayList.isEmpty()) {
                hjdVarB = B(hjdVar);
                if (hjdVarB == null) {
                    return true;
                }
                t99 name116 = hjdVar.getName();
                name116.getClass();
                linkedHashSetI = I(name116);
                if (linkedHashSetI.isEmpty()) {
                    return true;
                }
                while (r8.hasNext()) {
                    if (hjdVar4.isSuspend()) {
                    }
                }
                return true;
            }
            it2 = arrayList.iterator();
            while (it2.hasNext()) {
                if (K(hjdVar, (c36) it2.next())) {
                }
            }
            hjdVarB = B(hjdVar);
            if (hjdVarB == null) {
                return true;
            }
            t99 name117 = hjdVar.getName();
            name117.getClass();
            linkedHashSetI = I(name117);
            if (linkedHashSetI.isEmpty()) {
                return true;
            }
            while (r8.hasNext()) {
                if (hjdVar4.isSuspend()) {
                }
            }
            return true;
        }
        b36 b36VarD1 = hjdVar.d0();
        b36VarD1.A(t99Var);
        b36VarD1.C();
        b36VarD1.g();
        c36 c36VarBuild2 = b36VarD1.build();
        c36VarBuild2.getClass();
        hjdVar2 = (hjd) c36VarBuild2;
        if (arrayList2.isEmpty()) {
            int i7 = o51.l;
            name = hjdVar.getName();
            name.getClass();
            if (!qud.e.contains(name)) {
                hjdVarB = B(hjdVar);
                if (hjdVarB == null) {
                    return true;
                }
                t99 name118 = hjdVar.getName();
                name118.getClass();
                linkedHashSetI = I(name118);
                if (linkedHashSetI.isEmpty()) {
                    return true;
                }
                while (r8.hasNext()) {
                    if (hjdVar4.isSuspend()) {
                    }
                }
                return true;
            }
            t99 name119 = hjdVar.getName();
            name119.getClass();
            LinkedHashSet linkedHashSetI10 = I(name119);
            arrayList = new ArrayList();
            it = linkedHashSetI10.iterator();
            while (it.hasNext()) {
                c36VarA = o51.a((hjd) it.next());
                if (c36VarA != null) {
                    arrayList.add(c36VarA);
                }
            }
            if (arrayList.isEmpty()) {
                hjdVarB = B(hjdVar);
                if (hjdVarB == null) {
                    return true;
                }
                t99 name1110 = hjdVar.getName();
                name1110.getClass();
                linkedHashSetI = I(name1110);
                if (linkedHashSetI.isEmpty()) {
                    return true;
                }
                while (r8.hasNext()) {
                    if (hjdVar4.isSuspend()) {
                    }
                }
                return true;
            }
            it2 = arrayList.iterator();
            while (it2.hasNext()) {
                if (K(hjdVar, (c36) it2.next())) {
                }
            }
            hjdVarB = B(hjdVar);
            if (hjdVarB == null) {
                return true;
            }
            t99 name1111 = hjdVar.getName();
            name1111.getClass();
            linkedHashSetI = I(name1111);
            if (linkedHashSetI.isEmpty()) {
                return true;
            }
            while (r8.hasNext()) {
                if (hjdVar4.isSuspend()) {
                }
            }
            return true;
        }
        it3 = arrayList2.iterator();
        while (it3.hasNext()) {
            if (E((hjd) it3.next(), hjdVar2)) {
            }
        }
        int i8 = o51.l;
        name = hjdVar.getName();
        name.getClass();
        if (!qud.e.contains(name)) {
            hjdVarB = B(hjdVar);
            if (hjdVarB == null) {
                return true;
            }
            t99 name1112 = hjdVar.getName();
            name1112.getClass();
            linkedHashSetI = I(name1112);
            if (linkedHashSetI.isEmpty()) {
                return true;
            }
            while (r8.hasNext()) {
                if (hjdVar4.isSuspend()) {
                }
            }
            return true;
        }
        t99 name1113 = hjdVar.getName();
        name1113.getClass();
        LinkedHashSet linkedHashSetI11 = I(name1113);
        arrayList = new ArrayList();
        it = linkedHashSetI11.iterator();
        while (it.hasNext()) {
            c36VarA = o51.a((hjd) it.next());
            if (c36VarA != null) {
                arrayList.add(c36VarA);
            }
        }
        if (arrayList.isEmpty()) {
            hjdVarB = B(hjdVar);
            if (hjdVarB == null) {
                return true;
            }
            t99 name1114 = hjdVar.getName();
            name1114.getClass();
            linkedHashSetI = I(name1114);
            if (linkedHashSetI.isEmpty()) {
                return true;
            }
            while (r8.hasNext()) {
                if (hjdVar4.isSuspend()) {
                }
            }
            return true;
        }
        it2 = arrayList.iterator();
        while (it2.hasNext()) {
            if (K(hjdVar, (c36) it2.next())) {
            }
        }
        hjdVarB = B(hjdVar);
        if (hjdVarB == null) {
            return true;
        }
        t99 name1115 = hjdVar.getName();
        name1115.getClass();
        linkedHashSetI = I(name1115);
        if (linkedHashSetI.isEmpty()) {
            return true;
        }
        while (r8.hasNext()) {
            if (hjdVar4.isSuspend()) {
            }
        }
        return true;
        return false;
    }

    public final void M(t99 t99Var, lf9 lf9Var) {
        t99Var.getClass();
        lf9Var.getClass();
        Object obj = this.b.b;
        this.n.getClass();
    }

    public final ArrayList N(t99 t99Var) {
        Collection collectionC = ((im3) this.e.invoke()).c(t99Var);
        ArrayList arrayList = new ArrayList(t72.u(collectionC, 10));
        Iterator it = collectionC.iterator();
        while (it.hasNext()) {
            arrayList.add(t((onb) it.next()));
        }
        return arrayList;
    }

    public final ArrayList O(t99 t99Var) {
        LinkedHashSet linkedHashSetI = I(t99Var);
        ArrayList arrayList = new ArrayList();
        for (Object obj : linkedHashSetI) {
            hjd hjdVar = (hjd) obj;
            hjdVar.getClass();
            if (m7c.h(hjdVar) == null && o51.a(hjdVar) == null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    @Override // defpackage.iy7, defpackage.er8, defpackage.dr8
    public final Collection b(t99 t99Var, lf9 lf9Var) {
        t99Var.getClass();
        M(t99Var, lf9Var);
        return super.b(t99Var, lf9Var);
    }

    @Override // defpackage.er8, defpackage.dr8
    public final y22 e(t99 t99Var, lf9 lf9Var) {
        mz0 mz0Var;
        u09 u09Var;
        t99Var.getClass();
        lf9Var.getClass();
        M(t99Var, lf9Var);
        wx7 wx7Var = (wx7) this.c;
        return (wx7Var == null || (mz0Var = wx7Var.u) == null || (u09Var = (u09) mz0Var.d(t99Var)) == null) ? (y22) this.u.d(t99Var) : u09Var;
    }

    @Override // defpackage.iy7, defpackage.er8, defpackage.dr8
    public final Collection f(t99 t99Var, lf9 lf9Var) {
        t99Var.getClass();
        M(t99Var, lf9Var);
        return super.f(t99Var, lf9Var);
    }

    @Override // defpackage.iy7
    public final Set h(ez3 ez3Var, a26 a26Var) {
        ez3Var.getClass();
        return n3d.m((Set) this.r.invoke(), ((Map) this.t.invoke()).keySet());
    }

    @Override // defpackage.iy7
    public final Set i(ez3 ez3Var, a26 a26Var) {
        ez3Var.getClass();
        u09 u09Var = this.n;
        Collection collectionE = u09Var.h().e();
        collectionE.getClass();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator it = collectionE.iterator();
        while (it.hasNext()) {
            x72.g0(linkedHashSet, ((tt7) it.next()).F().c());
        }
        ee8 ee8Var = this.e;
        linkedHashSet.addAll(((im3) ee8Var.invoke()).a());
        linkedHashSet.addAll(((im3) ee8Var.invoke()).e());
        linkedHashSet.addAll(h(ez3Var, a26Var));
        szc szcVar = this.b;
        u09Var.getClass();
        szcVar.getClass();
        linkedHashSet.addAll(new ArrayList());
        return linkedHashSet;
    }

    @Override // defpackage.iy7
    public final void j(t99 t99Var, ArrayList arrayList) throws IllegalAccessException, InvocationTargetException {
        boolean zG = this.o.g();
        u09 u09Var = this.n;
        szc szcVar = this.b;
        if (zG) {
            ee8 ee8Var = this.e;
            if (((im3) ee8Var.invoke()).b(t99Var) != null) {
                if (arrayList.isEmpty()) {
                    rnb rnbVarB = ((im3) ee8Var.invoke()).b(t99Var);
                    rnbVarB.getClass();
                    if7 if7VarR0 = if7.R0(u09Var, kn2.V(szcVar, rnbVarB), rnbVarB.c(), m8c.B(rnbVarB), true);
                    tt7 tt7VarT = ((ta0) szcVar.e).T(rnbVarB.f(), vfh.Q(t8f.b, false, null, 6));
                    nw7 nw7VarP = p();
                    e09.a.getClass();
                    rz3 rz3Var = sz3.e;
                    pu4 pu4Var = pu4.a;
                    if7VarR0.Q0(null, nw7VarP, pu4Var, pu4Var, pu4Var, tt7VarT, e09.d, rz3Var, null);
                    if7VarR0.S0(false, false);
                    arrayList.add(if7VarR0);
                } else {
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        if (((hjd) it.next()).G().isEmpty()) {
                        }
                    }
                    rnb rnbVarB2 = ((im3) ee8Var.invoke()).b(t99Var);
                    rnbVarB2.getClass();
                    if7 if7VarR1 = if7.R0(u09Var, kn2.V(szcVar, rnbVarB2), rnbVarB2.c(), m8c.B(rnbVarB2), true);
                    tt7 tt7VarT2 = ((ta0) szcVar.e).T(rnbVarB2.f(), vfh.Q(t8f.b, false, null, 6));
                    nw7 nw7VarP2 = p();
                    e09.a.getClass();
                    rz3 rz3Var2 = sz3.e;
                    pu4 pu4Var2 = pu4.a;
                    if7VarR1.Q0(null, nw7VarP2, pu4Var2, pu4Var2, pu4Var2, tt7VarT2, e09.d, rz3Var2, null);
                    if7VarR1.S0(false, false);
                    arrayList.add(if7VarR1);
                }
            }
        }
        u09Var.getClass();
        szcVar.getClass();
    }

    @Override // defpackage.iy7
    public final im3 k() {
        return new c22(this.o, tj7.Z);
    }

    @Override // defpackage.iy7
    public final void m(LinkedHashSet linkedHashSet, t99 t99Var) {
        LinkedHashSet linkedHashSetI = I(t99Var);
        ArrayList arrayList = qud.a;
        if (!qud.j.contains(t99Var)) {
            int i = o51.l;
            if (!qud.e.contains(t99Var)) {
                if (!linkedHashSetI.isEmpty()) {
                    Iterator it = linkedHashSetI.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (((c36) it.next()).isSuspend()) {
                            }
                        }
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : linkedHashSetI) {
                    if (L((hjd) obj)) {
                        arrayList2.add(obj);
                    }
                }
                w(linkedHashSet, t99Var, arrayList2, false);
                return;
            }
        }
        dqd dqdVar = new dqd();
        LinkedHashSet linkedHashSetQ = cn1.Q(t99Var, linkedHashSetI, pu4.a, this.n, ky4.u, ((cf9) ((mf7) this.b.b).l).d);
        x(t99Var, linkedHashSet, linkedHashSetQ, linkedHashSet, new vx7(1, this, wx7.class, "searchMethodsByNameWithoutBuiltinMagic", "searchMethodsByNameWithoutBuiltinMagic(Lorg/jetbrains/kotlin/name/Name;)Ljava/util/Collection;", 0, 0));
        x(t99Var, linkedHashSet, linkedHashSetQ, dqdVar, new vx7(1, this, wx7.class, "searchMethodsInSupertypesWithoutBuiltinMagic", "searchMethodsInSupertypesWithoutBuiltinMagic(Lorg/jetbrains/kotlin/name/Name;)Ljava/util/Collection;", 0, 1));
        ArrayList arrayList3 = new ArrayList();
        for (Object obj2 : linkedHashSetI) {
            if (L((hjd) obj2)) {
                arrayList3.add(obj2);
            }
        }
        w(linkedHashSet, t99Var, s72.Q0(arrayList3, dqdVar), true);
    }

    @Override // defpackage.iy7
    public final void n(t99 t99Var, ArrayList arrayList) {
        t99 t99Var2;
        boolean zIsAnnotation = this.o.a.isAnnotation();
        szc szcVar = this.b;
        if (zIsAnnotation) {
            t99Var2 = t99Var;
            onb onbVar = (onb) s72.Y0(((im3) this.e.invoke()).c(t99Var2));
            if (onbVar != null) {
                lf7 lf7VarL0 = lf7.L0(this.n, kn2.V(szcVar, onbVar), t4c.u(onbVar.e()), false, onbVar.c(), m8c.B(onbVar), false);
                zxa zxaVarG = af1.G(lf7VarL0, hj6.c);
                lf7VarL0.H0(zxaVarG, null, null, null);
                szcVar.getClass();
                tt7 tt7VarL = iy7.l(onbVar, new szc((mf7) szcVar.b, new r1f(szcVar, lf7VarL0, onbVar, 0), (lw7) szcVar.d));
                nw7 nw7VarP = p();
                pu4 pu4Var = pu4.a;
                lf7VarL0.K0(tt7VarL, pu4Var, nw7VarP, null, pu4Var);
                zxaVarG.Y = tt7VarL;
                arrayList.add(lf7VarL0);
            }
        } else {
            t99Var2 = t99Var;
        }
        Set setJ = J(t99Var);
        if (setJ.isEmpty()) {
            return;
        }
        dqd dqdVar = new dqd();
        dqd dqdVar2 = new dqd();
        y(setJ, arrayList, dqdVar, new ux7(this, 0));
        y(n3d.l(setJ, dqdVar), dqdVar2, null, new ux7(this, 1));
        LinkedHashSet linkedHashSetM = n3d.m(setJ, dqdVar2);
        mf7 mf7Var = (mf7) szcVar.b;
        t99 t99Var3 = t99Var2;
        arrayList.addAll(cn1.Q(t99Var3, linkedHashSetM, arrayList, this.n, i8c.b, ((cf9) mf7Var.l).d));
    }

    @Override // defpackage.iy7
    public final Set o(ez3 ez3Var) {
        ez3Var.getClass();
        if (this.o.a.isAnnotation()) {
            return c();
        }
        LinkedHashSet linkedHashSet = new LinkedHashSet(((im3) this.e.invoke()).f());
        Collection collectionE = this.n.h().e();
        collectionE.getClass();
        Iterator it = collectionE.iterator();
        while (it.hasNext()) {
            x72.g0(linkedHashSet, ((tt7) it.next()).F().g());
        }
        return linkedHashSet;
    }

    @Override // defpackage.iy7
    public final nw7 p() {
        u09 u09Var = this.n;
        if (u09Var != null) {
            int i = oz3.a;
            return u09Var.i0();
        }
        oz3.a(0);
        throw null;
    }

    @Override // defpackage.iy7
    public final bm3 q() {
        return this.n;
    }

    @Override // defpackage.iy7
    public final boolean r(if7 if7Var) {
        if (this.o.a.isAnnotation()) {
            return false;
        }
        return L(if7Var);
    }

    @Override // defpackage.iy7
    public final hy7 s(onb onbVar, ArrayList arrayList, tt7 tt7Var, List list) {
        onbVar.getClass();
        Object obj = this.b.b;
        if (this.n != null) {
            List list2 = Collections.EMPTY_LIST;
            if (list2 != null) {
                return new hy7(tt7Var, list, arrayList, list2);
            }
            throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", "signatureErrors", "kotlin/reflect/jvm/internal/impl/load/java/components/SignaturePropagator$PropagatedSignature", "<init>"));
        }
        Object[] objArr = new Object[3];
        switch (1) {
            case 1:
                objArr[0] = "owner";
                break;
            case 2:
                objArr[0] = "returnType";
                break;
            case 3:
                objArr[0] = "valueParameters";
                break;
            case 4:
                objArr[0] = "typeParameters";
                break;
            case 5:
                objArr[0] = "descriptor";
                break;
            case 6:
                objArr[0] = "signatureErrors";
                break;
            default:
                objArr[0] = "method";
                break;
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/SignaturePropagator$1";
        objArr[2] = "resolvePropagatedSignature";
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    @Override // defpackage.iy7
    public final String toString() {
        return "Lazy Java member scope for " + this.o.c();
    }

    public final void v(ArrayList arrayList, wd7 wd7Var, int i, onb onbVar, tt7 tt7Var, tt7 tt7Var2) {
        Object gnbVar;
        g10 g10Var = hj6.c;
        t99 t99VarC = onbVar.c();
        if (tt7Var == null) {
            w8f.a(2);
            throw null;
        }
        jgf jgfVarH = w8f.h(tt7Var, false);
        Object defaultValue = onbVar.a.getDefaultValue();
        if (defaultValue != null) {
            Class<?> cls = defaultValue.getClass();
            List list = smb.a;
            if (Enum.class.isAssignableFrom(cls)) {
                gnbVar = new knb(null, (Enum) defaultValue);
            } else if (defaultValue instanceof Annotation) {
                gnbVar = new vmb(null, (Annotation) defaultValue);
            } else if (defaultValue instanceof Object[]) {
                gnbVar = new wmb(null, (Object[]) defaultValue);
            } else {
                gnbVar = defaultValue instanceof Class ? new gnb(null, (Class) defaultValue) : new mnb(null, defaultValue);
            }
        } else {
            gnbVar = null;
        }
        boolean z = gnbVar != null;
        jgf jgfVarH2 = tt7Var2 != null ? w8f.h(tt7Var2, false) : null;
        Object obj = this.b.b;
        arrayList.add(new xrf(wd7Var, null, i, g10Var, t99VarC, jgfVarH, z, false, false, jgfVarH2, m8c.B(onbVar)));
    }

    public final void w(LinkedHashSet linkedHashSet, t99 t99Var, ArrayList arrayList, boolean z) {
        mf7 mf7Var = (mf7) this.b.b;
        LinkedHashSet<hjd> linkedHashSetQ = cn1.Q(t99Var, arrayList, linkedHashSet, this.n, i8c.b, ((cf9) mf7Var.l).d);
        if (!z) {
            linkedHashSet.addAll(linkedHashSetQ);
            return;
        }
        ArrayList arrayListQ0 = s72.Q0(linkedHashSet, linkedHashSetQ);
        ArrayList arrayList2 = new ArrayList(t72.u(linkedHashSetQ, 10));
        for (hjd hjdVarA : linkedHashSetQ) {
            hjd hjdVar = (hjd) m7c.i(hjdVarA);
            if (hjdVar != null) {
                hjdVarA = A(hjdVarA, hjdVar, arrayListQ0);
            }
            arrayList2.add(hjdVarA);
        }
        linkedHashSet.addAll(arrayList2);
    }

    /* JADX WARN: Code duplicated, block: B:18:0x0067  */
    /* JADX WARN: Multi-variable type inference failed */
    public final void x(t99 t99Var, LinkedHashSet linkedHashSet, LinkedHashSet linkedHashSet2, AbstractSet abstractSet, a26 a26Var) {
        hjd hjdVarA;
        Object next;
        hjd hjdVar;
        hjd hjdVarA2;
        Iterator it = linkedHashSet2.iterator();
        while (it.hasNext()) {
            hjd hjdVar2 = (hjd) it.next();
            hjd hjdVar3 = (hjd) m7c.h(hjdVar2);
            hjd hjdVar4 = null;
            if (hjdVar3 != null) {
                String strG = m7c.g(hjdVar3);
                strG.getClass();
                Iterator it2 = ((Collection) a26Var.d(t99.e(strG))).iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        hjdVarA = null;
                        break;
                    }
                    b36 b36VarD0 = ((hjd) it2.next()).d0();
                    b36VarD0.A(t99Var);
                    b36VarD0.C();
                    b36VarD0.g();
                    c36 c36VarBuild = b36VarD0.build();
                    c36VarBuild.getClass();
                    hjd hjdVar5 = (hjd) c36VarBuild;
                    if (E(hjdVar3, hjdVar5)) {
                        hjdVarA = A(hjdVar5, hjdVar3, linkedHashSet);
                        break;
                    }
                }
            } else {
                hjdVarA = null;
                break;
            }
            if (hjdVarA != null) {
                abstractSet.add(hjdVarA);
            }
            c36 c36VarA = o51.a(hjdVar2);
            if (c36VarA == 0) {
                hjdVarA2 = null;
            } else {
                t99 name = ((cm3) c36VarA).getName();
                name.getClass();
                Iterator it3 = ((Iterable) a26Var.d(name)).iterator();
                do {
                    if (!it3.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it3.next();
                } while (!K((hjd) next, c36VarA));
                hjd hjdVar6 = (hjd) next;
                if (hjdVar6 != null) {
                    b36 b36VarD1 = hjdVar6.d0();
                    List listG = c36VarA.G();
                    listG.getClass();
                    ArrayList arrayList = new ArrayList(t72.u(listG, 10));
                    Iterator it4 = listG.iterator();
                    while (it4.hasNext()) {
                        arrayList.add(((xrf) it4.next()).getType());
                    }
                    List listG2 = hjdVar6.G();
                    listG2.getClass();
                    b36VarD1.b(xxb.o(arrayList, listG2, c36VarA));
                    b36VarD1.C();
                    b36VarD1.g();
                    b36VarD1.m();
                    hjdVar = (hjd) b36VarD1.build();
                } else {
                    hjdVar = null;
                }
                if (hjdVar == null) {
                    hjdVarA2 = null;
                } else {
                    if (!L(hjdVar)) {
                        hjdVar = null;
                    }
                    if (hjdVar != null) {
                        hjdVarA2 = A(hjdVar, c36VarA, linkedHashSet);
                    } else {
                        hjdVarA2 = null;
                    }
                }
            }
            if (hjdVarA2 != null) {
                abstractSet.add(hjdVarA2);
            }
            if (hjdVar2.isSuspend()) {
                t99 name2 = hjdVar2.getName();
                name2.getClass();
                Iterator it5 = ((Iterable) a26Var.d(name2)).iterator();
                while (it5.hasNext()) {
                    hjd hjdVarB = B((hjd) it5.next());
                    if (hjdVarB == null || !D(hjdVarB, hjdVar2)) {
                        hjdVarB = null;
                    }
                    if (hjdVarB != null) {
                        hjdVar4 = hjdVarB;
                        break;
                    }
                }
            }
            if (hjdVar4 != null) {
                abstractSet.add(hjdVar4);
            }
        }
    }

    public final void y(Set set, AbstractCollection abstractCollection, dqd dqdVar, a26 a26Var) {
        hjd hjdVarH;
        dya dyaVarO;
        pe7 pe7Var;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            wxa wxaVar = (wxa) it.next();
            if (C(wxaVar, a26Var)) {
                hjd hjdVarG = G(wxaVar, a26Var);
                hjdVarG.getClass();
                if (wxaVar.N()) {
                    hjdVarH = H(wxaVar, a26Var);
                    hjdVarH.getClass();
                } else {
                    hjdVarH = null;
                }
                if (hjdVarH != null) {
                    hjdVarH.i();
                    hjdVarG.i();
                }
                u09 u09Var = this.n;
                u09Var.getClass();
                pe7 pe7Var2 = new pe7(u09Var, hj6.c, hjdVarG.i(), hjdVarG.getVisibility(), hjdVarH != null, wxaVar.getName(), hjdVarG.e(), null, 1, false, null);
                tt7 tt7Var = hjdVarG.v;
                tt7Var.getClass();
                nw7 nw7VarP = p();
                pu4 pu4Var = pu4.a;
                pe7Var2.K0(tt7Var, pu4Var, nw7VarP, null, pu4Var);
                zxa zxaVarM = af1.M(pe7Var2, hjdVarG.getAnnotations(), false, hjdVarG.e());
                zxaVarM.X = hjdVarG;
                zxaVarM.F0(pe7Var2.getType());
                if (hjdVarH != null) {
                    List listG = hjdVarH.G();
                    listG.getClass();
                    xrf xrfVar = (xrf) s72.x0(listG);
                    if (xrfVar == null) {
                        ho7.t(hjdVarH, "No parameter found for ");
                        return;
                    } else {
                        dyaVarO = af1.O(pe7Var2, hjdVarH.getAnnotations(), xrfVar.getAnnotations(), false, hjdVarH.getVisibility(), hjdVarH.e());
                        dyaVarO.X = hjdVarH;
                    }
                } else {
                    dyaVarO = null;
                }
                pe7Var2.H0(zxaVarM, dyaVarO, null, null);
                pe7Var = pe7Var2;
            } else {
                pe7Var = null;
            }
            if (pe7Var != null) {
                abstractCollection.add(pe7Var);
                if (dqdVar != null) {
                    dqdVar.add(wxaVar);
                    return;
                }
                return;
            }
        }
    }

    public final Collection z() {
        boolean z = this.p;
        u09 u09Var = this.n;
        if (z) {
            Collection collectionE = u09Var.h().e();
            collectionE.getClass();
            return collectionE;
        }
        Object obj = this.b.b;
        u09Var.getClass();
        Collection collectionE2 = u09Var.h().e();
        collectionE2.getClass();
        return collectionE2;
    }
}
