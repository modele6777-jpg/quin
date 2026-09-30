package io.sentry.android.replay.capture;

import defpackage.a26;
import defpackage.gu7;
import defpackage.imb;
import io.sentry.q5;
import io.sentry.q6;
import io.sentry.s6;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class n extends gu7 implements a26 {
    final /* synthetic */ long $bufferLimit;
    final /* synthetic */ imb $removed;
    final /* synthetic */ o this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(long j, o oVar, imb imbVar) {
        super(1);
        this.$bufferLimit = j;
        this.this$0 = oVar;
        this.$removed = imbVar;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        s sVar = (s) obj;
        sVar.getClass();
        s6 s6Var = sVar.a;
        if (s6Var.J0.getTime() >= this.$bufferLimit) {
            return Boolean.FALSE;
        }
        o oVar = this.this$0;
        oVar.k(oVar.e() - 1);
        o oVar2 = this.this$0;
        File file = s6Var.E0;
        q6 q6Var = oVar2.v;
        if (file != null) {
            try {
                if (!file.delete()) {
                    q6Var.getLogger().i(q5.ERROR, "Failed to delete replay segment: %s", file.getAbsolutePath());
                }
            } catch (Throwable th) {
                q6Var.getLogger().c(q5.ERROR, th, "Failed to delete replay segment: %s", file.getAbsolutePath());
            }
        }
        this.$removed.element = true;
        return Boolean.TRUE;
    }
}
