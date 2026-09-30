package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class o7f {
    public final lp0 a;
    public final o7f b;
    public final String c;
    public final String d;
    public final mz0 e;
    public final mz0 f;
    public final Map g;

    public o7f(lp0 lp0Var, o7f o7fVar, List list, String str, String str2) {
        Map linkedHashMap;
        this.a = lp0Var;
        this.b = o7fVar;
        this.c = str;
        this.d = str2;
        ge8 ge8Var = ((tz3) lp0Var.b).a;
        int i = 0;
        this.e = ge8Var.c(new m7f(this, i));
        this.f = ge8Var.c(new m7f(this, 1));
        if (list.isEmpty()) {
            linkedHashMap = qu4.a;
        } else {
            linkedHashMap = new LinkedHashMap();
            Iterator it = list.iterator();
            while (it.hasNext()) {
                a0b a0bVar = (a0b) it.next();
                linkedHashMap.put(Integer.valueOf(a0bVar.H()), new t04(this.a, a0bVar, i));
                i++;
            }
        }
        this.g = linkedHashMap;
    }

    public static tjd a(tjd tjdVar, tt7 tt7Var) {
        xr7 xr7VarP = o7c.p(tjdVar);
        h10 annotations = tjdVar.getAnnotations();
        tt7 tt7VarN = oa7.N(tjdVar);
        List listL = oa7.L(tjdVar);
        List listS0 = s72.s0(1, oa7.P(tjdVar));
        ArrayList arrayList = new ArrayList(t72.u(listS0, 10));
        Iterator it = listS0.iterator();
        while (it.hasNext()) {
            arrayList.add(((i8f) it.next()).b());
        }
        return oa7.I(xr7VarP, annotations, tt7VarN, listL, arrayList, tt7Var, true).l0(tjdVar.i0());
    }

    public static final ArrayList e(vza vzaVar, o7f o7fVar) {
        List listR = vzaVar.R();
        listR.getClass();
        vza vzaVarM = feg.M(vzaVar, (bu3) o7fVar.a.e);
        Iterable iterableE = vzaVarM != null ? e(vzaVarM, o7fVar) : null;
        if (iterableE == null) {
            iterableE = pu4.a;
        }
        return s72.Q0(listR, iterableE);
    }

    public static e7f f(List list, h10 h10Var) {
        e7f e7fVarE;
        ArrayList arrayList = new ArrayList(t72.u(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((cu3) it.next()).getClass();
            if (h10Var.isEmpty()) {
                e7f.b.getClass();
                e7fVarE = e7f.c;
            } else {
                lqb lqbVar = e7f.b;
                List listH = t72.H(new k10(h10Var));
                lqbVar.getClass();
                e7fVarE = lqb.e(listH);
            }
            arrayList.add(e7fVarE);
        }
        ArrayList arrayListY = t72.y(arrayList);
        e7f.b.getClass();
        return lqb.e(arrayListY);
    }

    public static final u09 h(o7f o7fVar, vza vzaVar, int i) {
        lp0 lp0Var = o7fVar.a;
        j22 j22VarU = i7h.u((u99) lp0Var.c, i);
        c3f c3fVarX = fyc.x(fyc.u(new m7f(o7fVar, 2), vzaVar), vic.K0);
        ArrayList arrayList = new ArrayList();
        Iterator it = c3fVarX.iterator();
        while (true) {
            b3f b3fVar = (b3f) it;
            if (!b3fVar.hasNext()) {
                break;
            }
            arrayList.add(b3fVar.next());
        }
        Iterator it2 = fyc.u(n7f.a, j22VarU).iterator();
        int i2 = 0;
        while (it2.hasNext()) {
            it2.next();
            i2++;
            if (i2 < 0) {
                t72.Y();
                throw null;
            }
        }
        while (arrayList.size() < i2) {
            arrayList.add(0);
        }
        return ((tz3) lp0Var.b).l.J(j22VarU, arrayList);
    }

    public final List b() {
        return s72.j1(this.g.values());
    }

    public final c8f c(int i) {
        c8f c8fVar = (c8f) this.g.get(Integer.valueOf(i));
        if (c8fVar != null) {
            return c8fVar;
        }
        o7f o7fVar = this.b;
        if (o7fVar != null) {
            return o7fVar.c(i);
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:101:0x02c1  */
    /* JADX WARN: Code duplicated, block: B:102:0x02c5  */
    /* JADX WARN: Code duplicated, block: B:106:0x02e3  */
    /* JADX WARN: Code duplicated, block: B:108:0x02f1  */
    /* JADX WARN: Code duplicated, block: B:113:0x02fc  */
    /* JADX WARN: Code duplicated, block: B:118:0x0314  */
    /* JADX WARN: Code duplicated, block: B:125:0x0331  */
    /* JADX WARN: Code duplicated, block: B:126:0x0336  */
    /* JADX WARN: Code duplicated, block: B:129:0x0341  */
    /* JADX WARN: Code duplicated, block: B:147:0x038c  */
    /* JADX WARN: Code duplicated, block: B:148:0x0398  */
    /* JADX WARN: Code duplicated, block: B:149:0x039b  */
    /* JADX WARN: Code duplicated, block: B:151:0x03b3  */
    /* JADX WARN: Code duplicated, block: B:153:0x03b9  */
    /* JADX WARN: Code duplicated, block: B:154:0x03bb  */
    /* JADX WARN: Code duplicated, block: B:158:0x03c9  */
    /* JADX WARN: Code duplicated, block: B:160:0x03d3 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:162:0x01fa A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:163:0x01b9 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:44:0x012b  */
    /* JADX WARN: Code duplicated, block: B:46:0x0144  */
    /* JADX WARN: Code duplicated, block: B:49:0x0172  */
    /* JADX WARN: Code duplicated, block: B:51:0x017a  */
    /* JADX WARN: Code duplicated, block: B:53:0x0193 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:54:0x0195  */
    /* JADX WARN: Code duplicated, block: B:55:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:56:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:58:0x01b4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:59:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:63:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:65:0x01c0  */
    /* JADX WARN: Code duplicated, block: B:67:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:68:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:69:0x01cc  */
    /* JADX WARN: Code duplicated, block: B:72:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:73:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:96:0x029c  */
    /* JADX WARN: Code duplicated, block: B:98:0x02ac  */
    public final tjd d(vza vzaVar, boolean z) {
        j7f j7fVarD;
        y22 y22VarH;
        Object next;
        e7f e7fVarF;
        ArrayList arrayList;
        int i;
        List listJ1;
        tjd tjdVarT;
        kv3 kv3VarK0;
        boolean zX;
        int size;
        tjd tjdVarT2;
        y22 y22VarM;
        m36 m36VarM;
        i8f i8fVar;
        tt7 tt7VarB;
        y22 y22VarM2;
        dx5 dx5VarG;
        tjd tjdVar;
        tjd tjdVarA;
        int size2;
        vza vzaVarP;
        int i2;
        tza tzaVar;
        c8f c8fVar;
        sza szaVarO;
        int iOrdinal;
        dsf dsfVar;
        vza vzaVarX;
        d7f dzdVar;
        lp0 lp0Var = this.a;
        bu3 bu3Var = (bu3) lp0Var.e;
        bm3 bm3Var = (bm3) lp0Var.d;
        tz3 tz3Var = (tz3) lp0Var.b;
        vzaVar.getClass();
        if (vzaVar.f0()) {
            if (i7h.u((u99) lp0Var.c, vzaVar.S()).c) {
                ((tz3) lp0Var.b).g.getClass();
            }
        } else if (vzaVar.n0()) {
            if (i7h.u((u99) lp0Var.c, vzaVar.a0()).c) {
                ((tz3) lp0Var.b).g.getClass();
            }
        }
        boolean z2 = false;
        if (!vzaVar.f0()) {
            if (vzaVar.o0()) {
                y22VarH = c(vzaVar.b0());
                if (y22VarH == null) {
                    sy4 sy4Var = sy4.a;
                    j7fVarD = sy4.d(qy4.X, String.valueOf(vzaVar.b0()), this.d);
                }
            } else if (vzaVar.p0()) {
                String string = ((u99) lp0Var.c).getString(vzaVar.c0());
                Iterator it = b().iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!pa7.t(((c8f) next).getName().b(), string));
                c8f c8fVar2 = (c8f) next;
                if (c8fVar2 == null) {
                    sy4 sy4Var2 = sy4.a;
                    j7fVarD = sy4.d(qy4.Y, string, bm3Var.toString());
                } else {
                    y22VarH = c8fVar2;
                }
            } else if (vzaVar.n0()) {
                y22VarH = (y22) this.f.d(Integer.valueOf(vzaVar.a0()));
                if (y22VarH == null) {
                    y22VarH = h(this, vzaVar, vzaVar.a0());
                }
            } else {
                sy4 sy4Var3 = sy4.a;
                j7fVarD = sy4.d(qy4.E0, new String[0]);
            }
            boolean z3 = true;
            if (sy4.f(j7fVarD.m())) {
                sy4 sy4Var4 = sy4.a;
                return sy4.e(qy4.J0, pu4.a, j7fVarD, (String[]) Arrays.copyOf(new String[]{j7fVarD.toString()}, 1));
            }
            uz3 uz3Var = new uz3(tz3Var.a, new n5(this, vzaVar, z2, 27));
            e7fVarF = f(tz3Var.r, uz3Var);
            ArrayList arrayListE = e(vzaVar, this);
            arrayList = new ArrayList(t72.u(arrayListE, 10));
            i = 0;
            for (Object obj : arrayListE) {
                i2 = i + 1;
                if (i >= 0) {
                    t72.Z();
                    throw null;
                }
                tzaVar = (tza) obj;
                List parameters = j7fVarD.getParameters();
                parameters.getClass();
                c8fVar = (c8f) s72.y0(i, parameters);
                if (tzaVar.o() == sza.STAR) {
                    szaVarO = tzaVar.o();
                    szaVarO.getClass();
                    iOrdinal = szaVarO.ordinal();
                    if (iOrdinal != 0) {
                        dsfVar = dsf.IN_VARIANCE;
                    } else if (iOrdinal != 1) {
                        dsfVar = dsf.OUT_VARIANCE;
                    } else {
                        if (iOrdinal != 2) {
                            if (iOrdinal != 3) {
                                ap.c();
                                return null;
                            }
                            yg5.l(szaVarO, "Only IN, OUT and INV are supported. Actual argument: ");
                            return null;
                        }
                        dsfVar = dsf.INVARIANT;
                    }
                    vzaVarX = feg.X(tzaVar, bu3Var);
                    if (vzaVarX == null) {
                        dzdVar = new dzd(sy4.c(qy4.O0, tzaVar.toString()));
                    } else {
                        dzdVar = new dzd(g(vzaVarX), dsfVar);
                    }
                } else if (c8fVar == null) {
                    dzdVar = new czd(tz3Var.b.f());
                } else {
                    dzdVar = new dzd(c8fVar);
                }
                arrayList.add(dzdVar);
                i = i2;
            }
            listJ1 = s72.j1(arrayList);
            y22 y22VarM3 = j7fVarD.m();
            if (!z && (y22VarM3 instanceof s04)) {
                s04 s04Var = (s04) y22VarM3;
                w1e w1eVar = new w1e(6);
                List parameters2 = s04Var.w.getParameters();
                ArrayList arrayList2 = new ArrayList(t72.u(parameters2, 10));
                Iterator it2 = parameters2.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(((c8f) it2.next()).a());
                }
                kxa kxaVar = new kxa(null, s04Var, listJ1, bm8.W(s72.r1(arrayList2, listJ1)));
                e7f.b.getClass();
                e7f e7fVar = e7f.c;
                e7fVar.getClass();
                tjd tjdVarI = w1eVar.i(kxaVar, e7fVar, false, 0, true);
                List list = tz3Var.r;
                ArrayList arrayListO0 = s72.O0(uz3Var, tjdVarI.getAnnotations());
                e7f e7fVarF2 = f(list, arrayListO0.isEmpty() ? hj6.c : new j10(0, arrayListO0));
                if (!w8f.e(tjdVarI) && !vzaVar.X()) {
                    z3 = false;
                }
                tjdVarT = tjdVarI.l0(z3).n0(e7fVarF2);
            } else if (oi5.a.e(vzaVar.T()).booleanValue()) {
                zX = vzaVar.X();
                size = j7fVarD.getParameters().size() - listJ1.size();
                if (size == 0) {
                    tjdVarT2 = rxg.T(e7fVarF, j7fVarD, listJ1, zX);
                    y22VarM = tjdVarT2.c0().m();
                    if (y22VarM == null && (y22VarM instanceof u09) && xr7.J(y22VarM)) {
                        int i3 = qz3.a;
                        ex5 ex5VarF = oz3.f(y22VarM);
                        ex5VarF.getClass();
                        m36VarM = oa7.M(ex5VarF);
                    } else {
                        m36VarM = null;
                    }
                    if (pa7.t(m36VarM, i36.d) || (i8fVar = (i8f) s72.H0(oa7.P(tjdVarT2))) == null || (tt7VarB = i8fVar.b()) == null) {
                        tjdVar = null;
                    } else {
                        y22VarM2 = tt7VarB.c0().m();
                        if (y22VarM2 != null) {
                            dx5VarG = qz3.g(y22VarM2);
                        } else {
                            dx5VarG = null;
                        }
                        if (tt7VarB.Z().size() == 1 || !(pa7.t(dx5VarG, tyd.g) || pa7.t(dx5VarG, p7f.a))) {
                            tjdVar = tjdVarT2;
                        } else {
                            tt7 tt7VarB2 = ((i8f) s72.X0(tt7VarB.Z())).b();
                            tt7VarB2.getClass();
                            ca1 ca1Var = bm3Var instanceof ca1 ? (ca1) bm3Var : null;
                            tjdVarA = pa7.t(ca1Var != null ? qz3.c(ca1Var) : null, ebe.a) ? a(tjdVarT2, tt7VarB2) : a(tjdVarT2, tt7VarB2);
                            tjdVar = tjdVarA;
                        }
                    }
                } else if (size == 1 && (size2 = listJ1.size() - 1) >= 0) {
                    j7f j7fVarH = j7fVarD.f().w(size2).h();
                    j7fVarH.getClass();
                    tjdVarA = rxg.T(e7fVarF, j7fVarH, listJ1, zX);
                    tjdVar = tjdVarA;
                } else {
                    tjdVar = null;
                }
                if (tjdVar == null) {
                    sy4 sy4Var5 = sy4.a;
                    tjdVarT = sy4.e(qy4.Z, listJ1, j7fVarD, new String[0]);
                } else {
                    tjdVarT = tjdVar;
                }
            } else {
                tjdVarT = rxg.T(e7fVarF, j7fVarD, listJ1, vzaVar.X());
                if (oi5.b.e(vzaVar.T()).booleanValue()) {
                    kv3VarK0 = qfc.K0(tjdVarT, true);
                    if (kv3VarK0 == null) {
                        cva.v(tjdVarT, "null DefinitelyNotNullType for '");
                        return null;
                    }
                    tjdVarT = kv3VarK0;
                }
            }
            vzaVarP = feg.p(vzaVar, bu3Var);
            if (vzaVarP != null) {
                return o7c.E(tjdVarT, d(vzaVarP, false));
            }
            return tjdVarT;
        }
        y22VarH = (y22) this.e.d(Integer.valueOf(vzaVar.S()));
        if (y22VarH == null) {
            y22VarH = h(this, vzaVar, vzaVar.S());
        }
        j7fVarD = y22VarH.h();
        j7fVarD.getClass();
        boolean z4 = true;
        if (sy4.f(j7fVarD.m())) {
            sy4 sy4Var6 = sy4.a;
            return sy4.e(qy4.J0, pu4.a, j7fVarD, (String[]) Arrays.copyOf(new String[]{j7fVarD.toString()}, 1));
        }
        uz3 uz3Var2 = new uz3(tz3Var.a, new n5(this, vzaVar, z2, 27));
        e7fVarF = f(tz3Var.r, uz3Var2);
        ArrayList arrayListE2 = e(vzaVar, this);
        arrayList = new ArrayList(t72.u(arrayListE2, 10));
        i = 0;
        while (r11.hasNext()) {
            i2 = i + 1;
            if (i >= 0) {
                t72.Z();
                throw null;
            }
            tzaVar = (tza) obj;
            List parameters3 = j7fVarD.getParameters();
            parameters3.getClass();
            c8fVar = (c8f) s72.y0(i, parameters3);
            if (tzaVar.o() == sza.STAR) {
                szaVarO = tzaVar.o();
                szaVarO.getClass();
                iOrdinal = szaVarO.ordinal();
                if (iOrdinal != 0) {
                    dsfVar = dsf.IN_VARIANCE;
                } else if (iOrdinal != 1) {
                    dsfVar = dsf.OUT_VARIANCE;
                } else {
                    if (iOrdinal != 2) {
                        if (iOrdinal != 3) {
                            ap.c();
                            return null;
                        }
                        yg5.l(szaVarO, "Only IN, OUT and INV are supported. Actual argument: ");
                        return null;
                    }
                    dsfVar = dsf.INVARIANT;
                }
                vzaVarX = feg.X(tzaVar, bu3Var);
                if (vzaVarX == null) {
                    dzdVar = new dzd(sy4.c(qy4.O0, tzaVar.toString()));
                } else {
                    dzdVar = new dzd(g(vzaVarX), dsfVar);
                }
            } else if (c8fVar == null) {
                dzdVar = new czd(tz3Var.b.f());
            } else {
                dzdVar = new dzd(c8fVar);
            }
            arrayList.add(dzdVar);
            i = i2;
        }
        listJ1 = s72.j1(arrayList);
        y22 y22VarM4 = j7fVarD.m();
        if (!z) {
            if (oi5.a.e(vzaVar.T()).booleanValue()) {
                zX = vzaVar.X();
                size = j7fVarD.getParameters().size() - listJ1.size();
                if (size == 0) {
                    if (size == 1) {
                        j7f j7fVarH2 = j7fVarD.f().w(size2).h();
                        j7fVarH2.getClass();
                        tjdVarA = rxg.T(e7fVarF, j7fVarH2, listJ1, zX);
                        tjdVar = tjdVarA;
                    }
                    tjdVar = null;
                } else {
                    tjdVarT2 = rxg.T(e7fVarF, j7fVarD, listJ1, zX);
                    y22VarM = tjdVarT2.c0().m();
                    if (y22VarM == null) {
                        m36VarM = null;
                    } else {
                        m36VarM = null;
                    }
                    if (pa7.t(m36VarM, i36.d)) {
                        tjdVar = null;
                    } else {
                        y22VarM2 = tt7VarB.c0().m();
                        if (y22VarM2 != null) {
                            dx5VarG = qz3.g(y22VarM2);
                        } else {
                            dx5VarG = null;
                        }
                        if (tt7VarB.Z().size() == 1) {
                        }
                        tjdVar = tjdVarT2;
                    }
                }
                if (tjdVar == null) {
                    sy4 sy4Var7 = sy4.a;
                    tjdVarT = sy4.e(qy4.Z, listJ1, j7fVarD, new String[0]);
                } else {
                    tjdVarT = tjdVar;
                }
            } else {
                tjdVarT = rxg.T(e7fVarF, j7fVarD, listJ1, vzaVar.X());
                if (oi5.b.e(vzaVar.T()).booleanValue()) {
                    kv3VarK0 = qfc.K0(tjdVarT, true);
                    if (kv3VarK0 == null) {
                        cva.v(tjdVarT, "null DefinitelyNotNullType for '");
                        return null;
                    }
                    tjdVarT = kv3VarK0;
                }
            }
        } else if (oi5.a.e(vzaVar.T()).booleanValue()) {
            zX = vzaVar.X();
            size = j7fVarD.getParameters().size() - listJ1.size();
            if (size == 0) {
                if (size == 1) {
                    j7f j7fVarH3 = j7fVarD.f().w(size2).h();
                    j7fVarH3.getClass();
                    tjdVarA = rxg.T(e7fVarF, j7fVarH3, listJ1, zX);
                    tjdVar = tjdVarA;
                }
                tjdVar = null;
            } else {
                tjdVarT2 = rxg.T(e7fVarF, j7fVarD, listJ1, zX);
                y22VarM = tjdVarT2.c0().m();
                if (y22VarM == null) {
                    m36VarM = null;
                } else {
                    m36VarM = null;
                }
                if (pa7.t(m36VarM, i36.d)) {
                    tjdVar = null;
                } else {
                    y22VarM2 = tt7VarB.c0().m();
                    if (y22VarM2 != null) {
                        dx5VarG = qz3.g(y22VarM2);
                    } else {
                        dx5VarG = null;
                    }
                    if (tt7VarB.Z().size() == 1) {
                    }
                    tjdVar = tjdVarT2;
                }
            }
            if (tjdVar == null) {
                sy4 sy4Var8 = sy4.a;
                tjdVarT = sy4.e(qy4.Z, listJ1, j7fVarD, new String[0]);
            } else {
                tjdVarT = tjdVar;
            }
        } else {
            tjdVarT = rxg.T(e7fVarF, j7fVarD, listJ1, vzaVar.X());
            if (oi5.b.e(vzaVar.T()).booleanValue()) {
                kv3VarK0 = qfc.K0(tjdVarT, true);
                if (kv3VarK0 == null) {
                    cva.v(tjdVarT, "null DefinitelyNotNullType for '");
                    return null;
                }
                tjdVarT = kv3VarK0;
            }
        }
        vzaVarP = feg.p(vzaVar, bu3Var);
        if (vzaVarP != null) {
            return o7c.E(tjdVarT, d(vzaVarP, false));
        }
        return tjdVarT;
    }

    public final tt7 g(vza vzaVar) {
        vzaVar.getClass();
        if (!vzaVar.h0()) {
            return d(vzaVar, true);
        }
        lp0 lp0Var = this.a;
        String string = ((u99) lp0Var.c).getString(vzaVar.U());
        tjd tjdVarD = d(vzaVar, true);
        vza vzaVarG = feg.G(vzaVar, (bu3) lp0Var.e);
        vzaVarG.getClass();
        tjd tjdVarD2 = d(vzaVarG, true);
        int i = ((tz3) lp0Var.b).j.a;
        vzaVar.getClass();
        string.getClass();
        tjdVarD.getClass();
        tjdVarD2.getClass();
        switch (i) {
            case 14:
                throw new IllegalArgumentException("This method should not be used.");
            default:
                if (string.equals("kotlin.jvm.PlatformType")) {
                    return vzaVar.p(rl7.f) ? new mdb(tjdVarD, tjdVarD2) : rxg.E(tjdVarD, tjdVarD2);
                }
                return sy4.c(qy4.y, string, tjdVarD.toString(), tjdVarD2.toString());
        }
    }

    public final String toString() {
        o7f o7fVar = this.b;
        return this.c.concat(o7fVar == null ? "" : ". Child of ".concat(o7fVar.c));
    }
}
