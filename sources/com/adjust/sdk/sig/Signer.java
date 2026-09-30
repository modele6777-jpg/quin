package com.adjust.sdk.sig;

import android.content.Context;
import android.util.Log;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class Signer implements ISigner {
    public static final t2 Companion = new t2();
    public static final String EXCEPTION_MSG_SDK4 = "This version of Adjust Signature is not compatible with Adjust SDK v4. Please upgrade to SDK v5.";
    public static boolean c;
    public final NativeLibHelper a = new NativeLibHelper();
    public final t1 b = new t1();

    @Override // com.adjust.sdk.sig.ISigner
    public synchronized void onResume() {
        try {
            if (c) {
                throw new IllegalStateException("sign: Library received error, it has locked down");
            }
            this.a.a();
        } catch (IllegalStateException e) {
            String message = e.getMessage();
            if (message == null) {
                message = "sign: Incorrect library state";
            }
            Log.e("Signer", message);
        } catch (Exception e2) {
            Log.e("Signer", "sign: Unhandled exception: " + e2.getMessage());
        }
    }

    @Override // com.adjust.sdk.sig.ISigner
    public synchronized void sign(Context context, Map<String, String> map, Map<String, String> map2, Map<String, String> map3) {
        try {
            try {
                try {
                    try {
                        if (c) {
                            throw new IllegalStateException("sign: Library received error, it has locked down");
                        }
                        if (context == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        t1 t1Var = this.b;
                        NativeLibHelper nativeLibHelper = this.a;
                        if (map == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        if (map2 == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        if (map3 == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        new u2(context, t1Var, nativeLibHelper, map, map2, k3.a(map3)).a();
                    } catch (IllegalArgumentException e) {
                        String message = e.getMessage();
                        if (message == null) {
                            message = "sign: Required parameter is null";
                        }
                        Log.e("Signer", message);
                    }
                } catch (IllegalStateException e2) {
                    String message2 = e2.getMessage();
                    if (message2 == null) {
                        message2 = "sign: Incorrect library state";
                    }
                    Log.e("Signer", message2);
                }
            } catch (b2 e3) {
                c = true;
                String message3 = e3.getMessage();
                if (message3 == null) {
                    message3 = "sign: Library received error, it has locked down";
                }
                Log.e("Signer", message3);
            }
        } catch (Exception e4) {
            Log.e("Signer", "sign: Unhandled exception: " + e4.getMessage());
        }
    }

    @Override // com.adjust.sdk.sig.ISigner
    public void sign(Context context, Map<String, String> map, String str, String str2) {
        Log.e("Signer", EXCEPTION_MSG_SDK4);
        throw new UnsupportedOperationException(EXCEPTION_MSG_SDK4);
    }
}
