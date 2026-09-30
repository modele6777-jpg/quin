package ai.askquin.ui.skin.download;

import android.R;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.content.Context;
import androidx.work.CoroutineWorker;
import androidx.work.WorkerParameters;
import com.adjust.sdk.network.ErrorCodes;
import defpackage.ace;
import defpackage.bw2;
import defpackage.ead;
import defpackage.eb3;
import defpackage.ga4;
import defpackage.hf8;
import defpackage.hr3;
import defpackage.ih9;
import defpackage.imd;
import defpackage.js3;
import defpackage.jzb;
import defpackage.kr5;
import defpackage.lr7;
import defpackage.lw7;
import defpackage.qc0;
import defpackage.uj8;
import defpackage.xn2;
import defpackage.ynb;
import defpackage.z18;
import defpackage.z7c;
import defpackage.zn2;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0017\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lai/askquin/ui/skin/download/SkinDownloadWorker;", "Landroidx/work/CoroutineWorker;", "Llr7;", "Lhf8;", "Landroid/content/Context;", "context", "Landroidx/work/WorkerParameters;", "params", "<init>", "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V", "Quin:conversation_gpRelease"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
public final class SkinDownloadWorker extends CoroutineWorker implements lr7, hf8 {
    public static final /* synthetic */ int x = 0;
    public final lw7 g;
    public final lw7 v;
    public final ace w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SkinDownloadWorker(Context context, WorkerParameters workerParameters) {
        super(context, workerParameters);
        context.getClass();
        workerParameters.getClass();
        uj8 uj8Var = new uj8(3, this);
        z18 z18Var = z18.a;
        this.g = eb3.N(z18Var, uj8Var);
        this.v = eb3.N(z18Var, new uj8(4, this));
        this.w = new ace(new ead(23));
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // androidx.work.CoroutineWorker
    public final Object c(xn2 xn2Var) {
        a aVar;
        if (xn2Var instanceof a) {
            aVar = (a) xn2Var;
            int i = aVar.label;
            if ((i & Integer.MIN_VALUE) != 0) {
                aVar.label = i - Integer.MIN_VALUE;
            } else {
                aVar = new a(this, (zn2) xn2Var);
            }
        } else {
            aVar = new a(this, (zn2) xn2Var);
        }
        Object objP0 = aVar.result;
        int i2 = aVar.label;
        if (i2 == 0) {
            jzb.q(objP0);
            js3 js3Var = ga4.a;
            hr3 hr3Var = hr3.c;
            imd imdVar = new imd(this, null);
            aVar.label = 1;
            objP0 = ynb.p0(hr3Var, imdVar, aVar);
            bw2 bw2Var = bw2.a;
            if (objP0 == bw2Var) {
                return bw2Var;
            }
        } else {
            if (i2 != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(objP0);
        }
        objP0.getClass();
        return objP0;
    }

    @Override // androidx.work.CoroutineWorker
    public final Object e() {
        NotificationChannel notificationChannel = new NotificationChannel("skin_download_channel", "Skin Download", 2);
        Context context = this.a;
        NotificationManager notificationManager = (NotificationManager) context.getSystemService(NotificationManager.class);
        if (notificationManager != null) {
            notificationManager.createNotificationChannel(notificationChannel);
        }
        ih9 ih9Var = new ih9(context, "skin_download_channel");
        ih9Var.e = ih9.b("Downloading skin");
        ih9Var.v.icon = R.drawable.stat_sys_download;
        ih9Var.c(2, true);
        Notification notificationA = ih9Var.a();
        notificationA.getClass();
        return new kr5(ErrorCodes.SERVER_RETRY_IN, notificationA, 0);
    }
}
