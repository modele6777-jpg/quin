package defpackage;

import android.os.Handler;
import android.os.Looper;
import com.google.android.play.core.assetpacks.b;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class dhg {
    public static final rch e = new rch("AssetPackManager");
    public final b a;
    public final hfg b;
    public final bfg c;
    public final bfg d;

    public dhg(b bVar, bfg bfgVar, hfg hfgVar, bfg bfgVar2) {
        new Handler(Looper.getMainLooper());
        this.a = bVar;
        this.c = bfgVar;
        this.b = hfgVar;
        this.d = bfgVar2;
    }

    public final void a(boolean z) {
        n80 n80Var;
        int i;
        hfg hfgVar = this.b;
        synchronized (hfgVar) {
            n80Var = hfgVar.e;
            i = 1;
        }
        boolean z2 = n80Var != null;
        synchronized (hfgVar) {
            hfgVar.f = z;
            hfgVar.a();
        }
        if (!z || z2) {
            return;
        }
        ((Executor) this.d.a()).execute(new jfg(i, this));
    }
}
