package defpackage;

import java.net.Inet6Address;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Socket;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.net.UnknownServiceException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class sib {
    public final kle a;
    public final ws4 b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final boolean g;
    public final boolean h;
    public final hh i;
    public final vrb j;
    public final cib k;
    public final boolean l;
    public l7c m;
    public hy1 n;
    public e7c o;
    public final ad0 p;

    public sib(kle kleVar, ws4 ws4Var, int i, int i2, int i3, int i4, boolean z, boolean z2, hh hhVar, vrb vrbVar, cib cibVar, btb btbVar) {
        kleVar.getClass();
        vrbVar.getClass();
        this.a = kleVar;
        this.b = ws4Var;
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = i4;
        this.g = z;
        this.h = z2;
        this.i = hhVar;
        this.j = vrbVar;
        this.k = cibVar;
        this.l = !pa7.t(btbVar.b, "GET");
        this.p = new ad0();
    }

    public final boolean a(dib dibVar) {
        hy1 hy1Var;
        e7c e7cVar;
        if (this.p.isEmpty() && this.o == null) {
            if (dibVar != null) {
                synchronized (dibVar) {
                    e7cVar = null;
                    if (dibVar.l == 0 && dibVar.j && keg.a(dibVar.c.a.h, this.i.h)) {
                        e7cVar = dibVar.c;
                    }
                }
                if (e7cVar != null) {
                    this.o = e7cVar;
                    return true;
                }
            }
            l7c l7cVar = this.m;
            if ((l7cVar == null || l7cVar.a >= l7cVar.b.size()) && (hy1Var = this.n) != null) {
                return hy1Var.a();
            }
        }
        return true;
    }

    public final j7c b() {
        Socket socketH;
        h0c h0cVar;
        wj2 wj2VarC;
        String hostAddress;
        int port;
        List listG0;
        boolean zContains;
        dib dibVar = this.k.w;
        if (dibVar == null) {
            h0cVar = null;
        } else {
            boolean zG = dibVar.g(this.l);
            synchronized (dibVar) {
                boolean z = dibVar.j;
                try {
                    if (!zG) {
                        dibVar.j = true;
                        socketH = this.k.h();
                    } else if (!z) {
                        ct6 ct6Var = dibVar.c.a.h;
                        ct6 ct6Var2 = this.i.h;
                        socketH = !(ct6Var.e == ct6Var2.e && pa7.t(ct6Var.d, ct6Var2.d)) ? this.k.h() : null;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            if (this.k.w == null) {
                if (socketH != null) {
                    keg.c(socketH);
                }
                this.k.d.getClass();
                h0cVar = null;
            } else {
                if (socketH != null) {
                    qc0.p("Check failed.");
                    return null;
                }
                h0cVar = new h0c(dibVar);
            }
        }
        if (h0cVar != null) {
            return h0cVar;
        }
        h0c h0cVarD = d(null, null);
        if (h0cVarD != null) {
            return h0cVarD;
        }
        if (!this.p.isEmpty()) {
            return (j7c) this.p.removeFirst();
        }
        e7c e7cVar = this.o;
        if (e7cVar != null) {
            this.o = null;
            wj2VarC = c(e7cVar, null);
        } else {
            l7c l7cVar = this.m;
            if (l7cVar == null || l7cVar.a >= l7cVar.b.size()) {
                hy1 hy1Var = this.n;
                if (hy1Var == null) {
                    hy1Var = new hy1(this.i, this.j, this.k, this.h);
                    this.n = hy1Var;
                }
                if (!hy1Var.a()) {
                    yg5.m("exhausted all routes");
                    return null;
                }
                if (!hy1Var.a()) {
                    s8f.c();
                    return null;
                }
                ArrayList arrayList = new ArrayList();
                while (hy1Var.b < ((List) hy1Var.f).size()) {
                    if (hy1Var.b >= ((List) hy1Var.f).size()) {
                        throw new SocketException("No route to " + ((hh) hy1Var.c).h.d + "; exhausted proxy configurations: " + ((List) hy1Var.f));
                    }
                    List list = (List) hy1Var.f;
                    int i = hy1Var.b;
                    hy1Var.b = i + 1;
                    Proxy proxy = (Proxy) list.get(i);
                    ArrayList arrayList2 = new ArrayList();
                    hy1Var.g = arrayList2;
                    if (proxy.type() == Proxy.Type.DIRECT || proxy.type() == Proxy.Type.SOCKS) {
                        ct6 ct6Var3 = ((hh) hy1Var.c).h;
                        hostAddress = ct6Var3.d;
                        port = ct6Var3.e;
                    } else {
                        SocketAddress socketAddressAddress = proxy.address();
                        if (!(socketAddressAddress instanceof InetSocketAddress)) {
                            ho7.y(socketAddressAddress.getClass(), "Proxy.address() is not an InetSocketAddress: ");
                            return null;
                        }
                        InetSocketAddress inetSocketAddress = (InetSocketAddress) socketAddressAddress;
                        InetAddress address = inetSocketAddress.getAddress();
                        if (address == null) {
                            hostAddress = inetSocketAddress.getHostName();
                            hostAddress.getClass();
                        } else {
                            hostAddress = address.getHostAddress();
                            hostAddress.getClass();
                        }
                        port = inetSocketAddress.getPort();
                    }
                    if (1 > port || port >= 65536) {
                        throw new SocketException("No route to " + hostAddress + ':' + port + "; port is out of range");
                    }
                    if (proxy.type() == Proxy.Type.SOCKS) {
                        arrayList2.add(InetSocketAddress.createUnresolved(hostAddress, port));
                    } else {
                        rob robVar = geg.a;
                        hostAddress.getClass();
                        if (geg.a.g(hostAddress)) {
                            listG0 = t72.H(InetAddress.getByName(hostAddress));
                        } else {
                            ((cib) hy1Var.e).d.getClass();
                            ((hh) hy1Var.c).a.getClass();
                            try {
                                InetAddress[] allByName = InetAddress.getAllByName(hostAddress);
                                allByName.getClass();
                                listG0 = qd0.G0(allByName);
                                if (listG0.isEmpty()) {
                                    throw new UnknownHostException(((hh) hy1Var.c).a + " returned no addresses for " + hostAddress);
                                }
                                ((cib) hy1Var.e).d.getClass();
                            } catch (NullPointerException e) {
                                UnknownHostException unknownHostException = new UnknownHostException("Broken system behaviour for dns lookup of ".concat(hostAddress));
                                unknownHostException.initCause(e);
                                throw unknownHostException;
                            }
                        }
                        if (hy1Var.a && listG0.size() >= 2) {
                            ArrayList arrayList3 = new ArrayList();
                            ArrayList arrayList4 = new ArrayList();
                            for (Object obj : listG0) {
                                if (((InetAddress) obj) instanceof Inet6Address) {
                                    arrayList3.add(obj);
                                } else {
                                    arrayList4.add(obj);
                                }
                            }
                            iy9 iy9Var = new iy9(arrayList3, arrayList4);
                            List list2 = (List) iy9Var.a();
                            List list3 = (List) iy9Var.b();
                            if (!list2.isEmpty() && !list3.isEmpty()) {
                                byte[] bArr = ieg.a;
                                Iterator it = list2.iterator();
                                Iterator it2 = list3.iterator();
                                c78 c78VarW = t72.w();
                                while (true) {
                                    if (!it.hasNext() && !it2.hasNext()) {
                                        break;
                                    }
                                    if (it.hasNext()) {
                                        c78VarW.add(it.next());
                                    }
                                    if (it2.hasNext()) {
                                        c78VarW.add(it2.next());
                                    }
                                }
                                listG0 = c78VarW.n();
                            }
                        }
                        Iterator it3 = listG0.iterator();
                        while (it3.hasNext()) {
                            arrayList2.add(new InetSocketAddress((InetAddress) it3.next(), port));
                        }
                    }
                    Iterator it4 = ((List) hy1Var.g).iterator();
                    while (it4.hasNext()) {
                        e7c e7cVar2 = new e7c((hh) hy1Var.c, proxy, (InetSocketAddress) it4.next());
                        vrb vrbVar = (vrb) hy1Var.d;
                        synchronized (vrbVar) {
                            zContains = ((LinkedHashSet) vrbVar.b).contains(e7cVar2);
                        }
                        if (zContains) {
                            ((ArrayList) hy1Var.v).add(e7cVar2);
                        } else {
                            arrayList.add(e7cVar2);
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        break;
                    }
                }
                if (arrayList.isEmpty()) {
                    x72.g0(arrayList, (ArrayList) hy1Var.v);
                    ((ArrayList) hy1Var.v).clear();
                }
                l7c l7cVar2 = new l7c(arrayList);
                this.m = l7cVar2;
                if (this.k.F0) {
                    yg5.m("Canceled");
                    return null;
                }
                if (l7cVar2.a >= arrayList.size()) {
                    s8f.c();
                    return null;
                }
                int i2 = l7cVar2.a;
                l7cVar2.a = i2 + 1;
                wj2VarC = c((e7c) arrayList.get(i2), arrayList);
            } else {
                int i3 = l7cVar.a;
                ArrayList arrayList5 = l7cVar.b;
                if (i3 >= arrayList5.size()) {
                    s8f.c();
                    return null;
                }
                int i4 = l7cVar.a;
                l7cVar.a = i4 + 1;
                wj2VarC = c((e7c) arrayList5.get(i4), null);
            }
        }
        h0c h0cVarD2 = d(wj2VarC, wj2VarC.k);
        return h0cVarD2 != null ? h0cVarD2 : wj2VarC;
    }

    public final wj2 c(e7c e7cVar, ArrayList arrayList) throws UnknownServiceException {
        a1b a1bVar = a1b.H2_PRIOR_KNOWLEDGE;
        e7cVar.getClass();
        hh hhVar = e7cVar.a;
        if (hhVar.c == null) {
            if (!hhVar.j.contains(hk2.f)) {
                throw new UnknownServiceException("CLEARTEXT communication not enabled for client");
            }
            String str = e7cVar.a.h.d;
            sea seaVar = sea.a;
            if (!sea.a.h(str)) {
                throw new UnknownServiceException(ib8.j("CLEARTEXT communication to ", str, " not permitted by network security policy"));
            }
        } else if (hhVar.i.contains(a1bVar)) {
            throw new UnknownServiceException("H2_PRIOR_KNOWLEDGE cannot be used with HTTPS");
        }
        btb btbVar = null;
        if (e7cVar.b.type() == Proxy.Type.HTTP) {
            hh hhVar2 = e7cVar.a;
            if (hhVar2.c != null || hhVar2.i.contains(a1bVar)) {
                zsb zsbVar = new zsb();
                zsbVar.a = e7cVar.a.h;
                zsbVar.b("CONNECT", null);
                hh hhVar3 = e7cVar.a;
                zsbVar.a("Host", keg.i(hhVar3.h, true));
                zsbVar.a("Proxy-Connection", "Keep-Alive");
                zsbVar.a("User-Agent", "okhttp/5.4.0");
                btbVar = new btb(zsbVar);
                tyb tybVar = vyb.b;
                qi6 qi6Var = new qi6();
                xdc.p("Proxy-Authenticate");
                xdc.q("OkHttp-Preemptive", "Proxy-Authenticate");
                qi6Var.f("Proxy-Authenticate");
                xdc.g(qi6Var, "Proxy-Authenticate", "OkHttp-Preemptive");
                xdc.h(qi6Var);
                tybVar.getClass();
                hhVar3.f.getClass();
            }
        }
        return new wj2(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.k, this, e7cVar, arrayList, btbVar, -1, false);
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0040 A[Catch: all -> 0x003e, TryCatch #1 {all -> 0x003e, blocks: (B:14:0x0033, B:22:0x0040, B:25:0x0047), top: B:53:0x0033 }] */
    /* JADX WARN: Code duplicated, block: B:24:0x0046  */
    /* JADX WARN: Code duplicated, block: B:25:0x0047 A[Catch: all -> 0x003e, TRY_LEAVE, TryCatch #1 {all -> 0x003e, blocks: (B:14:0x0033, B:22:0x0040, B:25:0x0047), top: B:53:0x0033 }] */
    public final h0c d(wj2 wj2Var, List list) {
        dib dibVar;
        boolean z;
        Socket socketH;
        ws4 ws4Var = this.b;
        boolean z2 = this.l;
        hh hhVar = this.i;
        cib cibVar = this.k;
        boolean z3 = wj2Var != null && wj2Var.a();
        Iterator it = ((ConcurrentLinkedQueue) ws4Var.d).iterator();
        it.getClass();
        while (true) {
            if (!it.hasNext()) {
                dibVar = null;
                break;
            }
            dibVar = (dib) it.next();
            dibVar.getClass();
            synchronized (dibVar) {
                if (z3) {
                    try {
                        if (!(dibVar.i != null)) {
                            z = false;
                        } else if (dibVar.d(hhVar, list)) {
                            cibVar.a(dibVar);
                            z = true;
                        } else {
                            z = false;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                } else if (dibVar.d(hhVar, list)) {
                    z = false;
                } else {
                    cibVar.a(dibVar);
                    z = true;
                }
            }
            if (z) {
                if (dibVar.g(z2)) {
                    break;
                }
                synchronized (dibVar) {
                    dibVar.j = true;
                    socketH = cibVar.h();
                }
                if (socketH != null) {
                    keg.c(socketH);
                }
            }
        }
        if (dibVar == null) {
            return null;
        }
        if (wj2Var != null) {
            this.o = wj2Var.j;
            Socket socket = wj2Var.q;
            if (socket != null) {
                keg.c(socket);
            }
        }
        this.k.d.getClass();
        return new h0c(dibVar);
    }
}
