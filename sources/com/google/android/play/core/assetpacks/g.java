package com.google.android.play.core.assetpacks;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
final class g extends RuntimeException {
    final int a;

    public g(String str) {
        super(str);
        this.a = -1;
    }

    public g(String str, int i) {
        super(str);
        this.a = i;
    }

    public g(Exception exc, String str) {
        super(str, exc);
        this.a = -1;
    }

    public g(String str, Exception exc, int i) {
        super(str, exc);
        this.a = i;
    }
}
