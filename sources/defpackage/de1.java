package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CaptureFailure;
import android.hardware.camera2.CaptureRequest;
import android.hardware.camera2.TotalCaptureResult;
import android.os.Trace;
import androidx.work.impl.WorkDatabase;
import com.google.firebase.crashlytics.internal.metadata.UserMetadata;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.logging.Logger;
import net.xmind.donut.common.utils.ShareTargetChosenReceiver;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class de1 implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public /* synthetic */ de1(i8c i8cVar, String str, x16 x16Var, v69 v69Var, la1 la1Var) {
        this.a = 3;
        this.b = str;
        this.c = x16Var;
        this.d = v69Var;
        this.e = la1Var;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        int i = this.a;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.c;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                ((gk1) obj4).a.onCaptureCompleted((CameraCaptureSession) obj3, (CaptureRequest) obj2, (TotalCaptureResult) obj);
                return;
            case 1:
                ((gk1) obj4).a.onCaptureFailed((CameraCaptureSession) obj3, (CaptureRequest) obj2, (CaptureFailure) obj);
                return;
            case 2:
                ks3 ks3Var = (ks3) obj4;
                qq0 qq0Var = (qq0) obj3;
                String str = qq0Var.a;
                g4f g4fVar = (g4f) obj2;
                xo0 xo0Var = (xo0) obj;
                ks3Var.getClass();
                Logger logger = ks3.f;
                try {
                    x3f x3fVarA = ks3Var.c.a(str);
                    if (x3fVarA == null) {
                        String str2 = "Transport backend '" + str + "' is not registered";
                        logger.warning(str2);
                        g4fVar.a(new IllegalArgumentException(str2));
                    } else {
                        ks3Var.e.E(new gi2(ks3Var, qq0Var, ((tu1) x3fVarA).a(xo0Var), 2));
                        g4fVar.a(null);
                    }
                    return;
                } catch (Exception e) {
                    logger.warning("Error scheduling event " + e.getMessage());
                    g4fVar.a(e);
                    return;
                }
            case 3:
                String str3 = (String) obj4;
                x16 x16Var = (x16) obj3;
                v69 v69Var = (v69) obj2;
                la1 la1Var = (la1) obj;
                boolean zR = xdc.r();
                if (zR) {
                    try {
                        Trace.beginSection(xdc.v(str3));
                    } catch (Throwable th) {
                        if (zR) {
                            Trace.endSection();
                        }
                        throw th;
                    }
                }
                try {
                    x16Var.invoke();
                    kr9 kr9Var = hj6.S0;
                    v69Var.i(kr9Var);
                    la1Var.b(kr9Var);
                    break;
                } catch (Throwable th2) {
                    v69Var.i(new jr9(th2));
                    la1Var.d(th2);
                    break;
                }
                if (zR) {
                    Trace.endSection();
                    return;
                }
                return;
            case 4:
                ((imb) obj4).element = ((Boolean) ((w) obj3).d((String) obj2)).booleanValue();
                ((CountDownLatch) obj).countDown();
                return;
            case 5:
                List list = (List) obj4;
                tag tagVar = (tag) obj3;
                si2 si2Var = (si2) obj2;
                WorkDatabase workDatabase = (WorkDatabase) obj;
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    ((bfc) it.next()).d(tagVar.a);
                }
                efc.b(si2Var, workDatabase, list);
                return;
            case 6:
                Context context = (Context) obj4;
                String str4 = (String) obj3;
                String str5 = (String) obj2;
                BroadcastReceiver.PendingResult pendingResult = (BroadcastReceiver.PendingResult) obj;
                AtomicInteger atomicInteger = ShareTargetChosenReceiver.a;
                try {
                    f95.a.p(context, str4, str5);
                    return;
                } finally {
                    pendingResult.finish();
                }
            default:
                ((UserMetadata) obj4).lambda$setNewSession$0((String) obj3, (Map) obj2, (List) obj);
                return;
        }
    }

    public /* synthetic */ de1(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }
}
