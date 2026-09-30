package defpackage;

import com.adjust.sdk.AdjustAttribution;
import com.adjust.sdk.AdjustTimeoutCallback;
import com.adjust.sdk.OnAttributionReadListener;
import com.adjust.sdk.scheduler.TimerOnce;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class ne implements Runnable {
    public final /* synthetic */ int a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ AdjustAttribution c;

    public /* synthetic */ ne(ArrayList arrayList, AdjustAttribution adjustAttribution, int i) {
        this.a = i;
        this.b = arrayList;
        this.c = adjustAttribution;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i = this.a;
        AdjustAttribution adjustAttribution = this.c;
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
                        OnAttributionReadListener onAttributionReadListener = adjustTimeoutCallback.getOnAttributionReadListener();
                        if (onAttributionReadListener != null) {
                            onAttributionReadListener.onAttributionRead(adjustAttribution);
                        }
                        adjustTimeoutCallback.setOnAttributionReadListener(null);
                    }
                }
                break;
            default:
                int size2 = arrayList.size();
                while (i2 < size2) {
                    Object obj2 = arrayList.get(i2);
                    i2++;
                    AdjustTimeoutCallback adjustTimeoutCallback2 = (AdjustTimeoutCallback) obj2;
                    if (adjustTimeoutCallback2 != null) {
                        TimerOnce timeoutTimer2 = adjustTimeoutCallback2.getTimeoutTimer();
                        if (timeoutTimer2 != null) {
                            timeoutTimer2.cancel();
                        }
                        OnAttributionReadListener onAttributionReadListener2 = adjustTimeoutCallback2.getOnAttributionReadListener();
                        if (onAttributionReadListener2 != null) {
                            onAttributionReadListener2.onAttributionRead(adjustAttribution);
                        }
                        adjustTimeoutCallback2.setOnAttributionReadListener(null);
                    }
                }
                break;
        }
    }
}
