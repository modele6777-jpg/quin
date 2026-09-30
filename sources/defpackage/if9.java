package defpackage;

import ai.askquin.R;
import android.content.ClipboardManager;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.inputmethod.ExtractedText;
import androidx.compose.foundation.b;
import androidx.compose.ui.node.LayoutNode;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class if9 {
    public static final char[] a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
    public static final dd2 b = new dd2(new ed2(3), false, 596169697);
    public static final dd2 c = new dd2(new yd2(27), false, -1153548521);
    public static final dd2 d = new dd2(new yd2(28), false, 2040704211);
    public static final dd2 e = new dd2(new yd2(29), false, -1892139672);
    public static final dd2 f = new dd2(new de2(0), false, 1920669727);
    public static final dd2 g = new dd2(new ie2(8), false, -898688903);
    public static final dd2 h = new dd2(new he2(10), false, -1595422102);
    public static final os5 i = new os5(R.drawable.four_seasons_banner_icon, R.drawable.four_seasons_banner_icon_greyscale, R.drawable.four_seasons_intro_kv, R.drawable.four_seasons_spread_light, R.drawable.four_seasons_spread_dark, R.drawable.four_seasons_report_preview_1_light, R.drawable.four_seasons_report_preview_1_dark, R.drawable.four_seasons_report_preview_2_light, R.drawable.four_seasons_report_preview_2_dark, R.drawable.four_seasons_report_preview_3_light, R.drawable.four_seasons_report_preview_3_dark, R.drawable.four_seasons_share_thumbnail, R.drawable.four_seasons_step_1, R.drawable.four_seasons_step_2, R.drawable.four_seasons_step_3);
    public static final os5 j = new os5(R.drawable.four_seasons_autumn_home_artwork, R.drawable.four_seasons_autumn_home_artwork_greyscale, R.drawable.four_seasons_autumn_intro_kv, R.drawable.four_seasons_autumn_spread_light, R.drawable.four_seasons_autumn_spread_dark, R.drawable.four_seasons_autumn_report_preview_1_light, R.drawable.four_seasons_autumn_report_preview_1_dark, R.drawable.four_seasons_autumn_report_preview_2_light, R.drawable.four_seasons_autumn_report_preview_2_dark, R.drawable.four_seasons_autumn_report_preview_3_light, R.drawable.four_seasons_autumn_report_preview_3_dark, R.drawable.four_seasons_autumn_share_thumbnail, R.drawable.four_seasons_autumn_step_1, R.drawable.four_seasons_autumn_step_2, R.drawable.four_seasons_autumn_step_3);
    public static final n82 k;
    public static final float l;
    public static final n82 m;
    public static final n82 n;
    public static final aqd o;
    public static final vpd p;
    public static final String[] q;
    public static final String[] r;
    public static gx6 s;
    public static gx6 t;
    public static gx6 u;

    static {
        n82 n82Var = n82.w;
        k = n82Var;
        l = 0.38f;
        m = n82Var;
        n = n82.y;
        o = new aqd(2);
        p = new vpd(1);
        q = new String[]{"firebase_last_notification", "first_open_time", "first_visit_time", "last_deep_link_referrer", "user_id", "last_advertising_id_reset", "first_open_after_install", "lifetime_user_engagement", "session_user_engagement", "non_personalized_ads", "ga_session_number", "ga_session_id", "last_gclid", "session_number", "session_id"};
        r = new String[]{"_ln", "_fot", "_fvt", "_ldl", "_id", "_lair", "_fi", "_lte", "_se", "_npa", "_sno", "_sid", "_lgclid", "_sno", "_sid"};
    }

    public static final boolean A(float[] fArr, float[] fArr2) {
        if (fArr.length < 16 || fArr2.length < 16) {
            return false;
        }
        float f2 = fArr[0];
        float f3 = fArr[1];
        float f4 = fArr[2];
        float f5 = fArr[3];
        float f6 = fArr[4];
        float f7 = fArr[5];
        float f8 = fArr[6];
        float f9 = fArr[7];
        float f10 = fArr[8];
        float f11 = fArr[9];
        float f12 = fArr[10];
        float f13 = fArr[11];
        float f14 = fArr[12];
        float f15 = fArr[13];
        float f16 = fArr[14];
        float f17 = fArr[15];
        float f18 = (f2 * f7) - (f3 * f6);
        float f19 = (f2 * f8) - (f4 * f6);
        float f20 = (f2 * f9) - (f5 * f6);
        float f21 = (f3 * f8) - (f4 * f7);
        float f22 = (f3 * f9) - (f5 * f7);
        float f23 = (f4 * f9) - (f5 * f8);
        float f24 = (f10 * f15) - (f11 * f14);
        float f25 = (f10 * f16) - (f12 * f14);
        float f26 = (f10 * f17) - (f13 * f14);
        float f27 = (f11 * f16) - (f12 * f15);
        float f28 = (f11 * f17) - (f13 * f15);
        float f29 = (f12 * f17) - (f13 * f16);
        float f30 = (f23 * f24) + (((f21 * f26) + ((f20 * f27) + ((f18 * f29) - (f19 * f28)))) - (f22 * f25));
        if (f30 != 0.0f) {
            float f31 = 1.0f / f30;
            fArr2[0] = ((f9 * f27) + ((f7 * f29) - (f8 * f28))) * f31;
            fArr2[1] = (((f4 * f28) + ((-f3) * f29)) - (f5 * f27)) * f31;
            fArr2[2] = ((f17 * f21) + ((f15 * f23) - (f16 * f22))) * f31;
            fArr2[3] = (((f12 * f22) + ((-f11) * f23)) - (f13 * f21)) * f31;
            float f32 = -f6;
            fArr2[4] = (((f8 * f26) + (f32 * f29)) - (f9 * f25)) * f31;
            fArr2[5] = ((f5 * f25) + ((f29 * f2) - (f4 * f26))) * f31;
            float f33 = -f14;
            fArr2[6] = (((f16 * f20) + (f33 * f23)) - (f17 * f19)) * f31;
            fArr2[7] = ((f13 * f19) + ((f23 * f10) - (f12 * f20))) * f31;
            fArr2[8] = ((f9 * f24) + ((f6 * f28) - (f7 * f26))) * f31;
            fArr2[9] = (((f26 * f3) + ((-f2) * f28)) - (f5 * f24)) * f31;
            fArr2[10] = ((f17 * f18) + ((f14 * f22) - (f15 * f20))) * f31;
            fArr2[11] = (((f20 * f11) + ((-f10) * f22)) - (f13 * f18)) * f31;
            fArr2[12] = (((f7 * f25) + (f32 * f27)) - (f8 * f24)) * f31;
            fArr2[13] = ((f4 * f24) + ((f2 * f27) - (f3 * f25))) * f31;
            fArr2[14] = (((f15 * f19) + (f33 * f21)) - (f16 * f18)) * f31;
            fArr2[15] = ((f12 * f18) + ((f10 * f21) - (f11 * f19))) * f31;
        }
        return !(f30 == 0.0f);
    }

    public static final boolean B(l46 l46Var) {
        return (((Configuration) l46Var.k(uq.a)).uiMode & 48) == 32;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void C(i09 i09Var, x16 x16Var) {
        bl9 bl9Var = i09Var.g;
        if (bl9Var == null) {
            bl9Var = new bl9((al9) i09Var);
            i09Var.g = bl9Var;
        }
        gw9 snapshotObserver = vd0.t0(i09Var).getSnapshotObserver();
        snapshotObserver.a.d(bl9Var, bl9.b, x16Var);
    }

    /* JADX WARN: Code duplicated, block: B:33:0x008e  */
    public static final tt7 D(tt7 tt7Var, ArrayList arrayList) {
        dzd dzdVar;
        tt7Var.Z().size();
        arrayList.size();
        ArrayList arrayList2 = new ArrayList(t72.u(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            b7f b7fVar = (b7f) it.next();
            b7fVar.getClass();
            tt7 tt7Var2 = b7fVar.c;
            tt7 tt7Var3 = b7fVar.b;
            c8f c8fVar = b7fVar.a;
            vt7.a.b(tt7Var3, tt7Var2);
            if (pa7.t(tt7Var3, tt7Var2)) {
                dzdVar = new dzd(tt7Var3);
            } else {
                dsf dsfVarX = c8fVar.x();
                dsf dsfVar = dsf.IN_VARIANCE;
                if (dsfVarX == dsfVar) {
                    dzdVar = new dzd(tt7Var3);
                } else {
                    boolean zF = xr7.F(tt7Var3);
                    dsf dsfVar2 = dsf.OUT_VARIANCE;
                    dsf dsfVar3 = dsf.INVARIANT;
                    if (zF && c8fVar.x() != dsfVar) {
                        if (dsfVar2 == c8fVar.x()) {
                            dsfVar2 = dsfVar3;
                        }
                        dzdVar = new dzd(tt7Var2, dsfVar2);
                    } else {
                        if (tt7Var2 == null) {
                            xr7.a(140);
                            throw null;
                        }
                        if (xr7.y(tt7Var2) && tt7Var2.i0()) {
                            if (dsfVar == c8fVar.x()) {
                                dsfVar = dsfVar3;
                            }
                            dzdVar = new dzd(tt7Var3, dsfVar);
                        } else {
                            if (dsfVar2 == c8fVar.x()) {
                                dsfVar2 = dsfVar3;
                            }
                            dzdVar = new dzd(tt7Var2, dsfVar2);
                        }
                    }
                }
            }
            arrayList2.add(dzdVar);
        }
        return w6c.t(tt7Var, arrayList2, null, 6);
    }

    public static String E(byte[] bArr) throws NoSuchAlgorithmException {
        MessageDigest messageDigest = MessageDigest.getInstance("SHA-1");
        messageDigest.getClass();
        messageDigest.update(bArr, 0, bArr.length);
        byte[] bArrDigest = messageDigest.digest();
        bArrDigest.getClass();
        char[] cArr = new char[bArrDigest.length * 2];
        int length = bArrDigest.length;
        for (int i2 = 0; i2 < length; i2++) {
            byte b2 = bArrDigest[i2];
            int i3 = i2 * 2;
            char[] cArr2 = a;
            cArr[i3] = cArr2[(b2 & 255) >>> 4];
            cArr[i3 + 1] = cArr2[b2 & 15];
        }
        return new String(cArr);
    }

    public static final whb F(wj5 wj5Var, aw2 aw2Var, ned nedVar, Object obj) {
        veh vehVarR = r(wj5Var);
        s0e s0eVarA = t0e.a(obj);
        return new whb(s0eVarA, ynb.U(aw2Var, (pv2) vehVarR.e, nedVar.equals(med.a) ? dw2.a : dw2.d, new nm5(nedVar, (wj5) vehVarR.c, s0eVarA, obj, null)));
    }

    public static final ExtractedText G(zse zseVar) {
        ExtractedText extractedText = new ExtractedText();
        String str = zseVar.a.b;
        extractedText.text = str;
        extractedText.startOffset = 0;
        extractedText.partialEndOffset = str.length();
        extractedText.partialStartOffset = -1;
        long j2 = zseVar.b;
        extractedText.selectionStart = eue.g(j2);
        extractedText.selectionEnd = eue.f(j2);
        extractedText.flags = !v4e.G(zseVar.a.b, '\n') ? 1 : 0;
        return extractedText;
    }

    public static final Bundle H() {
        Bundle bundle = new Bundle();
        bundle.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_SERVER_CLIENT_ID", "908709090310-6rk9ld8362m372ostkv4kn0k5ru7iu95.apps.googleusercontent.com");
        bundle.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_NONCE", null);
        bundle.putBoolean("com.google.android.libraries.identity.googleid.BUNDLE_KEY_FILTER_BY_AUTHORIZED_ACCOUNTS", false);
        bundle.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_LINKED_SERVICE_ID", null);
        bundle.putStringArrayList("com.google.android.libraries.identity.googleid.BUNDLE_KEY_ID_TOKEN_DEPOSITION_SCOPES", null);
        bundle.putBoolean("com.google.android.libraries.identity.googleid.BUNDLE_KEY_REQUEST_VERIFIED_PHONE_NUMBER", false);
        bundle.putBoolean("com.google.android.libraries.identity.googleid.BUNDLE_KEY_AUTO_SELECT_ENABLED", true);
        bundle.putString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_HOSTED_DOMAIN_FILTER", null);
        return bundle;
    }

    public static final void a(c4c c4cVar, boolean z, dd2 dd2Var, l46 l46Var, int i2) {
        int i3;
        l46Var.h0(407108909);
        if ((i2 & 6) == 0) {
            i3 = (l46Var.g(c4cVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= l46Var.h(z) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= l46Var.i(dd2Var) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        if (l46Var.W(i3 & 1, (i3 & 147) != 146)) {
            g09 g09Var = g09.a;
            if (z) {
                l46Var.f0(-805894951);
                dd2Var.t(c4cVar, g09Var, l46Var, Integer.valueOf((i3 & 896) | (i3 & 14) | 48));
                l46Var.r(false);
            } else {
                l46Var.f0(-805999793);
                dd2Var.t(c4cVar, mh3.K(g09Var, mh3.T(l46Var)), l46Var, Integer.valueOf(i3 & 910));
                l46Var.r(false);
            }
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new i30(c4cVar, z, dd2Var, i2, 1);
        }
    }

    public static final void b(int i2, x16 x16Var, l46 l46Var, j09 j09Var, String str) {
        int i3;
        j09 j09Var2;
        x16Var.getClass();
        l46Var.h0(836767049);
        if ((i2 & 6) == 0) {
            i3 = i2 | (l46Var.g(str) ? 4 : 2);
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= l46Var.i(x16Var) ? 32 : 16;
        }
        int i4 = i3 | 384;
        if (l46Var.W(i4 & 1, (i4 & 147) != 146)) {
            y6c y6cVarB = a7c.b(999.0f);
            g09 g09Var = g09.a;
            j09 j09VarA0 = ynb.a0(b.c(tm7.o(oa7.E(g09Var, y6cVarB), ((e8b) l46Var.k(l8b.a)).v, g21.f), false, null, null, x16Var, 15), 20.0f, 4.0f);
            mue mueVar = pue.a;
            nte.b(str, j09VarA0, abg.d(4061336340L), 0L, null, null, 0L, null, null, 0L, 0, false, 1, 0, null, pue.i(l46Var), l46Var, (i4 & 14) | 384, 24576, 114680);
            j09Var2 = g09Var;
        } else {
            l46Var.Z();
            j09Var2 = j09Var;
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new ysa(str, x16Var, j09Var2, i2, 0);
        }
    }

    public static final void c(int i2, l46 l46Var, j09 j09Var, String str) {
        j09 j09Var2;
        str.getClass();
        l46Var.h0(-1152540993);
        int i3 = (l46Var.g(str) ? 4 : 2) | i2 | 48;
        int i4 = 0;
        if (l46Var.W(i3 & 1, (i3 & 19) != 18)) {
            t7c t7cVarA = s7c.a(new uc0(4.0f, true, new qc0(i4)), ndb.z, l46Var, 54);
            int iHashCode = Long.hashCode(l46Var.T);
            u8a u8aVarM = l46Var.m();
            j09Var2 = g09.a;
            j09 j09VarJ = m93.J(l46Var, j09Var2);
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
            gu6.b(od4.A(R.drawable.ic_premium_card_check_16, 0, l46Var), null, androidx.compose.foundation.layout.b.l(j09Var2, 16.0f), ((e8b) l46Var.k(l8b.a)).v, l46Var, 440, 0);
            d(i3 & 14, l46Var, null, str);
            l46Var.r(true);
        } else {
            l46Var.Z();
            j09Var2 = j09Var;
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new p8(str, j09Var2, i2, 9);
        }
    }

    public static final void d(int i2, l46 l46Var, j09 j09Var, String str) {
        int i3;
        j09 j09Var2;
        str.getClass();
        l46Var.h0(-189964667);
        if ((i2 & 6) == 0) {
            i3 = i2 | (l46Var.g(str) ? 4 : 2);
        } else {
            i3 = i2;
        }
        int i4 = i3 | 48;
        if (l46Var.W(i4 & 1, (i4 & 19) != 18)) {
            mue mueVar = oue.a;
            mue mueVarG = pue.g(l46Var);
            long j2 = ((e8b) l46Var.k(l8b.a)).v;
            int i5 = i4 & 126;
            g09 g09Var = g09.a;
            nte.b(str, g09Var, j2, 0L, null, null, 0L, null, null, 0L, 2, false, 1, 0, null, mueVarG, l46Var, i5, 24960, 110584);
            j09Var2 = g09Var;
        } else {
            l46Var.Z();
            j09Var2 = j09Var;
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new o43(str, j09Var2, i2, 5, (byte) 0);
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0233  */
    /* JADX WARN: Code duplicated, block: B:102:0x0245  */
    /* JADX WARN: Code duplicated, block: B:104:0x024b  */
    /* JADX WARN: Code duplicated, block: B:107:0x02ac A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:108:0x02ae  */
    /* JADX WARN: Code duplicated, block: B:111:0x02db  */
    /* JADX WARN: Code duplicated, block: B:113:0x02f0  */
    /* JADX WARN: Code duplicated, block: B:116:0x02fc  */
    /* JADX WARN: Code duplicated, block: B:118:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:33:0x0059  */
    /* JADX WARN: Code duplicated, block: B:35:0x005e  */
    /* JADX WARN: Code duplicated, block: B:37:0x0062  */
    /* JADX WARN: Code duplicated, block: B:39:0x006a  */
    /* JADX WARN: Code duplicated, block: B:40:0x006d  */
    /* JADX WARN: Code duplicated, block: B:44:0x0076  */
    /* JADX WARN: Code duplicated, block: B:46:0x007b  */
    /* JADX WARN: Code duplicated, block: B:48:0x007f  */
    /* JADX WARN: Code duplicated, block: B:50:0x0087  */
    /* JADX WARN: Code duplicated, block: B:51:0x0089  */
    /* JADX WARN: Code duplicated, block: B:55:0x0097  */
    /* JADX WARN: Code duplicated, block: B:56:0x0099  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:60:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:69:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d0 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:73:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:76:0x00f0 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:77:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:80:0x010d  */
    /* JADX WARN: Code duplicated, block: B:81:0x0110  */
    /* JADX WARN: Code duplicated, block: B:84:0x011a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:85:0x011c  */
    /* JADX WARN: Code duplicated, block: B:88:0x014d  */
    /* JADX WARN: Code duplicated, block: B:89:0x014f  */
    /* JADX WARN: Code duplicated, block: B:92:0x0157 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:93:0x0159  */
    /* JADX WARN: Code duplicated, block: B:96:0x0196  */
    /* JADX WARN: Code duplicated, block: B:97:0x019c  */
    public static final void e(j09 j09Var, eh4 eh4Var, boolean z, int i2, a26 a26Var, l46 l46Var, int i3, int i4) {
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
        Object objR;
        i8c i8cVar;
        aw2 aw2Var;
        int size;
        boolean zE;
        Object objR2;
        cs3 cs3VarB;
        hzc hzcVar;
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
        int iJ;
        boolean zI;
        Object objR6;
        l46 l46Var2 = l46Var;
        ArrayList arrayList = eh4Var.c;
        l46Var2.h0(522889577);
        if ((i3 & 6) == 0) {
            i5 = (l46Var2.g(j09Var) ? 4 : 2) | i3;
        } else {
            i5 = i3;
        }
        if ((i3 & 48) == 0) {
            i5 |= (i3 & 64) == 0 ? l46Var2.g(eh4Var) : l46Var2.i(eh4Var) ? 32 : 16;
        }
        int i15 = i4 & 4;
        if (i15 == 0) {
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
                        if (i15 != 0) {
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
                        objR = l46Var2.R();
                        i8cVar = sf2.a;
                        if (objR == i8cVar) {
                            objR = af1.E(l46Var2);
                            l46Var2.p0(objR);
                        }
                        aw2Var = (aw2) objR;
                        size = arrayList.size();
                        zE = l46Var2.e(size);
                        objR2 = l46Var2.R();
                        if (zE || objR2 == i8cVar) {
                            objR2 = new a12(size, i11);
                            l46Var2.p0(objR2);
                        }
                        cs3VarB = ay9.b(i13, (i5 >> 9) & 14, 2, (x16) objR2, l46Var2);
                        hzcVar = cs3VarB.d;
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
                            objR4 = new wg4(aw2Var, a26Var2, cs3VarB, 0);
                            l46Var2.p0(objR4);
                        }
                        cs3VarL = m93.L(x16Var, (a26) objR4, i13, l46Var2, (i5 >> 3) & 896, 0);
                        int i16 = i13;
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
                            objR5 = new yg4(size, null, a26Var2, cs3VarL);
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
                        d8c.b(androidx.compose.foundation.layout.b.d(androidx.compose.foundation.layout.b.c(g09Var, 1.0f), 220.0f), null, ynb.q(0.0f, 8.0f, 1), af1.b0(-713725150, new w7(16, eh4Var, cs3VarL), l46Var2), l46Var, 3462, 2);
                        l46Var2 = l46Var;
                        a26 a26Var4 = a26Var2;
                        cn1.h(0.0f, 0, 100663296, 16126, null, af1.b0(-1731318304, new wt(1, eh4Var), l46Var2), l46Var2, null, null, null, null, null, cs3VarB, null, null, false);
                        if (z5) {
                            l46Var2.f0(-197217915);
                            if (((sz9) hzcVar.c).j() + 1 >= size) {
                                iJ = 0;
                            } else {
                                iJ = ((sz9) hzcVar.c).j() + 1;
                            }
                            j09 j09VarC = androidx.compose.foundation.layout.b.c(g09Var, 1.0f);
                            String strR = afc.r(R.string.annual_view_fortune_about_domain, new Object[]{((o8e) arrayList.get(iJ)).c}, l46Var2);
                            bx9 bx9Var = v51.a;
                            pr4 pr4Var = l8b.a;
                            u51 u51VarA = v51.a(((e8b) l46Var2.k(pr4Var)).m, ((e8b) l46Var2.k(pr4Var)).q, 0L, 0L, l46Var, 12);
                            zI = l46Var.i(aw2Var) | l46Var.g(cs3VarL) | l46Var.g(ghcVarT);
                            objR6 = l46Var.R();
                            if (zI || objR6 == i8cVar) {
                                objR6 = new xg4(aw2Var, cs3VarL, ghcVarT, 0);
                                l46Var.p0(objR6);
                            }
                            c8b.i(j09VarC, strR, null, null, 0L, 0.0f, false, null, u51VarA, false, null, null, (x16) objR6, l46Var, 6, 0, 3836);
                            l46Var2 = l46Var;
                            l46Var2.r(false);
                        } else {
                            l46Var2.f0(-196574045);
                            l46Var2.r(false);
                        }
                        l46Var2.r(true);
                        z4 = z5;
                        i12 = i16;
                        a26Var3 = a26Var4;
                    } else {
                        l46Var2.Z();
                        z4 = z2;
                        i12 = i7;
                        a26Var3 = a26Var2;
                    }
                    ojbVarV = l46Var2.v();
                    if (ojbVarV != null) {
                        ojbVarV.d = new bb4(j09Var, eh4Var, z4, i12, a26Var3, i3, i4, 1);
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
                    if (i15 != 0) {
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
                    objR = l46Var2.R();
                    i8cVar = sf2.a;
                    if (objR == i8cVar) {
                        objR = af1.E(l46Var2);
                        l46Var2.p0(objR);
                    }
                    aw2Var = (aw2) objR;
                    size = arrayList.size();
                    zE = l46Var2.e(size);
                    objR2 = l46Var2.R();
                    if (zE) {
                        objR2 = new a12(size, i11);
                        l46Var2.p0(objR2);
                    } else {
                        objR2 = new a12(size, i11);
                        l46Var2.p0(objR2);
                    }
                    cs3VarB = ay9.b(i13, (i5 >> 9) & 14, 2, (x16) objR2, l46Var2);
                    hzcVar = cs3VarB.d;
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
                        objR4 = new wg4(aw2Var, a26Var2, cs3VarB, 0);
                        l46Var2.p0(objR4);
                    } else {
                        objR4 = new wg4(aw2Var, a26Var2, cs3VarB, 0);
                        l46Var2.p0(objR4);
                    }
                    cs3VarL = m93.L(x16Var2, (a26) objR4, i13, l46Var2, (i5 >> 3) & 896, 0);
                    int i17 = i13;
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
                        objR5 = new yg4(size, null, a26Var2, cs3VarL);
                        l46Var2.p0(objR5);
                    } else {
                        objR5 = new yg4(size, null, a26Var2, cs3VarL);
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
                    d8c.b(androidx.compose.foundation.layout.b.d(androidx.compose.foundation.layout.b.c(g09Var, 1.0f), 220.0f), null, ynb.q(0.0f, 8.0f, 1), af1.b0(-713725150, new w7(16, eh4Var, cs3VarL), l46Var2), l46Var, 3462, 2);
                    l46Var2 = l46Var;
                    a26 a26Var5 = a26Var2;
                    cn1.h(0.0f, 0, 100663296, 16126, null, af1.b0(-1731318304, new wt(1, eh4Var), l46Var2), l46Var2, null, null, null, null, null, cs3VarB, null, null, false);
                    if (z5) {
                        l46Var2.f0(-197217915);
                        if (((sz9) hzcVar.c).j() + 1 >= size) {
                            iJ = 0;
                        } else {
                            iJ = ((sz9) hzcVar.c).j() + 1;
                        }
                        j09 j09VarC2 = androidx.compose.foundation.layout.b.c(g09Var, 1.0f);
                        String strR2 = afc.r(R.string.annual_view_fortune_about_domain, new Object[]{((o8e) arrayList.get(iJ)).c}, l46Var2);
                        bx9 bx9Var2 = v51.a;
                        pr4 pr4Var2 = l8b.a;
                        u51 u51VarA2 = v51.a(((e8b) l46Var2.k(pr4Var2)).m, ((e8b) l46Var2.k(pr4Var2)).q, 0L, 0L, l46Var, 12);
                        zI = l46Var.i(aw2Var) | l46Var.g(cs3VarL) | l46Var.g(ghcVarT);
                        objR6 = l46Var.R();
                        if (zI) {
                            objR6 = new xg4(aw2Var, cs3VarL, ghcVarT, 0);
                            l46Var.p0(objR6);
                        } else {
                            objR6 = new xg4(aw2Var, cs3VarL, ghcVarT, 0);
                            l46Var.p0(objR6);
                        }
                        c8b.i(j09VarC2, strR2, null, null, 0L, 0.0f, false, null, u51VarA2, false, null, null, (x16) objR6, l46Var, 6, 0, 3836);
                        l46Var2 = l46Var;
                        l46Var2.r(false);
                    } else {
                        l46Var2.f0(-196574045);
                        l46Var2.r(false);
                    }
                    l46Var2.r(true);
                    z4 = z5;
                    i12 = i17;
                    a26Var3 = a26Var5;
                } else {
                    l46Var2.Z();
                    z4 = z2;
                    i12 = i7;
                    a26Var3 = a26Var2;
                }
                ojbVarV = l46Var2.v();
                if (ojbVarV != null) {
                    ojbVarV.d = new bb4(j09Var, eh4Var, z4, i12, a26Var3, i3, i4, 1);
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
                    if (i15 != 0) {
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
                    objR = l46Var2.R();
                    i8cVar = sf2.a;
                    if (objR == i8cVar) {
                        objR = af1.E(l46Var2);
                        l46Var2.p0(objR);
                    }
                    aw2Var = (aw2) objR;
                    size = arrayList.size();
                    zE = l46Var2.e(size);
                    objR2 = l46Var2.R();
                    if (zE) {
                        objR2 = new a12(size, i11);
                        l46Var2.p0(objR2);
                    } else {
                        objR2 = new a12(size, i11);
                        l46Var2.p0(objR2);
                    }
                    cs3VarB = ay9.b(i13, (i5 >> 9) & 14, 2, (x16) objR2, l46Var2);
                    hzcVar = cs3VarB.d;
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
                        objR4 = new wg4(aw2Var, a26Var2, cs3VarB, 0);
                        l46Var2.p0(objR4);
                    } else {
                        objR4 = new wg4(aw2Var, a26Var2, cs3VarB, 0);
                        l46Var2.p0(objR4);
                    }
                    cs3VarL = m93.L(x16Var3, (a26) objR4, i13, l46Var2, (i5 >> 3) & 896, 0);
                    int i18 = i13;
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
                        objR5 = new yg4(size, null, a26Var2, cs3VarL);
                        l46Var2.p0(objR5);
                    } else {
                        objR5 = new yg4(size, null, a26Var2, cs3VarL);
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
                    d8c.b(androidx.compose.foundation.layout.b.d(androidx.compose.foundation.layout.b.c(g09Var, 1.0f), 220.0f), null, ynb.q(0.0f, 8.0f, 1), af1.b0(-713725150, new w7(16, eh4Var, cs3VarL), l46Var2), l46Var, 3462, 2);
                    l46Var2 = l46Var;
                    a26 a26Var6 = a26Var2;
                    cn1.h(0.0f, 0, 100663296, 16126, null, af1.b0(-1731318304, new wt(1, eh4Var), l46Var2), l46Var2, null, null, null, null, null, cs3VarB, null, null, false);
                    if (z5) {
                        l46Var2.f0(-197217915);
                        if (((sz9) hzcVar.c).j() + 1 >= size) {
                            iJ = 0;
                        } else {
                            iJ = ((sz9) hzcVar.c).j() + 1;
                        }
                        j09 j09VarC3 = androidx.compose.foundation.layout.b.c(g09Var, 1.0f);
                        String strR3 = afc.r(R.string.annual_view_fortune_about_domain, new Object[]{((o8e) arrayList.get(iJ)).c}, l46Var2);
                        bx9 bx9Var3 = v51.a;
                        pr4 pr4Var3 = l8b.a;
                        u51 u51VarA3 = v51.a(((e8b) l46Var2.k(pr4Var3)).m, ((e8b) l46Var2.k(pr4Var3)).q, 0L, 0L, l46Var, 12);
                        zI = l46Var.i(aw2Var) | l46Var.g(cs3VarL) | l46Var.g(ghcVarT);
                        objR6 = l46Var.R();
                        if (zI) {
                            objR6 = new xg4(aw2Var, cs3VarL, ghcVarT, 0);
                            l46Var.p0(objR6);
                        } else {
                            objR6 = new xg4(aw2Var, cs3VarL, ghcVarT, 0);
                            l46Var.p0(objR6);
                        }
                        c8b.i(j09VarC3, strR3, null, null, 0L, 0.0f, false, null, u51VarA3, false, null, null, (x16) objR6, l46Var, 6, 0, 3836);
                        l46Var2 = l46Var;
                        l46Var2.r(false);
                    } else {
                        l46Var2.f0(-196574045);
                        l46Var2.r(false);
                    }
                    l46Var2.r(true);
                    z4 = z5;
                    i12 = i18;
                    a26Var3 = a26Var6;
                } else {
                    l46Var2.Z();
                    z4 = z2;
                    i12 = i7;
                    a26Var3 = a26Var2;
                }
                ojbVarV = l46Var2.v();
                if (ojbVarV != null) {
                    ojbVarV.d = new bb4(j09Var, eh4Var, z4, i12, a26Var3, i3, i4, 1);
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
                if (i15 != 0) {
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
                objR = l46Var2.R();
                i8cVar = sf2.a;
                if (objR == i8cVar) {
                    objR = af1.E(l46Var2);
                    l46Var2.p0(objR);
                }
                aw2Var = (aw2) objR;
                size = arrayList.size();
                zE = l46Var2.e(size);
                objR2 = l46Var2.R();
                if (zE) {
                    objR2 = new a12(size, i11);
                    l46Var2.p0(objR2);
                } else {
                    objR2 = new a12(size, i11);
                    l46Var2.p0(objR2);
                }
                cs3VarB = ay9.b(i13, (i5 >> 9) & 14, 2, (x16) objR2, l46Var2);
                hzcVar = cs3VarB.d;
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
                    objR4 = new wg4(aw2Var, a26Var2, cs3VarB, 0);
                    l46Var2.p0(objR4);
                } else {
                    objR4 = new wg4(aw2Var, a26Var2, cs3VarB, 0);
                    l46Var2.p0(objR4);
                }
                cs3VarL = m93.L(x16Var4, (a26) objR4, i13, l46Var2, (i5 >> 3) & 896, 0);
                int i19 = i13;
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
                    objR5 = new yg4(size, null, a26Var2, cs3VarL);
                    l46Var2.p0(objR5);
                } else {
                    objR5 = new yg4(size, null, a26Var2, cs3VarL);
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
                d8c.b(androidx.compose.foundation.layout.b.d(androidx.compose.foundation.layout.b.c(g09Var, 1.0f), 220.0f), null, ynb.q(0.0f, 8.0f, 1), af1.b0(-713725150, new w7(16, eh4Var, cs3VarL), l46Var2), l46Var, 3462, 2);
                l46Var2 = l46Var;
                a26 a26Var7 = a26Var2;
                cn1.h(0.0f, 0, 100663296, 16126, null, af1.b0(-1731318304, new wt(1, eh4Var), l46Var2), l46Var2, null, null, null, null, null, cs3VarB, null, null, false);
                if (z5) {
                    l46Var2.f0(-197217915);
                    if (((sz9) hzcVar.c).j() + 1 >= size) {
                        iJ = 0;
                    } else {
                        iJ = ((sz9) hzcVar.c).j() + 1;
                    }
                    j09 j09VarC4 = androidx.compose.foundation.layout.b.c(g09Var, 1.0f);
                    String strR4 = afc.r(R.string.annual_view_fortune_about_domain, new Object[]{((o8e) arrayList.get(iJ)).c}, l46Var2);
                    bx9 bx9Var4 = v51.a;
                    pr4 pr4Var4 = l8b.a;
                    u51 u51VarA4 = v51.a(((e8b) l46Var2.k(pr4Var4)).m, ((e8b) l46Var2.k(pr4Var4)).q, 0L, 0L, l46Var, 12);
                    zI = l46Var.i(aw2Var) | l46Var.g(cs3VarL) | l46Var.g(ghcVarT);
                    objR6 = l46Var.R();
                    if (zI) {
                        objR6 = new xg4(aw2Var, cs3VarL, ghcVarT, 0);
                        l46Var.p0(objR6);
                    } else {
                        objR6 = new xg4(aw2Var, cs3VarL, ghcVarT, 0);
                        l46Var.p0(objR6);
                    }
                    c8b.i(j09VarC4, strR4, null, null, 0L, 0.0f, false, null, u51VarA4, false, null, null, (x16) objR6, l46Var, 6, 0, 3836);
                    l46Var2 = l46Var;
                    l46Var2.r(false);
                } else {
                    l46Var2.f0(-196574045);
                    l46Var2.r(false);
                }
                l46Var2.r(true);
                z4 = z5;
                i12 = i19;
                a26Var3 = a26Var7;
            } else {
                l46Var2.Z();
                z4 = z2;
                i12 = i7;
                a26Var3 = a26Var2;
            }
            ojbVarV = l46Var2.v();
            if (ojbVarV != null) {
                ojbVarV.d = new bb4(j09Var, eh4Var, z4, i12, a26Var3, i3, i4, 1);
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
                    if (i15 != 0) {
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
                    objR = l46Var2.R();
                    i8cVar = sf2.a;
                    if (objR == i8cVar) {
                        objR = af1.E(l46Var2);
                        l46Var2.p0(objR);
                    }
                    aw2Var = (aw2) objR;
                    size = arrayList.size();
                    zE = l46Var2.e(size);
                    objR2 = l46Var2.R();
                    if (zE) {
                        objR2 = new a12(size, i11);
                        l46Var2.p0(objR2);
                    } else {
                        objR2 = new a12(size, i11);
                        l46Var2.p0(objR2);
                    }
                    cs3VarB = ay9.b(i13, (i5 >> 9) & 14, 2, (x16) objR2, l46Var2);
                    hzcVar = cs3VarB.d;
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
                        objR4 = new wg4(aw2Var, a26Var2, cs3VarB, 0);
                        l46Var2.p0(objR4);
                    } else {
                        objR4 = new wg4(aw2Var, a26Var2, cs3VarB, 0);
                        l46Var2.p0(objR4);
                    }
                    cs3VarL = m93.L(x16Var5, (a26) objR4, i13, l46Var2, (i5 >> 3) & 896, 0);
                    int i110 = i13;
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
                        objR5 = new yg4(size, null, a26Var2, cs3VarL);
                        l46Var2.p0(objR5);
                    } else {
                        objR5 = new yg4(size, null, a26Var2, cs3VarL);
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
                    d8c.b(androidx.compose.foundation.layout.b.d(androidx.compose.foundation.layout.b.c(g09Var, 1.0f), 220.0f), null, ynb.q(0.0f, 8.0f, 1), af1.b0(-713725150, new w7(16, eh4Var, cs3VarL), l46Var2), l46Var, 3462, 2);
                    l46Var2 = l46Var;
                    a26 a26Var8 = a26Var2;
                    cn1.h(0.0f, 0, 100663296, 16126, null, af1.b0(-1731318304, new wt(1, eh4Var), l46Var2), l46Var2, null, null, null, null, null, cs3VarB, null, null, false);
                    if (z5) {
                        l46Var2.f0(-197217915);
                        if (((sz9) hzcVar.c).j() + 1 >= size) {
                            iJ = 0;
                        } else {
                            iJ = ((sz9) hzcVar.c).j() + 1;
                        }
                        j09 j09VarC5 = androidx.compose.foundation.layout.b.c(g09Var, 1.0f);
                        String strR5 = afc.r(R.string.annual_view_fortune_about_domain, new Object[]{((o8e) arrayList.get(iJ)).c}, l46Var2);
                        bx9 bx9Var5 = v51.a;
                        pr4 pr4Var5 = l8b.a;
                        u51 u51VarA5 = v51.a(((e8b) l46Var2.k(pr4Var5)).m, ((e8b) l46Var2.k(pr4Var5)).q, 0L, 0L, l46Var, 12);
                        zI = l46Var.i(aw2Var) | l46Var.g(cs3VarL) | l46Var.g(ghcVarT);
                        objR6 = l46Var.R();
                        if (zI) {
                            objR6 = new xg4(aw2Var, cs3VarL, ghcVarT, 0);
                            l46Var.p0(objR6);
                        } else {
                            objR6 = new xg4(aw2Var, cs3VarL, ghcVarT, 0);
                            l46Var.p0(objR6);
                        }
                        c8b.i(j09VarC5, strR5, null, null, 0L, 0.0f, false, null, u51VarA5, false, null, null, (x16) objR6, l46Var, 6, 0, 3836);
                        l46Var2 = l46Var;
                        l46Var2.r(false);
                    } else {
                        l46Var2.f0(-196574045);
                        l46Var2.r(false);
                    }
                    l46Var2.r(true);
                    z4 = z5;
                    i12 = i110;
                    a26Var3 = a26Var8;
                } else {
                    l46Var2.Z();
                    z4 = z2;
                    i12 = i7;
                    a26Var3 = a26Var2;
                }
                ojbVarV = l46Var2.v();
                if (ojbVarV != null) {
                    ojbVarV.d = new bb4(j09Var, eh4Var, z4, i12, a26Var3, i3, i4, 1);
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
                if (i15 != 0) {
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
                objR = l46Var2.R();
                i8cVar = sf2.a;
                if (objR == i8cVar) {
                    objR = af1.E(l46Var2);
                    l46Var2.p0(objR);
                }
                aw2Var = (aw2) objR;
                size = arrayList.size();
                zE = l46Var2.e(size);
                objR2 = l46Var2.R();
                if (zE) {
                    objR2 = new a12(size, i11);
                    l46Var2.p0(objR2);
                } else {
                    objR2 = new a12(size, i11);
                    l46Var2.p0(objR2);
                }
                cs3VarB = ay9.b(i13, (i5 >> 9) & 14, 2, (x16) objR2, l46Var2);
                hzcVar = cs3VarB.d;
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
                    objR4 = new wg4(aw2Var, a26Var2, cs3VarB, 0);
                    l46Var2.p0(objR4);
                } else {
                    objR4 = new wg4(aw2Var, a26Var2, cs3VarB, 0);
                    l46Var2.p0(objR4);
                }
                cs3VarL = m93.L(x16Var6, (a26) objR4, i13, l46Var2, (i5 >> 3) & 896, 0);
                int i111 = i13;
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
                    objR5 = new yg4(size, null, a26Var2, cs3VarL);
                    l46Var2.p0(objR5);
                } else {
                    objR5 = new yg4(size, null, a26Var2, cs3VarL);
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
                d8c.b(androidx.compose.foundation.layout.b.d(androidx.compose.foundation.layout.b.c(g09Var, 1.0f), 220.0f), null, ynb.q(0.0f, 8.0f, 1), af1.b0(-713725150, new w7(16, eh4Var, cs3VarL), l46Var2), l46Var, 3462, 2);
                l46Var2 = l46Var;
                a26 a26Var9 = a26Var2;
                cn1.h(0.0f, 0, 100663296, 16126, null, af1.b0(-1731318304, new wt(1, eh4Var), l46Var2), l46Var2, null, null, null, null, null, cs3VarB, null, null, false);
                if (z5) {
                    l46Var2.f0(-197217915);
                    if (((sz9) hzcVar.c).j() + 1 >= size) {
                        iJ = 0;
                    } else {
                        iJ = ((sz9) hzcVar.c).j() + 1;
                    }
                    j09 j09VarC6 = androidx.compose.foundation.layout.b.c(g09Var, 1.0f);
                    String strR6 = afc.r(R.string.annual_view_fortune_about_domain, new Object[]{((o8e) arrayList.get(iJ)).c}, l46Var2);
                    bx9 bx9Var6 = v51.a;
                    pr4 pr4Var6 = l8b.a;
                    u51 u51VarA6 = v51.a(((e8b) l46Var2.k(pr4Var6)).m, ((e8b) l46Var2.k(pr4Var6)).q, 0L, 0L, l46Var, 12);
                    zI = l46Var.i(aw2Var) | l46Var.g(cs3VarL) | l46Var.g(ghcVarT);
                    objR6 = l46Var.R();
                    if (zI) {
                        objR6 = new xg4(aw2Var, cs3VarL, ghcVarT, 0);
                        l46Var.p0(objR6);
                    } else {
                        objR6 = new xg4(aw2Var, cs3VarL, ghcVarT, 0);
                        l46Var.p0(objR6);
                    }
                    c8b.i(j09VarC6, strR6, null, null, 0L, 0.0f, false, null, u51VarA6, false, null, null, (x16) objR6, l46Var, 6, 0, 3836);
                    l46Var2 = l46Var;
                    l46Var2.r(false);
                } else {
                    l46Var2.f0(-196574045);
                    l46Var2.r(false);
                }
                l46Var2.r(true);
                z4 = z5;
                i12 = i111;
                a26Var3 = a26Var9;
            } else {
                l46Var2.Z();
                z4 = z2;
                i12 = i7;
                a26Var3 = a26Var2;
            }
            ojbVarV = l46Var2.v();
            if (ojbVarV != null) {
                ojbVarV.d = new bb4(j09Var, eh4Var, z4, i12, a26Var3, i3, i4, 1);
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
                if (i15 != 0) {
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
                objR = l46Var2.R();
                i8cVar = sf2.a;
                if (objR == i8cVar) {
                    objR = af1.E(l46Var2);
                    l46Var2.p0(objR);
                }
                aw2Var = (aw2) objR;
                size = arrayList.size();
                zE = l46Var2.e(size);
                objR2 = l46Var2.R();
                if (zE) {
                    objR2 = new a12(size, i11);
                    l46Var2.p0(objR2);
                } else {
                    objR2 = new a12(size, i11);
                    l46Var2.p0(objR2);
                }
                cs3VarB = ay9.b(i13, (i5 >> 9) & 14, 2, (x16) objR2, l46Var2);
                hzcVar = cs3VarB.d;
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
                    objR4 = new wg4(aw2Var, a26Var2, cs3VarB, 0);
                    l46Var2.p0(objR4);
                } else {
                    objR4 = new wg4(aw2Var, a26Var2, cs3VarB, 0);
                    l46Var2.p0(objR4);
                }
                cs3VarL = m93.L(x16Var7, (a26) objR4, i13, l46Var2, (i5 >> 3) & 896, 0);
                int i112 = i13;
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
                    objR5 = new yg4(size, null, a26Var2, cs3VarL);
                    l46Var2.p0(objR5);
                } else {
                    objR5 = new yg4(size, null, a26Var2, cs3VarL);
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
                d8c.b(androidx.compose.foundation.layout.b.d(androidx.compose.foundation.layout.b.c(g09Var, 1.0f), 220.0f), null, ynb.q(0.0f, 8.0f, 1), af1.b0(-713725150, new w7(16, eh4Var, cs3VarL), l46Var2), l46Var, 3462, 2);
                l46Var2 = l46Var;
                a26 a26Var10 = a26Var2;
                cn1.h(0.0f, 0, 100663296, 16126, null, af1.b0(-1731318304, new wt(1, eh4Var), l46Var2), l46Var2, null, null, null, null, null, cs3VarB, null, null, false);
                if (z5) {
                    l46Var2.f0(-197217915);
                    if (((sz9) hzcVar.c).j() + 1 >= size) {
                        iJ = 0;
                    } else {
                        iJ = ((sz9) hzcVar.c).j() + 1;
                    }
                    j09 j09VarC7 = androidx.compose.foundation.layout.b.c(g09Var, 1.0f);
                    String strR7 = afc.r(R.string.annual_view_fortune_about_domain, new Object[]{((o8e) arrayList.get(iJ)).c}, l46Var2);
                    bx9 bx9Var7 = v51.a;
                    pr4 pr4Var7 = l8b.a;
                    u51 u51VarA7 = v51.a(((e8b) l46Var2.k(pr4Var7)).m, ((e8b) l46Var2.k(pr4Var7)).q, 0L, 0L, l46Var, 12);
                    zI = l46Var.i(aw2Var) | l46Var.g(cs3VarL) | l46Var.g(ghcVarT);
                    objR6 = l46Var.R();
                    if (zI) {
                        objR6 = new xg4(aw2Var, cs3VarL, ghcVarT, 0);
                        l46Var.p0(objR6);
                    } else {
                        objR6 = new xg4(aw2Var, cs3VarL, ghcVarT, 0);
                        l46Var.p0(objR6);
                    }
                    c8b.i(j09VarC7, strR7, null, null, 0L, 0.0f, false, null, u51VarA7, false, null, null, (x16) objR6, l46Var, 6, 0, 3836);
                    l46Var2 = l46Var;
                    l46Var2.r(false);
                } else {
                    l46Var2.f0(-196574045);
                    l46Var2.r(false);
                }
                l46Var2.r(true);
                z4 = z5;
                i12 = i112;
                a26Var3 = a26Var10;
            } else {
                l46Var2.Z();
                z4 = z2;
                i12 = i7;
                a26Var3 = a26Var2;
            }
            ojbVarV = l46Var2.v();
            if (ojbVarV != null) {
                ojbVarV.d = new bb4(j09Var, eh4Var, z4, i12, a26Var3, i3, i4, 1);
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
            if (i15 != 0) {
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
            objR = l46Var2.R();
            i8cVar = sf2.a;
            if (objR == i8cVar) {
                objR = af1.E(l46Var2);
                l46Var2.p0(objR);
            }
            aw2Var = (aw2) objR;
            size = arrayList.size();
            zE = l46Var2.e(size);
            objR2 = l46Var2.R();
            if (zE) {
                objR2 = new a12(size, i11);
                l46Var2.p0(objR2);
            } else {
                objR2 = new a12(size, i11);
                l46Var2.p0(objR2);
            }
            cs3VarB = ay9.b(i13, (i5 >> 9) & 14, 2, (x16) objR2, l46Var2);
            hzcVar = cs3VarB.d;
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
                objR4 = new wg4(aw2Var, a26Var2, cs3VarB, 0);
                l46Var2.p0(objR4);
            } else {
                objR4 = new wg4(aw2Var, a26Var2, cs3VarB, 0);
                l46Var2.p0(objR4);
            }
            cs3VarL = m93.L(x16Var8, (a26) objR4, i13, l46Var2, (i5 >> 3) & 896, 0);
            int i113 = i13;
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
                objR5 = new yg4(size, null, a26Var2, cs3VarL);
                l46Var2.p0(objR5);
            } else {
                objR5 = new yg4(size, null, a26Var2, cs3VarL);
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
            d8c.b(androidx.compose.foundation.layout.b.d(androidx.compose.foundation.layout.b.c(g09Var, 1.0f), 220.0f), null, ynb.q(0.0f, 8.0f, 1), af1.b0(-713725150, new w7(16, eh4Var, cs3VarL), l46Var2), l46Var, 3462, 2);
            l46Var2 = l46Var;
            a26 a26Var11 = a26Var2;
            cn1.h(0.0f, 0, 100663296, 16126, null, af1.b0(-1731318304, new wt(1, eh4Var), l46Var2), l46Var2, null, null, null, null, null, cs3VarB, null, null, false);
            if (z5) {
                l46Var2.f0(-197217915);
                if (((sz9) hzcVar.c).j() + 1 >= size) {
                    iJ = 0;
                } else {
                    iJ = ((sz9) hzcVar.c).j() + 1;
                }
                j09 j09VarC8 = androidx.compose.foundation.layout.b.c(g09Var, 1.0f);
                String strR8 = afc.r(R.string.annual_view_fortune_about_domain, new Object[]{((o8e) arrayList.get(iJ)).c}, l46Var2);
                bx9 bx9Var8 = v51.a;
                pr4 pr4Var8 = l8b.a;
                u51 u51VarA8 = v51.a(((e8b) l46Var2.k(pr4Var8)).m, ((e8b) l46Var2.k(pr4Var8)).q, 0L, 0L, l46Var, 12);
                zI = l46Var.i(aw2Var) | l46Var.g(cs3VarL) | l46Var.g(ghcVarT);
                objR6 = l46Var.R();
                if (zI) {
                    objR6 = new xg4(aw2Var, cs3VarL, ghcVarT, 0);
                    l46Var.p0(objR6);
                } else {
                    objR6 = new xg4(aw2Var, cs3VarL, ghcVarT, 0);
                    l46Var.p0(objR6);
                }
                c8b.i(j09VarC8, strR8, null, null, 0L, 0.0f, false, null, u51VarA8, false, null, null, (x16) objR6, l46Var, 6, 0, 3836);
                l46Var2 = l46Var;
                l46Var2.r(false);
            } else {
                l46Var2.f0(-196574045);
                l46Var2.r(false);
            }
            l46Var2.r(true);
            z4 = z5;
            i12 = i113;
            a26Var3 = a26Var11;
        } else {
            l46Var2.Z();
            z4 = z2;
            i12 = i7;
            a26Var3 = a26Var2;
        }
        ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new bb4(j09Var, eh4Var, z4, i12, a26Var3, i3, i4, 1);
        }
    }

    public static final void f(final boolean z, x16 x16Var, x16 x16Var2, x16 x16Var3, l46 l46Var, int i2) {
        int i3;
        x16 x16Var4;
        x16 x16Var5;
        x16 x16Var6;
        l46 l46Var2 = l46Var;
        x16Var.getClass();
        x16Var2.getClass();
        x16Var3.getClass();
        l46Var2.h0(-1771399774);
        if ((i2 & 6) == 0) {
            i3 = (l46Var2.h(z) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            x16Var4 = x16Var;
            i3 |= l46Var2.i(x16Var4) ? 32 : 16;
        } else {
            x16Var4 = x16Var;
        }
        if ((i2 & 384) == 0) {
            x16Var5 = x16Var2;
            i3 |= l46Var2.i(x16Var5) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        } else {
            x16Var5 = x16Var2;
        }
        if ((i2 & 3072) == 0) {
            x16Var6 = x16Var3;
            i3 |= l46Var2.i(x16Var6) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE;
        } else {
            x16Var6 = x16Var3;
        }
        int i4 = 0;
        if (l46Var2.W(i3 & 1, (i3 & 1171) != 1170)) {
            boolean z2 = (i3 & 14) == 4;
            Object objR = l46Var2.R();
            i8c i8cVar = sf2.a;
            if (z2 || objR == i8cVar) {
                objR = new x16() { // from class: qg4
                    @Override // defpackage.x16
                    public final Object invoke() {
                        return db6.A0(Boolean.valueOf(z));
                    }
                };
                l46Var2.p0(objR);
            }
            x16 x16Var7 = (x16) objR;
            pwf pwfVarA = qd8.a(l46Var2);
            if (pwfVarA == null) {
                qc0.p("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            e89 e89VarT = tm7.t(((ci4) z5c.G(job.a.b(ci4.class), pwfVarA.g(), null, b21.r(pwfVarA), kr7.b(l46Var2), x16Var7)).c, l46Var2);
            Object objR2 = l46Var2.R();
            if (objR2 == i8cVar) {
                objR2 = q1c.f(Boolean.FALSE);
                l46Var2.p0(objR2);
            }
            e89 e89Var = (e89) objR2;
            Object objR3 = l46Var2.R();
            if (objR3 == i8cVar) {
                objR3 = kv2.f(0, l46Var2);
            }
            s69 s69Var = (s69) objR3;
            fh4 fh4Var = (fh4) e89VarT.getValue();
            Object objR4 = l46Var2.R();
            if (objR4 == i8cVar) {
                objR4 = new sg4(s69Var, e89Var, i4);
                l46Var2.p0(objR4);
            }
            g(fh4Var, x16Var4, x16Var5, x16Var6, (a26) objR4, l46Var2, (i3 & 7168) | (i3 & 112) | 24584 | (i3 & 896));
            l46Var2 = l46Var2;
            fh4 fh4Var2 = (fh4) e89VarT.getValue();
            eh4 eh4Var = fh4Var2 instanceof eh4 ? (eh4) fh4Var2 : null;
            if (eh4Var != null) {
                l46Var2.f0(493275053);
                boolean zBooleanValue = ((Boolean) e89Var.getValue()).booleanValue();
                Object objR5 = l46Var2.R();
                if (objR5 == i8cVar) {
                    objR5 = new ok3(e89Var, 8);
                    l46Var2.p0(objR5);
                }
                od4.a(3504, af1.b0(1524624586, new w7(15, eh4Var, s69Var), l46Var2), (x16) objR5, l46Var2, "annual-domain-detail-share", zBooleanValue);
                l46Var2.r(false);
            } else {
                l46Var2.f0(493631584);
                l46Var2.r(false);
            }
        } else {
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new vg4(z, x16Var, x16Var2, x16Var3, i2, 0);
        }
    }

    public static final void g(fh4 fh4Var, x16 x16Var, x16 x16Var2, x16 x16Var3, a26 a26Var, l46 l46Var, int i2) {
        x16 x16Var4;
        l46Var.h0(1072334710);
        int i3 = 4;
        int i4 = (l46Var.i(fh4Var) ? 4 : 2) | i2;
        if ((i2 & 48) == 0) {
            x16Var4 = x16Var;
            i4 |= l46Var.i(x16Var4) ? 32 : 16;
        } else {
            x16Var4 = x16Var;
        }
        if ((i2 & 384) == 0) {
            i4 |= l46Var.i(x16Var2) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        if ((i2 & 3072) == 0) {
            i4 |= l46Var.i(x16Var3) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE;
        }
        if (l46Var.W(i4 & 1, (i4 & 9363) != 9362)) {
            Object[] objArr = new Object[0];
            Object objR = l46Var.R();
            if (objR == sf2.a) {
                objR = new v74(i3);
                l46Var.p0(objR);
            }
            rs0.f(androidx.compose.foundation.layout.b.c, false, af1.b0(1418676889, new qi3(x16Var4, fh4Var, a26Var, (s69) vfh.I(objArr, (x16) objR, l46Var, 48), x16Var2, x16Var3, 1), l46Var), l46Var, 390, 2);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new yb((Object) fh4Var, x16Var, (m26) x16Var2, (m26) x16Var3, (m26) a26Var, i2, 5);
        }
    }

    public static final void h(j09 j09Var, o29 o29Var, l46 l46Var, int i2) {
        int i3;
        l46 l46Var2 = l46Var;
        l46Var2.h0(-1210340059);
        if ((i2 & 6) == 0) {
            i3 = i2 | (l46Var2.g(j09Var) ? 4 : 2);
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= (i2 & 64) == 0 ? l46Var2.g(o29Var) : l46Var2.i(o29Var) ? 32 : 16;
        }
        int i4 = 0;
        int i5 = 1;
        if (l46Var2.W(i3 & 1, (i3 & 19) != 18)) {
            c92 c92VarA = a92.a(new uc0(16.0f, true, new qc0(i4)), ndb.Z, l46Var2, 54);
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
            String strQ = afc.q(R.string.annual_monthly_report, l46Var2);
            mue mueVar = pue.a;
            nte.b(strQ, null, ((e8b) l46Var2.k(l8b.a)).q, 0L, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, pue.n(l46Var2), l46Var, 0, 0, 131066);
            l46Var2 = l46Var;
            g09 g09Var = g09.a;
            d8c.b(androidx.compose.foundation.layout.b.r(androidx.compose.foundation.layout.b.c(g09Var, 1.0f)), null, null, af1.b0(-1163493812, new k29(o29Var, i5), l46Var2), l46Var2, 3078, 6);
            d8c.b(androidx.compose.foundation.layout.b.r(androidx.compose.foundation.layout.b.c(g09Var, 1.0f)), null, new bx9(12.0f, 12.0f, 12.0f, 12.0f), af1.b0(139003893, new k29(o29Var, 2), l46Var2), l46Var2, 3462, 2);
            d8c.b(androidx.compose.foundation.layout.b.r(androidx.compose.foundation.layout.b.c(g09Var, 1.0f)), null, new bx9(20.0f, 20.0f, 20.0f, 20.0f), af1.b0(-535062892, new k29(o29Var, 3), l46Var2), l46Var2, 3462, 2);
            tec.u(g09Var, 12.0f, l46Var2, true);
        } else {
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new k38(j09Var, o29Var, i2, 2);
        }
    }

    public static final void i(x16 x16Var, x16 x16Var2, l46 l46Var, int i2) {
        l46 l46Var2 = l46Var;
        x16Var.getClass();
        x16Var2.getClass();
        l46Var2.h0(-404273552);
        int i3 = (l46Var2.i(x16Var) ? 4 : 2) | i2 | (l46Var2.i(x16Var2) ? 32 : 16);
        int i4 = 0;
        if (l46Var2.W(i3 & 1, (i3 & 19) != 18)) {
            pwf pwfVarA = qd8.a(l46Var2);
            if (pwfVarA == null) {
                qc0.p("No ViewModelStoreOwner was provided via LocalViewModelStoreOwner");
                return;
            }
            e89 e89VarT = tm7.t(((w29) z5c.G(job.a.b(w29.class), pwfVarA.g(), null, b21.r(pwfVarA), kr7.b(l46Var2), null)).c, l46Var2);
            Object objR = l46Var2.R();
            i8c i8cVar = sf2.a;
            if (objR == i8cVar) {
                objR = q1c.f(Boolean.FALSE);
                l46Var2.p0(objR);
            }
            e89 e89Var = (e89) objR;
            p29 p29Var = (p29) e89VarT.getValue();
            Object objR2 = l46Var2.R();
            if (objR2 == i8cVar) {
                objR2 = new x08(e89Var, 7);
                l46Var2.p0(objR2);
            }
            int i5 = i3 << 3;
            j(p29Var, x16Var, x16Var2, (x16) objR2, l46Var2, (i5 & 112) | 3080 | (i5 & 896));
            l46Var2 = l46Var2;
            p29 p29Var2 = (p29) e89VarT.getValue();
            o29 o29Var = p29Var2 instanceof o29 ? (o29) p29Var2 : null;
            if (o29Var != null) {
                l46Var2.f0(-624526004);
                boolean zBooleanValue = ((Boolean) e89Var.getValue()).booleanValue();
                Object objR3 = l46Var2.R();
                if (objR3 == i8cVar) {
                    objR3 = new x08(e89Var, 8);
                    l46Var2.p0(objR3);
                }
                od4.a(3504, af1.b0(1389063752, new k29(o29Var, i4), l46Var2), (x16) objR3, l46Var2, "annual-monthly-summary-share", zBooleanValue);
                l46Var2.r(false);
            } else {
                l46Var2.f0(-624243470);
                l46Var2.r(false);
            }
        } else {
            l46Var2.Z();
        }
        ojb ojbVarV = l46Var2.v();
        if (ojbVarV != null) {
            ojbVarV.d = new b20(i2, 20, x16Var, x16Var2);
        }
    }

    public static final void j(p29 p29Var, x16 x16Var, x16 x16Var2, x16 x16Var3, l46 l46Var, int i2) {
        int i3;
        l46Var.h0(-1013700605);
        if ((i2 & 6) == 0) {
            i3 = ((i2 & 8) == 0 ? l46Var.g(p29Var) : l46Var.i(p29Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= l46Var.i(x16Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= l46Var.i(x16Var2) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS;
        }
        if ((i2 & 3072) == 0) {
            i3 |= l46Var.i(x16Var3) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE;
        }
        if (l46Var.W(i3 & 1, (i3 & 1171) != 1170)) {
            rs0.f(androidx.compose.foundation.layout.b.c, false, af1.b0(6025152, new sz7(x16Var, p29Var, x16Var3, x16Var2, 9), l46Var), l46Var, 390, 2);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new rb((Object) p29Var, x16Var, (Object) x16Var2, (Object) x16Var3, i2, 13);
        }
    }

    public static final void k(j09 j09Var, jaa jaaVar, x16 x16Var, x16 x16Var2, l46 l46Var, int i2) {
        jaaVar.getClass();
        x16Var.getClass();
        x16Var2.getClass();
        l46Var.h0(1647087934);
        int i3 = i2 | (l46Var.g(jaaVar) ? 32 : 16) | (l46Var.i(x16Var) ? 256 : UserMetadata.MAX_ROLLOUT_ASSIGNMENTS) | (l46Var.i(x16Var2) ? 2048 : UserMetadata.MAX_ATTRIBUTE_SIZE);
        if (l46Var.W(i3 & 1, (i3 & 1171) != 1170)) {
            bzd.d(j09Var, null, null, null, null, af1.b0(-579494224, new j41(jaaVar, x16Var2, x16Var, 5), l46Var), l46Var, 196614, 30);
        } else {
            l46Var.Z();
        }
        ojb ojbVarV = l46Var.v();
        if (ojbVarV != null) {
            ojbVarV.d = new q8(j09Var, jaaVar, x16Var, x16Var2, i2, 16);
        }
    }

    public static final ic0 l(tt7 tt7Var) {
        b7f b7fVar;
        b7f b7fVar2;
        tt7Var.getClass();
        if (tt7Var.k0() instanceof bj5) {
            ic0 ic0VarL = l(pa7.Z(tt7Var));
            ic0 ic0VarL2 = l(pa7.j0(tt7Var));
            return new ic0(q7c.p(rxg.E(pa7.Z((tt7) ic0VarL.a), pa7.j0((tt7) ic0VarL2.a)), tt7Var), q7c.p(rxg.E(pa7.Z((tt7) ic0VarL.b), pa7.j0((tt7) ic0VarL2.b)), tt7Var));
        }
        j7f j7fVarC0 = tt7Var.c0();
        boolean z = true;
        if (tt7Var.c0() instanceof bp1) {
            j7fVarC0.getClass();
            i8f i8fVarU = ((bp1) j7fVarC0).u();
            tt7 tt7VarB = i8fVarU.b();
            tt7VarB.getClass();
            tt7 tt7VarI = w8f.i(tt7VarB, tt7Var.i0());
            int iOrdinal = i8fVarU.a().ordinal();
            if (iOrdinal == 1) {
                return new ic0(tt7VarI, o7c.p(tt7Var).p());
            }
            if (iOrdinal == 2) {
                return new ic0(w8f.i(o7c.p(tt7Var).o(), tt7Var.i0()), tt7VarI);
            }
            ho7.t(i8fVarU, "Only nontrivial projections should have been captured, not: ");
            return null;
        }
        if (tt7Var.Z().isEmpty() || tt7Var.Z().size() != j7fVarC0.getParameters().size()) {
            return new ic0(tt7Var, tt7Var);
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        List listZ = tt7Var.Z();
        List parameters = j7fVarC0.getParameters();
        parameters.getClass();
        for (iy9 iy9Var : s72.r1(listZ, parameters)) {
            i8f i8fVar = (i8f) iy9Var.a();
            c8f c8fVar = (c8f) iy9Var.b();
            c8fVar.getClass();
            dsf dsfVarX = c8fVar.x();
            if (dsfVarX == null) {
                q8f.a(35);
                throw null;
            }
            if (i8fVar == null) {
                q8f.a(36);
                throw null;
            }
            q8f q8fVar = q8f.b;
            int iOrdinal2 = (i8fVar.c() ? dsf.OUT_VARIANCE : q8f.b(dsfVarX, i8fVar.a())).ordinal();
            if (iOrdinal2 == 0) {
                tt7 tt7VarB2 = i8fVar.b();
                tt7VarB2.getClass();
                tt7 tt7VarB3 = i8fVar.b();
                tt7VarB3.getClass();
                b7fVar2 = new b7f(c8fVar, tt7VarB2, tt7VarB3);
            } else if (iOrdinal2 == 1) {
                tt7 tt7VarB4 = i8fVar.b();
                tt7VarB4.getClass();
                tjd tjdVarP = qz3.e(c8fVar).p();
                tjdVarP.getClass();
                b7fVar2 = new b7f(c8fVar, tt7VarB4, tjdVarP);
            } else {
                if (iOrdinal2 != 2) {
                    ap.c();
                    return null;
                }
                tjd tjdVarO = qz3.e(c8fVar).o();
                tt7 tt7VarB5 = i8fVar.b();
                tt7VarB5.getClass();
                b7fVar2 = new b7f(c8fVar, tjdVarO, tt7VarB5);
            }
            if (i8fVar.c()) {
                arrayList.add(b7fVar2);
                arrayList2.add(b7fVar2);
            } else {
                ic0 ic0VarL3 = l(b7fVar2.b);
                tt7 tt7Var2 = (tt7) ic0VarL3.a;
                tt7 tt7Var3 = (tt7) ic0VarL3.b;
                ic0 ic0VarL4 = l(b7fVar2.c);
                tt7 tt7Var4 = (tt7) ic0VarL4.a;
                tt7 tt7Var5 = (tt7) ic0VarL4.b;
                c8f c8fVar2 = b7fVar2.a;
                b7f b7fVar3 = new b7f(c8fVar2, tt7Var3, tt7Var4);
                b7f b7fVar4 = new b7f(c8fVar2, tt7Var2, tt7Var5);
                arrayList.add(b7fVar3);
                arrayList2.add(b7fVar4);
            }
        }
        if (arrayList.isEmpty()) {
            z = false;
            break;
        }
        Iterator it = arrayList.iterator();
        do {
            if (!it.hasNext()) {
                z = false;
                break;
            }
            b7fVar = (b7f) it.next();
            b7fVar.getClass();
        } while (vt7.a.b(b7fVar.b, b7fVar.c));
        return new ic0(z ? o7c.p(tt7Var).o() : D(tt7Var, arrayList), D(tt7Var, arrayList2));
    }

    public static final uhb m(ncd ncdVar) {
        return new uhb(ncdVar, null);
    }

    public static final whb n(h89 h89Var) {
        return new whb(h89Var, null);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:19:0x003c  */
    public static final void o(l1f l1fVar, p5a p5aVar) {
        String str;
        l1fVar.getClass();
        p5aVar.getClass();
        String strA = ((u5a) p5aVar).a("paywall-abtest-202605");
        if (strA != null) {
            switch (strA) {
                case "experiment_1":
                    str = "g2";
                    break;
                case "experiment_2":
                    str = "g3";
                    break;
                case "control":
                    str = "g1";
                    break;
                default:
                    str = null;
                    break;
            }
        } else {
            str = null;
        }
        if (str != null) {
            l1fVar.a(str, "test_group");
        }
    }

    public static void p(l1f l1fVar, p5a p5aVar) {
        l1fVar.getClass();
        p5aVar.getClass();
        String strB0 = pa7.b0(4, ((u5a) p5aVar).a("reading-pack-test-202609"), false);
        if (strB0 != null) {
            l1fVar.a(strB0, "reading_pack_test_group");
        }
    }

    public static szc q(szc szcVar, o22 o22Var, enb enbVar, int i2) {
        if ((i2 & 2) != 0) {
            enbVar = null;
        }
        szcVar.getClass();
        return new szc((mf7) szcVar.b, enbVar != null ? new r1f(szcVar, o22Var, enbVar, 0) : (f8f) szcVar.c, eb3.N(z18.c, new n5(szcVar, o22Var, false, 3)));
    }

    public static final veh r(wj5 wj5Var) {
        yv1.p.getClass();
        int i2 = xv1.b;
        if (1 >= i2) {
            i2 = 1;
        }
        int i3 = i2 - 1;
        boolean z = wj5Var instanceof cw1;
        i41 i41Var = i41.a;
        if (z) {
            cw1 cw1Var = (cw1) wj5Var;
            i41 i41Var2 = cw1Var.c;
            wj5 wj5VarJ = cw1Var.j();
            if (wj5VarJ != null) {
                int i4 = cw1Var.b;
                if (i4 != -3 && i4 != -2 && i4 != 0) {
                    i3 = i4;
                } else if (i41Var2 != i41Var || i4 == 0) {
                    i3 = 0;
                }
                return new veh(i3, i41Var2, cw1Var.a, wj5VarJ);
            }
        }
        return new veh(i3, i41Var, nu4.a, wj5Var);
    }

    public static final szc s(szc szcVar, h10 h10Var) {
        szcVar.getClass();
        h10Var.getClass();
        if (h10Var.isEmpty()) {
            return szcVar;
        }
        return new szc((mf7) szcVar.b, (f8f) szcVar.c, eb3.N(z18.c, new n5(szcVar, h10Var, false, 4)));
    }

    public static boolean t(Map map, Object obj) {
        if (map == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return map.entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    public static ed4 u(jd4 jd4Var) {
        if (jd4Var instanceof gd4) {
            return (ed4) jd4Var;
        }
        if (jd4Var instanceof fd4) {
            return (ed4) jd4Var;
        }
        if (jd4Var instanceof zc4) {
            return ((zc4) jd4Var).d;
        }
        if (jd4Var instanceof ad4) {
            return ((ad4) jd4Var).a.d;
        }
        if (jd4Var instanceof bd4) {
            return u(((bd4) jd4Var).b);
        }
        if (!(jd4Var instanceof hd4) && !(jd4Var instanceof id4) && !(jd4Var instanceof cd4)) {
            ap.c();
        }
        return null;
    }

    public static final gx6 v() {
        gx6 gx6Var = s;
        if (gx6Var != null) {
            return gx6Var;
        }
        fx6 fx6Var = new fx6("AutoMirrored.Filled.ArrowForward", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, true, 96);
        int i2 = msf.a;
        dtd dtdVar = new dtd(y72.b);
        s71 s71Var = new s71(1);
        s71Var.p(12.0f, 4.0f);
        s71Var.o(-1.41f, 1.41f);
        s71Var.n(16.17f, 11.0f);
        s71Var.l(4.0f);
        s71Var.t(2.0f);
        s71Var.m(12.17f);
        s71Var.o(-5.58f, 5.59f);
        s71Var.n(12.0f, 20.0f);
        s71Var.o(8.0f, -8.0f);
        s71Var.h();
        fx6.a(fx6Var, s71Var.b, dtdVar, 1.0f, 1.0f, 2, 1.0f);
        gx6 gx6VarB = fx6Var.b();
        s = gx6VarB;
        return gx6VarB;
    }

    public static final os5 w(mic micVar) {
        micVar.getClass();
        int iOrdinal = micVar.ordinal();
        if (iOrdinal == 0) {
            return i;
        }
        if (iOrdinal == 1) {
            return j;
        }
        ap.c();
        return null;
    }

    public static final gx6 x() {
        gx6 gx6Var = u;
        if (gx6Var != null) {
            return gx6Var;
        }
        fx6 fx6Var = new fx6("Filled.KeyboardArrowDown", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
        int i2 = msf.a;
        dtd dtdVar = new dtd(y72.b);
        ArrayList arrayList = new ArrayList(32);
        arrayList.add(new p1a(7.41f, 8.59f));
        arrayList.add(new o1a(12.0f, 13.17f));
        arrayList.add(new w1a(4.59f, -4.58f));
        arrayList.add(new o1a(18.0f, 10.0f));
        arrayList.add(new w1a(-6.0f, 6.0f));
        arrayList.add(new w1a(-6.0f, -6.0f));
        arrayList.add(new w1a(1.41f, -1.41f));
        arrayList.add(l1a.c);
        fx6.a(fx6Var, arrayList, dtdVar, 1.0f, 1.0f, 2, 1.0f);
        gx6 gx6VarB = fx6Var.b();
        u = gx6VarB;
        return gx6VarB;
    }

    public static final ClipboardManager y(c52 c52Var) {
        if (c52Var instanceof rp) {
            return ((rp) c52Var).a.A();
        }
        qc0.o(ub3.i("Extracting native reference is only supported from androidx.compose.ui.platform.AndroidClipboard instances but received ", job.a.b(c52Var.getClass()).g()));
        return null;
    }

    public static cu6 z(long j2, long j3, l46 l46Var, int i2) {
        cu6 cu6Var;
        long j4 = (i2 & 1) != 0 ? y72.k : j2;
        long j5 = (i2 & 2) != 0 ? ((y72) l46Var.k(em2.a)).a : j3;
        long j6 = y72.k;
        float f2 = feg.j;
        long jB = y72.b(j5, f2);
        m82 m82Var = (m82) l46Var.k(o82.a);
        long j7 = ((y72) l46Var.k(em2.a)).a;
        cu6 cu6Var2 = m82Var.f0;
        if (cu6Var2 == null) {
            long j8 = y72.j;
            cu6 cu6Var3 = new cu6(j8, j7, j8, y72.b(j7, f2));
            m82Var.f0 = cu6Var3;
            cu6Var = cu6Var3;
        } else {
            cu6Var = cu6Var2;
        }
        return cu6Var.a(j4, j5, j6, jB);
    }
}
