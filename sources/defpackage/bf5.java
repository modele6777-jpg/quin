package defpackage;

import android.os.Bundle;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.text.ParseException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;
import tech.chatmind.api.credits.UsageBillingBalance;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class bf5 {
    public final i1b a;
    public Integer b = null;

    public bf5(i1b i1bVar) {
        this.a = i1bVar;
    }

    public static boolean a(ArrayList arrayList, z5 z5Var) {
        String str = z5Var.a;
        String str2 = z5Var.b;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            z5 z5Var2 = (z5) it.next();
            if (z5Var2.a.equals(str) && z5Var2.b.equals(str2)) {
                return true;
            }
        }
        return false;
    }

    public final ArrayList b() {
        nl nlVar = (nl) ((ml) this.a.get());
        nlVar.getClass();
        ArrayList arrayList = new ArrayList();
        for (Bundle bundle : nlVar.a.a.f("frc", "")) {
            ry6 ry6Var = etg.a;
            oa7.A(bundle);
            ll llVar = new ll();
            String str = (String) afc.v(bundle, "origin", String.class, null);
            oa7.A(str);
            llVar.a = str;
            String str2 = (String) afc.v(bundle, "name", String.class, null);
            oa7.A(str2);
            llVar.b = str2;
            llVar.c = afc.v(bundle, "value", Object.class, null);
            llVar.d = (String) afc.v(bundle, "trigger_event_name", String.class, null);
            llVar.e = ((Long) afc.v(bundle, "trigger_timeout", Long.class, 0L)).longValue();
            llVar.f = (String) afc.v(bundle, "timed_out_event_name", String.class, null);
            llVar.g = (Bundle) afc.v(bundle, "timed_out_event_params", Bundle.class, null);
            llVar.h = (String) afc.v(bundle, "triggered_event_name", String.class, null);
            llVar.i = (Bundle) afc.v(bundle, "triggered_event_params", Bundle.class, null);
            llVar.j = ((Long) afc.v(bundle, "time_to_live", Long.class, 0L)).longValue();
            llVar.k = (String) afc.v(bundle, "expired_event_name", String.class, null);
            llVar.l = (Bundle) afc.v(bundle, "expired_event_params", Bundle.class, null);
            llVar.n = ((Boolean) afc.v(bundle, UsageBillingBalance.STATUS_ACTIVE, Boolean.class, Boolean.FALSE)).booleanValue();
            llVar.m = ((Long) afc.v(bundle, "creation_timestamp", Long.class, 0L)).longValue();
            llVar.o = ((Long) afc.v(bundle, "triggered_timestamp", Long.class, 0L)).longValue();
            arrayList.add(llVar);
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:98:0x025f  */
    public final void c(ArrayList arrayList) throws y5 {
        ObjectOutputStream objectOutputStream;
        ObjectInputStream objectInputStream;
        String str;
        String str2;
        String str3;
        i1b i1bVar = this.a;
        if (i1bVar.get() == null) {
            throw new y5("The Analytics SDK is not available. Please check that the Analytics SDK is included in your app dependencies.");
        }
        ArrayList<z5> arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                if (arrayList2.isEmpty()) {
                    if (i1bVar.get() == null) {
                        throw new y5("The Analytics SDK is not available. Please check that the Analytics SDK is included in your app dependencies.");
                    }
                    Iterator it2 = b().iterator();
                    while (it2.hasNext()) {
                        String str4 = ((ll) it2.next()).b;
                        vxg vxgVar = ((nl) ((ml) i1bVar.get())).a.a;
                        vxgVar.c(new rwg(vxgVar, str4, (String) null, (Bundle) null));
                    }
                    return;
                }
                if (i1bVar.get() == null) {
                    throw new y5("The Analytics SDK is not available. Please check that the Analytics SDK is included in your app dependencies.");
                }
                ArrayList<ll> arrayListB = b();
                ArrayList<z5> arrayList3 = new ArrayList();
                for (ll llVar : arrayListB) {
                    String[] strArr = z5.g;
                    String str5 = llVar.d;
                    arrayList3.add(new z5(llVar.b, String.valueOf(llVar.c), str5 != null ? str5 : "", new Date(llVar.m), llVar.e, llVar.j));
                }
                ArrayList arrayList4 = new ArrayList();
                for (z5 z5Var : arrayList3) {
                    if (!a(arrayList2, z5Var)) {
                        arrayList4.add(z5Var.a());
                    }
                }
                Iterator it3 = arrayList4.iterator();
                while (it3.hasNext()) {
                    String str6 = ((ll) it3.next()).b;
                    vxg vxgVar2 = ((nl) ((ml) i1bVar.get())).a.a;
                    vxgVar2.c(new rwg(vxgVar2, str6, (String) null, (Bundle) null));
                }
                ArrayList<z5> arrayList5 = new ArrayList();
                for (z5 z5Var2 : arrayList2) {
                    if (!a(arrayList3, z5Var2)) {
                        arrayList5.add(z5Var2);
                    }
                }
                ArrayDeque arrayDeque = new ArrayDeque(b());
                Integer numValueOf = this.b;
                if (numValueOf == null) {
                    numValueOf = Integer.valueOf(((nl) ((ml) i1bVar.get())).a.a.b("frc"));
                    this.b = numValueOf;
                }
                int iIntValue = numValueOf.intValue();
                for (z5 z5Var3 : arrayList5) {
                    while (arrayDeque.size() >= iIntValue) {
                        String str7 = ((ll) arrayDeque.pollFirst()).b;
                        vxg vxgVar3 = ((nl) ((ml) i1bVar.get())).a.a;
                        vxgVar3.c(new rwg(vxgVar3, str7, (String) null, (Bundle) null));
                    }
                    ll llVarA = z5Var3.a();
                    nl nlVar = (nl) ((ml) i1bVar.get());
                    nlVar.getClass();
                    ry6 ry6Var = etg.a;
                    String str8 = llVarA.a;
                    if (str8 != null && !str8.isEmpty()) {
                        Object obj = llVarA.c;
                        if (obj != null) {
                            try {
                                ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                                objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
                                try {
                                    objectOutputStream.writeObject(obj);
                                    objectOutputStream.flush();
                                    objectInputStream = new ObjectInputStream(new ByteArrayInputStream(byteArrayOutputStream.toByteArray()));
                                    try {
                                        Object object = objectInputStream.readObject();
                                        try {
                                            objectOutputStream.close();
                                            objectInputStream.close();
                                        } catch (IOException | ClassNotFoundException unused) {
                                            object = null;
                                        }
                                        if (object != null) {
                                            if (!etg.a(str8) && etg.c(str8, llVarA.b) && (((str = llVarA.k) == null || (etg.b(str, llVarA.l) && etg.d(str8, llVarA.k, llVarA.l))) && (((str2 = llVarA.h) == null || (etg.b(str2, llVarA.i) && etg.d(str8, llVarA.h, llVarA.i))) && ((str3 = llVarA.f) == null || (etg.b(str3, llVarA.g) && etg.d(str8, llVarA.f, llVarA.g)))))) {
                                                AppMeasurementSdk appMeasurementSdk = nlVar.a;
                                                Bundle bundle = new Bundle();
                                                String str9 = llVarA.a;
                                                if (str9 != null) {
                                                    bundle.putString("origin", str9);
                                                }
                                                String str10 = llVarA.b;
                                                if (str10 != null) {
                                                    bundle.putString("name", str10);
                                                }
                                                Object obj2 = llVarA.c;
                                                if (obj2 != null) {
                                                    afc.u(bundle, obj2);
                                                }
                                                String str11 = llVarA.d;
                                                if (str11 != null) {
                                                    bundle.putString("trigger_event_name", str11);
                                                }
                                                bundle.putLong("trigger_timeout", llVarA.e);
                                                String str12 = llVarA.f;
                                                if (str12 != null) {
                                                    bundle.putString("timed_out_event_name", str12);
                                                }
                                                Bundle bundle2 = llVarA.g;
                                                if (bundle2 != null) {
                                                    bundle.putBundle("timed_out_event_params", bundle2);
                                                }
                                                String str13 = llVarA.h;
                                                if (str13 != null) {
                                                    bundle.putString("triggered_event_name", str13);
                                                }
                                                Bundle bundle3 = llVarA.i;
                                                if (bundle3 != null) {
                                                    bundle.putBundle("triggered_event_params", bundle3);
                                                }
                                                bundle.putLong("time_to_live", llVarA.j);
                                                String str14 = llVarA.k;
                                                if (str14 != null) {
                                                    bundle.putString("expired_event_name", str14);
                                                }
                                                Bundle bundle4 = llVarA.l;
                                                if (bundle4 != null) {
                                                    bundle.putBundle("expired_event_params", bundle4);
                                                }
                                                bundle.putLong("creation_timestamp", llVarA.m);
                                                bundle.putBoolean(UsageBillingBalance.STATUS_ACTIVE, llVarA.n);
                                                bundle.putLong("triggered_timestamp", llVarA.o);
                                                vxg vxgVar4 = appMeasurementSdk.a;
                                                vxgVar4.c(new qwg(vxgVar4, bundle));
                                            }
                                        }
                                    } catch (Throwable th) {
                                        th = th;
                                        if (objectOutputStream != null) {
                                            objectOutputStream.close();
                                        }
                                        if (objectInputStream != null) {
                                            objectInputStream.close();
                                        }
                                        throw th;
                                    }
                                } catch (Throwable th2) {
                                    th = th2;
                                    objectInputStream = null;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                objectOutputStream = null;
                                objectInputStream = null;
                            }
                        } else if (!etg.a(str8)) {
                        }
                    }
                    arrayDeque.offer(llVarA);
                }
                return;
            }
            Map map = (Map) it.next();
            String[] strArr2 = z5.g;
            ArrayList arrayList6 = new ArrayList();
            String[] strArr3 = z5.g;
            for (int i = 0; i < 5; i++) {
                String str15 = strArr3[i];
                if (!map.containsKey(str15)) {
                    arrayList6.add(str15);
                }
            }
            if (!arrayList6.isEmpty()) {
                throw new y5(String.format("The following keys are missing from the experiment info map: %s", arrayList6));
            }
            try {
                arrayList2.add(new z5((String) map.get("experimentId"), (String) map.get("variantId"), map.containsKey("triggerEvent") ? (String) map.get("triggerEvent") : "", z5.h.parse((String) map.get("experimentStartTime")), Long.parseLong((String) map.get("triggerTimeoutMillis")), Long.parseLong((String) map.get("timeToLiveMillis"))));
            } catch (NumberFormatException e) {
                throw new y5("Could not process experiment: one of the durations could not be converted into a long.", e);
            } catch (ParseException e2) {
                throw new y5("Could not process experiment: parsing experiment start time failed.", e2);
            }
        }
    }
}
