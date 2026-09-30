package defpackage;

import ai.askquin.R;
import ai.askquin.ui.annual.model.AnnualActionFor;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.KeyEvent;
import androidx.compose.foundation.layout.FillElement;
import androidx.compose.foundation.layout.b;
import androidx.compose.ui.node.LayoutNode;
import coil3.compose.AsyncImagePainter;
import com.adjust.sdk.sig.r3;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.io.Closeable;
import java.time.LocalDate;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes.dex */
public abstract class ym8 {
    public static final dd2 a = new dd2(new md2(13), false, 391921089);
    public static final dd2 b = new dd2(new yd2(25), false, 1906603963);
    public static final dd2 c = new dd2(new yd2(26), false, -800767388);
    public static final dd2 d = new dd2(new he2(8), false, 1330435672);
    public static final g5d e = g5d.d;
    public static final float f = 8.0f;
    public static final float g = 24.0f;
    public static final String[] h = {"ga_conversion", "engagement_time_msec", "exposure_time", "ad_event_id", "ad_unit_id", "ga_error", "ga_error_value", "ga_error_length", "ga_event_origin", "ga_screen", "ga_screen_class", "ga_screen_id", "ga_previous_screen", "ga_previous_class", "ga_previous_id", "manual_tracking", "message_device_time", "message_id", "message_name", "message_time", "message_tracking_id", "message_type", "previous_app_version", "previous_os_version", "topic", "update_with_analytics", "previous_first_open_count", "system_app", "system_app_update", "previous_install_count", "ga_event_id", "ga_extra_params_ct", "ga_group_name", "ga_list_length", "ga_index", "ga_event_name", "campaign_info_source", "cached_campaign", "deferred_analytics_collection", "ga_session_number", "ga_session_id", "campaign_extra_referrer", "app_in_background", "firebase_feature_rollouts", "customer_type", "firebase_conversion", "firebase_error", "firebase_error_value", "firebase_error_length", "firebase_event_origin", "firebase_screen", "firebase_screen_class", "firebase_screen_id", "firebase_previous_screen", "firebase_previous_class", "firebase_previous_id", "session_number", "session_id"};
    public static final String[] i = {"_c", "_et", "_xt", "_aeid", "_ai", "_err", "_ev", "_el", "_o", "_sn", "_sc", "_si", "_pn", "_pc", "_pi", "_mst", "_ndt", "_nmid", "_nmn", "_nmt", "_nmtid", "_nmc", "_pv", "_po", "_nt", "_uwa", "_pfo", "_sys", "_sysu", "_pin", "_eid", "_epc", "_gn", "_ll", "_i", "_en", "_cis", "_cc", "_dac", "_sno", "_sid", "_cer", "_aib", "_ffr", "_ct", "_c", "_err", "_ev", "_el", "_o", "_sn", "_sc", "_si", "_pn", "_pc", "_pi", "_sno", "_sid"};
    public static final String[] j = {"items"};
    public static final String[] k = {"affiliation", "coupon", "creative_name", "creative_slot", "currency", "_ct", "discount", "index", "item_id", "item_brand", "item_category", "item_category2", "item_category3", "item_category4", "item_category5", "item_list_name", "item_list_id", "item_name", "item_variant", "location_id", "payment_type", "price", "promotion_id", "promotion_name", "quantity", "shipping", "shipping_tier", "tax", "transaction_id", "value", "item_list", "checkout_step", "checkout_option", "item_location_id"};
    public static gx6 l;

    public static final int A(KeyEvent keyEvent) {
        return (keyEvent.isAltPressed() ? 1 : 0) | (keyEvent.isCtrlPressed() ? 2 : 0) | (keyEvent.isMetaPressed() ? 4 : 0) | (keyEvent.isShiftPressed() ? 8 : 0);
    }

    public static final boolean B(String str) {
        str.getClass();
        return str.equals("POST") || str.equals("PATCH") || str.equals("PUT") || str.equals("DELETE") || str.equals("MOVE");
    }

    public static final boolean C(int i2, String str) {
        char cCharAt = str.charAt(i2);
        return 'A' <= cCharAt && cCharAt < '[';
    }

    public static final j09 D(j09 j09Var, a26 a26Var) {
        return j09Var.D(new in9(a26Var));
    }

    public static final boolean E(String str) {
        str.getClass();
        return (str.equals("GET") || str.equals("HEAD")) ? false : true;
    }

    public static final String F(jd4 jd4Var) {
        jd4Var.getClass();
        if (jd4Var instanceof ad4) {
            return ((ad4) jd4Var).c;
        }
        if (jd4Var instanceof bd4) {
            return F(((bd4) jd4Var).b);
        }
        return null;
    }

    public static final String G(jd4 jd4Var) {
        jd4Var.getClass();
        if (jd4Var instanceof ad4) {
            return ((ad4) jd4Var).e;
        }
        if (jd4Var instanceof bd4) {
            return G(((bd4) jd4Var).b);
        }
        return null;
    }

    public static final String H(jd4 jd4Var) {
        jd4Var.getClass();
        if (jd4Var instanceof ad4) {
            return ((ad4) jd4Var).d;
        }
        if (jd4Var instanceof bd4) {
            return H(((bd4) jd4Var).b);
        }
        return null;
    }

    public static final String I(bwa bwaVar) {
        bwaVar.getClass();
        if (bwaVar instanceof z6e) {
            return "tap_subscribe";
        }
        if (bwaVar instanceof n07) {
            return "tap_purchase";
        }
        ap.c();
        return null;
    }

    public static final String J(jd4 jd4Var) {
        jd4Var.getClass();
        if (jd4Var instanceof zc4) {
            return ((zc4) jd4Var).a;
        }
        if (jd4Var instanceof bd4) {
            return J(((bd4) jd4Var).b);
        }
        if (jd4Var instanceof ad4) {
            return J(((ad4) jd4Var).a);
        }
        if (jd4Var instanceof gd4) {
            return ((gd4) jd4Var).d;
        }
        if (jd4Var instanceof fd4) {
            return ((fd4) jd4Var).a.d;
        }
        if (!jd4Var.equals(hd4.a) && !(jd4Var instanceof id4) && !jd4Var.equals(cd4.a)) {
            ap.c();
        }
        return null;
    }

    public static int K(double d2) {
        if (Double.isNaN(d2)) {
            qc0.j("Cannot round NaN value.");
            return 0;
        }
        if (d2 > 2.147483647E9d) {
            return Integer.MAX_VALUE;
        }
        if (d2 < -2.147483648E9d) {
            return Integer.MIN_VALUE;
        }
        return (int) Math.round(d2);
    }

    public static int L(float f2) {
        if (!Float.isNaN(f2)) {
            return Math.round(f2);
        }
        qc0.j("Cannot round NaN value.");
        return 0;
    }

    public static long M(double d2) {
        if (!Double.isNaN(d2)) {
            return Math.round(d2);
        }
        qc0.j("Cannot round NaN value.");
        return 0L;
    }

    public static final void N(Context context, x04 x04Var) {
        context.getClass();
        x04Var.getClass();
        int i2 = x04Var.c;
        int i3 = x04Var.d;
        String str = x04Var.b;
        int i4 = x04Var.a + 10001;
        LocalDate localDateNow = LocalDate.now();
        localDateNow.getClass();
        Notification notificationA = r(context, i2, i3, str, i4, ya3.Today, localDateNow).a();
        notificationA.getClass();
        try {
            new nh9(context).a(i4, notificationA);
        } catch (SecurityException unused) {
        }
    }

