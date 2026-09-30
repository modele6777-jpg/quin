package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class bk7 implements fg, wea {
    public static final /* synthetic */ wn7[] v = {new aya(bk7.class, "settings", "getSettings()Lorg/jetbrains/kotlin/builtins/jvm/JvmBuiltIns$Settings;", 0), new aya(bk7.class, "cloneableType", "getCloneableType()Lorg/jetbrains/kotlin/types/SimpleType;", 0), new aya(bk7.class, "notConsideredDeprecation", "getNotConsideredDeprecation()Lorg/jetbrains/kotlin/descriptors/annotations/Annotations;", 0)};
    public final x09 a;
    public final ee8 b;
    public final tjd c;
    public final ee8 d;
    public final be8 e;
    public final ee8 f;
    public final be8 g;

    public bk7(x09 x09Var, ge8 ge8Var, wj7 wj7Var) {
        this.a = x09Var;
        this.b = new ee8(ge8Var, wj7Var);
        f22 f22Var = new f22(new su4(x09Var, new dx5("java.io"), 1), t99.e("Serializable"), e09.e, l22.INTERFACE, t72.H(new c28(ge8Var, new zj7(this, 1))), ge8Var);
        f22Var.u0(cr8.b, xu4.a, null);
        this.c = f22Var.S();
        this.d = new ee8(ge8Var, new n5(16, this, ge8Var));
        this.e = new be8(ge8Var, new ConcurrentHashMap(3, 1.0f, 2), new qqf(6), 0);
        this.f = new ee8(ge8Var, new zj7(this, 0));
        this.g = ge8Var.b(new x(19, this));
    }

    public final rx7 a(u09 u09Var) {
        dx5 dx5VarA;
        if (u09Var == null) {
            xr7.a(108);
            throw null;
        }
        if (!xr7.b(u09Var, syd.a) && xr7.J(u09Var)) {
            int i = qz3.a;
            ex5 ex5VarF = oz3.f(u09Var);
            ex5VarF.getClass();
            if (ex5VarF.d()) {
                String str = qf7.a;
                j22 j22VarH = qf7.h(ex5VarF);
                if (j22VarH != null && (dx5VarA = j22VarH.a()) != null) {
                    u09 u09VarL = qk2.L(c().a, dx5VarA);
                    if (u09VarL instanceof rx7) {
                        return (rx7) u09VarL;
                    }
                }
            }
        }
        return null;
    }

    @Override // defpackage.fg
    public final Collection b(u09 u09Var) {
        ex5 ex5VarF;
        gec gecVar = gec.y;
        if (u09Var.E() == l22.CLASS) {
            c().getClass();
            rx7 rx7VarA = a(u09Var);
            if (rx7VarA != null) {
                dx5 dx5VarG = qz3.g(rx7VarA);
                ka5 ka5Var = ka5.f;
                ka5Var.getClass();
                String str = qf7.a;
                j22 j22VarG = qf7.g(dx5VarG);
                u09 u09VarJ = j22VarG != null ? ka5Var.j(j22VarG.a()) : null;
                if (u09VarJ != null) {
                    q8f q8fVar = new q8f(k99.y(u09VarJ, rx7VarA));
                    List list = (List) rx7VarA.F0.q.invoke();
                    ArrayList<z12> arrayList = new ArrayList();
                    for (Object obj : list) {
                        z12 z12Var = (z12) obj;
                        if (z12Var.getVisibility().a.b) {
                            Collection collectionP = u09VarJ.p();
                            collectionP.getClass();
                            Collection collection = collectionP;
                            if (!(collection instanceof Collection) || !collection.isEmpty()) {
                                Iterator it = collection.iterator();
                                while (true) {
                                    if (it.hasNext()) {
                                        z12 z12Var2 = (z12) it.next();
                                        z12Var2.getClass();
                                        if (iu9.j(z12Var2, z12Var.d(q8fVar)) == 1) {
                                        }
                                    }
                                }
                            }
                            if (z12Var.G().size() == 1) {
                                List listG = z12Var.G();
                                listG.getClass();
                                y22 y22VarM = ((xrf) s72.X0(listG)).getType().c0().m();
                                if (y22VarM != null) {
                                    int i = qz3.a;
                                    ex5VarF = oz3.f(y22VarM);
                                    ex5VarF.getClass();
                                } else {
                                    ex5VarF = null;
                                }
                                ex5 ex5VarF2 = oz3.f(u09Var);
                                ex5VarF2.getClass();
                                if (pa7.t(ex5VarF, ex5VarF2)) {
                                }
                            }
                            if (!xr7.D(z12Var)) {
                                LinkedHashSet linkedHashSet = ek7.f;
                                String strQ = xo1.q(z12Var, 3);
                                String str2 = qf7.a;
                                j22 j22VarH = qf7.h(qz3.g(rx7VarA).a);
                                if (!linkedHashSet.contains((j22VarH != null ? gk7.c(j22VarH) : y41.f(rx7VarA, gecVar)) + '.' + strQ)) {
                                    arrayList.add(obj);
                                }
                            }
                        }
                    }
                    ArrayList arrayList2 = new ArrayList(t72.u(arrayList, 10));
                    for (z12 z12Var3 : arrayList) {
                        z12Var3.getClass();
                        d36 d36VarJ0 = z12Var3.J0(q8f.b);
                        d36VarJ0.b = u09Var;
                        d36VarJ0.u(u09Var.S());
                        d36VarJ0.Z = true;
                        d36VarJ0.a = q8fVar.a;
                        LinkedHashSet linkedHashSet2 = ek7.g;
                        String strQ2 = xo1.q(z12Var3, 3);
                        String str3 = qf7.a;
                        j22 j22VarH2 = qf7.h(qz3.g(rx7VarA).a);
                        if (!linkedHashSet2.contains((j22VarH2 != null ? gk7.c(j22VarH2) : y41.f(rx7VarA, gecVar)) + '.' + strQ2)) {
                            d36VarJ0.p((h10) gdc.f(this.f, v[2]));
                        }
                        e36 e36VarG0 = d36VarJ0.M0.G0(d36VarJ0);
                        e36VarG0.getClass();
                        arrayList2.add((z12) e36VarG0);
                    }
                    return arrayList2;
                }
            }
        }
        return pu4.a;
    }

    public final xj7 c() {
        return (xj7) gdc.f(this.b, v[0]);
    }

    @Override // defpackage.fg
    public final Collection d(u09 u09Var) {
        Set setC;
        u09Var.getClass();
        c().getClass();
        rx7 rx7VarA = a(u09Var);
        if (rx7VarA == null || (setC = rx7VarA.u0().c()) == null) {
            setC = xu4.a;
        }
        return setC;
    }

    @Override // defpackage.fg
    public final Collection f(u09 u09Var) {
        int i = qz3.a;
        ex5 ex5VarF = oz3.f(u09Var);
        ex5VarF.getClass();
        LinkedHashSet linkedHashSet = ek7.a;
        ex5 ex5Var = syd.g;
        boolean zEquals = ex5VarF.equals(ex5Var);
        boolean zIsAssignableFrom = false;
        tjd tjdVar = this.c;
        if (!zEquals) {
            HashMap map = syd.g0;
            if (map.get(ex5VarF) == null) {
                if (ex5VarF.equals(ex5Var) || map.get(ex5VarF) != null) {
                    zIsAssignableFrom = true;
                } else {
                    String str = qf7.a;
                    j22 j22VarH = qf7.h(ex5VarF);
                    if (j22VarH != null) {
                        try {
                            zIsAssignableFrom = Serializable.class.isAssignableFrom(Class.forName(j22VarH.a().a.a));
                        } catch (ClassNotFoundException unused) {
                        }
                    }
                }
                return zIsAssignableFrom ? t72.H(tjdVar) : pu4.a;
            }
        }
        return t72.I((tjd) gdc.f(this.d, v[1]), tjdVar);
    }

    @Override // defpackage.fg
    public final Collection g(t99 t99Var, u09 u09Var) {
        hjd hjdVar;
        h10 h10Var;
        Set setP;
        boolean zBooleanValue;
        u09Var.getClass();
        boolean zEquals = t99Var.equals(q52.e);
        lf9 lf9Var = lf9.a;
        wn7[] wn7VarArr = v;
        List<hjd> list = pu4.a;
        if (zEquals && (u09Var instanceof d04) && (xr7.b(u09Var, syd.g) || xr7.s(u09Var) != null)) {
            d04 d04Var = (d04) u09Var;
            List listR0 = d04Var.e.r0();
            listR0.getClass();
            if (!listR0.isEmpty()) {
                Iterator it = listR0.iterator();
                while (it.hasNext()) {
                    if (i7h.v((u99) d04Var.z.c, ((dza) it.next()).g0()).equals(q52.e)) {
                        return list;
                    }
                }
            }
            b36 b36VarD0 = ((hjd) s72.W0(((tjd) gdc.f(this.d, wn7VarArr[1])).F().b(t99Var, lf9Var))).d0();
            b36VarD0.z(d04Var);
            b36VarD0.q(sz3.e);
            b36VarD0.u(d04Var.S());
            b36VarD0.f(d04Var.i0());
            c36 c36VarBuild = b36VarD0.build();
            c36VarBuild.getClass();
            return t72.H((hjd) c36VarBuild);
        }
        c().getClass();
        rx7 rx7VarA = a(u09Var);
        if (rx7VarA != null) {
            dx5 dx5VarG = qz3.g(rx7VarA);
            ka5 ka5Var = ka5.f;
            ka5Var.getClass();
            String str = qf7.a;
            j22 j22VarG = qf7.g(dx5VarG);
            u09 u09VarJ = j22VarG != null ? ka5Var.j(j22VarG.a()) : null;
            if (u09VarJ == null) {
                setP = xu4.a;
            } else {
                ex5 ex5VarF = oz3.f(u09VarJ);
                ex5VarF.getClass();
                dx5 dx5VarI = qf7.i(ex5VarF);
                setP = dx5VarI == null ? n3d.p(u09VarJ) : t72.I(u09VarJ, ka5Var.j(dx5VarI));
            }
            Iterable iterable = setP;
            u09 u09Var2 = (u09) s72.G0(iterable);
            if (u09Var2 != null) {
                int i = dqd.c;
                ArrayList arrayList = new ArrayList(t72.u(iterable, 10));
                Iterator it2 = iterable.iterator();
                while (it2.hasNext()) {
                    arrayList.add(qz3.g((u09) it2.next()));
                }
                dqd dqdVar = new dqd();
                dqdVar.addAll(arrayList);
                String str2 = qf7.a;
                boolean zContainsKey = qf7.j.containsKey(oz3.f(u09Var));
                dx5 dx5VarG2 = qz3.g(rx7VarA);
                n5 n5Var = new n5(rx7VarA, u09Var2, false, 17);
                be8 be8Var = this.e;
                be8Var.getClass();
                Object objD = be8Var.d(new ce8(dx5VarG2, n5Var));
                if (objD == null) {
                    be8.a(3);
                    throw null;
                }
                dr8 dr8VarK0 = ((u09) objD).k0();
                dr8VarK0.getClass();
                Collection collectionB = dr8VarK0.b(t99Var, lf9Var);
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : collectionB) {
                    hjd hjdVar2 = (hjd) obj;
                    if (hjdVar2.g() == 1 && hjdVar2.getVisibility().a.b && !xr7.D(hjdVar2)) {
                        Collection collectionL = hjdVar2.l();
                        if (!(collectionL instanceof Collection) || !collectionL.isEmpty()) {
                            Iterator it3 = collectionL.iterator();
                            while (true) {
                                if (it3.hasNext()) {
                                    bm3 bm3VarK = ((c36) it3.next()).k();
                                    bm3VarK.getClass();
                                    if (dqdVar.contains(qz3.g(bm3VarK))) {
                                    }
                                }
                            }
                        }
                        bm3 bm3VarK2 = hjdVar2.k();
                        bm3VarK2.getClass();
                        u09 u09Var3 = (u09) bm3VarK2;
                        String strQ = xo1.q(hjdVar2, 3);
                        LinkedHashSet linkedHashSet = ek7.e;
                        String str3 = qf7.a;
                        j22 j22VarH = qf7.h(qz3.g(u09Var3).a);
                        if (linkedHashSet.contains((j22VarH != null ? gk7.c(j22VarH) : y41.f(u09Var3, gec.y)) + '.' + strQ) ^ zContainsKey) {
                            zBooleanValue = true;
                        } else {
                            Boolean boolW = od4.w(t72.H(hjdVar2), af8.F0, new qqf(5, this));
                            boolW.getClass();
                            zBooleanValue = boolW.booleanValue();
                        }
                        if (!zBooleanValue) {
                            arrayList2.add(obj);
                        }
                    }
                }
                list = arrayList2;
            }
        }
        ArrayList arrayList3 = new ArrayList();
        for (hjd hjdVar3 : list) {
            bm3 bm3VarK3 = hjdVar3.k();
            bm3VarK3.getClass();
            c36 c36VarD = hjdVar3.d(new q8f(k99.y((u09) bm3VarK3, u09Var)));
            c36VarD.getClass();
            b36 b36VarD1 = ((hjd) c36VarD).d0();
            b36VarD1.z(u09Var);
            b36VarD1.f(u09Var.i0());
            b36VarD1.g();
            bm3 bm3VarK4 = hjdVar3.k();
            bm3VarK4.getClass();
            Object objM = od4.m(t72.H((u09) bm3VarK4), new kd9(16, this), new l23(xo1.q(hjdVar3, 3), new mmb(), 2));
            objM.getClass();
            int iOrdinal = ((ak7) objM).ordinal();
            if (iOrdinal != 0) {
                if (iOrdinal != 1) {
                    if (iOrdinal == 2) {
                        t99 name = hjdVar3.getName();
                        boolean zT = pa7.t(name, ck7.a);
                        be8 be8Var2 = this.g;
                        if (zT) {
                            h10Var = (h10) be8Var2.d(new iy9(hjdVar3.getName().b(), "first"));
                        } else {
                            if (!pa7.t(name, ck7.b)) {
                                cva.k(hjdVar3.getName(), "Unexpected name: ");
                                return null;
                            }
                            h10Var = (h10) be8Var2.d(new iy9(hjdVar3.getName().b(), "last"));
                        }
                        b36VarD1.p(h10Var);
                    } else if (iOrdinal != 3) {
                        if (iOrdinal != 4) {
                            ap.c();
                            return null;
                        }
                        hjdVar = null;
                    } else {
                        b36VarD1.p((h10) gdc.f(this.f, wn7VarArr[2]));
                    }
                }
                c36 c36VarBuild2 = b36VarD1.build();
                c36VarBuild2.getClass();
                hjdVar = (hjd) c36VarBuild2;
            } else if (u09Var.i() != e09.b || u09Var.E() == l22.ENUM_CLASS) {
                b36VarD1.n();
                c36 c36VarBuild3 = b36VarD1.build();
                c36VarBuild3.getClass();
                hjdVar = (hjd) c36VarBuild3;
            } else {
                hjdVar = null;
            }
            if (hjdVar != null) {
                arrayList3.add(hjdVar);
            }
        }
        return arrayList3;
    }

    @Override // defpackage.wea
    public final boolean k(u09 u09Var, r04 r04Var) {
        u09Var.getClass();
        rx7 rx7VarA = a(u09Var);
        if (rx7VarA == null || !r04Var.getAnnotations().E(xea.a)) {
            return true;
        }
        c().getClass();
        String strQ = xo1.q(r04Var, 3);
        wx7 wx7VarU0 = rx7VarA.u0();
        t99 name = r04Var.getName();
        name.getClass();
        Collection collectionB = wx7VarU0.b(name, lf9.a);
        if ((collectionB instanceof Collection) && collectionB.isEmpty()) {
            return false;
        }
        Iterator it = collectionB.iterator();
        while (it.hasNext()) {
            if (xo1.q((hjd) it.next(), 3).equals(strQ)) {
                return true;
            }
        }
        return false;
    }
}
