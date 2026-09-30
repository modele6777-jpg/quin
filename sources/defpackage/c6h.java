package defpackage;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import com.adjust.sdk.Constants;
import io.sentry.android.core.v;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class c6h implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ c8h b;

    public /* synthetic */ c6h(c8h c8hVar, int i) {
        this.a = i;
        this.b = c8hVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        c8h c8hVar = this.b;
        switch (i) {
            case 0:
                c8hVar.X0();
                break;
            case 1:
                fnb fnbVar = c8hVar.G0;
                w3h w3hVar = (w3h) fnbVar.a;
                m3h m3hVar = w3hVar.g;
                c8h c8hVar2 = w3hVar.X;
                c2h c2hVar = w3hVar.e;
                w3h.h(m3hVar);
                m3hVar.A0();
                if (fnbVar.g()) {
                    if (fnbVar.f()) {
                        w3h.f(c2hVar);
                        c2hVar.M0.D(null);
                        Bundle bundle = new Bundle();
                        bundle.putString("source", "(not set)");
                        bundle.putString(Constants.MEDIUM, "(not set)");
                        bundle.putString("_cis", "intent");
                        bundle.putLong("_cc", 1L);
                        w3h.g(c8hVar2);
                        c8hVar2.H0("auto", "_cmpx", bundle);
                    } else {
                        w3h.f(c2hVar);
                        zi0 zi0Var = c2hVar.M0;
                        String strC = zi0Var.C();
                        if (TextUtils.isEmpty(strC)) {
                            w0h w0hVar = w3hVar.f;
                            w3h.h(w0hVar);
                            w0hVar.v.a("Cache still valid but referrer not found");
                        } else {
                            long j = 3600000;
                            long jA = c2hVar.N0.a() / 3600000;
                            Uri uri = Uri.parse(strC);
                            Bundle bundle2 = new Bundle();
                            Pair pair = new Pair(uri.getPath(), bundle2);
                            for (String str : uri.getQueryParameterNames()) {
                                bundle2.putString(str, uri.getQueryParameter(str));
                                j = j;
                            }
                            ((Bundle) pair.second).putLong("_cc", (jA - 1) * j);
                            Object obj = pair.first;
                            String str2 = obj == null ? "app" : (String) obj;
                            w3h.g(c8hVar2);
                            c8hVar2.H0(str2, "_cmp", (Bundle) pair.second);
                        }
                        zi0Var.D(null);
                    }
                    w3h.f(c2hVar);
                    c2hVar.N0.b(0L);
                    break;
                }
                break;
            case 2:
                c8hVar.A0();
                w3h w3hVar2 = (w3h) c8hVar.b;
                c2h c2hVar2 = w3hVar2.e;
                w0h w0hVar2 = w3hVar2.f;
                w3h.f(c2hVar2);
                t1h t1hVar = c2hVar2.J0;
                if (t1hVar.a()) {
                    w3h.h(w0hVar2);
                    w0hVar2.Y.a("Deferred Deep Link already retrieved. Not fetching again.");
                } else {
                    v vVar = c2hVar2.K0;
                    long jA2 = vVar.a();
                    vVar.b(1 + jA2);
                    if (jA2 >= 5) {
                        w3h.h(w0hVar2);
                        w0hVar2.x.a("Permanently failed to retrieve Deferred Deep Link. Reached maximum retries.");
                        t1hVar.b(true);
                    } else {
                        e6h e6hVar = c8hVar.I0;
                        if (e6hVar == null) {
                            e6hVar = new e6h(c8hVar, w3hVar2, 3, false);
                            c8hVar.I0 = e6hVar;
                        }
                        e6hVar.b(0L);
                    }
                }
                break;
            default:
                c8hVar.X0();
                break;
        }
    }
}
