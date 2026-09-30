package defpackage;

import java.net.ProxySelector;
import java.util.ArrayList;
import java.util.List;
import java.util.TimeZone;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class gm9 {
    public int A;
    public long B;
    public vrb C;
    public kle D;
    public mjg b;
    public s8f e;
    public boolean f;
    public boolean g;
    public ndb h;
    public boolean i;
    public boolean j;
    public fu2 k;
    public a81 l;
    public ndb m;
    public ProxySelector n;
    public ndb o;
    public SocketFactory p;
    public SSLSocketFactory q;
    public X509TrustManager r;
    public List s;
    public List t;
    public HostnameVerifier u;
    public rv1 v;
    public hkg w;
    public int x;
    public int y;
    public int z;
    public da4 a = new da4();
    public final ArrayList c = new ArrayList();
    public final ArrayList d = new ArrayList();

    public gm9() {
        TimeZone timeZone = keg.a;
        this.e = new s8f(19);
        this.f = true;
        this.g = true;
        ndb ndbVar = ndb.F0;
        this.h = ndbVar;
        this.i = true;
        this.j = true;
        this.k = fu2.s;
        this.m = ndb.P0;
        this.o = ndbVar;
        SocketFactory socketFactory = SocketFactory.getDefault();
        socketFactory.getClass();
        this.p = socketFactory;
        this.s = hm9.F;
        this.t = hm9.E;
        this.u = cm9.a;
        this.v = rv1.c;
        this.x = 10000;
        this.y = 10000;
        this.z = 10000;
        this.A = 60000;
        this.B = 1024L;
    }

    public final void a(long j) {
        TimeUnit.SECONDS.getClass();
        this.y = keg.b(j);
    }
}
