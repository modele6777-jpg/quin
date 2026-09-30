package defpackage;

import android.net.Uri;
import java.io.IOException;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.logging.Level;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class y3h implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public y3h(ich ichVar, ndh ndhVar) {
        this.a = 2;
        this.c = ndhVar;
        Objects.requireNonNull(ichVar);
        this.b = ichVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        int i = this.a;
        Object obj = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                ich ichVar = ((e5h) obj).d;
                ichVar.U();
                krg krgVar = ichVar.c;
                ich.S(krgVar);
                return krgVar.x1((String) obj2);
            case 1:
                ich ichVar2 = ((e5h) obj).d;
                ichVar2.U();
                return new wqg(ichVar2.q0(((ndh) obj2).a));
            case 2:
                ndh ndhVar = (ndh) obj2;
                String str = ndhVar.a;
                oa7.A(str);
                ich ichVar3 = (ich) obj;
                q5h q5hVarA = ichVar3.a(str);
                o5h o5hVar = o5h.ANALYTICS_STORAGE;
                if (q5hVarA.i(o5hVar) && q5h.c(100, ndhVar.H0).i(o5hVar)) {
                    return ichVar3.d0(ndhVar).F();
                }
                ichVar3.v().Z.a("Analytics storage consent denied. Returning null app instance id");
                return null;
            default:
                gdh gdhVar = (gdh) obj2;
                idh idhVar = (idh) obj;
                f8h f8hVar = gdhVar.a;
                m7h m7hVar = new m7h();
                try {
                    xdh xdhVar = (xdh) f8hVar.f.get();
                    Uri uri = gdhVar.b;
                    gsg gsgVar = new gsg(idhVar);
                    gsgVar.b = new m7h[]{m7hVar};
                    break;
                } catch (IOException | RuntimeException e) {
                    sfc.n(Level.WARNING, f8hVar.a(), e, "Failed to update snapshot for %s flags may be stale.", gdhVar.c);
                }
                return null;
        }
    }

    public /* synthetic */ y3h(gdh gdhVar, idh idhVar) {
        this.a = 3;
        this.c = gdhVar;
        this.b = idhVar;
    }

    public /* synthetic */ y3h(e5h e5hVar, Object obj, int i) {
        this.a = i;
        this.c = obj;
        this.b = e5hVar;
    }
}
