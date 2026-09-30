package okhttp3.internal.platform;

import android.content.Context;
import defpackage.c37;
import defpackage.hn2;
import defpackage.pu4;
import defpackage.sea;
import defpackage.z7c;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lokhttp3/internal/platform/PlatformInitializer;", "Lc37;", "Lsea;", "<init>", "()V", "okhttp"}, k = 1, mv = {2, 1, 0}, xi = z7c.f)
public final class PlatformInitializer implements c37 {
    @Override // defpackage.c37
    public final List a() {
        return pu4.a;
    }

    @Override // defpackage.c37
    public final Object b(Context context) {
        context.getClass();
        sea seaVar = sea.a;
        Object obj = sea.a;
        hn2 hn2Var = obj != null ? (hn2) obj : null;
        if (hn2Var != null) {
            hn2Var.a(context);
        }
        return sea.a;
    }
}
