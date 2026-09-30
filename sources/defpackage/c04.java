package defpackage;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class c04 extends j0 {
    public final /* synthetic */ int c = 0;
    public final ee8 d;
    public final /* synthetic */ i0 e;

    /* JADX WARN: Illegal instructions before constructor call */
    public c04(d04 d04Var) {
        this.e = d04Var;
        lp0 lp0Var = d04Var.z;
        super(((tz3) lp0Var.b).a);
        ge8 ge8Var = ((tz3) lp0Var.b).a;
        xz3 xz3Var = new xz3(d04Var, 6);
        ge8Var.getClass();
        this.d = new ee8(ge8Var, xz3Var);
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0245  */
    /* JADX WARN: Code duplicated, block: B:104:0x0257  */
    /* JADX WARN: Code duplicated, block: B:106:0x025a  */
    /* JADX WARN: Code duplicated, block: B:108:0x025f  */
    /* JADX WARN: Code duplicated, block: B:111:0x0268  */
    /* JADX WARN: Code duplicated, block: B:114:0x027d A[LOOP:1: B:112:0x0277->B:114:0x027d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:116:0x029f  */
    /* JADX WARN: Code duplicated, block: B:118:0x02a5  */
    /* JADX WARN: Code duplicated, block: B:119:0x02aa  */
    /* JADX WARN: Code duplicated, block: B:162:0x0086 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:17:0x0086  */
    /* JADX WARN: Code duplicated, block: B:44:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:54:0x0100  */
    /* JADX WARN: Code duplicated, block: B:59:0x0115  */
    /* JADX WARN: Code duplicated, block: B:85:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:87:0x0213  */
    /* JADX WARN: Code duplicated, block: B:90:0x0220  */
    /* JADX WARN: Code duplicated, block: B:93:0x0229  */
    /* JADX WARN: Code duplicated, block: B:94:0x022e  */
    /* JADX WARN: Instruction removed from duplicated block: B:17:0x0086, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v12, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r4v14, types: [java.util.Collection] */
    /* JADX WARN: Type inference failed for: r4v29 */
    @Override // defpackage.m5
    public final Collection a() {
        String strB;
        dx5 dx5VarA;
        ?? arrayList;
        String str;
        dx5 dx5Var;
        dx5 dx5Var2;
        ArrayList arrayList2;
        tjd tjdVarS;
        u09 u09Var;
        tt7 tt7VarH;
        ArrayList arrayList3;
        tt7 tt7VarT;
        tt7 tt7VarI;
        j7f j7fVarC0;
        j7f j7fVarC1;
        int i = this.c;
        i0 i0Var = this.e;
        switch (i) {
            case 0:
                d04 d04Var = (d04) i0Var;
                nya nyaVar = d04Var.e;
                lp0 lp0Var = d04Var.z;
                List listV = feg.V(nyaVar, (bu3) lp0Var.e);
                ArrayList arrayList4 = new ArrayList(t72.u(listV, 10));
                Iterator it = listV.iterator();
                while (it.hasNext()) {
                    arrayList4.add(((o7f) lp0Var.w).g((vza) it.next()));
                }
                ArrayList arrayListQ0 = s72.Q0(arrayList4, ((tz3) lp0Var.b).n.f(d04Var));
                ArrayList<vg9> arrayList5 = new ArrayList();
                Iterator it2 = arrayListQ0.iterator();
                while (it2.hasNext()) {
                    y22 y22VarM = ((tt7) it2.next()).c0().m();
                    vg9 vg9Var = y22VarM instanceof vg9 ? (vg9) y22VarM : null;
                    if (vg9Var != null) {
                        arrayList5.add(vg9Var);
                    }
                }
                if (!arrayList5.isEmpty()) {
                    ky4 ky4Var = ((tz3) lp0Var.b).h;
                    ArrayList arrayList6 = new ArrayList(t72.u(arrayList5, 10));
                    for (vg9 vg9Var2 : arrayList5) {
                        j22 j22VarF = qz3.f(vg9Var2);
                        if (j22VarF == null || (dx5VarA = j22VarF.a()) == null || (strB = dx5VarA.a.a) == null) {
                            strB = vg9Var2.getName().b();
                            strB.getClass();
                        }
                        arrayList6.add(strB);
                    }
                    ky4Var.g(d04Var, arrayList6);
                }
                return s72.j1(arrayListQ0);
            default:
                rx7 rx7Var = (rx7) i0Var;
                szc szcVar = rx7Var.x;
                Class cls = rx7Var.v.a;
                boolean zEquals = cls.equals(Object.class);
                pu4 pu4Var = pu4.a;
                if (zEquals) {
                    arrayList = pu4Var;
                } else {
                    mx mxVar = new mx(2);
                    Type genericSuperclass = cls.getGenericSuperclass();
                    mxVar.b(genericSuperclass != null ? genericSuperclass : Object.class);
                    mxVar.c(cls.getGenericInterfaces());
                    ArrayList arrayList7 = mxVar.a;
                    List listI = t72.I(arrayList7.toArray(new Type[arrayList7.size()]));
                    arrayList = new ArrayList(t72.u(listI, 10));
                    Iterator it3 = listI.iterator();
                    while (it3.hasNext()) {
                        arrayList.add(new hnb((Type) it3.next()));
                    }
                }
                ArrayList arrayList8 = new ArrayList(arrayList.size());
                ArrayList<snb> arrayList9 = new ArrayList(0);
                px7 px7Var = rx7Var.J0;
                dx5 dx5Var3 = pj7.p;
                dx5Var3.getClass();
                u00 u00VarR = px7Var.R(dx5Var3);
                if (u00VarR != null) {
                    Object objY0 = s72.Y0(u00VarR.g().values());
                    t4e t4eVar = objY0 instanceof t4e ? (t4e) objY0 : null;
                    if (t4eVar != null && (str = (String) t4eVar.a) != null) {
                        int length = str.length();
                        j0e j0eVar = j0e.a;
                        int i2 = 0;
                        while (true) {
                            j0e j0eVar2 = j0e.c;
                            if (i2 < length) {
                                char cCharAt = str.charAt(i2);
                                int iOrdinal = j0eVar.ordinal();
                                if (iOrdinal == 0) {
                                    if (!Character.isJavaIdentifierStart(cCharAt)) {
                                        j0eVar = j0e.b;
                                        i2++;
                                    }
                                } else if (iOrdinal != 1) {
                                    if (iOrdinal != 2) {
                                        ap.c();
                                        return null;
                                    }
                                    if (!Character.isJavaIdentifierStart(cCharAt)) {
                                        j0eVar = j0e.b;
                                        i2++;
                                    }
                                } else {
                                    if (cCharAt == '.') {
                                        j0eVar = j0eVar2;
                                    } else if (!Character.isJavaIdentifierPart(cCharAt)) {
                                    }
                                    i2++;
                                }
                            } else {
                                dx5Var = j0eVar != j0eVar2 ? new dx5(str) : null;
                            }
                        }
                    }
                }
                if (dx5Var != null) {
                    ex5 ex5Var = dx5Var.a;
                    if (ex5Var.c()) {
                        dx5Var = null;
                    } else {
                        t99 t99Var = tyd.j;
                        t99Var.getClass();
                        if (!ex5Var.h(t99Var)) {
                            dx5Var = null;
                        }
                    }
                } else {
                    dx5Var = null;
                }
                dsf dsfVar = dsf.INVARIANT;
                if (dx5Var == null) {
                    LinkedHashMap linkedHashMap = ja5.a;
                    dx5Var2 = (dx5) ja5.b.get(qz3.g(rx7Var));
                    if (dx5Var2 == null) {
                        tjdVarS = null;
                    }
                    for (hnb hnbVar : arrayList) {
                        tt7VarT = ((ta0) szcVar.e).T(hnbVar, vfh.Q(t8f.a, false, null, 7));
                        tt7VarI = ((mf7) szcVar.b).k.i(new xs6((f00) null, false, szcVar, y00.TYPE_USE, true), tt7VarT, pu4Var, null, false);
                        if (tt7VarI == null) {
                            tt7VarI = tt7VarT;
                        }
                        if (tt7VarI.c0().m() instanceof vg9) {
                            arrayList9.add(hnbVar);
                        }
                        j7fVarC0 = tt7VarI.c0();
                        if (tjdVarS != null) {
                            j7fVarC1 = tjdVarS.c0();
                        } else {
                            j7fVarC1 = null;
                        }
                        if (!pa7.t(j7fVarC0, j7fVarC1) && !xr7.y(tt7VarI)) {
                            arrayList8.add(tt7VarI);
                        }
                    }
                    u09Var = rx7Var.w;
                    if (u09Var != null) {
                        tt7VarH = new q8f(k99.y(u09Var, rx7Var)).h(u09Var.S(), dsfVar);
                    } else {
                        tt7VarH = null;
                    }
                    if (tt7VarH != null) {
                        arrayList8.add(tt7VarH);
                    }
                    if (tjdVarS != null) {
                        arrayList8.add(tjdVarS);
                    }
                    if (!arrayList9.isEmpty()) {
                        return !arrayList8.isEmpty() ? s72.j1(arrayList8) : t72.H(((mf7) szcVar.b).h.e.e());
                    }
                    Object obj = szcVar.b;
                    arrayList3 = new ArrayList(t72.u(arrayList9, 10));
                    for (snb snbVar : arrayList9) {
                        snbVar.getClass();
                        arrayList3.add(((hnb) snbVar).a.toString());
                    }
                    cva.n("Incomplete hierarchy for class ", rx7Var.getName(), ", unresolved classes ", arrayList3);
                    return null;
                }
                dx5Var2 = dx5Var;
                x09 x09Var = ((mf7) szcVar.b).h;
                int i3 = qz3.a;
                ex5 ex5Var2 = dx5Var2.a;
                ex5Var2.c();
                y22 y22VarE = x09Var.W(dx5Var2.b()).v.e(ex5Var2.g(), lf9.v);
                u09 u09Var2 = y22VarE instanceof u09 ? (u09) y22VarE : null;
                if (u09Var2 == null) {
                    tjdVarS = null;
                } else {
                    int size = u09Var2.h().getParameters().size();
                    List parameters = rx7Var.E0.getParameters();
                    parameters.getClass();
                    int size2 = parameters.size();
                    if (size2 == size) {
                        arrayList2 = new ArrayList(t72.u(parameters, 10));
                        Iterator it4 = parameters.iterator();
                        while (it4.hasNext()) {
                            arrayList2.add(new dzd(((c8f) it4.next()).S(), dsfVar));
                        }
                    } else if (size2 == 1 && size > 1 && dx5Var == null) {
                        dzd dzdVar = new dzd(((c8f) s72.X0(parameters)).S(), dsfVar);
                        z67 z67Var = new z67(1, size, 1);
                        ArrayList arrayList10 = new ArrayList(t72.u(z67Var, 10));
                        Iterator it5 = z67Var.iterator();
                        while (((y67) it5).c) {
                            ((q67) it5).nextInt();
                            arrayList10.add(dzdVar);
                        }
                        arrayList2 = arrayList10;
                    } else {
                        tjdVarS = null;
                    }
                    e7f.b.getClass();
                    tjdVarS = rxg.S(e7f.c, u09Var2, arrayList2);
                }
                while (r17.hasNext()) {
                    tt7VarT = ((ta0) szcVar.e).T(hnbVar, vfh.Q(t8f.a, false, null, 7));
                    tt7VarI = ((mf7) szcVar.b).k.i(new xs6((f00) null, false, szcVar, y00.TYPE_USE, true), tt7VarT, pu4Var, null, false);
                    if (tt7VarI == null) {
                        tt7VarI = tt7VarT;
                    }
                    if (tt7VarI.c0().m() instanceof vg9) {
                        arrayList9.add(hnbVar);
                    }
                    j7fVarC0 = tt7VarI.c0();
                    if (tjdVarS != null) {
                        j7fVarC1 = tjdVarS.c0();
                    } else {
                        j7fVarC1 = null;
                    }
                    if (!pa7.t(j7fVarC0, j7fVarC1)) {
                        arrayList8.add(tt7VarI);
                    }
                }
                u09Var = rx7Var.w;
                if (u09Var != null) {
                    tt7VarH = new q8f(k99.y(u09Var, rx7Var)).h(u09Var.S(), dsfVar);
                } else {
                    tt7VarH = null;
                }
                if (tt7VarH != null) {
                    arrayList8.add(tt7VarH);
                }
                if (tjdVarS != null) {
                    arrayList8.add(tjdVarS);
                }
                if (!arrayList9.isEmpty()) {
                    if (!arrayList8.isEmpty()) {
                    }
                }
                Object obj2 = szcVar.b;
                arrayList3 = new ArrayList(t72.u(arrayList9, 10));
                while (r2.hasNext()) {
                    snbVar.getClass();
                    arrayList3.add(((hnb) snbVar).a.toString());
                }
                cva.n("Incomplete hierarchy for class ", rx7Var.getName(), ", unresolved classes ", arrayList3);
                return null;
        }
    }

    @Override // defpackage.m5
    public final m8c c() {
        switch (this.c) {
            case 0:
                break;
            default:
                Object obj = ((rx7) this.e).x.b;
                break;
        }
        return m8c.e;
    }

    @Override // defpackage.j7f
    public final List getParameters() {
        switch (this.c) {
            case 0:
                break;
        }
        return (List) this.d.invoke();
    }

    @Override // defpackage.j0
    /* JADX INFO: renamed from: j */
    public final u09 m() {
        int i = this.c;
        i0 i0Var = this.e;
        switch (i) {
            case 0:
                return (d04) i0Var;
            default:
                return (rx7) i0Var;
        }
    }

    @Override // defpackage.j0, defpackage.j7f
    public final y22 m() {
        int i = this.c;
        i0 i0Var = this.e;
        switch (i) {
            case 0:
                return (d04) i0Var;
            default:
                return (rx7) i0Var;
        }
    }

    @Override // defpackage.j7f
    public final boolean t() {
        switch (this.c) {
        }
        return true;
    }

    public final String toString() {
        int i = this.c;
        i0 i0Var = this.e;
        switch (i) {
            case 0:
                String str = ((d04) i0Var).getName().a;
                str.getClass();
                return str;
            default:
                String strB = ((rx7) i0Var).getName().b();
                strB.getClass();
                return strB;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public c04(rx7 rx7Var) {
        this.e = rx7Var;
        szc szcVar = rx7Var.x;
        super(((mf7) szcVar.b).a);
        this.d = new ee8(((mf7) szcVar.b).a, new qx7(rx7Var, 2));
    }
}
