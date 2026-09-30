package defpackage;

import ai.askquin.model.TarotSkinIdentify;
import ai.askquin.ui.skin.download.SkinDownloadWorker;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class ys3 implements hf8, cmd {
    public final kmd a;
    public final yag b;
    public final ConnectivityManager c;
    public final Handler d = new Handler(Looper.getMainLooper());
    public final LinkedHashMap e = new LinkedHashMap();
    public final LinkedHashMap f = new LinkedHashMap();
    public final s0e g;
    public final whb v;
    public final s0e w;
    public final whb x;

    public ys3(Context context, kmd kmdVar) {
        this.a = kmdVar;
        this.b = yag.b(context);
        this.c = (ConnectivityManager) context.getSystemService(ConnectivityManager.class);
        s0e s0eVarA = t0e.a(qu4.a);
        this.g = s0eVarA;
        this.v = if9.n(s0eVarA);
        s0e s0eVarA2 = t0e.a(0);
        this.w = s0eVarA2;
        this.x = if9.n(s0eVarA2);
        lx4 entries = TarotSkinIdentify.getEntries();
        ArrayList arrayList = new ArrayList();
        for (Object obj : entries) {
            if (((TarotSkinIdentify) obj).getRequiresDownload()) {
                arrayList.add(obj);
            }
        }
        int iF = bm8.F(t72.u(arrayList, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(iF < 16 ? 16 : iF);
        for (Object obj2 : arrayList) {
            int i = 6;
            float f = 0.0f;
            linkedHashMap.put(obj2, this.a.b((TarotSkinIdentify) obj2) ? new hmd(gmd.e, f, i) : new hmd(gmd.b, f, i));
        }
        s0e s0eVar = this.g;
        s0eVar.getClass();
        s0eVar.n(null, linkedHashMap);
    }

    public final gmd a(TarotSkinIdentify tarotSkinIdentify) {
        gmd gmdVar;
        tarotSkinIdentify.getClass();
        if (!tarotSkinIdentify.getRequiresDownload()) {
            return gmd.a;
        }
        hmd hmdVar = (hmd) ((Map) this.g.getValue()).get(tarotSkinIdentify);
        return (hmdVar == null || (gmdVar = hmdVar.a) == null) ? gmd.b : gmdVar;
    }

    public final void b(TarotSkinIdentify tarotSkinIdentify) {
        iy9 iy9Var = (iy9) this.f.remove(tarotSkinIdentify);
        if (iy9Var != null) {
            ((q98) iy9Var.a()).j((zk9) iy9Var.b());
        }
    }

    public final void c(TarotSkinIdentify tarotSkinIdentify) {
        hmd hmdVar = (hmd) ((Map) this.g.getValue()).get(tarotSkinIdentify);
        gmd gmdVar = hmdVar != null ? hmdVar.a : null;
        if (gmdVar == gmd.d || gmdVar == gmd.b) {
            e(tarotSkinIdentify);
        }
    }

    public final void e(TarotSkinIdentify tarotSkinIdentify) {
        boolean zHasCapability;
        if (!tarotSkinIdentify.getRequiresDownload()) {
            d().g("Skin " + tarotSkinIdentify.name() + " doesn't require download");
            return;
        }
        float f = 0.0f;
        if (this.a.b(tarotSkinIdentify)) {
            d().e("Skin " + tarotSkinIdentify.name() + " is already fully downloaded");
            g(tarotSkinIdentify, new hmd(gmd.e, f, 6));
            return;
        }
        int i = 1;
        ConnectivityManager connectivityManager = this.c;
        if (connectivityManager == null) {
            zHasCapability = true;
        } else {
            NetworkCapabilities networkCapabilities = connectivityManager.getNetworkCapabilities(connectivityManager.getActiveNetwork());
            zHasCapability = networkCapabilities == null ? false : networkCapabilities.hasCapability(12);
        }
        int i2 = 4;
        if (!zHasCapability) {
            d().g("Skin " + tarotSkinIdentify.name() + " download skipped: no network connection");
            g(tarotSkinIdentify, new hmd(gmd.d, 0.0f, "No network connection"));
            this.d.post(new ni(i2));
            return;
        }
        d().e("=== Starting download for skin: " + tarotSkinIdentify.name() + " ===");
        d().e("Skin folder: " + tarotSkinIdentify.getFolder());
        g(tarotSkinIdentify, new hmd(gmd.c, f, i2));
        zi0 zi0Var = new zi0(SkinDownloadWorker.class);
        lbg lbgVar = (lbg) zi0Var.c;
        lbgVar.q = true;
        lbgVar.r = rs9.a;
        zi0Var.x(us0.b, 10000L, TimeUnit.MILLISECONDS);
        iy9[] iy9VarArr = {new iy9("skin_folder", tarotSkinIdentify.getFolder())};
        kb6 kb6Var = new kb6(11);
        iy9 iy9Var = iy9VarArr[0];
        kb6Var.o(iy9Var.e(), (String) iy9Var.d());
        ((lbg) zi0Var.c).e = kb6Var.i();
        ((Set) zi0Var.d).add(ub3.i("skin_download_", tarotSkinIdentify.getFolder()));
        cq9 cq9VarE = zi0Var.e();
        UUID uuid = cq9VarE.a;
        d().e("Enqueueing work: " + ub3.i("skin_download_", tarotSkinIdentify.getFolder()) + ", workId: " + uuid);
        String strI = ub3.i("skin_download_", tarotSkinIdentify.getFolder());
        d45 d45Var = d45.a;
        yag yagVar = this.b;
        yagVar.a(strI, d45Var, cq9VarE);
        b(tarotSkinIdentify);
        nbg nbgVarX = yagVar.c.x();
        List listSingletonList = Collections.singletonList(uuid.toString());
        nbgVarX.getClass();
        listSingletonList.getClass();
        StringBuilder sbO = ub3.o("SELECT id, state, output, run_attempt_count, generation, required_network_type, required_network_request, requires_charging, requires_device_idle, requires_battery_not_low, requires_storage_not_low, trigger_content_update_delay, trigger_max_content_delay, content_uri_triggers, initial_delay, interval_duration, flex_duration, backoff_policy, backoff_delay_duration, last_enqueue_time, period_count, next_schedule_time_override, stop_reason FROM workspec WHERE id IN (");
        hfc.c(listSingletonList.size(), sbO);
        sbO.append(")");
        String string = sbO.toString();
        jb7 jb7VarF = nbgVarX.a.f();
        String[] strArr = {"WorkTag", "WorkProgress", "workspec"};
        bv9 bv9Var = new bv9(string, listSingletonList, nbgVarX, 27);
        jb7VarF.b.g(strArr);
        w84 w84Var = jb7VarF.g;
        w84Var.getClass();
        b6c b6cVar = new b6c((w5c) w84Var.b, w84Var, strArr, bv9Var);
        g3e g3eVar = new g3e(11);
        bbg bbgVar = yagVar.d;
        Object obj = new Object();
        sq8 sq8Var = new sq8();
        dcc dccVar = new dcc();
        sq8Var.l = dccVar;
        r98 r98Var = new r98(bbgVar, obj, g3eVar, sq8Var);
        rq8 rq8Var = new rq8(b6cVar, r98Var);
        rq8 rq8Var2 = (rq8) dccVar.a(b6cVar, rq8Var);
        if (rq8Var2 != null && rq8Var2.b != r98Var) {
            qc0.j("This source was already added with the different observer");
            return;
        }
        if (rq8Var2 == null && sq8Var.c > 0) {
            b6cVar.f(rq8Var);
        }
        sh1 sh1Var = new sh1(i, this, tarotSkinIdentify);
        this.f.put(tarotSkinIdentify, new iy9(sq8Var, sh1Var));
        sq8Var.f(sh1Var);
    }

    public final void f(TarotSkinIdentify tarotSkinIdentify, float f) {
        hmd hmdVar = (hmd) ((Map) this.g.getValue()).get(tarotSkinIdentify);
        if ((hmdVar != null ? hmdVar.a : null) == gmd.c) {
            gmd gmdVar = hmdVar.a;
            String str = hmdVar.c;
            gmdVar.getClass();
            g(tarotSkinIdentify, new hmd(gmdVar, f, str));
        }
    }

    public final void g(TarotSkinIdentify tarotSkinIdentify, hmd hmdVar) {
        s0e s0eVar = this.g;
        LinkedHashMap linkedHashMapY = bm8.Y((Map) s0eVar.getValue());
        linkedHashMapY.put(tarotSkinIdentify, hmdVar);
        s0eVar.getClass();
        s0eVar.n(null, linkedHashMapY);
    }
}
