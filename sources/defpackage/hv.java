package defpackage;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;
import javax.net.ssl.SSLSocket;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public class hv implements ssd {
    public static final i8c e = new i8c(11);
    public final Class a;
    public final Method b;
    public final Method c;
    public final Method d;

    public hv(Class cls) throws NoSuchMethodException {
        this.a = cls;
        Method declaredMethod = cls.getDeclaredMethod("setUseSessionTickets", Boolean.TYPE);
        declaredMethod.getClass();
        this.b = declaredMethod;
        cls.getMethod("setHostname", String.class);
        this.c = cls.getMethod("getAlpnSelectedProtocol", null);
        this.d = cls.getMethod("setAlpnProtocols", byte[].class);
    }

    @Override // defpackage.ssd
    public final boolean a(SSLSocket sSLSocket) {
        return this.a.isInstance(sSLSocket);
    }

    @Override // defpackage.ssd
    public final boolean b() {
        boolean z = eu.e;
        return eu.e;
    }

    @Override // defpackage.ssd
    public final String c(SSLSocket sSLSocket) {
        if (this.a.isInstance(sSLSocket)) {
            try {
                byte[] bArr = (byte[]) this.c.invoke(sSLSocket, null);
                if (bArr != null) {
                    return new String(bArr, ox1.a);
                }
            } catch (IllegalAccessException e2) {
                qc0.i(e2);
                return null;
            } catch (InvocationTargetException e3) {
                Throwable cause = e3.getCause();
                if (!(cause instanceof NullPointerException) || !pa7.t(((NullPointerException) cause).getMessage(), "ssl == null")) {
                    qc0.i(e3);
                    return null;
                }
            }
        }
        return null;
    }

    @Override // defpackage.ssd
    public final void d(SSLSocket sSLSocket, String str, List list) {
        if (this.a.isInstance(sSLSocket)) {
            try {
                this.b.invoke(sSLSocket, Boolean.TRUE);
                Method method = this.d;
                sea seaVar = sea.a;
                method.invoke(sSLSocket, yx4.f(list));
            } catch (IllegalAccessException e2) {
                qc0.i(e2);
            } catch (InvocationTargetException e3) {
                qc0.i(e3);
            }
        }
    }
}
