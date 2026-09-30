package ai.askquin.login;

import ai.askquin.google.GoogleLoginInitializer;
import android.content.Context;
import defpackage.bm8;
import defpackage.c37;
import defpackage.if8;
import defpackage.iy9;
import defpackage.wef;
import defpackage.y41;
import defpackage.z7c;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lai/askquin/login/ThirdPartyLoginEntriesInitializer;", "Lc37;", "Lwef;", "<init>", "()V", "Quin:Quin-5.23.0.291-260918_gpRelease"}, k = 1, mv = {2, 4, 0}, xi = z7c.f)
public final class ThirdPartyLoginEntriesInitializer implements c37 {
    @Override // defpackage.c37
    public final List a() {
        return new ArrayList();
    }

    @Override // defpackage.c37
    public final Object b(Context context) {
        context.getClass();
        y41.p = bm8.G(new iy9(if8.a, GoogleLoginInitializer.class));
        return wef.a;
    }
}
