package defpackage;

import android.app.ApplicationExitInfo;
import android.os.Bundle;
import com.google.android.gms.tasks.Task;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import com.google.firebase.sessions.FirebaseSessionsRegistrar;
import io.sentry.android.core.b1;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class yg5 implements bc2, o95, a3f, yn2, pu6, u26 {
    public final /* synthetic */ int a;

    public static /* bridge */ /* synthetic */ ApplicationExitInfo a(Object obj) {
        return (ApplicationExitInfo) obj;
    }

    public static /* synthetic */ void b(int i, int i2) {
        throw new IndexOutOfBoundsException("position=" + i + ((Object) ", limit=") + i2);
    }

    public static /* synthetic */ void f(int i, Object obj, Object obj2, Object obj3, int i2) {
        throw new IllegalStateException(("No parameter with index " + i + '+' + i2 + ((Object) " (name=") + obj + ((Object) " type=") + obj2 + ((Object) ") in ") + obj3).toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void i(int i, Object obj, String str) {
        throw new IllegalArgumentException((str + obj + ((char) i)).toString());
    }

    public static /* synthetic */ void j(int i, String str) {
        throw new IllegalArgumentException(str + i);
    }

    public static /* synthetic */ void k(Object obj, Object obj2, String str) {
        throw new IllegalStateException(str + obj + obj2);
    }

    public static /* synthetic */ void l(Object obj, String str) {
        throw new IllegalArgumentException(str + obj);
    }

    public static /* synthetic */ void m(String str) throws IOException {
        throw new IOException(str);
    }

    public static /* synthetic */ void n(String str, Object obj, Object obj2, Object obj3) {
        throw new IllegalStateException((str + obj + obj2 + obj3 + '\'').toString());
    }

    public static /* synthetic */ void o(String str, Object obj, Object obj2, Object obj3, Object obj4) {
        throw new IllegalArgumentException(str + obj + obj2 + obj3 + obj4);
    }

    public static /* synthetic */ void p(Throwable th) {
        throw new RuntimeException(th);
    }

    public static /* synthetic */ void q(Object obj, Object obj2, String str) {
        throw new IllegalArgumentException(str + obj + obj2);
    }

    public static /* synthetic */ void r(Object obj, String str) {
        throw new IllegalStateException(str + obj);
    }

    public static /* synthetic */ void s(String str, Object obj, Object obj2, Object obj3, Object obj4) {
        throw new IllegalStateException((str + obj + obj2 + obj3 + obj4).toString());
    }

    public static /* synthetic */ void t(Object obj, String str) {
        throw new pt7(str + obj);
    }

    @Override // defpackage.a3f
    public Object apply(Object obj) {
        switch (this.a) {
            case 3:
                i8a i8aVar = (i8a) obj;
                i8aVar.getClass();
                try {
                    int iG = i8aVar.g(null);
                    byte[] bArr = new byte[iG];
                    j72 j72Var = new j72(bArr, iG);
                    i8aVar.q(j72Var);
                    if (iG - j72Var.d == 0) {
                        return bArr;
                    }
                    throw new IllegalStateException("Did not write as much data as expected.");
                } catch (IOException e) {
                    throw new RuntimeException("Serializing " + i8a.class.getName() + " to a byte array threw an IOException (should never happen).", e);
                }
            default:
                return null;
        }
    }

    @Override // defpackage.bc2
    public Object c(hbc hbcVar) {
        switch (this.a) {
            case 0:
                return FirebaseSessionsRegistrar.getComponents$lambda$0(hbcVar);
            default:
                return FirebaseSessionsRegistrar.getComponents$lambda$1(hbcVar);
        }
    }

    @Override // defpackage.o95
    public l95[] d() {
        switch (this.a) {
            case 2:
                return new l95[]{new zh5()};
            default:
                return new l95[]{new jn5()};
        }
    }

    @Override // defpackage.pu6
    public boolean g(int i, int i2, int i3, int i4, int i5) {
        switch (this.a) {
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                return false;
            default:
                return i != 2 ? !(i2 == 65 && i3 == 80 && i4 == 73 && i5 == 67) : !(i2 == 80 && i3 == 73 && i4 == 67);
        }
    }

    @Override // defpackage.yn2
    public Object h(Task task) throws IOException {
        Bundle bundle = (Bundle) task.j();
        if (bundle == null) {
            m("SERVICE_NOT_AVAILABLE");
            return null;
        }
        String string = bundle.getString("registration_id");
        if (string != null) {
            return string;
        }
        String string2 = bundle.getString("unregistered");
        if (string2 != null) {
            return string2;
        }
        String string3 = bundle.getString("error");
        if ("RST".equals(string3)) {
            m("INSTANCE_ID_RESET");
            return null;
        }
        if (string3 != null) {
            m(string3);
            return null;
        }
        b1.n("FirebaseMessaging", "Unexpected response: " + bundle, new Throwable());
        m("SERVICE_NOT_AVAILABLE");
        return null;
    }

    public /* synthetic */ yg5(int i) {
        this.a = i;
    }
}
