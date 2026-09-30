package defpackage;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.SparseArray;
import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.EnumMap;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Objects;
import java.util.PriorityQueue;
import java.util.concurrent.CopyOnWriteArraySet;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class c8h extends fzg {
    public final AtomicLong E0;
    public long F0;
    public final fnb G0;
    public boolean H0;
    public e6h I0;
    public w7h J0;
    public e6h K0;
    public final oid L0;
    public e6h X;
    public PriorityQueue Y;
    public q5h Z;
    public ya5 d;
    public gsg e;
    public final CopyOnWriteArraySet f;
    public boolean g;
    public final AtomicReference v;
    public final Object w;
    public boolean x;
    public int y;
    public e6h z;

    public c8h(w3h w3hVar) {
        super(w3hVar);
        this.f = new CopyOnWriteArraySet();
        this.w = new Object();
        this.x = false;
        this.y = 1;
        this.H0 = true;
        this.L0 = new oid(14, this);
        this.v = new AtomicReference();
        this.Z = q5h.c;
        this.F0 = -1L;
        this.E0 = new AtomicLong(0L);
        this.G0 = new fnb(w3hVar);
    }

    @Override // defpackage.fzg
    public final boolean D0() {
        return false;
    }

    public final void E0(String str, String str2, Bundle bundle) {
        long jElapsedRealtime;
        w3h w3hVar = (w3h) this.b;
        w3hVar.y.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (w3hVar.d.L0(null, bzg.e1)) {
            w3hVar.y.getClass();
            jElapsedRealtime = SystemClock.elapsedRealtime();
        } else {
            jElapsedRealtime = 0;
        }
        F0(str, str2, bundle, true, true, jCurrentTimeMillis, jElapsedRealtime);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x006b, code lost:
    
        if (r5 > 500) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a2, code lost:
    
        if (r6 > 500) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void F0(java.lang.String r20, java.lang.String r21, android.os.Bundle r22, boolean r23, boolean r24, long r25, long r27) {
        /*
            Method dump skipped, instruction units count: 518
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.c8h.F0(java.lang.String, java.lang.String, android.os.Bundle, boolean, boolean, long, long):void");
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0268  */
    /* JADX WARN: Code duplicated, block: B:102:0x026d  */
    /* JADX WARN: Code duplicated, block: B:105:0x02e4  */
    /* JADX WARN: Code duplicated, block: B:107:0x02fc  */
    /* JADX WARN: Code duplicated, block: B:110:0x0318  */
    /* JADX WARN: Code duplicated, block: B:112:0x0333  */
    /* JADX WARN: Code duplicated, block: B:115:0x0352  */
    /* JADX WARN: Code duplicated, block: B:117:0x0364  */
    /* JADX WARN: Code duplicated, block: B:120:0x036f  */
    /* JADX WARN: Code duplicated, block: B:121:0x0372  */
    /* JADX WARN: Code duplicated, block: B:125:0x03c5  */
    /* JADX WARN: Code duplicated, block: B:126:0x03cc  */
    /* JADX WARN: Code duplicated, block: B:128:0x03d7  */
    /* JADX WARN: Code duplicated, block: B:137:0x0414  */
    /* JADX WARN: Code duplicated, block: B:139:0x0434  */
    /* JADX WARN: Code duplicated, block: B:140:0x0447  */
    /* JADX WARN: Code duplicated, block: B:146:0x0460  */
    /* JADX WARN: Code duplicated, block: B:158:0x04a6  */
    /* JADX WARN: Code duplicated, block: B:162:0x04c2  */
    /* JADX WARN: Code duplicated, block: B:166:0x04da A[Catch: NumberFormatException -> 0x04df, TRY_LEAVE, TryCatch #3 {NumberFormatException -> 0x04df, blocks: (B:164:0x04ce, B:166:0x04da), top: B:198:0x04ce }] */
    /* JADX WARN: Code duplicated, block: B:168:0x04df  */
    /* JADX WARN: Code duplicated, block: B:174:0x04fc  */
    /* JADX WARN: Code duplicated, block: B:180:0x0513  */
    /* JADX WARN: Code duplicated, block: B:183:0x0522  */
    /* JADX WARN: Code duplicated, block: B:185:0x0527  */
    /* JADX WARN: Code duplicated, block: B:188:0x0535  */
    /* JADX WARN: Code duplicated, block: B:213:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:65:0x01b0  */
    /* JADX WARN: Code duplicated, block: B:67:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:69:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:72:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:74:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:77:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:78:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:81:0x0201  */
    /* JADX WARN: Code duplicated, block: B:82:0x0204  */
    /* JADX WARN: Code duplicated, block: B:85:0x021b  */
    /* JADX WARN: Code duplicated, block: B:86:0x021e  */
    /* JADX WARN: Code duplicated, block: B:89:0x022c  */
    /* JADX WARN: Code duplicated, block: B:90:0x0231  */
    /* JADX WARN: Code duplicated, block: B:93:0x0240  */
    /* JADX WARN: Code duplicated, block: B:94:0x0245  */
    /* JADX WARN: Code duplicated, block: B:97:0x0254  */
    /* JADX WARN: Code duplicated, block: B:98:0x0259  */
    /* JADX WARN: Instruction removed from duplicated block: B:126:0x03cc, please report this as an issue */
    public final void G0() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        os osVarB;
        gff it;
        klg klgVar;
        w3h w3hVar;
        boolean z;
        fbh fbhVar;
        klg klgVar2;
        klg klgVar3;
        klg klgVar4;
        klg klgVar5;
        Object obj;
        boolean z2;
        Object obj2;
        boolean z3;
        Object obj3;
        Object obj4;
        Object obj5;
        int iB;
        int iB2;
        int iB3;
        int iB4;
        int i6;
        String str;
        String str2;
        int i7;
        String str3;
        int i8;
        String str4;
        String str5;
        String str6;
        dpb dpbVarE;
        String string;
        HashMap map;
        int i9;
        int i10;
        fbh fbhVar2;
        String[] strArrSplit;
        String string2;
        String strA;
        Bundle bundleB;
        c8h c8hVar;
        HashMap map2;
        String str7;
        Bundle bundleB2;
        Bundle bundleB3;
        String str8;
        HashMap map3;
        String str9;
        StringBuilder sb;
        int i11;
        int iC;
        int i12;
        boolean zEquals;
        int i13;
        String str10;
        klg klgVar6;
        A0();
        w3h w3hVar2 = (w3h) this.b;
        w0h w0hVar = w3hVar2.f;
        w0h w0hVar2 = w3hVar2.f;
        w3h.h(w0hVar);
        w0hVar.Y.a("Handle tcf update.");
        c2h c2hVar = w3hVar2.e;
        w3h.f(c2hVar);
        SharedPreferences sharedPreferencesF0 = c2hVar.F0();
        yob yobVar = ibh.a;
        jlg jlgVar = jlg.IAB_TCF_PURPOSE_STORE_AND_ACCESS_INFORMATION_ON_A_DEVICE;
        hbh hbhVar = hbh.a;
        jlg jlgVar2 = jlg.IAB_TCF_PURPOSE_SELECT_BASIC_ADS;
        hbh hbhVar2 = hbh.b;
        jlg jlgVar3 = jlg.IAB_TCF_PURPOSE_CREATE_A_PERSONALISED_ADS_PROFILE;
        jlg jlgVar4 = jlg.IAB_TCF_PURPOSE_SELECT_PERSONALISED_ADS;
        jlg jlgVar5 = jlg.IAB_TCF_PURPOSE_MEASURE_AD_PERFORMANCE;
        dpb dpbVarH = dpb.h(7, new Object[]{jlgVar, hbhVar, jlgVar2, hbhVar2, jlgVar3, hbhVar, jlgVar4, hbhVar, jlgVar5, hbhVar2, jlg.IAB_TCF_PURPOSE_APPLY_MARKET_RESEARCH_TO_GENERATE_AUDIENCE_INSIGHTS, hbhVar2, jlg.IAB_TCF_PURPOSE_DEVELOP_AND_IMPROVE_PRODUCTS, hbhVar2}, null);
        int i14 = ry6.c;
        vkd vkdVar = new vkd("CH");
        char[] cArr = new char[5];
        boolean zContains = sharedPreferencesF0.contains("IABTCF_TCString");
        try {
            i = sharedPreferencesF0.getInt("IABTCF_CmpSdkID", -1);
        } catch (ClassCastException unused) {
            i = -1;
        }
        try {
            i2 = sharedPreferencesF0.getInt("IABTCF_PolicyVersion", -1);
        } catch (ClassCastException unused2) {
            i2 = -1;
        }
        try {
            i3 = sharedPreferencesF0.getInt("IABTCF_gdprApplies", -1);
        } catch (ClassCastException unused3) {
            i3 = -1;
        }
        try {
            try {
                i4 = sharedPreferencesF0.getInt("IABTCF_PurposeOneTreatment", -1);
                while (true) {
                    boolean zHasNext = it.hasNext();
                    klgVar = klg.PURPOSE_RESTRICTION_UNDEFINED;
                    if (!zHasNext) {
                        break;
                    }
                    jlg jlgVar6 = (jlg) it.next();
                    boolean z4 = zContains;
                    int iB5 = jlgVar6.b();
                    int i15 = i;
                    vkd vkdVar2 = vkdVar;
                    StringBuilder sb2 = new StringBuilder(String.valueOf(iB5).length() + 28);
                    sb2.append("IABTCF_PublisherRestrictions");
                    sb2.append(iB5);
                    String strA2 = ibh.a(sharedPreferencesF0, sb2.toString());
                    if (TextUtils.isEmpty(strA2) || strA2.length() < 755) {
                        klgVar6 = klgVar;
                    } else {
                        int iDigit = Character.digit(strA2.charAt(754), 10);
                        klgVar6 = klg.PURPOSE_RESTRICTION_NOT_ALLOWED;
                        if (iDigit >= 0 && iDigit <= klg.values().length && iDigit != 0) {
                            if (iDigit == 1) {
                                klgVar = klg.PURPOSE_RESTRICTION_REQUIRE_CONSENT;
                            } else if (iDigit == 2) {
                                klgVar = klg.PURPOSE_RESTRICTION_REQUIRE_LEGITIMATE_INTEREST;
                            }
                            klgVar6 = klgVar;
                        }
                    }
                    osVarB.q(jlgVar6, klgVar6);
                    zContains = z4;
                    i = i15;
                    vkdVar = vkdVar2;
                }
            } catch (ClassCastException unused4) {
                i4 = -1;
            }
            i5 = sharedPreferencesF0.getInt("IABTCF_EnableAdvertiserConsentMode", -1);
        } catch (ClassCastException unused5) {
            i5 = -1;
        }
        int i16 = i2;
        String strA3 = ibh.a(sharedPreferencesF0, "IABTCF_PublisherCC");
        osVarB = ny6.b();
        it = dpbVarH.keySet().iterator();
        boolean z5 = zContains;
        int i17 = i;
        vkd vkdVar3 = vkdVar;
        dpb dpbVarE2 = osVarB.e(true);
        String strA4 = ibh.a(sharedPreferencesF0, "IABTCF_PurposeConsents");
        String strA5 = ibh.a(sharedPreferencesF0, "IABTCF_VendorConsents");
        boolean z6 = !TextUtils.isEmpty(strA5) && strA5.length() >= 755 && strA5.charAt(754) == '1';
        String strA6 = ibh.a(sharedPreferencesF0, "IABTCF_PurposeLegitimateInterests");
        String strA7 = ibh.a(sharedPreferencesF0, "IABTCF_VendorLegitimateInterests");
        if (!TextUtils.isEmpty(strA7)) {
            w3hVar = w3hVar2;
            if (strA7.length() >= 755 && strA7.charAt(754) == '1') {
                z = true;
            }
            cArr[0] = '2';
            if (z5) {
                klgVar2 = (klg) dpbVarE2.get(jlgVar);
                klgVar3 = (klg) dpbVarE2.get(jlgVar3);
                klgVar4 = (klg) dpbVarE2.get(jlgVar4);
                klgVar5 = (klg) dpbVarE2.get(jlgVar5);
                os osVarB2 = ny6.b();
                osVarB2.q("Version", "2");
                if (true != z6) {
                    obj = "0";
                } else {
                    obj = "1";
                }
                z2 = z6;
                osVarB2.q("VendorConsent", obj);
                if (true != z) {
                    obj2 = "0";
                } else {
                    obj2 = "1";
                }
                z3 = z;
                osVarB2.q("VendorLegitimateInterest", obj2);
                if (i3 != 1) {
                    obj3 = "0";
                } else {
                    obj3 = "1";
                }
                osVarB2.q("gdprApplies", obj3);
                if (i5 != 1) {
                    obj4 = "0";
                } else {
                    obj4 = "1";
                }
                osVarB2.q("EnableAdvertiserConsentMode", obj4);
                osVarB2.q("PolicyVersion", String.valueOf(i16));
                osVarB2.q("CmpSdkID", String.valueOf(i17));
                if (i4 != 1) {
                    obj5 = "0";
                } else {
                    obj5 = "1";
                }
                osVarB2.q("PurposeOneTreatment", obj5);
                osVarB2.q("PublisherCC", strA3);
                if (klgVar2 != null) {
                    iB = klgVar2.b();
                } else {
                    iB = klgVar.b();
                }
                osVarB2.q("PublisherRestrictions1", String.valueOf(iB));
                if (klgVar3 != null) {
                    iB2 = klgVar3.b();
                } else {
                    iB2 = klgVar.b();
                }
                osVarB2.q("PublisherRestrictions3", String.valueOf(iB2));
                if (klgVar4 != null) {
                    iB3 = klgVar4.b();
                } else {
                    iB3 = klgVar.b();
                }
                osVarB2.q("PublisherRestrictions4", String.valueOf(iB3));
                if (klgVar5 != null) {
                    iB4 = klgVar5.b();
                } else {
                    iB4 = klgVar.b();
                }
                osVarB2.q("PublisherRestrictions7", String.valueOf(iB4));
                i6 = i3;
                osVarB2.r(dpb.h(4, new Object[]{"Purpose1", ibh.d(jlgVar, strA4, strA6), "Purpose3", ibh.d(jlgVar3, strA4, strA6), "Purpose4", ibh.d(jlgVar4, strA4, strA6), "Purpose7", ibh.d(jlgVar5, strA4, strA6)}, null).entrySet());
                str = "0";
                str2 = "1";
                i7 = i4;
                if (true != ibh.b(jlgVar, dpbVarH, dpbVarE2, vkdVar3, cArr, i5, i6, i7, strA3, strA4, strA6, z2, z3)) {
                    str3 = str;
                } else {
                    str3 = str2;
                }
                i8 = i5;
                if (true != ibh.b(jlgVar3, dpbVarH, dpbVarE2, vkdVar3, cArr, i8, i6, i7, strA3, strA4, strA6, z2, z3)) {
                    str4 = str;
                } else {
                    str4 = str2;
                }
                if (true != ibh.b(jlgVar4, dpbVarH, dpbVarE2, vkdVar3, cArr, i8, i6, i7, strA3, strA4, strA6, z2, z3)) {
                    str5 = str;
                } else {
                    str5 = str2;
                }
                if (true != ibh.b(jlgVar5, dpbVarH, dpbVarE2, vkdVar3, cArr, i8, i6, i7, strA3, strA4, strA6, z2, z3)) {
                    str6 = str;
                } else {
                    str6 = str2;
                }
                osVarB2.r(dpb.h(5, new Object[]{"AuthorizePurpose1", str3, "AuthorizePurpose3", str4, "AuthorizePurpose4", str5, "AuthorizePurpose7", str6, "PurposeDiagnostics", new String(cArr)}, null).entrySet());
                dpbVarE = osVarB2.e(true);
            } else {
                dpbVarE = dpb.g;
                str2 = "1";
                str = "0";
            }
            fbhVar = new fbh(dpbVarE);
            w3h.h(w0hVar2);
            w0hVar2.Z.b(fbhVar, "Tcf preferences read");
            c2hVar.A0();
            string = c2hVar.E0().getString("stored_tcf_param", "");
            map = new HashMap();
            if (TextUtils.isEmpty(string)) {
                fbhVar2 = new fbh(map);
                i10 = 2;
            } else {
                for (String str11 : string.split(";")) {
                    strArrSplit = str11.split("=");
                    if (strArrSplit.length < 2 && ibh.a.contains(strArrSplit[0])) {
                        map.put(strArrSplit[0], strArrSplit[1]);
                    }
                }
                i10 = 2;
                fbhVar2 = new fbh(map);
            }
            c2hVar.A0();
            string2 = c2hVar.E0().getString("stored_tcf_param", "");
            strA = fbhVar.a();
            if (strA.equals(string2)) {
            }
            SharedPreferences.Editor editorEdit = c2hVar.E0().edit();
            editorEdit.putString("stored_tcf_param", strA);
            editorEdit.apply();
            bundleB = fbhVar.b();
            w3h.h(w0hVar2);
            w0hVar2.Z.b(bundleB, "Consent generated from Tcf");
            if (bundleB != Bundle.EMPTY) {
                w3hVar.y.getClass();
                c8hVar = this;
                c8hVar.U0(bundleB, -30, System.currentTimeMillis());
            } else {
                c8hVar = this;
            }
            Bundle bundle = new Bundle();
            map2 = fbhVar2.a;
            if (map2.isEmpty() && ((String) map2.get("Version")) == null) {
                str7 = str2;
            } else {
                str7 = str;
            }
            bundleB2 = fbhVar.b();
            bundleB3 = fbhVar2.b();
            if (bundleB2.size() != bundleB3.size() && Objects.equals(bundleB2.getString("ad_storage"), bundleB3.getString("ad_storage")) && Objects.equals(bundleB2.getString("ad_personalization"), bundleB3.getString("ad_personalization")) && Objects.equals(bundleB2.getString("ad_user_data"), bundleB3.getString("ad_user_data"))) {
                str8 = str;
            } else {
                str8 = str2;
            }
            bundle.putString("_tcfm", str7.concat(str8));
            map3 = fbhVar.a;
            str9 = (String) map3.get("PurposeDiagnostics");
            if (TextUtils.isEmpty(str9)) {
                str9 = "200000";
            }
            bundle.putString("_tcfd2", str9);
            sb = new StringBuilder(str2);
            try {
                str10 = (String) map3.get("CmpSdkID");
                if (TextUtils.isEmpty(str10)) {
                    i11 = -1;
                } else {
                    i11 = Integer.parseInt(str10);
                }
            } catch (NumberFormatException unused6) {
            }
            if (i11 >= 0 || i11 > 4095) {
                sb.append("00");
            } else {
                sb.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i11 >> 6));
                sb.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i11 & 63));
            }
            iC = fbhVar.c();
            if (iC >= 0 || iC > 63) {
                sb.append(str);
            } else {
                sb.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(iC));
            }
            if (true != str2.equals(map3.get("gdprApplies"))) {
                i12 = 0;
            } else {
                i12 = i10;
            }
            zEquals = str2.equals(map3.get("EnableAdvertiserConsentMode"));
            i13 = i12 | 4;
            if (zEquals) {
                i13 = i12 | 12;
            }
            sb.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i13));
            bundle.putString("_tcfd", sb.toString());
            c8hVar.H0("auto", "_tcf", bundle);
        }
        w3hVar = w3hVar2;
        z = false;
        cArr[0] = '2';
        if (z5) {
            dpbVarE = dpb.g;
            str2 = "1";
            str = "0";
        } else {
            klgVar2 = (klg) dpbVarE2.get(jlgVar);
            klgVar3 = (klg) dpbVarE2.get(jlgVar3);
            klgVar4 = (klg) dpbVarE2.get(jlgVar4);
            klgVar5 = (klg) dpbVarE2.get(jlgVar5);
            os osVarB3 = ny6.b();
            osVarB3.q("Version", "2");
            if (true != z6) {
                obj = "0";
            } else {
                obj = "1";
            }
            z2 = z6;
            osVarB3.q("VendorConsent", obj);
            if (true != z) {
                obj2 = "0";
            } else {
                obj2 = "1";
            }
            z3 = z;
            osVarB3.q("VendorLegitimateInterest", obj2);
            if (i3 != 1) {
                obj3 = "0";
            } else {
                obj3 = "1";
            }
            osVarB3.q("gdprApplies", obj3);
            if (i5 != 1) {
                obj4 = "0";
            } else {
                obj4 = "1";
            }
            osVarB3.q("EnableAdvertiserConsentMode", obj4);
            osVarB3.q("PolicyVersion", String.valueOf(i16));
            osVarB3.q("CmpSdkID", String.valueOf(i17));
            if (i4 != 1) {
                obj5 = "0";
            } else {
                obj5 = "1";
            }
            osVarB3.q("PurposeOneTreatment", obj5);
            osVarB3.q("PublisherCC", strA3);
            if (klgVar2 != null) {
                iB = klgVar2.b();
            } else {
                iB = klgVar.b();
            }
            osVarB3.q("PublisherRestrictions1", String.valueOf(iB));
            if (klgVar3 != null) {
                iB2 = klgVar3.b();
            } else {
                iB2 = klgVar.b();
            }
            osVarB3.q("PublisherRestrictions3", String.valueOf(iB2));
            if (klgVar4 != null) {
                iB3 = klgVar4.b();
            } else {
                iB3 = klgVar.b();
            }
            osVarB3.q("PublisherRestrictions4", String.valueOf(iB3));
            if (klgVar5 != null) {
                iB4 = klgVar5.b();
            } else {
                iB4 = klgVar.b();
            }
            osVarB3.q("PublisherRestrictions7", String.valueOf(iB4));
            i6 = i3;
            osVarB3.r(dpb.h(4, new Object[]{"Purpose1", ibh.d(jlgVar, strA4, strA6), "Purpose3", ibh.d(jlgVar3, strA4, strA6), "Purpose4", ibh.d(jlgVar4, strA4, strA6), "Purpose7", ibh.d(jlgVar5, strA4, strA6)}, null).entrySet());
            str = "0";
            str2 = "1";
            i7 = i4;
            if (true != ibh.b(jlgVar, dpbVarH, dpbVarE2, vkdVar3, cArr, i5, i6, i7, strA3, strA4, strA6, z2, z3)) {
                str3 = str;
            } else {
                str3 = str2;
            }
            i8 = i5;
            if (true != ibh.b(jlgVar3, dpbVarH, dpbVarE2, vkdVar3, cArr, i8, i6, i7, strA3, strA4, strA6, z2, z3)) {
                str4 = str;
            } else {
                str4 = str2;
            }
            if (true != ibh.b(jlgVar4, dpbVarH, dpbVarE2, vkdVar3, cArr, i8, i6, i7, strA3, strA4, strA6, z2, z3)) {
                str5 = str;
            } else {
                str5 = str2;
            }
            if (true != ibh.b(jlgVar5, dpbVarH, dpbVarE2, vkdVar3, cArr, i8, i6, i7, strA3, strA4, strA6, z2, z3)) {
                str6 = str;
            } else {
                str6 = str2;
            }
            osVarB3.r(dpb.h(5, new Object[]{"AuthorizePurpose1", str3, "AuthorizePurpose3", str4, "AuthorizePurpose4", str5, "AuthorizePurpose7", str6, "PurposeDiagnostics", new String(cArr)}, null).entrySet());
            dpbVarE = osVarB3.e(true);
        }
        fbhVar = new fbh(dpbVarE);
        w3h.h(w0hVar2);
        w0hVar2.Z.b(fbhVar, "Tcf preferences read");
        c2hVar.A0();
        string = c2hVar.E0().getString("stored_tcf_param", "");
        map = new HashMap();
        if (TextUtils.isEmpty(string)) {
            fbhVar2 = new fbh(map);
            i10 = 2;
        } else {
            while (i9 < r10) {
                strArrSplit = str11.split("=");
                if (strArrSplit.length < 2) {
                }
            }
            i10 = 2;
            fbhVar2 = new fbh(map);
        }
        c2hVar.A0();
        string2 = c2hVar.E0().getString("stored_tcf_param", "");
        strA = fbhVar.a();
        if (strA.equals(string2)) {
            SharedPreferences.Editor editorEdit2 = c2hVar.E0().edit();
            editorEdit2.putString("stored_tcf_param", strA);
            editorEdit2.apply();
            bundleB = fbhVar.b();
            w3h.h(w0hVar2);
            w0hVar2.Z.b(bundleB, "Consent generated from Tcf");
            if (bundleB != Bundle.EMPTY) {
                w3hVar.y.getClass();
                c8hVar = this;
                c8hVar.U0(bundleB, -30, System.currentTimeMillis());
            } else {
                c8hVar = this;
            }
            Bundle bundle2 = new Bundle();
            map2 = fbhVar2.a;
            if (map2.isEmpty()) {
                str7 = str;
            } else {
                str7 = str;
            }
            bundleB2 = fbhVar.b();
            bundleB3 = fbhVar2.b();
            if (bundleB2.size() != bundleB3.size()) {
                str8 = str2;
            } else {
                str8 = str;
            }
            bundle2.putString("_tcfm", str7.concat(str8));
            map3 = fbhVar.a;
            str9 = (String) map3.get("PurposeDiagnostics");
            if (TextUtils.isEmpty(str9)) {
                str9 = "200000";
            }
            bundle2.putString("_tcfd2", str9);
            sb = new StringBuilder(str2);
            str10 = (String) map3.get("CmpSdkID");
            if (TextUtils.isEmpty(str10)) {
                i11 = Integer.parseInt(str10);
            } else {
                i11 = -1;
            }
            if (i11 >= 0) {
                sb.append("00");
            } else {
                sb.append("00");
            }
            iC = fbhVar.c();
            if (iC >= 0) {
                sb.append(str);
            } else {
                sb.append(str);
            }
            if (true != str2.equals(map3.get("gdprApplies"))) {
                i12 = 0;
            } else {
                i12 = i10;
            }
            zEquals = str2.equals(map3.get("EnableAdvertiserConsentMode"));
            i13 = i12 | 4;
            if (zEquals) {
                i13 = i12 | 12;
            }
            sb.append("0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ-_".charAt(i13));
            bundle2.putString("_tcfd", sb.toString());
            c8hVar.H0("auto", "_tcf", bundle2);
        }
    }

    public final void H0(String str, String str2, Bundle bundle) {
        long jElapsedRealtime;
        A0();
        w3h w3hVar = (w3h) this.b;
        w3hVar.y.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (w3hVar.d.L0(null, bzg.e1)) {
            w3hVar.y.getClass();
            jElapsedRealtime = SystemClock.elapsedRealtime();
        } else {
            jElapsedRealtime = 0;
        }
        I0(jCurrentTimeMillis, jElapsedRealtime, bundle, str, str2);
    }

    public final void I0(long j, long j2, Bundle bundle, String str, String str2) {
        A0();
        boolean z = true;
        if (this.e != null && !qch.f1(str2)) {
            z = false;
        }
        J0(str, str2, j, j2, bundle, true, z, true);
    }

    /* JADX WARN: Code duplicated, block: B:58:0x013a  */
    /* JADX WARN: Code duplicated, block: B:60:0x0152  */
    /* JADX WARN: Code duplicated, block: B:61:0x0157  */
    public final void J0(String str, String str2, long j, long j2, Bundle bundle, boolean z, boolean z2, boolean z3) {
        String str3;
        c2h c2hVar;
        oid oidVar;
        boolean z4;
        b9h b9hVar;
        long j3;
        boolean zA;
        int i;
        ebh ebhVar;
        long j4;
        int i2;
        long j5;
        ebh ebhVar2;
        boolean zH0;
        ArrayList arrayList;
        Bundle[] bundleArr;
        int i3;
        int length;
        String str4 = str;
        oa7.x(str4);
        oa7.A(bundle);
        A0();
        B0();
        w3h w3hVar = (w3h) this.b;
        boolean zA2 = w3hVar.a();
        ebh ebhVar3 = w3hVar.v;
        qqg qqgVar = w3hVar.d;
        Context context = w3hVar.a;
        qch qchVar = w3hVar.w;
        w0h w0hVar = w3hVar.f;
        if (!zA2) {
            w3h.h(w0hVar);
            w0hVar.Y.a("Event not sent since app measurement is disabled");
            return;
        }
        List list = w3hVar.l().z;
        if (list != null && !list.contains(str2)) {
            w3h.h(w0hVar);
            w0hVar.Y.c(str2, str4, "Dropping non-safelisted event. event name, origin");
            return;
        }
        if (!this.g) {
            this.g = true;
            try {
                try {
                    (!w3hVar.b ? Class.forName("com.google.android.gms.tagmanager.TagManagerService", true, context.getClassLoader()) : Class.forName("com.google.android.gms.tagmanager.TagManagerService")).getDeclaredMethod("initialize", Context.class).invoke(null, context);
                } catch (Exception e) {
                    w3h.h(w0hVar);
                    w0hVar.x.b(e, "Failed to invoke Tag Manager's initialize() method");
                }
            } catch (ClassNotFoundException unused) {
                w3h.h(w0hVar);
                w0hVar.X.a("Tag Manager is not found and thus will not be used");
            }
        }
        i0h i0hVar = w3hVar.x;
        c2h c2hVar2 = w3hVar.e;
        hj6 hj6Var = w3hVar.y;
        if (!qqgVar.L0(null, bzg.Z0) && "_cmp".equals(str2) && bundle.containsKey("gclid")) {
            String string = bundle.getString("gclid");
            hj6Var.getClass();
            str3 = null;
            L0(System.currentTimeMillis(), string, "auto", "_lgclid");
        } else {
            str3 = null;
        }
        if (!z || qch.y[0].equals(str2)) {
            c2hVar = c2hVar2;
        } else {
            w3h.f(qchVar);
            w3h.f(c2hVar2);
            c2hVar = c2hVar2;
            qchVar.N0(bundle, c2hVar.O0.l());
        }
        oid oidVar2 = this.L0;
        if (z3 || "_iap".equals(str2)) {
            oidVar = oidVar2;
        } else {
            w3h.f(qchVar);
            int i4 = 2;
            if (qchVar.E1("event", str2)) {
                oidVar = oidVar2;
                if (qchVar.G1("event", ok8.t, ((w3h) qchVar.b).d.L0(str3, bzg.f1) ? ok8.v : ok8.u, str2)) {
                    i3 = 40;
                    if (qchVar.H1(40, "event", str2)) {
                        i4 = 0;
                    }
                } else {
                    i4 = 13;
                }
                if (i4 != 0) {
                    w3h.h(w0hVar);
                    w0hVar.w.b(i0hVar.a(str2), "Invalid public event name. Event will not be logged (FE)");
                    w3h.f(qchVar);
                    String strH0 = qch.H0(i3, str2, true);
                    if (str2 != null) {
                        length = str2.length();
                    } else {
                        length = 0;
                    }
                    qch.S0(oidVar, null, i4, "_ev", strH0, length);
                    return;
                }
            } else {
                oidVar = oidVar2;
            }
            i3 = 40;
            if (i4 != 0) {
                w3h.h(w0hVar);
                w0hVar.w.b(i0hVar.a(str2), "Invalid public event name. Event will not be logged (FE)");
                w3h.f(qchVar);
                String strH1 = qch.H0(i3, str2, true);
                if (str2 != null) {
                    length = str2.length();
                } else {
                    length = 0;
                }
                qch.S0(oidVar, null, i4, "_ev", strH1, length);
                return;
            }
        }
        b9h b9hVar2 = w3hVar.z;
        w3h.g(b9hVar2);
        t8h t8hVarE0 = b9hVar2.E0(false);
        if (t8hVarE0 != null && !bundle.containsKey("_sc")) {
            t8hVarE0.d = true;
        }
        qch.x1(t8hVarE0, bundle, z && !z3);
        boolean zEquals = "am".equals(str4);
        boolean zF1 = qch.f1(str2);
        if (!z || this.e == null || zF1) {
            z4 = zEquals;
        } else {
            if (!zEquals) {
                w3h.h(w0hVar);
                w0hVar.Y.c(i0hVar.a(str2), i0hVar.e(bundle), "Passing event to registered event handler (FE)");
                oa7.A(this.e);
                gsg gsgVar = this.e;
                gsgVar.getClass();
                try {
                    ((nvg) gsgVar.a).g(str4, str2, bundle, j);
                    return;
                } catch (RemoteException e2) {
                    w3h w3hVar2 = ((AppMeasurementDynamiteService) gsgVar.b).d;
                    if (w3hVar2 != null) {
                        w0h w0hVar2 = w3hVar2.f;
                        w3h.h(w0hVar2);
                        w0hVar2.x.b(e2, "Event interceptor threw exception");
                        return;
                    }
                    return;
                }
            }
            z4 = true;
        }
        if (w3hVar.c()) {
            w3h.f(qchVar);
            w3h w3hVar3 = (w3h) qchVar.b;
            int iI1 = qchVar.I1(str2);
            if (iI1 != 0) {
                w3h.h(w0hVar);
                w0hVar.w.b(i0hVar.a(str2), "Invalid event name. Event will not be logged (FE)");
                String strH2 = qch.H0(40, str2, true);
                int length2 = str2 != null ? str2.length() : 0;
                w3h.f(qchVar);
                qch.S0(oidVar, null, iI1, "_ev", strH2, length2);
                return;
            }
            Bundle bundleK0 = qchVar.K0(str2, bundle, bzd.D("_o", "_sn", "_sc", "_si"), z3);
            oa7.A(bundleK0);
            w3h.g(b9hVar2);
            String str5 = "_o";
            if (b9hVar2.E0(false) == null || !"_ae".equals(str2)) {
                b9hVar = b9hVar2;
                j3 = 0;
            } else {
                w3h.g(ebhVar3);
                y21 y21Var = ebhVar3.g;
                ((w3h) ((ebh) y21Var.d).b).y.getClass();
                j3 = 0;
                long jElapsedRealtime = SystemClock.elapsedRealtime();
                b9hVar = b9hVar2;
                long j6 = jElapsedRealtime - y21Var.b;
                y21Var.b = jElapsedRealtime;
                if (j6 > 0) {
                    qchVar.n1(bundleK0, j6);
                }
            }
            if (!"auto".equals(str4) && "_ssr".equals(str2)) {
                String string2 = bundleK0.getString("_ffr");
                int i5 = u4e.a;
                if (string2 == null || string2.trim().isEmpty()) {
                    string2 = null;
                } else if (string2 != null) {
                    string2 = string2.trim();
                }
                c2h c2hVar3 = w3hVar3.e;
                w3h.f(c2hVar3);
                if (Objects.equals(string2, c2hVar3.L0.C())) {
                    w0h w0hVar3 = w3hVar3.f;
                    w3h.h(w0hVar3);
                    w0hVar3.Y.a("Not logging duplicate session_start_with_rollout event");
                    return;
                } else {
                    c2h c2hVar4 = w3hVar3.e;
                    w3h.f(c2hVar4);
                    c2hVar4.L0.D(string2);
                }
            } else if ("_ae".equals(str2)) {
                c2h c2hVar5 = w3hVar3.e;
                w3h.f(c2hVar5);
                String strC = c2hVar5.L0.C();
                if (!TextUtils.isEmpty(strC)) {
                    bundleK0.putString("_ffr", strC);
                }
            }
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(bundleK0);
            if (qqgVar.L0(null, bzg.S0)) {
                w3h.g(ebhVar3);
                ebhVar3.A0();
                zA = ebhVar3.e;
            } else {
                w3h.f(c2hVar);
                zA = c2hVar.I0.a();
            }
            w3h.f(c2hVar);
            if (c2hVar.F0.a() > j3) {
                ebhVar = ebhVar3;
                j5 = j;
                if (c2hVar.J0(j5) && zA) {
                    w3h.h(w0hVar);
                    w0hVar.Z.a("Current session is expired, remove the session number, ID, and engagement time");
                    hj6Var.getClass();
                    i = 1;
                    i2 = 0;
                    L0(System.currentTimeMillis(), null, "auto", "_sid");
                    L0(System.currentTimeMillis(), null, "auto", "_sno");
                    L0(System.currentTimeMillis(), null, "auto", "_se");
                    j4 = j3;
                    c2hVar.G0.b(j4);
                } else {
                    i = 1;
                    j4 = j3;
                    i2 = 0;
                }
            } else {
                i = 1;
                ebhVar = ebhVar3;
                j4 = j3;
                i2 = 0;
                j5 = j;
            }
            if (bundleK0.getLong("extend_session", j4) == 1) {
                w3h.h(w0hVar);
                w0hVar.Z.a("EXTEND_SESSION param attached: initiate a new session or extend the current active session");
                w3h.g(ebhVar);
                ebhVar2 = ebhVar;
                ebhVar2.f.m(j5, j2);
            } else {
                ebhVar2 = ebhVar;
            }
            ArrayList arrayList3 = new ArrayList(bundleK0.keySet());
            Collections.sort(arrayList3);
            int size = arrayList3.size();
            int i6 = i2;
            while (i6 < size) {
                String str6 = (String) arrayList3.get(i6);
                if (str6 != null) {
                    w3h.f(qchVar);
                    Object obj = bundleK0.get(str6);
                    arrayList = arrayList3;
                    if (obj instanceof Bundle) {
                        bundleArr = new Bundle[i];
                        bundleArr[i2] = (Bundle) obj;
                    } else if (obj instanceof Parcelable[]) {
                        Parcelable[] parcelableArr = (Parcelable[]) obj;
                        bundleArr = (Bundle[]) Arrays.copyOf(parcelableArr, parcelableArr.length, Bundle[].class);
                    } else if (obj instanceof ArrayList) {
                        ArrayList arrayList4 = (ArrayList) obj;
                        bundleArr = (Bundle[]) arrayList4.toArray(new Bundle[arrayList4.size()]);
                    } else {
                        bundleArr = null;
                    }
                    if (bundleArr != null) {
                        bundleK0.putParcelableArray(str6, bundleArr);
                    }
                } else {
                    arrayList = arrayList3;
                }
                i6++;
                arrayList3 = arrayList;
                i = 1;
            }
            int i7 = i2;
            while (i7 < arrayList2.size()) {
                Bundle bundleH1 = (Bundle) arrayList2.get(i7);
                String str7 = i7 != 0 ? "_ep" : str2;
                String str8 = str5;
                bundleH1.putString(str8, str4);
                if (z2) {
                    bundleH1 = qchVar.h1(bundleH1);
                }
                Bundle bundle2 = bundleH1;
                hsg hsgVar = new hsg(str7, new esg(bundleH1), str4, j5, j2);
                lah lahVarJ = w3hVar.j();
                lahVarJ.getClass();
                lahVarJ.A0();
                lahVarJ.B0();
                lahVarJ.M0();
                f0h f0hVarI = ((w3h) lahVarJ.b).i();
                f0hVarI.getClass();
                Parcel parcelObtain = Parcel.obtain();
                njg.a(hsgVar, parcelObtain, i2);
                byte[] bArrMarshall = parcelObtain.marshall();
                parcelObtain.recycle();
                if (bArrMarshall.length > 131072) {
                    w0h w0hVar4 = ((w3h) f0hVarI.b).f;
                    w3h.h(w0hVar4);
                    w0hVar4.v.a("Event is too long for local database. Sending event directly to service");
                    zH0 = false;
                } else {
                    zH0 = f0hVarI.H0(bArrMarshall, 0);
                }
                lahVarJ.O0(new gzg(lahVarJ, lahVarJ.Q0(true), zH0, hsgVar, 2));
                if (!z4) {
                    Iterator it = this.f.iterator();
                    while (it.hasNext()) {
                        ((x5h) it.next()).a(str, str2, new Bundle(bundle2), j);
                    }
                }
                i7++;
                str4 = str;
                j5 = j;
                str5 = str8;
                i2 = 0;
            }
            w3h.g(b9hVar);
            if (b9hVar.E0(false) == null || !"_ae".equals(str2)) {
                return;
            }
            w3h.g(ebhVar2);
            hj6Var.getClass();
            ebhVar2.g.n(SystemClock.elapsedRealtime(), true, true);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0021  */
    public final void K0(String str, String str2, Object obj, boolean z, long j) {
        int iK1;
        int length;
        w3h w3hVar = (w3h) this.b;
        if (z) {
            qch qchVar = w3hVar.w;
            w3h.f(qchVar);
            iK1 = qchVar.K1(str2);
        } else {
            qch qchVar2 = w3hVar.w;
            w3h.f(qchVar2);
            if (!qchVar2.E1("user property", str2)) {
                iK1 = 6;
            } else if (qchVar2.G1("user property", if9.q, null, str2)) {
                qqg qqgVar = ((w3h) qchVar2.b).d;
                if (qchVar2.H1(24, "user property", str2)) {
                    iK1 = 0;
                } else {
                    iK1 = 6;
                }
            } else {
                iK1 = 15;
            }
        }
        oid oidVar = this.L0;
        if (iK1 != 0) {
            w3h.f(w3hVar.w);
            String strH0 = qch.H0(24, str2, true);
            length = str2 != null ? str2.length() : 0;
            w3h.f(w3hVar.w);
            qch.S0(oidVar, null, iK1, "_ev", strH0, length);
            return;
        }
        String str3 = str == null ? "app" : str;
        if (obj == null) {
            m3h m3hVar = w3hVar.g;
            w3h.h(m3hVar);
            m3hVar.J0(new q0f(this, str3, str2, null, j, 2));
            return;
        }
        qch qchVar3 = w3hVar.w;
        qch qchVar4 = w3hVar.w;
        w3h.f(qchVar3);
        int iP0 = qchVar3.P0(obj, str2);
        if (iP0 != 0) {
            w3h.f(qchVar4);
            String strH1 = qch.H0(24, str2, true);
            length = ((obj instanceof String) || (obj instanceof CharSequence)) ? obj.toString().length() : 0;
            w3h.f(qchVar4);
            qch.S0(oidVar, null, iP0, "_ev", strH1, length);
            return;
        }
        w3h.f(qchVar4);
        Object objQ0 = qchVar4.Q0(obj, str2);
        if (objQ0 != null) {
            m3h m3hVar2 = w3hVar.g;
            w3h.h(m3hVar2);
            m3hVar2.J0(new q0f(this, str3, str2, objQ0, j, 2));
        }
    }

    /* JADX WARN: Code duplicated, block: B:16:0x0055 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:17:0x0057  */
    /* JADX WARN: Code duplicated, block: B:18:0x0064  */
    public final void L0(long j, Object obj, String str, String str2) {
        String str3;
        boolean zH0;
        Object objValueOf = obj;
        w3h w3hVar = (w3h) this.b;
        oa7.x(str);
        oa7.x(str2);
        A0();
        B0();
        if ("allow_personalized_ads".equals(str2)) {
            String str4 = "_npa";
            if (objValueOf instanceof String) {
                String str5 = (String) objValueOf;
                if (!TextUtils.isEmpty(str5)) {
                    long j2 = true != "false".equals(str5.toLowerCase(Locale.ENGLISH)) ? 0L : 1L;
                    objValueOf = Long.valueOf(j2);
                    c2h c2hVar = w3hVar.e;
                    w3h.f(c2hVar);
                    c2hVar.Y.D(j2 == 1 ? "true" : "false");
                } else if (objValueOf == null) {
                    c2h c2hVar2 = w3hVar.e;
                    w3h.f(c2hVar2);
                    c2hVar2.Y.D("unset");
                } else {
                    str4 = str2;
                }
            } else if (objValueOf == null) {
                c2h c2hVar3 = w3hVar.e;
                w3h.f(c2hVar3);
                c2hVar3.Y.D("unset");
            } else {
                str4 = str2;
            }
            w0h w0hVar = w3hVar.f;
            w3h.h(w0hVar);
            w0hVar.Z.c("non_personalized_ads(_npa)", objValueOf, "Setting user property(FE)");
            str3 = str4;
        } else {
            str3 = str2;
        }
        Object obj2 = objValueOf;
        if (!w3hVar.a()) {
            w0h w0hVar2 = w3hVar.f;
            w3h.h(w0hVar2);
            w0hVar2.Z.a("User property not set since app measurement is disabled");
            return;
        }
        if (w3hVar.c()) {
            mch mchVar = new mch(j, obj2, str3, str);
            lah lahVarJ = w3hVar.j();
            lahVarJ.A0();
            lahVarJ.B0();
            lahVarJ.M0();
            f0h f0hVarI = ((w3h) lahVarJ.b).i();
            f0hVarI.getClass();
            Parcel parcelObtain = Parcel.obtain();
            s5h.b(mchVar, parcelObtain);
            byte[] bArrMarshall = parcelObtain.marshall();
            parcelObtain.recycle();
            if (bArrMarshall.length > 131072) {
                w0h w0hVar3 = ((w3h) f0hVarI.b).f;
                w3h.h(w0hVar3);
                w0hVar3.v.a("User property too long for local database. Sending directly to service");
                zH0 = false;
            } else {
                zH0 = f0hVarI.H0(bArrMarshall, 1);
            }
            lahVarJ.O0(new gzg(lahVarJ, lahVarJ.Q0(true), zH0, mchVar, 1));
        }
    }

    public final void M0() {
        A0();
        B0();
        w3h w3hVar = (w3h) this.b;
        if (w3hVar.c()) {
            qqg qqgVar = w3hVar.d;
            ((w3h) qqgVar.b).getClass();
            Boolean boolN0 = qqgVar.N0("google_analytics_deferred_deep_link_enabled");
            if (boolN0 != null && boolN0.booleanValue()) {
                w0h w0hVar = w3hVar.f;
                w3h.h(w0hVar);
                w0hVar.Y.a("Deferred Deep Link feature enabled.");
                m3h m3hVar = w3hVar.g;
                w3h.h(m3hVar);
                m3hVar.J0(new c6h(this, 2));
            }
            lah lahVarJ = w3hVar.j();
            lahVarJ.A0();
            lahVarJ.B0();
            ndh ndhVarQ0 = lahVarJ.Q0(true);
            lahVarJ.M0();
            w3h w3hVar2 = (w3h) lahVarJ.b;
            w3hVar2.d.L0(null, bzg.W0);
            w3hVar2.i().H0(new byte[0], 3);
            lahVarJ.O0(new n9h(lahVarJ, ndhVarQ0, 0));
            this.H0 = false;
            c2h c2hVar = w3hVar.e;
            w3h.f(c2hVar);
            c2hVar.A0();
            String string = c2hVar.E0().getString("previous_os_version", null);
            ((w3h) c2hVar.b).k().C0();
            String str = Build.VERSION.RELEASE;
            if (!TextUtils.isEmpty(str) && !str.equals(string)) {
                SharedPreferences.Editor editorEdit = c2hVar.E0().edit();
                editorEdit.putString("previous_os_version", str);
                editorEdit.apply();
            }
            if (TextUtils.isEmpty(string)) {
                return;
            }
            w3hVar.k().C0();
            if (string.equals(str)) {
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putString("_po", string);
            H0("auto", "_ou", bundle);
        }
    }

    public final void N0(Bundle bundle, long j) {
        w3h w3hVar = (w3h) this.b;
        oa7.A(bundle);
        Bundle bundle2 = new Bundle(bundle);
        if (!TextUtils.isEmpty(bundle2.getString("app_id"))) {
            w0h w0hVar = w3hVar.f;
            w3h.h(w0hVar);
            w0hVar.x.a("Package name should be null when calling setConditionalUserProperty");
        }
        bundle2.remove("app_id");
        afc.v(bundle2, "app_id", String.class, null);
        afc.v(bundle2, "origin", String.class, null);
        afc.v(bundle2, "name", String.class, null);
        afc.v(bundle2, "value", Object.class, null);
        afc.v(bundle2, "trigger_event_name", String.class, null);
        afc.v(bundle2, "trigger_timeout", Long.class, 0L);
        afc.v(bundle2, "timed_out_event_name", String.class, null);
        afc.v(bundle2, "timed_out_event_params", Bundle.class, null);
        afc.v(bundle2, "triggered_event_name", String.class, null);
        afc.v(bundle2, "triggered_event_params", Bundle.class, null);
        afc.v(bundle2, "time_to_live", Long.class, 0L);
        afc.v(bundle2, "expired_event_name", String.class, null);
        afc.v(bundle2, "expired_event_params", Bundle.class, null);
        oa7.x(bundle2.getString("name"));
        oa7.x(bundle2.getString("origin"));
        oa7.A(bundle2.get("value"));
        bundle2.putLong("creation_timestamp", j);
        String string = bundle2.getString("name");
        Object obj = bundle2.get("value");
        qch qchVar = w3hVar.w;
        i0h i0hVar = w3hVar.x;
        w0h w0hVar2 = w3hVar.f;
        w3h.f(qchVar);
        if (qchVar.K1(string) != 0) {
            w3h.h(w0hVar2);
            w0hVar2.g.b(i0hVar.c(string), "Invalid conditional user property name");
            return;
        }
        w3h.f(qchVar);
        if (qchVar.P0(obj, string) != 0) {
            w3h.h(w0hVar2);
            w0hVar2.g.c(i0hVar.c(string), obj, "Invalid conditional user property value");
            return;
        }
        Object objQ0 = qchVar.Q0(obj, string);
        if (objQ0 == null) {
            w3h.h(w0hVar2);
            w0hVar2.g.c(i0hVar.c(string), obj, "Unable to normalize conditional user property value");
            return;
        }
        afc.u(bundle2, objQ0);
        long j2 = bundle2.getLong("trigger_timeout");
        if (!TextUtils.isEmpty(bundle2.getString("trigger_event_name")) && (j2 > 15552000000L || j2 < 1)) {
            w3h.h(w0hVar2);
            w0hVar2.g.c(i0hVar.c(string), Long.valueOf(j2), "Invalid conditional user property timeout");
            return;
        }
        long j3 = bundle2.getLong("time_to_live");
        if (j3 > 15552000000L || j3 < 1) {
            w3h.h(w0hVar2);
            w0hVar2.g.c(i0hVar.c(string), Long.valueOf(j3), "Invalid conditional user property time to live");
        } else {
            m3h m3hVar = w3hVar.g;
            w3h.h(m3hVar);
            m3hVar.J0(new n6h(1, this, bundle2));
        }
    }

    public final void O0(String str, String str2, Bundle bundle) {
        w3h w3hVar = (w3h) this.b;
        w3hVar.y.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis();
        oa7.x(str);
        Bundle bundle2 = new Bundle();
        bundle2.putString("name", str);
        bundle2.putLong("creation_timestamp", jCurrentTimeMillis);
        if (str2 != null) {
            bundle2.putString("expired_event_name", str2);
            bundle2.putBundle("expired_event_params", bundle);
        }
        m3h m3hVar = w3hVar.g;
        w3h.h(m3hVar);
        m3hVar.J0(new w36(this, bundle2, false, 24));
    }

    public final String P0() {
        w3h w3hVar = (w3h) this.b;
        try {
            return rfc.t(w3hVar.a, w3hVar.E0);
        } catch (IllegalStateException e) {
            w0h w0hVar = w3hVar.f;
            w3h.h(w0hVar);
            w0hVar.g.b(e, "getGoogleAppId failed with exception");
            return null;
        }
    }

    public final void Q0(q5h q5hVar, long j, boolean z) {
        int i = q5hVar.b;
        A0();
        B0();
        w3h w3hVar = (w3h) this.b;
        c2h c2hVar = w3hVar.e;
        w0h w0hVar = w3hVar.f;
        w3h.f(c2hVar);
        q5h q5hVarH0 = c2hVar.H0();
        if (j <= this.F0 && q5h.l(q5hVarH0.b, i)) {
            w3h.h(w0hVar);
            w0hVar.X.b(q5hVar, "Dropped out-of-date consent setting, proposed settings");
            return;
        }
        c2h c2hVar2 = w3hVar.e;
        w3h.f(c2hVar2);
        c2hVar2.A0();
        if (!q5h.l(i, c2hVar2.E0().getInt("consent_source", 100))) {
            w3h.h(w0hVar);
            w0hVar.X.b(Integer.valueOf(i), "Lower precedence consent source ignored, proposed source");
            return;
        }
        SharedPreferences.Editor editorEdit = c2hVar2.E0().edit();
        editorEdit.putString("consent_settings", q5hVar.g());
        editorEdit.putInt("consent_source", i);
        editorEdit.apply();
        w3h.h(w0hVar);
        w0hVar.Z.b(q5hVar, "Setting storage consent(FE)");
        this.F0 = j;
        if (w3hVar.j().K0()) {
            lah lahVarJ = w3hVar.j();
            lahVarJ.A0();
            lahVarJ.B0();
            lahVarJ.O0(new dah(lahVarJ, 2));
        } else {
            lah lahVarJ2 = w3hVar.j();
            lahVarJ2.A0();
            lahVarJ2.B0();
            if (lahVarJ2.J0()) {
                lahVarJ2.O0(new p9h(lahVarJ2, lahVarJ2.Q0(false), 1));
            }
        }
        if (z) {
            w3hVar.j().E0(new AtomicReference());
        }
    }

    public final void R0(Boolean bool, boolean z) {
        A0();
        B0();
        w3h w3hVar = (w3h) this.b;
        w0h w0hVar = w3hVar.f;
        w3h.h(w0hVar);
        w0hVar.Y.b(bool, "Setting app measurement enabled (FE)");
        c2h c2hVar = w3hVar.e;
        w3h.f(c2hVar);
        c2hVar.A0();
        SharedPreferences.Editor editorEdit = c2hVar.E0().edit();
        if (bool != null) {
            editorEdit.putBoolean("measurement_enabled", bool.booleanValue());
        } else {
            editorEdit.remove("measurement_enabled");
        }
        editorEdit.apply();
        if (z) {
            c2hVar.A0();
            SharedPreferences.Editor editorEdit2 = c2hVar.E0().edit();
            if (bool != null) {
                editorEdit2.putBoolean("measurement_enabled_from_api", bool.booleanValue());
            } else {
                editorEdit2.remove("measurement_enabled_from_api");
            }
            editorEdit2.apply();
        }
        m3h m3hVar = w3hVar.g;
        w3h.h(m3hVar);
        m3hVar.A0();
        if (w3hVar.O0 || !(bool == null || bool.booleanValue())) {
            S0();
        }
    }

    public final void S0() {
        A0();
        w3h w3hVar = (w3h) this.b;
        c2h c2hVar = w3hVar.e;
        w0h w0hVar = w3hVar.f;
        hj6 hj6Var = w3hVar.y;
        w3h.f(c2hVar);
        String strC = c2hVar.Y.C();
        int i = 1;
        if (strC != null) {
            if ("unset".equals(strC)) {
                hj6Var.getClass();
                L0(System.currentTimeMillis(), null, "app", "_npa");
            } else {
                Long lValueOf = Long.valueOf(true != "true".equals(strC) ? 0L : 1L);
                hj6Var.getClass();
                L0(System.currentTimeMillis(), lValueOf, "app", "_npa");
            }
        }
        if (!w3hVar.a() || !this.H0) {
            w3h.h(w0hVar);
            w0hVar.Y.a("Updating Scion state (FE)");
            lah lahVarJ = w3hVar.j();
            lahVarJ.A0();
            lahVarJ.B0();
            lahVarJ.O0(new n9h(lahVarJ, lahVarJ.Q0(true), i));
            return;
        }
        w3h.h(w0hVar);
        w0hVar.Y.a("Recording app launch after enabling measurement for the first time (FE)");
        M0();
        ebh ebhVar = w3hVar.v;
        w3h.g(ebhVar);
        ebhVar.f.k();
        m3h m3hVar = w3hVar.g;
        w3h.h(m3hVar);
        m3hVar.J0(new c6h(this, i));
    }

    public final void T0() {
        w3h w3hVar = (w3h) this.b;
        if (!(w3hVar.a.getApplicationContext() instanceof Application) || this.d == null) {
            return;
        }
        ((Application) w3hVar.a.getApplicationContext()).unregisterActivityLifecycleCallbacks(this.d);
    }

    public final void U0(Bundle bundle, int i, long j) {
        Boolean bool;
        String string;
        k5h k5hVar;
        Boolean bool2;
        w3h w3hVar = (w3h) this.b;
        B0();
        q5h q5hVar = q5h.c;
        o5h[] o5hVarArrB = m5h.STORAGE.b();
        int length = o5hVarArrB.length;
        int i2 = 0;
        while (true) {
            bool = null;
            if (i2 >= length) {
                string = null;
                break;
            }
            String str = o5hVarArrB[i2].zze;
            if (bundle.containsKey(str) && (string = bundle.getString(str)) != null) {
                if (string.equals("granted")) {
                    bool2 = Boolean.TRUE;
                } else {
                    bool2 = string.equals("denied") ? Boolean.FALSE : null;
                }
                if (bool2 == null) {
                    break;
                }
            }
            i2++;
        }
        if (string != null) {
            w0h w0hVar = w3hVar.f;
            w3h.h(w0hVar);
            w0hVar.z.b(string, "Ignoring invalid consent setting");
            w0h w0hVar2 = w3hVar.f;
            w3h.h(w0hVar2);
            w0hVar2.z.a("Valid consent values are 'granted', 'denied'");
        }
        m3h m3hVar = w3hVar.g;
        w3h.h(m3hVar);
        boolean zG0 = m3hVar.G0();
        q5h q5hVarB = q5h.b(i, bundle);
        Iterator it = q5hVarB.a.values().iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            k5hVar = k5h.UNINITIALIZED;
            if (!zHasNext) {
                break;
            } else if (((k5h) it.next()) != k5hVar) {
                W0(q5hVarB, zG0);
                break;
            }
        }
        xrg xrgVarC = xrg.c(i, bundle);
        Iterator it2 = xrgVarC.e.values().iterator();
        while (it2.hasNext()) {
            if (((k5h) it2.next()) != k5hVar) {
                V0(xrgVarC, zG0);
                break;
            }
        }
        if (bundle != null) {
            int iOrdinal = q5h.d(bundle.getString("ad_personalization")).ordinal();
            if (iOrdinal == 2) {
                bool = Boolean.FALSE;
            } else if (iOrdinal == 3) {
                bool = Boolean.TRUE;
            }
        }
        if (bool != null) {
            String str2 = i == -30 ? "tcf" : "app";
            if (zG0) {
                L0(j, bool.toString(), str2, "allow_personalized_ads");
            } else {
                K0(str2, "allow_personalized_ads", bool.toString(), false, j);
            }
        }
    }

    public final void V0(xrg xrgVar, boolean z) {
        lwg lwgVar = new lwg(this, xrgVar, false, 26);
        if (z) {
            A0();
            lwgVar.run();
        } else {
            m3h m3hVar = ((w3h) this.b).g;
            w3h.h(m3hVar);
            m3hVar.J0(lwgVar);
        }
    }

    public final void W0(q5h q5hVar, boolean z) {
        boolean z2;
        boolean z3;
        boolean z4;
        q5h q5hVar2;
        B0();
        int i = q5hVar.b;
        if (i != -10) {
            k5h k5hVar = (k5h) q5hVar.a.get(o5h.AD_STORAGE);
            if (k5hVar == null) {
                k5hVar = k5h.UNINITIALIZED;
            }
            k5h k5hVar2 = k5h.UNINITIALIZED;
            if (k5hVar == k5hVar2) {
                k5h k5hVar3 = (k5h) q5hVar.a.get(o5h.ANALYTICS_STORAGE);
                if (k5hVar3 == null) {
                    k5hVar3 = k5hVar2;
                }
                if (k5hVar3 == k5hVar2) {
                    w0h w0hVar = ((w3h) this.b).f;
                    w3h.h(w0hVar);
                    w0hVar.z.a("Ignoring empty consent settings");
                    return;
                }
            }
        }
        synchronized (this.w) {
            try {
                z2 = false;
                if (q5h.l(i, this.Z.b)) {
                    q5h q5hVar3 = this.Z;
                    EnumMap enumMap = q5hVar.a;
                    o5h[] o5hVarArr = (o5h[]) enumMap.keySet().toArray(new o5h[0]);
                    int length = o5hVarArr.length;
                    int i2 = 0;
                    while (true) {
                        if (i2 >= length) {
                            z3 = false;
                            break;
                        }
                        o5h o5hVar = o5hVarArr[i2];
                        k5h k5hVar4 = (k5h) enumMap.get(o5hVar);
                        k5h k5hVar5 = (k5h) q5hVar3.a.get(o5hVar);
                        k5h k5hVar6 = k5h.DENIED;
                        if (k5hVar4 == k5hVar6 && k5hVar5 != k5hVar6) {
                            z3 = true;
                            break;
                        }
                        i2++;
                    }
                    o5h o5hVar2 = o5h.ANALYTICS_STORAGE;
                    if (q5hVar.i(o5hVar2) && !this.Z.i(o5hVar2)) {
                        z2 = true;
                    }
                    q5hVar = q5hVar.k(this.Z);
                    this.Z = q5hVar;
                    z4 = z2;
                    z2 = true;
                } else {
                    z3 = false;
                    z4 = false;
                }
                q5hVar2 = q5hVar;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (!z2) {
            w0h w0hVar2 = ((w3h) this.b).f;
            w3h.h(w0hVar2);
            w0hVar2.X.b(q5hVar2, "Ignoring lower-priority consent settings, proposed settings");
            return;
        }
        long andIncrement = this.E0.getAndIncrement();
        if (z3) {
            this.v.set(null);
            f7h f7hVar = new f7h(this, q5hVar2, andIncrement, z4, 0);
            if (z) {
                A0();
                f7hVar.run();
                return;
            } else {
                m3h m3hVar = ((w3h) this.b).g;
                w3h.h(m3hVar);
                m3hVar.L0(f7hVar);
                return;
            }
        }
        f7h f7hVar2 = new f7h(this, q5hVar2, andIncrement, z4, 1);
        if (z) {
            A0();
            f7hVar2.run();
        } else if (i == 30 || i == -10) {
            m3h m3hVar2 = ((w3h) this.b).g;
            w3h.h(m3hVar2);
            m3hVar2.L0(f7hVar2);
        } else {
            m3h m3hVar3 = ((w3h) this.b).g;
            w3h.h(m3hVar3);
            m3hVar3.J0(f7hVar2);
        }
    }

    public final void X0() {
        upg.a();
        w3h w3hVar = (w3h) this.b;
        qqg qqgVar = w3hVar.d;
        m3h m3hVar = w3hVar.g;
        w0h w0hVar = w3hVar.f;
        if (qqgVar.L0(null, bzg.P0)) {
            w3h.h(m3hVar);
            if (m3hVar.G0()) {
                w3h.h(w0hVar);
                w0hVar.g.a("Cannot get trigger URIs from analytics worker thread");
                return;
            }
            if (w1e.m()) {
                w3h.h(w0hVar);
                w0hVar.g.a("Cannot get trigger URIs from main thread");
                return;
            }
            B0();
            w3h.h(w0hVar);
            w0hVar.Z.a("Getting trigger URIs (FE)");
            AtomicReference atomicReference = new AtomicReference();
            w3h.h(m3hVar);
            m3hVar.K0(atomicReference, 10000L, "get trigger URIs", new a7h(this, atomicReference, 1));
            final List list = (List) atomicReference.get();
            if (list == null) {
                w3h.h(w0hVar);
                w0hVar.w.a("Timed out waiting for get trigger URIs");
            } else {
                w3h.h(m3hVar);
                m3hVar.J0(new Runnable() { // from class: q7h
                    @Override // java.lang.Runnable
                    public final void run() {
                        c8h c8hVar = this.a;
                        c8hVar.A0();
                        if (Build.VERSION.SDK_INT < 30) {
                            return;
                        }
                        c2h c2hVar = ((w3h) c8hVar.b).e;
                        w3h.f(c2hVar);
                        SparseArray sparseArrayG0 = c2hVar.G0();
                        for (kbh kbhVar : list) {
                            int i = kbhVar.c;
                            if (!sparseArrayG0.contains(i) || ((Long) sparseArrayG0.get(i)).longValue() < kbhVar.b) {
                                c8hVar.Y0().add(kbhVar);
                            }
                        }
                        c8hVar.Z0();
                    }
                });
            }
        }
    }

    public final PriorityQueue Y0() {
        PriorityQueue priorityQueue = this.Y;
        if (priorityQueue != null) {
            return priorityQueue;
        }
        PriorityQueue priorityQueue2 = new PriorityQueue(Comparator.comparing(r7h.a, kv8.c));
        this.Y = priorityQueue2;
        return priorityQueue2;
    }

    public final void Z0() {
        kbh kbhVar;
        A0();
        if (Y0().isEmpty() || this.x || (kbhVar = (kbh) Y0().poll()) == null) {
            return;
        }
        w3h w3hVar = (w3h) this.b;
        qch qchVar = w3hVar.w;
        w3h.f(qchVar);
        io8 io8VarW0 = qchVar.W0();
        if (io8VarW0 != null) {
            this.x = true;
            w0h w0hVar = w3hVar.f;
            w3h.h(w0hVar);
            tz0 tz0Var = w0hVar.Z;
            String str = kbhVar.a;
            tz0Var.b(str, "Registering trigger URI");
            m88 m88VarE = io8VarW0.e(Uri.parse(str));
            boolean z = false;
            byte b = 0;
            if (m88VarE != null) {
                m88VarE.b(new v36(b == true ? 1 : 0, m88VarE, new gsg(this, kbhVar, z)), new dd7(4, this));
            } else {
                this.x = false;
                Y0().add(kbhVar);
            }
        }
    }

    public final void a1(q5h q5hVar) {
        A0();
        boolean z = (q5hVar.i(o5h.ANALYTICS_STORAGE) && q5hVar.i(o5h.AD_STORAGE)) || ((w3h) this.b).j().J0();
        w3h w3hVar = (w3h) this.b;
        m3h m3hVar = w3hVar.g;
        w3h.h(m3hVar);
        m3hVar.A0();
        if (z != w3hVar.O0) {
            m3h m3hVar2 = w3hVar.g;
            w3h.h(m3hVar2);
            m3hVar2.A0();
            w3hVar.O0 = z;
            c2h c2hVar = ((w3h) this.b).e;
            w3h.f(c2hVar);
            c2hVar.A0();
            Boolean boolValueOf = c2hVar.E0().contains("measurement_enabled_from_api") ? Boolean.valueOf(c2hVar.E0().getBoolean("measurement_enabled_from_api", true)) : null;
            if (!z || boolValueOf == null || boolValueOf.booleanValue()) {
                R0(Boolean.valueOf(z), false);
            }
        }
    }
}
