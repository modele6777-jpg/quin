package com.google.android.filament.android;

import android.graphics.Bitmap;
import com.google.android.filament.Engine;
import com.google.android.filament.Texture;
import defpackage.ave;
import defpackage.qc0;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public abstract class TextureHelper {
    public static void a(Engine engine, Texture texture, Bitmap bitmap) {
        int i;
        int iL = texture.l();
        int iK = texture.k();
        int i2 = ave.a[bitmap.getConfig().ordinal()];
        int i3 = 1;
        if (i2 != 1) {
            if (i2 != 2) {
                i3 = 3;
                if (i2 == 3) {
                    i = 2;
                } else if (i2 == 5) {
                    i3 = 4;
                } else if (i2 == 6) {
                    i = 5;
                }
            }
            if (i != 2 || i == 5) {
                qc0.j("Unsupported config: ARGB_4444 or HARDWARE");
            } else {
                nSetBitmap(texture.getNativeObject(), engine.getNativeObject(), 0, 0, 0, iL, iK, bitmap, i);
                return;
            }
        }
        i3 = 0;
        i = i3;
        if (i != 2) {
        }
        qc0.j("Unsupported config: ARGB_4444 or HARDWARE");
    }

    private static native void nSetBitmap(long j, long j2, int i, int i2, int i3, int i4, int i5, Bitmap bitmap, int i6);
}
