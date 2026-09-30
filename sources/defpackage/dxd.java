package defpackage;

import ai.askquin.R;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.b;
import androidx.compose.ui.node.LayoutNode;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.util.ArrayList;
import java.util.List;
import tech.chatmind.api.PatternData;
import tech.chatmind.api.SpreadRecommendationResult;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class dxd {
    static {
        SpreadRecommendationResult spreadRecommendationResult = new SpreadRecommendationResult("ai-spread-1", t72.I(new PatternData("Past", "Past influences"), new PatternData("Present", "Current situation"), new PatternData("Future", "Future outcome")), "Basic Reading", "A 3-card spread is ideal for your question about relationships. It reveals the past influences, current dynamics, and future potential.", true, 1);
        ArrayList arrayList = new ArrayList(7);
        int i = 0;
        while (i < 7) {
            i++;
            arrayList.add(new PatternData(tec.e(i, "Position "), tec.e(i, "Description ")));
        }
        t72.I(spreadRecommendationResult, new SpreadRecommendationResult("ai-spread-2", arrayList, "Advanced Reading", "A 7-card spread provides deeper insight covering hidden influences, advice, and long-term outcomes for your relationship question.", false, 2));
    }

    public static final void a(final List list, int i, final int i2, final a26 a26Var, j09 j09Var, final boolean z, l46 l46Var, int i3) {
        int i4;
        l46Var.h0(-2083237026);
        if ((i3 & 6) == 0) {
            i4 = ((i3 & 8) == 0 ? l46Var.g(list) : l46Var.i(list) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= l46Var.e(i) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= l46Var.e(i2) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        if ((i3 & 3072) == 0) {
            i4 |= l46Var.i(a26Var) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE;
        }
        if ((i3 & 24576) == 0) {
            i4 |= l46Var.g(j09Var) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE;
        }
        if ((196608 & i3) == 0) {
            i4 |= l46Var.h(z) ? 131072 : 65536;
        }
        if (l46Var.W(i4 & 1, (74899 & i4) != 74898)) {
            boolean z2 = (i4 & 14) == 4 || ((i4 & 8) != 0 && l46Var.i(list));
            Object objR = l46Var.R();
            Object obj = sf2.a;
            if (z2 || objR == obj) {
                objR = new h53(list, 10);
                l46Var.p0(objR);
            }
            cs3 cs3VarB = ay9.b(i, (i4 >> 3) & 14, 2, (x16) objR, l46Var);
            Integer numValueOf = Integer.valueOf(i2);
            boolean zG = l46Var.g(cs3VarB) | ((i4 & 896) == 256);
            Object objR2 = l46Var.R();
            if (zG || objR2 == obj) {
                objR2 = new bxd(cs3VarB, i2, null);
                l46Var.p0(objR2);
            }
            af1.o((l26) objR2, l46Var, numValueOf);
            boolean zG2 = l46Var.g(cs3VarB) | ((i4 & 7168) == 2048);
            Object objR3 = l46Var.R();
            if (zG2 || objR3 == obj) {
                objR3 = new cxd(cs3VarB, a26Var, null);
                l46Var.p0(objR3);
            }
            af1.o((l26) objR3, l46Var, cs3VarB);
            cn1.h(8.0f, 0, 196992, 16336, null, af1.b0(1234201055, new o26() { // from class: axd
                @Override // defpackage.o26
                public final Object t(Object obj2, Object obj3, Object obj4, Object obj5) {
                    int iIntValue = ((Integer) obj3).intValue();
                    l46 l46Var2 = (l46) obj4;
                    int iIntValue2 = ((Integer) obj5).intValue();
                    ((rx9) obj2).getClass();
                    if ((iIntValue2 & 48) == 0) {
                        iIntValue2 |= l46Var2.e(iIntValue) ? 32 : 16;
                    }
                    boolean z3 = false;
                    boolean z4 = true;
                    if (l46Var2.W(iIntValue2 & 1, (iIntValue2 & 145) != 144)) {
                        List list2 = list;
                        SpreadRecommendationResult spreadRecommendationResult = (SpreadRecommendationResult) list2.get(iIntValue);
                        if (ywd.a((SpreadRecommendationResult) list2.get(iIntValue)) == mi.BASIC) {
                            z3 = true;
                        }
                        if (i2 != iIntValue) {
                            z4 = z3;
                        }
                        a26 a26Var2 = a26Var;
                        boolean zG3 = ((iIntValue2 & 112) == 32) | l46Var2.g(a26Var2);
                        Object objR4 = l46Var2.R();
                        if (zG3 || objR4 == sf2.a) {
                            objR4 = new rr1(iIntValue, 12, a26Var2);
                            l46Var2.p0(objR4);
                        }
                        gvd.b(spreadRecommendationResult, z3, z4, (x16) objR4, b.b, z, l46Var2, SpreadRecommendationResult.$stable | 24576);
                    } else {
                        l46Var2.Z();
                    }
                    return wef.a;
                }
            }, l46Var), l46Var, b.c(j09Var, 1.0f), null, null, ynb.q(20.0f, 0.0f, 2), new jy4(29), cs3VarB, null, null, false);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new bb4(list, i, i2, a26Var, j09Var, z, i3);
        }
    }

    public static final void b(ale aleVar, j09 j09Var, boolean z, l46 l46Var, int i) {
        int i2;
        y6c y6cVar;
        l46Var.h0(1550700056);
        if ((i & 6) == 0) {
            i2 = (l46Var.e(aleVar.ordinal()) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= l46Var.g(j09Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= l46Var.h(z) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        if (l46Var.W(i2 & 1, (i2 & 147) != 146)) {
            pr4 pr4Var = l8b.a;
            boolean zF = k8b.f((e8b) l46Var.k(pr4Var));
            j09 j09VarC = b.c(j09Var, 1.0f);
            rp1 rp1VarP = z5c.p(we6.e(l46Var) ? ((e8b) l46Var.k(pr4Var)).c : ((e8b) l46Var.k(pr4Var)).f, 0L, l46Var, 24576, 14);
            if (zF) {
                l46Var.f0(-130885314);
                y6cVar = eze.a(l46Var).a.j;
            } else {
                l46Var.f0(-130884254);
                y6cVar = ((s5d) l46Var.k(u5d.a)).e;
            }
            l46Var.r(false);
            bzd.d(j09VarC, y6cVar, rp1VarP, null, null, af1.b0(-1277465718, new zk(aleVar, z, 6), l46Var), l46Var, 196608, 24);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new i30(aleVar, j09Var, z, i);
        }
    }

    public static final void c(j09 j09Var, l46 l46Var, int i) {
        y6c y6cVarB;
        l46Var.h0(591902098);
        int i2 = (l46Var.g(j09Var) ? 4 : 2) | i;
        if (l46Var.W(i2 & 1, (i2 & 3) != 2)) {
            pr4 pr4Var = l8b.a;
            boolean zF = k8b.f((e8b) l46Var.k(pr4Var));
            j09 j09VarB0 = ynb.b0(20.0f, 0.0f, b.c(j09Var, 1.0f), 2);
            rp1 rp1VarP = z5c.p(we6.e(l46Var) ? ((e8b) l46Var.k(pr4Var)).c : ((e8b) l46Var.k(pr4Var)).f, 0L, l46Var, 24576, 14);
            if (zF) {
                l46Var.f0(1882244920);
                y6cVarB = eze.a(l46Var).a.j;
                l46Var.r(false);
            } else {
                l46Var.f0(1882245323);
                l46Var.r(false);
                y6cVarB = a7c.b(20.0f);
            }
            bzd.d(j09VarB0, y6cVarB, rp1VarP, null, null, mh3.g, l46Var, 196608, 24);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new do6(i, 12, j09Var);
        }
    }

    public static final void d(List list, final int i, final suc sucVar, j09 j09Var, final boolean z, boolean z2, String str, boolean z3, a26 a26Var, x16 x16Var, x16 x16Var2, l46 l46Var, final int i2, final int i3) {
        int i4;
        boolean z4;
        int i5;
        String str2;
        int i6;
        int i7;
        int i8;
        int i9;
        List list2;
        final j09 j09Var2;
        final a26 a26Var2;
        final x16 x16Var3;
        final x16 x16Var4;
        final boolean z5;
        final String str3;
        a26 a26Var3;
        x16 x16Var5;
        x16 x16Var6;
        l46 l46Var2;
        a26 a26Var4;
        String str4;
        float f;
        int i10;
        float f2;
        boolean z6;
        int iK;
        String str5;
        y6c y6cVar;
        l46 l46Var3;
        boolean z7;
        y6c y6cVar2;
        boolean z8 = z3;
        list.getClass();
        sucVar.getClass();
        l46Var.h0(484532602);
        if ((i2 & 6) == 0) {
            i4 = (l46Var.g(list) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= l46Var.e(i) ? 32 : 16;
        }
        int i11 = i4 | (l46Var.g(sucVar) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) | 3072;
        if ((i2 & 24576) == 0) {
            i11 |= l46Var.h(z) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE;
        }
        int i12 = i3 & 32;
        if (i12 != 0) {
            i5 = i11 | 196608;
            z4 = z2;
        } else {
            z4 = z2;
            i5 = i11 | (l46Var.h(z4) ? 131072 : 65536);
        }
        int i13 = i3 & 64;
        if (i13 != 0) {
            i6 = i5 | 1572864;
            str2 = str;
        } else {
            str2 = str;
            i6 = i5 | (l46Var.g(str2) ? 1048576 : 524288);
        }
        int i14 = i6 | (l46Var.h(z8) ? 8388608 : 4194304);
        int i15 = i3 & 256;
        if (i15 != 0) {
            i7 = i14 | 100663296;
        } else {
            i7 = i14 | (l46Var.i(a26Var) ? 67108864 : 33554432);
        }
        int i16 = i3 & 512;
        if (i16 != 0) {
            i8 = i7 | 805306368;
        } else {
            i8 = i7 | (l46Var.i(x16Var) ? 536870912 : 268435456);
        }
        int i17 = i8;
        int i18 = i3 & UserMetadata.MAX_ATTRIBUTE_SIZE;
        if (i18 != 0) {
            i9 = 6;
        } else {
            i9 = l46Var.i(x16Var2) ? 4 : 2;
        }
        if (l46Var.W(i17 & 1, ((i17 & 306783379) == 306783378 && (i9 & 3) == 2) ? false : true)) {
            boolean z9 = i12 != 0 ? false : z4;
            String str6 = i13 != 0 ? null : str2;
            i8c i8cVar = sf2.a;
            if (i15 != 0) {
                Object objR = l46Var.R();
                if (objR == i8cVar) {
                    objR = new znd(10);
                    l46Var.p0(objR);
                }
                a26Var3 = (a26) objR;
            } else {
                a26Var3 = a26Var;
            }
            if (i16 != 0) {
                Object objR2 = l46Var.R();
                if (objR2 == i8cVar) {
                    objR2 = new ond(11);
                    l46Var.p0(objR2);
                }
                x16Var5 = (x16) objR2;
            } else {
                x16Var5 = x16Var;
            }
            if (i18 != 0) {
                Object objR3 = l46Var.R();
                if (objR3 == i8cVar) {
                    objR3 = new ond(12);
                    l46Var.p0(objR3);
                }
                x16Var6 = (x16) objR3;
            } else {
                x16Var6 = x16Var2;
            }
            boolean zF = k8b.f((e8b) l46Var.k(l8b.a));
            float f3 = we6.e(l46Var) ? 24.0f : 20.0f;
            FillElement fillElement = b.c;
            jx0 jx0Var = ndb.Z;
            x16 x16Var7 = x16Var5;
            sc0 sc0Var = xc0.c;
            c92 c92VarA = a92.a(sc0Var, jx0Var, l46Var, 48);
            String str7 = str6;
            int iHashCode = Long.hashCode(l46Var.T);
            u8a u8aVarM = l46Var.m();
            j09 j09VarJ = m93.J(l46Var, fillElement);
            lf2.q.getClass();
            l46Var.j0();
            boolean z10 = l46Var.S;
            ov7 ov7Var = LayoutNode.h1;
            if (z10) {
                l46Var.l(ov7Var);
            } else {
                l46Var.s0();
            }
            he2 he2Var = hj6.z;
            dec.l(he2Var, l46Var, c92VarA);
            he2 he2Var2 = hj6.y;
            dec.l(he2Var2, l46Var, u8aVarM);
            Integer numValueOf = Integer.valueOf(iHashCode);
            he2 he2Var3 = hj6.X;
            dec.l(he2Var3, l46Var, numValueOf);
            dec.k(l46Var);
            he2 he2Var4 = hj6.x;
            dec.l(he2Var4, l46Var, j09VarJ);
            g09 g09Var = g09.a;
            j09 j09VarD0 = ynb.d0(0.0f, 12.0f, 0.0f, 0.0f, 13, g09Var);
            float f4 = f3;
            c92 c92VarA2 = a92.a(new uc0(8.0f, true, new qc0(0)), jx0Var, l46Var, 54);
            int iHashCode2 = Long.hashCode(l46Var.T);
            u8a u8aVarM2 = l46Var.m();
            j09 j09VarJ2 = m93.J(l46Var, j09VarD0);
            l46Var.j0();
            if (l46Var.S) {
                l46Var.l(ov7Var);
            } else {
                l46Var.s0();
            }
            dec.l(he2Var, l46Var, c92VarA2);
            dec.l(he2Var2, l46Var, u8aVarM2);
            ib8.s(iHashCode2, l46Var, he2Var3, l46Var);
            dec.l(he2Var4, l46Var, j09VarJ2);
            jgb.q(0, 1, l46Var, null, afc.q(R.string.spread_select_title, l46Var));
            a26 a26Var5 = a26Var3;
            x16 x16Var8 = x16Var7;
            jgb.s(0, 0, 5, l46Var, null, afc.q(R.string.spread_select_subtitle, l46Var));
            ib8.t(l46Var, true, g09Var, 24.0f, l46Var);
            boolean z11 = z && !list.isEmpty();
            dd2 dd2VarB0 = af1.b0(-1224263954, new mb0(z, x16Var8, 10), l46Var);
            e92 e92Var = e92.a;
            if (z && list.isEmpty()) {
                l46Var.f0(2144721701);
                c(d92.a(e92Var, g09Var, 1.0f), l46Var, 0);
                dd2VarB0.z(l46Var, 6);
                l46Var.r(false);
                a26Var4 = a26Var5;
                f = f4;
                z6 = true;
                x16Var8 = x16Var8;
                l46Var2 = l46Var;
                str7 = str7;
                i10 = 2;
                f2 = 0.0f;
                str4 = null;
                list2 = list;
                z8 = z3;
            } else {
                boolean z12 = false;
                l46Var.f0(2144865076);
                if (sucVar instanceof quc) {
                    l46Var.f0(2144902803);
                    str4 = null;
                    z8 = z3;
                    a(list, i, ((quc) sucVar).a, a26Var5, d92.a(e92Var, g09Var, 1.0f), z8, l46Var, (i17 & 126) | ((i17 >> 15) & 7168) | ((i17 >> 6) & 458752));
                    list2 = list;
                    a26Var4 = a26Var5;
                    l46Var2 = l46Var;
                    dd2VarB0.z(l46Var2, 6);
                    l46Var2.r(false);
                    f = f4;
                    z6 = true;
                    i10 = 2;
                    f2 = 0.0f;
                } else {
                    l46Var2 = l46Var;
                    list2 = list;
                    a26Var4 = a26Var5;
                    str4 = null;
                    z8 = z3;
                    if (!(sucVar instanceof ruc)) {
                        throw tec.d(-2009020786, l46Var2, false);
                    }
                    l46Var2.f0(2145381846);
                    j09 j09VarD1 = mh3.d0(d92.a(e92Var, g09Var, 1.0f), mh3.T(l46Var2), false, 14);
                    c92 c92VarA3 = a92.a(sc0Var, jx0Var, l46Var2, 48);
                    int iHashCode3 = Long.hashCode(l46Var2.T);
                    u8a u8aVarM3 = l46Var2.m();
                    j09 j09VarJ3 = m93.J(l46Var2, j09VarD1);
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
                    f = f4;
                    i10 = 2;
                    f2 = 0.0f;
                    b(((ruc) sucVar).a, ynb.b0(f, 0.0f, g09Var, 2), z8, l46Var2, (i17 >> 15) & 896);
                    dd2VarB0.z(l46Var2, 6);
                    z6 = true;
                    l46Var2.r(true);
                    z12 = false;
                    l46Var2.r(false);
                }
                l46Var2.r(z12);
            }
            if (z9) {
                l46Var2.f0(2146350596);
                str3 = str7;
                hfc.a((i17 >> 18) & 14, l46Var2, ynb.d0(0.0f, 0.0f, 0.0f, 20.0f, 7, ynb.b0(f, f2, b.c(g09Var, 1.0f), i10)), str3);
                l46Var2.r(false);
                l46Var3 = l46Var2;
            } else {
                str3 = str7;
                if (z11) {
                    l46Var2.f0(2146603866);
                    ed edVar = ed.E0;
                    j09 j09VarB = b.b(f2, 56.0f, ynb.d0(0.0f, 0.0f, 0.0f, 20.0f, 7, ynb.b0(f, f2, b.c(g09Var, 1.0f), i10)), z6 ? 1 : 0);
                    if (zF) {
                        l46Var2.f0(-2008955862);
                        y6cVar2 = eze.a(l46Var2).a.j;
                        z7 = false;
                        l46Var2.r(false);
                    } else {
                        z7 = false;
                        l46Var2.f0(-2008955473);
                        l46Var2.r(false);
                        y6cVar2 = a7c.a;
                    }
                    l46 l46Var4 = l46Var2;
                    c8b.j(j09VarB, null, false, edVar, 0.0f, y6cVar2, c8b.m(l46Var2), null, false, null, l46Var4, 3072, 918);
                    l46Var4.r(z7);
                    l46Var3 = l46Var4;
                } else {
                    l46 l46Var5 = l46Var2;
                    l46Var5.f0(2146986561);
                    if (sucVar instanceof quc) {
                        SpreadRecommendationResult spreadRecommendationResult = (SpreadRecommendationResult) s72.y0(((quc) sucVar).a, list2);
                        iK = spreadRecommendationResult != null ? spreadRecommendationResult.getUsageCount() : z6 ? 1 : 0;
                    } else if (!(sucVar instanceof ruc)) {
                        ap.c();
                        return;
                    } else {
                        int iE = ((ruc) sucVar).a.e();
                        ale.a.getClass();
                        iK = pzd.k(iE);
                    }
                    int i19 = i9;
                    boolean z13 = !z;
                    String strQ = afc.q(R.string.spread_next_step, l46Var5);
                    if (!(z && list2.isEmpty()) && z8) {
                        l46Var5.f0(-2147477078);
                        String strR = afc.r(R.string.spread_reads_cost, new Object[]{Integer.valueOf(iK)}, l46Var5);
                        l46Var5.r(false);
                        str5 = strR;
                    } else {
                        l46Var5.f0(2147456676);
                        l46Var5.r(false);
                        str5 = str4;
                    }
                    j09 j09VarB2 = b.b(f2, 56.0f, ynb.d0(0.0f, 0.0f, 0.0f, 20.0f, 7, ynb.b0(f, f2, b.c(g09Var, 1.0f), i10)), 1);
                    if (zF) {
                        l46Var5.f0(-2008926070);
                        y6cVar = eze.a(l46Var5).a.j;
                        l46Var5.r(false);
                    } else {
                        l46Var5.f0(-2008925681);
                        l46Var5.r(false);
                        y6cVar = a7c.a;
                    }
                    c8b.i(j09VarB2, strQ, str5, null, 0L, 0.0f, z13, y6cVar, c8b.m(l46Var5), false, null, null, x16Var6, l46Var, 0, (i19 << 6) & 896, 3640);
                    l46Var3 = l46Var;
                    l46Var3.r(false);
                    z6 = true;
                }
            }
            l46Var3.r(z6);
            x16Var4 = x16Var6;
            z5 = z9;
            x16Var3 = x16Var8;
            a26Var2 = a26Var4;
            j09Var2 = g09Var;
        } else {
            list2 = list;
            l46Var.Z();
            j09Var2 = j09Var;
            a26Var2 = a26Var;
            x16Var3 = x16Var;
            x16Var4 = x16Var2;
            z5 = z4;
            str3 = str2;
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            final List list3 = list2;
            final boolean z14 = z8;
            ojbVarV.d = new l26() { // from class: zwd
                @Override // defpackage.l26
                public final Object z(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iP = k99.P(i2 | 1);
                    dxd.d(list3, i, sucVar, j09Var2, z, z5, str3, z14, a26Var2, x16Var3, x16Var4, (l46) obj, iP, i3);
                    return wef.a;
                }
            };
        }
    }
}
