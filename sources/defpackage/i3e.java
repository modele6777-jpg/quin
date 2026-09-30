package defpackage;

import java.io.IOException;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001R\u0014\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Li3e;", "Ljava/io/IOException;", "Lay4;", "errorCode", "Lay4;", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = z7c.f)
public final class i3e extends IOException {
    public final ay4 errorCode;

    public i3e(ay4 ay4Var) {
        super("stream was reset: " + ay4Var);
        this.errorCode = ay4Var;
    }
}
