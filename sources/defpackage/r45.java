package defpackage;

import android.content.ClipData;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.os.Build;
import android.os.Bundle;
import android.view.inputmethod.InputContentInfo;
import com.google.android.gms.tasks.Task;
import com.google.firebase.crashlytics.internal.CrashlyticsRemoteConfigListener;
import com.google.firebase.crashlytics.internal.RemoteConfigDeferredProxy;
import com.google.firebase.crashlytics.internal.common.SessionReportingCoordinator;
import com.google.firebase.crashlytics.internal.common.Utils;
import io.sentry.android.core.b1;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ScheduledFuture;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class r45 implements c98, xx0, gv6, kn9, h47, tg0, u26, oh5, kw6, xm9, mu3, yn2, xl2, zbe {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ r45(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.kn9
    public void a(Object obj) {
        ((wg) this.b).d(obj);
    }

    @Override // defpackage.xl2
    public void accept(Object obj) {
        ((dy6) this.b).b((w03) obj);
    }

    @Override // defpackage.tg0
    /* JADX INFO: renamed from: apply, reason: collision with other method in class */
    public m88 mo34apply(Object obj) {
        return (m88) ((za6) this.b).d(obj);
    }

    @Override // defpackage.h47
    public boolean b(ssg ssgVar, int i, Bundle bundle) {
        rm2 qm2Var;
        u80 u80Var = (u80) this.b;
        if ((i & 1) != 0) {
            try {
                ((InputContentInfo) ((mjg) ssgVar.b).a).requestPermission();
                InputContentInfo inputContentInfo = (InputContentInfo) ((mjg) ssgVar.b).a;
                bundle = bundle == null ? new Bundle() : new Bundle(bundle);
                bundle.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", inputContentInfo);
            } catch (Exception e) {
                b1.n("InputConnectionCompat", "Can't insert content from IME; requestPermission() failed", e);
                return false;
            }
        }
        mjg mjgVar = (mjg) ssgVar.b;
        mjg mjgVar2 = (mjg) ssgVar.b;
        ClipData clipData = new ClipData(((InputContentInfo) mjgVar.a).getDescription(), new ClipData.Item(((InputContentInfo) mjgVar2.a).getContentUri()));
        if (Build.VERSION.SDK_INT >= 31) {
            qm2Var = new qm2(clipData, 2);
        } else {
            sm2 sm2Var = new sm2();
            sm2Var.b = clipData;
            sm2Var.c = 2;
            qm2Var = sm2Var;
        }
        qm2Var.a(((InputContentInfo) mjgVar2.a).getLinkUri());
        qm2Var.setExtras(bundle);
        return nvf.h(u80Var, qm2Var.build()) == null;
    }

    @Override // defpackage.xx0
    public long c(long j) {
        bi5 bi5Var = (bi5) this.b;
        return pqf.i((j * ((long) bi5Var.e)) / 1000000, 0L, bi5Var.j - 1);
    }

    @Override // defpackage.c98
    public void d(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ((xga) obj).v(((t45) obj2).a.R);
                break;
            case 1:
                ((xga) obj).g((su8) obj2);
                break;
            default:
                ((xga) obj).z((List) obj2);
                break;
        }
    }

    @Override // defpackage.gv6
    public void e() {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 5:
                ((za2) obj).R(wef.a);
                return;
            default:
                vfc vfcVar = (vfc) obj;
                synchronized (vfcVar.b) {
                    try {
                        if (vfcVar.d == null) {
                            b21.W("ScreenFlashWrapper", "apply: pendingListener is null!");
                        }
                        vfcVar.c();
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return;
        }
    }

    @Override // defpackage.oh5
    public void f(float f) {
        gp8 gp8Var = (gp8) this.b;
        nuf nufVar = gp8Var.Z1.b;
        if (nufVar.f != f) {
            nufVar.f = f;
            nufVar.c(false);
        }
        gp8Var.D0(gp8Var.b1);
    }

    public void g(long j, d0a d0aVar) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 6:
                feg.y(j, d0aVar, ((py5) obj).I);
                break;
            case 20:
                feg.y(j, d0aVar, ((vtc) obj).c);
                break;
            default:
                feg.z(j, d0aVar, ((vtc) obj).c);
                break;
        }
    }

    @Override // defpackage.yn2
    public Object h(Task task) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 21:
                return Boolean.valueOf(((SessionReportingCoordinator) obj).onReportSendComplete(task));
            default:
                return Utils.lambda$awaitEvenIfOnMainThread$0((CountDownLatch) obj, task);
        }
    }

    @Override // defpackage.mu3
    public void i(i1b i1bVar) {
        RemoteConfigDeferredProxy.lambda$setupListener$0((CrashlyticsRemoteConfigListener) this.b, i1bVar);
    }

    @Override // defpackage.xm9
    public void k(Task task) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 17:
                task.getClass();
                ((edb) obj).d.setValue(null);
                break;
            case 27:
                qk2.v((Intent) obj);
                break;
            case 28:
                ((fag) obj).b.c(null);
                break;
            default:
                ((ScheduledFuture) obj).cancel(false);
                break;
        }
    }

    @Override // defpackage.kw6
    public void l(lw6 lw6Var) {
        yu8 yu8Var = (yu8) this.b;
        synchronized (yu8Var.a) {
            yu8Var.c++;
        }
        yu8Var.f(lw6Var);
    }

    @Override // defpackage.zbe
    public Object p() {
        w8c w8cVar = (w8c) ((lp0) this.b).x;
        SQLiteDatabase sQLiteDatabaseB = w8cVar.b();
        sQLiteDatabaseB.beginTransaction();
        try {
            sQLiteDatabaseB.compileStatement("DELETE FROM log_event_dropped").execute();
            sQLiteDatabaseB.compileStatement("UPDATE global_log_event_state SET last_metrics_upload_ms=" + w8cVar.b.e()).execute();
            sQLiteDatabaseB.setTransactionSuccessful();
            return null;
        } finally {
            sQLiteDatabaseB.endTransaction();
        }
    }

    @Override // defpackage.u26
    public Object apply(Object obj) {
        return (Void) ((it3) this.b).d(obj);
    }
}
