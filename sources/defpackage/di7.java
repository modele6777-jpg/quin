package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public abstract class di7 extends Exception {
    private String jsonPath;

    public di7(String str, String str2) {
        super(str);
        this.jsonPath = str2;
    }

    public di7(RuntimeException runtimeException, String str) {
        super(runtimeException);
        this.jsonPath = str;
    }
}
