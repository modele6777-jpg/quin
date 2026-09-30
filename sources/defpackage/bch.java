package defpackage;

import android.net.Uri;
import android.os.StrictMode;
import io.sentry.android.core.b1;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class bch implements i26 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ bch(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.i26
    public final Object apply(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                b1.n("FlagStore", "Failed to commit to updated flags for ".concat(String.valueOf(((jch) obj2).c)), (Throwable) obj);
                return null;
            default:
                pdh pdhVar = (pdh) obj2;
                qah qahVar = (qah) obj;
                m7h m7hVar = new m7h();
                StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
                StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder(threadPolicy).permitDiskWrites().build());
                try {
                    try {
                        synchronized (pdh.j) {
                            xdh xdhVar = (xdh) pdhVar.d.get();
                            Uri uri = pdhVar.g;
                            gsg gsgVar = new gsg(qahVar.r());
                            gsgVar.b = new m7h[]{m7hVar};
                            xdhVar.a(uri, gsgVar);
                            pdhVar.h = qahVar.r();
                            break;
                        }
                        synchronized (pdh.k) {
                            xdh xdhVar2 = (xdh) pdhVar.d.get();
                            Uri uri2 = pdhVar.i;
                            gsg gsgVar2 = new gsg(qahVar.s());
                            gsgVar2.b = new m7h[]{m7hVar};
                            xdhVar2.a(uri2, gsgVar2);
                            qahVar.s();
                            break;
                        }
                        StrictMode.setThreadPolicy(threadPolicy);
                        return null;
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                } catch (Throwable th) {
                    StrictMode.setThreadPolicy(threadPolicy);
                    throw th;
                }
        }
    }
}
