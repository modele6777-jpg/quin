package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import android.os.Bundle;
import java.util.ArrayList;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class q1h extends BroadcastReceiver {
    public final /* synthetic */ int a = 1;
    public boolean b;
    public boolean c;
    public final Object d;

    public q1h(fp3 fp3Var, boolean z) {
        this.d = fp3Var;
        this.c = z;
    }

    public synchronized void a(Context context, IntentFilter intentFilter) {
        try {
            if (this.b) {
                return;
            }
            if (Build.VERSION.SDK_INT >= 33) {
                context.registerReceiver(this, intentFilter, true != this.c ? 4 : 2);
            } else {
                context.registerReceiver(this, intentFilter);
            }
            this.b = true;
        } catch (Throwable th) {
            throw th;
        }
    }

    public void b() {
        ich ichVar = (ich) this.d;
        ichVar.m0();
        ichVar.Z().A0();
        ichVar.Z().A0();
        if (this.b) {
            ichVar.v().Z.a("Unregistering connectivity change receiver");
            this.b = false;
            this.c = false;
            try {
                ichVar.z.a.unregisterReceiver(this);
            } catch (IllegalArgumentException e) {
                ichVar.v().g.b(e, "Failed to unregister the network broadcast receiver");
            }
        }
    }

    public synchronized void c(Context context) {
        if (!this.b) {
            zsg.h("BillingBroadcastManager", "Receiver is not registered.");
        } else {
            context.unregisterReceiver(this);
            this.b = false;
        }
    }

    public void d(Bundle bundle, tx0 tx0Var, int i, j6h j6hVar, long j, boolean z) {
        try {
            byte[] byteArray = bundle.getByteArray("FAILURE_LOGGING_PAYLOAD");
            kwg kwgVar = (kwg) ((fp3) this.d).d;
            if (byteArray != null) {
                ((lqb) kwgVar).C(p5h.t(bundle.getByteArray("FAILURE_LOGGING_PAYLOAD")), j, z);
            } else {
                ((lqb) kwgVar).C(hwg.b(z5h.BILLING_RESULT_RECEIVED_FROM_PHONESKY, i, tx0Var, null, j6hVar), j, z);
            }
        } catch (Throwable unused) {
            zsg.h("BillingBroadcastManager", "Failed parsing Api failure.");
        }
    }

    /* JADX WARN: Code duplicated, block: B:20:0x0051  */
    /* JADX WARN: Code duplicated, block: B:81:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:86:0x0217 A[Catch: all -> 0x022b, TRY_ENTER, TryCatch #0 {all -> 0x022b, blocks: (B:82:0x01de, B:86:0x0217, B:87:0x0227), top: B:102:0x01de }] */
    /* JADX WARN: Code duplicated, block: B:92:0x0235  */
    @Override // android.content.BroadcastReceiver
    public final void onReceive(Context context, Intent intent) {
        j6h j6hVar;
        tx0 tx0VarE;
        kwg kwgVar;
        ArrayList arrayList;
        tx0 tx0Var;
        u6h u6hVar;
        int iIntValue;
        int i = this.a;
        Object obj = this.d;
        switch (i) {
            case 0:
                ich ichVar = (ich) obj;
                ichVar.m0();
                String action = intent.getAction();
                ichVar.v().Z.b(action, "NetworkBroadcastReceiver received action");
                if ("android.net.conn.CONNECTIVITY_CHANGE".equals(action)) {
                    g1h g1hVar = ichVar.b;
                    ich.S(g1hVar);
                    boolean zE0 = g1hVar.E0();
                    if (this.c != zE0) {
                        this.c = zE0;
                        ichVar.Z().J0(new jfg(this, zE0));
                    }
                } else {
                    ichVar.v().x.b(action, "NetworkBroadcastReceiver received unknown action");
                }
                break;
            default:
                fp3 fp3Var = (fp3) obj;
                kwg kwgVar2 = (kwg) fp3Var.d;
                bo1 bo1Var = (bo1) fp3Var.c;
                String action2 = intent.getAction();
                int iHashCode = action2.hashCode();
                j6h j6hVar2 = j6h.LOCAL_PURCHASES_UPDATED_ACTION;
                j6h j6hVar3 = j6h.PURCHASES_UPDATED_ACTION;
                j6h j6hVar4 = j6h.ALTERNATIVE_BILLING_ACTION;
                if (iHashCode != -1484087650) {
                    if (iHashCode != -337612916) {
                        if (iHashCode == 345207161 && action2.equals("com.android.vending.billing.ALTERNATIVE_BILLING")) {
                            j6hVar = j6hVar4;
                        } else {
                            j6hVar = j6h.BROADCAST_ACTION_UNSPECIFIED;
                        }
                    } else if (action2.equals("com.android.vending.billing.LOCAL_BROADCAST_PURCHASES_UPDATED")) {
                        j6hVar = j6hVar2;
                    } else {
                        j6hVar = j6h.BROADCAST_ACTION_UNSPECIFIED;
                    }
                } else if (action2.equals("com.android.vending.billing.PURCHASES_UPDATED")) {
                    j6hVar = j6hVar3;
                } else {
                    j6hVar = j6h.BROADCAST_ACTION_UNSPECIFIED;
                }
                int i2 = (j6hVar.equals(j6hVar2) || j6hVar.equals(j6hVar4)) ? 2 : j6hVar.equals(j6hVar3) ? 32 : 1;
                Bundle extras = intent.getExtras();
                if (extras != null) {
                    if (i2 == 2) {
                        int i3 = zsg.a;
                        i iVarA = tx0.a();
                        iVarA.a = zsg.a("BillingBroadcastManager", intent.getExtras());
                        Bundle extras2 = intent.getExtras();
                        if (extras2 == null) {
                            zsg.h("BillingBroadcastManager", "Unexpected null bundle received!");
                        } else {
                            Object obj2 = extras2.get("SUB_RESPONSE_CODE");
                            if (obj2 == null) {
                                zsg.g("BillingBroadcastManager", "getOnPurchasesUpdatedSubResponseCodeFromBundle() got null response code, assuming OK");
                            } else {
                                if (obj2 instanceof Integer) {
                                    iIntValue = ((Integer) obj2).intValue();
                                } else {
                                    zsg.h("BillingBroadcastManager", "Unexpected type for bundle sub response code: ".concat(obj2.getClass().getName()));
                                }
                                iVarA.b = iIntValue;
                                iVarA.c = zsg.f("BillingBroadcastManager", intent.getExtras());
                                tx0VarE = iVarA.a();
                            }
                        }
                        iIntValue = 0;
                        iVarA.b = iIntValue;
                        iVarA.c = zsg.f("BillingBroadcastManager", intent.getExtras());
                        tx0VarE = iVarA.a();
                    } else {
                        tx0VarE = zsg.e(intent, "BillingBroadcastManager");
                    }
                    long j = extras.getLong("billingClientTransactionId", 0L);
                    boolean z = extras.getBoolean("wasServiceAutoReconnected", false);
                    if (j6hVar.equals(j6hVar3) || j6hVar.equals(j6hVar2)) {
                        int i4 = i2;
                        utg utgVar = (utg) fp3Var.g;
                        ArrayList<String> stringArrayList = extras.getStringArrayList("INAPP_PURCHASE_DATA_LIST");
                        ArrayList<String> stringArrayList2 = extras.getStringArrayList("INAPP_DATA_SIGNATURE_LIST");
                        ArrayList arrayList2 = new ArrayList();
                        if (stringArrayList == null || stringArrayList2 == null) {
                            kwgVar = kwgVar2;
                            o2b o2bVarJ = zsg.j(extras.getString("INAPP_PURCHASE_DATA"), extras.getString("INAPP_DATA_SIGNATURE"), utgVar);
                            if (o2bVarJ == null) {
                                zsg.g("BillingHelper", "Couldn't find single purchase data as well.");
                                arrayList = null;
                            } else {
                                arrayList2.add(o2bVarJ);
                            }
                            if (tx0VarE.a == 0) {
                                v5h v5hVarC = hwg.c(i4, j6hVar);
                                lqb lqbVar = (lqb) kwgVar;
                                lqbVar.getClass();
                                try {
                                    t5h t5hVar = (t5h) v5hVarC.l();
                                    z6h z6hVar = (z6h) v5hVarC.r().l();
                                    z6hVar.b();
                                    c7h.q((c7h) z6hVar.b, z);
                                    t5hVar.b();
                                    v5h.t((v5h) t5hVar.b, (c7h) z6hVar.a());
                                    v5h v5hVar = (v5h) t5hVar.a();
                                    u6hVar = (u6h) lqbVar.b;
                                    if (j != 0) {
                                        s6h s6hVar = (s6h) u6hVar.l();
                                        s6hVar.e(j);
                                        u6hVar = (u6h) s6hVar.a();
                                    }
                                    lqbVar.K(v5hVar, u6hVar);
                                } catch (Throwable th) {
                                    zsg.i("BillingLogger", "Unable to log.", th);
                                }
                                tx0Var = tx0VarE;
                            } else {
                                tx0Var = tx0VarE;
                                d(extras, tx0Var, i4, j6hVar, j, z);
                            }
                            bo1Var.a(tx0Var, arrayList);
                        } else {
                            kwgVar = kwgVar2;
                            zsg.g("BillingHelper", "Found purchase list of " + stringArrayList.size() + " items");
                            for (int i5 = 0; i5 < stringArrayList.size() && i5 < stringArrayList2.size(); i5++) {
                                o2b o2bVarJ2 = zsg.j(stringArrayList.get(i5), stringArrayList2.get(i5), utgVar);
                                if (o2bVarJ2 != null) {
                                    arrayList2.add(o2bVarJ2);
                                }
                            }
                        }
                        arrayList = arrayList2;
                        if (tx0VarE.a == 0) {
                            v5h v5hVarC2 = hwg.c(i4, j6hVar);
                            lqb lqbVar2 = (lqb) kwgVar;
                            lqbVar2.getClass();
                            t5h t5hVar2 = (t5h) v5hVarC2.l();
                            z6h z6hVar2 = (z6h) v5hVarC2.r().l();
                            z6hVar2.b();
                            c7h.q((c7h) z6hVar2.b, z);
                            t5hVar2.b();
                            v5h.t((v5h) t5hVar2.b, (c7h) z6hVar2.a());
                            v5h v5hVar2 = (v5h) t5hVar2.a();
                            u6hVar = (u6h) lqbVar2.b;
                            if (j != 0) {
                                s6h s6hVar2 = (s6h) u6hVar.l();
                                s6hVar2.e(j);
                                u6hVar = (u6h) s6hVar2.a();
                            }
                            lqbVar2.K(v5hVar2, u6hVar);
                            tx0Var = tx0VarE;
                        } else {
                            tx0Var = tx0VarE;
                            d(extras, tx0Var, i4, j6hVar, j, z);
                        }
                        bo1Var.a(tx0Var, arrayList);
                        break;
                    } else if (j6hVar.equals(j6hVar4)) {
                        if (tx0VarE.a != 0) {
                            tx0 tx0Var2 = tx0VarE;
                            d(extras, tx0Var2, i2, j6hVar, j, z);
                            vsg vsgVar = mtg.b;
                            bo1Var.a(tx0Var2, aug.e);
                        } else {
                            zsg.h("BillingBroadcastManager", "No valid alternative billing listener is registered.");
                            tx0 tx0Var3 = swg.f;
                            ((lqb) kwgVar2).C(hwg.b(z5h.NULL_DEVELOPER_MANAGED_BILLING_LISTENER, i2, tx0Var3, null, j6hVar), j, z);
                            vsg vsgVar2 = mtg.b;
                            bo1Var.a(tx0Var3, aug.e);
                        }
                    }
                } else {
                    zsg.h("BillingBroadcastManager", "Bundle is null.");
                    tx0 tx0Var4 = swg.f;
                    ((lqb) kwgVar2).A(hwg.b(z5h.NULL_BUNDLE_IN_BROADCAST_RECEIVER, i2, tx0Var4, null, j6hVar));
                    if (bo1Var != null) {
                        bo1Var.a(tx0Var4, null);
                    }
                }
                break;
        }
    }

    public q1h(ich ichVar) {
        this.d = ichVar;
    }
}
