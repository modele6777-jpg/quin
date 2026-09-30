package defpackage;

import com.adjust.sdk.Constants;
import java.net.ProxySelector;
import java.util.List;
import java.util.Objects;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class hh {
    public final ndb a;
    public final SocketFactory b;
    public final SSLSocketFactory c;
    public final HostnameVerifier d;
    public final rv1 e;
    public final ndb f;
    public final ProxySelector g;
    public final ct6 h;
    public final List i;
    public final List j;

    public hh(String str, int i, ndb ndbVar, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, rv1 rv1Var, ndb ndbVar2, List list, List list2, ProxySelector proxySelector) {
        str.getClass();
        ndbVar.getClass();
        socketFactory.getClass();
        ndbVar2.getClass();
        list.getClass();
        list2.getClass();
        proxySelector.getClass();
        this.a = ndbVar;
        this.b = socketFactory;
        this.c = sSLSocketFactory;
        this.d = hostnameVerifier;
        this.e = rv1Var;
        this.f = ndbVar2;
        this.g = proxySelector;
        bt6 bt6Var = new bt6();
        String str2 = sSLSocketFactory != null ? Constants.SCHEME : "http";
        if (str2.equalsIgnoreCase("http")) {
            bt6Var.e = "http";
        } else {
            if (!str2.equalsIgnoreCase(Constants.SCHEME)) {
                qc0.j("unexpected scheme: ".concat(str2));
                throw null;
            }
            bt6Var.e = Constants.SCHEME;
        }
        String strB = geg.b(n16.R(str, 0, 0, 7));
        if (strB == null) {
            qc0.j("unexpected host: ".concat(str));
            throw null;
        }
        bt6Var.h = strB;
        if (1 > i || i >= 65536) {
            qc0.o(tec.e(i, "unexpected port: "));
            throw null;
        }
        bt6Var.d = i;
        this.h = bt6Var.a();
        this.i = keg.j(list);
        this.j = keg.j(list2);
    }

    public final boolean a(hh hhVar) {
        return pa7.t(this.a, hhVar.a) && pa7.t(this.f, hhVar.f) && this.i.equals(hhVar.i) && this.j.equals(hhVar.j) && pa7.t(this.g, hhVar.g) && pa7.t(this.c, hhVar.c) && pa7.t(this.d, hhVar.d) && pa7.t(this.e, hhVar.e) && this.h.e == hhVar.h.e;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof hh)) {
            return false;
        }
        hh hhVar = (hh) obj;
        return this.h.equals(hhVar.h) && a(hhVar);
    }

    public final int hashCode() {
        return Objects.hashCode(this.e) + ((Objects.hashCode(this.d) + ((Objects.hashCode(this.c) + ((this.g.hashCode() + tec.a(tec.a((this.f.hashCode() + ((this.a.hashCode() + ub3.c(527, 31, this.h.i)) * 31)) * 31, 31, this.i), 31, this.j)) * 961)) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Address{");
        ct6 ct6Var = this.h;
        sb.append(ct6Var.d);
        sb.append(':');
        sb.append(ct6Var.e);
        sb.append(", ");
        sb.append("proxySelector=" + this.g);
        sb.append('}');
        return sb.toString();
    }
}
