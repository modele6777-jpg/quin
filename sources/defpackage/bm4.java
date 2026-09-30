package defpackage;

import ai.askquin.qa.bridge.QaResult;
import android.os.Looper;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class bm4 implements d3b {
    @Override // defpackage.d3b
    public final QaResult c(ti7 ti7Var) {
        Object dzbVar;
        Object ct0Var;
        h3b h3bVar = (h3b) i3b.a.get();
        if (h3bVar == null) {
            ct0Var = new ct0("drawing screen is not active", "not_on_drawing_screen");
        } else {
            yv9 yv9Var = h3bVar.b;
            if (pa7.t(Looper.myLooper(), Looper.getMainLooper())) {
                try {
                    dzbVar = yv9Var.invoke();
                } catch (Throwable th) {
                    dzbVar = new dzb(th);
                }
                Throwable thA = ezb.a(dzbVar);
                if (thA != null) {
                    String message = thA.getMessage();
                    if (message == null) {
                        message = thA.getClass().getSimpleName();
                    }
                    dzbVar = new ct0(message, "invoke_failed");
                }
                ct0Var = (dt0) dzbVar;
            } else {
                mmb mmbVar = new mmb();
                CountDownLatch countDownLatch = new CountDownLatch(1);
                i3b.b.post(new c0(mmbVar, yv9Var, countDownLatch, 25));
                if (countDownLatch.await(2L, TimeUnit.SECONDS)) {
                    ct0Var = (dt0) mmbVar.element;
                    if (ct0Var == null) {
                        ct0Var = new ct0("drawing action produced no result", "no_result");
                    }
                } else {
                    ct0Var = new ct0("timed out waiting for drawing screen", "timeout");
                }
            }
        }
        if (ct0Var instanceof bt0) {
            bt0 bt0Var = (bt0) ct0Var;
            return new QaResult.Ok(new ti7(bm8.H(new iy9("card", oh7.c(bt0Var.a.getCardKey())), new iy9("index", oh7.b(Integer.valueOf(bt0Var.b))), new iy9("choices", oh7.b(Integer.valueOf(bt0Var.c))), new iy9("finished", oh7.a(Boolean.valueOf(bt0Var.d))))));
        }
        if (ct0Var instanceof ct0) {
            ct0 ct0Var2 = (ct0) ct0Var;
            return new QaResult.Err(ct0Var2.a, ct0Var2.b);
        }
        ap.c();
        return null;
    }

    @Override // defpackage.d3b
    public final String getId() {
        return "draw.push-bad-card";
    }

    @Override // defpackage.d3b
    public final String getTitle() {
        return "抽一张坏牌（当前抽牌页）";
    }
}
