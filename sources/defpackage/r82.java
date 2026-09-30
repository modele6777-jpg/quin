package defpackage;

import android.os.ProfilingManager;
import android.view.contentcapture.ContentCaptureSession;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import com.google.gson.JsonIOException;
import com.google.gson.internal.ConstructorConstructor;
import com.google.gson.internal.ObjectConstructor;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.p4;
import io.sentry.w1;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class r82 implements si4, ObjectConstructor, u26, p4 {
    public final /* synthetic */ int a;

    public /* synthetic */ r82(int i) {
        this.a = i;
    }

    public static /* bridge */ /* synthetic */ ProfilingManager a(Object obj) {
        return (ProfilingManager) obj;
    }

    public static /* bridge */ /* synthetic */ ContentCaptureSession c(Object obj) {
        return (ContentCaptureSession) obj;
    }

    public static /* synthetic */ void e(Object obj, Object obj2, String str) {
        throw new IllegalStateException((str + obj + obj2).toString());
    }

    public static /* synthetic */ void f(Object obj, String str) {
        throw new JsonIOException(str + ((Object) obj.toString()));
    }

    public static /* synthetic */ void g(String str) {
        throw new NullPointerException(str);
    }

    public static /* synthetic */ void h(String str, Object obj, Object obj2, Object obj3) {
        throw new pt7(str + obj + obj2 + obj3 + ')');
    }

    @Override // defpackage.u26
    public Object apply(Object obj) {
        return null;
    }

    @Override // defpackage.si4
    public double b(double d) {
        switch (this.a) {
            case 3:
                double d2 = d < 0.0d ? -d : d;
                return Math.copySign(d2 >= 0.0031308049535603718d ? (Math.pow(d2, 0.4166666666666667d) - 0.05213270142180095d) / 0.9478672985781991d : d2 / 0.07739938080495357d, d);
            case 4:
                double d3 = d < 0.0d ? -d : d;
                return Math.copySign(d3 >= 0.04045d ? Math.pow((0.9478672985781991d * d3) + 0.05213270142180095d, 2.4d) : d3 * 0.07739938080495357d, d);
            case 5:
                float[] fArr = s82.a;
                return s82.b(s82.c, d);
            case 6:
                float[] fArr2 = s82.a;
                return s82.a(s82.c, d);
            case 7:
                float[] fArr3 = s82.a;
                return s82.d(s82.d, d);
            default:
                float[] fArr4 = s82.a;
                return s82.c(s82.d, d);
        }
    }

    @Override // com.google.gson.internal.ObjectConstructor
    public Object construct() {
        switch (this.a) {
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                return ConstructorConstructor.lambda$newMapConstructor$14();
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                return ConstructorConstructor.lambda$newMapConstructor$15();
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                return ConstructorConstructor.lambda$newMapConstructor$16();
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                return ConstructorConstructor.lambda$newMapConstructor$17();
            case 14:
                return ConstructorConstructor.lambda$newMapConstructor$18();
            case 15:
                return ConstructorConstructor.lambda$newCollectionConstructor$10();
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                return ConstructorConstructor.lambda$newCollectionConstructor$11();
            case 17:
                return ConstructorConstructor.lambda$newCollectionConstructor$12();
            default:
                return ConstructorConstructor.lambda$newCollectionConstructor$13();
        }
    }

    @Override // io.sentry.p4
    public void d(SentryAndroidOptions sentryAndroidOptions) {
        List<w1> integrations = sentryAndroidOptions.getIntegrations();
        integrations.getClass();
        x72.i0(new cz1(22), integrations);
        boolean zA = false;
        sentryAndroidOptions.setDebug(false);
        sentryAndroidOptions.setAnrEnabled(false);
        cn1.z();
        if (!ff5.c().isEmpty()) {
            gg5 gg5VarB = ((bqb) ff5.d().b(bqb.class)).b("firebase");
            gg5VarB.getClass();
            zA = gg5VarB.f.b("is_sentry_upload_screenshots").a();
            td5.a.d().e("configure SentryAndroidOptions: is_sentry_upload_screenshots=" + zA);
        }
        sentryAndroidOptions.setAttachScreenshot(zA);
    }
}
