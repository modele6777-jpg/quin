package defpackage;

import ai.askquin.R;
import ai.askquin.model.TarotSkinIdentify;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.b;
import androidx.compose.ui.node.LayoutNode;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import tech.chatmind.api.TarotCardInfo;
import tech.chatmind.api.TarotCardType;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class uq1 {
    public static final TarotCardInfo a = new TarotCardInfo("the_fool", "The Fool", "The Fool", "Air", "Uranus", null, t72.I("Innocence", "Beginnings", "Risk"), t72.I("Beginning", "Adventure", "Innocence"), t72.I("Recklessness", "Lostness", "Stagnation"), "Represents a brand new beginning and unlimited potential. Characterized by a pure state free of prejudice, with the courage to embrace the unknown and take risks.", "A youth in fine clothes steps forward over a cliff edge, white rose in hand, small dog barking at his heel.");
    public static final List b;
    public static final List c;

    static {
        TarotSkinIdentify tarotSkinIdentify = TarotSkinIdentify.Classic;
        bod bodVar = new bod(tarotSkinIdentify, nmd.a);
        TarotSkinIdentify tarotSkinIdentify2 = TarotSkinIdentify.NeoRiderWaite;
        b = t72.I(bodVar, new bod(tarotSkinIdentify2, nmd.b), new bod(TarotSkinIdentify.Cat, nmd.c), new bod(TarotSkinIdentify.Love, nmd.d, 0.4f), new bod(TarotSkinIdentify.Puppet, nmd.e));
        c = t72.I(tarotSkinIdentify, tarotSkinIdentify2);
    }

    public static final void a(TarotCardType tarotCardType, l46 l46Var, int i) {
        ojb ojbVarV;
        eq1 eq1Var;
        int i2;
        int i3;
        int i4;
        l46Var.h0(-1313336584);
        int i5 = (l46Var.e(tarotCardType == null ? -1 : tarotCardType.ordinal()) ? 4 : 2) | i;
        int i6 = 1;
        int i7 = 0;
        if (l46Var.W(i5 & 1, (i5 & 3) != 2)) {
            if (tarotCardType == null) {
                ojbVarV = l46Var.v();
                if (ojbVarV == null) {
                    return;
                } else {
                    eq1Var = new eq1(tarotCardType, i, i7);
                }
            } else {
                t7c t7cVarA = s7c.a(new uc0(8.0f, true, new jv2(3, ndb.Z)), ndb.y, l46Var, 6);
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
                dec.l(hj6.z, l46Var, t7cVarA);
                dec.l(hj6.y, l46Var, u8aVarM);
                dec.l(hj6.X, l46Var, Integer.valueOf(iHashCode));
                dec.k(l46Var);
                dec.l(hj6.x, l46Var, j09VarJ);
                lie lieVar = (lie) vhe.a.get(tarotCardType);
                if (lieVar == null) {
                    l46Var.f0(-1198748293);
                } else {
                    l46Var.f0(-1198748292);
                    int iOrdinal = lieVar.ordinal();
                    if (iOrdinal == 0) {
                        i2 = R.string.explore_element_air;
                    } else if (iOrdinal == 1) {
                        i2 = R.string.explore_element_water;
                    } else if (iOrdinal == 2) {
                        i2 = R.string.explore_element_fire;
                    } else {
                        if (iOrdinal != 3) {
                            ap.c();
                            return;
                        }
                        i2 = R.string.explore_element_earth;
                    }
                    g(afc.q(i2, l46Var), l46Var, 0);
                }
                l46Var.r(false);
                tie tieVar = (tie) vhe.b.get(tarotCardType);
                if (tieVar == null) {
                    l46Var.f0(-1198676869);
                } else {
                    l46Var.f0(-1198676868);
                    switch (tieVar.ordinal()) {
                        case 0:
                            i3 = R.string.tarot_planet_sun;
                            break;
                        case 1:
                            i3 = R.string.tarot_planet_moon;
                            break;
                        case 2:
                            i3 = R.string.tarot_planet_mercury;
                            break;
                        case 3:
                            i3 = R.string.tarot_planet_venus;
                            break;
                        case 4:
                            i3 = R.string.tarot_planet_mars;
                            break;
                        case 5:
                            i3 = R.string.tarot_planet_jupiter;
                            break;
                        case 6:
                            i3 = R.string.tarot_planet_saturn;
                            break;
                        case 7:
                            i3 = R.string.tarot_planet_uranus;
                            break;
                        case 8:
                            i3 = R.string.tarot_planet_neptune;
                            break;
                        case 9:
                            i3 = R.string.tarot_planet_pluto;
                            break;
                        default:
                            ap.c();
                            return;
                    }
                    g(afc.q(i3, l46Var), l46Var, 0);
                }
                l46Var.r(false);
                dle dleVar = (dle) vhe.c.get(tarotCardType);
                if (dleVar == null) {
                    l46Var.f0(-1198605445);
                } else {
                    l46Var.f0(-1198605444);
                    switch (dleVar.ordinal()) {
                        case 0:
                            i4 = R.string.zodiac_aries;
                            break;
                        case 1:
                            i4 = R.string.zodiac_taurus;
                            break;
                        case 2:
                            i4 = R.string.zodiac_gemini;
                            break;
                        case 3:
                            i4 = R.string.zodiac_cancer;
                            break;
                        case 4:
                            i4 = R.string.zodiac_leo;
                            break;
                        case 5:
                            i4 = R.string.zodiac_virgo;
                            break;
                        case 6:
                            i4 = R.string.zodiac_libra;
                            break;
                        case 7:
                            i4 = R.string.zodiac_scorpio;
                            break;
                        case 8:
                            i4 = R.string.zodiac_sagittarius;
                            break;
                        case 9:
                            i4 = R.string.zodiac_capricorn;
                            break;
                        case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                            i4 = R.string.zodiac_aquarius;
                            break;
                        case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                            i4 = R.string.zodiac_pisces;
                            break;
                        default:
                            ap.c();
                            return;
                    }
                    g(afc.q(i4, l46Var), l46Var, 0);
                }
                l46Var.r(false);
                l46Var.r(true);
            }
            ojbVarV.d = eq1Var;
        }
        l46Var.Z();
        ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            eq1Var = new eq1(tarotCardType, i, i6);
            ojbVarV.d = eq1Var;
        }
    }

    /* JADX WARN: Code duplicated, block: B:112:0x0151  */
    public static final void b(final TarotCardType tarotCardType, final TarotCardInfo tarotCardInfo, final TarotSkinIdentify tarotSkinIdentify, final int i, final List list, final List list2, final int i2, final int i3, final x16 x16Var, final a26 a26Var, final a26 a26Var2, l46 l46Var, final int i4, final int i5) {
        int i6;
        int i7;
        final TarotCardInfo tarotCardInfo2;
        l46 l46Var2;
        FillElement fillElement;
        boolean z;
        boolean z2;
        long j;
        l46 l46Var3 = l46Var;
        tarotSkinIdentify.getClass();
        list.getClass();
        list2.getClass();
        x16Var.getClass();
        a26Var.getClass();
        a26Var2.getClass();
        l46Var3.h0(-950827980);
        if ((i4 & 6) == 0) {
            i6 = (l46Var3.e(tarotCardType == null ? -1 : tarotCardType.ordinal()) ? 4 : 2) | i4;
        } else {
            i6 = i4;
        }
        if ((i4 & 48) == 0) {
            i6 |= (i4 & 64) == 0 ? l46Var3.g(tarotCardInfo) : l46Var3.i(tarotCardInfo) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i6 |= l46Var3.e(tarotSkinIdentify.ordinal()) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        if ((i4 & 3072) == 0) {
            i6 |= l46Var3.e(i) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE;
        }
        if ((i4 & 24576) == 0) {
            i6 |= (32768 & i4) == 0 ? l46Var3.g(list) : l46Var3.i(list) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE;
        }
        if ((196608 & i4) == 0) {
            i6 |= (262144 & i4) == 0 ? l46Var3.g(list2) : l46Var3.i(list2) ? 131072 : 65536;
        }
        if ((1572864 & i4) == 0) {
            i6 |= l46Var3.e(i2) ? 1048576 : 524288;
        }
        if ((12582912 & i4) == 0) {
            i6 |= l46Var3.e(i3) ? 8388608 : 4194304;
        }
        if ((100663296 & i4) == 0) {
            i6 |= l46Var3.i(x16Var) ? 67108864 : 33554432;
        }
        if ((805306368 & i4) == 0) {
            i6 |= l46Var3.i(a26Var) ? 536870912 : 268435456;
        }
        if ((i5 & 6) == 0) {
            i7 = i5 | (l46Var3.i(a26Var2) ? 4 : 2);
        } else {
            i7 = i5;
        }
        if (l46Var3.W(i6 & 1, ((306783379 & i6) == 306783378 && (i7 & 3) == 2) ? false : true)) {
            pr4 pr4Var = l8b.a;
            final boolean zF = k8b.f((e8b) l46Var3.k(pr4Var));
            if (tarotCardInfo != null) {
                if (pa7.t(tarotCardInfo.getCardKey(), tarotCardType != null ? tarotCardType.getCardKey() : null)) {
                    tarotCardInfo2 = tarotCardInfo;
                } else {
                    tarotCardInfo2 = null;
                }
            } else {
                tarotCardInfo2 = null;
            }
            String name = tarotCardInfo2 != null ? tarotCardInfo2.getName() : null;
            if (name == null) {
                l46Var3.f0(1082363197);
                if (tarotCardType == null) {
                    l46Var3.f0(-806514166);
                    l46Var3.r(false);
                    name = null;
                } else {
                    l46Var3.f0(-806514165);
                    name = afc.q(tarotCardType.getTitleRes(), l46Var3);
                    l46Var3.r(false);
                }
                if (name == null) {
                    name = "";
                }
            } else {
                l46Var3.f0(1082360996);
            }
            l46Var3.r(false);
            final String str = name;
            final tt1 tt1Var = (tt1) l46Var3.k(vt1.a);
            final ghc ghcVarT = mh3.T(l46Var3);
            Object objR = l46Var3.R();
            if (objR == sf2.a) {
                objR = af1.E(l46Var3);
                l46Var3.p0(objR);
            }
            final aw2 aw2Var = (aw2) objR;
            final float fP0 = ((sw3) l46Var3.k(zg2.h)).p0(8.0f);
            FillElement fillElement2 = b.c;
            j09 j09VarO = g09.a;
            if (zF) {
                l46Var3.f0(1082372470);
                j09VarO = tm7.o(j09VarO, ((e8b) l46Var3.k(pr4Var)).a, g21.f);
            } else {
                l46Var3.f0(1082373724);
            }
            l46Var3.r(false);
            j09 j09VarD = fillElement2.D(j09VarO);
            xn8 xn8VarC = s21.c(ndb.b, false);
            int iHashCode = Long.hashCode(l46Var3.T);
            u8a u8aVarM = l46Var3.m();
            j09 j09VarJ = m93.J(l46Var3, j09VarD);
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
            if (zF) {
                l46Var2 = l46Var3;
                fillElement = fillElement2;
                z = true;
                l46Var2.f0(1517093640);
                l46Var2.r(false);
            } else {
                l46Var3.f0(1516458419);
                boolean zB = if9.B(l46Var3);
                Integer numValueOf = Integer.valueOf(i);
                if (i == 0) {
                    numValueOf = null;
                }
                y72 y72Var = numValueOf != null ? new y72(abg.c(numValueOf.intValue())) : null;
                boolean zT = y72Var != null ? xj3.t(y72Var.a) : false;
                if (!zT || zB) {
                    z2 = false;
                    l46Var3.f0(1711504521);
                    j = ((e8b) l46Var3.k(pr4Var)).a;
                    l46Var3.r(false);
                } else {
                    l46Var3.f0(1711503532);
                    z2 = false;
                    l46Var3.r(false);
                    j = xj3.d;
                }
                y72 y72Var2 = y72Var;
                z = true;
                boolean z3 = zT;
                fillElement = fillElement2;
                zyf.a(zB, z3, new y72(j), y72Var2, l46Var3, 0, 0);
                l46Var2 = l46Var3;
                l46Var2.r(z2);
            }
            xdc.a(fillElement, af1.b0(709308542, new m(9, x16Var), l46Var2), null, null, null, 0, y72.j, 0L, null, af1.b0(2025476169, new n26() { // from class: jq1
                @Override // defpackage.n26
                public final Object m(Object obj, Object obj2, Object obj3) {
                    final TarotCardType tarotCardType2;
                    tt1 tt1Var2;
                    int i8;
                    j09 j09Var;
                    TarotCardInfo tarotCardInfo3;
                    xw9 xw9Var = (xw9) obj;
                    l46 l46Var4 = (l46) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    xw9Var.getClass();
                    if ((iIntValue & 6) == 0) {
                        iIntValue |= l46Var4.g(xw9Var) ? 4 : 2;
                    }
                    if (l46Var4.W(iIntValue & 1, (iIntValue & 19) != 18)) {
                        boolean z4 = zF;
                        j09 j09VarB0 = ynb.b0(z4 ? 24.0f : 16.0f, 0.0f, g09.a, 2);
                        j09 j09VarY = ynb.Y(b.c, xw9Var);
                        final ghc ghcVar = ghcVarT;
                        j09 j09VarD0 = ynb.d0(0.0f, 0.0f, 0.0f, 16.0f, 7, mh3.d0(j09VarY, ghcVar, false, 14));
                        c92 c92VarA = a92.a(new uc0(16.0f, true, new qc0(0)), ndb.Y, l46Var4, 6);
                        int iHashCode2 = Long.hashCode(l46Var4.T);
                        u8a u8aVarM2 = l46Var4.m();
                        j09 j09VarJ2 = m93.J(l46Var4, j09VarD0);
                        lf2.q.getClass();
                        l46Var4.j0();
                        if (l46Var4.S) {
                            l46Var4.l(LayoutNode.h1);
                        } else {
                            l46Var4.s0();
                        }
                        dec.l(hj6.z, l46Var4, c92VarA);
                        dec.l(hj6.y, l46Var4, u8aVarM2);
                        dec.l(hj6.X, l46Var4, Integer.valueOf(iHashCode2));
                        dec.k(l46Var4);
                        dec.l(hj6.x, l46Var4, j09VarJ2);
                        TarotSkinIdentify tarotSkinIdentify2 = tarotSkinIdentify;
                        boolean zE = l46Var4.e(tarotSkinIdentify2.ordinal());
                        TarotCardType tarotCardType3 = tarotCardType;
                        boolean zE2 = zE | l46Var4.e(tarotCardType3 == null ? -1 : tarotCardType3.ordinal());
                        final aw2 aw2Var2 = aw2Var;
                        boolean zI = zE2 | l46Var4.i(aw2Var2) | l46Var4.g(ghcVar);
                        tt1 tt1Var3 = tt1Var;
                        boolean zG = zI | l46Var4.g(tt1Var3);
                        int i9 = i;
                        boolean zE3 = zG | l46Var4.e(i9);
                        Object objR2 = l46Var4.R();
                        i8c i8cVar = sf2.a;
                        if (zE3 || objR2 == i8cVar) {
                            tarotCardType2 = tarotCardType3;
                            dx dxVar = new dx(aw2Var2, tarotSkinIdentify2, tarotCardType2, ghcVar, tt1Var3, i9);
                            ghcVar = ghcVar;
                            tt1Var2 = tt1Var3;
                            i8 = i9;
                            l46Var4.p0(dxVar);
                            objR2 = dxVar;
                        } else {
                            tarotCardType2 = tarotCardType3;
                            tt1Var2 = tt1Var3;
                            i8 = i9;
                        }
                        String str2 = str;
                        final tt1 tt1Var4 = tt1Var2;
                        final int i10 = i8;
                        uq1.m(tarotCardType2, str2, tarotSkinIdentify2, (x16) objR2, j09VarB0, l46Var4, 0);
                        uq1.i(i2, i3, list.size(), j09VarB0, l46Var4, 0);
                        TarotCardInfo tarotCardInfo4 = tarotCardInfo2;
                        if (tarotCardInfo4 == null) {
                            l46Var4.f0(-669570910);
                            l46Var4.r(false);
                            j09Var = j09VarB0;
                            z4 = z4;
                        } else {
                            l46Var4.f0(-669570909);
                            if (z4) {
                                l46Var4.f0(1707753510);
                                tarotCardInfo3 = tarotCardInfo4;
                                j09Var = j09VarB0;
                                oa7.d(null, 0.0f, ((e8b) l46Var4.k(l8b.a)).z, l46Var4, 0, 3);
                            } else {
                                j09Var = j09VarB0;
                                tarotCardInfo3 = tarotCardInfo4;
                                l46Var4.f0(1400803154);
                            }
                            l46Var4.r(false);
                            uq1.e(tarotCardInfo3, j09Var, l46Var4, TarotCardInfo.$stable);
                            l46Var4.r(false);
                        }
                        if (z4) {
                            l46Var4.f0(671143817);
                            oa7.d(null, 0.0f, ((e8b) l46Var4.k(l8b.a)).z, l46Var4, 0, 3);
                        } else {
                            l46Var4.f0(-669326257);
                        }
                        l46Var4.r(false);
                        boolean zI2 = l46Var4.i(aw2Var2) | l46Var4.g(ghcVar) | l46Var4.e(tarotCardType2 == null ? -1 : tarotCardType2.ordinal()) | l46Var4.g(tt1Var4) | l46Var4.e(i10);
                        final float f = fP0;
                        boolean zD = zI2 | l46Var4.d(f);
                        Object objR3 = l46Var4.R();
                        if (zD || objR3 == i8cVar) {
                            l26 l26Var = new l26() { // from class: lq1
                                @Override // defpackage.l26
                                public final Object z(Object obj4, Object obj5) {
                                    TarotSkinIdentify tarotSkinIdentify3 = (TarotSkinIdentify) obj4;
                                    x16 x16Var2 = (x16) obj5;
                                    tarotSkinIdentify3.getClass();
                                    x16Var2.getClass();
                                    ynb.V(aw2Var2, null, null, new oq1(ghcVar, tarotCardType2, tt1Var4, tarotSkinIdentify3, i10, x16Var2, f, null), 3);
                                    return wef.a;
                                }
                            };
                            l46Var4.p0(l26Var);
                            objR3 = l26Var;
                        }
                        uq1.f(list2, tarotCardType2, str2, tarotSkinIdentify2, (l26) objR3, a26Var, a26Var2, j09Var, l46Var4, 0);
                        l46Var4.r(true);
                    } else {
                        l46Var4.Z();
                    }
                    return wef.a;
                }
            }, l46Var), l46Var, 806879286, 444);
            l46Var3 = l46Var;
            l46Var3.r(z);
        } else {
            l46Var3.Z();
        }
        ojb ojbVarV = l46Var3.v();
        if (ojbVarV != null) {
            ojbVarV.d = new l26() { // from class: kq1
                @Override // defpackage.l26
                public final Object z(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int iP = k99.P(i4 | 1);
                    int iP2 = k99.P(i5);
                    uq1.b(tarotCardType, tarotCardInfo, tarotSkinIdentify, i, list, list2, i2, i3, x16Var, a26Var, a26Var2, (l46) obj, iP, iP2);
                    return wef.a;
                }
            };
        }
    }

    public static final void c(x16 x16Var, l46 l46Var, int i) {
        x16Var.getClass();
        l46Var.h0(-94267837);
        int i2 = (l46Var.i(x16Var) ? 4 : 2) | i;
        if (l46Var.W(i2 & 1, (i2 & 3) != 2)) {
            TarotCardType tarotCardType = TarotCardType.THE_FOOL;
            TarotSkinIdentify tarotSkinIdentify = TarotSkinIdentify.Classic;
            Object objR = l46Var.R();
            i8c i8cVar = sf2.a;
            if (objR == i8cVar) {
                objR = new wu0(15);
                l46Var.p0(objR);
            }
            a26 a26Var = (a26) objR;
            Object objR2 = l46Var.R();
            if (objR2 == i8cVar) {
                objR2 = new wu0(16);
                l46Var.p0(objR2);
            }
            b(tarotCardType, a, tarotSkinIdentify, 0, c, b, 4, 12, x16Var, a26Var, (a26) objR2, l46Var, (TarotCardInfo.$stable << 3) | 819465606 | ((i2 << 24) & 234881024), 6);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new m(i, 8, x16Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01f5  */
    public static final void d(k75 k75Var, String str, int i, int i2, x16 x16Var, a26 a26Var, l46 l46Var, int i3) {
        e89 e89Var;
        e89 e89Var2;
        Iterator it;
        nmd nmdVar;
        List list;
        l46 l46Var2;
        k75Var.getClass();
        str.getClass();
        x16Var.getClass();
        a26Var.getClass();
        l46Var.h0(-1597810040);
        int i4 = i3 | (l46Var.i(k75Var) ? 4 : 2) | (l46Var.g(str) ? 32 : 16) | (l46Var.e(i2) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE) | (l46Var.i(x16Var) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE) | (l46Var.i(a26Var) ? 131072 : 65536);
        if (l46Var.W(i4 & 1, (74771 & i4) != 74770)) {
            int i5 = i4 & 14;
            int i6 = i4 & 112;
            boolean z = (i5 == 4 || l46Var.i(k75Var)) | (i6 == 32);
            Object objR = l46Var.R();
            i8c i8cVar = sf2.a;
            if (z || objR == i8cVar) {
                objR = new pq1(k75Var, str, null);
                l46Var.p0(objR);
            }
            af1.o((l26) objR, l46Var, str);
            e89 e89VarT = tm7.t(k75Var.w, l46Var);
            e89 e89VarT2 = tm7.t(k75Var.y, l46Var);
            e89 e89VarT3 = tm7.t(k75Var.z, l46Var);
            boolean z2 = i6 == 32;
            Object objR2 = l46Var.R();
            if (z2 || objR2 == i8cVar) {
                TarotCardType.Companion.getClass();
                objR2 = fie.a(str);
                l46Var.p0(objR2);
            }
            TarotCardType tarotCardType = (TarotCardType) objR2;
            nfc nfcVarB = kr7.b(l46Var);
            boolean zG = l46Var.g(null) | l46Var.g(nfcVarB);
            Object objR3 = l46Var.R();
            if (zG || objR3 == i8cVar) {
                objR3 = nfcVarB.b(job.a.b(ai.askquin.repository.b.class), null, null);
                l46Var.p0(objR3);
            }
            ai.askquin.repository.b bVar = (ai.askquin.repository.b) objR3;
            String folder = ((t65) e89VarT.getValue()).a.getFolder();
            boolean zE = l46Var.e(tarotCardType == null ? -1 : tarotCardType.ordinal()) | l46Var.i(bVar) | l46Var.g(folder);
            Object objR4 = l46Var.R();
            if (zE || objR4 == i8cVar) {
                objR4 = new rq1(null, bVar, folder, tarotCardType);
                l46Var.p0(objR4);
            }
            e89 e89VarY = uyb.y(null, tarotCardType, folder, (l26) objR4, l46Var, 6);
            mfc mfcVar = ((e8b) l46Var.k(l8b.a)).C;
            boolean zG2 = l46Var.g(((t65) e89VarT.getValue()).d) | l46Var.e(mfcVar.ordinal()) | l46Var.g(((t65) e89VarT.getValue()).e);
            Object objR5 = l46Var.R();
            if (zG2 || objR5 == i8cVar) {
                List list2 = ((t65) e89VarT.getValue()).d;
                Map map = ((t65) e89VarT.getValue()).e;
                Set setO1 = s72.o1(list2);
                List listC = r8c.c(mfcVar);
                ArrayList arrayList = new ArrayList(t72.u(listC, 10));
                for (Iterator it2 = listC.iterator(); it2.hasNext(); it2 = it) {
                    TarotSkinIdentify tarotSkinIdentify = (TarotSkinIdentify) it2.next();
                    boolean z3 = r8c.k(tarotSkinIdentify) || setO1.contains(tarotSkinIdentify);
                    hmd hmdVar = (hmd) map.get(tarotSkinIdentify);
                    if (z3) {
                        if (tarotSkinIdentify.getRequiresDownload()) {
                            e89Var2 = e89VarY;
                            it = it2;
                            if ((hmdVar != null ? hmdVar.a : null) == gmd.c) {
                                nmdVar = nmd.d;
                            }
                        } else {
                            e89Var2 = e89VarY;
                            it = it2;
                        }
                        if (!tarotSkinIdentify.getRequiresDownload()) {
                            nmdVar = nmd.b;
                        } else if ((hmdVar != null ? hmdVar.a : null) != gmd.e) {
                            nmdVar = nmd.c;
                        } else {
                            nmdVar = nmd.b;
                        }
                    } else {
                        e89Var2 = e89VarY;
                        nmdVar = nmd.e;
                        it = it2;
                    }
                    arrayList.add(new bod(tarotSkinIdentify, nmdVar, hmdVar != null ? hmdVar.b : 0.0f));
                    e89VarY = e89Var2;
                }
                e89Var = e89VarY;
                objR5 = s72.b1(arrayList, new ww2(13));
                l46Var.p0(objR5);
            } else {
                e89Var = e89VarY;
            }
            List list3 = (List) objR5;
            TarotCardInfo tarotCardInfo = (TarotCardInfo) e89Var.getValue();
            TarotSkinIdentify tarotSkinIdentify2 = ((t65) e89VarT.getValue()).a;
            List list4 = ((t65) e89VarT.getValue()).d;
            int iIntValue = ((Number) e89VarT3.getValue()).intValue();
            int iIntValue2 = ((Number) e89VarT2.getValue()).intValue();
            boolean z4 = i5 == 4 || l46Var.i(k75Var);
            Object objR6 = l46Var.R();
            if (z4 || objR6 == i8cVar) {
                list = list4;
                l46Var2 = l46Var;
                objR6 = new w(1, k75Var, k75.class, "startDownload", "startDownload(Lai/askquin/model/TarotSkinIdentify;)V", 0, 16);
                l46Var2.p0(objR6);
            } else {
                l46Var2 = l46Var;
                list = list4;
            }
            b(tarotCardType, tarotCardInfo, tarotSkinIdentify2, i2, list, list3, iIntValue, iIntValue2, x16Var, (a26) ((ym7) objR6), a26Var, l46Var2, (TarotCardInfo.$stable << 3) | (i4 & 7168) | ((i4 << 12) & 234881024), (i4 >> 15) & 14);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new vi(k75Var, str, i, i2, x16Var, a26Var, i3);
        }
    }

    public static final void e(TarotCardInfo tarotCardInfo, j09 j09Var, l46 l46Var, int i) {
        int i2;
        l46Var.h0(1490090304);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? l46Var.g(tarotCardInfo) : l46Var.i(tarotCardInfo) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= l46Var.g(j09Var) ? 32 : 16;
        }
        int i3 = 0;
        if (l46Var.W(i2 & 1, (i2 & 19) != 18)) {
            pr4 pr4Var = o82.a;
            long j = ((m82) l46Var.k(pr4Var)).q;
            long jB = y72.b(((m82) l46Var.k(pr4Var)).q, 0.8f);
            if (!we6.e(l46Var)) {
                j = jB;
            }
            l(j09Var, 0.0f, 0.0f, 0.0f, null, true, af1.b0(-975646420, new mq1(tarotCardInfo, j, i3), l46Var), l46Var, ((i2 >> 3) & 14) | 1772544, 22);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new gc(tarotCardInfo, j09Var, i, 7);
        }
    }

    public static final void f(List list, TarotCardType tarotCardType, String str, TarotSkinIdentify tarotSkinIdentify, l26 l26Var, a26 a26Var, a26 a26Var2, j09 j09Var, l46 l46Var, int i) {
        list.getClass();
        tarotSkinIdentify.getClass();
        l26Var.getClass();
        a26Var.getClass();
        a26Var2.getClass();
        l46Var.h0(-852757178);
        int i2 = i | (l46Var.g(list) ? 4 : 2) | (l46Var.e(tarotCardType == null ? -1 : tarotCardType.ordinal()) ? 32 : 16) | (l46Var.g(str) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) | (l46Var.e(tarotSkinIdentify.ordinal()) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE) | (l46Var.i(l26Var) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE) | (l46Var.i(a26Var) ? 131072 : 65536) | (l46Var.i(a26Var2) ? 1048576 : 524288) | (l46Var.g(j09Var) ? 8388608 : 4194304);
        if (l46Var.W(i2 & 1, (4793491 & i2) != 4793490)) {
            l(j09Var, 0.0f, 0.0f, 16.0f, null, true, af1.b0(-1961805350, new aq1(str, list, tarotCardType, tarotSkinIdentify, l26Var, a26Var, a26Var2, 0), l46Var), l46Var, ((i2 >> 21) & 14) | 1772544, 22);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new bq1(list, tarotCardType, str, tarotSkinIdentify, l26Var, a26Var, a26Var2, j09Var, i);
        }
    }

    public static final void g(String str, l46 l46Var, int i) {
        q11 q11VarB;
        l46Var.h0(-1765066069);
        int i2 = (l46Var.g(str) ? 4 : 2) | i;
        if (l46Var.W(i2 & 1, (i2 & 3) != 2)) {
            pr4 pr4Var = l8b.a;
            boolean zF = k8b.f((e8b) l46Var.k(pr4Var));
            y6c y6cVarB = zF ? a7c.b(12.0f) : a7c.a();
            long j = ((e8b) l46Var.k(pr4Var)).m;
            if (we6.e(l46Var)) {
                j = y72.j;
            }
            if (zF) {
                l46Var.f0(283602620);
                q11VarB = x57.b(((e8b) l46Var.k(pr4Var)).z, 0.5f);
                l46Var.r(false);
            } else {
                l46Var.f0(201799794);
                l46Var.r(false);
                q11VarB = null;
            }
            nae.a(null, y6cVarB, j, 0L, 0.0f, 0.0f, q11VarB, af1.b0(-850742266, new o8(str, 7), l46Var), l46Var, 12582912, 57);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new o8(str, i, 8);
        }
    }

    public static final void h(int i, int i2, l46 l46Var, int i3) {
        l46 l46Var2 = l46Var;
        l46Var2.h0(-1992990785);
        int i4 = i3 | (l46Var2.e(i) ? 4 : 2) | (l46Var2.e(i2) ? 32 : 16);
        if (l46Var2.W(i4 & 1, (i4 & 19) != 18)) {
            c92 c92VarA = a92.a(xc0.c, ndb.Z, l46Var2, 48);
            int iHashCode = Long.hashCode(l46Var2.T);
            u8a u8aVarM = l46Var2.m();
            g09 g09Var = g09.a;
            j09 j09VarJ = m93.J(l46Var2, g09Var);
            lf2.q.getClass();
            l46Var2.j0();
            if (l46Var2.S) {
                l46Var2.l(LayoutNode.h1);
            } else {
                l46Var2.s0();
            }
            dec.l(hj6.z, l46Var2, c92VarA);
            dec.l(hj6.y, l46Var2, u8aVarM);
            dec.l(hj6.X, l46Var2, Integer.valueOf(iHashCode));
            dec.k(l46Var2);
            dec.l(hj6.x, l46Var2, j09VarJ);
            String strValueOf = String.valueOf(i);
            mue mueVar = pue.a;
            mue mueVarM = pue.m(l46Var2);
            pr4 pr4Var = o82.a;
            nte.b(strValueOf, null, ((m82) l46Var2.k(pr4Var)).a, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mueVarM, l46Var, 0, 0, 131066);
            nte.b(ks0.h(8.0f, i2, l46Var, l46Var, g09Var), null, we6.e(l46Var) ? ((m82) l46Var.k(pr4Var)).q : y72.b(((m82) l46Var.k(pr4Var)).q, 0.6f), 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, pue.j(l46Var), l46Var, 0, 0, 131066);
            l46Var2 = l46Var;
            l46Var2.r(true);
        } else {
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new dq1(i, i2, i3, 0);
        }
    }

    public static final void i(final int i, final int i2, final int i3, j09 j09Var, l46 l46Var, int i4) {
        l46Var.h0(127941466);
        int i5 = i4 | (l46Var.e(i) ? 4 : 2) | (l46Var.e(i2) ? 32 : 16) | (l46Var.e(i3) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) | (l46Var.g(j09Var) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE);
        if (l46Var.W(i5 & 1, (i5 & 1171) != 1170)) {
            l(j09Var, 0.0f, 0.0f, 16.0f, null, true, af1.b0(1957172038, new n26() { // from class: yp1
                @Override // defpackage.n26
                public final Object m(Object obj, Object obj2, Object obj3) {
                    l46 l46Var2 = (l46) obj2;
                    int iIntValue = ((Integer) obj3).intValue();
                    ((d92) obj).getClass();
                    if (l46Var2.W(iIntValue & 1, (iIntValue & 17) != 16)) {
                        String strQ = afc.q(R.string.explore_detail_drawn_relation_title, l46Var2);
                        mue mueVar = pue.a;
                        mue mueVarB = pue.b(l46Var2);
                        long j = ((m82) l46Var2.k(o82.a)).q;
                        g09 g09Var = g09.a;
                        nte.b(strQ, b.c(g09Var, 1.0f), j, 0L, null, null, 0L, null, new jme(3), 0L, 0, false, 0, 0, null, mueVarB, l46Var2, 48, 0, 130040);
                        j09 j09VarC = b.c(g09Var, 1.0f);
                        t7c t7cVarA = s7c.a(xc0.f, ndb.y, l46Var2, 6);
                        int iHashCode = Long.hashCode(l46Var2.T);
                        u8a u8aVarM = l46Var2.m();
                        j09 j09VarJ = m93.J(l46Var2, j09VarC);
                        lf2.q.getClass();
                        l46Var2.j0();
                        if (l46Var2.S) {
                            l46Var2.l(LayoutNode.h1);
                        } else {
                            l46Var2.s0();
                        }
                        dec.l(hj6.z, l46Var2, t7cVarA);
                        dec.l(hj6.y, l46Var2, u8aVarM);
                        dec.l(hj6.X, l46Var2, Integer.valueOf(iHashCode));
                        dec.k(l46Var2);
                        dec.l(hj6.x, l46Var2, j09VarJ);
                        uq1.h(i, R.string.explore_detail_drawn_in_deck_count_label, l46Var2, 0);
                        if (i3 > 1) {
                            l46Var2.f0(-341714936);
                            uq1.h(i2, R.string.explore_detail_drawn_in_all_count_label, l46Var2, 0);
                            l46Var2.r(false);
                        } else {
                            l46Var2.f0(-341576552);
                            l46Var2.r(false);
                        }
                        l46Var2.r(true);
                    } else {
                        l46Var2.Z();
                    }
                    return wef.a;
                }
            }, l46Var), l46Var, ((i5 >> 9) & 14) | 1772544, 22);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new zp1(i, i2, i3, j09Var, i4);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:103:0x021f  */
    /* JADX WARN: Code duplicated, block: B:104:0x0223  */
    /* JADX WARN: Code duplicated, block: B:108:0x0248  */
    /* JADX WARN: Code duplicated, block: B:111:0x0270  */
    /* JADX WARN: Code duplicated, block: B:112:0x0281  */
    /* JADX WARN: Code duplicated, block: B:115:0x02a0  */
    /* JADX WARN: Code duplicated, block: B:116:0x02a4  */
    /* JADX WARN: Code duplicated, block: B:119:0x02c5  */
    /* JADX WARN: Code duplicated, block: B:121:0x02ea  */
    /* JADX WARN: Code duplicated, block: B:124:0x02fe  */
    /* JADX WARN: Code duplicated, block: B:126:0x031b  */
    /* JADX WARN: Code duplicated, block: B:99:0x01d5  */
    public static final void j(bod bodVar, TarotCardType tarotCardType, TarotSkinIdentify tarotSkinIdentify, a26 a26Var, x16 x16Var, x16 x16Var2, l46 l46Var, int i) {
        l46 l46Var2;
        x16 x16Var3;
        bod bodVar2;
        boolean z;
        x16 x16Var4;
        j09 j09VarC;
        boolean z2;
        ov7 ov7Var;
        d31 d31Var;
        boolean zI;
        Object objR;
        j09 j09Var;
        boolean z3;
        TarotCardType tarotCardType2 = tarotCardType;
        bodVar.getClass();
        nmd nmdVar = bodVar.b;
        TarotSkinIdentify tarotSkinIdentify2 = bodVar.a;
        tarotSkinIdentify.getClass();
        a26Var.getClass();
        x16Var.getClass();
        x16Var2.getClass();
        l46Var.h0(-865019698);
        int i2 = i | (l46Var.g(bodVar) ? 4 : 2) | (l46Var.e(tarotCardType2 == null ? -1 : tarotCardType2.ordinal()) ? 32 : 16) | (l46Var.e(tarotSkinIdentify.ordinal()) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) | (l46Var.i(a26Var) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE) | (l46Var.i(x16Var) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE) | (l46Var.i(x16Var2) ? 131072 : 65536);
        if (l46Var.W(i2 & 1, (74899 & i2) != 74898)) {
            mld mldVarQ = hfc.q(tarotSkinIdentify2);
            float aspectRatio = tarotSkinIdentify2.getAspectRatio() * 154.0f;
            Object objR2 = l46Var.R();
            i8c i8cVar = sf2.a;
            if (objR2 == i8cVar) {
                objR2 = new bv7[1];
                l46Var.p0(objR2);
            }
            bv7[] bv7VarArr = (bv7[]) objR2;
            boolean zI2 = l46Var.i(bv7VarArr);
            Object objR3 = l46Var.R();
            if (zI2 || objR3 == i8cVar) {
                objR3 = new p(21, bv7VarArr);
                l46Var.p0(objR3);
            }
            x16 x16Var5 = (x16) objR3;
            int iOrdinal = nmdVar.ordinal();
            x16 x16Var6 = null;
            if (iOrdinal == 0 || iOrdinal == 1) {
                l46Var.f0(2996778);
                if (tarotCardType2 != null) {
                    l46Var.f0(3024554);
                    boolean zG = ((i2 & 7168) == 2048) | l46Var.g(x16Var5);
                    Object objR4 = l46Var.R();
                    if (zG || objR4 == i8cVar) {
                        z = false;
                        objR4 = new hq1(a26Var, x16Var5, 0);
                        l46Var.p0(objR4);
                    } else {
                        z = false;
                    }
                    x16Var6 = (x16) objR4;
                    l46Var.r(z);
                } else {
                    z = false;
                    l46Var.f0(3071550);
                    l46Var.r(false);
                }
                l46Var.r(z);
            } else {
                if (iOrdinal == 2) {
                    l46Var.f0(1939757048);
                    l46Var.r(false);
                    x16Var4 = x16Var;
                } else if (iOrdinal == 3) {
                    z3 = false;
                    l46Var.f0(3133487);
                    l46Var.r(false);
                } else {
                    if (iOrdinal != 4) {
                        throw tec.d(1939743057, l46Var, false);
                    }
                    l46Var.f0(2532770);
                    boolean z4 = ((i2 & 896) == 256) | ((i2 & 112) == 32) | ((i2 & 14) == 4) | ((458752 & i2) == 131072);
                    Object objR5 = l46Var.R();
                    if (z4 || objR5 == i8cVar) {
                        objR5 = new jr(x16Var2, tarotSkinIdentify, tarotCardType2, bodVar);
                        l46Var.p0(objR5);
                    }
                    x16Var6 = (x16) objR5;
                    z3 = false;
                    l46Var.r(false);
                }
                y6c y6cVarB = a7c.b(8.0f);
                j09VarC = g09.a;
                j09 j09VarP = b.p(j09VarC, aspectRatio);
                c92 c92VarA = a92.a(new uc0(6.0f, true, new qc0(0)), ndb.Z, l46Var, 54);
                int iHashCode = Long.hashCode(l46Var.T);
                u8a u8aVarM = l46Var.m();
                j09 j09VarJ = m93.J(l46Var, j09VarP);
                lf2.q.getClass();
                l46Var.j0();
                z2 = l46Var.S;
                ov7Var = LayoutNode.h1;
                if (z2) {
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
                j09 j09VarD = b.d(b.p(j09VarC, aspectRatio), 154.0f);
                lx0 lx0Var = ndb.f;
                xn8 xn8VarC = s21.c(lx0Var, false);
                int iHashCode2 = Long.hashCode(l46Var.T);
                u8a u8aVarM2 = l46Var.m();
                j09 j09VarJ2 = m93.J(l46Var, j09VarD);
                l46Var.j0();
                if (l46Var.S) {
                    l46Var.l(ov7Var);
                } else {
                    l46Var.s0();
                }
                dec.l(he2Var, l46Var, xn8VarC);
                dec.l(he2Var2, l46Var, u8aVarM2);
                ib8.s(iHashCode2, l46Var, he2Var3, l46Var);
                dec.l(he2Var4, l46Var, j09VarJ2);
                d31Var = d31.a;
                j09 j09VarE = oa7.E(d31Var.b(j09VarC), y6cVarB);
                zI = l46Var.i(bv7VarArr);
                objR = l46Var.R();
                if (zI || objR == i8cVar) {
                    objR = new c1(29, bv7VarArr);
                    l46Var.p0(objR);
                }
                j09 j09VarA = androidx.compose.ui.platform.b.a(nk8.w(j09VarE, (a26) objR), "card-detail-skin-" + tarotSkinIdentify2.name());
                if (x16Var4 != null) {
                    j09VarC = androidx.compose.foundation.b.c(j09VarC, false, null, null, x16Var4, 15);
                    j09Var = j09VarC;
                } else {
                    j09Var = j09VarC;
                }
                j09 j09VarD2 = j09VarA.D(j09VarC);
                xn8 xn8VarC2 = s21.c(lx0Var, false);
                int iHashCode3 = Long.hashCode(l46Var.T);
                u8a u8aVarM3 = l46Var.m();
                j09 j09VarJ3 = m93.J(l46Var, j09VarD2);
                l46Var.j0();
                if (l46Var.S) {
                    l46Var.l(ov7Var);
                } else {
                    l46Var.s0();
                }
                dec.l(he2Var, l46Var, xn8VarC2);
                dec.l(he2Var2, l46Var, u8aVarM3);
                ib8.s(iHashCode3, l46Var, he2Var3, l46Var);
                dec.l(he2Var4, l46Var, j09VarJ3);
                int i3 = i2 & 14;
                bodVar2 = bodVar;
                tarotCardType2 = tarotCardType;
                n(bodVar2, tarotCardType2, l46Var, i2 & 126);
                if (nmdVar == nmd.e) {
                    l46Var.f0(-1911377861);
                    s21.a(tm7.o(d31Var.b(j09Var), y72.b(y72.b, 0.45f), g21.f), l46Var, 0);
                    p(0, l46Var);
                    l46Var.r(false);
                } else {
                    l46Var.f0(-1911198154);
                    l46Var.r(false);
                }
                l46Var.r(true);
                if (tarotSkinIdentify2.getIsModianCollab()) {
                    l46Var.f0(-2003310417);
                    hy9.c(tm7.M(d31Var.a(j09Var, ndb.d), 8.5f, -8.5f), l46Var, 0);
                    l46Var.r(false);
                } else {
                    l46Var.f0(-2003155696);
                    l46Var.r(false);
                }
                l46Var.r(true);
                String strQ = afc.q(mldVarQ.m(), l46Var);
                mue mueVar = pue.a;
                nte.b(strQ, null, y72.b(((e8b) l46Var.k(l8b.a)).q, 0.72f), 0L, null, null, 0L, null, new jme(3), 0L, 2, false, 1, 0, null, pue.j(l46Var), l46Var, 0, 24960, 109562);
                l46Var2 = l46Var;
                x16Var3 = x16Var;
                o(bodVar2, x16Var3, l46Var2, ((i2 >> 9) & 112) | i3);
                l46Var2.r(true);
            }
            x16Var4 = x16Var6;
            y6c y6cVarB2 = a7c.b(8.0f);
            j09VarC = g09.a;
            j09 j09VarP2 = b.p(j09VarC, aspectRatio);
            c92 c92VarA2 = a92.a(new uc0(6.0f, true, new qc0(0)), ndb.Z, l46Var, 54);
            int iHashCode4 = Long.hashCode(l46Var.T);
            u8a u8aVarM4 = l46Var.m();
            j09 j09VarJ4 = m93.J(l46Var, j09VarP2);
            lf2.q.getClass();
            l46Var.j0();
            z2 = l46Var.S;
            ov7Var = LayoutNode.h1;
            if (z2) {
                l46Var.l(ov7Var);
            } else {
                l46Var.s0();
            }
            he2 he2Var5 = hj6.z;
            dec.l(he2Var5, l46Var, c92VarA2);
            he2 he2Var6 = hj6.y;
            dec.l(he2Var6, l46Var, u8aVarM4);
            Integer numValueOf2 = Integer.valueOf(iHashCode4);
            he2 he2Var7 = hj6.X;
            dec.l(he2Var7, l46Var, numValueOf2);
            dec.k(l46Var);
            he2 he2Var8 = hj6.x;
            dec.l(he2Var8, l46Var, j09VarJ4);
            j09 j09VarD3 = b.d(b.p(j09VarC, aspectRatio), 154.0f);
            lx0 lx0Var2 = ndb.f;
            xn8 xn8VarC3 = s21.c(lx0Var2, false);
            int iHashCode5 = Long.hashCode(l46Var.T);
            u8a u8aVarM5 = l46Var.m();
            j09 j09VarJ5 = m93.J(l46Var, j09VarD3);
            l46Var.j0();
            if (l46Var.S) {
                l46Var.l(ov7Var);
            } else {
                l46Var.s0();
            }
            dec.l(he2Var5, l46Var, xn8VarC3);
            dec.l(he2Var6, l46Var, u8aVarM5);
            ib8.s(iHashCode5, l46Var, he2Var7, l46Var);
            dec.l(he2Var8, l46Var, j09VarJ5);
            d31Var = d31.a;
            j09 j09VarE2 = oa7.E(d31Var.b(j09VarC), y6cVarB2);
            zI = l46Var.i(bv7VarArr);
            objR = l46Var.R();
            if (zI) {
                objR = new c1(29, bv7VarArr);
                l46Var.p0(objR);
            } else {
                objR = new c1(29, bv7VarArr);
                l46Var.p0(objR);
            }
            j09 j09VarA2 = androidx.compose.ui.platform.b.a(nk8.w(j09VarE2, (a26) objR), "card-detail-skin-" + tarotSkinIdentify2.name());
            if (x16Var4 != null) {
                j09VarC = androidx.compose.foundation.b.c(j09VarC, false, null, null, x16Var4, 15);
                j09Var = j09VarC;
            } else {
                j09Var = j09VarC;
            }
            j09 j09VarD4 = j09VarA2.D(j09VarC);
            xn8 xn8VarC4 = s21.c(lx0Var2, false);
            int iHashCode6 = Long.hashCode(l46Var.T);
            u8a u8aVarM6 = l46Var.m();
            j09 j09VarJ6 = m93.J(l46Var, j09VarD4);
            l46Var.j0();
            if (l46Var.S) {
                l46Var.l(ov7Var);
            } else {
                l46Var.s0();
            }
            dec.l(he2Var5, l46Var, xn8VarC4);
            dec.l(he2Var6, l46Var, u8aVarM6);
            ib8.s(iHashCode6, l46Var, he2Var7, l46Var);
            dec.l(he2Var8, l46Var, j09VarJ6);
            int i4 = i2 & 14;
            bodVar2 = bodVar;
            tarotCardType2 = tarotCardType;
            n(bodVar2, tarotCardType2, l46Var, i2 & 126);
            if (nmdVar == nmd.e) {
                l46Var.f0(-1911377861);
                s21.a(tm7.o(d31Var.b(j09Var), y72.b(y72.b, 0.45f), g21.f), l46Var, 0);
                p(0, l46Var);
                l46Var.r(false);
            } else {
                l46Var.f0(-1911198154);
                l46Var.r(false);
            }
            l46Var.r(true);
            if (tarotSkinIdentify2.getIsModianCollab()) {
                l46Var.f0(-2003310417);
                hy9.c(tm7.M(d31Var.a(j09Var, ndb.d), 8.5f, -8.5f), l46Var, 0);
                l46Var.r(false);
            } else {
                l46Var.f0(-2003155696);
                l46Var.r(false);
            }
            l46Var.r(true);
            String strQ2 = afc.q(mldVarQ.m(), l46Var);
            mue mueVar2 = pue.a;
            nte.b(strQ2, null, y72.b(((e8b) l46Var.k(l8b.a)).q, 0.72f), 0L, null, null, 0L, null, new jme(3), 0L, 2, false, 1, 0, null, pue.j(l46Var), l46Var, 0, 24960, 109562);
            l46Var2 = l46Var;
            x16Var3 = x16Var;
            o(bodVar2, x16Var3, l46Var2, ((i2 >> 9) & 112) | i4);
            l46Var2.r(true);
        } else {
            l46Var2 = l46Var;
            x16Var3 = x16Var;
            bodVar2 = bodVar;
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new iq1(bodVar2, tarotCardType2, tarotSkinIdentify, a26Var, x16Var3, x16Var2, i);
        }
    }

    public static final void k(String str, String str2, long j, l46 l46Var, int i) {
        l46Var.h0(-1916977712);
        int i2 = i | (l46Var.g(str) ? 4 : 2) | (l46Var.g(str2) ? 32 : 16) | (l46Var.f(j) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS);
        if (l46Var.W(i2 & 1, (i2 & 147) != 146)) {
            long jD = we6.e(l46Var) ? abg.d(4287598835L) : ((e8b) l46Var.k(l8b.a)).u;
            i00 i00Var = new i00();
            int iK = i00Var.k(new xtd(jD, 0L, ar5.x, null, null, null, null, 0L, null, null, null, 0L, null, null, 65530));
            try {
                i00Var.f(str);
                i00Var.h(iK);
                i00Var.f("  ");
                int iK2 = i00Var.k(new xtd(j, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 65534));
                try {
                    i00Var.f(str2);
                    i00Var.h(iK2);
                    k00 k00VarL = i00Var.l();
                    mue mueVar = pue.a;
                    nte.c(k00VarL, null, 0L, 0L, null, null, 0L, null, 0L, 0, false, 0, 0, null, null, pue.e(l46Var), l46Var, 0, 0, 262142);
                } catch (Throwable th) {
                    i00Var.h(iK2);
                    throw th;
                }
            } catch (Throwable th2) {
                i00Var.h(iK);
                throw th2;
            }
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new cq1(i, j, str, str2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0188  */
    /* JADX WARN: Code duplicated, block: B:102:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:103:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:107:0x01d4  */
    /* JADX WARN: Code duplicated, block: B:110:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:112:0x022a  */
    /* JADX WARN: Code duplicated, block: B:115:0x023a  */
    /* JADX WARN: Code duplicated, block: B:116:0x0249 A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Code duplicated, block: B:117:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:23:0x003f  */
    /* JADX WARN: Code duplicated, block: B:25:0x0044  */
    /* JADX WARN: Code duplicated, block: B:27:0x0048  */
    /* JADX WARN: Code duplicated, block: B:29:0x0050  */
    /* JADX WARN: Code duplicated, block: B:30:0x0053  */
    /* JADX WARN: Code duplicated, block: B:34:0x005a  */
    /* JADX WARN: Code duplicated, block: B:36:0x0060  */
    /* JADX WARN: Code duplicated, block: B:37:0x0063  */
    /* JADX WARN: Code duplicated, block: B:41:0x006a  */
    /* JADX WARN: Code duplicated, block: B:43:0x006f  */
    /* JADX WARN: Code duplicated, block: B:45:0x0073  */
    /* JADX WARN: Code duplicated, block: B:47:0x007b  */
    /* JADX WARN: Code duplicated, block: B:48:0x007e  */
    /* JADX WARN: Code duplicated, block: B:52:0x0087  */
    /* JADX WARN: Code duplicated, block: B:54:0x008b  */
    /* JADX WARN: Code duplicated, block: B:56:0x008e  */
    /* JADX WARN: Code duplicated, block: B:58:0x0096  */
    /* JADX WARN: Code duplicated, block: B:59:0x0099  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:65:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:66:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:70:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:71:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:74:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:76:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:77:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:79:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:80:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:82:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:83:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:85:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:87:0x00db  */
    /* JADX WARN: Code duplicated, block: B:88:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:91:0x0104  */
    /* JADX WARN: Code duplicated, block: B:93:0x0143  */
    /* JADX WARN: Code duplicated, block: B:94:0x0149  */
    /* JADX WARN: Code duplicated, block: B:97:0x017c  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v17 */
    /* JADX WARN: Type inference failed for: r10v7 */
    /* JADX WARN: Type inference failed for: r10v8, types: [boolean, int] */
    public static final void l(final j09 j09Var, float f, float f2, final float f3, xi xiVar, boolean z, final dd2 dd2Var, l46 l46Var, final int i, final int i2) {
        int i3;
        float f4;
        int i4;
        float f5;
        int i5;
        int i6;
        xi xiVar2;
        int i7;
        int i8;
        boolean z2;
        int i9;
        int i10;
        boolean z3;
        j09 j09Var2;
        final float f6;
        final dd2 dd2Var2;
        final float f7;
        final float f8;
        final xi xiVar3;
        final boolean z4;
        ojb ojbVarV;
        l26 l26Var;
        final float f9;
        final float f10;
        final xi xiVar4;
        ?? r10;
        boolean z5;
        pr4 pr4Var;
        long j;
        long jC;
        long j2;
        long j3;
        int i11;
        int i12;
        l46Var.h0(-1689954088);
        if ((i & 6) == 0) {
            i3 = (l46Var.g(j09Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i13 = i2 & 2;
        if (i13 == 0) {
            if ((i & 48) == 0) {
                f4 = f;
                i3 |= l46Var.d(f4) ? 32 : 16;
            }
            i4 = i2 & 4;
            if (i4 != 0) {
                if ((i & 384) == 0) {
                    f5 = f2;
                    if (l46Var.d(f5)) {
                        i5 = 256;
                    } else {
                        i5 = UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
                    }
                    i3 |= i5;
                }
                if ((i & 3072) == 0) {
                    if (l46Var.d(f3)) {
                        i12 = 2048;
                    } else {
                        i12 = UserMetadata.MAX_ATTRIBUTE_SIZE;
                    }
                    i3 |= i12;
                }
                i6 = i2 & 16;
                if (i6 != 0) {
                    if ((i & 24576) == 0) {
                        xiVar2 = xiVar;
                        if (l46Var.g(xiVar2)) {
                            i7 = 16384;
                        } else {
                            i7 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
                        }
                        i3 |= i7;
                    }
                    i8 = i2 & 32;
                    if (i8 != 0) {
                        if ((196608 & i) == 0) {
                            z2 = z;
                            if (l46Var.h(z2)) {
                                i9 = 131072;
                            } else {
                                i9 = 65536;
                            }
                            i3 |= i9;
                        }
                        if ((1572864 & i) == 0) {
                            if (l46Var.i(dd2Var)) {
                                i11 = 1048576;
                            } else {
                                i11 = 524288;
                            }
                            i3 |= i11;
                        }
                        i10 = i3;
                        if ((599187 & i3) != 599186) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (l46Var.W(i10 & 1, z3)) {
                            if (i13 != 0) {
                                f9 = 20.0f;
                            } else {
                                f9 = f4;
                            }
                            if (i4 != 0) {
                                f10 = 20.0f;
                            } else {
                                f10 = f5;
                            }
                            if (i6 != 0) {
                                xiVar4 = ndb.Y;
                            } else {
                                xiVar4 = xiVar2;
                            }
                            if (i8 != 0) {
                                z2 = false;
                            }
                            if (z2) {
                                l46Var.f0(-548219291);
                                boolean zF = k8b.f((e8b) l46Var.k(l8b.a));
                                r10 = 0;
                                l46Var.r(false);
                                z5 = zF;
                            } else {
                                r10 = 0;
                                l46Var.f0(185072400);
                                l46Var.r(false);
                                z5 = false;
                            }
                            if (z5) {
                                l46Var.f0(185092369);
                                j09 j09VarC = b.c(j09Var, 1.0f);
                                uc0 uc0Var = new uc0(f3, true, new qc0(r10));
                                int i14 = ((i10 >> 6) & 896) | ((i10 >> 9) & 7168);
                                c92 c92VarA = a92.a(uc0Var, xiVar4, l46Var, (i14 >> 3) & 112);
                                int iHashCode = Long.hashCode(l46Var.T);
                                u8a u8aVarM = l46Var.m();
                                j09 j09VarJ = m93.J(l46Var, j09VarC);
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
                                dec.l(hj6.x, l46Var, j09VarJ);
                                ks0.q(((i14 >> 6) & 112) | 6, dd2Var, e92.a, l46Var, true);
                                l46Var.r(false);
                                ojbVarV = l46Var.v();
                                if (ojbVarV != null) {
                                    return;
                                }
                                final int i15 = 0;
                                final boolean z6 = z2;
                                l26Var = new l26() { // from class: fq1
                                    @Override // defpackage.l26
                                    public final Object z(Object obj, Object obj2) {
                                        int i16 = i15;
                                        wef wefVar = wef.a;
                                        int i17 = i;
                                        switch (i16) {
                                            case 0:
                                                ((Integer) obj2).getClass();
                                                int iP = k99.P(i17 | 1);
                                                uq1.l(j09Var, f9, f10, f3, xiVar4, z6, dd2Var, (l46) obj, iP, i2);
                                                break;
                                            default:
                                                ((Integer) obj2).getClass();
                                                int iP2 = k99.P(i17 | 1);
                                                uq1.l(j09Var, f9, f10, f3, xiVar4, z6, dd2Var, (l46) obj, iP2, i2);
                                                break;
                                        }
                                        return wefVar;
                                    }
                                };
                            } else {
                                j09Var2 = j09Var;
                                float f11 = f9;
                                f6 = f3;
                                dd2Var2 = dd2Var;
                                boolean z7 = z2;
                                final float f12 = f10;
                                final xi xiVar5 = xiVar4;
                                l46Var.f0(185300906);
                                l46Var.r(r10);
                                pr4Var = l8b.a;
                                j = ((e8b) l46Var.k(pr4Var)).c;
                                if (if9.B(l46Var)) {
                                    l46Var.f0(-548197909);
                                    jC = ((e8b) l46Var.k(pr4Var)).f;
                                    l46Var.r(false);
                                } else {
                                    l46Var.f0(-548197111);
                                    l46Var.r(false);
                                    jC = abg.c(2063597567);
                                }
                                if (!we6.e(l46Var)) {
                                    j = jC;
                                }
                                j2 = ((e8b) l46Var.k(pr4Var)).z;
                                j3 = ((e8b) l46Var.k(pr4Var)).d;
                                if (we6.e(l46Var)) {
                                    j3 = j2;
                                }
                                bzd.d(b.c(j09Var2, 1.0f), a7c.b(f11), z5c.p(j, 0L, l46Var, 24576, 14), null, x57.b(j3, 0.5f), af1.b0(1985143846, new n26() { // from class: gq1
                                    @Override // defpackage.n26
                                    public final Object m(Object obj, Object obj2, Object obj3) {
                                        l46 l46Var2 = (l46) obj2;
                                        int iIntValue = ((Integer) obj3).intValue();
                                        ((d92) obj).getClass();
                                        if (l46Var2.W(iIntValue & 1, (iIntValue & 17) != 16)) {
                                            j09 j09VarZ = ynb.Z(b.c(g09.a, 1.0f), f12);
                                            c92 c92VarA2 = a92.a(new uc0(f6, true, new qc0(0)), xiVar5, l46Var2, 0);
                                            int iHashCode2 = Long.hashCode(l46Var2.T);
                                            u8a u8aVarM2 = l46Var2.m();
                                            j09 j09VarJ2 = m93.J(l46Var2, j09VarZ);
                                            lf2.q.getClass();
                                            l46Var2.j0();
                                            if (l46Var2.S) {
                                                l46Var2.l(LayoutNode.h1);
                                            } else {
                                                l46Var2.s0();
                                            }
                                            dec.l(hj6.z, l46Var2, c92VarA2);
                                            dec.l(hj6.y, l46Var2, u8aVarM2);
                                            dec.l(hj6.X, l46Var2, Integer.valueOf(iHashCode2));
                                            dec.k(l46Var2);
                                            dec.l(hj6.x, l46Var2, j09VarJ2);
                                            ks0.q(6, dd2Var2, e92.a, l46Var2, true);
                                        } else {
                                            l46Var2.Z();
                                        }
                                        return wef.a;
                                    }
                                }, l46Var), l46Var, 196608, 8);
                                xiVar3 = xiVar5;
                                f7 = f11;
                                f8 = f12;
                                z4 = z7;
                            }
                            ojbVarV.d = l26Var;
                        }
                        j09Var2 = j09Var;
                        f6 = f3;
                        dd2Var2 = dd2Var;
                        l46Var.Z();
                        f7 = f4;
                        f8 = f5;
                        xiVar3 = xiVar2;
                        z4 = z2;
                        ojbVarV = l46Var.v();
                        if (ojbVarV != null) {
                            final int i16 = 1;
                            final j09 j09Var3 = j09Var2;
                            final float f13 = f6;
                            final dd2 dd2Var3 = dd2Var2;
                            l26Var = new l26() { // from class: fq1
                                @Override // defpackage.l26
                                public final Object z(Object obj, Object obj2) {
                                    int i17 = i16;
                                    wef wefVar = wef.a;
                                    int i18 = i;
                                    switch (i17) {
                                        case 0:
                                            ((Integer) obj2).getClass();
                                            int iP = k99.P(i18 | 1);
                                            uq1.l(j09Var3, f7, f8, f13, xiVar3, z4, dd2Var3, (l46) obj, iP, i2);
                                            break;
                                        default:
                                            ((Integer) obj2).getClass();
                                            int iP2 = k99.P(i18 | 1);
                                            uq1.l(j09Var3, f7, f8, f13, xiVar3, z4, dd2Var3, (l46) obj, iP2, i2);
                                            break;
                                    }
                                    return wefVar;
                                }
                            };
                            ojbVarV.d = l26Var;
                        }
                    }
                    i3 |= 196608;
                    z2 = z;
                    if ((1572864 & i) == 0) {
                        if (l46Var.i(dd2Var)) {
                            i11 = 1048576;
                        } else {
                            i11 = 524288;
                        }
                        i3 |= i11;
                    }
                    i10 = i3;
                    if ((599187 & i3) != 599186) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (l46Var.W(i10 & 1, z3)) {
                        if (i13 != 0) {
                            f9 = 20.0f;
                        } else {
                            f9 = f4;
                        }
                        if (i4 != 0) {
                            f10 = 20.0f;
                        } else {
                            f10 = f5;
                        }
                        if (i6 != 0) {
                            xiVar4 = ndb.Y;
                        } else {
                            xiVar4 = xiVar2;
                        }
                        if (i8 != 0) {
                            z2 = false;
                        }
                        if (z2) {
                            l46Var.f0(-548219291);
                            boolean zF2 = k8b.f((e8b) l46Var.k(l8b.a));
                            r10 = 0;
                            l46Var.r(false);
                            z5 = zF2;
                        } else {
                            r10 = 0;
                            l46Var.f0(185072400);
                            l46Var.r(false);
                            z5 = false;
                        }
                        if (z5) {
                            l46Var.f0(185092369);
                            j09 j09VarC2 = b.c(j09Var, 1.0f);
                            uc0 uc0Var2 = new uc0(f3, true, new qc0(r10));
                            int i17 = ((i10 >> 6) & 896) | ((i10 >> 9) & 7168);
                            c92 c92VarA2 = a92.a(uc0Var2, xiVar4, l46Var, (i17 >> 3) & 112);
                            int iHashCode2 = Long.hashCode(l46Var.T);
                            u8a u8aVarM2 = l46Var.m();
                            j09 j09VarJ2 = m93.J(l46Var, j09VarC2);
                            lf2.q.getClass();
                            l46Var.j0();
                            if (l46Var.S) {
                                l46Var.l(LayoutNode.h1);
                            } else {
                                l46Var.s0();
                            }
                            dec.l(hj6.z, l46Var, c92VarA2);
                            dec.l(hj6.y, l46Var, u8aVarM2);
                            dec.l(hj6.X, l46Var, Integer.valueOf(iHashCode2));
                            dec.k(l46Var);
                            dec.l(hj6.x, l46Var, j09VarJ2);
                            ks0.q(((i17 >> 6) & 112) | 6, dd2Var, e92.a, l46Var, true);
                            l46Var.r(false);
                            ojbVarV = l46Var.v();
                            if (ojbVarV != null) {
                                return;
                            }
                            final int i18 = 0;
                            final boolean z8 = z2;
                            l26Var = new l26() { // from class: fq1
                                @Override // defpackage.l26
                                public final Object z(Object obj, Object obj2) {
                                    int i19 = i18;
                                    wef wefVar = wef.a;
                                    int i110 = i;
                                    switch (i19) {
                                        case 0:
                                            ((Integer) obj2).getClass();
                                            int iP = k99.P(i110 | 1);
                                            uq1.l(j09Var, f9, f10, f3, xiVar4, z8, dd2Var, (l46) obj, iP, i2);
                                            break;
                                        default:
                                            ((Integer) obj2).getClass();
                                            int iP2 = k99.P(i110 | 1);
                                            uq1.l(j09Var, f9, f10, f3, xiVar4, z8, dd2Var, (l46) obj, iP2, i2);
                                            break;
                                    }
                                    return wefVar;
                                }
                            };
                        } else {
                            j09Var2 = j09Var;
                            float f14 = f9;
                            f6 = f3;
                            dd2Var2 = dd2Var;
                            boolean z9 = z2;
                            final float f15 = f10;
                            final xi xiVar6 = xiVar4;
                            l46Var.f0(185300906);
                            l46Var.r(r10);
                            pr4Var = l8b.a;
                            j = ((e8b) l46Var.k(pr4Var)).c;
                            if (if9.B(l46Var)) {
                                l46Var.f0(-548197909);
                                jC = ((e8b) l46Var.k(pr4Var)).f;
                                l46Var.r(false);
                            } else {
                                l46Var.f0(-548197111);
                                l46Var.r(false);
                                jC = abg.c(2063597567);
                            }
                            if (!we6.e(l46Var)) {
                                j = jC;
                            }
                            j2 = ((e8b) l46Var.k(pr4Var)).z;
                            j3 = ((e8b) l46Var.k(pr4Var)).d;
                            if (we6.e(l46Var)) {
                                j3 = j2;
                            }
                            bzd.d(b.c(j09Var2, 1.0f), a7c.b(f14), z5c.p(j, 0L, l46Var, 24576, 14), null, x57.b(j3, 0.5f), af1.b0(1985143846, new n26() { // from class: gq1
                                @Override // defpackage.n26
                                public final Object m(Object obj, Object obj2, Object obj3) {
                                    l46 l46Var2 = (l46) obj2;
                                    int iIntValue = ((Integer) obj3).intValue();
                                    ((d92) obj).getClass();
                                    if (l46Var2.W(iIntValue & 1, (iIntValue & 17) != 16)) {
                                        j09 j09VarZ = ynb.Z(b.c(g09.a, 1.0f), f15);
                                        c92 c92VarA3 = a92.a(new uc0(f6, true, new qc0(0)), xiVar6, l46Var2, 0);
                                        int iHashCode3 = Long.hashCode(l46Var2.T);
                                        u8a u8aVarM3 = l46Var2.m();
                                        j09 j09VarJ3 = m93.J(l46Var2, j09VarZ);
                                        lf2.q.getClass();
                                        l46Var2.j0();
                                        if (l46Var2.S) {
                                            l46Var2.l(LayoutNode.h1);
                                        } else {
                                            l46Var2.s0();
                                        }
                                        dec.l(hj6.z, l46Var2, c92VarA3);
                                        dec.l(hj6.y, l46Var2, u8aVarM3);
                                        dec.l(hj6.X, l46Var2, Integer.valueOf(iHashCode3));
                                        dec.k(l46Var2);
                                        dec.l(hj6.x, l46Var2, j09VarJ3);
                                        ks0.q(6, dd2Var2, e92.a, l46Var2, true);
                                    } else {
                                        l46Var2.Z();
                                    }
                                    return wef.a;
                                }
                            }, l46Var), l46Var, 196608, 8);
                            xiVar3 = xiVar6;
                            f7 = f14;
                            f8 = f15;
                            z4 = z9;
                        }
                        ojbVarV.d = l26Var;
                    }
                    j09Var2 = j09Var;
                    f6 = f3;
                    dd2Var2 = dd2Var;
                    l46Var.Z();
                    f7 = f4;
                    f8 = f5;
                    xiVar3 = xiVar2;
                    z4 = z2;
                    ojbVarV = l46Var.v();
                    if (ojbVarV != null) {
                        final int i19 = 1;
                        final j09 j09Var4 = j09Var2;
                        final float f16 = f6;
                        final dd2 dd2Var4 = dd2Var2;
                        l26Var = new l26() { // from class: fq1
                            @Override // defpackage.l26
                            public final Object z(Object obj, Object obj2) {
                                int i110 = i19;
                                wef wefVar = wef.a;
                                int i111 = i;
                                switch (i110) {
                                    case 0:
                                        ((Integer) obj2).getClass();
                                        int iP = k99.P(i111 | 1);
                                        uq1.l(j09Var4, f7, f8, f16, xiVar3, z4, dd2Var4, (l46) obj, iP, i2);
                                        break;
                                    default:
                                        ((Integer) obj2).getClass();
                                        int iP2 = k99.P(i111 | 1);
                                        uq1.l(j09Var4, f7, f8, f16, xiVar3, z4, dd2Var4, (l46) obj, iP2, i2);
                                        break;
                                }
                                return wefVar;
                            }
                        };
                        ojbVarV.d = l26Var;
                    }
                }
                i3 |= 24576;
                xiVar2 = xiVar;
                i8 = i2 & 32;
                if (i8 != 0) {
                    if ((196608 & i) == 0) {
                        z2 = z;
                        if (l46Var.h(z2)) {
                            i9 = 131072;
                        } else {
                            i9 = 65536;
                        }
                        i3 |= i9;
                    }
                    if ((1572864 & i) == 0) {
                        if (l46Var.i(dd2Var)) {
                            i11 = 1048576;
                        } else {
                            i11 = 524288;
                        }
                        i3 |= i11;
                    }
                    i10 = i3;
                    if ((599187 & i3) != 599186) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (l46Var.W(i10 & 1, z3)) {
                        if (i13 != 0) {
                            f9 = 20.0f;
                        } else {
                            f9 = f4;
                        }
                        if (i4 != 0) {
                            f10 = 20.0f;
                        } else {
                            f10 = f5;
                        }
                        if (i6 != 0) {
                            xiVar4 = ndb.Y;
                        } else {
                            xiVar4 = xiVar2;
                        }
                        if (i8 != 0) {
                            z2 = false;
                        }
                        if (z2) {
                            l46Var.f0(-548219291);
                            boolean zF3 = k8b.f((e8b) l46Var.k(l8b.a));
                            r10 = 0;
                            l46Var.r(false);
                            z5 = zF3;
                        } else {
                            r10 = 0;
                            l46Var.f0(185072400);
                            l46Var.r(false);
                            z5 = false;
                        }
                        if (z5) {
                            l46Var.f0(185092369);
                            j09 j09VarC3 = b.c(j09Var, 1.0f);
                            uc0 uc0Var3 = new uc0(f3, true, new qc0(r10));
                            int i110 = ((i10 >> 6) & 896) | ((i10 >> 9) & 7168);
                            c92 c92VarA3 = a92.a(uc0Var3, xiVar4, l46Var, (i110 >> 3) & 112);
                            int iHashCode3 = Long.hashCode(l46Var.T);
                            u8a u8aVarM3 = l46Var.m();
                            j09 j09VarJ3 = m93.J(l46Var, j09VarC3);
                            lf2.q.getClass();
                            l46Var.j0();
                            if (l46Var.S) {
                                l46Var.l(LayoutNode.h1);
                            } else {
                                l46Var.s0();
                            }
                            dec.l(hj6.z, l46Var, c92VarA3);
                            dec.l(hj6.y, l46Var, u8aVarM3);
                            dec.l(hj6.X, l46Var, Integer.valueOf(iHashCode3));
                            dec.k(l46Var);
                            dec.l(hj6.x, l46Var, j09VarJ3);
                            ks0.q(((i110 >> 6) & 112) | 6, dd2Var, e92.a, l46Var, true);
                            l46Var.r(false);
                            ojbVarV = l46Var.v();
                            if (ojbVarV != null) {
                                return;
                            }
                            final int i111 = 0;
                            final boolean z10 = z2;
                            l26Var = new l26() { // from class: fq1
                                @Override // defpackage.l26
                                public final Object z(Object obj, Object obj2) {
                                    int i112 = i111;
                                    wef wefVar = wef.a;
                                    int i113 = i;
                                    switch (i112) {
                                        case 0:
                                            ((Integer) obj2).getClass();
                                            int iP = k99.P(i113 | 1);
                                            uq1.l(j09Var, f9, f10, f3, xiVar4, z10, dd2Var, (l46) obj, iP, i2);
                                            break;
                                        default:
                                            ((Integer) obj2).getClass();
                                            int iP2 = k99.P(i113 | 1);
                                            uq1.l(j09Var, f9, f10, f3, xiVar4, z10, dd2Var, (l46) obj, iP2, i2);
                                            break;
                                    }
                                    return wefVar;
                                }
                            };
                        } else {
                            j09Var2 = j09Var;
                            float f17 = f9;
                            f6 = f3;
                            dd2Var2 = dd2Var;
                            boolean z11 = z2;
                            final float f18 = f10;
                            final xi xiVar7 = xiVar4;
                            l46Var.f0(185300906);
                            l46Var.r(r10);
                            pr4Var = l8b.a;
                            j = ((e8b) l46Var.k(pr4Var)).c;
                            if (if9.B(l46Var)) {
                                l46Var.f0(-548197909);
                                jC = ((e8b) l46Var.k(pr4Var)).f;
                                l46Var.r(false);
                            } else {
                                l46Var.f0(-548197111);
                                l46Var.r(false);
                                jC = abg.c(2063597567);
                            }
                            if (!we6.e(l46Var)) {
                                j = jC;
                            }
                            j2 = ((e8b) l46Var.k(pr4Var)).z;
                            j3 = ((e8b) l46Var.k(pr4Var)).d;
                            if (we6.e(l46Var)) {
                                j3 = j2;
                            }
                            bzd.d(b.c(j09Var2, 1.0f), a7c.b(f17), z5c.p(j, 0L, l46Var, 24576, 14), null, x57.b(j3, 0.5f), af1.b0(1985143846, new n26() { // from class: gq1
                                @Override // defpackage.n26
                                public final Object m(Object obj, Object obj2, Object obj3) {
                                    l46 l46Var2 = (l46) obj2;
                                    int iIntValue = ((Integer) obj3).intValue();
                                    ((d92) obj).getClass();
                                    if (l46Var2.W(iIntValue & 1, (iIntValue & 17) != 16)) {
                                        j09 j09VarZ = ynb.Z(b.c(g09.a, 1.0f), f18);
                                        c92 c92VarA4 = a92.a(new uc0(f6, true, new qc0(0)), xiVar7, l46Var2, 0);
                                        int iHashCode4 = Long.hashCode(l46Var2.T);
                                        u8a u8aVarM4 = l46Var2.m();
                                        j09 j09VarJ4 = m93.J(l46Var2, j09VarZ);
                                        lf2.q.getClass();
                                        l46Var2.j0();
                                        if (l46Var2.S) {
                                            l46Var2.l(LayoutNode.h1);
                                        } else {
                                            l46Var2.s0();
                                        }
                                        dec.l(hj6.z, l46Var2, c92VarA4);
                                        dec.l(hj6.y, l46Var2, u8aVarM4);
                                        dec.l(hj6.X, l46Var2, Integer.valueOf(iHashCode4));
                                        dec.k(l46Var2);
                                        dec.l(hj6.x, l46Var2, j09VarJ4);
                                        ks0.q(6, dd2Var2, e92.a, l46Var2, true);
                                    } else {
                                        l46Var2.Z();
                                    }
                                    return wef.a;
                                }
                            }, l46Var), l46Var, 196608, 8);
                            xiVar3 = xiVar7;
                            f7 = f17;
                            f8 = f18;
                            z4 = z11;
                        }
                        ojbVarV.d = l26Var;
                    }
                    j09Var2 = j09Var;
                    f6 = f3;
                    dd2Var2 = dd2Var;
                    l46Var.Z();
                    f7 = f4;
                    f8 = f5;
                    xiVar3 = xiVar2;
                    z4 = z2;
                    ojbVarV = l46Var.v();
                    if (ojbVarV != null) {
                        final int i112 = 1;
                        final j09 j09Var5 = j09Var2;
                        final float f19 = f6;
                        final dd2 dd2Var5 = dd2Var2;
                        l26Var = new l26() { // from class: fq1
                            @Override // defpackage.l26
                            public final Object z(Object obj, Object obj2) {
                                int i113 = i112;
                                wef wefVar = wef.a;
                                int i114 = i;
                                switch (i113) {
                                    case 0:
                                        ((Integer) obj2).getClass();
                                        int iP = k99.P(i114 | 1);
                                        uq1.l(j09Var5, f7, f8, f19, xiVar3, z4, dd2Var5, (l46) obj, iP, i2);
                                        break;
                                    default:
                                        ((Integer) obj2).getClass();
                                        int iP2 = k99.P(i114 | 1);
                                        uq1.l(j09Var5, f7, f8, f19, xiVar3, z4, dd2Var5, (l46) obj, iP2, i2);
                                        break;
                                }
                                return wefVar;
                            }
                        };
                        ojbVarV.d = l26Var;
                    }
                }
                i3 |= 196608;
                z2 = z;
                if ((1572864 & i) == 0) {
                    if (l46Var.i(dd2Var)) {
                        i11 = 1048576;
                    } else {
                        i11 = 524288;
                    }
                    i3 |= i11;
                }
                i10 = i3;
                if ((599187 & i3) != 599186) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (l46Var.W(i10 & 1, z3)) {
                    if (i13 != 0) {
                        f9 = 20.0f;
                    } else {
                        f9 = f4;
                    }
                    if (i4 != 0) {
                        f10 = 20.0f;
                    } else {
                        f10 = f5;
                    }
                    if (i6 != 0) {
                        xiVar4 = ndb.Y;
                    } else {
                        xiVar4 = xiVar2;
                    }
                    if (i8 != 0) {
                        z2 = false;
                    }
                    if (z2) {
                        l46Var.f0(-548219291);
                        boolean zF4 = k8b.f((e8b) l46Var.k(l8b.a));
                        r10 = 0;
                        l46Var.r(false);
                        z5 = zF4;
                    } else {
                        r10 = 0;
                        l46Var.f0(185072400);
                        l46Var.r(false);
                        z5 = false;
                    }
                    if (z5) {
                        l46Var.f0(185092369);
                        j09 j09VarC4 = b.c(j09Var, 1.0f);
                        uc0 uc0Var4 = new uc0(f3, true, new qc0(r10));
                        int i113 = ((i10 >> 6) & 896) | ((i10 >> 9) & 7168);
                        c92 c92VarA4 = a92.a(uc0Var4, xiVar4, l46Var, (i113 >> 3) & 112);
                        int iHashCode4 = Long.hashCode(l46Var.T);
                        u8a u8aVarM4 = l46Var.m();
                        j09 j09VarJ4 = m93.J(l46Var, j09VarC4);
                        lf2.q.getClass();
                        l46Var.j0();
                        if (l46Var.S) {
                            l46Var.l(LayoutNode.h1);
                        } else {
                            l46Var.s0();
                        }
                        dec.l(hj6.z, l46Var, c92VarA4);
                        dec.l(hj6.y, l46Var, u8aVarM4);
                        dec.l(hj6.X, l46Var, Integer.valueOf(iHashCode4));
                        dec.k(l46Var);
                        dec.l(hj6.x, l46Var, j09VarJ4);
                        ks0.q(((i113 >> 6) & 112) | 6, dd2Var, e92.a, l46Var, true);
                        l46Var.r(false);
                        ojbVarV = l46Var.v();
                        if (ojbVarV != null) {
                            return;
                        }
                        final int i114 = 0;
                        final boolean z12 = z2;
                        l26Var = new l26() { // from class: fq1
                            @Override // defpackage.l26
                            public final Object z(Object obj, Object obj2) {
                                int i115 = i114;
                                wef wefVar = wef.a;
                                int i116 = i;
                                switch (i115) {
                                    case 0:
                                        ((Integer) obj2).getClass();
                                        int iP = k99.P(i116 | 1);
                                        uq1.l(j09Var, f9, f10, f3, xiVar4, z12, dd2Var, (l46) obj, iP, i2);
                                        break;
                                    default:
                                        ((Integer) obj2).getClass();
                                        int iP2 = k99.P(i116 | 1);
                                        uq1.l(j09Var, f9, f10, f3, xiVar4, z12, dd2Var, (l46) obj, iP2, i2);
                                        break;
                                }
                                return wefVar;
                            }
                        };
                    } else {
                        j09Var2 = j09Var;
                        float f110 = f9;
                        f6 = f3;
                        dd2Var2 = dd2Var;
                        boolean z13 = z2;
                        final float f111 = f10;
                        final xi xiVar8 = xiVar4;
                        l46Var.f0(185300906);
                        l46Var.r(r10);
                        pr4Var = l8b.a;
                        j = ((e8b) l46Var.k(pr4Var)).c;
                        if (if9.B(l46Var)) {
                            l46Var.f0(-548197909);
                            jC = ((e8b) l46Var.k(pr4Var)).f;
                            l46Var.r(false);
                        } else {
                            l46Var.f0(-548197111);
                            l46Var.r(false);
                            jC = abg.c(2063597567);
                        }
                        if (!we6.e(l46Var)) {
                            j = jC;
                        }
                        j2 = ((e8b) l46Var.k(pr4Var)).z;
                        j3 = ((e8b) l46Var.k(pr4Var)).d;
                        if (we6.e(l46Var)) {
                            j3 = j2;
                        }
                        bzd.d(b.c(j09Var2, 1.0f), a7c.b(f110), z5c.p(j, 0L, l46Var, 24576, 14), null, x57.b(j3, 0.5f), af1.b0(1985143846, new n26() { // from class: gq1
                            @Override // defpackage.n26
                            public final Object m(Object obj, Object obj2, Object obj3) {
                                l46 l46Var2 = (l46) obj2;
                                int iIntValue = ((Integer) obj3).intValue();
                                ((d92) obj).getClass();
                                if (l46Var2.W(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    j09 j09VarZ = ynb.Z(b.c(g09.a, 1.0f), f111);
                                    c92 c92VarA5 = a92.a(new uc0(f6, true, new qc0(0)), xiVar8, l46Var2, 0);
                                    int iHashCode5 = Long.hashCode(l46Var2.T);
                                    u8a u8aVarM5 = l46Var2.m();
                                    j09 j09VarJ5 = m93.J(l46Var2, j09VarZ);
                                    lf2.q.getClass();
                                    l46Var2.j0();
                                    if (l46Var2.S) {
                                        l46Var2.l(LayoutNode.h1);
                                    } else {
                                        l46Var2.s0();
                                    }
                                    dec.l(hj6.z, l46Var2, c92VarA5);
                                    dec.l(hj6.y, l46Var2, u8aVarM5);
                                    dec.l(hj6.X, l46Var2, Integer.valueOf(iHashCode5));
                                    dec.k(l46Var2);
                                    dec.l(hj6.x, l46Var2, j09VarJ5);
                                    ks0.q(6, dd2Var2, e92.a, l46Var2, true);
                                } else {
                                    l46Var2.Z();
                                }
                                return wef.a;
                            }
                        }, l46Var), l46Var, 196608, 8);
                        xiVar3 = xiVar8;
                        f7 = f110;
                        f8 = f111;
                        z4 = z13;
                    }
                    ojbVarV.d = l26Var;
                }
                j09Var2 = j09Var;
                f6 = f3;
                dd2Var2 = dd2Var;
                l46Var.Z();
                f7 = f4;
                f8 = f5;
                xiVar3 = xiVar2;
                z4 = z2;
                ojbVarV = l46Var.v();
                if (ojbVarV != null) {
                    final int i115 = 1;
                    final j09 j09Var6 = j09Var2;
                    final float f112 = f6;
                    final dd2 dd2Var6 = dd2Var2;
                    l26Var = new l26() { // from class: fq1
                        @Override // defpackage.l26
                        public final Object z(Object obj, Object obj2) {
                            int i116 = i115;
                            wef wefVar = wef.a;
                            int i117 = i;
                            switch (i116) {
                                case 0:
                                    ((Integer) obj2).getClass();
                                    int iP = k99.P(i117 | 1);
                                    uq1.l(j09Var6, f7, f8, f112, xiVar3, z4, dd2Var6, (l46) obj, iP, i2);
                                    break;
                                default:
                                    ((Integer) obj2).getClass();
                                    int iP2 = k99.P(i117 | 1);
                                    uq1.l(j09Var6, f7, f8, f112, xiVar3, z4, dd2Var6, (l46) obj, iP2, i2);
                                    break;
                            }
                            return wefVar;
                        }
                    };
                    ojbVarV.d = l26Var;
                }
            }
            i3 |= 384;
            f5 = f2;
            if ((i & 3072) == 0) {
                if (l46Var.d(f3)) {
                    i12 = 2048;
                } else {
                    i12 = UserMetadata.MAX_ATTRIBUTE_SIZE;
                }
                i3 |= i12;
            }
            i6 = i2 & 16;
            if (i6 != 0) {
                if ((i & 24576) == 0) {
                    xiVar2 = xiVar;
                    if (l46Var.g(xiVar2)) {
                        i7 = 16384;
                    } else {
                        i7 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
                    }
                    i3 |= i7;
                }
                i8 = i2 & 32;
                if (i8 != 0) {
                    if ((196608 & i) == 0) {
                        z2 = z;
                        if (l46Var.h(z2)) {
                            i9 = 131072;
                        } else {
                            i9 = 65536;
                        }
                        i3 |= i9;
                    }
                    if ((1572864 & i) == 0) {
                        if (l46Var.i(dd2Var)) {
                            i11 = 1048576;
                        } else {
                            i11 = 524288;
                        }
                        i3 |= i11;
                    }
                    i10 = i3;
                    if ((599187 & i3) != 599186) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (l46Var.W(i10 & 1, z3)) {
                        if (i13 != 0) {
                            f9 = 20.0f;
                        } else {
                            f9 = f4;
                        }
                        if (i4 != 0) {
                            f10 = 20.0f;
                        } else {
                            f10 = f5;
                        }
                        if (i6 != 0) {
                            xiVar4 = ndb.Y;
                        } else {
                            xiVar4 = xiVar2;
                        }
                        if (i8 != 0) {
                            z2 = false;
                        }
                        if (z2) {
                            l46Var.f0(-548219291);
                            boolean zF5 = k8b.f((e8b) l46Var.k(l8b.a));
                            r10 = 0;
                            l46Var.r(false);
                            z5 = zF5;
                        } else {
                            r10 = 0;
                            l46Var.f0(185072400);
                            l46Var.r(false);
                            z5 = false;
                        }
                        if (z5) {
                            l46Var.f0(185092369);
                            j09 j09VarC5 = b.c(j09Var, 1.0f);
                            uc0 uc0Var5 = new uc0(f3, true, new qc0(r10));
                            int i116 = ((i10 >> 6) & 896) | ((i10 >> 9) & 7168);
                            c92 c92VarA5 = a92.a(uc0Var5, xiVar4, l46Var, (i116 >> 3) & 112);
                            int iHashCode5 = Long.hashCode(l46Var.T);
                            u8a u8aVarM5 = l46Var.m();
                            j09 j09VarJ5 = m93.J(l46Var, j09VarC5);
                            lf2.q.getClass();
                            l46Var.j0();
                            if (l46Var.S) {
                                l46Var.l(LayoutNode.h1);
                            } else {
                                l46Var.s0();
                            }
                            dec.l(hj6.z, l46Var, c92VarA5);
                            dec.l(hj6.y, l46Var, u8aVarM5);
                            dec.l(hj6.X, l46Var, Integer.valueOf(iHashCode5));
                            dec.k(l46Var);
                            dec.l(hj6.x, l46Var, j09VarJ5);
                            ks0.q(((i116 >> 6) & 112) | 6, dd2Var, e92.a, l46Var, true);
                            l46Var.r(false);
                            ojbVarV = l46Var.v();
                            if (ojbVarV != null) {
                                return;
                            }
                            final int i117 = 0;
                            final boolean z14 = z2;
                            l26Var = new l26() { // from class: fq1
                                @Override // defpackage.l26
                                public final Object z(Object obj, Object obj2) {
                                    int i118 = i117;
                                    wef wefVar = wef.a;
                                    int i119 = i;
                                    switch (i118) {
                                        case 0:
                                            ((Integer) obj2).getClass();
                                            int iP = k99.P(i119 | 1);
                                            uq1.l(j09Var, f9, f10, f3, xiVar4, z14, dd2Var, (l46) obj, iP, i2);
                                            break;
                                        default:
                                            ((Integer) obj2).getClass();
                                            int iP2 = k99.P(i119 | 1);
                                            uq1.l(j09Var, f9, f10, f3, xiVar4, z14, dd2Var, (l46) obj, iP2, i2);
                                            break;
                                    }
                                    return wefVar;
                                }
                            };
                        } else {
                            j09Var2 = j09Var;
                            float f113 = f9;
                            f6 = f3;
                            dd2Var2 = dd2Var;
                            boolean z15 = z2;
                            final float f114 = f10;
                            final xi xiVar9 = xiVar4;
                            l46Var.f0(185300906);
                            l46Var.r(r10);
                            pr4Var = l8b.a;
                            j = ((e8b) l46Var.k(pr4Var)).c;
                            if (if9.B(l46Var)) {
                                l46Var.f0(-548197909);
                                jC = ((e8b) l46Var.k(pr4Var)).f;
                                l46Var.r(false);
                            } else {
                                l46Var.f0(-548197111);
                                l46Var.r(false);
                                jC = abg.c(2063597567);
                            }
                            if (!we6.e(l46Var)) {
                                j = jC;
                            }
                            j2 = ((e8b) l46Var.k(pr4Var)).z;
                            j3 = ((e8b) l46Var.k(pr4Var)).d;
                            if (we6.e(l46Var)) {
                                j3 = j2;
                            }
                            bzd.d(b.c(j09Var2, 1.0f), a7c.b(f113), z5c.p(j, 0L, l46Var, 24576, 14), null, x57.b(j3, 0.5f), af1.b0(1985143846, new n26() { // from class: gq1
                                @Override // defpackage.n26
                                public final Object m(Object obj, Object obj2, Object obj3) {
                                    l46 l46Var2 = (l46) obj2;
                                    int iIntValue = ((Integer) obj3).intValue();
                                    ((d92) obj).getClass();
                                    if (l46Var2.W(iIntValue & 1, (iIntValue & 17) != 16)) {
                                        j09 j09VarZ = ynb.Z(b.c(g09.a, 1.0f), f114);
                                        c92 c92VarA6 = a92.a(new uc0(f6, true, new qc0(0)), xiVar9, l46Var2, 0);
                                        int iHashCode6 = Long.hashCode(l46Var2.T);
                                        u8a u8aVarM6 = l46Var2.m();
                                        j09 j09VarJ6 = m93.J(l46Var2, j09VarZ);
                                        lf2.q.getClass();
                                        l46Var2.j0();
                                        if (l46Var2.S) {
                                            l46Var2.l(LayoutNode.h1);
                                        } else {
                                            l46Var2.s0();
                                        }
                                        dec.l(hj6.z, l46Var2, c92VarA6);
                                        dec.l(hj6.y, l46Var2, u8aVarM6);
                                        dec.l(hj6.X, l46Var2, Integer.valueOf(iHashCode6));
                                        dec.k(l46Var2);
                                        dec.l(hj6.x, l46Var2, j09VarJ6);
                                        ks0.q(6, dd2Var2, e92.a, l46Var2, true);
                                    } else {
                                        l46Var2.Z();
                                    }
                                    return wef.a;
                                }
                            }, l46Var), l46Var, 196608, 8);
                            xiVar3 = xiVar9;
                            f7 = f113;
                            f8 = f114;
                            z4 = z15;
                        }
                        ojbVarV.d = l26Var;
                    }
                    j09Var2 = j09Var;
                    f6 = f3;
                    dd2Var2 = dd2Var;
                    l46Var.Z();
                    f7 = f4;
                    f8 = f5;
                    xiVar3 = xiVar2;
                    z4 = z2;
                    ojbVarV = l46Var.v();
                    if (ojbVarV != null) {
                        final int i118 = 1;
                        final j09 j09Var7 = j09Var2;
                        final float f115 = f6;
                        final dd2 dd2Var7 = dd2Var2;
                        l26Var = new l26() { // from class: fq1
                            @Override // defpackage.l26
                            public final Object z(Object obj, Object obj2) {
                                int i119 = i118;
                                wef wefVar = wef.a;
                                int i1110 = i;
                                switch (i119) {
                                    case 0:
                                        ((Integer) obj2).getClass();
                                        int iP = k99.P(i1110 | 1);
                                        uq1.l(j09Var7, f7, f8, f115, xiVar3, z4, dd2Var7, (l46) obj, iP, i2);
                                        break;
                                    default:
                                        ((Integer) obj2).getClass();
                                        int iP2 = k99.P(i1110 | 1);
                                        uq1.l(j09Var7, f7, f8, f115, xiVar3, z4, dd2Var7, (l46) obj, iP2, i2);
                                        break;
                                }
                                return wefVar;
                            }
                        };
                        ojbVarV.d = l26Var;
                    }
                }
                i3 |= 196608;
                z2 = z;
                if ((1572864 & i) == 0) {
                    if (l46Var.i(dd2Var)) {
                        i11 = 1048576;
                    } else {
                        i11 = 524288;
                    }
                    i3 |= i11;
                }
                i10 = i3;
                if ((599187 & i3) != 599186) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (l46Var.W(i10 & 1, z3)) {
                    if (i13 != 0) {
                        f9 = 20.0f;
                    } else {
                        f9 = f4;
                    }
                    if (i4 != 0) {
                        f10 = 20.0f;
                    } else {
                        f10 = f5;
                    }
                    if (i6 != 0) {
                        xiVar4 = ndb.Y;
                    } else {
                        xiVar4 = xiVar2;
                    }
                    if (i8 != 0) {
                        z2 = false;
                    }
                    if (z2) {
                        l46Var.f0(-548219291);
                        boolean zF6 = k8b.f((e8b) l46Var.k(l8b.a));
                        r10 = 0;
                        l46Var.r(false);
                        z5 = zF6;
                    } else {
                        r10 = 0;
                        l46Var.f0(185072400);
                        l46Var.r(false);
                        z5 = false;
                    }
                    if (z5) {
                        l46Var.f0(185092369);
                        j09 j09VarC6 = b.c(j09Var, 1.0f);
                        uc0 uc0Var6 = new uc0(f3, true, new qc0(r10));
                        int i119 = ((i10 >> 6) & 896) | ((i10 >> 9) & 7168);
                        c92 c92VarA6 = a92.a(uc0Var6, xiVar4, l46Var, (i119 >> 3) & 112);
                        int iHashCode6 = Long.hashCode(l46Var.T);
                        u8a u8aVarM6 = l46Var.m();
                        j09 j09VarJ6 = m93.J(l46Var, j09VarC6);
                        lf2.q.getClass();
                        l46Var.j0();
                        if (l46Var.S) {
                            l46Var.l(LayoutNode.h1);
                        } else {
                            l46Var.s0();
                        }
                        dec.l(hj6.z, l46Var, c92VarA6);
                        dec.l(hj6.y, l46Var, u8aVarM6);
                        dec.l(hj6.X, l46Var, Integer.valueOf(iHashCode6));
                        dec.k(l46Var);
                        dec.l(hj6.x, l46Var, j09VarJ6);
                        ks0.q(((i119 >> 6) & 112) | 6, dd2Var, e92.a, l46Var, true);
                        l46Var.r(false);
                        ojbVarV = l46Var.v();
                        if (ojbVarV != null) {
                            return;
                        }
                        final int i1110 = 0;
                        final boolean z16 = z2;
                        l26Var = new l26() { // from class: fq1
                            @Override // defpackage.l26
                            public final Object z(Object obj, Object obj2) {
                                int i1111 = i1110;
                                wef wefVar = wef.a;
                                int i1112 = i;
                                switch (i1111) {
                                    case 0:
                                        ((Integer) obj2).getClass();
                                        int iP = k99.P(i1112 | 1);
                                        uq1.l(j09Var, f9, f10, f3, xiVar4, z16, dd2Var, (l46) obj, iP, i2);
                                        break;
                                    default:
                                        ((Integer) obj2).getClass();
                                        int iP2 = k99.P(i1112 | 1);
                                        uq1.l(j09Var, f9, f10, f3, xiVar4, z16, dd2Var, (l46) obj, iP2, i2);
                                        break;
                                }
                                return wefVar;
                            }
                        };
                    } else {
                        j09Var2 = j09Var;
                        float f116 = f9;
                        f6 = f3;
                        dd2Var2 = dd2Var;
                        boolean z17 = z2;
                        final float f117 = f10;
                        final xi xiVar10 = xiVar4;
                        l46Var.f0(185300906);
                        l46Var.r(r10);
                        pr4Var = l8b.a;
                        j = ((e8b) l46Var.k(pr4Var)).c;
                        if (if9.B(l46Var)) {
                            l46Var.f0(-548197909);
                            jC = ((e8b) l46Var.k(pr4Var)).f;
                            l46Var.r(false);
                        } else {
                            l46Var.f0(-548197111);
                            l46Var.r(false);
                            jC = abg.c(2063597567);
                        }
                        if (!we6.e(l46Var)) {
                            j = jC;
                        }
                        j2 = ((e8b) l46Var.k(pr4Var)).z;
                        j3 = ((e8b) l46Var.k(pr4Var)).d;
                        if (we6.e(l46Var)) {
                            j3 = j2;
                        }
                        bzd.d(b.c(j09Var2, 1.0f), a7c.b(f116), z5c.p(j, 0L, l46Var, 24576, 14), null, x57.b(j3, 0.5f), af1.b0(1985143846, new n26() { // from class: gq1
                            @Override // defpackage.n26
                            public final Object m(Object obj, Object obj2, Object obj3) {
                                l46 l46Var2 = (l46) obj2;
                                int iIntValue = ((Integer) obj3).intValue();
                                ((d92) obj).getClass();
                                if (l46Var2.W(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    j09 j09VarZ = ynb.Z(b.c(g09.a, 1.0f), f117);
                                    c92 c92VarA7 = a92.a(new uc0(f6, true, new qc0(0)), xiVar10, l46Var2, 0);
                                    int iHashCode7 = Long.hashCode(l46Var2.T);
                                    u8a u8aVarM7 = l46Var2.m();
                                    j09 j09VarJ7 = m93.J(l46Var2, j09VarZ);
                                    lf2.q.getClass();
                                    l46Var2.j0();
                                    if (l46Var2.S) {
                                        l46Var2.l(LayoutNode.h1);
                                    } else {
                                        l46Var2.s0();
                                    }
                                    dec.l(hj6.z, l46Var2, c92VarA7);
                                    dec.l(hj6.y, l46Var2, u8aVarM7);
                                    dec.l(hj6.X, l46Var2, Integer.valueOf(iHashCode7));
                                    dec.k(l46Var2);
                                    dec.l(hj6.x, l46Var2, j09VarJ7);
                                    ks0.q(6, dd2Var2, e92.a, l46Var2, true);
                                } else {
                                    l46Var2.Z();
                                }
                                return wef.a;
                            }
                        }, l46Var), l46Var, 196608, 8);
                        xiVar3 = xiVar10;
                        f7 = f116;
                        f8 = f117;
                        z4 = z17;
                    }
                    ojbVarV.d = l26Var;
                }
                j09Var2 = j09Var;
                f6 = f3;
                dd2Var2 = dd2Var;
                l46Var.Z();
                f7 = f4;
                f8 = f5;
                xiVar3 = xiVar2;
                z4 = z2;
                ojbVarV = l46Var.v();
                if (ojbVarV != null) {
                    final int i1111 = 1;
                    final j09 j09Var8 = j09Var2;
                    final float f118 = f6;
                    final dd2 dd2Var8 = dd2Var2;
                    l26Var = new l26() { // from class: fq1
                        @Override // defpackage.l26
                        public final Object z(Object obj, Object obj2) {
                            int i1112 = i1111;
                            wef wefVar = wef.a;
                            int i1113 = i;
                            switch (i1112) {
                                case 0:
                                    ((Integer) obj2).getClass();
                                    int iP = k99.P(i1113 | 1);
                                    uq1.l(j09Var8, f7, f8, f118, xiVar3, z4, dd2Var8, (l46) obj, iP, i2);
                                    break;
                                default:
                                    ((Integer) obj2).getClass();
                                    int iP2 = k99.P(i1113 | 1);
                                    uq1.l(j09Var8, f7, f8, f118, xiVar3, z4, dd2Var8, (l46) obj, iP2, i2);
                                    break;
                            }
                            return wefVar;
                        }
                    };
                    ojbVarV.d = l26Var;
                }
            }
            i3 |= 24576;
            xiVar2 = xiVar;
            i8 = i2 & 32;
            if (i8 != 0) {
                if ((196608 & i) == 0) {
                    z2 = z;
                    if (l46Var.h(z2)) {
                        i9 = 131072;
                    } else {
                        i9 = 65536;
                    }
                    i3 |= i9;
                }
                if ((1572864 & i) == 0) {
                    if (l46Var.i(dd2Var)) {
                        i11 = 1048576;
                    } else {
                        i11 = 524288;
                    }
                    i3 |= i11;
                }
                i10 = i3;
                if ((599187 & i3) != 599186) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (l46Var.W(i10 & 1, z3)) {
                    if (i13 != 0) {
                        f9 = 20.0f;
                    } else {
                        f9 = f4;
                    }
                    if (i4 != 0) {
                        f10 = 20.0f;
                    } else {
                        f10 = f5;
                    }
                    if (i6 != 0) {
                        xiVar4 = ndb.Y;
                    } else {
                        xiVar4 = xiVar2;
                    }
                    if (i8 != 0) {
                        z2 = false;
                    }
                    if (z2) {
                        l46Var.f0(-548219291);
                        boolean zF7 = k8b.f((e8b) l46Var.k(l8b.a));
                        r10 = 0;
                        l46Var.r(false);
                        z5 = zF7;
                    } else {
                        r10 = 0;
                        l46Var.f0(185072400);
                        l46Var.r(false);
                        z5 = false;
                    }
                    if (z5) {
                        l46Var.f0(185092369);
                        j09 j09VarC7 = b.c(j09Var, 1.0f);
                        uc0 uc0Var7 = new uc0(f3, true, new qc0(r10));
                        int i1112 = ((i10 >> 6) & 896) | ((i10 >> 9) & 7168);
                        c92 c92VarA7 = a92.a(uc0Var7, xiVar4, l46Var, (i1112 >> 3) & 112);
                        int iHashCode7 = Long.hashCode(l46Var.T);
                        u8a u8aVarM7 = l46Var.m();
                        j09 j09VarJ7 = m93.J(l46Var, j09VarC7);
                        lf2.q.getClass();
                        l46Var.j0();
                        if (l46Var.S) {
                            l46Var.l(LayoutNode.h1);
                        } else {
                            l46Var.s0();
                        }
                        dec.l(hj6.z, l46Var, c92VarA7);
                        dec.l(hj6.y, l46Var, u8aVarM7);
                        dec.l(hj6.X, l46Var, Integer.valueOf(iHashCode7));
                        dec.k(l46Var);
                        dec.l(hj6.x, l46Var, j09VarJ7);
                        ks0.q(((i1112 >> 6) & 112) | 6, dd2Var, e92.a, l46Var, true);
                        l46Var.r(false);
                        ojbVarV = l46Var.v();
                        if (ojbVarV != null) {
                            return;
                        }
                        final int i1113 = 0;
                        final boolean z18 = z2;
                        l26Var = new l26() { // from class: fq1
                            @Override // defpackage.l26
                            public final Object z(Object obj, Object obj2) {
                                int i1114 = i1113;
                                wef wefVar = wef.a;
                                int i1115 = i;
                                switch (i1114) {
                                    case 0:
                                        ((Integer) obj2).getClass();
                                        int iP = k99.P(i1115 | 1);
                                        uq1.l(j09Var, f9, f10, f3, xiVar4, z18, dd2Var, (l46) obj, iP, i2);
                                        break;
                                    default:
                                        ((Integer) obj2).getClass();
                                        int iP2 = k99.P(i1115 | 1);
                                        uq1.l(j09Var, f9, f10, f3, xiVar4, z18, dd2Var, (l46) obj, iP2, i2);
                                        break;
                                }
                                return wefVar;
                            }
                        };
                    } else {
                        j09Var2 = j09Var;
                        float f119 = f9;
                        f6 = f3;
                        dd2Var2 = dd2Var;
                        boolean z19 = z2;
                        final float f1110 = f10;
                        final xi xiVar11 = xiVar4;
                        l46Var.f0(185300906);
                        l46Var.r(r10);
                        pr4Var = l8b.a;
                        j = ((e8b) l46Var.k(pr4Var)).c;
                        if (if9.B(l46Var)) {
                            l46Var.f0(-548197909);
                            jC = ((e8b) l46Var.k(pr4Var)).f;
                            l46Var.r(false);
                        } else {
                            l46Var.f0(-548197111);
                            l46Var.r(false);
                            jC = abg.c(2063597567);
                        }
                        if (!we6.e(l46Var)) {
                            j = jC;
                        }
                        j2 = ((e8b) l46Var.k(pr4Var)).z;
                        j3 = ((e8b) l46Var.k(pr4Var)).d;
                        if (we6.e(l46Var)) {
                            j3 = j2;
                        }
                        bzd.d(b.c(j09Var2, 1.0f), a7c.b(f119), z5c.p(j, 0L, l46Var, 24576, 14), null, x57.b(j3, 0.5f), af1.b0(1985143846, new n26() { // from class: gq1
                            @Override // defpackage.n26
                            public final Object m(Object obj, Object obj2, Object obj3) {
                                l46 l46Var2 = (l46) obj2;
                                int iIntValue = ((Integer) obj3).intValue();
                                ((d92) obj).getClass();
                                if (l46Var2.W(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    j09 j09VarZ = ynb.Z(b.c(g09.a, 1.0f), f1110);
                                    c92 c92VarA8 = a92.a(new uc0(f6, true, new qc0(0)), xiVar11, l46Var2, 0);
                                    int iHashCode8 = Long.hashCode(l46Var2.T);
                                    u8a u8aVarM8 = l46Var2.m();
                                    j09 j09VarJ8 = m93.J(l46Var2, j09VarZ);
                                    lf2.q.getClass();
                                    l46Var2.j0();
                                    if (l46Var2.S) {
                                        l46Var2.l(LayoutNode.h1);
                                    } else {
                                        l46Var2.s0();
                                    }
                                    dec.l(hj6.z, l46Var2, c92VarA8);
                                    dec.l(hj6.y, l46Var2, u8aVarM8);
                                    dec.l(hj6.X, l46Var2, Integer.valueOf(iHashCode8));
                                    dec.k(l46Var2);
                                    dec.l(hj6.x, l46Var2, j09VarJ8);
                                    ks0.q(6, dd2Var2, e92.a, l46Var2, true);
                                } else {
                                    l46Var2.Z();
                                }
                                return wef.a;
                            }
                        }, l46Var), l46Var, 196608, 8);
                        xiVar3 = xiVar11;
                        f7 = f119;
                        f8 = f1110;
                        z4 = z19;
                    }
                    ojbVarV.d = l26Var;
                }
                j09Var2 = j09Var;
                f6 = f3;
                dd2Var2 = dd2Var;
                l46Var.Z();
                f7 = f4;
                f8 = f5;
                xiVar3 = xiVar2;
                z4 = z2;
                ojbVarV = l46Var.v();
                if (ojbVarV != null) {
                    final int i1114 = 1;
                    final j09 j09Var9 = j09Var2;
                    final float f1111 = f6;
                    final dd2 dd2Var9 = dd2Var2;
                    l26Var = new l26() { // from class: fq1
                        @Override // defpackage.l26
                        public final Object z(Object obj, Object obj2) {
                            int i1115 = i1114;
                            wef wefVar = wef.a;
                            int i1116 = i;
                            switch (i1115) {
                                case 0:
                                    ((Integer) obj2).getClass();
                                    int iP = k99.P(i1116 | 1);
                                    uq1.l(j09Var9, f7, f8, f1111, xiVar3, z4, dd2Var9, (l46) obj, iP, i2);
                                    break;
                                default:
                                    ((Integer) obj2).getClass();
                                    int iP2 = k99.P(i1116 | 1);
                                    uq1.l(j09Var9, f7, f8, f1111, xiVar3, z4, dd2Var9, (l46) obj, iP2, i2);
                                    break;
                            }
                            return wefVar;
                        }
                    };
                    ojbVarV.d = l26Var;
                }
            }
            i3 |= 196608;
            z2 = z;
            if ((1572864 & i) == 0) {
                if (l46Var.i(dd2Var)) {
                    i11 = 1048576;
                } else {
                    i11 = 524288;
                }
                i3 |= i11;
            }
            i10 = i3;
            if ((599187 & i3) != 599186) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (l46Var.W(i10 & 1, z3)) {
                if (i13 != 0) {
                    f9 = 20.0f;
                } else {
                    f9 = f4;
                }
                if (i4 != 0) {
                    f10 = 20.0f;
                } else {
                    f10 = f5;
                }
                if (i6 != 0) {
                    xiVar4 = ndb.Y;
                } else {
                    xiVar4 = xiVar2;
                }
                if (i8 != 0) {
                    z2 = false;
                }
                if (z2) {
                    l46Var.f0(-548219291);
                    boolean zF8 = k8b.f((e8b) l46Var.k(l8b.a));
                    r10 = 0;
                    l46Var.r(false);
                    z5 = zF8;
                } else {
                    r10 = 0;
                    l46Var.f0(185072400);
                    l46Var.r(false);
                    z5 = false;
                }
                if (z5) {
                    l46Var.f0(185092369);
                    j09 j09VarC8 = b.c(j09Var, 1.0f);
                    uc0 uc0Var8 = new uc0(f3, true, new qc0(r10));
                    int i1115 = ((i10 >> 6) & 896) | ((i10 >> 9) & 7168);
                    c92 c92VarA8 = a92.a(uc0Var8, xiVar4, l46Var, (i1115 >> 3) & 112);
                    int iHashCode8 = Long.hashCode(l46Var.T);
                    u8a u8aVarM8 = l46Var.m();
                    j09 j09VarJ8 = m93.J(l46Var, j09VarC8);
                    lf2.q.getClass();
                    l46Var.j0();
                    if (l46Var.S) {
                        l46Var.l(LayoutNode.h1);
                    } else {
                        l46Var.s0();
                    }
                    dec.l(hj6.z, l46Var, c92VarA8);
                    dec.l(hj6.y, l46Var, u8aVarM8);
                    dec.l(hj6.X, l46Var, Integer.valueOf(iHashCode8));
                    dec.k(l46Var);
                    dec.l(hj6.x, l46Var, j09VarJ8);
                    ks0.q(((i1115 >> 6) & 112) | 6, dd2Var, e92.a, l46Var, true);
                    l46Var.r(false);
                    ojbVarV = l46Var.v();
                    if (ojbVarV != null) {
                        return;
                    }
                    final int i1116 = 0;
                    final boolean z110 = z2;
                    l26Var = new l26() { // from class: fq1
                        @Override // defpackage.l26
                        public final Object z(Object obj, Object obj2) {
                            int i1117 = i1116;
                            wef wefVar = wef.a;
                            int i1118 = i;
                            switch (i1117) {
                                case 0:
                                    ((Integer) obj2).getClass();
                                    int iP = k99.P(i1118 | 1);
                                    uq1.l(j09Var, f9, f10, f3, xiVar4, z110, dd2Var, (l46) obj, iP, i2);
                                    break;
                                default:
                                    ((Integer) obj2).getClass();
                                    int iP2 = k99.P(i1118 | 1);
                                    uq1.l(j09Var, f9, f10, f3, xiVar4, z110, dd2Var, (l46) obj, iP2, i2);
                                    break;
                            }
                            return wefVar;
                        }
                    };
                } else {
                    j09Var2 = j09Var;
                    float f1112 = f9;
                    f6 = f3;
                    dd2Var2 = dd2Var;
                    boolean z111 = z2;
                    final float f1113 = f10;
                    final xi xiVar12 = xiVar4;
                    l46Var.f0(185300906);
                    l46Var.r(r10);
                    pr4Var = l8b.a;
                    j = ((e8b) l46Var.k(pr4Var)).c;
                    if (if9.B(l46Var)) {
                        l46Var.f0(-548197909);
                        jC = ((e8b) l46Var.k(pr4Var)).f;
                        l46Var.r(false);
                    } else {
                        l46Var.f0(-548197111);
                        l46Var.r(false);
                        jC = abg.c(2063597567);
                    }
                    if (!we6.e(l46Var)) {
                        j = jC;
                    }
                    j2 = ((e8b) l46Var.k(pr4Var)).z;
                    j3 = ((e8b) l46Var.k(pr4Var)).d;
                    if (we6.e(l46Var)) {
                        j3 = j2;
                    }
                    bzd.d(b.c(j09Var2, 1.0f), a7c.b(f1112), z5c.p(j, 0L, l46Var, 24576, 14), null, x57.b(j3, 0.5f), af1.b0(1985143846, new n26() { // from class: gq1
                        @Override // defpackage.n26
                        public final Object m(Object obj, Object obj2, Object obj3) {
                            l46 l46Var2 = (l46) obj2;
                            int iIntValue = ((Integer) obj3).intValue();
                            ((d92) obj).getClass();
                            if (l46Var2.W(iIntValue & 1, (iIntValue & 17) != 16)) {
                                j09 j09VarZ = ynb.Z(b.c(g09.a, 1.0f), f1113);
                                c92 c92VarA9 = a92.a(new uc0(f6, true, new qc0(0)), xiVar12, l46Var2, 0);
                                int iHashCode9 = Long.hashCode(l46Var2.T);
                                u8a u8aVarM9 = l46Var2.m();
                                j09 j09VarJ9 = m93.J(l46Var2, j09VarZ);
                                lf2.q.getClass();
                                l46Var2.j0();
                                if (l46Var2.S) {
                                    l46Var2.l(LayoutNode.h1);
                                } else {
                                    l46Var2.s0();
                                }
                                dec.l(hj6.z, l46Var2, c92VarA9);
                                dec.l(hj6.y, l46Var2, u8aVarM9);
                                dec.l(hj6.X, l46Var2, Integer.valueOf(iHashCode9));
                                dec.k(l46Var2);
                                dec.l(hj6.x, l46Var2, j09VarJ9);
                                ks0.q(6, dd2Var2, e92.a, l46Var2, true);
                            } else {
                                l46Var2.Z();
                            }
                            return wef.a;
                        }
                    }, l46Var), l46Var, 196608, 8);
                    xiVar3 = xiVar12;
                    f7 = f1112;
                    f8 = f1113;
                    z4 = z111;
                }
                ojbVarV.d = l26Var;
            }
            j09Var2 = j09Var;
            f6 = f3;
            dd2Var2 = dd2Var;
            l46Var.Z();
            f7 = f4;
            f8 = f5;
            xiVar3 = xiVar2;
            z4 = z2;
            ojbVarV = l46Var.v();
            if (ojbVarV != null) {
                final int i1117 = 1;
                final j09 j09Var10 = j09Var2;
                final float f1114 = f6;
                final dd2 dd2Var10 = dd2Var2;
                l26Var = new l26() { // from class: fq1
                    @Override // defpackage.l26
                    public final Object z(Object obj, Object obj2) {
                        int i1118 = i1117;
                        wef wefVar = wef.a;
                        int i1119 = i;
                        switch (i1118) {
                            case 0:
                                ((Integer) obj2).getClass();
                                int iP = k99.P(i1119 | 1);
                                uq1.l(j09Var10, f7, f8, f1114, xiVar3, z4, dd2Var10, (l46) obj, iP, i2);
                                break;
                            default:
                                ((Integer) obj2).getClass();
                                int iP2 = k99.P(i1119 | 1);
                                uq1.l(j09Var10, f7, f8, f1114, xiVar3, z4, dd2Var10, (l46) obj, iP2, i2);
                                break;
                        }
                        return wefVar;
                    }
                };
                ojbVarV.d = l26Var;
            }
        }
        i3 |= 48;
        f4 = f;
        i4 = i2 & 4;
        if (i4 != 0) {
            if ((i & 384) == 0) {
                f5 = f2;
                if (l46Var.d(f5)) {
                    i5 = 256;
                } else {
                    i5 = UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
                }
                i3 |= i5;
            }
            if ((i & 3072) == 0) {
                if (l46Var.d(f3)) {
                    i12 = 2048;
                } else {
                    i12 = UserMetadata.MAX_ATTRIBUTE_SIZE;
                }
                i3 |= i12;
            }
            i6 = i2 & 16;
            if (i6 != 0) {
                if ((i & 24576) == 0) {
                    xiVar2 = xiVar;
                    if (l46Var.g(xiVar2)) {
                        i7 = 16384;
                    } else {
                        i7 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
                    }
                    i3 |= i7;
                }
                i8 = i2 & 32;
                if (i8 != 0) {
                    if ((196608 & i) == 0) {
                        z2 = z;
                        if (l46Var.h(z2)) {
                            i9 = 131072;
                        } else {
                            i9 = 65536;
                        }
                        i3 |= i9;
                    }
                    if ((1572864 & i) == 0) {
                        if (l46Var.i(dd2Var)) {
                            i11 = 1048576;
                        } else {
                            i11 = 524288;
                        }
                        i3 |= i11;
                    }
                    i10 = i3;
                    if ((599187 & i3) != 599186) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (l46Var.W(i10 & 1, z3)) {
                        if (i13 != 0) {
                            f9 = 20.0f;
                        } else {
                            f9 = f4;
                        }
                        if (i4 != 0) {
                            f10 = 20.0f;
                        } else {
                            f10 = f5;
                        }
                        if (i6 != 0) {
                            xiVar4 = ndb.Y;
                        } else {
                            xiVar4 = xiVar2;
                        }
                        if (i8 != 0) {
                            z2 = false;
                        }
                        if (z2) {
                            l46Var.f0(-548219291);
                            boolean zF9 = k8b.f((e8b) l46Var.k(l8b.a));
                            r10 = 0;
                            l46Var.r(false);
                            z5 = zF9;
                        } else {
                            r10 = 0;
                            l46Var.f0(185072400);
                            l46Var.r(false);
                            z5 = false;
                        }
                        if (z5) {
                            l46Var.f0(185092369);
                            j09 j09VarC9 = b.c(j09Var, 1.0f);
                            uc0 uc0Var9 = new uc0(f3, true, new qc0(r10));
                            int i1118 = ((i10 >> 6) & 896) | ((i10 >> 9) & 7168);
                            c92 c92VarA9 = a92.a(uc0Var9, xiVar4, l46Var, (i1118 >> 3) & 112);
                            int iHashCode9 = Long.hashCode(l46Var.T);
                            u8a u8aVarM9 = l46Var.m();
                            j09 j09VarJ9 = m93.J(l46Var, j09VarC9);
                            lf2.q.getClass();
                            l46Var.j0();
                            if (l46Var.S) {
                                l46Var.l(LayoutNode.h1);
                            } else {
                                l46Var.s0();
                            }
                            dec.l(hj6.z, l46Var, c92VarA9);
                            dec.l(hj6.y, l46Var, u8aVarM9);
                            dec.l(hj6.X, l46Var, Integer.valueOf(iHashCode9));
                            dec.k(l46Var);
                            dec.l(hj6.x, l46Var, j09VarJ9);
                            ks0.q(((i1118 >> 6) & 112) | 6, dd2Var, e92.a, l46Var, true);
                            l46Var.r(false);
                            ojbVarV = l46Var.v();
                            if (ojbVarV != null) {
                                return;
                            }
                            final int i1119 = 0;
                            final boolean z112 = z2;
                            l26Var = new l26() { // from class: fq1
                                @Override // defpackage.l26
                                public final Object z(Object obj, Object obj2) {
                                    int i11110 = i1119;
                                    wef wefVar = wef.a;
                                    int i11111 = i;
                                    switch (i11110) {
                                        case 0:
                                            ((Integer) obj2).getClass();
                                            int iP = k99.P(i11111 | 1);
                                            uq1.l(j09Var, f9, f10, f3, xiVar4, z112, dd2Var, (l46) obj, iP, i2);
                                            break;
                                        default:
                                            ((Integer) obj2).getClass();
                                            int iP2 = k99.P(i11111 | 1);
                                            uq1.l(j09Var, f9, f10, f3, xiVar4, z112, dd2Var, (l46) obj, iP2, i2);
                                            break;
                                    }
                                    return wefVar;
                                }
                            };
                        } else {
                            j09Var2 = j09Var;
                            float f1115 = f9;
                            f6 = f3;
                            dd2Var2 = dd2Var;
                            boolean z113 = z2;
                            final float f1116 = f10;
                            final xi xiVar13 = xiVar4;
                            l46Var.f0(185300906);
                            l46Var.r(r10);
                            pr4Var = l8b.a;
                            j = ((e8b) l46Var.k(pr4Var)).c;
                            if (if9.B(l46Var)) {
                                l46Var.f0(-548197909);
                                jC = ((e8b) l46Var.k(pr4Var)).f;
                                l46Var.r(false);
                            } else {
                                l46Var.f0(-548197111);
                                l46Var.r(false);
                                jC = abg.c(2063597567);
                            }
                            if (!we6.e(l46Var)) {
                                j = jC;
                            }
                            j2 = ((e8b) l46Var.k(pr4Var)).z;
                            j3 = ((e8b) l46Var.k(pr4Var)).d;
                            if (we6.e(l46Var)) {
                                j3 = j2;
                            }
                            bzd.d(b.c(j09Var2, 1.0f), a7c.b(f1115), z5c.p(j, 0L, l46Var, 24576, 14), null, x57.b(j3, 0.5f), af1.b0(1985143846, new n26() { // from class: gq1
                                @Override // defpackage.n26
                                public final Object m(Object obj, Object obj2, Object obj3) {
                                    l46 l46Var2 = (l46) obj2;
                                    int iIntValue = ((Integer) obj3).intValue();
                                    ((d92) obj).getClass();
                                    if (l46Var2.W(iIntValue & 1, (iIntValue & 17) != 16)) {
                                        j09 j09VarZ = ynb.Z(b.c(g09.a, 1.0f), f1116);
                                        c92 c92VarA10 = a92.a(new uc0(f6, true, new qc0(0)), xiVar13, l46Var2, 0);
                                        int iHashCode10 = Long.hashCode(l46Var2.T);
                                        u8a u8aVarM10 = l46Var2.m();
                                        j09 j09VarJ10 = m93.J(l46Var2, j09VarZ);
                                        lf2.q.getClass();
                                        l46Var2.j0();
                                        if (l46Var2.S) {
                                            l46Var2.l(LayoutNode.h1);
                                        } else {
                                            l46Var2.s0();
                                        }
                                        dec.l(hj6.z, l46Var2, c92VarA10);
                                        dec.l(hj6.y, l46Var2, u8aVarM10);
                                        dec.l(hj6.X, l46Var2, Integer.valueOf(iHashCode10));
                                        dec.k(l46Var2);
                                        dec.l(hj6.x, l46Var2, j09VarJ10);
                                        ks0.q(6, dd2Var2, e92.a, l46Var2, true);
                                    } else {
                                        l46Var2.Z();
                                    }
                                    return wef.a;
                                }
                            }, l46Var), l46Var, 196608, 8);
                            xiVar3 = xiVar13;
                            f7 = f1115;
                            f8 = f1116;
                            z4 = z113;
                        }
                        ojbVarV.d = l26Var;
                    }
                    j09Var2 = j09Var;
                    f6 = f3;
                    dd2Var2 = dd2Var;
                    l46Var.Z();
                    f7 = f4;
                    f8 = f5;
                    xiVar3 = xiVar2;
                    z4 = z2;
                    ojbVarV = l46Var.v();
                    if (ojbVarV != null) {
                        final int i11110 = 1;
                        final j09 j09Var11 = j09Var2;
                        final float f1117 = f6;
                        final dd2 dd2Var11 = dd2Var2;
                        l26Var = new l26() { // from class: fq1
                            @Override // defpackage.l26
                            public final Object z(Object obj, Object obj2) {
                                int i11111 = i11110;
                                wef wefVar = wef.a;
                                int i11112 = i;
                                switch (i11111) {
                                    case 0:
                                        ((Integer) obj2).getClass();
                                        int iP = k99.P(i11112 | 1);
                                        uq1.l(j09Var11, f7, f8, f1117, xiVar3, z4, dd2Var11, (l46) obj, iP, i2);
                                        break;
                                    default:
                                        ((Integer) obj2).getClass();
                                        int iP2 = k99.P(i11112 | 1);
                                        uq1.l(j09Var11, f7, f8, f1117, xiVar3, z4, dd2Var11, (l46) obj, iP2, i2);
                                        break;
                                }
                                return wefVar;
                            }
                        };
                        ojbVarV.d = l26Var;
                    }
                }
                i3 |= 196608;
                z2 = z;
                if ((1572864 & i) == 0) {
                    if (l46Var.i(dd2Var)) {
                        i11 = 1048576;
                    } else {
                        i11 = 524288;
                    }
                    i3 |= i11;
                }
                i10 = i3;
                if ((599187 & i3) != 599186) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (l46Var.W(i10 & 1, z3)) {
                    if (i13 != 0) {
                        f9 = 20.0f;
                    } else {
                        f9 = f4;
                    }
                    if (i4 != 0) {
                        f10 = 20.0f;
                    } else {
                        f10 = f5;
                    }
                    if (i6 != 0) {
                        xiVar4 = ndb.Y;
                    } else {
                        xiVar4 = xiVar2;
                    }
                    if (i8 != 0) {
                        z2 = false;
                    }
                    if (z2) {
                        l46Var.f0(-548219291);
                        boolean zF10 = k8b.f((e8b) l46Var.k(l8b.a));
                        r10 = 0;
                        l46Var.r(false);
                        z5 = zF10;
                    } else {
                        r10 = 0;
                        l46Var.f0(185072400);
                        l46Var.r(false);
                        z5 = false;
                    }
                    if (z5) {
                        l46Var.f0(185092369);
                        j09 j09VarC10 = b.c(j09Var, 1.0f);
                        uc0 uc0Var10 = new uc0(f3, true, new qc0(r10));
                        int i11111 = ((i10 >> 6) & 896) | ((i10 >> 9) & 7168);
                        c92 c92VarA10 = a92.a(uc0Var10, xiVar4, l46Var, (i11111 >> 3) & 112);
                        int iHashCode10 = Long.hashCode(l46Var.T);
                        u8a u8aVarM10 = l46Var.m();
                        j09 j09VarJ10 = m93.J(l46Var, j09VarC10);
                        lf2.q.getClass();
                        l46Var.j0();
                        if (l46Var.S) {
                            l46Var.l(LayoutNode.h1);
                        } else {
                            l46Var.s0();
                        }
                        dec.l(hj6.z, l46Var, c92VarA10);
                        dec.l(hj6.y, l46Var, u8aVarM10);
                        dec.l(hj6.X, l46Var, Integer.valueOf(iHashCode10));
                        dec.k(l46Var);
                        dec.l(hj6.x, l46Var, j09VarJ10);
                        ks0.q(((i11111 >> 6) & 112) | 6, dd2Var, e92.a, l46Var, true);
                        l46Var.r(false);
                        ojbVarV = l46Var.v();
                        if (ojbVarV != null) {
                            return;
                        }
                        final int i11112 = 0;
                        final boolean z114 = z2;
                        l26Var = new l26() { // from class: fq1
                            @Override // defpackage.l26
                            public final Object z(Object obj, Object obj2) {
                                int i11113 = i11112;
                                wef wefVar = wef.a;
                                int i11114 = i;
                                switch (i11113) {
                                    case 0:
                                        ((Integer) obj2).getClass();
                                        int iP = k99.P(i11114 | 1);
                                        uq1.l(j09Var, f9, f10, f3, xiVar4, z114, dd2Var, (l46) obj, iP, i2);
                                        break;
                                    default:
                                        ((Integer) obj2).getClass();
                                        int iP2 = k99.P(i11114 | 1);
                                        uq1.l(j09Var, f9, f10, f3, xiVar4, z114, dd2Var, (l46) obj, iP2, i2);
                                        break;
                                }
                                return wefVar;
                            }
                        };
                    } else {
                        j09Var2 = j09Var;
                        float f1118 = f9;
                        f6 = f3;
                        dd2Var2 = dd2Var;
                        boolean z115 = z2;
                        final float f1119 = f10;
                        final xi xiVar14 = xiVar4;
                        l46Var.f0(185300906);
                        l46Var.r(r10);
                        pr4Var = l8b.a;
                        j = ((e8b) l46Var.k(pr4Var)).c;
                        if (if9.B(l46Var)) {
                            l46Var.f0(-548197909);
                            jC = ((e8b) l46Var.k(pr4Var)).f;
                            l46Var.r(false);
                        } else {
                            l46Var.f0(-548197111);
                            l46Var.r(false);
                            jC = abg.c(2063597567);
                        }
                        if (!we6.e(l46Var)) {
                            j = jC;
                        }
                        j2 = ((e8b) l46Var.k(pr4Var)).z;
                        j3 = ((e8b) l46Var.k(pr4Var)).d;
                        if (we6.e(l46Var)) {
                            j3 = j2;
                        }
                        bzd.d(b.c(j09Var2, 1.0f), a7c.b(f1118), z5c.p(j, 0L, l46Var, 24576, 14), null, x57.b(j3, 0.5f), af1.b0(1985143846, new n26() { // from class: gq1
                            @Override // defpackage.n26
                            public final Object m(Object obj, Object obj2, Object obj3) {
                                l46 l46Var2 = (l46) obj2;
                                int iIntValue = ((Integer) obj3).intValue();
                                ((d92) obj).getClass();
                                if (l46Var2.W(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    j09 j09VarZ = ynb.Z(b.c(g09.a, 1.0f), f1119);
                                    c92 c92VarA11 = a92.a(new uc0(f6, true, new qc0(0)), xiVar14, l46Var2, 0);
                                    int iHashCode11 = Long.hashCode(l46Var2.T);
                                    u8a u8aVarM11 = l46Var2.m();
                                    j09 j09VarJ11 = m93.J(l46Var2, j09VarZ);
                                    lf2.q.getClass();
                                    l46Var2.j0();
                                    if (l46Var2.S) {
                                        l46Var2.l(LayoutNode.h1);
                                    } else {
                                        l46Var2.s0();
                                    }
                                    dec.l(hj6.z, l46Var2, c92VarA11);
                                    dec.l(hj6.y, l46Var2, u8aVarM11);
                                    dec.l(hj6.X, l46Var2, Integer.valueOf(iHashCode11));
                                    dec.k(l46Var2);
                                    dec.l(hj6.x, l46Var2, j09VarJ11);
                                    ks0.q(6, dd2Var2, e92.a, l46Var2, true);
                                } else {
                                    l46Var2.Z();
                                }
                                return wef.a;
                            }
                        }, l46Var), l46Var, 196608, 8);
                        xiVar3 = xiVar14;
                        f7 = f1118;
                        f8 = f1119;
                        z4 = z115;
                    }
                    ojbVarV.d = l26Var;
                }
                j09Var2 = j09Var;
                f6 = f3;
                dd2Var2 = dd2Var;
                l46Var.Z();
                f7 = f4;
                f8 = f5;
                xiVar3 = xiVar2;
                z4 = z2;
                ojbVarV = l46Var.v();
                if (ojbVarV != null) {
                    final int i11113 = 1;
                    final j09 j09Var12 = j09Var2;
                    final float f11110 = f6;
                    final dd2 dd2Var12 = dd2Var2;
                    l26Var = new l26() { // from class: fq1
                        @Override // defpackage.l26
                        public final Object z(Object obj, Object obj2) {
                            int i11114 = i11113;
                            wef wefVar = wef.a;
                            int i11115 = i;
                            switch (i11114) {
                                case 0:
                                    ((Integer) obj2).getClass();
                                    int iP = k99.P(i11115 | 1);
                                    uq1.l(j09Var12, f7, f8, f11110, xiVar3, z4, dd2Var12, (l46) obj, iP, i2);
                                    break;
                                default:
                                    ((Integer) obj2).getClass();
                                    int iP2 = k99.P(i11115 | 1);
                                    uq1.l(j09Var12, f7, f8, f11110, xiVar3, z4, dd2Var12, (l46) obj, iP2, i2);
                                    break;
                            }
                            return wefVar;
                        }
                    };
                    ojbVarV.d = l26Var;
                }
            }
            i3 |= 24576;
            xiVar2 = xiVar;
            i8 = i2 & 32;
            if (i8 != 0) {
                if ((196608 & i) == 0) {
                    z2 = z;
                    if (l46Var.h(z2)) {
                        i9 = 131072;
                    } else {
                        i9 = 65536;
                    }
                    i3 |= i9;
                }
                if ((1572864 & i) == 0) {
                    if (l46Var.i(dd2Var)) {
                        i11 = 1048576;
                    } else {
                        i11 = 524288;
                    }
                    i3 |= i11;
                }
                i10 = i3;
                if ((599187 & i3) != 599186) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (l46Var.W(i10 & 1, z3)) {
                    if (i13 != 0) {
                        f9 = 20.0f;
                    } else {
                        f9 = f4;
                    }
                    if (i4 != 0) {
                        f10 = 20.0f;
                    } else {
                        f10 = f5;
                    }
                    if (i6 != 0) {
                        xiVar4 = ndb.Y;
                    } else {
                        xiVar4 = xiVar2;
                    }
                    if (i8 != 0) {
                        z2 = false;
                    }
                    if (z2) {
                        l46Var.f0(-548219291);
                        boolean zF11 = k8b.f((e8b) l46Var.k(l8b.a));
                        r10 = 0;
                        l46Var.r(false);
                        z5 = zF11;
                    } else {
                        r10 = 0;
                        l46Var.f0(185072400);
                        l46Var.r(false);
                        z5 = false;
                    }
                    if (z5) {
                        l46Var.f0(185092369);
                        j09 j09VarC11 = b.c(j09Var, 1.0f);
                        uc0 uc0Var11 = new uc0(f3, true, new qc0(r10));
                        int i11114 = ((i10 >> 6) & 896) | ((i10 >> 9) & 7168);
                        c92 c92VarA11 = a92.a(uc0Var11, xiVar4, l46Var, (i11114 >> 3) & 112);
                        int iHashCode11 = Long.hashCode(l46Var.T);
                        u8a u8aVarM11 = l46Var.m();
                        j09 j09VarJ11 = m93.J(l46Var, j09VarC11);
                        lf2.q.getClass();
                        l46Var.j0();
                        if (l46Var.S) {
                            l46Var.l(LayoutNode.h1);
                        } else {
                            l46Var.s0();
                        }
                        dec.l(hj6.z, l46Var, c92VarA11);
                        dec.l(hj6.y, l46Var, u8aVarM11);
                        dec.l(hj6.X, l46Var, Integer.valueOf(iHashCode11));
                        dec.k(l46Var);
                        dec.l(hj6.x, l46Var, j09VarJ11);
                        ks0.q(((i11114 >> 6) & 112) | 6, dd2Var, e92.a, l46Var, true);
                        l46Var.r(false);
                        ojbVarV = l46Var.v();
                        if (ojbVarV != null) {
                            return;
                        }
                        final int i11115 = 0;
                        final boolean z116 = z2;
                        l26Var = new l26() { // from class: fq1
                            @Override // defpackage.l26
                            public final Object z(Object obj, Object obj2) {
                                int i11116 = i11115;
                                wef wefVar = wef.a;
                                int i11117 = i;
                                switch (i11116) {
                                    case 0:
                                        ((Integer) obj2).getClass();
                                        int iP = k99.P(i11117 | 1);
                                        uq1.l(j09Var, f9, f10, f3, xiVar4, z116, dd2Var, (l46) obj, iP, i2);
                                        break;
                                    default:
                                        ((Integer) obj2).getClass();
                                        int iP2 = k99.P(i11117 | 1);
                                        uq1.l(j09Var, f9, f10, f3, xiVar4, z116, dd2Var, (l46) obj, iP2, i2);
                                        break;
                                }
                                return wefVar;
                            }
                        };
                    } else {
                        j09Var2 = j09Var;
                        float f11111 = f9;
                        f6 = f3;
                        dd2Var2 = dd2Var;
                        boolean z117 = z2;
                        final float f11112 = f10;
                        final xi xiVar15 = xiVar4;
                        l46Var.f0(185300906);
                        l46Var.r(r10);
                        pr4Var = l8b.a;
                        j = ((e8b) l46Var.k(pr4Var)).c;
                        if (if9.B(l46Var)) {
                            l46Var.f0(-548197909);
                            jC = ((e8b) l46Var.k(pr4Var)).f;
                            l46Var.r(false);
                        } else {
                            l46Var.f0(-548197111);
                            l46Var.r(false);
                            jC = abg.c(2063597567);
                        }
                        if (!we6.e(l46Var)) {
                            j = jC;
                        }
                        j2 = ((e8b) l46Var.k(pr4Var)).z;
                        j3 = ((e8b) l46Var.k(pr4Var)).d;
                        if (we6.e(l46Var)) {
                            j3 = j2;
                        }
                        bzd.d(b.c(j09Var2, 1.0f), a7c.b(f11111), z5c.p(j, 0L, l46Var, 24576, 14), null, x57.b(j3, 0.5f), af1.b0(1985143846, new n26() { // from class: gq1
                            @Override // defpackage.n26
                            public final Object m(Object obj, Object obj2, Object obj3) {
                                l46 l46Var2 = (l46) obj2;
                                int iIntValue = ((Integer) obj3).intValue();
                                ((d92) obj).getClass();
                                if (l46Var2.W(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    j09 j09VarZ = ynb.Z(b.c(g09.a, 1.0f), f11112);
                                    c92 c92VarA12 = a92.a(new uc0(f6, true, new qc0(0)), xiVar15, l46Var2, 0);
                                    int iHashCode12 = Long.hashCode(l46Var2.T);
                                    u8a u8aVarM12 = l46Var2.m();
                                    j09 j09VarJ12 = m93.J(l46Var2, j09VarZ);
                                    lf2.q.getClass();
                                    l46Var2.j0();
                                    if (l46Var2.S) {
                                        l46Var2.l(LayoutNode.h1);
                                    } else {
                                        l46Var2.s0();
                                    }
                                    dec.l(hj6.z, l46Var2, c92VarA12);
                                    dec.l(hj6.y, l46Var2, u8aVarM12);
                                    dec.l(hj6.X, l46Var2, Integer.valueOf(iHashCode12));
                                    dec.k(l46Var2);
                                    dec.l(hj6.x, l46Var2, j09VarJ12);
                                    ks0.q(6, dd2Var2, e92.a, l46Var2, true);
                                } else {
                                    l46Var2.Z();
                                }
                                return wef.a;
                            }
                        }, l46Var), l46Var, 196608, 8);
                        xiVar3 = xiVar15;
                        f7 = f11111;
                        f8 = f11112;
                        z4 = z117;
                    }
                    ojbVarV.d = l26Var;
                }
                j09Var2 = j09Var;
                f6 = f3;
                dd2Var2 = dd2Var;
                l46Var.Z();
                f7 = f4;
                f8 = f5;
                xiVar3 = xiVar2;
                z4 = z2;
                ojbVarV = l46Var.v();
                if (ojbVarV != null) {
                    final int i11116 = 1;
                    final j09 j09Var13 = j09Var2;
                    final float f11113 = f6;
                    final dd2 dd2Var13 = dd2Var2;
                    l26Var = new l26() { // from class: fq1
                        @Override // defpackage.l26
                        public final Object z(Object obj, Object obj2) {
                            int i11117 = i11116;
                            wef wefVar = wef.a;
                            int i11118 = i;
                            switch (i11117) {
                                case 0:
                                    ((Integer) obj2).getClass();
                                    int iP = k99.P(i11118 | 1);
                                    uq1.l(j09Var13, f7, f8, f11113, xiVar3, z4, dd2Var13, (l46) obj, iP, i2);
                                    break;
                                default:
                                    ((Integer) obj2).getClass();
                                    int iP2 = k99.P(i11118 | 1);
                                    uq1.l(j09Var13, f7, f8, f11113, xiVar3, z4, dd2Var13, (l46) obj, iP2, i2);
                                    break;
                            }
                            return wefVar;
                        }
                    };
                    ojbVarV.d = l26Var;
                }
            }
            i3 |= 196608;
            z2 = z;
            if ((1572864 & i) == 0) {
                if (l46Var.i(dd2Var)) {
                    i11 = 1048576;
                } else {
                    i11 = 524288;
                }
                i3 |= i11;
            }
            i10 = i3;
            if ((599187 & i3) != 599186) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (l46Var.W(i10 & 1, z3)) {
                if (i13 != 0) {
                    f9 = 20.0f;
                } else {
                    f9 = f4;
                }
                if (i4 != 0) {
                    f10 = 20.0f;
                } else {
                    f10 = f5;
                }
                if (i6 != 0) {
                    xiVar4 = ndb.Y;
                } else {
                    xiVar4 = xiVar2;
                }
                if (i8 != 0) {
                    z2 = false;
                }
                if (z2) {
                    l46Var.f0(-548219291);
                    boolean zF12 = k8b.f((e8b) l46Var.k(l8b.a));
                    r10 = 0;
                    l46Var.r(false);
                    z5 = zF12;
                } else {
                    r10 = 0;
                    l46Var.f0(185072400);
                    l46Var.r(false);
                    z5 = false;
                }
                if (z5) {
                    l46Var.f0(185092369);
                    j09 j09VarC12 = b.c(j09Var, 1.0f);
                    uc0 uc0Var12 = new uc0(f3, true, new qc0(r10));
                    int i11117 = ((i10 >> 6) & 896) | ((i10 >> 9) & 7168);
                    c92 c92VarA12 = a92.a(uc0Var12, xiVar4, l46Var, (i11117 >> 3) & 112);
                    int iHashCode12 = Long.hashCode(l46Var.T);
                    u8a u8aVarM12 = l46Var.m();
                    j09 j09VarJ12 = m93.J(l46Var, j09VarC12);
                    lf2.q.getClass();
                    l46Var.j0();
                    if (l46Var.S) {
                        l46Var.l(LayoutNode.h1);
                    } else {
                        l46Var.s0();
                    }
                    dec.l(hj6.z, l46Var, c92VarA12);
                    dec.l(hj6.y, l46Var, u8aVarM12);
                    dec.l(hj6.X, l46Var, Integer.valueOf(iHashCode12));
                    dec.k(l46Var);
                    dec.l(hj6.x, l46Var, j09VarJ12);
                    ks0.q(((i11117 >> 6) & 112) | 6, dd2Var, e92.a, l46Var, true);
                    l46Var.r(false);
                    ojbVarV = l46Var.v();
                    if (ojbVarV != null) {
                        return;
                    }
                    final int i11118 = 0;
                    final boolean z118 = z2;
                    l26Var = new l26() { // from class: fq1
                        @Override // defpackage.l26
                        public final Object z(Object obj, Object obj2) {
                            int i11119 = i11118;
                            wef wefVar = wef.a;
                            int i111110 = i;
                            switch (i11119) {
                                case 0:
                                    ((Integer) obj2).getClass();
                                    int iP = k99.P(i111110 | 1);
                                    uq1.l(j09Var, f9, f10, f3, xiVar4, z118, dd2Var, (l46) obj, iP, i2);
                                    break;
                                default:
                                    ((Integer) obj2).getClass();
                                    int iP2 = k99.P(i111110 | 1);
                                    uq1.l(j09Var, f9, f10, f3, xiVar4, z118, dd2Var, (l46) obj, iP2, i2);
                                    break;
                            }
                            return wefVar;
                        }
                    };
                } else {
                    j09Var2 = j09Var;
                    float f11114 = f9;
                    f6 = f3;
                    dd2Var2 = dd2Var;
                    boolean z119 = z2;
                    final float f11115 = f10;
                    final xi xiVar16 = xiVar4;
                    l46Var.f0(185300906);
                    l46Var.r(r10);
                    pr4Var = l8b.a;
                    j = ((e8b) l46Var.k(pr4Var)).c;
                    if (if9.B(l46Var)) {
                        l46Var.f0(-548197909);
                        jC = ((e8b) l46Var.k(pr4Var)).f;
                        l46Var.r(false);
                    } else {
                        l46Var.f0(-548197111);
                        l46Var.r(false);
                        jC = abg.c(2063597567);
                    }
                    if (!we6.e(l46Var)) {
                        j = jC;
                    }
                    j2 = ((e8b) l46Var.k(pr4Var)).z;
                    j3 = ((e8b) l46Var.k(pr4Var)).d;
                    if (we6.e(l46Var)) {
                        j3 = j2;
                    }
                    bzd.d(b.c(j09Var2, 1.0f), a7c.b(f11114), z5c.p(j, 0L, l46Var, 24576, 14), null, x57.b(j3, 0.5f), af1.b0(1985143846, new n26() { // from class: gq1
                        @Override // defpackage.n26
                        public final Object m(Object obj, Object obj2, Object obj3) {
                            l46 l46Var2 = (l46) obj2;
                            int iIntValue = ((Integer) obj3).intValue();
                            ((d92) obj).getClass();
                            if (l46Var2.W(iIntValue & 1, (iIntValue & 17) != 16)) {
                                j09 j09VarZ = ynb.Z(b.c(g09.a, 1.0f), f11115);
                                c92 c92VarA13 = a92.a(new uc0(f6, true, new qc0(0)), xiVar16, l46Var2, 0);
                                int iHashCode13 = Long.hashCode(l46Var2.T);
                                u8a u8aVarM13 = l46Var2.m();
                                j09 j09VarJ13 = m93.J(l46Var2, j09VarZ);
                                lf2.q.getClass();
                                l46Var2.j0();
                                if (l46Var2.S) {
                                    l46Var2.l(LayoutNode.h1);
                                } else {
                                    l46Var2.s0();
                                }
                                dec.l(hj6.z, l46Var2, c92VarA13);
                                dec.l(hj6.y, l46Var2, u8aVarM13);
                                dec.l(hj6.X, l46Var2, Integer.valueOf(iHashCode13));
                                dec.k(l46Var2);
                                dec.l(hj6.x, l46Var2, j09VarJ13);
                                ks0.q(6, dd2Var2, e92.a, l46Var2, true);
                            } else {
                                l46Var2.Z();
                            }
                            return wef.a;
                        }
                    }, l46Var), l46Var, 196608, 8);
                    xiVar3 = xiVar16;
                    f7 = f11114;
                    f8 = f11115;
                    z4 = z119;
                }
                ojbVarV.d = l26Var;
            }
            j09Var2 = j09Var;
            f6 = f3;
            dd2Var2 = dd2Var;
            l46Var.Z();
            f7 = f4;
            f8 = f5;
            xiVar3 = xiVar2;
            z4 = z2;
            ojbVarV = l46Var.v();
            if (ojbVarV != null) {
                final int i11119 = 1;
                final j09 j09Var14 = j09Var2;
                final float f11116 = f6;
                final dd2 dd2Var14 = dd2Var2;
                l26Var = new l26() { // from class: fq1
                    @Override // defpackage.l26
                    public final Object z(Object obj, Object obj2) {
                        int i111110 = i11119;
                        wef wefVar = wef.a;
                        int i111111 = i;
                        switch (i111110) {
                            case 0:
                                ((Integer) obj2).getClass();
                                int iP = k99.P(i111111 | 1);
                                uq1.l(j09Var14, f7, f8, f11116, xiVar3, z4, dd2Var14, (l46) obj, iP, i2);
                                break;
                            default:
                                ((Integer) obj2).getClass();
                                int iP2 = k99.P(i111111 | 1);
                                uq1.l(j09Var14, f7, f8, f11116, xiVar3, z4, dd2Var14, (l46) obj, iP2, i2);
                                break;
                        }
                        return wefVar;
                    }
                };
                ojbVarV.d = l26Var;
            }
        }
        i3 |= 384;
        f5 = f2;
        if ((i & 3072) == 0) {
            if (l46Var.d(f3)) {
                i12 = 2048;
            } else {
                i12 = UserMetadata.MAX_ATTRIBUTE_SIZE;
            }
            i3 |= i12;
        }
        i6 = i2 & 16;
        if (i6 != 0) {
            if ((i & 24576) == 0) {
                xiVar2 = xiVar;
                if (l46Var.g(xiVar2)) {
                    i7 = 16384;
                } else {
                    i7 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
                }
                i3 |= i7;
            }
            i8 = i2 & 32;
            if (i8 != 0) {
                if ((196608 & i) == 0) {
                    z2 = z;
                    if (l46Var.h(z2)) {
                        i9 = 131072;
                    } else {
                        i9 = 65536;
                    }
                    i3 |= i9;
                }
                if ((1572864 & i) == 0) {
                    if (l46Var.i(dd2Var)) {
                        i11 = 1048576;
                    } else {
                        i11 = 524288;
                    }
                    i3 |= i11;
                }
                i10 = i3;
                if ((599187 & i3) != 599186) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (l46Var.W(i10 & 1, z3)) {
                    if (i13 != 0) {
                        f9 = 20.0f;
                    } else {
                        f9 = f4;
                    }
                    if (i4 != 0) {
                        f10 = 20.0f;
                    } else {
                        f10 = f5;
                    }
                    if (i6 != 0) {
                        xiVar4 = ndb.Y;
                    } else {
                        xiVar4 = xiVar2;
                    }
                    if (i8 != 0) {
                        z2 = false;
                    }
                    if (z2) {
                        l46Var.f0(-548219291);
                        boolean zF13 = k8b.f((e8b) l46Var.k(l8b.a));
                        r10 = 0;
                        l46Var.r(false);
                        z5 = zF13;
                    } else {
                        r10 = 0;
                        l46Var.f0(185072400);
                        l46Var.r(false);
                        z5 = false;
                    }
                    if (z5) {
                        l46Var.f0(185092369);
                        j09 j09VarC13 = b.c(j09Var, 1.0f);
                        uc0 uc0Var13 = new uc0(f3, true, new qc0(r10));
                        int i111110 = ((i10 >> 6) & 896) | ((i10 >> 9) & 7168);
                        c92 c92VarA13 = a92.a(uc0Var13, xiVar4, l46Var, (i111110 >> 3) & 112);
                        int iHashCode13 = Long.hashCode(l46Var.T);
                        u8a u8aVarM13 = l46Var.m();
                        j09 j09VarJ13 = m93.J(l46Var, j09VarC13);
                        lf2.q.getClass();
                        l46Var.j0();
                        if (l46Var.S) {
                            l46Var.l(LayoutNode.h1);
                        } else {
                            l46Var.s0();
                        }
                        dec.l(hj6.z, l46Var, c92VarA13);
                        dec.l(hj6.y, l46Var, u8aVarM13);
                        dec.l(hj6.X, l46Var, Integer.valueOf(iHashCode13));
                        dec.k(l46Var);
                        dec.l(hj6.x, l46Var, j09VarJ13);
                        ks0.q(((i111110 >> 6) & 112) | 6, dd2Var, e92.a, l46Var, true);
                        l46Var.r(false);
                        ojbVarV = l46Var.v();
                        if (ojbVarV != null) {
                            return;
                        }
                        final int i111111 = 0;
                        final boolean z1110 = z2;
                        l26Var = new l26() { // from class: fq1
                            @Override // defpackage.l26
                            public final Object z(Object obj, Object obj2) {
                                int i111112 = i111111;
                                wef wefVar = wef.a;
                                int i111113 = i;
                                switch (i111112) {
                                    case 0:
                                        ((Integer) obj2).getClass();
                                        int iP = k99.P(i111113 | 1);
                                        uq1.l(j09Var, f9, f10, f3, xiVar4, z1110, dd2Var, (l46) obj, iP, i2);
                                        break;
                                    default:
                                        ((Integer) obj2).getClass();
                                        int iP2 = k99.P(i111113 | 1);
                                        uq1.l(j09Var, f9, f10, f3, xiVar4, z1110, dd2Var, (l46) obj, iP2, i2);
                                        break;
                                }
                                return wefVar;
                            }
                        };
                    } else {
                        j09Var2 = j09Var;
                        float f11117 = f9;
                        f6 = f3;
                        dd2Var2 = dd2Var;
                        boolean z1111 = z2;
                        final float f11118 = f10;
                        final xi xiVar17 = xiVar4;
                        l46Var.f0(185300906);
                        l46Var.r(r10);
                        pr4Var = l8b.a;
                        j = ((e8b) l46Var.k(pr4Var)).c;
                        if (if9.B(l46Var)) {
                            l46Var.f0(-548197909);
                            jC = ((e8b) l46Var.k(pr4Var)).f;
                            l46Var.r(false);
                        } else {
                            l46Var.f0(-548197111);
                            l46Var.r(false);
                            jC = abg.c(2063597567);
                        }
                        if (!we6.e(l46Var)) {
                            j = jC;
                        }
                        j2 = ((e8b) l46Var.k(pr4Var)).z;
                        j3 = ((e8b) l46Var.k(pr4Var)).d;
                        if (we6.e(l46Var)) {
                            j3 = j2;
                        }
                        bzd.d(b.c(j09Var2, 1.0f), a7c.b(f11117), z5c.p(j, 0L, l46Var, 24576, 14), null, x57.b(j3, 0.5f), af1.b0(1985143846, new n26() { // from class: gq1
                            @Override // defpackage.n26
                            public final Object m(Object obj, Object obj2, Object obj3) {
                                l46 l46Var2 = (l46) obj2;
                                int iIntValue = ((Integer) obj3).intValue();
                                ((d92) obj).getClass();
                                if (l46Var2.W(iIntValue & 1, (iIntValue & 17) != 16)) {
                                    j09 j09VarZ = ynb.Z(b.c(g09.a, 1.0f), f11118);
                                    c92 c92VarA14 = a92.a(new uc0(f6, true, new qc0(0)), xiVar17, l46Var2, 0);
                                    int iHashCode14 = Long.hashCode(l46Var2.T);
                                    u8a u8aVarM14 = l46Var2.m();
                                    j09 j09VarJ14 = m93.J(l46Var2, j09VarZ);
                                    lf2.q.getClass();
                                    l46Var2.j0();
                                    if (l46Var2.S) {
                                        l46Var2.l(LayoutNode.h1);
                                    } else {
                                        l46Var2.s0();
                                    }
                                    dec.l(hj6.z, l46Var2, c92VarA14);
                                    dec.l(hj6.y, l46Var2, u8aVarM14);
                                    dec.l(hj6.X, l46Var2, Integer.valueOf(iHashCode14));
                                    dec.k(l46Var2);
                                    dec.l(hj6.x, l46Var2, j09VarJ14);
                                    ks0.q(6, dd2Var2, e92.a, l46Var2, true);
                                } else {
                                    l46Var2.Z();
                                }
                                return wef.a;
                            }
                        }, l46Var), l46Var, 196608, 8);
                        xiVar3 = xiVar17;
                        f7 = f11117;
                        f8 = f11118;
                        z4 = z1111;
                    }
                    ojbVarV.d = l26Var;
                }
                j09Var2 = j09Var;
                f6 = f3;
                dd2Var2 = dd2Var;
                l46Var.Z();
                f7 = f4;
                f8 = f5;
                xiVar3 = xiVar2;
                z4 = z2;
                ojbVarV = l46Var.v();
                if (ojbVarV != null) {
                    final int i111112 = 1;
                    final j09 j09Var15 = j09Var2;
                    final float f11119 = f6;
                    final dd2 dd2Var15 = dd2Var2;
                    l26Var = new l26() { // from class: fq1
                        @Override // defpackage.l26
                        public final Object z(Object obj, Object obj2) {
                            int i111113 = i111112;
                            wef wefVar = wef.a;
                            int i111114 = i;
                            switch (i111113) {
                                case 0:
                                    ((Integer) obj2).getClass();
                                    int iP = k99.P(i111114 | 1);
                                    uq1.l(j09Var15, f7, f8, f11119, xiVar3, z4, dd2Var15, (l46) obj, iP, i2);
                                    break;
                                default:
                                    ((Integer) obj2).getClass();
                                    int iP2 = k99.P(i111114 | 1);
                                    uq1.l(j09Var15, f7, f8, f11119, xiVar3, z4, dd2Var15, (l46) obj, iP2, i2);
                                    break;
                            }
                            return wefVar;
                        }
                    };
                    ojbVarV.d = l26Var;
                }
            }
            i3 |= 196608;
            z2 = z;
            if ((1572864 & i) == 0) {
                if (l46Var.i(dd2Var)) {
                    i11 = 1048576;
                } else {
                    i11 = 524288;
                }
                i3 |= i11;
            }
            i10 = i3;
            if ((599187 & i3) != 599186) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (l46Var.W(i10 & 1, z3)) {
                if (i13 != 0) {
                    f9 = 20.0f;
                } else {
                    f9 = f4;
                }
                if (i4 != 0) {
                    f10 = 20.0f;
                } else {
                    f10 = f5;
                }
                if (i6 != 0) {
                    xiVar4 = ndb.Y;
                } else {
                    xiVar4 = xiVar2;
                }
                if (i8 != 0) {
                    z2 = false;
                }
                if (z2) {
                    l46Var.f0(-548219291);
                    boolean zF14 = k8b.f((e8b) l46Var.k(l8b.a));
                    r10 = 0;
                    l46Var.r(false);
                    z5 = zF14;
                } else {
                    r10 = 0;
                    l46Var.f0(185072400);
                    l46Var.r(false);
                    z5 = false;
                }
                if (z5) {
                    l46Var.f0(185092369);
                    j09 j09VarC14 = b.c(j09Var, 1.0f);
                    uc0 uc0Var14 = new uc0(f3, true, new qc0(r10));
                    int i111113 = ((i10 >> 6) & 896) | ((i10 >> 9) & 7168);
                    c92 c92VarA14 = a92.a(uc0Var14, xiVar4, l46Var, (i111113 >> 3) & 112);
                    int iHashCode14 = Long.hashCode(l46Var.T);
                    u8a u8aVarM14 = l46Var.m();
                    j09 j09VarJ14 = m93.J(l46Var, j09VarC14);
                    lf2.q.getClass();
                    l46Var.j0();
                    if (l46Var.S) {
                        l46Var.l(LayoutNode.h1);
                    } else {
                        l46Var.s0();
                    }
                    dec.l(hj6.z, l46Var, c92VarA14);
                    dec.l(hj6.y, l46Var, u8aVarM14);
                    dec.l(hj6.X, l46Var, Integer.valueOf(iHashCode14));
                    dec.k(l46Var);
                    dec.l(hj6.x, l46Var, j09VarJ14);
                    ks0.q(((i111113 >> 6) & 112) | 6, dd2Var, e92.a, l46Var, true);
                    l46Var.r(false);
                    ojbVarV = l46Var.v();
                    if (ojbVarV != null) {
                        return;
                    }
                    final int i111114 = 0;
                    final boolean z1112 = z2;
                    l26Var = new l26() { // from class: fq1
                        @Override // defpackage.l26
                        public final Object z(Object obj, Object obj2) {
                            int i111115 = i111114;
                            wef wefVar = wef.a;
                            int i111116 = i;
                            switch (i111115) {
                                case 0:
                                    ((Integer) obj2).getClass();
                                    int iP = k99.P(i111116 | 1);
                                    uq1.l(j09Var, f9, f10, f3, xiVar4, z1112, dd2Var, (l46) obj, iP, i2);
                                    break;
                                default:
                                    ((Integer) obj2).getClass();
                                    int iP2 = k99.P(i111116 | 1);
                                    uq1.l(j09Var, f9, f10, f3, xiVar4, z1112, dd2Var, (l46) obj, iP2, i2);
                                    break;
                            }
                            return wefVar;
                        }
                    };
                } else {
                    j09Var2 = j09Var;
                    float f111110 = f9;
                    f6 = f3;
                    dd2Var2 = dd2Var;
                    boolean z1113 = z2;
                    final float f111111 = f10;
                    final xi xiVar18 = xiVar4;
                    l46Var.f0(185300906);
                    l46Var.r(r10);
                    pr4Var = l8b.a;
                    j = ((e8b) l46Var.k(pr4Var)).c;
                    if (if9.B(l46Var)) {
                        l46Var.f0(-548197909);
                        jC = ((e8b) l46Var.k(pr4Var)).f;
                        l46Var.r(false);
                    } else {
                        l46Var.f0(-548197111);
                        l46Var.r(false);
                        jC = abg.c(2063597567);
                    }
                    if (!we6.e(l46Var)) {
                        j = jC;
                    }
                    j2 = ((e8b) l46Var.k(pr4Var)).z;
                    j3 = ((e8b) l46Var.k(pr4Var)).d;
                    if (we6.e(l46Var)) {
                        j3 = j2;
                    }
                    bzd.d(b.c(j09Var2, 1.0f), a7c.b(f111110), z5c.p(j, 0L, l46Var, 24576, 14), null, x57.b(j3, 0.5f), af1.b0(1985143846, new n26() { // from class: gq1
                        @Override // defpackage.n26
                        public final Object m(Object obj, Object obj2, Object obj3) {
                            l46 l46Var2 = (l46) obj2;
                            int iIntValue = ((Integer) obj3).intValue();
                            ((d92) obj).getClass();
                            if (l46Var2.W(iIntValue & 1, (iIntValue & 17) != 16)) {
                                j09 j09VarZ = ynb.Z(b.c(g09.a, 1.0f), f111111);
                                c92 c92VarA15 = a92.a(new uc0(f6, true, new qc0(0)), xiVar18, l46Var2, 0);
                                int iHashCode15 = Long.hashCode(l46Var2.T);
                                u8a u8aVarM15 = l46Var2.m();
                                j09 j09VarJ15 = m93.J(l46Var2, j09VarZ);
                                lf2.q.getClass();
                                l46Var2.j0();
                                if (l46Var2.S) {
                                    l46Var2.l(LayoutNode.h1);
                                } else {
                                    l46Var2.s0();
                                }
                                dec.l(hj6.z, l46Var2, c92VarA15);
                                dec.l(hj6.y, l46Var2, u8aVarM15);
                                dec.l(hj6.X, l46Var2, Integer.valueOf(iHashCode15));
                                dec.k(l46Var2);
                                dec.l(hj6.x, l46Var2, j09VarJ15);
                                ks0.q(6, dd2Var2, e92.a, l46Var2, true);
                            } else {
                                l46Var2.Z();
                            }
                            return wef.a;
                        }
                    }, l46Var), l46Var, 196608, 8);
                    xiVar3 = xiVar18;
                    f7 = f111110;
                    f8 = f111111;
                    z4 = z1113;
                }
                ojbVarV.d = l26Var;
            }
            j09Var2 = j09Var;
            f6 = f3;
            dd2Var2 = dd2Var;
            l46Var.Z();
            f7 = f4;
            f8 = f5;
            xiVar3 = xiVar2;
            z4 = z2;
            ojbVarV = l46Var.v();
            if (ojbVarV != null) {
                final int i111115 = 1;
                final j09 j09Var16 = j09Var2;
                final float f111112 = f6;
                final dd2 dd2Var16 = dd2Var2;
                l26Var = new l26() { // from class: fq1
                    @Override // defpackage.l26
                    public final Object z(Object obj, Object obj2) {
                        int i111116 = i111115;
                        wef wefVar = wef.a;
                        int i111117 = i;
                        switch (i111116) {
                            case 0:
                                ((Integer) obj2).getClass();
                                int iP = k99.P(i111117 | 1);
                                uq1.l(j09Var16, f7, f8, f111112, xiVar3, z4, dd2Var16, (l46) obj, iP, i2);
                                break;
                            default:
                                ((Integer) obj2).getClass();
                                int iP2 = k99.P(i111117 | 1);
                                uq1.l(j09Var16, f7, f8, f111112, xiVar3, z4, dd2Var16, (l46) obj, iP2, i2);
                                break;
                        }
                        return wefVar;
                    }
                };
                ojbVarV.d = l26Var;
            }
        }
        i3 |= 24576;
        xiVar2 = xiVar;
        i8 = i2 & 32;
        if (i8 != 0) {
            if ((196608 & i) == 0) {
                z2 = z;
                if (l46Var.h(z2)) {
                    i9 = 131072;
                } else {
                    i9 = 65536;
                }
                i3 |= i9;
            }
            if ((1572864 & i) == 0) {
                if (l46Var.i(dd2Var)) {
                    i11 = 1048576;
                } else {
                    i11 = 524288;
                }
                i3 |= i11;
            }
            i10 = i3;
            if ((599187 & i3) != 599186) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (l46Var.W(i10 & 1, z3)) {
                if (i13 != 0) {
                    f9 = 20.0f;
                } else {
                    f9 = f4;
                }
                if (i4 != 0) {
                    f10 = 20.0f;
                } else {
                    f10 = f5;
                }
                if (i6 != 0) {
                    xiVar4 = ndb.Y;
                } else {
                    xiVar4 = xiVar2;
                }
                if (i8 != 0) {
                    z2 = false;
                }
                if (z2) {
                    l46Var.f0(-548219291);
                    boolean zF15 = k8b.f((e8b) l46Var.k(l8b.a));
                    r10 = 0;
                    l46Var.r(false);
                    z5 = zF15;
                } else {
                    r10 = 0;
                    l46Var.f0(185072400);
                    l46Var.r(false);
                    z5 = false;
                }
                if (z5) {
                    l46Var.f0(185092369);
                    j09 j09VarC15 = b.c(j09Var, 1.0f);
                    uc0 uc0Var15 = new uc0(f3, true, new qc0(r10));
                    int i111116 = ((i10 >> 6) & 896) | ((i10 >> 9) & 7168);
                    c92 c92VarA15 = a92.a(uc0Var15, xiVar4, l46Var, (i111116 >> 3) & 112);
                    int iHashCode15 = Long.hashCode(l46Var.T);
                    u8a u8aVarM15 = l46Var.m();
                    j09 j09VarJ15 = m93.J(l46Var, j09VarC15);
                    lf2.q.getClass();
                    l46Var.j0();
                    if (l46Var.S) {
                        l46Var.l(LayoutNode.h1);
                    } else {
                        l46Var.s0();
                    }
                    dec.l(hj6.z, l46Var, c92VarA15);
                    dec.l(hj6.y, l46Var, u8aVarM15);
                    dec.l(hj6.X, l46Var, Integer.valueOf(iHashCode15));
                    dec.k(l46Var);
                    dec.l(hj6.x, l46Var, j09VarJ15);
                    ks0.q(((i111116 >> 6) & 112) | 6, dd2Var, e92.a, l46Var, true);
                    l46Var.r(false);
                    ojbVarV = l46Var.v();
                    if (ojbVarV != null) {
                        return;
                    }
                    final int i111117 = 0;
                    final boolean z1114 = z2;
                    l26Var = new l26() { // from class: fq1
                        @Override // defpackage.l26
                        public final Object z(Object obj, Object obj2) {
                            int i111118 = i111117;
                            wef wefVar = wef.a;
                            int i111119 = i;
                            switch (i111118) {
                                case 0:
                                    ((Integer) obj2).getClass();
                                    int iP = k99.P(i111119 | 1);
                                    uq1.l(j09Var, f9, f10, f3, xiVar4, z1114, dd2Var, (l46) obj, iP, i2);
                                    break;
                                default:
                                    ((Integer) obj2).getClass();
                                    int iP2 = k99.P(i111119 | 1);
                                    uq1.l(j09Var, f9, f10, f3, xiVar4, z1114, dd2Var, (l46) obj, iP2, i2);
                                    break;
                            }
                            return wefVar;
                        }
                    };
                } else {
                    j09Var2 = j09Var;
                    float f111113 = f9;
                    f6 = f3;
                    dd2Var2 = dd2Var;
                    boolean z1115 = z2;
                    final float f111114 = f10;
                    final xi xiVar19 = xiVar4;
                    l46Var.f0(185300906);
                    l46Var.r(r10);
                    pr4Var = l8b.a;
                    j = ((e8b) l46Var.k(pr4Var)).c;
                    if (if9.B(l46Var)) {
                        l46Var.f0(-548197909);
                        jC = ((e8b) l46Var.k(pr4Var)).f;
                        l46Var.r(false);
                    } else {
                        l46Var.f0(-548197111);
                        l46Var.r(false);
                        jC = abg.c(2063597567);
                    }
                    if (!we6.e(l46Var)) {
                        j = jC;
                    }
                    j2 = ((e8b) l46Var.k(pr4Var)).z;
                    j3 = ((e8b) l46Var.k(pr4Var)).d;
                    if (we6.e(l46Var)) {
                        j3 = j2;
                    }
                    bzd.d(b.c(j09Var2, 1.0f), a7c.b(f111113), z5c.p(j, 0L, l46Var, 24576, 14), null, x57.b(j3, 0.5f), af1.b0(1985143846, new n26() { // from class: gq1
                        @Override // defpackage.n26
                        public final Object m(Object obj, Object obj2, Object obj3) {
                            l46 l46Var2 = (l46) obj2;
                            int iIntValue = ((Integer) obj3).intValue();
                            ((d92) obj).getClass();
                            if (l46Var2.W(iIntValue & 1, (iIntValue & 17) != 16)) {
                                j09 j09VarZ = ynb.Z(b.c(g09.a, 1.0f), f111114);
                                c92 c92VarA16 = a92.a(new uc0(f6, true, new qc0(0)), xiVar19, l46Var2, 0);
                                int iHashCode16 = Long.hashCode(l46Var2.T);
                                u8a u8aVarM16 = l46Var2.m();
                                j09 j09VarJ16 = m93.J(l46Var2, j09VarZ);
                                lf2.q.getClass();
                                l46Var2.j0();
                                if (l46Var2.S) {
                                    l46Var2.l(LayoutNode.h1);
                                } else {
                                    l46Var2.s0();
                                }
                                dec.l(hj6.z, l46Var2, c92VarA16);
                                dec.l(hj6.y, l46Var2, u8aVarM16);
                                dec.l(hj6.X, l46Var2, Integer.valueOf(iHashCode16));
                                dec.k(l46Var2);
                                dec.l(hj6.x, l46Var2, j09VarJ16);
                                ks0.q(6, dd2Var2, e92.a, l46Var2, true);
                            } else {
                                l46Var2.Z();
                            }
                            return wef.a;
                        }
                    }, l46Var), l46Var, 196608, 8);
                    xiVar3 = xiVar19;
                    f7 = f111113;
                    f8 = f111114;
                    z4 = z1115;
                }
                ojbVarV.d = l26Var;
            }
            j09Var2 = j09Var;
            f6 = f3;
            dd2Var2 = dd2Var;
            l46Var.Z();
            f7 = f4;
            f8 = f5;
            xiVar3 = xiVar2;
            z4 = z2;
            ojbVarV = l46Var.v();
            if (ojbVarV != null) {
                final int i111118 = 1;
                final j09 j09Var17 = j09Var2;
                final float f111115 = f6;
                final dd2 dd2Var17 = dd2Var2;
                l26Var = new l26() { // from class: fq1
                    @Override // defpackage.l26
                    public final Object z(Object obj, Object obj2) {
                        int i111119 = i111118;
                        wef wefVar = wef.a;
                        int i1111110 = i;
                        switch (i111119) {
                            case 0:
                                ((Integer) obj2).getClass();
                                int iP = k99.P(i1111110 | 1);
                                uq1.l(j09Var17, f7, f8, f111115, xiVar3, z4, dd2Var17, (l46) obj, iP, i2);
                                break;
                            default:
                                ((Integer) obj2).getClass();
                                int iP2 = k99.P(i1111110 | 1);
                                uq1.l(j09Var17, f7, f8, f111115, xiVar3, z4, dd2Var17, (l46) obj, iP2, i2);
                                break;
                        }
                        return wefVar;
                    }
                };
                ojbVarV.d = l26Var;
            }
        }
        i3 |= 196608;
        z2 = z;
        if ((1572864 & i) == 0) {
            if (l46Var.i(dd2Var)) {
                i11 = 1048576;
            } else {
                i11 = 524288;
            }
            i3 |= i11;
        }
        i10 = i3;
        if ((599187 & i3) != 599186) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (l46Var.W(i10 & 1, z3)) {
            if (i13 != 0) {
                f9 = 20.0f;
            } else {
                f9 = f4;
            }
            if (i4 != 0) {
                f10 = 20.0f;
            } else {
                f10 = f5;
            }
            if (i6 != 0) {
                xiVar4 = ndb.Y;
            } else {
                xiVar4 = xiVar2;
            }
            if (i8 != 0) {
                z2 = false;
            }
            if (z2) {
                l46Var.f0(-548219291);
                boolean zF16 = k8b.f((e8b) l46Var.k(l8b.a));
                r10 = 0;
                l46Var.r(false);
                z5 = zF16;
            } else {
                r10 = 0;
                l46Var.f0(185072400);
                l46Var.r(false);
                z5 = false;
            }
            if (z5) {
                l46Var.f0(185092369);
                j09 j09VarC16 = b.c(j09Var, 1.0f);
                uc0 uc0Var16 = new uc0(f3, true, new qc0(r10));
                int i111119 = ((i10 >> 6) & 896) | ((i10 >> 9) & 7168);
                c92 c92VarA16 = a92.a(uc0Var16, xiVar4, l46Var, (i111119 >> 3) & 112);
                int iHashCode16 = Long.hashCode(l46Var.T);
                u8a u8aVarM16 = l46Var.m();
                j09 j09VarJ16 = m93.J(l46Var, j09VarC16);
                lf2.q.getClass();
                l46Var.j0();
                if (l46Var.S) {
                    l46Var.l(LayoutNode.h1);
                } else {
                    l46Var.s0();
                }
                dec.l(hj6.z, l46Var, c92VarA16);
                dec.l(hj6.y, l46Var, u8aVarM16);
                dec.l(hj6.X, l46Var, Integer.valueOf(iHashCode16));
                dec.k(l46Var);
                dec.l(hj6.x, l46Var, j09VarJ16);
                ks0.q(((i111119 >> 6) & 112) | 6, dd2Var, e92.a, l46Var, true);
                l46Var.r(false);
                ojbVarV = l46Var.v();
                if (ojbVarV != null) {
                    return;
                }
                final int i1111110 = 0;
                final boolean z1116 = z2;
                l26Var = new l26() { // from class: fq1
                    @Override // defpackage.l26
                    public final Object z(Object obj, Object obj2) {
                        int i1111111 = i1111110;
                        wef wefVar = wef.a;
                        int i1111112 = i;
                        switch (i1111111) {
                            case 0:
                                ((Integer) obj2).getClass();
                                int iP = k99.P(i1111112 | 1);
                                uq1.l(j09Var, f9, f10, f3, xiVar4, z1116, dd2Var, (l46) obj, iP, i2);
                                break;
                            default:
                                ((Integer) obj2).getClass();
                                int iP2 = k99.P(i1111112 | 1);
                                uq1.l(j09Var, f9, f10, f3, xiVar4, z1116, dd2Var, (l46) obj, iP2, i2);
                                break;
                        }
                        return wefVar;
                    }
                };
            } else {
                j09Var2 = j09Var;
                float f111116 = f9;
                f6 = f3;
                dd2Var2 = dd2Var;
                boolean z1117 = z2;
                final float f111117 = f10;
                final xi xiVar110 = xiVar4;
                l46Var.f0(185300906);
                l46Var.r(r10);
                pr4Var = l8b.a;
                j = ((e8b) l46Var.k(pr4Var)).c;
                if (if9.B(l46Var)) {
                    l46Var.f0(-548197909);
                    jC = ((e8b) l46Var.k(pr4Var)).f;
                    l46Var.r(false);
                } else {
                    l46Var.f0(-548197111);
                    l46Var.r(false);
                    jC = abg.c(2063597567);
                }
                if (!we6.e(l46Var)) {
                    j = jC;
                }
                j2 = ((e8b) l46Var.k(pr4Var)).z;
                j3 = ((e8b) l46Var.k(pr4Var)).d;
                if (we6.e(l46Var)) {
                    j3 = j2;
                }
                bzd.d(b.c(j09Var2, 1.0f), a7c.b(f111116), z5c.p(j, 0L, l46Var, 24576, 14), null, x57.b(j3, 0.5f), af1.b0(1985143846, new n26() { // from class: gq1
                    @Override // defpackage.n26
                    public final Object m(Object obj, Object obj2, Object obj3) {
                        l46 l46Var2 = (l46) obj2;
                        int iIntValue = ((Integer) obj3).intValue();
                        ((d92) obj).getClass();
                        if (l46Var2.W(iIntValue & 1, (iIntValue & 17) != 16)) {
                            j09 j09VarZ = ynb.Z(b.c(g09.a, 1.0f), f111117);
                            c92 c92VarA17 = a92.a(new uc0(f6, true, new qc0(0)), xiVar110, l46Var2, 0);
                            int iHashCode17 = Long.hashCode(l46Var2.T);
                            u8a u8aVarM17 = l46Var2.m();
                            j09 j09VarJ17 = m93.J(l46Var2, j09VarZ);
                            lf2.q.getClass();
                            l46Var2.j0();
                            if (l46Var2.S) {
                                l46Var2.l(LayoutNode.h1);
                            } else {
                                l46Var2.s0();
                            }
                            dec.l(hj6.z, l46Var2, c92VarA17);
                            dec.l(hj6.y, l46Var2, u8aVarM17);
                            dec.l(hj6.X, l46Var2, Integer.valueOf(iHashCode17));
                            dec.k(l46Var2);
                            dec.l(hj6.x, l46Var2, j09VarJ17);
                            ks0.q(6, dd2Var2, e92.a, l46Var2, true);
                        } else {
                            l46Var2.Z();
                        }
                        return wef.a;
                    }
                }, l46Var), l46Var, 196608, 8);
                xiVar3 = xiVar110;
                f7 = f111116;
                f8 = f111117;
                z4 = z1117;
            }
            ojbVarV.d = l26Var;
        }
        j09Var2 = j09Var;
        f6 = f3;
        dd2Var2 = dd2Var;
        l46Var.Z();
        f7 = f4;
        f8 = f5;
        xiVar3 = xiVar2;
        z4 = z2;
        ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            final int i1111111 = 1;
            final j09 j09Var18 = j09Var2;
            final float f111118 = f6;
            final dd2 dd2Var18 = dd2Var2;
            l26Var = new l26() { // from class: fq1
                @Override // defpackage.l26
                public final Object z(Object obj, Object obj2) {
                    int i1111112 = i1111111;
                    wef wefVar = wef.a;
                    int i1111113 = i;
                    switch (i1111112) {
                        case 0:
                            ((Integer) obj2).getClass();
                            int iP = k99.P(i1111113 | 1);
                            uq1.l(j09Var18, f7, f8, f111118, xiVar3, z4, dd2Var18, (l46) obj, iP, i2);
                            break;
                        default:
                            ((Integer) obj2).getClass();
                            int iP2 = k99.P(i1111113 | 1);
                            uq1.l(j09Var18, f7, f8, f111118, xiVar3, z4, dd2Var18, (l46) obj, iP2, i2);
                            break;
                    }
                    return wefVar;
                }
            };
            ojbVarV.d = l26Var;
        }
    }

    public static final void m(TarotCardType tarotCardType, String str, TarotSkinIdentify tarotSkinIdentify, x16 x16Var, j09 j09Var, l46 l46Var, int i) {
        l46Var.h0(-665965116);
        int i2 = i | (l46Var.e(tarotCardType == null ? -1 : tarotCardType.ordinal()) ? 4 : 2) | (l46Var.g(str) ? 32 : 16) | (l46Var.e(tarotSkinIdentify.ordinal()) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) | (l46Var.i(x16Var) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE) | (l46Var.g(j09Var) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE);
        if (l46Var.W(i2 & 1, (i2 & 9363) != 9362)) {
            l(j09Var, we6.e(l46Var) ? 8.0f : 20.0f, 32.0f, 0.0f, ndb.Z, false, af1.b0(411496024, new sz7(tarotCardType, tarotSkinIdentify, x16Var, str, 3), l46Var), l46Var, ((i2 >> 12) & 14) | 1600896, 32);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new cm(tarotCardType, str, tarotSkinIdentify, x16Var, j09Var, i);
        }
    }

    public static final void n(bod bodVar, TarotCardType tarotCardType, l46 l46Var, int i) {
        boolean requiresDownload;
        l46Var.h0(-2040190567);
        int i2 = (l46Var.g(bodVar) ? 4 : 2) | i | (l46Var.e(tarotCardType == null ? -1 : tarotCardType.ordinal()) ? 32 : 16);
        if (l46Var.W(i2 & 1, (i2 & 19) != 18)) {
            nmd nmdVar = bodVar.b;
            TarotSkinIdentify tarotSkinIdentify = bodVar.a;
            int iOrdinal = nmdVar.ordinal();
            if (iOrdinal == 2 || iOrdinal == 3) {
                requiresDownload = true;
            } else {
                requiresDownload = iOrdinal != 4 ? false : tarotSkinIdentify.getRequiresDownload();
            }
            if (requiresDownload) {
                l46Var.f0(-1234694257);
                feg.j(od4.A(hfc.q(tarotSkinIdentify).c(), 0, l46Var), null, oa7.E(b.c, a7c.b(8.0f)), null, an2.a, 0.0f, null, l46Var, 24632, 104);
                l46Var.r(false);
            } else if (tarotCardType != null) {
                l46Var.f0(-1234418543);
                o7c.d(b.c, new qhe(tarotCardType.getCardKey(), 1), bodVar.a, false, null, 8.0f, null, false, l46Var, 199686, 208);
                l46Var.r(false);
            } else {
                l46Var.f0(-1234166482);
                feg.j(od4.A(hfc.q(tarotSkinIdentify).k(), 0, l46Var), null, oa7.E(b.c, a7c.b(8.0f)), null, an2.b, 0.0f, null, l46Var, 24632, 104);
                l46Var.r(false);
            }
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new h8(bodVar, tarotCardType, i, 10);
        }
    }

    public static final void o(bod bodVar, x16 x16Var, l46 l46Var, int i) {
        l46 l46Var2 = l46Var;
        l46Var2.h0(-1771631705);
        int i2 = i | (l46Var2.g(bodVar) ? 4 : 2);
        if ((i & 48) == 0) {
            i2 |= l46Var2.i(x16Var) ? 32 : 16;
        }
        if (l46Var2.W(i2 & 1, (i2 & 19) != 18)) {
            int iOrdinal = bodVar.b.ordinal();
            if (iOrdinal == 0 || iOrdinal == 1) {
                l46Var2.f0(-1731014293);
                l46Var2.r(false);
            } else {
                g09 g09Var = g09.a;
                if (iOrdinal == 2) {
                    l46Var2.f0(-2121778396);
                    gx6 gx6VarB = feg.l;
                    if (gx6VarB == null) {
                        fx6 fx6Var = new fx6("Filled.Download", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        int i3 = msf.a;
                        dtd dtdVar = new dtd(y72.b);
                        s71 s71Var = new s71(1);
                        s71Var.p(5.0f, 20.0f);
                        s71Var.m(14.0f);
                        s71Var.t(-2.0f);
                        s71Var.l(5.0f);
                        s71Var.s(20.0f);
                        s71Var.h();
                        s71Var.p(19.0f, 9.0f);
                        s71Var.m(-4.0f);
                        s71Var.s(3.0f);
                        s71Var.l(9.0f);
                        s71Var.t(6.0f);
                        s71Var.l(5.0f);
                        s71Var.o(7.0f, 7.0f);
                        s71Var.n(19.0f, 9.0f);
                        s71Var.h();
                        fx6.a(fx6Var, s71Var.b, dtdVar, 1.0f, 1.0f, 2, 1.0f);
                        gx6VarB = fx6Var.b();
                        feg.l = gx6VarB;
                    }
                    gu6.a(gx6VarB, null, androidx.compose.foundation.b.c(b.l(g09Var, 20.0f), false, null, null, x16Var, 15), y72.b(((e8b) l46Var2.k(l8b.a)).q, 0.72f), l46Var2, 48, 0);
                    l46Var2.r(false);
                } else if (iOrdinal == 3) {
                    l46Var2.f0(-2121487864);
                    boolean z = (i2 & 14) == 4;
                    Object objR = l46Var2.R();
                    i8c i8cVar = sf2.a;
                    if (z || objR == i8cVar) {
                        objR = new p(22, bodVar);
                        l46Var2.p0(objR);
                    }
                    x16 x16Var2 = (x16) objR;
                    j09 j09VarD = b.d(ynb.b0(4.0f, 0.0f, b.c(g09Var, 1.0f), 2), 20.0f);
                    pr4 pr4Var = l8b.a;
                    long j = ((e8b) l46Var2.k(pr4Var)).u;
                    long jB = y72.b(((e8b) l46Var2.k(pr4Var)).u, 0.2f);
                    Object objR2 = l46Var2.R();
                    if (objR2 == i8cVar) {
                        objR2 = new wu0(18);
                        l46Var2.p0(objR2);
                    }
                    axa.c(x16Var2, j09VarD, j, jB, 1, 0.0f, (a26) objR2, l46Var2, 1769520, 0);
                    l46Var2.r(false);
                } else {
                    if (iOrdinal != 4) {
                        throw tec.d(-1731015329, l46Var2, false);
                    }
                    l46Var2.f0(-2121044378);
                    t7c t7cVarA = s7c.a(new uc0(2.0f, true, new qc0(0)), ndb.z, l46Var2, 54);
                    int iHashCode = Long.hashCode(l46Var2.T);
                    u8a u8aVarM = l46Var2.m();
                    j09 j09VarJ = m93.J(l46Var2, g09Var);
                    lf2.q.getClass();
                    l46Var2.j0();
                    if (l46Var2.S) {
                        l46Var2.l(LayoutNode.h1);
                    } else {
                        l46Var2.s0();
                    }
                    dec.l(hj6.z, l46Var2, t7cVarA);
                    dec.l(hj6.y, l46Var2, u8aVarM);
                    dec.l(hj6.X, l46Var2, Integer.valueOf(iHashCode));
                    dec.k(l46Var2);
                    dec.l(hj6.x, l46Var2, j09VarJ);
                    fy9 fy9VarA = od4.A(R.drawable.deck_label_lock, 0, l46Var2);
                    j09 j09VarL = b.l(g09Var, 16.0f);
                    pr4 pr4Var2 = o82.a;
                    gu6.b(fy9VarA, null, j09VarL, y72.b(((m82) l46Var2.k(pr4Var2)).q, 0.5f), l46Var2, 440, 0);
                    nte.b(afc.q(R.string.daily_fortune_locked, l46Var2), null, y72.b(((m82) l46Var2.k(pr4Var2)).q, 0.5f), 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((p9f) l46Var2.k(r9f.a)).o, l46Var, 0, 0, 131066);
                    l46Var2 = l46Var;
                    l46Var2.r(true);
                    l46Var2.r(false);
                }
            }
        } else {
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new gc(bodVar, x16Var, i, 6);
        }
    }

    public static final void p(int i, l46 l46Var) {
        l46 l46Var2;
        l46Var.h0(1988637827);
        if (l46Var.W(i & 1, i != 0)) {
            l46Var2 = l46Var;
            gu6.a(vd0.V(), null, b.l(g09.a, 20.0f), y72.e, l46Var2, 3504, 0);
        } else {
            l46Var2 = l46Var;
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new ym0(i, 2);
        }
    }

    public static final int q(nmd nmdVar) {
        int iOrdinal = nmdVar.ordinal();
        if (iOrdinal == 0 || iOrdinal == 1) {
            return 0;
        }
        if (iOrdinal == 2 || iOrdinal == 3) {
            return 1;
        }
        if (iOrdinal == 4) {
            return 2;
        }
        ap.c();
        return 0;
    }
}
