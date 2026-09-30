package io.sentry.android.replay;

import defpackage.a26;
import defpackage.gu7;
import defpackage.pa7;
import defpackage.wef;
import defpackage.wn7;
import io.sentry.o2;
import io.sentry.q5;
import io.sentry.q6;
import java.util.Date;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class n extends gu7 implements a26 {
    final /* synthetic */ ReplayIntegration this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(ReplayIntegration replayIntegration) {
        super(1);
        this.this$0 = replayIntegration;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        Date date = (Date) obj;
        date.getClass();
        io.sentry.android.replay.capture.i iVar = this.this$0.Y;
        if (iVar != null) {
            iVar.k(iVar.e() + 1);
        }
        io.sentry.android.replay.capture.i iVar2 = this.this$0.Y;
        if (iVar2 != null) {
            iVar2.m(date);
        }
        io.sentry.android.replay.capture.i iVar3 = this.this$0.Y;
        if (iVar3 != null) {
            io.sentry.android.replay.capture.b bVar = iVar3.p;
            wn7 wn7Var = io.sentry.android.replay.capture.i.u[6];
            Boolean bool = Boolean.TRUE;
            bVar.getClass();
            wn7Var.getClass();
            Object andSet = bVar.b.getAndSet(bool);
            if (!pa7.t(andSet, bool)) {
                io.sentry.android.replay.capture.e eVar = new io.sentry.android.replay.capture.e(andSet, bool, bVar.d);
                io.sentry.android.replay.capture.i iVar4 = bVar.c;
                q6 q6Var = iVar4.a;
                if (q6Var.getThreadChecker().c()) {
                    iVar4.e.submit(new io.sentry.android.replay.util.h(new o2(5, eVar), "CaptureStrategy.runInBackground"));
                } else {
                    try {
                        eVar.invoke();
                    } catch (Throwable th) {
                        q6Var.getLogger().d(q5.ERROR, "Failed to execute task CaptureStrategy.runInBackground", th);
                    }
                }
            }
        }
        return wef.a;
    }
}
