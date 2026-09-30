package defpackage;

import androidx.work.impl.WorkDatabase;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class xv3 implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ xv3(Object obj, Object obj2, Object obj3, int i) {
        this.a = i;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i = this.a;
        Object obj = this.d;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (i) {
            case 0:
                return ((yv3) obj3).a.submit(new ny2(13, (Callable) obj2, (mjg) obj));
            default:
                String str = (String) obj;
                WorkDatabase workDatabase = ((vva) obj3).e;
                pbg pbgVarY = workDatabase.y();
                pbgVarY.getClass();
                str.getClass();
                ((ArrayList) obj2).addAll((List) urg.I(pbgVarY.a, true, false, new alc(str, 29)));
                return workDatabase.x().d(str);
        }
    }
}
