package defpackage;

import com.adjust.sdk.AdjustTimeoutCallback;
import com.adjust.sdk.OnAdidReadListener;
import com.adjust.sdk.scheduler.TimerOnce;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class me implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ String c;

    public /* synthetic */ me(int i, String str, ArrayList arrayList) {
        this.a = i;
        this.b = arrayList;
        this.c = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        String str = this.c;
        int i2 = 0;
        ArrayList arrayList = this.b;
        switch (i) {
            case 0:
                int size = arrayList.size();
                while (i2 < size) {
                    Object obj = arrayList.get(i2);
                    i2++;
                    AdjustTimeoutCallback adjustTimeoutCallback = (AdjustTimeoutCallback) obj;
                    if (adjustTimeoutCallback != null) {
                        TimerOnce timeoutTimer = adjustTimeoutCallback.getTimeoutTimer();
                        if (timeoutTimer != null) {
                            timeoutTimer.cancel();
                        }
                        OnAdidReadListener onAdidReadListener = adjustTimeoutCallback.getOnAdidReadListener();
                        if (onAdidReadListener != null) {
                            onAdidReadListener.onAdidRead(str);
                        }
                        adjustTimeoutCallback.setOnAdidReadListener(null);
                    }
                }
                break;
            default:
                int size2 = arrayList.size();
                while (i2 < size2) {
                    Object obj2 = arrayList.get(i2);
                    i2++;
                    OnAdidReadListener onAdidReadListener2 = (OnAdidReadListener) obj2;
                    if (onAdidReadListener2 != null) {
                        onAdidReadListener2.onAdidRead(str);
                    }
                }
                break;
        }
    }
}
