package defpackage;

import android.content.SharedPreferences;
import android.text.TextUtils;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class ibh {
    public static final yob a = jy6.v("Version", "GoogleConsent", "VendorConsent", "VendorLegitimateInterest", "gdprApplies", "EnableAdvertiserConsentMode", "PolicyVersion", "PurposeConsents", "PurposeOneTreatment", "Purpose1", "Purpose3", "Purpose4", "Purpose7", "CmpSdkID", "PublisherCC", "PublisherRestrictions1", "PublisherRestrictions3", "PublisherRestrictions4", "PublisherRestrictions7", "AuthorizePurpose1", "AuthorizePurpose3", "AuthorizePurpose4", "AuthorizePurpose7", "PurposeDiagnostics");

    public static String a(SharedPreferences sharedPreferences, String str) {
        try {
            return sharedPreferences.getString(str, "");
        } catch (ClassCastException unused) {
            return "";
        }
    }

    public static final boolean b(jlg jlgVar, dpb dpbVar, dpb dpbVar2, vkd vkdVar, char[] cArr, int i, int i2, int i3, String str, String str2, String str3, boolean z, boolean z2) {
        hbh hbhVar;
        char c;
        int iC = c(jlgVar);
        if (iC > 0 && (i2 != 1 || i != 1)) {
            cArr[iC] = '2';
        }
        if (g(jlgVar, dpbVar2) == klg.PURPOSE_RESTRICTION_NOT_ALLOWED) {
            c = '3';
        } else {
            if (jlgVar == jlg.IAB_TCF_PURPOSE_STORE_AND_ACCESS_INFORMATION_ON_A_DEVICE && i3 == 1 && vkdVar.d.equals(str)) {
                if (iC > 0 && cArr[iC] != '2') {
                    cArr[iC] = '1';
                }
                return true;
            }
            if (dpbVar.containsKey(jlgVar) && (hbhVar = (hbh) dpbVar.get(jlgVar)) != null) {
                int iOrdinal = hbhVar.ordinal();
                klg klgVar = klg.PURPOSE_RESTRICTION_REQUIRE_LEGITIMATE_INTEREST;
                if (iOrdinal != 0) {
                    klg klgVar2 = klg.PURPOSE_RESTRICTION_REQUIRE_CONSENT;
                    if (iOrdinal != 1) {
                        if (iOrdinal == 2) {
                            return g(jlgVar, dpbVar2) == klgVar ? f(jlgVar, cArr, str3, z2) : e(jlgVar, cArr, str2, z);
                        }
                        if (iOrdinal == 3) {
                            return g(jlgVar, dpbVar2) == klgVar2 ? e(jlgVar, cArr, str2, z) : f(jlgVar, cArr, str3, z2);
                        }
                        c = '0';
                    } else if (g(jlgVar, dpbVar2) != klgVar2) {
                        return f(jlgVar, cArr, str3, z2);
                    }
                } else if (g(jlgVar, dpbVar2) != klgVar) {
                    return e(jlgVar, cArr, str2, z);
                }
                c = '8';
            } else {
                c = '0';
            }
        }
        if (iC <= 0 || cArr[iC] == '2') {
            return false;
        }
        cArr[iC] = c;
        return false;
    }

    public static final int c(jlg jlgVar) {
        if (jlgVar == jlg.IAB_TCF_PURPOSE_STORE_AND_ACCESS_INFORMATION_ON_A_DEVICE) {
            return 1;
        }
        if (jlgVar == jlg.IAB_TCF_PURPOSE_CREATE_A_PERSONALISED_ADS_PROFILE) {
            return 2;
        }
        if (jlgVar == jlg.IAB_TCF_PURPOSE_SELECT_PERSONALISED_ADS) {
            return 3;
        }
        return jlgVar == jlg.IAB_TCF_PURPOSE_MEASURE_AD_PERFORMANCE ? 4 : -1;
    }

    public static final String d(jlg jlgVar, String str, String str2) {
        String strValueOf = "0";
        String strValueOf2 = (TextUtils.isEmpty(str) || str.length() < jlgVar.b()) ? "0" : String.valueOf(str.charAt(jlgVar.b() - 1));
        if (!TextUtils.isEmpty(str2) && str2.length() >= jlgVar.b()) {
            strValueOf = String.valueOf(str2.charAt(jlgVar.b() - 1));
        }
        return String.valueOf(strValueOf2).concat(String.valueOf(strValueOf));
    }

    public static final boolean e(jlg jlgVar, char[] cArr, String str, boolean z) {
        char c;
        int iC = c(jlgVar);
        if (!z) {
            c = '4';
        } else {
            if (str.length() >= jlgVar.b()) {
                char cCharAt = str.charAt(jlgVar.b() - 1);
                boolean z2 = cCharAt == '1';
                if (iC > 0 && cArr[iC] != '2') {
                    cArr[iC] = cCharAt != '1' ? '6' : '1';
                }
                return z2;
            }
            c = '0';
        }
        if (iC > 0 && cArr[iC] != '2') {
            cArr[iC] = c;
        }
        return false;
    }

    public static final boolean f(jlg jlgVar, char[] cArr, String str, boolean z) {
        char c;
        int iC = c(jlgVar);
        if (!z) {
            c = '5';
        } else {
            if (str.length() >= jlgVar.b()) {
                char cCharAt = str.charAt(jlgVar.b() - 1);
                boolean z2 = cCharAt == '1';
                if (iC > 0 && cArr[iC] != '2') {
                    cArr[iC] = cCharAt != '1' ? '7' : '1';
                }
                return z2;
            }
            c = '0';
        }
        if (iC > 0 && cArr[iC] != '2') {
            cArr[iC] = c;
        }
        return false;
    }

    public static final klg g(jlg jlgVar, dpb dpbVar) {
        Object obj = dpbVar.get(jlgVar);
        if (obj == null) {
            obj = klg.PURPOSE_RESTRICTION_UNDEFINED;
        }
        return (klg) obj;
    }
}
