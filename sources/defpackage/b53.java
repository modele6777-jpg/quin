package defpackage;

import ai.askquin.R;
import ai.askquin.model.TarotSkinIdentify;
import ai.askquin.ui.explore.model.DailyCardBasicInfo;
import androidx.compose.foundation.layout.b;
import androidx.compose.ui.node.LayoutNode;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import tech.chatmind.api.TarotCardChoice;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class b53 {
    public static final y6c a = a7c.b(40.0f);
    public static final y6c b = a7c.b(20.0f);

    static {
        t72.I(e8d.Card, e8d.Long);
    }

    public static final void a(DailyCardBasicInfo dailyCardBasicInfo, qhe qheVar, TarotSkinIdentify tarotSkinIdentify, l46 l46Var, int i) {
        int i2;
        j09 j09VarJ;
        qhe qheVar2 = qheVar;
        l46 l46Var2 = l46Var;
        l46Var2.h0(1623245437);
        int i3 = i & 6;
        g09 g09Var = g09.a;
        if (i3 == 0) {
            i2 = (l46Var2.g(g09Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= (i & 64) == 0 ? l46Var2.g(dailyCardBasicInfo) : l46Var2.i(dailyCardBasicInfo) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= l46Var2.i(qheVar2) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        if ((i & 3072) == 0) {
            i2 |= l46Var2.e(tarotSkinIdentify.ordinal()) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE;
        }
        if (l46Var2.W(i2 & 1, (i2 & 1171) != 1170)) {
            boolean zG = l46Var2.g(dailyCardBasicInfo.getDate());
            Object objR = l46Var2.R();
            if (zG || objR == sf2.a) {
                objR = k(dailyCardBasicInfo.getDate());
                l46Var2.p0(objR);
            }
            za3 za3Var = (za3) objR;
            j09 j09VarC = b.c(g09Var, 1.0f);
            pr4 pr4Var = l8b.a;
            if (k8b.f((e8b) l46Var2.k(pr4Var))) {
                l46Var2.f0(865747461);
                l46Var2.r(false);
                j09VarJ = g09Var;
            } else {
                l46Var2.f0(865747933);
                j09VarJ = j(l46Var2);
                l46Var2.r(false);
            }
            j09 j09VarA0 = ynb.a0(j09VarC.D(j09VarJ), 20.0f, 20.0f);
            c92 c92VarA = a92.a(xc0.c, ndb.Z, l46Var2, 48);
            int iHashCode = Long.hashCode(l46Var2.T);
            u8a u8aVarM = l46Var2.m();
            j09 j09VarJ2 = m93.J(l46Var2, j09VarA0);
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
            dec.l(hj6.x, l46Var2, j09VarJ2);
            String str = za3Var.c;
            mue mueVar = ((p9f) l46Var2.k(r9f.a)).h;
            long j = ((e8b) l46Var2.k(pr4Var)).u;
            long jB = y72.b(((e8b) l46Var2.k(pr4Var)).u, 0.18f);
            x4d x4dVarB = a7c.b(20.0f);
            if (we6.e(l46Var2)) {
                x4dVarB = g21.f;
            }
            j09 j09VarA1 = ynb.a0(db6.w(g09Var, 0.5f, jB, x4dVarB), 14.0f, 6.0f);
            int i4 = i2;
            nte.b(str, j09VarA1, j, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mueVar, l46Var, 0, 0, 131064);
            o5c.f(l46Var, b.d(g09Var, 14.0f));
            String affirmation = dailyCardBasicInfo.getAffirmation();
            mue mueVar2 = pue.a;
            nte.b(affirmation, null, ((e8b) l46Var.k(pr4Var)).q, 0L, null, null, 0L, null, new jme(3), 0L, 0, false, 0, 0, null, mue.a(pue.n(l46Var), 0L, w6c.l(28), null, cr5.b(), 0L, null, 0, w6c.l(40), null, null, 16646109), l46Var, 0, 0, 130042);
            l46Var2 = l46Var;
            o5c.f(l46Var2, b.d(g09Var, 18.0f));
            int i5 = i4 >> 6;
            qheVar2 = qheVar;
            f(qheVar2, tarotSkinIdentify, 168.0f, we6.e(l46Var2) ? 8.0f : 12.0f, dailyCardBasicInfo.getTarotCard(), ((e8b) l46Var2.k(pr4Var)).q, l46Var2, (i5 & 14) | 384 | (i5 & 112));
            l46Var2.r(true);
        } else {
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new b8(dailyCardBasicInfo, qheVar2, tarotSkinIdentify, i);
        }
    }

    public static final void b(DailyCardBasicInfo dailyCardBasicInfo, boolean z, a26 a26Var, l46 l46Var, int i) {
        int i2;
        boolean z2;
        boolean z3;
        l46Var.h0(2141391591);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? l46Var.g(dailyCardBasicInfo) : l46Var.i(dailyCardBasicInfo) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            z2 = z;
            i2 |= l46Var.h(z2) ? 32 : 16;
        } else {
            z2 = z;
        }
        if ((i & 384) == 0) {
            i2 |= l46Var.i(a26Var) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        if (l46Var.W(i2 & 1, (i2 & 147) != 146)) {
            qhe qheVarR = q7c.r(dailyCardBasicInfo.getTarotCard());
            boolean zF = k8b.f((e8b) l46Var.k(l8b.a));
            TarotSkinIdentify skin = dailyCardBasicInfo.getSkin();
            boolean zE = l46Var.e(skin == null ? -1 : skin.ordinal());
            Object objR = l46Var.R();
            Object obj = sf2.a;
            if (zE || objR == obj) {
                Object skin2 = dailyCardBasicInfo.getSkin();
                if (skin2 == null) {
                    skin2 = r8c.d();
                }
                objR = skin2;
                l46Var.p0(objR);
            }
            TarotSkinIdentify tarotSkinIdentify = (TarotSkinIdentify) objR;
            boolean zG = l46Var.g(qheVarR) | l46Var.e(tarotSkinIdentify.ordinal());
            Object objR2 = l46Var.R();
            if (zG || objR2 == obj) {
                objR2 = kv2.f(0, l46Var);
            }
            s69 s69Var = (s69) objR2;
            boolean zA = sad.a(1, ((sz9) s69Var).j(), l46Var, 6);
            boolean zH = l46Var.h(zF);
            Object objR3 = l46Var.R();
            if (zH || objR3 == obj) {
                objR3 = q1c.f(Boolean.FALSE);
                l46Var.p0(objR3);
            }
            dd2 dd2VarB0 = af1.b0(-1897828218, new v43(s69Var, ((Boolean) l46Var.k(sad.b)).booleanValue(), zA, z2, a26Var, (e89) objR3, zF, dailyCardBasicInfo, qheVarR, tarotSkinIdentify, (dailyCardBasicInfo.getDos().isEmpty() && dailyCardBasicInfo.getDonts().isEmpty()) ? false : true), l46Var);
            if (zF) {
                l46Var.f0(1053393311);
                l46Var.r(false);
                z3 = false;
            } else {
                l46Var.f0(588169718);
                z3 = !g21.S(l46Var);
                l46Var.r(false);
            }
            if (z3) {
                l46Var.f0(1053410366);
                o7c.a(false, null, dd2VarB0, l46Var, 390, 2);
                l46Var.r(false);
            } else {
                l46Var.f0(1053475528);
                dd2VarB0.z(l46Var, 6);
                l46Var.r(false);
            }
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new i30(dailyCardBasicInfo, z, a26Var, i, 3);
        }
    }

    public static final void c(DailyCardBasicInfo dailyCardBasicInfo, xad xadVar, x16 x16Var, l46 l46Var, int i) {
        int i2;
        x16Var.getClass();
        l46Var.h0(415392585);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? l46Var.g(dailyCardBasicInfo) : l46Var.i(dailyCardBasicInfo) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= l46Var.e(xadVar.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= l46Var.i(x16Var) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        int i3 = i2;
        if (l46Var.W(i3 & 1, (i3 & 147) != 146)) {
            nfc nfcVarB = kr7.b(l46Var);
            boolean zG = l46Var.g(null) | l46Var.g(nfcVarB);
            Object objR = l46Var.R();
            Object obj = sf2.a;
            if (zG || objR == obj) {
                objR = nfcVarB.b(job.a.b(e3b.class), null, null);
                l46Var.p0(objR);
            }
            e3b e3bVar = (e3b) objR;
            if (xadVar != xad.DailyCard && xadVar != xad.DailyCardScreenshot) {
                qc0.j("Daily share only supports daily-card sources");
                return;
            }
            boolean z = (i3 & 14) == 4 || ((i3 & 8) != 0 && l46Var.i(dailyCardBasicInfo));
            Object objR2 = l46Var.R();
            if (z || objR2 == obj) {
                objR2 = new uo2(7, dailyCardBasicInfo);
                l46Var.p0(objR2);
            }
            x16 x16Var2 = (x16) objR2;
            pwf pwfVarA = qd8.a(l46Var);
            if (pwfVarA == null) {
                qc0.p("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            d53 d53Var = (d53) z5c.G(job.a.b(d53.class), pwfVarA.g(), null, b21.r(pwfVarA), kr7.b(l46Var), x16Var2);
            boolean z2 = (i3 & 112) == 32;
            Object objR3 = l46Var.R();
            if (z2 || objR3 == obj) {
                objR3 = v2c.s(xadVar, "daily_card");
                l46Var.p0(objR3);
            }
            x6d x6dVar = (x6d) objR3;
            t4c.e(null, "", x6dVar, new y43(x6dVar, 0), x16Var, af1.b0(658362252, new o91(x6dVar, d53Var, dailyCardBasicInfo, e3bVar, 1), l46Var), l46Var, 197168 | (57344 & (i3 << 6)), 1);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new b8(i, dailyCardBasicInfo, xadVar, x16Var, 13);
        }
    }

    public static final void d(long j, l46 l46Var, int i) {
        boolean zS;
        long j2 = j;
        l46 l46Var2 = l46Var;
        l46Var2.h0(-919128036);
        int i2 = i | (l46Var2.f(j2) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS);
        if (l46Var2.W(i2 & 1, (i2 & 147) != 146)) {
            mue mueVarA = mue.a(((p9f) l46Var2.k(r9f.a)).o, 0L, w6c.l(11), ar5.w, null, w6c.k(0.04d), null, 0, w6c.l(14), new iga(), null, 16121721);
            g09 g09Var = g09.a;
            j09 j09VarC = b.c(g09Var, 1.0f);
            t7c t7cVarA = s7c.a(xc0.a, ndb.z, l46Var2, 48);
            int iHashCode = Long.hashCode(l46Var2.T);
            u8a u8aVarM = l46Var2.m();
            j09 j09VarJ = m93.J(l46Var2, j09VarC);
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
            j09 j09VarD = b.d(g09Var, 24.0f);
            if (k8b.f((e8b) l46Var2.k(l8b.a))) {
                l46Var2.f0(515893486);
                zS = g21.S(l46Var2);
                l46Var2.r(false);
            } else {
                l46Var2.f0(-1187169881);
                l46Var2.r(false);
                zS = false;
            }
            feg.j(od4.A(zS ? R.drawable.share_top_logo_light : R.drawable.share_top_logo_dark, 0, l46Var2), null, j09VarD, null, an2.e, 0.0f, null, l46Var2, 24632, 104);
            o5c.f(l46Var2, new jw7(1.0f, true));
            c92 c92VarA = a92.a(new uc0(2.0f, true, new qc0(0)), ndb.E0, l46Var2, 54);
            int iHashCode2 = Long.hashCode(l46Var2.T);
            u8a u8aVarM2 = l46Var2.m();
            j09 j09VarJ2 = m93.J(l46Var2, g09Var);
            l46Var2.j0();
            if (l46Var2.S) {
                l46Var2.l(ov7Var);
            } else {
                l46Var2.s0();
            }
            dec.l(he2Var, l46Var2, c92VarA);
            dec.l(he2Var2, l46Var2, u8aVarM2);
            ib8.s(iHashCode2, l46Var2, he2Var3, l46Var2);
            dec.l(he2Var4, l46Var2, j09VarJ2);
            int i3 = i2 & 896;
            nte.b(afc.q(R.string.daily_fortune_share_footer_title, l46Var2), null, j2, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mueVarA, l46Var, i3, 0, 131066);
            j2 = j;
            nte.b(afc.q(R.string.daily_fortune_share_footer_subtitle, l46Var), null, j2, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mueVarA, l46Var, i3, 0, 131066);
            l46Var2 = l46Var;
            l46Var2.r(true);
            l46Var2.f0(515915196);
            boolean zBooleanValue = ((Boolean) l46Var2.k(h57.a)).booleanValue();
            l46Var2.r(false);
            if (zBooleanValue) {
                l46Var2.f0(-1186255934);
                l46Var2.r(false);
            } else {
                l46Var2.f0(-1186462549);
                o5c.f(l46Var2, b.p(g09Var, 8.0f));
                a6c.c(6, l46Var2, oa7.E(b.l(g09Var, 48.0f), a7c.b(2.0f)), "daily_card");
                l46Var2.r(false);
            }
            l46Var2.r(true);
        } else {
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new bc(i, 2, j2);
        }
    }

    public static final void e(DailyCardBasicInfo dailyCardBasicInfo, boolean z, e8d e8dVar, boolean z2, a26 a26Var, l46 l46Var, int i) {
        int i2;
        float f;
        e8dVar.getClass();
        l46Var.h0(-2065980085);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? l46Var.g(dailyCardBasicInfo) : l46Var.i(dailyCardBasicInfo) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= l46Var.h(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= l46Var.e(e8dVar.ordinal()) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        if ((i & 3072) == 0) {
            i2 |= l46Var.h(z2) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE;
        }
        if ((i & 24576) == 0) {
            i2 |= l46Var.i(a26Var) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE;
        }
        if (l46Var.W(i2 & 1, (i2 & 9363) != 9362)) {
            boolean zBooleanValue = ((Boolean) l46Var.k(sad.a)).booleanValue();
            boolean z3 = z2 || zBooleanValue;
            if (z2) {
                f = 0.0f;
            } else {
                f = zBooleanValue ? 16.0f : 32.0f;
            }
            j09 j09VarD0 = g09.a;
            j09 j09Var = z3 ? j09VarD0 : b.c;
            if (z3) {
                l46Var.f0(-1131952589);
                l46Var.r(false);
            } else {
                l46Var.f0(-1131951568);
                j09VarD0 = mh3.d0(j09VarD0, mh3.T(l46Var), false, 14);
                l46Var.r(false);
            }
            j09 j09VarB0 = ynb.b0(0.0f, f, j09Var.D(j09VarD0), 1);
            xn8 xn8VarC = s21.c(ndb.f, false);
            int iHashCode = Long.hashCode(l46Var.T);
            u8a u8aVarM = l46Var.m();
            j09 j09VarJ = m93.J(l46Var, j09VarB0);
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
            g21.s(392.0f, af1.b0(-729720151, new z50(e8dVar, dailyCardBasicInfo, z, z2, a26Var), l46Var), l46Var, 54);
            l46Var.r(true);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new ry1(dailyCardBasicInfo, z, e8dVar, z2, a26Var, i);
        }
    }

    public static final void f(final qhe qheVar, final TarotSkinIdentify tarotSkinIdentify, final float f, final float f2, TarotCardChoice tarotCardChoice, long j, l46 l46Var, final int i) {
        int i2;
        l46 l46Var2;
        final TarotCardChoice tarotCardChoice2 = tarotCardChoice;
        final long j2 = j;
        l46Var.h0(-870427575);
        if ((i & 6) == 0) {
            i2 = (l46Var.i(qheVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= l46Var.e(tarotSkinIdentify.ordinal()) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= l46Var.d(f) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        if ((i & 3072) == 0) {
            i2 |= l46Var.d(f2) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE;
        }
        if ((i & 24576) == 0) {
            i2 |= l46Var.g(tarotCardChoice2) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE;
        }
        if ((196608 & i) == 0) {
            i2 |= l46Var.f(j2) ? 131072 : 65536;
        }
        if (l46Var.W(i2 & 1, (74899 & i2) != 74898)) {
            c92 c92VarA = a92.a(xc0.c, ndb.Z, l46Var, 48);
            int iHashCode = Long.hashCode(l46Var.T);
            u8a u8aVarM = l46Var.m();
            g09 g09Var = g09.a;
            j09 j09VarJ = m93.J(l46Var, g09Var);
            lf2.q.getClass();
            l46Var.j0();
            boolean z = l46Var.S;
            ov7 ov7Var = LayoutNode.h1;
            if (z) {
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
            j09 j09VarQ = rrb.q(dj6.w(b.p(g09Var, f), tarotSkinIdentify.getAspectRatio()), 12.0f, a7c.b(f2), abg.c(1298616822), 0L, 20);
            int i3 = i2;
            xn8 xn8VarC = s21.c(ndb.b, false);
            int iHashCode2 = Long.hashCode(l46Var.T);
            u8a u8aVarM2 = l46Var.m();
            j09 j09VarJ2 = m93.J(l46Var, j09VarQ);
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
            o7c.d(d31.a.b(g09Var), qheVar, tarotSkinIdentify, false, null, f2, null, false, l46Var, ((i3 << 3) & 1008) | (458752 & (i3 << 6)), 216);
            l46Var2 = l46Var;
            ib8.t(l46Var2, true, g09Var, 10.0f, l46Var2);
            tarotCardChoice2 = tarotCardChoice;
            j2 = j;
            i(tarotCardChoice2, j2, l46Var2, (i3 >> 12) & 126);
            l46Var2.r(true);
        } else {
            l46Var2 = l46Var;
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new l26() { // from class: z43
                @Override // defpackage.l26
                public final Object z(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    b53.f(qheVar, tarotSkinIdentify, f, f2, tarotCardChoice2, j2, (l46) obj, k99.P(i | 1));
                    return wef.a;
                }
            };
        }
    }

    public static final void g(DailyCardBasicInfo dailyCardBasicInfo, boolean z, boolean z2, a26 a26Var, l46 l46Var, int i) {
        int i2;
        TarotSkinIdentify tarotSkinIdentify;
        z3g z3gVarC;
        l46 l46Var2;
        long j;
        l46 l46Var3 = l46Var;
        l46Var3.h0(1410015417);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? l46Var3.g(dailyCardBasicInfo) : l46Var3.i(dailyCardBasicInfo) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= l46Var3.h(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= l46Var3.h(z2) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        if ((i & 3072) == 0) {
            i2 |= l46Var3.i(a26Var) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE;
        }
        if (l46Var3.W(i2 & 1, (i2 & 1171) != 1170)) {
            qhe qheVarR = q7c.r(dailyCardBasicInfo.getTarotCard());
            TarotSkinIdentify skin = dailyCardBasicInfo.getSkin();
            boolean zE = l46Var3.e(skin == null ? -1 : skin.ordinal());
            Object objR = l46Var3.R();
            i8c i8cVar = sf2.a;
            if (zE || objR == i8cVar) {
                TarotSkinIdentify skin2 = dailyCardBasicInfo.getSkin();
                if (skin2 == null) {
                    skin2 = r8c.d();
                }
                objR = skin2;
                l46Var3.p0(objR);
            }
            TarotSkinIdentify tarotSkinIdentify2 = (TarotSkinIdentify) objR;
            pr4 pr4Var = l8b.a;
            boolean zF = k8b.f((e8b) l46Var3.k(pr4Var));
            int i3 = zF ? 1 : 3;
            boolean zG = l46Var3.g(qheVarR) | l46Var3.e(tarotSkinIdentify2.ordinal()) | l46Var3.h(zF);
            Object objR2 = l46Var3.R();
            if (zG || objR2 == i8cVar) {
                objR2 = kv2.f(0, l46Var3);
            }
            s69 s69Var = (s69) objR2;
            boolean z3 = ((sz9) s69Var).j() >= i3;
            if (zF) {
                l46Var3.f0(989981563);
                l46Var3.r(false);
                l46Var2 = l46Var3;
                tarotSkinIdentify = tarotSkinIdentify2;
                z3gVarC = null;
            } else {
                l46Var3.f0(990003325);
                boolean zG2 = l46Var3.g(s69Var);
                Object objR3 = l46Var3.R();
                if (zG2 || objR3 == i8cVar) {
                    objR3 = new q50(s69Var, 3);
                    l46Var3.p0(objR3);
                }
                tarotSkinIdentify = tarotSkinIdentify2;
                z3gVarC = l6g.c(qheVarR, tarotSkinIdentify, (x16) objR3, l46Var, 0, 0);
                l46Var2 = l46Var;
                l46Var2.r(false);
            }
            boolean zBooleanValue = ((Boolean) l46Var2.k(sad.b)).booleanValue();
            Float fValueOf = z3gVarC != null ? Float.valueOf(z3gVarC.c) : null;
            y6c y6cVar = h7d.a;
            int i4 = y72.l;
            long jF = gec.F(fValueOf != null ? fValueOf.floatValue() : 258.0f, 0.45f, 0.2f, 0.7f, 16);
            if (zF) {
                l46Var2.f0(2110153095);
                j = ((e8b) l46Var2.k(pr4Var)).q;
                l46Var2.r(false);
            } else {
                l46Var2.f0(2110153918);
                l46Var2.r(false);
                j = y72.e;
            }
            li6 li6Var = new li6(jF);
            u43 u43Var = new u43(s69Var, dailyCardBasicInfo, tarotSkinIdentify, zBooleanValue, z3, z2, a26Var, zF, new ji6(y72.b(jF, 1.0f), li6Var, 36.0f, li6Var, 8), jF, qheVarR, z, j);
            l46Var3 = l46Var;
            dd2 dd2VarB0 = af1.b0(1036754426, u43Var, l46Var3);
            if (zF) {
                l46Var3.f0(996085494);
                dd2VarB0.z(l46Var3, 6);
                l46Var3.r(false);
            } else {
                l46Var3.f0(996021293);
                o7c.a(true, null, dd2VarB0, l46Var3, 390, 2);
                l46Var3.r(false);
            }
        } else {
            l46Var3.Z();
        }
        ojb ojbVarV = l46Var3.v();
        if (ojbVarV != null) {
            ojbVarV.d = new t43(dailyCardBasicInfo, z, z2, a26Var, i, 0);
        }
    }

    public static final void h(String str, l46 l46Var, int i) {
        l46 l46Var2 = l46Var;
        l46Var2.h0(-686114335);
        int i2 = i | (l46Var2.g(str) ? 4 : 2);
        if (l46Var2.W(i2 & 1, (i2 & 3) != 2)) {
            boolean z = (i2 & 14) == 4;
            Object objR = l46Var2.R();
            if (z || objR == sf2.a) {
                objR = k(str);
                l46Var2.p0(objR);
            }
            za3 za3Var = (za3) objR;
            c92 c92VarA = a92.a(new uc0(-20.0f, true, new qc0(0)), ndb.Z, l46Var2, 54);
            int iHashCode = Long.hashCode(l46Var2.T);
            u8a u8aVarM = l46Var2.m();
            j09 j09VarJ = m93.J(l46Var2, g09.a);
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
            String str2 = za3Var.a;
            mue mueVar = pue.a;
            mue mueVarA = mue.a(pue.k(l46Var2), 0L, 0L, null, null, 0L, null, 0, 0L, new iga(), null, 16252927);
            pr4 pr4Var = l8b.a;
            nte.b(str2, null, ((e8b) l46Var2.k(pr4Var)).q, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mueVarA, l46Var, 0, 0, 131066);
            nte.b(za3Var.b, null, ((e8b) l46Var.k(pr4Var)).q, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mue.a(pue.p(l46Var), 0L, 0L, null, null, 0L, null, 0, 0L, new iga(), null, 16252927), l46Var, 0, 0, 131066);
            l46Var2 = l46Var;
            l46Var2.r(true);
        } else {
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new o8(str, i, 11);
        }
    }

    public static final void i(final TarotCardChoice tarotCardChoice, long j, l46 l46Var, final int i) {
        int i2;
        mue mueVar;
        final long j2 = j;
        l46 l46Var2 = l46Var;
        l46Var2.h0(1708445754);
        if ((i & 6) == 0) {
            i2 = i | (l46Var2.g(tarotCardChoice) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= l46Var2.f(j2) ? 32 : 16;
        }
        if (l46Var2.W(i2 & 1, (i2 & 19) != 18)) {
            mue mueVarA = mue.a(((p9f) l46Var2.k(r9f.a)).o, 0L, w6c.l(10), null, null, 0L, null, 0, w6c.l(10), new iga(), null, 16121853);
            t7c t7cVarA = s7c.a(xc0.e, ndb.z, l46Var2, 54);
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
            if (tarotCardChoice.isReversed()) {
                l46Var2.f0(1867258589);
                mueVar = mueVarA;
                nte.b(afc.q(R.string.text_reverse_tag, l46Var2), ynb.Z(tm7.o(b.s(g09Var, ndb.f, 2), abg.c(337386527), a7c.b(2.0f)), 2.0f), y72.b(j2, 0.6f), 0L, null, null, 0L, null, new jme(3), 0L, 0, false, 0, 0, null, mue.a(mueVarA, 0L, w6c.l(8), null, null, 0L, null, 0, 0L, null, null, 16777213), l46Var, 0, 0, 130040);
                l46Var2 = l46Var;
                o5c.f(l46Var2, b.p(g09Var, 2.0f));
                l46Var2.r(false);
            } else {
                mueVar = mueVarA;
                l46Var2.f0(1867665092);
                l46Var2.r(false);
            }
            l46 l46Var3 = l46Var2;
            j2 = j;
            nte.b(afc.q(r8c.f(q7c.r(tarotCardChoice)), l46Var2), null, y72.b(j, 0.72f), 0L, null, null, 0L, null, new jme(3), 0L, 0, false, 0, 0, null, mueVar, l46Var3, 0, 0, 130042);
            l46Var2 = l46Var3;
            l46Var2.r(true);
        } else {
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new l26() { // from class: a53
                @Override // defpackage.l26
                public final Object z(Object obj, Object obj2) {
                    ((Integer) obj2).intValue();
                    int iP = k99.P(i | 1);
                    b53.i(tarotCardChoice, j2, (l46) obj, iP);
                    return wef.a;
                }
            };
        }
    }

    public static final j09 j(l46 l46Var) {
        pr4 pr4Var = l8b.a;
        long jB = y72.b(((e8b) l46Var.k(pr4Var)).d, 0.48f);
        g09 g09Var = g09.a;
        y6c y6cVar = b;
        return db6.w(tm7.o(g09Var, jB, y6cVar), 0.5f, ((e8b) l46Var.k(pr4Var)).d, y6cVar);
    }

    public static final za3 k(String str) {
        Object dzbVar;
        String str2;
        try {
            dzbVar = LocalDate.parse(str);
        } catch (Throwable th) {
            dzbVar = new dzb(th);
        }
        if (dzbVar instanceof dzb) {
            dzbVar = null;
        }
        LocalDate localDate = (LocalDate) dzbVar;
        if (localDate == null) {
            um8 um8VarB = rob.b(new rob("(\\d{1,2})月(\\d{1,2})日"), str);
            return um8VarB != null ? new za3((String) ((sm8) um8VarB.a()).get(2), str, str) : new za3(str, "", str);
        }
        Locale locale = Locale.getDefault();
        if (pa7.t(locale.getLanguage(), "zh")) {
            str2 = localDate.getMonthValue() + "月" + localDate.getDayOfMonth() + "日";
        } else {
            str2 = localDate.format(DateTimeFormatter.ofPattern("MMM d", locale));
        }
        String strValueOf = String.valueOf(localDate.getDayOfMonth());
        String str3 = localDate.format(DateTimeFormatter.ofPattern("MMM yyyy", Locale.ENGLISH));
        str3.getClass();
        str2.getClass();
        return new za3(strValueOf, str3, str2);
    }
}
