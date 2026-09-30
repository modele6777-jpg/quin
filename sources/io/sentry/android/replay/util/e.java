package io.sentry.android.replay.util;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import defpackage.gu7;
import defpackage.x16;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class e extends gu7 implements x16 {
    final /* synthetic */ f this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(f fVar) {
        super(0);
        this.this$0 = fVar;
    }

    @Override // defpackage.x16
    public final Object invoke() {
        return new Canvas((Bitmap) this.this$0.a.getValue());
    }
}
