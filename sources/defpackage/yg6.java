package defpackage;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.Process;
import android.text.TextUtils;
import com.adjust.sdk.AdjustFactory;
import com.adjust.sdk.Reflection;
import java.util.concurrent.Callable;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class yg6 implements Callable {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public yg6(e5h e5hVar, hsg hsgVar, String str) {
        this.a = 6;
        this.b = e5hVar;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:101:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:97:0x01bb A[Catch: Exception -> 0x0147, TryCatch #5 {Exception -> 0x0147, blocks: (B:69:0x0133, B:71:0x0140, B:76:0x0153, B:79:0x0163, B:83:0x0169, B:85:0x016d, B:87:0x0178, B:89:0x0185, B:93:0x0196, B:94:0x01af, B:91:0x018d, B:95:0x01b2, B:97:0x01bb, B:98:0x01c4, B:77:0x015f, B:74:0x014b), top: B:140:0x0133 }] */
    @Override // java.util.concurrent.Callable
    public final Object call() {
        Bundle bundle;
        crg crgVar;
        z5h z5hVar;
        boolean z = true;
        switch (this.a) {
            case 0:
                ((Runnable) this.b).run();
                return null;
            case 1:
                eh0 eh0Var = (eh0) this.b;
                eh0Var.d.set(true);
                try {
                    Process.setThreadPriority(10);
                    eh0Var.e.b();
                    Binder.flushPendingCommands();
                    eh0Var.a(null);
                    return null;
                } catch (Throwable th) {
                    try {
                        eh0Var.c.set(true);
                        throw th;
                    } catch (Throwable th2) {
                        eh0Var.a(null);
                        throw th2;
                    }
                }
            case 2:
                try {
                    return ((Callable) this.b).call();
                } catch (Throwable th3) {
                    AdjustFactory.getLogger().error("Callable error [%s] of type [%s]", th3.getMessage(), th3.getClass().getCanonicalName());
                    return null;
                }
            case 3:
                try {
                    return Reflection.getAdvertisingInfoObject((Context) this.b);
                } catch (Exception unused) {
                    return null;
                }
            case 4:
                ysg ysgVar = (ysg) this.b;
                ox0 ox0Var = ysgVar.d;
                synchronized (ox0Var.a) {
                    try {
                        if (ox0Var.b != 3) {
                            int i = 0;
                            boolean z2 = ox0Var.b == 1;
                            if (TextUtils.isEmpty(null)) {
                                bundle = null;
                            } else {
                                bundle = new Bundle();
                                bundle.putString("accountName", null);
                                zsg.b(bundle, ox0Var.d, ox0Var.B.longValue());
                            }
                            z5h z5hVar2 = z5h.REASON_UNSPECIFIED;
                            synchronized (ox0Var.a) {
                                crgVar = ox0Var.i;
                                break;
                            }
                            ox0 ox0Var2 = ysgVar.d;
                            if (crgVar == null) {
                                ox0Var2.x(0);
                                z5h z5hVar3 = z5h.SERVICE_RESET_TO_NULL;
                                tx0 tx0Var = swg.h;
                                ox0Var2.w(tx0Var, z5hVar3);
                                ysgVar.d(tx0Var);
                            } else {
                                String packageName = ox0Var2.g.getPackageName();
                                try {
                                    xqg xqgVar = (xqg) crgVar;
                                    if (xqgVar.O(25, packageName, "inapp") == 0) {
                                        ox0 ox0Var3 = ysgVar.d;
                                        synchronized (rxg.class) {
                                        }
                                        synchronized (rxg.class) {
                                        }
                                        synchronized (rxg.class) {
                                        }
                                        synchronized (rxg.class) {
                                        }
                                        long jMin = 100;
                                        Exception e = null;
                                        while (true) {
                                            long j = i;
                                            if (j <= 3) {
                                                try {
                                                    Boolean boolValueOf = Boolean.valueOf(z2);
                                                    Bundle bundle2 = new Bundle();
                                                    bundle2.putString("callingPackage", ox0Var3.g.getPackageName());
                                                    zsg.b(bundle2, ox0Var3.d, ox0Var3.B.longValue());
                                                    if (ox0Var3.y != null) {
                                                        bundle2.putBoolean("enablePendingPurchases", true);
                                                    }
                                                    if (ox0Var3.y != null) {
                                                        bundle2.putBoolean("enablePendingPurchaseForSubscriptions", true);
                                                    }
                                                    xqgVar.V(ox0Var3.g.getPackageName(), bundle2, new wtg(ox0Var3, ysgVar, boolValueOf, i));
                                                } catch (SecurityException e2) {
                                                    ysgVar.e(e2, z2, i);
                                                } catch (Exception e3) {
                                                    e = e3;
                                                    if (j != 3) {
                                                        zsg.i("BillingClient", kv2.m("Transient error during initialize(), retrying in ", "ms", jMin), e);
                                                        try {
                                                            Thread.sleep(jMin);
                                                            jMin = (long) Math.min(jMin * 2.0d, 60000.0d);
                                                            i++;
                                                        } catch (InterruptedException e4) {
                                                            Thread.currentThread().interrupt();
                                                            ysgVar.e(e4, z2, i);
                                                        }
                                                    } else {
                                                        ysgVar.e(e, z2, i);
                                                    }
                                                }
                                            }
                                        }
                                        ysgVar.e(e, z2, i);
                                    } else {
                                        int iO = 3;
                                        int i2 = 29;
                                        while (true) {
                                            if (i2 >= 3) {
                                                try {
                                                    zsg.g("BillingClient", tec.e(i2, "trying subs apiVersion: "));
                                                    iO = bundle == null ? xqgVar.O(i2, packageName, "subs") : xqgVar.P(i2, packageName, "subs", bundle);
                                                    if (iO == 0) {
                                                        zsg.g("BillingClient", tec.e(i2, "highestLevelSupportedForSubs: "));
                                                    } else {
                                                        i2--;
                                                    }
                                                } catch (Exception e5) {
                                                    ysgVar.f(e5, z2);
                                                }
                                            } else {
                                                i2 = 0;
                                            }
                                        }
                                        ox0 ox0Var4 = ysgVar.d;
                                        if (i2 < 3) {
                                            z = false;
                                        }
                                        ox0Var4.k = z;
                                        if (i2 < 3) {
                                            z5hVar2 = z5h.SUBSCRIPTIONS_NOT_SUPPORTED;
                                            zsg.g("BillingClient", "In-app billing API does not support subscription on this device.");
                                        }
                                        for (int i3 = 29; i3 >= 3; i3--) {
                                            zsg.g("BillingClient", tec.e(i3, "trying inapp apiVersion: "));
                                            iO = bundle == null ? xqgVar.O(i3, packageName, "inapp") : xqgVar.P(i3, packageName, "inapp", bundle);
                                            if (iO == 0) {
                                                ox0Var4.l = i3;
                                                zsg.g("BillingClient", "mHighestLevelSupportedForInApp: " + i3);
                                                ox0.m(ox0Var4, ox0Var4.l);
                                                if (ox0Var4.l < 3) {
                                                    z5hVar2 = z5h.ONE_TIME_PRODUCT_NOT_SUPPORTED;
                                                    zsg.h("BillingClient", "In-app billing API version 3 is not supported on this device.");
                                                }
                                                z5hVar = z5hVar2;
                                                ox0.n(ox0Var4, iO);
                                                if (iO == 0) {
                                                    ysgVar.c(0, z2);
                                                    ysgVar.d(swg.g);
                                                } else {
                                                    tx0 tx0Var2 = swg.a;
                                                    ysgVar.b(tx0Var2, z5hVar, null, z2, 0);
                                                    ysgVar.d(tx0Var2);
                                                }
                                            }
                                        }
                                        ox0.m(ox0Var4, ox0Var4.l);
                                        if (ox0Var4.l < 3) {
                                            z5hVar2 = z5h.ONE_TIME_PRODUCT_NOT_SUPPORTED;
                                            zsg.h("BillingClient", "In-app billing API version 3 is not supported on this device.");
                                        }
                                        z5hVar = z5hVar2;
                                        ox0.n(ox0Var4, iO);
                                        if (iO == 0) {
                                            ysgVar.c(0, z2);
                                            ysgVar.d(swg.g);
                                        } else {
                                            tx0 tx0Var3 = swg.a;
                                            ysgVar.b(tx0Var3, z5hVar, null, z2, 0);
                                            ysgVar.d(tx0Var3);
                                        }
                                    }
                                } catch (Exception e6) {
                                    ysgVar.f(e6, z2);
                                }
                            }
                        }
                    } catch (Throwable th4) {
                        throw th4;
                    }
                }
                return null;
            case 5:
                return new l6h(((y2h) this.b).X);
            default:
                ich ichVar = ((e5h) this.b).d;
                ichVar.U();
                g1h g1hVar = ichVar.v;
                ich.S(g1hVar);
                g1hVar.A0();
                throw new IllegalStateException("Unexpected call on client side");
        }
    }

    public /* synthetic */ yg6(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }
}
