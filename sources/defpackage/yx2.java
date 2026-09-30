package defpackage;

import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0016\u0018\u00002\u00020\u0001R\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lyx2;", "Lqx2;", "", "type", "Ljava/lang/String;", "getType", "()Ljava/lang/String;", "credentials"}, k = 1, mv = {2, 1, 0}, xi = z7c.f)
public abstract class yx2 extends qx2 {
    private final String type;

    public yx2(CharSequence charSequence, String str) {
        super(charSequence, str);
        this.type = str;
        if (str.length() > 0) {
            return;
        }
        qc0.j("type must not be empty");
        throw null;
    }
}
