package io.sentry.android.core.internal.threaddump;

import android.graphics.Bitmap;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class b {
    public final int a;
    public int b;
    public final Object c;

    public b(Bitmap bitmap, int i, int i2) {
        bitmap.getClass();
        this.c = bitmap;
        this.a = i;
        this.b = i2;
    }

    public a a() {
        int i = this.b;
        if (i < 0 || i >= this.a) {
            return null;
        }
        ArrayList arrayList = (ArrayList) this.c;
        this.b = i + 1;
        return (a) arrayList.get(i);
    }

    public b(ArrayList arrayList) {
        this.c = arrayList;
        this.a = arrayList.size();
    }
}
