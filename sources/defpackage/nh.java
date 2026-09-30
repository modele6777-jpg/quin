package defpackage;

import android.content.Context;
import android.net.Uri;
import com.adjust.sdk.AdjustInstance;
import com.adjust.sdk.OnLastDeeplinkReadListener;
import com.adjust.sdk.scheduler.AsyncTaskExecutor;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class nh extends AsyncTaskExecutor {
    public final /* synthetic */ Context a;
    public final /* synthetic */ OnLastDeeplinkReadListener b;
    public final /* synthetic */ AdjustInstance c;

    public nh(AdjustInstance adjustInstance, Context context, OnLastDeeplinkReadListener onLastDeeplinkReadListener) {
        this.c = adjustInstance;
        this.a = context;
        this.b = onLastDeeplinkReadListener;
    }

    @Override // com.adjust.sdk.scheduler.AsyncTaskExecutor
    public final Object doInBackground(Object[] objArr) {
        try {
            return Uri.parse(this.c.getCachedDeeplink(this.a));
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // com.adjust.sdk.scheduler.AsyncTaskExecutor
    public final void onPostExecute(Object obj) {
        this.b.onLastDeeplinkRead((Uri) obj);
    }
}
