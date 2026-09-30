package defpackage;

import java.io.IOException;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketException;
import java.net.SocketTimeoutException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.TimeZone;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.net.ssl.SSLPeerUnverifiedException;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class dib extends bs6 implements t25 {
    public final kle b;
    public final e7c c;
    public final Socket d;
    public final Socket e;
    public final bh6 f;
    public final a1b g;
    public final ta0 h;
    public ds6 i;
    public boolean j;
    public boolean k;
    public int l;
    public int m;
    public int n;
    public int o;
    public final ArrayList p;
    public long q;

    public dib(kle kleVar, ws4 ws4Var, e7c e7cVar, Socket socket, Socket socket2, bh6 bh6Var, a1b a1bVar, ta0 ta0Var) {
        kleVar.getClass();
        e7cVar.getClass();
        socket.getClass();
        socket2.getClass();
        a1bVar.getClass();
        ta0Var.getClass();
        this.b = kleVar;
        this.c = e7cVar;
        this.d = socket;
        this.e = socket2;
        this.f = bh6Var;
        this.g = a1bVar;
        this.h = ta0Var;
        this.o = 1;
        this.p = new ArrayList();
        this.q = Long.MAX_VALUE;
    }

    public static void c(hm9 hm9Var, e7c e7cVar, IOException iOException) {
        hm9Var.getClass();
        e7cVar.getClass();
        iOException.getClass();
        if (e7cVar.b.type() != Proxy.Type.DIRECT) {
            hh hhVar = e7cVar.a;
            hhVar.g.connectFailed(hhVar.h.j(), e7cVar.b.address(), iOException);
        }
        vrb vrbVar = hm9Var.B;
        synchronized (vrbVar) {
            ((LinkedHashSet) vrbVar.b).add(e7cVar);
        }
    }

    @Override // defpackage.bs6
    public final void a(ds6 ds6Var, r3d r3dVar) {
        r3dVar.getClass();
        synchronized (this) {
            this.o = (r3dVar.a & 8) != 0 ? r3dVar.b[3] : Integer.MAX_VALUE;
        }
    }

    @Override // defpackage.bs6
    public final void b(ks6 ks6Var) {
        ks6Var.c(ay4.REFUSED_STREAM, null);
    }

    @Override // defpackage.t25
    public final void cancel() {
        keg.c(this.d);
    }

    public final boolean d(hh hhVar, List list) {
        ct6 ct6Var = hhVar.h;
        String str = ct6Var.d;
        TimeZone timeZone = keg.a;
        if (this.p.size() < this.o && !this.j) {
            e7c e7cVar = this.c;
            hh hhVar2 = e7cVar.a;
            hh hhVar3 = e7cVar.a;
            if (hhVar2.a(hhVar)) {
                if (!pa7.t(str, hhVar3.h.d)) {
                    if (this.i != null && list != null && !list.isEmpty()) {
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            e7c e7cVar2 = (e7c) it.next();
                            Proxy.Type type = e7cVar2.b.type();
                            Proxy.Type type2 = Proxy.Type.DIRECT;
                            if (type == type2 && e7cVar.b.type() == type2 && pa7.t(e7cVar.c, e7cVar2.c)) {
                                if (hhVar.d != cm9.a) {
                                    break;
                                }
                                TimeZone timeZone2 = keg.a;
                                ct6 ct6Var2 = hhVar3.h;
                                if (ct6Var.e != ct6Var2.e) {
                                    break;
                                }
                                boolean zT = pa7.t(str, ct6Var2.d);
                                bh6 bh6Var = this.f;
                                if (!zT) {
                                    if (!this.k && bh6Var != null) {
                                        List listA = bh6Var.a();
                                        if (!listA.isEmpty()) {
                                            Object obj = listA.get(0);
                                            obj.getClass();
                                            if (!cm9.c(str, (X509Certificate) obj)) {
                                                break;
                                            }
                                        } else {
                                            break;
                                        }
                                    } else {
                                        break;
                                        break;
                                    }
                                }
                                try {
                                    rv1 rv1Var = hhVar.e;
                                    rv1Var.getClass();
                                    bh6Var.getClass();
                                    List listA2 = bh6Var.a();
                                    str.getClass();
                                    listA2.getClass();
                                    Iterator it2 = rv1Var.a.iterator();
                                    if (!it2.hasNext()) {
                                        return true;
                                    }
                                    kv2.z(it2.next());
                                    throw null;
                                } catch (SSLPeerUnverifiedException unused) {
                                    break;
                                }
                            }
                        }
                    }
                } else {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // defpackage.t25
    public final void e() {
        synchronized (this) {
            this.j = true;
        }
    }

    @Override // defpackage.t25
    public final void f(cib cibVar, IOException iOException) {
        synchronized (this) {
            try {
                if (!(iOException instanceof i3e)) {
                    if (!(this.i != null) || (iOException instanceof fk2)) {
                        this.j = true;
                        if (this.m == 0) {
                            if (iOException != null) {
                                c(cibVar.a, this.c, iOException);
                            }
                            this.l++;
                        }
                    }
                } else if (((i3e) iOException).errorCode == ay4.REFUSED_STREAM) {
                    int i = this.n + 1;
                    this.n = i;
                    if (i > 1) {
                        this.j = true;
                        this.l++;
                    }
                } else if (((i3e) iOException).errorCode != ay4.CANCEL || !cibVar.F0) {
                    this.j = true;
                    this.l++;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean g(boolean z) {
        long j;
        TimeZone timeZone = keg.a;
        long jNanoTime = System.nanoTime();
        if (this.d.isClosed() || this.e.isClosed() || this.e.isInputShutdown() || this.e.isOutputShutdown()) {
            return false;
        }
        ds6 ds6Var = this.i;
        if (ds6Var != null) {
            synchronized (ds6Var) {
                if (ds6Var.f) {
                    return false;
                }
                return ds6Var.Y >= ds6Var.X || jNanoTime < ds6Var.Z;
            }
        }
        synchronized (this) {
            j = jNanoTime - this.q;
        }
        if (j < 10000000000L || !z) {
            return true;
        }
        Socket socket = this.e;
        yhb yhbVar = (yhb) this.h.d;
        socket.getClass();
        try {
            int soTimeout = socket.getSoTimeout();
            try {
                socket.setSoTimeout(1);
                return !yhbVar.b();
            } finally {
                socket.setSoTimeout(soTimeout);
            }
        } catch (SocketTimeoutException unused) {
            return true;
        } catch (IOException unused2) {
            return false;
        }
    }

    @Override // defpackage.t25
    public final e7c h() {
        return this.c;
    }

    public final void i() throws SocketException {
        this.q = System.nanoTime();
        a1b a1bVar = this.g;
        if (a1bVar == a1b.HTTP_2 || a1bVar == a1b.H2_PRIOR_KNOWLEDGE) {
            this.e.setSoTimeout(0);
            qk6 qk6Var = qk6.v;
            yj5 yj5Var = yj5.a;
            a82 a82Var = new a82(this.b);
            ta0 ta0Var = this.h;
            String str = this.c.a.h.d;
            ta0Var.getClass();
            str.getClass();
            a82Var.d = ta0Var;
            a82Var.b = keg.b + ' ' + str;
            a82Var.e = this;
            a82Var.f = yj5Var;
            ds6 ds6Var = new ds6(a82Var);
            this.i = ds6Var;
            r3d r3dVar = ds6.O0;
            this.o = (r3dVar.a & 8) != 0 ? r3dVar.b[3] : Integer.MAX_VALUE;
            ls6 ls6Var = ds6Var.L0;
            synchronized (ls6Var) {
                try {
                    if (ls6Var.d) {
                        throw new IOException("closed");
                    }
                    Logger logger = ls6.f;
                    if (logger.isLoggable(Level.FINE)) {
                        logger.fine(keg.d(">> CONNECTION " + wr6.a.g(), new Object[0]));
                    }
                    ls6Var.a.X0(wr6.a);
                    ls6Var.a.flush();
                } catch (Throwable th) {
                    throw th;
                }
            }
            ls6 ls6Var2 = ds6Var.L0;
            r3d r3dVar2 = ds6Var.F0;
            ls6Var2.getClass();
            r3dVar2.getClass();
            synchronized (ls6Var2) {
                try {
                    if (ls6Var2.d) {
                        throw new IOException("closed");
                    }
                    ls6Var2.l(0, Integer.bitCount(r3dVar2.a) * 6, 4, 0);
                    for (int i = 0; i < 10; i++) {
                        boolean z = true;
                        if (((1 << i) & r3dVar2.a) == 0) {
                            z = false;
                        }
                        if (z) {
                            xhb xhbVar = ls6Var2.a;
                            if (xhbVar.c) {
                                throw new IllegalStateException("closed");
                            }
                            f41 f41Var = xhbVar.b;
                            qtc qtcVarE1 = f41Var.e1(2);
                            byte[] bArr = qtcVarE1.a;
                            int i2 = qtcVarE1.c;
                            bArr[i2] = (byte) ((i >>> 8) & 255);
                            bArr[i2 + 1] = (byte) (i & 255);
                            qtcVarE1.c = i2 + 2;
                            f41Var.b += 2;
                            xhbVar.b();
                            ls6Var2.a.h(r3dVar2.b[i]);
                        }
                    }
                    ls6Var2.a.flush();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            int iA = ds6Var.F0.a();
            if (iA != 65535) {
                ds6Var.L0.N(0, iA - 65535);
            }
            jle.b(ds6Var.g.d(), ds6Var.c, ds6Var.M0);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Connection{");
        e7c e7cVar = this.c;
        sb.append(e7cVar.a.h.d);
        sb.append(':');
        sb.append(e7cVar.a.h.e);
        sb.append(", proxy=");
        sb.append(e7cVar.b);
        sb.append(" hostAddress=");
        sb.append(e7cVar.c);
        sb.append(" cipherSuite=");
        bh6 bh6Var = this.f;
        sb.append(bh6Var != null ? bh6Var.b : "none");
        sb.append(" protocol=");
        sb.append(this.g);
        sb.append('}');
        return sb.toString();
    }
}
