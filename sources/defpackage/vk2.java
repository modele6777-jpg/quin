package defpackage;

import javax.net.ssl.SSLSocket;
import org.conscrypt.Conscrypt;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class vk2 implements vu3 {
    @Override // defpackage.vu3
    public final boolean a(SSLSocket sSLSocket) {
        return xk2.b && Conscrypt.isConscrypt(sSLSocket);
    }

    @Override // defpackage.vu3
    public final ssd b(SSLSocket sSLSocket) {
        return new xk2();
    }
}
