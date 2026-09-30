package defpackage;

import android.util.Log;
import android.view.Surface;
import io.sentry.android.core.b1;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class jkf extends gbe implements l26 {
    final /* synthetic */ List<lu3> $deferrableSurfaces;
    final /* synthetic */ yf1 $graph;
    final /* synthetic */ c0d $sessionConfigAdapter;
    final /* synthetic */ Map<lu3, e3e> $surfaceToStreamMap;
    final /* synthetic */ long $timeoutMillis;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ kkf this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public jkf(c0d c0dVar, kkf kkfVar, List list, long j, Map map, yf1 yf1Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.$sessionConfigAdapter = c0dVar;
        this.this$0 = kkfVar;
        this.$deferrableSurfaces = list;
        this.$timeoutMillis = j;
        this.$surfaceToStreamMap = map;
        this.$graph = yf1Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        jkf jkfVar = new jkf(this.$sessionConfigAdapter, this.this$0, this.$deferrableSurfaces, this.$timeoutMillis, this.$surfaceToStreamMap, this.$graph, xn2Var);
        jkfVar.L$0 = obj;
        return jkfVar;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) throws Exception {
        aw2 aw2Var;
        bw2 bw2Var = bw2.a;
        int i = this.label;
        try {
            if (i == 0) {
                jzb.q(obj);
                aw2 aw2Var2 = (aw2) this.L$0;
                if (!((yzc) this.$sessionConfigAdapter.e.getValue()).c()) {
                    qc0.p("Check failed.");
                    return null;
                }
                kkf kkfVar = this.this$0;
                List<lu3> list = this.$deferrableSurfaces;
                long j = this.$timeoutMillis;
                this.L$0 = aw2Var2;
                this.label = 1;
                Object objB = kkfVar.b(list, j, this);
                if (objB == bw2Var) {
                    return bw2Var;
                }
                aw2Var = aw2Var2;
                obj = objB;
            } else {
                if (i != 1) {
                    qc0.p("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                aw2Var = (aw2) this.L$0;
                jzb.q(obj);
            }
            List list2 = (List) obj;
            if (!jgb.Y(aw2Var) || list2.isEmpty()) {
                if (b21.F(4, "CXCP")) {
                    Log.i("CXCP", "Failed to get Surfaces: isActive=" + jgb.Y(aw2Var) + ", surfaces=" + list2);
                }
                return Boolean.FALSE;
            }
            this.this$0.getClass();
            if (list2.isEmpty() || list2.contains(null)) {
                if (b21.F(5, "CXCP")) {
                    b1.l("CXCP", "Surface setup failed: Some Surfaces are invalid");
                }
                this.$sessionConfigAdapter.a(this.$deferrableSurfaces.get(list2.indexOf(null)));
                return Boolean.FALSE;
            }
            kkf kkfVar2 = this.this$0;
            Object obj2 = kkfVar2.e;
            List<lu3> list3 = this.$deferrableSurfaces;
            synchronized (obj2) {
                try {
                    int iF = bm8.F(t72.u(list3, 10));
                    if (iF < 16) {
                        iF = 16;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(iF);
                    for (Object obj3 : list3) {
                        Object obj4 = list2.get(list3.indexOf((lu3) obj3));
                        if (obj4 == null) {
                            throw new IllegalStateException("Required value was null.");
                        }
                        linkedHashMap.put((Surface) obj4, obj3);
                    }
                    kkfVar2.h = linkedHashMap;
                    kkfVar2.d();
                } catch (Throwable th) {
                    throw th;
                }
            }
            Map<lu3, e3e> map = this.$surfaceToStreamMap;
            List<lu3> list4 = this.$deferrableSurfaces;
            yf1 yf1Var = this.$graph;
            kkf kkfVar3 = this.this$0;
            for (Map.Entry<lu3, e3e> entry : map.entrySet()) {
                int i2 = entry.getValue().a;
                Surface surface = (Surface) list2.get(list4.indexOf(entry.getKey()));
                if (b21.F(3, "CXCP")) {
                    Log.d("CXCP", "Configured " + surface + " for " + ((Object) e3e.a(i2)));
                }
                dg1 dg1Var = (dg1) yf1Var;
                dg1Var.l(i2, surface);
                kkfVar3.c.b(i2, entry.getKey(), dg1Var);
            }
            if (b21.F(4, "CXCP")) {
                Log.i("CXCP", "Surface setup complete");
            }
            return Boolean.TRUE;
        } catch (ju3 e) {
            if (b21.F(5, "CXCP")) {
                b1.n("CXCP", "Failed to get Surfaces: Surfaces closed", e);
            }
            c0d c0dVar = this.$sessionConfigAdapter;
            lu3 lu3VarA = e.a();
            lu3VarA.getClass();
            c0dVar.a(lu3VarA);
            return Boolean.FALSE;
        } catch (kye unused) {
            long j2 = this.$timeoutMillis;
            if (b21.F(5, "CXCP")) {
                b1.l("CXCP", "Failed to get Surfaces within " + j2 + " ms");
            }
            return Boolean.FALSE;
        }
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((jkf) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
