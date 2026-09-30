package defpackage;

import android.content.Context;
import android.os.Handler;
import com.adjust.sdk.AdjustTimeoutCallback;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class le implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ AdjustTimeoutCallback b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ Context d;

    public /* synthetic */ le(AdjustTimeoutCallback adjustTimeoutCallback, ArrayList arrayList, Context context, int i) {
        this.a = i;
        this.b = adjustTimeoutCallback;
        this.c = arrayList;
        this.d = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.a) {
            case 0:
                if (this.b.getOnAdidReadListener() != null) {
                    synchronized (this.c) {
                        this.c.remove(this.b);
                        break;
                    }
                    new Handler(this.d.getMainLooper()).post(new wwg(1, this));
                    return;
                }
                return;
            case 1:
                if (this.b.getOnAttributionReadListener() != null) {
                    synchronized (this.c) {
                        this.c.remove(this.b);
                        break;
                    }
                    new Handler(this.d.getMainLooper()).post(new wwg(2, this));
                    return;
                }
                return;
            default:
                if (this.b.getOnThirdPartySharingSettingsReadListener() != null) {
                    synchronized (this.c) {
                        this.c.remove(this.b);
                        break;
                    }
                    new Handler(this.d.getMainLooper()).post(new wwg(3, this));
                    return;
                }
                return;
        }
    }
}
