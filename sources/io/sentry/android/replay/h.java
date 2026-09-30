package io.sentry.android.replay;

import defpackage.gu7;
import defpackage.x16;
import java.io.File;
import java.io.IOException;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class h extends gu7 implements x16 {
    final /* synthetic */ k this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(k kVar) {
        super(0);
        this.this$0 = kVar;
    }

    @Override // defpackage.x16
    public final Object invoke() throws IOException {
        if (this.this$0.l() == null) {
            return null;
        }
        File file = new File(this.this$0.l(), ".ongoing_segment");
        if (!file.exists()) {
            file.createNewFile();
        }
        return file;
    }
}
