package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class lag {
    public static final String i = ff8.n("WorkContinuationImpl");
    public final yag a;
    public final String b;
    public final d45 c;
    public final List d;
    public final ArrayList e;
    public final ArrayList f = new ArrayList();
    public boolean g;
    public hj6 h;

    public lag(yag yagVar, String str, d45 d45Var, List list, int i2) {
        this.a = yagVar;
        this.b = str;
        this.c = d45Var;
        this.d = list;
        this.e = new ArrayList(list.size());
        for (int i3 = 0; i3 < list.size(); i3++) {
            if (d45Var == d45.a && ((cq9) list.get(i3)).b.u != Long.MAX_VALUE) {
                qc0.j("Next Schedule Time Override must be used with ExistingPeriodicWorkPolicyUPDATE (preferably) or KEEP");
                throw null;
            }
            String string = ((cq9) list.get(i3)).a.toString();
            string.getClass();
            this.e.add(string);
            this.f.add(string);
        }
    }

    public static HashSet b(lag lagVar) {
        HashSet hashSet = new HashSet();
        lagVar.getClass();
        return hashSet;
    }

    public final hj6 a() {
        if (this.g) {
            ff8.h().o(i, "Already enqueued work ids (" + TextUtils.join(", ", this.e) + ")");
        } else {
            yag yagVar = this.a;
            this.h = i7h.A(yagVar.b.f, "EnqueueRunnable_" + this.c.name(), yagVar.d.a, new h2e(23, this));
        }
        return this.h;
    }
}
