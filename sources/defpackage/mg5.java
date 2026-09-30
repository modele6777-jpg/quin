package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public class mg5 extends jg5 {
    private final int httpStatusCode;

    public mg5(int i, int i2, String str) {
        super(str, ig5.CONFIG_UPDATE_STREAM_ERROR);
        this.httpStatusCode = i;
    }

    public final int a() {
        return this.httpStatusCode;
    }

    public mg5(int i, String str, mg5 mg5Var) {
        super(mg5Var, str);
        this.httpStatusCode = i;
    }

    public mg5(String str, ig5 ig5Var) {
        super(str, ig5Var);
        this.httpStatusCode = -1;
    }

    public mg5(int i, String str) {
        super(str);
        this.httpStatusCode = i;
    }
}
