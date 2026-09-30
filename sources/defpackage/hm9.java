package defpackage;

import java.net.ProxySelector;
import java.security.GeneralSecurityException;
import java.security.KeyStore;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class hm9 {
    public static final List E = keg.k(new a1b[]{a1b.HTTP_2, a1b.HTTP_1_1});
    public static final List F = keg.k(new hk2[]{hk2.e, hk2.f});
    public final long A;
    public final vrb B;
    public final kle C;
    public final mjg D;
    public final da4 a;
    public final List b;
    public final List c;
    public final s8f d;
    public final boolean e;
    public final boolean f;
    public final ndb g;
    public final boolean h;
    public final boolean i;
    public final fu2 j;
    public final a81 k;
    public final ndb l;
    public final ProxySelector m;
    public final ndb n;
    public final SocketFactory o;
    public final SSLSocketFactory p;
    public final X509TrustManager q;
    public final List r;
    public final List s;
    public final HostnameVerifier t;
    public final rv1 u;
    public final hkg v;
    public final int w;
    public final int x;
    public final int y;
    public final int z;

    public hm9(gm9 gm9Var) throws NoSuchAlgorithmException, KeyStoreException {
        SSLSocketFactory sSLSocketFactory;
        X509TrustManager x509TrustManager;
        hkg hkgVar;
        this.a = gm9Var.a;
        this.b = keg.j(gm9Var.c);
        this.c = keg.j(gm9Var.d);
        this.d = gm9Var.e;
        this.e = gm9Var.f;
        this.f = gm9Var.g;
        this.g = gm9Var.h;
        this.h = gm9Var.i;
        this.i = gm9Var.j;
        this.j = gm9Var.k;
        this.k = gm9Var.l;
        this.l = gm9Var.m;
        ProxySelector proxySelector = gm9Var.n;
        if (proxySelector == null && (proxySelector = ProxySelector.getDefault()) == null) {
            proxySelector = oj9.a;
        }
        this.m = proxySelector;
        this.n = gm9Var.o;
        this.o = gm9Var.p;
        List list = gm9Var.s;
        this.r = list;
        this.s = gm9Var.t;
        this.t = gm9Var.u;
        this.w = gm9Var.x;
        this.x = gm9Var.y;
        this.y = gm9Var.z;
        this.z = gm9Var.A;
        this.A = gm9Var.B;
        vrb vrbVar = gm9Var.C;
        this.B = vrbVar == null ? new vrb(1) : vrbVar;
        kle kleVar = gm9Var.D;
        this.C = kleVar == null ? kle.l : kleVar;
        mjg mjgVar = gm9Var.b;
        if (mjgVar == null) {
            mjgVar = new mjg(10);
            gm9Var.b = mjgVar;
        }
        this.D = mjgVar;
        if (list != null && list.isEmpty()) {
            this.p = null;
            this.v = null;
            this.q = null;
            this.u = rv1.c;
            sSLSocketFactory = null;
            hkgVar = null;
            x509TrustManager = null;
            break;
        }
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                this.p = null;
                this.v = null;
                this.q = null;
                this.u = rv1.c;
                sSLSocketFactory = null;
                hkgVar = null;
                x509TrustManager = null;
                break;
            }
            if (((hk2) it.next()).a) {
                sSLSocketFactory = gm9Var.q;
                if (sSLSocketFactory != null) {
                    this.p = sSLSocketFactory;
                    hkgVar = gm9Var.w;
                    hkgVar.getClass();
                    this.v = hkgVar;
                    x509TrustManager = gm9Var.r;
                    x509TrustManager.getClass();
                    this.q = x509TrustManager;
                    rv1 rv1Var = gm9Var.v;
                    rv1Var.getClass();
                    this.u = pa7.t(rv1Var.b, hkgVar) ? rv1Var : new rv1(rv1Var.a, hkgVar);
                    break;
                }
                sea seaVar = sea.a;
                sea.a.getClass();
                TrustManagerFactory trustManagerFactory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
                trustManagerFactory.init((KeyStore) null);
                TrustManager[] trustManagers = trustManagerFactory.getTrustManagers();
                trustManagers.getClass();
                if (trustManagers.length == 1) {
                    TrustManager trustManager = trustManagers[0];
                    if (trustManager instanceof X509TrustManager) {
                        X509TrustManager x509TrustManager2 = (X509TrustManager) trustManager;
                        this.q = x509TrustManager2;
                        sea seaVar2 = sea.a;
                        seaVar2.getClass();
                        try {
                            SSLContext sSLContextK = seaVar2.k();
                            sSLContextK.init(null, new TrustManager[]{x509TrustManager2}, null);
                            SSLSocketFactory socketFactory = sSLContextK.getSocketFactory();
                            socketFactory.getClass();
                            this.p = socketFactory;
                            hkg hkgVarC = sea.a.c(x509TrustManager2);
                            this.v = hkgVarC;
                            rv1 rv1Var2 = gm9Var.v;
                            rv1Var2.getClass();
                            this.u = pa7.t(rv1Var2.b, hkgVarC) ? rv1Var2 : new rv1(rv1Var2.a, hkgVarC);
                            x509TrustManager = x509TrustManager2;
                            sSLSocketFactory = socketFactory;
                            hkgVar = hkgVarC;
                            break;
                        } catch (GeneralSecurityException e) {
                            throw new AssertionError("No System TLS: " + e, e);
                        }
                    }
                }
                String string = Arrays.toString(trustManagers);
                string.getClass();
                ho7.j("Unexpected default trust managers: ".concat(string));
                throw null;
            }
        }
        List list2 = this.c;
        List list3 = this.b;
        list3.getClass();
        if (list3.contains(null)) {
            ho7.w(list3, "Null interceptor: ");
            throw null;
        }
        list2.getClass();
        if (list2.contains(null)) {
            ho7.w(list2, "Null network interceptor: ");
            throw null;
        }
        List list4 = this.r;
        if (list4 == null || !list4.isEmpty()) {
            Iterator it2 = list4.iterator();
            while (it2.hasNext()) {
                if (((hk2) it2.next()).a) {
                    if (sSLSocketFactory == null) {
                        qc0.p("sslSocketFactory == null");
                        throw null;
                    }
                    if (hkgVar == null) {
                        qc0.p("certificateChainCleaner == null");
                        throw null;
                    }
                    if (x509TrustManager != null) {
                        return;
                    }
                    qc0.p("x509TrustManager == null");
                    throw null;
                }
            }
        }
        if (sSLSocketFactory != null) {
            qc0.p("Check failed.");
            throw null;
        }
        if (hkgVar != null) {
            qc0.p("Check failed.");
            throw null;
        }
        if (x509TrustManager != null) {
            qc0.p("Check failed.");
            throw null;
        }
        if (pa7.t(this.u, rv1.c)) {
            return;
        }
        qc0.p("Check failed.");
        throw null;
    }

    public final gm9 a() {
        gm9 gm9Var = new gm9();
        gm9Var.a = this.a;
        gm9Var.b = this.D;
        x72.g0(gm9Var.c, this.b);
        x72.g0(gm9Var.d, this.c);
        gm9Var.e = this.d;
        gm9Var.f = this.e;
        gm9Var.g = this.f;
        gm9Var.h = this.g;
        gm9Var.i = this.h;
        gm9Var.j = this.i;
        gm9Var.k = this.j;
        gm9Var.l = this.k;
        gm9Var.m = this.l;
        gm9Var.n = this.m;
        gm9Var.o = this.n;
        gm9Var.p = this.o;
        gm9Var.q = this.p;
        gm9Var.r = this.q;
        gm9Var.s = this.r;
        gm9Var.t = this.s;
        gm9Var.u = this.t;
        gm9Var.v = this.u;
        gm9Var.w = this.v;
        gm9Var.x = this.w;
        gm9Var.y = this.x;
        gm9Var.z = this.y;
        gm9Var.A = this.z;
        gm9Var.B = this.A;
        gm9Var.C = this.B;
        gm9Var.D = this.C;
        return gm9Var;
    }
}
