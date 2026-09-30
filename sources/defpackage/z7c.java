package defpackage;

import ai.askquin.R;
import android.content.Context;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.b;
import androidx.compose.ui.node.LayoutNode;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import org.xmlpull.v1.XmlPullParser;
import tech.chatmind.api.SpreadRecommendationResult;
import tech.chatmind.api.common.model.TarotCardRequestBody;
import tech.chatmind.api.personality.TarotCard;
import tech.chatmind.api.seasonal.model.SolarTerm;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class z7c {
    public static final int a = 9;
    public static final int b = 6;
    public static final int c = 10;
    public static final int d = 5;
    public static final int e = 15;
    public static final int f = 48;

    public static final void a(boolean z, x16 x16Var, x16 x16Var2, j09 j09Var, l46 l46Var, int i) {
        l46 l46Var2 = l46Var;
        l46Var2.h0(-994498714);
        int i2 = i | (l46Var2.h(z) ? 4 : 2) | (l46Var2.i(x16Var) ? 32 : 16) | (l46Var2.i(x16Var2) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) | (l46Var2.g(j09Var) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE);
        if (l46Var2.W(i2 & 1, (i2 & 1171) != 1170)) {
            j09 j09VarF = urg.F(j09Var, ia7.a);
            t7c t7cVarA = s7c.a(new uc0(8.0f, true, new qc0(0)), ndb.z, l46Var2, 54);
            int iHashCode = Long.hashCode(l46Var2.T);
            u8a u8aVarM = l46Var2.m();
            j09 j09VarJ = m93.J(l46Var2, j09VarF);
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
            if (1.0f <= 0.0d) {
                g37.a("invalid weight; must be greater than zero");
            }
            jw7 jw7Var = new jw7(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
            FillElement fillElement = b.b;
            j09 j09VarD = jw7Var.D(fillElement);
            bx9 bx9Var = v51.a;
            pr4 pr4Var = l8b.a;
            c8b.k(j09VarD, false, null, v51.a(((e8b) l46Var2.k(pr4Var)).g, bx5.d(l46Var2), 0L, 0L, l46Var2, 12), x57.b(bx5.d(l46Var), 1.0f), new bx9(8.0f, 16.0f, 8.0f, 16.0f), false, x16Var, jgb.l, l46Var, ((i2 << 18) & 29360128) | 100859904, 70);
            if (1.0f <= 0.0d) {
                g37.a("invalid weight; must be greater than zero");
            }
            c8b.k(new jw7(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true).D(fillElement), z, null, v51.a(bx5.b(l46Var).a, ((e8b) l46Var.k(pr4Var)).v, 0L, 0L, l46Var, 12), null, new bx9(8.0f, 16.0f, 8.0f, 16.0f), false, x16Var2, jgb.m, l46Var, ((i2 << 3) & 112) | 100859904 | ((i2 << 15) & 29360128), 84);
            l46Var2 = l46Var;
            l46Var2.r(true);
        } else {
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new o50(i, 19, x16Var, x16Var2, j09Var, z);
        }
    }

    public static final void b(final fpc fpcVar, final int i, final SolarTerm solarTerm, final boolean z, final boolean z2, final x16 x16Var, final x16 x16Var2, final x16 x16Var3, l46 l46Var, final int i2) {
        boolean z3;
        final String str;
        SolarTerm solarTerm2;
        ii6 ii6VarB0;
        Object obj;
        x16Var.getClass();
        x16Var2.getClass();
        x16Var3.getClass();
        l46Var.h0(1950407950);
        int i3 = i2 | (l46Var.g(fpcVar) ? 4 : 2) | (l46Var.e(i) ? 32 : 16) | (l46Var.e(solarTerm.ordinal()) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) | (l46Var.h(z) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE) | (l46Var.h(z2) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE) | (l46Var.i(x16Var) ? 131072 : 65536) | (l46Var.i(x16Var2) ? 1048576 : 524288) | (l46Var.i(x16Var3) ? 8388608 : 4194304);
        if (l46Var.W(i3 & 1, (4793491 & i3) != 4793490)) {
            int[] iArr = oic.a;
            String strD = iArr[solarTerm.ordinal()] == 3 ? "seasonal_reading_summary" : n3d.d(solarTerm, "summary");
            if (strD == null) {
                ojb ojbVarV = l46Var.v();
                if (ojbVarV != null) {
                    final int i4 = 0;
                    ojbVarV.d = new l26(fpcVar, i, solarTerm, z, z2, x16Var, x16Var2, x16Var3, i2, i4) { // from class: isc
                        public final /* synthetic */ int a;
                        public final /* synthetic */ fpc b;
                        public final /* synthetic */ int c;
                        public final /* synthetic */ SolarTerm d;
                        public final /* synthetic */ boolean e;
                        public final /* synthetic */ boolean f;
                        public final /* synthetic */ x16 g;
                        public final /* synthetic */ x16 v;
                        public final /* synthetic */ x16 w;

                        {
                            this.a = i4;
                        }

                        @Override // defpackage.l26
                        public final Object z(Object obj2, Object obj3) {
                            int i5 = this.a;
                            wef wefVar = wef.a;
                            switch (i5) {
                                case 0:
                                    ((Integer) obj3).getClass();
                                    int iP = k99.P(1);
                                    z7c.b(this.b, this.c, this.d, this.e, this.f, this.g, this.v, this.w, (l46) obj2, iP);
                                    break;
                                case 1:
                                    ((Integer) obj3).getClass();
                                    int iP2 = k99.P(1);
                                    z7c.b(this.b, this.c, this.d, this.e, this.f, this.g, this.v, this.w, (l46) obj2, iP2);
                                    break;
                                case 2:
                                    ((Integer) obj3).getClass();
                                    int iP3 = k99.P(1);
                                    z7c.b(this.b, this.c, this.d, this.e, this.f, this.g, this.v, this.w, (l46) obj2, iP3);
                                    break;
                                default:
                                    ((Integer) obj3).getClass();
                                    int iP4 = k99.P(1);
                                    z7c.b(this.b, this.c, this.d, this.e, this.f, this.g, this.v, this.w, (l46) obj2, iP4);
                                    break;
                            }
                            return wefVar;
                        }
                    };
                    return;
                }
                return;
            }
            final String strD2 = iArr[solarTerm.ordinal()] == 3 ? "seasonal_reading_replay" : n3d.d(solarTerm, "replay");
            if (strD2 == null) {
                ojb ojbVarV2 = l46Var.v();
                if (ojbVarV2 != null) {
                    final int i5 = 1;
                    ojbVarV2.d = new l26(fpcVar, i, solarTerm, z, z2, x16Var, x16Var2, x16Var3, i2, i5) { // from class: isc
                        public final /* synthetic */ int a;
                        public final /* synthetic */ fpc b;
                        public final /* synthetic */ int c;
                        public final /* synthetic */ SolarTerm d;
                        public final /* synthetic */ boolean e;
                        public final /* synthetic */ boolean f;
                        public final /* synthetic */ x16 g;
                        public final /* synthetic */ x16 v;
                        public final /* synthetic */ x16 w;

                        {
                            this.a = i5;
                        }

                        @Override // defpackage.l26
                        public final Object z(Object obj2, Object obj3) {
                            int i6 = this.a;
                            wef wefVar = wef.a;
                            switch (i6) {
                                case 0:
                                    ((Integer) obj3).getClass();
                                    int iP = k99.P(1);
                                    z7c.b(this.b, this.c, this.d, this.e, this.f, this.g, this.v, this.w, (l46) obj2, iP);
                                    break;
                                case 1:
                                    ((Integer) obj3).getClass();
                                    int iP2 = k99.P(1);
                                    z7c.b(this.b, this.c, this.d, this.e, this.f, this.g, this.v, this.w, (l46) obj2, iP2);
                                    break;
                                case 2:
                                    ((Integer) obj3).getClass();
                                    int iP3 = k99.P(1);
                                    z7c.b(this.b, this.c, this.d, this.e, this.f, this.g, this.v, this.w, (l46) obj2, iP3);
                                    break;
                                default:
                                    ((Integer) obj3).getClass();
                                    int iP4 = k99.P(1);
                                    z7c.b(this.b, this.c, this.d, this.e, this.f, this.g, this.v, this.w, (l46) obj2, iP4);
                                    break;
                            }
                            return wefVar;
                        }
                    };
                    return;
                }
                return;
            }
            final String strE = n3d.e(i, solarTerm);
            if (strE == null) {
                ojb ojbVarV3 = l46Var.v();
                if (ojbVarV3 != null) {
                    final int i6 = 2;
                    ojbVarV3.d = new l26(fpcVar, i, solarTerm, z, z2, x16Var, x16Var2, x16Var3, i2, i6) { // from class: isc
                        public final /* synthetic */ int a;
                        public final /* synthetic */ fpc b;
                        public final /* synthetic */ int c;
                        public final /* synthetic */ SolarTerm d;
                        public final /* synthetic */ boolean e;
                        public final /* synthetic */ boolean f;
                        public final /* synthetic */ x16 g;
                        public final /* synthetic */ x16 v;
                        public final /* synthetic */ x16 w;

                        {
                            this.a = i6;
                        }

                        @Override // defpackage.l26
                        public final Object z(Object obj2, Object obj3) {
                            int i7 = this.a;
                            wef wefVar = wef.a;
                            switch (i7) {
                                case 0:
                                    ((Integer) obj3).getClass();
                                    int iP = k99.P(1);
                                    z7c.b(this.b, this.c, this.d, this.e, this.f, this.g, this.v, this.w, (l46) obj2, iP);
                                    break;
                                case 1:
                                    ((Integer) obj3).getClass();
                                    int iP2 = k99.P(1);
                                    z7c.b(this.b, this.c, this.d, this.e, this.f, this.g, this.v, this.w, (l46) obj2, iP2);
                                    break;
                                case 2:
                                    ((Integer) obj3).getClass();
                                    int iP3 = k99.P(1);
                                    z7c.b(this.b, this.c, this.d, this.e, this.f, this.g, this.v, this.w, (l46) obj2, iP3);
                                    break;
                                default:
                                    ((Integer) obj3).getClass();
                                    int iP4 = k99.P(1);
                                    z7c.b(this.b, this.c, this.d, this.e, this.f, this.g, this.v, this.w, (l46) obj2, iP4);
                                    break;
                            }
                            return wefVar;
                        }
                    };
                    return;
                }
                return;
            }
            z3 = z;
            Object objR = l46Var.R();
            Object obj2 = sf2.a;
            if (objR == obj2) {
                objR = q1c.f(Boolean.FALSE);
                l46Var.p0(objR);
            }
            e89 e89Var = (e89) objR;
            boolean zG = ((57344 & i3) == 16384) | ((i3 & 896) == 256) | l46Var.g(strD);
            Object objR2 = l46Var.R();
            if (zG || objR2 == obj2) {
                String str2 = strD;
                Object nt5Var = new nt5(z2, solarTerm, str2, e89Var, 6);
                str = str2;
                solarTerm2 = solarTerm;
                l46Var.p0(nt5Var);
                objR2 = nt5Var;
            } else {
                solarTerm2 = solarTerm;
                str = strD;
            }
            final x16 x16Var4 = (x16) objR2;
            if (solarTerm2 == SolarTerm.AUTUMN_EQUINOX) {
                l46Var.f0(1736323745);
                ii6VarB0 = g21.b0(l46Var);
                l46Var.r(false);
            } else {
                l46Var.f0(-2008514417);
                l46Var.r(false);
                ii6VarB0 = null;
            }
            final ii6 ii6Var = ii6VarB0;
            final SolarTerm solarTerm3 = solarTerm2;
            g21.o(ii6Var, af1.b0(2066159410, new n26() { // from class: jsc
                @Override // defpackage.n26
                public final Object m(Object obj3, Object obj4, Object obj5) {
                    l46 l46Var2 = (l46) obj4;
                    int iIntValue = ((Integer) obj5).intValue();
                    ((c31) obj3).getClass();
                    if (l46Var2.W(iIntValue & 1, (iIntValue & 17) != 16)) {
                        long j = y72.j;
                        x16 x16Var5 = x16Var;
                        SolarTerm solarTerm4 = solarTerm3;
                        x16 x16Var6 = x16Var4;
                        fpc fpcVar2 = fpcVar;
                        xdc.a(null, af1.b0(1839609846, new r19(x16Var5, solarTerm4, x16Var6, fpcVar2, 14), l46Var2), af1.b0(1725999351, new dj3(fpcVar2, z2, strD2, str, strE, x16Var2, x16Var6), l46Var2), null, null, 0, j, 0L, null, af1.b0(-1139189823, new j41(fpcVar2, ii6Var, x16Var3, 21), l46Var2), l46Var2, 806879664, 441);
                    } else {
                        l46Var2.Z();
                    }
                    return wef.a;
                }
            }, l46Var), l46Var, 48, 0);
            int i7 = 6;
            if (fpcVar != null) {
                l46Var.f0(-2005844975);
                boolean zBooleanValue = ((Boolean) e89Var.getValue()).booleanValue();
                Object objR3 = l46Var.R();
                obj = obj2;
                if (objR3 == obj) {
                    objR3 = new xfc(e89Var, i7);
                    l46Var.p0(objR3);
                }
                o7c.f(zBooleanValue, (x16) objR3, fpcVar, null, l46Var, 48 | ((i3 << 6) & 896), 8);
                l46Var.r(false);
            } else {
                obj = obj2;
                l46Var.f0(-2005719084);
                l46Var.r(false);
            }
            if (z2) {
                l46Var.f0(-2005686038);
                boolean zG2 = l46Var.g(str) | ((i3 & 7168) == 2048) | l46Var.g(strE);
                Object objR4 = l46Var.R();
                if (zG2 || objR4 == obj) {
                    objR4 = new so2(str, z3, strE, 8);
                    l46Var.p0(objR4);
                }
                dec.b("page_view", (a26) objR4, l46Var, 6);
                l46Var.r(false);
            } else {
                l46Var.f0(-2005461164);
                l46Var.r(false);
            }
        } else {
            z3 = z;
            l46Var.Z();
        }
        ojb ojbVarV4 = l46Var.v();
        if (ojbVarV4 != null) {
            final int i8 = 3;
            final boolean z4 = z3;
            ojbVarV4.d = new l26(fpcVar, i, solarTerm, z4, z2, x16Var, x16Var2, x16Var3, i2, i8) { // from class: isc
                public final /* synthetic */ int a;
                public final /* synthetic */ fpc b;
                public final /* synthetic */ int c;
                public final /* synthetic */ SolarTerm d;
                public final /* synthetic */ boolean e;
                public final /* synthetic */ boolean f;
                public final /* synthetic */ x16 g;
                public final /* synthetic */ x16 v;
                public final /* synthetic */ x16 w;

                {
                    this.a = i8;
                }

                @Override // defpackage.l26
                public final Object z(Object obj3, Object obj4) {
                    int i9 = this.a;
                    wef wefVar = wef.a;
                    switch (i9) {
                        case 0:
                            ((Integer) obj4).getClass();
                            int iP = k99.P(1);
                            z7c.b(this.b, this.c, this.d, this.e, this.f, this.g, this.v, this.w, (l46) obj3, iP);
                            break;
                        case 1:
                            ((Integer) obj4).getClass();
                            int iP2 = k99.P(1);
                            z7c.b(this.b, this.c, this.d, this.e, this.f, this.g, this.v, this.w, (l46) obj3, iP2);
                            break;
                        case 2:
                            ((Integer) obj4).getClass();
                            int iP3 = k99.P(1);
                            z7c.b(this.b, this.c, this.d, this.e, this.f, this.g, this.v, this.w, (l46) obj3, iP3);
                            break;
                        default:
                            ((Integer) obj4).getClass();
                            int iP4 = k99.P(1);
                            z7c.b(this.b, this.c, this.d, this.e, this.f, this.g, this.v, this.w, (l46) obj3, iP4);
                            break;
                    }
                    return wefVar;
                }
            };
        }
    }

    public static final void c(j09 j09Var, final dvd dvdVar, List list, boolean z, final suc sucVar, float f2, a26 a26Var, final a26 a26Var2, l46 l46Var, int i, int i2) {
        int i3;
        boolean z2;
        float f3;
        a26 a26Var3;
        List list2;
        float f4;
        List list3;
        a26 a26Var4;
        a26Var2.getClass();
        l46Var.h0(1172439045);
        if ((i & 6) == 0) {
            i3 = (l46Var.g(j09Var) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= l46Var.h(false) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= (i & 512) == 0 ? l46Var.g(dvdVar) : l46Var.i(dvdVar) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        int i4 = i2 & 8;
        if (i4 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            i3 |= (i & 4096) == 0 ? l46Var.g(list) : l46Var.i(list) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE;
        }
        if ((i & 24576) == 0) {
            z2 = z;
            i3 |= l46Var.h(z2) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE;
        } else {
            z2 = z;
        }
        if ((i & 196608) == 0) {
            i3 |= (i & 262144) == 0 ? l46Var.g(sucVar) : l46Var.i(sucVar) ? 131072 : 65536;
        }
        int i5 = i2 & 64;
        if (i5 != 0) {
            i3 |= 1572864;
            f3 = f2;
        } else {
            f3 = f2;
            if ((i & 1572864) == 0) {
                i3 |= l46Var.d(f3) ? 1048576 : 524288;
            }
        }
        int i6 = i2 & UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        if (i6 != 0) {
            i3 |= 12582912;
            a26Var3 = a26Var;
        } else {
            a26Var3 = a26Var;
            if ((i & 12582912) == 0) {
                i3 |= l46Var.i(a26Var3) ? 8388608 : 4194304;
            }
        }
        if ((i & 100663296) == 0) {
            i3 |= l46Var.i(a26Var2) ? 67108864 : 33554432;
        }
        if (l46Var.W(i3 & 1, (i3 & 38347923) != 38347922)) {
            List list4 = i4 != 0 ? pu4.a : list;
            if (i5 != 0) {
                f3 = 12.0f;
            }
            i8c i8cVar = sf2.a;
            if (i6 != 0) {
                Object objR = l46Var.R();
                if (objR == i8cVar) {
                    objR = new znd(4);
                    l46Var.p0(objR);
                }
                a26Var3 = (a26) objR;
            }
            boolean zF = k8b.f((e8b) l46Var.k(l8b.a));
            float f5 = zF ? 24.0f : 20.0f;
            final a26 a26Var5 = a26Var3;
            uc0 uc0Var = new uc0(zF ? 0.0f : 16.0f, true, new qc0(0));
            jx0 jx0Var = ndb.Y;
            bx9 bx9Var = new bx9(zF ? 0.0f : 20.0f, 12.0f, zF ? 0.0f : 20.0f, f3);
            final float f6 = f5;
            boolean zD = ((458752 & i3) == 131072 || ((i3 & 262144) != 0 && l46Var.i(sucVar))) | ((i3 & 7168) == 2048 || ((i3 & 4096) != 0 && l46Var.i(list4))) | l46Var.d(f6) | ((57344 & i3) == 16384) | ((29360128 & i3) == 8388608) | ((i3 & 896) == 256 || ((i3 & 512) != 0 && l46Var.i(dvdVar))) | ((234881024 & i3) == 67108864) | ((i3 & 112) == 32);
            Object objR2 = l46Var.R();
            if (zD || objR2 == i8cVar) {
                final List list5 = list4;
                final boolean z3 = z2;
                a26 a26Var6 = new a26() { // from class: ovd
                    @Override // defpackage.a26
                    public final Object d(Object obj) {
                        boolean z4;
                        dvd dvdVar2;
                        v08 v08Var = (v08) obj;
                        v08Var.getClass();
                        List list6 = list5;
                        boolean zIsEmpty = list6.isEmpty();
                        final float f7 = f6;
                        suc sucVar2 = sucVar;
                        boolean z5 = z3;
                        int i7 = 1;
                        if (!zIsEmpty) {
                            v08.W(v08Var, null, new dd2(new fp4(i7, f7), true, 1425229013), 3);
                            int i8 = 0;
                            for (Object obj2 : list6) {
                                int i9 = i8 + 1;
                                if (i8 < 0) {
                                    t72.Z();
                                    throw null;
                                }
                                boolean z6 = z5;
                                suc sucVar3 = sucVar2;
                                v08.W(v08Var, null, new dd2(new kvd((SpreadRecommendationResult) obj2, sucVar3, i8, z6, a26Var5, 1), true, -1666504921), 3);
                                sucVar2 = sucVar3;
                                z5 = z6;
                                i8 = i9;
                            }
                        }
                        boolean z7 = z5;
                        boolean zIsEmpty2 = list6.isEmpty();
                        suc sucVar4 = sucVar2;
                        a26 a26Var7 = a26Var2;
                        if (!zIsEmpty2 || (dvdVar2 = dvdVar) == null) {
                            z4 = true;
                        } else {
                            z4 = true;
                            v08.W(v08Var, null, new dd2(new nvd(f7, dvdVar2, sucVar4, a26Var7, 1), true, -1395631172), 3);
                        }
                        LinkedHashMap linkedHashMap = new LinkedHashMap();
                        for (Object obj3 : ale.d) {
                            Integer numValueOf = Integer.valueOf(((ale) obj3).e());
                            Object arrayList = linkedHashMap.get(numValueOf);
                            if (arrayList == null) {
                                arrayList = new ArrayList();
                                linkedHashMap.put(numValueOf, arrayList);
                            }
                            ((List) arrayList).add(obj3);
                        }
                        for (Map.Entry entry : linkedHashMap.entrySet()) {
                            final int iIntValue = ((Number) entry.getKey()).intValue();
                            List list7 = (List) entry.getValue();
                            v08.W(v08Var, null, new dd2(new n26() { // from class: pvd
                                @Override // defpackage.n26
                                public final Object m(Object obj4, Object obj5, Object obj6) {
                                    l46 l46Var2 = (l46) obj5;
                                    int iIntValue2 = ((Integer) obj6).intValue();
                                    ((mx7) obj4).getClass();
                                    if (l46Var2.W(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                                        z7c.e(f7, iIntValue, 0, l46Var2, null);
                                    } else {
                                        l46Var2.Z();
                                    }
                                    return wef.a;
                                }
                            }, z4, 1653505173), 3);
                            int size = list7.size();
                            int i10 = 0;
                            while (i10 < size) {
                                int i11 = i10;
                                suc sucVar5 = sucVar4;
                                boolean z8 = z7;
                                lvd lvdVar = new lvd((ale) list7.get(i10), z8, sucVar5, a26Var7, 1);
                                sucVar4 = sucVar5;
                                v08.W(v08Var, null, new dd2(lvdVar, z4, -1561615541), 3);
                                i10 = i11 + 1;
                                z7 = z8;
                                a26Var7 = a26Var7;
                            }
                        }
                        return wef.a;
                    }
                };
                list3 = list5;
                a26Var4 = a26Var5;
                l46Var.p0(a26Var6);
                objR2 = a26Var6;
            } else {
                a26Var4 = a26Var5;
                list3 = list4;
            }
            af1.s(j09Var, null, bx9Var, uc0Var, jx0Var, null, false, null, (a26) objR2, l46Var, (i3 & 14) | 196608, 458);
            list2 = list3;
            f4 = f3;
            a26Var3 = a26Var4;
        } else {
            l46Var.Z();
            list2 = list;
            f4 = f3;
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new zs1(j09Var, dvdVar, list2, z, sucVar, f4, a26Var3, a26Var2, i, i2);
        }
    }

    public static final void d(j09 j09Var, long j, final dvd dvdVar, final boolean z, final List list, final boolean z2, final suc sucVar, final a26 a26Var, final a26 a26Var2, l46 l46Var, final int i) {
        final j09 j09Var2;
        final long j2;
        long jR;
        long j3;
        j09 j09Var3;
        a26Var2.getClass();
        l46Var.h0(-263271025);
        int i2 = i | 22 | (l46Var.g(dvdVar) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) | (l46Var.h(z) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE) | (l46Var.g(list) ? 131072 : 65536) | (l46Var.h(z2) ? 1048576 : 524288) | (l46Var.g(sucVar) ? 8388608 : 4194304) | (l46Var.i(a26Var) ? 67108864 : 33554432) | (l46Var.i(a26Var2) ? 536870912 : 268435456);
        if (l46Var.W(i2 & 1, (306783379 & i2) != 306783378)) {
            l46Var.b0();
            if ((i & 1) == 0 || l46Var.C()) {
                pr4 pr4Var = l8b.a;
                if (k8b.f((e8b) l46Var.k(pr4Var))) {
                    l46Var.f0(399620152);
                    jR = ((e8b) l46Var.k(pr4Var)).c;
                    l46Var.r(false);
                } else {
                    l46Var.f0(399621556);
                    jR = abg.r(((e8b) l46Var.k(pr4Var)).g, ((e8b) l46Var.k(pr4Var)).a);
                    l46Var.r(false);
                }
                j3 = jR;
                j09Var3 = g09.a;
            } else {
                l46Var.Z();
                j09Var3 = j09Var;
                j3 = j;
            }
            l46Var.s();
            j09 j09Var4 = j09Var3;
            long j4 = j3;
            xdc.a(null, qk2.X, null, null, null, 0, j4, 0L, null, af1.b0(1505269344, new dlc(z, j09Var3, dvdVar, list, z2, sucVar, a26Var, a26Var2), l46Var), l46Var, 805306416, 445);
            j2 = j4;
            j09Var2 = j09Var4;
        } else {
            l46Var.Z();
            j09Var2 = j09Var;
            j2 = j;
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new l26(j2, dvdVar, z, list, z2, sucVar, a26Var, a26Var2, i) { // from class: qvd
                public final /* synthetic */ long b;
                public final /* synthetic */ dvd c;
                public final /* synthetic */ boolean d;
                public final /* synthetic */ List e;
                public final /* synthetic */ boolean f;
                public final /* synthetic */ suc g;
                public final /* synthetic */ a26 v;
                public final /* synthetic */ a26 w;

                @Override // defpackage.l26
                public final Object z(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iP = k99.P(3073);
                    z7c.d(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.v, this.w, (l46) obj, iP);
                    return wef.a;
                }
            };
        }
    }

    public static final void e(float f2, final int i, final int i2, l46 l46Var, final j09 j09Var) {
        final float f3;
        l46 l46Var2;
        String strR;
        l46Var.h0(1988446205);
        int i3 = i2 | 6 | (l46Var.e(i) ? 32 : 16) | (l46Var.d(f2) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS);
        if (l46Var.W(i3 & 1, (i3 & 147) != 146)) {
            if (i == 1) {
                strR = tec.i(l46Var, -363639223, R.string.spread_group_single, l46Var, false);
            } else {
                l46Var.f0(-363637397);
                strR = afc.r(R.string.spread_group_n, new Object[]{Integer.valueOf(i)}, l46Var);
                l46Var.r(false);
            }
            String str = strR;
            g09 g09Var = g09.a;
            f3 = f2;
            l46Var2 = l46Var;
            f(g09Var, str, f3, l46Var2, i3 & 910, 0);
            j09Var = g09Var;
        } else {
            f3 = f2;
            l46Var2 = l46Var;
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new l26(f3, i, i2, j09Var) { // from class: mvd
                public final /* synthetic */ j09 a;
                public final /* synthetic */ int b;
                public final /* synthetic */ float c;

                {
                    this.a = j09Var;
                }

                @Override // defpackage.l26
                public final Object z(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iP = k99.P(1);
                    z7c.e(this.c, this.b, iP, (l46) obj, this.a);
                    return wef.a;
                }
            };
        }
    }

    public static final void f(j09 j09Var, String str, float f2, l46 l46Var, int i, int i2) {
        j09 j09Var2;
        int i3;
        j09 j09Var3;
        long j;
        l46Var.h0(-1704264563);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            j09Var2 = j09Var;
        } else if ((i & 6) == 0) {
            j09Var2 = j09Var;
            i3 = (l46Var.g(j09Var2) ? 4 : 2) | i;
        } else {
            j09Var2 = j09Var;
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= l46Var.g(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= l46Var.d(f2) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        if (l46Var.W(i3 & 1, (i3 & 147) != 146)) {
            j09Var3 = i4 != 0 ? g09.a : j09Var2;
            j09 j09VarD0 = ynb.d0(0.0f, 12.0f, 0.0f, 0.0f, 13, k8b.h(ynb.b0(f2, 0.0f, j09Var3, 2), new agb(7), l46Var, 0));
            long jL = w6c.l(17);
            ar5 ar5Var = ar5.d;
            pr4 pr4Var = l8b.a;
            int iOrdinal = ((e8b) l46Var.k(pr4Var)).C.ordinal();
            if (iOrdinal == 0) {
                l46Var.f0(-1415690629);
                j = ((e8b) l46Var.k(pr4Var)).q;
                l46Var.r(false);
            } else {
                if (iOrdinal != 1) {
                    throw tec.d(-1415693205, l46Var, false);
                }
                l46Var.f0(-1415688964);
                j = ((e8b) l46Var.k(pr4Var)).s;
                l46Var.r(false);
            }
            nte.b(str, j09VarD0, j, jL, ar5Var, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, l46Var, ((i3 >> 3) & 14) | 1597440, 0, 262056);
        } else {
            l46Var.Z();
            j09Var3 = j09Var2;
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new tz5(j09Var3, str, f2, i, i2);
        }
    }

    public static final void g(x16 x16Var, l46 l46Var, int i) {
        x16 x16Var2;
        l46 l46Var2;
        x16Var.getClass();
        l46Var.h0(2079208779);
        int i2 = (l46Var.i(x16Var) ? 4 : 2) | i;
        if (l46Var.W(i2 & 1, (i2 & 3) != 2)) {
            pwf pwfVarA = qd8.a(l46Var);
            if (pwfVarA == null) {
                qc0.p("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            } else {
                x16Var2 = x16Var;
                l46Var2 = l46Var;
                rs0.f(null, false, af1.b0(1201372936, new sz7(x16Var2, (lve) z5c.G(job.a.b(lve.class), pwfVarA.g(), null, b21.r(pwfVarA), kr7.b(l46Var), null), (Context) l46Var.k(uq.b), jzb.i(k8b.a, k8b.c(), l46Var, 0, 2), 19), l46Var), l46Var2, 384, 3);
            }
        } else {
            x16Var2 = x16Var;
            l46Var2 = l46Var;
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new fkc(i, 6, x16Var2);
        }
    }

    public static final void h(ctf ctfVar, oia oiaVar) {
        xj0 xj0Var = ctfVar.a;
        btf btfVar = (btf) xj0Var.c;
        btf btfVar2 = (btf) xj0Var.b;
        boolean zL = xo1.l(oiaVar);
        long j = oiaVar.b;
        if (zL) {
            qb3[] qb3VarArr = btfVar2.d;
            qd0.h0(0, qb3VarArr.length, null, qb3VarArr);
            btfVar2.e = 0;
            qb3[] qb3VarArr2 = btfVar.d;
            qd0.h0(0, qb3VarArr2.length, null, qb3VarArr2);
            btfVar.e = 0;
            xj0Var.a = 0L;
        }
        if (!xo1.n(oiaVar)) {
            List listB = oiaVar.b();
            int size = listB.size();
            for (int i = 0; i < size; i++) {
                vj6 vj6Var = (vj6) listB.get(i);
                xj0Var.a(vj6Var.a, hl9.g(vj6Var.e, 0L));
            }
            xj0Var.a(j, hl9.g(oiaVar.n, 0L));
        }
        if (xo1.n(oiaVar) && j - xj0Var.a > 40) {
            qb3[] qb3VarArr3 = btfVar2.d;
            qd0.h0(0, qb3VarArr3.length, null, qb3VarArr3);
            btfVar2.e = 0;
            qb3[] qb3VarArr4 = btfVar.d;
            qd0.h0(0, qb3VarArr4.length, null, qb3VarArr4);
            btfVar.e = 0;
            xj0Var.a = 0L;
        }
        xj0Var.a = j;
    }

    public static final float i(float[] fArr, float[] fArr2) {
        int length = fArr.length;
        float f2 = 0.0f;
        for (int i = 0; i < length; i++) {
            f2 += fArr[i] * fArr2[i];
        }
        return f2;
    }

    public static final hkb j(kxa kxaVar) {
        return z5c.g(hl9.g(((hl9) ((vz9) kxaVar.b).getValue()).a, ((hl9) ((vz9) kxaVar.c).getValue()).a), ((ald) ((vz9) kxaVar.a).getValue()).a);
    }

    public static final boolean k(int i, int i2) {
        return (i & i2) != 0;
    }

    public static boolean l(XmlPullParser xmlPullParser, String str) {
        return xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null;
    }

    /* JADX WARN: Code duplicated, block: B:11:0x001c  */
    public static final float m(bea beaVar, boolean z, rq6[] rq6VarArr, float f2) {
        float f3 = Float.NaN;
        for (rq6 rq6Var : rq6VarArr) {
            float fA = beaVar.a(rq6Var);
            if (Float.isNaN(f3)) {
                f3 = fA;
            } else if (z == (fA > f3)) {
                f3 = fA;
            }
        }
        return Float.isNaN(f3) ? f2 : f3;
    }

    public static final hkb n(hcd hcdVar, tbd tbdVar) {
        if (tbdVar == null) {
            return null;
        }
        List listB = hcdVar.b();
        int size = listB.size();
        for (int i = 0; i < size; i++) {
            if (pa7.t(((icd) listB.get(i)).X, tbdVar)) {
                if (tbdVar.Y) {
                    return !tbdVar.G0 ? tbdVar.F0 : z5c.g(bv7.e(tbdVar.n1(), vd0.r0(tbdVar), 6), db6.Y0(vd0.r0(tbdVar).c));
                }
                return null;
            }
        }
        return null;
    }

    public static final void o(float[] fArr, float[] fArr2, int i, float[] fArr3) {
        if (i == 0) {
            i37.a("At least one point must be provided");
        }
        int i2 = 2 >= i ? i - 1 : 2;
        int i3 = i2 + 1;
        float[][] fArr4 = new float[i3][];
        for (int i4 = 0; i4 < i3; i4++) {
            fArr4[i4] = new float[i];
        }
        for (int i5 = 0; i5 < i; i5++) {
            fArr4[0][i5] = 1.0f;
            for (int i6 = 1; i6 < i3; i6++) {
                fArr4[i6][i5] = fArr4[i6 - 1][i5] * fArr[i5];
            }
        }
        float[][] fArr5 = new float[i3][];
        for (int i7 = 0; i7 < i3; i7++) {
            fArr5[i7] = new float[i];
        }
        float[][] fArr6 = new float[i3][];
        for (int i8 = 0; i8 < i3; i8++) {
            fArr6[i8] = new float[i3];
        }
        int i9 = 0;
        while (i9 < i3) {
            float[] fArr7 = fArr5[i9];
            float[] fArr8 = fArr4[i9];
            fArr8.getClass();
            fArr7.getClass();
            System.arraycopy(fArr8, 0, fArr7, 0, i);
            for (int i10 = 0; i10 < i9; i10++) {
                float[] fArr9 = fArr5[i10];
                float fI = i(fArr7, fArr9);
                for (int i11 = 0; i11 < i; i11++) {
                    fArr7[i11] = fArr7[i11] - (fArr9[i11] * fI);
                }
            }
            float fSqrt = (float) Math.sqrt(i(fArr7, fArr7));
            if (fSqrt < 1.0E-6f) {
                fSqrt = 1.0E-6f;
            }
            float f2 = 1.0f / fSqrt;
            for (int i12 = 0; i12 < i; i12++) {
                fArr7[i12] = fArr7[i12] * f2;
            }
            float[] fArr10 = fArr6[i9];
            int i13 = 0;
            while (i13 < i3) {
                fArr10[i13] = i13 < i9 ? 0.0f : i(fArr7, fArr4[i13]);
                i13++;
            }
            i9++;
        }
        for (int i14 = i2; -1 < i14; i14--) {
            float fI2 = i(fArr5[i14], fArr2);
            float[] fArr11 = fArr6[i14];
            int i15 = i14 + 1;
            if (i15 <= i2) {
                int i16 = i2;
                while (true) {
                    fI2 -= fArr11[i16] * fArr3[i16];
                    if (i16 != i15) {
                        i16--;
                    }
                }
            }
            fArr3[i14] = fI2 / fArr11[i14];
        }
    }

    public static final int p(SolarTerm solarTerm) {
        solarTerm.getClass();
        int i = ksc.a[solarTerm.ordinal()];
        if (i == 1) {
            return R.string.seasonal_title_spring;
        }
        if (i == 2) {
            return R.string.seasonal_title_summer;
        }
        if (i == 3) {
            return R.string.seasonal_title_autumn;
        }
        if (i == 4) {
            return R.string.seasonal_title_winter;
        }
        if (i == 5) {
            return R.string.seasonal_title_summer;
        }
        ap.c();
        return 0;
    }

    public static final TarotCard q(TarotCardRequestBody tarotCardRequestBody) {
        tarotCardRequestBody.getClass();
        return new TarotCard(tarotCardRequestBody.getKey(), tarotCardRequestBody.getDirection());
    }

    public static final void r(kxa kxaVar, long j, long j2, long j3, boolean z) {
        vz9 vz9Var = (vz9) kxaVar.b;
        vz9 vz9Var2 = (vz9) kxaVar.d;
        vz9 vz9Var3 = (vz9) kxaVar.a;
        vz9 vz9Var4 = (vz9) kxaVar.c;
        if (!hl9.c(((hl9) vz9Var4.getValue()).a, j3) || !ald.a(((ald) vz9Var3.getValue()).a, j) || z) {
            vz9Var3.setValue(new ald(j));
            vz9Var4.setValue(new hl9(j3));
            if (z) {
                vz9Var.setValue(new hl9(hl9.f(hl9.f(j2, j3), hl9.f(((hl9) vz9Var2.getValue()).a, ((hl9) vz9Var.getValue()).a))));
            }
        }
        vz9Var2.setValue(new hl9(hl9.f(j2, j3)));
    }

    public static final void s(String str, StringBuilder sb) {
        if (sb.length() > 0) {
            sb.append('+');
        }
        sb.append(str);
    }

    public static int t(vtg vtgVar) {
        Iterator it = vtgVar.iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            Object next = it.next();
            iHashCode += next != null ? next.hashCode() : 0;
        }
        return iHashCode;
    }
}
