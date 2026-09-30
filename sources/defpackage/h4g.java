package defpackage;

import ai.askquin.R;
import ai.askquin.model.TarotSkinIdentify;
import android.content.res.Configuration;
import androidx.compose.foundation.layout.b;
import androidx.compose.ui.node.LayoutNode;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class h4g {
    public static final mue a = new mue(0, 0, null, null, null, 0, 0, 0, 0, 0, new iga(), null, 16252927);
    public static final List b = t72.I("no", "yes", "maybe");
    public static final long c = abg.d(4293585404L);
    public static final long d = abg.d(4291677424L);
    public static final long e = abg.d(4280950860L);
    public static final List f = t72.I(new v3b(12.05f, 92.25f, 20.0f), new v3b(12.0f, 95.25f, 30.0f), new v3b(12.0f, 97.8f, 40.0f));

    public static final void a(float f2, l46 l46Var, int i) {
        int i2;
        l46Var.h0(1072060268);
        if ((i & 6) == 0) {
            i2 = (l46Var.d(f2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (l46Var.W(i2 & 1, (i2 & 3) != 2)) {
            g09 g09Var = g09.a;
            j09 j09VarL = b.l(g09Var, 56.0f * f2);
            y6c y6cVar = a7c.a;
            j09 j09VarE = oa7.E(j09VarL, y6cVar);
            long j = y72.e;
            j09 j09VarW = db6.w(tm7.o(j09VarE, y72.b(j, 0.72f), g21.f), 0.5f, j, y6cVar);
            xn8 xn8VarC = s21.c(ndb.f, false);
            int iHashCode = Long.hashCode(l46Var.T);
            u8a u8aVarM = l46Var.m();
            j09 j09VarJ = m93.J(l46Var, j09VarW);
            lf2.q.getClass();
            l46Var.j0();
            if (l46Var.S) {
                l46Var.l(LayoutNode.h1);
            } else {
                l46Var.s0();
            }
            dec.l(hj6.z, l46Var, xn8VarC);
            dec.l(hj6.y, l46Var, u8aVarM);
            dec.l(hj6.X, l46Var, Integer.valueOf(iHashCode));
            dec.k(l46Var);
            dec.l(hj6.x, l46Var, j09VarJ);
            j09 j09VarM = b.m(g09Var, 10.0f * f2, 14.0f * f2);
            Object objR = l46Var.R();
            if (objR == sf2.a) {
                objR = new ksf(20);
                l46Var.p0(objR);
            }
            nk8.e(48, (a26) objR, l46Var, j09VarM);
            l46Var.r(true);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new wyf(f2, i, 3);
        }
    }

    public static final void b(float f2, float f3, int i, l46 l46Var, j09 j09Var) {
        float f4;
        l46 l46Var2;
        g09 g09Var;
        float f5 = f3;
        l46 l46Var3 = l46Var;
        he2 he2Var = hj6.x;
        he2 he2Var2 = hj6.X;
        he2 he2Var3 = hj6.y;
        he2 he2Var4 = hj6.z;
        l46Var3.h0(-1900968532);
        int i2 = i | (l46Var3.d(f5) ? 32 : 16) | (l46Var.g(j09Var) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS);
        boolean z = false;
        int i3 = 1;
        if (l46Var3.W(i2 & 1, (i2 & 145) != 144)) {
            xn8 xn8VarC = s21.c(ndb.b, false);
            int iHashCode = Long.hashCode(l46Var3.T);
            u8a u8aVarM = l46Var3.m();
            j09 j09VarJ = m93.J(l46Var, j09Var);
            lf2.q.getClass();
            l46Var3.j0();
            boolean z2 = l46Var3.S;
            ov7 ov7Var = LayoutNode.h1;
            if (z2) {
                l46Var3.l(ov7Var);
            } else {
                l46Var3.s0();
            }
            dec.l(he2Var4, l46Var3, xn8VarC);
            dec.l(he2Var3, l46Var3, u8aVarM);
            ib8.s(iHashCode, l46Var3, he2Var2, l46Var3);
            dec.l(he2Var, l46Var3, j09VarJ);
            float f6 = 108.0f * f5;
            float f7 = 1.75f * f6;
            float f8 = f5 * 8.0f;
            l46Var3.f0(1870670985);
            Iterator it = f.iterator();
            while (true) {
                boolean zHasNext = it.hasNext();
                g09Var = g09.a;
                if (!zHasNext) {
                    break;
                }
                v3b v3bVar = (v3b) it.next();
                j09 j09VarM = b.m(tm7.M(g09Var, (v3bVar.a * f5) - (f6 / 2.0f), (v3bVar.b * f5) - (f7 / 2.0f)), f6, f7);
                boolean zG = l46Var3.g(v3bVar);
                Object objR = l46Var3.R();
                if (zG || objR == sf2.a) {
                    objR = new f3g(i3, v3bVar);
                    l46Var3.p0(objR);
                }
                j09 j09VarX = bzd.x(j09VarM, (a26) objR);
                float f9 = f8;
                dt1.a(j09VarX, null, false, null, f9, null, null, null, l46Var3, 384, 234);
                f8 = f9;
                z = false;
                he2Var = he2Var;
                ov7Var = ov7Var;
                he2Var4 = he2Var4;
                f6 = f6;
                f7 = f7;
                i2 = i2;
                i3 = 1;
                f5 = f3;
            }
            he2 he2Var5 = he2Var4;
            int i4 = i2;
            ov7 ov7Var2 = ov7Var;
            float f10 = f8;
            he2 he2Var6 = he2Var;
            boolean z3 = z;
            l46Var3.r(z3);
            j09 j09VarD0 = ynb.d0(0.0f, 0.0f, f3 * 24.0f, 0.0f, 11, d31.a.a(g09Var, ndb.g));
            t7c t7cVarA = s7c.a(new uc0(16.0f * f3, true, new qc0(z3 ? 1 : 0)), ndb.z, l46Var3, 48);
            int iHashCode2 = Long.hashCode(l46Var3.T);
            u8a u8aVarM2 = l46Var3.m();
            j09 j09VarJ2 = m93.J(l46Var3, j09VarD0);
            lf2.q.getClass();
            l46Var3.j0();
            if (l46Var3.S) {
                l46Var3.l(ov7Var2);
            } else {
                l46Var3.s0();
            }
            dec.l(he2Var5, l46Var3, t7cVarA);
            dec.l(he2Var3, l46Var3, u8aVarM2);
            ib8.s(iHashCode2, l46Var3, he2Var2, l46Var3);
            dec.l(he2Var6, l46Var3, j09VarJ2);
            c92 c92VarA = a92.a(xc0.c, ndb.Y, l46Var3, 48);
            int iHashCode3 = Long.hashCode(l46Var3.T);
            u8a u8aVarM3 = l46Var3.m();
            j09 j09VarJ3 = m93.J(l46Var3, g09Var);
            l46Var3.j0();
            if (l46Var3.S) {
                l46Var3.l(ov7Var2);
            } else {
                l46Var3.s0();
            }
            dec.l(he2Var5, l46Var3, c92VarA);
            dec.l(he2Var3, l46Var3, u8aVarM3);
            ib8.s(iHashCode3, l46Var3, he2Var2, l46Var3);
            dec.l(he2Var6, l46Var3, j09VarJ3);
            cq5 cq5Var = cr5.f;
            ar5 ar5Var = ar5.x;
            float f11 = 32.0f * f3;
            long jR = w6c.r(4294967296L, f11);
            long jR2 = w6c.r(4294967296L, f11);
            long j = e;
            mue mueVar = a;
            nte.b("Yes / No", null, j, jR, ar5Var, cq5Var, 0L, null, null, jR2, 0, false, 0, 0, null, mueVar, l46Var, 1573254, 12582912, 128810);
            nte.b(afc.q(R.string.widget_guide_qd_initial_subtitle, l46Var), b.q(0.0f, 112.0f * f3, ynb.d0(0.0f, f10, 0.0f, 0.0f, 13, g09Var), 1), j, w6c.r(4294967296L, 12.0f * f3), null, null, 0L, null, null, w6c.r(4294967296L, 14.400001f * f3), 2, false, 3, 0, null, mueVar, l46Var, 384, 12607872, 108520);
            l46 l46Var4 = l46Var;
            l46Var4.r(true);
            f4 = f3;
            a(f4, l46Var4, (i4 >> 3) & 14);
            l46Var4.r(true);
            l46Var4.r(true);
            l46Var2 = l46Var4;
        } else {
            f4 = f5;
            l46Var3.Z();
            l46Var2 = l46Var3;
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new h5b(f2, f4, j09Var, i);
        }
    }

    public static final void c(final float f2, final float f3, final float f4, final float f5, final j09 j09Var, l46 l46Var, final int i) {
        g09 g09Var;
        float f6 = f2;
        l46 l46Var2 = l46Var;
        l46Var2.h0(-1649587538);
        int i2 = i | (l46Var2.d(f6) ? 4 : 2) | (l46Var2.d(f3) ? 32 : 16) | (l46Var2.d(f4) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) | (l46Var2.d(f5) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE) | (l46Var2.g(j09Var) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE);
        boolean z = false;
        boolean z2 = true;
        if (l46Var2.W(i2 & 1, (i2 & 9363) != 9362)) {
            xn8 xn8VarC = s21.c(ndb.b, false);
            int iHashCode = Long.hashCode(l46Var2.T);
            u8a u8aVarM = l46Var2.m();
            j09 j09VarJ = m93.J(l46Var2, j09Var);
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
            float f7 = 56.0f * f5;
            float f8 = 1.75f * f7;
            float f9 = f5 * 8.0f;
            float f10 = 12.0f * f5;
            float f11 = f5 * 2.0f;
            float f12 = (f4 - ((f8 + f11) + (14.400001f * f5))) / 2.0f;
            float f13 = (f3 - ((f10 * 2.0f) + (3.0f * f7))) / 2.0f;
            l46Var2.f0(841230289);
            int i3 = 0;
            while (true) {
                g09Var = g09.a;
                if (i3 >= 3) {
                    break;
                }
                dt1.a(b.m(tm7.M(g09Var, abg.P(f10, ((f7 + f10) * i3) + f13, f6), f12), f7, f8), null, false, null, f9, null, null, null, l46Var2, 384, 234);
                i3++;
                z2 = true;
                f10 = f10;
                z = z;
                f12 = f12;
                f7 = f7;
                f6 = f2;
            }
            float f14 = f10;
            l46Var2.r(z);
            float fN = mh3.n((f2 - 0.6f) / 0.4f, 0.0f, 1.0f);
            String strQ = afc.q(R.string.widget_guide_qd_selecting_hint, l46Var2);
            long jR = w6c.r(4294967296L, f14);
            long jR2 = w6c.r(4294967296L, f14);
            j09 j09VarN = tm7.N(0.0f, f12 + f8 + f11, d31.a.a(g09Var, ndb.c), 1);
            boolean zD = l46Var2.d(fN);
            Object objR = l46Var2.R();
            if (zD || objR == sf2.a) {
                objR = new uc2(18, fN);
                l46Var2.p0(objR);
            }
            nte.b(strQ, bzd.x(j09VarN, (a26) objR), e, jR, null, null, 0L, null, null, jR2, 0, false, 0, 0, null, a, l46Var, 384, 12582912, 129000);
            l46Var2 = l46Var;
            l46Var2.r(true);
        } else {
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new l26(f2, f3, f4, f5, i, j09Var) { // from class: d4g
                public final /* synthetic */ float a;
                public final /* synthetic */ float b;
                public final /* synthetic */ float c;
                public final /* synthetic */ float d;
                public final /* synthetic */ j09 e;

                {
                    this.e = j09Var;
                }

                @Override // defpackage.l26
                public final Object z(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iP = k99.P(1);
                    h4g.c(this.a, this.b, this.c, this.d, this.e, (l46) obj, iP);
                    return wef.a;
                }
            };
        }
    }

    public static final void d(final String str, final long j, final float f2, final j09 j09Var, l46 l46Var, final int i) {
        l46 l46Var2 = l46Var;
        l46Var2.h0(1798993552);
        int i2 = i | (l46Var2.g(str) ? 4 : 2) | (l46Var2.f(j) ? 32 : 16) | (l46Var2.d(f2) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) | (l46Var2.g(j09Var) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE);
        if (l46Var2.W(i2 & 1, (i2 & 1171) != 1170)) {
            String lowerCase = str.toLowerCase(Locale.ROOT);
            lowerCase.getClass();
            ArrayList arrayList = new ArrayList();
            List list = b;
            for (Object obj : list) {
                if (!pa7.t((String) obj, lowerCase)) {
                    arrayList.add(obj);
                }
            }
            if (!list.contains(lowerCase)) {
                lowerCase = "yes";
            }
            String str2 = lowerCase;
            float f3 = f2 * 43.5f;
            c92 c92VarA = a92.a(xc0.e, ndb.Y, l46Var2, 54);
            int iHashCode = Long.hashCode(l46Var2.T);
            u8a u8aVarM = l46Var2.m();
            j09 j09VarJ = m93.J(l46Var2, j09Var);
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
            int i3 = (i2 & 112) | 24960 | ((i2 << 9) & 458752);
            f((String) s72.y0(0, arrayList), j, 27.0f, f3, false, f2, l46Var2, i3);
            l46Var2 = l46Var;
            f(str2, j, 32.0f, f3, true, f2, l46Var2, i3);
            f((String) s72.y0(1, arrayList), j, 27.0f, f3, false, f2, l46Var2, i3);
            l46Var2.r(true);
        } else {
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new l26(str, j, f2, j09Var, i) { // from class: f4g
                public final /* synthetic */ String a;
                public final /* synthetic */ long b;
                public final /* synthetic */ float c;
                public final /* synthetic */ j09 d;

                @Override // defpackage.l26
                public final Object z(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iP = k99.P(1);
                    h4g.d(this.a, this.b, this.c, this.d, (l46) obj2, iP);
                    return wef.a;
                }
            };
        }
    }

    public static final void e(final String str, final long j, final float f2, final boolean z, final float f3, l46 l46Var, final int i) {
        int i2;
        ojb ojbVarV;
        l26 l26Var;
        String string;
        l46 l46Var2 = l46Var;
        l46Var2.h0(1891899945);
        if ((i & 6) == 0) {
            i2 = (l46Var2.g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= l46Var2.f(j) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= l46Var2.d(f2) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        if ((i & 3072) == 0) {
            i2 |= l46Var2.h(z) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE;
        }
        if ((i & 24576) == 0) {
            i2 |= l46Var2.d(f3) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE;
        }
        if (l46Var2.W(i2 & 1, (i2 & 9363) != 9362)) {
            if (str == null) {
                ojbVarV = l46Var2.v();
                if (ojbVarV == null) {
                    return;
                }
                final int i3 = 0;
                l26Var = new l26() { // from class: c4g
                    @Override // defpackage.l26
                    public final Object z(Object obj, Object obj2) {
                        int i4 = i3;
                        wef wefVar = wef.a;
                        int i5 = i;
                        switch (i4) {
                            case 0:
                                ((Integer) obj2).getClass();
                                int iP = k99.P(i5 | 1);
                                h4g.e(str, j, f2, z, f3, (l46) obj, iP);
                                break;
                            default:
                                ((Integer) obj2).getClass();
                                int iP2 = k99.P(i5 | 1);
                                h4g.e(str, j, f2, z, f3, (l46) obj, iP2);
                                break;
                        }
                        return wefVar;
                    }
                };
            } else {
                t7c t7cVarA = s7c.a(xc0.a, ndb.z, l46Var2, 48);
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
                dec.l(hj6.z, l46Var2, t7cVarA);
                dec.l(hj6.y, l46Var2, u8aVarM);
                dec.l(hj6.X, l46Var2, Integer.valueOf(iHashCode));
                dec.k(l46Var2);
                dec.l(hj6.x, l46Var2, j09VarJ);
                if (z) {
                    l46Var2.f0(-809992751);
                    j09 j09VarM = b.m(g09Var, 10.0f * f3, 14.0f * f3);
                    boolean z2 = (i2 & 112) == 32;
                    Object objR = l46Var2.R();
                    if (z2 || objR == sf2.a) {
                        objR = new ac(j, 20);
                        l46Var2.p0(objR);
                    }
                    nk8.e(0, (a26) objR, l46Var2, j09VarM);
                    o5c.f(l46Var2, b.p(g09Var, 6.0f * f3));
                    l46Var2.r(false);
                } else {
                    l46Var2.f0(-809619883);
                    l46Var2.r(false);
                }
                if (str.length() > 0) {
                    StringBuilder sb = new StringBuilder();
                    String strValueOf = String.valueOf(str.charAt(0));
                    strValueOf.getClass();
                    String upperCase = strValueOf.toUpperCase(Locale.ROOT);
                    upperCase.getClass();
                    sb.append((Object) upperCase);
                    sb.append(str.substring(1));
                    string = sb.toString();
                } else {
                    string = str;
                }
                float f4 = f2 * f3;
                nte.b(string, null, z ? j : y72.b(j, 0.25f), w6c.r(4294967296L, f4), null, cr5.f, 0L, null, null, w6c.r(4294967296L, f4), 0, false, 0, 0, null, a, l46Var, 0, 12582912, 128874);
                l46Var2 = l46Var;
                l46Var2.r(true);
            }
            ojbVarV.d = l26Var;
        }
        l46Var2.Z();
        ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            final int i4 = 1;
            l26Var = new l26() { // from class: c4g
                @Override // defpackage.l26
                public final Object z(Object obj, Object obj2) {
                    int i5 = i4;
                    wef wefVar = wef.a;
                    int i6 = i;
                    switch (i5) {
                        case 0:
                            ((Integer) obj2).getClass();
                            int iP = k99.P(i6 | 1);
                            h4g.e(str, j, f2, z, f3, (l46) obj, iP);
                            break;
                        default:
                            ((Integer) obj2).getClass();
                            int iP2 = k99.P(i6 | 1);
                            h4g.e(str, j, f2, z, f3, (l46) obj, iP2);
                            break;
                    }
                    return wefVar;
                }
            };
            ojbVarV.d = l26Var;
        }
    }

    public static final void f(final String str, final long j, final float f2, final float f3, final boolean z, final float f4, l46 l46Var, final int i) {
        String str2;
        int i2;
        l46Var.h0(1966488473);
        if ((i & 6) == 0) {
            str2 = str;
            i2 = (l46Var.g(str2) ? 4 : 2) | i;
        } else {
            str2 = str;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= l46Var.f(j) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= l46Var.d(f2) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        if ((i & 3072) == 0) {
            i2 |= l46Var.d(f3) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE;
        }
        if ((i & 24576) == 0) {
            i2 |= l46Var.h(z) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE;
        }
        if ((196608 & i) == 0) {
            i2 |= l46Var.d(f4) ? 131072 : 65536;
        }
        if (l46Var.W(i2 & 1, (74899 & i2) != 74898)) {
            j09 j09VarD = b.d(g09.a, f3);
            xn8 xn8VarC = s21.c(ndb.e, false);
            int iHashCode = Long.hashCode(l46Var.T);
            u8a u8aVarM = l46Var.m();
            j09 j09VarJ = m93.J(l46Var, j09VarD);
            lf2.q.getClass();
            l46Var.j0();
            if (l46Var.S) {
                l46Var.l(LayoutNode.h1);
            } else {
                l46Var.s0();
            }
            dec.l(hj6.z, l46Var, xn8VarC);
            dec.l(hj6.y, l46Var, u8aVarM);
            dec.l(hj6.X, l46Var, Integer.valueOf(iHashCode));
            dec.k(l46Var);
            dec.l(hj6.x, l46Var, j09VarJ);
            int i3 = i2 & 1022;
            int i4 = i2 >> 3;
            e(str2, j, f2, z, f4, l46Var, i3 | (i4 & 7168) | (i4 & 57344));
            l46Var.r(true);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new l26() { // from class: b4g
                @Override // defpackage.l26
                public final Object z(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    h4g.f(str, j, f2, f3, z, f4, (l46) obj, k99.P(i | 1));
                    return wef.a;
                }
            };
        }
    }

    public static final void g(qhe qheVar, TarotSkinIdentify tarotSkinIdentify, float f2, j09 j09Var, l46 l46Var, int i) {
        l46Var.h0(-1937571726);
        int i2 = i | (l46Var.i(qheVar) ? 4 : 2) | (l46Var.e(tarotSkinIdentify.ordinal()) ? 32 : 16) | (l46Var.d(f2) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) | (l46Var.g(j09Var) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE);
        if (l46Var.W(i2 & 1, (i2 & 1171) != 1170)) {
            xn8 xn8VarC = s21.c(ndb.b, false);
            int iHashCode = Long.hashCode(l46Var.T);
            u8a u8aVarM = l46Var.m();
            j09 j09VarJ = m93.J(l46Var, j09Var);
            lf2.q.getClass();
            l46Var.j0();
            if (l46Var.S) {
                l46Var.l(LayoutNode.h1);
            } else {
                l46Var.s0();
            }
            dec.l(hj6.z, l46Var, xn8VarC);
            dec.l(hj6.y, l46Var, u8aVarM);
            dec.l(hj6.X, l46Var, Integer.valueOf(iHashCode));
            dec.k(l46Var);
            dec.l(hj6.x, l46Var, j09VarJ);
            float f3 = ((0.55f * f2) - 18.0f) / 166.1f;
            float f4 = 95.9f * f3;
            float f5 = 167.9f * f3;
            float f6 = f2 * 0.45f;
            float f7 = f3 * 12.0f;
            float f8 = f3 * 8.0f;
            g09 g09Var = g09.a;
            j09 j09VarM = b.m(tm7.M(g09Var, (50.0f * f3) + f6, (37.75f * f3) + f7), f4, f5);
            Object objR = l46Var.R();
            i8c i8cVar = sf2.a;
            if (objR == i8cVar) {
                objR = new ksf(21);
                l46Var.p0(objR);
            }
            dt1.a(bzd.x(j09VarM, (a26) objR), null, false, null, f8, null, null, null, l46Var, 384, 234);
            j09 j09VarM2 = b.m(tm7.M(g09Var, (11.2f * f3) + f6, (5.9f * f3) + f7), f4, f5);
            Object objR2 = l46Var.R();
            if (objR2 == i8cVar) {
                objR2 = new ksf(22);
                l46Var.p0(objR2);
            }
            j09 j09VarX = bzd.x(j09VarM2, (a26) objR2);
            int i3 = i2 << 3;
            o7c.d(j09VarX, qheVar, tarotSkinIdentify, false, null, f8, null, false, l46Var, (i3 & 112) | 3072 | (i3 & 896), 208);
            l46Var.r(true);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new vr1(qheVar, tarotSkinIdentify, f2, j09Var, i, 4);
        }
    }

    public static final void h(final String str, final long j, final float f2, final float f3, final j09 j09Var, l46 l46Var, final int i) {
        l46 l46Var2 = l46Var;
        l46Var2.h0(26177900);
        int i2 = i | (l46Var2.g(str) ? 4 : 2) | (l46Var2.f(j) ? 32 : 16) | (l46Var2.d(f2) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) | (l46Var2.d(f3) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE) | (l46Var2.g(j09Var) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE);
        if (l46Var2.W(i2 & 1, (i2 & 9363) != 9362)) {
            float f4 = f3 * 16.0f;
            j09 j09VarD0 = ynb.d0(((((0.55f * f2) - 18.0f) / 166.1f) * 7.5f) + (0.45f * f2), 0.0f, 0.0f, f4, 6, j09Var);
            t7c t7cVarA = s7c.a(new uc0(9.0f * f3, true, new qc0(0)), ndb.z, l46Var2, 48);
            int iHashCode = Long.hashCode(l46Var2.T);
            u8a u8aVarM = l46Var2.m();
            j09 j09VarJ = m93.J(l46Var2, j09VarD0);
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
            dec.l(he2Var, l46Var2, t7cVarA);
            he2 he2Var2 = hj6.y;
            dec.l(he2Var2, l46Var2, u8aVarM);
            Integer numValueOf = Integer.valueOf(iHashCode);
            he2 he2Var3 = hj6.X;
            dec.l(he2Var3, l46Var2, numValueOf);
            dec.k(l46Var2);
            he2 he2Var4 = hj6.x;
            dec.l(he2Var4, l46Var2, j09VarJ);
            float f5 = 32.0f * f3;
            g09 g09Var = g09.a;
            j09 j09VarE = oa7.E(b.d(g09Var, f5), a7c.a());
            long j2 = y72.e;
            long jB = y72.b(j2, 0.72f);
            y02 y02Var = g21.f;
            j09 j09VarB0 = ynb.b0(f4, 0.0f, db6.w(tm7.o(j09VarE, jB, y02Var), 0.5f, j2, a7c.a()), 2);
            lx0 lx0Var = ndb.f;
            xn8 xn8VarC = s21.c(lx0Var, false);
            int iHashCode2 = Long.hashCode(l46Var2.T);
            u8a u8aVarM2 = l46Var2.m();
            j09 j09VarJ2 = m93.J(l46Var2, j09VarB0);
            l46Var2.j0();
            if (l46Var2.S) {
                l46Var2.l(ov7Var);
            } else {
                l46Var2.s0();
            }
            dec.l(he2Var, l46Var2, xn8VarC);
            dec.l(he2Var2, l46Var2, u8aVarM2);
            ib8.s(iHashCode2, l46Var2, he2Var3, l46Var2);
            dec.l(he2Var4, l46Var2, j09VarJ2);
            float f6 = 13.0f * f3;
            nte.b(str, b.q(0.0f, 85.0f * f3, g09Var, 1), j, w6c.r(4294967296L, f6), ar5.z, null, 0L, null, null, w6c.r(4294967296L, f6), 2, false, 1, 0, null, a, l46Var, (i2 & 14) | 1572864 | ((i2 << 3) & 896), 12607872, 108456);
            l46Var2 = l46Var;
            l46Var2.r(true);
            j09 j09VarW = db6.w(tm7.o(oa7.E(b.m(g09Var, 48.0f * f3, f5), a7c.a()), y72.b(j2, 0.72f), y02Var), 0.5f, j2, a7c.a());
            xn8 xn8VarC2 = s21.c(lx0Var, false);
            int iHashCode3 = Long.hashCode(l46Var2.T);
            u8a u8aVarM3 = l46Var2.m();
            j09 j09VarJ3 = m93.J(l46Var2, j09VarW);
            l46Var2.j0();
            if (l46Var2.S) {
                l46Var2.l(ov7Var);
            } else {
                l46Var2.s0();
            }
            dec.l(he2Var, l46Var2, xn8VarC2);
            dec.l(he2Var2, l46Var2, u8aVarM3);
            ib8.s(iHashCode3, l46Var2, he2Var3, l46Var2);
            dec.l(he2Var4, l46Var2, j09VarJ3);
            gu6.a(rxg.H(), null, b.l(g09Var, 14.0f * f3), j, l46Var2, ((i2 << 6) & 7168) | 48, 0);
            l46Var2.r(true);
            l46Var2.r(true);
        } else {
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new l26(str, j, f2, f3, j09Var, i) { // from class: e4g
                public final /* synthetic */ String a;
                public final /* synthetic */ long b;
                public final /* synthetic */ float c;
                public final /* synthetic */ float d;
                public final /* synthetic */ j09 e;

                @Override // defpackage.l26
                public final Object z(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int iP = k99.P(1);
                    h4g.h(this.a, this.b, this.c, this.d, this.e, (l46) obj, iP);
                    return wef.a;
                }
            };
        }
    }

    public static final void i(TarotSkinIdentify tarotSkinIdentify, j09 j09Var, l46 l46Var, int i) {
        tarotSkinIdentify.getClass();
        l46Var.h0(-339759308);
        int i2 = (l46Var.e(tarotSkinIdentify.ordinal()) ? 4 : 2) | i;
        if (l46Var.W(i2 & 1, (i2 & 19) != 18)) {
            Object objR = l46Var.R();
            Object obj = sf2.a;
            if (objR == obj) {
                objR = q1c.f(0);
                l46Var.p0(objR);
            }
            e89 e89Var = (e89) objR;
            int iIntValue = ((Number) e89Var.getValue()).intValue();
            mx4 mx4Var = u3b.b;
            u3b u3bVar = (u3b) mx4Var.get(iIntValue);
            boolean zE = l46Var.e(u3bVar.ordinal());
            Object objR2 = l46Var.R();
            if (zE || objR2 == obj) {
                objR2 = new qhe(u3bVar.a(), 1);
                l46Var.p0(objR2);
            }
            qhe qheVar = (qhe) objR2;
            TarotSkinIdentify tarotSkinIdentifyB = l6g.b(tarotSkinIdentify, l46Var, i2 & 14);
            z3g z3gVarC = l6g.c(qheVar, tarotSkinIdentifyB, null, l46Var, 0, 4);
            float f2 = z3gVarC != null ? z3gVarC.c : 258.0f;
            int i3 = y72.l;
            h0e h0eVarA = qkd.a(gec.F(f2, 0.12f, 0.97f, 0.0f, 24), null, "qdDemoStart", l46Var, 384, 10);
            h0e h0eVarA2 = qkd.a(gec.F(f2, 0.22f, 0.86f, 0.0f, 24), null, "qdDemoEnd", l46Var, 384, 10);
            h0e h0eVarA3 = qkd.a(gec.F(f2, 0.55f, 0.18f, 0.0f, 24), null, "qdDemoText", l46Var, 384, 10);
            Object objR3 = l46Var.R();
            if (objR3 == obj) {
                objR3 = qk2.d(0.0f);
                l46Var.p0(objR3);
            }
            jx jxVar = (jx) objR3;
            Object objR4 = l46Var.R();
            if (objR4 == obj) {
                objR4 = qk2.d(0.0f);
                l46Var.p0(objR4);
            }
            jx jxVar2 = (jx) objR4;
            Boolean bool = (Boolean) l46Var.k(h57.a);
            boolean zBooleanValue = bool.booleanValue();
            Integer numValueOf = Integer.valueOf(((Number) e89Var.getValue()).intValue());
            boolean zH = l46Var.h(zBooleanValue) | l46Var.i(jxVar) | l46Var.i(jxVar2);
            Object objR5 = l46Var.R();
            if (zH || objR5 == obj) {
                objR5 = new g4g(zBooleanValue, jxVar, jxVar2, null);
                l46Var.p0(objR5);
            }
            af1.p(numValueOf, bool, (l26) objR5, l46Var);
            Object objR6 = l46Var.R();
            if (objR6 == obj) {
                objR6 = ib8.e(l46Var);
            }
            t69 t69Var = (t69) objR6;
            j09 j09VarE = oa7.E(j09Var, a7c.b(16.0f));
            boolean zI = l46Var.i(mx4Var);
            Object objR7 = l46Var.R();
            if (zI || objR7 == obj) {
                objR7 = new fhf(5, mx4Var, e89Var);
                l46Var.p0(objR7);
            }
            nk8.d(androidx.compose.foundation.b.b(j09VarE, t69Var, null, false, null, (x16) objR7, 28), null, af1.b0(1742152350, new n53(jxVar2, jxVar, qheVar, tarotSkinIdentifyB, u3bVar, h0eVarA, h0eVarA2, h0eVarA3), l46Var), l46Var, 3072, 6);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new ej3(tarotSkinIdentify, j09Var, i, 2);
        }
    }

    public static final void j(qhe qheVar, TarotSkinIdentify tarotSkinIdentify, j09 j09Var, l46 l46Var, int i) {
        TarotSkinIdentify tarotSkinIdentify2;
        j09 j09Var2;
        qhe qheVar2;
        tarotSkinIdentify.getClass();
        l46Var.h0(-1391004949);
        int i2 = i | (l46Var.i(qheVar) ? 4 : 2) | (l46Var.e(tarotSkinIdentify.ordinal()) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS);
        if (l46Var.W(i2 & 1, (i2 & 1171) != 1170)) {
            tarotSkinIdentify2 = tarotSkinIdentify;
            TarotSkinIdentify tarotSkinIdentifyB = l6g.b(tarotSkinIdentify2, l46Var, (i2 >> 6) & 14);
            z3g z3gVarC = l6g.c(qheVar, tarotSkinIdentifyB, null, l46Var, i2 & 14, 4);
            qheVar2 = qheVar;
            float f2 = z3gVarC != null ? z3gVarC.c : 258.0f;
            int i3 = y72.l;
            h0e h0eVarA = qkd.a(gec.F(f2, 0.12f, 0.97f, 0.0f, 24), null, "qdGradientStart", l46Var, 384, 10);
            h0e h0eVarA2 = qkd.a(gec.F(f2, 0.22f, 0.86f, 0.0f, 24), null, "qdGradientEnd", l46Var, 384, 10);
            h0e h0eVarA3 = qkd.a(gec.F(f2, 0.55f, 0.18f, 0.0f, 24), null, "qdText", l46Var, 384, 10);
            j09Var2 = j09Var;
            j09 j09VarE = oa7.E(j09Var2, a7c.b(16.0f));
            y72 y72Var = (y72) h0eVarA.getValue();
            long j = y72Var.a;
            y72 y72Var2 = (y72) h0eVarA2.getValue();
            long j2 = y72Var2.a;
            nk8.d(tm7.n(j09VarE, new b68(t72.I(y72Var, y72Var2), null, 0L, 9187343241974906880L), null, 6), null, af1.b0(-287604543, new j41(qheVar2, tarotSkinIdentifyB, h0eVarA3, 25), l46Var), l46Var, 3072, 6);
        } else {
            tarotSkinIdentify2 = tarotSkinIdentify;
            j09Var2 = j09Var;
            qheVar2 = qheVar;
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            qhe qheVar3 = qheVar2;
            ojbVarV.d = new o7b(i, qheVar3, tarotSkinIdentify2, j09Var2, 23);
        }
    }

    public static final void k(float f2, l46 l46Var, int i) {
        int i2;
        l46Var.h0(-1794732168);
        if ((i & 6) == 0) {
            i2 = i | (l46Var.d(f2) ? 4 : 2);
        } else {
            i2 = i;
        }
        if (l46Var.W(i2 & 1, (i2 & 3) != 2)) {
            String strQ = afc.q(R.string.text_reverse_tag, l46Var);
            long j = y72.e;
            float f3 = 11.0f * f2;
            float f4 = f2 * 4.0f;
            nte.b(strQ, ynb.a0(tm7.o(ynb.d0(0.0f, 0.0f, f4, 0.0f, 11, g09.a), y72.b(j, 0.15f), a7c.b(f4)), 3.0f * f2, 2.0f * f2), y72.b(j, 0.5f), w6c.r(4294967296L, f3), null, null, 0L, null, null, w6c.r(4294967296L, f3), 0, false, 0, 0, null, a, l46Var, 384, 12582912, 129000);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new wyf(f2, i, 2);
        }
    }

    public static final void l(String str, String str2, boolean z, float f2, j09 j09Var, l46 l46Var, int i) {
        float f3;
        boolean z2;
        l46 l46Var2 = l46Var;
        l46Var2.h0(1167068374);
        int i2 = i | (l46Var2.g(str) ? 4 : 2) | (l46Var2.g(str2) ? 32 : 16) | (l46Var2.h(z) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) | (l46Var2.d(f2) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE) | (l46Var2.g(j09Var) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE);
        if (l46Var2.W(i2 & 1, (i2 & 9363) != 9362)) {
            Locale locale = ((Configuration) l46Var2.k(uq.a)).getLocales().get(0);
            boolean zBooleanValue = ((Boolean) l46Var2.k(h57.a)).booleanValue();
            boolean zH = l46Var2.h(zBooleanValue);
            Object objR = l46Var2.R();
            i8c i8cVar = sf2.a;
            if (zH || objR == i8cVar) {
                objR = zBooleanValue ? LocalDate.of(2024, 6, 1) : LocalDate.now();
                l46Var2.p0(objR);
            }
            LocalDate localDate = (LocalDate) objR;
            boolean zG = l46Var2.g(localDate) | l46Var2.g(locale);
            Object objR2 = l46Var2.R();
            if (zG || objR2 == i8cVar) {
                objR2 = localDate.format(DateTimeFormatter.ofPattern("MMM", locale));
                l46Var2.p0(objR2);
            }
            String str3 = (String) objR2;
            j09 j09VarP = b.p(ynb.d0(32.0f * f2, 16.0f * f2, 0.0f, 0.0f, 12, j09Var), 240.0f * f2);
            c92 c92VarA = a92.a(xc0.c, ndb.Y, l46Var2, 0);
            int iHashCode = Long.hashCode(l46Var2.T);
            u8a u8aVarM = l46Var2.m();
            j09 j09VarJ = m93.J(l46Var2, j09VarP);
            lf2.q.getClass();
            l46Var2.j0();
            boolean z3 = l46Var2.S;
            ov7 ov7Var = LayoutNode.h1;
            if (z3) {
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
            String strValueOf = String.valueOf(localDate.getDayOfMonth());
            long j = y72.e;
            float f4 = 19.0f * f2;
            long jR = w6c.r(4294967296L, f4);
            long jR2 = w6c.r(4294967296L, f4);
            ar5 ar5Var = ar5.z;
            mue mueVar = a;
            nte.b(strValueOf, null, j, jR, ar5Var, null, 0L, null, null, jR2, 0, false, 0, 0, null, mueVar, l46Var, 1573248, 12582912, 128938);
            str3.getClass();
            float f5 = 12.0f * f2;
            nte.b(str3, null, y72.b(j, 0.5f), w6c.r(4294967296L, f5), null, null, 0L, null, null, w6c.r(4294967296L, f5), 0, false, 0, 0, null, mueVar, l46Var, 384, 12582912, 129002);
            g09 g09Var = g09.a;
            j09 j09VarD0 = ynb.d0(0.0f, f2 * 18.0f, 0.0f, 0.0f, 13, g09Var);
            t7c t7cVarA = s7c.a(xc0.a, ndb.z, l46Var, 48);
            int iHashCode2 = Long.hashCode(l46Var.T);
            u8a u8aVarM2 = l46Var.m();
            j09 j09VarJ2 = m93.J(l46Var, j09VarD0);
            l46Var.j0();
            if (l46Var.S) {
                l46Var.l(ov7Var);
            } else {
                l46Var.s0();
            }
            dec.l(he2Var, l46Var, t7cVarA);
            dec.l(he2Var2, l46Var, u8aVarM2);
            ib8.s(iHashCode2, l46Var, he2Var3, l46Var);
            dec.l(he2Var4, l46Var, j09VarJ2);
            if (z) {
                l46Var.f0(-1537313657);
                f3 = f2;
                k(f3, l46Var, (i2 >> 9) & 14);
                z2 = false;
                l46Var.r(false);
            } else {
                f3 = f2;
                z2 = false;
                l46Var.f0(-1537272334);
                l46Var.r(false);
            }
            float f6 = 27.0f * f3;
            nte.b(str, null, j, w6c.r(4294967296L, f6), null, ((y8b) l46Var.k(x8b.a)).a, w6c.r(8589934592L, 0.006f), null, null, w6c.r(4294967296L, f6), 2, false, 1, 0, null, mueVar, l46Var, (i2 & 14) | 100663680, 12607872, 108138);
            l46Var2 = l46Var;
            boolean z4 = true;
            l46Var2.r(true);
            if (str2 == null) {
                l46Var2.f0(1014881756);
                l46Var2.r(z2);
            } else {
                l46Var2.f0(1014881757);
                nte.b(str2, ynb.d0(0.0f, f2 * 4.0f, 0.0f, 0.0f, 13, g09Var), y72.b(j, 0.5f), w6c.r(4294967296L, f5), null, null, 0L, null, null, w6c.r(4294967296L, 15.599999f * f2), 2, false, 2, 0, null, mueVar, l46Var, 384, 12607872, 108520);
                l46Var2 = l46Var;
                l46Var2.r(false);
                z4 = true;
            }
            l46Var2.r(z4);
        } else {
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new goc(str, str2, z, f2, j09Var, i);
        }
    }

    public static final void m(qhe qheVar, TarotSkinIdentify tarotSkinIdentify, String str, j09 j09Var, String str2, l46 l46Var, int i) {
        TarotSkinIdentify tarotSkinIdentify2;
        j09 j09Var2;
        cv6 cv6VarJ0;
        tarotSkinIdentify.getClass();
        str.getClass();
        l46Var.h0(-1568467507);
        int i2 = i | (l46Var.i(qheVar) ? 4 : 2) | (l46Var.e(tarotSkinIdentify.ordinal()) ? 32 : 16) | (l46Var.g(str) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) | (l46Var.g(str2) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE);
        if (l46Var.W(i2 & 1, (i2 & 9363) != 9362)) {
            tarotSkinIdentify2 = tarotSkinIdentify;
            z3g z3gVarC = l6g.c(qheVar, l6g.b(tarotSkinIdentify2, l46Var, (i2 >> 3) & 14), null, l46Var, i2 & 14, 4);
            float f2 = z3gVarC != null ? z3gVarC.c : 258.0f;
            int i3 = y72.l;
            h0e h0eVarA = qkd.a(gec.F(f2, 0.4f, 0.12f, 0.0f, 24), null, "todayWidgetBase", l46Var, 384, 10);
            h0e h0eVarA2 = qkd.a(gec.F(f2, 0.45f, 0.2f, 0.0f, 24), null, "todayWidgetMask", l46Var, 384, 10);
            l46Var.f0(236268664);
            if (z3gVarC != null) {
                l46Var.f0(236269458);
                l46Var.r(false);
                cv6VarJ0 = z3gVarC.a;
            } else if (((Boolean) l46Var.k(h57.a)).booleanValue()) {
                l46Var.f0(236271402);
                cv6VarJ0 = lmg.j0(R.drawable.card_cover_white, l46Var);
                l46Var.r(false);
            } else {
                l46Var.f0(-1265449488);
                l46Var.r(false);
                cv6VarJ0 = null;
            }
            cv6 cv6Var = cv6VarJ0;
            l46Var.r(false);
            j09Var2 = j09Var;
            nk8.d(tm7.o(oa7.E(j09Var2, a7c.b(16.0f)), ((y72) h0eVarA.getValue()).a, g21.f), null, af1.b0(-2007012573, new n50(cv6Var, h0eVarA2, str, str2, qheVar), l46Var), l46Var, 3072, 6);
        } else {
            tarotSkinIdentify2 = tarotSkinIdentify;
            j09Var2 = j09Var;
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new cm(qheVar, tarotSkinIdentify2, str, j09Var2, str2, i);
        }
    }

    public static final float n(float f2, float f3, float f4) {
        float f5 = 1.0f - f2;
        float f6 = 3.0f * f5;
        float f7 = f5 * f6 * f2 * f3;
        return (f2 * f2 * f2) + (f6 * f2 * f2 * f4) + f7;
    }
}
