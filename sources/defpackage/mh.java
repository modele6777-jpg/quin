package defpackage;

import android.content.Context;
import com.adjust.sdk.AdjustFactory;
import com.adjust.sdk.ILogger;
import com.adjust.sdk.OnGoogleAdIdReadListener;
import com.adjust.sdk.OnIsEnabledListener;
import com.adjust.sdk.OnSdkVersionReadListener;
import com.adjust.sdk.Util;
import com.adjust.sdk.scheduler.AsyncTaskExecutor;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class mh extends AsyncTaskExecutor {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ mh(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // com.adjust.sdk.scheduler.AsyncTaskExecutor
    public final Object doInBackground(Object[] objArr) {
        switch (this.a) {
            case 0:
                return Util.getSdkVersion();
            case 1:
                return Boolean.valueOf(Util.isEnabledFromActivityStateFile(((Context[]) objArr)[0]));
            default:
                ILogger logger = AdjustFactory.getLogger();
                String googleAdId = Util.getGoogleAdId(((Context[]) objArr)[0]);
                logger.debug(ub3.i("GoogleAdId read ", googleAdId), new Object[0]);
                return googleAdId;
        }
    }

    @Override // com.adjust.sdk.scheduler.AsyncTaskExecutor
    public final void onPostExecute(Object obj) {
        int i = this.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ((OnSdkVersionReadListener) obj2).onSdkVersionRead((String) obj);
                break;
            case 1:
                ((OnIsEnabledListener) obj2).onIsEnabledRead(((Boolean) obj).booleanValue());
                break;
            default:
                String str = (String) obj;
                OnGoogleAdIdReadListener onGoogleAdIdReadListener = (OnGoogleAdIdReadListener) obj2;
                if (onGoogleAdIdReadListener != null) {
                    onGoogleAdIdReadListener.onGoogleAdIdRead(str);
                }
                break;
        }
    }
}
