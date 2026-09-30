package defpackage;

import ai.askquin.qa.bridge.QaResult;
import android.os.Looper;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class dfd implements d3b {
    @Override // defpackage.d3b
    public final QaResult c(ti7 ti7Var) {
        Object dzbVar;
        s3b s3bVar = (s3b) t3b.a.get();
        boolean z = false;
        if (s3bVar != null) {
            hl hlVar = s3bVar.b;
            if (pa7.t(Looper.myLooper(), Looper.getMainLooper())) {
                try {
                    hlVar.invoke();
                    dzbVar = wef.a;
                } catch (Throwable th) {
                    dzbVar = new dzb(th);
                }
                z = !(dzbVar instanceof dzb);
            } else {
                CountDownLatch countDownLatch = new CountDownLatch(1);
                imb imbVar = new imb();
                t3b.b.post(new c0(imbVar, hlVar, countDownLatch, 27));
                if (countDownLatch.await(2L, TimeUnit.SECONDS) && imbVar.element) {
                    z = true;
                }
            }
        }
        return z ? new QaResult.Ok(new ti7(ib8.q("shown", oh7.a(Boolean.TRUE)))) : new QaResult.Err("conversation screen is not active", "not_on_conversation");
    }

    @Override // defpackage.d3b
    public final String getId() {
        return "review-reward.show-prompt";
    }

    @Override // defpackage.d3b
    public final String getTitle() {
        return "弹出邀请评价 Dialog";
    }
}
