package defpackage;

import ai.askquin.R;
import android.content.Context;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowInsetsAnimation;
import androidx.camera.core.internal.compat.quirk.ImageCaptureFailedForSpecificCombinationQuirk;
import androidx.camera.core.internal.compat.quirk.PreviewGreenTintQuirk;
import com.google.android.gms.tasks.Task;
import com.google.android.play.core.assetpacks.b;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import io.sentry.android.core.b1;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class lqb implements f1b, cfg, xm9, kwg, yn2 {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;

    public lqb(int i) {
        this.a = i;
        switch (i) {
            case 14:
                this.b = new ConcurrentHashMap();
                this.c = new AtomicInteger(0);
                break;
            case 15:
                this.b = new g3e(2);
                this.c = new ej8(16);
                break;
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
            default:
                this.b = (ImageCaptureFailedForSpecificCombinationQuirk) q74.a.b(ImageCaptureFailedForSpecificCombinationQuirk.class);
                this.c = (PreviewGreenTintQuirk) q74.a.b(PreviewGreenTintQuirk.class);
                break;
            case 17:
                this.b = new wid(0);
                this.c = new gg8((Object) null);
                break;
            case 18:
                this.b = new p89(0, new Reference[16]);
                this.c = new ReferenceQueue();
                break;
        }
    }

    public static e7f e(List list) {
        return list.isEmpty() ? e7f.c : new e7f(list);
    }

    public void A(p5h p5hVar) {
        try {
            J(p5hVar, (u6h) this.b);
        } catch (Throwable th) {
            zsg.i("BillingLogger", "Unable to log.", th);
        }
    }

    public void B(p5h p5hVar, int i, long j) {
        try {
            s6h s6hVar = (s6h) ((u6h) this.b).l();
            s6hVar.b();
            u6h.C((u6h) s6hVar.b, i);
            u6h u6hVar = (u6h) s6hVar.a();
            this.b = u6hVar;
            if (j != 0) {
                s6h s6hVar2 = (s6h) u6hVar.l();
                s6hVar2.e(j);
                u6hVar = (u6h) s6hVar2.a();
            }
            J(p5hVar, u6hVar);
        } catch (Throwable th) {
            zsg.i("BillingLogger", "Unable to log.", th);
        }
    }

    public void C(p5h p5hVar, long j, boolean z) {
        try {
            l5h l5hVar = (l5h) p5hVar.l();
            z6h z6hVar = (z6h) p5hVar.u().l();
            z6hVar.b();
            c7h.q((c7h) z6hVar.b, z);
            l5hVar.b();
            p5h.p((p5h) l5hVar.b, (c7h) z6hVar.a());
            p5h p5hVar2 = (p5h) l5hVar.a();
            u6h u6hVar = (u6h) this.b;
            if (j != 0) {
                s6h s6hVar = (s6h) u6hVar.l();
                s6hVar.e(j);
                u6hVar = (u6h) s6hVar.a();
            }
            J(p5hVar2, u6hVar);
        } catch (Throwable th) {
            zsg.i("BillingLogger", "Unable to log.", th);
        }
    }

    public void D(p5h p5hVar, int i, long j, boolean z) {
        try {
            s6h s6hVar = (s6h) ((u6h) this.b).l();
            s6hVar.b();
            u6h.C((u6h) s6hVar.b, i);
            this.b = (u6h) s6hVar.a();
            l5h l5hVar = (l5h) p5hVar.l();
            z6h z6hVar = (z6h) p5hVar.u().l();
            z6hVar.b();
            c7h.q((c7h) z6hVar.b, z);
            l5hVar.b();
            p5h.p((p5h) l5hVar.b, (c7h) z6hVar.a());
            p5h p5hVar2 = (p5h) l5hVar.a();
            u6h u6hVar = (u6h) this.b;
            if (j != 0) {
                s6h s6hVar2 = (s6h) u6hVar.l();
                s6hVar2.e(j);
                u6hVar = (u6h) s6hVar2.a();
            }
            J(p5hVar2, u6hVar);
        } catch (Throwable th) {
            zsg.i("BillingLogger", "Unable to log.", th);
        }
    }

    public void E(g6h g6hVar) {
        try {
            e7h e7hVarR = h7h.r();
            e7hVarR.c((u6h) this.b);
            e7hVarR.b();
            h7h.u((h7h) e7hVarR.b, g6hVar);
            ((pk1) this.c).q((h7h) e7hVarR.a());
        } catch (Throwable th) {
            zsg.i("BillingLogger", "Unable to log.", th);
        }
    }

    public void F(tx0 tx0Var, long j) {
        try {
            o6h o6hVarP = r6h.p();
            o6hVarP.b();
            r6h.u((r6h) o6hVarP.b, 4);
            j6h j6hVar = j6h.IN_APP_BILLING_RESULT_UPDATE_ACTION;
            o6hVarP.b();
            r6h.q((r6h) o6hVarP.b, j6hVar);
            if (tx0Var != null) {
                w5h w5hVarQ = d6h.q();
                int i = tx0Var.a;
                w5hVarQ.b();
                d6h.p((d6h) w5hVarQ.b, i);
                String str = tx0Var.c;
                w5hVarQ.b();
                d6h.s((d6h) w5hVarQ.b, str);
                o6hVarP.b();
                r6h.r((r6h) o6hVarP.b, (d6h) w5hVarQ.a());
            }
            e7h e7hVarR = h7h.r();
            u6h u6hVar = (u6h) this.b;
            if (j != 0) {
                s6h s6hVar = (s6h) u6hVar.l();
                s6hVar.e(j);
                u6hVar = (u6h) s6hVar.a();
            }
            e7hVarR.c(u6hVar);
            e7hVarR.b();
            h7h.v((h7h) e7hVarR.b, (r6h) o6hVarP.a());
            ((pk1) this.c).q((h7h) e7hVarR.a());
        } catch (Throwable th) {
            zsg.i("BillingLogger", "Unable to log.", th);
        }
    }

    public void G(t7h t7hVar) {
        try {
            e7h e7hVarR = h7h.r();
            e7hVarR.c((u6h) this.b);
            o6h o6hVarP = r6h.p();
            o6hVarP.b();
            r6h.s((r6h) o6hVarP.b);
            o6hVarP.b();
            r6h.u((r6h) o6hVarP.b, 2);
            o6hVarP.b();
            r6h.t((r6h) o6hVarP.b, t7hVar);
            e7hVarR.b();
            h7h.v((h7h) e7hVarR.b, (r6h) o6hVarP.a());
            ((pk1) this.c).q((h7h) e7hVarR.a());
        } catch (Throwable th) {
            zsg.i("BillingLogger", "Unable to log.", th);
        }
    }

    public void H(z7h z7hVar) {
        try {
            pk1 pk1Var = (pk1) this.c;
            e7h e7hVarR = h7h.r();
            e7hVarR.c((u6h) this.b);
            e7hVarR.b();
            h7h.p((h7h) e7hVarR.b, z7hVar);
            pk1Var.q((h7h) e7hVarR.a());
        } catch (Throwable th) {
            zsg.i("BillingLogger", "Unable to log.", th);
        }
    }

    public void I(d8h d8hVar) {
        if (d8hVar == null) {
            return;
        }
        try {
            e7h e7hVarR = h7h.r();
            e7hVarR.c((u6h) this.b);
            e7hVarR.b();
            h7h.q((h7h) e7hVarR.b, d8hVar);
            ((pk1) this.c).q((h7h) e7hVarR.a());
        } catch (Throwable th) {
            zsg.i("BillingLogger", "Unable to log.", th);
        }
    }

    public void J(p5h p5hVar, u6h u6hVar) {
        if (p5hVar == null) {
            return;
        }
        try {
            e7h e7hVarR = h7h.r();
            e7hVarR.c(u6hVar);
            e7hVarR.b();
            h7h.s((h7h) e7hVarR.b, p5hVar);
            ((pk1) this.c).q((h7h) e7hVarR.a());
        } catch (Throwable th) {
            zsg.i("BillingLogger", "Unable to log.", th);
        }
    }

    public void K(v5h v5hVar, u6h u6hVar) {
        if (v5hVar == null) {
            return;
        }
        try {
            e7h e7hVarR = h7h.r();
            e7hVarR.c(u6hVar);
            e7hVarR.b();
            h7h.t((h7h) e7hVarR.b, v5hVar);
            ((pk1) this.c).q((h7h) e7hVarR.a());
        } catch (Throwable th) {
            zsg.i("BillingLogger", "Unable to log.", th);
        }
    }

    @Override // defpackage.cfg
    public Object a() {
        switch (this.a) {
            case 21:
                return new b((Context) ((ysd) ((oid) this.b).b).b, (wgg) ((bfg) this.c).a());
            default:
                bfg bfgVar = (bfg) this.c;
                return new vgg((b) ((bfg) this.b).a(), (wgg) bfgVar.a());
        }
    }

    public void b(flb flbVar, h71 h71Var) {
        wid widVar = (wid) this.b;
        wvf wvfVarA = (wvf) widVar.get(flbVar);
        if (wvfVarA == null) {
            wvfVarA = wvf.a();
            widVar.put(flbVar, wvfVarA);
        }
        wvfVarA.c = h71Var;
        wvfVarA.a |= 8;
    }

    public void c() {
        int[] iArr = (int[]) this.b;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        this.c = null;
    }

    public boolean d(tag tagVar) {
        boolean zContainsKey;
        synchronized (this.c) {
            zContainsKey = ((u5c) this.b).a.containsKey(tagVar);
        }
        return zContainsKey;
    }

    public void f(int i) {
        int[] iArr = (int[]) this.b;
        if (iArr == null) {
            int[] iArr2 = new int[Math.max(i, 10) + 1];
            this.b = iArr2;
            Arrays.fill(iArr2, -1);
        } else if (i >= iArr.length) {
            int length = iArr.length;
            while (length <= i) {
                length *= 2;
            }
            int[] iArr3 = new int[length];
            this.b = iArr3;
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
            int[] iArr4 = (int[]) this.b;
            Arrays.fill(iArr4, iArr.length, iArr4.length, -1);
        }
    }

    public void g() {
        vz9 vz9Var = (vz9) this.c;
        ird irdVarJ = iqf.j();
        a26 a26VarE = irdVarJ != null ? irdVarJ.e() : null;
        ird irdVarL = iqf.l(irdVarJ);
        try {
            vue vueVar = (vue) vz9Var.getValue();
            iqf.p(irdVarJ, irdVarL, a26VarE);
            if (vueVar != null) {
                ibf ibfVar = (ibf) this.b;
                jsd jsdVar = ibfVar.b;
                jsd jsdVar2 = ibfVar.c;
                jsdVar2.clear();
                while (jsdVar2.size() + jsdVar.size() > ibfVar.a - 1) {
                    x72.j0(jsdVar);
                }
                jsdVar.add(vueVar);
            }
            vz9Var.setValue(null);
        } catch (Throwable th) {
            iqf.p(irdVarJ, irdVarL, a26VarE);
            throw th;
        }
    }

    @Override // defpackage.h1b
    public Object get() {
        switch (this.a) {
            case 0:
                return new kqb((xb0) ((f1b) this.b).get(), (pv2) ((ze) this.c).a);
            default:
                return new m1d((d4d) ((f1b) this.b).get(), (d4d) ((f1b) this.c).get());
        }
    }

    @Override // defpackage.yn2
    public Object h(Task task) {
        boolean z = task.h() instanceof hgf;
        h9h h9hVar = (h9h) this.c;
        w6h w6hVar = (w6h) this.b;
        if (z) {
            return w6hVar.c(h9hVar.r());
        }
        if (task.h() instanceof x60) {
            x60 x60Var = (x60) task.h();
            x60Var.getClass();
            if (x60Var.a() == 29514) {
                return w6hVar.c(h9hVar.r());
            }
        }
        return task;
    }

    public bq0 i(yh2 yh2Var) throws hg5 {
        String string;
        JSONArray jSONArray = yh2Var.g;
        long j = yh2Var.f;
        HashSet hashSet = new HashSet();
        for (int i = 0; i < jSONArray.length(); i++) {
            try {
                JSONObject jSONObject = jSONArray.getJSONObject(i);
                String string2 = jSONObject.getString("rolloutId");
                JSONArray jSONArray2 = jSONObject.getJSONArray("affectedParameterKeys");
                if (jSONArray2.length() > 1) {
                    b1.l("FirebaseRemoteConfig", String.format("Rollout has multiple affected parameter keys.Only the first key will be included in RolloutsState. rolloutId: %s, affectedParameterKeys: %s", string2, jSONArray2));
                }
                String strOptString = jSONArray2.optString(0, "");
                yh2 yh2VarC = ((wh2) this.b).c();
                String string3 = null;
                if (yh2VarC == null) {
                    string = null;
                } else {
                    try {
                        string = yh2VarC.b.getString(strOptString);
                    } catch (JSONException unused) {
                        string = null;
                    }
                }
                if (string == null) {
                    yh2 yh2VarC2 = ((wh2) this.c).c();
                    if (yh2VarC2 != null) {
                        try {
                            string3 = yh2VarC2.b.getString(strOptString);
                        } catch (JSONException unused2) {
                        }
                    }
                    string = string3 != null ? string3 : "";
                }
                int i2 = j5c.a;
                zp0 zp0Var = new zp0();
                if (string2 == null) {
                    throw new NullPointerException("Null rolloutId");
                }
                zp0Var.a = string2;
                String string4 = jSONObject.getString("variantId");
                if (string4 == null) {
                    throw new NullPointerException("Null variantId");
                }
                zp0Var.b = string4;
                if (strOptString == null) {
                    throw new NullPointerException("Null parameterKey");
                }
                zp0Var.c = strOptString;
                zp0Var.d = string;
                zp0Var.e = j;
                zp0Var.f = (byte) (zp0Var.f | 1);
                hashSet.add(zp0Var.a());
            } catch (JSONException e) {
                throw new hg5(e, "Exception parsing rollouts metadata to create RolloutsState.");
            }
        }
        return new bq0(hashSet);
    }

    public int j(String str) {
        int andIncrement;
        ConcurrentHashMap concurrentHashMap = (ConcurrentHashMap) this.b;
        Integer num = (Integer) concurrentHashMap.get(str);
        if (num != null) {
            return num.intValue();
        }
        synchronized (concurrentHashMap) {
            try {
                Integer num2 = (Integer) concurrentHashMap.get(str);
                if (num2 != null) {
                    andIncrement = num2.intValue();
                } else {
                    andIncrement = ((AtomicInteger) this.c).getAndIncrement();
                    concurrentHashMap.putIfAbsent(str, Integer.valueOf(andIncrement));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return andIncrement;
    }

    @Override // defpackage.xm9
    public void k(Task task) {
        khg khgVar = (khg) this.b;
        gle gleVar = (gle) this.c;
        synchronized (khgVar.f) {
            khgVar.e.remove(gleVar);
        }
    }

    public String l(String str) {
        String str2 = (String) this.c;
        Resources resources = (Resources) this.b;
        int identifier = resources.getIdentifier(str, "string", str2);
        if (identifier == 0) {
            return null;
        }
        return resources.getString(identifier);
    }

    public void m(int i, int i2) {
        int[] iArr = (int[]) this.b;
        if (iArr == null || i >= iArr.length) {
            return;
        }
        int i3 = i + i2;
        f(i3);
        int[] iArr2 = (int[]) this.b;
        System.arraycopy(iArr2, i, iArr2, i3, (iArr2.length - i) - i2);
        Arrays.fill((int[]) this.b, i, i3, -1);
        ArrayList arrayList = (ArrayList) this.c;
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            iyd iydVar = (iyd) ((ArrayList) this.c).get(size);
            int i4 = iydVar.a;
            if (i4 >= i) {
                iydVar.a = i4 + i2;
            }
        }
    }

    public void n(int i, int i2) {
        int[] iArr = (int[]) this.b;
        if (iArr == null || i >= iArr.length) {
            return;
        }
        int i3 = i + i2;
        f(i3);
        int[] iArr2 = (int[]) this.b;
        System.arraycopy(iArr2, i3, iArr2, i, (iArr2.length - i) - i2);
        int[] iArr3 = (int[]) this.b;
        Arrays.fill(iArr3, iArr3.length - i2, iArr3.length, -1);
        ArrayList arrayList = (ArrayList) this.c;
        if (arrayList == null) {
            return;
        }
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            iyd iydVar = (iyd) ((ArrayList) this.c).get(size);
            int i4 = iydVar.a;
            if (i4 >= i) {
                if (i4 < i3) {
                    ((ArrayList) this.c).remove(size);
                } else {
                    iydVar.a = i4 - i2;
                }
            }
        }
    }

    public void o() {
        ((jdc) this.b).a();
    }

    public void p(Bundle bundle) {
        jdc jdcVar = (jdc) this.b;
        kdc kdcVar = jdcVar.a;
        if (!jdcVar.e) {
            jdcVar.a();
        }
        if (((a58) kdcVar.k()).i.compareTo(g48.d) >= 0) {
            ho7.w(((a58) kdcVar.k()).i, "performRestore cannot be called when owner is ");
            return;
        }
        if (jdcVar.g) {
            qc0.p("SavedStateRegistry was already restored.");
            return;
        }
        Bundle bundle2 = null;
        if (bundle != null && bundle.containsKey("androidx.lifecycle.BundlableSavedStateRegistry.key")) {
            Bundle bundle3 = bundle.getBundle("androidx.lifecycle.BundlableSavedStateRegistry.key");
            if (bundle3 == null) {
                gdc.h("androidx.lifecycle.BundlableSavedStateRegistry.key");
                throw null;
            }
            bundle2 = bundle3;
        }
        jdcVar.f = bundle2;
        jdcVar.g = true;
    }

    public void q(Bundle bundle) {
        jdc jdcVar = (jdc) this.b;
        Bundle bundleR = feg.r((iy9[]) Arrays.copyOf(new iy9[0], 0));
        Bundle bundle2 = jdcVar.f;
        if (bundle2 != null) {
            bundleR.putAll(bundle2);
        }
        synchronized (jdcVar.c) {
            for (Map.Entry entry : jdcVar.d.entrySet()) {
                String str = (String) entry.getKey();
                Bundle bundleA = ((idc) entry.getValue()).a();
                str.getClass();
                bundleR.putBundle(str, bundleA);
            }
        }
        if (bundleR.isEmpty()) {
            return;
        }
        bundle.putBundle("androidx.lifecycle.BundlableSavedStateRegistry.key", bundleR);
    }

    public h71 r(flb flbVar, int i) {
        wvf wvfVar;
        h71 h71Var;
        wid widVar = (wid) this.b;
        int iD = widVar.d(flbVar);
        if (iD >= 0 && (wvfVar = (wvf) widVar.i(iD)) != null) {
            int i2 = wvfVar.a;
            if ((i2 & i) != 0) {
                int i3 = i2 & (~i);
                wvfVar.a = i3;
                if (i == 4) {
                    h71Var = wvfVar.b;
                } else if (i == 8) {
                    h71Var = wvfVar.c;
                } else {
                    qc0.j("Must provide flag PRE or POST");
                }
                if ((i3 & 12) == 0) {
                    widVar.g(iD);
                    wvfVar.a = 0;
                    wvfVar.b = null;
                    wvfVar.c = null;
                    wvf.d.q(wvfVar);
                }
                return h71Var;
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0071  */
    public void s(vue vueVar) {
        vue vueVar2;
        vue vueVar3;
        vz9 vz9Var = (vz9) this.c;
        String str = vueVar.c;
        ird irdVarJ = iqf.j();
        a26 a26VarE = irdVarJ != null ? irdVarJ.e() : null;
        ird irdVarL = iqf.l(irdVarJ);
        try {
            vue vueVar4 = (vue) vz9Var.getValue();
            iqf.p(irdVarJ, irdVarL, a26VarE);
            if (vueVar4 == null) {
                vz9Var.setValue(vueVar);
                return;
            }
            boolean z = vueVar4.g;
            String str2 = vueVar4.b;
            String str3 = vueVar4.c;
            int i = vueVar4.a;
            rne rneVar = vueVar4.h;
            if (z) {
                boolean z2 = vueVar.g;
                String str4 = vueVar.b;
                int i2 = vueVar.a;
                if (z2) {
                    long j = vueVar.f;
                    long j2 = vueVar4.f;
                    if (j < j2 || j - j2 >= 5000 || pa7.t(str3, "\n") || pa7.t(str3, "\r\n") || pa7.t(str, "\n") || pa7.t(str, "\r\n") || rneVar != vueVar.h) {
                        vueVar2 = null;
                    } else {
                        if (rneVar == rne.a && str3.length() + i == i2) {
                            vueVar3 = new vue(vueVar4.a, "", ub3.i(str3, str), vueVar4.d, vueVar.e, vueVar4.f, false, 64);
                        } else if (rneVar != rne.b || vueVar4.a() != vueVar.a() || (vueVar4.a() != one.a && vueVar4.a() != one.b)) {
                            vueVar2 = null;
                        } else if (i == str4.length() + i2) {
                            vueVar3 = new vue(vueVar.a, ub3.i(str4, str2), "", vueVar4.d, vueVar.e, vueVar4.f, false, 64);
                        } else {
                            int i3 = vueVar4.a;
                            if (i3 == i2) {
                                vueVar2 = new vue(i3, tec.l(str2, str4), "", vueVar4.d, vueVar.e, vueVar4.f, false, 64);
                            } else {
                                vueVar2 = null;
                            }
                        }
                        vueVar2 = vueVar3;
                    }
                } else {
                    vueVar2 = null;
                }
            } else {
                vueVar2 = null;
            }
            if (vueVar2 != null) {
                vz9Var.setValue(vueVar2);
            } else {
                g();
                vz9Var.setValue(vueVar);
            }
        } catch (Throwable th) {
            iqf.p(irdVarJ, irdVarL, a26VarE);
            throw th;
        }
    }

    public nzd t(tag tagVar) {
        nzd nzdVarB;
        tagVar.getClass();
        synchronized (this.c) {
            nzdVarB = ((u5c) this.b).b(tagVar);
        }
        return nzdVarB;
    }

    public String toString() {
        switch (this.a) {
            case 19:
                return "Bounds{lower=" + ((x47) this.b) + " upper=" + ((x47) this.c) + "}";
            default:
                return super.toString();
        }
    }

    public void u(flb flbVar) {
        wvf wvfVar = (wvf) ((wid) this.b).get(flbVar);
        if (wvfVar == null) {
            return;
        }
        wvfVar.a &= -2;
    }

    public void v(flb flbVar) {
        gg8 gg8Var = (gg8) this.c;
        for (int iG = gg8Var.g() - 1; iG >= 0; iG--) {
            if (flbVar == gg8Var.h(iG)) {
                Object[] objArr = gg8Var.c;
                Object obj = objArr[iG];
                Object obj2 = qk2.Y;
                if (obj == obj2) {
                    break;
                }
                objArr[iG] = obj2;
                gg8Var.a = true;
                break;
            }
        }
        wvf wvfVar = (wvf) ((wid) this.b).remove(flbVar);
        if (wvfVar != null) {
            wvfVar.a = 0;
            wvfVar.b = null;
            wvfVar.c = null;
            wvf.d.q(wvfVar);
        }
    }

    public void w(nzd nzdVar, pzd pzdVar) {
        nzdVar.getClass();
        ((bbg) this.c).a(new qae(this, nzdVar, pzdVar, 4));
    }

    public void x(nzd nzdVar, int i) {
        nzdVar.getClass();
        ((bbg) this.c).a(new k2e((vva) this.b, nzdVar, false, i));
    }

    public nzd y(tag tagVar) {
        nzd nzdVarD;
        synchronized (this.c) {
            nzdVarD = ((u5c) this.b).d(tagVar);
        }
        return nzdVarD;
    }

    public void z(uuf uufVar) {
        Handler handler = (Handler) this.b;
        if (handler != null) {
            handler.post(new xu8(26, this, uufVar));
        }
    }

    public /* synthetic */ lqb(int i, boolean z) {
        this.a = i;
    }

    public /* synthetic */ lqb(Object obj, Object obj2, boolean z, int i) {
        this.a = i;
        this.b = obj2;
        this.c = obj;
    }

    public lqb(Context context) {
        this.a = 10;
        Resources resources = context.getResources();
        this.b = resources;
        this.c = resources.getResourcePackageName(R.string.common_google_play_services_unknown_issue);
    }

    public lqb(Context context, u6h u6hVar) {
        this.a = 26;
        pk1 pk1Var = new pk1(8);
        try {
            f4f.b(context);
            pk1Var.c = f4f.a().c(e71.e).a("PLAY_BILLING_LIBRARY", new jv4("proto"), new jwg(4));
        } catch (Throwable unused) {
            pk1Var.b = true;
        }
        this.c = pk1Var;
        this.b = u6hVar;
    }

    public lqb(jdc jdcVar) {
        this.a = 4;
        this.b = jdcVar;
        this.c = new vea(6, jdcVar);
    }

    public /* synthetic */ lqb(int i, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
    }

    public lqb(vue vueVar, ibf ibfVar) {
        this.a = 13;
        this.b = ibfVar;
        this.c = q1c.f(vueVar);
    }

    public lqb(ExecutorService executorService) {
        this.a = 1;
        this.c = new kd0(0);
        this.b = executorService;
    }

    public lqb(vva vvaVar, bbg bbgVar) {
        this.a = 20;
        vvaVar.getClass();
        bbgVar.getClass();
        this.b = vvaVar;
        this.c = bbgVar;
    }

    public lqb(u5c u5cVar) {
        this.a = 11;
        this.b = u5cVar;
        this.c = new Object();
    }

    public lqb(Handler handler, t45 t45Var) {
        this.a = 16;
        if (t45Var != null) {
            handler.getClass();
        } else {
            handler = null;
        }
        this.b = handler;
        this.c = t45Var;
    }

    public lqb(WindowInsetsAnimation.Bounds bounds) {
        this.a = 19;
        this.b = l7g.g(bounds);
        this.c = l7g.f(bounds);
    }
}
