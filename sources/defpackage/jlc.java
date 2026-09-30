package defpackage;

import ai.askquin.R;
import androidx.compose.foundation.layout.b;
import androidx.compose.ui.node.LayoutNode;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import tech.chatmind.api.seasonal.model.SolarTerm;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class jlc {
    public static final List a = t72.I(Integer.valueOf(R.string.seasonal_follow_up_suggestion_1), Integer.valueOf(R.string.seasonal_follow_up_suggestion_2), Integer.valueOf(R.string.seasonal_follow_up_suggestion_3), Integer.valueOf(R.string.seasonal_follow_up_suggestion_4), Integer.valueOf(R.string.seasonal_follow_up_suggestion_5));

    public static final void a(int i, int i2, l46 l46Var, j09 j09Var) {
        l46Var.h0(882988572);
        int i3 = (l46Var.e(i) ? 4 : 2) | i2;
        if (l46Var.W(i3 & 1, (i3 & 19) != 18)) {
            nte.b(afc.r(R.string.seasonal_follow_up_remaining, new Object[]{Integer.valueOf(i), 5}, l46Var), j09Var, ((e8b) l46Var.k(l8b.a)).r, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, pue.a, l46Var, 48, 0, 131064);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new pb(i, j09Var, i2, 6);
        }
    }

    public static final void b(fpc fpcVar, final SolarTerm solarTerm, final boolean z, final erc ercVar, final a26 a26Var, final x16 x16Var, l46 l46Var, int i) {
        boolean z2;
        l46Var.h0(729470188);
        int i2 = i | (l46Var.g(fpcVar) ? 4 : 2) | (l46Var.e(solarTerm.ordinal()) ? 32 : 16) | (l46Var.h(z) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) | (l46Var.g(ercVar) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE) | (l46Var.i(a26Var) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE) | (l46Var.i(x16Var) ? 131072 : 65536);
        if (l46Var.W(i2 & 1, (74899 & i2) != 74898)) {
            final String strD = n3d.d(solarTerm, "followup");
            if (strD == null) {
                ojb ojbVarV = l46Var.v();
                if (ojbVarV != null) {
                    ojbVarV.d = new tkc(i, 1, x16Var, a26Var, fpcVar, ercVar, solarTerm, z);
                    return;
                }
                return;
            }
            boolean z3 = (i2 & 14) == 4;
            Object objR = l46Var.R();
            Object obj = sf2.a;
            Object obj2 = objR;
            if (z3 || objR == obj) {
                List list = fpcVar != null ? fpcVar.d : null;
                if (list == null) {
                    list = pu4.a;
                }
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : list) {
                    String str = ((klc) obj3).b;
                    if (str != null && !v4e.Q(str)) {
                        arrayList.add(obj3);
                    }
                }
                l46Var.p0(arrayList);
                obj2 = arrayList;
            }
            final List list2 = (List) obj2;
            final int size = list2.size();
            final boolean z4 = size >= 5;
            final use useVarO = n3d.o(null, l46Var, 3);
            final ghc ghcVarT = mh3.T(l46Var);
            final xn5 xn5Var = (xn5) l46Var.k(zg2.i);
            final boolean z5 = (list2.isEmpty() && (ercVar instanceof crc)) ? false : true;
            Integer numValueOf = Integer.valueOf(list2.size());
            boolean zG = l46Var.g(ghcVarT);
            Object objR2 = l46Var.R();
            if (zG || objR2 == obj) {
                objR2 = new elc(ghcVarT, null);
                l46Var.p0(objR2);
            }
            af1.p(numValueOf, ercVar, (l26) objR2, l46Var);
            Object objR3 = l46Var.R();
            if (objR3 == obj) {
                objR3 = q1c.f(null);
                l46Var.p0(objR3);
            }
            final e89 e89Var = (e89) objR3;
            boolean z6 = (i2 & 7168) == 2048;
            Object objR4 = l46Var.R();
            if (z6 || objR4 == obj) {
                objR4 = new flc(ercVar, e89Var, null);
                l46Var.p0(objR4);
            }
            af1.o((l26) objR4, l46Var, ercVar);
            String str2 = (String) e89Var.getValue();
            boolean zG2 = l46Var.g(ghcVarT);
            Object objR5 = l46Var.R();
            if (zG2 || objR5 == obj) {
                objR5 = new ilc(e89Var, ghcVarT, null);
                l46Var.p0(objR5);
            }
            af1.o((l26) objR5, l46Var, str2);
            g21.o(null, af1.b0(404345928, new n26() { // from class: zkc
                @Override // defpackage.n26
                public final Object m(Object obj4, Object obj5, Object obj6) {
                    l46 l46Var2 = (l46) obj5;
                    int iIntValue = ((Integer) obj6).intValue();
                    ((c31) obj4).getClass();
                    if (l46Var2.W(iIntValue & 1, (iIntValue & 17) != 16)) {
                        long j = y72.j;
                        x16 x16Var2 = x16Var;
                        final SolarTerm solarTerm2 = solarTerm;
                        final boolean z7 = z5;
                        dd2 dd2VarB0 = af1.b0(-1013823228, new kg(12, x16Var2, solarTerm2, z7), l46Var2);
                        final xn5 xn5Var2 = xn5Var;
                        final a26 a26Var2 = a26Var;
                        final erc ercVar2 = ercVar;
                        final use useVar = useVarO;
                        final String str3 = strD;
                        final boolean z8 = z4;
                        final boolean z9 = z;
                        dd2 dd2VarB1 = af1.b0(-1184662685, new l26() { // from class: blc
                            @Override // defpackage.l26
                            public final Object z(Object obj7, Object obj8) {
                                l46 l46Var3 = (l46) obj7;
                                int iIntValue2 = ((Integer) obj8).intValue();
                                if (l46Var3.W(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                                    boolean z10 = z8;
                                    boolean z11 = !z10;
                                    Object objR6 = l46Var3.R();
                                    int i3 = 5;
                                    i8c i8cVar = sf2.a;
                                    if (objR6 == i8cVar) {
                                        objR6 = new hl4(i3);
                                        l46Var3.p0(objR6);
                                    }
                                    cx4 cx4VarA = rw4.n(1, (a26) objR6).a(rw4.f(null, 3));
                                    Object objR7 = l46Var3.R();
                                    if (objR7 == i8cVar) {
                                        objR7 = new hl4(i3);
                                        l46Var3.p0(objR7);
                                    }
                                    m93.d(z11, null, cx4VarA, rw4.p(1, (a26) objR7).a(rw4.g(null, 3)), null, af1.b0(1203271051, new dlc(xn5Var2, a26Var2, ercVar2, useVar, str3, solarTerm2, z10, z9), l46Var3), l46Var3, 200064, 18);
                                } else {
                                    l46Var3.Z();
                                }
                                return wef.a;
                            }
                        }, l46Var2);
                        final ghc ghcVar = ghcVarT;
                        final int i3 = size;
                        final List list3 = list2;
                        final e89 e89Var2 = e89Var;
                        xdc.a(null, dd2VarB0, dd2VarB1, null, null, 0, j, 0L, null, af1.b0(1496790617, new n26() { // from class: clc
                            @Override // defpackage.n26
                            public final Object m(Object obj7, Object obj8, Object obj9) {
                                g09 g09Var;
                                final boolean z10;
                                boolean z11;
                                xw9 xw9Var = (xw9) obj7;
                                l46 l46Var3 = (l46) obj8;
                                int iIntValue2 = ((Integer) obj9).intValue();
                                xw9Var.getClass();
                                if ((iIntValue2 & 6) == 0) {
                                    iIntValue2 |= l46Var3.g(xw9Var) ? 4 : 2;
                                }
                                if (l46Var3.W(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                                    j09 j09VarD0 = mh3.d0(ynb.b0(20.0f, 0.0f, eb3.E(ynb.Y(b.c, xw9Var), xw9Var), 2), ghcVar, false, 14);
                                    c92 c92VarA = a92.a(xc0.c, ndb.Y, l46Var3, 0);
                                    int iHashCode = Long.hashCode(l46Var3.T);
                                    u8a u8aVarM = l46Var3.m();
                                    j09 j09VarJ = m93.J(l46Var3, j09VarD0);
                                    lf2.q.getClass();
                                    l46Var3.j0();
                                    if (l46Var3.S) {
                                        l46Var3.l(LayoutNode.h1);
                                    } else {
                                        l46Var3.s0();
                                    }
                                    dec.l(hj6.z, l46Var3, c92VarA);
                                    dec.l(hj6.y, l46Var3, u8aVarM);
                                    dec.l(hj6.X, l46Var3, Integer.valueOf(iHashCode));
                                    dec.k(l46Var3);
                                    dec.l(hj6.x, l46Var3, j09VarJ);
                                    boolean z12 = z7;
                                    int i4 = i3;
                                    final use useVar2 = useVar;
                                    i8c i8cVar = sf2.a;
                                    g09 g09Var2 = g09.a;
                                    if (z12) {
                                        l46Var3.f0(1134857162);
                                        boolean z13 = z8;
                                        if (z13) {
                                            l46Var3.f0(1135214003);
                                            l46Var3.r(false);
                                        } else {
                                            l46Var3.f0(1135007388);
                                            jlc.a(i4, 48, l46Var3, ynb.d0(0.0f, 8.0f, 0.0f, 16.0f, 5, b.c(g09Var2, 1.0f)));
                                            l46Var3.r(false);
                                        }
                                        e89 e89Var3 = e89Var2;
                                        String str4 = (String) e89Var3.getValue();
                                        Object objR6 = l46Var3.R();
                                        if (objR6 == i8cVar) {
                                            objR6 = new xfc(e89Var3, 1);
                                            l46Var3.p0(objR6);
                                        }
                                        x16 x16Var3 = (x16) objR6;
                                        final erc ercVar3 = ercVar2;
                                        boolean zI = l46Var3.i(ercVar3) | l46Var3.h(z13);
                                        final boolean z14 = z9;
                                        boolean zH = zI | l46Var3.h(z14);
                                        final SolarTerm solarTerm3 = solarTerm2;
                                        boolean zE = l46Var3.e(solarTerm3.ordinal()) | zH;
                                        final String str5 = str3;
                                        boolean zG3 = zE | l46Var3.g(str5) | l46Var3.g(useVar2);
                                        final a26 a26Var3 = a26Var2;
                                        boolean zG4 = zG3 | l46Var3.g(a26Var3);
                                        final xn5 xn5Var3 = xn5Var2;
                                        boolean zI2 = zG4 | l46Var3.i(xn5Var3);
                                        Object objR7 = l46Var3.R();
                                        if (zI2 || objR7 == i8cVar) {
                                            z10 = z13;
                                            a26 a26Var4 = new a26() { // from class: ukc
                                                @Override // defpackage.a26
                                                public final Object d(Object obj10) {
                                                    String str6 = (String) obj10;
                                                    str6.getClass();
                                                    jlc.c(ercVar3, z10, z14, useVar2, a26Var3, xn5Var3, solarTerm3, str5, str6);
                                                    return wef.a;
                                                }
                                            };
                                            l46Var3.p0(a26Var4);
                                            objR7 = a26Var4;
                                        } else {
                                            z10 = z13;
                                        }
                                        g09Var = g09Var2;
                                        jlc.d(list3, ercVar3, str4, x16Var3, (a26) objR7, l46Var3, 3072);
                                        if (z10) {
                                            l46Var3.f0(1135659876);
                                            z11 = false;
                                            nte.b(afc.r(R.string.seasonal_follow_up_remaining, new Object[]{Integer.valueOf(i4), 5}, l46Var3), ynb.d0(0.0f, 24.0f, 0.0f, 0.0f, 13, b.c(g09Var, 1.0f)), ((e8b) l46Var3.k(l8b.a)).r, 0L, null, null, 0L, null, new jme(3), 0L, 0, false, 0, 0, null, pue.a, l46Var3, 48, 0, 130040);
                                            l46Var3 = l46Var3;
                                            l46Var3.r(false);
                                        } else {
                                            z11 = false;
                                            l46Var3.f0(1136024467);
                                            l46Var3.r(false);
                                        }
                                        l46Var3.r(z11);
                                    } else {
                                        g09Var = g09Var2;
                                        l46Var3.f0(1136046198);
                                        boolean zG5 = l46Var3.g(useVar2);
                                        Object objR8 = l46Var3.R();
                                        if (zG5 || objR8 == i8cVar) {
                                            objR8 = new vkc(useVar2, 0);
                                            l46Var3.p0(objR8);
                                        }
                                        jlc.e(i4, 0, (a26) objR8, l46Var3);
                                        l46Var3.r(false);
                                    }
                                    tec.u(g09Var, 16.0f, l46Var3, true);
                                } else {
                                    l46Var3.Z();
                                }
                                return wef.a;
                            }
                        }, l46Var2), l46Var2, 806879664, 441);
                    } else {
                        l46Var2.Z();
                    }
                    return wef.a;
                }
            }, l46Var), l46Var, 48, 1);
            if (z) {
                l46Var.f0(-882576846);
                boolean zG3 = l46Var.g(strD);
                Object objR6 = l46Var.R();
                if (zG3 || objR6 == obj) {
                    z2 = false;
                    objR6 = new alc(strD, 0);
                    l46Var.p0(objR6);
                } else {
                    z2 = false;
                }
                dec.b("page_view", (a26) objR6, l46Var, 6);
                l46Var.r(z2);
            } else {
                l46Var.f0(-882449994);
                l46Var.r(false);
            }
        } else {
            l46Var.Z();
        }
        ojb ojbVarV2 = l46Var.v();
        if (ojbVarV2 != null) {
            ojbVarV2.d = new tkc(i, 2, x16Var, a26Var, fpcVar, ercVar, solarTerm, z);
        }
    }

    public static final void c(erc ercVar, boolean z, boolean z2, use useVar, a26 a26Var, xn5 xn5Var, SolarTerm solarTerm, String str, String str2) {
        String string = v4e.o0(str2).toString();
        if (string.length() == 0 || (ercVar instanceof drc)) {
            return;
        }
        if (z) {
            jcc.k(0, Integer.valueOf(R.string.seasonal_follow_up_limit_reached));
            return;
        }
        if (z2) {
            x1f x1fVar = x1f.a;
            x1f.k(p05.a, new xkc(0, solarTerm, str), 2);
        }
        n3d.g(useVar);
        a26Var.d(string);
        xn5.a(xn5Var);
    }

    public static final void d(List list, erc ercVar, String str, x16 x16Var, a26 a26Var, l46 l46Var, int i) {
        l46Var.h0(122312212);
        int i2 = 2;
        int i3 = i | (l46Var.g(list) ? 4 : 2) | (l46Var.g(ercVar) ? 32 : 16) | (l46Var.g(str) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) | (l46Var.i(a26Var) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE);
        if (l46Var.W(i3 & 1, (i3 & 9363) != 9362)) {
            int i4 = 6;
            c92 c92VarA = a92.a(new uc0(20.0f, true, new qc0(0)), ndb.Y, l46Var, 6);
            int iHashCode = Long.hashCode(l46Var.T);
            u8a u8aVarM = l46Var.m();
            j09 j09VarJ = m93.J(l46Var, g09.a);
            lf2.q.getClass();
            l46Var.j0();
            if (l46Var.S) {
                l46Var.l(LayoutNode.h1);
            } else {
                l46Var.s0();
            }
            dec.l(hj6.z, l46Var, c92VarA);
            dec.l(hj6.y, l46Var, u8aVarM);
            dec.l(hj6.X, l46Var, Integer.valueOf(iHashCode));
            dec.k(l46Var);
            Iterator itS = kv2.s(l46Var, j09VarJ, hj6.x, 1069103571, list);
            while (itS.hasNext()) {
                klc klcVar = (klc) itS.next();
                jgb.i(klcVar.a, null, af1.b0(-1689781398, new o7b(klcVar, str, x16Var, i4), l46Var), l46Var, 384, 2);
            }
            l46Var.r(false);
            if (ercVar instanceof drc) {
                l46Var.f0(1069121038);
                jgb.i(((drc) ercVar).a, null, i7h.e, l46Var, 384, 2);
                l46Var.r(false);
            } else if (ercVar instanceof brc) {
                l46Var.f0(1069124949);
                jgb.i(((brc) ercVar).a, null, af1.b0(-1146918920, new p4c(i2, a26Var, ercVar), l46Var), l46Var, 384, 2);
                l46Var.r(false);
            } else {
                if (!pa7.t(ercVar, crc.a)) {
                    throw tec.d(1069119533, l46Var, false);
                }
                l46Var.f0(1069139150);
                l46Var.r(false);
            }
            l46Var.r(true);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new cm(list, ercVar, str, x16Var, a26Var, i);
        }
    }

    public static final void e(int i, int i2, a26 a26Var, l46 l46Var) {
        u51 u51Var;
        q11 q11Var;
        mue mueVarC;
        a26 a26Var2 = a26Var;
        l46 l46Var2 = l46Var;
        l46Var2.h0(1290971517);
        int i3 = i2 | (l46Var2.e(i) ? 4 : 2) | (l46Var2.i(a26Var2) ? 32 : 16);
        if (l46Var2.W(i3 & 1, (i3 & 19) != 18)) {
            l46Var2.f0(-621916649);
            List list = a;
            ArrayList<String> arrayList = new ArrayList(t72.u(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(afc.q(((Number) it.next()).intValue(), l46Var2));
            }
            l46Var2.r(false);
            pr4 pr4Var = l8b.a;
            boolean zE = k8b.e((e8b) l46Var2.k(pr4Var));
            uc0 uc0Var = new uc0(24.0f, true, new qc0(0));
            jx0 jx0Var = ndb.Y;
            c92 c92VarA = a92.a(uc0Var, jx0Var, l46Var2, 6);
            int iHashCode = Long.hashCode(l46Var2.T);
            u8a u8aVarM = l46Var2.m();
            g09 g09Var = g09.a;
            j09 j09VarJ = m93.J(l46Var2, g09Var);
            lf2.q.getClass();
            l46Var2.j0();
            boolean z = l46Var2.S;
            ov7 ov7Var = LayoutNode.h1;
            if (z) {
                l46Var2.l(ov7Var);
            } else {
                l46Var2.s0();
            }
            he2 he2Var = hj6.z;
            dec.l(he2Var, l46Var2, c92VarA);
            he2 he2Var2 = hj6.y;
            dec.l(he2Var2, l46Var2, u8aVarM);
            Integer numValueOf = Integer.valueOf(iHashCode);
            he2 he2Var3 = hj6.X;
            dec.l(he2Var3, l46Var2, numValueOf);
            dec.k(l46Var2);
            he2 he2Var4 = hj6.x;
            dec.l(he2Var4, l46Var2, j09VarJ);
            j09 j09VarA0 = ynb.a0(b.c(g09Var, 1.0f), 32.0f, 12.0f);
            c92 c92VarA2 = a92.a(new uc0(8.0f, true, new qc0(0)), ndb.Z, l46Var2, 54);
            int iHashCode2 = Long.hashCode(l46Var2.T);
            u8a u8aVarM2 = l46Var2.m();
            j09 j09VarJ2 = m93.J(l46Var2, j09VarA0);
            l46Var2.j0();
            if (l46Var2.S) {
                l46Var2.l(ov7Var);
            } else {
                l46Var2.s0();
            }
            dec.l(he2Var, l46Var2, c92VarA2);
            dec.l(he2Var2, l46Var2, u8aVarM2);
            ib8.s(iHashCode2, l46Var2, he2Var3, l46Var2);
            dec.l(he2Var4, l46Var2, j09VarJ2);
            String strQ = afc.q(R.string.seasonal_follow_up_title, l46Var2);
            mue mueVar = pue.a;
            nte.b(strQ, null, ((e8b) l46Var2.k(pr4Var)).q, 0L, null, null, 0L, null, new jme(3), 0L, 0, false, 0, 0, null, mue.a(pue.n(l46Var2), 0L, 0L, null, ((y8b) l46Var2.k(x8b.a)).a, 0L, null, 0, 0L, null, null, 16777183), l46Var, 0, 0, 130042);
            int i4 = 5;
            nte.b(afc.r(R.string.seasonal_follow_up_remaining, new Object[]{Integer.valueOf(i), 5}, l46Var), null, ((e8b) l46Var.k(pr4Var)).r, 0L, null, null, 0L, null, new jme(3), 0L, 0, false, 0, 0, null, pue.e(l46Var), l46Var, 0, 0, 130042);
            l46Var2 = l46Var;
            l46Var2.r(true);
            boolean z2 = false;
            c92 c92VarA3 = a92.a(new uc0(12.0f, true, new qc0(0)), jx0Var, l46Var2, 6);
            int iHashCode3 = Long.hashCode(l46Var2.T);
            u8a u8aVarM3 = l46Var2.m();
            g09 g09Var2 = g09Var;
            j09 j09VarJ3 = m93.J(l46Var2, g09Var2);
            l46Var2.j0();
            if (l46Var2.S) {
                l46Var2.l(ov7Var);
            } else {
                l46Var2.s0();
            }
            dec.l(he2Var, l46Var2, c92VarA3);
            dec.l(he2Var2, l46Var2, u8aVarM3);
            ib8.s(iHashCode3, l46Var2, he2Var3, l46Var2);
            dec.l(he2Var4, l46Var2, j09VarJ3);
            l46Var2.f0(-1245751177);
            for (String str : arrayList) {
                j09 j09VarC = b.c(g09Var2, 1.0f);
                if (zE) {
                    l46Var2.f0(-1576910378);
                    bx9 bx9Var = v51.a;
                    pr4 pr4Var2 = l8b.a;
                    u51 u51VarB = v51.b(((e8b) l46Var2.k(pr4Var2)).f, ((e8b) l46Var2.k(pr4Var2)).q, l46Var2, 12);
                    l46Var2.r(z2);
                    u51Var = u51VarB;
                } else {
                    l46Var2.f0(-1639440845);
                    l46Var2.r(z2);
                    u51Var = null;
                }
                if (zE) {
                    l46Var2.f0(-1576904483);
                    q11 q11VarB = x57.b(l8b.k(l46Var2), 0.5f);
                    l46Var2.r(z2);
                    q11Var = q11VarB;
                } else {
                    l46Var2.f0(-1639343629);
                    l46Var2.r(z2);
                    q11Var = null;
                }
                y6c y6cVarB = zE ? a7c.b(20.0f) : null;
                if (zE) {
                    l46Var2.f0(-1576898665);
                    mue mueVar2 = pue.a;
                    mueVarC = pue.c(l46Var2);
                    l46Var2.r(z2);
                } else {
                    l46Var2.f0(-1639199789);
                    l46Var2.r(z2);
                    mueVarC = null;
                }
                yi4 yi4Var = zE ? new yi4(56.0f) : null;
                boolean zG = ((i3 & 112) == 32 ? true : z2) | l46Var2.g(str);
                Object objR = l46Var2.R();
                if (zG || objR == sf2.a) {
                    objR = new n43(i4, a26Var, str);
                    l46Var2.p0(objR);
                }
                wle.b(j09VarC, str, false, null, u51Var, q11Var, y6cVarB, mueVarC, yi4Var, null, false, (x16) objR, l46Var2, 390, 0, 3096);
                z2 = z2;
                g09Var2 = g09Var2;
                i4 = 5;
            }
            a26Var2 = a26Var;
            tec.s(l46Var2, z2, true, true);
        } else {
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new xr1(i, i2, 2, a26Var2);
        }
    }

    public static final void f(fpc fpcVar, int i, SolarTerm solarTerm, boolean z, erc ercVar, a26 a26Var, x16 x16Var, l46 l46Var, int i2) {
        ercVar.getClass();
        a26Var.getClass();
        x16Var.getClass();
        l46Var.h0(565263110);
        int i3 = i2 | (l46Var.g(fpcVar) ? 4 : 2) | (l46Var.e(solarTerm.ordinal()) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) | (l46Var.h(z) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE) | (l46Var.g(ercVar) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE) | (l46Var.i(a26Var) ? 131072 : 65536) | (l46Var.i(x16Var) ? 1048576 : 524288);
        if (l46Var.W(i3 & 1, (599171 & i3) != 599170)) {
            gu8.b(null, af1.b0(247141065, new tkc(fpcVar, solarTerm, z, ercVar, a26Var, x16Var), l46Var), l46Var, 48);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new tg(i, i2, x16Var, a26Var, fpcVar, ercVar, solarTerm, z);
        }
    }
}
