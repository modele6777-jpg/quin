package defpackage;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public class qs6 extends RuntimeException {
    public final transient qyb a;
    private final int code;
    private final String message;

    public qs6(qyb qybVar) {
        StringBuilder sb = new StringBuilder("HTTP ");
        ryb rybVar = qybVar.a;
        int i = rybVar.d;
        sb.append(i);
        sb.append(" ");
        String str = rybVar.c;
        sb.append(str);
        super(sb.toString());
        this.code = i;
        this.message = str;
        this.a = qybVar;
    }

    public final int a() {
        return this.code;
    }
}
