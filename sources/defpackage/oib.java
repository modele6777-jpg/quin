package defpackage;

import java.net.ProxySelector;
import java.util.ArrayList;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class oib {
    public final cib a;
    public final ArrayList b;
    public final int c;
    public final zi0 d;
    public final btb e;
    public final int f;
    public final int g;
    public final int h;
    public final ndb i;
    public final a81 j;
    public final rv1 k;
    public final mjg l;
    public final fu2 m;
    public final ndb n;
    public final HostnameVerifier o;
    public final ndb p;
    public final ProxySelector q;
    public final boolean r;
    public final SocketFactory s;
    public final SSLSocketFactory t;
    public final X509TrustManager u;
    public final hkg v;
    public int w;

    public oib(cib cibVar, ArrayList arrayList, int i, zi0 zi0Var, btb btbVar, int i2, int i3, int i4, ndb ndbVar, a81 a81Var, rv1 rv1Var, mjg mjgVar, fu2 fu2Var, ndb ndbVar2, HostnameVerifier hostnameVerifier, ndb ndbVar3, ProxySelector proxySelector, boolean z, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, X509TrustManager x509TrustManager, hkg hkgVar) {
        btbVar.getClass();
        ndbVar.getClass();
        rv1Var.getClass();
        mjgVar.getClass();
        fu2Var.getClass();
        ndbVar2.getClass();
        hostnameVerifier.getClass();
        ndbVar3.getClass();
        proxySelector.getClass();
        socketFactory.getClass();
        this.a = cibVar;
        this.b = arrayList;
        this.c = i;
        this.d = zi0Var;
        this.e = btbVar;
        this.f = i2;
        this.g = i3;
        this.h = i4;
        this.i = ndbVar;
        this.j = a81Var;
        this.k = rv1Var;
        this.l = mjgVar;
        this.m = fu2Var;
        this.n = ndbVar2;
        this.o = hostnameVerifier;
        this.p = ndbVar3;
        this.q = proxySelector;
        this.r = z;
        this.s = socketFactory;
        this.t = sSLSocketFactory;
        this.u = x509TrustManager;
        this.v = hkgVar;
    }

    public static oib a(oib oibVar, int i, zi0 zi0Var, btb btbVar, int i2) {
        int i3 = (i2 & 1) != 0 ? oibVar.c : i;
        zi0 zi0Var2 = (i2 & 2) != 0 ? oibVar.d : zi0Var;
        btb btbVar2 = (i2 & 4) != 0 ? oibVar.e : btbVar;
        int i4 = oibVar.f;
        int i5 = oibVar.g;
        int i6 = oibVar.h;
        ndb ndbVar = oibVar.i;
        a81 a81Var = oibVar.j;
        rv1 rv1Var = oibVar.k;
        mjg mjgVar = oibVar.l;
        fu2 fu2Var = oibVar.m;
        ndb ndbVar2 = oibVar.n;
        HostnameVerifier hostnameVerifier = oibVar.o;
        ndb ndbVar3 = oibVar.p;
        ProxySelector proxySelector = oibVar.q;
        boolean z = oibVar.r;
        SocketFactory socketFactory = oibVar.s;
        SSLSocketFactory sSLSocketFactory = oibVar.t;
        X509TrustManager x509TrustManager = oibVar.u;
        hkg hkgVar = oibVar.v;
        btbVar2.getClass();
        ndbVar.getClass();
        rv1Var.getClass();
        mjgVar.getClass();
        fu2Var.getClass();
        ndbVar2.getClass();
        hostnameVerifier.getClass();
        ndbVar3.getClass();
        proxySelector.getClass();
        socketFactory.getClass();
        return new oib(oibVar.a, oibVar.b, i3, zi0Var2, btbVar2, i4, i5, i6, ndbVar, a81Var, rv1Var, mjgVar, fu2Var, ndbVar2, hostnameVerifier, ndbVar3, proxySelector, z, socketFactory, sSLSocketFactory, x509TrustManager, hkgVar);
    }

    public final ryb b(btb btbVar) {
        btbVar.getClass();
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i = this.c;
        if (i >= size) {
            qc0.p("Check failed.");
            return null;
        }
        this.w++;
        zi0 zi0Var = this.d;
        if (zi0Var != null) {
            sib sibVarD = ((v25) zi0Var.c).d();
            ct6 ct6Var = btbVar.a;
            sibVarD.getClass();
            ct6Var.getClass();
            ct6 ct6Var2 = sibVarD.i.h;
            if (ct6Var.e != ct6Var2.e || !pa7.t(ct6Var.d, ct6Var2.d)) {
                r82.e(arrayList.get(i - 1), " must retain the same host and port", "network interceptor ");
                return null;
            }
            if (this.w != 1) {
                r82.e(arrayList.get(i - 1), " must call proceed() exactly once", "network interceptor ");
                return null;
            }
        }
        int i2 = i + 1;
        oib oibVarA = a(this, i2, null, btbVar, 2097146);
        i87 i87Var = (i87) arrayList.get(i);
        ryb rybVarA = i87Var.a(oibVarA);
        if (rybVarA == null) {
            throw new NullPointerException("interceptor " + i87Var + " returned null");
        }
        if (zi0Var == null || i2 >= arrayList.size() || oibVarA.w == 1) {
            return rybVarA;
        }
        r82.e(i87Var, " must call proceed() exactly once", "network interceptor ");
        return null;
    }
}
