package defpackage;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.google.android.play.core.assetpacks.bs;
import com.google.android.play.core.assetpacks.h;
import com.google.android.play.core.assetpacks.k;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class hfg {
    public final rch a;
    public final IntentFilter b;
    public final Context c;
    public final HashSet d;
    public n80 e;
    public volatile boolean f;
    public final k g;
    public final h h;
    public final sfg i;
    public final egg j;
    public final vgg k;
    public final Handler l;
    public final bfg m;
    public final bfg n;
    public final bfg o;

    public hfg(Context context, k kVar, h hVar, bfg bfgVar, egg eggVar, sfg sfgVar, bfg bfgVar2, bfg bfgVar3, vgg vggVar) {
        rch rchVar = new rch("AssetPackServiceListenerRegistry");
        IntentFilter intentFilter = new IntentFilter("com.google.android.play.core.assetpacks.receiver.ACTION_SESSION_UPDATE");
        this.d = new HashSet();
        this.e = null;
        this.f = false;
        this.a = rchVar;
        this.b = intentFilter;
        Context applicationContext = context.getApplicationContext();
        this.c = applicationContext != null ? applicationContext : context;
        this.l = new Handler(Looper.getMainLooper());
        this.g = kVar;
        this.h = hVar;
        this.m = bfgVar;
        this.j = eggVar;
        this.i = sfgVar;
        this.n = bfgVar2;
        this.o = bfgVar3;
        this.k = vggVar;
    }

    public final void a() {
        n80 n80Var;
        if ((this.f || !this.d.isEmpty()) && this.e == null) {
            n80 n80Var2 = new n80(6, this);
            this.e = n80Var2;
            int i = Build.VERSION.SDK_INT;
            Context context = this.c;
            IntentFilter intentFilter = this.b;
            if (i >= 33) {
                context.registerReceiver(n80Var2, intentFilter, 2);
            } else {
                context.registerReceiver(n80Var2, intentFilter);
            }
        }
        if (this.f || !this.d.isEmpty() || (n80Var = this.e) == null) {
            return;
        }
        this.c.unregisterReceiver(n80Var);
        this.e = null;
    }

    public final void b(Intent intent) {
        Bundle bundleExtra = intent.getBundleExtra("com.google.android.play.core.FLAGS");
        if (bundleExtra == null || !bundleExtra.getBoolean("enableWorkManager")) {
            Bundle bundleExtra2 = intent.getBundleExtra("com.google.android.play.core.assetpacks.receiver.EXTRA_SESSION_STATE");
            rch rchVar = this.a;
            if (bundleExtra2 == null) {
                rchVar.b("Empty bundle received from broadcast.", new Object[0]);
                return;
            }
            ArrayList<String> stringArrayList = bundleExtra2.getStringArrayList("pack_names");
            if (stringArrayList == null || stringArrayList.size() != 1) {
                rchVar.b("Corrupt bundle received from broadcast.", new Object[0]);
                return;
            }
            bs bsVarA = bs.a(bundleExtra2, stringArrayList.get(0), this.j, this.k, new pzd(13));
            rchVar.a("ListenerRegistryBroadcastReceiver.onReceive: %s", bsVarA);
            if (((PendingIntent) bundleExtra2.getParcelable("confirmation_intent")) != null) {
                this.i.getClass();
            }
            ((Executor) this.o.a()).execute(new qe(this, bundleExtra2, bsVarA, false, 5));
            ((Executor) this.n.a()).execute(new w36(17, this, bundleExtra2));
        }
    }
}
