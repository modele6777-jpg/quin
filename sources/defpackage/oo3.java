package defpackage;

import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.lang.reflect.Constructor;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class oo3 implements c98, bc2, u37 {
    public final /* synthetic */ int a;

    public /* synthetic */ oo3(int i) {
        this.a = i;
    }

    public static /* synthetic */ void f() {
        throw new nt7();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void g(int i, Object obj, String str) {
        throw new IllegalStateException((str + obj + ((char) i)).toString());
    }

    public static /* synthetic */ void h(String str, Object obj, Object obj2, Object obj3) {
        throw new pt7(str + obj + obj2 + obj3);
    }

    @Override // defpackage.u37
    public t37 a(a80 a80Var) {
        return new pd4(0);
    }

    public Constructor b() {
        switch (this.a) {
            case 20:
                if (Boolean.TRUE.equals(Class.forName("androidx.media3.decoder.flac.FlacLibrary").getMethod("isAvailable", null).invoke(null, null))) {
                    return Class.forName("androidx.media3.decoder.flac.FlacExtractor").asSubclass(l95.class).getConstructor(Integer.TYPE);
                }
                return null;
            default:
                return Class.forName("androidx.media3.decoder.midi.MidiExtractor").asSubclass(l95.class).getConstructor(null);
        }
    }

    @Override // defpackage.bc2
    public Object c(hbc hbcVar) {
        Set setB = hbcVar.b(y3b.a(jp0.class));
        kb6 kb6Var = kb6.c;
        if (kb6Var == null) {
            synchronized (kb6.class) {
                try {
                    kb6Var = kb6.c;
                    if (kb6Var == null) {
                        kb6Var = new kb6(0);
                        kb6.c = kb6Var;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return new du3(setB, kb6Var);
    }

    @Override // defpackage.c98
    public void d(Object obj) {
        ql qlVar = (ql) obj;
        switch (this.a) {
            case 0:
                qlVar.getClass();
                break;
            case 1:
                qlVar.getClass();
                break;
            case 2:
                qlVar.getClass();
                break;
            case 3:
                qlVar.getClass();
                break;
            case 4:
                qlVar.getClass();
                break;
            case 5:
                qlVar.getClass();
                break;
            case 6:
                qlVar.getClass();
                break;
            case 7:
                qlVar.getClass();
                break;
            case 8:
                qlVar.getClass();
                break;
            case 9:
                qlVar.getClass();
                break;
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                qlVar.getClass();
                break;
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                qlVar.getClass();
                break;
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                qlVar.getClass();
                break;
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                qlVar.getClass();
                break;
            case 14:
                qlVar.getClass();
                break;
            case 15:
                qlVar.getClass();
                break;
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                qlVar.getClass();
                break;
            case 17:
                qlVar.getClass();
                break;
            case 18:
                qlVar.getClass();
                break;
            default:
                qlVar.getClass();
                break;
        }
    }
}
