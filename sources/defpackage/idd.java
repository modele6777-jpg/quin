package defpackage;

import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class idd extends gbe implements l26 {
    /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ldd this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public idd(ldd lddVar, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = lddVar;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        idd iddVar = new idd(this.this$0, xn2Var);
        iddVar.L$0 = obj;
        return iddVar;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) {
        boolean z;
        if (this.label != 0) {
            qc0.p("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        jzb.q(obj);
        j0d j0dVar = (j0d) this.L$0;
        boolean zD = this.this$0.d(j0dVar);
        Map mapB = j0dVar.c;
        ldd lddVar = this.this$0;
        lddVar.getClass();
        if (mapB != null) {
            iva ivaVar = lddVar.f;
            ivaVar.getClass();
            z = false;
            if (!ivaVar.f) {
                ArrayList<jva> arrayListH = q6.h(ivaVar.a);
                ArrayList arrayList = new ArrayList();
                for (jva jvaVar : arrayListH) {
                    gva gvaVar = (gva) mapB.get(jvaVar.a);
                    iy9 iy9Var = gvaVar != null ? new iy9(jvaVar, gvaVar) : null;
                    if (iy9Var != null) {
                        arrayList.add(iy9Var);
                    }
                }
                if (arrayList.isEmpty()) {
                    z = true;
                    break;
                }
                Iterator it = arrayList.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        z = true;
                        break;
                    }
                    iy9 iy9Var2 = (iy9) it.next();
                    jva jvaVar2 = (jva) iy9Var2.a();
                    gva gvaVar2 = (gva) iy9Var2.b();
                    boolean zT = pa7.t(ivaVar.a(), jvaVar2.a);
                    int i = jvaVar2.b;
                    if (zT) {
                        if (i == gvaVar2.a && pa7.t((String) ivaVar.d.getValue(), gvaVar2.b)) {
                            break;
                        }
                    } else {
                        if (i == gvaVar2.a) {
                            break;
                        }
                    }
                }
            }
            if (z) {
                Log.d("FirebaseSessions", "Cold app start detected");
            }
        } else {
            Log.d("FirebaseSessions", "No process data map");
            z = true;
        }
        boolean zC = this.this$0.c(j0dVar);
        if (z) {
            mapB = this.this$0.f.b(qu4.a);
        } else if (zC) {
            mapB = this.this$0.f.b(mapB);
        }
        n0d n0dVar = z ? null : j0dVar.a;
        if (!zD && !z) {
            return zC ? j0d.a(j0dVar, null, null, this.this$0.f.b(mapB), 3) : j0dVar;
        }
        n0d n0dVarA = this.this$0.b.a(n0dVar);
        s0d s0dVar = this.this$0.c;
        ynb.V(jgb.k(s0dVar.e), null, null, new q0d(s0dVar, n0dVarA, null), 3);
        this.this$0.f.f = true;
        return new j0d(n0dVarA, null, mapB);
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((idd) k((xn2) obj2, (j0d) obj)).r(wef.a);
    }
}
