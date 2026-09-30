package defpackage;

import ai.askquin.R;
import ai.askquin.ui.web.WebViewActivity;
import android.app.Application;
import android.content.Context;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.webkit.WebView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class i06 implements a26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;

    public /* synthetic */ i06(Context context, int i) {
        this.a = i;
        this.b = context;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        Bundle bundle;
        int i = this.a;
        wef wefVar = wef.a;
        Context context = this.b;
        switch (i) {
            case 0:
                qn4.U(context, R.string.friend_coupon_share_failed);
                return wefVar;
            case 1:
                t09 t09Var = (t09) obj;
                t09Var.getClass();
                boolean z = context instanceof Application;
                lp7 lp7Var = lp7.a;
                if (z) {
                    l14 l14Var = new l14(context, 5);
                    o4e o4eVar = szc.v;
                    kob kobVar = job.a;
                    yw0 yw0Var = new yw0(o4eVar, kobVar.b(Application.class), null, l14Var, lp7Var);
                    ckd ckdVar = new ckd(yw0Var);
                    t09Var.a(ckdVar);
                    em7 em7VarB = kobVar.b(Context.class);
                    yw0Var.f.add(em7VarB);
                    t09Var.c.put(ib8.l(new StringBuilder(fm7.a(em7VarB)), ':', "", ':', o4eVar), ckdVar);
                } else {
                    t09Var.a(new ckd(new yw0(szc.v, job.a.b(Context.class), null, new l14(context, 6), lp7Var)));
                }
                return wefVar;
            case 2:
                sn4 sn4Var = (sn4) obj;
                sn4Var.getClass();
                vl1 vl1VarP = sn4Var.v0().p();
                Drawable drawable = context.getDrawable(R.drawable.main_button);
                if (drawable != null) {
                    drawable.setBounds(new Rect(0, 0, (int) Float.intBitsToFloat((int) (sn4Var.f() >> 32)), (int) Float.intBitsToFloat((int) (sn4Var.f() & 4294967295L))));
                    drawable.draw(mp.b(vl1VarP));
                }
                return wefVar;
            case 3:
                Bundle bundle2 = (Bundle) obj;
                cb9 cb9VarN = af1.N(context);
                if (bundle2 != null) {
                    bundle2.setClassLoader(cb9VarN.a.getClassLoader());
                }
                ma9 ma9Var = cb9VarN.b;
                LinkedHashMap linkedHashMap = ma9Var.m;
                if (bundle2 != null) {
                    if (bundle2.containsKey("android-support-nav:controller:navigatorState")) {
                        bundle = bundle2.getBundle("android-support-nav:controller:navigatorState");
                        if (bundle == null) {
                            gdc.h("android-support-nav:controller:navigatorState");
                            throw null;
                        }
                    } else {
                        bundle = null;
                    }
                    ma9Var.d = bundle;
                    ma9Var.e = bundle2.containsKey("android-support-nav:controller:backStack") ? (Bundle[]) fdc.m("android-support-nav:controller:backStack", bundle2).toArray(new Bundle[0]) : null;
                    linkedHashMap.clear();
                    if (bundle2.containsKey("android-support-nav:controller:backStackDestIds") && bundle2.containsKey("android-support-nav:controller:backStackIds")) {
                        int[] intArray = bundle2.getIntArray("android-support-nav:controller:backStackDestIds");
                        if (intArray == null) {
                            gdc.h("android-support-nav:controller:backStackDestIds");
                            throw null;
                        }
                        ArrayList<String> stringArrayList = bundle2.getStringArrayList("android-support-nav:controller:backStackIds");
                        if (stringArrayList == null) {
                            gdc.h("android-support-nav:controller:backStackIds");
                            throw null;
                        }
                        int length = intArray.length;
                        int i2 = 0;
                        int i3 = 0;
                        while (i2 < length) {
                            int i4 = i3 + 1;
                            ma9Var.l.put(Integer.valueOf(intArray[i2]), !pa7.t(stringArrayList.get(i3), "") ? stringArrayList.get(i3) : null);
                            i2++;
                            i3 = i4;
                        }
                    }
                    if (bundle2.containsKey("android-support-nav:controller:backStackStates")) {
                        ArrayList<String> stringArrayList2 = bundle2.getStringArrayList("android-support-nav:controller:backStackStates");
                        if (stringArrayList2 == null) {
                            gdc.h("android-support-nav:controller:backStackStates");
                            throw null;
                        }
                        for (String str : stringArrayList2) {
                            if (bundle2.containsKey("android-support-nav:controller:backStackStates:" + str)) {
                                ArrayList arrayListM = fdc.m("android-support-nav:controller:backStackStates:" + str, bundle2);
                                ad0 ad0Var = new ad0(arrayListM.size());
                                Iterator it = arrayListM.iterator();
                                while (it.hasNext()) {
                                    ad0Var.addLast(new ga9((Bundle) it.next()));
                                }
                                linkedHashMap.put(str, ad0Var);
                            }
                        }
                    }
                }
                if (bundle2 != null) {
                    boolean z2 = bundle2.getBoolean("android-support-nav:controller:deepLinkHandled", false);
                    Boolean boolValueOf = (z2 || !bundle2.getBoolean("android-support-nav:controller:deepLinkHandled", true)) ? Boolean.valueOf(z2) : null;
                    cb9VarN.e = boolValueOf != null ? boolValueOf.booleanValue() : false;
                }
                return cb9VarN;
            case 4:
                WebView webView = (WebView) obj;
                webView.getClass();
                tgc.f(webView);
                context.getClass();
                webView.setWebViewClient(new e9b(context));
                return wefVar;
            default:
                String str2 = (String) obj;
                str2.getClass();
                int i5 = WebViewActivity.T0;
                pzd.i(context, str2, (8 & 4) != 0 ? ozd.a : ozd.b, null);
                return wefVar;
        }
    }
}
