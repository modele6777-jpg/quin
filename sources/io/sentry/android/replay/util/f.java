package io.sentry.android.replay.util;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import defpackage.eb3;
import defpackage.lw7;
import defpackage.pu4;
import defpackage.z18;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class f implements Closeable {
    public final lw7 a;
    public final lw7 b;
    public final lw7 c;

    public f() {
        c cVar = c.b;
        z18 z18Var = z18.c;
        this.a = eb3.N(z18Var, cVar);
        this.b = eb3.N(z18Var, new e(this));
        this.c = eb3.N(z18Var, c.c);
    }

    public final List b(Bitmap bitmap, io.sentry.android.replay.viewhierarchy.g gVar, Matrix matrix) {
        bitmap.getClass();
        if (bitmap.isRecycled()) {
            return pu4.a;
        }
        ArrayList arrayList = new ArrayList();
        Canvas canvas = new Canvas(bitmap);
        if (matrix != null) {
            canvas.setMatrix(matrix);
        }
        gVar.a(new d(this, bitmap, matrix, arrayList, canvas));
        return arrayList;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        lw7 lw7Var = this.a;
        if (!lw7Var.b() || ((Bitmap) lw7Var.getValue()).isRecycled()) {
            return;
        }
        ((Bitmap) lw7Var.getValue()).recycle();
    }
}
