package defpackage;

import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class y71 {
    public static final String k;
    public static final String l;
    public final ct6 a;
    public final si6 b;
    public final String c;
    public final a1b d;
    public final int e;
    public final String f;
    public final si6 g;
    public final bh6 h;
    public final long i;
    public final long j;

    static {
        sea seaVar = sea.a;
        sea.a.getClass();
        k = "OkHttp-Sent-Millis";
        sea.a.getClass();
        l = "OkHttp-Received-Millis";
    }

    public y71(mtd mtdVar) throws IOException {
        ct6 ct6VarA;
        tye tyeVarK;
        mtdVar.getClass();
        try {
            yhb yhbVar = new yhb(mtdVar);
            String strG0 = yhbVar.g0(Long.MAX_VALUE);
            try {
                bt6 bt6Var = new bt6();
                bt6Var.d(null, strG0);
                ct6VarA = bt6Var.a();
            } catch (IllegalArgumentException unused) {
                ct6VarA = null;
            }
            if (ct6VarA == null) {
                IOException iOException = new IOException("Cache corruption for ".concat(strG0));
                sea seaVar = sea.a;
                sea.a.i(5, "cache corruption", iOException);
                throw iOException;
            }
            this.a = ct6VarA;
            this.c = yhbVar.g0(Long.MAX_VALUE);
            qi6 qi6Var = new qi6();
            int iP = urg.P(yhbVar);
            for (int i = 0; i < iP; i++) {
                qi6Var.d(yhbVar.g0(Long.MAX_VALUE));
            }
            this.b = xdc.h(qi6Var);
            os osVarJ = jcc.j(yhbVar.g0(Long.MAX_VALUE));
            this.d = (a1b) osVarJ.c;
            this.e = osVarJ.b;
            this.f = (String) osVarJ.d;
            qi6 qi6Var2 = new qi6();
            int iP2 = urg.P(yhbVar);
            for (int i2 = 0; i2 < iP2; i2++) {
                qi6Var2.d(yhbVar.g0(Long.MAX_VALUE));
            }
            String str = k;
            String strE = qi6Var2.e(str);
            String str2 = l;
            String strE2 = qi6Var2.e(str2);
            qi6Var2.f(str);
            qi6Var2.f(str2);
            this.i = strE != null ? Long.parseLong(strE) : 0L;
            this.j = strE2 != null ? Long.parseLong(strE2) : 0L;
            this.g = xdc.h(qi6Var2);
            if (this.a.f()) {
                String strG1 = yhbVar.g0(Long.MAX_VALUE);
                if (strG1.length() > 0) {
                    throw new IOException("expected \"\" but was \"" + strG1 + '\"');
                }
                qz1 qz1VarI0 = qz1.b.I0(yhbVar.g0(Long.MAX_VALUE));
                List listA = a(yhbVar);
                List listA2 = a(yhbVar);
                if (yhbVar.b()) {
                    tyeVarK = tye.SSL_3_0;
                } else {
                    w1e w1eVar = tye.a;
                    String strG2 = yhbVar.g0(Long.MAX_VALUE);
                    w1eVar.getClass();
                    tyeVarK = w1e.k(strG2);
                }
                this.h = new bh6(tyeVarK, qz1VarI0, keg.j(listA2), new h53(keg.j(listA), 5));
            } else {
                this.h = null;
            }
            mtdVar.close();
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                ym8.t(mtdVar, th);
                throw th2;
            }
        }
    }

    public static List a(yhb yhbVar) throws IOException {
        int iP = urg.P(yhbVar);
        if (iP == -1) {
            return pu4.a;
        }
        try {
            CertificateFactory certificateFactory = CertificateFactory.getInstance("X.509");
            ArrayList arrayList = new ArrayList(iP);
            for (int i = 0; i < iP; i++) {
                String strG0 = yhbVar.g0(Long.MAX_VALUE);
                f41 f41Var = new f41();
                a71 a71Var = a71.c;
                a71 a71VarQ = m8c.q(strG0);
                if (a71VarQ == null) {
                    throw new IOException("Corrupt certificate in cache entry");
                }
                f41Var.f1(a71VarQ);
                arrayList.add(certificateFactory.generateCertificate(new e41(f41Var, 0)));
            }
            return arrayList;
        } catch (CertificateException e) {
            yg5.m(e.getMessage());
            return null;
        }
    }

    public static void b(xhb xhbVar, List list) throws IOException {
        try {
            xhbVar.T0(list.size());
            xhbVar.writeByte(10);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                byte[] encoded = ((Certificate) it.next()).getEncoded();
                a71 a71Var = a71.c;
                encoded.getClass();
                xhbVar.i0(m8c.A(encoded).a());
                xhbVar.writeByte(10);
            }
        } catch (CertificateEncodingException e) {
            yg5.m(e.getMessage());
        }
    }

    public final void c(zi0 zi0Var) {
        bh6 bh6Var;
        ct6 ct6Var = this.a;
        si6 si6Var = this.g;
        si6 si6Var2 = this.b;
        xhb xhbVar = new xhb(zi0Var.t(0));
        try {
            xhbVar.i0(ct6Var.i);
            xhbVar.writeByte(10);
            xhbVar.i0(this.c);
            xhbVar.writeByte(10);
            xhbVar.T0(si6Var2.size());
            xhbVar.writeByte(10);
            int size = si6Var2.size();
            for (int i = 0; i < size; i++) {
                xhbVar.i0(xdc.i(si6Var2, i));
                xhbVar.i0(": ");
                xhbVar.i0(xdc.k(si6Var2, i));
                xhbVar.writeByte(10);
            }
            a1b a1bVar = this.d;
            int i2 = this.e;
            String str = this.f;
            a1bVar.getClass();
            str.getClass();
            StringBuilder sb = new StringBuilder();
            if (a1bVar == a1b.HTTP_1_0) {
                sb.append("HTTP/1.0");
            } else {
                sb.append("HTTP/1.1");
            }
            sb.append(' ');
            sb.append(i2);
            sb.append(' ');
            sb.append(str);
            xhbVar.i0(sb.toString());
            xhbVar.writeByte(10);
            xhbVar.T0(si6Var.size() + 2);
            xhbVar.writeByte(10);
            int size2 = si6Var.size();
            for (int i3 = 0; i3 < size2; i3++) {
                xhbVar.i0(xdc.i(si6Var, i3));
                xhbVar.i0(": ");
                xhbVar.i0(xdc.k(si6Var, i3));
                xhbVar.writeByte(10);
            }
            xhbVar.i0(k);
            xhbVar.i0(": ");
            xhbVar.T0(this.i);
            xhbVar.writeByte(10);
            xhbVar.i0(l);
            xhbVar.i0(": ");
            xhbVar.T0(this.j);
            xhbVar.writeByte(10);
            if (ct6Var.f() && (bh6Var = this.h) != null) {
                xhbVar.writeByte(10);
                xhbVar.i0(bh6Var.b.a);
                xhbVar.writeByte(10);
                b(xhbVar, bh6Var.a());
                b(xhbVar, bh6Var.c);
                xhbVar.i0(bh6Var.a.a());
                xhbVar.writeByte(10);
            }
            xhbVar.close();
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                ym8.t(xhbVar, th);
                throw th2;
            }
        }
    }

    public y71(ryb rybVar) {
        si6 si6VarH;
        btb btbVar = rybVar.a;
        this.a = btbVar.a;
        ryb rybVar2 = rybVar.w;
        rybVar2.getClass();
        si6 si6Var = rybVar2.a.c;
        si6 si6Var2 = rybVar.f;
        Set setS = urg.S(si6Var2);
        if (setS.isEmpty()) {
            si6VarH = si6.b;
        } else {
            qi6 qi6Var = new qi6();
            int size = si6Var.size();
            for (int i = 0; i < size; i++) {
                String strI = xdc.i(si6Var, i);
                if (setS.contains(strI)) {
                    qi6Var.a(strI, xdc.k(si6Var, i));
                }
            }
            si6VarH = xdc.h(qi6Var);
        }
        this.b = si6VarH;
        this.c = btbVar.b;
        this.d = rybVar.b;
        this.e = rybVar.d;
        this.f = rybVar.c;
        this.g = si6Var2;
        this.h = rybVar.e;
        this.i = rybVar.z;
        this.j = rybVar.X;
    }
}
