package defpackage;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import javax.net.ssl.SSLSocket;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class hk2 {
    public static final hk2 e;
    public static final hk2 f;
    public final boolean a;
    public final boolean b;
    public final String[] c;
    public final String[] d;

    static {
        qz1 qz1Var = qz1.r;
        qz1 qz1Var2 = qz1.s;
        qz1 qz1Var3 = qz1.t;
        qz1 qz1Var4 = qz1.l;
        qz1 qz1Var5 = qz1.n;
        qz1 qz1Var6 = qz1.m;
        qz1 qz1Var7 = qz1.o;
        qz1 qz1Var8 = qz1.q;
        qz1 qz1Var9 = qz1.p;
        List listI = t72.I(qz1Var, qz1Var2, qz1Var3, qz1Var4, qz1Var5, qz1Var6, qz1Var7, qz1Var8, qz1Var9);
        List listI2 = t72.I(qz1Var, qz1Var2, qz1Var3, qz1Var4, qz1Var5, qz1Var6, qz1Var7, qz1Var8, qz1Var9, qz1.j, qz1.k, qz1.h, qz1.i, qz1.f, qz1.g, qz1.e);
        gk2 gk2Var = new gk2();
        qz1[] qz1VarArr = (qz1[]) listI.toArray(new qz1[0]);
        gk2Var.b((qz1[]) Arrays.copyOf(qz1VarArr, qz1VarArr.length));
        tye tyeVar = tye.TLS_1_3;
        tye tyeVar2 = tye.TLS_1_2;
        gk2Var.e(tyeVar, tyeVar2);
        gk2Var.b = true;
        gk2Var.a();
        gk2 gk2Var2 = new gk2();
        qz1[] qz1VarArr2 = (qz1[]) listI2.toArray(new qz1[0]);
        gk2Var2.b((qz1[]) Arrays.copyOf(qz1VarArr2, qz1VarArr2.length));
        gk2Var2.e(tyeVar, tyeVar2);
        gk2Var2.b = true;
        e = gk2Var2.a();
        gk2 gk2Var3 = new gk2();
        qz1[] qz1VarArr3 = (qz1[]) listI2.toArray(new qz1[0]);
        gk2Var3.b((qz1[]) Arrays.copyOf(qz1VarArr3, qz1VarArr3.length));
        gk2Var3.e(tyeVar, tyeVar2, tye.TLS_1_1, tye.TLS_1_0);
        gk2Var3.b = true;
        gk2Var3.a();
        f = new hk2(false, false, null, null);
    }

    public hk2(boolean z, boolean z2, String[] strArr, String[] strArr2) {
        this.a = z;
        this.b = z2;
        this.c = strArr;
        this.d = strArr2;
    }

    public final void a(SSLSocket sSLSocket, boolean z) {
        String[] enabledProtocols;
        String[] enabledCipherSuites = sSLSocket.getEnabledCipherSuites();
        enabledCipherSuites.getClass();
        String[] strArr = this.c;
        if (strArr != null) {
            enabledCipherSuites = ieg.k(strArr, enabledCipherSuites, qz1.c);
        }
        String[] strArr2 = this.d;
        if (strArr2 != null) {
            String[] enabledProtocols2 = sSLSocket.getEnabledProtocols();
            enabledProtocols2.getClass();
            enabledProtocols = ieg.k(enabledProtocols2, strArr2, aa9.b);
        } else {
            enabledProtocols = sSLSocket.getEnabledProtocols();
        }
        String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
        supportedCipherSuites.getClass();
        ww2 ww2Var = qz1.c;
        byte[] bArr = ieg.a;
        int length = supportedCipherSuites.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                i = -1;
                break;
            } else if (ww2Var.compare(supportedCipherSuites[i], "TLS_FALLBACK_SCSV") == 0) {
                break;
            } else {
                i++;
            }
        }
        if (z && i != -1) {
            String str = supportedCipherSuites[i];
            str.getClass();
            enabledCipherSuites.getClass();
            enabledCipherSuites = (String[]) Arrays.copyOf(enabledCipherSuites, enabledCipherSuites.length + 1);
            enabledCipherSuites[enabledCipherSuites.length - 1] = str;
        }
        String[] strArr3 = (String[]) Arrays.copyOf(enabledCipherSuites, enabledCipherSuites.length);
        boolean z2 = this.a;
        if (!z2) {
            qc0.j("no cipher suites for cleartext connections");
            return;
        }
        if (strArr3.length == 0) {
            qc0.j("At least one cipher suite is required");
            return;
        }
        String[] strArr4 = (String[]) Arrays.copyOf(strArr3, strArr3.length);
        String[] strArr5 = (String[]) Arrays.copyOf(enabledProtocols, enabledProtocols.length);
        if (!z2) {
            qc0.j("no TLS versions for cleartext connections");
            return;
        }
        if (strArr5.length == 0) {
            qc0.j("At least one TLS version is required");
            return;
        }
        hk2 hk2Var = new hk2(z2, this.b, strArr4, (String[]) Arrays.copyOf(strArr5, strArr5.length));
        if (hk2Var.c() != null) {
            sSLSocket.setEnabledProtocols(hk2Var.d);
        }
        if (hk2Var.b() != null) {
            sSLSocket.setEnabledCipherSuites(hk2Var.c);
        }
    }

    public final ArrayList b() {
        String[] strArr = this.c;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            arrayList.add(qz1.b.I0(str));
        }
        return arrayList;
    }

    public final ArrayList c() {
        String[] strArr = this.d;
        if (strArr == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String str : strArr) {
            tye.a.getClass();
            arrayList.add(w1e.k(str));
        }
        return arrayList;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof hk2)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        hk2 hk2Var = (hk2) obj;
        boolean z = hk2Var.a;
        boolean z2 = this.a;
        if (z2 != z) {
            return false;
        }
        if (z2) {
            return Arrays.equals(this.c, hk2Var.c) && Arrays.equals(this.d, hk2Var.d) && this.b == hk2Var.b;
        }
        return true;
    }

    public final int hashCode() {
        if (!this.a) {
            return 17;
        }
        String[] strArr = this.c;
        int iHashCode = (527 + (strArr != null ? Arrays.hashCode(strArr) : 0)) * 31;
        String[] strArr2 = this.d;
        return ((iHashCode + (strArr2 != null ? Arrays.hashCode(strArr2) : 0)) * 31) + (!this.b ? 1 : 0);
    }

    public final String toString() {
        if (!this.a) {
            return "ConnectionSpec()";
        }
        return "ConnectionSpec(cipherSuites=" + Objects.toString(b(), "[all enabled]") + ", tlsVersions=" + Objects.toString(c(), "[all enabled]") + ", supportsTlsExtensions=" + this.b + ')';
    }
}
