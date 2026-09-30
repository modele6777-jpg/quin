package com.adjust.sdk.sig;

import android.content.Context;
import android.util.Log;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class NativeLibHelper {
    static {
        try {
            System.loadLibrary("signer");
        } catch (UnsatisfiedLinkError e) {
            Log.e("NativeLibHelper", "Signer Library could not be loaded: " + e.getMessage());
        }
    }

    private final native void nOnResume();

    private final native byte[] nSign(Context context, Object obj, byte[] bArr, int i);

    public final byte[] a(Context context, LinkedHashMap linkedHashMap, byte[] bArr, int i) {
        return nSign(context, linkedHashMap, bArr, i);
    }

    public final void a() {
        nOnResume();
    }
}
