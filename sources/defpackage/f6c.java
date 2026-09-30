package defpackage;

import android.os.Looper;
import java.util.Set;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class f6c extends fb7 {
    public final /* synthetic */ i6c b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f6c(String[] strArr, i6c i6cVar) {
        super(strArr);
        this.b = i6cVar;
    }

    @Override // defpackage.fb7
    public final void a(Set set) {
        set.getClass();
        nc0 nc0VarO = nc0.o();
        m45 m45Var = new m45(20, this.b);
        nc0VarO.getClass();
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            m45Var.run();
        } else {
            nc0VarO.p(m45Var);
        }
    }
}