    public static final void O(Context context) {
        context.getClass();
        nh9 nh9Var = new nh9(context);
        nh9Var.b.createNotificationChannel(new NotificationChannel("daily_reminder", context.getString(R.string.notification_time_title), 3));
        ih9 ih9Var = new ih9(context, "daily_reminder");
        ih9Var.f = ih9.b("click to open paywall");
        ih9Var.g = PendingIntent.getActivity(context, 0, new Intent("android.intent.action.VIEW", Uri.parse("quinlove://app/chat?from=notification&triggered_by=holiday_card_expiration")), 67108864);
        ih9Var.v.icon = R.drawable.notification_small_icon;
        ih9Var.p = "recommendation";
        ih9Var.r = 7896797;
        ih9Var.n = true;
        ih9Var.o = true;
        ih9Var.c(16, true);
        ih9Var.c(2, true);
        ih9Var.w = true;
        ih9Var.m = true;
        Notification notificationA = ih9Var.a();
        notificationA.getClass();
        try {
            nh9Var.a(10001, notificationA);
        } catch (SecurityException unused) {
        }
    }

    public static final String P(bwa bwaVar) {
        bwaVar.getClass();
        Object objF = bwaVar.f();
        String str = objF instanceof String ? (String) objF : null;
        if (str != null) {
            String str2 = v4e.Q(str) ? null : str;
            if (str2 != null) {
                return str2;
            }
        }
        return bwaVar.getType().a();
    }

    public static final String Q(String str) {
        str.getClass();
        StringBuilder sb = new StringBuilder(str.length());
        int length = str.length();
        for (int i2 = 0; i2 < length; i2++) {
            char cCharAt = str.charAt(i2);
            if ('A' <= cCharAt && cCharAt < '[') {
                cCharAt = Character.toLowerCase(cCharAt);
            }
            sb.append(cCharAt);
        }
        return sb.toString();
    }

