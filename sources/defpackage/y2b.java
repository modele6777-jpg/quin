package defpackage;

import ai.askquin.qa.bridge.CapabilityDescriptor;
import ai.askquin.qa.bridge.Danger;
import ai.askquin.qa.bridge.ParamSpec;
import ai.askquin.qa.bridge.QaResult;
import ai.askquin.qa.bridge.a;
import ai.askquin.qa.transport.QaBridgeService;
import android.app.Activity;
import android.content.pm.PackageManager;
import android.os.BadParcelableException;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.Process;
import com.google.android.gms.common.api.Status;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes.dex */
public final class y2b extends Binder implements IInterface {
    public final /* synthetic */ int d = 1;
    public final /* synthetic */ Object e;

    public y2b(a97 a97Var, gle gleVar) {
        this.e = gleVar;
        attachInterface(this, "com.google.android.gms.cloudmessaging.internal.IRegisterCallback");
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        int i = this.d;
        return this;
    }

    /* JADX WARN: Code duplicated, block: B:58:0x0148  */
    /* JADX WARN: Code duplicated, block: B:61:0x0164  */
    /* JADX WARN: Code duplicated, block: B:69:0x0192 A[LOOP:1: B:67:0x018c->B:69:0x0192, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:73:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:75:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:76:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:79:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:89:0x022f  */
    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        Object dzbVar;
        Throwable thA;
        fm1 fm1Var;
        ti7 ti7Var;
        dm1 dm1VarD;
        ArrayList arrayList;
        Iterator it;
        String strConcat;
        LinkedHashMap linkedHashMap;
        dm1 dm1VarD2;
        fm1 fm1Var2;
        ParamSpec paramSpec;
        r3b r3bVar;
        Activity activity;
        switch (this.d) {
            case 0:
                if (i >= 1 && i <= 16777215) {
                    parcel.enforceInterface("ai.askquin.qa.bridge.IQaBridge");
                }
                if (i == 1598968902) {
                    parcel2.writeString("ai.askquin.qa.bridge.IQaBridge");
                    return true;
                }
                if (i == 1) {
                    QaBridgeService qaBridgeService = (QaBridgeService) this.e;
                    int i3 = QaBridgeService.c;
                    PackageManager packageManager = qaBridgeService.getPackageManager();
                    packageManager.getClass();
                    if (packageManager.checkSignatures(Binder.getCallingUid(), Process.myUid()) != 0) {
                        throw new SecurityException("QaBridge: caller is not same-signature; refused");
                    }
                    x2b x2bVar = (x2b) qaBridgeService.a.getValue();
                    wg7 wg7Var = x2bVar.c;
                    xn7 xn7VarL = t72.l(CapabilityDescriptor.Companion.serializer());
                    List<d3b> listJ1 = s72.j1(x2bVar.a.a.values());
                    ArrayList arrayList2 = new ArrayList(t72.u(listJ1, 10));
                    for (d3b d3bVar : listJ1) {
                        d3bVar.getClass();
                        List listC0 = v4e.c0(d3bVar.getId(), new String[]{"."}, 6);
                        arrayList2.add(new CapabilityDescriptor(d3bVar.getId(), d3bVar.getTitle(), s72.s0(1, listC0), (String) s72.F0(listC0), d3bVar.b(), d3bVar.getParams()));
                    }
                    String strD = wg7Var.d(xn7VarL, arrayList2);
                    parcel2.writeNoException();
                    parcel2.writeString(strD);
                    return true;
                }
                if (i != 2) {
                    return super.onTransact(i, parcel, parcel2, i2);
                }
                String string = parcel.readString();
                String string2 = parcel.readString();
                string.getClass();
                QaBridgeService qaBridgeService2 = (QaBridgeService) this.e;
                int i4 = QaBridgeService.c;
                PackageManager packageManager2 = qaBridgeService2.getPackageManager();
                packageManager2.getClass();
                if (packageManager2.checkSignatures(Binder.getCallingUid(), Process.myUid()) != 0) {
                    throw new SecurityException("QaBridge: caller is not same-signature; refused");
                }
                x2b x2bVar2 = (x2b) ((QaBridgeService) this.e).a.getValue();
                x2bVar2.getClass();
                wg7 wg7Var2 = x2bVar2.c;
                xn7 xn7VarSerializer = QaResult.Companion.serializer();
                a aVar = x2bVar2.b;
                d3b d3bVar2 = (d3b) aVar.a.a.get(string);
                if (d3bVar2 == null) {
                    fm1Var = new fm1(new QaResult.Err("unknown capability: ".concat(string), "unknown_capability"), null);
                } else if (d3bVar2.b() == Danger.BLOCKED_IN_PRODUCTION) {
                    fm1Var = new fm1(new QaResult.Err("capability is blocked from client execution: ".concat(string), "blocked"), d3bVar2.a());
                } else {
                    wg7 wg7Var3 = aVar.b;
                    if (string2 != null) {
                        try {
                            if (v4e.Q(string2)) {
                                dzbVar = new ti7(qu4.a);
                            } else {
                                nh7 nh7VarE = wg7Var3.e(string2);
                                nh7VarE.getClass();
                                dzbVar = (ti7) nh7VarE;
                            }
                        } catch (Throwable th) {
                            dzbVar = new dzb(th);
                        }
                        thA = ezb.a(dzbVar);
                        if (thA == null) {
                            ti7Var = (ti7) dzbVar;
                            dm1VarD = d3bVar2.d(ti7Var);
                            List params = d3bVar2.getParams();
                            params.getClass();
                            ArrayList arrayList3 = new ArrayList();
                            for (Object obj : params) {
                                paramSpec = (ParamSpec) obj;
                                if (!paramSpec.getRequired() && !ti7Var.containsKey(paramSpec.getName())) {
                                    arrayList3.add(obj);
                                }
                            }
                            arrayList = new ArrayList(t72.u(arrayList3, 10));
                            it = arrayList3.iterator();
                            while (it.hasNext()) {
                                arrayList.add(((ParamSpec) it.next()).getName());
                            }
                            strConcat = arrayList.isEmpty() ? null : "missing required param(s): ".concat(s72.D0(arrayList, ", ", null, null, null, 62));
                            if (strConcat != null) {
                                fm1Var = new fm1(new QaResult.Err(strConcat, "invalid_params"), dm1VarD);
                            } else {
                                List<ParamSpec> params2 = d3bVar2.getParams();
                                params2.getClass();
                                linkedHashMap = new LinkedHashMap(ti7Var);
                                for (ParamSpec paramSpec2 : params2) {
                                    if (linkedHashMap.containsKey(paramSpec2.getName()) && paramSpec2.getDefault() != null) {
                                        linkedHashMap.put(paramSpec2.getName(), paramSpec2.getDefault());
                                    }
                                }
                                ti7 ti7Var2 = new ti7(linkedHashMap);
                                dm1VarD2 = d3bVar2.d(ti7Var2);
                                try {
                                    fm1Var2 = new fm1(d3bVar2.c(ti7Var2), dm1VarD2);
                                } catch (Exception e) {
                                    fm1Var2 = new fm1(new QaResult.Err(ub3.i("invoke failed: ", e.getMessage()), "invoke_error"), dm1VarD2);
                                }
                                fm1Var = fm1Var2;
                            }
                        } else {
                            fm1Var = new fm1(new QaResult.Err(ub3.i("invalid JSON args: ", thA.getMessage()), "bad_args"), d3bVar2.a());
                        }
                        break;
                    } else {
                        dzbVar = new ti7(qu4.a);
                        thA = ezb.a(dzbVar);
                        if (thA == null) {
                            ti7Var = (ti7) dzbVar;
                            dm1VarD = d3bVar2.d(ti7Var);
                            List params3 = d3bVar2.getParams();
                            params3.getClass();
                            ArrayList arrayList4 = new ArrayList();
                            while (r11.hasNext()) {
                                paramSpec = (ParamSpec) obj;
                                if (!paramSpec.getRequired()) {
                                }
                            }
                            arrayList = new ArrayList(t72.u(arrayList4, 10));
                            it = arrayList4.iterator();
                            while (it.hasNext()) {
                                arrayList.add(((ParamSpec) it.next()).getName());
                            }
                            if (arrayList.isEmpty()) {
                            }
                            if (strConcat != null) {
                                fm1Var = new fm1(new QaResult.Err(strConcat, "invalid_params"), dm1VarD);
                            } else {
                                List<ParamSpec> params4 = d3bVar2.getParams();
                                params4.getClass();
                                linkedHashMap = new LinkedHashMap(ti7Var);
                                while (r0.hasNext()) {
                                    if (linkedHashMap.containsKey(paramSpec2.getName())) {
                                    }
                                }
                                ti7 ti7Var3 = new ti7(linkedHashMap);
                                dm1VarD2 = d3bVar2.d(ti7Var3);
                                fm1Var2 = new fm1(d3bVar2.c(ti7Var3), dm1VarD2);
                                fm1Var = fm1Var2;
                            }
                        } else {
                            fm1Var = new fm1(new QaResult.Err(ub3.i("invalid JSON args: ", thA.getMessage()), "bad_args"), d3bVar2.a());
                        }
                    }
                }
                dm1 dm1Var = fm1Var.b;
                if (dm1Var != null && (r3bVar = aVar.c) != null) {
                    boolean z = fm1Var.a instanceof QaResult.Ok;
                    if (dm1Var == dm1.b && (activity = ir5.c) != null) {
                        r3bVar.a.post(new c0(activity, string, z ? "✓" : "✗", 26));
                    }
                }
                String strD2 = wg7Var2.d(xn7VarSerializer, fm1Var.a);
                parcel2.writeNoException();
                parcel2.writeString(strD2);
                return true;
            default:
                if (i <= 16777215) {
                    parcel.enforceInterface(getInterfaceDescriptor());
                } else if (super.onTransact(i, parcel, parcel2, i2)) {
                    return true;
                }
                if (i != 1) {
                    return false;
                }
                Parcelable.Creator<Status> creator = Status.CREATOR;
                int i5 = htg.a;
                Status statusCreateFromParcel = parcel.readInt() == 0 ? null : creator.createFromParcel(parcel);
                String string3 = parcel.readString();
                c70 c70VarCreateFromParcel = parcel.readInt() != 0 ? c70.CREATOR.createFromParcel(parcel) : null;
                int iDataAvail = parcel.dataAvail();
                if (iDataAvail > 0) {
                    throw new BadParcelableException(ub3.h(iDataAvail, "Parcel data not fully consumed, unread size: ", new StringBuilder(String.valueOf(iDataAvail).length() + 45)));
                }
                hcc.m(statusCreateFromParcel, string3, (gle) this.e);
                return true;
        }
    }

    public y2b(QaBridgeService qaBridgeService) {
        this.e = qaBridgeService;
        attachInterface(this, "ai.askquin.qa.bridge.IQaBridge");
    }
}
