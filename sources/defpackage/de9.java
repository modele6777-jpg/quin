package defpackage;

import android.net.ConnectivityManager;
import android.net.NetworkRequest;
import android.os.Build;
import android.util.Log;
import java.util.LinkedHashMap;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class de9 extends gbe implements l26 {
    final /* synthetic */ jl2 $constraints;
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ ee9 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public de9(jl2 jl2Var, ee9 ee9Var, xn2 xn2Var) {
        super(2, xn2Var);
        this.$constraints = jl2Var;
        this.this$0 = ee9Var;
    }

    @Override // defpackage.pt0
    public final xn2 k(xn2 xn2Var, Object obj) {
        de9 de9Var = new de9(this.$constraints, this.this$0, xn2Var);
        de9Var.L$0 = obj;
        return de9Var;
    }

    @Override // defpackage.pt0
    public final Object r(Object obj) throws Exception {
        x16 n25Var;
        bw2 bw2Var = bw2.a;
        int i = this.label;
        if (i == 0) {
            jzb.q(obj);
            awa awaVar = (awa) this.L$0;
            NetworkRequest networkRequestA = this.$constraints.a();
            if (networkRequestA == null) {
                qe9 qe9Var = this.$constraints.a;
                if (qe9Var == qe9.a) {
                    networkRequestA = null;
                } else {
                    NetworkRequest.Builder builderRemoveCapability = new NetworkRequest.Builder().addCapability(12).addCapability(16).removeCapability(15).removeCapability(13);
                    if (Build.VERSION.SDK_INT < 30 || qe9Var != qe9.f) {
                        int iOrdinal = qe9Var.ordinal();
                        if (iOrdinal == 2) {
                            builderRemoveCapability = builderRemoveCapability.addCapability(11);
                        } else if (iOrdinal == 3) {
                            builderRemoveCapability = builderRemoveCapability.addCapability(18);
                        } else if (iOrdinal == 4) {
                            builderRemoveCapability = builderRemoveCapability.addTransportType(0);
                        }
                        networkRequestA = builderRemoveCapability.build();
                    } else {
                        networkRequestA = builderRemoveCapability.addCapability(25).build();
                    }
                }
            }
            if (networkRequestA == null) {
                zva zvaVar = (zva) awaVar;
                zvaVar.getClass();
                zvaVar.c(null);
                return wef.a;
            }
            int i2 = 7;
            kz8 kz8Var = new kz8(7, ynb.V(awaVar, null, null, new ce9(this.this$0, awaVar, null), 3), awaVar);
            if (Build.VERSION.SDK_INT >= 30) {
                tcd tcdVar = tcd.a;
                ConnectivityManager connectivityManager = this.this$0.a;
                tcdVar.getClass();
                synchronized (tcd.b) {
                    try {
                        LinkedHashMap linkedHashMap = tcd.c;
                        boolean zIsEmpty = linkedHashMap.isEmpty();
                        linkedHashMap.put(kz8Var, networkRequestA);
                        if (zIsEmpty) {
                            ff8.h().e(kag.a, "NetworkRequestConstraintController register shared callback");
                            connectivityManager.registerDefaultNetworkCallback(tcdVar);
                        } else if (tcd.e && tcd.f != null) {
                            ff8.h().e(kag.a, "NetworkRequestConstraintController send initial capabilities");
                            kz8Var.d(tcd.a(networkRequestA, tcd.d) ? ol2.a : new pl2(7));
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                n25Var = new ykc(8, kz8Var, connectivityManager);
            } else {
                int i3 = k27.c;
                ConnectivityManager connectivityManager2 = this.this$0.a;
                k27 k27Var = new k27(kz8Var);
                imb imbVar = new imb();
                try {
                    ff8.h().e(kag.a, "NetworkRequestConstraintController register callback");
                    connectivityManager2.registerNetworkCallback(networkRequestA, k27Var);
                    imbVar.element = true;
                } catch (RuntimeException e) {
                    if (!c5e.u(e.getClass().getName(), "TooManyRequestsException", false)) {
                        throw e;
                    }
                    ff8 ff8VarH = ff8.h();
                    String str = kag.a;
                    if (ff8VarH.b <= 3) {
                        Log.d(str, "NetworkRequestConstraintController couldn't register callback", e);
                    }
                    kz8Var.d(new pl2(7));
                }
                n25Var = new n25(imbVar, connectivityManager2, k27Var, i2);
            }
            fn6 fn6Var = new fn6(17, n25Var);
            this.label = 1;
            if (i7h.k(awaVar, fn6Var, this) == bw2Var) {
                return bw2Var;
            }
        } else {
            if (i != 1) {
                qc0.p("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            jzb.q(obj);
        }
        return wef.a;
    }

    @Override // defpackage.l26
    public final Object z(Object obj, Object obj2) {
        return ((de9) k((xn2) obj2, (awa) obj)).r(wef.a);
    }
}
