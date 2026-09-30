package defpackage;

import ai.askquin.R;
import ai.askquin.ui.dailycard.DailyCardEntry;
import ai.askquin.ui.dailycard.ViewDailyCardRoute;
import ai.askquin.ui.dailycard.o;
import android.app.Activity;
import android.content.Context;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.b;
import androidx.compose.ui.node.LayoutNode;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import tech.chatmind.api.dailycard.model.DailyCard;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class um6 {
    public static final float a = fdc.a;
    public static final float b = 120.0f;

    public static final void a(j09 j09Var, l46 l46Var, int i) {
        l46 l46Var2 = l46Var;
        l46Var2.h0(-2009168908);
        int i2 = i | (l46Var2.g(j09Var) ? 4 : 2);
        if (l46Var2.W(i2 & 1, (i2 & 3) != 2)) {
            j09 j09VarD0 = ynb.d0(0.0f, 72.0f, 0.0f, 0.0f, 13, tm7.o(j09Var, y72.b(e(l46Var2), 0.8f), g21.f));
            xn8 xn8VarC = s21.c(ndb.c, false);
            int iHashCode = Long.hashCode(l46Var2.T);
            u8a u8aVarM = l46Var2.m();
            j09 j09VarJ = m93.J(l46Var2, j09VarD0);
            lf2.q.getClass();
            l46Var2.j0();
            if (l46Var2.S) {
                l46Var2.l(LayoutNode.h1);
            } else {
                l46Var2.s0();
            }
            dec.l(hj6.z, l46Var2, xn8VarC);
            dec.l(hj6.y, l46Var2, u8aVarM);
            dec.l(hj6.X, l46Var2, Integer.valueOf(iHashCode));
            dec.k(l46Var2);
            dec.l(hj6.x, l46Var2, j09VarJ);
            String strQ = afc.q(R.string.guide_pull_down_text, l46Var2);
            mue mueVar = pue.a;
            nte.b(strQ, null, 0L, 0L, null, ((y8b) l46Var2.k(x8b.a)).a, 0L, null, null, 0L, 0, false, 0, 0, null, pue.p(l46Var2), l46Var, 0, 0, 130942);
            l46Var2 = l46Var;
            l46Var2.r(true);
        } else {
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new l50(i, 28, j09Var);
        }
    }

    public static final void b(final q7b q7bVar, l46 l46Var, int i) {
        Object next;
        pwf pwfVarH;
        h73 h73Var;
        Object bm6Var;
        char c;
        l46Var.h0(-1241049064);
        int i2 = i | (l46Var.g(q7bVar) ? 4 : 2);
        int i3 = 1;
        int i4 = 13;
        if (l46Var.W(i2 & 1, (i2 & 3) != 2)) {
            b1b b1bVar = uq.b;
            Object obj = (Context) l46Var.k(b1bVar);
            pwf pwfVarA = qd8.a(l46Var);
            if (pwfVarA == null) {
                qc0.p("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            final kq6 kq6Var = (kq6) z5c.G(job.a.b(kq6.class), pwfVarA.g(), null, b21.r(pwfVarA), kr7.b(l46Var), null);
            nfc nfcVarB = kr7.b(l46Var);
            boolean zBooleanValue = ((Boolean) l46Var.k(h57.a)).booleanValue();
            Object obj2 = sf2.a;
            if (zBooleanValue) {
                pwfVarH = ib8.h(l46Var, 1471494079, l46Var, false);
            } else {
                l46Var.f0(1471494731);
                Object objK = l46Var.k(b1bVar);
                Object objR = l46Var.R();
                if (objR == obj2) {
                    objR = z03.O0;
                    l46Var.p0(objR);
                }
                Iterator it = fyc.u((a26) objR, objK).iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (!(((Context) next) instanceof pwf));
                pwfVarH = (pwf) next;
                l46Var.r(false);
            }
            if (pwfVarH == null) {
                qc0.p("No ViewModelStoreOwner found in the context chain");
                return;
            }
            final mma mmaVar = (mma) z5c.G(job.a.b(mma.class), pwfVarH.g(), null, b21.r(pwfVarH), nfcVarB, null);
            x48 x48Var = (x48) l46Var.k(cb8.a);
            boolean zG = l46Var.g(x48Var);
            Object objR2 = l46Var.R();
            if (zG || objR2 == obj2) {
                objR2 = q1c.f(Boolean.valueOf(((a58) x48Var.k()).i.compareTo(g48.e) >= 0));
                l46Var.p0(objR2);
            }
            final e89 e89Var = (e89) objR2;
            boolean zG2 = l46Var.g(e89Var) | l46Var.i(kq6Var) | l46Var.i(x48Var);
            Object objR3 = l46Var.R();
            if (zG2 || objR3 == obj2) {
                objR3 = new it3(x48Var, kq6Var, e89Var, i4);
                l46Var.p0(objR3);
            }
            af1.h(x48Var, kq6Var, (a26) objR3, l46Var);
            Object objR4 = l46Var.R();
            if (objR4 == obj2) {
                objR4 = af1.E(l46Var);
                l46Var.p0(objR4);
            }
            final aw2 aw2Var = (aw2) objR4;
            boolean zG3 = l46Var.g(kq6Var) | l46Var.g(aw2Var);
            Object objR5 = l46Var.R();
            if (zG3 || objR5 == obj2) {
                objR5 = new an6(aw2Var);
                l46Var.p0(objR5);
            }
            final an6 an6Var = (an6) objR5;
            final e89 e89VarT = tm7.t(an6Var.c, l46Var);
            final e89 e89VarT2 = tm7.t(mmaVar.M0, l46Var);
            final e89 e89VarT3 = tm7.t(mmaVar.K0, l46Var);
            Object[] objArr = new Object[0];
            Object objR6 = l46Var.R();
            if (objR6 == obj2) {
                objR6 = new w66(26);
                l46Var.p0(objR6);
            }
            final e89 e89Var2 = (e89) vfh.I(objArr, (x16) objR6, l46Var, 48);
            Object[] objArr2 = new Object[0];
            Object objR7 = l46Var.R();
            int i5 = 10;
            if (objR7 == obj2) {
                objR7 = new sz5(i5);
                l46Var.p0(objR7);
            }
            l26 l26Var = (l26) objR7;
            Object objR8 = l46Var.R();
            if (objR8 == obj2) {
                objR8 = new tk6(i3);
                l46Var.p0(objR8);
            }
            vea veaVar = new vea(7, l26Var, (a26) objR8);
            Object objR9 = l46Var.R();
            if (objR9 == obj2) {
                objR9 = new w66(27);
                l46Var.p0(objR9);
            }
            final jx jxVar = (jx) vfh.J(objArr2, veaVar, (x16) objR9, l46Var, 384);
            final sw3 sw3Var = (sw3) l46Var.k(zg2.h);
            final e89 e89VarT4 = tm7.t(kq6Var.N0, l46Var);
            final e89 e89VarT5 = tm7.t(kq6Var.U0, l46Var);
            final cn6 cn6VarA = cn6.a((cn6) tm7.t(kq6Var.T0, l46Var).getValue(), null, null, (List) tm7.t(kq6Var.Q0, l46Var).getValue(), 28671);
            e89 e89VarT6 = tm7.t(kq6Var.F0, l46Var);
            Object objR10 = l46Var.R();
            o3b o3bVar = o3b.a;
            if (objR10 == obj2) {
                objR10 = q1c.f(o3bVar);
                l46Var.p0(objR10);
            }
            e89 e89Var3 = (e89) objR10;
            Object objR11 = l46Var.R();
            if (objR11 == obj2) {
                objR11 = kv2.f(0, l46Var);
            }
            final s69 s69Var = (s69) objR11;
            if (((bn6) e89VarT.getValue()) == bn6.c && ((Boolean) e89Var.getValue()).booleanValue() && ((Boolean) e89VarT3.getValue()).booleanValue() && !((Boolean) e89VarT2.getValue()).booleanValue() && ((oo6) e89VarT5.getValue()).a && ((oo6) e89VarT5.getValue()).b) {
                h73 h73Var2 = (h73) e89VarT6.getValue();
                q3b q3bVar = (q3b) e89Var3.getValue();
                q3bVar.getClass();
                if (!q3bVar.equals(o3bVar)) {
                    if (q3bVar.equals(n3b.a)) {
                        h73Var2 = null;
                    } else {
                        if (!(q3bVar instanceof p3b)) {
                            ap.c();
                            return;
                        }
                        h73Var2 = ((p3b) q3bVar).a;
                    }
                }
                h73Var = h73Var2;
            } else {
                h73Var = null;
            }
            Object objR12 = l46Var.R();
            if (objR12 == obj2) {
                objR12 = new Object();
                l46Var.p0(objR12);
            }
            boolean zI = l46Var.i(objR12);
            Object objR13 = l46Var.R();
            int i6 = 14;
            if (zI || objR13 == obj2) {
                objR13 = new it3(objR12, e89Var3, s69Var, i6);
                l46Var.p0(objR13);
            }
            af1.h(kq6Var, objR12, (a26) objR13, l46Var);
            boolean zI2 = l46Var.i(kq6Var);
            Object objR14 = l46Var.R();
            if (zI2 || objR14 == obj2) {
                objR14 = new jf6(7, kq6Var, e89Var3);
                l46Var.p0(objR14);
            }
            final x16 x16Var = (x16) objR14;
            final j18 j18VarA = k18.a(0, 3, l46Var);
            q3b q3bVar2 = (q3b) e89Var3.getValue();
            boolean zE = l46Var.e(h73Var == null ? -1 : h73Var.ordinal()) | l46Var.g(e89VarT6) | l46Var.i(kq6Var);
            e89 e89Var4 = e89VarT6;
            Object objR15 = l46Var.R();
            if (zE || objR15 == obj2) {
                c = 3;
                bm6Var = new bm6(h73Var, kq6Var, e89Var4, e89Var3, null);
                e89Var4 = e89Var4;
                l46Var.p0(bm6Var);
            } else {
                bm6Var = objR15;
                c = 3;
            }
            af1.p(h73Var, q3bVar2, (l26) bm6Var, l46Var);
            boolean zI3 = l46Var.i(kq6Var) | l46Var.i(obj);
            Object objR16 = l46Var.R();
            if (zI3 || objR16 == obj2) {
                objR16 = new so5(10, obj, kq6Var);
                l46Var.p0(objR16);
            }
            final h73 h73Var3 = h73Var;
            t72.h(kq6Var, obj, null, (a26) objR16, l46Var, 8);
            final eh6 eh6Var = (eh6) l46Var.k(zg2.l);
            Object objR17 = l46Var.R();
            if (objR17 == obj2) {
                objR17 = q1c.f(Boolean.FALSE);
                l46Var.p0(objR17);
            }
            final e89 e89Var5 = (e89) objR17;
            boolean z = ((eo4) e89Var2.getValue()) == eo4.b;
            boolean zI4 = l46Var.i(aw2Var) | l46Var.i(jxVar) | l46Var.g(e89Var2);
            Object objR18 = l46Var.R();
            if (zI4 || objR18 == obj2) {
                objR18 = new cm6(aw2Var, jxVar, e89Var2);
                l46Var.p0(objR18);
            }
            rxg.a(z, (x16) ((ym7) objR18), l46Var, 0, 0);
            af afVar = new af(3);
            boolean z2 = (i2 & 14) == 4;
            Object objR19 = l46Var.R();
            if (z2 || objR19 == obj2) {
                objR19 = new wl6(q7bVar, 2);
                l46Var.p0(objR19);
            }
            final yk8 yk8VarP = qn4.P(afVar, (a26) objR19, l46Var);
            final e89 e89Var6 = e89Var4;
            nk8.d(null, null, af1.b0(-226038142, new n26() { // from class: zl6
                @Override // defpackage.n26
                public final Object m(Object obj3, Object obj4, Object obj5) {
                    h0e h0eVar;
                    long jD;
                    final e31 e31Var = (e31) obj3;
                    l46 l46Var2 = (l46) obj4;
                    int iIntValue = ((Integer) obj5).intValue();
                    e31Var.getClass();
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= l46Var2.g(e31Var) ? 4 : 2;
                    }
                    int i7 = 1;
                    if (l46Var2.W(iIntValue & 1, (iIntValue & 19) != 18)) {
                        float fC = e31Var.c();
                        sw3 sw3Var2 = sw3Var;
                        final float fP0 = sw3Var2.p0(fC);
                        WeakHashMap weakHashMap = m8g.w;
                        float fP1 = (fP0 - sw3Var2.p0(um6.a)) - q7c.k(l46Var2).l.c(sw3Var2);
                        final float f = fP1 < 0.0f ? 0.0f : fP1;
                        final float fP2 = sw3Var2.p0(um6.b);
                        Float fValueOf = Float.valueOf(f);
                        final jx jxVar2 = jxVar;
                        boolean zI5 = l46Var2.i(jxVar2) | l46Var2.d(f);
                        Object objR20 = l46Var2.R();
                        i8c i8cVar = sf2.a;
                        if (zI5 || objR20 == i8cVar) {
                            objR20 = new dm6(jxVar2, f, null);
                            l46Var2.p0(objR20);
                        }
                        af1.o((l26) objR20, l46Var2, fValueOf);
                        boolean zD = l46Var2.d(f);
                        Object objR21 = l46Var2.R();
                        if (zD || objR21 == i8cVar) {
                            objR21 = zrd.b(new vl6(f, jxVar2));
                            l46Var2.p0(objR21);
                        }
                        final h0e h0eVar2 = (h0e) objR21;
                        final j18 j18Var = j18VarA;
                        boolean zG4 = l46Var2.g(j18Var);
                        Object objR22 = l46Var2.R();
                        if (zG4 || objR22 == i8cVar) {
                            objR22 = zrd.b(new te3(j18Var, i7));
                            l46Var2.p0(objR22);
                        }
                        h0e h0eVar3 = (h0e) objR22;
                        final h0e h0eVar4 = e89VarT5;
                        boolean z3 = ((oo6) h0eVar4.getValue()).a;
                        boolean z4 = ((oo6) h0eVar4.getValue()).b;
                        e89 e89Var7 = e89Var;
                        boolean zBooleanValue2 = ((Boolean) e89Var7.getValue()).booleanValue();
                        h0e h0eVar5 = e89VarT3;
                        boolean zBooleanValue3 = ((Boolean) h0eVar5.getValue()).booleanValue();
                        h0e h0eVar6 = e89VarT2;
                        boolean zBooleanValue4 = ((Boolean) h0eVar6.getValue()).booleanValue();
                        final e89 e89Var8 = e89Var2;
                        eo4 eo4Var = (eo4) e89Var8.getValue();
                        eo4 eo4Var2 = eo4.b;
                        xm6 xm6Var = new xm6(z3, z4, zBooleanValue2, zBooleanValue3, zBooleanValue4, eo4Var == eo4Var2, ((Number) h0eVar2.getValue()).floatValue() == 0.0f);
                        an6 an6Var2 = an6Var;
                        boolean zI6 = l46Var2.i(an6Var2) | l46Var2.i(xm6Var);
                        Object objR23 = l46Var2.R();
                        if (zI6 || objR23 == i8cVar) {
                            objR23 = new em6(an6Var2, xm6Var, null);
                            l46Var2.p0(objR23);
                        }
                        af1.o((l26) objR23, l46Var2, xm6Var);
                        e89 e89Var9 = e89VarT;
                        bn6 bn6Var = (bn6) e89Var9.getValue();
                        bn6 bn6Var2 = bn6.b;
                        eo4 eo4Var3 = eo4.a;
                        boolean z5 = bn6Var == bn6Var2 && ((oo6) h0eVar4.getValue()).a && !((oo6) h0eVar4.getValue()).b && ((Boolean) e89Var7.getValue()).booleanValue() && ((Boolean) h0eVar5.getValue()).booleanValue() && !((Boolean) h0eVar6.getValue()).booleanValue() && ((eo4) e89Var8.getValue()) == eo4Var3;
                        boolean z6 = ((bn6) e89Var9.getValue()) == bn6.c && ((oo6) h0eVar4.getValue()).a && ((oo6) h0eVar4.getValue()).b && !((Boolean) h0eVar6.getValue()).booleanValue() && ((Boolean) e89Var7.getValue()).booleanValue() && ((Boolean) h0eVar5.getValue()).booleanValue() && ((eo4) e89Var8.getValue()) == eo4Var3 && ((Number) h0eVar2.getValue()).floatValue() == 0.0f && (((Boolean) h0eVar3.getValue()).booleanValue() || ((h73) e89Var6.getValue()) != null);
                        Boolean boolValueOf = Boolean.valueOf(z6);
                        boolean zH = l46Var2.h(z6);
                        final kq6 kq6Var2 = kq6Var;
                        boolean zI7 = zH | l46Var2.i(kq6Var2);
                        final boolean z7 = z5;
                        Object objR24 = l46Var2.R();
                        if (zI7 || objR24 == i8cVar) {
                            objR24 = new fm6(z6, kq6Var2, null);
                            l46Var2.p0(objR24);
                        }
                        af1.o((l26) objR24, l46Var2, boolValueOf);
                        boolean z8 = !li4.a(l46Var2);
                        Object objK2 = l46Var2.k(uq.b);
                        Activity activity = objK2 instanceof Activity ? (Activity) objK2 : null;
                        Boolean boolValueOf2 = Boolean.valueOf(z8);
                        boolean zH2 = l46Var2.h(z8) | l46Var2.g(h0eVar2) | l46Var2.i(activity);
                        Object objR25 = l46Var2.R();
                        if (zH2 || objR25 == i8cVar) {
                            objR25 = new gm6(z8, h0eVar2, activity, null);
                            l46Var2.p0(objR25);
                        }
                        af1.o((l26) objR25, l46Var2, boolValueOf2);
                        Object objR26 = l46Var2.R();
                        if (objR26 == i8cVar) {
                            objR26 = zrd.b(new zk1(5, h0eVar2));
                            l46Var2.p0(objR26);
                        }
                        h0e h0eVar7 = (h0e) objR26;
                        Object objR27 = l46Var2.R();
                        if (objR27 == i8cVar) {
                            objR27 = zrd.b(new zk1(6, h0eVar7));
                            l46Var2.p0(objR27);
                        }
                        final h0e h0eVar8 = (h0e) objR27;
                        Object objR28 = l46Var2.R();
                        if (objR28 == i8cVar) {
                            objR28 = zrd.b(new zk1(7, h0eVar2));
                            l46Var2.p0(objR28);
                        }
                        final h0e h0eVar9 = (h0e) objR28;
                        eo4 eo4Var4 = (eo4) e89Var8.getValue();
                        final cn6 cn6Var = cn6VarA;
                        if (eo4Var4 == eo4Var2) {
                            l46Var2.f0(610599293);
                            List list = cn6Var.n;
                            ArrayList arrayList = new ArrayList();
                            Iterator it2 = list.iterator();
                            while (it2.hasNext()) {
                                h0e h0eVar10 = h0eVar7;
                                Object next2 = it2.next();
                                Iterator it3 = it2;
                                if (next2 instanceof zb4) {
                                    arrayList.add(next2);
                                }
                                h0eVar7 = h0eVar10;
                                it2 = it3;
                            }
                            h0eVar = h0eVar7;
                            ArrayList arrayList2 = new ArrayList();
                            Iterator it4 = arrayList.iterator();
                            while (it4.hasNext()) {
                                x72.g0(arrayList2, s72.t0(((zb4) it4.next()).l.values()));
                            }
                            Set setO1 = s72.o1(arrayList2);
                            Object objR29 = l46Var2.R();
                            if (objR29 == i8cVar) {
                                objR29 = new w66(28);
                                l46Var2.p0(objR29);
                            }
                            mh3.S(setO1, (x16) objR29, l46Var2, 48, 0);
                            l46Var2.r(false);
                        } else {
                            h0eVar = h0eVar7;
                            l46Var2.f0(610878944);
                            l46Var2.r(false);
                        }
                        FillElement fillElement = b.c;
                        pr4 pr4Var = l8b.a;
                        int iOrdinal = ((e8b) l46Var2.k(pr4Var)).C.ordinal();
                        if (iOrdinal == 0) {
                            l46Var2.f0(1820825907);
                            l46Var2.r(false);
                            jD = abg.d(4279637026L);
                        } else {
                            if (iOrdinal != 1) {
                                throw tec.d(1820823490, l46Var2, false);
                            }
                            l46Var2.f0(1820827729);
                            jD = ((e8b) l46Var2.k(pr4Var)).a;
                            l46Var2.r(false);
                        }
                        long j = jD;
                        final q7b q7bVar2 = q7bVar;
                        final aw2 aw2Var2 = aw2Var;
                        final eh6 eh6Var2 = eh6Var;
                        final e89 e89Var10 = e89Var5;
                        final h73 h73Var4 = h73Var3;
                        final mma mmaVar2 = mmaVar;
                        final x16 x16Var2 = x16Var;
                        final yk8 yk8Var = yk8VarP;
                        final s69 s69Var2 = s69Var;
                        final h0e h0eVar11 = e89VarT4;
                        final h0e h0eVar12 = h0eVar;
                        nae.a(fillElement, null, j, 0L, 0.0f, 0.0f, null, af1.b0(1498969799, new l26() { // from class: am6
                            /* JADX WARN: Code duplicated, block: B:101:0x041f  */
                            /* JADX WARN: Code duplicated, block: B:105:0x043c  */
                            /* JADX WARN: Code duplicated, block: B:111:0x0460  */
                            /* JADX WARN: Code duplicated, block: B:117:0x0485  */
                            /* JADX WARN: Code duplicated, block: B:121:0x049e  */
                            /* JADX WARN: Code duplicated, block: B:125:0x04bd  */
                            /* JADX WARN: Code duplicated, block: B:128:0x052f A[DONT_INVERT] */
                            /* JADX WARN: Code duplicated, block: B:129:0x0531  */
                            /* JADX WARN: Code duplicated, block: B:131:0x0556  */
                            /* JADX WARN: Code duplicated, block: B:133:0x055f  */
                            /* JADX WARN: Code duplicated, block: B:136:0x058f  */
                            /* JADX WARN: Code duplicated, block: B:140:0x05b3  */
                            /* JADX WARN: Code duplicated, block: B:142:0x05d0  */
                            /* JADX WARN: Code duplicated, block: B:55:0x01fd  */
                            /* JADX WARN: Code duplicated, block: B:58:0x021d  */
                            /* JADX WARN: Code duplicated, block: B:59:0x0244  */
                            /* JADX WARN: Code duplicated, block: B:65:0x0271  */
                            /* JADX WARN: Code duplicated, block: B:71:0x02a8  */
                            /* JADX WARN: Code duplicated, block: B:74:0x02fa  */
                            /* JADX WARN: Code duplicated, block: B:75:0x0300  */
                            /* JADX WARN: Code duplicated, block: B:79:0x0381  */
                            /* JADX WARN: Code duplicated, block: B:85:0x03b1  */
                            /* JADX WARN: Code duplicated, block: B:89:0x03cc  */
                            /* JADX WARN: Code duplicated, block: B:93:0x03e5  */
                            /* JADX WARN: Code duplicated, block: B:97:0x0404  */
                            /* JADX WARN: Multi-variable type inference failed */
                            /* JADX WARN: Type inference failed for: r5v35 */
                            /* JADX WARN: Type inference failed for: r5v36, types: [boolean, int] */
                            /* JADX WARN: Type inference failed for: r5v38 */
                            @Override // defpackage.l26
                            public final Object z(Object obj6, Object obj7) {
                                Object obj8;
                                final jx jxVar3;
                                final float f2;
                                final float f3;
                                final e89 e89Var11;
                                final kq6 kq6Var3;
                                eh6 eh6Var3;
                                aw2 aw2Var3;
                                e89 e89VarI;
                                Object objR30;
                                Object objR31;
                                float f4;
                                e89 e89Var12;
                                j18 j18Var2;
                                float f5;
                                e89 e89Var13;
                                j18 j18Var3;
                                kq6 kq6Var4;
                                float f6;
                                ph3 ph3VarA;
                                boolean zI8;
                                Object objR32;
                                boolean zI9;
                                Object objR33;
                                jx jxVar4;
                                aw2 aw2Var4;
                                h0e h0eVar13;
                                jx jxVar5;
                                boolean zI10;
                                Object objR34;
                                boolean zG5;
                                Object objR35;
                                boolean zG6;
                                Object objR36;
                                boolean zG7;
                                Object objR37;
                                boolean zG8;
                                Object objR38;
                                mma mmaVar3;
                                boolean zI11;
                                Object objR39;
                                boolean zG9;
                                Object objR40;
                                boolean zG10;
                                Object objR41;
                                yk8 yk8Var2;
                                boolean zI12;
                                Object objR42;
                                boolean zG11;
                                Object objR43;
                                boolean zI13;
                                Object objR44;
                                e89 e89Var14;
                                pr4 pr4Var2;
                                int iOrdinal2;
                                h0e h0eVar14;
                                ?? r5;
                                long jB;
                                j09 j09VarO;
                                boolean zI14;
                                Object objR45;
                                y02 y02Var = g21.f;
                                l46 l46Var3 = (l46) obj6;
                                int iIntValue2 = ((Integer) obj7).intValue();
                                final int i8 = 1;
                                int i9 = 0;
                                if (l46Var3.W(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                    FillElement fillElement2 = b.c;
                                    Object objR46 = l46Var3.R();
                                    int i10 = 7;
                                    Object obj9 = sf2.a;
                                    if (objR46 == obj9) {
                                        objR46 = new wh1(i10, h0eVar12);
                                        l46Var3.p0(objR46);
                                    }
                                    j09 j09VarX = bzd.x(fillElement2, (a26) objR46);
                                    bx9 bx9VarR = ynb.r(eze.a(l46Var3).e.b.a, 0.0f, eze.a(l46Var3).e.b.a, 88.0f, 2);
                                    final cn6 cn6Var2 = cn6Var;
                                    boolean zG12 = l46Var3.g(cn6Var2);
                                    final q7b q7bVar3 = q7bVar2;
                                    boolean zG13 = zG12 | l46Var3.g(q7bVar3);
                                    Object objR47 = l46Var3.R();
                                    if (zG13 || objR47 == obj9) {
                                        objR47 = new x16() { // from class: tl6
                                            @Override // defpackage.x16
                                            public final Object invoke() {
                                                Object dailyCardEntry;
                                                int i11 = i8;
                                                wef wefVar = wef.a;
                                                q7b q7bVar4 = q7bVar3;
                                                cn6 cn6Var3 = cn6Var2;
                                                switch (i11) {
                                                    case 0:
                                                        a63.c("homepage", "today");
                                                        LocalDate localDate = cn6Var3.c;
                                                        String string = localDate.toString();
                                                        string.getClass();
                                                        boolean zG14 = um6.g(localDate, cn6Var3.m, cn6Var3.e);
                                                        cb9 cb9Var = q7bVar4.a;
                                                        if (!zG14) {
                                                            ka9.e(cb9Var, new DailyCardEntry("homepage", string), null, 6);
                                                        } else {
                                                            ka9.e(cb9Var, new ViewDailyCardRoute(string, "homepage"), null, 6);
                                                        }
                                                        break;
                                                    default:
                                                        LocalDate localDate2 = cn6Var3.d;
                                                        String string2 = localDate2.toString();
                                                        string2.getClass();
                                                        a63.c("calendar", o.b(string2, cn6Var3.c));
                                                        cb9 cb9Var2 = q7bVar4.a;
                                                        List list2 = cn6Var3.m;
                                                        List list3 = cn6Var3.e;
                                                        list2.getClass();
                                                        list3.getClass();
                                                        if (um6.g(localDate2, list2, list3)) {
                                                            String string3 = localDate2.toString();
                                                            string3.getClass();
                                                            dailyCardEntry = new ViewDailyCardRoute(string3, "calendar");
                                                        } else {
                                                            String string4 = localDate2.toString();
                                                            string4.getClass();
                                                            dailyCardEntry = new DailyCardEntry("calendar", string4);
                                                        }
                                                        ka9.e(cb9Var2, dailyCardEntry, null, 6);
                                                        break;
                                                }
                                                return wefVar;
                                            }
                                        };
                                        l46Var3.p0(objR47);
                                    }
                                    x16 x16Var3 = (x16) objR47;
                                    boolean zG14 = l46Var3.g(q7bVar3);
                                    final aw2 aw2Var5 = aw2Var2;
                                    boolean zI15 = zG14 | l46Var3.i(aw2Var5);
                                    jx jxVar6 = jxVar2;
                                    boolean zI16 = zI15 | l46Var3.i(jxVar6);
                                    Object objR48 = l46Var3.R();
                                    int i11 = 6;
                                    if (zI16 || objR48 == obj9) {
                                        objR48 = new n25(q7bVar3, aw2Var5, jxVar6, i11);
                                        l46Var3.p0(objR48);
                                    }
                                    x16 x16Var4 = (x16) objR48;
                                    boolean zG15 = l46Var3.g(q7bVar3);
                                    Object objR49 = l46Var3.R();
                                    if (zG15 || objR49 == obj9) {
                                        objR49 = new wl6(q7bVar3, i9);
                                        l46Var3.p0(objR49);
                                    }
                                    a26 a26Var = (a26) objR49;
                                    boolean zG16 = l46Var3.g(q7bVar3);
                                    Object objR50 = l46Var3.R();
                                    if (zG16 || objR50 == obj9) {
                                        objR50 = new wl6(q7bVar3, 1);
                                        l46Var3.p0(objR50);
                                    }
                                    a26 a26Var2 = (a26) objR50;
                                    boolean zG17 = l46Var3.g(cn6Var2) | l46Var3.g(q7bVar3);
                                    Object objR51 = l46Var3.R();
                                    if (zG17 || objR51 == obj9) {
                                        final int i12 = 1;
                                        objR51 = new a26() { // from class: ul6
                                            @Override // defpackage.a26
                                            public final Object d(Object obj10) {
                                                int i13 = i12;
                                                wef wefVar = wef.a;
                                                q7b q7bVar4 = q7bVar3;
                                                cn6 cn6Var3 = cn6Var2;
                                                switch (i13) {
                                                    case 0:
                                                        LocalDate localDate = (LocalDate) obj10;
                                                        localDate.getClass();
                                                        a63.c("homepage", "tomorrow");
                                                        String string = localDate.toString();
                                                        string.getClass();
                                                        boolean zG18 = um6.g(localDate, cn6Var3.m, cn6Var3.e);
                                                        cb9 cb9Var = q7bVar4.a;
                                                        if (!zG18) {
                                                            ka9.e(cb9Var, new DailyCardEntry("homepage", string), null, 6);
                                                        } else {
                                                            ka9.e(cb9Var, new ViewDailyCardRoute(string, "homepage"), null, 6);
                                                        }
                                                        break;
                                                    default:
                                                        String str = (String) obj10;
                                                        str.getClass();
                                                        a63.c("calendar", o.b(str, cn6Var3.c));
                                                        ka9.e(q7bVar4.a, new ViewDailyCardRoute(str, "calendar"), null, 6);
                                                        break;
                                                }
                                                return wefVar;
                                            }
                                        };
                                        l46Var3.p0(objR51);
                                    }
                                    a26 a26Var3 = (a26) objR51;
                                    kq6 kq6Var5 = kq6Var2;
                                    boolean zI17 = l46Var3.i(kq6Var5);
                                    Object objR52 = l46Var3.R();
                                    if (zI17 || objR52 == obj9) {
                                        objR52 = new za6(7, kq6Var5);
                                        l46Var3.p0(objR52);
                                    }
                                    kn2.q(j09VarX, bx9VarR, cn6Var2, x16Var3, x16Var4, a26Var, a26Var2, a26Var3, (a26) objR52, l46Var3, 6);
                                    if (z7) {
                                        l46Var3.f0(1036291049);
                                        um6.a(e31Var.a(b.c(g09.a, 1.0f), ndb.c), l46Var3, 0);
                                        l46Var3.r(false);
                                    } else {
                                        l46Var3.f0(1036431355);
                                        l46Var3.r(false);
                                    }
                                    h0e h0eVar15 = h0eVar8;
                                    if (((Number) h0eVar15.getValue()).floatValue() < 1.0f) {
                                        l46Var3.f0(1036463781);
                                        s21.a(tm7.o(fillElement2, y72.b(um6.e(l46Var3), ((Number) h0eVar15.getValue()).floatValue()), y02Var), l46Var3, 0);
                                        l46Var3.r(false);
                                    } else {
                                        l46Var3.f0(1036607931);
                                        l46Var3.r(false);
                                    }
                                    boolean zI18 = l46Var3.i(kq6Var5) | l46Var3.i(aw2Var5) | l46Var3.i(jxVar6);
                                    float f7 = f;
                                    boolean zD2 = zI18 | l46Var3.d(f7);
                                    float f8 = fP2;
                                    boolean zD3 = zD2 | l46Var3.d(f8);
                                    final eh6 eh6Var4 = eh6Var2;
                                    boolean zI19 = zD3 | l46Var3.i(eh6Var4);
                                    Object objR53 = l46Var3.R();
                                    e89 e89Var15 = e89Var10;
                                    if (zI19) {
                                        obj8 = obj9;
                                    } else {
                                        obj8 = obj9;
                                        if (objR53 != obj8) {
                                            jxVar3 = jxVar6;
                                            f2 = f7;
                                            f3 = f8;
                                            eh6Var3 = eh6Var4;
                                            e89Var11 = e89Var15;
                                            kq6Var3 = kq6Var5;
                                            aw2Var3 = aw2Var5;
                                        }
                                        sl4 sl4Var = ul4.a;
                                        e89VarI = q1c.i((a26) objR53, l46Var3);
                                        objR30 = l46Var3.R();
                                        if (objR30 == obj8) {
                                            jq3 jq3Var = new jq3(new pg(e89VarI, 25));
                                            l46Var3.p0(jq3Var);
                                            objR30 = jq3Var;
                                        }
                                        zl4 zl4Var = (zl4) objR30;
                                        objR31 = l46Var3.R();
                                        f4 = fP0;
                                        e89Var12 = e89Var8;
                                        j18Var2 = j18Var;
                                        if (objR31 == obj8) {
                                            kq6 kq6Var6 = kq6Var3;
                                            e89 e89Var16 = e89Var11;
                                            float f9 = f3;
                                            objR31 = new nm6(j18Var2, kq6Var6, jxVar3, f2, f4, aw2Var3, f9, eh6Var3, e89Var16, e89Var12);
                                            j18Var3 = j18Var2;
                                            kq6Var4 = kq6Var6;
                                            f5 = f4;
                                            f6 = f9;
                                            e89Var11 = e89Var16;
                                            e89Var13 = e89Var12;
                                            l46Var3.p0(objR31);
                                        } else {
                                            f5 = f4;
                                            e89Var13 = e89Var12;
                                            j18Var3 = j18Var2;
                                            kq6Var4 = kq6Var3;
                                            f6 = f3;
                                        }
                                        ph3VarA = yud.a(l46Var3);
                                        j09 j09VarS = dj6.S(fillElement2, (nm6) objR31, null);
                                        zI8 = l46Var3.i(jxVar3) | l46Var3.d(f5);
                                        j18 j18Var4 = j18Var3;
                                        objR32 = l46Var3.R();
                                        if (zI8 || objR32 == obj8) {
                                            objR32 = new wi3(jxVar3, f5, 1);
                                            l46Var3.p0(objR32);
                                        }
                                        j09 j09VarX2 = bzd.x(j09VarS, (a26) objR32);
                                        zI9 = l46Var3.i(aw2Var3) | l46Var3.d(f6) | l46Var3.d(f5) | l46Var3.i(jxVar3) | l46Var3.g(e89Var13) | l46Var3.i(ph3VarA);
                                        objR33 = l46Var3.R();
                                        if (!zI9 || objR33 == obj8) {
                                            jx jxVar7 = jxVar3;
                                            objR33 = new km6(aw2Var3, jxVar7, ph3VarA, f5, f6, e89Var11, e89Var13, null);
                                            jxVar4 = jxVar7;
                                            l46Var3.p0(objR33);
                                        } else {
                                            jxVar4 = jxVar3;
                                        }
                                        j09 j09VarA = ul4.a(j09VarX2, zl4Var, ks9.a, false, null, false, (n26) objR33, false, 188);
                                        xn8 xn8VarC = s21.c(ndb.b, false);
                                        aw2Var4 = aw2Var3;
                                        int iHashCode = Long.hashCode(l46Var3.T);
                                        u8a u8aVarM = l46Var3.m();
                                        j09 j09VarJ = m93.J(l46Var3, j09VarA);
                                        lf2.q.getClass();
                                        l46Var3.j0();
                                        if (l46Var3.S) {
                                            l46Var3.l(LayoutNode.h1);
                                        } else {
                                            l46Var3.s0();
                                        }
                                        dec.l(hj6.z, l46Var3, xn8VarC);
                                        dec.l(hj6.y, l46Var3, u8aVarM);
                                        dec.l(hj6.X, l46Var3, Integer.valueOf(iHashCode));
                                        dec.k(l46Var3);
                                        dec.l(hj6.x, l46Var3, j09VarJ);
                                        h0eVar13 = h0eVar4;
                                        oo6 oo6Var = (oo6) h0eVar13.getValue();
                                        jxVar5 = jxVar4;
                                        z63 z63Var = cn6Var2.h;
                                        LocalDate localDate = cn6Var2.c;
                                        LocalDate localDate2 = cn6Var2.i;
                                        z63 z63Var2 = cn6Var2.j;
                                        h73 h73Var5 = cn6Var2.k;
                                        h73 h73Var6 = cn6Var2.l;
                                        int iJ = ((sz9) s69Var2).j();
                                        boolean z9 = ((oo6) h0eVar13.getValue()).e;
                                        List list2 = (List) h0eVar11.getValue();
                                        boolean zBooleanValue5 = ((Boolean) kq6Var4.O0.getValue()).booleanValue();
                                        float fFloatValue = ((Number) h0eVar2.getValue()).floatValue();
                                        zI10 = l46Var3.i(kq6Var4);
                                        objR34 = l46Var3.R();
                                        if (zI10 || objR34 == obj8) {
                                            objR34 = new uj3(1, kq6Var4, kq6.class, "onDailyFortuneFocusChange", "onDailyFortuneFocusChange(Lnet/xmind/donut/common/utils/DailyFortuneFocus;)V", 0, 24);
                                            l46Var3.p0(objR34);
                                        }
                                        ym7 ym7Var = (ym7) objR34;
                                        zG5 = l46Var3.g(q7bVar3);
                                        objR35 = l46Var3.R();
                                        if (zG5 || objR35 == obj8) {
                                            objR35 = new ro2(q7bVar3, 7);
                                            l46Var3.p0(objR35);
                                        }
                                        x16 x16Var5 = (x16) objR35;
                                        zG6 = l46Var3.g(q7bVar3);
                                        objR36 = l46Var3.R();
                                        if (zG6 || objR36 == obj8) {
                                            objR36 = new ro2(q7bVar3, 4);
                                            l46Var3.p0(objR36);
                                        }
                                        x16 x16Var6 = (x16) objR36;
                                        zG7 = l46Var3.g(q7bVar3);
                                        objR37 = l46Var3.R();
                                        if (zG7 || objR37 == obj8) {
                                            objR37 = new ro2(q7bVar3, 5);
                                            l46Var3.p0(objR37);
                                        }
                                        x16 x16Var7 = (x16) objR37;
                                        zG8 = l46Var3.g(h0eVar13) | l46Var3.g(q7bVar3);
                                        objR38 = l46Var3.R();
                                        if (zG8 || objR38 == obj8) {
                                            objR38 = new jf6(6, h0eVar13, q7bVar3);
                                            l46Var3.p0(objR38);
                                        }
                                        x16 x16Var8 = (x16) objR38;
                                        mmaVar3 = mmaVar2;
                                        zI11 = l46Var3.i(mmaVar3);
                                        objR39 = l46Var3.R();
                                        if (zI11 || objR39 == obj8) {
                                            objR39 = new qo2(mmaVar3, 8);
                                            l46Var3.p0(objR39);
                                        }
                                        x16 x16Var9 = (x16) objR39;
                                        zG9 = l46Var3.g(cn6Var2) | l46Var3.g(q7bVar3);
                                        objR40 = l46Var3.R();
                                        if (zG9 || objR40 == obj8) {
                                            final int i13 = 0;
                                            objR40 = new x16() { // from class: tl6
                                                @Override // defpackage.x16
                                                public final Object invoke() {
                                                    Object dailyCardEntry;
                                                    int i14 = i13;
                                                    wef wefVar = wef.a;
                                                    q7b q7bVar4 = q7bVar3;
                                                    cn6 cn6Var3 = cn6Var2;
                                                    switch (i14) {
                                                        case 0:
                                                            a63.c("homepage", "today");
                                                            LocalDate localDate3 = cn6Var3.c;
                                                            String string = localDate3.toString();
                                                            string.getClass();
                                                            boolean zG18 = um6.g(localDate3, cn6Var3.m, cn6Var3.e);
                                                            cb9 cb9Var = q7bVar4.a;
                                                            if (!zG18) {
                                                                ka9.e(cb9Var, new DailyCardEntry("homepage", string), null, 6);
                                                            } else {
                                                                ka9.e(cb9Var, new ViewDailyCardRoute(string, "homepage"), null, 6);
                                                            }
                                                            break;
                                                        default:
                                                            LocalDate localDate4 = cn6Var3.d;
                                                            String string2 = localDate4.toString();
                                                            string2.getClass();
                                                            a63.c("calendar", o.b(string2, cn6Var3.c));
                                                            cb9 cb9Var2 = q7bVar4.a;
                                                            List list3 = cn6Var3.m;
                                                            List list4 = cn6Var3.e;
                                                            list3.getClass();
                                                            list4.getClass();
                                                            if (um6.g(localDate4, list3, list4)) {
                                                                String string3 = localDate4.toString();
                                                                string3.getClass();
                                                                dailyCardEntry = new ViewDailyCardRoute(string3, "calendar");
                                                            } else {
                                                                String string4 = localDate4.toString();
                                                                string4.getClass();
                                                                dailyCardEntry = new DailyCardEntry("calendar", string4);
                                                            }
                                                            ka9.e(cb9Var2, dailyCardEntry, null, 6);
                                                            break;
                                                    }
                                                    return wefVar;
                                                }
                                            };
                                            l46Var3.p0(objR40);
                                        }
                                        x16 x16Var10 = (x16) objR40;
                                        zG10 = l46Var3.g(cn6Var2) | l46Var3.g(q7bVar3);
                                        objR41 = l46Var3.R();
                                        if (zG10 || objR41 == obj8) {
                                            final int i14 = 0;
                                            objR41 = new a26() { // from class: ul6
                                                @Override // defpackage.a26
                                                public final Object d(Object obj10) {
                                                    int i15 = i14;
                                                    wef wefVar = wef.a;
                                                    q7b q7bVar4 = q7bVar3;
                                                    cn6 cn6Var3 = cn6Var2;
                                                    switch (i15) {
                                                        case 0:
                                                            LocalDate localDate3 = (LocalDate) obj10;
                                                            localDate3.getClass();
                                                            a63.c("homepage", "tomorrow");
                                                            String string = localDate3.toString();
                                                            string.getClass();
                                                            boolean zG18 = um6.g(localDate3, cn6Var3.m, cn6Var3.e);
                                                            cb9 cb9Var = q7bVar4.a;
                                                            if (!zG18) {
                                                                ka9.e(cb9Var, new DailyCardEntry("homepage", string), null, 6);
                                                            } else {
                                                                ka9.e(cb9Var, new ViewDailyCardRoute(string, "homepage"), null, 6);
                                                            }
                                                            break;
                                                        default:
                                                            String str = (String) obj10;
                                                            str.getClass();
                                                            a63.c("calendar", o.b(str, cn6Var3.c));
                                                            ka9.e(q7bVar4.a, new ViewDailyCardRoute(str, "calendar"), null, 6);
                                                            break;
                                                    }
                                                    return wefVar;
                                                }
                                            };
                                            l46Var3.p0(objR41);
                                        }
                                        a26 a26Var4 = (a26) objR41;
                                        a26 a26Var5 = (a26) ym7Var;
                                        yk8Var2 = yk8Var;
                                        zI12 = l46Var3.i(yk8Var2);
                                        objR42 = l46Var3.R();
                                        if (zI12 || objR42 == obj8) {
                                            objR42 = new u11(yk8Var2, 2);
                                            l46Var3.p0(objR42);
                                        }
                                        x16 x16Var11 = (x16) objR42;
                                        zG11 = l46Var3.g(q7bVar3);
                                        objR43 = l46Var3.R();
                                        if (zG11 || objR43 == obj8) {
                                            objR43 = new ro2(q7bVar3, 6);
                                            l46Var3.p0(objR43);
                                        }
                                        x16 x16Var12 = (x16) objR43;
                                        zI13 = l46Var3.i(kq6Var4) | l46Var3.g(q7bVar3);
                                        objR44 = l46Var3.R();
                                        if (zI13 || objR44 == obj8) {
                                            objR44 = new so5(9, kq6Var4, q7bVar3);
                                            l46Var3.p0(objR44);
                                        }
                                        a26 a26Var6 = (a26) objR44;
                                        e89Var14 = e89Var13;
                                        Object obj10 = obj8;
                                        n16.l(oo6Var, z63Var, localDate, localDate2, z63Var2, h73Var5, h73Var6, h73Var4, iJ, z9, list2, zBooleanValue5, fFloatValue, j18Var4, x16Var5, q7bVar3, x16Var6, x16Var7, x16Var8, x16Var9, x16Var10, a26Var4, a26Var5, x16Var2, x16Var11, x16Var12, a26Var6, l46Var3, 32832);
                                        l46Var3.f0(1897101544);
                                        pr4Var2 = l8b.a;
                                        iOrdinal2 = ((e8b) l46Var3.k(pr4Var2)).C.ordinal();
                                        h0eVar14 = h0eVar9;
                                        if (iOrdinal2 != 0) {
                                            r5 = 0;
                                            l46Var3.f0(1897096649);
                                            l46Var3.r(false);
                                            jB = y72.b(abg.d(4283452772L), ((Number) h0eVar14.getValue()).floatValue());
                                        } else {
                                            if (iOrdinal2 == 1) {
                                                throw tec.d(1897093469, l46Var3, false);
                                            }
                                            l46Var3.f0(1897099529);
                                            jB = y72.b(((e8b) l46Var3.k(pr4Var2)).b, ((Number) h0eVar14.getValue()).floatValue());
                                            r5 = 0;
                                            l46Var3.r(false);
                                        }
                                        j09VarO = tm7.o(fillElement2, jB, y02Var);
                                        if (((eo4) e89Var14.getValue()) == eo4.b) {
                                            l46Var3.f0(2082874527);
                                            zI14 = l46Var3.i(aw2Var4) | l46Var3.i(jxVar5) | l46Var3.g(e89Var14);
                                            objR45 = l46Var3.R();
                                            if (zI14 || objR45 == obj10) {
                                                objR45 = new hm6(aw2Var4, jxVar5, e89Var14);
                                                l46Var3.p0(objR45);
                                            }
                                            j09VarO = androidx.compose.foundation.b.c(j09VarO, false, null, null, (x16) ((ym7) objR45), 15);
                                            l46Var3.r(r5);
                                        } else {
                                            l46Var3.f0(-1872470754);
                                            l46Var3.r(r5);
                                        }
                                        l46Var3.r(r5);
                                        s21.a(j09VarO, l46Var3, r5);
                                        l46Var3.r(true);
                                    }
                                    jxVar3 = jxVar6;
                                    f2 = f7;
                                    f3 = f8;
                                    e89Var11 = e89Var15;
                                    kq6Var3 = kq6Var5;
                                    objR53 = new a26() { // from class: xl6
                                        @Override // defpackage.a26
                                        public final Object d(Object obj11) {
                                            float fFloatValue2 = ((Float) obj11).floatValue();
                                            if (fFloatValue2 > 0.0f) {
                                                kq6 kq6Var7 = kq6Var3;
                                                ynb.V(hwf.a(kq6Var7), null, null, new uo6(kq6Var7, null), 3);
                                            }
                                            ynb.V(aw2Var5, null, null, new lm6(jxVar3, fFloatValue2, f2, f3, eh6Var4, e89Var11, null), 3);
                                            return wef.a;
                                        }
                                    };
                                    eh6Var3 = eh6Var4;
                                    aw2Var3 = aw2Var5;
                                    l46Var3.p0(objR53);
                                    sl4 sl4Var2 = ul4.a;
                                    e89VarI = q1c.i((a26) objR53, l46Var3);
                                    objR30 = l46Var3.R();
                                    if (objR30 == obj8) {
                                        jq3 jq3Var2 = new jq3(new pg(e89VarI, 25));
                                        l46Var3.p0(jq3Var2);
                                        objR30 = jq3Var2;
                                    }
                                    zl4 zl4Var2 = (zl4) objR30;
                                    objR31 = l46Var3.R();
                                    f4 = fP0;
                                    e89Var12 = e89Var8;
                                    j18Var2 = j18Var;
                                    if (objR31 == obj8) {
                                        kq6 kq6Var7 = kq6Var3;
                                        e89 e89Var17 = e89Var11;
                                        float f10 = f3;
                                        objR31 = new nm6(j18Var2, kq6Var7, jxVar3, f2, f4, aw2Var3, f10, eh6Var3, e89Var17, e89Var12);
                                        j18Var3 = j18Var2;
                                        kq6Var4 = kq6Var7;
                                        f5 = f4;
                                        f6 = f10;
                                        e89Var11 = e89Var17;
                                        e89Var13 = e89Var12;
                                        l46Var3.p0(objR31);
                                    } else {
                                        f5 = f4;
                                        e89Var13 = e89Var12;
                                        j18Var3 = j18Var2;
                                        kq6Var4 = kq6Var3;
                                        f6 = f3;
                                    }
                                    ph3VarA = yud.a(l46Var3);
                                    j09 j09VarS2 = dj6.S(fillElement2, (nm6) objR31, null);
                                    zI8 = l46Var3.i(jxVar3) | l46Var3.d(f5);
                                    j18 j18Var5 = j18Var3;
                                    objR32 = l46Var3.R();
                                    if (zI8) {
                                        objR32 = new wi3(jxVar3, f5, 1);
                                        l46Var3.p0(objR32);
                                    } else {
                                        objR32 = new wi3(jxVar3, f5, 1);
                                        l46Var3.p0(objR32);
                                    }
                                    j09 j09VarX3 = bzd.x(j09VarS2, (a26) objR32);
                                    zI9 = l46Var3.i(aw2Var3) | l46Var3.d(f6) | l46Var3.d(f5) | l46Var3.i(jxVar3) | l46Var3.g(e89Var13) | l46Var3.i(ph3VarA);
                                    objR33 = l46Var3.R();
                                    if (zI9) {
                                        jx jxVar8 = jxVar3;
                                        objR33 = new km6(aw2Var3, jxVar8, ph3VarA, f5, f6, e89Var11, e89Var13, null);
                                        jxVar4 = jxVar8;
                                        l46Var3.p0(objR33);
                                    } else {
                                        jx jxVar9 = jxVar3;
                                        objR33 = new km6(aw2Var3, jxVar9, ph3VarA, f5, f6, e89Var11, e89Var13, null);
                                        jxVar4 = jxVar9;
                                        l46Var3.p0(objR33);
                                    }
                                    j09 j09VarA2 = ul4.a(j09VarX3, zl4Var2, ks9.a, false, null, false, (n26) objR33, false, 188);
                                    xn8 xn8VarC2 = s21.c(ndb.b, false);
                                    aw2Var4 = aw2Var3;
                                    int iHashCode2 = Long.hashCode(l46Var3.T);
                                    u8a u8aVarM2 = l46Var3.m();
                                    j09 j09VarJ2 = m93.J(l46Var3, j09VarA2);
                                    lf2.q.getClass();
                                    l46Var3.j0();
                                    if (l46Var3.S) {
                                        l46Var3.l(LayoutNode.h1);
                                    } else {
                                        l46Var3.s0();
                                    }
                                    dec.l(hj6.z, l46Var3, xn8VarC2);
                                    dec.l(hj6.y, l46Var3, u8aVarM2);
                                    dec.l(hj6.X, l46Var3, Integer.valueOf(iHashCode2));
                                    dec.k(l46Var3);
                                    dec.l(hj6.x, l46Var3, j09VarJ2);
                                    h0eVar13 = h0eVar4;
                                    oo6 oo6Var2 = (oo6) h0eVar13.getValue();
                                    jxVar5 = jxVar4;
                                    z63 z63Var3 = cn6Var2.h;
                                    LocalDate localDate3 = cn6Var2.c;
                                    LocalDate localDate4 = cn6Var2.i;
                                    z63 z63Var4 = cn6Var2.j;
                                    h73 h73Var7 = cn6Var2.k;
                                    h73 h73Var8 = cn6Var2.l;
                                    int iJ2 = ((sz9) s69Var2).j();
                                    boolean z10 = ((oo6) h0eVar13.getValue()).e;
                                    List list3 = (List) h0eVar11.getValue();
                                    boolean zBooleanValue6 = ((Boolean) kq6Var4.O0.getValue()).booleanValue();
                                    float fFloatValue2 = ((Number) h0eVar2.getValue()).floatValue();
                                    zI10 = l46Var3.i(kq6Var4);
                                    objR34 = l46Var3.R();
                                    if (zI10) {
                                        objR34 = new uj3(1, kq6Var4, kq6.class, "onDailyFortuneFocusChange", "onDailyFortuneFocusChange(Lnet/xmind/donut/common/utils/DailyFortuneFocus;)V", 0, 24);
                                        l46Var3.p0(objR34);
                                    } else {
                                        objR34 = new uj3(1, kq6Var4, kq6.class, "onDailyFortuneFocusChange", "onDailyFortuneFocusChange(Lnet/xmind/donut/common/utils/DailyFortuneFocus;)V", 0, 24);
                                        l46Var3.p0(objR34);
                                    }
                                    ym7 ym7Var2 = (ym7) objR34;
                                    zG5 = l46Var3.g(q7bVar3);
                                    objR35 = l46Var3.R();
                                    if (zG5) {
                                        objR35 = new ro2(q7bVar3, 7);
                                        l46Var3.p0(objR35);
                                    } else {
                                        objR35 = new ro2(q7bVar3, 7);
                                        l46Var3.p0(objR35);
                                    }
                                    x16 x16Var13 = (x16) objR35;
                                    zG6 = l46Var3.g(q7bVar3);
                                    objR36 = l46Var3.R();
                                    if (zG6) {
                                        objR36 = new ro2(q7bVar3, 4);
                                        l46Var3.p0(objR36);
                                    } else {
                                        objR36 = new ro2(q7bVar3, 4);
                                        l46Var3.p0(objR36);
                                    }
                                    x16 x16Var14 = (x16) objR36;
                                    zG7 = l46Var3.g(q7bVar3);
                                    objR37 = l46Var3.R();
                                    if (zG7) {
                                        objR37 = new ro2(q7bVar3, 5);
                                        l46Var3.p0(objR37);
                                    } else {
                                        objR37 = new ro2(q7bVar3, 5);
                                        l46Var3.p0(objR37);
                                    }
                                    x16 x16Var15 = (x16) objR37;
                                    zG8 = l46Var3.g(h0eVar13) | l46Var3.g(q7bVar3);
                                    objR38 = l46Var3.R();
                                    if (zG8) {
                                        objR38 = new jf6(6, h0eVar13, q7bVar3);
                                        l46Var3.p0(objR38);
                                    } else {
                                        objR38 = new jf6(6, h0eVar13, q7bVar3);
                                        l46Var3.p0(objR38);
                                    }
                                    x16 x16Var16 = (x16) objR38;
                                    mmaVar3 = mmaVar2;
                                    zI11 = l46Var3.i(mmaVar3);
                                    objR39 = l46Var3.R();
                                    if (zI11) {
                                        objR39 = new qo2(mmaVar3, 8);
                                        l46Var3.p0(objR39);
                                    } else {
                                        objR39 = new qo2(mmaVar3, 8);
                                        l46Var3.p0(objR39);
                                    }
                                    x16 x16Var17 = (x16) objR39;
                                    zG9 = l46Var3.g(cn6Var2) | l46Var3.g(q7bVar3);
                                    objR40 = l46Var3.R();
                                    if (zG9) {
                                        final int i15 = 0;
                                        objR40 = new x16() { // from class: tl6
                                            @Override // defpackage.x16
                                            public final Object invoke() {
                                                Object dailyCardEntry;
                                                int i16 = i15;
                                                wef wefVar = wef.a;
                                                q7b q7bVar4 = q7bVar3;
                                                cn6 cn6Var3 = cn6Var2;
                                                switch (i16) {
                                                    case 0:
                                                        a63.c("homepage", "today");
                                                        LocalDate localDate5 = cn6Var3.c;
                                                        String string = localDate5.toString();
                                                        string.getClass();
                                                        boolean zG18 = um6.g(localDate5, cn6Var3.m, cn6Var3.e);
                                                        cb9 cb9Var = q7bVar4.a;
                                                        if (!zG18) {
                                                            ka9.e(cb9Var, new DailyCardEntry("homepage", string), null, 6);
                                                        } else {
                                                            ka9.e(cb9Var, new ViewDailyCardRoute(string, "homepage"), null, 6);
                                                        }
                                                        break;
                                                    default:
                                                        LocalDate localDate6 = cn6Var3.d;
                                                        String string2 = localDate6.toString();
                                                        string2.getClass();
                                                        a63.c("calendar", o.b(string2, cn6Var3.c));
                                                        cb9 cb9Var2 = q7bVar4.a;
                                                        List list4 = cn6Var3.m;
                                                        List list5 = cn6Var3.e;
                                                        list4.getClass();
                                                        list5.getClass();
                                                        if (um6.g(localDate6, list4, list5)) {
                                                            String string3 = localDate6.toString();
                                                            string3.getClass();
                                                            dailyCardEntry = new ViewDailyCardRoute(string3, "calendar");
                                                        } else {
                                                            String string4 = localDate6.toString();
                                                            string4.getClass();
                                                            dailyCardEntry = new DailyCardEntry("calendar", string4);
                                                        }
                                                        ka9.e(cb9Var2, dailyCardEntry, null, 6);
                                                        break;
                                                }
                                                return wefVar;
                                            }
                                        };
                                        l46Var3.p0(objR40);
                                    } else {
                                        final int i16 = 0;
                                        objR40 = new x16() { // from class: tl6
                                            @Override // defpackage.x16
                                            public final Object invoke() {
                                                Object dailyCardEntry;
                                                int i17 = i16;
                                                wef wefVar = wef.a;
                                                q7b q7bVar4 = q7bVar3;
                                                cn6 cn6Var3 = cn6Var2;
                                                switch (i17) {
                                                    case 0:
                                                        a63.c("homepage", "today");
                                                        LocalDate localDate5 = cn6Var3.c;
                                                        String string = localDate5.toString();
                                                        string.getClass();
                                                        boolean zG18 = um6.g(localDate5, cn6Var3.m, cn6Var3.e);
                                                        cb9 cb9Var = q7bVar4.a;
                                                        if (!zG18) {
                                                            ka9.e(cb9Var, new DailyCardEntry("homepage", string), null, 6);
                                                        } else {
                                                            ka9.e(cb9Var, new ViewDailyCardRoute(string, "homepage"), null, 6);
                                                        }
                                                        break;
                                                    default:
                                                        LocalDate localDate6 = cn6Var3.d;
                                                        String string2 = localDate6.toString();
                                                        string2.getClass();
                                                        a63.c("calendar", o.b(string2, cn6Var3.c));
                                                        cb9 cb9Var2 = q7bVar4.a;
                                                        List list4 = cn6Var3.m;
                                                        List list5 = cn6Var3.e;
                                                        list4.getClass();
                                                        list5.getClass();
                                                        if (um6.g(localDate6, list4, list5)) {
                                                            String string3 = localDate6.toString();
                                                            string3.getClass();
                                                            dailyCardEntry = new ViewDailyCardRoute(string3, "calendar");
                                                        } else {
                                                            String string4 = localDate6.toString();
                                                            string4.getClass();
                                                            dailyCardEntry = new DailyCardEntry("calendar", string4);
                                                        }
                                                        ka9.e(cb9Var2, dailyCardEntry, null, 6);
                                                        break;
                                                }
                                                return wefVar;
                                            }
                                        };
                                        l46Var3.p0(objR40);
                                    }
                                    x16 x16Var18 = (x16) objR40;
                                    zG10 = l46Var3.g(cn6Var2) | l46Var3.g(q7bVar3);
                                    objR41 = l46Var3.R();
                                    if (zG10) {
                                        final int i17 = 0;
                                        objR41 = new a26() { // from class: ul6
                                            @Override // defpackage.a26
                                            public final Object d(Object obj11) {
                                                int i18 = i17;
                                                wef wefVar = wef.a;
                                                q7b q7bVar4 = q7bVar3;
                                                cn6 cn6Var3 = cn6Var2;
                                                switch (i18) {
                                                    case 0:
                                                        LocalDate localDate5 = (LocalDate) obj11;
                                                        localDate5.getClass();
                                                        a63.c("homepage", "tomorrow");
                                                        String string = localDate5.toString();
                                                        string.getClass();
                                                        boolean zG18 = um6.g(localDate5, cn6Var3.m, cn6Var3.e);
                                                        cb9 cb9Var = q7bVar4.a;
                                                        if (!zG18) {
                                                            ka9.e(cb9Var, new DailyCardEntry("homepage", string), null, 6);
                                                        } else {
                                                            ka9.e(cb9Var, new ViewDailyCardRoute(string, "homepage"), null, 6);
                                                        }
                                                        break;
                                                    default:
                                                        String str = (String) obj11;
                                                        str.getClass();
                                                        a63.c("calendar", o.b(str, cn6Var3.c));
                                                        ka9.e(q7bVar4.a, new ViewDailyCardRoute(str, "calendar"), null, 6);
                                                        break;
                                                }
                                                return wefVar;
                                            }
                                        };
                                        l46Var3.p0(objR41);
                                    } else {
                                        final int i18 = 0;
                                        objR41 = new a26() { // from class: ul6
                                            @Override // defpackage.a26
                                            public final Object d(Object obj11) {
                                                int i19 = i18;
                                                wef wefVar = wef.a;
                                                q7b q7bVar4 = q7bVar3;
                                                cn6 cn6Var3 = cn6Var2;
                                                switch (i19) {
                                                    case 0:
                                                        LocalDate localDate5 = (LocalDate) obj11;
                                                        localDate5.getClass();
                                                        a63.c("homepage", "tomorrow");
                                                        String string = localDate5.toString();
                                                        string.getClass();
                                                        boolean zG18 = um6.g(localDate5, cn6Var3.m, cn6Var3.e);
                                                        cb9 cb9Var = q7bVar4.a;
                                                        if (!zG18) {
                                                            ka9.e(cb9Var, new DailyCardEntry("homepage", string), null, 6);
                                                        } else {
                                                            ka9.e(cb9Var, new ViewDailyCardRoute(string, "homepage"), null, 6);
                                                        }
                                                        break;
                                                    default:
                                                        String str = (String) obj11;
                                                        str.getClass();
                                                        a63.c("calendar", o.b(str, cn6Var3.c));
                                                        ka9.e(q7bVar4.a, new ViewDailyCardRoute(str, "calendar"), null, 6);
                                                        break;
                                                }
                                                return wefVar;
                                            }
                                        };
                                        l46Var3.p0(objR41);
                                    }
                                    a26 a26Var7 = (a26) objR41;
                                    a26 a26Var8 = (a26) ym7Var2;
                                    yk8Var2 = yk8Var;
                                    zI12 = l46Var3.i(yk8Var2);
                                    objR42 = l46Var3.R();
                                    if (zI12) {
                                        objR42 = new u11(yk8Var2, 2);
                                        l46Var3.p0(objR42);
                                    } else {
                                        objR42 = new u11(yk8Var2, 2);
                                        l46Var3.p0(objR42);
                                    }
                                    x16 x16Var19 = (x16) objR42;
                                    zG11 = l46Var3.g(q7bVar3);
                                    objR43 = l46Var3.R();
                                    if (zG11) {
                                        objR43 = new ro2(q7bVar3, 6);
                                        l46Var3.p0(objR43);
                                    } else {
                                        objR43 = new ro2(q7bVar3, 6);
                                        l46Var3.p0(objR43);
                                    }
                                    x16 x16Var110 = (x16) objR43;
                                    zI13 = l46Var3.i(kq6Var4) | l46Var3.g(q7bVar3);
                                    objR44 = l46Var3.R();
                                    if (zI13) {
                                        objR44 = new so5(9, kq6Var4, q7bVar3);
                                        l46Var3.p0(objR44);
                                    } else {
                                        objR44 = new so5(9, kq6Var4, q7bVar3);
                                        l46Var3.p0(objR44);
                                    }
                                    a26 a26Var9 = (a26) objR44;
                                    e89Var14 = e89Var13;
                                    Object obj11 = obj8;
                                    n16.l(oo6Var2, z63Var3, localDate3, localDate4, z63Var4, h73Var7, h73Var8, h73Var4, iJ2, z10, list3, zBooleanValue6, fFloatValue2, j18Var5, x16Var13, q7bVar3, x16Var14, x16Var15, x16Var16, x16Var17, x16Var18, a26Var7, a26Var8, x16Var2, x16Var19, x16Var110, a26Var9, l46Var3, 32832);
                                    l46Var3.f0(1897101544);
                                    pr4Var2 = l8b.a;
                                    iOrdinal2 = ((e8b) l46Var3.k(pr4Var2)).C.ordinal();
                                    h0eVar14 = h0eVar9;
                                    if (iOrdinal2 != 0) {
                                        r5 = 0;
                                        l46Var3.f0(1897096649);
                                        l46Var3.r(false);
                                        jB = y72.b(abg.d(4283452772L), ((Number) h0eVar14.getValue()).floatValue());
                                    } else {
                                        if (iOrdinal2 == 1) {
                                            throw tec.d(1897093469, l46Var3, false);
                                        }
                                        l46Var3.f0(1897099529);
                                        jB = y72.b(((e8b) l46Var3.k(pr4Var2)).b, ((Number) h0eVar14.getValue()).floatValue());
                                        r5 = 0;
                                        l46Var3.r(false);
                                    }
                                    j09VarO = tm7.o(fillElement2, jB, y02Var);
                                    if (((eo4) e89Var14.getValue()) == eo4.b) {
                                        l46Var3.f0(2082874527);
                                        zI14 = l46Var3.i(aw2Var4) | l46Var3.i(jxVar5) | l46Var3.g(e89Var14);
                                        objR45 = l46Var3.R();
                                        if (zI14) {
                                            objR45 = new hm6(aw2Var4, jxVar5, e89Var14);
                                            l46Var3.p0(objR45);
                                        } else {
                                            objR45 = new hm6(aw2Var4, jxVar5, e89Var14);
                                            l46Var3.p0(objR45);
                                        }
                                        j09VarO = androidx.compose.foundation.b.c(j09VarO, false, null, null, (x16) ((ym7) objR45), 15);
                                        l46Var3.r(r5);
                                    } else {
                                        l46Var3.f0(-1872470754);
                                        l46Var3.r(r5);
                                    }
                                    l46Var3.r(r5);
                                    s21.a(j09VarO, l46Var3, r5);
                                    l46Var3.r(true);
                                } else {
                                    l46Var3.Z();
                                }
                                return wef.a;
                            }
                        }, l46Var2), l46Var2, 12582918, 122);
                        Boolean boolValueOf3 = Boolean.valueOf(z7);
                        boolean zH3 = l46Var2.h(z7) | l46Var2.i(jxVar2) | l46Var2.d(fP0) | l46Var2.g(h0eVar4) | l46Var2.g(e89Var8) | l46Var2.g(h0eVar5) | l46Var2.g(h0eVar6) | l46Var2.g(e89Var7);
                        Object objR30 = l46Var2.R();
                        if (zH3 || objR30 == i8cVar) {
                            pm6 pm6Var = new pm6(z7, jxVar2, fP0, h0eVar4, e89Var8, h0eVar5, h0eVar6, e89Var7, null);
                            l46Var2.p0(pm6Var);
                            objR30 = pm6Var;
                        }
                        af1.o((l26) objR30, l46Var2, boolValueOf3);
                    } else {
                        l46Var2.Z();
                    }
                    return wef.a;
                }
            }, l46Var), l46Var, 3072, 7);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new oo2(q7bVar, i, 13);
        }
    }

    public static final long c(jx jxVar, float f, float f2, aw2 aw2Var, float f3, eh6 eh6Var, e89 e89Var, float f4, boolean z) {
        if (f4 == 0.0f) {
            return 0L;
        }
        float fFloatValue = ((Number) jxVar.e()).floatValue();
        boolean z2 = false;
        boolean z3 = f4 > 0.0f && z;
        if (f4 < 0.0f && fFloatValue > 0.0f) {
            z2 = true;
        }
        if (!z3 && !z2) {
            return 0L;
        }
        float fN = mh3.n((z3 ? f(fFloatValue, f4, f) : f4) + fFloatValue, 0.0f, f2);
        if (z3 && fN >= f3 && !((Boolean) e89Var.getValue()).booleanValue()) {
            ((afa) eh6Var).a(23);
            e89Var.setValue(Boolean.TRUE);
        }
        ynb.V(aw2Var, null, null, new om6(jxVar, fN, null), 3);
        if (!z3) {
            f4 = fN - fFloatValue;
        }
        return (((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(f4)) & 4294967295L);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0024  */
    public static final Object d(jx jxVar, float f, float f2, e89 e89Var, e89 e89Var2, float f3, float f4, ph3 ph3Var, zn2 zn2Var) {
        qm6 qm6Var;
        float f5;
        eo4 eo4Var;
        float f6 = f;
        e89 e89Var3 = e89Var;
        e89 e89Var4 = e89Var2;
        if (zn2Var instanceof qm6) {
            qm6Var = (qm6) zn2Var;
            int i = qm6Var.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                qm6Var.label = i - Integer.MIN_VALUE;
            } else {
                qm6Var = new qm6(zn2Var);
            }
        } else {
            qm6Var = new qm6(zn2Var);
        }
        qm6 qm6Var2 = qm6Var;
        Object objB = qm6Var2.result;
        int i2 = qm6Var2.label;
        if (i2 == 0) {
            jzb.q(objB);
            float fR = lmg.R(ph3Var, f3, f4);
            f5 = fR >= f2 ? f6 : 0.0f;
            int i3 = ((f4 <= 0.0f || fR < f5) && (f4 >= 0.0f || fR > f5)) ? 0 : 1;
            bw2 bw2Var = bw2.a;
            if (i3 != 0) {
                Float f7 = new Float(f4);
                qm6Var2.L$0 = null;
                qm6Var2.L$1 = e89Var3;
                qm6Var2.L$2 = e89Var4;
                qm6Var2.L$3 = null;
                qm6Var2.F$0 = f6;
                qm6Var2.F$1 = f2;
                qm6Var2.F$2 = f3;
                qm6Var2.F$3 = f4;
                qm6Var2.F$4 = fR;
                qm6Var2.F$5 = f5;
                qm6Var2.I$0 = i3;
                qm6Var2.label = 1;
                objB = jx.a(jxVar, f7, ph3Var, qm6Var2);
                if (objB == bw2Var) {
                    return bw2Var;
                }
            } else {
                Float f8 = new Float(f5);
                Float f9 = new Float(f4);
                qm6Var2.L$0 = null;
                qm6Var2.L$1 = e89Var3;
                qm6Var2.L$2 = e89Var4;
                qm6Var2.L$3 = null;
                qm6Var2.F$0 = f6;
                qm6Var2.F$1 = f2;
                qm6Var2.F$2 = f3;
                qm6Var2.F$3 = f4;
                qm6Var2.F$4 = fR;
                qm6Var2.F$5 = f5;
                qm6Var2.I$0 = i3;
                qm6Var2.label = 2;
                objB = jx.b(jxVar, f8, null, f9, null, qm6Var2, 10);
                if (objB == bw2Var) {
                    return bw2Var;
                }
            }
        } else if (i2 == 1) {
            float f10 = qm6Var2.F$5;
            float f11 = qm6Var2.F$0;
            e89 e89Var5 = (e89) qm6Var2.L$2;
            e89 e89Var6 = (e89) qm6Var2.L$1;
            jzb.q(objB);
            e89Var4 = e89Var5;
            e89Var3 = e89Var6;
            f5 = f10;
            f6 = f11;
        } else {
            if (i2 != 2) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            float f12 = qm6Var2.F$5;
            float f13 = qm6Var2.F$0;
            e89 e89Var7 = (e89) qm6Var2.L$2;
            e89 e89Var8 = (e89) qm6Var2.L$1;
            jzb.q(objB);
            e89Var4 = e89Var7;
            e89Var3 = e89Var8;
            f5 = f12;
            f6 = f13;
        }
        if (f5 == f6) {
            eo4Var = eo4.b;
        } else {
            e89Var3.setValue(Boolean.FALSE);
            eo4Var = eo4.a;
        }
        e89Var4.setValue(eo4Var);
        return wef.a;
    }

    public static final long e(l46 l46Var) {
        int iOrdinal = ((e8b) l46Var.k(l8b.a)).C.ordinal();
        if (iOrdinal == 0) {
            return abg.d(4288584159L);
        }
        if (iOrdinal == 1) {
            return abg.d(4278190080L);
        }
        ap.c();
        return 0L;
    }

    public static final float f(float f, float f2, float f3) {
        if (f3 <= 0.0f) {
            return f2;
        }
        float f4 = (f3 - f) * 0.55f;
        if (f4 <= 0.0f) {
            return 0.0f;
        }
        float f5 = (((f * f3) / f4) * 0.55f) + f3;
        return (((f3 * f3) * 0.55f) / (f5 * f5)) * f2;
    }

    public static final boolean g(LocalDate localDate, List list, List list2) {
        localDate.getClass();
        list.getClass();
        list2.getClass();
        String string = localDate.toString();
        string.getClass();
        if (list.contains(string)) {
            return true;
        }
        if (list2.isEmpty()) {
            return false;
        }
        Iterator it = list2.iterator();
        while (it.hasNext()) {
            if (pa7.t(((DailyCard) it.next()).getDate(), string)) {
                return true;
            }
        }
        return false;
    }
}
