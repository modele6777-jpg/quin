package io.sentry.android.replay;

import defpackage.gu7;
import defpackage.x16;
import io.sentry.q5;
import io.sentry.q6;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class i extends gu7 implements x16 {
    final /* synthetic */ k this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(k kVar) {
        super(0);
        this.this$0 = kVar;
    }

    @Override // defpackage.x16
    public final Object invoke() {
        k kVar = this.this$0;
        q6 q6Var = kVar.a;
        io.sentry.protocol.w wVar = kVar.b;
        q6Var.getClass();
        wVar.getClass();
        String cacheDirPath = q6Var.getCacheDirPath();
        if (cacheDirPath == null || cacheDirPath.length() == 0) {
            q6Var.getLogger().i(q5.WARNING, "SentryOptions.cacheDirPath is not set, session replay is no-op", new Object[0]);
            return null;
        }
        String cacheDirPath2 = q6Var.getCacheDirPath();
        cacheDirPath2.getClass();
        File file = new File(cacheDirPath2, "replay_" + wVar);
        file.mkdirs();
        return file;
    }
}
