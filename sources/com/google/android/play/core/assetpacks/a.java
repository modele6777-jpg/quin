package com.google.android.play.core.assetpacks;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import com.google.android.gms.tasks.Tasks;
import defpackage.egg;
import defpackage.gfh;
import defpackage.gle;
import defpackage.khg;
import defpackage.lhg;
import defpackage.peg;
import defpackage.qeg;
import defpackage.rch;
import defpackage.reg;
import defpackage.se0;
import defpackage.seg;
import defpackage.teg;
import defpackage.veg;
import defpackage.vgg;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class a implements lhg {
    public static final rch g = new rch("AssetPackServiceImpl");
    public static final Intent h = new Intent("com.google.android.play.core.assetmoduleservice.BIND_ASSET_MODULE_SERVICE").setPackage("com.android.vending");
    public final String a;
    public final egg b;
    public final vgg c;
    public final khg d;
    public final khg e;
    public final AtomicBoolean f = new AtomicBoolean();

    public a(Context context, egg eggVar, vgg vggVar) {
        this.a = context.getPackageName();
        this.b = eggVar;
        this.c = vggVar;
        boolean zA = reg.a(context);
        rch rchVar = g;
        if (zA) {
            Context applicationContext = context.getApplicationContext();
            applicationContext = applicationContext == null ? context : applicationContext;
            Intent intent = h;
            this.d = new khg(applicationContext, rchVar, "AssetPackService", intent);
            Context applicationContext2 = context.getApplicationContext();
            this.e = new khg(applicationContext2 != null ? applicationContext2 : context, rchVar, "AssetPackService-keepAlive", intent);
        }
        rchVar.a("AssetPackService initiated.", new Object[0]);
    }

    public static Bundle g() {
        Bundle bundle = new Bundle();
        bundle.putInt("playcore_version_code", 20300);
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(0);
        arrayList.add(1);
        bundle.putIntegerArrayList("supported_compression_formats", arrayList);
        ArrayList<Integer> arrayList2 = new ArrayList<>();
        arrayList2.add(1);
        arrayList2.add(2);
        bundle.putIntegerArrayList("supported_patch_formats", arrayList2);
        return bundle;
    }

    public static /* bridge */ /* synthetic */ Bundle i(HashMap map) {
        Bundle bundleG = g();
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        for (Map.Entry entry : map.entrySet()) {
            Bundle bundle = new Bundle();
            bundle.putString("installed_asset_module_name", (String) entry.getKey());
            bundle.putLong("installed_asset_module_version", ((Long) entry.getValue()).longValue());
            arrayList.add(bundle);
        }
        bundleG.putParcelableArrayList("installed_asset_module", arrayList);
        return bundleG;
    }

    @Override // defpackage.lhg
    public final gfh a(String str, int i, String str2, int i2) {
        rch rchVar = g;
        khg khgVar = this.d;
        if (khgVar == null) {
            rchVar.b("onError(%d)", -11);
            return Tasks.c(new se0(-11));
        }
        rchVar.e("getChunkFileDescriptor(%s, %s, %d, session=%d)", str, str2, Integer.valueOf(i2), Integer.valueOf(i));
        gle gleVar = new gle();
        khgVar.c(new qeg(this, gleVar, i, str, str2, i2, gleVar, 1), gleVar);
        return gleVar.a;
    }

    @Override // defpackage.lhg
    public final void b(int i) {
        khg khgVar = this.d;
        if (khgVar == null) {
            throw new g("The Play Store app is not installed or is an unofficial version.", i);
        }
        g.e("notifySessionFailed", new Object[0]);
        gle gleVar = new gle();
        khgVar.c(new teg(this, gleVar, i, gleVar), gleVar);
    }

    @Override // defpackage.lhg
    public final void c(int i, String str) {
        h(i, 10, str);
    }

    @Override // defpackage.lhg
    public final void d(List list) {
        khg khgVar = this.d;
        if (khgVar == null) {
            return;
        }
        g.e("cancelDownloads(%s)", list);
        gle gleVar = new gle();
        khgVar.c(new peg(this, gleVar, list, gleVar, 0), gleVar);
    }

    @Override // defpackage.lhg
    public final void e(String str, int i, String str2, int i2) {
        khg khgVar = this.d;
        if (khgVar == null) {
            throw new g("The Play Store app is not installed or is an unofficial version.", i);
        }
        g.e("notifyChunkTransferred", new Object[0]);
        gle gleVar = new gle();
        khgVar.c(new qeg(this, gleVar, i, str, str2, i2, gleVar, 0), gleVar);
    }

    @Override // defpackage.lhg
    public final synchronized void f() {
        if (this.e == null) {
            g.f("Keep alive connection manager is not initialized.", new Object[0]);
            return;
        }
        rch rchVar = g;
        rchVar.e("keepAlive", new Object[0]);
        if (!this.f.compareAndSet(false, true)) {
            rchVar.e("Service is already kept alive.", new Object[0]);
        } else {
            gle gleVar = new gle();
            this.e.c(new veg(this, gleVar, gleVar), gleVar);
        }
    }

    public final void h(int i, int i2, String str) {
        khg khgVar = this.d;
        if (khgVar == null) {
            throw new g("The Play Store app is not installed or is an unofficial version.", i);
        }
        g.e("notifyModuleCompleted", new Object[0]);
        gle gleVar = new gle();
        khgVar.c(new seg(this, gleVar, i, str, gleVar, i2), gleVar);
    }

    @Override // defpackage.lhg
    public final gfh f(HashMap map) {
        rch rchVar = g;
        khg khgVar = this.d;
        if (khgVar == null) {
            rchVar.b("onError(%d)", -11);
            return Tasks.c(new se0(-11));
        }
        rchVar.e("syncPacks", new Object[0]);
        gle gleVar = new gle();
        khgVar.c(new peg(this, gleVar, map, gleVar, 1), gleVar);
        return gleVar.a;
    }
}
