package defpackage;

import ai.askquin.R;
import android.content.Context;
import android.hardware.camera2.params.OutputConfiguration;
import android.os.Build;
import android.view.Surface;
import androidx.compose.foundation.layout.b;
import androidx.compose.ui.node.LayoutNode;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import io.sentry.android.core.b1;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class k99 {
    public static final g5d a = g5d.d;
    public static final float b = 8.0f;
    public static final float c = 1.0f;
    public static final dd2 d = new dd2(new md2(14), false, -1554010252);
    public static final dd2 e = new dd2(new ed2(7), false, -34780756);
    public static final dd2 f = new dd2(new he2(9), false, 2119862303);
    public static final int[] g = {R.drawable.onboard_comment_avatar_1, R.drawable.onboard_comment_avatar_2, R.drawable.onboard_comment_avatar_3};
    public static final aqd h = new aqd(1);
    public static final vpd i = new vpd(0);
    public static final za5 j;
    public static final za5 k;
    public static final za5 l;
    public static final za5[] m;
    public static gx6 n;

    static {
        za5 za5Var = new za5("commit_to_configuration_v2_api", -1, 1L, true);
        j = za5Var;
        za5 za5Var2 = new za5("get_serving_version_api", -1, 1L, true);
        za5 za5Var3 = new za5("get_experiment_tokens_api", -1, 1L, true);
        za5 za5Var4 = new za5("register_flag_update_listener_api", -1, 2L, true);
        k = za5Var4;
        za5 za5Var5 = new za5("sync_after_api", -1, 1L, true);
        za5 za5Var6 = new za5("sync_after_for_application_api", -1, 1L, true);
        za5 za5Var7 = new za5("set_app_wide_properties_api", -1, 1L, true);
        za5 za5Var8 = new za5("set_runtime_properties_api", -1, 1L, true);
        za5 za5Var9 = new za5("get_storage_info_api", -1, 1L, true);
        l = za5Var9;
        m = new za5[]{za5Var, za5Var2, za5Var3, za5Var4, za5Var5, za5Var6, za5Var7, za5Var8, za5Var9};
    }

    public static Exception A(jg4 jg4Var, String str, Exception exc) throws dz5 {
        if (exc instanceof xx2) {
            return new xx2(jg4Var, str);
        }
        if (exc instanceof k76) {
            return new k76(jg4Var, str);
        }
        throw new dz5();
    }

    public static final gx6 B() {
        gx6 gx6Var = n;
        if (gx6Var != null) {
            return gx6Var;
        }
        fx6 fx6Var = new fx6("AutoMirrored.Filled.ArrowBack", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, true, 96);
        int i2 = msf.a;
        dtd dtdVar = new dtd(y72.b);
        s71 s71Var = new s71(1);
        s71Var.p(20.0f, 11.0f);
        s71Var.l(7.83f);
        s71Var.o(5.59f, -5.59f);
        s71Var.n(12.0f, 4.0f);
        s71Var.o(-8.0f, 8.0f);
        s71Var.o(8.0f, 8.0f);
        s71Var.o(1.41f, -1.41f);
        s71Var.n(7.83f, 13.0f);
        s71Var.l(20.0f);
        s71Var.t(-2.0f);
        s71Var.h();
        fx6.a(fx6Var, s71Var.b, dtdVar, 1.0f, 1.0f, 2, 1.0f);
        gx6 gx6VarB = fx6Var.b();
        n = gx6VarB;
        return gx6VarB;
    }

    public static final em7 C(nyc nycVar) {
        nycVar.getClass();
        if (nycVar instanceof jn2) {
            return ((jn2) nycVar).b;
        }
        if (nycVar instanceof oyc) {
            return C(((oyc) nycVar).a);
        }
        return null;
    }

    public static xn2 D(xn2 xn2Var) {
        xn2Var.getClass();
        zn2 zn2Var = xn2Var instanceof zn2 ? (zn2) xn2Var : null;
        if (zn2Var == null || (xn2Var = zn2Var.a) != null) {
            return xn2Var;
        }
        sv2 sv2Var = (sv2) zn2Var.getContext().F0(hj6.Z);
        xn2 z94Var = sv2Var != null ? new z94(sv2Var, zn2Var) : zn2Var;
        zn2Var.a = z94Var;
        return z94Var;
    }

    public static final boolean E(twc twcVar) {
        gxc gxcVar = cxc.s;
        w79 w79Var = twcVar.a;
        Object objG = w79Var.g(gxcVar);
        if (objG == null) {
            objG = null;
        }
        if (pa7.t(objG, ndb.K0)) {
            return false;
        }
        return w79Var.b(swc.g) || w79Var.b(swc.h);
    }

    public static final ArrayList F(List list, List list2, float f2) {
        int iMax = Math.max(list.size(), list2.size());
        ArrayList arrayList = new ArrayList(iMax);
        for (int i2 = 0; i2 < iMax; i2++) {
            arrayList.add(new y72(abg.R(((y72) list.get(Math.min(i2, list.size() - 1))).a, ((y72) list2.get(Math.min(i2, list2.size() - 1))).a, f2)));
        }
        return arrayList;
    }

    public static final ArrayList G(List list, List list2, float f2) {
        if (list2 == null || list == null) {
            return null;
        }
        int iMax = Math.max(list.size(), list2.size());
        ArrayList arrayList = new ArrayList(iMax);
        for (int i2 = 0; i2 < iMax; i2++) {
            arrayList.add(Float.valueOf(abg.P(((Number) list.get(Math.min(i2, list.size() - 1))).floatValue(), ((Number) list2.get(Math.min(i2, list2.size() - 1))).floatValue(), f2)));
        }
        return arrayList;
    }

    public static final long H(long j2, long j3, float f2) {
        if (((((j2 & 9187343241974906880L) ^ 9187343241974906880L) - 4294967297L) & (-9223372034707292160L)) == 0 && (((9187343241974906880L ^ (j3 & 9187343241974906880L)) - 4294967297L) & (-9223372034707292160L)) == 0) {
            return ynb.W(j2, j3, f2);
        }
        return f2 < 0.5f ? j2 : j3;
    }

    public static final void I(f99 f99Var, gbe gbeVar) {
        if (Q(i99.a, f99Var, gbeVar) != bw2.a) {
            D(gbeVar).g(wef.a);
        }
    }

    public static final String J(String str) {
        str.getClass();
        String string = v4e.o0(str).toString();
        Locale locale = Locale.ROOT;
        locale.getClass();
        String lowerCase = string.toLowerCase(locale);
        lowerCase.getClass();
        return lowerCase;
    }

    public static final LocalTime K(String str) {
        Integer numD;
        str.getClass();
        List listD0 = v4e.d0(str, new char[]{':'}, 6);
        if (listD0.size() == 2 && (numD = c5e.D((String) listD0.get(0))) != null) {
            int iIntValue = numD.intValue();
            Integer numD2 = c5e.D((String) listD0.get(1));
            if (numD2 != null) {
                int iIntValue2 = numD2.intValue();
                if (iIntValue >= 0 && iIntValue < 24 && iIntValue2 >= 0 && iIntValue2 < 60) {
                    return LocalTime.of(iIntValue, iIntValue2);
                }
            }
        }
        return null;
    }

    public static dqa L(String str, vrb vrbVar, a26 a26Var, int i2) {
        if ((i2 & 2) != 0) {
            vrbVar = null;
        }
        js3 js3Var = ga4.a;
        hr3 hr3Var = hr3.c;
        t8e t8eVarD = iqf.d();
        hr3Var.getClass();
        return new dqa(str, vrbVar, a26Var, jgb.k(i7h.I(hr3Var, t8eVarD)));
    }

    public static void M(StringBuilder sb, List list) {
        x67 x67VarX = mh3.X(mh3.c0(0, list.size()), 2);
        int i2 = x67VarX.a;
        int i3 = x67VarX.b;
        int i4 = x67VarX.c;
        if ((i4 <= 0 || i2 > i3) && (i4 >= 0 || i3 > i2)) {
            return;
        }
        while (true) {
            String str = (String) list.get(i2);
            String str2 = (String) list.get(i2 + 1);
            if (i2 > 0) {
                sb.append('&');
            }
            sb.append(str);
            if (str2 != null) {
                sb.append('=');
                sb.append(str2);
            }
            if (i2 == i3) {
                return;
            } else {
                i2 += i4;
            }
        }
    }

    public static final l4d N(b41 b41Var) {
        if (b41Var instanceof l4d) {
            return (l4d) b41Var;
        }
        if (b41Var instanceof dtd) {
            long j2 = ((dtd) b41Var).a;
            return gec.N(0.0f, 14, t72.I(new y72(j2), new y72(j2)));
        }
        ap.c();
        return null;
    }

    public static final String O(float f2) {
        if (Float.isNaN(f2)) {
            return "NaN";
        }
        if (Float.isInfinite(f2)) {
            return f2 < 0.0f ? "-Infinity" : "Infinity";
        }
        int iMax = Math.max(1, 0);
        float fPow = (float) Math.pow(10.0d, iMax);
        float f3 = f2 * fPow;
        int i2 = (int) f3;
        if (f3 - i2 >= 0.5f) {
            i2++;
        }
        float f4 = i2 / fPow;
        return iMax > 0 ? String.valueOf(f4) : String.valueOf((int) f4);
    }

    public static final int P(int i2) {
        int i3 = 306783378 & i2;
        int i4 = 613566756 & i2;
        return (i2 & (-920350135)) | (i4 >> 1) | i3 | ((i3 << 1) & i4);
    }

    public static Object Q(l26 l26Var, Object obj, xn2 xn2Var) {
        l26Var.getClass();
        pv2 context = xn2Var.getContext();
        Object sa7Var = context == nu4.a ? new sa7(xn2Var) : new ta7(xn2Var, context);
        z7f.t(2, l26Var);
        return l26Var.z(obj, sa7Var);
    }

    public static final void a(int i2, l46 l46Var) {
        int i3;
        he2 he2Var;
        he2 he2Var2;
        he2 he2Var3;
        d31 d31Var;
        he2 he2Var4;
        he2 he2Var5;
        l46 l46Var2 = l46Var;
        l46Var2.h0(-1870451400);
        int i4 = 0;
        if (l46Var2.W(i2 & 1, (i2 & 3) != 2)) {
            pr4 pr4Var = l8b.a;
            boolean zE = k8b.e((e8b) l46Var2.k(pr4Var));
            float f2 = zE ? 120.0f : 200.0f;
            g09 g09Var = g09.a;
            j09 j09VarB = b.b(0.0f, f2, g09Var, 1);
            xn8 xn8VarC = s21.c(ndb.b, false);
            int iHashCode = Long.hashCode(l46Var2.T);
            u8a u8aVarM = l46Var2.m();
            j09 j09VarJ = m93.J(l46Var2, j09VarB);
            lf2.q.getClass();
            l46Var2.j0();
            boolean z = l46Var2.S;
            ov7 ov7Var = LayoutNode.h1;
            if (z) {
                l46Var2.l(ov7Var);
            } else {
                l46Var2.s0();
            }
            he2 he2Var6 = hj6.z;
            dec.l(he2Var6, l46Var2, xn8VarC);
            he2 he2Var7 = hj6.y;
            dec.l(he2Var7, l46Var2, u8aVarM);
            Integer numValueOf = Integer.valueOf(iHashCode);
            he2 he2Var8 = hj6.X;
            dec.l(he2Var8, l46Var2, numValueOf);
            dec.k(l46Var2);
            he2 he2Var9 = hj6.x;
            dec.l(he2Var9, l46Var2, j09VarJ);
            d31 d31Var2 = d31.a;
            if (zE) {
                he2Var = he2Var7;
                he2Var2 = he2Var9;
                he2Var3 = he2Var6;
                d31Var = d31Var2;
                l46Var2.f0(506873220);
                l46Var2.r(false);
            } else {
                l46Var2.f0(506662575);
                he2Var = he2Var7;
                he2Var3 = he2Var6;
                he2Var2 = he2Var9;
                d31Var = d31Var2;
                feg.j(od4.A(R.drawable.apple_store_rank_greyscale, 0, l46Var2), null, d31Var2.b(g09Var), null, an2.e, 0.0f, null, l46Var2, 24632, 104);
                l46Var2.r(false);
            }
            j09 j09VarA = d31Var.a(g09Var, ndb.f);
            ia7 ia7Var = ia7.a;
            j09 j09VarF = urg.F(j09VarA, ia7Var);
            t7c t7cVarA = s7c.a(xc0.a, ndb.y, l46Var2, 0);
            int iHashCode2 = Long.hashCode(l46Var2.T);
            u8a u8aVarM2 = l46Var2.m();
            j09 j09VarJ2 = m93.J(l46Var2, j09VarF);
            l46Var2.j0();
            if (l46Var2.S) {
                l46Var2.l(ov7Var);
            } else {
                l46Var2.s0();
            }
            dec.l(he2Var3, l46Var2, t7cVarA);
            dec.l(he2Var, l46Var2, u8aVarM2);
            ib8.s(iHashCode2, l46Var2, he2Var8, l46Var2);
            he2 he2Var10 = he2Var2;
            dec.l(he2Var10, l46Var2, j09VarJ2);
            qfc qfcVar = an2.c;
            if (zE) {
                l46Var2.f0(913279539);
                he2Var5 = he2Var8;
                he2Var4 = he2Var10;
                feg.j(od4.A(R.drawable.apple_store_rank_left, 0, l46Var2), null, ynb.d0(24.0f, 0.0f, 0.0f, 0.0f, 14, b.b), null, qfcVar, 0.0f, null, l46Var2, 25016, 104);
                l46Var2.r(false);
            } else {
                he2Var4 = he2Var10;
                he2Var5 = he2Var8;
                l46Var2.f0(913545984);
                l46Var2.r(false);
            }
            j09 j09VarF2 = urg.F(new jw7(1.0f, true), ia7Var);
            c92 c92VarA = a92.a(new uc0(4.0f, true, new qc0(i4)), ndb.Z, l46Var2, 54);
            int iHashCode3 = Long.hashCode(l46Var2.T);
            u8a u8aVarM3 = l46Var2.m();
            j09 j09VarJ3 = m93.J(l46Var2, j09VarF2);
            l46Var2.j0();
            if (l46Var2.S) {
                l46Var2.l(ov7Var);
            } else {
                l46Var2.s0();
            }
            dec.l(he2Var3, l46Var2, c92VarA);
            dec.l(he2Var, l46Var2, u8aVarM3);
            ib8.s(iHashCode3, l46Var2, he2Var5, l46Var2);
            dec.l(he2Var4, l46Var2, j09VarJ3);
            mue mueVar = pue.a;
            nte.b("#3", null, ((e8b) l46Var2.k(pr4Var)).q, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, pue.o(l46Var2), l46Var, 6, 0, 131066);
            nte.b(afc.q(R.string.onboarding_app_store_rank_category, l46Var), null, ((e8b) l46Var.k(pr4Var)).s, 0L, null, null, 0L, null, new jme(3), 0L, 0, false, 0, 0, null, pue.d(l46Var), l46Var, 0, 0, 130042);
            o5c.f(l46Var, b.d(g09Var, 4.0f));
            nte.b("10M+", null, ((e8b) l46Var.k(pr4Var)).q, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, pue.o(l46Var), l46Var, 6, 0, 131066);
            nte.b(afc.q(R.string.onboarding_app_store_rank_desc, l46Var), null, ((e8b) l46Var.k(pr4Var)).s, 0L, null, null, 0L, null, new jme(3), 0L, 0, false, 0, 0, null, pue.d(l46Var), l46Var, 0, 0, 130042);
            l46Var2 = l46Var;
            i3 = 1;
            l46Var2.r(true);
            if (zE) {
                l46Var2.f0(914616259);
                feg.j(od4.A(R.drawable.apple_store_rank_right, 0, l46Var2), null, b.b, null, qfcVar, 0.0f, null, l46Var2, 25016, 104);
                l46Var2.r(false);
            } else {
                l46Var2.f0(914836576);
                l46Var2.r(false);
            }
            l46Var2.r(true);
            l46Var2.r(true);
        } else {
            i3 = 1;
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new db9(i2, i3);
        }
    }

    public static final void b(final float f2, String str, final mfc mfcVar, l46 l46Var, int i2) {
        l46Var.h0(1253734651);
        int i3 = (l46Var.d(f2) ? 4 : 2) | i2 | (l46Var.g(str) ? 32 : 16) | (l46Var.e(mfcVar.ordinal()) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS);
        int i4 = 0;
        if (l46Var.W(i3 & 1, (i3 & 147) != 146)) {
            q03 q03Var = new q03(0.2f, 0.0f, 0.0f, 1.0f);
            q03 q03Var2 = new q03(0.4f, 0.0f, 1.0f, 1.0f);
            j09 j09VarL = b.l(g09.a, f2);
            lx0 lx0Var = ndb.f;
            Object objR = l46Var.R();
            if (objR == sf2.a) {
                objR = new dz4(q03Var, q03Var2, i4);
                l46Var.p0(objR);
            }
            kn2.c(str, j09VarL, (a26) objR, lx0Var, "event_banner_icon", null, af1.b0(-110862043, new o26() { // from class: ez4
                @Override // defpackage.o26
                public final Object t(Object obj, Object obj2, Object obj3, Object obj4) {
                    String str2;
                    String str3 = (String) obj2;
                    l46 l46Var2 = (l46) obj3;
                    int iIntValue = ((Integer) obj4).intValue();
                    ((ly) obj).getClass();
                    if ((iIntValue & 48) == 0) {
                        iIntValue |= l46Var2.g(str3) ? 32 : 16;
                    }
                    if (l46Var2.W(iIntValue & 1, (iIntValue & 145) != 144)) {
                        j09 j09VarL2 = b.l(g09.a, f2);
                        int iOrdinal = mfcVar.ordinal();
                        if (iOrdinal == 0) {
                            str2 = "lottie/banner-icon-animation.json";
                        } else {
                            if (iOrdinal != 1) {
                                ap.c();
                                return null;
                            }
                            str2 = "lottie/banner-icon-animation-greyscale.json";
                        }
                        if (str3 == null) {
                            l46Var2.f0(835763649);
                            k99.h(0, l46Var2, j09VarL2, str2);
                            l46Var2.r(false);
                        } else if (c5e.u(v4e.i0(v4e.i0(str3, '?'), '#'), ".json", true)) {
                            l46Var2.f0(835767577);
                            k99.p(iIntValue & 112, l46Var2, j09VarL2, str3, str2);
                            l46Var2.r(false);
                        } else {
                            l46Var2.f0(139123080);
                            gdc.a(str3, null, j09VarL2, an2.b, null, l46Var2, ((iIntValue >> 3) & 14) | 1572912, 1976);
                            l46Var2.r(false);
                        }
                    } else {
                        l46Var2.Z();
                    }
                    return wef.a;
                }
            }, l46Var), l46Var, ((i3 >> 3) & 14) | 1600896, 32);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new fz4(f2, str, mfcVar, i2);
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x0162  */
    /* JADX WARN: Code duplicated, block: B:37:0x0197  */
    /* JADX WARN: Code duplicated, block: B:38:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:42:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:48:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:50:0x01e4  */
    public static final void c(int i2, x16 x16Var, l46 l46Var, j09 j09Var) {
        x16 x16Var2;
        j09 j09Var2;
        i8c i8cVar;
        i8c i8cVar2;
        Object objR;
        e89 e89Var;
        boolean zG;
        Object objR2;
        l46 l46Var2 = l46Var;
        l46Var2.h0(977146035);
        int i3 = i2 | 6 | (l46Var2.i(x16Var) ? 32 : 16);
        int i4 = 0;
        if (l46Var2.W(i3 & 1, (i3 & 19) != 18)) {
            Object objR3 = l46Var2.R();
            i8c i8cVar3 = sf2.a;
            if (objR3 == i8cVar3) {
                ca2.a.getClass();
                objR3 = q1c.f(Boolean.valueOf(ca2.c));
                l46Var2.p0(objR3);
            }
            e89 e89Var2 = (e89) objR3;
            boolean zBooleanValue = ((Boolean) e89Var2.g()).booleanValue();
            a26 a26VarA = e89Var2.a();
            Object objR4 = l46Var2.R();
            if (objR4 == i8cVar3) {
                objR4 = q1c.f(Boolean.FALSE);
                l46Var2.p0(objR4);
            }
            e89 e89Var3 = (e89) objR4;
            g09 g09Var = g09.a;
            j09 j09VarA0 = ynb.a0(mh3.N(b.c(g09Var, 1.0f)), 20.0f, 16.0f);
            c92 c92VarA = a92.a(new uc0(16.0f, true, new qc0(i4)), ndb.Z, l46Var2, 54);
            int iHashCode = Long.hashCode(l46Var2.T);
            u8a u8aVarM = l46Var2.m();
            j09 j09VarJ = m93.J(l46Var2, j09VarA0);
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
            j09 j09VarC = b.c(b.b(0.0f, 56.0f, g09Var, 1), 1.0f);
            String strQ = afc.q(R.string.paywall_qixi_purchase, l46Var2);
            int i5 = i3 & 112;
            boolean zH = l46Var2.h(zBooleanValue) | (i5 == 32);
            Object objR5 = l46Var2.R();
            int i6 = 4;
            if (zH) {
                i8cVar = i8cVar3;
            } else {
                if (objR5 == i8cVar) {
                }
                i8cVar = i8cVar3;
                i8cVar2 = i8cVar;
                j09Var2 = g09Var;
                c8b.i(j09VarC, strQ, null, null, 0L, 0.0f, false, null, null, false, null, null, (x16) objR5, l46Var, 6, 0, 4092);
                ynb.s(ynb.a0(b.c(j09Var2, 1.0f), 16.0f, 16.0f), zBooleanValue, a26VarA, null, null, false, l46Var, 6, 56);
                l46Var2 = l46Var;
                l46Var2.r(true);
                if (((Boolean) e89Var3.getValue()).booleanValue()) {
                    l46Var2.f0(-1129853451);
                    k00 k00VarM = z5c.m(1, l46Var2, null);
                    String strQ2 = afc.q(R.string.confirm_to_purchase, l46Var2);
                    String strQ3 = afc.q(R.string.disagree, l46Var2);
                    String strQ4 = afc.q(R.string.continute_to_purchase, l46Var2);
                    dd2 dd2VarB0 = af1.b0(-2042967747, new xg(k00VarM, 4), l46Var2);
                    objR = l46Var2.R();
                    if (objR == i8cVar2) {
                        e89Var = e89Var3;
                        objR = new x08(e89Var, 18);
                        l46Var2.p0(objR);
                    } else {
                        e89Var = e89Var3;
                    }
                    x16 x16Var3 = (x16) objR;
                    zG = (i5 == 32) | l46Var2.g(a26VarA);
                    objR2 = l46Var2.R();
                    if (!zG || objR2 == i8cVar2) {
                        x16Var2 = x16Var;
                        objR2 = new n25(a26VarA, x16Var2, e89Var, 19);
                        l46Var2.p0(objR2);
                    } else {
                        x16Var2 = x16Var;
                    }
                    kj0.F(strQ2, dd2VarB0, strQ4, strQ3, false, false, null, null, x16Var3, (x16) objR2, l46Var2, 100663344, 240);
                    l46Var2.r(false);
                } else {
                    x16Var2 = x16Var;
                    l46Var2.f0(-1129397937);
                    l46Var2.r(false);
                }
            }
            i8cVar = i8cVar3;
            objR5 = new va4(zBooleanValue, x16Var, e89Var3, i6);
            l46Var2.p0(objR5);
            i8cVar = i8cVar3;
            i8cVar2 = i8cVar;
            j09Var2 = g09Var;
            c8b.i(j09VarC, strQ, null, null, 0L, 0.0f, false, null, null, false, null, null, (x16) objR5, l46Var, 6, 0, 4092);
            ynb.s(ynb.a0(b.c(j09Var2, 1.0f), 16.0f, 16.0f), zBooleanValue, a26VarA, null, null, false, l46Var, 6, 56);
            l46Var2 = l46Var;
            l46Var2.r(true);
            if (((Boolean) e89Var3.getValue()).booleanValue()) {
                l46Var2.f0(-1129853451);
                k00 k00VarM2 = z5c.m(1, l46Var2, null);
                String strQ5 = afc.q(R.string.confirm_to_purchase, l46Var2);
                String strQ6 = afc.q(R.string.disagree, l46Var2);
                String strQ7 = afc.q(R.string.continute_to_purchase, l46Var2);
                dd2 dd2VarB1 = af1.b0(-2042967747, new xg(k00VarM2, 4), l46Var2);
                objR = l46Var2.R();
                if (objR == i8cVar2) {
                    e89Var = e89Var3;
                    objR = new x08(e89Var, 18);
                    l46Var2.p0(objR);
                } else {
                    e89Var = e89Var3;
                }
                x16 x16Var4 = (x16) objR;
                zG = (i5 == 32) | l46Var2.g(a26VarA);
                objR2 = l46Var2.R();
                if (zG) {
                    x16Var2 = x16Var;
                    objR2 = new n25(a26VarA, x16Var2, e89Var, 19);
                    l46Var2.p0(objR2);
                } else {
                    x16Var2 = x16Var;
                    objR2 = new n25(a26VarA, x16Var2, e89Var, 19);
                    l46Var2.p0(objR2);
                }
                kj0.F(strQ5, dd2VarB1, strQ7, strQ6, false, false, null, null, x16Var4, (x16) objR2, l46Var2, 100663344, 240);
                l46Var2.r(false);
            } else {
                x16Var2 = x16Var;
                l46Var2.f0(-1129397937);
                l46Var2.r(false);
            }
        } else {
            x16Var2 = x16Var;
            l46Var2.Z();
            j09Var2 = j09Var;
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new fc5(j09Var2, x16Var2, i2, 5);
        }
    }

    public static final void d(int i2, a26 a26Var, l46 l46Var, j09 j09Var, List list) {
        j09 j09Var2;
        ojb ojbVarV;
        bz4 bz4Var;
        float f2;
        list.getClass();
        a26Var.getClass();
        l46Var.h0(-861966948);
        int i3 = i2 | (l46Var.g(list) ? 32 : 16) | (l46Var.i(a26Var) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS);
        int i4 = 0;
        if (l46Var.W(i3 & 1, (i3 & 147) != 146)) {
            if (list.isEmpty()) {
                ojbVarV = l46Var.v();
                if (ojbVarV == null) {
                    return;
                } else {
                    bz4Var = new bz4(i2, 0, a26Var, j09Var, list);
                }
            } else {
                Object objR = l46Var.R();
                i8c i8cVar = sf2.a;
                if (objR == i8cVar) {
                    objR = q1c.f(0);
                    l46Var.p0(objR);
                }
                e89 e89Var = (e89) objR;
                int i5 = i3 & 112;
                boolean z = i5 == 32;
                Object objR2 = l46Var.R();
                if (z || objR2 == i8cVar) {
                    objR2 = new gz4(4000, list, e89Var, null);
                    l46Var.p0(objR2);
                }
                af1.p(list, 4000, (l26) objR2, l46Var);
                mfc mfcVar = ((e8b) l46Var.k(l8b.a)).C;
                int iOrdinal = mfcVar.ordinal();
                float f3 = 32.0f;
                if (iOrdinal == 0) {
                    f2 = 36.0f;
                } else {
                    if (iOrdinal != 1) {
                        ap.c();
                        return;
                    }
                    f2 = 32.0f;
                }
                int iOrdinal2 = mfcVar.ordinal();
                if (iOrdinal2 == 0) {
                    f3 = 20.0f;
                } else if (iOrdinal2 != 1) {
                    ap.c();
                    return;
                }
                float f4 = f3;
                String string = v4e.o0(((wm6) list.get(((Number) e89Var.getValue()).intValue() % list.size())).b).toString();
                String str = string.length() > 0 ? string : null;
                j09Var2 = j09Var;
                j09 j09VarD0 = ynb.d0(f4, 0.0f, 12.0f, 0.0f, 10, k8b.g(j09Var2, new ie2(15), l46Var, 6));
                t7c t7cVarA = s7c.a(new uc0(8.0f, true, new qc0(i4)), ndb.z, l46Var, 54);
                int iHashCode = Long.hashCode(l46Var.T);
                u8a u8aVarM = l46Var.m();
                j09 j09VarJ = m93.J(l46Var, j09VarD0);
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
                b(f2, str, mfcVar, l46Var, 0);
                n(b.c(b.f(48.0f, 0.0f, g09.a, 2), 1.0f), list, ((Number) e89Var.getValue()).intValue(), 0, a26Var, l46Var, i5 | 6 | ((i3 << 6) & 57344));
                l46Var.r(true);
            }
            ojbVarV.d = bz4Var;
        }
        j09Var2 = j09Var;
        l46Var.Z();
        ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            bz4Var = new bz4(i2, 1, a26Var, j09Var2, list);
            ojbVarV.d = bz4Var;
        }
    }

    public static final void e(j09 j09Var, wm6 wm6Var, x16 x16Var, l46 l46Var, int i2) {
        long jD;
        l46Var.h0(-21655671);
        int i3 = i2 | (l46Var.g(wm6Var) ? 32 : 16) | (l46Var.i(x16Var) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS);
        if (l46Var.W(i3 & 1, (i3 & 147) != 146)) {
            Object objR = l46Var.R();
            if (objR == sf2.a) {
                objR = ib8.e(l46Var);
            }
            j09 j09VarB = androidx.compose.foundation.b.b(j09Var, (t69) objR, null, false, null, x16Var, 28);
            t7c t7cVarA = s7c.a(xc0.g, ndb.z, l46Var, 54);
            int iHashCode = Long.hashCode(l46Var.T);
            u8a u8aVarM = l46Var.m();
            j09 j09VarJ = m93.J(l46Var, j09VarB);
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
            jw7 jw7Var = new jw7(1.0f, true);
            String str = wm6Var.a;
            mue mueVar = pue.a;
            mue mueVarF = pue.f(l46Var);
            l46Var.f0(-1771901272);
            pr4 pr4Var = l8b.a;
            if (!k8b.e((e8b) l46Var.k(pr4Var))) {
                l46Var.f0(-1771899362);
                jD = ((e8b) l46Var.k(pr4Var)).q;
                l46Var.r(false);
            } else if (g21.S(l46Var)) {
                l46Var.f0(-1771898175);
                l46Var.r(false);
                jD = abg.d(4062775941L);
            } else {
                l46Var.f0(-1771897215);
                l46Var.r(false);
                jD = abg.d(4073372916L);
            }
            long j2 = jD;
            l46Var.r(false);
            nte.b(str, jw7Var, j2, 0L, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, mueVarF, l46Var, 0, 24960, 110584);
            no6.i(6, 0, l46Var, ynb.d0(8.0f, 0.0f, 0.0f, 0.0f, 14, g09.a));
            l46Var.r(true);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new x6(i2, j09Var, wm6Var, x16Var, 29);
        }
    }

    public static final void f(int i2, l46 l46Var, j09 j09Var, ArrayList arrayList) {
        long j2;
        l46Var.h0(1762401329);
        int i3 = i2 | (l46Var.g(arrayList) ? 4 : 2);
        int i4 = 0;
        if (l46Var.W(i3 & 1, (i3 & 19) != 18)) {
            boolean z = (i3 & 14) == 4;
            Object objR = l46Var.R();
            Object obj = sf2.a;
            if (z || objR == obj) {
                objR = new ep9(i4, arrayList);
                l46Var.p0(objR);
            }
            cs3 cs3VarB = ay9.b(0, 0, 3, (x16) objR, l46Var);
            boolean zG = l46Var.g(cs3VarB);
            Object objR2 = l46Var.R();
            if (zG || objR2 == obj) {
                objR2 = new gp9(cs3VarB, null);
                l46Var.p0(objR2);
            }
            af1.o((l26) objR2, l46Var, wef.a);
            c92 c92VarA = a92.a(xc0.c, ndb.Y, l46Var, 0);
            int iHashCode = Long.hashCode(l46Var.T);
            u8a u8aVarM = l46Var.m();
            j09 j09VarJ = m93.J(l46Var, j09Var);
            lf2.q.getClass();
            l46Var.j0();
            boolean z2 = l46Var.S;
            x16 x16Var = LayoutNode.h1;
            if (z2) {
                l46Var.l(x16Var);
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
            g09 g09Var2 = g09Var;
            cn1.h(12.0f, arrayList.size() - 1, 196608, 16332, null, af1.b0(-1686106072, new wt(10, arrayList), l46Var), l46Var, ynb.b0(eze.a(l46Var).c.c, 0.0f, b.c(g09Var, 1.0f), 2), null, null, null, null, cs3VarB, null, null, false);
            j09 j09VarD0 = ynb.d0(0.0f, 12.0f, 0.0f, 0.0f, 13, new mq6(ndb.Z));
            t7c t7cVarA = s7c.a(new uc0(8.0f, true, new qc0(i4)), ndb.y, l46Var, 6);
            int iHashCode2 = Long.hashCode(l46Var.T);
            u8a u8aVarM2 = l46Var.m();
            j09 j09VarJ2 = m93.J(l46Var, j09VarD0);
            l46Var.j0();
            if (l46Var.S) {
                l46Var.l(x16Var);
            } else {
                l46Var.s0();
            }
            dec.l(he2Var, l46Var, t7cVarA);
            dec.l(he2Var2, l46Var, u8aVarM2);
            ib8.s(iHashCode2, l46Var, he2Var3, l46Var);
            dec.l(he2Var4, l46Var, j09VarJ2);
            l46Var.f0(599522858);
            int size = arrayList.size();
            int i5 = 0;
            while (i5 < size) {
                g09 g09Var3 = g09Var2;
                j09 j09VarL = b.l(g09Var3, 8.0f);
                if (((sz9) cs3VarB.d.c).j() == i5) {
                    l46Var.f0(-504576536);
                    j2 = ((e8b) l46Var.k(l8b.a)).u;
                } else {
                    l46Var.f0(-504575695);
                    j2 = ((e8b) l46Var.k(l8b.a)).A;
                }
                l46Var.r(false);
                t72.d(48, j2, l46Var, j09VarL);
                i5++;
                g09Var2 = g09Var3;
            }
            tec.s(l46Var, false, true, true);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new fp9(arrayList, j09Var, i2);
        }
    }

    public static final long g(int i2) {
        long j2 = ((long) i2) << 32;
        int i3 = ko7.O;
        return j2;
    }

    public static final void h(int i2, l46 l46Var, j09 j09Var, String str) {
        int i3;
        l46Var.h0(-1473142177);
        if ((i2 & 6) == 0) {
            i3 = (l46Var.g(j09Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= l46Var.g(str) ? 32 : 16;
        }
        int i4 = 1;
        if (l46Var.W(i3 & 1, (i3 & 19) != 18)) {
            od4.g(j09Var, str, false, Integer.MAX_VALUE, 0.0f, ndb.w, null, l46Var, (i3 & 14) | 199680 | (i3 & 112), 84);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new o43(j09Var, str, i2, i4);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x022f  */
    /* JADX WARN: Code duplicated, block: B:102:0x0241  */
    /* JADX WARN: Code duplicated, block: B:104:0x0245  */
    /* JADX WARN: Code duplicated, block: B:107:0x02a0  */
    /* JADX WARN: Code duplicated, block: B:109:0x02a4  */
    /* JADX WARN: Code duplicated, block: B:112:0x02d1  */
    /* JADX WARN: Code duplicated, block: B:114:0x02e6  */
    /* JADX WARN: Code duplicated, block: B:117:0x02f2  */
    /* JADX WARN: Code duplicated, block: B:119:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x0057  */
    /* JADX WARN: Code duplicated, block: B:35:0x005c  */
    /* JADX WARN: Code duplicated, block: B:37:0x0060  */
    /* JADX WARN: Code duplicated, block: B:39:0x0068  */
    /* JADX WARN: Code duplicated, block: B:40:0x006b  */
    /* JADX WARN: Code duplicated, block: B:44:0x0074  */
    /* JADX WARN: Code duplicated, block: B:46:0x0079  */
    /* JADX WARN: Code duplicated, block: B:48:0x007d  */
    /* JADX WARN: Code duplicated, block: B:50:0x0085  */
    /* JADX WARN: Code duplicated, block: B:51:0x0087  */
    /* JADX WARN: Code duplicated, block: B:55:0x0093  */
    /* JADX WARN: Code duplicated, block: B:56:0x0095  */
    /* JADX WARN: Code duplicated, block: B:59:0x009e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:60:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:64:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:66:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:69:0x00bf A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:70:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:73:0x00db  */
    /* JADX WARN: Code duplicated, block: B:76:0x00ee A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:77:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:80:0x010b  */
    /* JADX WARN: Code duplicated, block: B:81:0x010e  */
    /* JADX WARN: Code duplicated, block: B:84:0x0118 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:85:0x011a  */
    /* JADX WARN: Code duplicated, block: B:88:0x014c  */
    /* JADX WARN: Code duplicated, block: B:89:0x014e  */
    /* JADX WARN: Code duplicated, block: B:92:0x0156 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:93:0x0158  */
    /* JADX WARN: Code duplicated, block: B:96:0x0194  */
    /* JADX WARN: Code duplicated, block: B:97:0x019a  */
    public static final void i(j09 j09Var, z19 z19Var, boolean z, int i2, a26 a26Var, l46 l46Var, int i3, int i4) {
        int i5;
        boolean z2;
        int i6;
        int i7;
        int i8;
        int i9;
        a26 a26Var2;
        int i10;
        int i11;
        boolean z3;
        boolean z4;
        int i12;
        a26 a26Var3;
        ojb ojbVarV;
        boolean z5;
        int i13;
        int size;
        boolean zE;
        Object objR;
        i8c i8cVar;
        cs3 cs3VarB;
        hzc hzcVar;
        Object objR2;
        aw2 aw2Var;
        boolean zE2;
        Object objR3;
        int i14;
        boolean z6;
        boolean z7;
        Object objR4;
        cs3 cs3VarL;
        ghc ghcVarT;
        boolean z8;
        boolean z9;
        Object objR5;
        g09 g09Var;
        int i15;
        int iJ;
        boolean zI;
        Object objR6;
        l46 l46Var2 = l46Var;
        l46Var2.h0(-265266064);
        if ((i3 & 6) == 0) {
            i5 = (l46Var2.g(j09Var) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= (i3 & 64) == 0 ? l46Var2.g(z19Var) : l46Var2.i(z19Var) ? 32 : 16;
        }
        int i16 = i4 & 4;
        if (i16 == 0) {
            if ((i3 & 384) == 0) {
                z2 = z;
                i5 |= l46Var2.h(z2) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
            }
            i6 = i4 & 8;
            if (i6 != 0) {
                if ((i3 & 3072) == 0) {
                    i7 = i2;
                    if (l46Var2.e(i7)) {
                        i8 = 2048;
                    } else {
                        i8 = UserMetadata.MAX_ATTRIBUTE_SIZE;
                    }
                    i5 |= i8;
                }
                i9 = i4 & 16;
                if (i9 != 0) {
                    if ((i3 & 24576) == 0) {
                        a26Var2 = a26Var;
                        if (l46Var2.i(a26Var2)) {
                            i10 = 16384;
                        } else {
                            i10 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
                        }
                        i5 |= i10;
                    }
                    i11 = 1;
                    if ((i5 & 9363) != 9362) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (l46Var2.W(i5 & 1, z3)) {
                        if (i16 != 0) {
                            z5 = true;
                        } else {
                            z5 = z2;
                        }
                        if (i6 != 0) {
                            i13 = 0;
                        } else {
                            i13 = i7;
                        }
                        if (i9 != 0) {
                            a26Var2 = null;
                        }
                        size = z19Var.d.size();
                        zE = l46Var2.e(size);
                        objR = l46Var2.R();
                        i8cVar = sf2.a;
                        if (zE || objR == i8cVar) {
                            objR = new a12(size, i11);
                            l46Var2.p0(objR);
                        }
                        cs3VarB = ay9.b(i13, (i5 >> 9) & 14, 2, (x16) objR, l46Var2);
                        hzcVar = cs3VarB.d;
                        objR2 = l46Var2.R();
                        if (objR2 == i8cVar) {
                            objR2 = af1.E(l46Var2);
                            l46Var2.p0(objR2);
                        }
                        aw2Var = (aw2) objR2;
                        zE2 = l46Var2.e(size);
                        objR3 = l46Var2.R();
                        if (zE2 || objR3 == i8cVar) {
                            objR3 = new a12(size, i11);
                            l46Var2.p0(objR3);
                        }
                        x16 x16Var = (x16) objR3;
                        boolean zI2 = l46Var2.i(aw2Var) | l46Var2.g(cs3VarB);
                        i14 = i5 & 57344;
                        if (i14 == 16384) {
                            z6 = true;
                        } else {
                            z6 = false;
                        }
                        z7 = zI2 | z6;
                        objR4 = l46Var2.R();
                        if (z7 || objR4 == i8cVar) {
                            objR4 = new wg4(aw2Var, a26Var2, cs3VarB, i11);
                            l46Var2.p0(objR4);
                        }
                        cs3VarL = m93.L(x16Var, (a26) objR4, i13, l46Var2, (i5 >> 3) & 896, 0);
                        int i17 = i13;
                        ghcVarT = mh3.T(l46Var2);
                        boolean zG = l46Var2.g(cs3VarL) | l46Var2.e(size);
                        if (i14 == 16384) {
                            z8 = true;
                        } else {
                            z8 = false;
                        }
                        z9 = zG | z8;
                        objR5 = l46Var2.R();
                        if (z9 || objR5 == i8cVar) {
                            objR5 = new t19(size, null, a26Var2, cs3VarL);
                            l46Var2.p0(objR5);
                        }
                        af1.o((l26) objR5, l46Var2, cs3VarL);
                        c92 c92VarA = a92.a(new uc0(16.0f, true, new qc0(0)), ndb.Y, l46Var2, 6);
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
                        g09Var = g09.a;
                        d8c.b(b.d(b.c(g09Var, 1.0f), 220.0f), null, ynb.q(0.0f, 8.0f, 1), af1.b0(1053922281, new s19(0, z19Var, cs3VarL), l46Var2), l46Var, 3462, 2);
                        l46Var2 = l46Var;
                        a26 a26Var4 = a26Var2;
                        i15 = 1;
                        cn1.h(0.0f, 0, 100663296, 16126, null, af1.b0(-1895522521, new wt(7, z19Var), l46Var2), l46Var2, null, null, null, null, null, cs3VarB, null, null, false);
                        if (z5) {
                            l46Var2.f0(-1700505360);
                            if (((sz9) hzcVar.c).j() + 1 >= size) {
                                iJ = 0;
                            } else {
                                iJ = ((sz9) hzcVar.c).j() + 1;
                            }
                            j09 j09VarC = b.c(g09Var, 1.0f);
                            String strR = afc.r(R.string.annual_view_fortune_about_month, new Object[]{Integer.valueOf(iJ + 1)}, l46Var2);
                            bx9 bx9Var = v51.a;
                            pr4 pr4Var = l8b.a;
                            u51 u51VarA = v51.a(((e8b) l46Var2.k(pr4Var)).m, ((e8b) l46Var2.k(pr4Var)).q, 0L, 0L, l46Var, 12);
                            zI = l46Var.i(aw2Var) | l46Var.g(cs3VarL) | l46Var.g(ghcVarT);
                            objR6 = l46Var.R();
                            if (zI || objR6 == i8cVar) {
                                objR6 = new xg4(aw2Var, cs3VarL, ghcVarT, i15);
                                l46Var.p0(objR6);
                            }
                            c8b.i(j09VarC, strR, null, null, 0L, 0.0f, false, null, u51VarA, false, null, null, (x16) objR6, l46Var, 6, 0, 3836);
                            l46Var2 = l46Var;
                            l46Var2.r(false);
                        } else {
                            l46Var2.f0(-1699909540);
                            l46Var2.r(false);
                        }
                        l46Var2.r(true);
                        z4 = z5;
                        i12 = i17;
                        a26Var3 = a26Var4;
                    } else {
                        l46Var2.Z();
                        z4 = z2;
                        i12 = i7;
                        a26Var3 = a26Var2;
                    }
                    ojbVarV = l46Var2.v();
                    if (ojbVarV != null) {
                        ojbVarV.d = new bb4(j09Var, z19Var, z4, i12, a26Var3, i3, i4, 2);
                    }
                }
                i5 |= 24576;
                a26Var2 = a26Var;
                i11 = 1;
                if ((i5 & 9363) != 9362) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (l46Var2.W(i5 & 1, z3)) {
                    if (i16 != 0) {
                        z5 = true;
                    } else {
                        z5 = z2;
                    }
                    if (i6 != 0) {
                        i13 = 0;
                    } else {
                        i13 = i7;
                    }
                    if (i9 != 0) {
                        a26Var2 = null;
                    }
                    size = z19Var.d.size();
                    zE = l46Var2.e(size);
                    objR = l46Var2.R();
                    i8cVar = sf2.a;
                    if (zE) {
                        objR = new a12(size, i11);
                        l46Var2.p0(objR);
                    } else {
                        objR = new a12(size, i11);
                        l46Var2.p0(objR);
                    }
                    cs3VarB = ay9.b(i13, (i5 >> 9) & 14, 2, (x16) objR, l46Var2);
                    hzcVar = cs3VarB.d;
                    objR2 = l46Var2.R();
                    if (objR2 == i8cVar) {
                        objR2 = af1.E(l46Var2);
                        l46Var2.p0(objR2);
                    }
                    aw2Var = (aw2) objR2;
                    zE2 = l46Var2.e(size);
                    objR3 = l46Var2.R();
                    if (zE2) {
                        objR3 = new a12(size, i11);
                        l46Var2.p0(objR3);
                    } else {
                        objR3 = new a12(size, i11);
                        l46Var2.p0(objR3);
                    }
                    x16 x16Var2 = (x16) objR3;
                    boolean zI3 = l46Var2.i(aw2Var) | l46Var2.g(cs3VarB);
                    i14 = i5 & 57344;
                    if (i14 == 16384) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    z7 = zI3 | z6;
                    objR4 = l46Var2.R();
                    if (z7) {
                        objR4 = new wg4(aw2Var, a26Var2, cs3VarB, i11);
                        l46Var2.p0(objR4);
                    } else {
                        objR4 = new wg4(aw2Var, a26Var2, cs3VarB, i11);
                        l46Var2.p0(objR4);
                    }
                    cs3VarL = m93.L(x16Var2, (a26) objR4, i13, l46Var2, (i5 >> 3) & 896, 0);
                    int i18 = i13;
                    ghcVarT = mh3.T(l46Var2);
                    boolean zG2 = l46Var2.g(cs3VarL) | l46Var2.e(size);
                    if (i14 == 16384) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    z9 = zG2 | z8;
                    objR5 = l46Var2.R();
                    if (z9) {
                        objR5 = new t19(size, null, a26Var2, cs3VarL);
                        l46Var2.p0(objR5);
                    } else {
                        objR5 = new t19(size, null, a26Var2, cs3VarL);
                        l46Var2.p0(objR5);
                    }
                    af1.o((l26) objR5, l46Var2, cs3VarL);
                    c92 c92VarA2 = a92.a(new uc0(16.0f, true, new qc0(0)), ndb.Y, l46Var2, 6);
                    int iHashCode2 = Long.hashCode(l46Var2.T);
                    u8a u8aVarM2 = l46Var2.m();
                    j09 j09VarJ2 = m93.J(l46Var2, j09Var);
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
                    g09Var = g09.a;
                    d8c.b(b.d(b.c(g09Var, 1.0f), 220.0f), null, ynb.q(0.0f, 8.0f, 1), af1.b0(1053922281, new s19(0, z19Var, cs3VarL), l46Var2), l46Var, 3462, 2);
                    l46Var2 = l46Var;
                    a26 a26Var5 = a26Var2;
                    i15 = 1;
                    cn1.h(0.0f, 0, 100663296, 16126, null, af1.b0(-1895522521, new wt(7, z19Var), l46Var2), l46Var2, null, null, null, null, null, cs3VarB, null, null, false);
                    if (z5) {
                        l46Var2.f0(-1700505360);
                        if (((sz9) hzcVar.c).j() + 1 >= size) {
                            iJ = 0;
                        } else {
                            iJ = ((sz9) hzcVar.c).j() + 1;
                        }
                        j09 j09VarC2 = b.c(g09Var, 1.0f);
                        String strR2 = afc.r(R.string.annual_view_fortune_about_month, new Object[]{Integer.valueOf(iJ + 1)}, l46Var2);
                        bx9 bx9Var2 = v51.a;
                        pr4 pr4Var2 = l8b.a;
                        u51 u51VarA2 = v51.a(((e8b) l46Var2.k(pr4Var2)).m, ((e8b) l46Var2.k(pr4Var2)).q, 0L, 0L, l46Var, 12);
                        zI = l46Var.i(aw2Var) | l46Var.g(cs3VarL) | l46Var.g(ghcVarT);
                        objR6 = l46Var.R();
                        if (zI) {
                            objR6 = new xg4(aw2Var, cs3VarL, ghcVarT, i15);
                            l46Var.p0(objR6);
                        } else {
                            objR6 = new xg4(aw2Var, cs3VarL, ghcVarT, i15);
                            l46Var.p0(objR6);
                        }
                        c8b.i(j09VarC2, strR2, null, null, 0L, 0.0f, false, null, u51VarA2, false, null, null, (x16) objR6, l46Var, 6, 0, 3836);
                        l46Var2 = l46Var;
                        l46Var2.r(false);
                    } else {
                        l46Var2.f0(-1699909540);
                        l46Var2.r(false);
                    }
                    l46Var2.r(true);
                    z4 = z5;
                    i12 = i18;
                    a26Var3 = a26Var5;
                } else {
                    l46Var2.Z();
                    z4 = z2;
                    i12 = i7;
                    a26Var3 = a26Var2;
                }
                ojbVarV = l46Var2.v();
                if (ojbVarV != null) {
                    ojbVarV.d = new bb4(j09Var, z19Var, z4, i12, a26Var3, i3, i4, 2);
                }
            }
            i5 |= 3072;
            i7 = i2;
            i9 = i4 & 16;
            if (i9 != 0) {
                if ((i3 & 24576) == 0) {
                    a26Var2 = a26Var;
                    if (l46Var2.i(a26Var2)) {
                        i10 = 16384;
                    } else {
                        i10 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
                    }
                    i5 |= i10;
                }
                i11 = 1;
                if ((i5 & 9363) != 9362) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (l46Var2.W(i5 & 1, z3)) {
                    if (i16 != 0) {
                        z5 = true;
                    } else {
                        z5 = z2;
                    }
                    if (i6 != 0) {
                        i13 = 0;
                    } else {
                        i13 = i7;
                    }
                    if (i9 != 0) {
                        a26Var2 = null;
                    }
                    size = z19Var.d.size();
                    zE = l46Var2.e(size);
                    objR = l46Var2.R();
                    i8cVar = sf2.a;
                    if (zE) {
                        objR = new a12(size, i11);
                        l46Var2.p0(objR);
                    } else {
                        objR = new a12(size, i11);
                        l46Var2.p0(objR);
                    }
                    cs3VarB = ay9.b(i13, (i5 >> 9) & 14, 2, (x16) objR, l46Var2);
                    hzcVar = cs3VarB.d;
                    objR2 = l46Var2.R();
                    if (objR2 == i8cVar) {
                        objR2 = af1.E(l46Var2);
                        l46Var2.p0(objR2);
                    }
                    aw2Var = (aw2) objR2;
                    zE2 = l46Var2.e(size);
                    objR3 = l46Var2.R();
                    if (zE2) {
                        objR3 = new a12(size, i11);
                        l46Var2.p0(objR3);
                    } else {
                        objR3 = new a12(size, i11);
                        l46Var2.p0(objR3);
                    }
                    x16 x16Var3 = (x16) objR3;
                    boolean zI4 = l46Var2.i(aw2Var) | l46Var2.g(cs3VarB);
                    i14 = i5 & 57344;
                    if (i14 == 16384) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    z7 = zI4 | z6;
                    objR4 = l46Var2.R();
                    if (z7) {
                        objR4 = new wg4(aw2Var, a26Var2, cs3VarB, i11);
                        l46Var2.p0(objR4);
                    } else {
                        objR4 = new wg4(aw2Var, a26Var2, cs3VarB, i11);
                        l46Var2.p0(objR4);
                    }
                    cs3VarL = m93.L(x16Var3, (a26) objR4, i13, l46Var2, (i5 >> 3) & 896, 0);
                    int i19 = i13;
                    ghcVarT = mh3.T(l46Var2);
                    boolean zG3 = l46Var2.g(cs3VarL) | l46Var2.e(size);
                    if (i14 == 16384) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    z9 = zG3 | z8;
                    objR5 = l46Var2.R();
                    if (z9) {
                        objR5 = new t19(size, null, a26Var2, cs3VarL);
                        l46Var2.p0(objR5);
                    } else {
                        objR5 = new t19(size, null, a26Var2, cs3VarL);
                        l46Var2.p0(objR5);
                    }
                    af1.o((l26) objR5, l46Var2, cs3VarL);
                    c92 c92VarA3 = a92.a(new uc0(16.0f, true, new qc0(0)), ndb.Y, l46Var2, 6);
                    int iHashCode3 = Long.hashCode(l46Var2.T);
                    u8a u8aVarM3 = l46Var2.m();
                    j09 j09VarJ3 = m93.J(l46Var2, j09Var);
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
                    g09Var = g09.a;
                    d8c.b(b.d(b.c(g09Var, 1.0f), 220.0f), null, ynb.q(0.0f, 8.0f, 1), af1.b0(1053922281, new s19(0, z19Var, cs3VarL), l46Var2), l46Var, 3462, 2);
                    l46Var2 = l46Var;
                    a26 a26Var6 = a26Var2;
                    i15 = 1;
                    cn1.h(0.0f, 0, 100663296, 16126, null, af1.b0(-1895522521, new wt(7, z19Var), l46Var2), l46Var2, null, null, null, null, null, cs3VarB, null, null, false);
                    if (z5) {
                        l46Var2.f0(-1700505360);
                        if (((sz9) hzcVar.c).j() + 1 >= size) {
                            iJ = 0;
                        } else {
                            iJ = ((sz9) hzcVar.c).j() + 1;
                        }
                        j09 j09VarC3 = b.c(g09Var, 1.0f);
                        String strR3 = afc.r(R.string.annual_view_fortune_about_month, new Object[]{Integer.valueOf(iJ + 1)}, l46Var2);
                        bx9 bx9Var3 = v51.a;
                        pr4 pr4Var3 = l8b.a;
                        u51 u51VarA3 = v51.a(((e8b) l46Var2.k(pr4Var3)).m, ((e8b) l46Var2.k(pr4Var3)).q, 0L, 0L, l46Var, 12);
                        zI = l46Var.i(aw2Var) | l46Var.g(cs3VarL) | l46Var.g(ghcVarT);
                        objR6 = l46Var.R();
                        if (zI) {
                            objR6 = new xg4(aw2Var, cs3VarL, ghcVarT, i15);
                            l46Var.p0(objR6);
                        } else {
                            objR6 = new xg4(aw2Var, cs3VarL, ghcVarT, i15);
                            l46Var.p0(objR6);
                        }
                        c8b.i(j09VarC3, strR3, null, null, 0L, 0.0f, false, null, u51VarA3, false, null, null, (x16) objR6, l46Var, 6, 0, 3836);
                        l46Var2 = l46Var;
                        l46Var2.r(false);
                    } else {
                        l46Var2.f0(-1699909540);
                        l46Var2.r(false);
                    }
                    l46Var2.r(true);
                    z4 = z5;
                    i12 = i19;
                    a26Var3 = a26Var6;
                } else {
                    l46Var2.Z();
                    z4 = z2;
                    i12 = i7;
                    a26Var3 = a26Var2;
                }
                ojbVarV = l46Var2.v();
                if (ojbVarV != null) {
                    ojbVarV.d = new bb4(j09Var, z19Var, z4, i12, a26Var3, i3, i4, 2);
                }
            }
            i5 |= 24576;
            a26Var2 = a26Var;
            i11 = 1;
            if ((i5 & 9363) != 9362) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (l46Var2.W(i5 & 1, z3)) {
                if (i16 != 0) {
                    z5 = true;
                } else {
                    z5 = z2;
                }
                if (i6 != 0) {
                    i13 = 0;
                } else {
                    i13 = i7;
                }
                if (i9 != 0) {
                    a26Var2 = null;
                }
                size = z19Var.d.size();
                zE = l46Var2.e(size);
                objR = l46Var2.R();
                i8cVar = sf2.a;
                if (zE) {
                    objR = new a12(size, i11);
                    l46Var2.p0(objR);
                } else {
                    objR = new a12(size, i11);
                    l46Var2.p0(objR);
                }
                cs3VarB = ay9.b(i13, (i5 >> 9) & 14, 2, (x16) objR, l46Var2);
                hzcVar = cs3VarB.d;
                objR2 = l46Var2.R();
                if (objR2 == i8cVar) {
                    objR2 = af1.E(l46Var2);
                    l46Var2.p0(objR2);
                }
                aw2Var = (aw2) objR2;
                zE2 = l46Var2.e(size);
                objR3 = l46Var2.R();
                if (zE2) {
                    objR3 = new a12(size, i11);
                    l46Var2.p0(objR3);
                } else {
                    objR3 = new a12(size, i11);
                    l46Var2.p0(objR3);
                }
                x16 x16Var4 = (x16) objR3;
                boolean zI5 = l46Var2.i(aw2Var) | l46Var2.g(cs3VarB);
                i14 = i5 & 57344;
                if (i14 == 16384) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                z7 = zI5 | z6;
                objR4 = l46Var2.R();
                if (z7) {
                    objR4 = new wg4(aw2Var, a26Var2, cs3VarB, i11);
                    l46Var2.p0(objR4);
                } else {
                    objR4 = new wg4(aw2Var, a26Var2, cs3VarB, i11);
                    l46Var2.p0(objR4);
                }
                cs3VarL = m93.L(x16Var4, (a26) objR4, i13, l46Var2, (i5 >> 3) & 896, 0);
                int i110 = i13;
                ghcVarT = mh3.T(l46Var2);
                boolean zG4 = l46Var2.g(cs3VarL) | l46Var2.e(size);
                if (i14 == 16384) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                z9 = zG4 | z8;
                objR5 = l46Var2.R();
                if (z9) {
                    objR5 = new t19(size, null, a26Var2, cs3VarL);
                    l46Var2.p0(objR5);
                } else {
                    objR5 = new t19(size, null, a26Var2, cs3VarL);
                    l46Var2.p0(objR5);
                }
                af1.o((l26) objR5, l46Var2, cs3VarL);
                c92 c92VarA4 = a92.a(new uc0(16.0f, true, new qc0(0)), ndb.Y, l46Var2, 6);
                int iHashCode4 = Long.hashCode(l46Var2.T);
                u8a u8aVarM4 = l46Var2.m();
                j09 j09VarJ4 = m93.J(l46Var2, j09Var);
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
                g09Var = g09.a;
                d8c.b(b.d(b.c(g09Var, 1.0f), 220.0f), null, ynb.q(0.0f, 8.0f, 1), af1.b0(1053922281, new s19(0, z19Var, cs3VarL), l46Var2), l46Var, 3462, 2);
                l46Var2 = l46Var;
                a26 a26Var7 = a26Var2;
                i15 = 1;
                cn1.h(0.0f, 0, 100663296, 16126, null, af1.b0(-1895522521, new wt(7, z19Var), l46Var2), l46Var2, null, null, null, null, null, cs3VarB, null, null, false);
                if (z5) {
                    l46Var2.f0(-1700505360);
                    if (((sz9) hzcVar.c).j() + 1 >= size) {
                        iJ = 0;
                    } else {
                        iJ = ((sz9) hzcVar.c).j() + 1;
                    }
                    j09 j09VarC4 = b.c(g09Var, 1.0f);
                    String strR4 = afc.r(R.string.annual_view_fortune_about_month, new Object[]{Integer.valueOf(iJ + 1)}, l46Var2);
                    bx9 bx9Var4 = v51.a;
                    pr4 pr4Var4 = l8b.a;
                    u51 u51VarA4 = v51.a(((e8b) l46Var2.k(pr4Var4)).m, ((e8b) l46Var2.k(pr4Var4)).q, 0L, 0L, l46Var, 12);
                    zI = l46Var.i(aw2Var) | l46Var.g(cs3VarL) | l46Var.g(ghcVarT);
                    objR6 = l46Var.R();
                    if (zI) {
                        objR6 = new xg4(aw2Var, cs3VarL, ghcVarT, i15);
                        l46Var.p0(objR6);
                    } else {
                        objR6 = new xg4(aw2Var, cs3VarL, ghcVarT, i15);
                        l46Var.p0(objR6);
                    }
                    c8b.i(j09VarC4, strR4, null, null, 0L, 0.0f, false, null, u51VarA4, false, null, null, (x16) objR6, l46Var, 6, 0, 3836);
                    l46Var2 = l46Var;
                    l46Var2.r(false);
                } else {
                    l46Var2.f0(-1699909540);
                    l46Var2.r(false);
                }
                l46Var2.r(true);
                z4 = z5;
                i12 = i110;
                a26Var3 = a26Var7;
            } else {
                l46Var2.Z();
                z4 = z2;
                i12 = i7;
                a26Var3 = a26Var2;
            }
            ojbVarV = l46Var2.v();
            if (ojbVarV != null) {
                ojbVarV.d = new bb4(j09Var, z19Var, z4, i12, a26Var3, i3, i4, 2);
            }
        }
        i5 |= 384;
        z2 = z;
        i6 = i4 & 8;
        if (i6 != 0) {
            if ((i3 & 3072) == 0) {
                i7 = i2;
                if (l46Var2.e(i7)) {
                    i8 = 2048;
                } else {
                    i8 = UserMetadata.MAX_ATTRIBUTE_SIZE;
                }
                i5 |= i8;
            }
            i9 = i4 & 16;
            if (i9 != 0) {
                if ((i3 & 24576) == 0) {
                    a26Var2 = a26Var;
                    if (l46Var2.i(a26Var2)) {
                        i10 = 16384;
                    } else {
                        i10 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
                    }
                    i5 |= i10;
                }
                i11 = 1;
                if ((i5 & 9363) != 9362) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (l46Var2.W(i5 & 1, z3)) {
                    if (i16 != 0) {
                        z5 = true;
                    } else {
                        z5 = z2;
                    }
                    if (i6 != 0) {
                        i13 = 0;
                    } else {
                        i13 = i7;
                    }
                    if (i9 != 0) {
                        a26Var2 = null;
                    }
                    size = z19Var.d.size();
                    zE = l46Var2.e(size);
                    objR = l46Var2.R();
                    i8cVar = sf2.a;
                    if (zE) {
                        objR = new a12(size, i11);
                        l46Var2.p0(objR);
                    } else {
                        objR = new a12(size, i11);
                        l46Var2.p0(objR);
                    }
                    cs3VarB = ay9.b(i13, (i5 >> 9) & 14, 2, (x16) objR, l46Var2);
                    hzcVar = cs3VarB.d;
                    objR2 = l46Var2.R();
                    if (objR2 == i8cVar) {
                        objR2 = af1.E(l46Var2);
                        l46Var2.p0(objR2);
                    }
                    aw2Var = (aw2) objR2;
                    zE2 = l46Var2.e(size);
                    objR3 = l46Var2.R();
                    if (zE2) {
                        objR3 = new a12(size, i11);
                        l46Var2.p0(objR3);
                    } else {
                        objR3 = new a12(size, i11);
                        l46Var2.p0(objR3);
                    }
                    x16 x16Var5 = (x16) objR3;
                    boolean zI6 = l46Var2.i(aw2Var) | l46Var2.g(cs3VarB);
                    i14 = i5 & 57344;
                    if (i14 == 16384) {
                        z6 = true;
                    } else {
                        z6 = false;
                    }
                    z7 = zI6 | z6;
                    objR4 = l46Var2.R();
                    if (z7) {
                        objR4 = new wg4(aw2Var, a26Var2, cs3VarB, i11);
                        l46Var2.p0(objR4);
                    } else {
                        objR4 = new wg4(aw2Var, a26Var2, cs3VarB, i11);
                        l46Var2.p0(objR4);
                    }
                    cs3VarL = m93.L(x16Var5, (a26) objR4, i13, l46Var2, (i5 >> 3) & 896, 0);
                    int i111 = i13;
                    ghcVarT = mh3.T(l46Var2);
                    boolean zG5 = l46Var2.g(cs3VarL) | l46Var2.e(size);
                    if (i14 == 16384) {
                        z8 = true;
                    } else {
                        z8 = false;
                    }
                    z9 = zG5 | z8;
                    objR5 = l46Var2.R();
                    if (z9) {
                        objR5 = new t19(size, null, a26Var2, cs3VarL);
                        l46Var2.p0(objR5);
                    } else {
                        objR5 = new t19(size, null, a26Var2, cs3VarL);
                        l46Var2.p0(objR5);
                    }
                    af1.o((l26) objR5, l46Var2, cs3VarL);
                    c92 c92VarA5 = a92.a(new uc0(16.0f, true, new qc0(0)), ndb.Y, l46Var2, 6);
                    int iHashCode5 = Long.hashCode(l46Var2.T);
                    u8a u8aVarM5 = l46Var2.m();
                    j09 j09VarJ5 = m93.J(l46Var2, j09Var);
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
                    g09Var = g09.a;
                    d8c.b(b.d(b.c(g09Var, 1.0f), 220.0f), null, ynb.q(0.0f, 8.0f, 1), af1.b0(1053922281, new s19(0, z19Var, cs3VarL), l46Var2), l46Var, 3462, 2);
                    l46Var2 = l46Var;
                    a26 a26Var8 = a26Var2;
                    i15 = 1;
                    cn1.h(0.0f, 0, 100663296, 16126, null, af1.b0(-1895522521, new wt(7, z19Var), l46Var2), l46Var2, null, null, null, null, null, cs3VarB, null, null, false);
                    if (z5) {
                        l46Var2.f0(-1700505360);
                        if (((sz9) hzcVar.c).j() + 1 >= size) {
                            iJ = 0;
                        } else {
                            iJ = ((sz9) hzcVar.c).j() + 1;
                        }
                        j09 j09VarC5 = b.c(g09Var, 1.0f);
                        String strR5 = afc.r(R.string.annual_view_fortune_about_month, new Object[]{Integer.valueOf(iJ + 1)}, l46Var2);
                        bx9 bx9Var5 = v51.a;
                        pr4 pr4Var5 = l8b.a;
                        u51 u51VarA5 = v51.a(((e8b) l46Var2.k(pr4Var5)).m, ((e8b) l46Var2.k(pr4Var5)).q, 0L, 0L, l46Var, 12);
                        zI = l46Var.i(aw2Var) | l46Var.g(cs3VarL) | l46Var.g(ghcVarT);
                        objR6 = l46Var.R();
                        if (zI) {
                            objR6 = new xg4(aw2Var, cs3VarL, ghcVarT, i15);
                            l46Var.p0(objR6);
                        } else {
                            objR6 = new xg4(aw2Var, cs3VarL, ghcVarT, i15);
                            l46Var.p0(objR6);
                        }
                        c8b.i(j09VarC5, strR5, null, null, 0L, 0.0f, false, null, u51VarA5, false, null, null, (x16) objR6, l46Var, 6, 0, 3836);
                        l46Var2 = l46Var;
                        l46Var2.r(false);
                    } else {
                        l46Var2.f0(-1699909540);
                        l46Var2.r(false);
                    }
                    l46Var2.r(true);
                    z4 = z5;
                    i12 = i111;
                    a26Var3 = a26Var8;
                } else {
                    l46Var2.Z();
                    z4 = z2;
                    i12 = i7;
                    a26Var3 = a26Var2;
                }
                ojbVarV = l46Var2.v();
                if (ojbVarV != null) {
                    ojbVarV.d = new bb4(j09Var, z19Var, z4, i12, a26Var3, i3, i4, 2);
                }
            }
            i5 |= 24576;
            a26Var2 = a26Var;
            i11 = 1;
            if ((i5 & 9363) != 9362) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (l46Var2.W(i5 & 1, z3)) {
                if (i16 != 0) {
                    z5 = true;
                } else {
                    z5 = z2;
                }
                if (i6 != 0) {
                    i13 = 0;
                } else {
                    i13 = i7;
                }
                if (i9 != 0) {
                    a26Var2 = null;
                }
                size = z19Var.d.size();
                zE = l46Var2.e(size);
                objR = l46Var2.R();
                i8cVar = sf2.a;
                if (zE) {
                    objR = new a12(size, i11);
                    l46Var2.p0(objR);
                } else {
                    objR = new a12(size, i11);
                    l46Var2.p0(objR);
                }
                cs3VarB = ay9.b(i13, (i5 >> 9) & 14, 2, (x16) objR, l46Var2);
                hzcVar = cs3VarB.d;
                objR2 = l46Var2.R();
                if (objR2 == i8cVar) {
                    objR2 = af1.E(l46Var2);
                    l46Var2.p0(objR2);
                }
                aw2Var = (aw2) objR2;
                zE2 = l46Var2.e(size);
                objR3 = l46Var2.R();
                if (zE2) {
                    objR3 = new a12(size, i11);
                    l46Var2.p0(objR3);
                } else {
                    objR3 = new a12(size, i11);
                    l46Var2.p0(objR3);
                }
                x16 x16Var6 = (x16) objR3;
                boolean zI7 = l46Var2.i(aw2Var) | l46Var2.g(cs3VarB);
                i14 = i5 & 57344;
                if (i14 == 16384) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                z7 = zI7 | z6;
                objR4 = l46Var2.R();
                if (z7) {
                    objR4 = new wg4(aw2Var, a26Var2, cs3VarB, i11);
                    l46Var2.p0(objR4);
                } else {
                    objR4 = new wg4(aw2Var, a26Var2, cs3VarB, i11);
                    l46Var2.p0(objR4);
                }
                cs3VarL = m93.L(x16Var6, (a26) objR4, i13, l46Var2, (i5 >> 3) & 896, 0);
                int i112 = i13;
                ghcVarT = mh3.T(l46Var2);
                boolean zG6 = l46Var2.g(cs3VarL) | l46Var2.e(size);
                if (i14 == 16384) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                z9 = zG6 | z8;
                objR5 = l46Var2.R();
                if (z9) {
                    objR5 = new t19(size, null, a26Var2, cs3VarL);
                    l46Var2.p0(objR5);
                } else {
                    objR5 = new t19(size, null, a26Var2, cs3VarL);
                    l46Var2.p0(objR5);
                }
                af1.o((l26) objR5, l46Var2, cs3VarL);
                c92 c92VarA6 = a92.a(new uc0(16.0f, true, new qc0(0)), ndb.Y, l46Var2, 6);
                int iHashCode6 = Long.hashCode(l46Var2.T);
                u8a u8aVarM6 = l46Var2.m();
                j09 j09VarJ6 = m93.J(l46Var2, j09Var);
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
                g09Var = g09.a;
                d8c.b(b.d(b.c(g09Var, 1.0f), 220.0f), null, ynb.q(0.0f, 8.0f, 1), af1.b0(1053922281, new s19(0, z19Var, cs3VarL), l46Var2), l46Var, 3462, 2);
                l46Var2 = l46Var;
                a26 a26Var9 = a26Var2;
                i15 = 1;
                cn1.h(0.0f, 0, 100663296, 16126, null, af1.b0(-1895522521, new wt(7, z19Var), l46Var2), l46Var2, null, null, null, null, null, cs3VarB, null, null, false);
                if (z5) {
                    l46Var2.f0(-1700505360);
                    if (((sz9) hzcVar.c).j() + 1 >= size) {
                        iJ = 0;
                    } else {
                        iJ = ((sz9) hzcVar.c).j() + 1;
                    }
                    j09 j09VarC6 = b.c(g09Var, 1.0f);
                    String strR6 = afc.r(R.string.annual_view_fortune_about_month, new Object[]{Integer.valueOf(iJ + 1)}, l46Var2);
                    bx9 bx9Var6 = v51.a;
                    pr4 pr4Var6 = l8b.a;
                    u51 u51VarA6 = v51.a(((e8b) l46Var2.k(pr4Var6)).m, ((e8b) l46Var2.k(pr4Var6)).q, 0L, 0L, l46Var, 12);
                    zI = l46Var.i(aw2Var) | l46Var.g(cs3VarL) | l46Var.g(ghcVarT);
                    objR6 = l46Var.R();
                    if (zI) {
                        objR6 = new xg4(aw2Var, cs3VarL, ghcVarT, i15);
                        l46Var.p0(objR6);
                    } else {
                        objR6 = new xg4(aw2Var, cs3VarL, ghcVarT, i15);
                        l46Var.p0(objR6);
                    }
                    c8b.i(j09VarC6, strR6, null, null, 0L, 0.0f, false, null, u51VarA6, false, null, null, (x16) objR6, l46Var, 6, 0, 3836);
                    l46Var2 = l46Var;
                    l46Var2.r(false);
                } else {
                    l46Var2.f0(-1699909540);
                    l46Var2.r(false);
                }
                l46Var2.r(true);
                z4 = z5;
                i12 = i112;
                a26Var3 = a26Var9;
            } else {
                l46Var2.Z();
                z4 = z2;
                i12 = i7;
                a26Var3 = a26Var2;
            }
            ojbVarV = l46Var2.v();
            if (ojbVarV != null) {
                ojbVarV.d = new bb4(j09Var, z19Var, z4, i12, a26Var3, i3, i4, 2);
            }
        }
        i5 |= 3072;
        i7 = i2;
        i9 = i4 & 16;
        if (i9 != 0) {
            if ((i3 & 24576) == 0) {
                a26Var2 = a26Var;
                if (l46Var2.i(a26Var2)) {
                    i10 = 16384;
                } else {
                    i10 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
                }
                i5 |= i10;
            }
            i11 = 1;
            if ((i5 & 9363) != 9362) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (l46Var2.W(i5 & 1, z3)) {
                if (i16 != 0) {
                    z5 = true;
                } else {
                    z5 = z2;
                }
                if (i6 != 0) {
                    i13 = 0;
                } else {
                    i13 = i7;
                }
                if (i9 != 0) {
                    a26Var2 = null;
                }
                size = z19Var.d.size();
                zE = l46Var2.e(size);
                objR = l46Var2.R();
                i8cVar = sf2.a;
                if (zE) {
                    objR = new a12(size, i11);
                    l46Var2.p0(objR);
                } else {
                    objR = new a12(size, i11);
                    l46Var2.p0(objR);
                }
                cs3VarB = ay9.b(i13, (i5 >> 9) & 14, 2, (x16) objR, l46Var2);
                hzcVar = cs3VarB.d;
                objR2 = l46Var2.R();
                if (objR2 == i8cVar) {
                    objR2 = af1.E(l46Var2);
                    l46Var2.p0(objR2);
                }
                aw2Var = (aw2) objR2;
                zE2 = l46Var2.e(size);
                objR3 = l46Var2.R();
                if (zE2) {
                    objR3 = new a12(size, i11);
                    l46Var2.p0(objR3);
                } else {
                    objR3 = new a12(size, i11);
                    l46Var2.p0(objR3);
                }
                x16 x16Var7 = (x16) objR3;
                boolean zI8 = l46Var2.i(aw2Var) | l46Var2.g(cs3VarB);
                i14 = i5 & 57344;
                if (i14 == 16384) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                z7 = zI8 | z6;
                objR4 = l46Var2.R();
                if (z7) {
                    objR4 = new wg4(aw2Var, a26Var2, cs3VarB, i11);
                    l46Var2.p0(objR4);
                } else {
                    objR4 = new wg4(aw2Var, a26Var2, cs3VarB, i11);
                    l46Var2.p0(objR4);
                }
                cs3VarL = m93.L(x16Var7, (a26) objR4, i13, l46Var2, (i5 >> 3) & 896, 0);
                int i113 = i13;
                ghcVarT = mh3.T(l46Var2);
                boolean zG7 = l46Var2.g(cs3VarL) | l46Var2.e(size);
                if (i14 == 16384) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                z9 = zG7 | z8;
                objR5 = l46Var2.R();
                if (z9) {
                    objR5 = new t19(size, null, a26Var2, cs3VarL);
                    l46Var2.p0(objR5);
                } else {
                    objR5 = new t19(size, null, a26Var2, cs3VarL);
                    l46Var2.p0(objR5);
                }
                af1.o((l26) objR5, l46Var2, cs3VarL);
                c92 c92VarA7 = a92.a(new uc0(16.0f, true, new qc0(0)), ndb.Y, l46Var2, 6);
                int iHashCode7 = Long.hashCode(l46Var2.T);
                u8a u8aVarM7 = l46Var2.m();
                j09 j09VarJ7 = m93.J(l46Var2, j09Var);
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
                g09Var = g09.a;
                d8c.b(b.d(b.c(g09Var, 1.0f), 220.0f), null, ynb.q(0.0f, 8.0f, 1), af1.b0(1053922281, new s19(0, z19Var, cs3VarL), l46Var2), l46Var, 3462, 2);
                l46Var2 = l46Var;
                a26 a26Var10 = a26Var2;
                i15 = 1;
                cn1.h(0.0f, 0, 100663296, 16126, null, af1.b0(-1895522521, new wt(7, z19Var), l46Var2), l46Var2, null, null, null, null, null, cs3VarB, null, null, false);
                if (z5) {
                    l46Var2.f0(-1700505360);
                    if (((sz9) hzcVar.c).j() + 1 >= size) {
                        iJ = 0;
                    } else {
                        iJ = ((sz9) hzcVar.c).j() + 1;
                    }
                    j09 j09VarC7 = b.c(g09Var, 1.0f);
                    String strR7 = afc.r(R.string.annual_view_fortune_about_month, new Object[]{Integer.valueOf(iJ + 1)}, l46Var2);
                    bx9 bx9Var7 = v51.a;
                    pr4 pr4Var7 = l8b.a;
                    u51 u51VarA7 = v51.a(((e8b) l46Var2.k(pr4Var7)).m, ((e8b) l46Var2.k(pr4Var7)).q, 0L, 0L, l46Var, 12);
                    zI = l46Var.i(aw2Var) | l46Var.g(cs3VarL) | l46Var.g(ghcVarT);
                    objR6 = l46Var.R();
                    if (zI) {
                        objR6 = new xg4(aw2Var, cs3VarL, ghcVarT, i15);
                        l46Var.p0(objR6);
                    } else {
                        objR6 = new xg4(aw2Var, cs3VarL, ghcVarT, i15);
                        l46Var.p0(objR6);
                    }
                    c8b.i(j09VarC7, strR7, null, null, 0L, 0.0f, false, null, u51VarA7, false, null, null, (x16) objR6, l46Var, 6, 0, 3836);
                    l46Var2 = l46Var;
                    l46Var2.r(false);
                } else {
                    l46Var2.f0(-1699909540);
                    l46Var2.r(false);
                }
                l46Var2.r(true);
                z4 = z5;
                i12 = i113;
                a26Var3 = a26Var10;
            } else {
                l46Var2.Z();
                z4 = z2;
                i12 = i7;
                a26Var3 = a26Var2;
            }
            ojbVarV = l46Var2.v();
            if (ojbVarV != null) {
                ojbVarV.d = new bb4(j09Var, z19Var, z4, i12, a26Var3, i3, i4, 2);
            }
        }
        i5 |= 24576;
        a26Var2 = a26Var;
        i11 = 1;
        if ((i5 & 9363) != 9362) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (l46Var2.W(i5 & 1, z3)) {
            if (i16 != 0) {
                z5 = true;
            } else {
                z5 = z2;
            }
            if (i6 != 0) {
                i13 = 0;
            } else {
                i13 = i7;
            }
            if (i9 != 0) {
                a26Var2 = null;
            }
            size = z19Var.d.size();
            zE = l46Var2.e(size);
            objR = l46Var2.R();
            i8cVar = sf2.a;
            if (zE) {
                objR = new a12(size, i11);
                l46Var2.p0(objR);
            } else {
                objR = new a12(size, i11);
                l46Var2.p0(objR);
            }
            cs3VarB = ay9.b(i13, (i5 >> 9) & 14, 2, (x16) objR, l46Var2);
            hzcVar = cs3VarB.d;
            objR2 = l46Var2.R();
            if (objR2 == i8cVar) {
                objR2 = af1.E(l46Var2);
                l46Var2.p0(objR2);
            }
            aw2Var = (aw2) objR2;
            zE2 = l46Var2.e(size);
            objR3 = l46Var2.R();
            if (zE2) {
                objR3 = new a12(size, i11);
                l46Var2.p0(objR3);
            } else {
                objR3 = new a12(size, i11);
                l46Var2.p0(objR3);
            }
            x16 x16Var8 = (x16) objR3;
            boolean zI9 = l46Var2.i(aw2Var) | l46Var2.g(cs3VarB);
            i14 = i5 & 57344;
            if (i14 == 16384) {
                z6 = true;
            } else {
                z6 = false;
            }
            z7 = zI9 | z6;
            objR4 = l46Var2.R();
            if (z7) {
                objR4 = new wg4(aw2Var, a26Var2, cs3VarB, i11);
                l46Var2.p0(objR4);
            } else {
                objR4 = new wg4(aw2Var, a26Var2, cs3VarB, i11);
                l46Var2.p0(objR4);
            }
            cs3VarL = m93.L(x16Var8, (a26) objR4, i13, l46Var2, (i5 >> 3) & 896, 0);
            int i114 = i13;
            ghcVarT = mh3.T(l46Var2);
            boolean zG8 = l46Var2.g(cs3VarL) | l46Var2.e(size);
            if (i14 == 16384) {
                z8 = true;
            } else {
                z8 = false;
            }
            z9 = zG8 | z8;
            objR5 = l46Var2.R();
            if (z9) {
                objR5 = new t19(size, null, a26Var2, cs3VarL);
                l46Var2.p0(objR5);
            } else {
                objR5 = new t19(size, null, a26Var2, cs3VarL);
                l46Var2.p0(objR5);
            }
            af1.o((l26) objR5, l46Var2, cs3VarL);
            c92 c92VarA8 = a92.a(new uc0(16.0f, true, new qc0(0)), ndb.Y, l46Var2, 6);
            int iHashCode8 = Long.hashCode(l46Var2.T);
            u8a u8aVarM8 = l46Var2.m();
            j09 j09VarJ8 = m93.J(l46Var2, j09Var);
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
            g09Var = g09.a;
            d8c.b(b.d(b.c(g09Var, 1.0f), 220.0f), null, ynb.q(0.0f, 8.0f, 1), af1.b0(1053922281, new s19(0, z19Var, cs3VarL), l46Var2), l46Var, 3462, 2);
            l46Var2 = l46Var;
            a26 a26Var11 = a26Var2;
            i15 = 1;
            cn1.h(0.0f, 0, 100663296, 16126, null, af1.b0(-1895522521, new wt(7, z19Var), l46Var2), l46Var2, null, null, null, null, null, cs3VarB, null, null, false);
            if (z5) {
                l46Var2.f0(-1700505360);
                if (((sz9) hzcVar.c).j() + 1 >= size) {
                    iJ = 0;
                } else {
                    iJ = ((sz9) hzcVar.c).j() + 1;
                }
                j09 j09VarC8 = b.c(g09Var, 1.0f);
                String strR8 = afc.r(R.string.annual_view_fortune_about_month, new Object[]{Integer.valueOf(iJ + 1)}, l46Var2);
                bx9 bx9Var8 = v51.a;
                pr4 pr4Var8 = l8b.a;
                u51 u51VarA8 = v51.a(((e8b) l46Var2.k(pr4Var8)).m, ((e8b) l46Var2.k(pr4Var8)).q, 0L, 0L, l46Var, 12);
                zI = l46Var.i(aw2Var) | l46Var.g(cs3VarL) | l46Var.g(ghcVarT);
                objR6 = l46Var.R();
                if (zI) {
                    objR6 = new xg4(aw2Var, cs3VarL, ghcVarT, i15);
                    l46Var.p0(objR6);
                } else {
                    objR6 = new xg4(aw2Var, cs3VarL, ghcVarT, i15);
                    l46Var.p0(objR6);
                }
                c8b.i(j09VarC8, strR8, null, null, 0L, 0.0f, false, null, u51VarA8, false, null, null, (x16) objR6, l46Var, 6, 0, 3836);
                l46Var2 = l46Var;
                l46Var2.r(false);
            } else {
                l46Var2.f0(-1699909540);
                l46Var2.r(false);
            }
            l46Var2.r(true);
            z4 = z5;
            i12 = i114;
            a26Var3 = a26Var11;
        } else {
            l46Var2.Z();
            z4 = z2;
            i12 = i7;
            a26Var3 = a26Var2;
        }
        ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new bb4(j09Var, z19Var, z4, i12, a26Var3, i3, i4, 2);
        }
    }

    public static final void j(int i2, x16 x16Var, x16 x16Var2, a26 a26Var, l46 l46Var) {
        int i3;
        x16 x16Var3;
        a26 a26Var2;
        l46 l46Var2 = l46Var;
        x16Var.getClass();
        x16Var2.getClass();
        a26Var.getClass();
        l46Var2.h0(-129411972);
        if ((i2 & 6) == 0) {
            i3 = (l46Var2.i(x16Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            x16Var3 = x16Var2;
            i3 |= l46Var2.i(x16Var3) ? 32 : 16;
        } else {
            x16Var3 = x16Var2;
        }
        if ((i2 & 384) == 0) {
            a26Var2 = a26Var;
            i3 |= l46Var2.i(a26Var2) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        } else {
            a26Var2 = a26Var;
        }
        if (l46Var2.W(i3 & 1, (i3 & 147) != 146)) {
            pwf pwfVarA = qd8.a(l46Var2);
            if (pwfVarA == null) {
                qc0.p("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            e89 e89VarT = tm7.t(((h29) z5c.G(job.a.b(h29.class), pwfVarA.g(), null, b21.r(pwfVarA), kr7.b(l46Var2), null)).c, l46Var2);
            Object objR = l46Var2.R();
            i8c i8cVar = sf2.a;
            if (objR == i8cVar) {
                objR = q1c.f(Boolean.FALSE);
                l46Var2.p0(objR);
            }
            e89 e89Var = (e89) objR;
            Object objR2 = l46Var2.R();
            if (objR2 == i8cVar) {
                objR2 = kv2.f(0, l46Var2);
            }
            s69 s69Var = (s69) objR2;
            a29 a29Var = (a29) e89VarT.getValue();
            Object objR3 = l46Var2.R();
            int i4 = 3;
            if (objR3 == i8cVar) {
                objR3 = new sg4(s69Var, e89Var, i4);
                l46Var2.p0(objR3);
            }
            k(a29Var, x16Var3, x16Var, a26Var2, (a26) objR3, l46Var2, (i3 & 112) | 24584 | ((i3 << 6) & 896) | ((i3 << 3) & 7168));
            l46Var2 = l46Var2;
            a29 a29Var2 = (a29) e89VarT.getValue();
            z19 z19Var = a29Var2 instanceof z19 ? (z19) a29Var2 : null;
            if (z19Var != null) {
                l46Var2.f0(1569305713);
                boolean zBooleanValue = ((Boolean) e89Var.getValue()).booleanValue();
                Object objR4 = l46Var2.R();
                if (objR4 == i8cVar) {
                    objR4 = new x08(e89Var, 6);
                    l46Var2.p0(objR4);
                }
                od4.a(3504, af1.b0(951658916, new w7(29, z19Var, s69Var), l46Var2), (x16) objR4, l46Var2, "annual-monthly-detail-share", zBooleanValue);
                l46Var2.r(false);
            } else {
                l46Var2.f0(1569664166);
                l46Var2.r(false);
            }
        } else {
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new s48(i2, x16Var, x16Var2, a26Var, 5);
        }
    }

    public static final void k(a29 a29Var, x16 x16Var, x16 x16Var2, a26 a26Var, a26 a26Var2, l46 l46Var, int i2) {
        l46Var.h0(254966527);
        int i3 = (l46Var.i(a29Var) ? 4 : 2) | i2;
        if ((i2 & 48) == 0) {
            i3 |= l46Var.i(x16Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= l46Var.i(x16Var2) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        if ((i2 & 3072) == 0) {
            i3 |= l46Var.i(a26Var) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE;
        }
        if (l46Var.W(i3 & 1, (i3 & 9363) != 9362)) {
            Object[] objArr = new Object[0];
            Object objR = l46Var.R();
            if (objR == sf2.a) {
                objR = new fk8(14);
                l46Var.p0(objR);
            }
            rs0.f(b.c, false, af1.b0(1623376124, new qi3(x16Var, a29Var, a26Var2, (s69) vfh.I(objArr, (x16) objR, l46Var, 48), x16Var2, a26Var, 4), l46Var), l46Var, 390, 2);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new yb((Object) a29Var, x16Var, (m26) x16Var2, (m26) a26Var, (m26) a26Var2, i2, 9);
        }
    }

    public static final void l(ArrayList arrayList, wp9 wp9Var, x16 x16Var, x16 x16Var2, l46 l46Var, int i2) {
        l46Var.h0(-379252059);
        int i3 = i2 | (l46Var.g(arrayList) ? 4 : 2) | (l46Var.g(wp9Var) ? 32 : 16) | (l46Var.i(x16Var) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) | (l46Var.i(x16Var2) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE);
        int i4 = 1;
        if (l46Var.W(i3 & 1, (i3 & 1171) != 1170)) {
            xdc.a(b.c, af1.b0(-633283743, new xi6(x16Var, wp9Var, i4), l46Var), af1.b0(2004677312, new fi4(23, x16Var2), l46Var), null, null, 0, y72.j, 0L, null, af1.b0(-1564647498, new j41(wp9Var, mh3.T(l46Var), arrayList, 14), l46Var), l46Var, 806879670, 440);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new dp9(arrayList, wp9Var, x16Var, x16Var2, i2);
        }
    }

    public static final void m(x16 x16Var, wp9 wp9Var, x16 x16Var2, l46 l46Var, int i2) {
        x16Var2.getClass();
        l46Var.h0(1187478922);
        int i3 = (l46Var.i(x16Var) ? 4 : 2) | i2 | (l46Var.g(wp9Var) ? 32 : 16) | (l46Var.i(x16Var2) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS);
        if (l46Var.W(i3 & 1, (i3 & 147) != 146)) {
            l46Var.b0();
            if ((i2 & 1) != 0 && !l46Var.C()) {
                l46Var.Z();
            }
            l46Var.s();
            String[] strArrP = afc.p(R.array.onboarding_feedback_comment, l46Var);
            String[] strArrP2 = afc.p(R.array.onboarding_feedback_nickname, l46Var);
            ArrayList arrayList = new ArrayList(3);
            for (int i4 = 0; i4 < 3; i4++) {
                arrayList.add(new ob5(strArrP2[i4], strArrP[i4], g[i4]));
            }
            lmg.J(b.c, af1.b0(-100297293, new dp9(arrayList, wp9Var, x16Var, x16Var2), l46Var), l46Var, 54);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new m65(i2, x16Var, wp9Var, x16Var2, 22);
        }
    }

    public static final void n(j09 j09Var, List list, int i2, int i3, a26 a26Var, l46 l46Var, int i4) {
        int i5;
        a26 a26Var2;
        int i6;
        l46Var.h0(1923384043);
        int i7 = 4;
        if ((i4 & 6) == 0) {
            i5 = (l46Var.g(j09Var) ? 4 : 2) | i4;
        } else {
            i5 = i4;
        }
        if ((i4 & 48) == 0) {
            i5 |= (i4 & 64) == 0 ? l46Var.g(list) : l46Var.i(list) ? 32 : 16;
        }
        if ((i4 & 384) == 0) {
            i5 |= l46Var.e(i2) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        int i8 = i5 | 3072;
        if ((i4 & 24576) == 0) {
            i8 |= l46Var.i(a26Var) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE;
        }
        int i9 = 1;
        if (!l46Var.W(i8 & 1, (i8 & 9363) != 9362)) {
            a26Var2 = a26Var;
            l46Var.Z();
            i6 = i3;
        } else {
            if (list.isEmpty()) {
                ojb ojbVarV = l46Var.v();
                if (ojbVarV != null) {
                    ojbVarV.d = new kr(i2, i4, a26Var, j09Var, list);
                    return;
                }
                return;
            }
            a26Var2 = a26Var;
            q03 q03Var = new q03(0.2f, 0.0f, 0.0f, 1.0f);
            q03 q03Var2 = new q03(0.4f, 0.0f, 1.0f, 1.0f);
            lx0 lx0Var = ndb.f;
            Integer numValueOf = Integer.valueOf(i2);
            boolean z = (i8 & 7168) == 2048;
            Object objR = l46Var.R();
            if (z || objR == sf2.a) {
                objR = new dz4(q03Var, q03Var2, i9);
                l46Var.p0(objR);
            }
            kn2.c(numValueOf, j09Var, (a26) objR, lx0Var, "event_carousel", null, af1.b0(2114718561, new p50(i7, list, a26Var2), l46Var), l46Var, ((i8 >> 6) & 14) | 1600512 | ((i8 << 3) & 112), 32);
            i6 = 350;
        }
        ojb ojbVarV2 = l46Var.v();
        if (ojbVarV2 != null) {
            ojbVarV2.d = new lx1(j09Var, list, i2, i6, a26Var2, i4);
        }
    }

    public static final void o(x16 x16Var, a26 a26Var, l46 l46Var, int i2) {
        x16Var.getClass();
        a26Var.getClass();
        l46Var.h0(-115230283);
        int i3 = 2;
        int i4 = (l46Var.i(x16Var) ? 4 : 2) | i2 | (l46Var.i(a26Var) ? 32 : 16);
        if (l46Var.W(i4 & 1, (i4 & 19) != 18)) {
            zz8.f(6, 2, null, l46Var);
            pwf pwfVarA = qd8.a(l46Var);
            if (pwfVarA == null) {
                qc0.p("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            o3a o3aVar = (o3a) z5c.G(job.a.b(o3a.class), pwfVarA.g(), null, b21.r(pwfVarA), kr7.b(l46Var), null);
            Context context = (Context) l46Var.k(uq.b);
            boolean zI = l46Var.i(context) | l46Var.i(o3aVar);
            Object objR = l46Var.R();
            Object obj = sf2.a;
            if (zI || objR == obj) {
                objR = new m3a(context, o3aVar, null);
                l46Var.p0(objR);
            }
            af1.o((l26) objR, l46Var, wef.a);
            o0e o0eVarO = o3aVar.o();
            int i5 = i4 & 14;
            boolean zI2 = (i5 == 4) | l46Var.i(o3aVar) | ((i4 & 112) == 32);
            Object objR2 = l46Var.R();
            if (zI2 || objR2 == obj) {
                objR2 = new n3a(o3aVar, x16Var, a26Var, null);
                l46Var.p0(objR2);
            }
            af1.o((l26) objR2, l46Var, o0eVarO);
            t72.b(x16Var, new s84(false, false, false), af1.b0(1251321406, new m65(x16Var, context, o3aVar, 23), l46Var), l46Var, i5 | 432, 0);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new vz6(x16Var, a26Var, i2, i3);
        }
    }

    public static final void p(int i2, l46 l46Var, j09 j09Var, String str, String str2) {
        int i3;
        ojb ojbVarV;
        cz4 cz4Var;
        l46Var.h0(975735647);
        if ((i2 & 6) == 0) {
            i3 = (l46Var.g(j09Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= l46Var.g(str) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= l46Var.g(str2) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        int i4 = i3;
        int i5 = 1;
        if (l46Var.W(i4 & 1, (i4 & 147) != 146)) {
            fi8 fi8VarK = y41.K(new ii8(str), null, l46Var, 0, 62);
            if (((uh8) fi8VarK.getValue()) == null) {
                l46Var.f0(-197813425);
                h((i4 & 14) | ((i4 >> 3) & 112), l46Var, j09Var, str2);
                l46Var.r(false);
                ojbVarV = l46Var.v();
                if (ojbVarV == null) {
                    return;
                } else {
                    cz4Var = new cz4(j09Var, str, str2, i2, 0);
                }
            } else {
                l46Var.f0(-197732701);
                l46Var.r(false);
                ug8 ug8VarL = rs0.l((uh8) fi8VarK.getValue(), false, false, false, 0.0f, Integer.MAX_VALUE, l46Var, 958);
                uh8 uh8Var = (uh8) fi8VarK.getValue();
                lx0 lx0Var = ndb.w;
                boolean zG = l46Var.g(ug8VarL);
                Object objR = l46Var.R();
                if (zG || objR == sf2.a) {
                    objR = new kk3(ug8VarL, i5);
                    l46Var.p0(objR);
                }
                mh3.e(uh8Var, (x16) objR, j09Var, false, false, false, false, null, false, lx0Var, an2.d, false, false, null, null, false, l46Var, (i4 << 6) & 896, 54, 127992);
            }
            ojbVarV.d = cz4Var;
        }
        l46Var.Z();
        ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            cz4Var = new cz4(j09Var, str, str2, i2, 1);
            ojbVarV.d = cz4Var;
        }
    }

    public static final boolean q(mbe mbeVar) {
        List list = mbeVar.e.I0.a;
        int size = list.size();
        boolean z = false;
        for (int i2 = 0; i2 < size; i2++) {
            if (((oia) list.get(i2)).d) {
                z = true;
                break;
            }
        }
        return !z;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x005a  */
    /* JADX WARN: Code duplicated, block: B:24:0x0065 A[LOOP:0: B:20:0x0058->B:24:0x0065, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:27:0x0068 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:28:0x0040 A[EDGE_INSN: B:28:0x0040->B:16:0x0040 BREAK  A[LOOP:0: B:20:0x0058->B:24:0x0065], SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x004c -> B:19:0x004f). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public static final java.lang.Object r(defpackage.mbe r6, defpackage.iia r7, defpackage.pt0 r8) {
        /*
            boolean r0 = r8 instanceof defpackage.fr5
            if (r0 == 0) goto L13
            r0 = r8
            fr5 r0 = (defpackage.fr5) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            fr5 r0 = new fr5
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            int r1 = r0.label
            r2 = 1
            if (r1 == 0) goto L37
            if (r1 != r2) goto L30
            java.lang.Object r6 = r0.L$1
            iia r6 = (defpackage.iia) r6
            java.lang.Object r7 = r0.L$0
            mbe r7 = (defpackage.mbe) r7
            defpackage.jzb.q(r8)
            r5 = r7
            r7 = r6
            r6 = r5
            goto L4f
        L30:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            defpackage.qc0.p(r6)
            r6 = 0
            return r6
        L37:
            defpackage.jzb.q(r8)
            boolean r8 = q(r6)
            if (r8 != 0) goto L68
        L40:
            r0.L$0 = r6
            r0.L$1 = r7
            r0.label = r2
            java.lang.Object r8 = r6.a(r7, r0)
            bw2 r1 = defpackage.bw2.a
            if (r8 != r1) goto L4f
            return r1
        L4f:
            hia r8 = (defpackage.hia) r8
            java.util.List r8 = r8.a
            int r1 = r8.size()
            r3 = 0
        L58:
            if (r3 >= r1) goto L68
            java.lang.Object r4 = r8.get(r3)
            oia r4 = (defpackage.oia) r4
            boolean r4 = r4.d
            if (r4 == 0) goto L65
            goto L40
        L65:
            int r3 = r3 + 1
            goto L58
        L68:
            wef r6 = defpackage.wef.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.k99.r(mbe, iia, pt0):java.lang.Object");
    }

    public static final Object s(tia tiaVar, l26 l26Var, xn2 xn2Var) {
        Object objL1 = ((obe) tiaVar).l1(new gr5(xn2Var.getContext(), l26Var, null), xn2Var);
        return objL1 == bw2.a ? objL1 : wef.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final mt9 t(uf1 uf1Var, d3e d3eVar, Map map) {
        LinkedHashMap linkedHashMap;
        Object obj;
        jw6 jw6Var;
        xj1 xj1VarB;
        String str = uf1Var.a;
        LinkedHashMap linkedHashMap2 = d3eVar.d;
        ArrayList arrayList = new ArrayList();
        LinkedHashMap linkedHashMap3 = new LinkedHashMap();
        LinkedHashMap linkedHashMap4 = new LinkedHashMap();
        LinkedHashMap linkedHashMap5 = new LinkedHashMap();
        Iterator it = ((gl8) d3eVar.e.entrySet()).iterator();
        do {
            int i2 = 1;
            mt9 mt9Var = null;
            if (!it.hasNext()) {
                for (xj1 xj1Var : d3eVar.g) {
                    ArrayList<c3e> arrayList2 = xj1Var.b;
                    int i3 = xj1Var.a;
                    if (arrayList2.size() == i2) {
                        Surface surface = (Surface) map.get(new e3e(i3));
                        if (surface != null) {
                            linkedHashMap4.put(new qt9(((c3e) s72.X0(arrayList2)).a), surface);
                        }
                    } else {
                        for (c3e c3eVar : arrayList2) {
                            Object obj2 = linkedHashMap2.get(c3eVar);
                            mt9Var = mt9Var;
                            if (obj2 == null) {
                                qc0.p("Required value was null.");
                                return mt9Var;
                            }
                            OutputConfiguration outputConfiguration = (OutputConfiguration) linkedHashMap5.get((b3e) obj2);
                            Surface surface2 = outputConfiguration != null ? outputConfiguration.getSurface() : (Surface) map.get(new e3e(i3));
                            if (surface2 != null) {
                                linkedHashMap4.put(new qt9(c3eVar.a), surface2);
                                i2 = 1;
                            }
                        }
                    }
                }
                mt9 mt9Var2 = mt9Var;
                Iterator it2 = d3eVar.c.iterator();
                Object obj3 = mt9Var2;
                while (it2.hasNext()) {
                    b3e b3eVar = (b3e) it2.next();
                    ArrayList arrayList3 = b3eVar.l;
                    ArrayList arrayList4 = b3eVar.l;
                    List list = b3eVar.k;
                    af8 af8Var = b3eVar.f;
                    Integer num = b3eVar.e;
                    it2 = it2;
                    String str2 = b3eVar.d;
                    ArrayList arrayList5 = new ArrayList();
                    Iterator it3 = arrayList3.iterator();
                    while (it3.hasNext()) {
                        List list2 = list;
                        af8 af8Var2 = af8Var;
                        Surface surface3 = (Surface) map.get(new e3e(((xj1) it3.next()).a));
                        if (surface3 != null) {
                            arrayList5.add(surface3);
                        }
                        af8Var = af8Var2;
                        list = list2;
                    }
                    List list3 = list;
                    af8 af8Var3 = af8Var;
                    OutputConfiguration outputConfiguration2 = (OutputConfiguration) linkedHashMap5.get(b3eVar);
                    linkedHashMap5 = linkedHashMap5;
                    if (outputConfiguration2 == null) {
                        if (af8Var3 != null) {
                            linkedHashMap = linkedHashMap4;
                            obj = obj3;
                            if (arrayList5.size() != arrayList3.size()) {
                                ot otVarA0 = qfc.A0(null, null, af8Var3, b3eVar.g, b3eVar.h, b3eVar.i, list3, b3eVar.b, arrayList4.size() > 1, num != null ? num.intValue() : -1, !pa7.t(str2, str) ? str2 : mt9Var2, 2);
                                if (otVarA0 == null) {
                                    b1.l("CXCP", "Failed to create AndroidOutputConfiguration for " + b3eVar);
                                } else {
                                    arrayList.add(otVarA0);
                                    Iterator it4 = arrayList3.iterator();
                                    while (it4.hasNext()) {
                                        linkedHashMap3.put(new e3e(((xj1) it4.next()).a), otVarA0);
                                    }
                                }
                            }
                        } else {
                            linkedHashMap = linkedHashMap4;
                            obj = obj3;
                        }
                        if (arrayList5.size() != arrayList3.size()) {
                            ArrayList arrayList6 = new ArrayList();
                            for (Object obj4 : arrayList3) {
                                if (!map.containsKey(new e3e(((xj1) obj4).a))) {
                                    arrayList6.add(obj4);
                                }
                            }
                            qc0.k("Surfaces are not yet available for ", b3eVar, "! Missing surfaces for ", arrayList6, 33);
                            return mt9Var2;
                        }
                        ot otVarA1 = qfc.A0((Surface) s72.v0(arrayList5), null, null, b3eVar.g, b3eVar.h, b3eVar.i, list3, b3eVar.b, arrayList4.size() > 1, num != null ? num.intValue() : -1, !pa7.t(str2, str) ? str2 : mt9Var2, 6);
                        if (otVarA1 == null) {
                            b1.l("CXCP", "Failed to create AndroidOutputConfiguration for " + b3eVar);
                        } else {
                            for (Surface surface4 : s72.r0(arrayList5, 1)) {
                                surface4.getClass();
                                otVarA1.a.addSurface(surface4);
                            }
                            wj1 wj1Var = uf1Var.e;
                            if (wj1Var != null) {
                                xj1 xj1Var2 = (xj1) d3eVar.b.get(wj1Var);
                                if (xj1Var2 == null) {
                                    qc0.p("Postview Stream in StreamGraph cannot be null for reprocessing request");
                                    return mt9Var2;
                                }
                                if (obj == null && arrayList3.contains(xj1Var2)) {
                                    obj3 = otVarA1;
                                    linkedHashMap4 = linkedHashMap;
                                } else {
                                    arrayList.add(otVarA1);
                                }
                            } else {
                                arrayList.add(otVarA1);
                            }
                            linkedHashMap4 = linkedHashMap;
                            obj3 = obj;
                        }
                    } else {
                        if (arrayList5.size() != arrayList3.size()) {
                            ArrayList arrayList7 = new ArrayList();
                            for (Object obj5 : arrayList3) {
                                if (!map.containsKey(new e3e(((xj1) obj5).a))) {
                                    arrayList7.add(obj5);
                                }
                            }
                            qc0.k("Surfaces are not yet available for ", b3eVar, "! Missing surfaces for ", arrayList7, 33);
                            return mt9Var2;
                        }
                        arrayList.add(new ot(outputConfiguration2));
                        linkedHashMap = linkedHashMap4;
                        obj = obj3;
                    }
                    linkedHashMap4 = linkedHashMap;
                    obj3 = obj;
                }
                return new mt9(arrayList, linkedHashMap3, obj3, linkedHashMap4);
            }
            Map.Entry entry = (Map.Entry) it.next();
            int i4 = ((e3e) entry.getKey()).a;
            jw6Var = (jw6) entry.getValue();
            xj1VarB = d3eVar.b(i4);
            if (xj1VarB == null) {
                qc0.p("Required value was null.");
                return null;
            }
        } while (xj1VarB.b.size() == 1);
        if (Build.VERSION.SDK_INT < 31) {
            qc0.j("Cannot configure multiple outputs pre-S!");
            return null;
        }
        job.a.b(nt.class);
        jw6Var.getClass();
        throw null;
    }

    public static final fl8 u(Map map, d3e d3eVar) {
        fl8 fl8Var = new fl8();
        for (xj1 xj1Var : d3eVar.g) {
            Surface surface = (Surface) map.get(new e3e(xj1Var.a));
            if (surface != null) {
                Iterator it = xj1Var.b.iterator();
                while (it.hasNext()) {
                    fl8Var.put(new qt9(((c3e) it.next()).a), surface);
                }
            }
        }
        return fl8Var.j();
    }

    public static e89 v() {
        return new vz9(wef.a, qk6.L0);
    }

    public static final boolean w(hkb hkbVar, float f2, float f3) {
        float f4 = hkbVar.a;
        if (f2 > hkbVar.c || f4 > f2) {
            return false;
        }
        return f3 <= hkbVar.d && hkbVar.b <= f3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static xn2 x(xn2 xn2Var, xn2 xn2Var2, l26 l26Var) {
        l26Var.getClass();
        if (l26Var instanceof pt0) {
            return ((pt0) l26Var).k(xn2Var2, xn2Var);
        }
        pv2 context = xn2Var2.getContext();
        return context == nu4.a ? new qa7(xn2Var2, xn2Var, l26Var) : new ra7(xn2Var2, context, l26Var, xn2Var);
    }

    public static final ezd y(u09 u09Var, u09 u09Var2) {
        u09Var.getClass();
        u09Var2.getClass();
        u09Var.h0().size();
        u09Var2.h0().size();
        List listH0 = u09Var.h0();
        listH0.getClass();
        ArrayList arrayList = new ArrayList(t72.u(listH0, 10));
        Iterator it = listH0.iterator();
        while (it.hasNext()) {
            arrayList.add(((c8f) it.next()).h());
        }
        List listH1 = u09Var2.h0();
        listH1.getClass();
        ArrayList arrayList2 = new ArrayList(t72.u(listH1, 10));
        Iterator it2 = listH1.iterator();
        while (it2.hasNext()) {
            tjd tjdVarS = ((c8f) it2.next()).S();
            tjdVarS.getClass();
            arrayList2.add(new dzd(tjdVarS));
        }
        return new ezd(1, bm8.W(s72.r1(arrayList, arrayList2)));
    }

    public static final wj5 z(wj5 wj5Var, long j2) {
        if (j2 < 0) {
            qc0.j("Debounce timeout should not be negative");
            return null;
        }
        if (j2 == 0) {
            return wj5Var;
        }
        return new sc3(1, new mk5(new ac(j2, 6), wj5Var, null));
    }
}
