package io.sentry.android.replay.capture;

import defpackage.a26;
import defpackage.gu7;
import defpackage.wef;
import java.io.File;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class y extends gu7 implements a26 {
    final /* synthetic */ File $replayCacheDir;
    final /* synthetic */ z this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(z zVar, File file) {
        super(1);
        this.this$0 = zVar;
        this.$replayCacheDir = file;
    }

    @Override // defpackage.a26
    public final Object d(Object obj) {
        u uVar = (u) obj;
        uVar.getClass();
        if (uVar instanceof s) {
            s.a((s) uVar, this.this$0.w);
        }
        this.this$0.k(-1);
        io.sentry.util.b.g(this.$replayCacheDir);
        return wef.a;
    }
}