    public static final void a(j09 j09Var, String str, x16 x16Var, x16 x16Var2, x16 x16Var3, l46 l46Var, int i2) {
        j09 j09Var2;
        fy9 fy9VarZ;
        String str2 = str;
        l46 l46Var2 = l46Var;
        str2.getClass();
        x16Var.getClass();
        x16Var2.getClass();
        x16Var3.getClass();
        l46Var2.h0(-202486370);
        int i3 = i2 | 6 | (l46Var2.g(str2) ? 32 : 16) | (l46Var2.i(x16Var) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) | (l46Var2.i(x16Var2) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE) | (l46Var2.i(x16Var3) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE);
        if (l46Var2.W(i3 & 1, (i3 & 9363) != 9362)) {
            pwf pwfVarA = qd8.a(l46Var2);
            if (pwfVarA == null) {
                qc0.p("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            mm mmVar = (mm) z5c.G(job.a.b(mm.class), pwfVarA.g(), null, b21.r(pwfVarA), kr7.b(l46Var2), null);
            im imVar = (im) mmVar.c.getValue();
            xn8 xn8VarC = s21.c(ndb.b, false);
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
            dec.l(he2Var, l46Var2, xn8VarC);
            he2 he2Var2 = hj6.y;
            dec.l(he2Var2, l46Var2, u8aVarM);
            Integer numValueOf = Integer.valueOf(iHashCode);
            he2 he2Var3 = hj6.X;
            dec.l(he2Var3, l46Var2, numValueOf);
            dec.k(l46Var2);
            he2 he2Var4 = hj6.x;
            dec.l(he2Var4, l46Var2, j09VarJ);
            FillElement fillElement = b.c;
            feg.j(od4.A(R.drawable.bg_personality, 0, l46Var2), null, pa7.p(fillElement, 0.5f), null, an2.a, 0.0f, null, l46Var2, 25016, 104);
            c92 c92VarA = a92.a(xc0.c, ndb.Z, l46Var2, 48);
            int iHashCode2 = Long.hashCode(l46Var2.T);
            u8a u8aVarM2 = l46Var2.m();
            j09 j09VarJ2 = m93.J(l46Var2, fillElement);
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
            y7h.g(null, null, null, 0L, null, x16Var3, l46Var2, (i3 << 3) & 458752, 31);
            j09Var2 = g09Var;
            o5c.f(l46Var2, b.d(j09Var2, 12.0f));
            mue mueVar = pue.a;
            mue mueVarN = pue.n(l46Var2);
            pr4 pr4Var = x8b.a;
            nte.b(afc.q(R.string.personality_analyzing_1, l46Var2), null, 0L, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, mue.a(mueVarN, 0L, 0L, null, ((y8b) l46Var2.k(pr4Var)).a, 0L, null, 0, 0L, null, null, 16777183), l46Var, 0, 0, 131070);
            o5c.f(l46Var, b.d(j09Var2, 8.0f));
            mue mueVarA = mue.a(pue.m(l46Var), 0L, 0L, null, ((y8b) l46Var.k(pr4Var)).a, 0L, null, 0, 0L, null, null, 16777183);
            l46Var.f0(1904625050);
            i00 i00Var = new i00();
            i00Var.f(afc.q(R.string.personality_analyzing_2, l46Var));
            l46Var.f0(1904628140);
            int iK = i00Var.k(new xtd(((m82) l46Var.k(o82.a)).a, 0L, null, null, null, null, null, 0L, null, null, null, 0L, null, null, 65534));
            try {
                i00Var.f(afc.q(R.string.personality_analyzing_3, l46Var));
                i00Var.h(iK);
                l46Var.r(false);
                k00 k00VarL = i00Var.l();
                l46Var.r(false);
                nte.c(k00VarL, null, 0L, 0L, null, null, 0L, new jme(3), 0L, 0, false, 0, 0, null, null, mueVarA, l46Var, 0, 0, 261118);
                l46Var2 = l46Var;
                if (0.618f <= 0.0d) {
                    g37.a("invalid weight; must be greater than zero");
                }
                o5c.f(l46Var2, new jw7(0.618f > Float.MAX_VALUE ? Float.MAX_VALUE : 0.618f, true));
                boolean zBooleanValue = ((Boolean) l46Var2.k(h57.a)).booleanValue();
                i8c i8cVar = sf2.a;
                if (zBooleanValue) {
                    l46Var2.f0(1904639150);
                    fy9VarZ = od4.A(R.drawable.personality_card, 0, l46Var2);
                    l46Var2.r(false);
                } else {
                    l46Var2.f0(-1085662276);
                    Uri uri = Uri.parse("file:///android_asset/personality/personality_loading_card.gif");
                    uri.getClass();
                    aw6 aw6Var = (aw6) l46Var2.k(n72.a);
                    fy9 fy9VarA = od4.A(R.drawable.personality_card, 0, l46Var2);
                    Object objR = l46Var2.R();
                    if (objR == i8cVar) {
                        objR = new z4(15);
                        l46Var2.p0(objR);
                    }
                    a26 a26Var = (a26) objR;
                    dh0 dh0Var = new dh0(uri, (vg0) l46Var2.k(ha8.a), aw6Var);
                    int i4 = crf.b;
                    fy9VarZ = z7f.Z(dh0Var, fy9VarA != null ? new yn6(fy9VarA, 4) : AsyncImagePainter.K0, a26Var != null ? new hy0(a26Var, 20) : null, an2.b, 1, l46Var2);
                    l46Var2.r(false);
                }
                boolean z2 = true;
                feg.j(fy9VarZ, null, oa7.E(b.q(0.0f, 460.0f, dj6.w(b.c(j09Var2, 0.618f), ((die) l46Var2.k(snd.a)).a.getAspectRatio()), 1), a7c.b(16.0f)), null, null, 0.0f, null, l46Var2, 56, 120);
                if (1.0f <= 0.0d) {
                    g37.a("invalid weight; must be greater than zero");
                }
                o5c.f(l46Var2, new jw7(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true));
                l46Var2.r(true);
                l46Var2.r(true);
                boolean zN = rfc.n(false, l46Var2, 0, 3);
                Boolean boolValueOf = Boolean.valueOf(zN);
                boolean zH = l46Var2.h(zN) | l46Var2.i(mmVar) | ((i3 & 112) == 32);
                Object objR2 = l46Var2.R();
                if (zH || objR2 == i8cVar) {
                    str2 = str;
                    objR2 = new dm(zN, mmVar, str2, null);
                    l46Var2.p0(objR2);
                } else {
                    str2 = str;
                }
                af1.p(str2, boolValueOf, (l26) objR2, l46Var2);
                String strQ = afc.q(R.string.unknown_error, l46Var2);
                boolean zG = l46Var2.g(imVar) | ((i3 & 896) == 256);
                if ((i3 & 7168) != 2048) {
                    z2 = false;
                }
                boolean zG2 = zG | z2 | l46Var2.g(strQ);
                Object objR3 = l46Var2.R();
                if (zG2 || objR3 == i8cVar) {
                    objR3 = new em(imVar, x16Var, x16Var2, strQ, null);
                    l46Var2.p0(objR3);
                }
                af1.o((l26) objR3, l46Var2, imVar);
            } catch (Throwable th) {
                i00Var.h(iK);
                throw th;
            }
        } else {
            l46Var2.Z();
            j09Var2 = j09Var;
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new cm((Object) j09Var2, (Object) str2, (m26) x16Var, (m26) x16Var2, (m26) x16Var3, i2, 0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:49:0x0158  */
    /* JADX WARN: Code duplicated, block: B:52:0x018d  */
    /* JADX WARN: Code duplicated, block: B:56:0x0198  */
    public static final void b(AnnualActionFor annualActionFor, x16 x16Var, a26 a26Var, l46 l46Var, int i2) {
        m5f m5fVar;
        i8c i8cVar;
        Object objR;
        boolean zI;
        Object objR2;
        l46 l46Var2 = l46Var;
        annualActionFor.getClass();
        x16Var.getClass();
        a26Var.getClass();
        l46Var2.h0(-1056213409);
        int i3 = i2 | (l46Var2.e(annualActionFor.ordinal()) ? 4 : 2) | (l46Var2.i(x16Var) ? 32 : 16) | (l46Var2.i(a26Var) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS);
        if (l46Var2.W(i3 & 1, (i3 & 147) != 146)) {
            pwf pwfVarA = qd8.a(l46Var2);
            if (pwfVarA == null) {
                qc0.p("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            k66 k66Var = (k66) z5c.G(job.a.b(k66.class), pwfVarA.g(), null, b21.r(pwfVarA), kr7.b(l46Var2), null);
            e89 e89VarT = tm7.t(k66Var.e, l46Var2);
            Object objR3 = l46Var2.R();
            i8c i8cVar2 = sf2.a;
            if (objR3 == i8cVar2) {
                objR3 = new qz9(0.0f);
                l46Var2.p0(objR3);
            }
            n69 n69Var = (n69) objR3;
            h0e h0eVarB = vx.b(((qz9) n69Var).j(), null, "ProgressAnimation", null, l46Var, 3072, 22);
            int i4 = c66.a[annualActionFor.ordinal()];
            if (i4 == 1) {
                l46Var.f0(-1408787558);
                m5fVar = new m5f(afc.q(R.string.annual_generating_monthly_title, l46Var), afc.q(R.string.annual_generating_monthly_subtitle, l46Var), "lottie/annual-monthly-loading.json");
                l46Var.r(false);
            } else {
                if (i4 != 2) {
                    throw tec.d(-1408788888, l46Var, false);
                }
                l46Var.f0(-1408780553);
                m5fVar = new m5f(afc.q(R.string.annual_generating_domain_title, l46Var), afc.q(R.string.annual_generating_domain_subtitle, l46Var), "lottie/annual-domain-loading.json");
                l46Var.r(false);
            }
            String str = (String) m5fVar.a();
            String str2 = (String) m5fVar.b();
            String str3 = (String) m5fVar.c();
            g66 g66Var = (g66) e89VarT.getValue();
            boolean zG = l46Var.g(e89VarT) | ((i3 & 896) == 256);
            int i5 = i3 & 14;
            boolean z = zG | (i5 == 4);
            Object objR4 = l46Var.R();
            if (z) {
                i8cVar = i8cVar2;
            } else {
                i8cVar = i8cVar2;
                if (objR4 == i8cVar) {
                }
                af1.o((l26) objR4, l46Var, g66Var);
                objR = l46Var.R();
                if (objR == i8cVar) {
                    objR = new a66(n69Var, null);
                    l46Var.p0(objR);
                }
                af1.o((l26) objR, l46Var, wef.a);
                FillElement fillElement = b.c;
                i8c i8cVar3 = i8cVar;
                dd2 dd2VarB0 = af1.b0(2103367836, new n50(7, x16Var, str, str2, str3, h0eVarB), l46Var);
                l46Var2 = l46Var;
                rs0.f(fillElement, false, dd2VarB0, l46Var2, 390, 2);
                zI = l46Var2.i(k66Var) | (i5 == 4);
                objR2 = l46Var2.R();
                if (zI || objR2 == i8cVar3) {
                    objR2 = new b66(k66Var, annualActionFor, null);
                    l46Var2.p0(objR2);
                }
                af1.o((l26) objR2, l46Var2, annualActionFor);
            }
            objR4 = new z56(a26Var, annualActionFor, e89VarT, null);
            l46Var.p0(objR4);
            af1.o((l26) objR4, l46Var, g66Var);
            objR = l46Var.R();
            if (objR == i8cVar) {
                objR = new a66(n69Var, null);
                l46Var.p0(objR);
            }
            af1.o((l26) objR, l46Var, wef.a);
            FillElement fillElement2 = b.c;
            i8c i8cVar4 = i8cVar;
            dd2 dd2VarB1 = af1.b0(2103367836, new n50(7, x16Var, str, str2, str3, h0eVarB), l46Var);
            l46Var2 = l46Var;
            rs0.f(fillElement2, false, dd2VarB1, l46Var2, 390, 2);
            zI = l46Var2.i(k66Var) | (i5 == 4);
            objR2 = l46Var2.R();
            if (zI) {
                objR2 = new b66(k66Var, annualActionFor, null);
                l46Var2.p0(objR2);
            } else {
                objR2 = new b66(k66Var, annualActionFor, null);
                l46Var2.p0(objR2);
            }
            af1.o((l26) objR2, l46Var2, annualActionFor);
        } else {
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new m65(i2, annualActionFor, x16Var, a26Var, 6);
        }
    }

    public static final void c(j09 j09Var, String str, boolean z, boolean z2, a26 a26Var, l46 l46Var, int i2) {
        j09 j09Var2;
        boolean z3;
        l46 l46Var2 = l46Var;
        str.getClass();
        a26Var.getClass();
        l46Var2.h0(-47248879);
        int i3 = i2 | 6 | (l46Var2.g(str) ? 32 : 16) | (l46Var2.h(z2) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE) | (l46Var2.i(a26Var) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE);
        if (l46Var2.W(i3 & 1, (i3 & 9363) != 9362)) {
            g09 g09Var = g09.a;
            j09 j09VarF = b.f(56.0f, 0.0f, g09Var, 2);
            float f2 = z2 ? 2.0f : 0.0f;
            pr4 pr4Var = o82.a;
            j09 j09VarE = oa7.E(b.c(db6.w(j09VarF, f2, y72.b(((m82) l46Var2.k(pr4Var)).o, z2 ? 1.0f : 0.5f), eze.a(l46Var2).a.j), 1.0f), eze.a(l46Var2).a.j);
            int i4 = 57344 & i3;
            boolean z4 = (i4 == 16384) | ((i3 & 7168) == 2048);
            Object objR = l46Var2.R();
            i8c i8cVar = sf2.a;
            if (z4 || objR == i8cVar) {
                objR = new oy1(4, a26Var, z2);
                l46Var2.p0(objR);
            }
            j09 j09VarA0 = ynb.a0(androidx.compose.foundation.b.c(j09VarE, false, null, null, (x16) objR, 15), 16.0f, 8.0f);
            t7c t7cVarA = s7c.a(xc0.a, ndb.z, l46Var2, 48);
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
            dec.l(hj6.z, l46Var2, t7cVarA);
            dec.l(hj6.y, l46Var2, u8aVarM);
            dec.l(hj6.X, l46Var2, Integer.valueOf(iHashCode));
            dec.k(l46Var2);
            dec.l(hj6.x, l46Var2, j09VarJ);
            nte.b(str, ynb.d0(0.0f, 0.0f, 2.0f, 0.0f, 11, new jw7(1.0f, true)), ((m82) l46Var2.k(pr4Var)).o, w6c.l(16), z2 ? ar5.z : ar5.w, null, 0L, null, new jme(z ? 5 : 3), w6c.l(24), 0, false, 0, 0, null, null, l46Var2, ((i3 >> 3) & 14) | 24576, 48, 258984);
            l46Var2 = l46Var2;
            if (z) {
                l46Var2.f0(936568455);
                boolean z5 = i4 == 16384;
                Object objR2 = l46Var2.R();
                if (z5 || objR2 == i8cVar) {
                    objR2 = new hy0(a26Var, 13);
                    l46Var2.p0(objR2);
                }
                z3 = true;
                cn1.c(z2, (a26) objR2, null, false, an1.n(((m82) l46Var2.k(pr4Var)).a, y72.b(((m82) l46Var2.k(pr4Var)).o, 0.72f), 0L, l46Var2, 60), l46Var, (i3 >> 9) & 14);
                l46Var2 = l46Var;
                l46Var2.r(false);
            } else {
                z3 = true;
                l46Var2.f0(-1030877963);
                l46Var2.r(false);
            }
            l46Var2.r(z3);
            j09Var2 = g09Var;
        } else {
            l46Var2.Z();
            j09Var2 = j09Var;
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new z50(j09Var2, str, z, z2, a26Var, i2);
        }
    }

    public static final br d(String str) {
        return new br(n3d.p(str));
    }

    public static final void e(jr2 jr2Var, long j2, a26 a26Var, l46 l46Var, int i2) {
        jr2Var.getClass();
        a26Var.getClass();
        l46Var.h0(-87254933);
        int i3 = i2 | (l46Var.g(jr2Var) ? 4 : 2) | (l46Var.f(j2) ? 32 : 16) | (l46Var.i(a26Var) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS);
        if (l46Var.W(i3 & 1, (i3 & 147) != 146)) {
            pwf pwfVarA = qd8.a(l46Var);
            if (pwfVarA == null) {
                qc0.p("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            m25 m25Var = (m25) z5c.G(job.a.b(m25.class), pwfVarA.g(), null, b21.r(pwfVarA), kr7.b(l46Var), null);
            e89 e89VarJ = jzb.j(m25Var.f, l46Var);
            e89 e89VarJ2 = jzb.j(m25Var.e, l46Var);
            e89 e89VarI = q1c.i(a26Var, l46Var);
            boolean z = ((o19) e89VarJ.getValue()) != null;
            Boolean bool = (Boolean) e89VarJ2.getValue();
            bool.getClass();
            Boolean boolValueOf = Boolean.valueOf(z);
            Long lValueOf = Long.valueOf(j2);
            boolean zG = l46Var.g(e89VarJ2) | l46Var.h(z) | l46Var.g(e89VarI);
            Object objR = l46Var.R();
            Object obj = sf2.a;
            if (zG || objR == obj) {
                objR = new m19(z, e89VarJ2, e89VarI, null);
                l46Var.p0(objR);
            }
            af1.q(bool, boolValueOf, lValueOf, (l26) objR, l46Var);
            o19 o19Var = (o19) e89VarJ.getValue();
            if (o19Var == null) {
                l46Var.f0(-955823927);
                l46Var.r(false);
            } else {
                l46Var.f0(-955823926);
                q19 q19Var = o19Var.c;
                String str = q19Var.a;
                String str2 = q19Var.b;
                String str3 = q19Var.c;
                String str4 = q19Var.d;
                List list = q19Var.e;
                boolean zG2 = l46Var.g(o19Var) | l46Var.i(m25Var) | ((i3 & 14) == 4);
                Object objR2 = l46Var.R();
                if (zG2 || objR2 == obj) {
                    objR2 = new kz8(o19Var, m25Var, jr2Var);
                    l46Var.p0(objR2);
                }
                z5c.e(str, str2, str3, str4, list, (a26) objR2, j2, (a26) e89VarI.getValue(), l46Var, (i3 << 15) & 3670016);
                l46Var.r(false);
            }
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new cq1(jr2Var, j2, a26Var, i2);
        }
    }

    public static final void f(j09 j09Var, boolean z, boolean z2, x16 x16Var, n26 n26Var, dd2 dd2Var, l46 l46Var, int i2) {
        int i3;
        boolean z3;
        n26 n26Var2;
        he2 he2Var;
        he2 he2Var2;
        he2 he2Var3;
        he2 he2Var4;
        dd2 dd2Var2 = dd2Var;
        l46 l46Var2 = l46Var;
        x16Var.getClass();
        l46Var2.h0(1447906794);
        if ((i2 & 6) == 0) {
            i3 = (l46Var2.g(j09Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= l46Var2.g(null) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= l46Var2.e(5) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        int i4 = i3 | 3072;
        if ((i2 & 24576) == 0) {
            i4 |= l46Var2.h(z2) ? 16384 : UserMetadata.MAX_INTERNAL_KEY_SIZE;
        }
        if ((196608 & i2) == 0) {
            i4 |= l46Var2.i(x16Var) ? 131072 : 65536;
        }
        int i5 = i4 | 1572864;
        if ((12582912 & i2) == 0) {
            i5 |= l46Var2.i(dd2Var2) ? 8388608 : 4194304;
        }
        if (l46Var2.W(i5 & 1, (4793491 & i5) != 4793490)) {
            n26Var2 = y41.d;
            pr4 pr4Var = l8b.a;
            j09 j09VarO = tm7.o(j09Var, ((e8b) l46Var2.k(pr4Var)).a, g21.f);
            xn8 xn8VarC = s21.c(ndb.b, false);
            int iHashCode = Long.hashCode(l46Var2.T);
            u8a u8aVarM = l46Var2.m();
            j09 j09VarJ = m93.J(l46Var2, j09VarO);
            lf2.q.getClass();
            l46Var2.j0();
            boolean z4 = l46Var2.S;
            ov7 ov7Var = LayoutNode.h1;
            if (z4) {
                l46Var2.l(ov7Var);
            } else {
                l46Var2.s0();
            }
            he2 he2Var5 = hj6.z;
            dec.l(he2Var5, l46Var2, xn8VarC);
            he2 he2Var6 = hj6.y;
            dec.l(he2Var6, l46Var2, u8aVarM);
            Integer numValueOf = Integer.valueOf(iHashCode);
            he2 he2Var7 = hj6.X;
            dec.l(he2Var7, l46Var2, numValueOf);
            dec.k(l46Var2);
            he2 he2Var8 = hj6.x;
            dec.l(he2Var8, l46Var2, j09VarJ);
            if (k8b.e((e8b) l46Var2.k(pr4Var))) {
                l46Var2.f0(-603709608);
                he2Var2 = he2Var7;
                he2Var4 = he2Var5;
                he2Var = he2Var6;
                he2Var3 = he2Var8;
                feg.j(od4.A(R.drawable.bg_onboarding_gradient, 0, l46Var2), null, b.c, null, an2.a, 0.0f, null, l46Var2, 25016, 104);
                l46Var2.r(false);
            } else {
                he2Var = he2Var6;
                he2Var2 = he2Var7;
                he2Var3 = he2Var8;
                he2Var4 = he2Var5;
                l46Var2.f0(-603500110);
                l46Var2.r(false);
            }
            n26Var2.m(d31.a, l46Var2, Integer.valueOf(6 | ((i5 >> 15) & 112)));
            c92 c92VarA = a92.a(xc0.c, ndb.Z, l46Var2, 48);
            int iHashCode2 = Long.hashCode(l46Var2.T);
            u8a u8aVarM2 = l46Var2.m();
            j09 j09VarJ2 = m93.J(l46Var2, g09.a);
            l46Var2.j0();
            if (l46Var2.S) {
                l46Var2.l(ov7Var);
            } else {
                l46Var2.s0();
            }
            dec.l(he2Var4, l46Var2, c92VarA);
            dec.l(he2Var, l46Var2, u8aVarM2);
            ib8.s(iHashCode2, l46Var2, he2Var2, l46Var2);
            dec.l(he2Var3, l46Var2, j09VarJ2);
            int i6 = i5 << 9;
            pa7.a(null, 0L, 0L, null, af1.b0(1991053552, new sz5(26), l46Var2), null, true, z2, x16Var, l46Var, (3670016 & i6) | 24576 | (29360128 & i6) | (i6 & 234881024), 47);
            l46Var2 = l46Var;
            dd2Var2 = dd2Var;
            ks0.q(6 | ((i5 >> 18) & 112), dd2Var2, e92.a, l46Var2, true);
            l46Var2.r(true);
            z3 = true;
        } else {
            l46Var2.Z();
            z3 = z;
            n26Var2 = n26Var;
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new g91(j09Var, z3, z2, x16Var, n26Var2, dd2Var2, i2, 2);
        }
    }

    public static final void g(boolean z, l26 l26Var, l46 l46Var, int i2) {
        int i3;
        l46Var.h0(-642000585);
        int i4 = 2;
        if ((i2 & 6) == 0) {
            i3 = (l46Var.h(z) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= l46Var.i(l26Var) ? 32 : 16;
        }
        if (l46Var.W(i3 & 1, (i3 & 19) != 18)) {
            Object objA = db8.a(l46Var);
            if (objA == null) {
                l46Var.f0(1512740606);
                objA = eb8.a(l46Var);
            } else {
                l46Var.f0(1512737723);
            }
            l46Var.r(false);
            if (objA == null) {
                qc0.p("No NavigationEventDispatcherOwner was provided via LocalNavigationEventDispatcherOwner and no OnBackPressedDispatcherOwner was provided via LocalOnBackPressedDispatcherOwner. Please provide one of the two.");
                return;
            }
            boolean zG = l46Var.g(objA);
            Object objR = l46Var.R();
            i8c i8cVar = sf2.a;
            if (zG || objR == i8cVar) {
                wb9 wb9Var = objA instanceof wb9 ? (wb9) objA : null;
                szc szcVarA = wb9Var != null ? wb9Var.a() : null;
                vm9 vm9Var = objA instanceof vm9 ? (vm9) objA : null;
                objR = new zr0(szcVarA, vm9Var != null ? vm9Var.b() : null);
                l46Var.p0(objR);
            }
            zr0 zr0Var = (zr0) objR;
            Object objR2 = l46Var.R();
            if (objR2 == i8cVar) {
                objR2 = af1.E(l46Var);
                l46Var.p0(objR2);
            }
            aw2 aw2Var = (aw2) objR2;
            long j2 = l46Var.T;
            boolean zG2 = l46Var.g(zr0Var) | l46Var.f(j2);
            Object objR3 = l46Var.R();
            if (zG2 || objR3 == i8cVar) {
                objR3 = new af2(aw2Var, new upa(j2, objA));
                l46Var.p0(objR3);
            }
            af2 af2Var = (af2) objR3;
            l46Var.f0(-348514256);
            boolean zI = l46Var.i(af2Var) | l46Var.i(l26Var);
            Object objR4 = l46Var.R();
            if (zI || objR4 == i8cVar) {
                objR4 = new ek9(20, af2Var, l26Var);
                l46Var.p0(objR4);
            }
            af1.u((x16) objR4, l46Var);
            int i5 = i3;
            Boolean boolValueOf = Boolean.valueOf(z);
            int i6 = i5 & 14;
            boolean zI2 = l46Var.i(af2Var) | (i6 == 4);
            Object objR5 = l46Var.R();
            if (zI2 || objR5 == i8cVar) {
                objR5 = new bs0(af2Var, z, 10);
                l46Var.p0(objR5);
            }
            t72.j(boolValueOf, af2Var, null, (a26) objR5, l46Var, i6);
            boolean zI3 = l46Var.i(zr0Var) | l46Var.i(af2Var);
            Object objR6 = l46Var.R();
            if (zI3 || objR6 == i8cVar) {
                objR6 = new kz8(26, zr0Var, af2Var);
                l46Var.p0(objR6);
            }
            af1.h(zr0Var, af2Var, (a26) objR6, l46Var);
            l46Var.r(false);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new iv1(i2, i4, l26Var, z);
        }
    }

    /* JADX WARN: Code duplicated, block: B:30:0x005f  */
    /* JADX WARN: Code duplicated, block: B:31:0x0061  */
    /* JADX WARN: Code duplicated, block: B:34:0x006b  */
    /* JADX WARN: Code duplicated, block: B:35:0x006d  */
    /* JADX WARN: Code duplicated, block: B:38:0x0076  */
    /* JADX WARN: Code duplicated, block: B:47:0x0092 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:48:0x0094  */
    /* JADX WARN: Code duplicated, block: B:49:0x0097  */
    /* JADX WARN: Code duplicated, block: B:51:0x009a  */
    /* JADX WARN: Code duplicated, block: B:54:0x009f  */
    /* JADX WARN: Code duplicated, block: B:55:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:59:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:60:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:65:0x0103  */
    /* JADX WARN: Code duplicated, block: B:67:0x0132  */
    /* JADX WARN: Code duplicated, block: B:70:0x013f  */
    /* JADX WARN: Code duplicated, block: B:72:? A[RETURN, SYNTHETIC] */
    public static final void h(j09 j09Var, boolean z, String str, boolean z2, x16 x16Var, l46 l46Var, int i2, int i3) {
        j09 j09Var2;
        int i4;
        boolean z3;
        int i5;
        String str2;
        int i6;
        int i7;
        int i8;
        boolean z4;
        boolean z5;
        String str3;
        boolean z6;
        ojb ojbVarV;
        j09 j09Var3;
        String strQ;
        String str4;
        int i9;
        boolean z7;
        gh6 gh6VarW0;
        boolean z8;
        boolean z9;
        Object objR;
        l46Var.h0(-222810907);
        int i10 = i3 & 1;
        if (i10 != 0) {
            i4 = i2 | 6;
            j09Var2 = j09Var;
        } else if ((i2 & 6) == 0) {
            j09Var2 = j09Var;
            i4 = i2 | (l46Var.g(j09Var2) ? 4 : 2);
        } else {
            j09Var2 = j09Var;
            i4 = i2;
        }
        int i11 = i3 & 2;
        if (i11 != 0) {
            i5 = i4 | 48;
            z3 = z;
        } else {
            z3 = z;
            i5 = i4 | (l46Var.h(z3) ? 32 : 16);
        }
        if ((i3 & 4) == 0) {
            str2 = str;
            if (l46Var.g(str2)) {
                i6 = 256;
            }
            int i12 = i5 | i6 | 3072;
            if (l46Var.i(x16Var)) {
                i7 = 16384;
            } else {
                i7 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
            }
            i8 = i12 | i7;
            if ((i8 & 9363) != 9362) {
                z4 = true;
            } else {
                z4 = false;
            }
            if (l46Var.W(i8 & 1, z4)) {
                l46Var.b0();
                if ((i2 & 1) != 0 || l46Var.C()) {
                    if (i10 != 0) {
                        j09Var3 = g09.a;
                    } else {
                        j09Var3 = j09Var2;
                    }
                    if (i11 != 0) {
                        z3 = true;
                    }
                    if ((i3 & 4) != 0) {
                        strQ = afc.q(R.string.button_continue, l46Var);
                        i8 &= -897;
                    } else {
                        strQ = str2;
                    }
                    String str5 = strQ;
                    j09Var2 = j09Var3;
                    str4 = str5;
                    i9 = i8;
                    z7 = true;
                } else {
                    l46Var.Z();
                    if ((i3 & 4) != 0) {
                        i8 &= -897;
                    }
                    i9 = i8;
                    str4 = str2;
                    z7 = z2;
                }
                l46Var.s();
                gh6VarW0 = kj0.w0(l46Var);
                j09 j09VarC = b.c(b.q(0.0f, 380.0f, b.b(0.0f, 56.0f, j09Var2, 1), 1), 1.0f);
                u51 u51VarM = c8b.m(l46Var);
                x4d x4dVarF = we6.f(eze.a(l46Var).a.a, l46Var);
                q11 q11VarA = we6.a(null, l46Var, 1);
                bx9 bx9Var = new bx9(24.0f, 10.0f, 24.0f, 10.0f);
                boolean zI = l46Var.i(gh6VarW0);
                if ((57344 & i9) == 16384) {
                    z8 = true;
                } else {
                    z8 = false;
                }
                z9 = zI | z8;
                objR = l46Var.R();
                if (z9 || objR == sf2.a) {
                    objR = new j28(z7, gh6VarW0, x16Var, 0);
                    l46Var.p0(objR);
                }
                boolean z10 = z3;
                cgg.a((x16) objR, j09VarC, z10, x4dVarF, u51VarM, null, q11VarA, bx9Var, af1.b0(625863413, new ob0(str4, 12), l46Var), l46Var, ((i9 << 3) & 896) | 817889280, 288);
                str3 = str4;
                z6 = z7;
                z5 = z10;
            } else {
                l46Var.Z();
                z5 = z3;
                str3 = str2;
                z6 = z2;
            }
            ojbVarV = l46Var.v();
            if (ojbVarV != null) {
                ojbVarV.d = new k28(j09Var2, z5, str3, z6, x16Var, i2, i3);
            }
        }
        str2 = str;
        i6 = UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        int i13 = i5 | i6 | 3072;
        if (l46Var.i(x16Var)) {
            i7 = 16384;
        } else {
            i7 = UserMetadata.MAX_INTERNAL_KEY_SIZE;
        }
        i8 = i13 | i7;
        if ((i8 & 9363) != 9362) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (l46Var.W(i8 & 1, z4)) {
            l46Var.b0();
            if ((i2 & 1) != 0) {
                if (i10 != 0) {
                    j09Var3 = g09.a;
                } else {
                    j09Var3 = j09Var2;
                }
                if (i11 != 0) {
                    z3 = true;
                }
                if ((i3 & 4) != 0) {
                    strQ = afc.q(R.string.button_continue, l46Var);
                    i8 &= -897;
                } else {
                    strQ = str2;
                }
                String str6 = strQ;
                j09Var2 = j09Var3;
                str4 = str6;
                i9 = i8;
                z7 = true;
            } else {
                if (i10 != 0) {
                    j09Var3 = g09.a;
                } else {
                    j09Var3 = j09Var2;
                }
                if (i11 != 0) {
                    z3 = true;
                }
                if ((i3 & 4) != 0) {
                    strQ = afc.q(R.string.button_continue, l46Var);
                    i8 &= -897;
                } else {
                    strQ = str2;
                }
                String str7 = strQ;
                j09Var2 = j09Var3;
                str4 = str7;
                i9 = i8;
                z7 = true;
            }
            l46Var.s();
            gh6VarW0 = kj0.w0(l46Var);
            j09 j09VarC2 = b.c(b.q(0.0f, 380.0f, b.b(0.0f, 56.0f, j09Var2, 1), 1), 1.0f);
            u51 u51VarM2 = c8b.m(l46Var);
            x4d x4dVarF2 = we6.f(eze.a(l46Var).a.a, l46Var);
            q11 q11VarA2 = we6.a(null, l46Var, 1);
            bx9 bx9Var2 = new bx9(24.0f, 10.0f, 24.0f, 10.0f);
            boolean zI2 = l46Var.i(gh6VarW0);
            if ((57344 & i9) == 16384) {
                z8 = true;
            } else {
                z8 = false;
            }
            z9 = zI2 | z8;
            objR = l46Var.R();
            if (z9) {
                objR = new j28(z7, gh6VarW0, x16Var, 0);
                l46Var.p0(objR);
            } else {
                objR = new j28(z7, gh6VarW0, x16Var, 0);
                l46Var.p0(objR);
            }
            boolean z11 = z3;
            cgg.a((x16) objR, j09VarC2, z11, x4dVarF2, u51VarM2, null, q11VarA2, bx9Var2, af1.b0(625863413, new ob0(str4, 12), l46Var), l46Var, ((i9 << 3) & 896) | 817889280, 288);
            str3 = str4;
            z6 = z7;
            z5 = z11;
        } else {
            l46Var.Z();
            z5 = z3;
            str3 = str2;
            z6 = z2;
        }
        ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new k28(j09Var2, z5, str3, z6, x16Var, i2, i3);
        }
    }

    public static final void i(j09 j09Var, String str, boolean z, x16 x16Var, l46 l46Var, int i2, int i3) {
        j09 j09Var2;
        int i4;
        j09 j09Var3;
        boolean z2;
        str.getClass();
        l46Var.h0(858355031);
        int i5 = i3 & 1;
        if (i5 != 0) {
            i4 = i2 | 6;
            j09Var2 = j09Var;
        } else if ((i2 & 6) == 0) {
            j09Var2 = j09Var;
            i4 = (l46Var.g(j09Var2) ? 4 : 2) | i2;
        } else {
            j09Var2 = j09Var;
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= l46Var.g(str) ? 32 : 16;
        }
        int i6 = i4 | 384;
        if ((i2 & 3072) == 0) {
            i6 |= l46Var.i(x16Var) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE;
        }
        if (l46Var.W(i6 & 1, (i6 & 1171) != 1170)) {
            j09Var3 = i5 != 0 ? g09.a : j09Var2;
            gh6 gh6VarW0 = kj0.w0(l46Var);
            j09 j09VarB = b.b(0.0f, 56.0f, b.c(j09Var3, 1.0f), 1);
            u51 u51VarL = c8b.l(l46Var);
            x4d x4dVarF = we6.f(a7c.b(28.0f), l46Var);
            q11 q11VarA = we6.a(null, l46Var, 1);
            bx9 bx9Var = new bx9(24.0f, 10.0f, 24.0f, 10.0f);
            boolean zI = ((i6 & 7168) == 2048) | ((i6 & 896) == 256) | l46Var.i(gh6VarW0);
            Object objR = l46Var.R();
            if (zI || objR == sf2.a) {
                objR = new sj2(gh6VarW0, x16Var, 1);
                l46Var.p0(objR);
            }
            z2 = true;
            cgg.a((x16) objR, j09VarB, false, x4dVarF, u51VarL, null, q11VarA, bx9Var, af1.b0(-2144665753, new ob0(str, 13), l46Var), l46Var, 817889280, 292);
        } else {
            l46Var.Z();
            j09Var3 = j09Var2;
            z2 = z;
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new lc2(j09Var3, str, z2, x16Var, i2, i3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:37:0x006b  */
    /* JADX WARN: Code duplicated, block: B:39:0x0071  */
    /* JADX WARN: Code duplicated, block: B:40:0x0074  */
    /* JADX WARN: Code duplicated, block: B:44:0x007d  */
    /* JADX WARN: Code duplicated, block: B:46:0x0083  */
    /* JADX WARN: Code duplicated, block: B:47:0x0086  */
    /* JADX WARN: Code duplicated, block: B:51:0x0094  */
    /* JADX WARN: Code duplicated, block: B:52:0x0096  */
    /* JADX WARN: Code duplicated, block: B:55:0x009f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:57:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:59:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:62:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:64:? A[RETURN, SYNTHETIC] */
    public static final void j(j09 j09Var, String str, int i2, boolean z, x16 x16Var, dd2 dd2Var, l46 l46Var, int i3, int i4) {
        int i5;
        boolean z2;
        int i6;
        boolean z3;
        int i7;
        boolean z4;
        ojb ojbVarV;
        int i8;
        int i9;
        x16Var.getClass();
        l46Var.h0(762853033);
        if ((i3 & 6) == 0) {
            i5 = (l46Var.g(j09Var) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= l46Var.g(str) ? 32 : 16;
        }
        int i10 = i5 | 384;
        if ((i3 & 3072) == 0) {
            i10 |= l46Var.g(null) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE;
        }
        int i11 = i10 | 24576;
        int i12 = i4 & 32;
        if (i12 == 0) {
            if ((196608 & i3) == 0) {
                z2 = z;
                i11 |= l46Var.h(z2) ? 131072 : 65536;
            }
            if ((1572864 & i3) == 0) {
                if (l46Var.i(x16Var)) {
                    i9 = 1048576;
                } else {
                    i9 = 524288;
                }
                i11 |= i9;
            }
            if ((i3 & 12582912) == 0) {
                if (l46Var.i(dd2Var)) {
                    i8 = 8388608;
                } else {
                    i8 = 4194304;
                }
                i11 |= i8;
            }
            i6 = 0;
            if ((4793491 & i11) != 4793490) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (l46Var.W(i11 & 1, z3)) {
                boolean z5 = i12 == 0 ? z2 : true;
                dd2 dd2VarB0 = af1.b0(358041395, new i28(str, dd2Var, i6), l46Var);
                int i13 = i11 >> 6;
                int i14 = (i11 & 14) | 12582912 | (i13 & 112) | (i13 & 896);
                int i15 = i11 >> 3;
                boolean z6 = z5;
                f(j09Var, false, z6, x16Var, null, dd2VarB0, l46Var, i14 | (57344 & i15) | (i15 & 458752));
                i7 = 5;
                z4 = z6;
            } else {
                l46Var.Z();
                i7 = i2;
                z4 = z2;
            }
            ojbVarV = l46Var.v();
            if (ojbVarV != null) {
                ojbVarV.d = new c06(j09Var, str, i7, z4, x16Var, dd2Var, i3, i4);
            }
        }
        i11 = 221184 | i10;
        z2 = z;
        if ((1572864 & i3) == 0) {
            if (l46Var.i(x16Var)) {
                i9 = 1048576;
            } else {
                i9 = 524288;
            }
            i11 |= i9;
        }
        if ((i3 & 12582912) == 0) {
            if (l46Var.i(dd2Var)) {
                i8 = 8388608;
            } else {
                i8 = 4194304;
            }
            i11 |= i8;
        }
        i6 = 0;
        if ((4793491 & i11) != 4793490) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (l46Var.W(i11 & 1, z3)) {
            if (i12 == 0) {
            }
            dd2 dd2VarB1 = af1.b0(358041395, new i28(str, dd2Var, i6), l46Var);
            int i16 = i11 >> 6;
            int i17 = (i11 & 14) | 12582912 | (i16 & 112) | (i16 & 896);
            int i18 = i11 >> 3;
            boolean z7 = z5;
            f(j09Var, false, z7, x16Var, null, dd2VarB1, l46Var, i17 | (57344 & i18) | (i18 & 458752));
            i7 = 5;
            z4 = z7;
        } else {
            l46Var.Z();
            i7 = i2;
            z4 = z2;
        }
        ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new c06(j09Var, str, i7, z4, x16Var, dd2Var, i3, i4);
        }
    }

    public static final String k(jd4 jd4Var) {
        jd4Var.getClass();
        if (jd4Var instanceof ed4) {
            ed4 ed4Var = (ed4) jd4Var;
            if (ed4Var instanceof fd4) {
                return ((fd4) jd4Var).b;
            }
            if (ed4Var instanceof gd4) {
                return null;
            }
            ap.c();
            return null;
        }
        if (jd4Var instanceof zc4) {
            return k(((zc4) jd4Var).d);
        }
        if (jd4Var instanceof bd4) {
            return k(((bd4) jd4Var).b);
        }
        if (jd4Var instanceof ad4) {
            return k(((ad4) jd4Var).a);
        }
        return null;
    }

    public static void l(opd opdVar, List list, pjb pjbVar) {
        if (list.isEmpty()) {
            return;
        }
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            int iC = opdVar.c((f46) list.get(i2));
            int iO = opdVar.O(opdVar.b, opdVar.q(iC));
            Object obj = iO < opdVar.f(opdVar.b, opdVar.q(iC + 1)) ? opdVar.c[opdVar.g(iO)] : sf2.a;
            ojb ojbVar = obj instanceof ojb ? (ojb) obj : null;
            if (ojbVar != null) {
                ojbVar.a = pjbVar;
            }
        }
    }

    public static final ad4 m(jd4 jd4Var) {
        if (jd4Var instanceof ad4) {
            return (ad4) jd4Var;
        }
        if (jd4Var instanceof bd4) {
            dd4 dd4Var = ((bd4) jd4Var).b;
            if (dd4Var instanceof ad4) {
                return (ad4) dd4Var;
            }
        }
        return null;
    }

    public static final int n(int i2, p89 p89Var) {
        int i3 = p89Var.c - 1;
        int i4 = 0;
        while (i4 < i3) {
            int i5 = ((i3 - i4) / 2) + i4;
            Object[] objArr = p89Var.a;
            int i6 = ((da7) objArr[i5]).a;
            if (i6 != i2) {
                if (i6 < i2) {
                    i4 = i5 + 1;
                    if (i2 < ((da7) objArr[i4]).a) {
                    }
                } else {
                    i3 = i5 - 1;
                }
            }
            return i5;
        }
        return i4;
    }

    public static final Object o(rv3 rv3Var, x16 x16Var, zn2 zn2Var) {
        Object obj;
        yf9 yf9VarR0;
        Object objX;
        wo0 wo0Var;
        if (((i09) rv3Var).a.Y) {
            i09 i09Var = (i09) rv3Var;
            if (!i09Var.a.Y) {
                i37.c("visitAncestors called on an unattached node");
            }
            i09 i09Var2 = i09Var.a.e;
            LayoutNode layoutNodeS0 = vd0.s0(rv3Var);
            loop0: while (true) {
                obj = null;
                if (layoutNodeS0 == null) {
                    break;
                }
                if ((((i09) layoutNodeS0.V0.g).d & 524288) != 0) {
                    while (i09Var2 != null) {
                        if ((i09Var2.c & 524288) != 0) {
                            i09 i09VarM0 = i09Var2;
                            p89 p89Var = null;
                            while (i09VarM0 != null) {
                                if (i09VarM0 instanceof h31) {
                                    obj = i09VarM0;
                                    break loop0;
                                }
                                if ((i09VarM0.c & 524288) != 0 && (i09VarM0 instanceof sv3)) {
                                    int i2 = 0;
                                    for (i09 i09Var3 = ((sv3) i09VarM0).E0; i09Var3 != null; i09Var3 = i09Var3.f) {
                                        if ((i09Var3.c & 524288) != 0) {
                                            i2++;
                                            if (i2 == 1) {
                                                i09VarM0 = i09Var3;
                                            } else {
                                                if (p89Var == null) {
                                                    p89Var = new p89(0, new i09[16]);
                                                }
                                                if (i09VarM0 != null) {
                                                    p89Var.b(i09VarM0);
                                                    i09VarM0 = null;
                                                }
                                                p89Var.b(i09Var3);
                                            }
                                        }
                                    }
                                    if (i2 == 1) {
                                    }
                                }
                                i09VarM0 = vd0.m0(p89Var);
                            }
                        }
                        i09Var2 = i09Var2.e;
                    }
                }
                layoutNodeS0 = layoutNodeS0.F();
                i09Var2 = (layoutNodeS0 == null || (wo0Var = layoutNodeS0.V0) == null) ? null : (zde) wo0Var.f;
            }
            h31 h31Var = (h31) obj;
            if (h31Var != null && (objX = h31Var.X((yf9VarR0 = vd0.r0(rv3Var)), new v6(26, x16Var, yf9VarR0), zn2Var)) == bw2.a) {
                return objX;
            }
        }
        return wef.a;
    }

    public static final j09 p(j09 j09Var, k31 k31Var) {
        return j09Var.D(new l31(k31Var));
    }

    public static wj5 q(wj5 wj5Var, int i2) {
        i41 i41Var;
        if (i2 < 0 && i2 != -2 && i2 != -1) {
            qc0.o(tec.e(i2, "Buffer size should be non-negative, BUFFERED, or CONFLATED, but was "));
            return null;
        }
        if (i2 == -1) {
            i2 = 0;
            i41Var = i41.b;
        } else {
            i41Var = i41.a;
        }
        int i3 = i2;
        i41 i41Var2 = i41Var;
        return wj5Var instanceof q36 ? q36.d((q36) wj5Var, null, i3, i41Var2, 1) : new hw1(wj5Var, null, i3, i41Var2, 2);
    }

    public static final ih9 r(Context context, int i2, int i3, String str, int i4, ya3 ya3Var, LocalDate localDate) {
        String str2;
        new nh9(context).b.createNotificationChannel(new NotificationChannel("daily_reminder", context.getString(R.string.notification_time_title), 3));
        Intent launchIntentForPackage = context.getPackageManager().getLaunchIntentForPackage(context.getPackageName());
        if (launchIntentForPackage != null) {
            launchIntentForPackage.setFlags(603979776);
            List list = ua3.a;
            int iOrdinal = ya3Var.ordinal();
            if (iOrdinal == 0) {
                str2 = "daily_push";
            } else {
                if (iOrdinal != 1) {
                    ap.c();
                    return null;
                }
                str2 = "tomorrow_fortune_push";
            }
            launchIntentForPackage.putExtra("triggered_by", str2);
            launchIntentForPackage.putExtra("push_id", str);
            launchIntentForPackage.putExtra("daily_reminder_kind", ya3Var.d());
            launchIntentForPackage.putExtra("daily_fortune_target_date", localDate.toString());
        } else {
            launchIntentForPackage = null;
        }
        PendingIntent activity = launchIntentForPackage != null ? PendingIntent.getActivity(context, i4, launchIntentForPackage, 201326592) : null;
        ih9 ih9Var = new ih9(context, "daily_reminder");
        ih9Var.e = ih9.b(context.getString(i2));
        ih9Var.f = ih9.b(context.getString(i3));
        if (activity != null) {
            ih9Var.g = activity;
        }
        ih9Var.v.icon = R.drawable.notification_small_icon;
        ih9Var.p = "recommendation";
        ih9Var.r = 7896797;
        ih9Var.n = true;
        ih9Var.o = true;
        ih9Var.c(16, true);
        return ih9Var;
    }

    public static final String s(String str) {
        char cCharAt;
        str.getClass();
        if (str.length() == 0 || 'a' > (cCharAt = str.charAt(0)) || cCharAt >= '{') {
            return str;
        }
        StringBuilder sb = new StringBuilder(str.length());
        sb.append(Character.toUpperCase(cCharAt));
        sb.append((CharSequence) str, 1, str.length());
        return sb.toString();
    }

    public static final void t(Closeable closeable, Throwable th) {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th2) {
                bzd.m(th, th2);
            }
        }
    }

    public static boolean u(o3 o3Var, Map.Entry entry) {
        entry.getClass();
        V v = o3Var.get(entry.getKey());
        if (v != 0) {
            return v.equals(entry.getValue());
        }
        return entry.getValue() == null && o3Var.containsKey(entry.getKey());
    }

    public static final void v(int i2, int i3) {
        if (i2 <= i3) {
            return;
        }
        r3.i(kv2.h(i2, i3, "toIndex (", ") is greater than size (", ")."));
    }

    public static boolean w(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public static final wj5 x(wj5 wj5Var, pv2 pv2Var) {
        if (pv2Var.F0(ndb.Y0) != null) {
            ho7.y(pv2Var, "Flow context cannot contain job in it. Had ");
            return null;
        }
        if (pv2Var.equals(nu4.a)) {
            return wj5Var;
        }
        return wj5Var instanceof q36 ? q36.d((q36) wj5Var, pv2Var, 0, null, 6) : new hw1(wj5Var, pv2Var, 0, null, 12);
    }

    public static final j09 y(j09 j09Var, boolean z, t69 t69Var) {
        return j09Var.D(z ? new ro5(t69Var) : g09.a);
    }

    public static final String[] z(en2 en2Var) {
        en2Var.getClass();
        return (String[]) ((br) en2Var).b.toArray(new String[0]);
    }
}
