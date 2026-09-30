package com.adjust.sdk.sig;

import android.content.Context;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public interface ISigner {
    void onResume();

    void sign(Context context, Map<String, String> map, String str, String str2);

    void sign(Context context, Map<String, String> map, Map<String, String> map2, Map<String, String> map3);
}
