package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public class jg5 extends hf5 {
    private final ig5 code;

    public jg5(Throwable th) {
        super("Unable to parse config update message.", th);
        this.code = ig5.CONFIG_UPDATE_MESSAGE_INVALID;
    }

    public jg5(Exception exc, String str) {
        super(str, exc);
        this.code = ig5.UNKNOWN;
    }

    public jg5(String str, ig5 ig5Var) {
        super(str);
        this.code = ig5Var;
    }

    public jg5(String str) {
        super(str);
        this.code = ig5.UNKNOWN;
    }
}
