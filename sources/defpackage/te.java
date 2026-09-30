package defpackage;

import android.app.Activity;
import android.content.Context;
import kotlin.Metadata;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
@ec9("activity")
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0017\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lte;", "Lfc9;", "Lse;", "navigation-runtime_release"}, k = 1, mv = {2, 0, 0}, xi = z7c.f)
public class te extends fc9 {
    public final Activity c;

    public te(Context context) {
        context.getClass();
        for (Object obj : fyc.u(new z4(10), context)) {
            if (((Context) obj) instanceof Activity) {
                this.c = (Activity) obj;
            }
        }
        obj = null;
        this.c = (Activity) obj;
    }

    @Override // defpackage.fc9
    public final ua9 a() {
        return new se(this);
    }

    @Override // defpackage.fc9
    public final ua9 c(ua9 ua9Var) {
        throw new IllegalStateException(tec.g(((se) ua9Var).b.b, " does not have an Intent set.", new StringBuilder("Destination ")).toString());
    }

    @Override // defpackage.fc9
    public final boolean f() {
        Activity activity = this.c;
        if (activity == null) {
            return false;
        }
        activity.finish();
        return true;
    }
}
