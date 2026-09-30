package defpackage;

import android.content.Context;
import com.google.android.gms.tasks.Tasks;
import java.util.Set;
import java.util.concurrent.Executor;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class zq3 implements ij6, kj6 {
    public final mw7 a;
    public final Context b;
    public final i1b c;
    public final Set d;
    public final Executor e;

    public zq3(Context context, String str, Set set, i1b i1bVar, Executor executor) {
        this.a = new mw7(new gc2(1, context, str));
        this.d = set;
        this.e = executor;
        this.c = i1bVar;
        this.b = context;
    }

    public final gfh a() {
        if (!drb.h(this.b)) {
            return Tasks.d("");
        }
        return Tasks.b(this.e, new yq3(this, 0));
    }

    public final void b() {
        if (this.d.size() <= 0) {
            Tasks.d(null);
        } else if (!drb.h(this.b)) {
            Tasks.d(null);
        } else {
            Tasks.b(this.e, new yq3(this, 1));
        }
    }
}
