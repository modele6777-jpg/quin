package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Parcelable;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.iid.FirebaseInstanceIdReceiver;
import io.sentry.android.core.b1;
import java.lang.ref.SoftReference;
import java.util.Objects;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class gzg implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ Parcelable c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    public gzg(lah lahVar, ndh ndhVar, boolean z, wog wogVar) {
        this.a = 3;
        this.c = ndhVar;
        this.b = z;
        this.d = wogVar;
        Objects.requireNonNull(lahVar);
        this.e = lahVar;
    }

    @Override // java.lang.Runnable
    public final void run() throws Throwable {
        Executor executorUnconfigurableExecutorService;
        int iA;
        switch (this.a) {
            case 0:
                Intent intent = (Intent) this.c;
                Context context = (Context) this.d;
                boolean z = this.b;
                BroadcastReceiver.PendingResult pendingResult = (BroadcastReceiver.PendingResult) this.e;
                try {
                    Parcelable parcelableExtra = intent.getParcelableExtra("wrapped_intent");
                    Intent intent2 = parcelableExtra instanceof Intent ? (Intent) parcelableExtra : null;
                    if (intent2 == null) {
                        int iIntValue = 500;
                        if (intent.getExtras() != null) {
                            i62 i62Var = new i62(intent);
                            CountDownLatch countDownLatch = new CountDownLatch(1);
                            synchronized (FirebaseInstanceIdReceiver.class) {
                                try {
                                    SoftReference softReference = FirebaseInstanceIdReceiver.b;
                                    executorUnconfigurableExecutorService = softReference != null ? (Executor) softReference.get() : null;
                                    if (executorUnconfigurableExecutorService == null) {
                                        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new z99("pscm-ack-executor"));
                                        threadPoolExecutor.allowCoreThreadTimeOut(true);
                                        executorUnconfigurableExecutorService = Executors.unconfigurableExecutorService(threadPoolExecutor);
                                        FirebaseInstanceIdReceiver.b = new SoftReference(executorUnconfigurableExecutorService);
                                    }
                                } catch (Throwable th) {
                                    throw th;
                                }
                                break;
                            }
                            executorUnconfigurableExecutorService.execute(new qe(context, i62Var, countDownLatch, false, 8));
                            try {
                                iIntValue = ((Integer) Tasks.a(new a90(context, 2).Q(intent))).intValue();
                            } catch (InterruptedException | ExecutionException e) {
                                b1.e("FirebaseMessaging", "Failed to send message to service.", e);
                            }
                            try {
                                if (!countDownLatch.await(1000L, TimeUnit.MILLISECONDS)) {
                                    b1.l("CloudMessagingReceiver", "Message ack timed out");
                                }
                            } catch (InterruptedException e2) {
                                b1.l("CloudMessagingReceiver", "Message ack failed: ".concat(e2.toString()));
                            }
                        }
                        iA = iIntValue;
                        break;
                    } else {
                        iA = FirebaseInstanceIdReceiver.a(intent2);
                    }
                    if (z && pendingResult != null) {
                        pendingResult.setResultCode(iA);
                    }
                    if (pendingResult != null) {
                        pendingResult.finish();
                        return;
                    }
                    return;
                } catch (Throwable th2) {
                    if (pendingResult != null) {
                        pendingResult.finish();
                    }
                    throw th2;
                }
            case 1:
                lah lahVar = (lah) this.e;
                hzg hzgVar = lahVar.e;
                if (hzgVar != null) {
                    lahVar.S0(hzgVar, this.b ? null : (mch) this.d, (ndh) this.c);
                    lahVar.N0();
                    return;
                } else {
                    w0h w0hVar = ((w3h) lahVar.b).f;
                    w3h.h(w0hVar);
                    w0hVar.g.a("Discarding data. Failed to set user property");
                    return;
                }
            case 2:
                lah lahVar2 = (lah) this.e;
                hzg hzgVar2 = lahVar2.e;
                if (hzgVar2 != null) {
                    lahVar2.S0(hzgVar2, this.b ? null : (hsg) this.d, (ndh) this.c);
                    lahVar2.N0();
                    return;
                } else {
                    w0h w0hVar2 = ((w3h) lahVar2.b).f;
                    w3h.h(w0hVar2);
                    w0hVar2.g.a("Discarding data. Failed to send event to service");
                    return;
                }
            default:
                lah lahVar3 = (lah) this.e;
                hzg hzgVar3 = lahVar3.e;
                if (hzgVar3 != null) {
                    lahVar3.S0(hzgVar3, this.b ? null : (wog) this.d, (ndh) this.c);
                    lahVar3.N0();
                    return;
                } else {
                    w0h w0hVar3 = ((w3h) lahVar3.b).f;
                    w3h.h(w0hVar3);
                    w0hVar3.g.a("Discarding data. Failed to send conditional user property to service");
                    return;
                }
        }
    }

    public /* synthetic */ gzg(lah lahVar, ndh ndhVar, boolean z, v4 v4Var, int i) {
        this.a = i;
        this.c = ndhVar;
        this.b = z;
        this.d = v4Var;
        this.e = lahVar;
    }

    public /* synthetic */ gzg(FirebaseInstanceIdReceiver firebaseInstanceIdReceiver, Intent intent, Context context, boolean z, BroadcastReceiver.PendingResult pendingResult) {
        this.a = 0;
        this.c = intent;
        this.d = context;
        this.b = z;
        this.e = pendingResult;
    }
}
