package net.xmind.donut.gp.push;

import android.content.Context;
import defpackage.bm8;
import defpackage.c37;
import defpackage.iy9;
import defpackage.t2b;
import defpackage.u2b;
import defpackage.wef;
import defpackage.z7c;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lnet/xmind/donut/gp/push/PushServiceEntriesInitializer;", "Lc37;", "Lwef;", "<init>", "()V", "Quin:gp_release"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
public final class PushServiceEntriesInitializer implements c37 {
    @Override // defpackage.c37
    public final List a() {
        return new ArrayList();
    }

    @Override // defpackage.c37
    public final Object b(Context context) {
        context.getClass();
        Map map = t2b.a;
        t2b.a = bm8.G(new iy9(u2b.a, FirebasePushInitializer.class));
        return wef.a;
    }
}
