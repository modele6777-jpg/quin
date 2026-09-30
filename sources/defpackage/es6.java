package defpackage;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class es6 implements u25 {
    public static final List g = keg.k(new String[]{"connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade", ":method", ":path", ":scheme", ":authority"});
    public static final List h = keg.k(new String[]{"connection", "host", "keep-alive", "proxy-connection", "te", "transfer-encoding", "encoding", "upgrade"});
    public final dib a;
    public final oib b;
    public final ds6 c;
    public volatile ks6 d;
    public final a1b e;
    public volatile boolean f;

    public es6(hm9 hm9Var, dib dibVar, oib oibVar, ds6 ds6Var) {
        hm9Var.getClass();
        ds6Var.getClass();
        this.a = dibVar;
        this.b = oibVar;
        this.c = ds6Var;
        List list = hm9Var.s;
        a1b a1bVar = a1b.H2_PRIOR_KNOWLEDGE;
        this.e = list.contains(a1bVar) ? a1bVar : a1b.HTTP_2;
    }

    @Override // defpackage.u25
    public final mtd a(ryb rybVar) {
        ks6 ks6Var = this.d;
        ks6Var.getClass();
        return ks6Var.v;
    }

    @Override // defpackage.u25
    public final void b(btb btbVar) throws IOException {
        int i;
        ks6 ks6Var;
        boolean z;
        btbVar.getClass();
        if (this.d != null) {
            return;
        }
        boolean z2 = btbVar.d != null;
        si6 si6Var = btbVar.c;
        ArrayList arrayList = new ArrayList(si6Var.size() + 4);
        arrayList.add(new oi6(oi6.f, btbVar.b));
        a71 a71Var = oi6.g;
        ct6 ct6Var = btbVar.a;
        ct6Var.getClass();
        String strB = ct6Var.b();
        String strD = ct6Var.d();
        if (strD != null) {
            strB = strB + '?' + strD;
        }
        arrayList.add(new oi6(a71Var, strB));
        String strC = si6Var.c("Host");
        if (strC != null) {
            arrayList.add(new oi6(oi6.i, strC));
        }
        arrayList.add(new oi6(oi6.h, ct6Var.a));
        int size = si6Var.size();
        for (int i2 = 0; i2 < size; i2++) {
            String strI = xdc.i(si6Var, i2);
            Locale locale = Locale.US;
            locale.getClass();
            String lowerCase = strI.toLowerCase(locale);
            lowerCase.getClass();
            if (!g.contains(lowerCase) || (lowerCase.equals("te") && xdc.k(si6Var, i2).equals("trailers"))) {
                arrayList.add(new oi6(lowerCase, xdc.k(si6Var, i2)));
            }
        }
        ds6 ds6Var = this.c;
        ds6Var.getClass();
        boolean z3 = !z2;
        synchronized (ds6Var.L0) {
            synchronized (ds6Var) {
                try {
                    if (ds6Var.e > 1073741823) {
                        ds6Var.u(ay4.REFUSED_STREAM);
                    }
                    if (ds6Var.f) {
                        throw new fk2();
                    }
                    i = ds6Var.e;
                    ds6Var.e = i + 2;
                    ks6Var = new ks6(i, ds6Var, z3, false, null);
                    z = !z2 || ds6Var.I0 >= ds6Var.J0 || ks6Var.d >= ks6Var.e;
                    if (ks6Var.i()) {
                        ds6Var.b.put(Integer.valueOf(i), ks6Var);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            ds6Var.L0.x(z3, i, arrayList);
        }
        if (z) {
            ds6Var.L0.flush();
        }
        this.d = ks6Var;
        boolean z4 = this.f;
        ks6 ks6Var2 = this.d;
        if (z4) {
            ks6Var2.getClass();
            ks6Var2.f(ay4.CANCEL);
            yg5.m("Canceled");
        } else {
            ks6Var2.getClass();
            ks6Var2.x.g(this.b.g);
            ks6 ks6Var3 = this.d;
            ks6Var3.getClass();
            ks6Var3.y.g(this.b.h);
        }
    }

    @Override // defpackage.u25
    public final void c() {
        ks6 ks6Var = this.d;
        ks6Var.getClass();
        ks6Var.w.close();
    }

    @Override // defpackage.u25
    public final void cancel() {
        this.f = true;
        ks6 ks6Var = this.d;
        if (ks6Var != null) {
            ks6Var.f(ay4.CANCEL);
        }
    }

    @Override // defpackage.u25
    public final boolean d() {
        boolean z;
        ks6 ks6Var = this.d;
        if (ks6Var != null) {
            synchronized (ks6Var) {
                is6 is6Var = ks6Var.v;
                z = is6Var.b && is6Var.d.E();
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.u25
    public final long e(ryb rybVar) {
        if (ss6.a(rybVar)) {
            return keg.e(rybVar);
        }
        return 0L;
    }

    @Override // defpackage.u25
    public final wkd f(btb btbVar, long j) {
        btbVar.getClass();
        ks6 ks6Var = this.d;
        ks6Var.getClass();
        return ks6Var.w;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x002d  */
    @Override // defpackage.u25
    public final pyb g(boolean z) throws IOException {
        si6 si6Var;
        boolean z2;
        ks6 ks6Var = this.d;
        if (ks6Var == null) {
            yg5.m("stream wasn't created");
            return null;
        }
        synchronized (ks6Var) {
            while (true) {
                if (!ks6Var.f.isEmpty() || ks6Var.g() != null) {
                    break;
                }
                if (!z) {
                    ks6Var.b.getClass();
                    hs6 hs6Var = ks6Var.w;
                    z2 = hs6Var.c || hs6Var.a;
                }
                if (z2) {
                    ks6Var.x.h();
                }
                try {
                    try {
                        ks6Var.wait();
                        if (z2) {
                            ks6Var.x.k();
                        }
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        throw new InterruptedIOException();
                    }
                } catch (Throwable th) {
                    if (z2) {
                        ks6Var.x.k();
                    }
                    throw th;
                }
            }
            if (ks6Var.f.isEmpty()) {
                IOException iOException = ks6Var.X;
                if (iOException != null) {
                    throw iOException;
                }
                ay4 ay4VarG = ks6Var.g();
                ay4VarG.getClass();
                throw new i3e(ay4VarG);
            }
            Object objRemoveFirst = ks6Var.f.removeFirst();
            objRemoveFirst.getClass();
            si6Var = (si6) objRemoveFirst;
        }
        a1b a1bVar = this.e;
        ArrayList arrayList = new ArrayList(20);
        int size = si6Var.size();
        os osVarJ = null;
        for (int i = 0; i < size; i++) {
            String strI = xdc.i(si6Var, i);
            String strK = xdc.k(si6Var, i);
            if (strI.equals(":status")) {
                osVarJ = jcc.j("HTTP/1.1 ".concat(strK));
            } else if (!h.contains(strI)) {
                arrayList.add(strI);
                arrayList.add(v4e.o0(strK).toString());
            }
        }
        if (osVarJ == null) {
            throw new ProtocolException("Expected ':status' header not present");
        }
        pyb pybVar = new pyb();
        pybVar.b = a1bVar;
        pybVar.c = osVarJ.b;
        pybVar.d = (String) osVarJ.d;
        pybVar.f = xdc.j(new si6((String[]) arrayList.toArray(new String[0])));
        if (z && pybVar.c == 100) {
            return null;
        }
        return pybVar;
    }

    @Override // defpackage.u25
    public final void h() {
        this.c.flush();
    }

    @Override // defpackage.u25
    public final rsd i() {
        ks6 ks6Var = this.d;
        ks6Var.getClass();
        return ks6Var;
    }

    @Override // defpackage.u25
    public final t25 j() {
        return this.a;
    }
}
