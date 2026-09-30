package defpackage;

import java.util.List;
import javax.net.ssl.SSLSocket;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class wu3 implements ssd {
    public final vu3 a;
    public ssd b;

    public wu3(vu3 vu3Var) {
        this.a = vu3Var;
    }

    @Override // defpackage.ssd
    public final boolean a(SSLSocket sSLSocket) {
        return this.a.a(sSLSocket);
    }

    @Override // defpackage.ssd
    public final boolean b() {
        return true;
    }

    @Override // defpackage.ssd
    public final String c(SSLSocket sSLSocket) {
        ssd ssdVarE = e(sSLSocket);
        if (ssdVarE != null) {
            return ssdVarE.c(sSLSocket);
        }
        return null;
    }

    @Override // defpackage.ssd
    public final void d(SSLSocket sSLSocket, String str, List list) {
        ssd ssdVarE = e(sSLSocket);
        if (ssdVarE != null) {
            ssdVarE.d(sSLSocket, str, list);
        }
    }

    public final synchronized ssd e(SSLSocket sSLSocket) {
        try {
            if (this.b == null && this.a.a(sSLSocket)) {
                this.b = this.a.b(sSLSocket);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.b;
    }
}
