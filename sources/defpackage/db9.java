package defpackage;

import ai.askquin.ui.divination.k;
import android.content.Context;
import android.os.Bundle;
import android.os.Parcelable;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import net.xmind.donut.gp.GooglePay;
import net.xmind.donut.gp.SocialShareManager;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class db9 implements l26 {
    public final /* synthetic */ int a;

    public /* synthetic */ db9(int i) {
        this.a = i;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) throws nv3 {
        LinkedHashMap linkedHashMap;
        int i = this.a;
        Bundle bundleR = null;
        wef wefVar = wef.a;
        switch (i) {
            case 0:
                cb9 cb9Var = (cb9) obj2;
                ma9 ma9Var = cb9Var.b;
                LinkedHashMap linkedHashMap2 = ma9Var.m;
                ad0<da9> ad0Var = ma9Var.f;
                LinkedHashMap linkedHashMap3 = ma9Var.l;
                ArrayList arrayList = new ArrayList();
                Bundle bundleR2 = feg.r((iy9[]) Arrays.copyOf(new iy9[0], 0));
                for (Map.Entry entry : bm8.X(ma9Var.s.a).entrySet()) {
                    ((fc9) entry.getValue()).getClass();
                }
                if (!arrayList.isEmpty()) {
                    bundleR = feg.r((iy9[]) Arrays.copyOf(new iy9[0], 0));
                    ndc.i(bundleR2, "android-support-nav:controller:navigatorState:names", arrayList);
                    bundleR.putBundle("android-support-nav:controller:navigatorState", bundleR2);
                }
                if (ad0Var.isEmpty()) {
                    linkedHashMap = linkedHashMap2;
                } else {
                    if (bundleR == null) {
                        bundleR = feg.r((iy9[]) Arrays.copyOf(new iy9[0], 0));
                    }
                    ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>();
                    for (da9 da9Var : ad0Var) {
                        da9Var.getClass();
                        int i2 = da9Var.b.b.b;
                        String str = da9Var.f;
                        fa9 fa9Var = da9Var.v;
                        Bundle bundleA = fa9Var.a();
                        LinkedHashMap linkedHashMap4 = linkedHashMap2;
                        Bundle bundleR3 = feg.r((iy9[]) Arrays.copyOf(new iy9[0], 0));
                        fa9Var.h.q(bundleR3);
                        Bundle bundleR4 = feg.r((iy9[]) Arrays.copyOf(new iy9[0], 0));
                        bundleR4.putString("nav-entry-state:id", str);
                        bundleR4.putInt("nav-entry-state:destination-id", i2);
                        if (bundleA == null) {
                            bundleA = feg.r((iy9[]) Arrays.copyOf(new iy9[0], 0));
                        }
                        bundleR4.putBundle("nav-entry-state:args", bundleA);
                        bundleR4.putBundle("nav-entry-state:saved-state", bundleR3);
                        arrayList2.add(bundleR4);
                        linkedHashMap2 = linkedHashMap4;
                    }
                    linkedHashMap = linkedHashMap2;
                    bundleR.putParcelableArrayList("android-support-nav:controller:backStack", arrayList2);
                }
                if (!linkedHashMap3.isEmpty()) {
                    if (bundleR == null) {
                        bundleR = feg.r((iy9[]) Arrays.copyOf(new iy9[0], 0));
                    }
                    int[] iArr = new int[linkedHashMap3.size()];
                    ArrayList arrayList3 = new ArrayList();
                    int i3 = 0;
                    for (Map.Entry entry2 : linkedHashMap3.entrySet()) {
                        int iIntValue = ((Number) entry2.getKey()).intValue();
                        String str2 = (String) entry2.getValue();
                        int i4 = i3 + 1;
                        iArr[i3] = iIntValue;
                        if (str2 == null) {
                            str2 = "";
                        }
                        arrayList3.add(str2);
                        i3 = i4;
                    }
                    bundleR.putIntArray("android-support-nav:controller:backStackDestIds", iArr);
                    ndc.i(bundleR, "android-support-nav:controller:backStackIds", arrayList3);
                }
                if (!linkedHashMap.isEmpty()) {
                    if (bundleR == null) {
                        bundleR = feg.r((iy9[]) Arrays.copyOf(new iy9[0], 0));
                    }
                    ArrayList arrayList4 = new ArrayList();
                    for (Map.Entry entry3 : linkedHashMap.entrySet()) {
                        String str3 = (String) entry3.getKey();
                        ad0 ad0Var2 = (ad0) entry3.getValue();
                        arrayList4.add(str3);
                        ArrayList<? extends Parcelable> arrayList5 = new ArrayList<>();
                        Iterator it = ad0Var2.iterator();
                        while (it.hasNext()) {
                            veh vehVar = ((ga9) it.next()).a;
                            Bundle bundleR5 = feg.r((iy9[]) Arrays.copyOf(new iy9[0], 0));
                            bundleR5.putString("nav-entry-state:id", (String) vehVar.c);
                            bundleR5.putInt("nav-entry-state:destination-id", vehVar.b);
                            Bundle bundleR6 = (Bundle) vehVar.d;
                            if (bundleR6 == null) {
                                bundleR6 = feg.r((iy9[]) Arrays.copyOf(new iy9[0], 0));
                            }
                            bundleR5.putBundle("nav-entry-state:args", bundleR6);
                            bundleR5.putBundle("nav-entry-state:saved-state", (Bundle) vehVar.e);
                            arrayList5.add(bundleR5);
                        }
                        bundleR.putParcelableArrayList("android-support-nav:controller:backStackStates:" + str3, arrayList5);
                    }
                    ndc.i(bundleR, "android-support-nav:controller:backStackStates", arrayList4);
                }
                if (cb9Var.e) {
                    if (bundleR == null) {
                        bundleR = feg.r((iy9[]) Arrays.copyOf(new iy9[0], 0));
                    }
                    bundleR.putBoolean("android-support-nav:controller:deepLinkHandled", cb9Var.e);
                }
                return bundleR;
            case 1:
                ((Integer) obj2).getClass();
                k99.a(k99.P(7), (l46) obj);
                return wefVar;
            case 2:
                nz9 nz9Var = (nz9) obj2;
                ((nfc) obj).getClass();
                nz9Var.getClass();
                kob kobVar = job.a;
                Object objA = nz9Var.a(kobVar.b(vb2.class));
                if (objA != null) {
                    return new GooglePay((vb2) objA);
                }
                throw new nv3(kv2.i(kobVar, vb2.class, new StringBuilder("No value found for type '"), '\''));
            case 3:
                ((nfc) obj).getClass();
                ((nz9) obj2).getClass();
                return new SocialShareManager();
            case 4:
                ((nfc) obj).getClass();
                ((nz9) obj2).getClass();
                return new lc6();
            case 5:
                nfc nfcVar = (nfc) obj;
                nfcVar.getClass();
                ((nz9) obj2).getClass();
                return new jh((Context) nfcVar.g(job.a.b(Context.class), null, null));
            case 6:
                return Integer.valueOf(((tn8) obj).V(((Integer) obj2).intValue()));
            case 7:
                return Integer.valueOf(((tn8) obj).q(((Integer) obj2).intValue()));
            case 8:
                return Integer.valueOf(((tn8) obj).b(((Integer) obj2).intValue()));
            case 9:
                return Integer.valueOf(((tn8) obj).n(((Integer) obj2).intValue()));
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                ((Integer) obj2).getClass();
                k.a(k99.P(1), (l46) obj);
                return wefVar;
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                l7a l7aVar = (l7a) obj2;
                ((pcc) obj).getClass();
                if (l7aVar == null) {
                    return pu4.a;
                }
                Boolean bool = l7aVar.b;
                o7a o7aVar = l7aVar.a;
                if (o7aVar instanceof m7a) {
                    return t72.I("save", ((m7a) o7aVar).a.name(), "", "", p7a.a(bool));
                }
                if (o7aVar instanceof n7a) {
                    n7a n7aVar = (n7a) o7aVar;
                    return t72.I("share", n7aVar.a.name(), n7aVar.b.name(), n7aVar.c, p7a.a(bool));
                }
                ap.c();
                return null;
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                v68 v68Var = (v68) obj2;
                v68Var.getClass();
                return Boolean.valueOf(pa7.t(obj, v68Var.a));
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                v68 v68Var2 = (v68) obj2;
                v68Var2.getClass();
                return Boolean.valueOf(pa7.t(obj, v68Var2.a));
            case 14:
                return Boolean.valueOf(pa7.t(obj, obj2));
            case 15:
                return Boolean.valueOf(pa7.t(obj, obj2));
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                return Boolean.valueOf(pa7.t(obj, obj2));
            case 17:
                return Boolean.valueOf(pa7.t(obj, obj2));
            case 18:
                v68 v68Var3 = (v68) obj2;
                v68Var3.getClass();
                return Boolean.valueOf(pa7.t(obj, v68Var3.a));
            case 19:
                v68 v68Var4 = (v68) obj2;
                v68Var4.getClass();
                return Boolean.valueOf(pa7.t(obj, v68Var4.a));
            case 20:
                v68 v68Var5 = (v68) obj;
                v68 v68Var6 = (v68) obj2;
                v68Var5.getClass();
                v68Var6.getClass();
                return Boolean.valueOf(pa7.t(v68Var5.a, v68Var6.a));
            case 21:
                v68 v68Var7 = (v68) obj;
                v68 v68Var8 = (v68) obj2;
                v68Var7.getClass();
                v68Var8.getClass();
                return Boolean.valueOf(pa7.t(v68Var7.a, v68Var8.a));
            case 22:
                v68 v68Var9 = (v68) obj;
                v68Var9.getClass();
                return Boolean.valueOf(pa7.t(v68Var9.a, obj2));
            case 23:
                v68 v68Var10 = (v68) obj;
                v68Var10.getClass();
                return Boolean.valueOf(pa7.t(v68Var10.a, obj2));
            case 24:
                v68 v68Var11 = (v68) obj;
                v68 v68Var12 = (v68) obj2;
                v68Var11.getClass();
                v68Var12.getClass();
                return Boolean.valueOf(pa7.t(v68Var11.a, v68Var12.a));
            case 25:
                v68 v68Var13 = (v68) obj;
                v68 v68Var14 = (v68) obj2;
                v68Var13.getClass();
                v68Var14.getClass();
                return Boolean.valueOf(pa7.t(v68Var13.a, v68Var14.a));
            case 26:
                v68 v68Var15 = (v68) obj;
                v68Var15.getClass();
                return Boolean.valueOf(pa7.t(v68Var15.a, obj2));
            case 27:
                v68 v68Var16 = (v68) obj;
                v68Var16.getClass();
                return Boolean.valueOf(pa7.t(v68Var16.a, obj2));
            case 28:
                ((Integer) obj2).getClass();
                rxg.o(k99.P(7), (l46) obj);
                return wefVar;
            default:
                l46 l46Var = (l46) obj;
                ((Integer) obj2).getClass();
                l46Var.f0(-688473383);
                rh5 rh5Var = new rh5(0, 0, 0);
                l46Var.r(false);
                return rh5Var;
        }
    }

    public /* synthetic */ db9(int i, int i2) {
        this.a = i2;
    }
}
