package defpackage;

import android.content.Context;
import android.net.http.X509TrustManagerExtensions;
import android.os.Build;
import android.os.StrictMode;
import android.security.NetworkSecurityPolicy;
import android.util.CloseGuard;
import android.util.Log;
import io.sentry.android.core.b1;
import java.security.NoSuchAlgorithmException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class po extends sea implements hn2 {
    public static final boolean e;
    public Context c;
    public final ArrayList d;

    static {
        e = Build.VERSION.SDK_INT >= 29;
    }

    public po() {
        List listK0 = qd0.k0(new ssd[]{Build.VERSION.SDK_INT >= 29 ? new qo() : null, new wu3(hv.e), new wu3(xk2.a), new wu3(c21.a)});
        ArrayList arrayList = new ArrayList();
        for (Object obj : (ArrayList) listK0) {
            if (((ssd) obj).b()) {
                arrayList.add(obj);
            }
        }
        this.d = arrayList;
    }

    @Override // defpackage.hn2
    public final void a(Context context) {
        this.c = context;
    }

    @Override // defpackage.hn2
    public final Context b() {
        return this.c;
    }

    @Override // defpackage.sea
    public final hkg c(X509TrustManager x509TrustManager) {
        X509TrustManagerExtensions x509TrustManagerExtensions;
        try {
            x509TrustManagerExtensions = new X509TrustManagerExtensions(x509TrustManager);
        } catch (IllegalArgumentException unused) {
            x509TrustManagerExtensions = null;
        }
        pp ppVar = x509TrustManagerExtensions != null ? new pp(x509TrustManager, x509TrustManagerExtensions) : null;
        if (ppVar != null) {
            return ppVar;
        }
        StrictMode.noteSlowCall("buildTrustRootIndex");
        X509Certificate[] acceptedIssuers = x509TrustManager.getAcceptedIssuers();
        return new qu0(new rw0((X509Certificate[]) Arrays.copyOf(acceptedIssuers, acceptedIssuers.length)));
    }

    @Override // defpackage.sea
    public final void d(SSLSocket sSLSocket, String str, List list) {
        Object next;
        Iterator it = this.d.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((ssd) next).a(sSLSocket));
        ssd ssdVar = (ssd) next;
        if (ssdVar != null) {
            ssdVar.d(sSLSocket, str, list);
        }
    }

    @Override // defpackage.sea
    public final String f(SSLSocket sSLSocket) {
        Object next;
        Iterator it = this.d.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((ssd) next).a(sSLSocket));
        ssd ssdVar = (ssd) next;
        if (ssdVar != null) {
            return ssdVar.c(sSLSocket);
        }
        return null;
    }

    @Override // defpackage.sea
    public final Object g() {
        if (Build.VERSION.SDK_INT < 30) {
            return super.g();
        }
        CloseGuard closeGuard = new CloseGuard();
        closeGuard.open("response.body().close()");
        return closeGuard;
    }

    @Override // defpackage.sea
    public final boolean h(String str) {
        str.getClass();
        return NetworkSecurityPolicy.getInstance().isCleartextTrafficPermitted(str);
    }

    @Override // defpackage.sea
    public final void i(int i, String str, Throwable th) {
        if (i == 5) {
            boolean z = eu.e;
            b1.n("OkHttp", str, th);
        } else {
            boolean z2 = eu.e;
            Log.i("OkHttp", str, th);
        }
    }

    @Override // defpackage.sea
    public final void j(Object obj, String str) {
        if (Build.VERSION.SDK_INT < 30) {
            super.j(obj, str);
        } else {
            obj.getClass();
            l81.b(obj).warnIfOpen();
        }
    }

    @Override // defpackage.sea
    public final SSLContext k() throws NoSuchAlgorithmException {
        StrictMode.noteSlowCall("newSSLContext");
        SSLContext sSLContext = SSLContext.getInstance("TLS");
        sSLContext.getClass();
        return sSLContext;
    }
}
