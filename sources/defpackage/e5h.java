package defpackage;

import android.content.Context;
import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.text.TextUtils;
import com.google.firebase.crashlytics.internal.common.CommonUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: compiled from: r8-map-id-c0f90335ad52c1b57db77aaf4b1db5c7c9c2627f2e01f059a43261b6162c0147 */
/* JADX INFO: loaded from: classes3.dex */
public final class e5h extends jsg implements hzg {
    public final ich d;
    public Boolean e;
    public String f;

    public e5h(ich ichVar) {
        super("com.google.android.gms.measurement.internal.IMeasurementService");
        oa7.A(ichVar);
        this.d = ichVar;
        this.f = null;
    }

    @Override // defpackage.hzg
    public final String A(ndh ndhVar) {
        f(ndhVar);
        ich ichVar = this.d;
        try {
            return (String) ichVar.Z().H0(new y3h(ichVar, ndhVar)).get(30000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            ichVar.v().g.c(w0h.E0(ndhVar.a), e, "Failed to get app instance id. appId");
            return null;
        }
    }

    @Override // defpackage.hzg
    public final void B(Bundle bundle, ndh ndhVar) {
        f(ndhVar);
        String str = ndhVar.a;
        oa7.A(str);
        H(new qu1(this, bundle, str, ndhVar, false, 5));
    }

    @Override // defpackage.hzg
    public final void D(hsg hsgVar, ndh ndhVar) {
        oa7.A(hsgVar);
        f(ndhVar);
        H(new qe(this, hsgVar, ndhVar, 10));
    }

    @Override // defpackage.hzg
    public final void E(ndh ndhVar) {
        String str = ndhVar.a;
        oa7.x(str);
        G(str, false);
        H(new b4h(this, ndhVar, 1));
    }

    @Override // defpackage.hzg
    public final void F(ndh ndhVar, mng mngVar) {
        f(ndhVar);
        H(new qe(this, ndhVar, mngVar, false, 13));
    }

    public final void G(String str, boolean z) {
        boolean zIsEmpty = TextUtils.isEmpty(str);
        ich ichVar = this.d;
        if (zIsEmpty) {
            ichVar.v().g.a("Measurement Service called without app package");
            throw new SecurityException("Measurement Service called without app package");
        }
        if (z) {
            try {
                Boolean boolValueOf = this.e;
                if (boolValueOf == null) {
                    boolean z2 = true;
                    if (!"com.google.android.gms".equals(this.f) && !fbc.i(ichVar.z.a, Binder.getCallingUid()) && !vc6.a(ichVar.z.a).b(Binder.getCallingUid())) {
                        z2 = false;
                    }
                    boolValueOf = Boolean.valueOf(z2);
                    this.e = boolValueOf;
                }
                if (boolValueOf.booleanValue()) {
                    return;
                }
            } catch (SecurityException e) {
                ichVar.v().g.b(w0h.E0(str), "Measurement Service called with invalid calling package. appId");
                throw e;
            }
        }
        if (this.f == null) {
            Context context = ichVar.z.a;
            int callingUid = Binder.getCallingUid();
            int i = sc6.e;
            if (fbc.l(callingUid, context, str)) {
                this.f = str;
            }
        }
        if (str.equals(this.f)) {
            return;
        }
        throw new SecurityException("Unknown calling package name '" + str + "'.");
    }

    public final void H(Runnable runnable) {
        ich ichVar = this.d;
        if (ichVar.Z().G0()) {
            runnable.run();
        } else {
            ichVar.Z().J0(runnable);
        }
    }

    @Override // defpackage.hzg
    public final List b(String str, String str2, String str3, boolean z) {
        G(str, true);
        ich ichVar = this.d;
        try {
            List<och> list = (List) ichVar.Z().H0(new f4h(this, str, str2, str3, 1)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (och ochVar : list) {
                if (z || !qch.f1(ochVar.c)) {
                    arrayList.add(new mch(ochVar));
                }
            }
            return arrayList;
        } catch (InterruptedException e) {
            e = e;
            ichVar.v().g.c(w0h.E0(str), e, "Failed to get user properties as. appId");
            return Collections.EMPTY_LIST;
        } catch (ExecutionException e2) {
            e = e2;
            ichVar.v().g.c(w0h.E0(str), e, "Failed to get user properties as. appId");
            return Collections.EMPTY_LIST;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.jsg
    public final boolean d(int i, Parcel parcel, Parcel parcel2) {
        List list;
        ich ichVar = this.d;
        ArrayList arrayList = null;
        ozg lzgVar = null;
        vzg rzgVar = null;
        boolean z = false;
        int i2 = 1;
        switch (i) {
            case 1:
                hsg hsgVar = (hsg) lsg.a(parcel, hsg.CREATOR);
                ndh ndhVar = (ndh) lsg.a(parcel, ndh.CREATOR);
                lsg.d(parcel);
                D(hsgVar, ndhVar);
                parcel2.writeNoException();
                return true;
            case 2:
                mch mchVar = (mch) lsg.a(parcel, mch.CREATOR);
                ndh ndhVar2 = (ndh) lsg.a(parcel, ndh.CREATOR);
                lsg.d(parcel);
                n(mchVar, ndhVar2);
                parcel2.writeNoException();
                return true;
            case 3:
            case 8:
            case 22:
            case 23:
            case 28:
            default:
                return false;
            case 4:
                ndh ndhVar3 = (ndh) lsg.a(parcel, ndh.CREATOR);
                lsg.d(parcel);
                t(ndhVar3);
                parcel2.writeNoException();
                return true;
            case 5:
                hsg hsgVar2 = (hsg) lsg.a(parcel, hsg.CREATOR);
                String string = parcel.readString();
                parcel.readString();
                lsg.d(parcel);
                oa7.A(hsgVar2);
                oa7.x(string);
                G(string, true);
                H(new qe(this, hsgVar2, string, 11));
                parcel2.writeNoException();
                return true;
            case 6:
                ndh ndhVar4 = (ndh) lsg.a(parcel, ndh.CREATOR);
                lsg.d(parcel);
                l(ndhVar4);
                parcel2.writeNoException();
                return true;
            case 7:
                ndh ndhVar5 = (ndh) lsg.a(parcel, ndh.CREATOR);
                byte b = parcel.readInt() != 0;
                lsg.d(parcel);
                f(ndhVar5);
                String str = ndhVar5.a;
                oa7.A(str);
                try {
                    List<och> list2 = (List) ichVar.Z().H0(new y3h(this, str, z ? 1 : 0)).get();
                    ArrayList arrayList2 = new ArrayList(list2.size());
                    for (och ochVar : list2) {
                        if (b != false || !qch.f1(ochVar.c)) {
                            arrayList2.add(new mch(ochVar));
                        }
                        break;
                    }
                    arrayList = arrayList2;
                } catch (InterruptedException e) {
                    e = e;
                    ichVar.v().g.c(w0h.E0(str), e, "Failed to get user properties. appId");
                } catch (ExecutionException e2) {
                    e = e2;
                    ichVar.v().g.c(w0h.E0(str), e, "Failed to get user properties. appId");
                }
                parcel2.writeNoException();
                parcel2.writeTypedList(arrayList);
                return true;
            case 9:
                hsg hsgVar3 = (hsg) lsg.a(parcel, hsg.CREATOR);
                String string2 = parcel.readString();
                lsg.d(parcel);
                byte[] bArrR = r(string2, hsgVar3);
                parcel2.writeNoException();
                parcel2.writeByteArray(bArrR);
                return true;
            case je9.TIME_TO_RESPONSE_COMPLETED_US_FIELD_NUMBER /* 10 */:
                long j = parcel.readLong();
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                String string5 = parcel.readString();
                lsg.d(parcel);
                o(j, string3, string4, string5);
                parcel2.writeNoException();
                return true;
            case je9.NETWORK_CLIENT_ERROR_REASON_FIELD_NUMBER /* 11 */:
                ndh ndhVar6 = (ndh) lsg.a(parcel, ndh.CREATOR);
                lsg.d(parcel);
                String strA = A(ndhVar6);
                parcel2.writeNoException();
                parcel2.writeString(strA);
                return true;
            case je9.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                wog wogVar = (wog) lsg.a(parcel, wog.CREATOR);
                ndh ndhVar7 = (ndh) lsg.a(parcel, ndh.CREATOR);
                lsg.d(parcel);
                z(wogVar, ndhVar7);
                parcel2.writeNoException();
                return true;
            case je9.PERF_SESSIONS_FIELD_NUMBER /* 13 */:
                wog wogVar2 = (wog) lsg.a(parcel, wog.CREATOR);
                lsg.d(parcel);
                oa7.A(wogVar2);
                oa7.A(wogVar2.c);
                oa7.x(wogVar2.a);
                G(wogVar2.a, true);
                H(new v36(this, new wog(wogVar2), z, 28));
                parcel2.writeNoException();
                return true;
            case 14:
                String string6 = parcel.readString();
                String string7 = parcel.readString();
                ClassLoader classLoader = lsg.a;
                z = parcel.readInt() != 0;
                ndh ndhVar8 = (ndh) lsg.a(parcel, ndh.CREATOR);
                lsg.d(parcel);
                List listJ = j(string6, string7, z, ndhVar8);
                parcel2.writeNoException();
                parcel2.writeTypedList(listJ);
                return true;
            case 15:
                String string8 = parcel.readString();
                String string9 = parcel.readString();
                String string10 = parcel.readString();
                ClassLoader classLoader2 = lsg.a;
                boolean z2 = parcel.readInt() != 0;
                lsg.d(parcel);
                List listB = b(string8, string9, string10, z2);
                parcel2.writeNoException();
                parcel2.writeTypedList(listB);
                return true;
            case CommonUtils.DEVICE_STATE_VENDORINTERNAL /* 16 */:
                String string11 = parcel.readString();
                String string12 = parcel.readString();
                ndh ndhVar9 = (ndh) lsg.a(parcel, ndh.CREATOR);
                lsg.d(parcel);
                List listU = u(string11, string12, ndhVar9);
                parcel2.writeNoException();
                parcel2.writeTypedList(listU);
                return true;
            case 17:
                String string13 = parcel.readString();
                String string14 = parcel.readString();
                String string15 = parcel.readString();
                lsg.d(parcel);
                List listP = p(string13, string14, string15);
                parcel2.writeNoException();
                parcel2.writeTypedList(listP);
                return true;
            case 18:
                ndh ndhVar10 = (ndh) lsg.a(parcel, ndh.CREATOR);
                lsg.d(parcel);
                E(ndhVar10);
                parcel2.writeNoException();
                return true;
            case 19:
                Bundle bundle = (Bundle) lsg.a(parcel, Bundle.CREATOR);
                ndh ndhVar11 = (ndh) lsg.a(parcel, ndh.CREATOR);
                lsg.d(parcel);
                B(bundle, ndhVar11);
                parcel2.writeNoException();
                return true;
            case 20:
                ndh ndhVar12 = (ndh) lsg.a(parcel, ndh.CREATOR);
                lsg.d(parcel);
                y(ndhVar12);
                parcel2.writeNoException();
                return true;
            case 21:
                ndh ndhVar13 = (ndh) lsg.a(parcel, ndh.CREATOR);
                lsg.d(parcel);
                wqg wqgVarQ = q(ndhVar13);
                parcel2.writeNoException();
                if (wqgVarQ == null) {
                    parcel2.writeInt(0);
                    return true;
                }
                parcel2.writeInt(1);
                wqgVarQ.writeToParcel(parcel2, 1);
                return true;
            case 24:
                ndh ndhVar14 = (ndh) lsg.a(parcel, ndh.CREATOR);
                Bundle bundle2 = (Bundle) lsg.a(parcel, Bundle.CREATOR);
                lsg.d(parcel);
                f(ndhVar14);
                String str2 = ndhVar14.a;
                oa7.A(str2);
                if (!ichVar.f0().L0(null, bzg.T0)) {
                    try {
                        list = (List) ichVar.Z().H0(new q4h(this, ndhVar14, bundle2, i2)).get();
                    } catch (InterruptedException | ExecutionException e3) {
                        ichVar.v().g.c(w0h.E0(str2), e3, "Failed to get trigger URIs. appId");
                        list = Collections.EMPTY_LIST;
                    }
                    break;
                } else {
                    try {
                        list = (List) ichVar.Z().I0(new q4h(this, ndhVar14, bundle2, z ? 1 : 0)).get(10000L, TimeUnit.MILLISECONDS);
                    } catch (InterruptedException | ExecutionException | TimeoutException e4) {
                        ichVar.v().g.c(w0h.E0(str2), e4, "Failed to get trigger URIs. appId");
                        list = Collections.EMPTY_LIST;
                    }
                    break;
                }
                parcel2.writeNoException();
                parcel2.writeTypedList(list);
                return true;
            case 25:
                ndh ndhVar15 = (ndh) lsg.a(parcel, ndh.CREATOR);
                lsg.d(parcel);
                h(ndhVar15);
                parcel2.writeNoException();
                return true;
            case 26:
                ndh ndhVar16 = (ndh) lsg.a(parcel, ndh.CREATOR);
                lsg.d(parcel);
                m(ndhVar16);
                parcel2.writeNoException();
                return true;
            case 27:
                ndh ndhVar17 = (ndh) lsg.a(parcel, ndh.CREATOR);
                lsg.d(parcel);
                v(ndhVar17);
                parcel2.writeNoException();
                return true;
            case 29:
                ndh ndhVar18 = (ndh) lsg.a(parcel, ndh.CREATOR);
                sbh sbhVar = (sbh) lsg.a(parcel, sbh.CREATOR);
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder != null) {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IUploadBatchesCallback");
                    rzgVar = iInterfaceQueryLocalInterface instanceof vzg ? (vzg) iInterfaceQueryLocalInterface : new rzg(strongBinder, "com.google.android.gms.measurement.internal.IUploadBatchesCallback", 5);
                }
                lsg.d(parcel);
                i(ndhVar18, sbhVar, rzgVar);
                parcel2.writeNoException();
                return true;
            case 30:
                ndh ndhVar19 = (ndh) lsg.a(parcel, ndh.CREATOR);
                mng mngVar = (mng) lsg.a(parcel, mng.CREATOR);
                lsg.d(parcel);
                F(ndhVar19, mngVar);
                parcel2.writeNoException();
                return true;
            case 31:
                ndh ndhVar20 = (ndh) lsg.a(parcel, ndh.CREATOR);
                Bundle bundle3 = (Bundle) lsg.a(parcel, Bundle.CREATOR);
                IBinder strongBinder2 = parcel.readStrongBinder();
                if (strongBinder2 != null) {
                    IInterface iInterfaceQueryLocalInterface2 = strongBinder2.queryLocalInterface("com.google.android.gms.measurement.internal.ITriggerUrisCallback");
                    lzgVar = iInterfaceQueryLocalInterface2 instanceof ozg ? (ozg) iInterfaceQueryLocalInterface2 : new lzg(strongBinder2, "com.google.android.gms.measurement.internal.ITriggerUrisCallback", 5);
                }
                lsg.d(parcel);
                w(ndhVar20, bundle3, lzgVar);
                parcel2.writeNoException();
                return true;
        }
    }

    public final void e(Runnable runnable) {
        ich ichVar = this.d;
        if (ichVar.Z().G0()) {
            runnable.run();
        } else {
            ichVar.Z().L0(runnable);
        }
    }

    public final void f(ndh ndhVar) {
        oa7.A(ndhVar);
        String str = ndhVar.a;
        oa7.x(str);
        G(str, false);
        this.d.l0().G0(ndhVar.b);
    }

    @Override // defpackage.hzg
    public final void h(ndh ndhVar) {
        oa7.x(ndhVar.a);
        oa7.A(ndhVar.H0);
        e(new b4h(this, ndhVar, 2));
    }

    @Override // defpackage.hzg
    public final void i(ndh ndhVar, sbh sbhVar, vzg vzgVar) {
        f(ndhVar);
        String str = ndhVar.a;
        oa7.A(str);
        this.d.Z().J0(new qu1(this, str, sbhVar, vzgVar, false, 3));
    }

    @Override // defpackage.hzg
    public final List j(String str, String str2, boolean z, ndh ndhVar) {
        f(ndhVar);
        String str3 = ndhVar.a;
        oa7.A(str3);
        ich ichVar = this.d;
        try {
            List<och> list = (List) ichVar.Z().H0(new f4h(this, str3, str, str2, 0)).get();
            ArrayList arrayList = new ArrayList(list.size());
            for (och ochVar : list) {
                if (z || !qch.f1(ochVar.c)) {
                    arrayList.add(new mch(ochVar));
                }
            }
            return arrayList;
        } catch (InterruptedException e) {
            e = e;
            ichVar.v().g.c(w0h.E0(str3), e, "Failed to query user properties. appId");
            return Collections.EMPTY_LIST;
        } catch (ExecutionException e2) {
            e = e2;
            ichVar.v().g.c(w0h.E0(str3), e, "Failed to query user properties. appId");
            return Collections.EMPTY_LIST;
        }
    }

    @Override // defpackage.hzg
    public final void l(ndh ndhVar) {
        f(ndhVar);
        H(new a4h(this, ndhVar, 1));
    }

    @Override // defpackage.hzg
    public final void m(ndh ndhVar) {
        oa7.x(ndhVar.a);
        oa7.A(ndhVar.H0);
        e(new a4h(this, ndhVar, 2));
    }

    @Override // defpackage.hzg
    public final void n(mch mchVar, ndh ndhVar) {
        oa7.A(mchVar);
        f(ndhVar);
        H(new qe(this, mchVar, ndhVar, 12));
    }

    @Override // defpackage.hzg
    public final void o(long j, String str, String str2, String str3) {
        H(new q0f(this, str2, str3, str, j, 1));
    }

    @Override // defpackage.hzg
    public final List p(String str, String str2, String str3) {
        G(str, true);
        ich ichVar = this.d;
        try {
            return (List) ichVar.Z().H0(new f4h(this, str, str2, str3, 3)).get();
        } catch (InterruptedException | ExecutionException e) {
            ichVar.v().g.b(e, "Failed to get conditional user properties as");
            return Collections.EMPTY_LIST;
        }
    }

    @Override // defpackage.hzg
    public final wqg q(ndh ndhVar) {
        f(ndhVar);
        String str = ndhVar.a;
        oa7.x(str);
        ich ichVar = this.d;
        try {
            return (wqg) ichVar.Z().I0(new y3h(this, ndhVar, 1)).get(10000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException | ExecutionException | TimeoutException e) {
            ichVar.v().g.c(w0h.E0(str), e, "Failed to get consent. appId");
            return new wqg(null);
        }
    }

    @Override // defpackage.hzg
    public final byte[] r(String str, hsg hsgVar) {
        oa7.x(str);
        oa7.A(hsgVar);
        G(str, true);
        ich ichVar = this.d;
        tz0 tz0Var = ichVar.v().Y;
        w3h w3hVar = ichVar.z;
        i0h i0hVar = w3hVar.x;
        String str2 = hsgVar.a;
        tz0Var.b(i0hVar.a(str2), "Log and bundle. event");
        ichVar.E().getClass();
        long jNanoTime = System.nanoTime() / 1000000;
        try {
            byte[] bArr = (byte[]) ichVar.Z().I0(new yg6(this, hsgVar, str)).get();
            if (bArr == null) {
                ichVar.v().g.b(w0h.E0(str), "Log and bundle returned null. appId");
                bArr = new byte[0];
            }
            ichVar.E().getClass();
            ichVar.v().Y.d("Log and bundle processed. event, size, time_ms", w3hVar.x.a(str2), Integer.valueOf(bArr.length), Long.valueOf((System.nanoTime() / 1000000) - jNanoTime));
            return bArr;
        } catch (InterruptedException e) {
            e = e;
            ichVar.v().g.d("Failed to log and bundle. appId, event, error", w0h.E0(str), w3hVar.x.a(str2), e);
            return null;
        } catch (ExecutionException e2) {
            e = e2;
            ichVar.v().g.d("Failed to log and bundle. appId, event, error", w0h.E0(str), w3hVar.x.a(str2), e);
            return null;
        }
    }

    @Override // defpackage.hzg
    public final void t(ndh ndhVar) {
        f(ndhVar);
        H(new a4h(this, ndhVar, 0));
    }

    @Override // defpackage.hzg
    public final List u(String str, String str2, ndh ndhVar) {
        f(ndhVar);
        String str3 = ndhVar.a;
        oa7.A(str3);
        ich ichVar = this.d;
        try {
            return (List) ichVar.Z().H0(new f4h(this, str3, str, str2, 2)).get();
        } catch (InterruptedException | ExecutionException e) {
            ichVar.v().g.b(e, "Failed to get conditional user properties");
            return Collections.EMPTY_LIST;
        }
    }

    @Override // defpackage.hzg
    public final void v(ndh ndhVar) {
        f(ndhVar);
        H(new b4h(this, ndhVar, 0));
    }

    @Override // defpackage.hzg
    public final void w(ndh ndhVar, Bundle bundle, ozg ozgVar) {
        f(ndhVar);
        String str = ndhVar.a;
        oa7.A(str);
        this.d.Z().J0(new t4h(this, ndhVar, bundle, ozgVar, str));
    }

    @Override // defpackage.hzg
    public final void y(ndh ndhVar) {
        oa7.x(ndhVar.a);
        oa7.A(ndhVar.H0);
        e(new v36(this, ndhVar, false, 29));
    }

    @Override // defpackage.hzg
    public final void z(wog wogVar, ndh ndhVar) {
        oa7.A(wogVar);
        oa7.A(wogVar.c);
        f(ndhVar);
        wog wogVar2 = new wog(wogVar);
        wogVar2.a = ndhVar.a;
        H(new qe(this, wogVar2, ndhVar, 9));
    }
}
