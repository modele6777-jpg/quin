package io.sentry.android.replay.screenshot;

import android.graphics.Matrix;
import defpackage.gu7;
import defpackage.x16;
import io.sentry.android.replay.b0;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class b extends gu7 implements x16 {
    final /* synthetic */ c this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(c cVar) {
        super(0);
        this.this$0 = cVar;
    }

    @Override // defpackage.x16
    public final Object invoke() {
        Matrix matrix = new Matrix();
        b0 b0Var = this.this$0.d;
        matrix.preScale(b0Var.c, b0Var.d);
        return matrix;
    }
}
