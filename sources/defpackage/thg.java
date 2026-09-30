package defpackage;

import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.Collections;
import java.util.Set;
import java.util.WeakHashMap;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class thg {
    public static final Set b = Collections.newSetFromMap(new WeakHashMap());
    public final zb6 a;

    public thg(zb6 zb6Var) {
        this.a = zb6Var;
    }

    public final kjg a(kjg kjgVar) {
        boolean z = true;
        if (!kjgVar.i && !((Boolean) BasePendingResult.j.get()).booleanValue()) {
            z = false;
        }
        kjgVar.i = z;
        zb6 zb6Var = this.a;
        ec6 ec6Var = zb6Var.k;
        ec6Var.getClass();
        yhg yhgVar = new yhg(new eig(kjgVar), ec6Var.w.get(), zb6Var);
        sig sigVar = ec6Var.X;
        sigVar.sendMessage(sigVar.obtainMessage(4, yhgVar));
        return kjgVar;
    }
}
