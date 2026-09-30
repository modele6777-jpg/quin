package defpackage;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import io.sentry.util.k;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Random;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class kw extends ThreadLocal {
    public final /* synthetic */ int a;

    public /* synthetic */ kw(int i) {
        this.a = i;
    }

    @Override // java.lang.ThreadLocal
    public final Object initialValue() {
        switch (this.a) {
            case 0:
                Choreographer choreographer = Choreographer.getInstance();
                Looper looperMyLooper = Looper.myLooper();
                if (looperMyLooper != null) {
                    mw mwVar = new mw(choreographer, tq.r(looperMyLooper));
                    return i7h.I(mwVar, mwVar.z);
                }
                qc0.p("no Looper on this thread");
                return null;
            case 1:
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, dd MMM yyyy HH:mm:ss 'GMT'", Locale.US);
                simpleDateFormat.setLenient(false);
                simpleDateFormat.setTimeZone(keg.a);
                return simpleDateFormat;
            case 2:
                return new SimpleDateFormat("yyyy:MM:dd", Locale.US);
            case 3:
                return new SimpleDateFormat("HH:mm:ss", Locale.US);
            case 4:
                return new SimpleDateFormat("yyyy:MM:dd HH:mm:ss", Locale.US);
            case 5:
                return new Random();
            case 6:
                if (Looper.myLooper() == Looper.getMainLooper()) {
                    return ok8.w();
                }
                if (Looper.myLooper() != null) {
                    return new ah6(new Handler(Looper.myLooper()));
                }
                return null;
            case 7:
                return new PathMeasure();
            case 8:
                return new Path();
            case 9:
                return new Path();
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                return new float[4];
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                return new DecimalFormat("#.################", DecimalFormatSymbols.getInstance(Locale.ROOT));
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                return new k();
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                return Boolean.FALSE;
            case 14:
                hlg hlgVar = new hlg();
                hlgVar.a = 0;
                return hlgVar;
            case 15:
                return 0L;
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                ynb.r0(Thread.currentThread());
                qfh qfhVar = new qfh();
                qfhVar.a = false;
                qfhVar.b = null;
                Thread threadCurrentThread = Thread.currentThread();
                WeakHashMap weakHashMap = dfh.c;
                synchronized (weakHashMap) {
                    weakHashMap.put(threadCurrentThread, qfhVar);
                    break;
                }
                return qfhVar;
            default:
                return new Random();
        }
    }
}
