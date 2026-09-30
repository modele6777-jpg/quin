package defpackage;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ConnectException;
import java.net.InetSocketAddress;
import java.net.ProtocolException;
import java.net.Proxy;
import java.net.Socket;
import java.net.UnknownServiceException;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentLinkedQueue;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLException;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class wj2 implements j7c, t25 {
    public final kle a;
    public final ws4 b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final boolean g;
    public final cib h;
    public final sib i;
    public final e7c j;
    public final List k;
    public final btb l;
    public final int m;
    public final boolean n;
    public volatile boolean o;
    public Socket p;
    public Socket q;
    public bh6 r;
    public a1b s;
    public ta0 t;
    public dib u;

    public wj2(kle kleVar, ws4 ws4Var, int i, int i2, int i3, int i4, boolean z, cib cibVar, sib sibVar, e7c e7cVar, List list, btb btbVar, int i5, boolean z2) {
        kleVar.getClass();
        e7cVar.getClass();
        this.a = kleVar;
        this.b = ws4Var;
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = i4;
        this.g = z;
        this.h = cibVar;
        this.i = sibVar;
        this.j = e7cVar;
        this.k = list;
        this.l = btbVar;
        this.m = i5;
        this.n = z2;
    }

    @Override // defpackage.j7c
    public final boolean a() {
        return this.s != null;
    }

    @Override // defpackage.j7c
    public final j7c b() {
        return new wj2(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n);
    }

    @Override // defpackage.j7c
    public final dib c() {
        vrb vrbVar = this.h.a.B;
        e7c e7cVar = this.j;
        synchronized (vrbVar) {
            e7cVar.getClass();
            ((LinkedHashSet) vrbVar.b).remove(e7cVar);
        }
        dib dibVar = this.u;
        dibVar.getClass();
        this.j.getClass();
        h0c h0cVarD = this.i.d(this, this.k);
        if (h0cVarD != null) {
            return h0cVarD.a;
        }
        synchronized (dibVar) {
            ws4 ws4Var = this.b;
            TimeZone timeZone = keg.a;
            ((ConcurrentLinkedQueue) ws4Var.d).add(dibVar);
            ((jle) ws4Var.b).c((s94) ws4Var.c, 0L);
            this.h.a(dibVar);
        }
        this.h.d.getClass();
        return dibVar;
    }

    @Override // defpackage.j7c
    public final void cancel() {
        this.o = true;
        Socket socket = this.p;
        if (socket != null) {
            keg.c(socket);
        }
    }

    @Override // defpackage.j7c
    public final i7c d() {
        Socket socket;
        Socket socket2;
        if (this.p != null) {
            qc0.p("TCP already connected");
            return null;
        }
        this.h.H0.add(this);
        boolean z = false;
        try {
            try {
                tz4 tz4Var = this.h.d;
                InetSocketAddress inetSocketAddress = this.j.c;
                tz4Var.getClass();
                inetSocketAddress.getClass();
                this.j.getClass();
                i();
                z = true;
                i7c i7cVar = new i7c(this, (Throwable) null, 6);
                this.h.H0.remove(this);
                return i7cVar;
            } catch (IOException e) {
                e7c e7cVar = this.j;
                hh hhVar = e7cVar.a;
                if (e7cVar.b.type() != Proxy.Type.DIRECT) {
                    hh hhVar2 = this.j.a;
                    hhVar2.g.connectFailed(hhVar2.h.j(), this.j.b.address(), e);
                }
                tz4 tz4Var2 = this.h.d;
                InetSocketAddress inetSocketAddress2 = this.j.c;
                tz4Var2.getClass();
                inetSocketAddress2.getClass();
                this.j.getClass();
                i7c i7cVar2 = new i7c(this, e, 2);
                this.h.H0.remove(this);
                if (!z && (socket = this.p) != null) {
                    keg.c(socket);
                }
                return i7cVar2;
            }
        } catch (Throwable th) {
            this.h.H0.remove(this);
            if (!z && (socket2 = this.p) != null) {
                keg.c(socket2);
            }
            throw th;
        }
    }

    /* JADX WARN: Code duplicated, block: B:85:0x015a  */
    /* JADX WARN: Code duplicated, block: B:87:0x015e  */
    @Override // defpackage.j7c
    public final i7c g() throws Throwable {
        wj2 wj2VarL;
        Socket socket;
        wj2 wj2Var;
        Socket socket2 = this.p;
        wj2 wj2Var2 = null;
        if (socket2 == null) {
            qc0.j("TCP not connected");
            return null;
        }
        if (a()) {
            qc0.p("already connected");
            return null;
        }
        List list = this.j.a.j;
        this.h.H0.add(this);
        boolean z = false;
        try {
            try {
                if (this.l != null) {
                    i7c i7cVarK = k();
                    if (i7cVarK.c != null) {
                        this.h.H0.remove(this);
                        Socket socket3 = this.q;
                        if (socket3 != null) {
                            keg.c(socket3);
                        }
                        keg.c(socket2);
                        return i7cVarK;
                    }
                }
                hh hhVar = this.j.a;
                if (hhVar.c != null) {
                    ta0 ta0Var = this.t;
                    if (ta0Var == null) {
                        pa7.g0("socket");
                        throw null;
                    }
                    if (((yhb) ta0Var.d).b.E()) {
                        ta0 ta0Var2 = this.t;
                        if (ta0Var2 == null) {
                            pa7.g0("socket");
                            throw null;
                        }
                        if (((xhb) ta0Var2.b).b.E()) {
                            this.h.d.getClass();
                            hh hhVar2 = this.j.a;
                            SSLSocketFactory sSLSocketFactory = hhVar2.c;
                            ct6 ct6Var = hhVar2.h;
                            Socket socketCreateSocket = sSLSocketFactory.createSocket(socket2, ct6Var.d, ct6Var.e, true);
                            socketCreateSocket.getClass();
                            SSLSocket sSLSocket = (SSLSocket) socketCreateSocket;
                            wj2 wj2VarM = m(list, sSLSocket);
                            hk2 hk2Var = (hk2) list.get(wj2VarM.m);
                            wj2VarL = wj2VarM.l(list, sSLSocket);
                            try {
                                hk2Var.a(sSLSocket, wj2VarM.n);
                                j(sSLSocket, hk2Var);
                                this.h.d.getClass();
                                wj2Var = wj2VarL;
                            } catch (IOException e) {
                                e = e;
                                tz4 tz4Var = this.h.d;
                                InetSocketAddress inetSocketAddress = this.j.c;
                                tz4Var.getClass();
                                inetSocketAddress.getClass();
                                this.j.getClass();
                                if (this.g && !(e instanceof ProtocolException) && !(e instanceof InterruptedIOException) && ((!(e instanceof SSLHandshakeException) || !(e.getCause() instanceof CertificateException)) && !(e instanceof SSLPeerUnverifiedException) && (e instanceof SSLException))) {
                                    wj2Var2 = wj2VarL;
                                }
                                i7c i7cVar = new i7c(this, wj2Var2, e);
                                this.h.H0.remove(this);
                                if (!z) {
                                    socket = this.q;
                                    if (socket != null) {
                                        keg.c(socket);
                                    }
                                    keg.c(socket2);
                                }
                                return i7cVar;
                            }
                        }
                    }
                    throw new IOException("TLS tunnel buffered too many bytes!");
                }
                this.q = socket2;
                List list2 = hhVar.i;
                a1b a1bVar = a1b.H2_PRIOR_KNOWLEDGE;
                if (!list2.contains(a1bVar)) {
                    a1bVar = a1b.HTTP_1_1;
                }
                this.s = a1bVar;
                wj2Var = null;
                try {
                    kle kleVar = this.a;
                    ws4 ws4Var = this.b;
                    e7c e7cVar = this.j;
                    Socket socket4 = this.q;
                    socket4.getClass();
                    bh6 bh6Var = this.r;
                    a1b a1bVar2 = this.s;
                    a1bVar2.getClass();
                    ta0 ta0Var3 = this.t;
                    if (ta0Var3 == null) {
                        pa7.g0("socket");
                        throw null;
                    }
                    dib dibVar = new dib(kleVar, ws4Var, e7cVar, socket2, socket4, bh6Var, a1bVar2, ta0Var3);
                    this.u = dibVar;
                    dibVar.i();
                    tz4 tz4Var2 = this.h.d;
                    InetSocketAddress inetSocketAddress2 = this.j.c;
                    tz4Var2.getClass();
                    inetSocketAddress2.getClass();
                    try {
                        i7c i7cVar2 = new i7c(this, (Throwable) null, 6);
                        this.h.H0.remove(this);
                        return i7cVar2;
                    } catch (IOException e2) {
                        e = e2;
                        z = true;
                        wj2VarL = wj2Var;
                        tz4 tz4Var3 = this.h.d;
                        InetSocketAddress inetSocketAddress3 = this.j.c;
                        tz4Var3.getClass();
                        inetSocketAddress3.getClass();
                        this.j.getClass();
                        if (this.g) {
                            wj2Var2 = wj2VarL;
                        }
                        i7c i7cVar3 = new i7c(this, wj2Var2, e);
                        this.h.H0.remove(this);
                        if (!z) {
                            socket = this.q;
                            if (socket != null) {
                                keg.c(socket);
                            }
                            keg.c(socket2);
                        }
                        return i7cVar3;
                    } catch (Throwable th) {
                        th = th;
                        z = true;
                        this.h.H0.remove(this);
                        if (!z) {
                            Socket socket5 = this.q;
                            if (socket5 != null) {
                                keg.c(socket5);
                            }
                            keg.c(socket2);
                        }
                        throw th;
                    }
                } catch (IOException e3) {
                    e = e3;
                }
            } catch (Throwable th2) {
                th = th2;
            }
        } catch (IOException e4) {
            e = e4;
            wj2VarL = null;
        }
    }

    @Override // defpackage.t25
    public final e7c h() {
        return this.j;
    }

    public final void i() throws IOException {
        Socket socketCreateSocket;
        Proxy.Type type = this.j.b.type();
        int i = type == null ? -1 : vj2.a[type.ordinal()];
        if (i == 1 || i == 2) {
            socketCreateSocket = this.j.a.b.createSocket();
            socketCreateSocket.getClass();
        } else {
            socketCreateSocket = new Socket(this.j.b);
        }
        this.p = socketCreateSocket;
        if (this.o) {
            yg5.m("canceled");
            return;
        }
        socketCreateSocket.setSoTimeout(this.f);
        try {
            sea seaVar = sea.a;
            sea.a.e(socketCreateSocket, this.j.c, this.e);
            try {
                this.t = new ta0(new szc(socketCreateSocket));
            } catch (NullPointerException e) {
                if (pa7.t(e.getMessage(), "throw with null exception")) {
                    throw new IOException(e);
                }
            }
        } catch (ConnectException e2) {
            ConnectException connectException = new ConnectException("Failed to connect to " + this.j.c);
            connectException.initCause(e2);
            throw connectException;
        }
    }

    public final void j(SSLSocket sSLSocket, hk2 hk2Var) {
        a1b a1bVarS;
        hh hhVar = this.j.a;
        try {
            if (hk2Var.b) {
                sea seaVar = sea.a;
                sea.a.d(sSLSocket, hhVar.h.d, hhVar.i);
            }
            sSLSocket.startHandshake();
            SSLSession session = sSLSocket.getSession();
            session.getClass();
            bh6 bh6VarR = jgb.R(session);
            HostnameVerifier hostnameVerifier = hhVar.d;
            hostnameVerifier.getClass();
            if (hostnameVerifier.verify(hhVar.h.d, session)) {
                rv1 rv1Var = hhVar.e;
                rv1Var.getClass();
                this.r = new bh6(bh6VarR.a, bh6VarR.b, bh6VarR.c, new j8(rv1Var, bh6VarR, hhVar, 10));
                hhVar.h.d.getClass();
                Iterator it = rv1Var.a.iterator();
                String strF = null;
                if (it.hasNext()) {
                    kv2.z(it.next());
                    throw null;
                }
                if (hk2Var.b) {
                    sea seaVar2 = sea.a;
                    strF = sea.a.f(sSLSocket);
                }
                this.q = sSLSocket;
                this.t = new ta0(new szc(sSLSocket));
                if (strF != null) {
                    a1b.a.getClass();
                    a1bVarS = y25.s(strF);
                } else {
                    a1bVarS = a1b.HTTP_1_1;
                }
                this.s = a1bVarS;
                sea seaVar3 = sea.a;
                sea.a.getClass();
                return;
            }
            List listA = bh6VarR.a();
            if (listA.isEmpty()) {
                throw new SSLPeerUnverifiedException("Hostname " + hhVar.h.d + " not verified (no certificates)");
            }
            Object obj = listA.get(0);
            obj.getClass();
            X509Certificate x509Certificate = (X509Certificate) obj;
            StringBuilder sb = new StringBuilder("\n            |Hostname ");
            sb.append(hhVar.h.d);
            sb.append(" not verified:\n            |    certificate: ");
            rv1 rv1Var2 = rv1.c;
            StringBuilder sb2 = new StringBuilder("sha256/");
            a71 a71Var = a71.c;
            byte[] encoded = x509Certificate.getPublicKey().getEncoded();
            encoded.getClass();
            sb2.append(m8c.A(encoded).c("SHA-256").a());
            sb.append(sb2.toString());
            sb.append("\n            |    DN: ");
            sb.append(x509Certificate.getSubjectDN().getName());
            sb.append("\n            |    subjectAltNames: ");
            sb.append(s72.Q0(cm9.a(x509Certificate, 7), cm9.a(x509Certificate, 2)));
            sb.append("\n            ");
            throw new SSLPeerUnverifiedException(w4e.q(sb.toString()));
        } catch (Throwable th) {
            sea seaVar4 = sea.a;
            sea.a.getClass();
            keg.c(sSLSocket);
            throw th;
        }
    }

    public final i7c k() throws IOException {
        btb btbVar = this.l;
        btbVar.getClass();
        e7c e7cVar = this.j;
        String str = "CONNECT " + keg.i(e7cVar.a.h, true) + " HTTP/1.1";
        ta0 ta0Var = this.t;
        if (ta0Var == null) {
            pa7.g0("socket");
            throw null;
        }
        vr6 vr6Var = new vr6(null, this, ta0Var);
        ta0 ta0Var2 = this.t;
        if (ta0Var2 == null) {
            pa7.g0("socket");
            throw null;
        }
        ((yhb) ta0Var2.d).a.j().g(this.c);
        ta0 ta0Var3 = this.t;
        if (ta0Var3 == null) {
            pa7.g0("socket");
            throw null;
        }
        ((xhb) ta0Var3.b).a.j().g(this.d);
        vr6Var.l(btbVar.c, str);
        vr6Var.c();
        pyb pybVarG = vr6Var.g(false);
        pybVarG.getClass();
        pybVarG.a = btbVar;
        ryb rybVarA = pybVarG.a();
        int i = rybVarA.d;
        long jE = keg.e(rybVarA);
        if (jE != -1) {
            tr6 tr6VarK = vr6Var.k(rybVarA.a.a, jE);
            keg.g(tr6VarK, Integer.MAX_VALUE);
            tr6VarK.close();
        }
        if (i == 200) {
            return new i7c(this, (Throwable) null, 6);
        }
        if (i != 407) {
            yg5.m(tec.e(i, "Unexpected response code for CONNECT: "));
            return null;
        }
        e7cVar.a.f.getClass();
        yg5.m("Failed to authenticate with proxy");
        return null;
    }

    public final wj2 l(List list, SSLSocket sSLSocket) {
        String[] strArr;
        String[] strArr2;
        int i = this.m;
        int size = list.size();
        for (int i2 = i + 1; i2 < size; i2++) {
            hk2 hk2Var = (hk2) list.get(i2);
            hk2Var.getClass();
            if (hk2Var.a && (((strArr = hk2Var.d) == null || ieg.g(strArr, sSLSocket.getEnabledProtocols(), aa9.b)) && ((strArr2 = hk2Var.c) == null || ieg.g(strArr2, sSLSocket.getEnabledCipherSuites(), qz1.c)))) {
                return new wj2(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, i2, i != -1);
            }
        }
        return null;
    }

    public final wj2 m(List list, SSLSocket sSLSocket) throws UnknownServiceException {
        if (this.m != -1) {
            return this;
        }
        wj2 wj2VarL = l(list, sSLSocket);
        if (wj2VarL != null) {
            return wj2VarL;
        }
        StringBuilder sb = new StringBuilder("Unable to find acceptable protocols. isFallback=");
        sb.append(this.n);
        sb.append(", modes=");
        sb.append(list);
        String[] enabledProtocols = sSLSocket.getEnabledProtocols();
        enabledProtocols.getClass();
        String string = Arrays.toString(enabledProtocols);
        string.getClass();
        sb.append(", supported protocols=");
        sb.append(string);
        throw new UnknownServiceException(sb.toString());
    }

    @Override // defpackage.t25
    public final void e() {
    }

    @Override // defpackage.t25
    public final void f(cib cibVar, IOException iOException) {
    }
}
