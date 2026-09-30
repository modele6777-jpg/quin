package defpackage;

import android.content.Context;
import java.lang.ref.WeakReference;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class rv4 extends gbe implements l26 {
    final /* synthetic */ gr8 $cacheKey;
    final /* synthetic */ h87 $chain;
    final /* synthetic */ uz4 $eventListener;
    final /* synthetic */ Object $mappedData;
    final /* synthetic */ as9 $options;
    final /* synthetic */ sw6 $request;
    int label;
    final /* synthetic */ sv4 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rv4(sv4 sv4Var, sw6 sw6Var, Object obj, as9 as9Var, uz4 uz4Var, gr8 gr8Var, h87 h87Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.this$0 = sv4Var;
        this.$request = sw6Var;
        this.$mappedData = obj;
        this.$options = as9Var;
        this.$eventListener = uz4Var;
        this.$cacheKey = gr8Var;
        this.$chain = h87Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        return new rv4(this.this$0, this.$request, this.$mappedData, this.$options, this.$eventListener, this.$cacheKey, this.$chain, xn2Var);
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) throws Throwable {
        Object objB;
        boolean z;
        qib qibVarC;
        bw2 bw2Var = bw2.a;
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            sv4 sv4Var = this.this$0;
            sw6 sw6Var = this.$request;
            Object obj2 = this.$mappedData;
            as9 as9Var = this.$options;
            uz4 uz4Var = this.$eventListener;
            this.label = 1;
            objB = sv4Var.b(sw6Var, obj2, as9Var, uz4Var, this);
            if (objB == bw2Var) {
                return bw2Var;
            }
        } else {
            if (i != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(obj);
            objB = obj;
        }
        lv4 lv4Var = (lv4) objB;
        kv kvVar = this.this$0.b;
        synchronized (kvVar) {
            try {
                mib mibVar = (mib) ((WeakReference) kvVar.b).get();
                if (mibVar == null) {
                    kvVar.g();
                } else if (((Context) kvVar.e) == null) {
                    Context context = mibVar.a.a;
                    kvVar.e = context;
                    context.registerComponentCallbacks((gs) kvVar.d);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        kd9 kd9Var = this.this$0.d;
        gr8 gr8Var = this.$cacheKey;
        sw6 sw6Var2 = this.$request;
        if (gr8Var == null || !sw6Var2.i.b() || !lv4Var.a.b() || (qibVarC = ((mib) kd9Var.b).c()) == null) {
            z = false;
        } else {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            linkedHashMap.put("coil#is_sampled", Boolean.valueOf(lv4Var.b));
            String str = lv4Var.d;
            if (str != null) {
                linkedHashMap.put("coil#disk_cache_key", str);
            }
            bv6 bv6Var = lv4Var.a;
            Map mapU = vpf.U(linkedHashMap);
            synchronized (qibVarC.c) {
                long jA = bv6Var.a();
                if (jA < 0) {
                    throw new IllegalStateException(("Image size must be non-negative: " + jA).toString());
                }
                qibVarC.a.h(gr8Var, bv6Var, mapU, jA);
            }
            z = true;
        }
        bv6 bv6Var2 = lv4Var.a;
        sw6 sw6Var3 = this.$request;
        zb3 zb3Var = lv4Var.c;
        gr8 gr8Var2 = z ? this.$cacheKey : null;
        String str2 = lv4Var.d;
        boolean z2 = lv4Var.b;
        h87 h87Var = this.$chain;
        return new k8e(bv6Var2, sw6Var3, zb3Var, gr8Var2, str2, z2, (h87Var instanceof pib) && ((pib) h87Var).g);
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((rv4) k((xn2) obj2, (aw2) obj)).r(wef.a);
    }
}
