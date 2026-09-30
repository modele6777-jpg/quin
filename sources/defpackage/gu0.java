package defpackage;

import android.os.Message;
import android.util.Pair;
import com.adjust.sdk.sig.r3;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import io.sentry.android.core.b1;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class gu0 extends sig {
    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        int i = message.what;
        if (i != 1) {
            if (i != 2) {
                b1.o("BasePendingResult", ub3.h(i, "Don't know how to handle message: ", new StringBuilder(String.valueOf(i).length() + 34)), new Exception());
                return;
            } else {
                ((BasePendingResult) message.obj).c(Status.v);
                return;
            }
        }
        Pair pair = (Pair) message.obj;
        if (pair.first != null) {
            r3.f();
            return;
        }
        try {
            throw null;
        } catch (RuntimeException e) {
            kw kwVar = BasePendingResult.j;
            throw e;
        }
    }
}
