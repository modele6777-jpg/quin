package defpackage;

import com.adjust.sdk.sig.r3;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class tig {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ BasePendingResult b;
    public final /* synthetic */ Object c;

    public tig(vea veaVar, BasePendingResult basePendingResult) {
        this.b = basePendingResult;
        Objects.requireNonNull(veaVar);
        this.c = veaVar;
    }

    public final void a(Status status) {
        hzb hzbVar;
        switch (this.a) {
            case 0:
                if (!status.c()) {
                    ((gle) this.c).a.r(status.c != null ? new pxb(status) : new x60(status));
                    return;
                }
                BasePendingResult basePendingResult = this.b;
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                oa7.C("Result has already been consumed.", !basePendingResult.g);
                try {
                    if (!basePendingResult.b.await(0L, timeUnit)) {
                        basePendingResult.c(Status.v);
                    }
                } catch (InterruptedException unused) {
                    basePendingResult.c(Status.f);
                }
                oa7.C("Result is not ready.", basePendingResult.d());
                synchronized (basePendingResult.a) {
                    oa7.C("Result has already been consumed.", !basePendingResult.g);
                    oa7.C("Result is not ready.", basePendingResult.d());
                    hzbVar = basePendingResult.e;
                    basePendingResult.e = null;
                    basePendingResult.g = true;
                    break;
                }
                if (basePendingResult.d.getAndSet(null) != null) {
                    r3.f();
                    return;
                } else {
                    oa7.A(hzbVar);
                    ((gle) this.c).a(null);
                    return;
                }
            default:
                ((Map) ((vea) this.c).b).remove(this.b);
                return;
        }
    }

    public tig(BasePendingResult basePendingResult, gle gleVar, pzd pzdVar) {
        this.b = basePendingResult;
        this.c = gleVar;
    }
}
