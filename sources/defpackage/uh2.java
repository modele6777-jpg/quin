package defpackage;

import ai.askquin.qa.bridge.QaResult;
import android.content.res.AssetFileDescriptor;
import androidx.work.impl.WorkDatabase;
import com.adjust.sdk.Constants;
import com.google.firebase.crashlytics.internal.common.CrashlyticsCore;
import io.sentry.o0;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.InetAddress;
import java.util.concurrent.Callable;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class uh2 implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ uh2(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Throwable th;
        FileInputStream fileInputStreamOpenFileInput;
        int i = this.a;
        yh2 yh2VarA = null;
        int i2 = 0;
        Object obj = this.b;
        switch (i) {
            case 0:
                mi2 mi2Var = (mi2) obj;
                synchronized (mi2Var) {
                    try {
                        try {
                            fileInputStreamOpenFileInput = mi2Var.a.openFileInput(mi2Var.b);
                            try {
                                int iAvailable = fileInputStreamOpenFileInput.available();
                                byte[] bArr = new byte[iAvailable];
                                fileInputStreamOpenFileInput.read(bArr, 0, iAvailable);
                                yh2VarA = yh2.a(new JSONObject(new String(bArr, Constants.ENCODING)));
                                fileInputStreamOpenFileInput.close();
                            } catch (FileNotFoundException | JSONException unused) {
                                if (fileInputStreamOpenFileInput != null) {
                                    fileInputStreamOpenFileInput.close();
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                if (fileInputStreamOpenFileInput != null) {
                                    fileInputStreamOpenFileInput.close();
                                }
                                throw th;
                            }
                        } catch (FileNotFoundException | JSONException unused2) {
                            fileInputStreamOpenFileInput = null;
                        } catch (Throwable th3) {
                            th = th3;
                            fileInputStreamOpenFileInput = null;
                        }
                    } catch (Throwable th4) {
                        throw th4;
                    }
                }
                return yh2VarA;
            case 1:
                return ((CrashlyticsCore) obj).lambda$checkForPreviousCrash$10();
            case 2:
                return (QaResult) ((j8) obj).invoke();
            case 3:
                WorkDatabase workDatabase = (WorkDatabase) ((ssg) obj).b;
                Long lA = workDatabase.t().a("next_job_scheduler_id");
                int iLongValue = lA != null ? (int) lA.longValue() : 0;
                int i3 = iLongValue == Integer.MAX_VALUE ? 0 : iLongValue + 1;
                aqa aqaVarT = workDatabase.t();
                int i4 = 27;
                urg.I(aqaVarT.a, false, true, new kz8(i4, aqaVarT, new zpa("next_job_scheduler_id", Long.valueOf(i3))));
                if (iLongValue < 0 || iLongValue > Integer.MAX_VALUE) {
                    aqa aqaVarT2 = workDatabase.t();
                    urg.I(aqaVarT2.a, false, true, new kz8(i4, aqaVarT2, new zpa("next_job_scheduler_id", 1L)));
                } else {
                    i2 = iLongValue;
                }
                return Integer.valueOf(i2);
            case 4:
                return ((bqb) obj).b("firebase");
            case 5:
                return (AssetFileDescriptor) obj;
            case 6:
                o0 o0Var = (o0) obj;
                try {
                    o0Var.e.getClass();
                    o0Var.b = InetAddress.getLocalHost().getCanonicalHostName();
                    o0Var.c = System.currentTimeMillis() + o0Var.a;
                    return null;
                } finally {
                    o0Var.d.set(false);
                }
            case 7:
                return (Integer) ((AtomicReference) obj).get();
            default:
                return (Integer) obj;
        }
    }
}
